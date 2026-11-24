package a;

import android.media.ImageReader;

/* JADX INFO: loaded from: classes.dex */
public final class e6z implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n5a f7310a;

    public e6z(n5a n5aVar) {
        this.f7310a = n5aVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        e0g0 e0g0Var = j0g0.b;
        this.f7310a.resumeWith(imageReader.acquireLatestImage());
    }
}
