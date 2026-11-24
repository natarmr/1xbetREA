package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class thd0 implements zdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f33956a;

    public thd0(Bitmap bitmap) {
        this.f33956a = bitmap;
    }

    @Override // a.zdo
    public final String a() {
        return "QrCodeEvent";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thd0) && this.f33956a.equals(((thd0) obj).f33956a);
    }

    public final int hashCode() {
        return this.f33956a.hashCode() - 450273772;
    }

    public final String toString() {
        return "QrCodeEventItemUiModel(eventKey=QrCodeEvent, eventQrCodeBitmap=" + this.f33956a + Separators.RPAREN;
    }
}
