package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class crc0 implements erc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4839a;
    public final String b;

    public crc0(String str, String str2) {
        str.getClass();
        this.f4839a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crc0)) {
            return false;
        }
        crc0 crc0Var = (crc0) obj;
        return Intrinsics.d(this.f4839a, crc0Var.f4839a) && this.b.equals(crc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4839a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Default(imageUrl=", this.f4839a, ", title=", this.b, Separators.RPAREN);
    }
}
