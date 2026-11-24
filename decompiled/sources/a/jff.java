package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class jff implements kff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f16423a;
    public final ArrayList b;
    public final ArrayList c;

    public jff(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2) {
        this.f16423a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jff)) {
            return false;
        }
        jff jffVar = (jff) obj;
        return this.f16423a.equals(jffVar.f16423a) && this.b.equals(jffVar.b) && this.c.equals(jffVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, this.f16423a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinCombination(winColumns=");
        sb.append(this.f16423a);
        sb.append(", fieldItems=");
        sb.append(this.b);
        sb.append(", newItems=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
