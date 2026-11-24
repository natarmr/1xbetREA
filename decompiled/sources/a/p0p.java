package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class p0p implements iqg {
    public static final o0p Companion = new o0p();
    public static final a8z[] b = {maz.a(wez.f39042a, new ago(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26163a;

    public /* synthetic */ p0p(int i, List list) {
        if ((i & 1) == 0) {
            this.f26163a = null;
        } else {
            this.f26163a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0p) && Intrinsics.d(this.f26163a, ((p0p) obj).f26163a);
    }

    public final int hashCode() {
        List list = this.f26163a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f26163a, "FatalFuryResponse(rounds=", Separators.RPAREN);
    }

    public p0p() {
        this.f26163a = null;
    }
}
