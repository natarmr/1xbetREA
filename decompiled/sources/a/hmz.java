package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hmz {
    public static final cmz Companion = new cmz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f13327a;
    public final String b;
    public final String c;
    public final Integer d;

    public /* synthetic */ hmz(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f13327a = null;
        } else {
            this.f13327a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmz)) {
            return false;
        }
        hmz hmzVar = (hmz) obj;
        return Intrinsics.d(this.f13327a, hmzVar.f13327a) && Intrinsics.d(this.b, hmzVar.b) && Intrinsics.d(this.c, hmzVar.c) && Intrinsics.d(this.d, hmzVar.d);
    }

    public final int hashCode() {
        Long l = this.f13327a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return vqd.l(this.d, this.c, ", cyberType=", Separators.RPAREN, cs0.s(this.f13327a, "LigaResponse(id=", ", name=", this.b, ", image="));
    }
}
