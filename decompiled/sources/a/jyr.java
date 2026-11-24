package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jyr implements lyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17374a;
    public final gyr b;
    public final gyr c;

    public jyr(String str, gyr gyrVar, gyr gyrVar2) {
        str.getClass();
        this.f17374a = str;
        this.b = gyrVar;
        this.c = gyrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyr)) {
            return false;
        }
        jyr jyrVar = (jyr) obj;
        return Intrinsics.d(this.f17374a, jyrVar.f17374a) && this.b.equals(jyrVar.b) && this.c.equals(jyrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f17374a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TeamFirst(firstPlayerName=" + this.f17374a + ", firstPlayerFirstRound=" + this.b + ", firstPlayerSecondRound=" + this.c + Separators.RPAREN;
    }
}
