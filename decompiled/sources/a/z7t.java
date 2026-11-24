package a;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class z7t implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b8t f43936a;

    public z7t(b8t b8tVar) {
        this.f43936a = b8tVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        iiy[] iiyVarArr = b8t.Q1;
        b8t b8tVar = this.f43936a;
        b8tVar.H0().f3931a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        b8tVar.I0().B();
        b8tVar.I0().w = true;
    }
}
