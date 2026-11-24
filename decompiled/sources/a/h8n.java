package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h8n implements i8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12635a;
    public final String b;
    public final String c;
    public final String d;

    public h8n(String str, String str2, String str3, String str4) {
        this.f12635a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // a.i8n
    public final String a() {
        return this.f12635a;
    }

    @Override // a.i8n
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8n)) {
            return false;
        }
        h8n h8nVar = (h8n) obj;
        return Intrinsics.d(this.f12635a, h8nVar.f12635a) && Intrinsics.d(this.b, h8nVar.b) && Intrinsics.d(this.c, h8nVar.c) && Intrinsics.d(this.d, h8nVar.d);
    }

    @Override // a.i8n
    public final e6m f() {
        return null;
    }

    public final int hashCode() {
        String str = this.f12635a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("Result(timer=null, categoryLabel=", this.f12635a, ", mainFightTag=", this.b, ", resultLabel="), this.c, ", roundAndTimeLabel=", this.d, Separators.RPAREN);
    }
}
