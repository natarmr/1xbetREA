package a;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class fmk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t68 f9787a;
    public final int b;
    public final int c;
    public Rect d;
    public boolean e;

    public fmk0(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f9787a = new t68(bArr, i, i2);
        this.c = i4;
        this.b = i3;
        if (i * i2 <= bArr.length) {
            return;
        }
        StringBuilder sbT = dw9.t("Image data does not match the resolution. ", i, "x", " > ", i2);
        sbT.append(bArr.length);
        throw new IllegalArgumentException(sbT.toString());
    }
}
