package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uhx implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35703a = 1;
    public final /* synthetic */ edu b;
    public final /* synthetic */ r9u c;
    public final /* synthetic */ pru d;

    public /* synthetic */ uhx(edu eduVar, r9u r9uVar, pru pruVar) {
        this.b = eduVar;
        this.c = r9uVar;
        this.d = pruVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        udl0 udl0Var;
        byte b = this.f35703a;
        pru pruVar = this.d;
        r9u r9uVar = this.c;
        edu eduVar = this.b;
        switch (b) {
            case 0:
                sff0 sff0VarA = pruVar.a();
                iun iunVar = iun.f15405a;
                int iOrdinal = sff0VarA.h1.ordinal();
                if (iOrdinal == 0) {
                    udl0Var = udl0.CLASSIC;
                } else if (iOrdinal == 1) {
                    udl0Var = udl0.ADVANCED;
                } else if (iOrdinal == 2) {
                    udl0Var = udl0.DASHBOARD;
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    udl0Var = udl0.LITE;
                }
                mhx mhxVar = new mhx(udl0Var, sff0VarA.J1);
                aw20 aw20VarG = eduVar.g();
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new ohx(iunVar, iunVar, null, true, mhxVar, aw20VarG, j1q0Var.f15748a.d(ygpVar));
            default:
                iun iunVar2 = iun.f15405a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                aw20 aw20VarG2 = eduVar.g();
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new m730(iunVar2, lunVar, null, -1L, aw20VarG2, j1q0Var2.f15748a.d(ygpVar2), null, pruVar.a().I1);
        }
    }

    public /* synthetic */ uhx(pru pruVar, edu eduVar, r9u r9uVar) {
        this.d = pruVar;
        this.b = eduVar;
        this.c = r9uVar;
    }
}
