package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wsp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f39702a;
    public final hsp b;
    public final hsp c;

    public wsp(String str, hsp hspVar, hsp hspVar2) {
        str.getClass();
        hspVar.getClass();
        hspVar2.getClass();
        this.f39702a = str;
        this.b = hspVar;
        this.c = hspVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsp)) {
            return false;
        }
        wsp wspVar = (wsp) obj;
        return Intrinsics.d(this.f39702a, wspVar.f39702a) && Intrinsics.d(this.b, wspVar.b) && Intrinsics.d(this.c, wspVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f39702a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FightResult(title=" + ((Object) this.f39702a) + ", firstTeamResult=" + this.b + ", secondTeamResult=" + this.c + Separators.RPAREN;
    }
}
