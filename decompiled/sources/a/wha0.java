package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f39158a = new Object[0];
    public static final ugd b = new ugd(-1441425831, false, new zgd(15));
    public static final ugd c = new ugd(-108343896, false, new bhd(28));
    public static final ugd d = new ugd(-1977628789, false, new lhd(4));
    public static final ugd e = new ugd(185673420, false, new lhd(8));
    public static final ugd f = new ugd(-1945991667, false, new lhd(12));
    public static final ugd g = new ugd(-849355166, false, new qhd(7));
    public static final ugd h = new ugd(-1570521264, false, new ohd(14));

    public static final void A(mm40 mm40Var, r060 r060Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        r060Var.getClass();
        function1.getClass();
        fetVar2.g0(-691646992);
        int i2 = i | 6 | (fetVar2.g(r060Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new xv50(function1, (byte) 3);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new xv50(function1, (byte) 4);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, backgroundContent, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            imm immVar = r060Var.f29615a;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new xv50(function1, (byte) 5);
                fetVar2.o0(objP3);
            }
            hlm.c(null, immVar, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar2, 0, 0, 4085);
            fetVar2 = fetVar2;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            mm40Var2 = jm40.b;
            z(i120.Q(mm40Var2, background, ljcVar), r060Var.b, function1, fetVar2, i3);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var2, r060Var, function1, i, (byte) 4);
        }
    }

    public static final void B(mm40 mm40Var, d6b0 d6b0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        d6b0Var.getClass();
        function1.getClass();
        fetVar.g0(1270358585);
        int i2 = i | 6 | (fetVar.g(d6b0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new wta0(function1, (byte) 4);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wta0(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(jm40Var, background, ljcVar).e(o7k0.c), "POPULAR_CLASSIC_FEED_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            hws hwsVar = d6b0Var.f5543a;
            if (hwsVar instanceof ews) {
                fetVar.e0(1362643108);
                ews ewsVar = (ews) hwsVar;
                m((i2 << 3) & 7168, fetVar, ewsVar.f8542a, null, function1, ewsVar.b);
                fetVar.r(false);
            } else if (hwsVar instanceof fws) {
                fetVar.e0(1362817452);
                o(null, ((fws) hwsVar).f10274a, function1, fetVar, i3);
                fetVar.r(false);
            } else if (hwsVar instanceof dws) {
                fetVar.e0(1362952612);
                dws dwsVar = (dws) hwsVar;
                m((i2 << 3) & 7168, fetVar, dwsVar.f6814a, null, function1, dwsVar.b);
                fetVar.r(false);
            } else {
                fetVar.e0(1363096111);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, d6b0Var, function1, i, (byte) 17);
        }
    }

    public static final void C(j2m0 j2m0Var, c3m0 c3m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(744578582);
        byte b2 = 2;
        int i2 = i | (fetVar.i(j2m0Var) ? 4 : 2) | (fetVar.g(c3m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            int i3 = i2 & 14;
            boolean z = ((i2 & 896) == 256) | (i3 == 4 || fetVar.i(j2m0Var));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new z6e0(j2m0Var, function1, b3);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4 || fetVar.i(j2m0Var));
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new a7e0(j2m0Var, c3m0Var, b3);
                fetVar.o0(objP2);
            }
            dwi0.b(function2, n0qVar, (Function1) objP2, fetVar, 48, 0);
            boolean z3 = i3 == 4 || fetVar.i(j2m0Var);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new v6e0(j2m0Var, (byte) 3);
                fetVar.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            boolean z4 = i3 == 4 || fetVar.i(j2m0Var);
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new v6e0(j2m0Var, b2);
                fetVar.o0(objP4);
            }
            v3c.z(function0, (Function0) objP4, null, fetVar, 0, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w6e0(j2m0Var, c3m0Var, function1, i, (byte) 1);
        }
    }

    public static final void D(l7m0 l7m0Var, j2m0 j2m0Var, Function1 function1, fet fetVar, int i) {
        long jM123getWhite0d7_KjU;
        wa50 ta50Var;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-366645833);
        byte b2 = 16;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(j2m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            d3m0 d3m0Var = (d3m0) l7m0Var.getValue();
            int iOrdinal = ((d3m0) l7m0Var.getValue()).b().f17581a.a().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(-1792246194);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-1792251759, fetVar, false);
                }
                fetVar.e0(-1792244046);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            }
            long j = jM123getWhite0d7_KjU;
            boolean z = d3m0Var instanceof c3m0;
            int i3 = R.drawable.ic_glyph_filter_inactive;
            if (z) {
                ArrayList arrayList = ((c3m0) d3m0Var).e;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((phv) it.next()).c) {
                            i3 = R.drawable.ic_glyph_filter_active;
                            break;
                        }
                    }
                }
            }
            ra50 ra50Var = ra50.f30118a;
            wkm wkmVar = new wkm(0, R.drawable.ic_info_white_round, true, ra50Var, j);
            wkm wkmVar2 = new wkm(1, i3, true, ra50Var, j);
            boolean z2 = z && ((c3m0) d3m0Var).e.size() > 1;
            if (z2 && z) {
                ta50Var = new va50(wkmVar, wkmVar2);
            } else {
                ta50Var = z2 ? new ta50(wkmVar2) : new ta50(wkmVar);
            }
            f9m0 f9m0Var = new f9m0(R.string.stage_table, new dmm(ta50Var), 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((d3m0) l7m0Var.getValue()).b().f17581a;
            j9m0 j9m0Var = ((d3m0) l7m0Var.getValue()).b().b;
            boolean zA = ((d3m0) l7m0Var.getValue()).a();
            int i4 = i2 & 896;
            boolean z3 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new yhl0(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new elk0(function1, (byte) 22);
                fetVar.o0(objP2);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, function0, (Function1) objP2, null, u1c.M(-419873815, new x6e0(l7m0Var, function1, j2m0Var, b3), fetVar), fetVar, 100663296, 129);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y6e0(l7m0Var, j2m0Var, function1, i, (byte) 1);
        }
    }

    public static final void E(mm40 mm40Var, final air0 air0Var, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        air0Var.getClass();
        function1.getClass();
        fetVar.g0(1018984715);
        int i2 = i | 6 | (fetVar.g(air0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "TOTO_BET_COMPOSE_SCREEN");
            String str = air0Var.f938a;
            boolean z = air0Var.e;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new sbr0(function1, (byte) 6);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new sbr0(function1, (byte) 10);
                fetVar.o0(objP2);
            }
            xia0.Y(mm40VarE0, str, z, false, function0, (Function0) objP2, u1c.M(829246151, new xdr() { // from class: a.qhr0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b2;
                    cl5 cl5Var2 = ukd.f35823a;
                    Function1 function2 = function1;
                    air0 air0Var2 = air0Var;
                    switch (b4) {
                        case 0:
                            mm40 mm40Var3 = (mm40) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            mm40Var3.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(mm40Var3) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                iur0 iur0Var = air0Var2.d;
                                dur0 dur0Var = iur0Var instanceof dur0 ? (dur0) iur0Var : null;
                                smr0 smr0Var = dur0Var != null ? dur0Var.c : null;
                                if (smr0Var == null) {
                                    fetVar2.e0(-579653474);
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(-579653473);
                                    boolean zG = fetVar2.g(function2);
                                    Object objP3 = fetVar2.P();
                                    if (zG || objP3 == cl5Var2) {
                                        objP3 = new sbr0(function2, (byte) 8);
                                        fetVar2.o0(objP3);
                                    }
                                    Function0 function3 = (Function0) objP3;
                                    boolean zG2 = fetVar2.g(function2);
                                    Object objP4 = fetVar2.P();
                                    if (zG2 || objP4 == cl5Var2) {
                                        objP4 = new sbr0(function2, (byte) 9);
                                        fetVar2.o0(objP4);
                                    }
                                    ewm0.i(smr0Var, function3, (Function0) objP4, mm40Var3, fetVar2, (iIntValue << 9) & 7168);
                                    fetVar2.r(false);
                                }
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            mm40 mm40Var4 = (mm40) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            mm40Var4.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar3.g(mm40Var4) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                imm immVar = air0Var2.b;
                                boolean zG3 = fetVar3.g(function2);
                                Object objP5 = fetVar3.P();
                                if (zG3 || objP5 == cl5Var2) {
                                    objP5 = new sbr0(function2, (byte) 11);
                                    fetVar3.o0(objP5);
                                }
                                Function0 function4 = (Function0) objP5;
                                boolean zG4 = fetVar3.g(function2);
                                Object objP6 = fetVar3.P();
                                if (zG4 || objP6 == cl5Var2) {
                                    objP6 = new sbr0(function2, (byte) 12);
                                    fetVar3.o0(objP6);
                                }
                                Function0 function5 = (Function0) objP6;
                                boolean zG5 = fetVar3.g(function2);
                                Object objP7 = fetVar3.P();
                                if (zG5 || objP7 == cl5Var2) {
                                    objP7 = new sbr0(function2, (byte) 13);
                                    fetVar3.o0(objP7);
                                }
                                Function0 function6 = (Function0) objP7;
                                boolean zG6 = fetVar3.g(function2);
                                Object objP8 = fetVar3.P();
                                if (zG6 || objP8 == cl5Var2) {
                                    objP8 = new sbr0(function2, (byte) 7);
                                    fetVar3.o0(objP8);
                                }
                                a4n0.b(mm40Var4, immVar, function4, function5, function6, (Function0) objP8, fetVar3, iIntValue2 & 14);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1975152440, new xdr() { // from class: a.qhr0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b3;
                    cl5 cl5Var2 = ukd.f35823a;
                    Function1 function2 = function1;
                    air0 air0Var2 = air0Var;
                    switch (b4) {
                        case 0:
                            mm40 mm40Var3 = (mm40) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            mm40Var3.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(mm40Var3) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                iur0 iur0Var = air0Var2.d;
                                dur0 dur0Var = iur0Var instanceof dur0 ? (dur0) iur0Var : null;
                                smr0 smr0Var = dur0Var != null ? dur0Var.c : null;
                                if (smr0Var == null) {
                                    fetVar2.e0(-579653474);
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(-579653473);
                                    boolean zG = fetVar2.g(function2);
                                    Object objP3 = fetVar2.P();
                                    if (zG || objP3 == cl5Var2) {
                                        objP3 = new sbr0(function2, (byte) 8);
                                        fetVar2.o0(objP3);
                                    }
                                    Function0 function3 = (Function0) objP3;
                                    boolean zG2 = fetVar2.g(function2);
                                    Object objP4 = fetVar2.P();
                                    if (zG2 || objP4 == cl5Var2) {
                                        objP4 = new sbr0(function2, (byte) 9);
                                        fetVar2.o0(objP4);
                                    }
                                    ewm0.i(smr0Var, function3, (Function0) objP4, mm40Var3, fetVar2, (iIntValue << 9) & 7168);
                                    fetVar2.r(false);
                                }
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            mm40 mm40Var4 = (mm40) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            mm40Var4.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar3.g(mm40Var4) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                imm immVar = air0Var2.b;
                                boolean zG3 = fetVar3.g(function2);
                                Object objP5 = fetVar3.P();
                                if (zG3 || objP5 == cl5Var2) {
                                    objP5 = new sbr0(function2, (byte) 11);
                                    fetVar3.o0(objP5);
                                }
                                Function0 function4 = (Function0) objP5;
                                boolean zG4 = fetVar3.g(function2);
                                Object objP6 = fetVar3.P();
                                if (zG4 || objP6 == cl5Var2) {
                                    objP6 = new sbr0(function2, (byte) 12);
                                    fetVar3.o0(objP6);
                                }
                                Function0 function5 = (Function0) objP6;
                                boolean zG5 = fetVar3.g(function2);
                                Object objP7 = fetVar3.P();
                                if (zG5 || objP7 == cl5Var2) {
                                    objP7 = new sbr0(function2, (byte) 13);
                                    fetVar3.o0(objP7);
                                }
                                Function0 function6 = (Function0) objP7;
                                boolean zG6 = fetVar3.g(function2);
                                Object objP8 = fetVar3.P();
                                if (zG6 || objP8 == cl5Var2) {
                                    objP8 = new sbr0(function2, (byte) 7);
                                    fetVar3.o0(objP8);
                                }
                                a4n0.b(mm40Var4, immVar, function4, function5, function6, (Function0) objP8, fetVar3, iIntValue2 & 14);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-484583735, new gcn0(air0Var, (byte) 12), fetVar), u1c.M(-2131802185, new d2s(air0Var, function1, (byte) 24), fetVar), fetVar, 920128512, 0);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var2, air0Var, function1, i, (byte) 3);
        }
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var, Function0 function0, Function0 function1, boolean z, boolean z2) {
        int i2;
        long secondary10;
        long secondary20;
        long secondary11;
        long secondary21;
        fetVar.g0(562773919);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            if (z) {
                fetVar.e0(-205801991);
                secondary10 = afn0.m(fetVar).getCommerceTint();
                fetVar.r(false);
            } else {
                fetVar.e0(-205718694);
                secondary10 = afn0.m(fetVar).getSecondary10();
                fetVar.r(false);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.K(y860.Y(i120.Q(x7zVar, secondary10, vgg0.a(12.0f)), z, null, null, function0, 14), 20.0f, 8.0f), String.valueOf(R.drawable.ic_glyph_replenish_account));
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_replenish_account, 0, fetVar);
            if (z) {
                fetVar.e0(-1114997373);
                secondary20 = afn0.m(fetVar).getCommerce();
            } else {
                fetVar.e0(-1114996346);
                secondary20 = afn0.m(fetVar).getSecondary20();
            }
            fetVar.r(false);
            dww.c(pm80VarF, null, mm40VarE0, secondary20, fetVar, 56, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            if (z2) {
                fetVar.e0(-204936564);
                secondary11 = afn0.m(fetVar).getSecondaryButtonBackground();
                fetVar.r(false);
            } else {
                fetVar.e0(-204840774);
                secondary11 = afn0.m(fetVar).getSecondary10();
                fetVar.r(false);
            }
            mm40 mm40VarE1 = o2e.e0(s5x0.K(y860.Y(i120.Q(x7zVar2, secondary11, vgg0.a(12.0f)), z2, null, null, function1, 14), 20.0f, 8.0f), String.valueOf(R.drawable.ic_glyph_withdraw_account));
            pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_withdraw_account, 0, fetVar);
            if (z2) {
                secondary21 = cs0.e(fetVar, -1114969470, fetVar, false);
            } else {
                fetVar.e0(-1114968474);
                secondary21 = afn0.m(fetVar).getSecondary20();
                fetVar.r(false);
            }
            dww.c(pm80VarF2, null, mm40VarE1, secondary21, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ue(mm40Var, z, z2, function0, function1, i, (byte) 0);
        }
    }

    public static final void G(String str, String str2, String str3, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1998166417);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str3) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(579746607, new iop(str, (pz40) objP, str2, str3, (byte) 7), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ve(str, str2, str3, i, (byte) 0);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(734198004);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 22;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
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
            imm immVarA = ((nnv0) l7m0Var.getValue()).a();
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ntu0(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(null, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            nnv0 nnv0Var = (nnv0) l7m0Var.getValue();
            if (nnv0Var != null) {
                if (nnv0Var instanceof knv0) {
                    fetVar.e0(2014447577);
                    k((knv0) nnv0Var, function1, fetVar, i3);
                    fetVar.r(false);
                } else {
                    z = false;
                    if (nnv0Var instanceof lnv0) {
                        fetVar.e0(2014452298);
                        p(((lnv0) nnv0Var).b, function1, fetVar, i3);
                        fetVar.r(false);
                    } else if (nnv0Var instanceof mnv0) {
                        fetVar.e0(2014457516);
                        y(0, fetVar);
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
            } else {
                z = false;
            }
            throw b1j.f(2014444971, fetVar, z);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i, (byte) 22);
        }
    }

    public static final mm40 I(mm40 mm40Var, boolean z, fet fetVar) {
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = mm40Var.e(s5x0.L(jm40Var, 12.0f, 0.0f, 2)).e(ny9.O(1.7777778f, jm40Var, z));
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            objP = mm40VarE.e(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var));
            fetVar.o0(objP);
        }
        return (mm40) objP;
    }

    public static final long J(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    public static final void K(bnk0 bnk0Var, String str, int i) {
        if (!bnk0Var.f2888a.isEmpty()) {
            pzw.E(bnk0Var, ". ", 0, R.color.static_white_60, 0, 0, 54);
        }
        pzw.E(bnk0Var, str, 0, i, 0, 0, 54);
    }

    public static final gzc L(c0d c0dVar, c0d c0dVar2, hzc hzcVar) {
        c0dVar2.getClass();
        hzcVar.getClass();
        c0d c0dVar3 = c0d.b;
        if (c0dVar == c0dVar3) {
            return hzcVar.c();
        }
        c0d c0dVar4 = c0d.c;
        if (c0dVar == c0dVar4) {
            return hzcVar.b();
        }
        c0d c0dVar5 = c0d.f3518a;
        if (c0dVar == c0dVar5 && c0dVar2 == c0dVar3) {
            return hzcVar.c();
        }
        if (c0dVar == c0dVar5 && c0dVar2 == c0dVar4) {
            return hzcVar.b();
        }
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        long jM121getTransparent0d7_KjU = staticColors.m121getTransparent0d7_KjU();
        long jM121getTransparent0d7_KjU2 = staticColors.m121getTransparent0d7_KjU();
        zcl zclVar = qmk.f28987a;
        return new gzc(0, jM121getTransparent0d7_KjU, jM121getTransparent0d7_KjU2, 0.0f, 0.0f, 0.0f);
    }

    public static final gzc M(c0d c0dVar, c0d c0dVar2, hzc hzcVar, fet fetVar) {
        c0dVar2.getClass();
        hzcVar.getClass();
        boolean z = c0dVar == c0d.f3518a && (c0dVar2 == c0d.d || c0dVar2 == c0d.e);
        boolean zE = fetVar.e(c0dVar.ordinal());
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            if (c0dVar == c0d.d || c0dVar == c0d.f || c0dVar == c0d.e || z) {
                objP = hzcVar.a();
            } else {
                pz40 pz40Var = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM121getTransparent0d7_KjU = staticColors.m121getTransparent0d7_KjU();
                long jM121getTransparent0d7_KjU2 = staticColors.m121getTransparent0d7_KjU();
                zcl zclVar = qmk.f28987a;
                objP = new gzc(0, jM121getTransparent0d7_KjU, jM121getTransparent0d7_KjU2, 0.0f, 0.0f, 0.0f);
            }
            fetVar.o0(objP);
        }
        return (gzc) objP;
    }

    public static final long N(c0d c0dVar, k43 k43Var, fet fetVar) {
        int iOrdinal = c0dVar.ordinal();
        if (iOrdinal == 1) {
            fetVar.e0(1256441147);
            long coefHigher = ((IndividualColors) fetVar.k(j7x.f16059a)).getCoefHigher();
            fetVar.r(false);
            return coefHigher;
        }
        if (iOrdinal == 2) {
            fetVar.e0(1256443546);
            long coefLower = ((IndividualColors) fetVar.k(j7x.f16059a)).getCoefLower();
            fetVar.r(false);
            return coefLower;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            fetVar.e0(1256447720);
            fetVar.r(false);
            return k43Var.i();
        }
        fetVar.e0(1256449835);
        fetVar.r(false);
        return k43Var.d();
    }

    public static final s4u0 O(gzc gzcVar, fet fetVar) {
        gzcVar.getClass();
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        long jM121getTransparent0d7_KjU = staticColors.m121getTransparent0d7_KjU();
        long jM121getTransparent0d7_KjU2 = staticColors.m121getTransparent0d7_KjU();
        zcl zclVar = qmk.f28987a;
        if (gzcVar.equals(new gzc(0, jM121getTransparent0d7_KjU, jM121getTransparent0d7_KjU2, 0.0f, 0.0f, 0.0f))) {
            fetVar.e0(457506111);
            fetVar.r(false);
            return null;
        }
        fetVar.e0(457362116);
        s4u0 s4u0VarR = iom0.r(jpm0.t(gzcVar.f12175a, 6, fetVar), fetVar);
        fetVar.r(false);
        return s4u0VarR;
    }

    public static mm40 P(mm40 mm40Var, rah0 rah0Var, boolean z, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        return U(mm40Var, rah0Var, z, null, true, false, true);
    }

    public static final long Q(c5n0 c5n0Var, final k43 k43Var, boolean z, int i, final String str, final String str2, wz40 wz40Var, final g9q0 g9q0Var) {
        final int i2;
        boolean z2;
        str.getClass();
        str2.getClass();
        wz40Var.getClass();
        g9q0Var.getClass();
        final int iW0 = (int) c5n0Var.w0(k43Var.h());
        final int iMax = Math.max((int) c5n0Var.w0(k43Var.f().c().f), Math.max((int) c5n0Var.w0(k43Var.f().b().f), (int) c5n0Var.w0(k43Var.f().a().f)));
        y9q0 y9q0VarB = k43Var.b();
        if (z && k43Var.j() == o05.b) {
            i2 = i;
            z2 = R(str2, iMax, iW0, str, y9q0VarB, y9q0VarB.f42262a.b, g9q0Var) <= i2;
        } else {
            i2 = i;
            z2 = z;
        }
        wz40Var.f40005a = Boolean.valueOf(z2);
        final boolean z3 = z2;
        return v3c.L(k43Var.b().f42262a.b, k43Var.e(), new Function1() { // from class: a.h43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iR;
                daq0 daq0Var = (daq0) obj;
                boolean z4 = z3;
                k43 k43Var2 = k43Var;
                String str3 = str2;
                int i3 = iMax;
                g9q0 g9q0Var2 = g9q0Var;
                if (z4) {
                    iR = wha0.R(str3, i3, iW0, str, k43Var2.b(), daq0Var.f5764a, g9q0Var2);
                } else {
                    iR = ((int) (g9q0.a(g9q0Var2, str3, y9q0.a(k43Var2.b(), 0L, daq0Var.f5764a, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 1, 0L, null, 1004).c >> 32)) + i3;
                }
                return Boolean.valueOf(iR > i2);
            }
        });
    }

    public static final int R(String str, int i, int i2, String str2, y9q0 y9q0Var, long j, g9q0 g9q0Var) {
        return ((int) (g9q0.a(g9q0Var, str, y9q0.a(y9q0Var, 0L, j, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 1, 0L, null, 1004).c >> 32)) + i + i2 + ((int) (g9q0.a(g9q0Var, str2, y9q0.a(y9q0Var, 0L, j, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 0, 1, 0L, null, 1004).c >> 32));
    }

    public static final byte[] S(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        J(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final rah0 T(fet fetVar) {
        Object[] objArr = new Object[0];
        boolean zE = fetVar.e(0);
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            objP = new yxg0((byte) 23);
            fetVar.o0(objP);
        }
        return (rah0) e9x.R(objArr, rah0.k, (Function0) objP, fetVar, 0);
    }

    public static final mm40 U(mm40 mm40Var, rah0 rah0Var, boolean z, iuj iujVar, boolean z2, boolean z3, boolean z4) {
        mm40 mm40VarD0;
        ma80 ma80Var = z3 ? ma80.f21447a : ma80.b;
        if (z4) {
            gy40 gy40Var = rah0Var.e;
            ma80 ma80Var2 = ma80.f21447a;
            jm40 jm40Var = jm40.b;
            mm40VarD0 = mm40Var.e(ma80Var == ma80Var2 ? lgb.J(jm40Var, ljc.d) : lgb.J(jm40Var, ljc.c)).e(new uah0(null, iujVar, gy40Var, ma80Var, null, rah0Var, z2, z, true));
        } else {
            mm40VarD0 = nia0.d0(mm40Var, rah0Var, ma80Var, null, z2, z, iujVar, rah0Var.e, null);
        }
        return mm40VarD0.e(new och0(rah0Var, z, z3));
    }

    public static final Object[] V(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = f39158a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    public static final Object[] W(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0109  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final xf5 X(ag5 ag5Var) {
        ?? arrayList;
        ?? arrayList2;
        wf5 wf5Var;
        ag5Var.getClass();
        List list = ag5Var.f812a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x1x.Q((ooa) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        List list2 = ag5Var.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x1x.Q((ooa) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        String str = ag5Var.e;
        if (str == null) {
            str = "";
        }
        switch (str) {
            case "Prematch":
                wf5Var = wf5.f39052a;
                break;
            case "DealerMove":
                wf5Var = wf5.c;
                break;
            case "PlayerMove":
                wf5Var = wf5.b;
                break;
            case "0":
                wf5Var = wf5.f39052a;
                break;
            case "1":
                wf5Var = wf5.b;
                break;
            case "2":
                wf5Var = wf5.c;
                break;
            case "3":
                wf5Var = wf5.g;
                break;
            case "4":
                wf5Var = wf5.h;
                break;
            case "5":
            case "Draw":
                wf5Var = wf5.i;
                break;
            case "Win1":
                wf5Var = wf5.g;
                break;
            case "Win2":
                wf5Var = wf5.h;
                break;
            case "RoundDraw":
                wf5Var = wf5.f;
                break;
            case "RoundWin1":
                wf5Var = wf5.d;
                break;
            case "RoundWin2":
                wf5Var = wf5.e;
                break;
            default:
                wf5Var = wf5.j;
                break;
        }
        return new xf5(wf5Var, arrayList, arrayList2);
    }

    public static final ru6 Y(qu6 qu6Var) {
        qu6Var.getClass();
        return new ru6(qu6Var.f29333a, qu6Var.s, 0.0d, qu6Var.b, qu6Var.w, qu6Var.t, qu6Var.d, qu6Var.x, qu6Var.y, qu6Var.z.f12022a, Double.valueOf(qu6Var.C), qu6Var.D);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x0201  */
    /* JADX WARN: Code duplicated, block: B:126:0x0218  */
    /* JADX WARN: Code duplicated, block: B:129:0x021f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0222  */
    /* JADX WARN: Code duplicated, block: B:133:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0234  */
    /* JADX WARN: Code duplicated, block: B:139:0x023b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0244  */
    /* JADX WARN: Code duplicated, block: B:144:0x024c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0256  */
    /* JADX WARN: Code duplicated, block: B:152:0x025d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0267  */
    public static final BetZip Z(v9s v9sVar, ueo ueoVar, boolean z, sip sipVar, long j, long j2, String str, String str2, boolean z2, boolean z3, w9s w9sVar, z9s z9sVar, boolean z4, boolean z5) {
        String strA;
        String str3;
        Long l;
        boolean z6;
        boolean z7;
        izc izcVarB;
        long j3;
        long jLongValue;
        Long l2;
        long jLongValue2;
        boolean z8;
        boolean z9;
        BetPlayerZip betPlayerZip;
        String strValueOf;
        boolean z10;
        Integer num;
        boolean z11;
        int i;
        sipVar.getClass();
        str.getClass();
        str2.getClass();
        z9sVar.getClass();
        long j4 = v9sVar.f37049a;
        Integer num2 = v9sVar.p;
        BetPlayerZip betPlayerZip2 = v9sVar.j;
        EventParams eventParams = v9sVar.w;
        String str4 = v9sVar.h;
        String str5 = v9sVar.e;
        Long l3 = v9sVar.q;
        double d2 = v9sVar.b;
        double d3 = v9sVar.d;
        if (j4 == 707) {
            strA = str2;
        } else {
            strA = dii0.a(ueoVar.b, eventParams.f46427a, eventParams.b, Integer.valueOf(ueoVar.c), z, v9sVar.f, betPlayerZip2 != null ? betPlayerZip2.b : null, Long.valueOf(j2), ueoVar.f35538a, nt20.f, z4, z5);
        }
        long jF0 = gq80.f0(Long.valueOf(j4), Long.valueOf(v9sVar.c), Double.valueOf(d3), strA);
        List list = z9sVar.c;
        if (list != null && list.isEmpty()) {
            str3 = str5;
            l = l3;
            z6 = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = str5;
                l = l3;
                z6 = false;
                break;
            }
            m97 m97Var = ((pbs0) it.next()).b;
            str3 = str5;
            l = l3;
            if (m97Var.f21398a == j && m97Var.h == j4 && m97Var.k == d3) {
                if (m97Var.f == (l != null ? l.longValue() : 0L)) {
                    z6 = true;
                    break;
                }
            }
            str5 = str3;
            l3 = l;
        }
        List list2 = z9sVar.b;
        if (list2 != null && list2.isEmpty()) {
            z7 = false;
            break;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z7 = false;
                break;
            }
            ru6 ru6Var = (ru6) it2.next();
            if (ru6Var.d == j && ru6Var.h == j4 && ru6Var.f == d3) {
                if (ru6Var.g == (l != null ? l.longValue() : 0L)) {
                    z7 = true;
                    break;
                }
            }
        }
        BetPlayerZip betPlayerZip3 = betPlayerZip2 == null ? new BetPlayerZip(0L, "") : betPlayerZip2;
        PlayersDuelZip playersDuelZip = v9sVar.u;
        if (playersDuelZip == null) {
            iun iunVar = iun.f15405a;
            playersDuelZip = new PlayersDuelZip(iunVar, iunVar);
        }
        PlayersDuelZip playersDuelZip2 = playersDuelZip;
        zyc zycVar = w9sVar != null ? (zyc) w9sVar.f38796a.get(new g97(jF0)) : null;
        if (zycVar == null) {
            izcVarB = izc.d;
        } else if (z2) {
            yk5 yk5Var = izc.f15629a;
            double d4 = zycVar.f45199a;
            yk5Var.getClass();
            izcVarB = yk5.b(d2, d4);
        } else {
            izcVarB = zycVar.b;
        }
        izc izcVar = izcVarB;
        long j5 = v9sVar.f37049a;
        double d5 = v9sVar.b;
        BetPlayerZip betPlayerZip4 = betPlayerZip3;
        long j6 = v9sVar.c;
        String str6 = strA;
        double d6 = v9sVar.d;
        String str7 = str3 == null ? "" : str3;
        boolean z12 = v9sVar.g;
        String str8 = str4 == null ? "" : str4;
        String str9 = v9sVar.i;
        String str10 = str9 == null ? "" : str9;
        Integer num3 = v9sVar.k;
        int iIntValue = num3 != null ? num3.intValue() : 0;
        Long l4 = v9sVar.l;
        long jLongValue3 = l4 != null ? l4.longValue() : 0L;
        uoy uoyVarJ = v9sVar.n;
        if (uoyVarJ == null) {
            tqt tqtVar = uoy.b;
            int iOrdinal = sipVar.ordinal();
            if (iOrdinal == 0) {
                i = 3;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                i = 1;
            }
            tqtVar.getClass();
            uoyVarJ = tqt.j(i);
        } else {
            z12 = z12;
        }
        uoy uoyVar = uoyVarJ;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        long j7 = betPlayerZip4.f46425a;
        Long lValueOf = j7 != 0 ? Long.valueOf(j7) : null;
        if (lValueOf == null) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                j3 = 0;
            }
            Boolean bool = v9sVar.r;
            Boolean bool2 = Boolean.TRUE;
            boolean zD = Intrinsics.d(bool, bool2);
            l2 = v9sVar.s;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            boolean zD2 = Intrinsics.d(v9sVar.t, bool2);
            if (d2 == 0.0d && !Intrinsics.d(str4, "SP")) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (d2 == 0.0d) {
                z9 = true;
            } else {
                z9 = false;
            }
            String str11 = betPlayerZip4.b;
            if (num2 == null) {
                betPlayerZip = betPlayerZip4;
                boolean z13 = num2.intValue() == 1;
                if (str3 != null || str3.length() <= 0) {
                    strValueOf = String.valueOf(d3);
                } else {
                    strValueOf = str3;
                }
                if (d2 == 0.0d || Intrinsics.d(str4, "SP")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                num = v9sVar.v;
                if (num == null && num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new BetZip(j5, d5, j6, d6, str7, z12, str8, str10, betPlayerZip, iIntValue, jLongValue3, uoyVar, j, iIntValue2, j3, zD, jLongValue2, zD2, playersDuelZip2, str6, str, izcVar, z6, z8, z7, z9, str11, z13, false, strValueOf, z10, z11, z3, new EventParams(eventParams.f46427a, eventParams.b));
            }
            betPlayerZip = betPlayerZip4;
            if (str3 != null) {
                strValueOf = String.valueOf(d3);
            } else {
                strValueOf = String.valueOf(d3);
            }
            if (d2 == 0.0d) {
                z10 = true;
            } else {
                z10 = true;
            }
            num = v9sVar.v;
            if (num == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            return new BetZip(j5, d5, j6, d6, str7, z12, str8, str10, betPlayerZip, iIntValue, jLongValue3, uoyVar, j, iIntValue2, j3, zD, jLongValue2, zD2, playersDuelZip2, str6, str, izcVar, z6, z8, z7, z9, str11, z13, false, strValueOf, z10, z11, z3, new EventParams(eventParams.f46427a, eventParams.b));
        }
        jLongValue = lValueOf.longValue();
        j3 = jLongValue;
        Boolean bool3 = v9sVar.r;
        Boolean bool4 = Boolean.TRUE;
        boolean zD3 = Intrinsics.d(bool3, bool4);
        l2 = v9sVar.s;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        boolean zD4 = Intrinsics.d(v9sVar.t, bool4);
        if (d2 == 0.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (d2 == 0.0d) {
            z9 = true;
        } else {
            z9 = false;
        }
        String str12 = betPlayerZip4.b;
        if (num2 == null) {
            betPlayerZip = betPlayerZip4;
            if (num2.intValue() == 1) {
            }
            if (str3 != null) {
                strValueOf = String.valueOf(d3);
            } else {
                strValueOf = String.valueOf(d3);
            }
            if (d2 == 0.0d) {
                z10 = true;
            } else {
                z10 = true;
            }
            num = v9sVar.v;
            if (num == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            return new BetZip(j5, d5, j6, d6, str7, z12, str8, str10, betPlayerZip, iIntValue, jLongValue3, uoyVar, j, iIntValue2, j3, zD3, jLongValue2, zD4, playersDuelZip2, str6, str, izcVar, z6, z8, z7, z9, str12, z13, false, strValueOf, z10, z11, z3, new EventParams(eventParams.f46427a, eventParams.b));
        }
        betPlayerZip = betPlayerZip4;
        if (str3 != null) {
            strValueOf = String.valueOf(d3);
        } else {
            strValueOf = String.valueOf(d3);
        }
        if (d2 == 0.0d) {
            z10 = true;
        } else {
            z10 = true;
        }
        num = v9sVar.v;
        if (num == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        return new BetZip(j5, d5, j6, d6, str7, z12, str8, str10, betPlayerZip, iIntValue, jLongValue3, uoyVar, j, iIntValue2, j3, zD3, jLongValue2, zD4, playersDuelZip2, str6, str, izcVar, z6, z8, z7, z9, str12, z13, false, strValueOf, z10, z11, z3, new EventParams(eventParams.f46427a, eventParams.b));
    }

    public static final void a(Function0 function0, Function0 function1, String str, String str2, String str3, boolean z, boolean z2, mm40 mm40Var, fet fetVar, int i) {
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1785059001);
        int i2 = i | (fetVar.i(function0) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str3) ? 16384 : 8192) | (fetVar.h(z) ? 131072 : 65536) | (fetVar.h(z2) ? 1048576 : 524288) | (fetVar.g(mm40Var) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(o7k0.g(mm40Var, 146.0f, 0.0f, 2), 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            G(str, str2, str3, fetVar, (i2 >> 6) & 1022);
            int i3 = (i2 >> 12) & 1008;
            int i4 = i2 << 9;
            F((i4 & 57344) | i3 | (i4 & 7168), fetVar, jr8.f16991a.b(jm40.b, gqw0.h), function0, function1, z, z2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new te(function0, function1, str, str2, str3, z, z2, mm40Var, i);
        }
    }

    public static mm40 a0(mm40 mm40Var, rah0 rah0Var, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return U(mm40Var, rah0Var, false, null, z, true, true);
    }

    public static final void b(int i, pp0 pp0Var, fet fetVar, mm40 mm40Var, lh80 lh80Var, Function0 function0, Function1 function1) {
        mm40 mm40Var2;
        float fA;
        jm40 jm40Var;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.f;
        pp0Var.getClass();
        fetVar2.g0(1054630137);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(pp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(lh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            boolean z3 = pp0Var instanceof np0;
            np0 np0Var = z3 ? (np0) pp0Var : null;
            boolean z4 = np0Var != null && np0Var.b;
            float f2 = lh80Var.c;
            if (z4) {
                fA = s5x0.A(lh80Var, k6zVar);
            } else {
                zcl zclVar = qmk.f28987a;
                fA = 0.0f;
            }
            float f3 = lh80Var.e;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, f2, fA, f3, 1);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40VarN, 48.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            cl5 cl5Var = ukd.f35823a;
            jr8 jr8Var = jr8.f16991a;
            if (z3) {
                fetVar2.e0(1429893902);
                np0 np0Var2 = (np0) pp0Var;
                boolean z5 = np0Var2.b;
                fyl fylVar = np0Var2.f23889a;
                boolean zG = fetVar2.g(fylVar) | ((i2 & 896) == 256);
                Object objP = fetVar2.P();
                if (zG || objP == cl5Var) {
                    objP = fyl.a(fylVar, s5x0.u(s5x0.B(lh80Var, k6zVar), 0.0f, z4 ? 8.0f : s5x0.A(lh80Var, k6zVar), 0.0f, 10));
                    fetVar2.o0(objP);
                }
                jm40Var = jm40Var2;
                ebc.r(o7k0.A(jr8Var.b(s5x0.N(jm40Var2, 0.0f, 0.0f, z5 ? 32.0f : 0.0f, 0.0f, 11), zx7Var), null, 3), (fyl) objP, vxl.f38204a, function1, null, fetVar2, (57344 & i2) | 384, 40);
                if (z5) {
                    fetVar2.e0(1430882337);
                    gkb.j(jr8Var.b(o7k0.s(o7k0.e(jm40Var, 48.0f), 48.0f), zx7Var), mp0.f22154a, np0Var2.d, function0, fetVar2, (i2 & 7168) | 48);
                    fetVar2 = fetVar2;
                    z2 = false;
                    fetVar2.r(false);
                } else {
                    z2 = false;
                    fetVar2.e0(1431326319);
                    fetVar2.r(false);
                }
                fetVar2.r(z2);
                z = true;
            } else {
                jm40Var = jm40Var2;
                z = true;
                if (!(pp0Var instanceof op0)) {
                    throw b1j.f(-1754991083, fetVar2, false);
                }
                fetVar2.e0(1431410670);
                gyl gylVar = ((op0) pp0Var).f25615a;
                boolean zG2 = ((i2 & 896) == 256) | fetVar2.g(gylVar);
                Object objP2 = fetVar2.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = gyl.a(gylVar, s5x0.u(s5x0.B(lh80Var, k6zVar), 0.0f, s5x0.A(lh80Var, k6zVar), 0.0f, 10));
                    fetVar2.o0(objP2);
                }
                ebc.r(jr8Var.b(o7k0.d(jm40Var, 1.0f), zx7Var), (gyl) objP2, null, null, null, fetVar2, 0, 60);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so0(mm40Var2, pp0Var, lh80Var, function0, function1, i);
        }
    }

    public static final void c(mm40 mm40Var, bml bmlVar, mtl mtlVar, d9z d9zVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        boolean z;
        fet fetVar2 = fetVar;
        bmlVar.getClass();
        d9zVar.getClass();
        function1.getClass();
        fetVar2.g0(621632727);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar2.g(bmlVar) ? 32 : 16) | (fetVar2.g(mtlVar) ? 256 : 128) | (fetVar2.g(d9zVar) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i5 & 1, (i5 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i4 != 0 ? jm40Var : mm40Var2;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(mm40Var4.e(n0qVar), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, mtlVar != null ? 100.0f : 24.0f, fetVar2);
            int i6 = 57344 & i5;
            boolean z2 = i6 == 16384;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new si1(function1, (byte) 13);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i6 == 16384;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new h61(function1, (byte) 20);
                fetVar2.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z4 = i6 == 16384;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new h61(function1, (byte) 21);
                fetVar2.o0(objP3);
            }
            ckb.f(n0qVar, bmlVar, d9zVar, ch80VarF, function0, null, function2, (Function1) objP3, fetVar2, (i5 & 112) | 6 | ((i5 >> 3) & 896), 32);
            if (mtlVar == null) {
                fetVar2.e0(1084396451);
                fetVar2.r(false);
                z = true;
                fetVar2 = fetVar2;
            } else {
                fetVar2.e0(1084396452);
                mm40 mm40VarE0 = o2e.e0(s5x0.N(o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), 1.0f), 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7), "FULL_INFO_GAMES_BOTTOM_BAR");
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                boolean z5 = i6 == 16384;
                Object objP4 = fetVar2.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new h61(function1, (byte) 22);
                    fetVar2.o0(objP4);
                }
                z = true;
                fetVar2 = fetVar;
                bkb.f(mm40VarE0, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar2, 3072, 4);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var3 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vs1(mm40Var3, (Object) bmlVar, mtlVar, (bch0) d9zVar, function1, i, i2, (byte) 2);
        }
    }

    public static final void d(mm40 mm40Var, m02 m02Var, Function1 function1, fet fetVar, int i) {
        m02Var.getClass();
        function1.getClass();
        fetVar.g0(1827049544);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(m02Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) fetVar.k(dy2.b);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            rqm rqmVar = m02Var.b;
            boolean zI = ((i2 & 896) == 256) | ((i2 & 112) == 32) | fetVar.i(context);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new j02(function1, m02Var, context, b2);
                fetVar.o0(objP);
            }
            obc.q(mm40VarD, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, m02Var, function1, i, (byte) 25);
        }
    }

    public static final void e(mm40 mm40Var, l7m0 l7m0Var, wul wulVar, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, xdr xdrVar, ydr ydrVar, ydr ydrVar2, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        ydr ydrVar3;
        ydr ydrVar4;
        ydr ydrVar5 = ydrVar2;
        fet fetVar3 = fetVar;
        l7m0Var.getClass();
        wulVar.getClass();
        function0.getClass();
        fetVar3.g0(1750019480);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.g(wulVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar3.i(ugdVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar3.i(ugdVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar3.i(ugdVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar3.i(xdrVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar3.i(ydrVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar3.i(ydrVar5) ? 536870912 : 268435456;
        }
        if (fetVar3.U(i2 & 1, (306783379 & i2) != 306783378)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            int i3 = i2;
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar3.P();
            boolean z3 = z2;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new we4(l7m0Var, (byte) 22);
                fetVar3.o0(objP);
            }
            mm40 mm40VarA0 = qxw.a0(mm40VarD, (Function0) objP);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarA0);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            Boolean bool = (Boolean) l7m0Var.getValue();
            bool.getClass();
            jwb.e(bool, mm40VarA, null, null, u1c.M(-864841807, new ef4(ugdVar, ugdVar2, (byte) 1), fetVar3), fetVar, 24576, 12);
            if (xdrVar == null) {
                fetVar.e0(-1601539617);
            } else {
                fetVar.e0(-1852777886);
                xdrVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 18) & 112) | 6));
            }
            fetVar.r(false);
            fetVar.r(true);
            Integer numValueOf2 = Integer.valueOf(((i3 >> 15) & 112) | 6);
            Object obj = y5d.f42040a;
            ugdVar3.F(obj, fetVar, numValueOf2);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = o7k0.d(jm40Var, 1.0f);
                fetVar.o0(objP2);
            }
            mm40 mm40Var2 = (mm40) objP2;
            if (ydrVar == null) {
                fetVar.e0(-1352411465);
                fetVar.r(false);
            } else {
                fetVar.e0(-1844741494);
                ydrVar.j(obj, mm40Var2, fetVar, Integer.valueOf(54 | ((i3 >> 18) & 896)));
                fetVar.r(false);
            }
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                if (ydrVar2 == null) {
                    objP3 = mm40Var2;
                } else {
                    zcl zclVar = qmk.f28987a;
                    objP3 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7).e(mm40Var2);
                }
                fetVar.o0(objP3);
            }
            mm40 mm40Var3 = (mm40) objP3;
            boolean z4 = (i3 & 7168) == 2048;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                f8 f8Var = new f8(0, function0, Function0.class, "invoke", "invoke()Ljava/lang/Object;", 0, (byte) 12);
                fetVar.o0(f8Var);
                objP4 = f8Var;
            }
            fet fetVar4 = fetVar;
            qzb.n(mm40Var3, wulVar, (Function0) ((jhy) objP4), fetVar4, ((i3 >> 3) & 112) | 6, 0);
            if (ydrVar2 == null) {
                fetVar4.e0(-1351983913);
                fetVar4.r(false);
                ydrVar4 = ydrVar2;
            } else {
                fetVar4.e0(-1844727702);
                ydr ydrVar6 = ydrVar2;
                ydrVar6.j(obj, mm40Var2, fetVar4, Integer.valueOf(54 | ((i3 >> 21) & 896)));
                fetVar4.r(false);
                ydrVar4 = ydrVar6;
            }
            fetVar4.r(true);
            ydrVar3 = ydrVar4;
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            ydrVar3 = ydrVar5;
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ej4(mm40Var, l7m0Var, wulVar, function0, ugdVar, ugdVar2, ugdVar3, xdrVar, ydrVar, ydrVar3, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v20, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v21, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    public static final void f(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        mm40 mm40Var2;
        ?? r4;
        boolean z;
        int i2;
        cl5 cl5Var;
        jm40 jm40Var;
        ?? r10;
        int i3;
        Function1 function3;
        ?? r5;
        ?? r6;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1413550446);
        int i4 = i | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            tr6 tr6Var = (tr6) l7m0Var.getValue();
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarQ = i120.Q(yyw.X(o7k0.c, null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            imm immVarC = tr6Var.c();
            int i5 = i4 & 896;
            boolean z3 = i5 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z3 || objP == cl5Var2) {
                objP = new to6(function1, (byte) 2);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVarC, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            boolean z4 = tr6Var instanceof rr6;
            jr8 jr8Var = jr8.f16991a;
            if (z4) {
                fetVar.e0(961943100);
                z = false;
                cy2.r(0, fetVar);
                fetVar.r(false);
                r5 = fetVar;
                i2 = i5;
                cl5Var = cl5Var2;
                jm40Var = jm40Var2;
                r10 = 1;
                i3 = 256;
                function2 = function1;
            } else {
                z = false;
                if (tr6Var instanceof qr6) {
                    fetVar.e0(961945677);
                    r10 = 1;
                    mm40 mm40VarD2 = o7k0.d(new x7z(1.0f, true), 1.0f);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD2);
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
                    jm40Var = jm40Var2;
                    mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                    mdm mdmVar = ((qr6) tr6Var).b;
                    i2 = i5;
                    i3 = 256;
                    boolean z5 = i2 == 256;
                    Object objP2 = fetVar.P();
                    cl5Var = cl5Var2;
                    if (z5 || objP2 == cl5Var) {
                        function3 = function1;
                        objP2 = new to6(function3, (byte) 3);
                        fetVar.o0(objP2);
                    } else {
                        function3 = function1;
                    }
                    function2 = function3;
                    fet fetVar2 = fetVar;
                    jcb.l(mm40VarB, mdmVar, false, (Function0) objP2, fetVar2, 0, 4);
                    fetVar2.r(true);
                    fetVar2.r(false);
                    r5 = fetVar2;
                } else {
                    fet fetVar3 = fetVar;
                    i2 = i5;
                    cl5Var = cl5Var2;
                    jm40Var = jm40Var2;
                    r10 = 1;
                    i3 = 256;
                    function2 = function1;
                    if (!(tr6Var instanceof sr6)) {
                        throw b1j.f(961941626, fetVar3, false);
                    }
                    g(rz4.f(fetVar3, 961962413, 1.0f, true), (sr6) tr6Var, function2, fetVar3, i2);
                    fetVar3.r(false);
                    r5 = fetVar3;
                }
            }
            r5.r(r10);
            if (tr6Var instanceof sr6) {
                sr6 sr6Var = (sr6) tr6Var;
                if (sr6Var.e) {
                    r5.e0(-1470848619);
                    mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                    mtl mtlVar = sr6Var.b;
                    ?? r7 = i2 == i3 ? r10 : z;
                    Object objP3 = r5.P();
                    if (r7 != 0 || objP3 == cl5Var) {
                        objP3 = new uo6(function2, r10);
                        r5.o0(objP3);
                    }
                    bkb.f(mm40VarB2, mtlVar, null, false, null, (Function1) objP3, fetVar, 0, 28);
                    fet fetVar4 = fetVar;
                    fetVar4.r(z);
                    r6 = fetVar4;
                } else {
                    r5.e0(-1470567046);
                    r5.r(z);
                    r6 = r5;
                }
            } else {
                r5.e0(-1470567046);
                r5.r(z);
                r6 = r5;
            }
            r6.r(r10);
            mm40Var2 = jm40Var;
            r4 = r6;
        } else {
            fet fetVar5 = fetVar;
            function2 = function1;
            fetVar5.X();
            mm40Var2 = mm40Var;
            r4 = fetVar5;
        }
        yfe0 yfe0VarU = r4.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function2, i, (byte) 7);
        }
    }

    public static final void g(mm40 mm40Var, sr6 sr6Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1412118970);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(sr6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            vxl vxlVar = vxl.f38204a;
            hyl hylVar = sr6Var.f;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new uo6(function1, b2);
                fetVar2.o0(objP);
            }
            boolean z2 = false;
            ebc.r(mm40VarD, hylVar, vxlVar, (Function1) objP, null, fetVar2, 390, 40);
            mm40 mm40VarI = hne.i(1.0f, true, "LAZY_COLUMN_BET_CONSTRUCTOR");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            lh80 lh80VarU = s5x0.u(qmk.a(fetVar2).c, 0.0f, qmk.a(fetVar2).c, 32.0f + (sr6Var.e ? 64.0f : 0.0f), 2);
            boolean z3 = (i2 & 112) == 32;
            if (i3 == 256) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new qo5(sr6Var, function1, (byte) 19);
                fetVar2.o0(objP2);
            }
            b8k0.e(mm40VarI, null, lh80VarU, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, 490);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 5, i, (Object) mm40Var, (Object) sr6Var, function1);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1246011553);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.d(i120.Q(qcc.F(mm40Var, jM62getBlack0d7_KjU, 20.0f, 8.0f, 0.0f, 0.4f, 88), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), 1.0f), null, false, 3);
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
            ua80.p(54, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gn8(mm40Var, ugdVar, i, b2);
        }
    }

    public static final void i(boolean z, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1947805639);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 3;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ju70.h(o7k0.d(jm40.b, 1.0f), u1c.M(-626714828, new ldc(z, function1, b2), fetVar), fetVar, 54, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rt9(z, function1, i, b2);
        }
    }

    public static final void j(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(293592529);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            m8x.y(n0qVar, u1c.M(387751565, new x6s(function1, (byte) 8), fetVar), u1c.M(-1554426900, new p7y(l7m0Var, function1, (byte) 11), fetVar), null, null, 0, background, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(1754164450, new xs4(l7m0Var, function1, (byte) 29), fetVar), fetVar, 805306806, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 12);
        }
    }

    public static final void k(knv0 knv0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-533507309);
        int i2 = (fetVar.g(knv0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(639080019, new inv0(function1, knv0Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new inv0(knv0Var, function1, i);
        }
    }

    public static final void l(mm40 mm40Var, izh izhVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        int i3;
        jm40 jm40Var;
        boolean z;
        float f2;
        pcy pcyVar;
        pcy pcyVar2;
        fet fetVar2 = fetVar;
        String str = izhVar.i;
        pge pgeVar = gqw0.A;
        function0.getClass();
        function1.getClass();
        fetVar2.g0(335118035);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(izhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            String str2 = izhVar.f15635a;
            boolean zG = fetVar2.g(str);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new wul(lul.e, oe9.d, new ue9(str), true, false, true);
                fetVar2.o0(objP);
            }
            wul wulVar = (wul) objP;
            boolean zG2 = fetVar2.g(str2);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new hjm(str2 == null ? "" : str2, null, null, null, null, null, false, null, null, false, null, null, 8190);
                fetVar2.o0(objP2);
            }
            hjm hjmVar = (hjm) objP2;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar3);
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
            boolean zW = StringsKt.W(hjmVar.f13167a);
            jm40 jm40Var2 = jm40.b;
            if (zW) {
                i3 = i2;
                jm40Var = jm40Var2;
                z = false;
                f2 = 1.0f;
                fetVar2.e0(1343169061);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1342912474);
                zcl zclVar = qmk.f28987a;
                i3 = i2;
                jm40Var = jm40Var2;
                z = false;
                f2 = 1.0f;
                nkb.h(s5x0.L(o7k0.e(jm40Var2, 40.0f), 8.0f, 0.0f, 2), hjmVar, kjm.f18392a, null, null, null, fetVar, 384, 56);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, f2);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.e(mm40VarD2, 128.0f), vgg0.a(16.0f));
            ((hi0) fetVar2.k(ii0.f14805a)).getClass();
            long j = hi0.n;
            mm40 mm40VarQ = i120.Q(mm40VarJ, j, jd8.n);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = dw9.j(fetVar2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, (gy40) objP3, null, false, null, function1, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar3;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = r21;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, r25, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            n0x n0xVar = izhVar.l;
            fetVar2.e0(914877789);
            pcy pcyVar4 = pcyVar;
            j0x.b(lv00.T(n0xVar, null, null, null, fetVar, 48, 12), null, yyw.V(jr8.f16991a.b(lgb.J(o7k0.e(o7k0.s(jm40Var, 256.0f), 128.0f), vgg0.c(0.0f, 16.0f, 0.0f, 0.0f, 13)), gqw0.c), fetVar2.k(bmd.n) == k6z.b), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
            fetVar.r(false);
            wvb.A(null, hi0.p, j, fetVar, 6);
            mm40 mm40VarM = s5x0.M(o7k0.c, 16.0f, 12.0f, 16.0f, 8.0f);
            nw3 nw3Var = uc9.g;
            x5d x5dVarA2 = w5d.a(nw3Var, xx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar4;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar4;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, r25, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, r25, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            mm40 mm40VarD3 = o7k0.d(o7k0.g(jm40Var, 20.0f, 0.0f, 2), 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarD3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, r25, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new thd((byte) 4);
                fetVar.o0(objP4);
            }
            mm40 mm40VarN = s5x0.N(knx.Q(jm40Var, (xdr) objP4), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            long j2 = qmk.q;
            long j3 = qmk.s;
            long j4 = qmk.n;
            n05 n05Var = new n05(j2, j3, j4);
            String str3 = izhVar.c;
            y9q0 y9q0VarJ = g1t0.j();
            zfn zfnVar = m8m0.f21378a;
            pcy pcyVar5 = pcyVar2;
            v8q0.a(str3, mm40VarN, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarJ, fetVar, 0, 24960, 110576);
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar5);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            j0x.b(a8k0.F(R.drawable.ic_glyph_history, 0, fetVar), null, s5x0.N(o7k0.n(jm40Var, 20.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11), null, pgeVar, 0.0f, null, fetVar, 24632, 104);
            String str4 = izhVar.b;
            if (str4 == null) {
                str4 = "";
            }
            jm40 jm40Var3 = jm40Var;
            j6n.h(str4, gso0.f11839a, jm40Var3, 0, 0, fetVar, 432, 24);
            fetVar.r(true);
            fetVar.r(true);
            v8q0.a(izhVar.f, s5x0.N(jm40Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(qmk.p, j2, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 2, null, g1t0.g(), fetVar, 0, 221568, 77808);
            fetVar.r(true);
            thg0 thg0VarA3 = shg0.a(nw3Var, yx7Var, fetVar, 54);
            int iHashCode7 = Long.hashCode(fetVar.T);
            bh90 bh90VarM7 = fetVar.m();
            mm40 mm40VarC6 = kbc.c0(fetVar, jm40Var3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar5);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM7, shdVar2);
            vqd.u(iHashCode7, fetVar, shdVar3, fetVar);
            mm40 mm40VarN2 = s5x0.N(ohs0.i(fetVar, mm40VarC6, shdVar4, 1.0f, true), 0.0f, 0.0f, 12.0f, 0.0f, 11);
            x5d x5dVarA4 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode8 = Long.hashCode(fetVar.T);
            bh90 bh90VarM8 = fetVar.m();
            mm40 mm40VarC7 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar5);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, shdVar);
            jpm0.o(fetVar, bh90VarM8, shdVar2);
            vqd.u(iHashCode8, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC7, shdVar4);
            thg0 thg0VarA4 = shg0.a(lw3Var, gqw0.j, fetVar, 0);
            int iHashCode9 = Long.hashCode(fetVar.T);
            bh90 bh90VarM9 = fetVar.m();
            mm40 mm40VarC8 = kbc.c0(fetVar, jm40Var3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar5);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA4, shdVar);
            jpm0.o(fetVar, bh90VarM9, shdVar2);
            vqd.u(iHashCode9, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC8, shdVar4);
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new thd((byte) 5);
                fetVar.o0(objP5);
            }
            v8q0.a(izhVar.o, s5x0.N(knx.Q(jm40Var3, (xdr) objP5), 0.0f, 0.0f, 0.0f, 4.0f, 7), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110584);
            v8q0.a(Separators.SLASH, s5x0.N(jm40Var3, 4.0f, 0.0f, 4.0f, 4.0f, 2), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 6, 24960, 110584);
            mm40 mm40VarN3 = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str5 = izhVar.r;
            String strQ = izhVar.p;
            if (str5 != null) {
                strQ = w6x.q(strQ, Separators.SP, str5);
            }
            v8q0.a(strQ, mm40VarN3, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110584);
            fetVar.r(true);
            mm40 mm40VarD4 = o7k0.d(jm40Var3, 1.0f);
            tnm tnmVar = tnm.f34243a;
            StaticColors staticColors = StaticColors.INSTANCE;
            snm.b(mm40VarD4, new unm(tnmVar, staticColors.m122getViolet0d7_KjU(), staticColors.m122getViolet0d7_KjU(), staticColors.m95getGray0d7_KjU(), 6.0f, 6.0f, izhVar.q, 100, false, 768), fetVar, 6);
            fetVar.r(true);
            qzb.n(null, wulVar, function0, fetVar, i3 & 896, 1);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 27, i, (Object) mm40Var, (Object) izhVar, (Object) function0, (Object) function1);
        }
    }

    public static final void m(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(-2022293145);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            d9z d9zVarA = f9z.a(fetVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            int i3 = pkd.d(fetVar) ? 2 : 1;
            bk50 bk50VarA0 = x0x.a0(fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(cjx.V(jm40Var, bk50VarA0, null), "POPULAR_CLASSIC_FEED_LAZY_VERTICAL_GRID");
            ngv ngvVar = new ngv(i3);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b2));
            ch80 ch80VarF = h97.f(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 24.0f, fetVar);
            boolean zG = fetVar.g(pz40VarF) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ka2(pz40VarF, z, function1, (byte) 8);
                fetVar.o0(objP);
            }
            mm40Var2 = jm40Var;
            g8x.i(ngvVar, mm40VarE0, d9zVarA, ch80VarF, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 912);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vy0(mm40Var2, a4xVar, z, function1, i, (byte) 4);
        }
    }

    public static final void n(mm40 mm40Var, y9q0 y9q0Var, y8n y8nVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(2091664108);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar2.g(y9q0Var) ? 32 : 16) | (fetVar2.g(y8nVar) ? 256 : 128);
        if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = lgb.K(o7k0.h(mm40VarD, 56.0f));
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
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
            n0q n0qVar = o7k0.c;
            mm40 mm40Var4 = mm40Var2;
            mm40 mm40VarQ = i120.Q(n0qVar.e(mm40Var2), y8nVar.d, jd8.n);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarK2 = s5x0.K(n0qVar, 8.0f, 12.0f);
            yx7 yx7Var = gqw0.k;
            x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(yx7Var, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarK2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarD2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            v8q0.a(y8nVar.f42204a, s5x0.N(o7k0.u(ohs0.i(fetVar2, mm40VarC3, shdVar4, 1.0f, true), 0.0f, 120.0f, 1), 0.0f, 0.0f, 16.0f, 0.0f, 11), y8nVar.e, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, ((i5 << 18) & 29360128) | 24960, 110584);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-207828602, new i3l(y8nVar, (byte) 2), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            tnm tnmVar = tnm.f34243a;
            unm unmVar = y8nVar.i;
            snm.b(mm40VarD3, new unm(tnmVar, unmVar.b, unmVar.c, unmVar.d, 6.0f, 4.0f, unmVar.g, unmVar.h, true, 512), fetVar2, 6);
            fetVar2.r(true);
            fetVar2.r(true);
            if (y8nVar.h) {
                fetVar2.e0(1894147572);
                mbc.o(zfi0.f44303a, jr8.f16991a.b(s5x0.L(jm40Var, 8.0f, 0.0f, 2), gqw0.h), false, fetVar2, 6, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1894380444);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var3 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dxe(mm40Var3, (Object) y9q0Var, (Object) y8nVar, i, i2, (byte) 2);
        }
    }

    public static final void o(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(759250021);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            bk50 bk50VarA0 = x0x.a0(fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = cjx.V(jm40Var, bk50VarA0, null).e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new wta0(function1, (byte) 6);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i2 & 112, 5);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i, (byte) 26);
        }
    }

    public static final void p(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1582340224);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ntu0(function1, (byte) 23);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar, function1, i, (byte) 10);
        }
    }

    public static final void q(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(2125992733);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new yhl0(function1, (byte) 18);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i2 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ld0(mm40Var, mdmVar, function1, i, (byte) 7);
        }
    }

    public static final void r(fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(-481467292);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 20.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, s5x0.N(xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var), 0.0f, 0.0f, 0.0f, 8.0f, 7));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 20, i, fqj0Var);
        }
    }

    public static final void s(mm40 mm40Var, f060 f060Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-974412427);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(f060Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            Object obj2 = (vne) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean zG = fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new o060(pz40VarF, null, b2);
                fetVar.o0(objP2);
            }
            Object objP3 = ydx.P(xczVarA, (ydr) objP2, fetVar);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40.b, 1.0f), true);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 12.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zG2 = ((i2 & 112) == 32) | fetVar.g(objP3) | fetVar.i(obj2);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj) {
                objP4 = new jl40((Object) f060Var, objP3, obj2, (byte) 9);
                fetVar.o0(objP4);
            }
            b8k0.e(mm40VarH, xczVarA, lh80Var, qw3Var, null, null, false, null, (Function1) objP4, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            mtl mtlVar = f060Var.b;
            ma80 ma80Var = ma80.b;
            boolean zG3 = fetVar.g(pz40VarF);
            Object objP5 = fetVar.P();
            if (zG3 || objP5 == obj) {
                objP5 = new y9v(pz40VarF, (byte) 21);
                fetVar.o0(objP5);
            }
            bkb.f(null, mtlVar, ma80Var, false, null, (Function1) objP5, fetVar, 384, 25);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) f060Var, (Object) function1, i, (byte) 19);
        }
    }

    public static final void t(tar tarVar, fet fetVar, int i) {
        int i2;
        tarVar.getClass();
        fetVar.g0(1769711799);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(tarVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g7p((Object) tarVar, (byte) 12);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarQ, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(tarVar, i);
        }
    }

    public static final void u(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(26282735);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            j(l7m0Var, function1, fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 10);
        }
    }

    public static final void v(hh80 hh80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var2;
        fetVar.g0(1777540495);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hh80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 16;
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ppz ppzVar = (ppz) l7m0Var2.getValue();
            if (ppzVar.c) {
                fetVar.e0(-1180561641);
                w(0, fetVar);
            } else {
                fetVar.e0(2057302483);
            }
            fetVar.r(false);
            mm40 mm40VarL = s5x0.L(s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, hh80Var.d(), 0.0f, 0.0f, 13), xfn.a(fetVar).d, 0.0f, 2);
            boolean zG = ((i2 & 14) == 4) | fetVar.g(ppzVar) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new k9v(ppzVar, hh80Var, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new soz(hh80Var, l7m0Var, function1, i, (byte) 1);
        }
    }

    public static final void w(int i, fet fetVar) {
        fetVar.g0(573226283);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new pcy((byte) 23);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hvy(i, (byte) 21);
        }
    }

    public static final void x(int i, fet fetVar) {
        fetVar.g0(1966590777);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, f2, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            r(fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gcl0(i, (byte) 27);
        }
    }

    public static final void y(int i, fet fetVar) {
        fetVar.g0(1321713719);
        if (fetVar.U(i & 1, i != 0)) {
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
            gnm0.a(jm40Var, fqj0VarD0, fetVar, 6);
            gnm0.a(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
            gnm0.c(s6t0.b().f33626a.getBackground(), fqj0VarD0, fetVar, 0);
            gnm0.c(s6t0.b().f33626a.getBackgroundContent(), fqj0VarD0, fetVar, 0);
            gnm0.c(s6t0.b().f33626a.getBackground(), fqj0VarD0, fetVar, 0);
            gnm0.c(s6t0.b().f33626a.getBackgroundContent(), fqj0VarD0, fetVar, 0);
            gnm0.c(s6t0.b().f33626a.getBackground(), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i9v0(i, (byte) 12);
        }
    }

    public static final void z(mm40 mm40Var, i060 i060Var, Function1 function1, fet fetVar, int i) {
        int i2;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        zx7 zx7Var = gqw0.e;
        fetVar.g0(-74117551);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(i060Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = i060Var instanceof h060;
            pcy pcyVar = e7z.u1;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1787486237);
                mm40 mm40VarE = mm40Var.e(o7k0.c);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new th50((byte) 11);
                    fetVar.o0(objP);
                }
                mm40 mm40VarY = y860.Y(mm40VarE, false, null, null, (Function0) objP, 14);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                kpb.j(jr8.f16991a.b(jm40.b, zx7Var), new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m131getWhite800d7_KjU()), 3), fetVar, 0, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else if (i060Var instanceof f060) {
                fetVar.e0(1787498478);
                s(mm40Var, (f060) i060Var, function1, fetVar, i2 & 1022);
                fetVar.r(false);
            } else {
                if (!(i060Var instanceof g060)) {
                    throw b1j.f(1787484079, fetVar, false);
                }
                fetVar.e0(1787504502);
                mm40 mm40VarE2 = mm40Var.e(o7k0.c);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                mdm mdmVar = ((g060) i060Var).f10443a;
                boolean z2 = (i2 & 896) == 256;
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new xv50(function1, (byte) 6);
                    fetVar.o0(objP2);
                }
                jcb.l(null, mdmVar, false, (Function0) objP2, fetVar, 0, 5);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) i060Var, (Object) function1, i, (byte) 18);
        }
    }
}
