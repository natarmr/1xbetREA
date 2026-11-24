package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class smb {
    public static final rmb Companion = new rmb();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new e0b(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32436a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Integer f;
    public final List g;

    public /* synthetic */ smb(int i, Long l, String str, String str2, Long l2, Long l3, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f32436a = null;
        } else {
            this.f32436a = l;
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
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smb)) {
            return false;
        }
        smb smbVar = (smb) obj;
        return Intrinsics.d(this.f32436a, smbVar.f32436a) && Intrinsics.d(this.b, smbVar.b) && Intrinsics.d(this.c, smbVar.c) && Intrinsics.d(this.d, smbVar.d) && Intrinsics.d(this.e, smbVar.e) && Intrinsics.d(this.f, smbVar.f) && Intrinsics.d(this.g, smbVar.g);
    }

    public final int hashCode() {
        Long l = this.f32436a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f32436a, "Champ(id=", ", name=", this.b, ", image=");
        h97.w(this.d, this.c, ", sportId=", ", subSportId=", sbS);
        brm0.A(this.f, this.e, ", countEvent=", ", subChamps=", sbS);
        return dw9.r(sbS, this.g, Separators.RPAREN);
    }
}
