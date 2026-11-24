package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rle0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30693a;
    public final int b;
    public final ArrayList c;

    public rle0(int i, ArrayList arrayList, List list) {
        list.getClass();
        this.f30693a = list;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rle0)) {
            return false;
        }
        rle0 rle0Var = (rle0) obj;
        return Intrinsics.d(this.f30693a, rle0Var.f30693a) && this.b == rle0Var.b && this.c.equals(rle0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f30693a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefereeTourModel(players=");
        sb.append(this.f30693a);
        sb.append(", sportId=");
        sb.append(this.b);
        sb.append(", info=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
