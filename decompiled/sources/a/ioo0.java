package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ioo0 implements uoo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15128a;
    public final String b;

    public ioo0(String str) {
        str.getClass();
        this.f15128a = str;
        this.b = "TagAutoSub";
    }

    @Override // a.uoo0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioo0)) {
            return false;
        }
        ioo0 ioo0Var = (ioo0) obj;
        return Intrinsics.d(this.f15128a, ioo0Var.f15128a) && this.b.equals(ioo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15128a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AutoSub(autoSubText=", this.f15128a, ", tagKey=", this.b, Separators.RPAREN);
    }
}
