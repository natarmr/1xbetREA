package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class a070 {
    public static final tz60 Companion = new tz60();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new fq60((byte) 10)), maz.a(wezVar, new fq60((byte) 11)), maz.a(wezVar, new fq60((byte) 12))};
    }

    public /* synthetic */ a070(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f13a = null;
        } else {
            this.f13a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a070)) {
            return false;
        }
        a070 a070Var = (a070) obj;
        return Intrinsics.d(this.f13a, a070Var.f13a) && Intrinsics.d(this.b, a070Var.b) && Intrinsics.d(this.c, a070Var.c);
    }

    public final int hashCode() {
        List list = this.f13a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(w6x.t("OneXGamesPreviewResponse(gamePreview=", ", gamesTranslates=", this.f13a, ", categoryTranslates=", this.b), this.c, Separators.RPAREN);
    }
}
