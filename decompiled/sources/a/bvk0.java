package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f3282a;
    public final List b;
    public final List c;

    public bvk0(btk0 btk0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f3282a = btk0Var;
        this.b = list;
        this.c = list2;
    }

    public static bvk0 a(bvk0 bvk0Var, btk0 btk0Var, List list, List list2, int i) {
        if ((i & 1) != 0) {
            btk0Var = bvk0Var.f3282a;
        }
        if ((i & 2) != 0) {
            list = bvk0Var.b;
        }
        if ((i & 4) != 0) {
            list2 = bvk0Var.c;
        }
        list.getClass();
        list2.getClass();
        return new bvk0(btk0Var, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvk0)) {
            return false;
        }
        bvk0 bvk0Var = (bvk0) obj;
        return this.f3282a.equals(bvk0Var.f3282a) && Intrinsics.d(this.b, bvk0Var.b) && Intrinsics.d(this.c, bvk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f3282a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialEventTabStadiumsStateModel(contentStatus=");
        sb.append(this.f3282a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", eventsCount=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
