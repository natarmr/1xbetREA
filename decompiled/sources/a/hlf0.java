package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hlf0 {
    public static final dlf0 Companion = new dlf0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13258a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new b4f0((byte) 10)), maz.a(wezVar, new b4f0((byte) 11))};
    }

    public /* synthetic */ hlf0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f13258a = null;
        } else {
            this.f13258a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlf0)) {
            return false;
        }
        hlf0 hlf0Var = (hlf0) obj;
        return Intrinsics.d(this.f13258a, hlf0Var.f13258a) && Intrinsics.d(this.b, hlf0Var.b);
    }

    public final int hashCode() {
        List list = this.f13258a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("ReplyMarkup(buttons=", ", rows=", this.f13258a, Separators.RPAREN, this.b);
    }
}
