package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class d4j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5458a;
    public final oll b;

    public d4j(long j, oll ollVar) {
        this.f5458a = j;
        this.b = ollVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4j)) {
            return false;
        }
        d4j d4jVar = (d4j) obj;
        return this.f5458a == d4jVar.f5458a && this.b.equals(d4jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f5458a) * 31);
    }

    public final String toString() {
        return "DailyTasksCardModel(id=" + this.f5458a + ", status=" + this.b + Separators.RPAREN;
    }
}
