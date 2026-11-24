package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nzi0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24375a;
    public final String b;
    public final boolean c;

    public nzi0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f24375a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzi0)) {
            return false;
        }
        nzi0 nzi0Var = (nzi0) obj;
        return Intrinsics.d(this.f24375a, nzi0Var.f24375a) && Intrinsics.d(this.b, nzi0Var.b) && this.c == nzi0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f24375a.hashCode() * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return rw2.p(b1j.n("SettingsAppVersionComposeUiModel(title=", this.f24375a, ", subTitle=", this.b, ", needUpdate="), this.c, Separators.RPAREN);
    }
}
