package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kyr implements lyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19120a;
    public final gyr b;
    public final gyr c;

    public kyr(String str, gyr gyrVar, gyr gyrVar2) {
        str.getClass();
        this.f19120a = str;
        this.b = gyrVar;
        this.c = gyrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyr)) {
            return false;
        }
        kyr kyrVar = (kyr) obj;
        return Intrinsics.d(this.f19120a, kyrVar.f19120a) && this.b.equals(kyrVar.b) && this.c.equals(kyrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f19120a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TeamSecond(secondPlayerName=" + this.f19120a + ", secondPlayerFirstRound=" + this.b + ", secondPlayerSecondRound=" + this.c + Separators.RPAREN;
    }
}
