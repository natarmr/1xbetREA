package a;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class s7y implements dlz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f31775a;
    public final /* synthetic */ llo b;
    public final /* synthetic */ q7y c;

    public s7y(ilz ilzVar, Window window, llo lloVar, q7y q7yVar) {
        this.f31775a = window;
        this.b = lloVar;
        this.c = q7yVar;
    }

    @Override // a.dlz
    public final void a() {
        View decorView;
        View decorView2;
        Window window = this.f31775a;
        if (window != null && (decorView2 = window.getDecorView()) != null) {
            decorView2.removeCallbacks(this.b);
        }
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.removeCallbacks(this.c);
    }
}
