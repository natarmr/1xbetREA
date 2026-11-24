package a;

import android.gov.nist.core.Separators;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class mqe0 extends qqe0 implements m8y, q8y, hay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f22221a;

    public mqe0(Class cls) {
        cls.getClass();
        this.f22221a = cls;
    }

    @Override // a.m8y
    public final cqe0 a(swq swqVar) {
        Annotation[] declaredAnnotations;
        swqVar.getClass();
        Class cls = this.f22221a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return tfx.z(declaredAnnotations, swqVar);
    }

    public final List b() {
        Field[] declaredFields = this.f22221a.getDeclaredFields();
        declaredFields.getClass();
        return pgi0.t(pgi0.p(pgi0.i(tx3.t(declaredFields), jqe0.f16948a), kqe0.f18720a));
    }

    public final swq c() {
        return bqe0.a(this.f22221a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.f22221a.getDeclaredMethods();
        declaredMethods.getClass();
        return pgi0.t(pgi0.p(pgi0.h(tx3.t(declaredMethods), new caz(this, (byte) 15)), lqe0.f20484a));
    }

    public final g950 e() {
        Class cls = this.f22221a;
        if (!cls.isAnonymousClass()) {
            return g950.e(cls.getSimpleName());
        }
        String name = cls.getName();
        return g950.e(StringsKt.p0(name, Separators.DOT, name));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mqe0) {
            return Intrinsics.d(this.f22221a, ((mqe0) obj).f22221a);
        }
        return false;
    }

    public final ArrayList f() {
        Class cls = this.f22221a;
        cls.getClass();
        f7u f7uVar = zdx.f44229a;
        Object[] objArr = null;
        if (f7uVar == null) {
            try {
                f7uVar = new f7u((Object) Class.class.getMethod("isSealed", null), (Object) Class.class.getMethod("getPermittedSubclasses", null), (Object) Class.class.getMethod("isRecord", null), (Object) Class.class.getMethod("getRecordComponents", null), (byte) 26);
            } catch (NoSuchMethodException unused) {
                f7uVar = new f7u((Object) objArr, (Object) objArr, (Object) objArr, (Object) objArr, (byte) 26);
            }
            zdx.f44229a = f7uVar;
        }
        Method method = (Method) f7uVar.e;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new yqe0(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        Class cls = this.f22221a;
        cls.getClass();
        f7u f7uVar = zdx.f44229a;
        Boolean bool = null;
        if (f7uVar == null) {
            try {
                f7uVar = new f7u((Object) Class.class.getMethod("isSealed", null), (Object) Class.class.getMethod("getPermittedSubclasses", null), (Object) Class.class.getMethod("isRecord", null), (Object) Class.class.getMethod("getRecordComponents", null), (byte) 26);
            } catch (NoSuchMethodException unused) {
                f7uVar = new f7u((Object) bool, (Object) bool, (Object) bool, (Object) bool, (byte) 26);
            }
            zdx.f44229a = f7uVar;
        }
        Method method = (Method) f7uVar.d;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f22221a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? iun.f15405a : tfx.A(declaredAnnotations);
    }

    @Override // a.hay
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f22221a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new are0(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f22221a.hashCode();
    }

    public final String toString() {
        return mqe0.class.getName() + ": " + this.f22221a;
    }
}
