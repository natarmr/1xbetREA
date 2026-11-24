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
public final class tl70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ul70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl70(ul70 ul70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ul70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ul70 ul70Var = this.k;
        switch (b) {
            case 0:
                tl70 tl70Var = new tl70(ul70Var, yjeVar, (byte) 0);
                tl70Var.j = obj;
                return tl70Var;
            default:
                tl70 tl70Var2 = new tl70(ul70Var, yjeVar, (byte) 1);
                tl70Var2.j = obj;
                return tl70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tl70) create((im70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tl70) create((xl70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int color;
        switch (this.i) {
            case 0:
                im70 im70Var = (im70) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (im70Var != null) {
                    boolean z = im70Var instanceof yl70;
                    ul70 ul70Var = this.k;
                    if (z) {
                        w05 w05Var = ((yl70) im70Var).f42826a;
                        rl70 rl70Var = ul70.Q1;
                        int iOrdinal = w05Var.ordinal();
                        if (iOrdinal == 0) {
                            ul70Var.G0().c.setVisibility(0);
                            ul70Var.G0().d.setVisibility(8);
                        } else if (iOrdinal == 1) {
                            ul70Var.G0().c.setVisibility(8);
                            ul70Var.G0().d.setVisibility(0);
                            ul70Var.G0().d.setText("5");
                        } else if (iOrdinal == 2) {
                            ul70Var.G0().c.setVisibility(8);
                            ul70Var.G0().d.setVisibility(0);
                            ul70Var.G0().d.setText("10");
                        } else if (iOrdinal == 3) {
                            ul70Var.G0().c.setVisibility(8);
                            ul70Var.G0().d.setVisibility(0);
                            ul70Var.G0().d.setText("25");
                        } else {
                            if (iOrdinal != 4) {
                                t9f.b();
                                return null;
                            }
                            ul70Var.G0().c.setVisibility(8);
                            ul70Var.G0().d.setVisibility(0);
                            ul70Var.G0().d.setText("50");
                        }
                    } else if (im70Var instanceof zl70) {
                        boolean z2 = ((zl70) im70Var).f44566a;
                        rl70 rl70Var2 = ul70.Q1;
                        Context contextD = ul70Var.D();
                        if (contextD != null) {
                            ul70Var.G0().e.setText(z2 ? ul70Var.H(R.string.games_autobet_stop) : ul70Var.H(R.string.games_autobet_checkbos));
                            TypedValue typedValue = j5d.f15927a;
                            int iA = j5d.a(contextD, R.attr.uikitPrimary, false);
                            int color2 = contextD.getColor(R.color.static_white);
                            if (z2) {
                                ul70Var.G0().b.setBackground(contextD.getDrawable(R.drawable.background_round_solid_primary_light));
                                ul70Var.G0().c.setBackgroundTintList(ColorStateList.valueOf(color2));
                                ul70Var.G0().f.setBackgroundTintList(ColorStateList.valueOf(color2));
                                ul70Var.G0().c.setImageTintList(ColorStateList.valueOf(iA));
                                ul70Var.G0().d.setTextColor(iA);
                            } else {
                                ul70Var.G0().b.setBackground(contextD.getDrawable(R.drawable.background_round_stroke_blue));
                                ul70Var.G0().c.setBackgroundTintList(ColorStateList.valueOf(iA));
                                ul70Var.G0().f.setBackgroundTintList(ColorStateList.valueOf(iA));
                                ul70Var.G0().c.setImageTintList(ColorStateList.valueOf(color2));
                                ul70Var.G0().d.setTextColor(color2);
                            }
                        }
                    } else if (im70Var instanceof am70) {
                        boolean z3 = ((am70) im70Var).f1097a;
                        rl70 rl70Var3 = ul70.Q1;
                        ul70Var.G0().b.setClickable(z3);
                        ul70Var.G0().g.setClickable(z3);
                        ul70Var.G0().k.setClickable(z3);
                    } else if (im70Var instanceof bm70) {
                        rl70 rl70Var4 = ul70.Q1;
                        ul70Var.I0(false);
                    } else if (im70Var instanceof cm70) {
                        int i = ((cm70) im70Var).f4592a;
                        rl70 rl70Var5 = ul70.Q1;
                        ul70Var.G0().d.setText(String.valueOf(i));
                    } else if (im70Var instanceof dm70) {
                        boolean z4 = ((dm70) im70Var).f6309a;
                        rl70 rl70Var6 = ul70.Q1;
                        ul70Var.G0().b.setVisibility(z4 ? 0 : 8);
                        ul70Var.G0().j.setVisibility(z4 ? 8 : 0);
                    } else if (im70Var instanceof em70) {
                        boolean z5 = ((em70) im70Var).f8034a;
                        rl70 rl70Var7 = ul70.Q1;
                        Context contextD2 = ul70Var.D();
                        if (contextD2 != null) {
                            if (z5) {
                                TypedValue typedValue2 = j5d.f15927a;
                                color = j5d.a(contextD2, R.attr.uikitPrimary, false);
                            } else {
                                TypedValue typedValue3 = j5d.f15927a;
                                color = contextD2.getColor(R.color.static_white);
                            }
                            Drawable[] compoundDrawablesRelative = ul70Var.G0().i.getCompoundDrawablesRelative();
                            compoundDrawablesRelative.getClass();
                            Drawable drawable = (Drawable) tx3.G(0, compoundDrawablesRelative);
                            if (drawable != null) {
                                b4d b4dVar = b4d.f1952a;
                                vcc.b0(drawable, color);
                            }
                            ul70Var.G0().i.setTextColor(color);
                        }
                    } else if (im70Var instanceof gm70) {
                        rl70 rl70Var8 = ul70.Q1;
                        ul70Var.I0(true);
                    } else if (im70Var instanceof hm70) {
                        rl70 rl70Var9 = ul70.Q1;
                        wdk0 wdk0Var = ul70Var.L1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        pek0 pek0Var = pek0.f26859a;
                        String strH = ul70Var.H(R.string.warning_disabled_autospin_on_bonus);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, null, null, 124), ul70Var, null, null, false, null, 1020);
                    } else if (im70Var instanceof fm70) {
                        rl70 rl70Var10 = ul70.Q1;
                        ul70Var.G0().g.setEnabled(true);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                xl70 xl70Var = (xl70) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (xl70Var instanceof wl70) {
                    boolean z6 = ((wl70) xl70Var).f39339a;
                    rl70 rl70Var11 = ul70.Q1;
                    ul70 ul70Var2 = this.k;
                    ul70Var2.G0().l.c();
                    ul70Var2.G0().h.c();
                    ul70Var2.G0().l.setVisibility(8);
                    ul70Var2.G0().h.setVisibility(8);
                    if (z6) {
                        ul70Var2.I0(true);
                    }
                    nm70 nm70VarH0 = ul70Var2.H0();
                    nm70VarH0.F();
                    nm70VarH0.E();
                    nm70VarH0.B(new yl70(nm70VarH0.j.a()));
                    nm70VarH0.D();
                    ul70Var2.H0().A(vl70.f37608a);
                }
                return Unit.f46060a;
        }
    }
}
