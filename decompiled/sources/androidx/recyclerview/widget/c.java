package androidx.recyclerview.widget;

import a.ahe0;
import a.fp;
import a.hne;
import a.rgu0;
import a.xge0;
import a.yge0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ahe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f45402a;

    public c(RecyclerView recyclerView) {
        this.f45402a = recyclerView;
    }

    @Override // a.ahe0
    public final void a() {
        RecyclerView recyclerView = this.f45402a;
        recyclerView.p(null);
        recyclerView.H1.f = true;
        recyclerView.n0(true);
        if (recyclerView.e.z()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // a.ahe0
    public final void c(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.f45402a;
        recyclerView.p(null);
        fp fpVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) fpVar.d;
        if (i2 < 1) {
            return;
        }
        arrayList.add(fpVar.B(obj, 4, i, i2));
        fpVar.b |= 4;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // a.ahe0
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.f45402a;
        recyclerView.p(null);
        fp fpVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) fpVar.d;
        if (i2 < 1) {
            return;
        }
        arrayList.add(fpVar.B(null, 1, i, i2));
        fpVar.b |= 1;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // a.ahe0
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.f45402a;
        recyclerView.p(null);
        fp fpVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) fpVar.d;
        if (i == i2) {
            return;
        }
        arrayList.add(fpVar.B(null, 8, i, i2));
        fpVar.b |= 8;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // a.ahe0
    public final void f(int i, int i2) {
        RecyclerView recyclerView = this.f45402a;
        recyclerView.p(null);
        fp fpVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) fpVar.d;
        if (i2 < 1) {
            return;
        }
        arrayList.add(fpVar.B(null, 2, i, i2));
        fpVar.b |= 2;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // a.ahe0
    public final void g() {
        yge0 yge0Var;
        RecyclerView recyclerView = this.f45402a;
        if (recyclerView.d == null || (yge0Var = recyclerView.m) == null) {
            return;
        }
        int iE = hne.E(yge0Var.c);
        if (iE != 1) {
            if (iE == 2) {
                return;
            }
        } else if (yge0Var.d() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final void h() {
        RecyclerView recyclerView = this.f45402a;
        if (!recyclerView.t || !recyclerView.s) {
            recyclerView.A = true;
            recyclerView.requestLayout();
        } else {
            xge0 xge0Var = recyclerView.i;
            WeakHashMap weakHashMap = rgu0.f30456a;
            recyclerView.postOnAnimation(xge0Var);
        }
    }
}
