package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ehb {
    public static final dhb Companion = new dhb();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new e0b(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7799a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ ehb(int i, Integer num, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f7799a = null;
        } else {
            this.f7799a = num;
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
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehb)) {
            return false;
        }
        ehb ehbVar = (ehb) obj;
        return Intrinsics.d(this.f7799a, ehbVar.f7799a) && Intrinsics.d(this.b, ehbVar.b) && Intrinsics.d(this.c, ehbVar.c) && Intrinsics.d(this.d, ehbVar.d);
    }

    public final int hashCode() {
        Integer num = this.f7799a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", gameList=", Separators.RPAREN, h97.n(this.f7799a, "ChampWithGamesResponse(id=", ", name=", this.b, ", countryImage="), this.d);
    }
}
