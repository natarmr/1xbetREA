package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sar0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31898a;
    public final String b;

    public sar0(List list, String str) {
        this.f31898a = list;
        this.b = str;
    }

    public static sar0 a(sar0 sar0Var, ArrayList arrayList, String str, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = sar0Var.f31898a;
        }
        if ((i & 2) != 0) {
            str = sar0Var.b;
        }
        str.getClass();
        return new sar0(list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sar0)) {
            return false;
        }
        sar0 sar0Var = (sar0) obj;
        return this.f31898a.equals(sar0Var.f31898a) && this.b.equals(sar0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31898a.hashCode() * 31);
    }

    public final String toString() {
        return "TopPlayersModel(tabs=" + this.f31898a + ", query=" + this.b + Separators.RPAREN;
    }
}
