package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ww00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39864a;
    public final wul b;

    public ww00(String str, wul wulVar) {
        str.getClass();
        this.f39864a = str;
        this.b = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww00)) {
            return false;
        }
        ww00 ww00Var = (ww00) obj;
        return Intrinsics.d(this.f39864a, ww00Var.f39864a) && this.b.equals(ww00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39864a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginUiModel(description=" + this.f39864a + ", buttonUiModel=" + this.b + Separators.RPAREN;
    }
}
