package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lls0 {
    public String a() {
        return "CyberBannerChampionshipTransformCoil";
    }

    public Bitmap b(Bitmap bitmap, f7k0 f7k0Var) {
        umk umkVar = f7k0Var.f9062a;
        int i = umkVar instanceof rmk ? ((rmk) umkVar).f30747a : 1;
        umk umkVar2 = f7k0Var.b;
        int i2 = umkVar2 instanceof rmk ? ((rmk) umkVar2).f30747a : 1;
        float fMax = Math.max(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iCeil = (int) Math.ceil(bitmap.getWidth() * fMax);
        int iCeil2 = (int) Math.ceil(bitmap.getHeight() * fMax);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iCeil, iCeil2, false);
        bitmapCreateScaledBitmap.getClass();
        int i3 = bitmapCreateScaledBitmap.getHeight() > i2 ? (iCeil2 - i2) / 2 : iCeil2 - i2;
        int i4 = iCeil - i;
        if (i4 < 0) {
            i4 = 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, i4, i3 >= 0 ? i3 : 0, i, i2);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lls0) && Intrinsics.d(a(), ((lls0) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return kng0.m(sre0.f32672a.b(getClass()).J(), "(cacheKey=", a(), Separators.RPAREN);
    }
}
