package a;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u6e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35134a;
    public final /* synthetic */ e7e b;

    public /* synthetic */ u6e(e7e e7eVar, byte b) {
        this.f35134a = b;
        this.b = e7eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f35134a;
        e7e e7eVar = this.b;
        switch (b) {
            case 0:
                kwd kwdVar = e7e.d2;
                kzq kzqVarH0 = e7eVar.H0();
                int iD = e7eVar.G0().d() - e7eVar.I0();
                RecyclerView recyclerView = kzqVarH0.o;
                if (iD > 4) {
                    recyclerView.y0(e7eVar.G0().d() - 1);
                } else {
                    recyclerView.B0(e7eVar.G0().d() - 1);
                }
                break;
            default:
                e7eVar.a2 = false;
                e7eVar.J0().C(e7eVar.I0());
                break;
        }
    }
}
