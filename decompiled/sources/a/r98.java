package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class r98 {
    public static final q98 Companion = new q98();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new os7(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30065a;
    public final List b;
    public final String c;

    public /* synthetic */ r98(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f30065a = null;
        } else {
            this.f30065a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r98)) {
            return false;
        }
        r98 r98Var = (r98) obj;
        return Intrinsics.d(this.f30065a, r98Var.f30065a) && Intrinsics.d(this.b, r98Var.b) && Intrinsics.d(this.c, r98Var.c);
    }

    public final int hashCode() {
        String str = this.f30065a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(defpackage.c.f("BlockRuleStageResponse(content=", this.f30065a, ", items=", this.b, ", title="), this.c, Separators.RPAREN);
    }
}
