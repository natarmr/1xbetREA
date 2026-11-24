package a;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i8y extends ere0 implements ger, zer, gre0 {
    public final xgy c;
    public final List d;
    public final a8z e;
    public final a8z f;
    public final a8z g;
    public final a8z h;
    public final a8z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8y(xgy xgyVar) {
        super(rgy.k);
        xgyVar.getClass();
        this.c = xgyVar;
        Method[] declaredMethods = azw.G(xgyVar).getDeclaredMethods();
        declaredMethods.getClass();
        byte b = 3;
        this.d = tx3.Y(declaredMethods, new wpv(b));
        wez wezVar = wez.f39042a;
        this.e = maz.a(wezVar, new h8y(this, (byte) 0));
        this.f = maz.a(wezVar, new h8y(this, (byte) 1));
        this.g = maz.a(wezVar, new h8y(this, (byte) 2));
        this.h = maz.a(wezVar, new h8y(this, b));
        this.i = maz.a(wezVar, new h8y(this, (byte) 4));
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // a.dre0
    public final bv9 G() {
        return (bv9) this.i.getValue();
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        if (Intrinsics.d(rgyVar, rgy.k)) {
            return new i8y(this.c);
        }
        hny.v(this, "Constructors cannot have fake overrides: ");
        return null;
    }

    @Override // a.dre0
    public final ihy K() {
        return this.c;
    }

    @Override // a.dre0
    public final Object L() {
        return null;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final boolean equals(Object obj) {
        gre0 gre0VarB = xtt0.b(obj);
        return gre0VarB != null && Intrinsics.d(this.c, gre0VarB.K()) && "<init>".equals(gre0VarB.getName()) && Intrinsics.d(getSignature(), gre0VarB.getSignature()) && Intrinsics.d(null, gre0VarB.L());
    }

    @Override // a.cer
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fet fetVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, fetVar, num);
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return t9x.E(this.c, getSignature());
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return iun.f15405a;
    }

    @Override // a.ger
    public final int getArity() {
        return this.d.size();
    }

    @Override // a.qgy
    public final String getName() {
        return "<init>";
    }

    @Override // a.qgy
    public final List getParameters() {
        return (List) this.g.getValue();
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return (kiy) this.f.getValue();
    }

    @Override // a.gre0
    public final String getSignature() {
        return (String) this.e.getValue();
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return iun.f15405a;
    }

    @Override // a.qgy
    public final viy getVisibility() {
        int modifiers = azw.G(this.c).getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return viy.f37504a;
        }
        if (Modifier.isPrivate(modifiers)) {
            return viy.d;
        }
        return null;
    }

    public final int hashCode() {
        return getSignature().hashCode() + (((this.c.hashCode() * 31) + 1818100338) * 31);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // a.jhy
    public final boolean isExternal() {
        return false;
    }

    @Override // a.jhy
    public final boolean isInfix() {
        return false;
    }

    @Override // a.jhy
    public final boolean isInline() {
        return false;
    }

    @Override // a.jhy
    public final boolean isOperator() {
        return false;
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        return false;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // a.dre0
    public final fm40 m() {
        return fm40.FINAL;
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // a.ber
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fet fetVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, fetVar, num);
    }

    @Override // a.dre0
    public final boolean t() {
        int modifiers = azw.G(this.c).getModifiers();
        swq swqVar = xtt0.f41480a;
        return (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) ? false : true;
    }

    public final String toString() {
        return rv00.x(this);
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.h.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }
}
