package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fuf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10159a;
    public final juf b;
    public final juf c;
    public final String d;
    public final String e;
    public final buf f;

    public fuf(String str, juf jufVar, juf jufVar2, String str2, String str3, buf bufVar) {
        str2.getClass();
        str3.getClass();
        this.f10159a = str;
        this.b = jufVar;
        this.c = jufVar2;
        this.d = str2;
        this.e = str3;
        this.f = bufVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuf)) {
            return false;
        }
        fuf fufVar = (fuf) obj;
        return this.f10159a.equals(fufVar.f10159a) && this.b.equals(fufVar.b) && this.c.equals(fufVar.c) && Intrinsics.d(this.d, fufVar.d) && Intrinsics.d(this.e, fufVar.e) && this.f.equals(fufVar.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f10159a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f10159a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "CupheadRoundUiModel(key=" + this.f10159a + ", firstTeam=" + this.b + ", secondTeam=" + this.c + ", round=" + this.d + ", time=" + this.e + ", roundInformation=" + this.f + Separators.RPAREN;
    }
}
