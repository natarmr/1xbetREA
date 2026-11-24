package a;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i9y extends e9y implements ger, zer, gre0 {
    public final a8z f;
    public final a8z g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9y(ihy ihyVar, Member member, Object obj, rgy rgyVar) {
        super(ihyVar, member, obj, rgyVar);
        ihyVar.getClass();
        member.getClass();
        rgyVar.getClass();
        wez wezVar = wez.f39042a;
        this.f = maz.a(wezVar, new nsr(this, ihyVar, (byte) 14));
        this.g = maz.a(wezVar, new aaw(this, (byte) 9));
    }

    public abstract boolean A();

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final boolean equals(Object obj) {
        gre0 gre0VarB = xtt0.b(obj);
        return gre0VarB != null && Intrinsics.d(this.c, gre0VarB.K()) && Intrinsics.d(getName(), gre0VarB.getName()) && Intrinsics.d(getSignature(), gre0VarB.getSignature()) && Intrinsics.d(this.e, gre0VarB.L());
    }

    @Override // a.cer
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fet fetVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, fetVar, num);
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return t9x.E(this.c, getSignature());
    }

    @Override // a.ger
    public final int getArity() {
        bv9 bv9VarX = x();
        bv9VarX.getClass();
        return bv9VarX.a().size();
    }

    @Override // a.qgy
    public final List getParameters() {
        return (List) this.f.getValue();
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return (List) this.g.getValue();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // a.jhy
    public final boolean isExternal() {
        return Modifier.isNative(this.d.getModifiers());
    }

    @Override // a.jhy
    public final boolean isInfix() {
        return false;
    }

    @Override // a.jhy
    public final boolean isInline() {
        return false;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public abstract Type[] p();

    @Override // a.ber
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fet fetVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, fetVar, num);
    }

    public final String toString() {
        return rv00.x(this);
    }

    public abstract TypeVariable[] u();

    public abstract Class[] z();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }
}
