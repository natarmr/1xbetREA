package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y6p0 {
    public static final y6p0 e = new y6p0(iun.f15405a, "", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42110a;
    public final String b;
    public final String c;
    public final List d;

    public y6p0(List list, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.f42110a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6p0)) {
            return false;
        }
        y6p0 y6p0Var = (y6p0) obj;
        return Intrinsics.d(this.f42110a, y6p0Var.f42110a) && Intrinsics.d(this.b, y6p0Var.b) && Intrinsics.d(this.c, y6p0Var.c) && Intrinsics.d(this.d, y6p0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f42110a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return rw2.m(this.c, ", subTeams=", Separators.RPAREN, b1j.n("TeamDataModel(id=", this.f42110a, ", title=", this.b, ", imageUrl="), this.d);
    }
}
