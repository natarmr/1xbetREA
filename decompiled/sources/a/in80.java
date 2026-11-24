package a;

import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import android.text.Spannable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.edit.ProfileEditViewModel$UiState;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class in80 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15061a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ in80(Object obj, Object obj2, byte b) {
        this.f15061a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        b5g0 b5g0Var = (b5g0) this.b;
        n7g0 n7g0Var = (n7g0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        cge0 cge0Var = n7g0.p2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null);
            zcl zclVar = qmk.f28987a;
            byte b = 13;
            lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean zI = fetVar.i(b5g0Var) | fetVar.i(n7g0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new dff0(b5g0Var, n7g0Var, b);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        d8g0 d8g0Var = (d8g0) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.X();
        } else if (d8g0Var instanceof c8g0) {
            fetVar.e0(592572898);
            n2x.k(0, fetVar);
            fetVar.r(false);
        } else if (d8g0Var instanceof b8g0) {
            fetVar.e0(592574865);
            knx.y(((b8g0) d8g0Var).c, function1, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!(d8g0Var instanceof a8g0)) {
                throw b1j.f(592571215, fetVar, false);
            }
            fetVar.e0(592580377);
            knx.M(((a8g0) d8g0Var).c, function1, fetVar, 0);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        kjh0 kjh0Var = (kjh0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gle0 gle0Var = kjh0.o2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            k3t0 k3t0Var = (k3t0) kjh0Var.l2.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                jjh0 jjh0Var = new jjh0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                fetVar.o0(jjh0Var);
                objP = jjh0Var;
            }
            m7x.n(l7m0Var, (Function1) ((jhy) objP), fetVar, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        xkh0 xkh0Var = (xkh0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gne0 gne0Var = xkh0.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            k3t0 k3t0VarP0 = xkh0Var.P0();
            boolean zI = fetVar.i(k3t0VarP0);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                jjh0 jjh0Var = new jjh0(1, k3t0VarP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                fetVar.o0(jjh0Var);
                objP = jjh0Var;
            }
            p7x.k(l7m0Var, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.b;
        t0i0 t0i0Var = (t0i0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strW = rsm0.w(R.string.select_cashback_activate, 0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                wul wulVar = new wul(lul.e, oe9.b, new ue9(strW), true, false, false);
                fetVar.o0(wulVar);
                objP = wulVar;
            }
            wul wulVar2 = (wul) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
            boolean zG = fetVar.g(function1) | fetVar.g(t0i0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new x6h0(function1, t0i0Var, (byte) 8);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarD, wulVar2, (Function0) objP2, fetVar, 48, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        hdj hdjVar = (hdj) this.b;
        x1i0 x1i0Var = (x1i0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        zie0 zie0Var = x1i0.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarA0 = wha0.a0(cjx.V(jm40.b, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            wtl wtlVar = new wtl(hdjVar);
            boolean zI = fetVar.i(x1i0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new gwg0((Object) x1i0Var, (byte) 24);
                fetVar.o0(objP);
            }
            y860.w(mm40VarA0, wtlVar, null, null, null, null, (Function1) objP, fetVar, 956);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        d3i0 d3i0Var = (d3i0) this.b;
        l7m0 l7m0Var = (l7m0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gle0 gle0Var = d3i0.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            a4x a4xVar = ((n3i0) l7m0Var.getValue()).f22852a;
            k3t0 k3t0VarT0 = d3i0Var.T0();
            boolean zI = fetVar.i(k3t0VarT0);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                nxh0 nxh0Var = new nxh0(1, k3t0VarT0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                fetVar.o0(nxh0Var);
                objP = nxh0Var;
            }
            d3i0Var.R0(0, fetVar, a4xVar, null, (Function1) ((jhy) objP));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        String strW;
        shd shdVar;
        yx7 yx7Var;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        pcy pcyVar;
        char c;
        pcy pcyVar2;
        zfn zfnVar;
        jm40 jm40Var;
        boolean z;
        f0k0 f0k0Var = (f0k0) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yx7 yx7Var2 = gqw0.k;
        ((u63) obj).getClass();
        if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.X();
        } else {
            if (f0k0Var == null) {
                fetVar.e0(50229024);
                fetVar.r(false);
                return Unit.f46060a;
            }
            if (f0k0Var instanceof zzj0) {
                fetVar.e0(-1106765179);
                strW = rsm0.w(R.string.cyber_game_screen_to_event_button_name, 0, fetVar);
                fetVar.r(false);
            } else {
                if (!(f0k0Var instanceof c0k0)) {
                    throw b1j.f(-1106767718, fetVar, false);
                }
                fetVar.e0(-1106760892);
                strW = rsm0.w(R.string.game_screen_to_simulation_button_name, 0, fetVar);
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(12.0f);
            pz40 pz40Var = s6t0.f31722a;
            long jM126getWhite200d7_KjU = StaticColors.INSTANCE.m126getWhite200d7_KjU();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var2, jM126getWhite200d7_KjU, ugg0VarA), 8.0f);
            boolean zG = fetVar.g(function1) | fetVar.i(f0k0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new x6h0(function1, f0k0Var, (byte) 29);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarJ, null, null, false, null, (Function0) objP, 28);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            yx7 yx7Var3 = gqw0.j;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var3, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar8);
            if (f0k0Var.e()) {
                fetVar.e0(-1967865775);
                shdVar2 = shdVar8;
                pcyVar = pcyVar3;
                shdVar = shdVar6;
                yx7Var = yx7Var3;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                c = 0;
                j6n.h(rsm0.w(R.string.live_new, 0, fetVar), kro0.f18776a, new ecu0(yx7Var2), 0, 0, fetVar, 48, 24);
                fetVar.r(false);
            } else {
                shdVar = shdVar6;
                yx7Var = yx7Var3;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                pcyVar = pcyVar3;
                c = 0;
                fetVar.e0(-1967622611);
                dww.c(a8k0.F(R.drawable.ic_glyph_line, 0, fetVar), null, o7k0.n(new ecu0(yx7Var2), 16.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 56, 0);
                fetVar.r(false);
            }
            ecu0 ecu0Var = new ecu0(yx7Var2);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = ecu0Var.e(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                fetVar.r0();
            }
            shd shdVar9 = shdVar4;
            jpm0.o(fetVar, x5dVarA, shdVar9);
            jpm0.o(fetVar, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar2);
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar2 = m8m0.f21378a;
            pcy pcyVar4 = pcyVar2;
            shd shdVar10 = shdVar3;
            shd shdVar11 = shdVar2;
            v8q0.a(strW, mm40VarD, ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, 48, 24960, 110584);
            fet fetVar2 = fetVar;
            qal0 qal0VarF = f0k0Var.f();
            if (qal0VarF == null) {
                fetVar2.e0(1587435973);
                fetVar2.r(false);
                zfnVar = zfnVar2;
                jm40Var = jm40Var2;
                z = true;
            } else {
                fetVar2.e0(1587435974);
                mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar9);
                jpm0.o(fetVar2, bh90VarM3, shdVar);
                vqd.u(iHashCode3, fetVar2, shdVar10, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar11);
                zfnVar = zfnVar2;
                jm40Var = jm40Var2;
                v8q0.a(ohs0.n(qal0VarF.f28401a, Separators.SP), null, ((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2, 0, 0, 131066);
                fetVar2 = fetVar2;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1215059310, new wzj0(qal0VarF, (byte) 3), fetVar2), fetVar2, 56);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar2), null, twn.l(yx7Var2, o7k0.n(jm40Var, 16.0f)), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(z);
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        String strW;
        shd shdVar;
        yx7 yx7Var;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        pcy pcyVar;
        char c;
        pcy pcyVar2;
        zfn zfnVar;
        jm40 jm40Var;
        boolean z;
        d0k0 d0k0Var = (d0k0) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yx7 yx7Var2 = gqw0.k;
        ((u63) obj).getClass();
        byte b = 0;
        if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.X();
        } else {
            if (d0k0Var == null) {
                fetVar.e0(-1032678494);
                fetVar.r(false);
                return Unit.f46060a;
            }
            if (d0k0Var instanceof xzj0) {
                fetVar.e0(1629248995);
                strW = rsm0.w(R.string.cyber_game_screen_to_event_button_name, 0, fetVar);
                fetVar.r(false);
            } else {
                if (!(d0k0Var instanceof a0k0)) {
                    throw b1j.f(1629246548, fetVar, false);
                }
                fetVar.e0(1629253282);
                strW = rsm0.w(R.string.game_screen_to_simulation_button_name, 0, fetVar);
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(12.0f);
            pz40 pz40Var = s6t0.f31722a;
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var2, jM75getBlack600d7_KjU, ugg0VarA), 8.0f);
            boolean zG = fetVar.g(function1) | fetVar.i(d0k0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new x6h0(function1, d0k0Var, (byte) 26);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarJ, null, null, false, null, (Function0) objP, 28);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            yx7 yx7Var3 = gqw0.j;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var3, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar8);
            if (d0k0Var.e()) {
                fetVar.e0(-1929315061);
                shdVar2 = shdVar8;
                pcyVar = pcyVar3;
                shdVar = shdVar6;
                yx7Var = yx7Var3;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                c = 0;
                j6n.h(rsm0.w(R.string.live_new, 0, fetVar), kro0.f18776a, new ecu0(yx7Var2), 0, 0, fetVar, 48, 24);
                fetVar.r(false);
            } else {
                shdVar = shdVar6;
                yx7Var = yx7Var3;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                pcyVar = pcyVar3;
                c = 0;
                fetVar.e0(-1929071897);
                dww.c(a8k0.F(R.drawable.ic_glyph_line, 0, fetVar), null, o7k0.n(new ecu0(yx7Var2), 16.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 56, 0);
                fetVar.r(false);
            }
            ecu0 ecu0Var = new ecu0(yx7Var2);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = ecu0Var.e(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                fetVar.r0();
            }
            shd shdVar9 = shdVar4;
            jpm0.o(fetVar, x5dVarA, shdVar9);
            jpm0.o(fetVar, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar2);
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar2 = m8m0.f21378a;
            pcy pcyVar4 = pcyVar2;
            shd shdVar10 = shdVar3;
            shd shdVar11 = shdVar2;
            v8q0.a(strW, mm40VarD, ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, 48, 24960, 110584);
            fet fetVar2 = fetVar;
            qal0 qal0VarF = d0k0Var.f();
            if (qal0VarF == null) {
                fetVar2.e0(125381331);
                fetVar2.r(false);
                zfnVar = zfnVar2;
                jm40Var = jm40Var2;
                z = true;
            } else {
                fetVar2.e0(125381332);
                mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar9);
                jpm0.o(fetVar2, bh90VarM3, shdVar);
                vqd.u(iHashCode3, fetVar2, shdVar10, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar11);
                zfnVar = zfnVar2;
                jm40Var = jm40Var2;
                v8q0.a(ohs0.n(qal0VarF.f28401a, Separators.SP), null, ((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2, 0, 0, 131066);
                fetVar2 = fetVar2;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1339071838, new wzj0(qal0VarF, b), fetVar2), fetVar2, 56);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar2), null, twn.l(yx7Var2, o7k0.n(jm40Var, 16.0f)), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(z);
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        String strW;
        shd shdVar;
        yx7 yx7Var;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        pcy pcyVar;
        char c;
        pcy pcyVar2;
        zfn zfnVar;
        jm40 jm40Var;
        boolean z;
        faj fajVar = (faj) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yx7 yx7Var2 = gqw0.k;
        ((u63) obj).getClass();
        if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.X();
        } else {
            if (fajVar == null) {
                fetVar.e0(-665368220);
                fetVar.r(false);
                return Unit.f46060a;
            }
            if (fajVar instanceof daj) {
                fetVar.e0(1086908353);
                strW = rsm0.w(R.string.cyber_game_screen_to_event_button_name, 0, fetVar);
                fetVar.r(false);
            } else {
                if (!(fajVar instanceof eaj)) {
                    throw b1j.f(1086905814, fetVar, false);
                }
                fetVar.e0(1086912640);
                strW = rsm0.w(R.string.game_screen_to_simulation_button_name, 0, fetVar);
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(12.0f);
            pz40 pz40Var = s6t0.f31722a;
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var2, jM75getBlack600d7_KjU, ugg0VarA), 8.0f);
            boolean zG = fetVar.g(function1) | fetVar.g(fajVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new x6h0(function1, fajVar, (byte) 27);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarJ, null, null, false, null, (Function0) objP, 28);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            yx7 yx7Var3 = gqw0.j;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var3, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar8);
            if (fajVar.e()) {
                fetVar.e0(1206160461);
                shdVar2 = shdVar8;
                pcyVar = pcyVar3;
                shdVar = shdVar6;
                yx7Var = yx7Var3;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                c = 0;
                j6n.h(rsm0.w(R.string.live_new, 0, fetVar), kro0.f18776a, new ecu0(yx7Var2), 0, 0, fetVar, 48, 24);
                fetVar.r(false);
            } else {
                shdVar = shdVar6;
                yx7Var = yx7Var3;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                pcyVar = pcyVar3;
                c = 0;
                fetVar.e0(1206403625);
                dww.c(a8k0.F(R.drawable.ic_glyph_line, 0, fetVar), null, o7k0.n(new ecu0(yx7Var2), 16.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 56, 0);
                fetVar.r(false);
            }
            ecu0 ecu0Var = new ecu0(yx7Var2);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = ecu0Var.e(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                fetVar.r0();
            }
            shd shdVar9 = shdVar4;
            jpm0.o(fetVar, x5dVarA, shdVar9);
            jpm0.o(fetVar, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar2);
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar2 = m8m0.f21378a;
            pcy pcyVar4 = pcyVar2;
            shd shdVar10 = shdVar3;
            shd shdVar11 = shdVar2;
            v8q0.a(strW, mm40VarD, ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, 48, 24960, 110584);
            fet fetVar2 = fetVar;
            qal0 qal0VarF = fajVar.f();
            if (qal0VarF == null) {
                fetVar2.e0(-259379307);
                fetVar2.r(false);
                zfnVar = zfnVar2;
                jm40Var = jm40Var2;
                z = true;
            } else {
                fetVar2.e0(-259379306);
                mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar9);
                jpm0.o(fetVar2, bh90VarM3, shdVar);
                vqd.u(iHashCode3, fetVar2, shdVar10, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar11);
                zfnVar = zfnVar2;
                jm40Var = jm40Var2;
                v8q0.a(ohs0.n(qal0VarF.f28401a, Separators.SP), null, ((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2, 0, 0, 131066);
                fetVar2 = fetVar2;
                z = true;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1636990108, new wzj0(qal0VarF, 1 == true ? 1 : 0), fetVar2), fetVar2, 56);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar2), null, twn.l(yx7Var2, o7k0.n(jm40Var, 16.0f)), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(z);
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        String strW;
        shd shdVar;
        yx7 yx7Var;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        pcy pcyVar;
        char c;
        pcy pcyVar2;
        zfn zfnVar;
        jm40 jm40Var;
        boolean z;
        e0k0 e0k0Var = (e0k0) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yx7 yx7Var2 = gqw0.k;
        ((u63) obj).getClass();
        if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.X();
        } else {
            if (e0k0Var == null) {
                fetVar.e0(1673771564);
                fetVar.r(false);
                return Unit.f46060a;
            }
            if (e0k0Var instanceof yzj0) {
                fetVar.e0(-1054392839);
                strW = rsm0.w(R.string.cyber_game_screen_to_event_button_name, 0, fetVar);
                fetVar.r(false);
            } else {
                if (!(e0k0Var instanceof b0k0)) {
                    throw b1j.f(-1054395378, fetVar, false);
                }
                fetVar.e0(-1054388552);
                strW = rsm0.w(R.string.game_screen_to_simulation_button_name, 0, fetVar);
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(12.0f);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var2, backgroundContent, ugg0VarA), 8.0f);
            boolean zG = fetVar.g(function1) | fetVar.i(e0k0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new x6h0(function1, e0k0Var, (byte) 28);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarJ, null, null, false, null, (Function0) objP, 28);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            yx7 yx7Var3 = gqw0.j;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var3, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar8);
            if (e0k0Var.e()) {
                fetVar.e0(-1746379086);
                shdVar2 = shdVar8;
                pcyVar = pcyVar3;
                shdVar = shdVar6;
                yx7Var = yx7Var3;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                c = 0;
                j6n.h(rsm0.w(R.string.live_new, 0, fetVar), oro0.f25744a, new ecu0(yx7Var2), 0, 0, fetVar, 48, 24);
                fetVar.r(false);
            } else {
                shdVar = shdVar6;
                yx7Var = yx7Var3;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                pcyVar = pcyVar3;
                c = 0;
                fetVar.e0(-1746125413);
                dww.c(a8k0.F(R.drawable.ic_glyph_line, 0, fetVar), null, o7k0.n(new ecu0(yx7Var2), 16.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
                fetVar.r(false);
            }
            ecu0 ecu0Var = new ecu0(yx7Var2);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = ecu0Var.e(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                fetVar.r0();
            }
            shd shdVar9 = shdVar4;
            jpm0.o(fetVar, x5dVarA, shdVar9);
            jpm0.o(fetVar, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar2);
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar2 = zaq0.b;
            pcy pcyVar4 = pcyVar2;
            shd shdVar10 = shdVar3;
            shd shdVar11 = shdVar2;
            v8q0.a(strW, mm40VarD, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, 48, 24960, 110584);
            fet fetVar2 = fetVar;
            qal0 qal0VarF = e0k0Var.f();
            if (qal0VarF == null) {
                fetVar2.e0(1577164769);
                fetVar2.r(false);
                zfnVar = zfnVar2;
                jm40Var = jm40Var2;
                z = true;
            } else {
                fetVar2.e0(1577164770);
                mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar9);
                jpm0.o(fetVar2, bh90VarM3, shdVar);
                vqd.u(iHashCode3, fetVar2, shdVar10, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar11);
                zfnVar = zfnVar2;
                jm40Var = jm40Var2;
                v8q0.a(ohs0.n(qal0VarF.f28401a, Separators.SP), null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2, 0, 0, 131066);
                fetVar2 = fetVar2;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1846368134, new wzj0(qal0VarF, (byte) 2), fetVar2), fetVar2, 56);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar2), null, twn.l(yx7Var2, o7k0.n(jm40Var, 16.0f)), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), fetVar2, 56, 0);
            fetVar2.r(z);
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        tck0 tck0Var = (tck0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        eke0 eke0Var = tck0.t2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            ddk0 ddk0Var = (ddk0) l7m0Var.getValue();
            k3t0 k3t0VarP0 = tck0Var.P0();
            boolean zI = fetVar.i(k3t0VarP0);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                gvj0 gvj0Var = new gvj0(1, k3t0VarP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                fetVar.o0(gvj0Var);
                objP = gvj0Var;
            }
            w9x.w(null, ddk0Var, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i;
        Typeface typeface;
        byte b = this.f15061a;
        byte b2 = 21;
        byte b3 = 20;
        jm40 jm40Var = jm40.b;
        Function0 function0 = e7z.u1;
        byte b4 = 2;
        cl5 cl5Var = ukd.f35823a;
        byte b5 = 16;
        Object obj4 = this.c;
        Object obj5 = this.b;
        byte b6 = 1;
        switch (b) {
            case 0:
                Map map = (Map) obj5;
                v9c v9cVar = (v9c) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zI = fetVar.i(map);
                    Object objP = fetVar.P();
                    Object obj6 = objP;
                    if (zI || objP == cl5Var) {
                        pl70 pl70Var = new pl70(map, (byte) 11);
                        fetVar.o0(pl70Var);
                        obj6 = pl70Var;
                    }
                    kwj kwjVarB = zk80.b(0, (Function0) obj6, fetVar, 0, 3);
                    Object objP2 = fetVar.P();
                    Object obj7 = objP2;
                    if (objP2 == cl5Var) {
                        vne vneVarI = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                        fetVar.o0(vneVarI);
                        obj7 = vneVarI;
                    }
                    vne vneVar = (vne) obj7;
                    mm40 mm40VarI = s5x0.I(jm40Var, hh80Var);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    boolean zG = fetVar.g(map);
                    Object objP3 = fetVar.P();
                    Object obj8 = objP3;
                    if (zG || objP3 == cl5Var) {
                        c0o c0oVar = jn80.h;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj9 : c0oVar) {
                            if (map.keySet().contains((jn80) obj9)) {
                                arrayList.add(obj9);
                            }
                        }
                        fetVar.o0(arrayList);
                        obj8 = arrayList;
                    }
                    List<jn80> list = (List) obj8;
                    q5x.e(kwjVarB, o7k0.d(o7k0.c(jm40Var, 1.0f), 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-147980090, new n82(map, list, v9cVar, b3), fetVar), fetVar, 100663344, 24576, 16124);
                    fetVar.e0(775653924);
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    for (jn80 jn80Var : list) {
                        jn80Var.getClass();
                        int iOrdinal = jn80Var.ordinal();
                        if (iOrdinal == 0) {
                            i = R.string.test_theme_title;
                        } else if (iOrdinal == 1) {
                            i = R.string.test_individual_title;
                        } else if (iOrdinal == 2) {
                            i = R.string.test_custom_title;
                        } else if (iOrdinal == 3) {
                            i = R.string.test_static_title;
                        } else if (iOrdinal == 4) {
                            i = R.string.test_widget_title;
                        } else {
                            if (iOrdinal != 5) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.test_aggregator_title;
                        }
                        arrayList2.add(xsm0.s(i, fetVar));
                    }
                    fetVar.r(false);
                    a4x a4xVarO0 = dyb.o0(arrayList2);
                    a6g a6gVar = new a6g(kwjVarB, xk80.class, "targetPage", "getTargetPage()I", 0, (byte) 11);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(jm40Var, 8.0f);
                    boolean zI2 = fetVar.i(vneVar) | fetVar.g(kwjVarB);
                    Object objP4 = fetVar.P();
                    Object obj10 = objP4;
                    if (zI2 || objP4 == cl5Var) {
                        euv euvVar = new euv(b6, vneVar, kwjVarB);
                        fetVar.o0(euvVar);
                        obj10 = euvVar;
                    }
                    ibc.o(mm40VarJ, a4xVarO0, fxh0.f10310a, false, a6gVar, (Function1) obj10, fetVar, 384, 8);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                l7m0 l7m0Var = (l7m0) obj5;
                dn90 dn90Var = (dn90) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i2 = dn90.m2;
                ((y5d) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
                    mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar2), null);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarV, 4.0f, 0.0f, 2);
                    lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                    boolean zG2 = fetVar2.g(l7m0Var) | fetVar2.i(dn90Var);
                    Object objP5 = fetVar2.P();
                    if (zG2 || objP5 == cl5Var) {
                        objP5 = new ka70(l7m0Var, dn90Var, b5);
                        fetVar2.o0(objP5);
                    }
                    b8k0.e(mm40VarL, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP5, fetVar2, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                l7m0 l7m0Var2 = (l7m0) obj5;
                kia0 kia0Var = (kia0) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i3 = kia0.m2;
                ((y5d) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(jm40Var, 16.0f, 8.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarK);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(function0);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    fetVar3.e0(-347908967);
                    for (sha0 sha0Var : ((mia0) l7m0Var2.getValue()).f21835a) {
                        String str = sha0Var.b;
                        boolean z = sha0Var.c;
                        boolean zI3 = fetVar3.i(kia0Var) | fetVar3.g(sha0Var);
                        Object objP6 = fetVar3.P();
                        if (zI3 || objP6 == cl5Var) {
                            objP6 = new qw80(kia0Var, sha0Var, b3);
                            fetVar3.o0(objP6);
                        }
                        kia0Var.P0(0, fetVar3, str, (Function0) objP6, z);
                    }
                    fetVar3.r(false);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                l7m0 l7m0Var3 = (l7m0) obj5;
                lja0 lja0Var = (lja0) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                jh70 jh70Var = lja0.n2;
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarK2 = s5x0.K(jm40Var, 16.0f, 8.0f);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode3 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM3 = fetVar4.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarK2);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(function0);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC2, gqw0.v);
                    fetVar4.e0(-1596994553);
                    for (ria0 ria0Var : ((nja0) l7m0Var3.getValue()).f23626a) {
                        String str2 = ria0Var.b;
                        boolean z2 = ria0Var.c;
                        boolean z3 = ria0Var.d;
                        boolean zI4 = fetVar4.i(lja0Var) | fetVar4.g(ria0Var);
                        Object objP7 = fetVar4.P();
                        if (zI4 || objP7 == cl5Var) {
                            objP7 = new qw80(lja0Var, ria0Var, b2);
                            fetVar4.o0(objP7);
                        }
                        lja0Var.P0(str2, z2, z3, (Function0) objP7, fetVar4, 0);
                    }
                    fetVar4.r(false);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                l7m0 l7m0Var4 = (l7m0) obj5;
                iwa0 iwa0Var = (iwa0) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i4 = iwa0.m2;
                ((ir8) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    vul vulVar = vul.b;
                    wul wulVar = ((twa0) l7m0Var4.getValue()).c;
                    wul wulVar2 = ((twa0) l7m0Var4.getValue()).d;
                    boolean zI5 = fetVar5.i(iwa0Var);
                    Object objP8 = fetVar5.P();
                    if (zI5 || objP8 == cl5Var) {
                        objP8 = new hwa0(iwa0Var, (byte) 1);
                        fetVar5.o0(objP8);
                    }
                    Function0 function1 = (Function0) objP8;
                    boolean zI6 = fetVar5.i(iwa0Var);
                    Object objP9 = fetVar5.P();
                    if (zI6 || objP9 == cl5Var) {
                        objP9 = new hwa0(iwa0Var, (byte) 2);
                        fetVar5.o0(objP9);
                    }
                    gkb.i(null, vulVar, wulVar, wulVar2, 0L, function1, (Function0) objP9, fetVar5, 48, 17);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                int iIntValue8 = ((Integer) obj3).intValue();
                fl70 fl70Var = org.xplatform.personal.impl.presentation.edit.a.X1;
                org.xplatform.personal.impl.presentation.edit.n nVarH0 = ((org.xplatform.personal.impl.presentation.edit.a) obj5).H0();
                w2c0 w2c0Var = ((ug60) obj4).f35609a;
                ProfileEditViewModel$UiState profileEditViewModel$UiStateB = nVarH0.B();
                if (profileEditViewModel$UiStateB instanceof ProfileEditViewModel$UiState.Loaded) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(iIntValue6, iIntValue7, iIntValue8);
                    rdj rdjVar = rdj.f30294a;
                    Date time = gregorianCalendar.getTime();
                    sdj sdjVar = org.xplatform.personal.impl.presentation.edit.n.v;
                    Locale locale = Locale.US;
                    locale.getClass();
                    String strC = rdj.c(rdjVar, sdjVar, time, locale, 20);
                    ProfileEditViewModel$UiState.Loaded loaded = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB;
                    Map map2 = loaded.f46786a;
                    Object obj11 = map2.get(w2c0Var);
                    ProfileEditUiModel profileEditUiModel = obj11 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj11 : null;
                    if (profileEditUiModel != null) {
                        ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel, 0, strC, false, false, "", 91);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put(w2c0Var, profileEditUiModelItemClickableZ);
                        loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap);
                    }
                    nVarH0.E(loaded);
                } else {
                    nVarH0.D(i2c0.f14040a);
                }
                return Unit.f46060a;
            case 6:
                q1c0 q1c0Var = (q1c0) obj5;
                Function1 function2 = (Function1) obj4;
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar6.g(hh80Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar6.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    e1c0.b(q1c0Var.b, hh80Var2, function2, fetVar6, (iIntValue9 << 3) & 112);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 7:
                kac0 kac0Var = (kac0) obj5;
                Function1 function3 = (Function1) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar7.U(1 & iIntValue10, (iIntValue10 & 17) != 16)) {
                    String strW = rsm0.w(R.string.check_promocode_summary, 0, fetVar7);
                    String strW2 = rsm0.w(R.string.enter_promocode, 0, fetVar7);
                    String str3 = kac0Var.d;
                    boolean z4 = kac0Var.c;
                    boolean zG3 = fetVar7.g(function3);
                    Object objP10 = fetVar7.P();
                    if (zG3 || objP10 == cl5Var) {
                        objP10 = new rpa0(function3, b2);
                        fetVar7.o0(objP10);
                    }
                    Function1 function4 = (Function1) objP10;
                    boolean zG4 = fetVar7.g(function3);
                    Object objP11 = fetVar7.P();
                    if (zG4 || objP11 == cl5Var) {
                        objP11 = new wta0(function3, (byte) 29);
                        fetVar7.o0(objP11);
                    }
                    qxw.l(null, strW, str3, z4, strW2, function4, (Function0) objP11, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 8:
                nuc0 nuc0Var = (nuc0) obj5;
                Function1 function5 = (Function1) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    l8x.H(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), nuc0Var, function5, fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 9:
                tsc0 tsc0Var = (tsc0) obj5;
                Function1 function6 = (Function1) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar9.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    float f = xfn.a(fetVar9).d;
                    float f2 = xfn.a(fetVar9).d;
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(jm40Var, f, 12.0f, f2, 6.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM4 = fetVar9.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar9, mm40VarM);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(function0);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar9);
                    jpm0.o(fetVar9, mm40VarC3, gqw0.v);
                    int i5 = tsc0Var.b;
                    boolean z5 = tsc0Var.c;
                    boolean z6 = tsc0Var.e;
                    String str4 = tsc0Var.f;
                    String str5 = tsc0Var.g;
                    String str6 = tsc0Var.h;
                    boolean zG5 = fetVar9.g(function6);
                    Object objP12 = fetVar9.P();
                    if (zG5 || objP12 == cl5Var) {
                        objP12 = new bac0(function6, (byte) 22);
                        fetVar9.o0(objP12);
                    }
                    hmw0.a(i5, z5, z6, str4, str5, str6, (Function0) objP12, fetVar9, 0);
                    fetVar9.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 10:
                String str7 = (String) obj5;
                azc0 azc0Var = (azc0) obj4;
                Function2 function7 = (Function2) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                function7.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar10.i(function7) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar10.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    fetVar10.X();
                } else if (str7.length() == 0) {
                    fetVar10.e0(435911678);
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarA = o7k0.A(jm40Var2, null, 3);
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iHashCode5 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM5 = fetVar10.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar10, mm40VarA);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(function0);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC4, gqw0.v);
                    String str8 = azc0Var.b;
                    ((g1t0) fetVar10.k(j1t0.e)).getClass();
                    y9q0 y9q0VarA = y9q0.a(g1t0.j(), ((ThemeColors) fetVar10.k(zaq0.b)).getSecondary60(), 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744446);
                    zcl zclVar7 = qmk.f28987a;
                    v8q0.a(str8, o2e.e0(s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), "TIP_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarA, fetVar10, 0, 0, 131068);
                    function7.invoke(fetVar10, Integer.valueOf(iIntValue13 & 14));
                    fetVar10.r(true);
                    fetVar10.r(false);
                } else {
                    fetVar10.e0(436636520);
                    h97.q(iIntValue13 & 14, fetVar10, function7, false);
                }
                return Unit.f46060a;
            case 11:
                String str9 = (String) obj5;
                zyc0 zyc0Var = (zyc0) obj4;
                Function2 function8 = (Function2) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                function8.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar11.i(function8) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar11.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    fetVar11.X();
                } else if (str9.length() == 0) {
                    fetVar11.e0(1889130039);
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarA2 = o7k0.A(jm40Var3, null, 3);
                    tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                    int iHashCode6 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM6 = fetVar11.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar11, mm40VarA2);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(function0);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, tj30VarC4, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC5, gqw0.v);
                    String str10 = zyc0Var.b;
                    ((g1t0) fetVar11.k(j1t0.e)).getClass();
                    y9q0 y9q0VarA2 = y9q0.a(g1t0.j(), ((ThemeColors) fetVar11.k(zaq0.b)).getSecondary60(), 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744446);
                    zcl zclVar8 = qmk.f28987a;
                    v8q0.a(str10, s5x0.N(jm40Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarA2, fetVar11, 0, 0, 131068);
                    function8.invoke(fetVar11, Integer.valueOf(iIntValue14 & 14));
                    fetVar11.r(true);
                    fetVar11.r(false);
                } else {
                    fetVar11.e0(1889837583);
                    h97.q(iIntValue14 & 14, fetVar11, function8, false);
                }
                return Unit.f46060a;
            case 12:
                String str11 = (String) obj5;
                tnd0 tnd0Var = (tnd0) obj4;
                fet fetVar12 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar12.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    zvw.n(null, str11, "", tnd0Var.b, fetVar12, 384);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 13:
                l7m0 l7m0Var5 = (l7m0) obj5;
                eue0 eue0Var = (eue0) obj4;
                fet fetVar13 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                zie0 zie0Var = eue0.n2;
                ((y5d) obj).getClass();
                if (fetVar13.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    ArrayList arrayList3 = ((qg8) l7m0Var5.getValue()).b;
                    k3t0 k3t0Var = (k3t0) eue0Var.m2.getValue();
                    boolean zI7 = fetVar13.i(k3t0Var);
                    Object objP13 = fetVar13.P();
                    if (zI7 || objP13 == cl5Var) {
                        objP13 = new d8e0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar13.o0(objP13);
                    }
                    pzw.n(null, arrayList3, (Function1) ((jhy) objP13), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 14:
                l7m0 l7m0Var6 = (l7m0) obj5;
                jue0 jue0Var = (jue0) obj4;
                fet fetVar14 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                gle0 gle0Var = jue0.n2;
                ((y5d) obj).getClass();
                if (fetVar14.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    ArrayList arrayList4 = ((wg8) l7m0Var6.getValue()).c;
                    k3t0 k3t0Var2 = (k3t0) jue0Var.m2.getValue();
                    boolean zI8 = fetVar14.i(k3t0Var2);
                    Object objP14 = fetVar14.P();
                    if (zI8 || objP14 == cl5Var) {
                        objP14 = new d8e0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                        fetVar14.o0(objP14);
                    }
                    azw.r(null, arrayList4, (Function1) ((jhy) objP14), fetVar14, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 15:
                l7m0 l7m0Var7 = (l7m0) obj5;
                z3f0 z3f0Var = (z3f0) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                zie0 zie0Var2 = z3f0.Y1;
                mm40Var.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= fetVar15.g(mm40Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar15.U(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    mtl mtlVar = ((v4f0) l7m0Var7.getValue()).g;
                    boolean zI9 = fetVar15.i(z3f0Var);
                    Object objP15 = fetVar15.P();
                    if (zI9 || objP15 == cl5Var) {
                        objP15 = new v3f0(z3f0Var, (byte) 1);
                        fetVar15.o0(objP15);
                    }
                    bkb.f(mm40Var, mtlVar, null, false, null, (Function1) objP15, fetVar15, iIntValue18 & 14, 28);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 16:
                w6k w6kVar = (w6k) obj5;
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var.getClass();
                pj30Var.getClass();
                long j = ((h7k0) obj4).f12579a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(w6kVar.w0(Float.intBitsToFloat((int) (j >> 32))))) << 32) | (((long) Float.floatToRawIntBits(w6kVar.w0(Float.intBitsToFloat((int) (j & 4294967295L))))) & 4294967295L);
                float fI = p4e.i(p4eVar.f26347a);
                long j2 = p4eVar.f26347a;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(p4e.h(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(fI)) << 32);
                float fMax = Math.max(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) / Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) / Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i6 = l1h0.f19253a;
                int iB = si30.b(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)) * Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
                int iB2 = si30.b(Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)) * Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                if (((iB >= 0 ? (char) 1 : (char) 0) & (iB2 >= 0 ? (char) 1 : (char) 0)) == 0) {
                    zcx.a("width and height must be >= 0");
                }
                return vj30.x(vj30Var, p4e.i(j2), p4e.h(j2), new dff0(pj30Var.S(r4e.h(iB, iB, iB2, iB2)), p4eVar));
            case 17:
                return a(obj, obj2, obj3);
            case 18:
                return b(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return c(obj, obj2, obj3);
            case 20:
                return g(obj, obj2, obj3);
            case 21:
                return h(obj, obj2, obj3);
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return l(obj, obj2, obj3);
            case 24:
                return o(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return p(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return r(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return s(obj, obj2, obj3);
            default:
                Spannable spannable = (Spannable) obj5;
                awh awhVar = (awh) obj4;
                smk0 smk0Var = (smk0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                int iIntValue20 = ((Integer) obj3).intValue();
                nrq nrqVar = smk0Var.f;
                psq psqVar = smk0Var.c;
                if (psqVar == null) {
                    psqVar = psq.e;
                }
                lsq lsqVar = smk0Var.d;
                int i7 = lsqVar != null ? lsqVar.f20592a : 0;
                msq msqVar = smk0Var.e;
                int i8 = msqVar != null ? msqVar.f22332a : 65535;
                v03 v03Var = (v03) awhVar.b;
                b1t0 b1t0VarB = ((orq) v03Var.e).b(nrqVar, psqVar, i7, i8);
                if (b1t0VarB instanceof a1t0) {
                    Object obj12 = ((a1t0) b1t0VarB).f90a;
                    obj12.getClass();
                    typeface = (Typeface) obj12;
                } else {
                    y3v y3vVar = new y3v(b1t0VarB, v03Var.j);
                    v03Var.j = y3vVar;
                    Object obj13 = y3vVar.d;
                    obj13.getClass();
                    typeface = (Typeface) obj13;
                }
                spannable.setSpan(new fyc(typeface, b4), iIntValue19, iIntValue20, 33);
                return Unit.f46060a;
        }
    }
}
