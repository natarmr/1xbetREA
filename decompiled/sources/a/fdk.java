package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fdk extends cdk implements ciy {
    public static final /* synthetic */ iiy[] j = {new j0d0(fdk.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};
    public final mre0 h = bww.S(null, new edk(this, 0));
    public final a8z i = maz.a(wez.f39042a, new edk(this, 1));

    @Override // a.cdk
    public final b0d0 A() {
        iiy iiyVar = j[0];
        Object objInvoke = this.h.invoke();
        objInvoke.getClass();
        return (g0d0) objInvoke;
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdk) && Intrinsics.d(B(), ((fdk) obj).B());
    }

    @Override // a.qgy
    public final String getName() {
        return axq.m(new StringBuilder("<get-"), B().i, '>');
    }

    public final int hashCode() {
        return B().hashCode();
    }

    public final String toString() {
        return "getter of " + B();
    }

    @Override // a.ock
    public final wdk u() {
        kiy returnType = B().getReturnType();
        returnType.getClass();
        return (wdk) returnType;
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
        return (g0d0) objInvoke;
    }
}
