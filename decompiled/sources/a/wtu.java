package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wtu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39760a;
    public final String b;

    public wtu(int i, String str) {
        str.getClass();
        this.f39760a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtu)) {
            return false;
        }
        wtu wtuVar = (wtu) obj;
        return this.f39760a == wtuVar.f39760a && Intrinsics.d(this.b, wtuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f39760a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f39760a, "GetSocialModel(social=", ", login=", this.b, Separators.RPAREN);
    }
}
