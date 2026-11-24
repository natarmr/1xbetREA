package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zsb;", "La/iw5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zsb extends iw5 {
    public fiu0 l2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(zsb.class, "key", "getKey()Ljava/lang/String;", 0)};
    public static final yk5 n2 = new yk5();
    public final phf0 k2 = new phf0("KEY_NAME");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(etb.class), new xsb(this, (byte) 2));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(-513974752);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        final byte b = 0;
        if (zI || objP == obj) {
            objP = new wsb(this, b);
            fetVar.o0(objP);
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object pcVar = new pc(k3t0VarP0, clzVar, pz40VarF, null, (byte) 8);
            fetVar.o0(pcVar);
            objP2 = pcVar;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        final ctb ctbVar = (ctb) ((i3t0) P0()).y(fetVar).getValue();
        final byte b2 = 1;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, u1c.M(-1948715249, new sd8(ctbVar, (byte) 11), fetVar), u1c.M(-296902441, new xdr() { // from class: a.ysb
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                boolean z;
                cl5 cl5Var;
                byte b3 = b;
                cl5 cl5Var2 = ukd.f35823a;
                pcy pcyVar = e7z.u1;
                zsb zsbVar = this;
                ctb ctbVar2 = ctbVar;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        yk5 yk5Var = zsb.n2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            jm40 jm40Var = jm40.b;
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarD2, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            wul wulVar = ctbVar2.e;
                            boolean zI3 = fetVar2.i(zsbVar);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var2) {
                                objP3 = new xsb(zsbVar, (byte) 5);
                                fetVar2.o0(objP3);
                            }
                            qzb.n(mm40VarN, wulVar, (Function0) objP3, fetVar2, 0, 0);
                            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            wul wulVar2 = ctbVar2.f;
                            boolean zI4 = fetVar2.i(zsbVar);
                            Object objP4 = fetVar2.P();
                            if (zI4 || objP4 == cl5Var2) {
                                objP4 = new xsb(zsbVar, (byte) 0);
                                fetVar2.o0(objP4);
                            }
                            qzb.n(mm40VarN2, wulVar2, (Function0) objP4, fetVar2, 0, 0);
                            mm40 mm40VarN3 = s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            wul wulVar3 = ctbVar2.g;
                            boolean zI5 = fetVar2.i(zsbVar);
                            Object objP5 = fetVar2.P();
                            if (zI5 || objP5 == cl5Var2) {
                                z = true;
                                objP5 = new xsb(zsbVar, (byte) 1);
                                fetVar2.o0(objP5);
                            } else {
                                z = true;
                            }
                            qzb.n(mm40VarN3, wulVar3, (Function0) objP5, fetVar2, 0, 0);
                            fetVar2.r(z);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        shd shdVar = gqw0.v;
                        shd shdVar2 = gqw0.y;
                        shd shdVar3 = gqw0.w;
                        shd shdVar4 = gqw0.x;
                        y5d y5dVar = (y5d) obj2;
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        yk5 yk5Var2 = zsb.n2;
                        lw3 lw3Var = uc9.f35418a;
                        y5dVar.getClass();
                        boolean z2 = true;
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= fetVar3.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            jm40 jm40Var2 = jm40.b;
                            mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN4 = s5x0.N(mm40VarD3, 16.0f, 8.0f, 16.0f, 0.0f, 8);
                            hjm hjmVar = ctbVar2.h;
                            Boolean bool = ctbVar2.o;
                            List list = ctbVar2.p;
                            kjm kjmVar = kjm.b;
                            cl5 cl5Var3 = cl5Var2;
                            nkb.h(mm40VarN4, hjmVar, kjmVar, null, null, null, fetVar3, 384, 56);
                            nkb.h(s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), ctbVar2.i, kjmVar, null, null, null, fetVar3, 384, 56);
                            fet fetVar4 = fetVar3;
                            if (ctbVar2.j) {
                                fetVar4.e0(-1772856105);
                                nkb.h(s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), ctbVar2.k, kjmVar, null, null, null, fetVar4, 384, 56);
                                fetVar4 = fetVar4;
                                fetVar4.r(false);
                            } else {
                                fetVar4.e0(-1772369839);
                                fetVar4.r(false);
                            }
                            if (ctbVar2.d) {
                                fetVar4.e0(-1772290913);
                                fet fetVar5 = fetVar4;
                                nkb.h(s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), ctbVar2.l, kjmVar, null, null, null, fetVar5, 384, 56);
                                nkb.h(s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), ctbVar2.m, kjmVar, null, null, null, fetVar5, 384, 56);
                                fetVar4 = fetVar5;
                                fetVar4.r(false);
                            } else {
                                fetVar4.e0(-1771320303);
                                fetVar4.r(false);
                            }
                            if (list != null && !list.isEmpty()) {
                                fetVar4.e0(-1771205324);
                                rah0 rah0VarT = wha0.T(fetVar4);
                                mm40 mm40VarA0 = wha0.a0(cjx.V(s5x0.L(y5dVar.b(o7k0.d(jm40Var2, 1.0f), false), 16.0f, 0.0f, 2), a8k0.G(rah0VarT, fetVar4), null), rah0VarT, false, 14);
                                x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                                int iHashCode2 = Long.hashCode(fetVar4.T);
                                bh90 bh90VarM2 = fetVar4.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarA0);
                                mkd.c0.getClass();
                                fetVar4.i0();
                                if (fetVar4.S) {
                                    fetVar4.l(pcyVar);
                                } else {
                                    fetVar4.r0();
                                }
                                jpm0.o(fetVar4, x5dVarA2, shdVar4);
                                jpm0.o(fetVar4, bh90VarM2, shdVar3);
                                vqd.u(iHashCode2, fetVar4, shdVar2, fetVar4);
                                Iterator itV = kng0.v(fetVar4, mm40VarC1, shdVar, -237920019, list);
                                while (itV.hasNext()) {
                                    fnb0 fnb0Var = (fnb0) itV.next();
                                    mm40 mm40VarD4 = o7k0.d(jm40Var2, 1.0f);
                                    zcl zclVar3 = qmk.f28987a;
                                    mm40 mm40VarL = s5x0.L(mm40VarD4, 0.0f, 8.0f, z2 ? 1 : 0);
                                    thg0 thg0VarA = shg0.a(lw3Var, gqw0.k, fetVar4, 48);
                                    int iHashCode3 = Long.hashCode(fetVar4.T);
                                    bh90 bh90VarM3 = fetVar4.m();
                                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarL);
                                    mkd.c0.getClass();
                                    fetVar4.i0();
                                    if (fetVar4.S) {
                                        fetVar4.l(pcyVar);
                                    } else {
                                        fetVar4.r0();
                                    }
                                    jpm0.o(fetVar4, thg0VarA, shdVar4);
                                    jpm0.o(fetVar4, bh90VarM3, shdVar3);
                                    vqd.u(iHashCode3, fetVar4, shdVar2, fetVar4);
                                    jpm0.o(fetVar4, mm40VarC2, shdVar);
                                    boolean z3 = fnb0Var.c;
                                    boolean zI6 = fetVar4.i(zsbVar) | fetVar4.i(fnb0Var);
                                    Object objP6 = fetVar4.P();
                                    if (zI6) {
                                        cl5Var = cl5Var3;
                                    } else {
                                        cl5Var = cl5Var3;
                                        if (objP6 == cl5Var) {
                                        }
                                        fet fetVar6 = fetVar4;
                                        yom.b(null, z3, false, (Function0) objP6, fetVar6, 0, 13);
                                        mm40 mm40VarN5 = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                                        String str = fnb0Var.b;
                                        long textPrimary = ((ThemeColors) fetVar6.k(zaq0.b)).getTextPrimary();
                                        ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                        v8q0.a(str, mm40VarN5, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.x(), fetVar6, 0, 0, 131064);
                                        fetVar4 = fetVar6;
                                        fetVar4.r(true);
                                        cl5Var3 = cl5Var;
                                        z2 = true;
                                    }
                                    objP6 = new yw9(zsbVar, fnb0Var, (byte) 10);
                                    fetVar4.o0(objP6);
                                    fet fetVar7 = fetVar4;
                                    yom.b(null, z3, false, (Function0) objP6, fetVar7, 0, 13);
                                    mm40 mm40VarN6 = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                                    String str2 = fnb0Var.b;
                                    long textPrimary2 = ((ThemeColors) fetVar7.k(zaq0.b)).getTextPrimary();
                                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                    v8q0.a(str2, mm40VarN6, textPrimary2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.x(), fetVar7, 0, 0, 131064);
                                    fetVar4 = fetVar7;
                                    fetVar4.r(true);
                                    cl5Var3 = cl5Var;
                                    z2 = true;
                                }
                                ohs0.x(fetVar4, false, z2, false);
                            } else if (ctbVar2.f4928a == ipb.b) {
                                fetVar4.e0(-1769387639);
                                mm40 mm40VarD5 = o7k0.d(jm40Var2, 1.0f);
                                thg0 thg0VarA2 = shg0.a(lw3Var, gqw0.j, fetVar4, 0);
                                int iHashCode4 = Long.hashCode(fetVar4.T);
                                bh90 bh90VarM4 = fetVar4.m();
                                mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarD5);
                                mkd.c0.getClass();
                                fetVar4.i0();
                                if (fetVar4.S) {
                                    fetVar4.l(pcyVar);
                                } else {
                                    fetVar4.r0();
                                }
                                jpm0.o(fetVar4, thg0VarA2, shdVar4);
                                jpm0.o(fetVar4, bh90VarM4, shdVar3);
                                vqd.u(iHashCode4, fetVar4, shdVar2, fetVar4);
                                jpm0.o(fetVar4, mm40VarC3, shdVar);
                                mm40 mm40VarL2 = s5x0.L(jm40Var2, 16.0f, 0.0f, 2);
                                zfn zfnVar = zaq0.b;
                                long textPrimary3 = ((ThemeColors) fetVar4.k(zfnVar)).getTextPrimary();
                                zfn zfnVar2 = j1t0.e;
                                ((g1t0) fetVar4.k(zfnVar2)).getClass();
                                fet fetVar8 = fetVar4;
                                v8q0.a("true", mm40VarL2, textPrimary3, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.q(), fetVar8, 6, 24576, 113656);
                                mm40 mm40VarN7 = s5x0.N(jm40Var2, 0.0f, 0.0f, 32.0f, 0.0f, 11);
                                boolean zD = Intrinsics.d(bool, Boolean.TRUE);
                                boolean zI7 = fetVar8.i(zsbVar);
                                Object objP7 = fetVar8.P();
                                if (zI7 || objP7 == cl5Var3) {
                                    objP7 = new xsb(zsbVar, (byte) 3);
                                    fetVar8.o0(objP7);
                                }
                                yom.b(mm40VarN7, zD, false, (Function0) objP7, fetVar8, 0, 12);
                                mm40 mm40VarL3 = s5x0.L(jm40Var2, 16.0f, 0.0f, 2);
                                long textPrimary4 = ((ThemeColors) fetVar8.k(zfnVar)).getTextPrimary();
                                ((g1t0) fetVar8.k(zfnVar2)).getClass();
                                v8q0.a("false", mm40VarL3, textPrimary4, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.q(), fetVar8, 6, 24576, 113656);
                                boolean zD2 = Intrinsics.d(bool, Boolean.FALSE);
                                boolean zI8 = fetVar8.i(zsbVar);
                                Object objP8 = fetVar8.P();
                                if (zI8 || objP8 == cl5Var3) {
                                    objP8 = new xsb(zsbVar, (byte) 4);
                                    fetVar8.o0(objP8);
                                }
                                yom.b(null, zD2, false, (Function0) objP8, fetVar8, 0, 13);
                                fetVar8.r(true);
                                fetVar8.r(false);
                            } else {
                                fetVar4.e0(-1767840553);
                                mm40 mm40VarN8 = s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8);
                                c6q0 c6q0Var = ctbVar2.n;
                                boolean zI9 = fetVar4.i(zsbVar);
                                Object objP9 = fetVar4.P();
                                if (zI9 || objP9 == cl5Var3) {
                                    objP9 = new wsb(zsbVar, (byte) 1);
                                    fetVar4.o0(objP9);
                                }
                                fet fetVar9 = fetVar4;
                                wvb.t(mm40VarN8, c6q0Var, 0, null, (Function1) objP9, fetVar9, 0, 12);
                                fetVar9.r(false);
                            }
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), u1c.M(1682259729, new xdr() { // from class: a.ysb
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                boolean z;
                cl5 cl5Var;
                byte b3 = b2;
                cl5 cl5Var2 = ukd.f35823a;
                pcy pcyVar = e7z.u1;
                zsb zsbVar = this;
                ctb ctbVar2 = ctbVar;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        yk5 yk5Var = zsb.n2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            jm40 jm40Var = jm40.b;
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarD2, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            wul wulVar = ctbVar2.e;
                            boolean zI3 = fetVar2.i(zsbVar);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var2) {
                                objP3 = new xsb(zsbVar, (byte) 5);
                                fetVar2.o0(objP3);
                            }
                            qzb.n(mm40VarN, wulVar, (Function0) objP3, fetVar2, 0, 0);
                            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            wul wulVar2 = ctbVar2.f;
                            boolean zI4 = fetVar2.i(zsbVar);
                            Object objP4 = fetVar2.P();
                            if (zI4 || objP4 == cl5Var2) {
                                objP4 = new xsb(zsbVar, (byte) 0);
                                fetVar2.o0(objP4);
                            }
                            qzb.n(mm40VarN2, wulVar2, (Function0) objP4, fetVar2, 0, 0);
                            mm40 mm40VarN3 = s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            wul wulVar3 = ctbVar2.g;
                            boolean zI5 = fetVar2.i(zsbVar);
                            Object objP5 = fetVar2.P();
                            if (zI5 || objP5 == cl5Var2) {
                                z = true;
                                objP5 = new xsb(zsbVar, (byte) 1);
                                fetVar2.o0(objP5);
                            } else {
                                z = true;
                            }
                            qzb.n(mm40VarN3, wulVar3, (Function0) objP5, fetVar2, 0, 0);
                            fetVar2.r(z);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        shd shdVar = gqw0.v;
                        shd shdVar2 = gqw0.y;
                        shd shdVar3 = gqw0.w;
                        shd shdVar4 = gqw0.x;
                        y5d y5dVar = (y5d) obj2;
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        yk5 yk5Var2 = zsb.n2;
                        lw3 lw3Var = uc9.f35418a;
                        y5dVar.getClass();
                        boolean z2 = true;
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= fetVar3.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            jm40 jm40Var2 = jm40.b;
                            mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN4 = s5x0.N(mm40VarD3, 16.0f, 8.0f, 16.0f, 0.0f, 8);
                            hjm hjmVar = ctbVar2.h;
                            Boolean bool = ctbVar2.o;
                            List list = ctbVar2.p;
                            kjm kjmVar = kjm.b;
                            cl5 cl5Var3 = cl5Var2;
                            nkb.h(mm40VarN4, hjmVar, kjmVar, null, null, null, fetVar3, 384, 56);
                            nkb.h(s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), ctbVar2.i, kjmVar, null, null, null, fetVar3, 384, 56);
                            fet fetVar4 = fetVar3;
                            if (ctbVar2.j) {
                                fetVar4.e0(-1772856105);
                                nkb.h(s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), ctbVar2.k, kjmVar, null, null, null, fetVar4, 384, 56);
                                fetVar4 = fetVar4;
                                fetVar4.r(false);
                            } else {
                                fetVar4.e0(-1772369839);
                                fetVar4.r(false);
                            }
                            if (ctbVar2.d) {
                                fetVar4.e0(-1772290913);
                                fet fetVar5 = fetVar4;
                                nkb.h(s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), ctbVar2.l, kjmVar, null, null, null, fetVar5, 384, 56);
                                nkb.h(s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), ctbVar2.m, kjmVar, null, null, null, fetVar5, 384, 56);
                                fetVar4 = fetVar5;
                                fetVar4.r(false);
                            } else {
                                fetVar4.e0(-1771320303);
                                fetVar4.r(false);
                            }
                            if (list != null && !list.isEmpty()) {
                                fetVar4.e0(-1771205324);
                                rah0 rah0VarT = wha0.T(fetVar4);
                                mm40 mm40VarA0 = wha0.a0(cjx.V(s5x0.L(y5dVar.b(o7k0.d(jm40Var2, 1.0f), false), 16.0f, 0.0f, 2), a8k0.G(rah0VarT, fetVar4), null), rah0VarT, false, 14);
                                x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                                int iHashCode2 = Long.hashCode(fetVar4.T);
                                bh90 bh90VarM2 = fetVar4.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarA0);
                                mkd.c0.getClass();
                                fetVar4.i0();
                                if (fetVar4.S) {
                                    fetVar4.l(pcyVar);
                                } else {
                                    fetVar4.r0();
                                }
                                jpm0.o(fetVar4, x5dVarA2, shdVar4);
                                jpm0.o(fetVar4, bh90VarM2, shdVar3);
                                vqd.u(iHashCode2, fetVar4, shdVar2, fetVar4);
                                Iterator itV = kng0.v(fetVar4, mm40VarC1, shdVar, -237920019, list);
                                while (itV.hasNext()) {
                                    fnb0 fnb0Var = (fnb0) itV.next();
                                    mm40 mm40VarD4 = o7k0.d(jm40Var2, 1.0f);
                                    zcl zclVar3 = qmk.f28987a;
                                    mm40 mm40VarL = s5x0.L(mm40VarD4, 0.0f, 8.0f, z2 ? 1 : 0);
                                    thg0 thg0VarA = shg0.a(lw3Var, gqw0.k, fetVar4, 48);
                                    int iHashCode3 = Long.hashCode(fetVar4.T);
                                    bh90 bh90VarM3 = fetVar4.m();
                                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarL);
                                    mkd.c0.getClass();
                                    fetVar4.i0();
                                    if (fetVar4.S) {
                                        fetVar4.l(pcyVar);
                                    } else {
                                        fetVar4.r0();
                                    }
                                    jpm0.o(fetVar4, thg0VarA, shdVar4);
                                    jpm0.o(fetVar4, bh90VarM3, shdVar3);
                                    vqd.u(iHashCode3, fetVar4, shdVar2, fetVar4);
                                    jpm0.o(fetVar4, mm40VarC2, shdVar);
                                    boolean z3 = fnb0Var.c;
                                    boolean zI6 = fetVar4.i(zsbVar) | fetVar4.i(fnb0Var);
                                    Object objP6 = fetVar4.P();
                                    if (zI6) {
                                        cl5Var = cl5Var3;
                                    } else {
                                        cl5Var = cl5Var3;
                                        if (objP6 == cl5Var) {
                                        }
                                        fet fetVar7 = fetVar4;
                                        yom.b(null, z3, false, (Function0) objP6, fetVar7, 0, 13);
                                        mm40 mm40VarN6 = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                                        String str2 = fnb0Var.b;
                                        long textPrimary2 = ((ThemeColors) fetVar7.k(zaq0.b)).getTextPrimary();
                                        ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                        v8q0.a(str2, mm40VarN6, textPrimary2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.x(), fetVar7, 0, 0, 131064);
                                        fetVar4 = fetVar7;
                                        fetVar4.r(true);
                                        cl5Var3 = cl5Var;
                                        z2 = true;
                                    }
                                    objP6 = new yw9(zsbVar, fnb0Var, (byte) 10);
                                    fetVar4.o0(objP6);
                                    fet fetVar8 = fetVar4;
                                    yom.b(null, z3, false, (Function0) objP6, fetVar8, 0, 13);
                                    mm40 mm40VarN7 = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                                    String str3 = fnb0Var.b;
                                    long textPrimary3 = ((ThemeColors) fetVar8.k(zaq0.b)).getTextPrimary();
                                    ((g1t0) fetVar8.k(j1t0.e)).getClass();
                                    v8q0.a(str3, mm40VarN7, textPrimary3, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.x(), fetVar8, 0, 0, 131064);
                                    fetVar4 = fetVar8;
                                    fetVar4.r(true);
                                    cl5Var3 = cl5Var;
                                    z2 = true;
                                }
                                ohs0.x(fetVar4, false, z2, false);
                            } else if (ctbVar2.f4928a == ipb.b) {
                                fetVar4.e0(-1769387639);
                                mm40 mm40VarD5 = o7k0.d(jm40Var2, 1.0f);
                                thg0 thg0VarA2 = shg0.a(lw3Var, gqw0.j, fetVar4, 0);
                                int iHashCode4 = Long.hashCode(fetVar4.T);
                                bh90 bh90VarM4 = fetVar4.m();
                                mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarD5);
                                mkd.c0.getClass();
                                fetVar4.i0();
                                if (fetVar4.S) {
                                    fetVar4.l(pcyVar);
                                } else {
                                    fetVar4.r0();
                                }
                                jpm0.o(fetVar4, thg0VarA2, shdVar4);
                                jpm0.o(fetVar4, bh90VarM4, shdVar3);
                                vqd.u(iHashCode4, fetVar4, shdVar2, fetVar4);
                                jpm0.o(fetVar4, mm40VarC3, shdVar);
                                mm40 mm40VarL2 = s5x0.L(jm40Var2, 16.0f, 0.0f, 2);
                                zfn zfnVar = zaq0.b;
                                long textPrimary4 = ((ThemeColors) fetVar4.k(zfnVar)).getTextPrimary();
                                zfn zfnVar2 = j1t0.e;
                                ((g1t0) fetVar4.k(zfnVar2)).getClass();
                                fet fetVar9 = fetVar4;
                                v8q0.a("true", mm40VarL2, textPrimary4, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.q(), fetVar9, 6, 24576, 113656);
                                mm40 mm40VarN8 = s5x0.N(jm40Var2, 0.0f, 0.0f, 32.0f, 0.0f, 11);
                                boolean zD = Intrinsics.d(bool, Boolean.TRUE);
                                boolean zI7 = fetVar9.i(zsbVar);
                                Object objP7 = fetVar9.P();
                                if (zI7 || objP7 == cl5Var3) {
                                    objP7 = new xsb(zsbVar, (byte) 3);
                                    fetVar9.o0(objP7);
                                }
                                yom.b(mm40VarN8, zD, false, (Function0) objP7, fetVar9, 0, 12);
                                mm40 mm40VarL3 = s5x0.L(jm40Var2, 16.0f, 0.0f, 2);
                                long textPrimary5 = ((ThemeColors) fetVar9.k(zfnVar)).getTextPrimary();
                                ((g1t0) fetVar9.k(zfnVar2)).getClass();
                                v8q0.a("false", mm40VarL3, textPrimary5, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.q(), fetVar9, 6, 24576, 113656);
                                boolean zD2 = Intrinsics.d(bool, Boolean.FALSE);
                                boolean zI8 = fetVar9.i(zsbVar);
                                Object objP8 = fetVar9.P();
                                if (zI8 || objP8 == cl5Var3) {
                                    objP8 = new xsb(zsbVar, (byte) 4);
                                    fetVar9.o0(objP8);
                                }
                                yom.b(null, zD2, false, (Function0) objP8, fetVar9, 0, 13);
                                fetVar9.r(true);
                                fetVar9.r(false);
                            } else {
                                fetVar4.e0(-1767840553);
                                mm40 mm40VarN9 = s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8);
                                c6q0 c6q0Var = ctbVar2.n;
                                boolean zI9 = fetVar4.i(zsbVar);
                                Object objP9 = fetVar4.P();
                                if (zI9 || objP9 == cl5Var3) {
                                    objP9 = new wsb(zsbVar, (byte) 1);
                                    fetVar4.o0(objP9);
                                }
                                fet fetVar10 = fetVar4;
                                wvb.t(mm40VarN9, c6q0Var, 0, null, (Function1) objP9, fetVar10, 0, 12);
                                fetVar10.r(false);
                            }
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar));
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.m2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(osb.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            osb osbVar = (osb) (ze3Var instanceof osb ? ze3Var : null);
            if (osbVar != null) {
                String strN = this.k2.n(this, o2[0]);
                strN.getClass();
                cad cadVar = osbVar.f25775a;
                ctf0 ctf0Var = osbVar.b;
                iw20 iw20Var = osbVar.c;
                vby vbyVar = osbVar.d;
                ctf0Var.getClass();
                vbyVar.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = cadVar;
                esg0Var.b = ctf0Var;
                esg0Var.c = iw20Var;
                esg0Var.d = strN;
                esg0Var.e = vbyVar;
                esg0Var.f = new pai(esg0Var, (byte) 17);
                this.l2 = new fiu0(Collections.singletonMap(etb.class, (pai) esg0Var.f));
                return;
            }
        }
        jf4.n(b1j.i(osb.class, "Cannot create dependency "));
    }
}
