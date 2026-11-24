package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mll0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21996a;
    public final List b;
    public final String c;

    public mll0(String str, List list, List list2) {
        list2.getClass();
        this.f21996a = list;
        this.b = list2;
        this.c = str;
    }

    public static mll0 a(mll0 mll0Var, List list, String str, int i) {
        List list2 = mll0Var.f21996a;
        if ((i & 2) != 0) {
            list = mll0Var.b;
        }
        if ((i & 4) != 0) {
            str = mll0Var.c;
        }
        list.getClass();
        return new mll0(str, list2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mll0)) {
            return false;
        }
        mll0 mll0Var = (mll0) obj;
        return this.f21996a.equals(mll0Var.f21996a) && Intrinsics.d(this.b, mll0Var.b) && this.c.equals(mll0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f21996a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(w6x.t("SportResultHistoryEventCardDelegateModel(specialEventIds=", ", content=", this.f21996a, ", screen=", this.b), this.c, Separators.RPAREN);
    }
}
