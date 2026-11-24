package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class axp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f1634a;
    public final List b;
    public final Pair c;

    public axp0(Pair pair, List list, Pair pair2) {
        list.getClass();
        this.f1634a = pair;
        this.b = list;
        this.c = pair2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axp0)) {
            return false;
        }
        axp0 axp0Var = (axp0) obj;
        return this.f1634a.equals(axp0Var.f1634a) && Intrinsics.d(this.b, axp0Var.b) && this.c.equals(axp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f1634a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TennisGameScore(totalScores=" + this.f1634a + ", periodScores=" + this.b + ", gameScores=" + this.c + Separators.RPAREN;
    }
}
