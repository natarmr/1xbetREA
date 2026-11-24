package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class um90 {
    public static final tm90 Companion = new tm90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35909a;
    public final String b;

    public /* synthetic */ um90(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f35909a = null;
        } else {
            this.f35909a = str;
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
        if (!(obj instanceof um90)) {
            return false;
        }
        um90 um90Var = (um90) obj;
        return Intrinsics.d(this.f35909a, um90Var.f35909a) && Intrinsics.d(this.b, um90Var.b);
    }

    public final int hashCode() {
        String str = this.f35909a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("PhotosResponse(photoId=", this.f35909a, ", photoTitle=", this.b, Separators.RPAREN);
    }
}
