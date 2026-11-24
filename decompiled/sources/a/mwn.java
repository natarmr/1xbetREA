package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mwn {
    public static final lwn Companion = new lwn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22513a;
    public final String b;

    public /* synthetic */ mwn(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f22513a = null;
        } else {
            this.f22513a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwn)) {
            return false;
        }
        mwn mwnVar = (mwn) obj;
        return Intrinsics.d(this.f22513a, mwnVar.f22513a) && Intrinsics.d(this.b, mwnVar.b);
    }

    public final int hashCode() {
        String str = this.f22513a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("EncryptedConfigResponse(dataHex=", this.f22513a, ", ivHex=", this.b, Separators.RPAREN);
    }

    public mwn(String str, String str2) {
        this.f22513a = str;
        this.b = str2;
    }
}
