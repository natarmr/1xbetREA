package a;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n9y extends i9y {
    public final a8z h;
    public final a8z i;
    public final a8z j;
    public final a8z k;
    public final a8z l;
    public final a8z m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9y(ihy ihyVar, Method method, Object obj, rgy rgyVar) {
        super(ihyVar, method, obj, rgyVar);
        ihyVar.getClass();
        rgyVar.getClass();
        wez wezVar = wez.f39042a;
        this.h = maz.a(wezVar, new l9y(this, (byte) 0));
        this.i = maz.a(wezVar, new nsr(rgyVar, this, (byte) 15));
        byte b = 2;
        this.j = maz.a(wezVar, new kch(this, ihyVar, rgyVar, b));
        this.k = maz.a(wezVar, new o0t(0, B(), tke.class, "isJavaMethodAnOperator", "isJavaMethodAnOperator(Ljava/lang/reflect/Method;)Z", 1, (byte) 9));
        this.l = maz.a(wezVar, new l9y(this, (byte) 1));
        maz.a(wezVar, new l9y(this, b));
        this.m = maz.a(wezVar, new l9y(this, (byte) 3));
    }

    @Override // a.i9y
    public final boolean A() {
        return B().isVarArgs();
    }

    public final Method B() {
        Member member = this.d;
        member.getClass();
        return (Method) member;
    }

    @Override // a.dre0
    public final bv9 G() {
        return null;
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new n9y(ihyVar, B(), op9.NO_RECEIVER, rgyVar);
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        m9y m9yVar = (m9y) this.j.getValue();
        return m9yVar != null ? m9yVar.f21434a : (List) this.h.getValue();
    }

    @Override // a.qgy
    public final String getName() {
        String name = this.d.getName();
        name.getClass();
        return name;
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        m9y m9yVar = (m9y) this.j.getValue();
        return m9yVar != null ? m9yVar.b : (v2) this.i.getValue();
    }

    @Override // a.gre0
    public final String getSignature() {
        return azw.L(B());
    }

    @Override // a.jhy
    public final boolean isOperator() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    @Override // a.i9y
    public final Type[] p() {
        Type[] genericParameterTypes = B().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    @Override // a.i9y
    public final TypeVariable[] u() {
        Object value = this.l.getValue();
        value.getClass();
        return (TypeVariable[]) value;
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.m.getValue();
    }

    @Override // a.i9y
    public final Class[] z() {
        Class<?>[] parameterTypes = B().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }
}
