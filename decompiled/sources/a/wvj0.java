package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvj0 f39840a;
    public final String b;
    public final boolean c;

    public wvj0(rvj0 rvj0Var, String str, boolean z) {
        str.getClass();
        this.f39840a = rvj0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvj0)) {
            return false;
        }
        wvj0 wvj0Var = (wvj0) obj;
        return this.f39840a.equals(wvj0Var.f39840a) && Intrinsics.d(this.b, wvj0Var.b) && this.c == wvj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f39840a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBetTabKeyModel(simpleBetState=");
        sb.append(this.f39840a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
