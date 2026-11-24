package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class aeu implements eeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f746a;
    public final ArrayList b;
    public final boolean c;

    public aeu(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f746a = arrayList;
        this.b = arrayList2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeu)) {
            return false;
        }
        aeu aeuVar = (aeu) obj;
        return this.f746a.equals(aeuVar.f746a) && this.b.equals(aeuVar.b) && this.c == aeuVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.g(this.b, this.f746a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(sportChips=");
        sb.append(this.f746a);
        sb.append(", games=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
