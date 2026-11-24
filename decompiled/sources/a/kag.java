package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kag {
    public static final jag Companion = new jag();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17961a;
    public final String b;

    public /* synthetic */ kag(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f17961a = null;
        } else {
            this.f17961a = str;
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
        if (!(obj instanceof kag)) {
            return false;
        }
        kag kagVar = (kag) obj;
        return Intrinsics.d(this.f17961a, kagVar.f17961a) && Intrinsics.d(this.b, kagVar.b);
    }

    public final int hashCode() {
        String str = this.f17961a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("CyberCalendarTeamResponse(name=", this.f17961a, ", imageS3=", this.b, Separators.RPAREN);
    }
}
