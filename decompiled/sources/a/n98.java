package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n98 {
    public static final m98 Companion = new m98();
    public static final a8z[] d = {maz.a(wez.f39042a, new os7(23)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23127a;
    public final String b;
    public final String c;

    public /* synthetic */ n98(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f23127a = null;
        } else {
            this.f23127a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof n98)) {
            return false;
        }
        n98 n98Var = (n98) obj;
        return Intrinsics.d(this.f23127a, n98Var.f23127a) && Intrinsics.d(this.b, n98Var.b) && Intrinsics.d(this.c, n98Var.c);
    }

    public final int hashCode() {
        List list = this.f23127a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(ua80.o("BlockRuleResponse(items=", ", mediaValue=", this.b, this.f23127a, ", title="), this.c, Separators.RPAREN);
    }
}
