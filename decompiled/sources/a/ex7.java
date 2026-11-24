package a;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class ex7 extends zx5 {
    public static final ek5 q = new ek5(12);
    public final a530 o;
    public final ms2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex7(androidx.fragment.app.e eVar, glz glzVar, a530 a530Var, ms2 ms2Var) {
        super(eVar, glzVar, q);
        ms2Var.getClass();
        this.o = a530Var;
        this.p = ms2Var;
    }

    @Override // a.zx5, a.f5r
    public final boolean A(long j) {
        List list = ((yz3) this.n).f;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((swm0) it.next()).b() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        Parcelable standardSubGame;
        swm0 swm0Var = (swm0) G(i);
        if (swm0Var != null) {
            if (swm0Var instanceof pwm0) {
                pwm0 pwm0Var = (pwm0) swm0Var;
                long j = pwm0Var.f27718a;
                long j2 = pwm0Var.b;
                long j3 = pwm0Var.c;
                boolean z = pwm0Var.e;
                standardSubGame = new MarketsParams.InsightsSubGame(j, j2, j3, this.p, pwm0Var.d, z);
            } else if (swm0Var instanceof qwm0) {
                qwm0 qwm0Var = (qwm0) swm0Var;
                standardSubGame = new MarketsParams.StandardSubGame(qwm0Var.f29442a, qwm0Var.b, qwm0Var.c, qwm0Var.e, qwm0Var.d, this.p, qwm0Var.g);
            }
            this.o.getClass();
            if (standardSubGame instanceof MarketsParams.InsightsSubGame) {
                lhx.Y1.getClass();
                lhx lhxVar = new lhx();
                iiy iiyVar = lhx.Z1[1];
                lhxVar.X1.J(lhxVar, iiyVar, (MarketsParams.InsightsSubGame) standardSubGame);
                return lhxVar;
            }
            if (standardSubGame instanceof MarketsParams.StandardSubGame) {
                w430.Y1.getClass();
                w430 w430Var = new w430();
                iiy iiyVar2 = w430.Z1[1];
                w430Var.X1.J(w430Var, iiyVar2, (MarketsParams.StandardSubGame) standardSubGame);
                return w430Var;
            }
            if (!(standardSubGame instanceof MarketsParams.DuelSubGame)) {
                t9f.b();
                return null;
            }
            u430 u430Var = w430.Y1;
            MarketsParams.DuelSubGame duelSubGame = (MarketsParams.DuelSubGame) standardSubGame;
            MarketsParams.StandardSubGame standardSubGame2 = new MarketsParams.StandardSubGame(duelSubGame.f47006a, duelSubGame.b, duelSubGame.c, duelSubGame.d, duelSubGame.e, duelSubGame.f, 1);
            u430Var.getClass();
            w430 w430Var2 = new w430();
            w430Var2.X1.J(w430Var2, w430.Z1[1], standardSubGame2);
            return w430Var2;
        }
        t9f.b();
        return null;
    }

    @Override // a.zx5, a.f5r, a.yge0
    public final long e(int i) {
        return ((swm0) G(i)).b();
    }
}
