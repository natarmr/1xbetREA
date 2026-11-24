package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg30 f33890a;
    public final List b;

    public tg30(lg30 lg30Var, List list) {
        list.getClass();
        this.f33890a = lg30Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg30)) {
            return false;
        }
        tg30 tg30Var = (tg30) obj;
        return this.f33890a == tg30Var.f33890a && Intrinsics.d(this.b, tg30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33890a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchTypesState(selectedMatchType=" + this.f33890a + ", matchTypes=" + this.b + Separators.RPAREN;
    }
}
