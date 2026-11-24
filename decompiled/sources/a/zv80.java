package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zv80 {
    public static final yv80 Companion = new yv80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv80 f45044a;
    public final String b;
    public final String c;

    public /* synthetic */ zv80(int i, xv80 xv80Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.f45044a = null;
        } else {
            this.f45044a = xv80Var;
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
        if (!(obj instanceof zv80)) {
            return false;
        }
        zv80 zv80Var = (zv80) obj;
        return Intrinsics.d(this.f45044a, zv80Var.f45044a) && Intrinsics.d(this.b, zv80Var.b) && Intrinsics.d(this.c, zv80Var.c);
    }

    public final int hashCode() {
        xv80 xv80Var = this.f45044a;
        int iHashCode = (xv80Var == null ? 0 : xv80Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParticipantTypingWSEvent(action=");
        sb.append(this.f45044a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", fromId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
