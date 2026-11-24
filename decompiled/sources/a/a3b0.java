package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a3b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f164a = 1;
    public final /* synthetic */ pru b;
    public final /* synthetic */ bzt c;
    public final /* synthetic */ iqt d;

    public /* synthetic */ a3b0(pru pruVar, iqt iqtVar, bzt bztVar) {
        this.b = pruVar;
        this.d = iqtVar;
        this.c = bztVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f164a;
        iqt iqtVar = this.d;
        bzt bztVar = this.c;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                hl1 hl1Var = pruVar.a().b;
                boolean z = hl1Var.C;
                return new u2b0(iqtVar.f15225a.a(), true, z, false, false, bztVar.f3488a.a().r, hl1Var.l, hl1Var.d, hl1Var.f13233a.k, xun.f41520a, null, g8x.x(z));
            default:
                sff0 sff0VarA = pruVar.a();
                return new ncv0(iun.f15405a, null, false, ufx.P(sff0VarA), iqtVar.f15225a.a(), sff0VarA.J1, bztVar.f3488a.a().r, false);
        }
    }

    public /* synthetic */ a3b0(pru pruVar, bzt bztVar, iqt iqtVar) {
        this.b = pruVar;
        this.c = bztVar;
        this.d = iqtVar;
    }
}
