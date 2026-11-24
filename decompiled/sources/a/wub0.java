package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wub0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f39784a;
    public final float b;
    public final boolean c;
    public final boolean d;

    public wub0(Bitmap bitmap, float f, boolean z, boolean z2) {
        bitmap.getClass();
        this.f39784a = bitmap;
        this.b = f;
        this.c = z;
        this.d = z2;
    }

    public static wub0 a(wub0 wub0Var, boolean z, int i) {
        Bitmap bitmap = wub0Var.f39784a;
        float f = wub0Var.b;
        boolean z2 = (i & 4) != 0 ? wub0Var.c : false;
        wub0Var.getClass();
        bitmap.getClass();
        return new wub0(bitmap, f, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wub0)) {
            return false;
        }
        wub0 wub0Var = (wub0) obj;
        return Intrinsics.d(this.f39784a, wub0Var.f39784a) && Float.compare(this.b, wub0Var.b) == 0 && this.c == wub0Var.c && this.d == wub0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(defpackage.c.a(this.f39784a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewState(preview=");
        sb.append(this.f39784a);
        sb.append(", savingDegree=");
        sb.append(this.b);
        sb.append(", previewVisible=");
        return ohs0.p(", temporaryPreviewVisible=", Separators.RPAREN, sb, this.c, this.d);
    }
}
