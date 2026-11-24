package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bxk {
    public static final axk Companion = new axk();
    public static final a8z[] b = {maz.a(wez.f39042a, new rtj(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3379a;

    public /* synthetic */ bxk(int i, List list) {
        if ((i & 1) == 0) {
            this.f3379a = null;
        } else {
            this.f3379a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxk) && Intrinsics.d(this.f3379a, ((bxk) obj).f3379a);
    }

    public final int hashCode() {
        List list = this.f3379a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f3379a, "DivisionDataResponse(paragraphs=", Separators.RPAREN);
    }
}
