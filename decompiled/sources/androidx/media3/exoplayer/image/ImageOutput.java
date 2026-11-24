package androidx.media3.exoplayer.image;

import a.v0x;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface ImageOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0x f45388a = new v0x();

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
