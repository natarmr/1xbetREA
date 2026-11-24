package a;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class pco implements m5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26769a;
    public final lji0 b;

    public /* synthetic */ pco(lji0 lji0Var, byte b) {
        this.f26769a = b;
        this.b = lji0Var;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f26769a;
        lji0 lji0Var = this.b;
        switch (b) {
            case 0:
                return new oco((p5d0) lji0Var.b);
            case 1:
                nfq nfqVar = (nfq) lji0Var.b;
                nfqVar.getClass();
                rji0 rji0Var = rji0.f30596a;
                return rji0.a(nfqVar);
            default:
                return new ur00((Context) lji0Var.b);
        }
    }
}
