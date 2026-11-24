package a;

import android.gov.nist.core.Separators;
import android.javax.sip.ClientTransaction;
import android.javax.sip.Dialog;
import android.javax.sip.SipListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f42052a;
    public final ClientTransaction b;
    public final SipListener c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final Map k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final int r;
    public final int s;
    public final boolean t;
    public final boolean u;

    public y5k0(Dialog dialog, ClientTransaction clientTransaction, SipListener sipListener, boolean z, boolean z2, boolean z3, int i, String str, String str2, int i2, Map map, String str3, String str4, String str5, String str6, String str7, String str8, int i3, int i4, boolean z4, boolean z5) {
        str.getClass();
        str2.getClass();
        map.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.f42052a = dialog;
        this.b = clientTransaction;
        this.c = sipListener;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = i2;
        this.k = map;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = i3;
        this.s = i4;
        this.t = z4;
        this.u = z5;
    }

    public static y5k0 a(y5k0 y5k0Var, Dialog dialog, ClientTransaction clientTransaction, m6k0 m6k0Var, boolean z, int i, String str, String str2, int i2, Map map, String str3, String str4, String str5, String str6, String str7, String str8, int i3, int i4, boolean z2, int i5) {
        Dialog dialog2 = (i5 & 1) != 0 ? y5k0Var.f42052a : dialog;
        ClientTransaction clientTransaction2 = (i5 & 2) != 0 ? y5k0Var.b : clientTransaction;
        SipListener sipListener = (i5 & 4) != 0 ? y5k0Var.c : m6k0Var;
        boolean z3 = (i5 & 8) != 0 ? y5k0Var.d : true;
        boolean z4 = (i5 & 16) != 0 ? y5k0Var.e : z;
        boolean z5 = (i5 & 32) != 0 ? y5k0Var.f : true;
        int i6 = (i5 & 64) != 0 ? y5k0Var.g : i;
        String str9 = (i5 & 128) != 0 ? y5k0Var.h : str;
        String str10 = (i5 & 256) != 0 ? y5k0Var.i : str2;
        int i7 = (i5 & 512) != 0 ? y5k0Var.j : i2;
        Map map2 = (i5 & 1024) != 0 ? y5k0Var.k : map;
        String str11 = (i5 & 2048) != 0 ? y5k0Var.l : str3;
        String str12 = (i5 & 4096) != 0 ? y5k0Var.m : str4;
        String str13 = (i5 & 8192) != 0 ? y5k0Var.n : str5;
        String str14 = (i5 & 16384) != 0 ? y5k0Var.o : str6;
        String str15 = (32768 & i5) != 0 ? y5k0Var.p : str7;
        String str16 = (65536 & i5) != 0 ? y5k0Var.q : str8;
        int i8 = (131072 & i5) != 0 ? y5k0Var.r : i3;
        int i9 = (262144 & i5) != 0 ? y5k0Var.s : i4;
        boolean z6 = (524288 & i5) != 0 ? y5k0Var.t : true;
        boolean z7 = (i5 & 1048576) != 0 ? y5k0Var.u : z2;
        y5k0Var.getClass();
        str9.getClass();
        str10.getClass();
        map2.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        return new y5k0(dialog2, clientTransaction2, sipListener, z3, z4, z5, i6, str9, str10, i7, map2, str11, str12, str13, str14, str15, str16, i8, i9, z6, z7);
    }

    public static y5k0 b() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return new y5k0(null, null, null, false, false, false, 0, "", "", 0, lunVar, "", "", "", null, null, null, 0, -1, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5k0)) {
            return false;
        }
        y5k0 y5k0Var = (y5k0) obj;
        return Intrinsics.d(this.f42052a, y5k0Var.f42052a) && Intrinsics.d(this.b, y5k0Var.b) && Intrinsics.d(this.c, y5k0Var.c) && this.d == y5k0Var.d && this.e == y5k0Var.e && this.f == y5k0Var.f && this.g == y5k0Var.g && Intrinsics.d(this.h, y5k0Var.h) && Intrinsics.d(this.i, y5k0Var.i) && this.j == y5k0Var.j && Intrinsics.d(this.k, y5k0Var.k) && Intrinsics.d(this.l, y5k0Var.l) && Intrinsics.d(this.m, y5k0Var.m) && Intrinsics.d(this.n, y5k0Var.n) && Intrinsics.d(this.o, y5k0Var.o) && Intrinsics.d(this.p, y5k0Var.p) && Intrinsics.d(this.q, y5k0Var.q) && this.r == y5k0Var.r && this.s == y5k0Var.s && this.t == y5k0Var.t && this.u == y5k0Var.u;
    }

    public final int hashCode() {
        Dialog dialog = this.f42052a;
        int iHashCode = (dialog == null ? 0 : dialog.hashCode()) * 31;
        ClientTransaction clientTransaction = this.b;
        int iHashCode2 = (iHashCode + (clientTransaction == null ? 0 : clientTransaction.hashCode())) * 31;
        SipListener sipListener = this.c;
        int iB = ua80.b(ua80.b(ua80.b(ohs0.f(this.k, twn.a(this.j, ua80.b(ua80.b(twn.a(this.g, brm0.e(brm0.e(brm0.e((iHashCode2 + (sipListener == null ? 0 : sipListener.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31), 31), 31, this.l), 31, this.m), 31, this.n);
        String str = this.o;
        int iHashCode3 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.q;
        return Boolean.hashCode(this.u) + brm0.e(twn.a(this.s, twn.a(this.r, (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SipCallState(dialog=");
        sb.append(this.f42052a);
        sb.append(", inviteClientTransaction=");
        sb.append(this.b);
        sb.append(", currentListener=");
        sb.append(this.c);
        sb.append(", inCall=");
        sb.append(this.d);
        sb.append(", authRetryInProgress=");
        ua80.u(", callEstablished=", ", retransmissionCount=", sb, this.e, this.f);
        kng0.w(this.g, ", currentCalleeAddress=", this.h, ", currentLocalIp=", sb);
        twn.w(this.j, this.i, ", currentRtpPort=", ", currentExtraHeaders=", sb);
        sb.append(this.k);
        sb.append(", currentCallId=");
        sb.append(this.l);
        sb.append(", currentFromTag=");
        f140.v(sb, this.m, ", username=", this.n, ", domain=");
        f140.v(sb, this.o, ", displayName=", this.p, ", remoteIp=");
        twn.w(this.r, this.q, ", remoteRtpPort=", ", selectedPayloadType=", sb);
        brm0.w(this.s, ", callEndedReported=", ", reInviteInFlight=", sb, this.t);
        return rw2.p(sb, this.u, Separators.RPAREN);
    }
}
