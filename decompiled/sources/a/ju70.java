package a;

import android.app.Activity;
import android.content.Context;
import android.javax.sip.message.Response;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ju70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sfc f17139a = new sfc(9);
    public static final ugd b = new ugd(73836941, false, new qbd((byte) 27));
    public static final ugd c = new ugd(-1744948620, false, new bhd(25));
    public static final ugd d = new ugd(-1767864404, false, new bhd(26));
    public static final ugd e = new ugd(919356954, false, new lhd(2));
    public static final ugd f = new ugd(801720185, false, new lhd(6));
    public static final ugd g = new ugd(684083416, false, new lhd(10));
    public static final ugd h = new ugd(1072295364, false, new qhd(5));
    public static final v0h0 i = new v0h0(new awg0(9), new xwg0(2));

    public static final void A(tar0 tar0Var, boolean z, boolean z2, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-1007064984);
        int i3 = i2 | (fetVar.g(tar0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = q8a.k0(o7k0.d(jm40Var, 1.0f), enx.f8115a);
            nw3 nw3Var = uc9.g;
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.5f, jm40Var, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarA, 16.0f, 16.0f, 8.0f, 10.0f);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
            String str = tar0Var.f33628a;
            y9q0 y9q0VarG = g1t0.g();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarA2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, y9q0VarG, fetVar, 0, 24960, 110584);
            v8q0.a(tar0Var.b, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar, 0, 0, 131064);
            fetVar.r(true);
            jcb.H(o7k0.s(o7k0.c(s5x0.N(jm40Var, 0.0f, z ? 14.0f : 0.0f, 0.0f, z2 ? 8.0f : 0.0f, 5), 1.0f), 1.0f), 0.0f, s6t0.b().f33626a.getSeparator(), fetVar, 0, 2);
            mm40 mm40VarM2 = s5x0.M(zhg0Var.a(0.5f, jm40Var, true), 8.0f, 16.0f, 16.0f, 10.0f);
            thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(tar0Var.d, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar, 0, 0, 131064);
            v8q0.a(tar0Var.c, zhg0Var.a(1.0f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uo1(tar0Var, z, z2, i2, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0206  */
    /* JADX WARN: Code duplicated, block: B:70:0x020a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0225  */
    /* JADX WARN: Code duplicated, block: B:75:0x023d  */
    /* JADX WARN: Code duplicated, block: B:76:0x023f  */
    /* JADX WARN: Code duplicated, block: B:83:0x024e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0268  */
    public static final void B(mm40 mm40Var, nua0 nua0Var, zcz zczVar, Function1 function1, fet fetVar, int i2) {
        zcz zczVar2;
        mm40 mm40Var2;
        mm40 mm40Var3;
        cl5 cl5Var;
        cl5 cl5Var2;
        iua0 iua0Var;
        boolean z;
        Object objP;
        nua0 nua0Var2 = nua0Var;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        nua0Var2.getClass();
        zczVar.getClass();
        function2.getClass();
        fetVar2.g0(1322686280);
        int i3 = i2 | 6 | (fetVar2.g(nua0Var2) ? 32 : 16) | (fetVar2.g(zczVar) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            e2d e2dVarD = nip.d(null, null, fetVar2, 7);
            Context context = (Context) fetVar2.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar2);
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objP2 = fetVar2.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (z2 || objP2 == cl5Var3) {
                objP2 = new wta0(function2, b2);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = i4 == 2048;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var3) {
                objP3 = new wta0(function2, b3);
                fetVar2.o0(objP3);
            }
            Window window2 = window;
            v3c.A(function0, (Function0) objP3, null, fetVar2, 0, 4);
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zI = fetVar2.i(window2) | fetVar2.i(context) | fetVar2.h(zC);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var3) {
                objP4 = new la2(window2, context, zC, (byte) 6);
                fetVar2.o0(objP4);
            }
            s0x.d(boolValueOf, null, (Function1) objP4, fetVar2, 0);
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, backgroundContent, ljcVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o050.W(jm40Var);
            qim qimVar = nua0Var2.c;
            boolean z5 = i4 == 2048;
            Object objP5 = fetVar2.P();
            if (z5) {
                mm40Var3 = mm40VarW;
                cl5Var = cl5Var3;
            } else {
                mm40Var3 = mm40VarW;
                cl5Var = cl5Var3;
                if (objP5 != cl5Var) {
                    cl5Var2 = cl5Var;
                }
                cl5 cl5Var4 = cl5Var2;
                ckb.k(mm40Var3, qimVar, true, e2dVarD, null, (Function1) objP5, fetVar2, 24960, 0);
                fetVar2 = fetVar2;
                mm40 mm40VarC = nip.c(i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ljcVar), e2dVarD, fetVar2, 0);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarC);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, n0qVar);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                nua0Var2 = nua0Var;
                iua0Var = nua0Var2.d;
                if (iua0Var.f15387a.isEmpty()) {
                    function2 = function1;
                    mm40Var2 = jm40Var;
                    fetVar2.e0(-1119961428);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1120451538);
                    mm40Var2 = jm40Var;
                    mm40 mm40VarQ2 = i120.Q(mm40Var2, iua0Var.c, ljcVar);
                    wxl wxlVar = iua0Var.b;
                    a4x a4xVar = iua0Var.f15387a;
                    if (i4 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objP = fetVar2.P();
                    if (!z || objP == cl5Var4) {
                        function2 = function1;
                        objP = new rpa0(function2, (byte) 9);
                        fetVar2.o0(objP);
                    } else {
                        function2 = function1;
                    }
                    wpm0.d(mm40VarQ2, wxlVar, a4xVar, (Function1) objP, fetVar2, 0);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
                zczVar2 = zczVar;
                obc.d(nip.f23600a.a(e2dVarD), u1c.M(1669784534, new znk(nua0Var2, zczVar2, function2, (byte) 2), fetVar2), fetVar2, 56);
                ohs0.x(fetVar2, true, true, true);
            }
            cl5Var2 = cl5Var;
            objP5 = new rpa0(function2, (byte) 8);
            fetVar2.o0(objP5);
            cl5 cl5Var5 = cl5Var2;
            ckb.k(mm40Var3, qimVar, true, e2dVarD, null, (Function1) objP5, fetVar2, 24960, 0);
            fetVar2 = fetVar2;
            mm40 mm40VarC3 = nip.c(i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ljcVar), e2dVarD, fetVar2, 0);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarC3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar4);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC5 = kbc.c0(fetVar2, n0qVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA3, shdVar);
            jpm0.o(fetVar2, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC5, shdVar4);
            nua0Var2 = nua0Var;
            iua0Var = nua0Var2.d;
            if (iua0Var.f15387a.isEmpty()) {
                fetVar2.e0(-1120451538);
                mm40Var2 = jm40Var;
                mm40 mm40VarQ3 = i120.Q(mm40Var2, iua0Var.c, ljcVar);
                wxl wxlVar2 = iua0Var.b;
                a4x a4xVar2 = iua0Var.f15387a;
                if (i4 == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (z) {
                    function2 = function1;
                    objP = new rpa0(function2, (byte) 9);
                    fetVar2.o0(objP);
                } else {
                    function2 = function1;
                    objP = new rpa0(function2, (byte) 9);
                    fetVar2.o0(objP);
                }
                wpm0.d(mm40VarQ3, wxlVar2, a4xVar2, (Function1) objP, fetVar2, 0);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                function2 = function1;
                mm40Var2 = jm40Var;
                fetVar2.e0(-1119961428);
                fetVar2.r(false);
            }
            zczVar2 = zczVar;
            obc.d(nip.f23600a.a(e2dVarD), u1c.M(1669784534, new znk(nua0Var2, zczVar2, function2, (byte) 2), fetVar2), fetVar2, 56);
            ohs0.x(fetVar2, true, true, true);
        } else {
            zczVar2 = zczVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 27, i2, (Object) mm40Var2, (Object) nua0Var2, (Object) zczVar2, (Object) function2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x028e  */
    /* JADX WARN: Code duplicated, block: B:91:0x021f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:98:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0269  */
    public static final void C(final ru50 ru50Var, final Fragment fragment, final boolean z, final Function1 function1, fet fetVar, final int i2) {
        int i3;
        ru50 ru50Var2;
        Function1 function2;
        yfe0 yfe0VarU;
        Function2 function3;
        int i4;
        kwj kwjVar;
        fet fetVar2;
        char c2;
        boolean z2;
        boolean z3;
        Object objP;
        cl5 cl5Var;
        byte b2;
        w6k w6kVar;
        boolean zG;
        Object objP2;
        boolean zG2;
        Object objP3;
        fet fetVar3 = fetVar;
        int i5 = ru50Var.c;
        fetVar3.g0(-897043065);
        int i6 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i6 == 0) {
            i3 = (fetVar3.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar3.g(ru50Var) : fetVar3.i(ru50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar3.i(fragment) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar3.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar3.i(function1) ? 16384 : 8192;
        }
        byte b3 = 0;
        if (fetVar3.U(i3 & 1, (i3 & 9363) != 9362)) {
            List list = ru50Var.b;
            List list2 = ru50Var.f31109a;
            if (list.isEmpty()) {
                yfe0VarU = fetVar3.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b4 = 1;
                function3 = new Function2() { // from class: a.mu50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b4;
                        int i7 = i2;
                        switch (b5) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ju70.C(ru50Var, fragment, z, function1, (fet) obj, x8x.L(i7 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ju70.C(ru50Var, fragment, z, function1, (fet) obj, x8x.L(i7 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                int i7 = i3 & 112;
                boolean z4 = i7 == 32 || ((i3 & 64) != 0 && fetVar3.i(ru50Var));
                Object objP4 = fetVar3.P();
                cl5 cl5Var2 = ukd.f35823a;
                if (z4 || objP4 == cl5Var2) {
                    objP4 = new pu50(ru50Var, b3);
                    fetVar3.o0(objP4);
                }
                kwj kwjVarB = zk80.b(i5, (Function0) objP4, fetVar3, 0, 2);
                function1.invoke(new gu50(kwjVarB.k()));
                n0q n0qVar = o7k0.c;
                mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, 0.0f, 0.0f, knm0.t(0, fetVar3, z), 7);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar3.T);
                bh90 bh90VarM = fetVar3.m();
                mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarN);
                mkd.c0.getClass();
                fetVar3.i0();
                boolean z5 = fetVar3.S;
                int i8 = i3;
                pcy pcyVar = e7z.u1;
                if (z5) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(fetVar3, tj30VarC, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar3, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar3, numValueOf, shdVar3);
                jpm0.n(fetVar3);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar3, mm40VarC0, shdVar4);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                int iHashCode2 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM2 = fetVar3.m();
                mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, x5dVarA, shdVar);
                jpm0.o(fetVar3, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
                jpm0.o(fetVar3, mm40VarC1, shdVar4);
                if (list2.size() > 1) {
                    fetVar3.e0(1595676447);
                    zcl zclVar = qmk.f28987a;
                    c2 = 2;
                    kwjVar = kwjVarB;
                    i4 = i7;
                    z2 = false;
                    D(s5x0.L(o7k0.e(jm40Var, 18.0f), 12.0f, 0.0f, 2), kwjVar, list2.size(), 0.0f, 0.0f, 0L, 0L, fetVar3, 0);
                    fetVar2 = fetVar3;
                    fetVar2.r(false);
                } else {
                    i4 = i7;
                    kwjVar = kwjVarB;
                    fetVar2 = fetVar3;
                    c2 = 2;
                    z2 = false;
                    fetVar2.e0(1595983967);
                    fetVar2.r(false);
                }
                kwj kwjVar2 = kwjVar;
                boolean z6 = z2;
                fetVar3 = fetVar;
                q5x.e(kwjVar2, null, null, null, 1, 0.0f, null, null, false, null, null, null, null, u1c.M(-489012924, new d2s(ru50Var, fragment, (byte) 12), fetVar2), fetVar3, 24576, 24576, 16366);
                Integer numValueOf2 = Integer.valueOf(i5);
                boolean zG3 = fetVar3.g(kwjVar2);
                if (i4 != 32) {
                    ru50Var2 = ru50Var;
                    boolean z7 = ((i8 & 64) == 0 || !fetVar3.i(ru50Var2)) ? z6 : true;
                    z3 = zG3 | z7;
                    objP = fetVar3.P();
                    yje yjeVar = null;
                    if (z3) {
                        cl5Var = r19;
                    } else {
                        cl5Var = cl5Var2;
                        if (objP == cl5Var) {
                        }
                        m0x0.t(fetVar3, numValueOf2, (Function2) objP);
                        b2 = 1;
                        fetVar3.r(true);
                        w6kVar = (w6k) fetVar3.k(bmd.h);
                        zcl zclVar2 = qmk.f28987a;
                        boolean z8 = ru50Var2.d;
                        mm40 mm40VarN2 = s5x0.N(jr8.f16991a.b(jm40Var, gqw0.i), 0.0f, 0.0f, 16.0f, 72.0f, 3);
                        zG = fetVar3.g(w6kVar);
                        objP2 = fetVar3.P();
                        if (zG || objP2 == cl5Var) {
                            objP2 = new u05(w6kVar, b2);
                            fetVar3.o0(objP2);
                        }
                        pzn pznVarA = kzn.k(null, (Function1) objP2, 1).a(kzn.d(null, 0.3f, 1));
                        zG2 = fetVar3.g(w6kVar);
                        objP3 = fetVar3.P();
                        if (zG2 || objP3 == cl5Var) {
                            objP3 = new u05(w6kVar, (byte) 2);
                            fetVar3.o0(objP3);
                        }
                        function2 = function1;
                        b34.h(z8, mm40VarN2, pznVarA, kzn.m((Function1) objP3).a(kzn.e(null, 1)), null, u1c.M(-1911175579, new nc40(function2, (byte) 6), fetVar3), fetVar3, 196608, 16);
                        fetVar3.r(true);
                    }
                    objP = new j940(kwjVar2, ru50Var2, yjeVar, (byte) 14);
                    fetVar3.o0(objP);
                    m0x0.t(fetVar3, numValueOf2, (Function2) objP);
                    b2 = 1;
                    fetVar3.r(true);
                    w6kVar = (w6k) fetVar3.k(bmd.h);
                    zcl zclVar3 = qmk.f28987a;
                    boolean z9 = ru50Var2.d;
                    mm40 mm40VarN3 = s5x0.N(jr8.f16991a.b(jm40Var, gqw0.i), 0.0f, 0.0f, 16.0f, 72.0f, 3);
                    zG = fetVar3.g(w6kVar);
                    objP2 = fetVar3.P();
                    if (zG) {
                        objP2 = new u05(w6kVar, b2);
                        fetVar3.o0(objP2);
                    } else {
                        objP2 = new u05(w6kVar, b2);
                        fetVar3.o0(objP2);
                    }
                    pzn pznVarA2 = kzn.k(null, (Function1) objP2, 1).a(kzn.d(null, 0.3f, 1));
                    zG2 = fetVar3.g(w6kVar);
                    objP3 = fetVar3.P();
                    if (zG2) {
                        objP3 = new u05(w6kVar, (byte) 2);
                        fetVar3.o0(objP3);
                    } else {
                        objP3 = new u05(w6kVar, (byte) 2);
                        fetVar3.o0(objP3);
                    }
                    function2 = function1;
                    b34.h(z9, mm40VarN3, pznVarA2, kzn.m((Function1) objP3).a(kzn.e(null, 1)), null, u1c.M(-1911175579, new nc40(function2, (byte) 6), fetVar3), fetVar3, 196608, 16);
                    fetVar3.r(true);
                } else {
                    ru50Var2 = ru50Var;
                }
                z3 = zG3 | z7;
                objP = fetVar3.P();
                yje yjeVar2 = null;
                if (z3) {
                    cl5Var = cl5Var2;
                    if (objP == cl5Var) {
                    }
                    m0x0.t(fetVar3, numValueOf2, (Function2) objP);
                    b2 = 1;
                    fetVar3.r(true);
                    w6kVar = (w6k) fetVar3.k(bmd.h);
                    zcl zclVar4 = qmk.f28987a;
                    boolean z10 = ru50Var2.d;
                    mm40 mm40VarN4 = s5x0.N(jr8.f16991a.b(jm40Var, gqw0.i), 0.0f, 0.0f, 16.0f, 72.0f, 3);
                    zG = fetVar3.g(w6kVar);
                    objP2 = fetVar3.P();
                    if (zG) {
                        objP2 = new u05(w6kVar, b2);
                        fetVar3.o0(objP2);
                    } else {
                        objP2 = new u05(w6kVar, b2);
                        fetVar3.o0(objP2);
                    }
                    pzn pznVarA3 = kzn.k(null, (Function1) objP2, 1).a(kzn.d(null, 0.3f, 1));
                    zG2 = fetVar3.g(w6kVar);
                    objP3 = fetVar3.P();
                    if (zG2) {
                        objP3 = new u05(w6kVar, (byte) 2);
                        fetVar3.o0(objP3);
                    } else {
                        objP3 = new u05(w6kVar, (byte) 2);
                        fetVar3.o0(objP3);
                    }
                    function2 = function1;
                    b34.h(z10, mm40VarN4, pznVarA3, kzn.m((Function1) objP3).a(kzn.e(null, 1)), null, u1c.M(-1911175579, new nc40(function2, (byte) 6), fetVar3), fetVar3, 196608, 16);
                    fetVar3.r(true);
                } else {
                    cl5Var = r19;
                }
                objP = new j940(kwjVar2, ru50Var2, yjeVar2, (byte) 14);
                fetVar3.o0(objP);
                m0x0.t(fetVar3, numValueOf2, (Function2) objP);
                b2 = 1;
                fetVar3.r(true);
                w6kVar = (w6k) fetVar3.k(bmd.h);
                zcl zclVar5 = qmk.f28987a;
                boolean z11 = ru50Var2.d;
                mm40 mm40VarN5 = s5x0.N(jr8.f16991a.b(jm40Var, gqw0.i), 0.0f, 0.0f, 16.0f, 72.0f, 3);
                zG = fetVar3.g(w6kVar);
                objP2 = fetVar3.P();
                if (zG) {
                    objP2 = new u05(w6kVar, b2);
                    fetVar3.o0(objP2);
                } else {
                    objP2 = new u05(w6kVar, b2);
                    fetVar3.o0(objP2);
                }
                pzn pznVarA4 = kzn.k(null, (Function1) objP2, 1).a(kzn.d(null, 0.3f, 1));
                zG2 = fetVar3.g(w6kVar);
                objP3 = fetVar3.P();
                if (zG2) {
                    objP3 = new u05(w6kVar, (byte) 2);
                    fetVar3.o0(objP3);
                } else {
                    objP3 = new u05(w6kVar, (byte) 2);
                    fetVar3.o0(objP3);
                }
                function2 = function1;
                b34.h(z11, mm40VarN5, pznVarA4, kzn.m((Function1) objP3).a(kzn.e(null, 1)), null, u1c.M(-1911175579, new nc40(function2, (byte) 6), fetVar3), fetVar3, 196608, 16);
                fetVar3.r(true);
            }
            yfe0VarU.d = function3;
        }
        ru50Var2 = ru50Var;
        function2 = function1;
        fetVar3.X();
        yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            final byte b5 = 0;
            final Function1 function4 = function2;
            final ru50 ru50Var3 = ru50Var2;
            function3 = new Function2() { // from class: a.mu50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b6 = b5;
                    int i9 = i2;
                    switch (b6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ju70.C(ru50Var3, fragment, z, function4, (fet) obj, x8x.L(i9 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ju70.C(ru50Var3, fragment, z, function4, (fet) obj, x8x.L(i9 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function3;
        }
    }

    public static final void D(mm40 mm40Var, kwj kwjVar, final int i2, float f2, float f3, long j, long j2, fet fetVar, int i3) {
        float f4;
        float f5;
        long j3;
        long j4;
        final long background;
        int i4;
        float f6;
        float f7;
        final long j5;
        int i5;
        fetVar.g0(-828681369);
        int i6 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(kwjVar) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128) | 599040;
        if (fetVar.U(i6 & 1, (599187 & i6) != 599186)) {
            fetVar.Z();
            if ((i3 & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                zfn zfnVar = zaq0.b;
                background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
                long primary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
                i4 = i6 & (-4193281);
                f6 = 2.0f;
                f7 = 2.0f;
                j5 = primary;
            } else {
                fetVar.X();
                f7 = f3;
                background = j;
                i4 = i6 & (-4193281);
                f6 = f2;
                j5 = j2;
            }
            fetVar.s();
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            final float fW0 = w6kVar.w0(f7);
            final float fW1 = w6kVar.w0(f6);
            final float f8 = fW1 / 2.0f;
            boolean z = fetVar.k(bmd.n) == k6z.b;
            Object objP = fetVar.P();
            float f9 = f7;
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new w48(kwjVar, (byte) 4));
                fetVar.o0(objP);
            }
            final l7m0 l7m0Var = (l7m0) objP;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, f6), 1.0f);
            boolean zD = ((i4 & 896) == 256) | fetVar.d(fW0) | fetVar.d(fW1) | fetVar.f(background) | fetVar.d(f8) | fetVar.h(z) | fetVar.f(j5);
            Object objP2 = fetVar.P();
            if (zD || objP2 == cl5Var) {
                i5 = 0;
                final boolean z2 = z;
                Function1 function1 = new Function1() { // from class: a.nu50
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f10;
                        fhl fhlVar = (fhl) obj;
                        fhlVar.getClass();
                        int i7 = i2;
                        if (i7 == 0) {
                            return Unit.f46060a;
                        }
                        char c2 = ' ';
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        int i8 = i7 - 1;
                        float f11 = i8;
                        float f12 = fW0;
                        float f13 = (fIntBitsToFloat - (f12 * f11)) / i7;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                        float f14 = fW1;
                        float f15 = (fIntBitsToFloat2 - f14) / 2.0f;
                        int i9 = 0;
                        float f16 = 0.0f;
                        while (true) {
                            f10 = f8;
                            if (i9 >= i7) {
                                break;
                            }
                            char c3 = c2;
                            float f17 = f12;
                            fhl.o0(fhlVar, background, (((long) Float.floatToRawIntBits(f16)) << c2) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << c2), (((long) Float.floatToRawIntBits(f10)) << c3) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), null, 240);
                            f16 = f13 + f17 + f16;
                            i9++;
                            f12 = f17;
                            f14 = f14;
                            i7 = i7;
                            c2 = c3;
                            i8 = i8;
                        }
                        char c4 = c2;
                        int i10 = i8;
                        float f18 = f12;
                        float f19 = f14;
                        l7m0 l7m0Var2 = l7m0Var;
                        float fC = l1e0.c(((Number) l7m0Var2.getValue()).floatValue(), 0.0f, f11);
                        int i11 = (int) fC;
                        float f20 = i11;
                        int iD = l1e0.d(((Number) l7m0Var2.getValue()).floatValue() >= f20 ? i11 + 1 : i11 - 1, 0, i10);
                        float fAbs = Math.abs(fC - f20);
                        long j6 = j5;
                        long jC = y3d.c(1.0f - fAbs, j6);
                        boolean z3 = z2;
                        if (z3) {
                            i11 = i10 - i11;
                        }
                        float f21 = f13 + f18;
                        fhl.o0(fhlVar, jC, (((long) Float.floatToRawIntBits(i11 * f21)) << c4) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << c4), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << c4), null, 240);
                        long jC2 = y3d.c(fAbs, j6);
                        if (z3) {
                            iD = i10 - iD;
                        }
                        fhl.o0(fhlVar, jC2, (((long) Float.floatToRawIntBits(f21 * iD)) << c4) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits(f13)) << c4) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L), (((long) Float.floatToRawIntBits(f10)) << c4) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), null, 240);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(function1);
                objP2 = function1;
            } else {
                i5 = 0;
            }
            p8a.k(mm40VarD, (Function1) objP2, fetVar, i5);
            f5 = f9;
            j4 = j5;
            j3 = background;
            f4 = f6;
        } else {
            fetVar.X();
            f4 = f2;
            f5 = f3;
            j3 = j;
            j4 = j2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ou50(mm40Var, kwjVar, i2, f4, f5, j3, j4, i3);
        }
    }

    public static final void E(float f2, int i2, fet fetVar, mm40 mm40Var, String str, boolean z) {
        mm40 mm40Var2;
        int i3;
        pge pgeVar = gqw0.A;
        fetVar.g0(838061140);
        int i4 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= fetVar.h(z) ? 32 : 16;
        }
        int i5 = i4 | (fetVar.g(str) ? 256 : 128) | (fetVar.d(f2) ? 2048 : 1024);
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            if (z) {
                fetVar.e0(-2077090168);
                i3 = R.drawable.ic_glyph_stadium;
            } else {
                fetVar.e0(-2077088314);
                i3 = R.drawable.ic_placeholder_stadium;
            }
            pm80 pm80VarF = a8k0.F(i3, 0, fetVar);
            fetVar.r(false);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ryc0(pz40Var, (byte) 26);
                fetVar.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(str, (Function1) objP2, null, fetVar, ((i5 >> 6) & 14) | 384, 26);
            zcl zclVar = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40Var2 = mm40Var;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var2), ((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            lz3 lz3Var = (lz3) pz40Var.getValue();
            jm40 jm40Var = jm40.b;
            jr8 jr8Var = jr8.f16991a;
            if (lz3Var != null && ((lz3Var instanceof jz3) || (lz3Var instanceof iz3))) {
                fetVar.e0(545370895);
                mm40 mm40VarN = z ? o7k0.n(jm40Var, f2) : jr8Var.a(jm40Var);
                if (z) {
                    pgeVar = gqw0.B;
                }
                j0x.b(pm80VarF, null, mm40VarN, null, pgeVar, 0.0f, null, fetVar, 56, 104);
                fetVar.r(false);
            } else {
                fetVar.e0(545742678);
                j0x.b(mz3VarX, null, jr8Var.a(jm40Var), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new axl0((byte) 1, f2, i2, mm40Var2, str, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02ca  */
    public static final void F(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        jm40 jm40Var;
        int i3;
        mm40 mm40VarW;
        pcy pcyVar;
        cl5 cl5Var;
        int i4;
        pcy pcyVar2;
        int i5;
        cl5 cl5Var2;
        boolean z;
        cl5 cl5Var3;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        a4xVar.getClass();
        function1.getClass();
        fetVar2.g0(-2090156062);
        int i6 = i2 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i6 & 1, (i6 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar);
            int size = a4xVar.size();
            boolean zE = fetVar2.e(size);
            Object objP = fetVar2.P();
            cl5 cl5Var4 = ukd.f35823a;
            if (zE || objP == cl5Var4) {
                objP = Boolean.valueOf(size > 4);
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            boolean zIsEmpty = a4xVar.isEmpty();
            boolean z3 = !zIsEmpty;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarO = ny9.O(1.6f, o7k0.d(jm40Var2, 1.0f), false);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarO);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar);
            n0q n0qVar = o7k0.c;
            if (zIsEmpty) {
                jm40Var = jm40Var2;
                i3 = i6;
                fetVar2.e0(2023872294);
                fetVar2.r(false);
                mm40VarW = jm40Var;
            } else {
                fetVar2.e0(2023865770);
                i3 = i6;
                boolean z4 = (i3 & 896) == 256;
                Object objP2 = fetVar2.P();
                if (z4 || objP2 == cl5Var4) {
                    objP2 = new yhl0(function1, (byte) 12);
                    fetVar2.o0(objP2);
                }
                mm40VarW = y860.W(jm40Var2, null, null, false, null, (Function0) objP2, 28);
                jm40Var = jm40Var2;
                fetVar2.r(false);
            }
            int i7 = size;
            E(44.0f, 0, fetVar2, n0qVar.e(mm40VarW), (String) CollectionsKt.firstOrNull(a4xVar), z3);
            if (zIsEmpty) {
                pcyVar = pcyVar3;
                cl5Var = cl5Var4;
                i4 = 0;
                fetVar2.e0(-1683888252);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1684225036);
                pcyVar = pcyVar3;
                cl5Var = cl5Var4;
                i4 = 0;
                dww.c(a8k0.F(R.drawable.ic_zoom, 0, fetVar2), null, s5x0.J(jr8.f16991a.b(jm40Var, gqw0.i), 8.0f), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 56, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, i4);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar2 = pcyVar;
                fetVar2.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar);
            fetVar2.e0(627604110);
            boolean z5 = false;
            Iterator it = l1e0.o(0, 3).iterator();
            while (((kkx) it).c) {
                int iNextInt = ((bkx) it).nextInt();
                x7z x7zVar = new x7z(1.0f, true);
                tj30 tj30VarC2 = zq8.c(gqw0.e, z5);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, x7zVar);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar2);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar4);
                jpm0.o(fetVar2, bh90VarM4, shdVar3);
                vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar);
                String str = (String) CollectionsKt.W(iNextInt + 1, a4xVar);
                if (str != null) {
                    fetVar2.e0(-915788480);
                    n0q n0qVar2 = o7k0.c;
                    boolean zE2 = ((i3 & 896) == 256) | fetVar2.e(iNextInt);
                    Object objP3 = fetVar2.P();
                    if (zE2) {
                        cl5Var3 = cl5Var;
                    } else {
                        cl5Var3 = cl5Var;
                        if (objP3 == cl5Var3) {
                        }
                        mm40 mm40VarW2 = y860.W(n0qVar2, null, null, false, null, (Function0) objP3, 28);
                        zcl zclVar2 = qmk.f28987a;
                        cl5Var2 = cl5Var3;
                        E(20.0f, 48, fetVar2, mm40VarW2, str, true);
                        if (iNextInt == 2 || !zBooleanValue) {
                            i5 = i7;
                            z = false;
                            fetVar2.e0(-915126072);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-915212562);
                            i5 = i7;
                            z = false;
                            c(i5, 0, fetVar2);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z);
                    }
                    objP3 = new re1(function1, iNextInt, (byte) 17);
                    fetVar2.o0(objP3);
                    mm40 mm40VarW3 = y860.W(n0qVar2, null, null, false, null, (Function0) objP3, 28);
                    zcl zclVar3 = qmk.f28987a;
                    cl5Var2 = cl5Var3;
                    E(20.0f, 48, fetVar2, mm40VarW3, str, true);
                    if (iNextInt == 2) {
                        i5 = i7;
                        z = false;
                        fetVar2.e0(-915126072);
                        fetVar2.r(false);
                    } else {
                        i5 = i7;
                        z = false;
                        fetVar2.e0(-915126072);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z);
                } else {
                    i5 = i7;
                    cl5Var2 = cl5Var;
                    z = false;
                    fetVar2.e0(-915104248);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                i7 = i5;
                z5 = z;
                cl5Var = cl5Var2;
            }
            ohs0.x(fetVar2, z5, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar, function1, i2, (byte) 8);
        }
    }

    public static final void G(jcr0 jcr0Var, fet fetVar, int i2) {
        k6z k6zVar;
        fetVar.g0(1680173502);
        int i3 = (fetVar.g(jcr0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (jcr0Var.c) {
                fetVar.e0(-260963067);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-260962143);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-910635394, new fcr0(jcr0Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fcr0(jcr0Var, i2);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1436247878);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_top_players, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((kcr0) l7m0Var.getValue()).b().f18028a;
            j9m0 j9m0Var = ((kcr0) l7m0Var.getValue()).b().b;
            boolean zA = ((kcr0) l7m0Var.getValue()).a();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, b2);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(1078634580, new xs4(l7m0Var, function1, (byte) 15), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, (byte) 5);
        }
    }

    public static final void I(ir8 ir8Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1292807632);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ir8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i3 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zlv0 zlv0Var = (zlv0) l7m0Var2.getValue();
            if (zlv0Var != null) {
                if (zlv0Var instanceof ylv0) {
                    fetVar.e0(1142592926);
                    x(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = zlv0Var instanceof xlv0;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(1060705425);
                        s(ir8Var.b(jm40Var, gqw0.e), ((xlv0) zlv0Var).e, function1, fetVar, i3 & 896);
                        fetVar.r(false);
                    } else if (zlv0Var instanceof wlv0) {
                        fetVar.e0(1060992516);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        boolean zG = fetVar.g(zlv0Var) | ((i3 & 896) == 256);
                        Object objP = fetVar.P();
                        if (zG || objP == ukd.f35823a) {
                            objP = new zfv0(zlv0Var, function1, (byte) 5);
                            fetVar.o0(objP);
                        }
                        b8k0.e(mm40VarD, null, null, null, null, null, false, null, (Function1) objP, fetVar, 6, 510);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(1142592572, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuh(ir8Var, l7m0Var, function1, i2, (byte) 5);
        }
    }

    public static final mm40 J(mm40 mm40Var, gy40 gy40Var, boolean z) {
        return mm40Var.e(z ? new qqq(gy40Var) : jm40.b);
    }

    public static final void L(bnk0 bnk0Var, String str, int i2) {
        if (!bnk0Var.f2888a.isEmpty()) {
            pzw.E(bnk0Var, ". ", 0, R.color.static_white_60, 0, 0, 54);
        }
        pzw.E(bnk0Var, str, 0, i2, 0, 0, 54);
    }

    public static final String M(BetZip betZip, boolean z) {
        betZip.getClass();
        boolean z2 = betZip.x;
        String str = betZip.g;
        if (z2) {
            return "SP";
        }
        if (!z && str.length() > 0) {
            return str;
        }
        pn40 pn40Var = pn40.f27267a;
        return pn40.f(betZip.b);
    }

    public static final mdm N(yk0 yk0Var, boolean z, boolean z2, int i2) {
        int iA;
        int i3;
        if (z2) {
            xuz xuzVar = pb10.c;
            pb10 pb10Var = pb10.j;
            xuzVar.getClass();
            iA = xuz.a(pb10Var, i2);
        } else {
            xuz xuzVar2 = pb10.c;
            pb10 pb10Var2 = pb10.i;
            xuzVar2.getClass();
            iA = xuz.a(pb10Var2, i2);
        }
        yk0 yk0Var2 = yk0.FAVORITES;
        if (yk0Var == yk0Var2 && z) {
            i3 = R.string.casino_favorites_empty;
        } else if (yk0Var != yk0Var2 || z) {
            i3 = (yk0Var == yk0.VIEWED && z) ? R.string.casino_viewed_empty : R.string.casino_viewed_no_auth;
        } else {
            i3 = R.string.casino_favorites_no_auth;
        }
        return new mdm(iA, null, null, 0, 0, i3, 0, 0, 0L, 0L, 990);
    }

    public static u33 O(udy udyVar, fa10 fa10Var) {
        return new u33(gmy.a(udyVar, fa10Var, 1.0f, rv00.g, false), (byte) 0);
    }

    public static v33 P(ndy ndyVar, fa10 fa10Var, boolean z) {
        return new v33(gmy.a(ndyVar, fa10Var, z ? cut0.c() : 1.0f, ujn.m, false), (byte) 2);
    }

    public static u33 Q(udy udyVar, fa10 fa10Var, int i2) {
        x860 x860Var = new x860();
        x860Var.f40449a = i2;
        ArrayList arrayListA = gmy.a(udyVar, fa10Var, 1.0f, x860Var, false);
        for (int i3 = 0; i3 < arrayListA.size(); i3++) {
            cmy cmyVar = (cmy) arrayListA.get(i3);
            tbv tbvVar = (tbv) cmyVar.b;
            tbv tbvVar2 = (tbv) cmyVar.c;
            if (tbvVar != null && tbvVar2 != null) {
                float[] fArr = tbvVar.f33687a;
                int length = fArr.length;
                float[] fArr2 = tbvVar2.f33687a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f3 = fArr3[i5];
                        if (f3 != f2) {
                            fArr3[i4] = f3;
                            i4++;
                            f2 = fArr3[i5];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                    cmyVar = new cmy(tbvVar.b(fArrCopyOfRange), tbvVar2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i3, cmyVar);
        }
        return new u33(arrayListA, (byte) 1);
    }

    public static u33 R(ndy ndyVar, fa10 fa10Var) {
        return new u33(gmy.a(ndyVar, fa10Var, 1.0f, m2a.o, false), (byte) 2);
    }

    public static u33 S(udy udyVar, fa10 fa10Var) {
        return new u33(gmy.a(udyVar, fa10Var, cut0.c(), ujn.z, true), (byte) 3);
    }

    public static oil T(pm80 pm80Var, m78 m78Var, Function2 function2, int i2) {
        if ((i2 & 4) != 0) {
            m78Var = null;
        }
        if ((i2 & 8) != 0) {
            function2 = f17139a;
        }
        pm80Var.getClass();
        function2.getClass();
        return new oil(pm80Var, m78Var, function2);
    }

    public static final f02 U(e02 e02Var, String str) {
        long j;
        String str2;
        Long l;
        Long l2;
        e02Var.getClass();
        str.getClass();
        List list = e02Var.f6969a;
        b02 b02Var = list != null ? (b02) CollectionsKt.firstOrNull(list) : null;
        String str3 = b02Var != null ? b02Var.c : null;
        String str4 = str3 == null ? "" : str3;
        String str5 = e02Var.b;
        if (str5 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = 0;
        long jLongValue2 = (b02Var == null || (l2 = b02Var.e) == null) ? 0L : l2.longValue();
        if (b02Var != null && (l = b02Var.f) != null) {
            jLongValue = l.longValue();
        }
        String str6 = e02Var.c;
        if (str6 == null) {
            str2 = "";
            j = jLongValue2;
        } else {
            j = jLongValue2;
            str2 = str6;
        }
        return new f02(j, jLongValue, str4, str5, str, str2);
    }

    public static final si4 V(u54 u54Var) {
        int i2;
        u54Var.getClass();
        int iA = u54Var.a();
        if (iA == 1) {
            i2 = R.drawable.ic_social_circle_vk;
        } else if (iA == 5) {
            i2 = R.drawable.ic_social_circle_ok;
        } else if (iA == 13) {
            i2 = R.drawable.ic_social_circle_x;
        } else if (iA == 31) {
            i2 = R.drawable.ic_social_circle_discord;
        } else if (iA == 7) {
            i2 = R.drawable.ic_social_circle_yandex;
        } else if (iA == 9) {
            i2 = R.drawable.ic_social_circle_mail;
        } else if (iA == 11) {
            i2 = R.drawable.ic_social_circle_google;
        } else if (iA == 17) {
            i2 = R.drawable.ic_social_circle_telegram;
        } else if (iA == 19) {
            i2 = R.drawable.ic_social_circle_apple;
        } else if (iA == 26) {
            i2 = R.drawable.ic_social_circle_itsme;
        } else {
            i2 = iA == 48 ? R.drawable.ic_qr_scanner_office : 0;
        }
        return new si4(i2, u54Var.a());
    }

    public static final su6 W(z0w z0wVar, String str, int i2, boolean z, boolean z2) {
        return new su6(z0wVar.f43588a, z0wVar.b, z0wVar.c, z0wVar.d, z0wVar.e, z0wVar.f, z0wVar.g, z0wVar.h, z0wVar.i, z0wVar.j, thb.X(z0wVar.k), z0wVar.l, z0wVar.m, z0wVar.n, z0wVar.o, z0wVar.p, z0wVar.q, z0wVar.r, z0wVar.s, z0wVar.t, str, z0wVar.v, i2, z0wVar.w, z0wVar.y, z0wVar.z, z0wVar.A, z0wVar.B, z0wVar.C, z0wVar.E, z0wVar.D, z0wVar.F, z0wVar.G, z0wVar.H, z0wVar.I, z0wVar.J, -1, z0wVar.K, 0.0d, z0wVar.L, z2, z0wVar.M, z0wVar.N, z, z0wVar.O, z0wVar.P);
    }

    public static final void a(mm40 mm40Var, bd bdVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        bdVar.getClass();
        function1.getClass();
        fetVar2.g0(1789706188);
        byte b2 = 16;
        int i3 = i2 | 6 | (fetVar2.g(bdVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = bdVar instanceof xc;
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (z2) {
                fetVar2.e0(-586734326);
                xc xcVar = (xc) bdVar;
                ijl ijlVar = xcVar.b;
                jjl jjlVar = xcVar.f40622a;
                int i4 = i3 & 896;
                boolean z3 = i4 == 256;
                Object objP = fetVar2.P();
                if (z3 || objP == cl5Var) {
                    objP = new e0(function1, (byte) 12);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z4 = i4 == 256;
                Object objP2 = fetVar2.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new e0(function1, (byte) 14);
                    fetVar2.o0(objP2);
                }
                Function0 function2 = (Function0) objP2;
                z = i4 == 256;
                Object objP3 = fetVar2.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new e0(function1, b2);
                    fetVar2.o0(objP3);
                }
                feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar2, 0, 4);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                if (!(bdVar instanceof zc)) {
                    throw b1j.f(1920734420, fetVar2, false);
                }
                fetVar2.e0(-586125672);
                mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarQ, 12.0f, 8.0f);
                zc zcVar = (zc) bdVar;
                String str = zcVar.f44143a;
                String str2 = zcVar.b;
                int i5 = i3 & 896;
                boolean z5 = i5 == 256;
                Object objP4 = fetVar2.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new e0(function1, (byte) 18);
                    fetVar2.o0(objP4);
                }
                Function0 function3 = (Function0) objP4;
                z = i5 == 256;
                Object objP5 = fetVar2.P();
                if (z || objP5 == cl5Var) {
                    objP5 = new e0(function1, (byte) 20);
                    fetVar2.o0(objP5);
                }
                pzb.g(mm40VarK, str, str2, function3, (Function0) objP5, fetVar2, 0);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var2, bdVar, function1, i2, (byte) 9);
        }
    }

    public static final void b(mm40 mm40Var, String str, int i2, Function0 function0, fet fetVar, int i3) {
        int i4;
        String str2;
        Function0 function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(1184316231);
        if ((i3 & 6) == 0) {
            i4 = (fetVar2.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i4 |= fetVar2.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar2.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            function1 = function0;
            i4 |= fetVar2.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(s5x0.N(mm40Var, 6.0f, 0.0f, 10.0f, 0.0f, 10), null, null, false, null, function1, 28);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i5 = i4 >> 3;
            dww.c(iom0.r(jpm0.t(i2, (i5 & 112) | 6, fetVar2), fetVar2), null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 16.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), fetVar2, 56, 0);
            qrq qrqVar = j1t0.b;
            long j = qmk.q;
            v8q0.a(str2, null, 0L, new n05(qmk.o, j, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar, i5 & 14, 24960, 110582);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6((Object) mm40Var, (Object) str, i2, (Object) function0, i3, (byte) 2);
        }
    }

    public static final void c(int i2, int i3, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1393911563);
        int i4 = (fetVar2.e(i2) ? 4 : 2) | i3;
        if (fetVar2.U(i4 & 1, (i4 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 24.0f);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarN, ((StaticColors) fetVar2.k(zfnVar)).m73getBlack400d7_KjU(), vgg0.f37379a), 0.0f, 4.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(twn.m(i2 - 4, "+"), null, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 130042);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i2, i3, (byte) 26);
        }
    }

    public static final void d(mm40 mm40Var, fu1 fu1Var, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        ugd ugdVar2;
        mm40 mm40Var2;
        fu1Var.getClass();
        function1.getClass();
        fetVar.g0(255804897);
        int i3 = i2 | 6 | (fetVar.g(fu1Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            z5n.h(fu1Var.e.b, fu1Var.f, aoo0.d, null, b6n.f2063a, false, function1, fetVar, ((i3 << 12) & 3670016) | 221568, 8);
            fetVar.r(true);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar, 6);
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 10, i2, mm40Var2, fu1Var, function1, ugdVar2);
        }
    }

    public static final void e(mm40 mm40Var, ud5 ud5Var, Function0 function0, fet fetVar, int i2) {
        ud5Var.getClass();
        if (ud5Var instanceof pd5) {
            fetVar.e0(-662077449);
            piz.c(mm40Var, (pd5) ud5Var, fetVar, i2 & 126);
            fetVar.r(false);
            return;
        }
        if (ud5Var instanceof qd5) {
            fetVar.e0(-662074408);
            i4w0.y(mm40Var, (qd5) ud5Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (ud5Var instanceof rd5) {
                fetVar.e0(-662071171);
                rd5 rd5Var = (rd5) ud5Var;
                oja0.k(mm40Var, rd5Var.f30274a, Integer.valueOf(rd5Var.b), gqw0.A, null, fetVar, (i2 & 14) | 24576, 36);
                fetVar.r(false);
                return;
            }
            if (!(ud5Var instanceof sd5)) {
                throw b1j.f(-662078775, fetVar, false);
            }
            fetVar.e0(-662067900);
            dj8.S(mm40Var, (sd5) ud5Var, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        }
    }

    public static final void f(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, Function1 function1, Function1 function2, ugd ugdVar, fet fetVar, int i2) {
        ugd ugdVar2;
        l7m0Var.getClass();
        xczVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-201177121);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new aj6(xczVar, function1, null, b2);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, xczVar, (Function2) objP);
            nj6 nj6Var = (nj6) l7m0Var.getValue();
            nj6Var.getClass();
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            if (nj6Var instanceof kj6) {
                fetVar.e0(-1716974137);
                obc.d(kr00.f18743a.a(Boolean.valueOf(((kj6) nj6Var).f18371a)), u1c.M(-1254033088, new eg(mm40Var), fetVar), fetVar, 56);
                fetVar.r(false);
            } else if (nj6Var instanceof jj6) {
                fetVar.e0(-1716492180);
                jj6 jj6Var = (jj6) nj6Var;
                obc.d(kr00.f18743a.a(Boolean.valueOf(jj6Var.c)), u1c.M(-974166793, new si6(mm40Var, backgroundContent, androidx.compose.runtime.e.f(jj6Var.b, fetVar), xczVar, function2), fetVar), fetVar, 56);
                fetVar.r(false);
            } else if (nj6Var instanceof lj6) {
                fetVar.e0(1607286643);
                ugdVar2 = ugdVar;
                ugdVar2.F(((lj6) nj6Var).f20135a, fetVar, 48);
                fetVar.r(false);
            } else {
                ugdVar2 = ugdVar;
                if (nj6Var instanceof ij6) {
                    fetVar.e0(-1713631128);
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    boolean zF = fetVar.f(backgroundContent);
                    Object objP2 = fetVar.P();
                    if (zF || objP2 == cl5Var) {
                        objP2 = new bx((byte) 8, backgroundContent);
                        fetVar.o0(objP2);
                    }
                    rsr0.a(0, fetVar, rq8.K(mm40VarE, (Function1) objP2), ((ij6) nj6Var).b);
                    fetVar.r(false);
                } else {
                    if (!(nj6Var instanceof mj6)) {
                        throw b1j.f(1607183462, fetVar, false);
                    }
                    fetVar.e0(-1713320508);
                    mm40 mm40VarE2 = mm40Var.e(o7k0.c);
                    boolean zF2 = fetVar.f(backgroundContent);
                    Object objP3 = fetVar.P();
                    if (zF2 || objP3 == cl5Var) {
                        objP3 = new bx((byte) 9, backgroundContent);
                        fetVar.o0(objP3);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarE2, (Function1) objP3);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    jcb.l(null, ((mj6) nj6Var).b, false, null, fetVar, 0, 13);
                    fetVar.r(true);
                    fetVar.r(false);
                }
            }
            ugdVar2 = ugdVar;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zi6(mm40Var, l7m0Var, xczVar, function1, function2, ugdVar2, i2, (byte) 0);
        }
    }

    public static final void g(int i2, fet fetVar, String str, boolean z) {
        fetVar.g0(1503639721);
        int i3 = (fetVar.h(z) ? 4 : 2) | i2 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 16.0f, z ? 16.0f : 32.0f, 0.0f, 0.0f, 12);
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN, s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, (i3 >> 3) & 14, 0, 131064);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5h(str, i2, z);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        ugd ugdVar2;
        mm40 mm40Var3;
        fetVar.g0(-1429047928);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            mm40 mm40Var4 = i5 != 0 ? jm40.b : mm40Var2;
            long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.d(i120.Q(qcc.F(mm40Var4, jM62getBlack0d7_KjU, 20.0f, 8.0f, 0.0f, 0.4f, 88), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), 1.0f), null, false, 3);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar2 = ugdVar;
            ua80.p(54, ugdVar2, jr8.f16991a, fetVar, true);
            mm40Var3 = mm40Var4;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13(mm40Var3, (Object) ugdVar2, i2, i3, (byte) 1);
        }
    }

    public static final void i(mm40 mm40Var, kf9 kf9Var, Function0 function0, Function0 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        kf9Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(866044734);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(kf9Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            long backgroundGroupSecondary = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundGroupSecondary();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(o7k0.d(i120.Q(mm40Var, backgroundGroupSecondary, new ugg0(zclVar, zclVar, zclVar, zclVar)), 1.0f), 0.0f, 6.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ubs0 ubs0Var = kf9Var.f18186a;
            b(x7zVar, ubs0Var.b, ubs0Var.f35397a.f33682a, function0, fetVar2, (i3 << 3) & 7168);
            mbc.o(zfi0.f44303a, o7k0.e(o7k0.s(jm40Var, 1.0f), 20.0f), false, fetVar, 390, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            kye kyeVar = kf9Var.b;
            fetVar2 = fetVar;
            b(x7zVar2, kyeVar.b, kyeVar.f19100a.f15585a, function1, fetVar2, i3 & 7168);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 1, i2, (Object) mm40Var, (Object) kf9Var, (Object) function0, (Object) function1);
        }
    }

    public static final void j(mm40 mm40Var, cvl cvlVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(355207976);
        int i3 = i2 | 6 | (fetVar2.g(cvlVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(lgb.J(o7k0.e(o7k0.s(jm40Var, 84.0f), 128.0f), vgg0.a(16.0f)), "CATEGORY_CARD_COLLECTION_CARD_BOX");
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i3 & 896) == 256;
            int i4 = i3 & 112;
            boolean z2 = z | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new xul(function1, cvlVar, b2);
                fetVar2.o0(objP2);
            }
            mm40Var2 = jm40Var;
            mm40 mm40VarF = phu0.F(mm40VarE0, null, null, false, gy40Var, (Function0) objP2, fetVar2, 24960, 5);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarF);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            Integer num = cvlVar.c;
            fetVar2.e0(-1657146877);
            pm80 pm80VarF = a8k0.F(num.intValue(), 0, fetVar2);
            fetVar2.r(false);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE = jr8Var.b(mm40Var2, zx7Var).e(o7k0.c);
            boolean z3 = i4 == 32;
            Object objP4 = fetVar2.P();
            if (z3 || objP4 == cl5Var) {
                objP4 = new dpl((Object) cvlVar, (Object) pz40Var, (byte) 3);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarE1 = o2e.e0(pai0.a(mm40VarE, false, (Function1) objP4), "CATEGORY_CARD_COLLECTION_CARD_IMAGE");
            Object objA = cvlVar.b.a();
            pge pgeVar = gqw0.A;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new wil(pz40Var, (byte) 6);
                fetVar2.o0(objP5);
            }
            Function1 function2 = (Function1) objP5;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new wil(pz40Var, (byte) 7);
                fetVar2.o0(objP6);
            }
            k7x.b(objA, null, mm40VarE1, pm80VarF, pm80VarF, null, null, function2, (Function1) objP6, null, pgeVar, null, fetVar, 113283120, 6, 31328);
            fetVar2 = fetVar;
            if (cvlVar.d.length() > 0) {
                fetVar2.e0(-1656213219);
                mm40 mm40VarE2 = o2e.e0(s5x0.K(jr8Var.b(mm40Var2, gqw0.g), 8.0f, 8.0f), "CATEGORY_CARD_COLLECTION_CARD_TITLE");
                String str = cvlVar.d;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str, mm40VarE2, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, qmk.q, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.a(), fetVar, 0, 24960, 110568);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1655627660);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var2, cvlVar, function1, i2, (byte) 23);
        }
    }

    public static final void k(mm40 mm40Var, imm immVar, boolean z, Function0 function0, Function0 function1, fet fetVar, int i2) {
        function0.getClass();
        function1.getClass();
        fetVar.g0(481181737);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(immVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            hlm.c(mm40Var, immVar, null, null, null, null, null, null, null, u1c.M(948183973, new wr4(function1, b3), fetVar), null, u1c.M(-244739786, new a0(z, function0, b2), fetVar), fetVar, (i3 & 14) | 805306368 | (i3 & 112), 48, 1532);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(mm40Var, (Object) immVar, z, function0, (wdr) function1, i2, (byte) 5);
        }
    }

    public static final void l(mm40 mm40Var, xcz xczVar, zul zulVar, float f2, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(235706673);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(zulVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "LAZY_ROW_CATEGORY_CARD_COLLECTION");
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 896) == 256) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dpl((Object) zulVar, (Object) function1, (byte) 2);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, xczVar, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, i3 & 112, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, xczVar, zulVar, f2, function1, i2);
        }
    }

    public static final void m(mm40 mm40Var, float f2, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(-1845745776);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarL = s5x0.L(wha0.P(mm40Var, wha0.T(fetVar), false, 14), f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-221913804);
            int iB = 0;
            while (iB < 8) {
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 84.0f), 128.0f);
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                iB = h97.b(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f2, i2, (byte) 1);
        }
    }

    public static final void n(pxh pxhVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(2146198348);
        byte b2 = 4;
        int i3 = (fetVar.g(pxhVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            kxh kxhVar = (kxh) pxhVar.b.get((int) pxhVar.c);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            vxl vxlVar = vxl.b;
            fyl fylVar = new fyl(pxhVar.f27753a, null, null, s5x0.u(8.0f, 0.0f, 8.0f, 0.0f, 10), null, 22);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new olh(function1, b2);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarN, fylVar, vxlVar, (Function1) objP, null, fetVar, 384, 40);
            fetVar.r(true);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-508852596, new mz7(function1, kxhVar, (byte) 3), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(pxhVar, function1, i2, (byte) 17);
        }
    }

    public static final void o(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1687813722);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String strW = rsm0.w(R.string.results, 0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                pz40 pz40Var = s6t0.f31722a;
                imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strW, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            n0q n0qVar = o7k0.c;
            pz40 pz40Var2 = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new ouh(function1, (byte) 6);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 48, 0, 4085);
            sxh sxhVar = (sxh) l7m0Var.getValue();
            if (sxhVar instanceof pxh) {
                fetVar.e0(-291471989);
                n((pxh) sxhVar, function1, fetVar, i4);
                fetVar.r(false);
            } else if (sxhVar instanceof qxh) {
                fetVar.e0(-291467396);
                r(((qxh) sxhVar).f29485a, function1, fetVar, i4);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(sxhVar, rxh.f31264a)) {
                    throw b1j.f(-291474482, fetVar, false);
                }
                fetVar.e0(-291462402);
                v(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fb  */
    public static final void p(mm40 mm40Var, bvl bvlVar, xcz xczVar, float f2, Function1 function1, fet fetVar, int i2, int i3) {
        int i4;
        xcz xczVar2;
        float f3;
        float f4;
        xcz xczVar3;
        function1.getClass();
        fetVar.g0(-719549188);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(bvlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && fetVar.g(xczVar)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && fetVar.d(f2)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                if ((i3 & 4) != 0) {
                    xczVar = ddz.a(0, 0, fetVar, 0, 3);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    zcl zclVar = qmk.f28987a;
                    i4 &= -7169;
                    f4 = qmk.a(fetVar).c;
                    xczVar3 = xczVar;
                }
                fetVar.s();
                if (bvlVar instanceof zul) {
                    fetVar.e0(92283964);
                    l(mm40Var, xczVar3, (zul) bvlVar, f4, function1, fetVar, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168) | (i4 & 57344));
                    fetVar.r(false);
                } else {
                    if (bvlVar.equals(avl.f1531a)) {
                        throw b1j.f(2974910, fetVar, false);
                    }
                    fetVar.e0(92596816);
                    m(mm40Var, f4, fetVar, (i4 & 14) | ((i4 >> 6) & 112));
                    fetVar.r(false);
                }
                f3 = f4;
                xczVar2 = xczVar3;
            } else {
                fetVar.X();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
            }
            xczVar3 = xczVar;
            f4 = f2;
            fetVar.s();
            if (bvlVar instanceof zul) {
                fetVar.e0(92283964);
                l(mm40Var, xczVar3, (zul) bvlVar, f4, function1, fetVar, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168) | (i4 & 57344));
                fetVar.r(false);
            } else {
                if (bvlVar.equals(avl.f1531a)) {
                    throw b1j.f(2974910, fetVar, false);
                }
                fetVar.e0(92596816);
                m(mm40Var, f4, fetVar, (i4 & 14) | ((i4 >> 6) & 112));
                fetVar.r(false);
            }
            f3 = f4;
            xczVar2 = xczVar3;
        } else {
            fetVar.X();
            xczVar2 = xczVar;
            f3 = f2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dd6(mm40Var, bvlVar, xczVar2, f3, function1, i2, i3);
        }
    }

    public static final void q(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(-1570173135);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jcb.l(s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7), mdmVar, false, function0, fetVar, (i3 & 112) | ((i3 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 7);
        }
    }

    public static final void r(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1256414151);
        byte b2 = 4;
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ouh(function1, (byte) 7);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, b2);
        }
    }

    public static final void s(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(672486036);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ntu0(function1, (byte) 17);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i3 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var, mdmVar, function1, i2, (byte) 9);
        }
    }

    public static final void t(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-1936004527);
        byte b2 = 2;
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, b2);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, (Function0) objP, fetVar2, (i3 << 3) & 112, 5);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar2, function1, i2, (byte) 6);
        }
    }

    public static final void u(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(625318140);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            p3c0.a(o7k0.n(mm40Var2, 48.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), 0.0f, 0L, 0, 0.0f, fetVar, 0, 60);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var2, i2, (byte) 4);
        }
    }

    public static final void v(int i2, fet fetVar) {
        fetVar.g0(-654285200);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 4.0f, 4.0f, 0.0f, 8.0f, 4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ulb.c(jm40Var, fqj0VarD0, fetVar, 6);
            ulb.c(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
            zfn zfnVar = zaq0.b;
            ulb.x(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            ulb.x(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar, 0);
            ulb.x(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            ulb.x(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar, 0);
            ulb.x(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuh(i2, (byte) 2);
        }
    }

    public static final void w(int i2, fet fetVar) {
        fetVar.g0(2098336264);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), 152.0f), 12.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), 1.0f), 100.0f)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 16.0f, 32.0f, 16.0f, 0.0f, 8), 152.0f), 12.0f)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), 1.0f), 100.0f)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 16.0f, 32.0f, 16.0f, 0.0f, 8), 152.0f), 12.0f)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), 1.0f), 100.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new shq0(i2, (byte) 20);
        }
    }

    public static final void x(int i2, fet fetVar) {
        fetVar.g0(894278320);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            ydx.n(0, fetVar, s5x0.N(jm40.b, xfn.a(fetVar).e, 12.0f, xfn.a(fetVar).e, 0.0f, 8).e(o7k0.c));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i9v0(i2, (byte) 6);
        }
    }

    public static final void y(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(953099526);
        int i3 = i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(str, ha50.THREE_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new a2z(function0, (byte) 19);
                fetVar.o0(objP);
            }
            Function0 function1 = (Function0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new mb50((byte) 10);
                fetVar.o0(objP2);
            }
            hlm.c(mm40Var, immVar, null, function1, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 805502982, 54, 468);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var, str, function0, i2, (byte) 4);
        }
    }

    public static final void z(mm40 mm40Var, l7m0 l7m0Var, Fragment fragment, boolean z, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(88521778);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(fragment) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40Var2 = mm40Var;
            mm40 mm40VarQ = i120.Q(mm40Var2, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarE0 = o2e.e0(j120.k0(mm40VarQ, zcm0.i(fetVar).f), "NEWS_MAIN_SCREEN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            String strS = xsm0.s(R.string.last_news, fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE1 = o2e.e0(jm40Var, "NAVIGATION_BAR");
            int i4 = i3 & 57344;
            boolean z3 = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new w250(function1, (byte) 24);
                fetVar.o0(objP);
            }
            y(mm40VarE1, strS, (Function0) objP, fetVar, 6);
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            uu50 uu50Var = (uu50) l7m0Var.getValue();
            if (uu50Var instanceof ru50) {
                fetVar.e0(-1801088395);
                uu50 uu50Var2 = (uu50) l7m0Var.getValue();
                uu50Var2.getClass();
                C((ru50) uu50Var2, fragment, z, function1, fetVar, (i3 & 7168) | 6 | (i3 & 896) | i4);
                fetVar.r(false);
            } else if (uu50Var instanceof su50) {
                fetVar.e0(-1443562548);
                mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                uu50 uu50Var3 = (uu50) l7m0Var.getValue();
                uu50Var3.getClass();
                mdm mdmVar = ((su50) uu50Var3).f32806a;
                boolean z4 = i4 == 16384;
                Object objP2 = fetVar.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new w250(function1, (byte) 26);
                    fetVar.o0(objP2);
                }
                q(mm40VarB, mdmVar, (Function0) objP2, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(uu50Var, tu50.f34535a)) {
                    throw b1j.f(-1443574447, fetVar, false);
                }
                fetVar.e0(-1443552513);
                u(0, fetVar, null);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 26, i2, (wdr) function1, (Object) mm40Var2, (Object) l7m0Var, (Object) fragment, z);
        }
    }
}
