package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public final class xzk0 extends zzk0 {
    public String f;

    @Override // a.zzk0
    public final void c(ywu ywuVar, float f) {
        String str = this.f;
        ywuVar.getClass();
        int iA = j0t0.a(str);
        if (iA == -1) {
            switch (str) {
                case "AnimateCircleAngleTo":
                    iA = Response.SESSION_NOT_ACCEPTABLE;
                    break;
                case "QuantizeMotionPhase":
                    iA = 602;
                    break;
                case "QuantizeMotionSteps":
                    iA = 610;
                    break;
                case "PathRotate":
                    iA = 601;
                    break;
                case "QuantizeInterpolator":
                    iA = Response.DOES_NOT_EXIST_ANYWHERE;
                    break;
                case "DrawPath":
                    iA = 608;
                    break;
                case "Stagger":
                    iA = Response.BUSY_EVERYWHERE;
                    break;
                case "PolarRelativeTo":
                    iA = 609;
                    break;
                case "QuantizeInterpolatorType":
                    iA = 611;
                    break;
                case "QuantizeInterpolatorID":
                    iA = 612;
                    break;
                case "TransitionEasing":
                    iA = Response.DECLINE;
                    break;
                case "AnimateRelativeTo":
                    iA = 605;
                    break;
                case "PathMotionArc":
                    iA = 607;
                    break;
                default:
                    iA = -1;
                    break;
            }
        }
        ywuVar.d(a(f), iA);
    }
}
