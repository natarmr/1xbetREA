package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pos0 implements qos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27343a;
    public final String b;

    public pos0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27343a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pos0)) {
            return false;
        }
        pos0 pos0Var = (pos0) obj;
        return Intrinsics.d(this.f27343a, pos0Var.f27343a) && Intrinsics.d(this.b, pos0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27343a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SendingFile(messageKey=", this.f27343a, ", filePath=", this.b, Separators.RPAREN);
    }
}
