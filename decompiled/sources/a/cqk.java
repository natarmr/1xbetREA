package a;

import android.content.Context;
import android.javax.sip.message.Response;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cqk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4797a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cqk(e2d e2dVar, l7m0 l7m0Var, Function0 function0, Function1 function1, ugd ugdVar, int i) {
        this.f4797a = (byte) 23;
        this.b = e2dVar;
        this.c = l7m0Var;
        this.d = function0;
        this.e = function1;
        this.f = ugdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        boolean z;
        final byte b;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        byte b2 = this.f4797a;
        byte b3 = 4;
        byte b4 = 10;
        pcy pcyVar = e7z.u1;
        final jm40 jm40Var = jm40.b;
        Object obj3 = ukd.f35823a;
        Object obj4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b2) {
            case 0:
                ((Integer) obj2).getClass();
                fxb.g((mm40) obj8, (qdz) obj7, (dqk) obj5, (Function0) obj4, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                wzb.n((mm40) obj8, (qdz) obj7, (uqk) obj5, (Function0) obj4, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                aac.k((mm40) obj8, (ork) obj5, (qdz) obj7, (Function0) obj4, (Function2) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ebc.p((mm40) obj8, (rrk) obj5, (qdz) obj7, (Function0) obj4, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                ibc.j((mm40) obj8, (urk) obj5, (qdz) obj7, (Function1) obj6, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ahb.g((mm40) obj8, (zh0) obj7, (di0) obj5, (lh80) obj4, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                zjb.e((mm40) obj8, (tll) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                sac.n((mm40) obj8, (gw1) obj7, (kw1) obj5, (hh80) obj6, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                nkb.f((mm40) obj8, (ytl) obj7, (Function0) obj4, (Function0) obj5, (Function0) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                obc.o((mm40) obj8, (String) obj7, (gzl) obj5, (xx7) obj6, (Function0) obj4, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 10:
                cp cpVar = (cp) obj8;
                x6f x6fVar = (x6f) obj7;
                oye oyeVar = (oye) obj5;
                mhc mhcVar = (mhc) obj4;
                x6f x6fVar2 = (x6f) obj6;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    m5m m5mVar = ((zog) cpVar.u()).b;
                    boolean zG = fetVar.g(mhcVar) | fetVar.i(cpVar);
                    Object objP = fetVar.P();
                    if (zG || objP == obj3) {
                        objP = new lrk(mhcVar, cpVar, (byte) 18);
                        fetVar.o0(objP);
                    }
                    j5m.a(mm40VarN, m5mVar, null, x6fVar, oyeVar, (Function0) objP, null, x6fVar2, null, fetVar, 0, 324);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                bkb.z((mm40) obj8, (r5m) obj7, (Function0) obj4, (Function0) obj5, (Function0) obj6, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                nkb.w((mm40) obj8, (h6m) obj7, (Function0) obj4, (Function0) obj5, (Function0) obj6, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 13:
                e8n e8nVar = (e8n) obj8;
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) obj7;
                Function1 function2 = (Function1) obj6;
                Function1 function3 = (Function1) obj5;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    tlb.E(e8nVar, function0, function1, fetVar2, 0);
                    tlb.v(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13), e8nVar, function2, function3, fetVar2, 0);
                    tlb.a(e8nVar, fetVar2, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 14:
                uhm uhmVar = (uhm) obj8;
                Function1 function4 = (Function1) obj6;
                Function0 function5 = (Function0) obj4;
                Function0 function6 = (Function0) obj7;
                l7m0 l7m0Var = (l7m0) obj5;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40VarD2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    Object objP2 = fetVar3.P();
                    if (objP2 == obj3) {
                        objP2 = new x1d(l7m0Var, (byte) 20);
                        fetVar3.o0(objP2);
                    }
                    lgb.G(i4w0.T(mm40VarN3, (Function1) objP2), uhmVar, function4, function5, function6, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                lgb.G((mm40) obj8, (uhm) obj7, (Function1) obj6, (Function0) obj4, (Function0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                final a4x a4xVar = (a4x) obj8;
                final pz40 pz40Var = (pz40) obj7;
                final rah0 rah0Var = (rah0) obj5;
                final Function1 function7 = (Function1) obj6;
                final vne vneVar = (vne) obj4;
                final c5n0 c5n0Var = (c5n0) obj;
                final p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                List listK = c5n0Var.k("measuring", new ugd(-675212977, true, new eup(a4xVar, (byte) 8)));
                final ArrayList arrayList2 = new ArrayList(r3d.q(listK, 10));
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pj30) it.next()).S(r4e.b(0, 0, 0, 0, 15)));
                }
                zcl zclVar4 = qmk.f28987a;
                final float fW0 = c5n0Var.w0(4.0f);
                final float fW1 = c5n0Var.w0(12.0f) * 2.0f;
                Iterator it2 = arrayList2.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    i += ((pu90) it2.next()).f27604a;
                }
                float size = ((a4xVar.size() - 1) * fW0) + i + fW1;
                long j = p4eVar.f26347a;
                final boolean z6 = size <= ((float) p4e.i(j));
                if (z6) {
                    float fI = ((p4e.i(j) - fW1) - ((a4xVar.size() - 1) * fW0)) / a4xVar.size();
                    int size2 = a4xVar.size();
                    arrayList = new ArrayList(size2);
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList.add(Float.valueOf(fI));
                    }
                } else {
                    arrayList = new ArrayList(r3d.q(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(Float.valueOf(((pu90) it3.next()).f27604a));
                    }
                }
                final jie0 jie0Var = new jie0();
                jie0Var.f16571a = c5n0Var.w0(12.0f);
                int iIntValue4 = ((Number) pz40Var.getValue()).intValue();
                for (int i3 = 0; i3 < iIntValue4; i3++) {
                    jie0Var.f16571a = ((Number) arrayList.get(i3)).floatValue() + fW0 + jie0Var.f16571a;
                }
                final float fFloatValue = ((Number) arrayList.get(((Number) pz40Var.getValue()).intValue())).floatValue();
                pu90 pu90VarS = ((pj30) CollectionsKt.U(c5n0Var.k(RemoteMessageConst.Notification.CONTENT, new ugd(1615683347, true, new Function2() { // from class: a.zhm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj9, Object obj10) {
                        final rah0 rah0Var2;
                        zhm zhmVar = this;
                        fet fetVar4 = (fet) obj9;
                        int iIntValue5 = ((Integer) obj10).intValue();
                        if (fetVar4.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                            float f = jie0Var.f16571a;
                            zsf zsfVar = ihn.f14788a;
                            l7m0 l7m0VarB = d43.b(f, ro4.m0(300, 0, zsfVar, 2), null, null, fetVar4, 0, 28);
                            l7m0 l7m0VarB2 = d43.b(fFloatValue, ro4.m0(300, 0, zsfVar, 2), null, null, fetVar4, 0, 28);
                            jm40 jm40Var2 = jm40.b;
                            boolean z7 = z6;
                            rah0 rah0Var3 = rah0Var;
                            mm40 mm40VarD3 = z7 ? o7k0.d(jm40Var2, 1.0f) : wha0.P(jm40Var2, rah0Var3, false, 14);
                            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                            int iHashCode2 = Long.hashCode(fetVar4.T);
                            bh90 bh90VarM2 = fetVar4.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarD3);
                            mkd.c0.getClass();
                            fetVar4.i0();
                            boolean z8 = fetVar4.S;
                            pcy pcyVar2 = e7z.u1;
                            if (z8) {
                                fetVar4.l(pcyVar2);
                            } else {
                                fetVar4.r0();
                            }
                            shd shdVar = gqw0.x;
                            jpm0.o(fetVar4, tj30VarC, shdVar);
                            shd shdVar2 = gqw0.w;
                            jpm0.o(fetVar4, bh90VarM2, shdVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode2);
                            shd shdVar3 = gqw0.y;
                            jpm0.o(fetVar4, numValueOf, shdVar3);
                            jpm0.n(fetVar4);
                            shd shdVar4 = gqw0.v;
                            jpm0.o(fetVar4, mm40VarC1, shdVar4);
                            boolean zG2 = fetVar4.g(l7m0VarB);
                            Object objP3 = fetVar4.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zG2 || objP3 == cl5Var) {
                                objP3 = new x1d(l7m0VarB, (byte) 21);
                                fetVar4.o0(objP3);
                            }
                            mm40 mm40VarP = ffb0.P(jm40Var2, (Function1) objP3);
                            float fS0 = c5n0Var.s0(((Number) l7m0VarB2.getValue()).floatValue());
                            zcl zclVar5 = qmk.f28987a;
                            mm40 mm40VarJ = lgb.J(o7k0.p(mm40VarP, fS0, 36.0f), vgg0.a(12.0f));
                            Object objP4 = fetVar4.P();
                            if (objP4 == cl5Var) {
                                objP4 = new aim((byte) 0);
                                fetVar4.o0(objP4);
                            }
                            zq8.a(0, fetVar4, i120.Q(i4w0.T(mm40VarJ, (Function1) objP4), ((StaticColors) fetVar4.k(m8m0.f21378a)).m127getWhite300d7_KjU(), vgg0.a(12.0f)));
                            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var2, 1.0f), 12.0f, 0.0f, 2);
                            thg0 thg0VarA = shg0.a(z7 ? uc9.f : new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar4, 48);
                            int iHashCode3 = Long.hashCode(fetVar4.T);
                            bh90 bh90VarM3 = fetVar4.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarL);
                            fetVar4.i0();
                            if (fetVar4.S) {
                                fetVar4.l(pcyVar2);
                            } else {
                                fetVar4.r0();
                            }
                            jpm0.o(fetVar4, thg0VarA, shdVar);
                            jpm0.o(fetVar4, bh90VarM3, shdVar2);
                            vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
                            Iterator itO = h97.o(fetVar4, mm40VarC2, shdVar4, 2093362412, a4xVar);
                            int i4 = 0;
                            while (itO.hasNext()) {
                                Object next = itO.next();
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                final e0x e0xVar = (e0x) next;
                                mm40 x7zVar = z7 ? new x7z(1.0f, true) : jm40Var2;
                                boolean z9 = i4 == ((Number) pz40Var.getValue()).intValue();
                                final Function1 function8 = function7;
                                boolean zG3 = fetVar4.g(function8) | fetVar4.g(e0xVar) | fetVar4.h(z7);
                                final vne vneVar2 = vneVar;
                                boolean zI = zG3 | fetVar4.i(vneVar2) | fetVar4.g(rah0Var3) | fetVar4.e(i4);
                                final ArrayList arrayList3 = arrayList2;
                                boolean zI2 = zI | fetVar4.i(arrayList3);
                                final int i6 = i4;
                                final p4e p4eVar2 = p4eVar;
                                final boolean z10 = z7;
                                boolean zF = fetVar4.f(p4eVar2.f26347a) | zI2;
                                final float f2 = fW0;
                                boolean zD = zF | fetVar4.d(f2);
                                final float f3 = fW1;
                                boolean zD2 = zD | fetVar4.d(f3);
                                Object objP5 = fetVar4.P();
                                if (zD2 || objP5 == cl5Var) {
                                    rah0Var2 = rah0Var3;
                                    Function1 function9 = new Function1() { // from class: a.bim
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj11) {
                                            ((e0x) obj11).getClass();
                                            Function1 function10 = function8;
                                            if (function10 != null) {
                                                function10.invoke(e0xVar.f7011a);
                                            }
                                            if (!z10) {
                                                int i7 = p4e.i(p4eVar2.f26347a);
                                                ArrayList arrayList4 = arrayList3;
                                                int i8 = i6;
                                                float f4 = (i7 - ((pu90) arrayList4.get(i8)).f27604a) / 2.0f;
                                                float f5 = f3;
                                                for (int i9 = 0; i9 < i8; i9++) {
                                                    f5 += ((pu90) arrayList4.get(i9)).f27604a + f2;
                                                }
                                                float f6 = f5 - f4;
                                                rah0 rah0Var4 = rah0Var2;
                                                qjj.W(vneVar2, null, null, new qu2(rah0Var4, l1e0.c(f6, 0.0f, rah0Var4.f.l()), (yje) null, (byte) 3), 3);
                                            }
                                            return Unit.f46060a;
                                        }
                                    };
                                    fetVar4.o0(function9);
                                    objP5 = function9;
                                } else {
                                    rah0Var2 = rah0Var3;
                                }
                                bkb.w(x7zVar, e0xVar, z9, (Function1) objP5, fetVar4, 0, 0);
                                cl5Var = cl5Var;
                                i4 = i5;
                                z7 = z10;
                                rah0Var3 = rah0Var2;
                                zhmVar = this;
                            }
                            ohs0.x(fetVar4, false, true, true);
                        } else {
                            fetVar4.X();
                        }
                        return Unit.f46060a;
                    }
                })))).S(j);
                return vj30.x(c5n0Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 1));
            case 17:
                Function2 function8 = (Function2) obj8;
                imm immVar = (imm) obj7;
                Function1 function9 = (Function1) obj6;
                Function1 function10 = (Function1) obj5;
                Function0 function11 = (Function0) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!fetVar4.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fetVar4.X();
                } else if (function8 != null) {
                    fetVar4.e0(-555682411);
                    function8.invoke(fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(-555607267);
                    if (!Intrinsics.d(immVar.b, mlm.f21997a)) {
                        fetVar4.e0(-555507757);
                        final tlm tlmVar = immVar.b;
                        if (tlmVar != null) {
                            if (tlmVar instanceof mlm) {
                                fetVar4.e0(-1372841984);
                                z4 = false;
                                fetVar4.r(false);
                            } else {
                                if (tlmVar instanceof plm) {
                                    fetVar4.e0(391647222);
                                    plm plmVar = (plm) tlmVar;
                                    String str = plmVar.f27190a;
                                    long j2 = plmVar.c;
                                    byte b5 = plmVar.b.f12709a;
                                    ga50 ga50Var = plmVar.d;
                                    zcl zclVar5 = qmk.f28987a;
                                    hlm.i(s5x0.L(jm40Var, 8.0f, 0.0f, 2), str, j2, b5, ga50Var, fetVar4, 0, 0);
                                    b = 0;
                                    fetVar4.r(false);
                                } else {
                                    b = 0;
                                    if (tlmVar instanceof qlm) {
                                        fetVar4.e0(392056546);
                                        b34.h(((qlm) tlmVar).b, null, kzn.d(ro4.m0(Response.BAD_REQUEST, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(Response.BAD_REQUEST, 0, null, 6), 2), null, u1c.M(2053209060, new xdr() { // from class: a.blm
                                            @Override // a.xdr
                                            public final Object F(Object obj9, Object obj10, Object obj11) {
                                                byte b6 = b;
                                                mm40 mm40Var = jm40Var;
                                                tlm tlmVar2 = tlmVar;
                                                switch (b6) {
                                                    case 0:
                                                        fet fetVar5 = (fet) obj10;
                                                        int iIntValue6 = ((Integer) obj11).intValue();
                                                        ((u63) obj9).getClass();
                                                        if (fetVar5.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                            qlm qlmVar = (qlm) tlmVar2;
                                                            String str2 = qlmVar.f28941a;
                                                            long j3 = qlmVar.c;
                                                            ha50 ha50Var = ha50.TWO_LINES;
                                                            zcl zclVar6 = qmk.f28987a;
                                                            hlm.i(s5x0.L(mm40Var, 8.0f, 0.0f, 2), str2, j3, 2, fa50.f9191a, fetVar5, 0, 0);
                                                        } else {
                                                            fetVar5.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar6 = (fet) obj10;
                                                        int iIntValue7 = ((Integer) obj11).intValue();
                                                        ((u63) obj9).getClass();
                                                        if (fetVar6.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                            slm slmVar = (slm) tlmVar2;
                                                            String str3 = slmVar.b;
                                                            long j4 = slmVar.d;
                                                            String str4 = slmVar.c;
                                                            long j5 = slmVar.e;
                                                            zcl zclVar7 = qmk.f28987a;
                                                            hlm.j(s5x0.L(mm40Var, 8.0f, 0.0f, 2), str3, str4, j4, j5, fa50.f9191a, fetVar6, 0);
                                                        } else {
                                                            fetVar6.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar4), fetVar4, 196608, 18);
                                        fetVar4.r(false);
                                    } else {
                                        if (tlmVar instanceof slm) {
                                            fetVar4.e0(392791401);
                                            final byte b6 = 1;
                                            b34.h(((slm) tlmVar).f32407a, null, kzn.d(ro4.m0(Response.BAD_REQUEST, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(Response.BAD_REQUEST, 0, null, 6), 2), null, u1c.M(-1442183707, new xdr() { // from class: a.blm
                                                @Override // a.xdr
                                                public final Object F(Object obj9, Object obj10, Object obj11) {
                                                    byte b7 = b6;
                                                    mm40 mm40Var = jm40Var;
                                                    tlm tlmVar2 = tlmVar;
                                                    switch (b7) {
                                                        case 0:
                                                            fet fetVar5 = (fet) obj10;
                                                            int iIntValue6 = ((Integer) obj11).intValue();
                                                            ((u63) obj9).getClass();
                                                            if (fetVar5.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                qlm qlmVar = (qlm) tlmVar2;
                                                                String str2 = qlmVar.f28941a;
                                                                long j3 = qlmVar.c;
                                                                ha50 ha50Var = ha50.TWO_LINES;
                                                                zcl zclVar6 = qmk.f28987a;
                                                                hlm.i(s5x0.L(mm40Var, 8.0f, 0.0f, 2), str2, j3, 2, fa50.f9191a, fetVar5, 0, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                        default:
                                                            fet fetVar6 = (fet) obj10;
                                                            int iIntValue7 = ((Integer) obj11).intValue();
                                                            ((u63) obj9).getClass();
                                                            if (fetVar6.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                                slm slmVar = (slm) tlmVar2;
                                                                String str3 = slmVar.b;
                                                                long j4 = slmVar.d;
                                                                String str4 = slmVar.c;
                                                                long j5 = slmVar.e;
                                                                zcl zclVar7 = qmk.f28987a;
                                                                hlm.j(s5x0.L(mm40Var, 8.0f, 0.0f, 2), str3, str4, j4, j5, fa50.f9191a, fetVar6, 0);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar4), fetVar4, 196608, 18);
                                            fetVar4.r(false);
                                        } else if (tlmVar instanceof rlm) {
                                            fetVar4.e0(393545693);
                                            rlm rlmVar = (rlm) tlmVar;
                                            String str2 = rlmVar.f30704a;
                                            long j3 = rlmVar.c;
                                            String str3 = rlmVar.b;
                                            long j4 = rlmVar.d;
                                            ga50 ga50Var2 = rlmVar.e;
                                            zcl zclVar6 = qmk.f28987a;
                                            hlm.j(s5x0.L(jm40Var, 8.0f, 0.0f, 2), str2, str3, j3, j4, ga50Var2, fetVar4, 0);
                                            z4 = false;
                                            fetVar4.r(false);
                                        } else if (tlmVar instanceof olm) {
                                            fetVar4.e0(393983816);
                                            olm olmVar = (olm) tlmVar;
                                            String str4 = olmVar.f25462a;
                                            long j5 = olmVar.c;
                                            String str5 = olmVar.b;
                                            long j6 = olmVar.d;
                                            ga50 ga50Var3 = olmVar.e;
                                            zcl zclVar7 = qmk.f28987a;
                                            hlm.h(s5x0.L(jm40Var, 8.0f, 0.0f, 2), str4, str5, j5, j6, ga50Var3, fetVar4, 0);
                                            z4 = false;
                                            fetVar4.r(false);
                                        } else if (tlmVar instanceof nlm) {
                                            fetVar4.e0(394446491);
                                            zcl zclVar8 = qmk.f28987a;
                                            mm40 mm40VarE0 = o2e.e0(s5x0.L(jm40Var, 8.0f, 0.0f, 2), "SEARCH_FIELD");
                                            hmm hmmVar = ((nlm) tlmVar).f23734a;
                                            String str6 = hmmVar.f13315a;
                                            sfh0 sfh0Var = hmmVar.b;
                                            String str7 = hmmVar.c;
                                            boolean z7 = hmmVar.d;
                                            if (function9 == null) {
                                                fetVar4.e0(394885668);
                                                Object objP3 = fetVar4.P();
                                                if (objP3 == obj3) {
                                                    objP3 = new aim(b3);
                                                    fetVar4.o0(objP3);
                                                }
                                                function9 = (Function1) objP3;
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                                fetVar4.e0(-1372735787);
                                            }
                                            fetVar4.r(z2);
                                            Function1 function12 = function9;
                                            if (function10 == null) {
                                                fetVar4.e0(394940228);
                                                Object objP4 = fetVar4.P();
                                                if (objP4 == obj3) {
                                                    objP4 = new aim((byte) 5);
                                                    fetVar4.o0(objP4);
                                                }
                                                function10 = (Function1) objP4;
                                                z3 = false;
                                            } else {
                                                z3 = false;
                                                fetVar4.e0(-1372733872);
                                            }
                                            fetVar4.r(z3);
                                            aac.n(mm40VarE0, z7, str6, sfh0Var, str7, null, function12, function10, function11, fetVar4, 0, 32);
                                            fetVar4.r(z3);
                                            z5 = z3;
                                        }
                                        fetVar4.r(z5);
                                        z = z5;
                                    }
                                }
                                z5 = b;
                                fetVar4.r(z5);
                                z = z5;
                            }
                            z5 = z4;
                            fetVar4.r(z5);
                            z = z5;
                        }
                        throw b1j.f(-1372840582, fetVar4, false);
                    }
                    z = false;
                    fetVar4.e0(-555174290);
                    fetVar4.r(false);
                    fetVar4.r(z);
                }
                return Unit.f46060a;
            case 18:
                cjj0 cjj0Var = (cjj0) obj8;
                Context context = (Context) obj7;
                List list = (List) obj5;
                List list2 = (List) obj4;
                clz clzVar = (clz) obj6;
                e8o0 e8o0Var = (e8o0) obj;
                bjj0 bjj0Var = (bjj0) obj2;
                e8o0Var.getClass();
                bjj0Var.getClass();
                if (bjj0Var instanceof xij0) {
                    acb.I(e8o0Var, cjj0Var);
                } else if (bjj0Var instanceof zij0) {
                    TextView textView = e8o0Var.g;
                    zij0 zij0Var = cjj0Var.f4463a;
                    textView.setText(zij0Var.f44442a.c(context));
                    textView.setBackground(context.getDrawable(zij0Var.b));
                } else if (bjj0Var instanceof yij0) {
                    acb.H(e8o0Var.d, cjj0Var.c, list);
                } else if (bjj0Var instanceof wij0) {
                    TextView textView2 = e8o0Var.f;
                    wij0 wij0Var = cjj0Var.b;
                    textView2.setText(wij0Var.f39216a.c(context));
                    textView2.setBackground(context.getDrawable(wij0Var.b));
                } else if (bjj0Var instanceof vij0) {
                    acb.H(e8o0Var.b, cjj0Var.d, list2);
                } else if (bjj0Var instanceof uij0) {
                    List list3 = u0d.f34849a;
                    u0d.j(e8o0Var.c, cjj0Var.f, 0, 0, null, null, null, 510);
                } else {
                    if (!(bjj0Var instanceof ajj0)) {
                        t9f.b();
                        return null;
                    }
                    acb.J(e8o0Var, g1x.u(clzVar), cjj0Var);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                pzb.s((mm40) obj8, (qdz) obj7, (wbo) obj5, (Function0) obj4, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                qzb.u((mm40) obj8, (qdz) obj7, (zbo) obj5, (Function0) obj4, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                vzb.m((mm40) obj8, (qdz) obj7, (jco) obj5, (Function0) obj4, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                wzb.w((mm40) obj8, (nco) obj5, (qdz) obj7, (Function0) obj4, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                o2e.x((e2d) obj8, (l7m0) obj7, (Function0) obj4, (Function1) obj6, (ugd) obj5, (fet) obj, x8x.L(24577));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                o2e.C(x8x.L(1), (e2d) obj7, (fet) obj, (usv) obj5, (mm40) obj8, (Function0) obj4, (Function1) obj6);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dnr dnrVar = (dnr) obj7;
                mm40 mm40Var = (mm40) obj8;
                xcz xczVar = (xcz) obj5;
                final l7m0 l7m0Var2 = (l7m0) obj6;
                Function0 function13 = (Function0) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ddk ddkVar = dnr.c2;
                if (fetVar5.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    final nek nekVar = dnrVar.Q1;
                    if (nekVar == null) {
                        Intrinsics.h("gameVideoFactory");
                        throw null;
                    }
                    final xak xakVar = dnrVar.R1;
                    if (xakVar == null) {
                        Intrinsics.h("gameZoneFactory");
                        throw null;
                    }
                    boolean zG2 = fetVar5.g(function13) | fetVar5.i(dnrVar);
                    Object objP5 = fetVar5.P();
                    if (zG2 || objP5 == obj3) {
                        objP5 = new f5p(function13, dnrVar, (byte) 23);
                        fetVar5.o0(objP5);
                    }
                    final Function1 function14 = (Function1) objP5;
                    boolean zI = fetVar5.i(dnrVar);
                    Object objP6 = fetVar5.P();
                    if (zI || objP6 == obj3) {
                        objP6 = new zmr(dnrVar, (byte) 1);
                        fetVar5.o0(objP6);
                    }
                    final Function1 function15 = (Function1) objP6;
                    boolean zI2 = fetVar5.i(dnrVar);
                    Object objP7 = fetVar5.P();
                    if (zI2 || objP7 == obj3) {
                        objP7 = new zmr(dnrVar, (byte) 2);
                        fetVar5.o0(objP7);
                    }
                    Function1 function16 = (Function1) objP7;
                    boolean zI3 = fetVar5.i(dnrVar);
                    Object objP8 = fetVar5.P();
                    if (zI3 || objP8 == obj3) {
                        objP8 = new anr(dnrVar, (byte) 0);
                        fetVar5.o0(objP8);
                    }
                    final Function2 function17 = (Function2) objP8;
                    boolean zI4 = fetVar5.i(dnrVar);
                    Object objP9 = fetVar5.P();
                    if (zI4 || objP9 == obj3) {
                        objP9 = new anr(dnrVar, (byte) 1);
                        fetVar5.o0(objP9);
                    }
                    final Function2 function18 = (Function2) objP9;
                    boolean zI5 = fetVar5.i(dnrVar);
                    Object objP10 = fetVar5.P();
                    if (zI5 || objP10 == obj3) {
                        objP10 = new zmr(dnrVar, (byte) 3);
                        fetVar5.o0(objP10);
                    }
                    final Function1 function19 = (Function1) objP10;
                    boolean zI6 = fetVar5.i(dnrVar);
                    Object objP11 = fetVar5.P();
                    if (zI6 || objP11 == obj3) {
                        objP11 = new zmr(dnrVar, (byte) 4);
                        fetVar5.o0(objP11);
                    }
                    final Function1 function20 = (Function1) objP11;
                    l7m0Var2.getClass();
                    function14.getClass();
                    function15.getClass();
                    function16.getClass();
                    function17.getClass();
                    function18.getClass();
                    function19.getClass();
                    function20.getClass();
                    Context context2 = (Context) fetVar5.k(dy2.b);
                    context2.getClass();
                    final boolean z8 = context2.getResources().getBoolean(R.bool.isTablet);
                    Object[] objArr = new Object[0];
                    boolean zG3 = fetVar5.g(l7m0Var2);
                    Object objP12 = fetVar5.P();
                    if (zG3 || objP12 == obj3) {
                        objP12 = new eka(l7m0Var2, (byte) 3);
                        fetVar5.o0(objP12);
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP12, fetVar5);
                    Object objP13 = fetVar5.P();
                    if (objP13 == obj3) {
                        objP13 = new ahd((byte) 29);
                        fetVar5.o0(objP13);
                    }
                    pfk0 pfk0VarP = idx.P(xczVar, (xdr) objP13, fetVar5, 24576, 14);
                    boolean zG4 = fetVar5.g(xczVar) | fetVar5.g(function16);
                    Object objP14 = fetVar5.P();
                    if (zG4 || objP14 == obj3) {
                        objP14 = new aj6(xczVar, function16, null, (byte) 1);
                        fetVar5.o0(objP14);
                    }
                    m0x0.t(fetVar5, xczVar, (Function2) objP14);
                    dja djaVar = ((unr) l7m0Var2.getValue()).h;
                    Integer numValueOf = Integer.valueOf(((unr) l7m0Var2.getValue()).e.size());
                    boolean zG5 = fetVar5.g(l7m0Var2) | fetVar5.g(xczVar);
                    Object objP15 = fetVar5.P();
                    if (zG5 || objP15 == obj3) {
                        objP15 = new qua(l7m0Var2, xczVar, (yje) null);
                        fetVar5.o0(objP15);
                    }
                    m0x0.v(djaVar, numValueOf, (Function2) objP15, fetVar5);
                    Object objP16 = fetVar5.P();
                    if (objP16 == obj3) {
                        objP16 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar5.o0(objP16);
                    }
                    pz40 pz40Var2 = (pz40) objP16;
                    a4x a4xVar2 = ((unr) l7m0Var2.getValue()).e;
                    boolean zG6 = fetVar5.g(l7m0Var2) | fetVar5.g(xczVar);
                    Object objP17 = fetVar5.P();
                    if (zG6 || objP17 == obj3) {
                        objP17 = new rua(pz40Var2, l7m0Var2, xczVar, null);
                        fetVar5.o0(objP17);
                    }
                    m0x0.t(fetVar5, a4xVar2, (Function2) objP17);
                    boolean zBooleanValue = ((Boolean) l7m0VarY.getValue()).booleanValue();
                    boolean zG7 = fetVar5.g(l7m0Var2) | fetVar5.g(function18) | fetVar5.h(z8) | fetVar5.i(nekVar) | fetVar5.g(function15) | fetVar5.i(xakVar) | fetVar5.g(function17) | fetVar5.g(function14) | fetVar5.g(function20) | fetVar5.g(function19);
                    Object objP18 = fetVar5.P();
                    if (zG7 || objP18 == obj3) {
                        objP18 = new Function1() { // from class: a.oua
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                hcz hczVar = (hcz) obj9;
                                hczVar.getClass();
                                a4x a4xVar3 = ((unr) l7m0Var2.getValue()).e;
                                hczVar.f(a4xVar3.size(), new at7(new pua((byte) 0), a4xVar3, (byte) 13), new wl0(a4xVar3, (byte) 12), new ugd(2039820996, true, new sua(a4xVar3, function18, z8, nekVar, function15, xakVar, function17, function14, function20, function19)));
                                return Unit.f46060a;
                            }
                        };
                        fetVar5.o0(objP18);
                    }
                    b8k0.f(mm40Var, xczVar, null, false, null, null, pfk0VarP, zBooleanValue, null, (Function1) objP18, fetVar5, 0, 316);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                zss.c((mm40) obj8, (gts) obj7, (bts) obj5, (sek) obj4, (bek) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lav lavVar = (lav) obj8;
                pz40 pz40Var3 = (pz40) obj7;
                pz40 pz40Var4 = (pz40) obj5;
                k6z k6zVar = (k6z) obj4;
                pz40 pz40Var5 = (pz40) obj6;
                fet fetVar6 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mm40 mm40VarE1 = o2e.e0(o7k0.d(jm40Var, 1.0f), "GOLD_RUSH_STATISTIC_BOX");
                    long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                    zcl zclVar9 = qmk.j;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarE = i120.Q(mm40VarE1, jM73getBlack400d7_KjU, new ugg0(zclVar9, zclVar9, zclVar9, zclVar9)).e((mm40) fetVar6.k(t0h.f33118a));
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar6, 0);
                    int iHashCode2 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM2 = fetVar6.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarE);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                    fbc.D(lavVar.b, lavVar.f19725a, fetVar6, 0);
                    gav gavVar = lavVar.c;
                    gav gavVar2 = lavVar.d;
                    v9v v9vVar = lavVar.e;
                    float f = lavVar.k;
                    Object objP19 = fetVar6.P();
                    if (objP19 == obj3) {
                        objP19 = new rip(pz40Var5, (byte) 3);
                        fetVar6.o0(objP19);
                    }
                    obc.G(gavVar, gavVar2, pz40Var3, pz40Var4, v9vVar, f, k6zVar, (Function0) objP19, fetVar6, 12586368);
                    th90 th90Var = lavVar.f;
                    x9v x9vVar = lavVar.g;
                    x9v x9vVar2 = lavVar.h;
                    w9v w9vVar = lavVar.i;
                    String str8 = lavVar.j;
                    float f2 = lavVar.k;
                    Object objP20 = fetVar6.P();
                    if (objP20 == obj3) {
                        objP20 = new hpr(pz40Var3, pz40Var4, pz40Var5, b4);
                        fetVar6.o0(objP20);
                    }
                    ibc.x(th90Var, x9vVar, x9vVar2, w9vVar, str8, f2, pz40Var5, (Function2) objP20, fetVar6, 14155776);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                wwb.q((mm40) obj8, (crv) obj5, (qdz) obj7, (Function0) obj4, (Function2) obj6, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ahb.q((mm40) obj8, (pk5) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ cqk(uhm uhmVar, Function1 function1, Function0 function0, Function0 function2, l7m0 l7m0Var) {
        this.f4797a = (byte) 14;
        this.b = uhmVar;
        this.e = function1;
        this.d = function0;
        this.c = function2;
        this.f = l7m0Var;
    }

    public /* synthetic */ cqk(e8n e8nVar, Function0 function0, Function0 function1, Function1 function2, Function1 function3) {
        this.f4797a = (byte) 13;
        this.b = e8nVar;
        this.d = function0;
        this.c = function1;
        this.e = function2;
        this.f = function3;
    }

    public /* synthetic */ cqk(dnr dnrVar, mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, Function0 function0) {
        this.f4797a = (byte) 25;
        this.c = dnrVar;
        this.b = mm40Var;
        this.f = xczVar;
        this.e = l7m0Var;
        this.d = function0;
    }

    public /* synthetic */ cqk(a4x a4xVar, pz40 pz40Var, rah0 rah0Var, Function1 function1, vne vneVar) {
        this.f4797a = (byte) 16;
        this.b = a4xVar;
        this.c = pz40Var;
        this.f = rah0Var;
        this.e = function1;
        this.d = vneVar;
    }

    public /* synthetic */ cqk(mm40 mm40Var, urk urkVar, qdz qdzVar, Function1 function1, Function0 function0, int i) {
        this.f4797a = (byte) 4;
        this.b = mm40Var;
        this.f = urkVar;
        this.c = qdzVar;
        this.e = function1;
        this.d = function0;
    }

    public /* synthetic */ cqk(mm40 mm40Var, uhm uhmVar, Function1 function1, Function0 function0, Function0 function2, int i) {
        this.f4797a = (byte) 15;
        this.b = mm40Var;
        this.c = uhmVar;
        this.e = function1;
        this.d = function0;
        this.f = function2;
    }

    public /* synthetic */ cqk(mm40 mm40Var, p6t0 p6t0Var, qdz qdzVar, Function0 function0, wdr wdrVar, int i, byte b) {
        this.f4797a = b;
        this.b = mm40Var;
        this.f = p6t0Var;
        this.c = qdzVar;
        this.d = function0;
        this.e = wdrVar;
    }

    public /* synthetic */ cqk(mm40 mm40Var, Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.f4797a = b;
        this.b = mm40Var;
        this.c = obj;
        this.f = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ cqk(mm40 mm40Var, Object obj, Object obj2, Object obj3, Function0 function0, int i, byte b) {
        this.f4797a = b;
        this.b = mm40Var;
        this.c = obj;
        this.f = obj2;
        this.e = obj3;
        this.d = function0;
    }

    public /* synthetic */ cqk(mm40 mm40Var, Object obj, Function0 function0, Function0 function1, Function0 function2, int i, byte b) {
        this.f4797a = b;
        this.b = mm40Var;
        this.c = obj;
        this.d = function0;
        this.f = function1;
        this.e = function2;
    }

    public /* synthetic */ cqk(mm40 mm40Var, Object obj, Function1 function1, Function1 function2, Function1 function3, int i, byte b) {
        this.f4797a = b;
        this.b = mm40Var;
        this.c = obj;
        this.e = function1;
        this.f = function2;
        this.d = function3;
    }

    public /* synthetic */ cqk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f4797a = b;
        this.b = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public /* synthetic */ cqk(Function2 function2, imm immVar, Function1 function1, Function1 function3, Function0 function0) {
        this.f4797a = (byte) 17;
        this.b = function2;
        this.c = immVar;
        this.e = function1;
        this.f = function3;
        this.d = function0;
    }
}
