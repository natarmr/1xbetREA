package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dmw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6337a;
    public final String b;
    public final String c;
    public final String d;
    public final hmw e;
    public final List f;

    public dmw(String str, String str2, String str3, String str4, hmw hmwVar, List list) {
        str.getClass();
        list.getClass();
        this.f6337a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hmwVar;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmw)) {
            return false;
        }
        dmw dmwVar = (dmw) obj;
        return Intrinsics.d(this.f6337a, dmwVar.f6337a) && this.b.equals(dmwVar.b) && this.c.equals(dmwVar.c) && this.d.equals(dmwVar.d) && this.e == dmwVar.e && Intrinsics.d(this.f, dmwVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f6337a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HorseCardModel(horseId=", this.f6337a, ", horseName=", this.b, ", trainerName=");
        f140.v(sbN, this.c, ", damAndSire=", this.d, ", gender=");
        sbN.append(this.e);
        sbN.append(", menu=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
