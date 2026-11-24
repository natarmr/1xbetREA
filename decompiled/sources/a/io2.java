package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class io2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15097a;
    public final go3 b;
    public final String c;
    public final ArrayList d;
    public final go3 e;

    public io2(List list, go3 go3Var, String str, ArrayList arrayList, go3 go3Var2) {
        list.getClass();
        this.f15097a = list;
        this.b = go3Var;
        this.c = str;
        this.d = arrayList;
        this.e = go3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io2)) {
            return false;
        }
        io2 io2Var = (io2) obj;
        return Intrinsics.d(this.f15097a, io2Var.f15097a) && this.b.equals(io2Var.b) && this.c.equals(io2Var.c) && this.d.equals(io2Var.d) && this.e.equals(io2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.g(this.d, ua80.b((this.b.hashCode() + (this.f15097a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        return "AlternatePath(countryIds=" + this.f15097a + ", version=" + this.b + ", updateURL=" + this.c + ", forceUpdateBuilds=" + this.d + ", minVersion=" + this.e + Separators.RPAREN;
    }
}
