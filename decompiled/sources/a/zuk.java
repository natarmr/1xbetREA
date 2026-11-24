package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class zuk {
    public static final yuk Companion = new yuk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45014a;
    public final String b;

    public /* synthetic */ zuk(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f45014a = null;
        } else {
            this.f45014a = str;
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
        if (!(obj instanceof zuk)) {
            return false;
        }
        zuk zukVar = (zuk) obj;
        return Intrinsics.d(this.f45014a, zukVar.f45014a) && Intrinsics.d(this.b, zukVar.b);
    }

    public final int hashCode() {
        String str = this.f45014a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("DiscordTokenResponse(token=", this.f45014a, ", openIdToken=", this.b, Separators.RPAREN);
    }
}
