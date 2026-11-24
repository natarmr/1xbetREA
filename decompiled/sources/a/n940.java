package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n940 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d940 f23121a;
    public final boolean b;
    public final Set c;
    public final List d;

    public n940(d940 d940Var, boolean z, Set set, List list) {
        set.getClass();
        list.getClass();
        this.f23121a = d940Var;
        this.b = z;
        this.c = set;
        this.d = list;
    }

    public static n940 a(n940 n940Var, d940 d940Var, boolean z, LinkedHashSet linkedHashSet, List list, int i) {
        if ((i & 1) != 0) {
            d940Var = n940Var.f23121a;
        }
        if ((i & 2) != 0) {
            z = n940Var.b;
        }
        Set set = linkedHashSet;
        if ((i & 4) != 0) {
            set = n940Var.c;
        }
        if ((i & 8) != 0) {
            list = n940Var.d;
        }
        n940Var.getClass();
        set.getClass();
        list.getClass();
        return new n940(d940Var, z, set, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n940)) {
            return false;
        }
        n940 n940Var = (n940) obj;
        return this.f23121a.equals(n940Var.f23121a) && this.b == n940Var.b && Intrinsics.d(this.c, n940Var.c) && Intrinsics.d(this.d, n940Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ohs0.g(this.c, brm0.e(this.f23121a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "MessagesViewModelState(messagesState=" + this.f23121a + ", isRefreshing=" + this.b + ", loadingMessageIds=" + this.c + ", selectedMessageIdsForDeletion=" + this.d + Separators.RPAREN;
    }
}
