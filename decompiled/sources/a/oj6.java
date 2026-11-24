package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oj6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25346a = 2;
    public final /* synthetic */ r9u b;
    public final /* synthetic */ pru c;

    public /* synthetic */ oj6(r9u r9uVar, pru pruVar) {
        this.b = r9uVar;
        this.c = pruVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25346a;
        r9u r9uVar = this.b;
        pru pruVar = this.c;
        switch (b) {
            case 0:
                sff0 sff0VarA = pruVar.a();
                iun iunVar = iun.f15405a;
                oxk0 oxk0Var = sff0VarA.I1;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new hj6(false, null, null, iunVar, null, "", true, oxk0Var, j1q0Var.f15748a.d(ygpVar), iunVar, sff0VarA.R1, sff0VarA.J1, sff0VarA.O1);
            case 1:
                iun iunVar2 = iun.f15405a;
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new or6(iunVar2, iunVar2, 0, j1q0Var2.f15748a.d(ygpVar2), false, true, false, pruVar.a().g.C, gio.d);
            default:
                udl0 udl0Var = pruVar.a().h1;
                aw20 aw20VarD = art.d(ufx.N(udl0Var));
                iun iunVar3 = iun.f15405a;
                ygp ygpVar3 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var3 = r9uVar.f30104a;
                j1q0Var3.getClass();
                m1q0 m1q0Var = j1q0Var3.f15748a;
                return new y330(true, udl0Var, aw20VarD, aw20VarD, iunVar3, m1q0Var.d(ygpVar3), m1q0Var.d(ygp.o1));
        }
    }

    public /* synthetic */ oj6(pru pruVar, art artVar, r9u r9uVar) {
        this.c = pruVar;
        this.b = r9uVar;
    }

    public /* synthetic */ oj6(pru pruVar, r9u r9uVar) {
        this.c = pruVar;
        this.b = r9uVar;
    }
}
