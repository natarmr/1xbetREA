package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class dn50 {
    public static final cn50 Companion = new cn50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6352a;

    public /* synthetic */ dn50(int i, String str) {
        if ((i & 1) == 0) {
            this.f6352a = null;
        } else {
            this.f6352a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn50) && Intrinsics.d(this.f6352a, ((dn50) obj).f6352a);
    }

    public final int hashCode() {
        String str = this.f6352a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("RequestPayload(userId=", this.f6352a, Separators.RPAREN);
    }

    public dn50(String str) {
        this.f6352a = str;
    }
}
