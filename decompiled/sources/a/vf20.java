package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryGameView;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryPickerView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackCardView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackView;
import org.xplatform.ui_core.viewcomponents.views.TimerView;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vf20 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf20(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    private final Object a(Object obj, Object obj2) {
        n570 n570Var = (n570) obj;
        ez60 ez60Var = (ez60) this.f41192a;
        iiy[] iiyVarArr = ez60.S1;
        ez60Var.getClass();
        if (n570Var == null) {
            t9f.b();
            return null;
        }
        r270 r270Var = n570Var.f22930a;
        long j = n570Var.b;
        int i = n570Var.c;
        String str = n570Var.d;
        String strName = r270Var.name();
        Fragment fragmentJ = ez60Var.C().J(strName);
        List listP = ez60Var.C().c.p();
        ArrayList<Fragment> arrayListU = twn.u(listP);
        for (Object obj3 : listP) {
            Fragment fragment = (Fragment) obj3;
            if (!(fragment instanceof sik) && !fragment.O() && !Intrinsics.d(fragment.B, strName)) {
                arrayListU.add(obj3);
            }
        }
        if (!arrayListU.isEmpty() || fragmentJ == null || !fragmentJ.S()) {
            androidx.fragment.app.e eVarC = ez60Var.C();
            eVarC.getClass();
            zb5 zb5Var = new zb5(eVarC);
            zb5Var.p(R.anim.fade_in_medium, R.anim.fade_out_medium, 0, 0);
            if (fragmentJ == null) {
                y370.Y1.getClass();
                str.getClass();
                y370 y370Var = new y370();
                y370Var.s0(i120.V(new Pair("ARG_TAB_TAG", r270Var.name()), new Pair("ARG_GAME_ID", Long.valueOf(j)), new Pair("ARG_PROMO_TYPE_ID", Integer.valueOf(i)), new Pair("WEB_GAME_SESSION_ID", str)));
                zb5Var.k(R.id.content_game, y370Var, strName, 1);
            } else if (!fragmentJ.S() || fragmentJ.O()) {
                zb5Var.q(fragmentJ, lkz.e);
                zb5Var.r(fragmentJ);
            }
            for (Fragment fragment2 : arrayListU) {
                zb5Var.q(fragment2, lkz.c);
                zb5Var.m(fragment2);
            }
            zb5Var.g(true, true);
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        Object value;
        zy5 zy5Var = (zy5) obj;
        qf70 qf70Var = (qf70) this.f41192a;
        y5s y5sVar = qf70Var.E;
        p7m0 p7m0Var = qf70Var.L;
        p7m0 p7m0Var2 = qf70Var.M;
        mne mneVar = qf70Var.v;
        p7m0 p7m0Var3 = qf70Var.N;
        vcu vcuVar = qf70Var.q;
        byte b = 0;
        byte b2 = 1;
        yje yjeVar = null;
        twn.A(vcuVar.a() == vrs.f37917a || (vcuVar.a() == vrs.c && !qf70Var.r.a()), p7m0Var3, null);
        if (zy5Var != null) {
            if (zy5Var instanceof fy5) {
                if (!y5sVar.h) {
                    Boolean bool = Boolean.FALSE;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, bool);
                    Boolean bool2 = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool2);
                }
            } else if (zy5Var instanceof yy5) {
                Boolean bool3 = Boolean.FALSE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool3);
                Boolean bool4 = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool4);
            } else if ((zy5Var instanceof my5) || (zy5Var instanceof ey5)) {
                sac.V(jiu0.a(qf70Var), new cf70(1, qf70Var, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, mneVar.b, new ef70(qf70Var, yjeVar, (byte) 4), 10);
            } else if (zy5Var instanceof ly5) {
                ly5 ly5Var = (ly5) zy5Var;
                Boolean bool5 = Boolean.TRUE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool5);
                y5sVar.getClass();
                sac.V(jiu0.a(qf70Var), new cf70(1, qf70Var, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, mneVar.b, new lf70(qf70Var, ly5Var.d, ly5Var.g, null), 10);
            } else if (zy5Var instanceof sy5) {
                sac.V(jiu0.a(qf70Var), new cf70(1, qf70Var, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar.b, new kf70(qf70Var, yjeVar, b2), 10);
            } else if (zy5Var instanceof oy5) {
                sac.V(jiu0.a(qf70Var), new cf70(1, qf70Var, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, mneVar.b, new qe5((Object) qf70Var, ((oy5) zy5Var).f26045a, yjeVar, (byte) 9), 10);
            } else if (zy5Var instanceof cme) {
                qf70Var.D();
                qf70Var.E(ve70.f37269a);
            } else if (zy5Var instanceof tle) {
                qf70Var.D();
                qf70Var.E(se70.f32064a);
            } else if (zy5Var instanceof xle) {
                qf70Var.E(re70.f30321a);
            } else if (zy5Var instanceof ame) {
                qf70Var.E(te70.f33805a);
            } else if (zy5Var instanceof kle) {
                qf70Var.D();
            } else if (zy5Var instanceof ry5) {
                twn.A(!qf70Var.l.a(), p7m0Var2, null);
                Boolean bool6 = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool6);
            } else if ((zy5Var instanceof wy5) || (zy5Var instanceof bme) || (zy5Var instanceof yle) || (zy5Var instanceof zle)) {
                Boolean bool7 = Boolean.TRUE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool7);
                Boolean bool8 = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool8);
            } else if (zy5Var instanceof mle) {
                p7m0 p7m0Var4 = qf70Var.J;
                do {
                    value = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value, qe70.a((qe70) value, null, false, false, 14)));
            } else if (zy5Var instanceof hle) {
                sac.V(jiu0.a(qf70Var), new cf70(1, qf70Var, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, mneVar.b, new ku60(qf70Var, (hle) zy5Var, yjeVar, (byte) 11), 10);
            } else if ((zy5Var instanceof qle) && !qf70Var.D.a()) {
                sac.V(jiu0.a(qf70Var), new cf70(1, qf70Var, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, mneVar.b, new ef70(qf70Var, yjeVar, b), 10);
            }
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        zy5 zy5Var = (zy5) obj;
        rg70 rg70Var = (rg70) this.f41192a;
        ztt zttVar = rg70Var.f;
        boolean z = rg70Var.h;
        vcu vcuVar = rg70Var.c;
        oqt oqtVar = rg70Var.b;
        if (zy5Var != null) {
            if (zy5Var instanceof ry5) {
                rg70Var.w(lg70.f19994a);
            } else if (zy5Var instanceof ole) {
                rg70Var.w(new og70(((ole) zy5Var).f25449a));
            } else if (zy5Var instanceof gle) {
                rg70Var.w(ng70.f23471a);
            } else {
                boolean z2 = true;
                if ((zy5Var instanceof yy5) || (zy5Var instanceof uy5)) {
                    rg70Var.w(new kg70(oqtVar.a() || (rg70Var.j && (vcuVar.a() == vrs.b)), z && !(zttVar.a().f4905a.f3145a == esr.FREE_BET)));
                } else if (zy5Var instanceof jy5) {
                    if (vcuVar.a() == vrs.b) {
                        rg70Var.w(new kg70(oqtVar.a() || rg70Var.j, z && !(zttVar.a().f4905a.f3145a == esr.FREE_BET)));
                    }
                } else if (zy5Var instanceof iy5) {
                    boolean z3 = ((iy5) zy5Var).f15573a.f4905a.f3145a == esr.FREE_BET;
                    boolean z4 = vcuVar.a() == vrs.f37917a;
                    boolean zA = vcuVar.a().a();
                    boolean z5 = (!z || z3 || (vcuVar.a() == vrs.c)) ? false : true;
                    boolean z6 = !z3 && (z4 || (rg70Var.e.a() && zA && oqtVar.a()));
                    boolean z7 = !z3 && z4;
                    rg70Var.w(new pg70(z6 || z5));
                    if (!z7 && !z5) {
                        z2 = false;
                    }
                    rg70Var.w(new mg70(z2));
                } else if (zy5Var instanceof ple) {
                    if (vcuVar.a() == vrs.c) {
                        rg70Var.w(new mg70(false));
                        rg70Var.w(new pg70(false));
                    }
                } else if (zy5Var instanceof ly5) {
                    rg70Var.w(new jg70(oqtVar.a()));
                    if (!oqtVar.a()) {
                        rg70Var.j = false;
                    }
                } else if ((zy5Var instanceof my5) && oqtVar.a()) {
                    rg70Var.j = true;
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        Object value;
        Object value2;
        tg70 tg70Var;
        boolean z;
        zy5 zy5Var = (zy5) obj;
        eh70 eh70Var = (eh70) this.f41192a;
        y5s y5sVar = eh70Var.u;
        lg60 lg60Var = eh70Var.o;
        mne mneVar = eh70Var.l;
        p7m0 p7m0Var = eh70Var.z;
        zy5Var.getClass();
        yje yjeVar = null;
        if (zy5Var instanceof sy5) {
            sac.V(jiu0.a(eh70Var), new cf70(1, eh70Var, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, mneVar.b, new e3p(eh70Var, yjeVar, (byte) 24), 10);
            eh70.D(eh70Var, 0L, 5);
        } else if (zy5Var instanceof fle) {
            lg60Var.a(((tg70) p7m0Var.getValue()).e);
            eh70Var.w(fy5.f10344a);
        } else if (zy5Var instanceof rle) {
            lg60Var.a(((tg70) p7m0Var.getValue()).e);
            eh70Var.w(qy5.f29518a);
        } else if (zy5Var instanceof nle) {
            sac.V(jiu0.a(eh70Var), new cf70(1, eh70Var, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, mneVar.b, new c670(eh70Var, yjeVar, (byte) 2), 10);
        } else if (zy5Var instanceof hle) {
            eh70Var.C(((hle) zy5Var).f13255a.f28916a, true, false);
        } else if (zy5Var instanceof oy5) {
            eh70.D(eh70Var, ((oy5) zy5Var).f26045a, 6);
        } else if (zy5Var instanceof ry5) {
            if (!eh70Var.w) {
                if (eh70Var.k.a()) {
                    eh70Var.E();
                } else {
                    eh70.D(eh70Var, 0L, 7);
                }
            }
        } else if (zy5Var instanceof ty5) {
            eh70Var.E();
        } else if (zy5Var instanceof ly5) {
            ly5 ly5Var = (ly5) zy5Var;
            if (ly5Var.f.a() && y5sVar.d) {
                eh70Var.y = eh70Var.e.a();
            }
            double d = ly5Var.d;
            double dA = eh70Var.f.a();
            do {
                value2 = p7m0Var.getValue();
                tg70Var = (tg70) value2;
                z = tg70Var.e >= Math.min(d, dA);
            } while (!p7m0Var.m(value2, tg70.a(tg70Var, 0.0d, 0.0d, null, 0.0d, false, z, z, false, false, false, false, 7999)));
        } else if (zy5Var instanceof mle) {
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, tg70.a((tg70) value, 0.0d, 0.0d, null, 0.0d, false, false, false, false, false, false, eh70Var.p.a() == vrs.f37917a || y5sVar.e, 2047)));
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2) {
        zy5 zy5Var = (zy5) obj;
        gh70 gh70Var = (gh70) this.f41192a;
        gh70Var.getClass();
        if (zy5Var != null) {
            byte b = 19;
            yje yjeVar = null;
            if (zy5Var instanceof hy5) {
                qjj.W(jiu0.a(gh70Var), null, null, new ku60(gh70Var, new fh70(((hy5) zy5Var).f13844a), yjeVar, b), 3);
            } else if ((zy5Var instanceof zle) || (zy5Var instanceof yle) || (zy5Var instanceof tle) || (zy5Var instanceof xle)) {
                qjj.W(jiu0.a(gh70Var), null, null, new ku60(gh70Var, new fh70(false), yjeVar, b), 3);
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:237:0x067f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        gt30 gt30Var;
        AnimatorSet animatorSet;
        AnimatorSet.Builder builderWith;
        AnimatorSet.Builder builderWith2;
        String str;
        aa50 aa50Var;
        byte b = this.h;
        String strH = "";
        byte b2 = 3;
        boolean z2 = true;
        f73 f73Var = null;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                qg20 qg20Var = (qg20) obj3;
                if (th instanceof CancellationException) {
                    qg20Var.getClass();
                } else {
                    qg20Var.t.b(th, new ed20(qg20Var, (byte) 2));
                }
                return Unit.f46060a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kn20 kn20Var = (kn20) obj3;
                if (kn20Var.j.getValue() instanceof li20) {
                    sac.V(jiu0.a(kn20Var), new km00(kn20Var, (byte) 21), null, kn20Var.e.b, new w620(zBooleanValue, kn20Var, (yje) null), 10);
                }
                return Unit.f46060a;
            case 2:
                sk30 sk30Var = (sk30) obj;
                ik30 ik30Var = (ik30) obj3;
                atz atzVar = ik30.W1;
                bg5 bg5Var = ik30Var.P1;
                if (sk30Var instanceof ok30) {
                    ok30 ok30Var = (ok30) sk30Var;
                    bg5Var.A(ok30Var.f25387a);
                    bg5Var.g();
                    ik30Var.G0().f.setRefreshing(false);
                    ik30Var.G0().f.setEnabled(true);
                    ik30Var.G0().d.setVisibility(8);
                    boolean z3 = ok30Var.b;
                    Drawable drawable = ik30Var.o0().getDrawable(z3 ? R.drawable.ic_glyph_filter_active : R.drawable.ic_glyph_filter_inactive);
                    if (z3) {
                        vcc.c0(drawable, ik30Var.o0(), R.attr.uikitPrimary);
                    }
                    s96 s96Var = ik30Var.G0().g.b;
                    ukm ukmVarB = s96Var != null ? s96Var.b("FILTER_NAV_ITEM_ID") : null;
                    if (ukmVarB != null) {
                        ukmVarB.setNavigationBarButtonImageDrawable(drawable);
                    }
                    ik30Var.J0(!ok30Var.c);
                    ik30Var.G0().b.b.setVisibility(0);
                    ik30Var.I0();
                    ik30Var.G0().e.setVisibility(0);
                } else if (sk30Var instanceof qk30) {
                    ik30Var.J0(false);
                    DSLottieEmptyContainer dSLottieEmptyContainer = ik30Var.G0().d;
                    jkm jkmVar = ((qk30) sk30Var).f28867a;
                    int i = DSLottieEmptyContainer.d;
                    dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh((byte) 12));
                    ik30Var.G0().d.setVisibility(0);
                    bg5Var.A(iun.f15405a);
                    ik30Var.G0().f.setRefreshing(false);
                    ik30Var.G0().f.setEnabled(false);
                    ik30Var.G0().b.b.setVisibility(8);
                    ik30Var.I0();
                    ik30Var.G0().e.setVisibility(8);
                } else if (Intrinsics.d(sk30Var, rk30.f30628a)) {
                    if (bg5Var.e.f.isEmpty()) {
                        z = false;
                        ik30Var.G0().f.setRefreshing(false);
                        ik30Var.G0().f.setEnabled(false);
                        ik30Var.G0().b.b.setVisibility(8);
                        ik30Var.G0().c.b.setVisibility(0);
                        x0x.s(ik30Var.G0().c.b);
                        ik30Var.G0().e.setVisibility(8);
                    } else {
                        z = false;
                        ik30Var.G0().e.setVisibility(0);
                        ik30Var.G0().f.setEnabled(true);
                        ik30Var.G0().f.setRefreshing(true);
                        ik30Var.G0().b.b.setVisibility(0);
                        ik30Var.I0();
                    }
                    ik30Var.G0().d.setVisibility(8);
                    ik30Var.J0(z);
                } else {
                    if (!(sk30Var instanceof pk30)) {
                        t9f.b();
                        return null;
                    }
                    ik30Var.G0().d.setVisibility(0);
                    ik30Var.G0().f.setRefreshing(false);
                    ik30Var.G0().f.setEnabled(false);
                    ik30Var.G0().d.a(((pk30) sk30Var).f27118a);
                    ik30Var.J0(true);
                    ik30Var.G0().e.setVisibility(8);
                    ik30Var.G0().b.b.setVisibility(8);
                    ik30Var.I0();
                }
                return Unit.f46060a;
            case 3:
                z0k0 z0k0Var = (z0k0) obj;
                ik30 ik30Var2 = (ik30) obj3;
                atz atzVar2 = ik30.W1;
                ik30Var2.getClass();
                boolean z4 = z0k0Var instanceof w0k0;
                s0k0 s0k0Var = s0k0.f31413a;
                if (z4) {
                    bek bekVar = cuk.l2;
                    androidx.fragment.app.e eVarC = ik30Var2.C();
                    eVarC.getClass();
                    w0k0 w0k0Var = (w0k0) z0k0Var;
                    int i2 = w0k0Var.f38353a;
                    String str2 = w0k0Var.b;
                    bekVar.getClass();
                    if (eVarC.J("DISCIPLINE_PICKER_DIALOG_TAG") == null) {
                        cuk cukVar = new cuk();
                        iiy[] iiyVarArr = cuk.m2;
                        cukVar.j2.I(cukVar, iiyVarArr[1], i2);
                        cukVar.k2.x(cukVar, iiyVarArr[2], str2);
                        cukVar.H0(eVarC, "DISCIPLINE_PICKER_DIALOG_TAG");
                    }
                    p7m0 p7m0Var = ik30Var2.H0().o;
                    p7m0Var.getClass();
                    p7m0Var.o(null, s0k0Var);
                } else if (!Intrinsics.d(z0k0Var, s0k0Var)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 4:
                is30 is30Var = (is30) obj;
                sr30 sr30Var = (sr30) obj3;
                iiy[] iiyVarArr2 = sr30.P1;
                sr30Var.getClass();
                if (is30Var != null) {
                    if (is30Var instanceof hs30) {
                        Fragment fragment = sr30Var.y;
                        us30 us30Var = fragment instanceof us30 ? (us30) fragment : null;
                        if (us30Var == null || !(us30Var.K0().p.getValue() instanceof tjc0)) {
                            ii iiVar = sr30Var.M1;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH2 = sr30Var.H(R.string.unfinished_game_attention);
                            String strH3 = sr30Var.H(R.string.unfinished_game_dialog_text);
                            String strH4 = sr30Var.H(R.string.unfinished_game_dialog_ok);
                            strH4.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, "MEMORY_UNFINISHED_GAME_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                            androidx.fragment.app.e eVarC2 = sr30Var.C();
                            eVarC2.getClass();
                            iiVar.d(dialogFields, eVarC2);
                        }
                    } else if (is30Var instanceof gs30) {
                        MemoryGameView memoryGameView = sr30Var.G0().d;
                        gs30 gs30Var = (gs30) is30Var;
                        int i3 = gs30Var.e;
                        int i4 = gs30Var.f11810a;
                        int i5 = gs30Var.b;
                        mbz mbzVar = new mbz(sr30Var, is30Var, (byte) 25);
                        gt30 gt30Var2 = (gt30) tx3.G(i5, memoryGameView.f46441a);
                        if (gt30Var2 != null) {
                            gt30Var2.a(i3, i4, new f73(new mbz(memoryGameView, mbzVar, (byte) 26), new np30(memoryGameView, b2), (byte) 0));
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 5:
                long j = 1000;
                fs30 fs30Var = (fs30) obj;
                sr30 sr30Var2 = (sr30) obj3;
                iiy[] iiyVarArr3 = sr30.P1;
                sr30Var2.getClass();
                if (fs30Var != null) {
                    if (fs30Var instanceof es30) {
                        es30 es30Var = (es30) fs30Var;
                        sr30Var2.G0().c.setText(es30Var.d);
                        sr30Var2.I0(true);
                        MemoryGameView memoryGameView2 = sr30Var2.G0().d;
                        int i6 = es30Var.c;
                        List list = es30Var.f8311a;
                        List list2 = es30Var.b;
                        gt30[] gt30VarArr = memoryGameView2.f46441a;
                        list.getClass();
                        list2.getClass();
                        if (list.size() == 9) {
                            int size = list.size();
                            int i7 = 0;
                            while (i7 < size) {
                                int iIntValue = ((Number) list.get(i7)).intValue();
                                if (iIntValue == 0) {
                                    gt30 gt30Var3 = gt30VarArr[i7];
                                    if (gt30Var3 != null) {
                                        gt30Var3.b();
                                    }
                                } else {
                                    gt30 gt30Var4 = gt30VarArr[i7];
                                    if (gt30Var4 != null) {
                                        int i8 = gt30.f;
                                        gt30Var4.a(i6, iIntValue, f73Var);
                                    }
                                }
                                if (list2.contains(Integer.valueOf(i7)) && (gt30Var = gt30VarArr[i7]) != null && !gt30Var.b && ((animatorSet = gt30Var.d) == null || animatorSet.isRunning() != z2)) {
                                    AnimatorSet animatorSet2 = gt30Var.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.end();
                                    }
                                    View view = new View(gt30Var.getContext());
                                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{gt30Var.getContext().getColor(R.color.static_white), gt30Var.getContext().getColor(R.color.static_transparent)}));
                                    gt30Var.addView(view);
                                    ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(500L);
                                    duration.getClass();
                                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(500L);
                                    duration2.getClass();
                                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(500L);
                                    duration3.getClass();
                                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(500L);
                                    duration4.getClass();
                                    duration2.setStartDelay(500L);
                                    duration3.setStartDelay(j);
                                    duration4.setStartDelay(1500L);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    gt30Var.d = animatorSet3;
                                    AnimatorSet.Builder builderPlay = animatorSet3.play(duration);
                                    if (builderPlay != null && (builderWith = builderPlay.with(duration2)) != null && (builderWith2 = builderWith.with(duration3)) != null) {
                                        builderWith2.with(duration4);
                                    }
                                    AnimatorSet animatorSet4 = gt30Var.d;
                                    if (animatorSet4 != null) {
                                        animatorSet4.addListener(new x73(null, new mbz(gt30Var, view, (byte) 27), 11));
                                    }
                                    AnimatorSet animatorSet5 = gt30Var.d;
                                    if (animatorSet5 != null) {
                                        animatorSet5.start();
                                    }
                                }
                                i7++;
                                z2 = true;
                                f73Var = null;
                                j = 1000;
                            }
                        }
                    } else if (fs30Var instanceof cs30) {
                        sr30Var2.G0().c.setText(R.string.memories_description_game);
                        MemoryGameView memoryGameView3 = sr30Var2.G0().d;
                        memoryGameView3.removeAllViews();
                        for (int i9 = 0; i9 < 9; i9++) {
                            Context context = memoryGameView3.getContext();
                            context.getClass();
                            gt30 gt30Var5 = new gt30(context);
                            gt30Var5.setListener(memoryGameView3);
                            memoryGameView3.f46441a[i9] = gt30Var5;
                            dyb.O(gt30Var5, new yr30(memoryGameView3, i9, (byte) 1));
                            memoryGameView3.addView(gt30Var5);
                        }
                        sr30Var2.I0(false);
                    } else if (fs30Var instanceof ds30) {
                        sr30Var2.I0(false);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 6:
                sr30 sr30Var3 = (sr30) obj3;
                iiy[] iiyVarArr4 = sr30.P1;
                sr30Var3.getClass();
                for (Pair pair : ((js30) obj).f17031a) {
                    String str3 = (String) pair.f46059a;
                    ht30 ht30Var = (ht30) pair.b;
                    MemoryPickerView memoryPickerView = sr30Var3.G0().e;
                    str3.getClass();
                    ht30Var.getClass();
                    ImageView imageView = new ImageView(memoryPickerView.getContext());
                    memoryPickerView.addView(imageView);
                    dyb.N(imageView, ymx.INTERVAL_1000, new bw20((Object) memoryPickerView, (Object) ht30Var, (byte) 13));
                    if (!memoryPickerView.isInEditMode()) {
                        List list3 = u0d.f34849a;
                        u0d.j(imageView, str3, 0, 0, null, null, null, 510);
                    }
                    imageView.setTransitionName("sport_icon" + ht30Var.getId());
                }
                return Unit.f46060a;
            case 7:
                ks30 ks30Var = (ks30) obj;
                sr30 sr30Var4 = (sr30) obj3;
                iiy[] iiyVarArr5 = sr30.P1;
                sr30Var4.G0().b.setVisibility(ks30Var.f18795a ? 0 : 8);
                egi0 egi0VarA = igi0.a((Function2) phu0.M(sr30Var4.G0().e).b);
                while (egi0VarA.hasNext()) {
                    ((View) egi0VarA.next()).setEnabled(ks30Var.b);
                }
                return Unit.f46060a;
            case 8:
                ((j340) obj3).P((Throwable) obj);
                return Unit.f46060a;
            case 9:
                ((j340) obj3).P((Throwable) obj);
                return Unit.f46060a;
            case 10:
                ((j340) obj3).P((Throwable) obj);
                return Unit.f46060a;
            case 11:
                ((j340) obj3).P((Throwable) obj);
                return Unit.f46060a;
            case 12:
                iiy[] iiyVarArr6 = ik60.Q1;
                ((kk60) ((ik60) obj3).P1.getValue()).A((List) obj);
                return Unit.f46060a;
            case 13:
                int iIntValue2 = ((Number) obj).intValue();
                ik60 ik60Var = (ik60) obj3;
                iiy[] iiyVarArr7 = ik60.Q1;
                roq0 roq0Var = ik60Var.N1;
                if (roq0Var == null) {
                    Intrinsics.h("tipsDialogScreenFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC3 = ik60Var.C();
                eVarC3.getClass();
                roq0Var.d(eVarC3, iIntValue2, "");
                return Unit.f46060a;
            case 14:
                int iIntValue3 = ((Number) obj).intValue();
                evz evzVar = cu60.U1;
                ((cu60) obj3).G0().b.setStyle(iIntValue3);
                return Unit.f46060a;
            case 15:
                y1b y1bVar = (y1b) obj;
                cu60 cu60Var = (cu60) obj3;
                evz evzVar2 = cu60.U1;
                cu60Var.getClass();
                kiu0 kiu0Var = cu60Var.P1;
                rek0 rek0Var = rek0.b;
                if (y1bVar != null) {
                    if (y1bVar instanceof s1b) {
                        ii iiVar2 = cu60Var.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH5 = cu60Var.H(R.string.congratulations);
                        String strH6 = cu60Var.H(R.string.lucky_wheel_free_spin_message);
                        String strH7 = cu60Var.H(R.string.ok);
                        strH7.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, "REQUEST_FREE_SPIN", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1496);
                        androidx.fragment.app.e eVarC4 = cu60Var.C();
                        eVarC4.getClass();
                        iiVar2.d(dialogFields2, eVarC4);
                    } else if (y1bVar instanceof x1b) {
                        wdk0 wdk0Var = cu60Var.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH8 = cu60Var.H(R.string.get_balance_list_error);
                        strH8.getClass();
                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH8, null, null, null, null, 124), cu60Var, null, null, false, null, 1020);
                    } else if (y1bVar instanceof w1b) {
                        peg0 peg0Var = cu60Var.N1;
                        if (peg0Var == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        ynb ynbVarI = ((yzn0) peg0Var.b).i();
                        bm5 bm5Var = bm5.d;
                        androidx.fragment.app.e eVarC5 = cu60Var.C();
                        eVarC5.getClass();
                        ynb.b(ynbVarI, bm5Var, null, eVarC5, false, "SELECT_BALANCE_REQUEST_KEY", 494);
                    } else if (y1bVar instanceof t1b) {
                        Throwable th2 = ((t1b) y1bVar).f33161a;
                        if (th2 != null) {
                            if (th2 instanceof qct) {
                                String strH9 = ((qct) th2).f28499a;
                                if (strH9.length() == 0) {
                                    strH9 = cu60Var.H(R.string.request_error);
                                    strH9.getClass();
                                }
                                strH = strH9;
                            } else if (th2 instanceof zhi0) {
                                String message = th2.getMessage();
                                if (message != null) {
                                    str = message;
                                }
                            } else {
                                strH = cu60Var.H(R.string.request_error);
                                strH.getClass();
                            }
                            str = strH;
                        } else {
                            strH = cu60Var.H(R.string.request_error);
                            strH.getClass();
                            str = strH;
                        }
                        if (str.length() > 0) {
                            wdk0 wdk0Var2 = cu60Var.M1;
                            if (wdk0Var2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            wdk0.k(wdk0Var2, new xdk0(rek0Var, str, null, null, null, null, 124), cu60Var, null, null, false, null, 1020);
                        }
                    } else if (y1bVar instanceof u1b) {
                        ((k370) kiu0Var.getValue()).y(y270.f41893a);
                    } else if (y1bVar instanceof v1b) {
                        ((k370) kiu0Var.getValue()).y(new z270(true));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 16:
                q1b q1bVar = (q1b) obj;
                cu60 cu60Var2 = (cu60) obj3;
                evz evzVar3 = cu60.U1;
                cu60Var2.getClass();
                o1b o1bVar = q1bVar.f27944a;
                if (o1bVar != null) {
                    cu60Var2.I0(cu60Var2.G0().g, o1bVar.f24472a, o1bVar.b, o1bVar.c, o1bVar.d, o1bVar.e, o1bVar.f);
                } else {
                    cu60Var2.G0().g.a();
                }
                o1b o1bVar2 = q1bVar.b;
                if (o1bVar2 != null) {
                    cu60Var2.I0(cu60Var2.G0().m, o1bVar2.f24472a, o1bVar2.b, o1bVar2.c, o1bVar2.d, o1bVar2.e, o1bVar2.f);
                    cu60Var2.G0().p.setVisibility(0);
                } else {
                    cu60Var2.G0().m.a();
                }
                o1b o1bVar3 = q1bVar.c;
                if (o1bVar3 != null) {
                    cu60Var2.I0(cu60Var2.G0().k, o1bVar3.f24472a, o1bVar3.b, o1bVar3.c, o1bVar3.d, o1bVar3.e, o1bVar3.f);
                } else {
                    cu60Var2.G0().k.a();
                }
                p1b p1bVar = q1bVar.d;
                a570.Companion.getClass();
                a570 a570VarA = t470.a(false, -1L);
                iun iunVar = iun.f15405a;
                if (!Intrinsics.d(p1bVar, new p1b(new jza(a570VarA, iunVar, 0.0d, "", 0.0d, iunVar, 0.0d, 0.0d, 0.0d, 0.0d, 0L), "", false, "", "", true))) {
                    jza jzaVar = p1bVar.f26192a;
                    double d = jzaVar.h;
                    boolean z5 = p1bVar.c;
                    boolean z6 = p1bVar.f;
                    double d2 = jzaVar.i;
                    boolean z7 = d2 <= d;
                    sj3.N0(cu60Var2.G0().o, Float.valueOf(16.0f));
                    cu60Var2.G0().l.setVisibility(0);
                    cu60Var2.G0().d.setVisibility(0);
                    cu60Var2.G0().p.setVisibility(!z6 ? 0 : 8);
                    cu60Var2.G0().i.setVisibility(z6 ? 0 : 8);
                    CashbackView cashbackView = cu60Var2.G0().p;
                    jk3 jk3Var = cashbackView.f46729a;
                    TextView textView = (TextView) jk3Var.e;
                    TimerView timerView = (TimerView) jk3Var.f;
                    textView.setText(cashbackView.getContext().getString(R.string.euro_sign, jzaVar.d));
                    long j2 = jzaVar.k;
                    boolean z8 = j2 > 0;
                    boolean z9 = d > 0.0d;
                    cashbackView.a(z8, z9);
                    if (z8) {
                        rdj rdjVar = rdj.f30294a;
                        timerView.v(rdj.k((System.currentTimeMillis() / 1000) + j2), true);
                        TimerView.u(timerView, new rd7((Object) cashbackView, z9, (byte) 2), 2);
                    }
                    cu60Var2.G0().g.b(p1bVar.d, z7, false, z5);
                    cu60Var2.G0().m.b(p1bVar.e, z7, false, z5);
                    CashbackCardView cashbackCardView = cu60Var2.G0().d;
                    String str4 = p1bVar.b;
                    double d3 = jzaVar.c;
                    str4.getClass();
                    dc3 dc3Var = cashbackCardView.f46726a;
                    TextView textView2 = (TextView) dc3Var.e;
                    pn40 pn40Var = pn40.f27267a;
                    p3u0 p3u0Var = p3u0.c;
                    textView2.setText(pn40.d(d2, str4, p3u0Var));
                    TextView textView3 = (TextView) dc3Var.d;
                    if (d > d2) {
                        d = d2;
                    }
                    textView3.setText(pn40.d(d, str4, p3u0Var));
                    ((ProgressBar) dc3Var.c).setProgress(si30.a(d3));
                }
                return Unit.f46060a;
            case 17:
                vfu0 vfu0Var = (vfu0) obj;
                cu60 cu60Var3 = (cu60) obj3;
                evz evzVar4 = cu60.U1;
                if (!(vfu0Var instanceof vfu0)) {
                    cu60Var3.getClass();
                    t9f.b();
                    return null;
                }
                boolean z10 = vfu0Var.f37352a;
                cu60Var3.G0().b.setVisibility(z10 ? 0 : 8);
                if (z10) {
                    cu60Var3.C().u0("SELECT_BALANCE_REQUEST_KEY", cu60Var3, new zt60(cu60Var3));
                    DsAccountSelection dsAccountSelection = cu60Var3.G0().b;
                    dsAccountSelection.A(ivb0.b, new yt60(cu60Var3, (byte) 4));
                    DsAccountSelection.v(dsAccountSelection, new yt60(cu60Var3, dsAccountSelection, (byte) 5), 3);
                    DsAccountSelection.z(dsAccountSelection, new yt60(cu60Var3, dsAccountSelection, (byte) 6));
                }
                return Unit.f46060a;
            case 18:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                cu60 cu60Var4 = (cu60) obj3;
                evz evzVar5 = cu60.U1;
                cu60Var4.G0().h.setVisibility(zBooleanValue2 ? 0 : 8);
                if (zBooleanValue2) {
                    cu60Var4.G0().i.setVisibility(8);
                    cu60Var4.G0().p.setVisibility(8);
                    cu60Var4.G0().d.setVisibility(8);
                    cu60Var4.G0().l.setVisibility(8);
                    sj3.N0(cu60Var4.G0().o, Float.valueOf(0.0f));
                    cu60Var4.G0().f.setVisibility(8);
                    cu60Var4.G0().j.setVisibility(8);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                n1b n1bVar = (n1b) obj;
                cu60 cu60Var5 = (cu60) obj3;
                evz evzVar6 = cu60.U1;
                cu60Var5.G0().b.setAccountTitle(n1bVar.f22742a);
                cu60Var5.G0().b.x(n1bVar.b, n1bVar.c);
                return Unit.f46060a;
            case 20:
                r1b r1bVar = (r1b) obj;
                cu60 cu60Var6 = (cu60) obj3;
                evz evzVar7 = cu60.U1;
                cu60Var6.getClass();
                Float fValueOf = Float.valueOf(0.0f);
                ra10 ra10Var = r1bVar.f29670a;
                if (ra10Var != null) {
                    cu60Var6.G0().i.setVisibility(8);
                    cu60Var6.G0().p.setVisibility(8);
                    cu60Var6.G0().d.setVisibility(8);
                    cu60Var6.G0().l.setVisibility(8);
                    sj3.N0(cu60Var6.G0().o, fValueOf);
                    LottieView lottieView = cu60Var6.G0().j;
                    lottieView.w(ra10Var);
                    lottieView.setVisibility(0);
                    cu60Var6.G0().f.setVisibility(8);
                } else {
                    jkm jkmVar2 = r1bVar.b;
                    if (jkmVar2 != null) {
                        cu60Var6.G0().i.setVisibility(8);
                        cu60Var6.G0().p.setVisibility(8);
                        cu60Var6.G0().d.setVisibility(8);
                        cu60Var6.G0().l.setVisibility(8);
                        sj3.N0(cu60Var6.G0().o, fValueOf);
                        DsLottieEmpty dsLottieEmpty = cu60Var6.G0().f;
                        dsLottieEmpty.d(jkmVar2);
                        dsLottieEmpty.setVisibility(0);
                        cu60Var6.G0().j.setVisibility(8);
                    } else {
                        cu60Var6.G0().f.setVisibility(8);
                        cu60Var6.G0().j.setVisibility(8);
                    }
                }
                return Unit.f46060a;
            case 21:
                b370 b370Var = (b370) obj;
                cu60 cu60Var7 = (cu60) obj3;
                evz evzVar8 = cu60.U1;
                h2b h2bVarH0 = cu60Var7.H0();
                pat patVar = b370Var.f1889a;
                patVar.getClass();
                if (patVar instanceof oat) {
                    h2bVarH0.B();
                }
                p7m0 p7m0Var2 = h2bVarH0.S;
                p7m0Var2.getClass();
                p7m0Var2.o(null, patVar);
                h2b h2bVarH1 = cu60Var7.H0();
                pat patVar2 = b370Var.b;
                patVar2.getClass();
                p7m0 p7m0Var3 = h2bVarH1.T;
                p7m0Var3.getClass();
                p7m0Var3.o(null, patVar2);
                return Unit.f46060a;
            case 22:
                hz60 hz60Var = (hz60) obj;
                ez60 ez60Var = (ez60) obj3;
                iiy[] iiyVarArr8 = ez60.S1;
                ez60Var.G0().b.setVisibility(hz60Var.b ? 0 : 8);
                ez60Var.G0().b.setTabBarDSModel(hz60Var.f13893a);
                ez60Var.G0().b.setOnTabClickListener(new cy60(1, ez60Var.H0(), g670.class, "onNavigationItemClick", "onNavigationItemClick$games_list(Ljava/lang/String;)V", 0, (byte) 4));
                ez60Var.G0().b.setSelectedTab(hz60Var.c);
                if (!hz60Var.b && (aa50Var = ez60Var.R1) != null) {
                    aa50Var.a(null);
                }
                return Unit.f46060a;
            case 23:
                return a(obj, obj2);
            case 24:
                return b(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((uf70) obj3).w((zy5) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return g(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return h(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return i(obj, obj2);
            default:
                zy5 zy5Var = (zy5) obj;
                ai70 ai70Var = (ai70) obj3;
                ztt zttVar = ai70Var.f;
                vcu vcuVar = ai70Var.c;
                oqt oqtVar = ai70Var.b;
                if (zy5Var != null) {
                    if (zy5Var instanceof ry5) {
                        ai70Var.w(uh70.f35664a);
                    } else if (zy5Var instanceof ole) {
                        ai70Var.w(new xh70(((ole) zy5Var).f25449a));
                    } else if (zy5Var instanceof gle) {
                        ai70Var.w(wh70.f39153a);
                    } else if ((zy5Var instanceof yy5) || (zy5Var instanceof uy5)) {
                        ai70Var.h.a(true);
                        ai70Var.w(new th70(oqtVar.a() || (ai70Var.j && (vcuVar.a() == vrs.b)), zttVar.a().f4905a.f3145a == esr.FREE_BET));
                    } else if (zy5Var instanceof jy5) {
                        if (vcuVar.a() == vrs.b) {
                            ai70Var.w(new th70(oqtVar.a() || ai70Var.j, zttVar.a().f4905a.f3145a == esr.FREE_BET));
                        }
                    } else if (zy5Var instanceof iy5) {
                        boolean z11 = ((iy5) zy5Var).f15573a.f4905a.f3145a == esr.FREE_BET;
                        boolean zA = ai70Var.g.a();
                        boolean zA2 = ai70Var.e.a();
                        boolean zA3 = oqtVar.a();
                        boolean z12 = !zA && vcuVar.a() == vrs.f37917a;
                        boolean z13 = !z11 && (z12 || (zA2 && zA && zA3));
                        z2 = !z11 && z12;
                        ai70Var.w(new yh70(z13));
                        ai70Var.w(new vh70(z2));
                    } else if (zy5Var instanceof ple) {
                        if (vcuVar.a() == vrs.c) {
                            ai70Var.w(new vh70(false));
                            ai70Var.w(new yh70(false));
                        }
                    } else if (zy5Var instanceof ly5) {
                        ai70Var.w(new sh70(oqtVar.a()));
                        if (!oqtVar.a()) {
                            ai70Var.j = false;
                        }
                    } else if ((zy5Var instanceof my5) && oqtVar.a()) {
                        ai70Var.j = true;
                    }
                }
                return Unit.f46060a;
        }
    }
}
