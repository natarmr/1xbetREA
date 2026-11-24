package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ckh implements hb50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4506a;
    public final /* synthetic */ sgy b;
    public final /* synthetic */ jiy c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ ckh(sgy sgyVar, Function2 function2, jiy jiyVar, byte b) {
        this.f4506a = b;
        this.b = sgyVar;
        this.d = function2;
        this.c = jiyVar;
    }

    @Override // a.hb50
    public final void a(nw20 nw20Var) {
        byte b = this.f4506a;
        jiy jiyVar = this.c;
        sgy sgyVar = this.b;
        switch (b) {
            case 0:
                nw20Var.s(sgyVar, jiyVar);
                break;
            default:
                nw20Var.s(sgyVar, jiyVar);
                break;
        }
    }

    @Override // a.hb50
    public final void b(phf0 phf0Var) {
        byte b = this.f4506a;
        Function2 function2 = this.d;
        sgy sgyVar = this.b;
        switch (b) {
            case 0:
                phf0Var.a(sgyVar, ske.j, ske.k, new ugd(181871447, true, new bkh((p1h) function2, (byte) 0)));
                break;
            default:
                phf0Var.a(sgyVar, pnk0.d, pnk0.e, new ugd(181871447, true, new bkh((gcl0) function2, (byte) 5)));
                break;
        }
    }
}
