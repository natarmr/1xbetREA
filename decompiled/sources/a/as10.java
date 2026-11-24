package a;

import android.view.Window;

/* JADX INFO: loaded from: classes6.dex */
public final class as10 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1371a;
    public final /* synthetic */ mie0 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ as10(mie0 mie0Var, pz40 pz40Var, byte b) {
        this.f1371a = b;
        this.b = mie0Var;
        this.c = pz40Var;
    }

    @Override // a.kwk
    public final void a() {
        Window window;
        Window window2;
        byte b = this.f1371a;
        pz40 pz40Var = this.c;
        mie0 mie0Var = this.b;
        switch (b) {
            case 0:
                agd agdVar = (agd) mie0Var.f21842a;
                if (agdVar != null && (window = agdVar.getWindow()) != null) {
                    window.setSoftInputMode(((Number) pz40Var.getValue()).intValue());
                }
                mie0Var.f21842a = null;
                break;
            default:
                agd agdVar2 = (agd) mie0Var.f21842a;
                if (agdVar2 != null && (window2 = agdVar2.getWindow()) != null) {
                    window2.setSoftInputMode(((Number) pz40Var.getValue()).intValue());
                }
                mie0Var.f21842a = null;
                break;
        }
    }
}
