package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ce5 implements he5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4195a;
    public final String b;
    public final rwn c;

    public ce5(String str, String str2, rwn rwnVar) {
        str.getClass();
        str2.getClass();
        rwnVar.getClass();
        this.f4195a = str;
        this.b = str2;
        this.c = rwnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce5)) {
            return false;
        }
        ce5 ce5Var = (ce5) obj;
        return Intrinsics.d(this.f4195a, ce5Var.f4195a) && Intrinsics.d(this.b, ce5Var.b) && Intrinsics.d(this.c, ce5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f4195a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CorruptedPreviewFileException(previewUrn=", this.f4195a, ", prefix=", this.b, ", encryptedPreviewUrn=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
