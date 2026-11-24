package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class o480 {
    public static final k480 Companion = new k480();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24621a;

    public /* synthetic */ o480(int i, String str) {
        if ((i & 1) == 0) {
            this.f24621a = null;
        } else {
            this.f24621a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o480) && Intrinsics.d(this.f24621a, ((o480) obj).f24621a);
    }

    public final int hashCode() {
        String str = this.f24621a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("OpponentsResponse(fullName=", this.f24621a, Separators.RPAREN);
    }
}
