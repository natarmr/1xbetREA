package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pya implements qya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bya f27793a;
    public final String b;
    public final String c;
    public final String d;

    public pya(bya byaVar, String str, String str2, String str3) {
        byaVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f27793a = byaVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // a.qya
    public final bya a() {
        return this.f27793a;
    }

    @Override // a.qya
    public final String b() {
        return this.c;
    }

    @Override // a.qya
    public final boolean c() {
        return false;
    }

    @Override // a.qya
    public final String d() {
        return this.d;
    }

    @Override // a.qya
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pya)) {
            return false;
        }
        pya pyaVar = (pya) obj;
        return Intrinsics.d(this.f27793a, pyaVar.f27793a) && Intrinsics.d(this.b, pyaVar.b) && Intrinsics.d(this.c, pyaVar.c) && Intrinsics.d(this.d, pyaVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f27793a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ua80.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(navigationBarUiState=");
        sb.append(this.f27793a);
        sb.append(", searchQuery=");
        sb.append(this.b);
        sb.append(", clearButtonLabel=");
        return ua80.m(sb, this.c, ", saveButtonLabel=", this.d, Separators.RPAREN);
    }
}
