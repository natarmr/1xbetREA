package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f8n implements i8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6m f9115a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public f8n(e6m e6mVar, String str, String str2, String str3, String str4) {
        this.f9115a = e6mVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // a.i8n
    public final String a() {
        return this.b;
    }

    @Override // a.i8n
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8n)) {
            return false;
        }
        f8n f8nVar = (f8n) obj;
        return Intrinsics.d(this.f9115a, f8nVar.f9115a) && Intrinsics.d(this.b, f8nVar.b) && Intrinsics.d(this.c, f8nVar.c) && Intrinsics.d(this.d, f8nVar.d) && Intrinsics.d(this.e, f8nVar.e);
    }

    @Override // a.i8n
    public final e6m f() {
        return this.f9115a;
    }

    public final int hashCode() {
        e6m e6mVar = this.f9115a;
        int iHashCode = (e6mVar == null ? 0 : e6mVar.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Line(timer=");
        sb.append(this.f9115a);
        sb.append(", categoryLabel=");
        sb.append(this.b);
        sb.append(", mainFightTag=");
        f140.v(sb, this.c, ", mainInfo=", this.d, ", additionalInfo=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
