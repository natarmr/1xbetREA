package a;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b9y extends ere0 implements eiy, ire0 {
    public static final Method h;
    public final xgy c;
    public final a0o d;
    public final a8z e;
    public final a9y f;
    public final a8z g;

    static {
        swq swqVar = xtt0.f41480a;
        Method[] declaredMethods = bqe0.d(Unit.class).loadClass("kotlin.enums.EnumEntriesKt").getDeclaredMethods();
        declaredMethods.getClass();
        Method method = null;
        boolean z = false;
        for (Method method2 : declaredMethods) {
            if (Intrinsics.d(method2.getName(), "enumEntries")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                Class cls = (Class) tx3.X(parameterTypes);
                if (cls != null && cls.isArray() && Intrinsics.d(cls.getComponentType(), Enum.class)) {
                    if (z) {
                        jf4.o("Array contains more than one matching element.");
                        return;
                    } else {
                        z = true;
                        method = method2;
                    }
                }
            }
        }
        if (!z) {
            v4i0.o("Array contains no element matching the predicate.");
        } else {
            method.getClass();
            h = method;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9y(xgy xgyVar) throws IllegalAccessException, InvocationTargetException {
        super(rgy.k);
        xgyVar.getClass();
        this.c = xgyVar;
        Object objInvoke = h.invoke(null, azw.G(xgyVar).getEnumConstants());
        objInvoke.getClass();
        this.d = (a0o) objInvoke;
        wez wezVar = wez.f39042a;
        this.e = maz.a(wezVar, new y8y(this, (byte) 0));
        this.f = new a9y(this);
        this.g = maz.a(wezVar, new y8y(this, (byte) 1));
    }

    @Override // a.dre0
    public final bv9 G() {
        return null;
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new b9y(this.c);
    }

    @Override // a.dre0
    public final ihy K() {
        return this.c;
    }

    @Override // a.dre0
    public final Object L() {
        return null;
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return iun.f15405a;
    }

    @Override // a.iiy
    public final diy d() {
        return (diy) this.g.getValue();
    }

    public final boolean equals(Object obj) {
        ire0 ire0VarC = xtt0.c(obj);
        return ire0VarC != null && Intrinsics.d(this.c, ire0VarC.K()) && "entries".equals(ire0VarC.getName()) && "getEntries()Lkotlin/enums/EnumEntries;".equals(ire0VarC.getSignature()) && Intrinsics.d(null, ire0VarC.L());
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return t9x.E(this.c, "getEntries()Lkotlin/enums/EnumEntries;");
    }

    @Override // a.eiy
    public final Object get() {
        return this.d;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return iun.f15405a;
    }

    @Override // a.qgy
    public final String getName() {
        return "entries";
    }

    @Override // a.qgy
    public final List getParameters() {
        return iun.f15405a;
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return (kiy) this.e.getValue();
    }

    @Override // a.ire0
    public final String getSignature() {
        return "getEntries()Lkotlin/enums/EnumEntries;";
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return iun.f15405a;
    }

    @Override // a.qgy
    public final viy getVisibility() {
        return viy.f37504a;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) - 1591573360) * 31) - 2087422618;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.d;
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        return false;
    }

    @Override // a.dre0
    public final fm40 m() {
        return fm40.FINAL;
    }

    @Override // a.dre0
    public final boolean t() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        rv00.k(sb, this);
        sb.append(this instanceof uhy ? "var " : "val ");
        rv00.m(sb, this);
        rv00.l("entries", sb);
        sb.append(": ");
        sb.append(rv00.z(getReturnType(), false));
        return sb.toString();
    }

    @Override // a.dre0
    public final bv9 x() {
        return this.f;
    }

    @Override // a.ire0
    public final Field y() {
        return null;
    }
}
