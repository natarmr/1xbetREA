package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39788a;
    public final String b;

    public wud0(int i, String str) {
        this.f39788a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wud0)) {
            return false;
        }
        wud0 wud0Var = (wud0) obj;
        return this.f39788a == wud0Var.f39788a && this.b.equals(wud0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f39788a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f39788a, "RainbowGameBansModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
