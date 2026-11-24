package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zud0 {
    public static final yud0 Companion = new yud0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45006a;
    public final Integer b;

    public /* synthetic */ zud0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f45006a = null;
        } else {
            this.f45006a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zud0)) {
            return false;
        }
        zud0 zud0Var = (zud0) obj;
        return Intrinsics.d(this.f45006a, zud0Var.f45006a) && Intrinsics.d(this.b, zud0Var.b);
    }

    public final int hashCode() {
        String str = this.f45006a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "RainbowGameBansResponse(name=" + this.f45006a + ", id=" + this.b + Separators.RPAREN;
    }
}
