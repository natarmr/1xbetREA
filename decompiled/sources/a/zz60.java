package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class zz60 {
    public static final yz60 Companion = new yz60();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f45237a;
    public final String b;

    public /* synthetic */ zz60(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f45237a = null;
        } else {
            this.f45237a = num;
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
        if (!(obj instanceof zz60)) {
            return false;
        }
        zz60 zz60Var = (zz60) obj;
        return Intrinsics.d(this.f45237a, zz60Var.f45237a) && Intrinsics.d(this.b, zz60Var.b);
    }

    public final int hashCode() {
        Integer num = this.f45237a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f45237a, "GameTranslate(recordId=", ", translate=", this.b, Separators.RPAREN);
    }
}
