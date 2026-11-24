package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nwo {
    public static final mwo Companion = new mwo();
    public static final a8z[] b = {maz.a(wez.f39042a, new ago(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24243a;

    public /* synthetic */ nwo(int i, List list) {
        if ((i & 1) == 0) {
            this.f24243a = null;
        } else {
            this.f24243a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwo) && Intrinsics.d(this.f24243a, ((nwo) obj).f24243a);
    }

    public final int hashCode() {
        List list = this.f24243a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f24243a, "FailureGamesResponse(gameIds=", Separators.RPAREN);
    }
}
