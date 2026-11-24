package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gxb {
    public static final gxb k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12071a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final v9k0 f;
    public final boolean g;
    public final List h;
    public final List i;
    public final vxy j;

    static {
        iun iunVar = iun.f15405a;
        k = new gxb("", false, 0, 0, 0, null, false, iunVar, iunVar, vxy.c);
    }

    public gxb(String str, boolean z, int i, int i2, int i3, v9k0 v9k0Var, boolean z2, List list, List list2, vxy vxyVar) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f12071a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = v9k0Var;
        this.g = z2;
        this.h = list;
        this.i = list2;
        this.j = vxyVar;
    }

    public static gxb a(gxb gxbVar, boolean z, int i, int i2, v9k0 v9k0Var, boolean z2, List list, vxy vxyVar, int i3) {
        String str = gxbVar.f12071a;
        if ((i3 & 2) != 0) {
            z = gxbVar.b;
        }
        boolean z3 = z;
        int i4 = gxbVar.c;
        if ((i3 & 8) != 0) {
            i = gxbVar.d;
        }
        int i5 = i;
        if ((i3 & 16) != 0) {
            i2 = gxbVar.e;
        }
        int i6 = i2;
        v9k0 v9k0Var2 = (i3 & 32) != 0 ? gxbVar.f : v9k0Var;
        boolean z4 = (i3 & 64) != 0 ? gxbVar.g : z2;
        List list2 = gxbVar.h;
        List list3 = (i3 & 256) != 0 ? gxbVar.i : list;
        vxy vxyVar2 = (i3 & 512) != 0 ? gxbVar.j : vxyVar;
        gxbVar.getClass();
        str.getClass();
        list2.getClass();
        list3.getClass();
        vxyVar2.getClass();
        return new gxb(str, z3, i4, i5, i6, v9k0Var2, z4, list2, list3, vxyVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxb)) {
            return false;
        }
        gxb gxbVar = (gxb) obj;
        return Intrinsics.d(this.f12071a, gxbVar.f12071a) && this.b == gxbVar.b && this.c == gxbVar.c && this.d == gxbVar.d && this.e == gxbVar.e && Intrinsics.d(this.f, gxbVar.f) && this.g == gxbVar.g && Intrinsics.d(this.h, gxbVar.h) && Intrinsics.d(this.i, gxbVar.i) && this.j.equals(gxbVar.j);
    }

    public final int hashCode() {
        int iA = twn.a(this.e, twn.a(this.d, twn.a(this.c, brm0.e(this.f12071a.hashCode() * 31, 31, this.b), 31), 31), 31);
        v9k0 v9k0Var = this.f;
        return this.j.hashCode() + dw9.a(dw9.a(brm0.e((iA + (v9k0Var == null ? 0 : v9k0Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("ChatModel(id=", this.f12071a, ", operatorInvokeAllowed=", this.b, ", unreadMessageCount=");
        axq.r(this.c, this.d, ", lastReadInboxMessageId=", ", lastReadOutboxMessageId=", sbU);
        sbU.append(this.e);
        sbU.append(", slowModeDelay=");
        sbU.append(this.f);
        sbU.append(", writeBlocked=");
        vqd.y(sbU, ", participantIds=", this.h, ", userModelList=", this.g);
        sbU.append(this.i);
        sbU.append(", lastChatMessageInfo=");
        sbU.append(this.j);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
