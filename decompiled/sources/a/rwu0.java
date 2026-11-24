package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rwu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31233a;

    public rwu0(boolean z) {
        this.f31233a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwu0) && this.f31233a == ((rwu0) obj).f31233a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31233a);
    }

    public final String toString() {
        return defpackage.c.d("OpenWalletMoneyDialog(payIn=", Separators.RPAREN, this.f31233a);
    }
}
