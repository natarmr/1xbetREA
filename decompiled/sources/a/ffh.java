package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ffh {
    public static final efh Companion = new efh();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new gch(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f9446a;
    public final List b;

    public /* synthetic */ ffh(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f9446a = null;
        } else {
            this.f9446a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffh)) {
            return false;
        }
        ffh ffhVar = (ffh) obj;
        return Intrinsics.d(this.f9446a, ffhVar.f9446a) && Intrinsics.d(this.b, ffhVar.b);
    }

    public final int hashCode() {
        Long l = this.f9446a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CyberStageTableTitleResponse(id=" + this.f9446a + ", valueColumn=" + this.b + Separators.RPAREN;
    }
}
