package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class y8c {
    public static final u8c Companion = new u8c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t8c f42188a;
    public final x8c b;

    public /* synthetic */ y8c(int i, t8c t8cVar, x8c x8cVar) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, q8c.f28292a.getDescriptor());
            throw null;
        }
        this.f42188a = t8cVar;
        this.b = x8cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8c)) {
            return false;
        }
        y8c y8cVar = (y8c) obj;
        return Intrinsics.d(this.f42188a, y8cVar.f42188a) && Intrinsics.d(this.b, y8cVar.b);
    }

    public final int hashCode() {
        return this.b.f40455a.hashCode() + (this.f42188a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckTokenRequest(auth=" + this.f42188a + ", data=" + this.b + Separators.RPAREN;
    }

    public y8c(t8c t8cVar, x8c x8cVar) {
        this.f42188a = t8cVar;
        this.b = x8cVar;
    }
}
