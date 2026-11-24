package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.BonusStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CityStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.DocumentStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.RegionStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.SocialStateModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bdx {
    public static final void A(mm40 mm40Var, boolean z, boolean z2, wom womVar, u12 u12Var, Function0 function0, ydr ydrVar, ugd ugdVar, fet fetVar, int i) {
        u12 u12Var2;
        ydr ydrVar2;
        womVar.getClass();
        function0.getClass();
        fetVar.g0(-2009607847);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.g(womVar) ? 2048 : 1024) | 24576 | (fetVar.i(function0) ? 131072 : 65536) | 1572864;
        byte b = 1;
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            zx7 zx7Var = gqw0.f11754a;
            ugd ugdVarM = u1c.M(-905117697, new fom(womVar, b), fetVar);
            mom.c(mm40Var, z, womVar, zx7Var, z2, null, function0, ugdVarM, ugdVar, fetVar, ((i2 << 3) & 3670016) | (i2 & 126) | ((i2 >> 3) & 896) | 3072 | (57344 & (i2 << 6)) | 113246208, 32);
            u12Var2 = zx7Var;
            ydrVar2 = ugdVarM;
        } else {
            fetVar.X();
            u12Var2 = u12Var;
            ydrVar2 = ydrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new te(mm40Var, z, z2, womVar, u12Var2, function0, ydrVar2, ugdVar, i);
        }
    }

    public static final void B(mm40 mm40Var, boolean z, boolean z2, wom womVar, w2d w2dVar, u12 u12Var, Function0 function0, ydr ydrVar, ugd ugdVar, fet fetVar, int i) {
        u12 u12Var2;
        ydr ydrVar2;
        womVar.getClass();
        w2dVar.getClass();
        function0.getClass();
        fetVar.g0(-1758874598);
        byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.g(womVar) ? 2048 : 1024) | (fetVar.i(w2dVar) ? 16384 : 8192) | 196608 | (fetVar.i(function0) ? 1048576 : 524288) | 12582912;
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            zx7 zx7Var = gqw0.f11754a;
            ugd ugdVarM = u1c.M(1515475892, new fom(womVar, b), fetVar);
            mom.c(mm40Var, z, womVar, zx7Var, z2, w2dVar, function0, ugdVarM, ugdVar, fetVar, (i2 & 3670016) | (i2 & 126) | ((i2 >> 3) & 896) | 3072 | (57344 & (i2 << 6)) | 262144 | (458752 & (i2 << 3)) | 113246208, 0);
            u12Var2 = zx7Var;
            ydrVar2 = ugdVarM;
        } else {
            fetVar.X();
            u12Var2 = u12Var;
            ydrVar2 = ydrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o69(mm40Var, z, z2, womVar, w2dVar, u12Var2, function0, ydrVar2, ugdVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x017c A[LOOP:1: B:110:0x0176->B:112:0x017c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0158 A[EDGE_INSN: B:125:0x0158->B:109:0x0158 BREAK  A[LOOP:0: B:103:0x0134->B:108:0x0155], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(mm40 mm40Var, float f, float f2, long j, yjj0 yjj0Var, List list, boolean z, Function2 function2, xdr xdrVar, fet fetVar, int i) {
        int i2;
        Function2 function3;
        xdr xdrVar2;
        ArrayList arrayListL0;
        ArrayList arrayList;
        Iterator it;
        iil iilVar;
        Iterator it2;
        Object next;
        Object obj;
        yjj0Var.getClass();
        list.getClass();
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(1464942767);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(yjj0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.e(4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (i & 2097152) == 0 ? fetVar.g(list) : fetVar.i(list) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function3 = function2;
            i2 |= fetVar.i(function3) ? 67108864 : 33554432;
        } else {
            function3 = function2;
        }
        if ((i & 805306368) == 0) {
            xdrVar2 = xdrVar;
            i2 |= fetVar.i(xdrVar2) ? 536870912 : 268435456;
        } else {
            xdrVar2 = xdrVar;
        }
        if (fetVar.U(i2 & 1, (i2 & 306783379) != 306783378)) {
            boolean z2 = ((i2 & 29360128) == 8388608) | ((3670016 & i2) == 1048576 || ((i2 & 2097152) != 0 && fetVar.g(list)));
            Object objP = fetVar.P();
            if (z2) {
                if (z) {
                    rx3 rx3VarS0 = CollectionsKt.S0(list);
                    arrayList = new ArrayList();
                    it = rx3VarS0.iterator();
                    while (true) {
                        iilVar = (iil) it;
                        if (iilVar.b.hasNext()) {
                            break;
                            break;
                        }
                        next = iilVar.next();
                        Iterator it3 = it;
                        if (((t9v0) ((IndexedValue) next).b).f33588a == eav0.g) {
                            arrayList.add(next);
                        }
                        it = it3;
                    }
                    List listD0 = CollectionsKt.D0(CollectionsKt.A0(arrayList, new mjf0((byte) 0)), 4);
                    arrayListL0 = new ArrayList(r3d.q(listD0, 10));
                    it2 = listD0.iterator();
                    while (it2.hasNext()) {
                        arrayListL0.add(Integer.valueOf(((IndexedValue) it2.next()).f46061a));
                    }
                } else {
                    arrayListL0 = CollectionsKt.L0(q3d.h(list));
                }
                fetVar.o0(arrayListL0);
                obj = arrayListL0;
            } else {
                obj = objP;
                if (objP == ukd.f35823a) {
                    if (z) {
                        rx3 rx3VarS1 = CollectionsKt.S0(list);
                        arrayList = new ArrayList();
                        it = rx3VarS1.iterator();
                        while (true) {
                            iilVar = (iil) it;
                            if (iilVar.b.hasNext()) {
                                break;
                            }
                            next = iilVar.next();
                            Iterator it4 = it;
                            if (((t9v0) ((IndexedValue) next).b).f33588a == eav0.g) {
                                arrayList.add(next);
                            }
                            it = it4;
                        }
                        List listD1 = CollectionsKt.D0(CollectionsKt.A0(arrayList, new mjf0((byte) 0)), 4);
                        arrayListL0 = new ArrayList(r3d.q(listD1, 10));
                        it2 = listD1.iterator();
                        while (it2.hasNext()) {
                            arrayListL0.add(Integer.valueOf(((IndexedValue) it2.next()).f46061a));
                        }
                    } else {
                        arrayListL0 = CollectionsKt.L0(q3d.h(list));
                    }
                    fetVar.o0(arrayListL0);
                    obj = arrayListL0;
                }
            }
            List list2 = (List) obj;
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var, 1.0f), f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarI = s5x0.I(mm40VarQ, new lh80(16.0f, 2.0f, 16.0f, 2.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(549042549, new en80(list2, list, f2, xdrVar2, function3), fetVar), fetVar, 56);
            zq8.a(0, fetVar, i120.Q(lgb.J(o7k0.d(o7k0.e(jr8.f16991a.b(jm40.b, gqw0.e), f2), 1.0f), yjj0Var), j, ljcVar));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q8d0(mm40Var, f, f2, j, yjj0Var, list, z, function2, xdrVar, i);
        }
    }

    public static final void D(final long j, fet fetVar, final int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2107519370);
        int i3 = i & 6;
        jr8 jr8Var = jr8.f16991a;
        if (i3 == 0) {
            i2 = i | (fetVar2.g(jr8Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarP = i120.P(mm40VarA, yk5.n(q3d.j(new y3d(((StaticColors) fetVar2.k(zfnVar)).m63getBlack00d7_KjU()), new y3d(((StaticColors) fetVar2.k(zfnVar)).m78getBlack800d7_KjU())), 0.0f, 0.0f, 14), null, 6);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 1.0f, 7);
            String strValueOf = String.valueOf(j);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(strValueOf, mm40VarN, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.qi40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    bdx.D(j, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void E(n5h0 n5h0Var, mm40 mm40Var, fet fetVar, int i) {
        fetVar.g0(592949963);
        int i2 = (fetVar.g(n5h0Var) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA = o7k0.A(o7k0.e(mm40Var, 32.0f), null, 3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            vdx.y(0, fetVar, null, n5h0Var.f22944a, n5h0Var.c);
            w7n0.l(6, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), fetVar, s5x0.L(o7k0.y(o7k0.e(jm40.b, 32.0f), gqw0.e, 2), 4.0f, 0.0f, 2), new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109), Separators.COLON);
            vdx.y(0, fetVar, null, n5h0Var.b, n5h0Var.d);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(n5h0Var, mm40Var, i, (byte) 23);
        }
    }

    public static final void F(int i, long j, fet fetVar, String str, boolean z) {
        int i2;
        long j2;
        fetVar.g0(-1872682027);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= fetVar.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarS = o7k0.s(jm40Var, 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
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
            if (z) {
                fetVar.e0(1506315530);
                vzb.h(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(1506358775);
                fetVar.r(false);
            }
            fetVar.r(true);
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 144.0f, 1), j2, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, ((i2 >> 3) & 14) | (i2 & 896), 24960, 109552);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5l0(z, str, j, i, (byte) 2);
        }
    }

    public static final void G(mm40 mm40Var, xk80 xk80Var, dxh0 dxh0Var, Function0 function0, fet fetVar, int i) {
        mm40Var.getClass();
        xk80Var.getClass();
        dxh0Var.getClass();
        function0.getClass();
        fetVar.g0(362561349);
        byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(xk80Var) ? 32 : 16) | (fetVar.g(dxh0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            String strW = rsm0.w(R.string.settings, 0, fetVar);
            String strW2 = rsm0.w(R.string.transactions_history, 0, fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            bwh0 bwh0Var = bwh0.f3325a;
            i4 i4VarG0 = dyb.g0(new yvh0(strW, bwh0Var), new yvh0(strW2, bwh0Var));
            boolean zI = fetVar.i(vneVar) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new euv(b, vneVar, xk80Var);
                fetVar.o0(objP2);
            }
            ibc.n(mm40Var, i4VarG0, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP2, fetVar, (i2 & 14) | 384 | ((i2 << 3) & 7168) | ((i2 << 6) & 458752), 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((byte) 14, i, (Object) mm40Var, (Object) xk80Var, (Object) dxh0Var, (Object) function0);
        }
    }

    public static final void H(int i, fet fetVar) {
        fetVar.g0(29728922);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            xvw.d(7, 48, fetVar, s5x0.N(jm40.b, qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 0.0f, 8));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i, (byte) 12);
        }
    }

    public static final void I(mm40 mm40Var, lh80 lh80Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1075297708);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(lh80Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
            zcl zclVar = qmk.f28987a;
            float f = configuration.screenWidthDp / 80.0f;
            mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zD = fetVar.d(80.0f) | fetVar.d(f);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new f54(f, (byte) 24);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarW, null, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, ((i2 << 3) & 896) | 12582912, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vx80(mm40Var, lh80Var, i, b);
        }
    }

    public static final void J(mm40 mm40Var, cum cumVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(2029414941);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cumVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 84.0f), 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.j, (byte) 11)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            N(cumVar, fetVar, (i2 >> 3) & 14);
            o(0, cumVar.e, cumVar.k, fetVar, cumVar.f, cumVar.g, cumVar.b, cumVar.h, cumVar.d, cumVar.j, cumVar.c, cumVar.i);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) cumVar, i, (byte) 6);
        }
    }

    public static final void K(mm40 mm40Var, ri40 ri40Var, long j, fet fetVar, int i) {
        int i2;
        long jM129getWhite400d7_KjU;
        fet fetVar2 = fetVar;
        fetVar2.g0(1617140260);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(ri40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.f(j) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(Z(fetVar2, o7k0.e(mm40Var, 40.0f)), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN = o7k0.n(jm40.b, 24.0f);
            int i3 = ri40Var.f30521a;
            boolean z = ri40Var.c;
            dww.c(a8k0.F(i3, 0, fetVar2), null, mm40VarN, z ? j : y3d.c(0.4f, j), fetVar2, 56, 0);
            String str = ri40Var.b;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            y9q0 y9q0VarL = g1t0.l();
            if (z) {
                fetVar2.e0(937209829);
                jM129getWhite400d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            } else {
                fetVar2.e0(937210951);
                jM129getWhite400d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m129getWhite400d7_KjU();
            }
            fetVar2.r(false);
            v8q0.a(str, null, jM129getWhite400d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarL, fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh((Object) mm40Var, (Object) ri40Var, j, i, (byte) 7);
        }
    }

    public static final void L(a4x a4xVar, long j, fet fetVar, int i) {
        fetVar.g0(1672551447);
        long j2 = j;
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.f(j2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 995084972, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                K(i3 == a4xVar.size() - 1 ? new x7z(1.0f, true) : jm40Var, (ri40) next, j2, fetVar, (i2 << 3) & 896);
                j2 = j;
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ub4((byte) 5, i, j, a4xVar);
        }
    }

    public static final void M(zx80 zx80Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1634008902);
        int i2 = i | (fetVar2.g(zx80Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(12.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(jm40Var, ugg0VarA);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarS = i120.S(i120.S(i120.Q(mm40VarJ, backgroundContent, ljcVar), 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), vgg0.a(12.0f)), 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), ljcVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new qw80((Object) function1, (Object) zx80Var, (byte) 3);
                fetVar2.o0(objP);
            }
            mm40 mm40VarJ2 = s5x0.J(feb.O(mm40VarS, (Function0) objP), 4.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ2);
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
            String str = zx80Var.d;
            long secondary60 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary60();
            pge pgeVar = gqw0.f1;
            mm40 mm40VarN = o7k0.n(jm40Var, 30.0f);
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.e;
            lgb.v(s5x0.J(i120.Q(mm40VarN, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f), s5x0.J(i120.Q(o7k0.n(jm40Var, 30.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f), str, R.drawable.ic_glyph_circle_globe, secondary60, pgeVar, fetVar2, 196608, 0);
            v8q0.a(zx80Var.c, s5x0.N(jm40Var, 8.0f, 0.0f, 8.0f, 0.0f, 10), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(zx80Var, function1, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final void N(cum cumVar, fet fetVar, int i) {
        int i2;
        cum cumVar2;
        fet fetVar2;
        fet fetVar3;
        ?? r0;
        fet fetVar4;
        fet fetVar5 = fetVar;
        fetVar5.g0(345185830);
        if ((i & 6) == 0) {
            i2 = i | (fetVar5.g(cumVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar5.U(i2 & 1, (i2 & 3) != 2)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            mm40 mm40VarE = o7k0.e(jm40.b, 16.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar5, 48);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarE);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            String str = cumVar.m;
            stm stmVar = cumVar.n;
            int length = str.length();
            oro0 oro0Var = oro0.f25744a;
            if (length > 0) {
                fetVar5.e0(199946425);
                j6n.h(cumVar.m, oro0Var, null, 0, 0, fetVar5, 48, 28);
                fetVar5.r(false);
            } else {
                fetVar5.e0(200099224);
                fetVar5.r(false);
            }
            if (stmVar instanceof ptm) {
                fetVar5.e0(422099918);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else if (stmVar instanceof qtm) {
                fetVar5.e0(200293966);
                rcb.x(null, ulb.b0((qtm) stmVar), h2m.c, nsm0.y(fgm.b), true, null, fetVar, 384);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                if (!(stmVar instanceof rtm)) {
                    throw b1j.f(422097803, fetVar5, false);
                }
                fetVar5.e0(200692843);
                j6n.h("VAR", oro0Var, null, 0, 0, fetVar5, 54, 28);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            if (cumVar.f4992a.length() > 0) {
                fetVar3.e0(200874441);
                r0 = 0;
                f1t0.a(new x7z(1.0f, false), cumVar.f4992a, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), 0L, fetVar, 0, 438264);
                fet fetVar7 = fetVar;
                fetVar7.r(false);
                fetVar4 = fetVar7;
            } else {
                r0 = 0;
                fetVar3.e0(201206296);
                fetVar3.r(false);
                fetVar4 = fetVar3;
            }
            cumVar2 = cumVar;
            f2i f2iVar = cumVar2.l;
            if (f2iVar == null) {
                fetVar4.e0(201249323);
                fetVar4.r(r0);
            } else {
                fetVar4.e0(201249324);
                n4c.d(null, f2iVar, fetVar4, r0);
                fetVar4.r(r0);
            }
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            cumVar2 = cumVar;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(cumVar2, i, (byte) 12);
        }
    }

    public static void O(jg60 jg60Var, i0h0 i0h0Var, Function1 function1) {
        jg60Var.getClass();
        v62 v62Var = new v62(function1, (byte) 17);
        if (i0h0Var != null) {
            jg60Var.a(i0h0Var, v62Var);
        } else {
            jg60Var.b(v62Var);
        }
    }

    public static final void P(lc00 lc00Var, rq20 rq20Var, ctf0 ctf0Var, int i, int i2, int i3, int i4, int i5) {
        String str;
        String str2;
        ctf0Var.getClass();
        List list = rq20Var.e;
        if (list.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("MARBLE_HEADER_KEY", i));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ctf0Var.b.a(i2, Arrays.copyOf(new Object[]{((ve90) it.next()).f37273a}, 1)));
        }
        lc00Var.add(new kq20(i3, arrayList));
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ve90) it2.next()).b);
        }
        String str3 = rq20Var.f30910a;
        String str4 = rq20Var.c;
        String str5 = "";
        if (kotlin.text.c.x(str4, ujn.h, false)) {
            str = str4;
        } else {
            if (str4.length() != 0) {
                List list2 = u0d.f34849a;
                if (!u0d.c(str4)) {
                    str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                    str = str4;
                }
            }
            str = "";
        }
        lc00Var.add(new qq20("MARBLE_GAMES_FIRST_TEAM_KEY", 1L, i4, arrayList2, str3, str));
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ve90) it3.next()).c);
        }
        String str6 = rq20Var.b;
        String str7 = rq20Var.d;
        if (kotlin.text.c.x(str7, ujn.h, false)) {
            str2 = str7;
        } else {
            if (str7.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str7)) {
                    str5 = String.format(Locale.ENGLISH, StringsKt.O(str7, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str7}, 2));
                }
            }
            str2 = str5;
        }
        lc00Var.add(new qq20("MARBLE_GAMES_SECOND_TEAM_KEY", 2L, i5, arrayList3, str6, str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Q(qah0 qah0Var, float f, l73 l73Var, sjj sjjVar, Function1 function1, zje zjeVar) {
        cfk0 cfk0Var;
        float f2;
        jie0 jie0Var;
        if (zjeVar instanceof cfk0) {
            cfk0Var = (cfk0) zjeVar;
            int i = cfk0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfk0Var.m = i - Integer.MIN_VALUE;
            } else {
                cfk0Var = new cfk0(zjeVar);
            }
        } else {
            cfk0Var = new cfk0(zjeVar);
        }
        Object obj = cfk0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = cfk0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            jie0 jie0Var2 = new jie0();
            boolean z = ((Number) l73Var.b()).floatValue() == 0.0f;
            bfk0 bfk0Var = new bfk0(f, jie0Var2, qah0Var, function1, (byte) 0);
            cfk0Var.j = l73Var;
            cfk0Var.k = jie0Var2;
            cfk0Var.i = f;
            cfk0Var.m = 1;
            if (hhm0.o(l73Var, sjjVar, !z, bfk0Var, cfk0Var) == wneVar) {
                return wneVar;
            }
            f2 = f;
            jie0Var = jie0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = cfk0Var.i;
            jie0Var = cfk0Var.k;
            l73Var = cfk0Var.j;
            z1x.P(obj);
        }
        return new g73(new Float(f2 - jie0Var.f16571a), l73Var);
    }

    public static final void R(i73 i73Var, qah0 qah0Var, Function1 function1, float f) {
        float fA;
        try {
            fA = qah0Var.a(f);
        } catch (CancellationException unused) {
            i73Var.a();
            fA = 0.0f;
        }
        function1.invoke(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            i73Var.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object S(qah0 qah0Var, float f, float f2, l73 l73Var, j73 j73Var, Function1 function1, zje zjeVar) {
        dfk0 dfk0Var;
        float fFloatValue;
        l73 l73Var2;
        jie0 jie0Var;
        float f3 = f;
        if (zjeVar instanceof dfk0) {
            dfk0Var = (dfk0) zjeVar;
            int i = dfk0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dfk0Var.n = i - Integer.MIN_VALUE;
            } else {
                dfk0Var = new dfk0(zjeVar);
            }
        } else {
            dfk0Var = new dfk0(zjeVar);
        }
        dfk0 dfk0Var2 = dfk0Var;
        Object obj = dfk0Var2.m;
        wne wneVar = wne.f39444a;
        int i2 = dfk0Var2.n;
        if (i2 == 0) {
            z1x.P(obj);
            jie0 jie0Var2 = new jie0();
            fFloatValue = ((Number) l73Var.b()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) l73Var.b()).floatValue() == 0.0f;
            bfk0 bfk0Var = new bfk0(f2, jie0Var2, qah0Var, function1, (byte) 1);
            dfk0Var2.k = l73Var;
            dfk0Var2.l = jie0Var2;
            dfk0Var2.i = f3;
            dfk0Var2.j = fFloatValue;
            dfk0Var2.n = 1;
            if (hhm0.p(l73Var, f4, j73Var, !z, bfk0Var, dfk0Var2) == wneVar) {
                return wneVar;
            }
            l73Var2 = l73Var;
            jie0Var = jie0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = dfk0Var2.j;
            float f6 = dfk0Var2.i;
            jie0Var = dfk0Var2.l;
            l73Var2 = dfk0Var2.k;
            z1x.P(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new g73(new Float(f3 - jie0Var.f16571a), x4d0.a0(l73Var2, 0.0f, a0(((Number) l73Var2.b()).floatValue(), fFloatValue), 29));
    }

    public static final void T(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ImageView imageView = ((bth) yfu0Var).g;
        Context context = cpVar.w;
        imageView.setColorFilter(sj3.P(((crf) cpVar.u()).f, context));
        bth bthVar = (bth) yfu0Var;
        bthVar.b.setColorFilter(context.getColor(((crf) cpVar.u()).f));
        bthVar.f.setBackgroundTintList(jiq0.n0(((crf) cpVar.u()).f, context));
    }

    public static final void U(cp cpVar) {
        kxx kxxVar = (kxx) cpVar.u;
        kxxVar.e.setAllowClickWhenDisabled(((z9j0) cpVar.u()).k());
        kxxVar.e.setEnabled(((z9j0) cpVar.u()).M());
    }

    public static final void V(cp cpVar) {
        kxx kxxVar = (kxx) cpVar.u;
        if (((z9j0) cpVar.u()).s0().length() <= 0) {
            kxxVar.d.setVisibility(8);
        } else {
            kxxVar.d.setText(((z9j0) cpVar.u()).s0());
            kxxVar.d.setVisibility(0);
        }
    }

    public static final void W(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((bth) yfu0Var).e.setVisibility(((crf) cpVar.u()).c ? 0 : 8);
        ((bth) yfu0Var).d.setVisibility(((crf) cpVar.u()).c ? 0 : 8);
    }

    public static final void X(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((bth) yfu0Var).g.setImageResource(((crf) cpVar.u()).d);
        List list = u0d.f34849a;
        u0d.i(((bth) yfu0Var).g, ((crf) cpVar.u()).d);
    }

    public static final jlo0 Y(n410 n410Var, List list, amo0 amo0Var, aco0 aco0Var, ctf0 ctf0Var) {
        long j;
        long j2;
        long j3;
        List<s410> list2 = n410Var.r;
        String str = n410Var.c;
        boolean z = n410Var.e;
        qek0 qek0Var = qek0.c;
        list.getClass();
        ctf0Var.getClass();
        Long lValueOf = aco0Var != null ? Long.valueOf(aco0Var.f639a) : null;
        x510 x510Var = x510.STATISTIC;
        qlo0 qlo0Var = qlo0.f28945a;
        rlo0 rlo0Var = rlo0.f30708a;
        if (lValueOf != null && lValueOf.longValue() == 1) {
            String str2 = "STAT_INFO" + amo0Var.name() + x510Var;
            boolean z2 = amo0Var == amo0.b;
            lc00 lc00VarB = kotlin.collections.a.b();
            boolean z3 = z2;
            sjo0 sjo0Var = sjo0.b;
            String strD = tfx.D(n410Var, list);
            String strA = z ? ctf0Var.b.a(R.string.cyber_win, Arrays.copyOf(new Object[0], 0)) : "";
            int iOrdinal = amo0Var.ordinal();
            if (iOrdinal == 0) {
                j = kkg.f18437a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                j = kkg.b;
            }
            vlo0 vlo0Var = new vlo0(sjo0Var, str, strD, strA, j);
            lsm0 lsm0Var = ctf0Var.b;
            mlo0 mlo0Var = new mlo0(lsm0Var.a(R.string.lol_level, Arrays.copyOf(new Object[0], 0)), qek0Var, qlo0Var);
            String strA2 = lsm0Var.a(R.string.lol_minions, Arrays.copyOf(new Object[0], 0));
            olo0 olo0Var = olo0.f25466a;
            lc00VarB.add(new tlo0(vlo0Var, dyb.g0(mlo0Var, new mlo0(strA2, qek0Var, olo0Var), new mlo0(lsm0Var.a(R.string.lol_kills, Arrays.copyOf(new Object[0], 0)), qek0Var, rlo0Var), new mlo0(lsm0Var.a(R.string.lol_dead, Arrays.copyOf(new Object[0], 0)), qek0Var, rlo0Var), new mlo0(lsm0Var.a(R.string.lol_assists, Arrays.copyOf(new Object[0], 0)), qek0Var, rlo0Var))));
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                s410 s410Var = (s410) it.next();
                s410Var.getClass();
                String str3 = s410Var.b;
                String upperCase = s410Var.d.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                nvv nvvVar = new nvv(s410Var.e);
                List list3 = s410Var.n;
                Iterator it2 = it;
                d510 d510Var = (d510) CollectionsKt.W(0, list3);
                nvv nvvVar2 = new nvv(d510Var != null ? d510Var.b : "");
                String str4 = str2;
                d510 d510Var2 = (d510) CollectionsKt.W(1, list3);
                arrayList.add(new tlo0(new wlo0(str3, upperCase, nvvVar, dyb.g0(nvvVar2, new nvv(d510Var2 != null ? d510Var2.b : ""))), dyb.g0(new mlo0(String.valueOf(s410Var.g), qek0Var, qlo0Var), new mlo0(String.valueOf(s410Var.m), qek0Var, olo0Var), new mlo0(String.valueOf(s410Var.h), qek0Var, rlo0Var), new mlo0(String.valueOf(s410Var.i), qek0Var, rlo0Var), new mlo0(String.valueOf(s410Var.j), qek0Var, rlo0Var))));
                it = it2;
                str2 = str4;
            }
            return new jlo0(str2, cs0.f(lc00VarB, lc00VarB, arrayList), ulo0.f35883a, z3);
        }
        x510 x510Var2 = x510.SUBJECTS;
        if (lValueOf != null && lValueOf.longValue() == 2) {
            String str5 = "STAT_INFO" + amo0Var.name() + x510Var2;
            boolean z4 = amo0Var == amo0.b;
            lc00 lc00VarB2 = kotlin.collections.a.b();
            sjo0 sjo0Var2 = sjo0.b;
            String strD2 = tfx.D(n410Var, list);
            String strA3 = z ? ctf0Var.b.a(R.string.cyber_win, Arrays.copyOf(new Object[0], 0)) : "";
            int iOrdinal2 = amo0Var.ordinal();
            if (iOrdinal2 == 0) {
                j2 = kkg.f18437a;
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                j2 = kkg.b;
            }
            lc00VarB2.add(new tlo0(new vlo0(sjo0Var2, str, strD2, strA3, j2), lak0.c));
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            for (s410 s410Var2 : list2) {
                s410Var2.getClass();
                String str6 = s410Var2.b;
                String upperCase2 = s410Var2.d.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                nvv nvvVar3 = new nvv(s410Var2.e);
                List list4 = s410Var2.n;
                d510 d510Var3 = (d510) CollectionsKt.W(0, list4);
                nvv nvvVar4 = new nvv(d510Var3 != null ? d510Var3.b : "");
                d510 d510Var4 = (d510) CollectionsKt.W(1, list4);
                wlo0 wlo0Var = new wlo0(str6, upperCase2, nvvVar3, dyb.g0(nvvVar4, new nvv(d510Var4 != null ? d510Var4.b : "")));
                List list5 = s410Var2.o;
                ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new llo0(((o410) it3.next()).b, rlo0Var));
                }
                llo0 llo0Var = new llo0("", rlo0Var);
                if (arrayList3.size() < 6) {
                    int size = 6 - arrayList3.size();
                    ArrayList arrayList4 = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        arrayList4.add(llo0Var);
                    }
                    arrayList3 = CollectionsKt.q0(arrayList3, arrayList4);
                }
                arrayList2.add(new tlo0(wlo0Var, dyb.o0(CollectionsKt.r0(arrayList3, new llo0(s410Var2.p.b, rlo0Var)))));
            }
            return new jlo0(str5, cs0.f(lc00VarB2, lc00VarB2, arrayList2), ulo0.b, z4);
        }
        x510 x510Var3 = x510.RUNES;
        if (lValueOf == null || lValueOf.longValue() != 14) {
            return null;
        }
        String str7 = "STAT_INFO" + amo0Var.name() + x510Var3;
        boolean z5 = amo0Var == amo0.b;
        lc00 lc00VarB3 = kotlin.collections.a.b();
        sjo0 sjo0Var3 = sjo0.b;
        String strD3 = tfx.D(n410Var, list);
        String strA4 = z ? ctf0Var.b.a(R.string.cyber_win, Arrays.copyOf(new Object[0], 0)) : "";
        int iOrdinal3 = amo0Var.ordinal();
        if (iOrdinal3 == 0) {
            j3 = kkg.f18437a;
        } else {
            if (iOrdinal3 != 1) {
                t9f.b();
                return null;
            }
            j3 = kkg.b;
        }
        lc00VarB3.add(new tlo0(new vlo0(sjo0Var3, str, strD3, strA4, j3), lak0.c));
        ArrayList arrayList5 = new ArrayList(r3d.q(list2, 10));
        for (s410 s410Var3 : list2) {
            s410Var3.getClass();
            String str8 = s410Var3.b;
            String upperCase3 = s410Var3.d.toUpperCase(Locale.ROOT);
            upperCase3.getClass();
            nvv nvvVar5 = new nvv(s410Var3.e);
            List list6 = s410Var3.n;
            d510 d510Var5 = (d510) CollectionsKt.W(0, list6);
            String str9 = d510Var5 != null ? d510Var5.b : null;
            if (str9 == null) {
                str9 = "";
            }
            nvv nvvVar6 = new nvv(str9);
            d510 d510Var6 = (d510) CollectionsKt.W(1, list6);
            String str10 = d510Var6 != null ? d510Var6.b : null;
            if (str10 == null) {
                str10 = "";
            }
            wlo0 wlo0Var2 = new wlo0(str8, upperCase3, nvvVar5, dyb.g0(nvvVar6, new nvv(str10)));
            ArrayList arrayListQ0 = CollectionsKt.q0(s410Var3.q, s410Var3.r);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : arrayListQ0) {
                if (((z410) obj).c) {
                    arrayList6.add(obj);
                }
            }
            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                arrayList7.add(new llo0(lmc.E(((z410) it4.next()).b), qlo0Var));
            }
            if (arrayList7.size() < 6) {
                int size2 = 6 - arrayList7.size();
                ArrayList arrayList8 = new ArrayList(size2);
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList8.add(new llo0("", qlo0Var));
                }
                arrayList7 = CollectionsKt.q0(arrayList7, arrayList8);
            }
            arrayList5.add(new tlo0(wlo0Var2, dyb.o0(arrayList7)));
        }
        return new jlo0(str7, cs0.f(lc00VarB3, lc00VarB3, arrayList5), ulo0.b, z5);
    }

    public static final mm40 Z(fet fetVar, mm40 mm40Var) {
        zcl zclVar = qmk.f28987a;
        long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
        zcl zclVar2 = qmk.g;
        ugg0 ugg0Var = vgg0.f37379a;
        return i120.S(mm40Var, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
    }

    public static final void a(s2m s2mVar, p2m p2mVar, fet fetVar, int i) {
        fetVar.g0(1604401679);
        int i2 = (fetVar.g(s2mVar) ? 4 : 2) | i | (fetVar.g(p2mVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            vdb.w(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false), s2mVar, null, fetVar, (i2 << 3) & 112, 4);
            vdb.w(null, p2mVar, null, fetVar, i2 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(s2mVar, p2mVar, i, (byte) 10);
        }
    }

    public static final float a0(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final void b(mm40 mm40Var, wx80 wx80Var, mez mezVar, lh80 lh80Var, Function2 function2, fet fetVar, int i) {
        int i2;
        mez mezVar2;
        float f;
        a4x a4xVar = wx80Var.f39920a;
        fetVar.g0(-1998276820);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wx80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            mezVar2 = mezVar;
            i2 |= fetVar.g(mezVar2) ? 256 : 128;
        } else {
            mezVar2 = mezVar;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(lh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            byte b = 8;
            if (a4xVar.size() > 8) {
                zcl zclVar = qmk.f28987a;
                f = 88.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 40.0f;
            }
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40Var, f), "PARTNERS_CARD_COLLECTION_GRID");
            y3m0 y3m0Var = new y3m0(a4xVar.size() > 8 ? 2 : 1);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ka70(wx80Var, function2, b);
                fetVar.o0(objP);
            }
            ydx.e(y3m0Var, mm40VarE0, mezVar2, lh80Var, qw3Var, 8.0f, null, false, null, (Function1) objP, fetVar, i2 & 8064);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) wx80Var, (Object) mezVar, (Object) lh80Var, (Object) function2, i, (byte) 18);
        }
    }

    public static final boolean b0(glb0 glb0Var) {
        return (glb0Var.p instanceof nn00) || (glb0Var.q instanceof nn00) || (glb0Var.s instanceof nn00) || (glb0Var.v instanceof nn00) || (glb0Var.n instanceof nn00) || (glb0Var.r instanceof nn00) || (glb0Var.u instanceof nn00) || (glb0Var.t instanceof nn00);
    }

    public static final void c(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(837763625);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mdmVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jcb.l(mm40Var, mdmVar, false, function0, fetVar, (i2 & 126) | ((i2 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cv90(mm40Var, mdmVar, function0, i, (byte) 0);
        }
    }

    public static final boolean c0(glb0 glb0Var) {
        rn00 rn00Var = glb0Var.p;
        rn00 rn00Var2 = glb0Var.t;
        rn00 rn00Var3 = glb0Var.u;
        rn00 rn00Var4 = glb0Var.r;
        rn00 rn00Var5 = glb0Var.s;
        rn00 rn00Var6 = glb0Var.v;
        rn00 rn00Var7 = glb0Var.q;
        boolean z = rn00Var instanceof gn00;
        if (z && (rn00Var7 instanceof gn00) && (rn00Var6 instanceof gn00) && (rn00Var5 instanceof gn00) && (rn00Var4 instanceof gn00) && (rn00Var3 instanceof gn00) && (rn00Var2 instanceof gn00)) {
            return true;
        }
        gn00 gn00Var = z ? (gn00) rn00Var : null;
        if ((gn00Var != null ? gn00Var.f11566a : null) instanceof hr30) {
            return true;
        }
        gn00 gn00Var2 = rn00Var7 instanceof gn00 ? (gn00) rn00Var7 : null;
        if ((gn00Var2 != null ? gn00Var2.f11566a : null) instanceof hr30) {
            return true;
        }
        gn00 gn00Var3 = rn00Var6 instanceof gn00 ? (gn00) rn00Var6 : null;
        if ((gn00Var3 != null ? gn00Var3.f11566a : null) instanceof hr30) {
            return true;
        }
        gn00 gn00Var4 = rn00Var5 instanceof gn00 ? (gn00) rn00Var5 : null;
        if ((gn00Var4 != null ? gn00Var4.f11566a : null) instanceof hr30) {
            return true;
        }
        gn00 gn00Var5 = rn00Var4 instanceof gn00 ? (gn00) rn00Var4 : null;
        if ((gn00Var5 != null ? gn00Var5.f11566a : null) instanceof hr30) {
            return true;
        }
        gn00 gn00Var6 = rn00Var3 instanceof gn00 ? (gn00) rn00Var3 : null;
        if ((gn00Var6 != null ? gn00Var6.f11566a : null) instanceof hr30) {
            return true;
        }
        gn00 gn00Var7 = rn00Var2 instanceof gn00 ? (gn00) rn00Var2 : null;
        return (gn00Var7 != null ? gn00Var7.f11566a : null) instanceof hr30;
    }

    public static final void d(oi40 oi40Var, fet fetVar, int i) {
        float f;
        fet fetVar2 = fetVar;
        fetVar2.g0(-964621362);
        int i2 = (fetVar2.g(oi40Var) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            if (oi40Var.c == null) {
                zcl zclVar = qmk.f28987a;
                f = 40.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 66.0f;
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(Z(fetVar2, o7k0.e(o7k0.s(jm40Var, f), 40.0f)), 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            zcl zclVar3 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            Long l = oi40Var.d;
            if (l == null) {
                fetVar2.e0(-2122592051);
                e(oi40Var.f25294a, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2122513528);
                yhh.a(l.longValue(), false, 0L, null, u1c.M(-47442051, new p0z((Object) oi40Var, (byte) 15), fetVar2), fetVar, 24624, 12);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            Integer num = oi40Var.c;
            if (num == null) {
                fetVar2.e0(-2034948691);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2034948690);
                dww.c(a8k0.F(num.intValue(), 0, fetVar2), null, o7k0.n(jm40Var, 20.0f), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pi40(oi40Var, i, b);
        }
    }

    public static final tma d0(l2g0 l2g0Var, List list, wcb wcbVar, boolean z) {
        String str;
        list.getClass();
        wcbVar.getClass();
        del0 del0Var = g1x.w(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f11161a;
        if (del0Var instanceof zdl0) {
            str = ((zdl0) del0Var).f44218a;
        } else {
            if (!(del0Var instanceof bel0)) {
                t9f.b();
                return null;
            }
            str = ((bel0) del0Var).b;
        }
        return new tma(new c4i(ahb.A(l2g0Var.g, l2g0Var.r, l2g0Var.t), z, new n0x(str), new m0x(R.drawable.sport_new, null, 6), del0Var instanceof bel0 ? new y3d(y3d.g) : null, 32), null, 14);
    }

    public static final void e(o0x o0xVar, fet fetVar, int i) {
        fetVar.g0(-698406129);
        int i2 = (fetVar.g(o0xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            lgb.w(o7k0.n(jm40Var, 32.0f), o7k0.n(jm40Var, 20.0f), o0xVar, new m0x(R.drawable.ic_glyph_mobile_legends, null, 6), ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU(), null, null, gqw0.A, fetVar, ((i2 << 6) & 896) | 12582912, 96);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o9b(o0xVar, i, (byte) 3);
        }
    }

    public static final uma e0(l2g0 l2g0Var, List list, wcb wcbVar, boolean z, boolean z2) {
        String str;
        u3i s3iVar;
        list.getClass();
        wcbVar.getClass();
        del0 del0Var = g1x.w(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f11161a;
        if (del0Var instanceof zdl0) {
            str = ((zdl0) del0Var).f44218a;
        } else {
            if (!(del0Var instanceof bel0)) {
                t9f.b();
                return null;
            }
            str = ((bel0) del0Var).b;
        }
        c4i c4iVar = new c4i(ahb.A(l2g0Var.g, l2g0Var.r, l2g0Var.t), z2, new n0x(str), new m0x(R.drawable.sport_new, null, 6), del0Var instanceof bel0 ? new y3d(y3d.g) : null, 32);
        if (l2g0Var.y.isEmpty()) {
            s3iVar = t3i.f33268a;
        } else {
            s3iVar = new s3i(z ? r8.f30001a : r8.b);
        }
        return new uma(c4iVar, null, s3iVar, 6);
    }

    public static final void f(a4x a4xVar, fet fetVar, int i) {
        fetVar.g0(1212202355);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            boolean z = false;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            if ((i2 & 14) == 4) {
                z = true;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 20);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 494);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 16);
        }
    }

    public static final vma f0(l2g0 l2g0Var, List list, wcb wcbVar, boolean z, ctf0 ctf0Var, boolean z2) {
        String str;
        u3i s3iVar;
        list.getClass();
        wcbVar.getClass();
        ctf0Var.getClass();
        del0 del0Var = g1x.w(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f11161a;
        if (del0Var instanceof zdl0) {
            str = ((zdl0) del0Var).f44218a;
        } else {
            if (!(del0Var instanceof bel0)) {
                t9f.b();
                return null;
            }
            str = ((bel0) del0Var).b;
        }
        c4i c4iVar = new c4i(ahb.A(l2g0Var.g, l2g0Var.r, l2g0Var.t), z2, new n0x(str), new m0x(R.drawable.sport_new, null, 6), del0Var instanceof bel0 ? new y3d(y3d.g) : null, 32);
        b4i b4iVar = new b4i(ahb.E(l2g0Var, ctf0Var), 2);
        if (l2g0Var.y.isEmpty()) {
            s3iVar = t3i.f33268a;
        } else {
            s3iVar = new s3i(z ? r8.f30001a : r8.b);
        }
        return new vma(c4iVar, b4iVar, s3iVar);
    }

    public static final void g(mm40 mm40Var, az6 az6Var, fet fetVar, int i) {
        mm40 mm40Var2;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-425651190);
        int i2 = i | 6 | (fetVar2.g(az6Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            String str = az6Var.f1702a;
            int i3 = az6Var.b;
            k7x.b(str, null, mm40VarA, a8k0.F(i3, 0, fetVar2), a8k0.F(i3, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar2, 36912, 6, 31712);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarW, 16.0f, 20.0f, 16.0f, 34.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarM, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 0.0f, 10.0f, 0.0f, 10);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, x7zVarI);
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
            v8q0.a(az6Var.d, s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.l(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
            v8q0.a(az6Var.e, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 6.0f, 5), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
            fetVar.r(true);
            v8q0.a(az6Var.c, null, 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.r(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 109566);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
            r(0, fetVar2, jr8Var.b(mm40Var2, gqw0.h));
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var2, az6Var, i, (byte) 28);
        }
    }

    public static final wma g0(l2g0 l2g0Var, List list, wcb wcbVar, boolean z, boolean z2) {
        String str;
        u3i s3iVar;
        list.getClass();
        wcbVar.getClass();
        del0 del0Var = g1x.w(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f11161a;
        if (del0Var instanceof zdl0) {
            str = ((zdl0) del0Var).f44218a;
        } else {
            if (!(del0Var instanceof bel0)) {
                t9f.b();
                return null;
            }
            str = ((bel0) del0Var).b;
        }
        c4i c4iVar = new c4i(ahb.A(l2g0Var.g, l2g0Var.r, l2g0Var.t), z2, new n0x(str), new m0x(R.drawable.sport_new, null, 6), del0Var instanceof bel0 ? new y3d(y3d.g) : null, 32);
        if (l2g0Var.y.isEmpty()) {
            s3iVar = t3i.f33268a;
        } else {
            s3iVar = new s3i(z ? r8.f30001a : r8.b);
        }
        return new wma(c4iVar, null, s3iVar, 6);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:175:0x0269  */
    /* JADX WARN: Code duplicated, block: B:178:0x0279  */
    /* JADX WARN: Code duplicated, block: B:181:0x029b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0399  */
    /* JADX WARN: Code duplicated, block: B:254:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:256:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:258:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:270:0x0402  */
    /* JADX WARN: Code duplicated, block: B:273:0x041b  */
    /* JADX WARN: Code duplicated, block: B:276:0x042b  */
    /* JADX WARN: Code duplicated, block: B:280:0x0435  */
    public static final void h(final mm40 mm40Var, xcz xczVar, final hh80 hh80Var, final boolean z, final boolean z2, final qkq qkqVar, final boolean z3, final vf80 vf80Var, xx7 xx7Var, sw3 sw3Var, yx7 yx7Var, ow3 ow3Var, final Function1 function1, fet fetVar, final int i, final int i2, final int i3) {
        int i4;
        xx7 xx7Var2;
        int i5;
        int i6;
        xcz xczVar2;
        final sw3 sw3Var2;
        final yx7 yx7Var2;
        final ow3 ow3Var2;
        final xx7 xx7Var3;
        yx7 yx7Var3;
        sw3 sw3Var3;
        int i7;
        ow3 ow3Var3;
        int i8;
        pz40 pz40VarF;
        boolean z4;
        Object objP;
        Object obj;
        eiy eiyVar;
        boolean z5;
        Object objP2;
        Object objP3;
        vne vneVar;
        afv afvVar;
        g9m0 g9m0Var;
        boolean zE;
        Object objP4;
        xx7 xx7Var4;
        yx7 yx7Var4;
        Object obj2;
        int i9;
        ow3 ow3Var4;
        xcz xczVar3;
        eiy eiyVar2;
        ma80 ma80Var;
        ma80 ma80Var2;
        boolean z6;
        mm40 mm40VarG0;
        boolean z7;
        Object objP5;
        boolean zE2;
        Object objP6;
        boolean z8 = z;
        fetVar.g0(924924659);
        if ((i & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= fetVar.g(hh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= fetVar.h(z8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= fetVar.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= fetVar.g(qkqVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= fetVar.h(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= fetVar.g(vf80Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= 805306368;
            xx7Var2 = xx7Var;
        } else {
            xx7Var2 = xx7Var;
            if ((i & 805306368) == 0) {
                i4 |= fetVar.g(xx7Var2) ? 536870912 : 268435456;
            }
        }
        int i11 = i3 & 1024;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (fetVar.g(sw3Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i12 = i3 & 2048;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= fetVar.g(yx7Var) ? 32 : 16;
        }
        int i13 = i5;
        int i14 = i3 & 4096;
        if (i14 != 0) {
            i6 = i13 | 384;
        } else if ((i2 & 384) == 0) {
            i6 = i13 | (fetVar.g(ow3Var) ? 256 : 128);
        } else {
            i6 = i13;
        }
        if ((i2 & 3072) == 0) {
            i6 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i15 = i6;
        if (fetVar.U(i4 & 1, ((i4 & 306783379) == 306783378 && (i15 & 1171) == 1170) ? false : true)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                int i16 = i4 & (-234881025);
                if (i10 != 0) {
                    xx7Var2 = null;
                }
                sw3 sw3Var4 = i11 != 0 ? null : sw3Var;
                yx7Var3 = i12 != 0 ? null : yx7Var;
                sw3Var3 = sw3Var4;
                i7 = i16;
                if (i14 != 0) {
                    ow3Var3 = null;
                }
                fetVar.s();
                i8 = i7 >> 3;
                int i17 = i8 & 14;
                int i18 = ((i15 >> 6) & 112) | i17;
                pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
                int i19 = i7;
                z4 = (((i18 & 14) ^ 6) <= 4 && fetVar.g(xczVar)) || (i18 & 6) == 4;
                objP = fetVar.P();
                obj = ukd.f35823a;
                if (z4 || objP == obj) {
                    g9z g9zVar = new g9z();
                    g9zVar.f10940a = androidx.compose.runtime.e.b(Integer.MAX_VALUE);
                    g9zVar.b = androidx.compose.runtime.e.b(Integer.MAX_VALUE);
                    ujn ujnVar = ujn.A;
                    rip ripVar = new rip(pz40VarF, (byte) 7);
                    nvu nvuVar = jgk0.f16485a;
                    objP = new a6g(new zbk(new g8l(new zbk(ripVar, ujnVar), xczVar, g9zVar, (byte) 21), ujnVar), l7m0.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 8);
                    fetVar.o0(objP);
                }
                eiyVar = (eiy) objP;
                int i20 = i19 >> 9;
                int i21 = i17 | (i20 & 112);
                z5 = ((((i21 & 112) ^ 48) <= 32 && fetVar.h(z2)) || (i21 & 48) == 32) | ((((i21 & 14) ^ 6) <= 4 && fetVar.g(xczVar)) || (i21 & 6) == 4);
                objP2 = fetVar.P();
                if (z5 || objP2 == obj) {
                    objP2 = new zbz(xczVar, z2);
                    fetVar.o0(objP2);
                }
                xbz xbzVar = (xbz) objP2;
                objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                    fetVar.o0(objP3);
                }
                vneVar = (vne) objP3;
                afvVar = (afv) fetVar.k(bmd.g);
                g9m0Var = ((Boolean) fetVar.k(bmd.x)).booleanValue() ? null : tpm0.f34341a;
                int i22 = i19 & 112;
                int i23 = i15 << 18;
                int i24 = (i19 & 65520) | (i20 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | ((i15 << 27) & 1879048192);
                zE = ((((i24 & 896) ^ 384) <= 256 && fetVar.g(hh80Var)) || (i24 & 384) == 256) | ((((i24 & 112) ^ 48) <= 32 && fetVar.g(xczVar)) || (i24 & 48) == 32) | ((((i24 & 7168) ^ 3072) <= 2048 && fetVar.h(z8)) || (i24 & 3072) == 2048) | ((((57344 & i24) ^ 24576) <= 16384 && fetVar.h(z2)) || (i24 & 24576) == 16384) | fetVar.e(0) | ((((i24 & 3670016) ^ 1572864) <= 1048576 && fetVar.g(xx7Var2)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) <= 8388608 && fetVar.g(yx7Var3)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) <= 67108864 && fetVar.g(ow3Var3)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) <= 536870912 && fetVar.g(sw3Var3)) || (i24 & 805306368) == 536870912) | fetVar.g(afvVar) | fetVar.g(g9m0Var);
                objP4 = fetVar.P();
                if (!zE || objP4 == obj) {
                    xx7Var4 = xx7Var2;
                    yx7Var4 = yx7Var3;
                    ow3 ow3Var5 = ow3Var3;
                    obj2 = obj;
                    i9 = 4;
                    Object lczVar = new lcz(xczVar, z2, hh80Var, z8, eiyVar, sw3Var3, ow3Var5, vneVar, afvVar, g9m0Var, xx7Var4, yx7Var4);
                    ow3Var4 = ow3Var5;
                    xczVar3 = xczVar;
                    eiyVar2 = eiyVar;
                    z8 = z8;
                    fetVar.o0(lczVar);
                    objP4 = lczVar;
                } else {
                    eiyVar2 = eiyVar;
                    ow3Var4 = ow3Var3;
                    obj2 = obj;
                    xx7Var4 = xx7Var2;
                    i9 = 4;
                    xczVar3 = xczVar;
                    yx7Var4 = yx7Var3;
                }
                ibz ibzVar = (ibz) objP4;
                if (r4 != 0) {
                    ma80Var = ma80.f21447a;
                } else {
                    ma80Var = ma80.b;
                }
                ma80Var2 = ma80Var;
                if (z3) {
                    fetVar.e0(-2077147368);
                    zE2 = ((((i8 & 14) ^ 6) <= i9 && fetVar.g(xczVar3)) || (i8 & 6) == i9) | fetVar.e(0);
                    objP6 = fetVar.P();
                    if (zE2 || objP6 == obj2) {
                        objP6 = new ecz(xczVar3);
                        fetVar.o0(objP6);
                    }
                    mm40VarG0 = ahy.g0((ecz) objP6, xczVar3.p, z8, ma80Var2);
                    z6 = false;
                    fetVar.r(false);
                } else {
                    z6 = false;
                    fetVar.e0(-2076718545);
                    fetVar.r(false);
                    mm40VarG0 = jm40.b;
                }
                z7 = i22 != 32 ? z6 : true;
                objP5 = fetVar.P();
                if (z7 || objP5 == obj2) {
                    objP5 = new a7s(xczVar3, (byte) 3);
                    fetVar.o0(objP5);
                }
                eiy eiyVar3 = eiyVar2;
                xcz xczVar4 = xczVar3;
                mm40 mm40VarD0 = nia0.d0(i120.c0(o050.Q(mm40Var.e(xczVar3.m).e(xczVar3.n), eiyVar2, xbzVar, ma80Var2, z3, z8).e(mm40VarG0), xczVar3.o), xczVar4, ma80Var2, vf80Var, z3, z, qkqVar, xczVar3.g, d9x.S(z8, z2, (Function0) objP5, fetVar, i20 & 126));
                xczVar2 = xczVar4;
                t9x.f(eiyVar3, mm40VarD0, xczVar2.q, ibzVar, fetVar, 0);
                sw3Var2 = sw3Var3;
                xx7Var3 = xx7Var4;
                yx7Var2 = yx7Var4;
                ow3Var2 = ow3Var4;
            } else {
                fetVar.X();
                int i25 = i4 & (-234881025);
                sw3Var3 = sw3Var;
                yx7Var3 = yx7Var;
                i7 = i25;
            }
            ow3Var3 = ow3Var;
            fetVar.s();
            i8 = i7 >> 3;
            int i110 = i8 & 14;
            int i111 = ((i15 >> 6) & 112) | i110;
            pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            int i112 = i7;
            if (((i111 & 14) ^ 6) <= 4) {
            }
            objP = fetVar.P();
            obj = ukd.f35823a;
            if (z4) {
                g9z g9zVar2 = new g9z();
                g9zVar2.f10940a = androidx.compose.runtime.e.b(Integer.MAX_VALUE);
                g9zVar2.b = androidx.compose.runtime.e.b(Integer.MAX_VALUE);
                ujn ujnVar2 = ujn.A;
                rip ripVar2 = new rip(pz40VarF, (byte) 7);
                nvu nvuVar2 = jgk0.f16485a;
                objP = new a6g(new zbk(new g8l(new zbk(ripVar2, ujnVar2), xczVar, g9zVar2, (byte) 21), ujnVar2), l7m0.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 8);
                fetVar.o0(objP);
            } else {
                g9z g9zVar3 = new g9z();
                g9zVar3.f10940a = androidx.compose.runtime.e.b(Integer.MAX_VALUE);
                g9zVar3.b = androidx.compose.runtime.e.b(Integer.MAX_VALUE);
                ujn ujnVar3 = ujn.A;
                rip ripVar3 = new rip(pz40VarF, (byte) 7);
                nvu nvuVar3 = jgk0.f16485a;
                objP = new a6g(new zbk(new g8l(new zbk(ripVar3, ujnVar3), xczVar, g9zVar3, (byte) 21), ujnVar3), l7m0.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 8);
                fetVar.o0(objP);
            }
            eiyVar = (eiy) objP;
            int i26 = i112 >> 9;
            int i27 = i110 | (i26 & 112);
            z5 = ((((i27 & 112) ^ 48) <= 32 && fetVar.h(z2)) || (i27 & 48) == 32) | ((((i27 & 14) ^ 6) <= 4 && fetVar.g(xczVar)) || (i27 & 6) == 4);
            objP2 = fetVar.P();
            if (z5) {
                objP2 = new zbz(xczVar, z2);
                fetVar.o0(objP2);
            } else {
                objP2 = new zbz(xczVar, z2);
                fetVar.o0(objP2);
            }
            xbz xbzVar2 = (xbz) objP2;
            objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP3);
            }
            vneVar = (vne) objP3;
            afvVar = (afv) fetVar.k(bmd.g);
            g9m0Var = ((Boolean) fetVar.k(bmd.x)).booleanValue() ? null : tpm0.f34341a;
            int i28 = i112 & 112;
            int i29 = i15 << 18;
            int i210 = (i112 & 65520) | (i26 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | ((i15 << 27) & 1879048192);
            if (((i210 & 112) ^ 48) <= 32) {
            }
            zE = ((((i210 & 896) ^ 384) <= 256 && fetVar.g(hh80Var)) || (i210 & 384) == 256) | ((((i210 & 112) ^ 48) <= 32 && fetVar.g(xczVar)) || (i210 & 48) == 32) | ((((i210 & 7168) ^ 3072) <= 2048 && fetVar.h(z8)) || (i210 & 3072) == 2048) | ((((57344 & i210) ^ 24576) <= 16384 && fetVar.h(z2)) || (i210 & 24576) == 16384) | fetVar.e(0) | ((((i210 & 3670016) ^ 1572864) <= 1048576 && fetVar.g(xx7Var2)) || (i210 & 1572864) == 1048576) | ((((i210 & 29360128) ^ 12582912) <= 8388608 && fetVar.g(yx7Var3)) || (i210 & 12582912) == 8388608) | ((((i210 & 234881024) ^ 100663296) <= 67108864 && fetVar.g(ow3Var3)) || (i210 & 100663296) == 67108864) | ((((i210 & 1879048192) ^ 805306368) <= 536870912 && fetVar.g(sw3Var3)) || (i210 & 805306368) == 536870912) | fetVar.g(afvVar) | fetVar.g(g9m0Var);
            objP4 = fetVar.P();
            if (zE) {
                xx7Var4 = xx7Var2;
                yx7Var4 = yx7Var3;
                ow3 ow3Var6 = ow3Var3;
                obj2 = obj;
                i9 = 4;
                Object lczVar2 = new lcz(xczVar, z2, hh80Var, z8, eiyVar, sw3Var3, ow3Var6, vneVar, afvVar, g9m0Var, xx7Var4, yx7Var4);
                ow3Var4 = ow3Var6;
                xczVar3 = xczVar;
                eiyVar2 = eiyVar;
                z8 = z8;
                fetVar.o0(lczVar2);
                objP4 = lczVar2;
            } else {
                xx7Var4 = xx7Var2;
                yx7Var4 = yx7Var3;
                ow3 ow3Var7 = ow3Var3;
                obj2 = obj;
                i9 = 4;
                Object lczVar3 = new lcz(xczVar, z2, hh80Var, z8, eiyVar, sw3Var3, ow3Var7, vneVar, afvVar, g9m0Var, xx7Var4, yx7Var4);
                ow3Var4 = ow3Var7;
                xczVar3 = xczVar;
                eiyVar2 = eiyVar;
                z8 = z8;
                fetVar.o0(lczVar3);
                objP4 = lczVar3;
            }
            ibz ibzVar2 = (ibz) objP4;
            if (r4 != 0) {
                ma80Var = ma80.f21447a;
            } else {
                ma80Var = ma80.b;
            }
            ma80Var2 = ma80Var;
            if (z3) {
                fetVar.e0(-2077147368);
                zE2 = ((((i8 & 14) ^ 6) <= i9 && fetVar.g(xczVar3)) || (i8 & 6) == i9) | fetVar.e(0);
                objP6 = fetVar.P();
                if (zE2) {
                    objP6 = new ecz(xczVar3);
                    fetVar.o0(objP6);
                } else {
                    objP6 = new ecz(xczVar3);
                    fetVar.o0(objP6);
                }
                mm40VarG0 = ahy.g0((ecz) objP6, xczVar3.p, z8, ma80Var2);
                z6 = false;
                fetVar.r(false);
            } else {
                z6 = false;
                fetVar.e0(-2076718545);
                fetVar.r(false);
                mm40VarG0 = jm40.b;
            }
            if (i28 != 32) {
            }
            objP5 = fetVar.P();
            if (z7) {
                objP5 = new a7s(xczVar3, (byte) 3);
                fetVar.o0(objP5);
            } else {
                objP5 = new a7s(xczVar3, (byte) 3);
                fetVar.o0(objP5);
            }
            eiy eiyVar4 = eiyVar2;
            xcz xczVar5 = xczVar3;
            mm40 mm40VarD1 = nia0.d0(i120.c0(o050.Q(mm40Var.e(xczVar3.m).e(xczVar3.n), eiyVar2, xbzVar2, ma80Var2, z3, z8).e(mm40VarG0), xczVar3.o), xczVar5, ma80Var2, vf80Var, z3, z, qkqVar, xczVar3.g, d9x.S(z8, z2, (Function0) objP5, fetVar, i26 & 126));
            xczVar2 = xczVar5;
            t9x.f(eiyVar4, mm40VarD1, xczVar2.q, ibzVar2, fetVar, 0);
            sw3Var2 = sw3Var3;
            xx7Var3 = xx7Var4;
            yx7Var2 = yx7Var4;
            ow3Var2 = ow3Var4;
        } else {
            xczVar2 = xczVar;
            fetVar.X();
            sw3Var2 = sw3Var;
            yx7Var2 = yx7Var;
            ow3Var2 = ow3Var;
            xx7Var3 = xx7Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final xcz xczVar6 = xczVar2;
            yfe0VarU.d = new Function2() { // from class: a.jcz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    bdx.h(mm40Var, xczVar6, hh80Var, z, z2, qkqVar, z3, vf80Var, xx7Var3, sw3Var2, yx7Var2, ow3Var2, function1, (fet) obj3, iL, iL2, i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final xma h0(l2g0 l2g0Var, List list, wcb wcbVar, boolean z, boolean z2) {
        String str;
        u3i s3iVar;
        list.getClass();
        wcbVar.getClass();
        del0 del0Var = g1x.w(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f11161a;
        if (del0Var instanceof zdl0) {
            str = ((zdl0) del0Var).f44218a;
        } else {
            if (!(del0Var instanceof bel0)) {
                t9f.b();
                return null;
            }
            str = ((bel0) del0Var).b;
        }
        c4i c4iVar = new c4i(ahb.A(l2g0Var.g, l2g0Var.r, l2g0Var.t), z2, new n0x(str), new m0x(R.drawable.sport_new, null, 6), del0Var instanceof bel0 ? new y3d(y3d.g) : null, 32);
        if (l2g0Var.y.isEmpty()) {
            s3iVar = t3i.f33268a;
        } else {
            s3iVar = new s3i(z ? r8.f30001a : r8.b);
        }
        return new xma(c4iVar, null, s3iVar, 6);
    }

    public static final void i(mm40 mm40Var, final ua00 ua00Var, final float f, float f2, float f3, final Function1 function1, final Function1 function2, fet fetVar, final int i) {
        mm40 mm40Var2;
        final float f4;
        final float f5;
        jm40 jm40Var;
        int i2;
        mm40 mm40Var3;
        boolean z;
        ua00Var.getClass();
        fetVar.g0(-48180734);
        int i3 = i | 6 | (fetVar.g(ua00Var) ? 32 : 16) | (fetVar.d(f) ? 256 : 128) | 9216 | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            int i4 = i & 1;
            jm40 jm40Var2 = jm40.b;
            if (i4 == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                f5 = 8.0f;
                jm40Var = jm40Var2;
                i2 = i3 & (-64513);
                f4 = 8.0f;
                mm40Var3 = jm40Var;
            } else {
                fetVar.X();
                f5 = f3;
                i2 = i3 & (-64513);
                jm40Var = jm40Var2;
                mm40Var3 = mm40Var;
                f4 = f2;
            }
            fetVar.s();
            mm40 mm40VarJ = lgb.J(mm40Var3, vgg0.a(f));
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            mm40Var2 = mm40Var3;
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
            if (ua00Var instanceof ra00) {
                fetVar.e0(2013513432);
                int i5 = i2;
                int i6 = (i5 >> 3) & 14;
                int i7 = i5 >> 6;
                ucx.k((ra00) ua00Var, f4, f5, function1, function2, fetVar, i6 | (i7 & 7168) | (i7 & 57344));
                fetVar.r(false);
            } else {
                if (ua00Var.equals(ta00.f33591a)) {
                    fetVar.e0(-73585992);
                    vdx.g(0, fetVar, null);
                    fetVar.r(false);
                } else {
                    if (!ua00Var.equals(sa00.f31870a)) {
                        throw b1j.f(-73597191, fetVar, false);
                    }
                    fetVar.e0(-73584305);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    z = true;
                    fetVar.r(true);
                    fetVar.r(false);
                }
                fetVar.r(z);
            }
            z = true;
            fetVar.r(z);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            f4 = f2;
            f5 = f3;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var4 = mm40Var2;
            yfe0VarU.d = new Function2(ua00Var, f, f4, f5, function1, function2, i) { // from class: a.la00
                public final /* synthetic */ ua00 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    bdx.i(this.f19682a, this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final List i0(hxu hxuVar, i0w i0wVar, String str) {
        hxuVar.getClass();
        ivo0 ivo0Var = hxuVar.f13829a;
        i0wVar.getClass();
        if (hxuVar.equals(hxu.h)) {
            return iun.f15405a;
        }
        if (i0wVar == i0w.f13966a) {
            return iun.f15405a;
        }
        ivo0 ivo0Var2 = hxuVar.e;
        ivo0 ivo0Var3 = hxuVar.d;
        ivo0 ivo0Var4 = hxuVar.c;
        ivo0 ivo0Var5 = hxuVar.b;
        String str2 = ivo0Var.f15455a;
        pn40 pn40Var = pn40.f27267a;
        double d = ivo0Var.b;
        p3u0 p3u0Var = p3u0.c;
        String strC = pn40.c(d, p3u0Var);
        pz40 pz40Var = s6t0.f31722a;
        x680 x680Var = new x680(str2, str2, new wty(strC, str, s6t0.b().f33626a.getTextPrimary()));
        if (ivo0Var.f15455a.length() <= 0) {
            x680Var = null;
        }
        String str3 = ivo0Var5.f15455a;
        x680 x680Var2 = new x680(str3, str3, new wty(pn40.c(ivo0Var5.b, p3u0Var), str, s6t0.b().f33626a.getTextPrimary()));
        if (ivo0Var5.f15455a.length() <= 0) {
            x680Var2 = null;
        }
        String str4 = ivo0Var4.f15455a;
        x680 x680Var3 = new x680(str4, str4, new wty(pn40.c(ivo0Var4.b, p3u0Var), str, s6t0.b().f33626a.getTextPrimary()));
        if (ivo0Var4.f15455a.length() <= 0) {
            x680Var3 = null;
        }
        String str5 = ivo0Var3.f15455a;
        x680 x680Var4 = new x680(str5, str5, new wty(pn40.c(ivo0Var3.b, p3u0Var), str, s6t0.b().f33626a.getTextPrimary()));
        if (ivo0Var3.f15455a.length() <= 0) {
            x680Var4 = null;
        }
        String str6 = ivo0Var2.f15455a;
        return q3d.j(x680Var, x680Var2, x680Var3, x680Var4, ivo0Var2.f15455a.length() > 0 ? new x680(str6, str6, new wty(pn40.c(ivo0Var2.b, p3u0Var), str, s6t0.b().f33626a.getTextPrimary())) : null);
    }

    public static final void j(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, Function1 function1, Function1 function2, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, Function1 function3, fet fetVar, int i) {
        int i2;
        Function1 function4 = function2;
        l7m0Var.getClass();
        function1.getClass();
        function4.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        xdrVar3.getClass();
        function3.getClass();
        fetVar.g0(524064954);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(xdrVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 38347923) != 38347922)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            function4 = function2;
            c030.a(mm40Var, l7m0Var, null, xczVar, u1c.M(-1799674828, new vz20(xdrVar2, xdrVar3, function3, (byte) 3), fetVar), u1c.M(-624800184, new kgx(backgroundContent, function1, function2, (byte) 5), fetVar), u1c.M(-210507295, new xz20(xdrVar, function1, function4, (byte) 3), fetVar), u1c.M(-1843912916, new i6b((byte) 2, backgroundContent), fetVar), uc9.l, fetVar, (i3 & 14) | 115040256 | (i3 & 112) | ((i3 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yz20(mm40Var, l7m0Var, xczVar, function1, function4, xdrVar, xdrVar2, xdrVar3, function3, i, (byte) 3);
        }
    }

    public static final void j0(RecyclerView recyclerView) {
        recyclerView.o(new wge0(new bod0((byte) 25)));
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var, List list, Function1 function1) {
        int i2;
        fetVar.g0(-1943271477);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = xfn.a(fetVar).d;
            lh80 lh80Var = new lh80(f, 12.0f, f, 12.0f);
            boolean z = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(list))) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rb(list, function1, (byte) 9);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, null, null, null, false, null, (Function1) objP, fetVar, i2 & 14, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nt8(mm40Var, list, function1, i, (byte) 4);
        }
    }

    public static final boolean k0(wsy wsyVar) {
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        if (tft0VarJ0 instanceof a2o) {
            return true;
        }
        return (tft0VarJ0 instanceof kkq) && (((kkq) tft0VarJ0).n0() instanceof a2o);
    }

    public static final void l(mm40 mm40Var, si40 si40Var, fet fetVar, int i) {
        fetVar.g0(-491278707);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(si40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), jd8.n), 8.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            a(si40Var.b, si40Var.c, fetVar, 0);
            f(si40Var.e, fetVar, 0);
            L(si40Var.f, si40Var.d, fetVar, 0);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, si40Var, i, (byte) 20);
        }
    }

    public static final boolean l0(rn00 rn00Var) {
        if (rn00Var instanceof jn00) {
            Object obj = ((jn00) rn00Var).f16791a;
            List list = obj instanceof List ? (List) obj : null;
            if (list == null || !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static final void m(mm40 mm40Var, z250 z250Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        z250Var.getClass();
        fetVar2.g0(1968512273);
        int i2 = i | (fetVar2.g(z250Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b = 1;
        byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = z250Var instanceof x250;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar2.e0(465901457);
                x250 x250Var = (x250) z250Var;
                ijl ijlVar = x250Var.b;
                jjl jjlVar = x250Var.f40151a;
                int i3 = i2 & 896;
                boolean z2 = i3 == 256;
                Object objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    objP = new m040(function1, (byte) 27);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z3 = i3 == 256;
                Object objP2 = fetVar2.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new m040(function1, (byte) 28);
                    fetVar2.o0(objP2);
                }
                Function0 function2 = (Function0) objP2;
                b = i3 != 256 ? (byte) 0 : (byte) 1;
                Object objP3 = fetVar2.P();
                if (b != 0 || objP3 == cl5Var) {
                    objP3 = new m040(function1, (byte) 29);
                    fetVar2.o0(objP3);
                }
                feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar2, 0, 4);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                if (!(z250Var instanceof y250)) {
                    throw b1j.f(1954690318, fetVar2, false);
                }
                fetVar2.e0(466502361);
                mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarQ, 12.0f, 8.0f);
                y250 y250Var = (y250) z250Var;
                String str = y250Var.f41890a;
                String str2 = y250Var.b;
                int i4 = i2 & 896;
                boolean z4 = i4 == 256;
                Object objP4 = fetVar2.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new w250(function1, b2);
                    fetVar2.o0(objP4);
                }
                Function0 function3 = (Function0) objP4;
                boolean z5 = i4 == 256;
                Object objP5 = fetVar2.P();
                if (z5 || objP5 == cl5Var) {
                    objP5 = new w250(function1, b);
                    fetVar2.o0(objP5);
                }
                pzb.g(mm40VarK, str, str2, function3, (Function0) objP5, fetVar2, 0);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var, z250Var, function1, i, (byte) 24);
        }
    }

    public static final afk0 m0(ffk0 ffk0Var, fet fetVar) {
        Object obj = (w6k) fetVar.k(bmd.h);
        sjj sjjVarA = wzk0.a(fetVar);
        boolean zG = fetVar.g(obj) | fetVar.g(ffk0Var) | fetVar.g(sjjVarA);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new afk0(ffk0Var, sjjVarA, ro4.g0(0.0f, 400.0f, null, 5));
            fetVar.o0(objP);
        }
        return (afk0) objP;
    }

    public static final void n(c280 c280Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2143906586);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(c280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 24.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.B, 2, false, 2, 0, null, g1t0.m(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5l0(c280Var, str, i, (byte) 4);
        }
    }

    public static final boolean n0(wsy wsyVar) {
        wsyVar.getClass();
        foc focVarN = wsyVar.S().n();
        if (focVarN != null && ddx.a(focVarN) && ddx.a(focVarN) && !rek.g((wm40) focVarN).equals(j4m0.h)) {
            return true;
        }
        foc focVarN2 = wsyVar.S().n();
        hzs0 hzs0Var = focVarN2 instanceof hzs0 ? (hzs0) focVarN2 : null;
        return hzs0Var == null ? false : n0(vsm0.r(hzs0Var));
    }

    public static final void o(int i, long j, long j2, fet fetVar, c280 c280Var, c280 c280Var2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        c280 c280Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1419063780);
        int i2 = (fetVar2.f(j2) ? 536870912 : 268435456) | i | (fetVar.g(c280Var) ? 4 : 2) | (fetVar2.g(c280Var2) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.h(z2) ? 131072 : 65536) | (fetVar2.g(str3) ? 1048576 : 524288) | (fetVar2.g(str4) ? 8388608 : 4194304) | (fetVar2.f(j) ? 67108864 : 33554432);
        if (fetVar2.U(i2 & 1, (306783379 & i2) != 306783378)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 52.0f), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i3 = i2 >> 3;
            c280Var3 = c280Var;
            n(c280Var3, str, fetVar2, (i2 & 14) | (i3 & 112));
            n(c280Var2, str2, fetVar2, (i3 & 14) | ((i2 >> 6) & 112));
            fetVar2.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
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
            int i4 = i2 >> 15;
            int i5 = i2 >> 18;
            F(((i2 >> 12) & 14) | (i4 & 112) | (i5 & 896), j, fetVar2, str3, z);
            fetVar2 = fetVar;
            F((i4 & 14) | (i5 & 112) | ((i2 >> 21) & 896), j2, fetVar2, str4, z2);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            c280Var3 = c280Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5l0(c280Var3, c280Var2, str, str2, z, z2, str3, str4, j, j2, i);
        }
    }

    public static final q1f0 o0(vzg0 vzg0Var) {
        String str = (String) vzg0Var.a("ADDRESS");
        String str2 = str == null ? "" : str;
        Boolean bool = (Boolean) vzg0Var.a("AGE_CONFIRMATION_CHECKBOX");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        BonusStateModel bonusStateModel = (BonusStateModel) vzg0Var.a("BONUS");
        CityStateModel cityStateModel = (CityStateModel) vzg0Var.a("CITY");
        Boolean bool2 = (Boolean) vzg0Var.a("COMMERCIAL_COMMUNICATION_CHECKBOX");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        CountryStateModel countryStateModel = (CountryStateModel) vzg0Var.a("COUNTRY");
        CurrencyStateModel currencyStateModel = (CurrencyStateModel) vzg0Var.a("CURRENCY");
        Long l = (Long) vzg0Var.a("DATE");
        DocumentStateModel documentStateModel = (DocumentStateModel) vzg0Var.a("DOCUMENT_TYPE");
        String str3 = (String) vzg0Var.a(CommonConstant.RETKEY.EMAIL);
        String str4 = str3 == null ? "" : str3;
        String str5 = (String) vzg0Var.a("FIRST_NAME");
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) vzg0Var.a("LAST_NAME");
        String str8 = str7 == null ? "" : str7;
        String str9 = (String) vzg0Var.a("MIDDLE_NAME");
        String str10 = str9 == null ? "" : str9;
        CitizenshipStateModel citizenshipStateModel = (CitizenshipStateModel) vzg0Var.a("CITIZENSHIP");
        String str11 = (String) vzg0Var.a("PASSPORT_NUMBER");
        String str12 = str11 == null ? "" : str11;
        String str13 = (String) vzg0Var.a("PASSWORD");
        String str14 = str13 == null ? "" : str13;
        PhoneStateModel phoneStateModel = (PhoneStateModel) vzg0Var.a("PHONE");
        Boolean bool3 = (Boolean) vzg0Var.a("POLITICALLY_EXPOSED_PERSON");
        String str15 = (String) vzg0Var.a("POST_CODE");
        String str16 = str15 == null ? "" : str15;
        String str17 = (String) vzg0Var.a("PROMO_CODE");
        RegionStateModel regionStateModel = (RegionStateModel) vzg0Var.a("REGION");
        String str18 = (String) vzg0Var.a("REPEAT_PASSWORD");
        String str19 = str18 == null ? "" : str18;
        Boolean bool4 = (Boolean) vzg0Var.a("RULES_CONFIRMATION");
        boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = (Boolean) vzg0Var.a("RULES_CONFIRMATION_ALL");
        boolean zBooleanValue4 = bool5 != null ? bool5.booleanValue() : false;
        String str20 = (String) vzg0Var.a("SECOND_LAST_NAME");
        String str21 = str20 == null ? "" : str20;
        Boolean bool6 = (Boolean) vzg0Var.a("EMAIL_BETS_CHECKBOX");
        boolean zBooleanValue5 = bool6 != null ? bool6.booleanValue() : false;
        Boolean bool7 = (Boolean) vzg0Var.a("EMAIL_NEWS_CHECKBOX");
        boolean zBooleanValue6 = bool7 != null ? bool7.booleanValue() : false;
        Boolean bool8 = (Boolean) vzg0Var.a("SHARE_PERSONAL_DATA_CONFIRMATION");
        boolean zBooleanValue7 = bool8 != null ? bool8.booleanValue() : false;
        Integer num = (Integer) vzg0Var.a("SOCIAL_TYPE_SELECTED");
        SocialStateModel socialStateModel = (SocialStateModel) vzg0Var.a("SOCIAL");
        Boolean bool9 = (Boolean) vzg0Var.a("PASSWORD_REQUIREMENTS_EXPANDED");
        boolean zBooleanValue8 = bool9 != null ? bool9.booleanValue() : false;
        Integer num2 = (Integer) vzg0Var.a(CommonConstant.RETKEY.GENDER);
        Boolean bool10 = (Boolean) vzg0Var.a("HAS_BONUSES");
        boolean zBooleanValue9 = bool10 != null ? bool10.booleanValue() : false;
        Long l2 = (Long) vzg0Var.a("PASSPORT_DATE_ISSUE");
        Long l3 = (Long) vzg0Var.a("PASSPORT_DATE_EXPIRE");
        Boolean bool11 = (Boolean) vzg0Var.a("NOTIFY_NEWS_CALL_SETTINGS");
        boolean zBooleanValue10 = bool11 != null ? bool11.booleanValue() : true;
        Boolean bool12 = (Boolean) vzg0Var.a("SOCIAL_BLOCK_EXPAND");
        boolean zBooleanValue11 = bool12 != null ? bool12.booleanValue() : false;
        Boolean bool13 = (Boolean) vzg0Var.a("SEND_SMS_EVENTS");
        return new q1f0(str2, zBooleanValue, bonusStateModel, cityStateModel, zBooleanValue2, zBooleanValue10, countryStateModel, currencyStateModel, l, documentStateModel, str4, str6, str8, str10, citizenshipStateModel, str12, str14, phoneStateModel, bool3, str16, str17, regionStateModel, str19, zBooleanValue3, zBooleanValue4, str21, zBooleanValue5, zBooleanValue6, zBooleanValue7, num, socialStateModel, num2, zBooleanValue8, zBooleanValue9, l3, l2, zBooleanValue11, bool13 != null ? bool13.booleanValue() : false, (q7f0) vzg0Var.a("REGISTRATION_TYPE"));
    }

    public static final void p(mm40 mm40Var, p580 p580Var, fet fetVar, int i) {
        p580Var.getClass();
        fetVar.g0(-2053394678);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(p580Var) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (p580Var instanceof k580) {
            fetVar.e0(538727110);
            g8x.k(mm40Var, (k580) p580Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else if (p580Var instanceof m580) {
            fetVar.e0(538929633);
            xvw.f(mm40Var, (m580) p580Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else if (p580Var instanceof n580) {
            fetVar.e0(539137829);
            g7x.p(mm40Var, (n580) p580Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else if (p580Var instanceof o580) {
            fetVar.e0(539342305);
            qim0.h(mm40Var, (o580) p580Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!(p580Var instanceof l580)) {
                throw b1j.f(-1922292460, fetVar, false);
            }
            fetVar.e0(539525112);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var, p580Var, i, (byte) 23);
        }
    }

    public static final kda0 p0(nda0 nda0Var) {
        nda0Var.getClass();
        String str = nda0Var.f23330a;
        if (str == null) {
            str = "";
        }
        String str2 = nda0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = nda0Var.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = nda0Var.d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = nda0Var.e;
        if (str5 == null) {
            str5 = "";
        }
        Integer num = nda0Var.f;
        int iIntValue = num != null ? num.intValue() : -1;
        Boolean bool = nda0Var.g;
        return new kda0(iIntValue, str, str2, str3, str4, str5, bool != null ? bool.booleanValue() : false);
    }

    public static final void q(mm40 mm40Var, yx80 yx80Var, mez mezVar, lh80 lh80Var, Function2 function2, fet fetVar, int i) {
        int i2;
        mezVar.getClass();
        function2.getClass();
        fetVar.g0(-2105960109);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yx80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mezVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(lh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (yx80Var instanceof wx80) {
            fetVar.e0(-2069993385);
            b(mm40Var, (wx80) yx80Var, mezVar, lh80Var, function2, fetVar, i2 & 65534);
            fetVar.r(false);
        } else {
            if (!yx80Var.equals(xx80.f41645a)) {
                throw b1j.f(-898059860, fetVar, false);
            }
            fetVar.e0(-2069700342);
            I(mm40Var, lh80Var, fetVar, ((i2 >> 6) & 112) | (i2 & 14));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) yx80Var, (Object) mezVar, (Object) lh80Var, (Object) function2, i, (byte) 17);
        }
    }

    public static final j83 q0(String str) {
        str.getClass();
        h83 h83Var = new h83();
        if (str.length() > 0) {
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            h83 h83Var2 = new h83();
            long j = y3d.g;
            long j2 = daq0.c;
            smk0 smk0Var = new smk0(jM123getWhite0d7_KjU, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
            h83Var2.c(str);
            StringBuilder sb = h83Var2.f12607a;
            h83Var2.a(smk0Var, 0, sb.length());
            sb.length();
            h83Var.b(h83Var2.h());
        }
        return h83Var.h();
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1381885340);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(lgb.J(o7k0.e(mm40VarD, 22.0f), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 9);
        }
    }

    public static final void s(ir8 ir8Var, mm40 mm40Var, lqw lqwVar, Function1 function1, fet fetVar, int i) {
        int i2;
        zx7 zx7Var = gqw0.e;
        function1.getClass();
        fetVar.g0(949107819);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(lqwVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            byte b = 3;
            if (lqwVar instanceof hqw) {
                fetVar.e0(1559554671);
                k((i2 >> 3) & 910, fetVar, mm40Var, ((hqw) lqwVar).f13504a, function1);
                fetVar.r(false);
            } else {
                boolean z = lqwVar instanceof iqw;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar.e0(1559560324);
                    mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var);
                    mdm mdmVar = ((iqw) lqwVar).f15230a;
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new wm90(b);
                        fetVar.o0(objP);
                    }
                    c(mm40VarB, mdmVar, (Function0) objP, fetVar, 384);
                    fetVar.r(false);
                } else if (lqwVar instanceof jqw) {
                    fetVar.e0(1559566681);
                    mm40 mm40VarB2 = ir8Var.b(jm40Var, zx7Var);
                    mdm mdmVar2 = ((jqw) lqwVar).f16976a;
                    boolean z2 = (i2 & 7168) == 2048;
                    Object objP2 = fetVar.P();
                    if (z2 || objP2 == cl5Var) {
                        objP2 = new qu80(function1, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    c(mm40VarB2, mdmVar2, (Function0) objP2, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (!(lqwVar instanceof kqw)) {
                        throw b1j.f(1559553288, fetVar, false);
                    }
                    fetVar.e0(1559574548);
                    H(0, fetVar);
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg00(ir8Var, mm40Var, lqwVar, function1, i, (byte) 1);
        }
    }

    public static final void t(mm40 mm40Var, b8c0 b8c0Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        b8c0Var.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1370434527);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(b8c0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (b8c0Var instanceof z7c0) {
            fetVar.e0(1567386397);
            y(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else if (b8c0Var instanceof v7c0) {
            fetVar.e0(1567388707);
            u(mm40Var, (v7c0) b8c0Var, function1, fetVar, i2 & 1022);
            fetVar.r(false);
        } else if (b8c0Var instanceof x7c0) {
            fetVar.e0(1567394202);
            w(mm40Var, (x7c0) b8c0Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else if (b8c0Var instanceof w7c0) {
            fetVar.e0(1567398404);
            v(mm40Var, (w7c0) b8c0Var, function1, fetVar, i2 & 1022);
            fetVar.r(false);
        } else if (b8c0Var instanceof a8c0) {
            fetVar.e0(1567403869);
            z(mm40Var, (a8c0) b8c0Var, function2, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
            fetVar.r(false);
        } else {
            if (!(b8c0Var instanceof y7c0)) {
                throw b1j.f(1567385435, fetVar, false);
            }
            fetVar.e0(1567409113);
            x(mm40Var, (y7c0) b8c0Var, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 29, i, (Object) mm40Var, (Object) b8c0Var, (Object) function1, (Object) function2);
        }
    }

    public static final void u(mm40 mm40Var, v7c0 v7c0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1165076214);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(v7c0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 68.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarE2, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new gvb0(function1, v7c0Var, (byte) 3);
                fetVar2.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(y860.Y(mm40VarQ, false, null, null, (Function0) objP, 15), 4.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(v7c0Var.c, 0, fetVar2);
            long primary = s6t0.b().f33626a.getPrimary();
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, jm40Var, primary, fetVar2, 440, 0);
            v8q0.a(v7c0Var.b, jm40Var, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, v7c0Var, function1, i, (byte) 17);
        }
    }

    public static final void v(mm40 mm40Var, w7c0 w7c0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1172751314);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(w7c0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 68.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarE2, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new gvb0(function1, w7c0Var, (byte) 5);
                fetVar2.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(y860.Y(mm40VarQ, false, null, null, (Function0) objP, 15), 4.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            w7c0Var.getClass();
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_money, 0, fetVar2);
            long primary = s6t0.b().f33626a.getPrimary();
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, jm40Var, primary, fetVar2, 440, 0);
            v8q0.a(w7c0Var.f38666a, jm40Var, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 48, 24960, 110584);
            v8q0.a(w7c0Var.b, jm40Var, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, w7c0Var, function1, i, (byte) 19);
        }
    }

    public static final void w(mm40 mm40Var, x7c0 x7c0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-675083431);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(x7c0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarN = epv0.N(mm40Var, 0.6f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarN, 68.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE2, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 4.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            x7c0Var.getClass();
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_money, 0, fetVar2);
            long primary = s6t0.b().f33626a.getPrimary();
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, jm40Var, primary, fetVar2, 440, 0);
            v8q0.a(x7c0Var.f40407a, jm40Var, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) x7c0Var, i, (byte) 13);
        }
    }

    public static final void x(mm40 mm40Var, y7c0 y7c0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(389826185);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(y7c0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarN = epv0.N(mm40Var, 0.6f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarN, 68.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE2, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 4.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            kpb.j(null, new dkm(new ycl(24.0f), new y3d(((ThemeColors) fetVar2.k(zaq0.b)).getPrimary()), i3), fetVar2, 0, 1);
            v8q0.a(y7c0Var.f42145a, jm40.b, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) y7c0Var, i, (byte) 14);
        }
    }

    public static final void y(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-328626338);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 68.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 15);
        }
    }

    public static final void z(mm40 mm40Var, a8c0 a8c0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        Object obj = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(-653470756);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(a8c0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(obj) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            bi90 bi90Var = a8c0Var.d;
            Date date = a8c0Var.b;
            Object[] objArr = {bi90Var};
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ssa0(a8c0Var, b);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            Long lValueOf = Long.valueOf(date.getTime());
            int i4 = i2 & 896;
            boolean z2 = (i3 == 32) | (i4 == 256);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new s980(a8c0Var, obj, null, (byte) 29);
                fetVar2.o0(objP2);
            }
            m0x0.v("CASHBACK", lValueOf, (Function2) objP2, fetVar2);
            mm40 mm40VarN = epv0.N(mm40Var, 0.6f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarN, 68.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE2, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 4.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_money, 0, fetVar2);
            long primary = s6t0.b().f33626a.getPrimary();
            jm40 jm40Var = jm40.b;
            boolean z3 = false;
            dww.c(pm80VarF, null, jm40Var, primary, fetVar2, 440, 0);
            v8q0.a(a8c0Var.f420a, jm40Var, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            long time = date.getTime();
            qol qolVar = new qol(a8c0Var.c, 14);
            tol tolVar = tol.f34290a;
            iol iolVar = (iol) l7m0VarY.getValue();
            sol solVar = sol.f32548a;
            boolean z4 = i4 == 256;
            if (i3 == 32) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                obj = function1;
                objP3 = new gvb0(obj, a8c0Var, (byte) 4);
                fetVar2.o0(objP3);
            } else {
                obj = function1;
            }
            fxb.i(time, qolVar, jm40Var, tolVar, solVar, iolVar, (Function0) objP3, fetVar2, 28032, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, a8c0Var, obj, i, (byte) 18);
        }
    }
}
