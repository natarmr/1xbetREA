package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aar0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f543a;
    public final List b;
    public final List c;
    public final List d;

    public aar0(String str, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f543a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aar0)) {
            return false;
        }
        aar0 aar0Var = (aar0) obj;
        return this.f543a.equals(aar0Var.f543a) && Intrinsics.d(this.b, aar0Var.b) && Intrinsics.d(this.c, aar0Var.c) && Intrinsics.d(this.d, aar0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f543a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", assists=", Separators.RPAREN, defpackage.c.f("TopPlayersInfoModel(team=", this.f543a, ", ratings=", this.b, ", goals="), this.c, this.d);
    }
}
