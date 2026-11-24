package a;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class t9y extends e9y implements eiy, ire0 {
    public final a8z f;
    public final a8z g;
    public final a8z h;
    public final a8z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9y(ihy ihyVar, Field field, Object obj, rgy rgyVar) {
        super(ihyVar, field, obj, rgyVar);
        ihyVar.getClass();
        rgyVar.getClass();
        wez wezVar = wez.f39042a;
        this.f = maz.a(wezVar, new p9y(this, (byte) 0));
        this.g = maz.a(wezVar, new p9y(this, (byte) 1));
        this.h = maz.a(wezVar, new p9y(this, (byte) 2));
        this.i = maz.a(wezVar, new p9y(this, (byte) 3));
    }

    @Override // a.dre0
    public final bv9 G() {
        d().getClass();
        return null;
    }

    @Override // a.dre0
    public dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new t9y(ihyVar, u(), this.e, rgyVar);
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return (List) this.f.getValue();
    }

    public final boolean equals(Object obj) {
        ire0 ire0VarC = xtt0.c(obj);
        return ire0VarC != null && Intrinsics.d(this.c, ire0VarC.K()) && Intrinsics.d(getName(), ire0VarC.getName()) && getSignature().equals(ire0VarC.getSignature()) && Intrinsics.d(this.e, ire0VarC.L());
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return t9x.E(this.c, getSignature());
    }

    @Override // a.eiy
    public final Object get() {
        return d().call(new Object[0]);
    }

    @Override // a.qgy
    public final String getName() {
        String name = u().getName();
        name.getClass();
        return name;
    }

    @Override // a.qgy
    public final List getParameters() {
        return (List) this.g.getValue();
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return (kiy) this.h.getValue();
    }

    @Override // a.ire0
    public final String getSignature() {
        return azw.K(u());
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return iun.f15405a;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // a.e9y, a.dre0
    public final fm40 m() {
        return fm40.FINAL;
    }

    @Override // a.eiy, a.iiy
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final s9y d() {
        return (s9y) this.i.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        rv00.k(sb, this);
        sb.append(this instanceof uhy ? "var " : "val ");
        rv00.m(sb, this);
        rv00.l(getName(), sb);
        sb.append(": ");
        sb.append(rv00.z(getReturnType(), false));
        return sb.toString();
    }

    public final Field u() {
        Member member = this.d;
        member.getClass();
        return (Field) member;
    }

    @Override // a.dre0
    public final bv9 x() {
        return d().x();
    }

    @Override // a.ire0
    public final Field y() {
        return u();
    }
}
