package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class nyo {
    public static final myo Companion = new myo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f24337a;
    public final String b;
    public final Long c;
    public final String d;

    public /* synthetic */ nyo(int i, Boolean bool, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f24337a = null;
        } else {
            this.f24337a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyo)) {
            return false;
        }
        nyo nyoVar = (nyo) obj;
        return Intrinsics.d(this.f24337a, nyoVar.f24337a) && Intrinsics.d(this.b, nyoVar.b) && Intrinsics.d(this.c, nyoVar.c) && Intrinsics.d(this.d, nyoVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.f24337a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FastChangePasswordResponse(success=" + this.f24337a + ", message=" + this.b + ", messageId=" + this.c + ", captchaToken=" + this.d + Separators.RPAREN;
    }
}
