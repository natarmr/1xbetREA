package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e140 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7020a;
    public final ArrayList b;
    public final List c;

    public e140(String str, ArrayList arrayList, List list) {
        list.getClass();
        this.f7020a = str;
        this.b = arrayList;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e140)) {
            return false;
        }
        e140 e140Var = (e140) obj;
        return this.f7020a.equals(e140Var.f7020a) && this.b.equals(e140Var.b) && Intrinsics.d(this.c, e140Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, this.f7020a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuStyledTabsModel(tabStyle=");
        sb.append(this.f7020a);
        sb.append(", tabs=");
        sb.append(this.b);
        sb.append(", menuSectionTypes=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
