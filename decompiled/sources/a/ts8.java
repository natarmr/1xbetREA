package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ts8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34449a;
    public final int b;
    public final pab c;
    public final String d;
    public final ts8 e;
    public final int f;
    public final int g;

    public ts8(List list, int i, pab pabVar, String str, ts8 ts8Var) {
        list.getClass();
        str.getClass();
        this.f34449a = list;
        this.b = i;
        this.c = pabVar;
        this.d = str;
        this.e = ts8Var;
        int i2 = 0;
        this.g = ((pabVar != null ? pabVar.f26648a.j.ordinal() : 0) * 31) + (i * 31);
        while (!list.isEmpty()) {
            i2++;
            ts8 ts8Var2 = (ts8) CollectionsKt.firstOrNull(list);
            list = ts8Var2 != null ? ts8Var2.f34449a : null;
            if (list == null) {
                list = iun.f15405a;
            }
        }
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts8)) {
            return false;
        }
        ts8 ts8Var = (ts8) obj;
        return Intrinsics.d(this.f34449a, ts8Var.f34449a) && this.b == ts8Var.b && Intrinsics.d(this.c, ts8Var.c) && Intrinsics.d(this.d, ts8Var.d) && Intrinsics.d(this.e, ts8Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f34449a.hashCode() * 31, 31);
        pab pabVar = this.c;
        int iB = ua80.b((iA + (pabVar == null ? 0 : pabVar.hashCode())) * 31, 31, this.d);
        ts8 ts8Var = this.e;
        return iB + (ts8Var != null ? ts8Var.hashCode() : 0);
    }

    public final String toString() {
        return "BracketNodeModel(childModels=" + this.f34449a + ", height=" + this.b + ", dataModel=" + this.c + ", title=" + this.d + ", auxiliaryModel=" + this.e + Separators.RPAREN;
    }
}
