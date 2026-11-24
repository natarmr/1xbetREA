package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kwv {
    public static final jwv Companion = new jwv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19021a;

    public /* synthetic */ kwv(int i, String str) {
        if ((i & 1) == 0) {
            this.f19021a = null;
        } else {
            this.f19021a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwv) && Intrinsics.d(this.f19021a, ((kwv) obj).f19021a);
    }

    public final int hashCode() {
        String str = this.f19021a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("DataResponse(androidLink=", this.f19021a, Separators.RPAREN);
    }
}
