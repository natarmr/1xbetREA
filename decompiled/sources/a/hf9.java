package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hf9 implements jf9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12961a;
    public final a4x b;

    public hf9(a4x a4xVar, String str) {
        a4xVar.getClass();
        this.f12961a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf9)) {
            return false;
        }
        hf9 hf9Var = (hf9) obj;
        return this.f12961a.equals(hf9Var.f12961a) && Intrinsics.d(this.b, hf9Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f12961a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12961a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("Content(key=", this.f12961a, ", buttons=", this.b, Separators.RPAREN);
    }
}
