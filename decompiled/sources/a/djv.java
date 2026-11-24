package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class djv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6204a;
    public final ejv b;
    public final ejv c;
    public final String d;
    public final yiv e;
    public final String f;

    public djv(String str, ejv ejvVar, ejv ejvVar2, String str2, yiv yivVar, String str3) {
        str2.getClass();
        str3.getClass();
        this.f6204a = str;
        this.b = ejvVar;
        this.c = ejvVar2;
        this.d = str2;
        this.e = yivVar;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djv)) {
            return false;
        }
        djv djvVar = (djv) obj;
        return this.f6204a.equals(djvVar.f6204a) && this.b.equals(djvVar.b) && this.c.equals(djvVar.c) && Intrinsics.d(this.d, djvVar.d) && this.e.equals(djvVar.e) && Intrinsics.d(this.f, djvVar.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f6204a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f6204a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "GuiltyGearRoundUiModel(key=" + this.f6204a + ", firstTeam=" + this.b + ", secondTeam=" + this.c + ", round=" + this.d + ", roundInformation=" + this.e + ", time=" + this.f + Separators.RPAREN;
    }
}
