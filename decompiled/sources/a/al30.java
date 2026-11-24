package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class al30 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1050a;
    public final String b;
    public final String c;
    public final String d;
    public final bl30 e;
    public final bl30 f;
    public final bl30 g;
    public final bl30 h;
    public final v12 i;
    public final String j;

    public al30(int i, String str, String str2, String str3, bl30 bl30Var, bl30 bl30Var2, bl30 bl30Var3, bl30 bl30Var4, v12 v12Var) {
        this.f1050a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bl30Var;
        this.f = bl30Var2;
        this.g = bl30Var3;
        this.h = bl30Var4;
        this.i = v12Var;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al30)) {
            return false;
        }
        al30 al30Var = (al30) obj;
        return this.f1050a == al30Var.f1050a && this.b.equals(al30Var.b) && this.c.equals(al30Var.c) && this.d.equals(al30Var.d) && this.e.equals(al30Var.e) && this.f.equals(al30Var.f) && this.g.equals(al30Var.g) && this.h.equals(al30Var.h) && this.i == al30Var.i;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.j;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f1050a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f1050a, "MedalTableCellDefaultUiModel(rank=", ", teamId=", this.b, ", image=");
        f140.v(sbR, this.c, ", title=", this.d, ", goldMedals=");
        sbR.append(this.e);
        sbR.append(", silverMedals=");
        sbR.append(this.f);
        sbR.append(", bronzeMedals=");
        sbR.append(this.g);
        sbR.append(", totalMedals=");
        sbR.append(this.h);
        sbR.append(", alignmentInSection=");
        sbR.append(this.i);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
