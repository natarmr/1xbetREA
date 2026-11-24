package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class pha implements iqg {
    public static final oha Companion = new oha();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26986a;
    public final wha b;
    public final wha c;
    public final Boolean d;
    public final Boolean e;

    static {
        vha vhaVar = wha.Companion;
    }

    public /* synthetic */ pha(int i, String str, wha whaVar, wha whaVar2, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f26986a = null;
        } else {
            this.f26986a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = whaVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = whaVar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pha)) {
            return false;
        }
        pha phaVar = (pha) obj;
        return Intrinsics.d(this.f26986a, phaVar.f26986a) && Intrinsics.d(this.b, phaVar.b) && Intrinsics.d(this.c, phaVar.c) && Intrinsics.d(this.d, phaVar.d) && Intrinsics.d(this.e, phaVar.e);
    }

    public final int hashCode() {
        String str = this.f26986a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        wha whaVar = this.b;
        int iHashCode2 = (iHashCode + (whaVar == null ? 0 : whaVar.hashCode())) * 31;
        wha whaVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (whaVar2 == null ? 0 : whaVar2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardFootballResponse(attackCount=");
        sb.append(this.f26986a);
        sb.append(", teamOne=");
        sb.append(this.b);
        sb.append(", teamTwo=");
        sb.append(this.c);
        sb.append(", goalOne=");
        sb.append(this.d);
        sb.append(", goalTwo=");
        return defpackage.c.e(sb, this.e, Separators.RPAREN);
    }

    public pha() {
        this.f26986a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
