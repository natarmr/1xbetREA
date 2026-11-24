package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nya implements qya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bya f24321a;
    public final String b;
    public final String c;
    public final String d;
    public final ftr e;
    public final boolean f;
    public final mdm g;
    public final boolean h;

    public nya(bya byaVar, String str, String str2, String str3, ftr ftrVar, boolean z, mdm mdmVar, boolean z2) {
        byaVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f24321a = byaVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = ftrVar;
        this.f = z;
        this.g = mdmVar;
        this.h = z2;
    }

    @Override // a.qya
    public final bya a() {
        return this.f24321a;
    }

    @Override // a.qya
    public final String b() {
        return this.c;
    }

    @Override // a.qya
    public final boolean c() {
        return this.h;
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
        if (!(obj instanceof nya)) {
            return false;
        }
        nya nyaVar = (nya) obj;
        return Intrinsics.d(this.f24321a, nyaVar.f24321a) && Intrinsics.d(this.b, nyaVar.b) && Intrinsics.d(this.c, nyaVar.c) && Intrinsics.d(this.d, nyaVar.d) && this.e.equals(nyaVar.e) && this.f == nyaVar.f && Intrinsics.d(this.g, nyaVar.g) && this.h == nyaVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.f24321a.hashCode() * 31;
        String str = this.b;
        int iE = brm0.e(cs0.b(this.e.f10128a, ua80.b(ua80.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31), 31, this.f);
        mdm mdmVar = this.g;
        return Boolean.hashCode(this.h) + ((iE + (mdmVar != null ? mdmVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(navigationBarUiState=");
        sb.append(this.f24321a);
        sb.append(", searchQuery=");
        sb.append(this.b);
        sb.append(", clearButtonLabel=");
        f140.v(sb, this.c, ", saveButtonLabel=", this.d, ", collection=");
        sb.append(this.e);
        sb.append(", isNothingFound=");
        sb.append(this.f);
        sb.append(", emptyConfig=");
        sb.append(this.g);
        sb.append(", saveEnabled=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
