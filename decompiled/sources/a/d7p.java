package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5604a;
    public final Set b;

    public d7p(List list, Set set) {
        list.getClass();
        set.getClass();
        this.f5604a = list;
        this.b = set;
    }

    public static d7p a(d7p d7pVar, List list, Set set, int i) {
        if ((i & 1) != 0) {
            list = d7pVar.f5604a;
        }
        if ((i & 2) != 0) {
            set = d7pVar.b;
        }
        list.getClass();
        set.getClass();
        return new d7p(list, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7p)) {
            return false;
        }
        d7p d7pVar = (d7p) obj;
        return Intrinsics.d(this.f5604a, d7pVar.f5604a) && Intrinsics.d(this.b, d7pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5604a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoriteClearState(itemList=" + this.f5604a + ", selectSet=" + this.b + Separators.RPAREN;
    }
}
