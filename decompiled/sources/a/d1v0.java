package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d1v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5330a;
    public final float b;
    public final ghn c;
    public final float d;
    public final float e;
    public final a4x f;
    public final b9n g;

    public d1v0(float f, float f2, ghn ghnVar, float f3, float f4, a4x a4xVar, b9n b9nVar) {
        kkf0 kkf0Var = kkf0.f18436a;
        ghnVar.getClass();
        a4xVar.getClass();
        this.f5330a = f;
        this.b = f2;
        this.c = ghnVar;
        this.d = f3;
        this.e = f4;
        this.f = a4xVar;
        this.g = b9nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1v0)) {
            return false;
        }
        d1v0 d1v0Var = (d1v0) obj;
        if (Float.compare(this.f5330a, d1v0Var.f5330a) != 0 || Float.compare(this.b, d1v0Var.b) != 0 || !Intrinsics.d(this.c, d1v0Var.c)) {
            return false;
        }
        kkf0 kkf0Var = kkf0.f18436a;
        return Float.compare(this.d, d1v0Var.d) == 0 && Float.compare(0.45f, 0.45f) == 0 && Float.compare(this.e, d1v0Var.e) == 0 && Intrinsics.d(this.f, d1v0Var.f) && this.g.equals(d1v0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cs0.b(this.f, defpackage.c.a(twn.a(3, defpackage.c.a(defpackage.c.a(twn.a(0, twn.a(3000, (kkf0.f18436a.hashCode() + ((this.c.hashCode() + defpackage.c.a(Float.hashCode(this.f5330a) * 31, this.b, 31)) * 31)) * 31, 31), 31), this.d, 31), 0.45f, 31), 31), this.e, 31), 31);
    }

    public final String toString() {
        kkf0 kkf0Var = kkf0.f18436a;
        StringBuilder sbS = dw9.s(this.f5330a, this.b, "WaveAnimationConfig(animationInitialValue=", ", animationTargetValue=", ", animationEasing=");
        sbS.append(this.c);
        sbS.append(", animationRepeatMode=");
        sbS.append(kkf0Var);
        sbS.append(", animationDuration=3000, animationDelay=0, animationAngleInDegrees=");
        vqd.v(sbS, this.d, ", animationWidthCoef=0.45, animationRepeatCount=3, cornerRadiusPx=", this.e, ", effectColors=");
        sbS.append(this.f);
        sbS.append(", effectDirection=");
        sbS.append(this.g);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
