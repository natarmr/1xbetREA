package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zi70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ aj70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi70(aj70 aj70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = aj70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        aj70 aj70Var = this.k;
        switch (b) {
            case 0:
                zi70 zi70Var = new zi70(aj70Var, yjeVar, (byte) 0);
                zi70Var.j = obj;
                return zi70Var;
            default:
                zi70 zi70Var2 = new zi70(aj70Var, yjeVar, (byte) 1);
                zi70Var2.j = obj;
                return zi70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zi70) create((oj70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zi70) create((dj70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int color;
        switch (this.i) {
            case 0:
                oj70 oj70Var = (oj70) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (oj70Var != null) {
                    boolean z = oj70Var instanceof ej70;
                    aj70 aj70Var = this.k;
                    if (z) {
                        w05 w05Var = ((ej70) oj70Var).f7894a;
                        xi70 xi70Var = aj70.P1;
                        int iOrdinal = w05Var.ordinal();
                        if (iOrdinal == 0) {
                            aj70Var.G0().c.setVisibility(0);
                            aj70Var.G0().d.setVisibility(8);
                        } else if (iOrdinal == 1) {
                            aj70Var.G0().c.setVisibility(8);
                            aj70Var.G0().d.setVisibility(0);
                            aj70Var.G0().d.setText("5");
                        } else if (iOrdinal == 2) {
                            aj70Var.G0().c.setVisibility(8);
                            aj70Var.G0().d.setVisibility(0);
                            aj70Var.G0().d.setText("10");
                        } else if (iOrdinal == 3) {
                            aj70Var.G0().c.setVisibility(8);
                            aj70Var.G0().d.setVisibility(0);
                            aj70Var.G0().d.setText("25");
                        } else {
                            if (iOrdinal != 4) {
                                t9f.b();
                                return null;
                            }
                            aj70Var.G0().c.setVisibility(8);
                            aj70Var.G0().d.setVisibility(0);
                            aj70Var.G0().d.setText("50");
                        }
                    } else if (oj70Var instanceof fj70) {
                        boolean z2 = ((fj70) oj70Var).f9624a;
                        xi70 xi70Var2 = aj70.P1;
                        Context contextD = aj70Var.D();
                        if (contextD != null) {
                            aj70Var.G0().e.setText(z2 ? aj70Var.H(R.string.games_autobet_stop) : aj70Var.H(R.string.games_autobet_checkbos));
                            aj70Var.G0().b.setBackground(z2 ? contextD.getDrawable(R.drawable.background_round_solid_primary_light) : contextD.getDrawable(R.drawable.background_round_stroke_blue));
                            TypedValue typedValue = j5d.f15927a;
                            int iA = j5d.a(contextD, R.attr.uikitPrimary, false);
                            int color2 = contextD.getColor(R.color.static_white);
                            if (z2) {
                                aj70Var.G0().c.setBackgroundTintList(ColorStateList.valueOf(color2));
                                aj70Var.G0().f.setBackgroundTintList(ColorStateList.valueOf(color2));
                                aj70Var.G0().c.setImageTintList(ColorStateList.valueOf(iA));
                                aj70Var.G0().d.setTextColor(iA);
                            } else {
                                aj70Var.G0().c.setBackgroundTintList(ColorStateList.valueOf(iA));
                                aj70Var.G0().f.setBackgroundTintList(ColorStateList.valueOf(iA));
                                aj70Var.G0().c.setImageTintList(ColorStateList.valueOf(color2));
                                aj70Var.G0().d.setTextColor(color2);
                            }
                        }
                    } else if (oj70Var instanceof gj70) {
                        boolean z3 = ((gj70) oj70Var).f11383a;
                        xi70 xi70Var3 = aj70.P1;
                        aj70Var.G0().b.setClickable(z3);
                        aj70Var.G0().g.setClickable(z3);
                        aj70Var.G0().k.setClickable(z3);
                    } else if (oj70Var instanceof hj70) {
                        xi70 xi70Var4 = aj70.P1;
                        aj70Var.I0(false);
                    } else if (oj70Var instanceof ij70) {
                        int i = ((ij70) oj70Var).f14860a;
                        xi70 xi70Var5 = aj70.P1;
                        aj70Var.G0().d.setText(String.valueOf(i));
                    } else if (oj70Var instanceof jj70) {
                        boolean z4 = ((jj70) oj70Var).f16609a;
                        xi70 xi70Var6 = aj70.P1;
                        aj70Var.G0().b.setVisibility(z4 ? 0 : 8);
                        aj70Var.G0().j.setVisibility(z4 ? 8 : 0);
                    } else if (oj70Var instanceof kj70) {
                        boolean z5 = ((kj70) oj70Var).f18374a;
                        xi70 xi70Var7 = aj70.P1;
                        Context contextD2 = aj70Var.D();
                        if (contextD2 != null) {
                            if (z5) {
                                TypedValue typedValue2 = j5d.f15927a;
                                color = j5d.a(contextD2, R.attr.uikitPrimary, false);
                            } else {
                                TypedValue typedValue3 = j5d.f15927a;
                                color = contextD2.getColor(R.color.static_white);
                            }
                            Drawable[] compoundDrawablesRelative = aj70Var.G0().i.getCompoundDrawablesRelative();
                            compoundDrawablesRelative.getClass();
                            Drawable drawable = (Drawable) tx3.G(0, compoundDrawablesRelative);
                            if (drawable != null) {
                                b4d b4dVar = b4d.f1952a;
                                vcc.b0(drawable, color);
                            }
                            aj70Var.G0().i.setTextColor(color);
                        }
                    } else if (oj70Var instanceof mj70) {
                        xi70 xi70Var8 = aj70.P1;
                        aj70Var.I0(true);
                    } else if (oj70Var instanceof nj70) {
                        xi70 xi70Var9 = aj70.P1;
                        wdk0 wdk0Var = aj70Var.L1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        pek0 pek0Var = pek0.f26859a;
                        String strH = aj70Var.H(R.string.warning_disabled_autospin_on_bonus);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, null, null, 124), aj70Var, null, null, false, null, 1020);
                    } else if (oj70Var instanceof lj70) {
                        xi70 xi70Var10 = aj70.P1;
                        aj70Var.G0().g.setEnabled(true);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                dj70 dj70Var = (dj70) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (dj70Var instanceof cj70) {
                    boolean z6 = ((cj70) dj70Var).f4447a;
                    xi70 xi70Var11 = aj70.P1;
                    aj70 aj70Var2 = this.k;
                    aj70Var2.G0().l.c();
                    aj70Var2.G0().h.c();
                    aj70Var2.G0().l.setVisibility(8);
                    aj70Var2.G0().h.setVisibility(8);
                    if (z6) {
                        aj70Var2.I0(true);
                    }
                    tj70 tj70VarH0 = aj70Var2.H0();
                    tj70VarH0.E();
                    tj70VarH0.D();
                    tj70VarH0.A(new ej70(tj70VarH0.i.a()));
                    tj70VarH0.C();
                    aj70Var2.H0().z(bj70.f2692a);
                }
                return Unit.f46060a;
        }
    }
}
