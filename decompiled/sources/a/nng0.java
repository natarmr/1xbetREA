package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nng0 {
    public static final mng0 Companion = new mng0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23819a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final String e;

    public /* synthetic */ nng0(int i, String str, Long l, Long l2, Long l3, String str2) {
        if ((i & 1) == 0) {
            this.f23819a = null;
        } else {
            this.f23819a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nng0)) {
            return false;
        }
        nng0 nng0Var = (nng0) obj;
        return Intrinsics.d(this.f23819a, nng0Var.f23819a) && Intrinsics.d(this.b, nng0Var.b) && Intrinsics.d(this.c, nng0Var.c) && Intrinsics.d(this.d, nng0Var.d) && Intrinsics.d(this.e, nng0Var.e);
    }

    public final int hashCode() {
        String str = this.f23819a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "RulesStageItemResponse(content=", this.f23819a, ", crmStageId=", ", stageEndAt=");
        cs0.A(sbS, this.c, ", stageStartAt=", this.d, ", subContent=");
        return axq.n(sbS, this.e, Separators.RPAREN);
    }
}
