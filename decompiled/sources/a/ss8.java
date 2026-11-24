package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ss8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32713a;
    public final int b;
    public final pab c;
    public final String d;
    public final ss8 e;
    public final int f;

    public ss8(List list, int i, pab pabVar, String str, ss8 ss8Var) {
        list.getClass();
        str.getClass();
        this.f32713a = list;
        this.b = i;
        this.c = pabVar;
        this.d = str;
        this.e = ss8Var;
        if (pabVar != null) {
            pabVar.f26648a.j.ordinal();
        }
        int i2 = 0;
        while (!list.isEmpty()) {
            i2++;
            ss8 ss8Var2 = (ss8) CollectionsKt.firstOrNull(list);
            list = ss8Var2 != null ? ss8Var2.f32713a : null;
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
        if (!(obj instanceof ss8)) {
            return false;
        }
        ss8 ss8Var = (ss8) obj;
        return Intrinsics.d(this.f32713a, ss8Var.f32713a) && this.b == ss8Var.b && Intrinsics.d(this.c, ss8Var.c) && Intrinsics.d(this.d, ss8Var.d) && Intrinsics.d(this.e, ss8Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f32713a.hashCode() * 31, 31);
        pab pabVar = this.c;
        int iB = ua80.b((iA + (pabVar == null ? 0 : pabVar.hashCode())) * 31, 31, this.d);
        ss8 ss8Var = this.e;
        return iB + (ss8Var != null ? ss8Var.hashCode() : 0);
    }

    public final String toString() {
        return "BracketModel(childModels=" + this.f32713a + ", height=" + this.b + ", dataModel=" + this.c + ", title=" + this.d + ", auxiliaryModel=" + this.e + Separators.RPAREN;
    }
}
