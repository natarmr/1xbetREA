package a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class gqe0 extends zqe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f11729a;
    public final zqe0 b;
    public final iun c;

    /* JADX WARN: Multi-variable type inference failed */
    public gqe0(Type type) {
        zqe0 xqe0Var;
        zqe0 xqe0Var2;
        this.f11729a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    xqe0Var = componentType.isPrimitive() ? new xqe0(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new gqe0(componentType) : componentType instanceof WildcardType ? new cre0((WildcardType) componentType) : new oqe0(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            xqe0Var2 = cls2.isPrimitive() ? new xqe0(cls2) : xqe0Var2;
            this.b = xqe0Var2;
            this.c = iun.f15405a;
        }
        xqe0Var = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new gqe0(genericComponentType) : genericComponentType instanceof WildcardType ? new cre0((WildcardType) genericComponentType) : new oqe0(genericComponentType);
        xqe0Var2 = xqe0Var;
        this.b = xqe0Var2;
        this.c = iun.f15405a;
    }

    @Override // a.zqe0
    public final Type b() {
        return this.f11729a;
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        return this.c;
    }
}
