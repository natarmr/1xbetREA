package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class d6l {
    public static final c6l Companion = new c6l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5554a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;

    public /* synthetic */ d6l(int i, String str, Integer num, Integer num2, Integer num3, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f5554a = null;
        } else {
            this.f5554a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6l)) {
            return false;
        }
        d6l d6lVar = (d6l) obj;
        return Intrinsics.d(this.f5554a, d6lVar.f5554a) && Intrinsics.d(this.b, d6lVar.b) && Intrinsics.d(this.c, d6lVar.c) && Intrinsics.d(this.d, d6lVar.d) && Intrinsics.d(this.e, d6lVar.e) && Intrinsics.d(this.f, d6lVar.f);
    }

    public final int hashCode() {
        String str = this.f5554a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "DotaPopularHeroResponse(name=", this.f5554a, ", winRate=", ", pickRate=");
        rz4.y(sbP, this.c, ", banRate=", this.d, ", icon=");
        return ua80.m(sbP, this.e, ", iconS3=", this.f, Separators.RPAREN);
    }
}
