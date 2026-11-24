package a;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class sty extends Paint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32796a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sty(PorterDuff.Mode mode) {
        super(1);
        this.f32796a = (byte) 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.f32796a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(ah40.c(i));
                } else {
                    setColor((ah40.c(i) << 24) | (getColor() & 16777215));
                }
                break;
            default:
                super.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f32796a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sty(int i, byte b) {
        super(i);
        this.f32796a = b;
    }

    private final void a(LocaleList localeList) {
    }
}
