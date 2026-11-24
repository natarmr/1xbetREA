package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c2n implements h2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2n f3633a;
    public final i2n b;
    public final kpm c;
    public final String d;
    public final String e;
    public final boolean f;

    public c2n(i2n i2nVar, i2n i2nVar2, kpm kpmVar, String str, String str2, boolean z) {
        str.getClass();
        this.f3633a = i2nVar;
        this.b = i2nVar2;
        this.c = kpmVar;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2n)) {
            return false;
        }
        c2n c2nVar = (c2n) obj;
        return this.f3633a.equals(c2nVar.f3633a) && this.b.equals(c2nVar.b) && this.c.equals(c2nVar.c) && Intrinsics.d(this.d, c2nVar.d) && this.e.equals(c2nVar.e) && this.f == c2nVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(dw9.c(this.c, (this.b.hashCode() + (this.f3633a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(firstOpponent=");
        sb.append(this.f3633a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", gameLabel=");
        return defpackage.c.c(this.e, ", supportRtl=", Separators.RPAREN, sb, this.f);
    }
}
