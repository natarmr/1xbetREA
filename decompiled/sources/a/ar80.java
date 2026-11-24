package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ar80 implements lr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1334a;

    public ar80(int i) {
        this.f1334a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar80) && this.f1334a == ((ar80) obj).f1334a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1334a);
    }

    public final String toString() {
        return ua80.e(this.f1334a, "OnBannerClick(bannerId=", Separators.RPAREN);
    }
}
