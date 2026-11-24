package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hdk extends cdk implements phy {
    public static final /* synthetic */ iiy[] j = {new j0d0(hdk.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};
    public final mre0 h = bww.S(null, new gdk(this, 0));
    public final a8z i = maz.a(wez.f39042a, new gdk(this, 1));

    @Override // a.cdk
    public final b0d0 A() {
        iiy iiyVar = j[0];
        Object objInvoke = this.h.invoke();
        objInvoke.getClass();
        return (n0d0) objInvoke;
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hdk) && Intrinsics.d(B(), ((hdk) obj).B());
    }

    @Override // a.qgy
    public final String getName() {
        return axq.m(new StringBuilder("<set-"), B().i, '>');
    }

    public final int hashCode() {
        return B().hashCode();
    }

    public final String toString() {
        return "setter of " + B();
    }

    @Override // a.ock
    public final wdk u() {
        iiy iiyVar = j[0];
        Object objInvoke = this.h.invoke();
        objInvoke.getClass();
        return new wdk(rek.i((n0d0) objInvoke).c().x(), t55.f, false);
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.i.getValue();
    }

    @Override // a.ock
    public final mp9 z() {
        iiy iiyVar = j[0];
        Object objInvoke = this.h.invoke();
        objInvoke.getClass();
        return (n0d0) objInvoke;
    }
}
