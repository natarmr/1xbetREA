package a;

import android.gov.nist.core.Separators;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t00 implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f33094a;
    public final Pair b;
    public final String c;

    public t00(Pair pair, Pair pair2, String str) {
        str.getClass();
        this.f33094a = pair;
        this.b = pair2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t00)) {
            return false;
        }
        t00 t00Var = (t00) obj;
        return this.f33094a.equals(t00Var.f33094a) && this.b.equals(t00Var.b) && Intrinsics.d(this.c, t00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f33094a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pairs(firstPair=");
        sb.append(this.f33094a);
        sb.append(", secondPair=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
