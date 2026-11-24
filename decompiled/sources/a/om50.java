package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class om50 {
    public static final nm50 Companion = new nm50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n640 f25488a;
    public final String b;
    public final String c;

    static {
        l640 l640Var = n640.Companion;
    }

    public /* synthetic */ om50(int i, n640 n640Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.f25488a = null;
        } else {
            this.f25488a = n640Var;
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
        if (!(obj instanceof om50)) {
            return false;
        }
        om50 om50Var = (om50) obj;
        return Intrinsics.d(this.f25488a, om50Var.f25488a) && Intrinsics.d(this.b, om50Var.b) && Intrinsics.d(this.c, om50Var.c);
    }

    public final int hashCode() {
        n640 n640Var = this.f25488a;
        int iHashCode = (n640Var == null ? 0 : n640Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewMessageWSEvent(message=");
        sb.append(this.f25488a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", dialogId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
