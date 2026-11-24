package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vkg {
    public static final ukg Companion = new ukg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f37570a;
    public final Float b;
    public final Float c;
    public final Float d;

    public /* synthetic */ vkg(int i, Float f, Float f2, Float f3, Float f4) {
        if ((i & 1) == 0) {
            this.f37570a = null;
        } else {
            this.f37570a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkg)) {
            return false;
        }
        vkg vkgVar = (vkg) obj;
        return Intrinsics.d(this.f37570a, vkgVar.f37570a) && Intrinsics.d(this.b, vkgVar.b) && Intrinsics.d(this.c, vkgVar.c) && Intrinsics.d(this.d, vkgVar.d);
    }

    public final int hashCode() {
        Float f = this.f37570a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.b;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.c;
        int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.d;
        return iHashCode3 + (f4 != null ? f4.hashCode() : 0);
    }

    public final String toString() {
        return "CyberCs2CompositionPlayerStatLineupResponse(rating=" + this.f37570a + ", adr=" + this.b + ", kpr=" + this.c + ", dpr=" + this.d + Separators.RPAREN;
    }
}
