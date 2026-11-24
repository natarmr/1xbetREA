package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p6j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26457a;
    public final int b;

    public p6j(int i, List list) {
        list.getClass();
        this.f26457a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6j)) {
            return false;
        }
        p6j p6jVar = (p6j) obj;
        return Intrinsics.d(this.f26457a, p6jVar.f26457a) && this.b == p6jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f26457a.hashCode() * 31);
    }

    public final String toString() {
        return "DailyTournamentPrizeModel(prizes=" + this.f26457a + ", prizeIndex=" + this.b + Separators.RPAREN;
    }
}
