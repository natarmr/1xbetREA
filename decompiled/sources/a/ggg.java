package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ggg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11253a;
    public final /* synthetic */ wgu b;
    public final /* synthetic */ pru c;
    public final /* synthetic */ r9u d;

    public /* synthetic */ ggg(wgu wguVar, pru pruVar, r9u r9uVar, byte b) {
        this.f11253a = b;
        this.b = wguVar;
        this.c = pruVar;
        this.d = r9uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11253a;
        r9u r9uVar = this.d;
        pru pruVar = this.c;
        wgu wguVar = this.b;
        switch (b) {
            case 0:
                String strA = wguVar.a();
                iun iunVar = iun.f15405a;
                sff0 sff0VarA = pruVar.a();
                ygp ygpVar = ygp.t;
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new egg(true, null, strA, null, iunVar, true, sff0VarA, j1q0Var.f15748a.d(ygpVar));
            default:
                String strA2 = wguVar.a();
                iun iunVar2 = iun.f15405a;
                sff0 sff0VarA2 = pruVar.a();
                ygp ygpVar2 = ygp.t;
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new i7o0(true, null, strA2, null, iunVar2, true, sff0VarA2, j1q0Var2.f15748a.d(ygpVar2));
        }
    }
}
