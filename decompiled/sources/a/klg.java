package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class klg implements plg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18485a;

    public klg(long j) {
        this.f18485a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klg) && this.f18485a == ((klg) obj).f18485a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18485a);
    }

    public final String toString() {
        return axq.h(this.f18485a, "ChampDisciplineClick(champId=", Separators.RPAREN);
    }
}
