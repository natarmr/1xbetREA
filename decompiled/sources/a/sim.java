package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sim implements tim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32270a;
    public final String b;
    public final String c;
    public final y6n d;
    public final ggm e;
    public final boolean f;

    public sim(String str, String str2, String str3, y6n y6nVar, ggm ggmVar, boolean z) {
        str.getClass();
        str3.getClass();
        this.f32270a = str;
        this.b = str2;
        this.c = str3;
        this.d = y6nVar;
        this.e = ggmVar;
        this.f = z;
    }

    @Override // a.tim
    public final y6n a() {
        return this.d;
    }

    @Override // a.tim
    public final ggm b() {
        return this.e;
    }

    @Override // a.tim
    public final String c() {
        return this.f32270a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sim)) {
            return false;
        }
        sim simVar = (sim) obj;
        return Intrinsics.d(this.f32270a, simVar.f32270a) && this.b.equals(simVar.b) && Intrinsics.d(this.c, simVar.c) && this.d == simVar.d && this.e == simVar.e && this.f == simVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f32270a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("WithoutPlayers(eventTime=", this.f32270a, ", actionImgUrl=", this.b, ", eventNote=");
        sbN.append(this.c);
        sbN.append(", teamPosition=");
        sbN.append(this.d);
        sbN.append(", eventPositionInSection=");
        sbN.append(this.e);
        sbN.append(", typeIsChange=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
