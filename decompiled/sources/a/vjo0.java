package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37539a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public vjo0(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        brm0.B(str, str2, str3);
        this.f37539a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjo0)) {
            return false;
        }
        vjo0 vjo0Var = (vjo0) obj;
        if (Intrinsics.d(this.f37539a, vjo0Var.f37539a) && Intrinsics.d(this.b, vjo0Var.b) && Intrinsics.d(this.c, vjo0Var.c) && this.d.equals(vjo0Var.d)) {
            return this.e.equals(vjo0Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.g(this.d, ua80.b(ua80.b(this.f37539a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        String strT = u4n0.t(CollectionsKt.z0(this.d));
        String strS = u4n0.s(CollectionsKt.z0(this.e));
        StringBuilder sbN = b1j.n("\n                |ForeignKey {\n                |   referenceTable = '", this.f37539a, "',\n                |   onDelete = '", this.b, "',\n                |   onUpdate = '");
        f140.v(sbN, this.c, "',\n                |   columnNames = {", strT, "\n                |   referenceColumnNames = {");
        sbN.append(strS);
        sbN.append("\n                |}\n            ");
        return ntm0.b(ntm0.d(sbN.toString()));
    }
}
