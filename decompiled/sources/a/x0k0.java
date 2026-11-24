package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class x0k0 implements a1k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f40075a;
    public final String b;

    public x0k0(String str, Bitmap bitmap) {
        this.f40075a = bitmap;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0k0)) {
            return false;
        }
        x0k0 x0k0Var = (x0k0) obj;
        return this.f40075a.equals(x0k0Var.f40075a) && this.b.equals(x0k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40075a.hashCode() * 31);
    }

    public final String toString() {
        return "SaveBitmap(bitmap=" + this.f40075a + ", filename=" + this.b + Separators.RPAREN;
    }
}
