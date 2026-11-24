package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class mdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21603a;
    public final pdm b;
    public final ldm c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;

    public /* synthetic */ mdm(int i, pdm pdmVar, ldm ldmVar, int i2, int i3, int i4, int i5, int i6, long j, long j2, int i7) {
        this(i, (i7 & 2) != 0 ? pdm.f26814a : pdmVar, (i7 & 4) != 0 ? ldm.f19857a : ldmVar, (i7 & 8) != 0 ? R.drawable.ic_glyph_circle_favourite : i2, (i7 & 16) != 0 ? R.string.empty_str : i3, (i7 & 32) != 0 ? R.string.empty_str : i4, (i7 & 64) != 0 ? R.string.empty_str : i5, (i7 & 128) != 0 ? R.string.empty_str : i6, (i7 & 256) != 0 ? 0L : j, (i7 & 512) != 0 ? 0L : j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdm)) {
            return false;
        }
        mdm mdmVar = (mdm) obj;
        return this.f21603a == mdmVar.f21603a && this.b == mdmVar.b && this.c == mdmVar.c && this.d == mdmVar.d && this.e == mdmVar.e && this.f == mdmVar.f && this.g == mdmVar.g && this.h == mdmVar.h && this.i == mdmVar.i && this.j == mdmVar.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + rw2.b(twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f21603a) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsEmptyConfigModel(lottie=");
        sb.append(this.f21603a);
        sb.append(", styleType=");
        sb.append(this.b);
        sb.append(", colorType=");
        sb.append(this.c);
        sb.append(", iconRes=");
        sb.append(this.d);
        sb.append(", titleText=");
        axq.r(this.e, this.f, ", subtitleText=", ", captionText=", sb);
        axq.r(this.g, this.h, ", buttonText=", ", countDownTimeMillis=", sb);
        sb.append(this.i);
        return rw2.n(sb, this.j, ", timerEndDateMillis=", Separators.RPAREN);
    }

    public mdm(int i, pdm pdmVar, ldm ldmVar, int i2, int i3, int i4, int i5, int i6, long j, long j2) {
        pdmVar.getClass();
        ldmVar.getClass();
        this.f21603a = i;
        this.b = pdmVar;
        this.c = ldmVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = j;
        this.j = j2;
    }
}
