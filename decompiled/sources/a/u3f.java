package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class u3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34993a;
    public final int b;
    public final boolean c;

    public u3f(int i, long j, boolean z) {
        this.f34993a = j;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3f)) {
            return false;
        }
        u3f u3fVar = (u3f) obj;
        return this.f34993a == u3fVar.f34993a && this.b == u3fVar.b && this.c == u3fVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f34993a) * 31, 31);
    }

    public final String toString() {
        return f140.n(brm0.q(this.b, this.f34993a, "ShowMultiBetEventDialog(eventEntityId=", ", blockId="), ", deleteEvent=", this.c, Separators.RPAREN);
    }
}
