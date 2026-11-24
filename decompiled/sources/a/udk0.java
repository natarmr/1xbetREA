package a;

import android.content.res.Resources;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class udk0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f35484a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wdk0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ rrm e;
    public final /* synthetic */ View f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ boolean h;

    public udk0(WeakReference weakReference, boolean z, wdk0 wdk0Var, View view, rrm rrmVar, View view2, Integer num, boolean z2) {
        this.f35484a = weakReference;
        this.b = z;
        this.c = wdk0Var;
        this.d = view;
        this.e = rrmVar;
        this.f = view2;
        this.g = num;
        this.h = z2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iE;
        rrm rrmVar = this.e;
        f46 f46Var = rrmVar.i;
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        kxq kxqVar = (kxq) this.f35484a.get();
        if (kxqVar != null) {
            if (kxqVar.isFinishing() || kxqVar.isDestroyed() || !f46Var.isAttachedToWindow()) {
                kxqVar = null;
            }
            if (kxqVar != null) {
                boolean z = this.b;
                wdk0 wdk0Var = this.c;
                if (z) {
                    wdk0Var.getClass();
                    iE = wdk0.e(view);
                } else {
                    iE = 0;
                }
                db50 db50Var = (db50) zdx.A(kxqVar).f2242a.getValue();
                Float f = db50Var.b;
                if (this.d != null) {
                    wdk0Var.p(rrmVar);
                    return;
                }
                boolean z2 = db50Var.f5786a;
                Integer num = this.g;
                View view2 = this.f;
                if (!z2 && view2 == null) {
                    Resources resources = f46Var.getResources();
                    resources.getClass();
                    wdk0Var.getClass();
                    wdk0.o(rrmVar, resources, iE, num);
                    return;
                }
                if (f != null && view2 == null) {
                    wdk0Var.m(rrmVar, f.floatValue());
                    return;
                }
                if (this.h || (z2 && view2 == null)) {
                    Resources resources2 = f46Var.getResources();
                    resources2.getClass();
                    wdk0Var.getClass();
                    wdk0.n(rrmVar, resources2, iE);
                    return;
                }
                Resources resources3 = f46Var.getResources();
                resources3.getClass();
                wdk0Var.getClass();
                wdk0.o(rrmVar, resources3, iE, num);
            }
        }
    }
}
