package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hiv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13134a;
    public final String b;

    public hiv(List list, String str) {
        list.getClass();
        this.f13134a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiv)) {
            return false;
        }
        hiv hivVar = (hiv) obj;
        return Intrinsics.d(this.f13134a, hivVar.f13134a) && this.b.equals(hivVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13134a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupsRankingModel(breakdownModel=" + this.f13134a + ", name=" + this.b + Separators.RPAREN;
    }
}
