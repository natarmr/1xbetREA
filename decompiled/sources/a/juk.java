package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class juk {
    public static final iuk Companion = new iuk();
    public static final a8z[] b = {maz.a(wez.f39042a, new rtj(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17157a;

    public /* synthetic */ juk(int i, List list) {
        if ((i & 1) == 0) {
            this.f17157a = null;
        } else {
            this.f17157a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof juk) && Intrinsics.d(this.f17157a, ((juk) obj).f17157a);
    }

    public final int hashCode() {
        List list = this.f17157a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17157a, "DisciplineResponse(options=", Separators.RPAREN);
    }
}
