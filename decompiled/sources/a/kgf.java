package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kgf implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mff f18235a;
    public final List b;
    public final ngf c;
    public final ngf d;
    public final int e;
    public final int f;

    public kgf(mff mffVar, List list, ngf ngfVar, ngf ngfVar2, int i, int i2) {
        mffVar.getClass();
        list.getClass();
        this.f18235a = mffVar;
        this.b = list;
        this.c = ngfVar;
        this.d = ngfVar2;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgf)) {
            return false;
        }
        kgf kgfVar = (kgf) obj;
        return this.f18235a == kgfVar.f18235a && Intrinsics.d(this.b, kgfVar.b) && this.c.equals(kgfVar.c) && this.d.equals(kgfVar.d) && this.e == kgfVar.e && this.f == kgfVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, dw9.a(dw9.a(dw9.a(this.f18235a.hashCode() * 31, 31, this.b), 31, this.c.f23482a), 31, this.d.f23482a), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrystalModel(gameStatus=");
        sb.append(this.f18235a);
        sb.append(", matrix=");
        sb.append(this.b);
        sb.append(", playerOneInfo=");
        sb.append(this.c);
        sb.append(", playerTwoInfo=");
        sb.append(this.d);
        sb.append(", currentStep=");
        return w6x.o(this.e, this.f, ", period=", Separators.RPAREN, sb);
    }
}
