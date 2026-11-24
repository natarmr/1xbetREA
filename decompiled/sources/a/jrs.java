package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krs f17019a;
    public final String b;

    public jrs(krs krsVar, String str) {
        krsVar.getClass();
        this.f17019a = krsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrs)) {
            return false;
        }
        jrs jrsVar = (jrs) obj;
        return Intrinsics.d(this.f17019a, jrsVar.f17019a) && this.b.equals(jrsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17019a.hashCode() * 31);
    }

    public final String toString() {
        return "GameScreenTipModel(screen=" + this.f17019a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
