# Prototype Design-Patterns

Prototype design pattern used when you want to create multiple object again and again.

    - If you want to copy the object, We can use directly copy constructor
        ex: 
        Student() {
            Student st = new Student();
            st.setName(this.name);
            st.setBatch(this.batch);
        }
    Note: This can violate the OCP principle, If inheritance involved.

In that case, we can use *clone()/prototype*. 

## Prototype Design-Patterns

Registry pattern used to store the data, kind of registering the cloneable object into common place which called registry.