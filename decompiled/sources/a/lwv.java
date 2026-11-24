package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lwv {
    public static final hwv Companion = new hwv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kwv f20782a;

    public /* synthetic */ lwv(int i, kwv kwvVar) {
        if ((i & 1) == 0) {
            this.f20782a = null;
        } else {
            this.f20782a = kwvVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwv) && Intrinsics.d(this.f20782a, ((lwv) obj).f20782a);
    }

    public final int hashCode() {
        kwv kwvVar = this.f20782a;
        if (kwvVar == null) {
            return 0;
        }
        return kwvVar.hashCode();
    }

    public final String toString() {
        return "HiddenBettingAppLinkResponse(data=" + this.f20782a + Separators.RPAREN;
    }
}
