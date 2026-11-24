package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class auc0 implements cuc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1472a;
    public final String b;
    public final tda c;
    public final Integer d;
    public final o0x e;

    public auc0(long j, String str, tda tdaVar, Integer num, o0x o0xVar) {
        this.f1472a = j;
        this.b = str;
        this.c = tdaVar;
        this.d = num;
        this.e = o0xVar;
    }

    @Override // a.cuc0
    public final String a() {
        return this.b;
    }

    @Override // a.cuc0
    public final Integer b() {
        return this.d;
    }

    @Override // a.cuc0
    public final tda c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auc0)) {
            return false;
        }
        auc0 auc0Var = (auc0) obj;
        return this.f1472a == auc0Var.f1472a && this.b.equals(auc0Var.b) && Intrinsics.d(this.c, auc0Var.c) && Intrinsics.d(this.d, auc0Var.d) && this.e.equals(auc0Var.e);
    }

    @Override // a.cuc0
    public final long getId() {
        return this.f1472a;
    }

    public final int hashCode() {
        int iB = ua80.b(Long.hashCode(this.f1472a) * 31, 31, this.b);
        tda tdaVar = this.c;
        int iHashCode = (iB + (tdaVar == null ? 0 : tdaVar.hashCode())) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f1472a, "Default(id=", ", label=", this.b);
        sbO.append(", counter=");
        sbO.append(this.c);
        sbO.append(", picturePlaceholder=");
        sbO.append(this.d);
        sbO.append(", picture=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
