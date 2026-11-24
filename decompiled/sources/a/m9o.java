package a;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.util.Rational;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class m9o implements jot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9o f21419a;
    public p9o b;
    public pot0 c;

    public m9o(o9o o9oVar) {
        o9oVar.getClass();
        this.f21419a = o9oVar;
        this.b = new p9o(o9oVar.d, 0, o9oVar.c, o9oVar.e);
    }

    public final odd a(boolean z) {
        o9o o9oVar = this.f21419a;
        boolean z2 = o9oVar.d;
        Range range = o9oVar.c;
        if (!z2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            odd oddVar = new odd();
            oddVar.b0(illegalArgumentException);
            return oddVar;
        }
        if (!range.contains(0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            odd oddVar2 = new odd();
            oddVar2.b0(illegalArgumentException2);
            return oddVar2;
        }
        pot0 pot0Var = this.c;
        if (pot0Var == null) {
            c44 c44Var = new c44("Camera is not active.", (byte) 1);
            odd oddVar3 = o9oVar.f;
            if (oddVar3 != null) {
                oddVar3.b0(c44Var);
            }
            odd oddVar4 = new odd();
            oddVar4.b0(c44Var);
            return oddVar4;
        }
        p9o p9oVar = this.b;
        boolean z3 = p9oVar.f26616a;
        Range range2 = p9oVar.c;
        Rational rational = p9oVar.d;
        range2.getClass();
        rational.getClass();
        this.b = new p9o(z3, 0, range2, rational);
        p7d p7dVar = o9oVar.b;
        odd oddVar5 = new odd();
        odd oddVar6 = o9oVar.f;
        if (oddVar6 != null) {
            if (z) {
                dw9.z("Cancelled by another setExposureCompensationIndex()", oddVar6);
            } else {
                vzb.g0(oddVar5, oddVar6);
            }
        }
        o9oVar.f = oddVar5;
        n9o n9oVar = o9oVar.g;
        if (n9oVar != null) {
            p7dVar.f(n9oVar);
            o9oVar.g = null;
        }
        pot0.c(pot0Var, wp20.b(new Pair(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0)));
        n9o n9oVar2 = new n9o(oddVar5);
        p7dVar.b(n9oVar2, o9oVar.f24888a.e);
        oddVar5.invokeOnCompletion(new qzn(o9oVar, n9oVar2, (byte) 21));
        o9oVar.g = n9oVar2;
        return oddVar5;
    }

    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        this.c = pot0Var;
        a(false);
    }

    @Override // a.jot0
    public final void reset() {
        p9o p9oVar = this.b;
        boolean z = p9oVar.f26616a;
        Range range = p9oVar.c;
        Rational rational = p9oVar.d;
        range.getClass();
        rational.getClass();
        this.b = new p9o(z, 0, range, rational);
        a(true);
    }
}
