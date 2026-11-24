package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ioa implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15108a;
    public final a4x b;
    public final a4x c;
    public final ao8 d;

    public ioa(String str, a4x a4xVar, a4x a4xVar2, ao8 ao8Var) {
        dja djaVar = dja.PENALTY;
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f15108a = str;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = ao8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioa)) {
            return false;
        }
        ioa ioaVar = (ioa) obj;
        dja djaVar = dja.PENALTY;
        return this.f15108a.equals(ioaVar.f15108a) && Intrinsics.d(this.b, ioaVar.b) && Intrinsics.d(this.c, ioaVar.c) && this.d.equals(ioaVar.d);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.STADIUM;
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, ua80.b(dja.STADIUM.hashCode() * 31, 31, this.f15108a), 31), 31);
    }

    public final String toString() {
        dja djaVar = dja.STADIUM;
        StringBuilder sb = new StringBuilder("CardStadiumUiModel(type=");
        sb.append(djaVar);
        sb.append(", name=");
        sb.append(this.f15108a);
        sb.append(", info=");
        hne.y(sb, this.b, ", images=", this.c, ", bottomInfoUiModel=");
        sb.append(this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
