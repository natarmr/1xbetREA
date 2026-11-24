package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h9y extends i9y {
    public final a8z h;
    public final a8z i;
    public final a8z j;
    public final a8z k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9y(ihy ihyVar, Constructor constructor, Object obj) {
        super(ihyVar, constructor, obj, rgy.k);
        ihyVar.getClass();
        constructor.getClass();
        wez wezVar = wez.f39042a;
        this.h = maz.a(wezVar, new f9y(this, (byte) 0));
        this.i = maz.a(wezVar, new g9y(ihyVar, (byte) 0));
        this.j = maz.a(wezVar, new f9y(this, (byte) 1));
        this.k = maz.a(wezVar, new f9y(this, (byte) 2));
    }

    @Override // a.i9y
    public final boolean A() {
        return B().isVarArgs();
    }

    public final Constructor B() {
        Member member = this.d;
        member.getClass();
        return (Constructor) member;
    }

    @Override // a.dre0
    public final bv9 G() {
        return null;
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        if (Intrinsics.d(rgyVar, rgy.k)) {
            return new h9y(ihyVar, B(), op9.NO_RECEIVER);
        }
        hny.v(this, "Constructors cannot have fake overrides: ");
        return null;
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return (List) this.j.getValue();
    }

    @Override // a.qgy
    public final String getName() {
        return "<init>";
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return (kiy) this.i.getValue();
    }

    @Override // a.gre0
    public final String getSignature() {
        return azw.J(B());
    }

    @Override // a.jhy
    public final boolean isOperator() {
        return false;
    }

    @Override // a.e9y, a.dre0
    public final fm40 m() {
        return fm40.FINAL;
    }

    @Override // a.i9y
    public final Type[] p() {
        Type[] genericParameterTypes = B().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    @Override // a.i9y
    public final TypeVariable[] u() {
        return (TypeVariable[]) this.h.getValue();
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.k.getValue();
    }

    @Override // a.i9y
    public final Class[] z() {
        Class<?>[] parameterTypes = B().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }
}
