package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class h640 {
    public static final g640 Companion = new g640();
    public static final a8z[] f = {null, null, null, maz.a(wez.f39042a, new gj30(21)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12512a;
    public final String b;
    public final String c;
    public final List d;
    public final Boolean e;

    public /* synthetic */ h640(int i, Boolean bool, Integer num, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f12512a = null;
        } else {
            this.f12512a = num;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h640)) {
            return false;
        }
        h640 h640Var = (h640) obj;
        return Intrinsics.d(this.f12512a, h640Var.f12512a) && Intrinsics.d(this.b, h640Var.b) && Intrinsics.d(this.c, h640Var.c) && Intrinsics.d(this.d, h640Var.d) && Intrinsics.d(this.e, h640Var.e);
    }

    public final int hashCode() {
        Integer num = this.f12512a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f12512a, "MessageReplyHeader(replyToMessageId=", ", replyToUserId=", this.b, ", message=");
        cs0.y(this.c, ", mediaList=", ", quote=", sbN, this.d);
        return defpackage.c.e(sbN, this.e, Separators.RPAREN);
    }
}
