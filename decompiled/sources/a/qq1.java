package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qq1 implements rq1 {
    public static final pq1 Companion = new pq1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29145a;

    public /* synthetic */ qq1(int i, String str) {
        if ((i & 1) == 0) {
            this.f29145a = null;
        } else {
            this.f29145a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq1) && Intrinsics.d(this.f29145a, ((qq1) obj).f29145a);
    }

    public final int hashCode() {
        String str = this.f29145a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("Href(href=", this.f29145a, Separators.RPAREN);
    }
}
