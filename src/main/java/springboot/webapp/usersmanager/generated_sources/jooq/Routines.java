/*
 * This file is generated by jOOQ.
 */
package springboot.webapp.usersmanager.generated_sources.jooq;


import org.jooq.Configuration;
import org.jooq.Field;

import springboot.webapp.usersmanager.generated_sources.jooq.routines.Polygon;


/**
 * Convenience access to all stored procedures and functions in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Object polygon(
          Configuration configuration
        , Object __1
    ) {
        Polygon f = new Polygon();
        f.set__1(__1);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<Object> polygon(
          Object __1
    ) {
        Polygon f = new Polygon();
        f.set__1(__1);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<Object> polygon(
          Field<Object> __1
    ) {
        Polygon f = new Polygon();
        f.set__1(__1);

        return f.asField();
    }
}
