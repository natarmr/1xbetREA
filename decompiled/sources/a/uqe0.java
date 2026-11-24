package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uqe0 extends qqe0 implements m8y, x8y {
    @Override // a.m8y
    public final cqe0 a(swq swqVar) {
        swqVar.getClass();
        Member memberB = b();
        memberB.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return tfx.z(declaredAnnotations, swqVar);
        }
        return null;
    }

    public abstract Member b();

    public final g950 c() {
        String name = b().getName();
        return name != null ? g950.e(name) : lxk0.f20818a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        zqe0 gqe0Var;
        zqe0 xqe0Var;
        boolean z2;
        typeArr.getClass();
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(typeArr.length);
        ArrayList arrayListJ = ujn.o.j(b());
        int size = arrayListJ != null ? arrayListJ.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            type.getClass();
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    xqe0Var = new xqe0(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) {
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
            String str = null;
            if (arrayListJ != null) {
                String str2 = (String) CollectionsKt.W(i + size, arrayListJ);
                if (str2 == null) {
                    ohq.c(i, size, c(), xqe0Var, this);
                    return null;
                }
                str = str2;
            }
            if (z) {
                z2 = true;
                if (i != typeArr.length - 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList.add(new bre0(xqe0Var, annotationArr[i], str, z2));
        }
        return arrayList;
    }

    public final xj e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return huu0.d;
        }
        if (Modifier.isPrivate(modifiers)) {
            return euu0.d;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? oay.d : nay.d;
        }
        return may.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uqe0) && Intrinsics.d(b(), ((uqe0) obj).b());
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        Member memberB = b();
        memberB.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? tfx.A(declaredAnnotations) : iun.f15405a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
