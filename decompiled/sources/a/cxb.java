package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cxb {
    public static final bxb Companion = new bxb();
    public static final a8z[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5115a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Long f;
    public final Boolean g;
    public final List h;
    public final n640 i;

    static {
        l640 l640Var = n640.Companion;
        j = new a8z[]{null, null, null, null, null, null, null, maz.a(wez.f39042a, new e0b((byte) 29)), null};
    }

    public /* synthetic */ cxb(int i, String str, Boolean bool, Integer num, Integer num2, Integer num3, Long l, Boolean bool2, List list, n640 n640Var) {
        if ((i & 1) == 0) {
            this.f5115a = null;
        } else {
            this.f5115a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = n640Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxb)) {
            return false;
        }
        cxb cxbVar = (cxb) obj;
        return Intrinsics.d(this.f5115a, cxbVar.f5115a) && Intrinsics.d(this.b, cxbVar.b) && Intrinsics.d(this.c, cxbVar.c) && Intrinsics.d(this.d, cxbVar.d) && Intrinsics.d(this.e, cxbVar.e) && Intrinsics.d(this.f, cxbVar.f) && Intrinsics.d(this.g, cxbVar.g) && Intrinsics.d(this.h, cxbVar.h) && Intrinsics.d(this.i, cxbVar.i);
    }

    public final int hashCode() {
        String str = this.f5115a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        n640 n640Var = this.i;
        return iHashCode8 + (n640Var != null ? n640Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(id=");
        sb.append(this.f5115a);
        sb.append(", operatorInvokeAllowed=");
        sb.append(this.b);
        sb.append(", unreadMessageCount=");
        rz4.y(sb, this.c, ", lastReadInboxMessageId=", this.d, ", lastReadOutboxMessageId=");
        cs0.w(this.e, this.f, ", slowModeDelaySec=", ", writeBlocked=", sb);
        sb.append(this.g);
        sb.append(", participantIds=");
        sb.append(this.h);
        sb.append(", lastMessage=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
