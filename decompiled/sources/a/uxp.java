package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class uxp {
    public static final txp Companion = new txp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eyp f36452a;
    public final eyp b;
    public final eyp c;

    public /* synthetic */ uxp(int i, eyp eypVar, eyp eypVar2, eyp eypVar3) {
        if ((i & 1) == 0) {
            this.f36452a = null;
        } else {
            this.f36452a = eypVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = eypVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = eypVar3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxp)) {
            return false;
        }
        uxp uxpVar = (uxp) obj;
        return Intrinsics.d(this.f36452a, uxpVar.f36452a) && Intrinsics.d(this.b, uxpVar.b) && Intrinsics.d(this.c, uxpVar.c);
    }

    public final int hashCode() {
        eyp eypVar = this.f36452a;
        int iHashCode = (eypVar == null ? 0 : eypVar.hashCode()) * 31;
        eyp eypVar2 = this.b;
        int iHashCode2 = (iHashCode + (eypVar2 == null ? 0 : eypVar2.hashCode())) * 31;
        eyp eypVar3 = this.c;
        return iHashCode2 + (eypVar3 != null ? eypVar3.hashCode() : 0);
    }

    public final String toString() {
        return "FighterStatisticStrikePositionResponse(distance=" + this.f36452a + ", clinch=" + this.b + ", ground=" + this.c + Separators.RPAREN;
    }
}
