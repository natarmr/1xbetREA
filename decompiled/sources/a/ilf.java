package a;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ilf extends ahe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f14975a;

    public ilf(LinearLayoutManager linearLayoutManager) {
        this.f14975a = linearLayoutManager;
    }

    @Override // a.ahe0
    public final void d(int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.f14975a;
        if (linearLayoutManager.c1() == 0) {
            linearLayoutManager.w1(0, 0);
        }
    }
}
