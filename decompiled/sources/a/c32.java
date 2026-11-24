package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m32 f3651a;
    public final List b;
    public final List c;

    public c32(m32 m32Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f3651a = m32Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c32)) {
            return false;
        }
        c32 c32Var = (c32) obj;
        return this.f3651a == c32Var.f3651a && Intrinsics.d(this.b, c32Var.b) && Intrinsics.d(this.c, c32Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f3651a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllEventGamesLineStateModel(contentStatus=");
        sb.append(this.f3651a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", uiItemList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
