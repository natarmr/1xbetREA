package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wmw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39421a;
    public final hmw b;
    public final String c;
    public final String d;

    public wmw(String str, hmw hmwVar, String str2, String str3) {
        this.f39421a = str;
        this.b = hmwVar;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmw)) {
            return false;
        }
        wmw wmwVar = (wmw) obj;
        return this.f39421a.equals(wmwVar.f39421a) && this.b == wmwVar.b && this.c.equals(wmwVar.c) && this.d.equals(wmwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f39421a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorseMenuHeaderStateModel(horseName=");
        sb.append(this.f39421a);
        sb.append(", gender=");
        sb.append(this.b);
        sb.append(", trainerName=");
        return ua80.m(sb, this.c, ", damAndSire=", this.d, Separators.RPAREN);
    }
}
