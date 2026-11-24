package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gos0 {
    public static final zns0 Companion = new zns0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new xns0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f11648a;
    public final List b;

    public /* synthetic */ gos0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f11648a = null;
        } else {
            this.f11648a = l;
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
        if (!(obj instanceof gos0)) {
            return false;
        }
        gos0 gos0Var = (gos0) obj;
        return Intrinsics.d(this.f11648a, gos0Var.f11648a) && Intrinsics.d(this.b, gos0Var.b);
    }

    public final int hashCode() {
        Long l = this.f11648a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationsResponse(lastUpdate=" + this.f11648a + ", keys=" + this.b + Separators.RPAREN;
    }
}
