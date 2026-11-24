package a;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class vdk0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wdk0 f37237a;
    public final /* synthetic */ rrm b;
    public final /* synthetic */ float c;

    public vdk0(wdk0 wdk0Var, rrm rrmVar, float f) {
        this.f37237a = wdk0Var;
        this.b = rrmVar;
        this.c = f;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        this.f37237a.m(this.b, this.c);
    }
}
