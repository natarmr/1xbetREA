package a;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements dne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27869a;

    public q0(float f) {
        this.f27869a = f;
    }

    @Override // a.dne
    public final float a(RectF rectF) {
        return this.f27869a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.f27869a == ((q0) obj).f27869a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f27869a)});
    }

    public final String toString() {
        return kng0.o(new StringBuilder(), this.f27869a, "px");
    }
}
