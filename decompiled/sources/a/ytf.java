package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ytf implements iqg {
    public static final xtf Companion = new xtf();
    public static final a8z[] b = {maz.a(wez.f39042a, new dpf((byte) 12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43215a;

    public /* synthetic */ ytf(int i, List list) {
        if ((i & 1) == 0) {
            this.f43215a = null;
        } else {
            this.f43215a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytf) && Intrinsics.d(this.f43215a, ((ytf) obj).f43215a);
    }

    public final int hashCode() {
        List list = this.f43215a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f43215a, "CupheadResponse(rounds=", Separators.RPAREN);
    }

    public ytf() {
        this.f43215a = null;
    }
}
