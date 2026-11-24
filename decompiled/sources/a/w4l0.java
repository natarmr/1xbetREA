package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w4l0 implements b5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38546a;

    public w4l0(long j) {
        this.f38546a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4l0) && this.f38546a == ((w4l0) obj).f38546a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38546a);
    }

    public final String toString() {
        return axq.h(this.f38546a, "ChampClick(champId=", Separators.RPAREN);
    }
}
