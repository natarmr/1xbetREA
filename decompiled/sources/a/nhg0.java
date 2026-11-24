package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nhg0 extends v8b {
    public final String d;
    public final List e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhg0(String str, List list, int i) {
        super(6, Integer.valueOf(i), Integer.valueOf(i), list);
        list.getClass();
        this.d = str;
        this.e = list;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhg0)) {
            return false;
        }
        nhg0 nhg0Var = (nhg0) obj;
        return this.d.equals(nhg0Var.d) && Intrinsics.d(this.e, nhg0Var.e) && this.f == nhg0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + dw9.a(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return rz4.j(this.f, Separators.RPAREN, defpackage.c.f("RowHeaderIconUiModel(iconUrl=", this.d, ", contentList=", this.e, ", width="));
    }
}
