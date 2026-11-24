package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class o6u0 implements q6u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24757a;
    public final long b;
    public final String c;
    public final zrm d;
    public final ArrayList e;
    public final v12 f;

    public o6u0(String str, long j, String str2, zrm zrmVar, ArrayList arrayList, v12 v12Var) {
        this.f24757a = str;
        this.b = j;
        this.c = str2;
        this.d = zrmVar;
        this.e = arrayList;
        this.f = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6u0)) {
            return false;
        }
        o6u0 o6u0Var = (o6u0) obj;
        return this.f24757a.equals(o6u0Var.f24757a) && this.b == o6u0Var.b && this.c.equals(o6u0Var.c) && this.d.equals(o6u0Var.d) && this.e.equals(o6u0Var.e) && this.f == o6u0Var.f;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f24757a;
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.g(this.e, (this.d.hashCode() + ua80.b(rw2.b(this.f24757a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "VenueCellDefaultUiModel(key=", this.f24757a, ", id=");
        sbO.append(", title=");
        sbO.append(this.c);
        sbO.append(", cellStyle=");
        sbO.append(this.d);
        sbO.append(", description=");
        sbO.append(this.e);
        sbO.append(", alignmentInSection=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
