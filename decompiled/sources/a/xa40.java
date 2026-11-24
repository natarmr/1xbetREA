package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xa40 implements ab40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40536a;

    public xa40(long j) {
        this.f40536a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa40) && this.f40536a == ((xa40) obj).f40536a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40536a);
    }

    public final String toString() {
        return axq.h(this.f40536a, "OnEventClick(eventId=", Separators.RPAREN);
    }
}
