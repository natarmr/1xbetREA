package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class buc0 implements cuc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3224a;
    public final String b;
    public final tda c;
    public final Integer d;
    public final hds e;

    public buc0(long j, String str, tda tdaVar, Integer num, hds hdsVar) {
        this.f3224a = j;
        this.b = str;
        this.c = tdaVar;
        this.d = num;
        this.e = hdsVar;
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
        if (!(obj instanceof buc0)) {
            return false;
        }
        buc0 buc0Var = (buc0) obj;
        return this.f3224a == buc0Var.f3224a && this.b.equals(buc0Var.b) && Intrinsics.d(this.c, buc0Var.c) && Intrinsics.d(this.d, buc0Var.d) && this.e.equals(buc0Var.e);
    }

    @Override // a.cuc0
    public final long getId() {
        return this.f3224a;
    }

    public final int hashCode() {
        int iB = ua80.b(Long.hashCode(this.f3224a) * 31, 31, this.b);
        tda tdaVar = this.c;
        int iHashCode = (iB + (tdaVar == null ? 0 : tdaVar.hashCode())) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f3224a, "OneXGame(id=", ", label=", this.b);
        sbO.append(", counter=");
        sbO.append(this.c);
        sbO.append(", picturePlaceholder=");
        sbO.append(this.d);
        sbO.append(", imageInfo=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
