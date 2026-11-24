package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jlg implements plg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16715a;

    public jlg(long j) {
        this.f16715a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jlg) && this.f16715a == ((jlg) obj).f16715a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16715a);
    }

    public final String toString() {
        return axq.h(this.f16715a, "ChampClick(champId=", Separators.RPAREN);
    }
}
