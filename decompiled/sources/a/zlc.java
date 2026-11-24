package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zlc {
    public static final ylc Companion = new ylc();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new zxb(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8v0 f44573a;
    public final String b;
    public final mwp c;
    public final List d;

    public /* synthetic */ zlc(int i, e8v0 e8v0Var, String str, mwp mwpVar, List list) {
        if ((i & 1) == 0) {
            this.f44573a = null;
        } else {
            this.f44573a = e8v0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = mwpVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlc)) {
            return false;
        }
        zlc zlcVar = (zlc) obj;
        return this.f44573a == zlcVar.f44573a && Intrinsics.d(this.b, zlcVar.b) && Intrinsics.d(this.c, zlcVar.c) && Intrinsics.d(this.d, zlcVar.d);
    }

    public final int hashCode() {
        e8v0 e8v0Var = this.f44573a;
        int iHashCode = (e8v0Var == null ? 0 : e8v0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        mwp mwpVar = this.c;
        int iHashCode3 = (iHashCode2 + (mwpVar == null ? 0 : mwpVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ClassRankingResponse(weightClass=" + this.f44573a + ", gender=" + this.b + ", champion=" + this.c + ", fighters=" + this.d + Separators.RPAREN;
    }
}
