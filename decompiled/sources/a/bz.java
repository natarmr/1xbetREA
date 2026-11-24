package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3442a;
    public final /* synthetic */ r9u b;

    public /* synthetic */ bz(r9u r9uVar, byte b) {
        this.f3442a = b;
        this.b = r9uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3442a;
        r9u r9uVar = this.b;
        switch (b) {
            case 0:
                iun iunVar = iun.f15405a;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new my(iunVar, true, false, j1q0Var.f15748a.d(ygpVar) && cy7.c());
            case 1:
                xb40 xb40Var = xb40.f40583a;
                iun iunVar2 = iun.f15405a;
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                return new yc40(xb40Var, iunVar2, null, false, true, r9uVar.f30104a.a(ygpVar2));
            default:
                pnf0 pnf0Var = pnf0.f27283a;
                ygp ygpVar3 = ygp.t;
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new c6b0(pnf0Var, jdt.f16344a, null, null, null, null, null, null, null, j1q0Var2.f15748a.d(ygpVar3));
        }
    }
}
