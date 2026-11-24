package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class woi0 {
    public static final voi0 Companion = new voi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39500a;

    public /* synthetic */ woi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f39500a = list;
        } else {
            m2x.I(i, 1, uoi0.f36017a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof woi0) && Intrinsics.d(this.f39500a, ((woi0) obj).f39500a);
    }

    public final int hashCode() {
        return this.f39500a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f39500a, "SetDepositLimitsRequest(limits=", Separators.RPAREN);
    }

    public woi0(List list) {
        list.getClass();
        this.f39500a = list;
    }
}
