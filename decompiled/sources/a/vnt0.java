package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vnt0 {
    public static final unt0 Companion = new unt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37735a;
    public final String b;

    public /* synthetic */ vnt0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f37735a = null;
        } else {
            this.f37735a = str;
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
        if (!(obj instanceof vnt0)) {
            return false;
        }
        vnt0 vnt0Var = (vnt0) obj;
        return Intrinsics.d(this.f37735a, vnt0Var.f37735a) && Intrinsics.d(this.b, vnt0Var.b);
    }

    public final int hashCode() {
        String str = this.f37735a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("UploadedMediaFileInfo(path=", this.f37735a, ", localMessageId=", this.b, Separators.RPAREN);
    }

    public vnt0(String str, String str2) {
        this.f37735a = str;
        this.b = str2;
    }
}
