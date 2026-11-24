package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yy90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43456a;
    public final int b;
    public final int c;
    public final gz90 d;

    public yy90(List list, int i, int i2, gz90 gz90Var) {
        list.getClass();
        this.f43456a = list;
        this.b = i;
        this.c = i2;
        this.d = gz90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy90)) {
            return false;
        }
        yy90 yy90Var = (yy90) obj;
        return Intrinsics.d(this.f43456a, yy90Var.f43456a) && this.b == yy90Var.b && this.c == yy90Var.c && this.d.equals(yy90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f43456a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PlayerBiographyCommonModel(players=" + this.f43456a + ", sportId=" + this.b + ", subSportId=" + this.c + ", playerBiographyInfoModel=" + this.d + Separators.RPAREN;
    }
}
