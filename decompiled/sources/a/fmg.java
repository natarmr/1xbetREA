package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fmg {
    public static final emg Companion = new emg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f9779a;
    public final String b;

    public /* synthetic */ fmg(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f9779a = null;
        } else {
            this.f9779a = l;
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
        if (!(obj instanceof fmg)) {
            return false;
        }
        fmg fmgVar = (fmg) obj;
        return Intrinsics.d(this.f9779a, fmgVar.f9779a) && Intrinsics.d(this.b, fmgVar.b);
    }

    public final int hashCode() {
        Long l = this.f9779a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f9779a, "CyberDisciplineResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
