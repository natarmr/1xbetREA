package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m32 f1881a;
    public final List b;
    public final List c;
    public final Set d;

    public b32(m32 m32Var, List list, List list2, Set set) {
        list.getClass();
        list2.getClass();
        set.getClass();
        this.f1881a = m32Var;
        this.b = list;
        this.c = list2;
        this.d = set;
    }

    public static b32 a(b32 b32Var, m32 m32Var, List list, Set set, int i) {
        if ((i & 1) != 0) {
            m32Var = b32Var.f1881a;
        }
        if ((i & 2) != 0) {
            list = b32Var.b;
        }
        List list2 = b32Var.c;
        list.getClass();
        list2.getClass();
        set.getClass();
        return new b32(m32Var, list, list2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b32)) {
            return false;
        }
        b32 b32Var = (b32) obj;
        return this.f1881a == b32Var.f1881a && Intrinsics.d(this.b, b32Var.b) && Intrinsics.d(this.c, b32Var.c) && Intrinsics.d(this.d, b32Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f1881a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "AllEventGamesHistoryStateModel(contentStatus=" + this.f1881a + ", content=" + this.b + ", uiItemList=" + this.c + ", expandGamesHistoryIds=" + this.d + Separators.RPAREN;
    }
}
