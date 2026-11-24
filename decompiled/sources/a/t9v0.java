package a;

import android.gov.nist.core.Separators;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t9v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eav0 f33588a;
    public final SnapshotStateList b;
    public int c;
    public final okt0 d;
    public boolean e = false;
    public int f;
    public final boolean g;
    public final Integer h;

    public t9v0(eav0 eav0Var, SnapshotStateList snapshotStateList, int i, okt0 okt0Var, int i2, boolean z, Integer num) {
        this.f33588a = eav0Var;
        this.b = snapshotStateList;
        this.c = i;
        this.d = okt0Var;
        this.f = i2;
        this.g = z;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t9v0) {
            t9v0 t9v0Var = (t9v0) obj;
            if (this.f33588a == t9v0Var.f33588a && this.b == t9v0Var.b && this.c == t9v0Var.c && this.d == t9v0Var.d && this.e == t9v0Var.e && this.f == t9v0Var.f && this.g == t9v0Var.g && Intrinsics.d(this.h, t9v0Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = brm0.e(twn.a(this.f, brm0.e((this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (this.f33588a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e), 31), 31, this.g);
        Integer num = this.h;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.c;
        boolean z = this.e;
        int i2 = this.f;
        StringBuilder sb = new StringBuilder("WheelContext(role=");
        sb.append(this.f33588a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", settledAbsoluteIndex=");
        sb.append(i);
        sb.append(", controller=");
        sb.append(this.d);
        sb.append(", scrolling=");
        ua80.q(i2, ", settledBaseIndex=", ", isInfinityMode=", sb, z);
        sb.append(this.g);
        sb.append(", customOrdinal=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
