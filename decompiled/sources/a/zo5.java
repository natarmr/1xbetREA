package a;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public final class zo5 extends lls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44702a;

    public /* synthetic */ zo5(byte b) {
        this.f44702a = b;
    }

    @Override // a.lls0
    public final String a() {
        switch (this.f44702a) {
            case 0:
                return "BannerChampionshipTransformCoil";
            case 1:
                return "CenterCropCoilTransformation";
            default:
                return "CenterInsideCoilTransformation";
        }
    }

    @Override // a.lls0
    public final Bitmap b(Bitmap bitmap, f7k0 f7k0Var) {
        switch (this.f44702a) {
            case 0:
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
            case 1:
                umk umkVar3 = f7k0Var.f9062a;
                int width = umkVar3 instanceof rmk ? ((rmk) umkVar3).f30747a : bitmap.getWidth();
                umk umkVar4 = f7k0Var.b;
                int height = umkVar4 instanceof rmk ? ((rmk) umkVar4).f30747a : bitmap.getHeight();
                float fMax2 = Math.max(width / bitmap.getWidth(), height / bitmap.getHeight());
                int iCeil3 = (int) Math.ceil(bitmap.getWidth() * fMax2);
                int iCeil4 = (int) Math.ceil(bitmap.getHeight() * fMax2);
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, iCeil3, iCeil4, true);
                bitmapCreateScaledBitmap2.getClass();
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap2, (iCeil3 - width) / 2, (iCeil4 - height) / 2, width, height);
                bitmapCreateBitmap2.getClass();
                return bitmapCreateBitmap2;
            default:
                umk umkVar5 = f7k0Var.f9062a;
                int width2 = umkVar5 instanceof rmk ? ((rmk) umkVar5).f30747a : bitmap.getWidth();
                umk umkVar6 = f7k0Var.b;
                int height2 = umkVar6 instanceof rmk ? ((rmk) umkVar6).f30747a : bitmap.getHeight();
                if (bitmap.getWidth() <= width2 && bitmap.getHeight() <= height2) {
                    return bitmap;
                }
                float fMin = Math.min(width2 / bitmap.getWidth(), height2 / bitmap.getHeight());
                int iCeil5 = (int) Math.ceil(bitmap.getWidth() * fMin);
                int iCeil6 = (int) Math.ceil(bitmap.getHeight() * fMin);
                Bitmap bitmapCreateScaledBitmap3 = Bitmap.createScaledBitmap(bitmap, iCeil5, iCeil6, true);
                bitmapCreateScaledBitmap3.getClass();
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateScaledBitmap3, Math.max((iCeil5 - width2) / 2, 0), Math.max((iCeil6 - height2) / 2, 0), width2, height2);
                bitmapCreateBitmap3.getClass();
                return bitmapCreateBitmap3;
        }
    }
}
