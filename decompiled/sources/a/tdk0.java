package a;

import android.content.res.Resources;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class tdk0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f33773a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wdk0 c;
    public final /* synthetic */ rrm d;
    public final /* synthetic */ Integer e;

    public tdk0(WeakReference weakReference, boolean z, wdk0 wdk0Var, rrm rrmVar, Integer num) {
        this.f33773a = weakReference;
        this.b = z;
        this.c = wdk0Var;
        this.d = rrmVar;
        this.e = num;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        rrm rrmVar = this.d;
        f46 f46Var = rrmVar.i;
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        kxq kxqVar = (kxq) this.f33773a.get();
        if (kxqVar != null) {
            if (kxqVar.isFinishing() || kxqVar.isDestroyed() || !f46Var.isAttachedToWindow()) {
                kxqVar = null;
            }
            if (kxqVar != null) {
                db50 db50Var = (db50) zdx.A(kxqVar).f2242a.getValue();
                Float f = db50Var.b;
                boolean z = this.b;
                wdk0 wdk0Var = this.c;
                if (z) {
                    wdk0Var.p(rrmVar);
                    return;
                }
                if (!db50Var.f5786a) {
                    Resources resources = f46Var.getResources();
                    resources.getClass();
                    wdk0Var.getClass();
                    wdk0.o(rrmVar, resources, 0, this.e);
                    return;
                }
                if (f != null) {
                    wdk0Var.m(rrmVar, f.floatValue());
                    return;
                }
                Resources resources2 = f46Var.getResources();
                resources2.getClass();
                wdk0Var.getClass();
                wdk0.n(rrmVar, resources2, 0);
            }
        }
    }
}
