package a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cre0 extends zqe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WildcardType f4843a;
    public final iun b = iun.f15405a;

    public cre0(WildcardType wildcardType) {
        this.f4843a = wildcardType;
    }

    @Override // a.zqe0
    public final Type b() {
        return this.f4843a;
    }

    public final zqe0 c() {
        WildcardType wildcardType = this.f4843a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            v4i0.j(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objW = tx3.W(lowerBounds);
            objW.getClass();
            Type type = (Type) objW;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new xqe0(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new gqe0(type);
            }
            return type instanceof WildcardType ? new cre0((WildcardType) type) : new oqe0(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) tx3.W(upperBounds);
            if (!Intrinsics.d(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new xqe0(cls2);
                    }
                }
                if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                    return new gqe0(type2);
                }
                return type2 instanceof WildcardType ? new cre0((WildcardType) type2) : new oqe0(type2);
            }
        }
        return null;
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        return this.b;
    }
}
