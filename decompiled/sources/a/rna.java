package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class rna {
    public static final rna c = new rna(4, 8);
    public static final rna d = new rna(2, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f30779a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public rna(int i, int i2) {
        this.f30779a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rna)) {
            return false;
        }
        rna rnaVar = (rna) obj;
        return this.f30779a == rnaVar.f30779a && this.b == rnaVar.b && Float.compare(0.9f, 0.9f) == 0 && Float.compare(0.3f, 0.3f) == 0 && Float.compare(20.0f, 20.0f) == 0;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dislike_gradient) + twn.a(R.drawable.like_gradient, defpackage.c.a(defpackage.c.a(defpackage.c.a(twn.a(this.b, Integer.hashCode(this.f30779a) * 31, 31), 0.9f, 31), 0.3f, 31), 20.0f, 31), 31);
    }

    public final String toString() {
        return w6x.o(R.drawable.like_gradient, R.drawable.dislike_gradient, ", declineGradient=", Separators.RPAREN, dw9.t("CardStackSetting(visibleCount=", this.f30779a, ", topDeckMargin=", ", scaleInterval=0.9, swipeThreshold=0.3, maxRotationDegree=20.0, acceptGradient=", this.b));
    }
}
