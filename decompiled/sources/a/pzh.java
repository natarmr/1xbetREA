package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27845a;
    public final xcz b;
    public final int c;

    public pzh(List list, xcz xczVar, int i) {
        xczVar.getClass();
        this.f27845a = list;
        this.b = xczVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzh)) {
            return false;
        }
        pzh pzhVar = (pzh) obj;
        return this.f27845a.equals(pzhVar.f27845a) && Intrinsics.d(this.b, pzhVar.b) && this.c == pzhVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.f27845a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DSAggregatorGamesColumnModel(items=");
        sb.append(this.f27845a);
        sb.append(", wheelState=");
        sb.append(this.b);
        sb.append(", defaultListSize=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
