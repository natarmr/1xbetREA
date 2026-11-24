package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class akw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1042a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final n0x f;
    public final m0x g;

    public akw(String str, long j, boolean z, String str2, String str3, n0x n0xVar, m0x m0xVar) {
        str3.getClass();
        this.f1042a = str;
        this.b = j;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = n0xVar;
        this.g = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akw)) {
            return false;
        }
        akw akwVar = (akw) obj;
        return this.f1042a.equals(akwVar.f1042a) && this.b == akwVar.b && this.c == akwVar.c && this.d.equals(akwVar.d) && Intrinsics.d(this.e, akwVar.e) && this.f.equals(akwVar.f) && this.g.equals(akwVar.g);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f1042a;
    }

    public final int hashCode() {
        return this.g.hashCode() + f140.f(this.f, ua80.b(ua80.b(brm0.e(rw2.b(this.f1042a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "HomeSubHeaderUiModel(key=", this.f1042a, ", sportId=");
        hne.u(", live=", ", label=", this.d, sbO, this.c);
        sbO.append(", buttonText=");
        sbO.append(this.e);
        sbO.append(", icon=");
        sbO.append(this.f);
        sbO.append(", placeHolder=");
        sbO.append(this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
