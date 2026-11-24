package a;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class e760 extends p4 {
    public IconCompat c;
    public IconCompat d;
    public boolean e;

    @Override // a.p4
    public final void m0(z220 z220Var) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) z220Var.c;
        Context context = (Context) z220Var.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.c;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                d760.a(bigContentTitle, bww.X(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.c;
                int i = iconCompat2.f45356a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapA = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        e9d0.v(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.e) {
            IconCompat iconCompat3 = this.d;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(bww.X(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            d760.c(bigContentTitle, false);
            d760.b(bigContentTitle, null);
        }
    }
}
