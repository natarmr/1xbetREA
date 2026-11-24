package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m32 f5381a;
    public final List b;
    public final List c;

    public d32(m32 m32Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f5381a = m32Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d32)) {
            return false;
        }
        d32 d32Var = (d32) obj;
        return this.f5381a == d32Var.f5381a && Intrinsics.d(this.b, d32Var.b) && Intrinsics.d(this.c, d32Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f5381a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllEventGamesLiveStateModel(contentStatus=");
        sb.append(this.f5381a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", uiItemList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
