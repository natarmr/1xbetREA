package a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oqe0 extends zqe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f25684a;
    public final q8y b;

    public oqe0(Type type) {
        q8y mqe0Var;
        type.getClass();
        this.f25684a = type;
        if (type instanceof Class) {
            mqe0Var = new mqe0((Class) type);
        } else if (type instanceof TypeVariable) {
            mqe0Var = new are0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                e9d0.k("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            mqe0Var = new mqe0((Class) rawType);
        }
        this.b = mqe0Var;
    }

    @Override // a.zqe0, a.m8y
    public final cqe0 a(swq swqVar) {
        swqVar.getClass();
        return null;
    }

    @Override // a.zqe0
    public final Type b() {
        return this.f25684a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    public final ArrayList c() {
        x8y gqe0Var;
        x8y xqe0Var;
        List<Type> listC = bqe0.c(this.f25684a);
        ArrayList arrayList = new ArrayList(r3d.q(listC, 10));
        for (Type type : listC) {
            type.getClass();
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    xqe0Var = new xqe0(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        gqe0Var = new gqe0(type);
                    } else {
                        gqe0Var = type instanceof WildcardType ? new cre0((WildcardType) type) : new oqe0(type);
                    }
                    xqe0Var = gqe0Var;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    gqe0Var = new gqe0(type);
                } else {
                    gqe0Var = new gqe0(type);
                }
                xqe0Var = gqe0Var;
            }
            arrayList.add(xqe0Var);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.f25684a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        return iun.f15405a;
    }
}
