package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zwo0 implements bxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45116a;
    public final d4d b;

    public zwo0(String str, d4d d4dVar) {
        str.getClass();
        this.f45116a = str;
        this.b = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwo0)) {
            return false;
        }
        zwo0 zwo0Var = (zwo0) obj;
        return Intrinsics.d(this.f45116a, zwo0Var.f45116a) && this.b == zwo0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f45116a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(taxSumValue=" + this.f45116a + ", taxSumColor=" + this.b + Separators.RPAREN;
    }
}
