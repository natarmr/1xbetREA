package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vvb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwb f38090a;
    public final String b;
    public final dwb c;

    public vvb(hwb hwbVar, String str, dwb dwbVar) {
        str.getClass();
        this.f38090a = hwbVar;
        this.b = str;
        this.c = dwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvb)) {
            return false;
        }
        vvb vvbVar = (vvb) obj;
        return this.f38090a == vvbVar.f38090a && Intrinsics.d(this.b, vvbVar.b) && this.c.equals(vvbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f38090a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CharacteristicAspectModel(characteristicsType=" + this.f38090a + ", characteristicsText=" + this.b + ", level=" + this.c + Separators.RPAREN;
    }
}
