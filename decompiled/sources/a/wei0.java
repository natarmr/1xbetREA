package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wei0 implements dfi0 {
    public static final vei0 Companion = new vei0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39021a;
    public final String b;

    public /* synthetic */ wei0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f39021a = null;
        } else {
            this.f39021a = str;
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
        if (!(obj instanceof wei0)) {
            return false;
        }
        wei0 wei0Var = (wei0) obj;
        return Intrinsics.d(this.f39021a, wei0Var.f39021a) && Intrinsics.d(this.b, wei0Var.b);
    }

    public final int hashCode() {
        String str = this.f39021a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Command(type=", this.f39021a, ", variantId=", this.b, Separators.RPAREN);
    }

    public wei0(String str) {
        this.f39021a = "SelectVariantCommand";
        this.b = str;
    }
}
