package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ywo0 implements axo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43380a;
    public final d4d b;

    public ywo0(String str, d4d d4dVar) {
        str.getClass();
        this.f43380a = str;
        this.b = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywo0)) {
            return false;
        }
        ywo0 ywo0Var = (ywo0) obj;
        return Intrinsics.d(this.f43380a, ywo0Var.f43380a) && this.b == ywo0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43380a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(taxSumValue=" + this.f43380a + ", taxSumColor=" + this.b + Separators.RPAREN;
    }
}
