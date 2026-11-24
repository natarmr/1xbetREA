package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39273a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public wjo0(String str, String str2, List list, String str3, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f39273a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjo0)) {
            return false;
        }
        wjo0 wjo0Var = (wjo0) obj;
        if (Intrinsics.d(this.f39273a, wjo0Var.f39273a) && Intrinsics.d(this.b, wjo0Var.b) && Intrinsics.d(this.c, wjo0Var.c) && Intrinsics.d(this.d, wjo0Var.d)) {
            return Intrinsics.d(this.e, wjo0Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(ua80.b(ua80.b(this.f39273a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f39273a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        ntm0.b(CollectionsKt.b0(CollectionsKt.z0(this.d), Separators.COMMA, null, null, null, 62));
        ntm0.b("},");
        Unit unit = Unit.f46060a;
        sb.append(unit);
        sb.append("\n            |   referenceColumnNames = {");
        ntm0.b(CollectionsKt.b0(CollectionsKt.z0(this.e), Separators.COMMA, null, null, null, 62));
        ntm0.b(" }");
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return ntm0.b(ntm0.d(sb.toString()));
    }
}
