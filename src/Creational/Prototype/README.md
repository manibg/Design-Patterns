# Prototype Design-Patterns

A prototype design pattern is used when you want to create multiple objects again and again.

    - If you want to copy the object, We can use directly copy constructor
        ex: 
        Student() {
            Student st = new Student();
            st.setName(this.name);
            st.setBatch(this.batch);
        }
    Note: This can violate the OCP principle If inheritance is involved.

In that case, we can use *clone()/prototype*. 

## Registry Design-Patterns

A registry pattern is used to store the data, kind of registering the cloneable object into a common place which is called registry.
