package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f24414a;
    public final String b;

    public o0b(n0x n0xVar, String str) {
        str.getClass();
        this.f24414a = n0xVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0b)) {
            return false;
        }
        o0b o0bVar = (o0b) obj;
        return this.f24414a.equals(o0bVar.f24414a) && Intrinsics.d(this.b, o0bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24414a.hashCode() * 31);
    }

    public final String toString() {
        return "CashbackStepUiModel(image=" + this.f24414a + ", description=" + this.b + Separators.RPAREN;
    }
}
