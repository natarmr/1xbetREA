package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hoy implements iqg {
    public static final goy Companion = new goy();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13415a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new pcy((byte) 6)), maz.a(wezVar, new pcy((byte) 7))};
    }

    public /* synthetic */ hoy(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f13415a = null;
        } else {
            this.f13415a = list;
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
        if (!(obj instanceof hoy)) {
            return false;
        }
        hoy hoyVar = (hoy) obj;
        return Intrinsics.d(this.f13415a, hoyVar.f13415a) && Intrinsics.d(this.b, hoyVar.b);
    }

    public final int hashCode() {
        List list = this.f13415a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("KillerJokerResponse(cardsOnTable=", ", droppedCards=", this.f13415a, Separators.RPAREN, this.b);
    }

    public hoy() {
        this.f13415a = null;
        this.b = null;
    }
}
