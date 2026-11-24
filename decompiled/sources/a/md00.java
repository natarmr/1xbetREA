package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class md00 {
    public static final kd00 Companion = new kd00();
    public static final a8z[] b = {maz.a(wez.f39042a, new x800((byte) 1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21573a;

    public /* synthetic */ md00(int i, List list) {
        if ((i & 1) == 0) {
            this.f21573a = null;
        } else {
            this.f21573a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md00) && Intrinsics.d(this.f21573a, ((md00) obj).f21573a);
    }

    public final int hashCode() {
        List list = this.f21573a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f21573a, "ListItemContent(content=", Separators.RPAREN);
    }
}
