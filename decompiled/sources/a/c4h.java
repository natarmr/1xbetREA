package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c4h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3725a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final List j;

    public c4h(String str, String str2, String str3, String str4, float f, float f2, float f3, int i, int i2, List list) {
        list.getClass();
        this.f3725a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = i;
        this.i = i2;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4h)) {
            return false;
        }
        c4h c4hVar = (c4h) obj;
        return this.f3725a.equals(c4hVar.f3725a) && this.b.equals(c4hVar.b) && this.c.equals(c4hVar.c) && this.d.equals(c4hVar.d) && Float.compare(this.e, c4hVar.e) == 0 && Float.compare(this.f, c4hVar.f) == 0 && Float.compare(this.g, c4hVar.g) == 0 && this.h == c4hVar.h && this.i == c4hVar.i && Intrinsics.d(this.j, c4hVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + twn.a(this.i, twn.a(this.h, defpackage.c.a(defpackage.c.a(defpackage.c.a(ua80.b(ua80.b(ua80.b(this.f3725a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31), this.g, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberLolPlayerModel(playerId=", this.f3725a, ", playerName=", this.b, ", playerImage=");
        f140.v(sbN, this.c, ", role=", this.d, ", kda=");
        vqd.v(sbN, this.e, ", kp=", this.f, ", vspm=");
        sbN.append(this.g);
        sbN.append(", dmg=");
        sbN.append(this.h);
        sbN.append(", gold=");
        sbN.append(this.i);
        sbN.append(", heroes=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
