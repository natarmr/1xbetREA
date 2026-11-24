package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jvy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17225a;
    public final String b;
    public final n0x c;
    public final n0x d;
    public final m0x e;

    public jvy(long j, String str, n0x n0xVar, n0x n0xVar2, m0x m0xVar) {
        str.getClass();
        this.f17225a = j;
        this.b = str;
        this.c = n0xVar;
        this.d = n0xVar2;
        this.e = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvy)) {
            return false;
        }
        jvy jvyVar = (jvy) obj;
        return this.f17225a == jvyVar.f17225a && Intrinsics.d(this.b, jvyVar.b) && this.c.equals(jvyVar.c) && this.d.equals(jvyVar.d) && this.e.equals(jvyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f140.f(this.d, f140.f(this.c, ua80.b(Long.hashCode(this.f17225a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f17225a, "Item(gameId=", ", gameTitle=", this.b);
        sbO.append(", gamePicture=");
        sbO.append(this.c);
        sbO.append(", fallbackGamePicture=");
        sbO.append(this.d);
        sbO.append(", gamePlaceholder=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
