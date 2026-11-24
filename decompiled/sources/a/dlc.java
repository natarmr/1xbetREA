package a;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class dlc implements dne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6272a;

    public dlc(float f) {
        this.f6272a = f;
    }

    @Override // a.dne
    public final float a(RectF rectF) {
        return r7x.t(this.f6272a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlc) && this.f6272a == ((dlc) obj).f6272a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6272a)});
    }
}
