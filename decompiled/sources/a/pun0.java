package a;

import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$BetValue;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$UiState;

/* JADX INFO: loaded from: classes6.dex */
public final class pun0 extends w46 {
    public final mrt b;
    public final v88 c;
    public final mne d;
    public final duj e;
    public final rqt f;
    public final eqx g;
    public final i1w0 h;
    public final vzg0 i;
    public final epi0 j;
    public final xsu k;
    public final rrc l;
    public final khf0 m;
    public final ot n;
    public final m0u o;
    public final s31 p;
    public final gg5 q;
    public final ih5 r;
    public final e41 s;
    public final cmt t;
    public final ctf0 u;
    public final xae0 v;
    public final ol60 w;
    public final p7m0 x;

    public pun0(mrt mrtVar, v88 v88Var, mne mneVar, duj dujVar, rqt rqtVar, eqx eqxVar, i1w0 i1w0Var, vzg0 vzg0Var, epi0 epi0Var, xsu xsuVar, rrc rrcVar, khf0 khf0Var, ot otVar, m0u m0uVar, s31 s31Var, gg5 gg5Var, ih5 ih5Var, e41 e41Var, cmt cmtVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = mrtVar;
        this.c = v88Var;
        this.d = mneVar;
        this.e = dujVar;
        this.f = rqtVar;
        this.g = eqxVar;
        this.h = i1w0Var;
        this.i = vzg0Var;
        this.j = epi0Var;
        this.k = xsuVar;
        this.l = rrcVar;
        this.m = khf0Var;
        this.n = otVar;
        this.o = m0uVar;
        this.p = s31Var;
        this.q = gg5Var;
        this.r = ih5Var;
        this.s = e41Var;
        this.t = cmtVar;
        this.u = ctf0Var;
        this.v = vzg0Var.c(new SwipexChangeBetValueViewModel$UiState(0L, new SwipexChangeBetValueViewModel$BetValue(null), false, 0.0d, 0.0d, 0.0d, "", false, false, false, false, false, ""), "UI_STATE_KEY");
        this.w = new ol60(3);
        this.x = q7m0.a(gun0.f11939a);
    }

    public final void w(SwipexChangeBetValueViewModel$BetValue swipexChangeBetValueViewModel$BetValue, boolean z) {
        xae0 xae0Var = this.v;
        double d = ((SwipexChangeBetValueViewModel$UiState) xae0Var.f40549a.getValue()).f;
        double d2 = swipexChangeBetValueViewModel$BetValue.b;
        boolean z2 = d2 > d;
        boolean z3 = d2 >= d;
        SwipexChangeBetValueViewModel$UiState swipexChangeBetValueViewModel$UiState = (SwipexChangeBetValueViewModel$UiState) xae0Var.f40549a.getValue();
        boolean z4 = d2 < 9.99999999999999E12d;
        long j = swipexChangeBetValueViewModel$UiState.f47115a;
        double d3 = swipexChangeBetValueViewModel$UiState.d;
        double d4 = swipexChangeBetValueViewModel$UiState.e;
        double d5 = swipexChangeBetValueViewModel$UiState.f;
        String str = swipexChangeBetValueViewModel$UiState.g;
        boolean z5 = swipexChangeBetValueViewModel$UiState.j;
        boolean z6 = swipexChangeBetValueViewModel$UiState.l;
        CharSequence charSequence = swipexChangeBetValueViewModel$UiState.m;
        str.getClass();
        charSequence.getClass();
        this.i.e("UI_STATE_KEY", new SwipexChangeBetValueViewModel$UiState(j, swipexChangeBetValueViewModel$BetValue, z, d3, d4, d5, str, z2, z4, z5, z3, z6, charSequence));
    }

    public final void x(int i) {
        w(new SwipexChangeBetValueViewModel$BetValue(String.valueOf(((SwipexChangeBetValueViewModel$UiState) this.v.f40549a.getValue()).d * ((double) i))), false);
    }
}
