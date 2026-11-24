package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zwz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45133a;
    public final /* synthetic */ pru b;

    public /* synthetic */ zwz(pru pruVar, byte b) {
        this.f45133a = b;
        this.b = pruVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f45133a;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                sff0 sff0VarA = pruVar.a();
                iun iunVar = iun.f15405a;
                int iIntValue = ((Number) a8k0.H(vzg0Var, "CURRENT_TAB_KEY", 0)).intValue();
                ucq ucqVar = sff0VarA.f;
                return new uwz(iunVar, iunVar, iIntValue, true, false, ucqVar.l, ucqVar.i, ucqVar.k, ucqVar.o, ucqVar.n, "");
            default:
                vzg0 vzg0Var2 = (vzg0) obj;
                vzg0Var2.getClass();
                ucq ucqVar2 = pruVar.a().f;
                iun iunVar2 = iun.f15405a;
                return new l400(iunVar2, iunVar2, ((Number) a8k0.H(vzg0Var2, "CURRENT_TAB_KEY", 0)).intValue(), true, false, ucqVar2.l, ucqVar2.m, ucqVar2.i, ucqVar2.j, ucqVar2.k);
        }
    }
}
