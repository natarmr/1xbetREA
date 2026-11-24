package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mgh0 {
    public static final lgh0 Companion = new lgh0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new igh0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21744a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ mgh0(int i, Long l, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f21744a = null;
        } else {
            this.f21744a = l;
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
        if (!(obj instanceof mgh0)) {
            return false;
        }
        mgh0 mgh0Var = (mgh0) obj;
        return Intrinsics.d(this.f21744a, mgh0Var.f21744a) && Intrinsics.d(this.b, mgh0Var.b) && Intrinsics.d(this.c, mgh0Var.c) && Intrinsics.d(this.d, mgh0Var.d);
    }

    public final int hashCode() {
        Long l = this.f21744a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", games=", Separators.RPAREN, cs0.s(this.f21744a, "ChampSearch(id=", ", image=", this.b, ", name="), this.d);
    }
}
