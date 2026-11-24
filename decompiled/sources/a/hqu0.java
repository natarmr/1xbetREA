package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hqu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13501a;
    public final long b;
    public final zrm c;

    public hqu0(String str, long j, zrm zrmVar) {
        str.getClass();
        this.f13501a = str;
        this.b = j;
        this.c = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqu0)) {
            return false;
        }
        hqu0 hqu0Var = (hqu0) obj;
        return Intrinsics.d(this.f13501a, hqu0Var.f13501a) && this.b == hqu0Var.b && this.c.equals(hqu0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f13501a;
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f13501a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "VirtualGameDisciplineUiModel(key=", this.f13501a, ", id=");
        sbO.append(", dsSportCellStyle=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
