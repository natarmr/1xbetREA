package a;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* JADX INFO: loaded from: classes2.dex */
public final class mh3 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppStartTrace f21771a;

    public mh3(AppStartTrace appStartTrace) {
        this.f21771a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.f21771a.t++;
    }
}
