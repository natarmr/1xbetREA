package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q4l0 implements c5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1p f28103a;

    public q4l0(y1p y1pVar) {
        this.f28103a = y1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4l0) && this.f28103a == ((q4l0) obj).f28103a;
    }

    public final int hashCode() {
        return this.f28103a.hashCode();
    }

    public final String toString() {
        return "UpdateFatmanScreenType(type=" + this.f28103a + Separators.RPAREN;
    }
}
