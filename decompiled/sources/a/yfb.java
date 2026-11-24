package a;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class yfb extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42532a;
    public final /* synthetic */ LinearLayoutManager b;
    public final /* synthetic */ kk0 c;

    public yfb(zfb zfbVar, int i, LinearLayoutManager linearLayoutManager, kk0 kk0Var) {
        this.f42532a = i;
        this.b = linearLayoutManager;
        this.c = kk0Var;
    }

    @Override // a.lhe0
    public final void d(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.b;
        int iF1 = linearLayoutManager.f1();
        int iH1 = linearLayoutManager.h1();
        int i3 = this.f42532a;
        if (iF1 > i3 || i3 > iH1) {
            return;
        }
        recyclerView.u0(this);
        this.c.invoke();
    }
}
