package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vs80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37938a = 0;
    public final /* synthetic */ pru b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bzt d;
    public final /* synthetic */ iqt e;
    public final /* synthetic */ dmt f;

    public /* synthetic */ vs80(iqt iqtVar, bzt bztVar, pru pruVar, dmt dmtVar, long j) {
        this.e = iqtVar;
        this.d = bztVar;
        this.b = pruVar;
        this.f = dmtVar;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37938a;
        dmt dmtVar = this.f;
        iqt iqtVar = this.e;
        bzt bztVar = this.d;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                boolean zA = iqtVar.f15225a.a();
                int i = bztVar.f3488a.a().r;
                ai0 ai0Var = pruVar.a().b.s;
                kg kgVarB = dmtVar.b();
                ot0 ot0Var = pruVar.a().b.l;
                hr10 hr10Var = pruVar.a().b.e;
                boolean z = pruVar.a().b.C;
                boolean z2 = pruVar.a().O0;
                iun iunVar = iun.f15405a;
                return new rs80(true, false, false, zA, true, false, true, i, ai0Var, kgVarB, ot0Var, hr10Var, null, null, z, z2, null, iunVar, xun.f41520a, or80.f25724a, null, this.c, vr80.f37887a, iunVar, iunVar, false, new Pair(Boolean.FALSE, 0));
            default:
                sff0 sff0VarA = pruVar.a();
                int i2 = bztVar.f3488a.a().r;
                boolean zA2 = iqtVar.f15225a.a();
                hl1 hl1Var = sff0VarA.b;
                return new nfe0(ohe.f25261a, this.c, i2, zA2, hl1Var.C, dmtVar.b(), hl1Var.l, xun.f41520a, null);
        }
    }

    public /* synthetic */ vs80(pru pruVar, long j, bzt bztVar, iqt iqtVar, dmt dmtVar) {
        this.b = pruVar;
        this.c = j;
        this.d = bztVar;
        this.e = iqtVar;
        this.f = dmtVar;
    }
}
