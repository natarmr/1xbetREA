package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class joa implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16848a;
    public final a4x b;
    public final a4x c;
    public final bo8 d;

    public joa(String str, a4x a4xVar, a4x a4xVar2, bo8 bo8Var) {
        dja djaVar = dja.PENALTY;
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f16848a = str;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = bo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joa)) {
            return false;
        }
        joa joaVar = (joa) obj;
        dja djaVar = dja.PENALTY;
        return this.f16848a.equals(joaVar.f16848a) && Intrinsics.d(this.b, joaVar.b) && Intrinsics.d(this.c, joaVar.c) && this.d.equals(joaVar.d);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.STADIUM;
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, ua80.b(dja.STADIUM.hashCode() * 31, 31, this.f16848a), 31), 31);
    }

    public final String toString() {
        dja djaVar = dja.STADIUM;
        StringBuilder sb = new StringBuilder("CardStadiumUiModel(type=");
        sb.append(djaVar);
        sb.append(", name=");
        sb.append(this.f16848a);
        sb.append(", info=");
        hne.y(sb, this.b, ", images=", this.c, ", bottomInfoUiModel=");
        sb.append(this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
