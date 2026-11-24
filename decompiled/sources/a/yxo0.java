package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yxo0 implements zxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43433a;
    public final d4d b;

    public yxo0(String str, d4d d4dVar) {
        str.getClass();
        this.f43433a = str;
        this.b = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxo0)) {
            return false;
        }
        yxo0 yxo0Var = (yxo0) obj;
        return Intrinsics.d(this.f43433a, yxo0Var.f43433a) && this.b == yxo0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43433a.hashCode() * 31);
    }

    public final String toString() {
        return "Text(value=" + this.f43433a + ", colorValue=" + this.b + Separators.RPAREN;
    }
}
