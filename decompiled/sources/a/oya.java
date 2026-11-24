package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oya implements qya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bya f26052a;
    public final String b;
    public final String c;
    public final String d;
    public final mdm e;

    public oya(bya byaVar, String str, String str2, String str3, mdm mdmVar) {
        byaVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f26052a = byaVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = mdmVar;
    }

    @Override // a.qya
    public final bya a() {
        return this.f26052a;
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
        if (!(obj instanceof oya)) {
            return false;
        }
        oya oyaVar = (oya) obj;
        return Intrinsics.d(this.f26052a, oyaVar.f26052a) && Intrinsics.d(this.b, oyaVar.b) && Intrinsics.d(this.c, oyaVar.c) && Intrinsics.d(this.d, oyaVar.d) && this.e.equals(oyaVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f26052a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + ua80.b(ua80.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(navigationBarUiState=");
        sb.append(this.f26052a);
        sb.append(", searchQuery=");
        sb.append(this.b);
        sb.append(", clearButtonLabel=");
        f140.v(sb, this.c, ", saveButtonLabel=", this.d, ", config=");
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
