package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class iqb {
    public static final hqb Companion = new hqb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15202a;
    public final String b;
    public final String c;

    public /* synthetic */ iqb(int i, long j, String str, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, gqb.f11724a.getDescriptor());
            throw null;
        }
        this.f15202a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqb)) {
            return false;
        }
        iqb iqbVar = (iqb) obj;
        return this.f15202a == iqbVar.f15202a && Intrinsics.d(this.b, iqbVar.b) && Intrinsics.d(this.c, iqbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f15202a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f15202a, "ChangePasswordStep2DataRequest(date=", ", password=", this.b), ", userId=", this.c, Separators.RPAREN);
    }

    public iqb(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f15202a = j;
        this.b = str;
        this.c = str2;
    }
}
