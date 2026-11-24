package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class i040 {
    public static final g040 Companion = new g040();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f13933a;
    public final String b;

    public /* synthetic */ i040(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f13933a = null;
        } else {
            this.f13933a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i040)) {
            return false;
        }
        i040 i040Var = (i040) obj;
        return Intrinsics.d(this.f13933a, i040Var.f13933a) && Intrinsics.d(this.b, i040Var.b);
    }

    public final int hashCode() {
        Integer num = this.f13933a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f13933a, "MenuResponse(type=", ", name=", this.b, Separators.RPAREN);
    }
}
