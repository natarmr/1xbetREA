package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class cvk {
    public static final bvk Companion = new bvk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5033a;
    public final String b;

    public /* synthetic */ cvk(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f5033a = null;
        } else {
            this.f5033a = str;
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
        if (!(obj instanceof cvk)) {
            return false;
        }
        cvk cvkVar = (cvk) obj;
        return Intrinsics.d(this.f5033a, cvkVar.f5033a) && Intrinsics.d(this.b, cvkVar.b);
    }

    public final int hashCode() {
        String str = this.f5033a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("DiscordUserResponse(id=", this.f5033a, ", email=", this.b, Separators.RPAREN);
    }
}
