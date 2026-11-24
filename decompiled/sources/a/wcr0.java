package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wcr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38937a;
    public final List b;

    public wcr0(int i, List list) {
        list.getClass();
        this.f38937a = i;
        this.b = list;
    }

    public static wcr0 a(wcr0 wcr0Var, int i, List list, int i2) {
        if ((i2 & 1) != 0) {
            i = wcr0Var.f38937a;
        }
        if ((i2 & 2) != 0) {
            list = wcr0Var.b;
        }
        list.getClass();
        return new wcr0(i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcr0)) {
            return false;
        }
        wcr0 wcr0Var = (wcr0) obj;
        return this.f38937a == wcr0Var.f38937a && Intrinsics.d(this.b, wcr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f38937a) * 31);
    }

    public final String toString() {
        return "TopPlayersTabsModel(position=" + this.f38937a + ", list=" + this.b + Separators.RPAREN;
    }
}
