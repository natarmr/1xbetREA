package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ztj implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44962a;
    public final a4x b;

    public ztj(i4 i4Var, String str) {
        i4Var.getClass();
        this.f44962a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztj)) {
            return false;
        }
        ztj ztjVar = (ztj) obj;
        return this.f44962a.equals(ztjVar.f44962a) && Intrinsics.d(this.b, ztjVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f44962a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44962a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("DefaultDsCyberBannerChampionshipModel(key=", this.f44962a, ", items=", this.b, Separators.RPAREN);
    }
}
