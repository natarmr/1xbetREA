package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kjt0 {
    public static final jjt0 Companion = new jjt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18403a;
    public final String b;
    public final n640 c;

    static {
        l640 l640Var = n640.Companion;
    }

    public /* synthetic */ kjt0(int i, n640 n640Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.f18403a = null;
        } else {
            this.f18403a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = n640Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjt0)) {
            return false;
        }
        kjt0 kjt0Var = (kjt0) obj;
        return Intrinsics.d(this.f18403a, kjt0Var.f18403a) && Intrinsics.d(this.b, kjt0Var.b) && Intrinsics.d(this.c, kjt0Var.c);
    }

    public final int hashCode() {
        String str = this.f18403a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        n640 n640Var = this.c;
        return iHashCode2 + (n640Var != null ? n640Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UpdateEditMessageWSEvent(chatId=", this.f18403a, ", dialogId=", this.b, ", message=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
