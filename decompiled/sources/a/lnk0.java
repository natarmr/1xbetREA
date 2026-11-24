package a;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class lnk0 implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f20349a;

    public lnk0(Runnable runnable) {
        this.f20349a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.f20349a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.f20349a.run();
    }
}
