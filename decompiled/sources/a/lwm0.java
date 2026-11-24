package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class lwm0 {
    public static final kwm0 Companion = new kwm0();
    public static final a8z[] g = {null, null, maz.a(wez.f39042a, new x9m0(20)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20772a;
    public final hso b;
    public final List c;
    public final sbr d;
    public final qzm0 e;
    public final Integer f;

    public /* synthetic */ lwm0(int i, String str, hso hsoVar, List list, sbr sbrVar, qzm0 qzm0Var, Integer num) {
        if ((i & 1) == 0) {
            this.f20772a = null;
        } else {
            this.f20772a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = hsoVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = sbrVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = qzm0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwm0)) {
            return false;
        }
        lwm0 lwm0Var = (lwm0) obj;
        return Intrinsics.d(this.f20772a, lwm0Var.f20772a) && Intrinsics.d(this.b, lwm0Var.b) && Intrinsics.d(this.c, lwm0Var.c) && Intrinsics.d(this.d, lwm0Var.d) && Intrinsics.d(this.e, lwm0Var.e) && Intrinsics.d(this.f, lwm0Var.f);
    }

    public final int hashCode() {
        String str = this.f20772a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        hso hsoVar = this.b;
        int iHashCode2 = (iHashCode + (hsoVar == null ? 0 : hsoVar.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        sbr sbrVar = this.d;
        int iHashCode4 = (iHashCode3 + (sbrVar == null ? 0 : sbrVar.hashCode())) * 31;
        qzm0 qzm0Var = this.e;
        int iHashCode5 = (iHashCode4 + (qzm0Var == null ? 0 : qzm0Var.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SubGameScoresResponse(fullScore=" + this.f20772a + ", extendedScore=" + this.b + ", periodScores=" + this.c + ", fullScoreDetail=" + this.d + ", subScore=" + this.e + ", serve=" + this.f + Separators.RPAREN;
    }
}
