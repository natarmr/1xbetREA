package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iwm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15497a;
    public final cso b;
    public final List c;
    public final nbr d;
    public final jzm0 e;
    public final int f;

    public iwm0(String str, cso csoVar, List list, nbr nbrVar, jzm0 jzm0Var, int i) {
        list.getClass();
        this.f15497a = str;
        this.b = csoVar;
        this.c = list;
        this.d = nbrVar;
        this.e = jzm0Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwm0)) {
            return false;
        }
        iwm0 iwm0Var = (iwm0) obj;
        return this.f15497a.equals(iwm0Var.f15497a) && this.b.equals(iwm0Var.b) && Intrinsics.d(this.c, iwm0Var.c) && this.d.equals(iwm0Var.d) && this.e.equals(iwm0Var.e) && this.f == iwm0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + dw9.a((this.b.hashCode() + (this.f15497a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "SubGameScoresModel(fullScore=" + this.f15497a + ", extendedScore=" + this.b + ", periodScores=" + this.c + ", fullScoreDetail=" + this.d + ", subScore=" + this.e + ", serve=" + this.f + Separators.RPAREN;
    }
}
