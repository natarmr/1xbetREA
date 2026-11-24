package a;

import android.gov.nist.core.Separators;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zss {
    public static final void a(final mm40 mm40Var, final long j, final long j2, final boolean z, final Function0 function0, fet fetVar, final int i) {
        cfu0 cfu0Var;
        Object next;
        String str;
        boolean z2;
        pm80 pm80Var;
        boolean z3;
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.e;
        fetVar2.g0(-1137882063);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.f(j) ? 32 : 16) | (fetVar2.f(j2) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z4 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            String string = "";
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                if (j == 189) {
                    List list = arg.f1345a;
                    cfu0Var = new cfu0("static/img/ImgDefault/UFC/videoImg.png", false);
                } else {
                    Iterator it = arg.f1345a.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((Number) ((Pair) next).f46059a).longValue() != j2);
                    Pair pair = (Pair) next;
                    if (pair == null || (str = (String) pair.b) == null) {
                        str = "";
                    }
                    cfu0Var = new cfu0(str, true);
                }
                objP = cfu0Var;
                fetVar2.o0(objP);
            }
            cfu0 cfu0Var2 = (cfu0) objP;
            String str2 = cfu0Var2.f4281a;
            boolean zG = fetVar2.g(str2);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                if (str2.length() != 0) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    if (str2.length() == 0) {
                        sb.setLength(0);
                    } else {
                        int i3 = 0;
                        if (StringsKt.O(str2, ujn.h, false)) {
                            sb.setLength(i3);
                            sb.append(str2);
                        } else if (kotlin.text.c.x(str2, "https://", false)) {
                            i3 = 0;
                            sb.setLength(i3);
                            sb.append(str2);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str2, '/'));
                        }
                    }
                    string = sb.toString();
                }
                fetVar2.o0(string);
                objP2 = string;
            }
            String str3 = (String) objP2;
            if (cfu0Var2.b) {
                fetVar2.e0(1532861666);
                z2 = false;
                pm80 pm80VarF = a8k0.F(R.drawable.default_video_placeholder, 0, fetVar2);
                fetVar2.r(false);
                pm80Var = pm80VarF;
            } else {
                z2 = false;
                fetVar2.e0(1532944157);
                fetVar2.r(false);
                pm80Var = null;
            }
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z2);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z5 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
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
            k7x.b(str3.length() > 0 ? str3 : null, null, o2e.e0(o7k0.c, "CYBER_STREAM_PLACEHOLDER"), pm80Var, pm80Var, pm80Var, null, null, null, null, gqw0.A, null, fetVar, 299440, 6, 31680);
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-354729650);
                v8q0.a(rsm0.w(R.string.cybergame_video_not_available, 0, fetVar), jr8Var.b(jm40Var, zx7Var), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 130040);
                fetVar2 = fetVar;
                fetVar2.r(false);
                z3 = true;
            } else {
                fetVar.e0(-354389208);
                mm40 mm40VarF = phu0.F(jr8Var.b(jm40Var, zx7Var), null, null, false, null, function0, fetVar, (i2 << 3) & 458752, 15);
                x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar, 54);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarF);
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
                j0x.b(a8k0.F(R.drawable.cybergame_play_video_ic, 0, fetVar), null, null, null, null, 0.0f, null, fetVar, 56, 124);
                zcl zclVar = qmk.f28987a;
                v8q0.a(rsm0.w(R.string.cybergame_video_pause, 0, fetVar), s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 130040);
                fetVar2 = fetVar;
                z3 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z3);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(j, j2, z, function0, i) { // from class: a.vss
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    zss.a(this.f37967a, this.b, this.c, this.d, this.e, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(final mm40 mm40Var, final l7m0 l7m0Var, final sek sekVar, final bek bekVar, final long j, final long j2, final boolean z, Function1 function1, fet fetVar, final int i) {
        fet fetVar2;
        Iterable iterableA;
        boolean z2;
        boolean z3;
        i4 i4VarG0;
        boolean z4;
        hxh0 exh0Var;
        e7m e7mVar;
        final Function1 function2 = function1;
        l7m0Var.getClass();
        sekVar.getClass();
        bekVar.getClass();
        function2.getClass();
        fetVar.g0(-924629378);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(sekVar) ? 256 : 128) | (fetVar.g(bekVar) ? 2048 : 1024) | (fetVar.f(j) ? 16384 : 8192) | (fetVar.f(j2) ? 131072 : 65536) | (fetVar.h(z) ? 1048576 : 524288) | (fetVar.i(function2) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (i2 & 4793491) != 4793490)) {
            boolean zD = pkd.d(fetVar);
            pbz pbzVar = (pbz) fetVar.k(hu90.f13669a);
            boolean zG = fetVar.g(pbzVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new r39(pbzVar, (byte) 1);
                fetVar.o0(objP);
            }
            m0x0.o(pbzVar, (Function1) objP, fetVar);
            View view = (View) fetVar.k(dy2.f);
            its itsVar = (its) l7m0Var.getValue();
            boolean z5 = !(itsVar instanceof hts) || (zD && z);
            gts gtsVar = itsVar instanceof gts ? (gts) itsVar : null;
            if (gtsVar != null) {
                lc00 lc00VarB = kotlin.collections.a.b();
                if (!(gtsVar.f11896a instanceof cts)) {
                    lc00VarB.add(bts.Video);
                }
                if (!(gtsVar.b instanceof cts)) {
                    lc00VarB.add(bts.Zone);
                }
                iterableA = kotlin.collections.a.a(lc00VarB);
            } else {
                iterableA = null;
            }
            if (iterableA == null) {
                iterableA = iun.f15405a;
            }
            i4 i4VarR0 = dyb.r0(iterableA);
            Object[] objArr = new Object[0];
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new sqs((byte) 3);
                fetVar.o0(objP2);
            }
            final pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP2, fetVar, 48);
            boolean zG2 = fetVar.g(i4VarR0) | fetVar.g(pz40Var);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new j0s(i4VarR0, pz40Var, null, (byte) 6);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, i4VarR0, (Function2) objP3);
            if (z5) {
                fetVar.e0(-2007390227);
                bts btsVar = (bts) pz40Var.getValue();
                fetVar.e0(-1292372482);
                if (i4VarR0.size() <= 1) {
                    fetVar.r(false);
                    e7mVar = c7m.f3871a;
                    z4 = false;
                } else {
                    bts btsVar2 = bts.Video;
                    if (i4VarR0.contains(btsVar2) && i4VarR0.contains(bts.Zone)) {
                        fetVar.e0(-181924261);
                        i4VarG0 = dyb.g0(rsm0.w(R.string.cs2_stream, 0, fetVar), rsm0.w(R.string.cs2_radar, 0, fetVar));
                        fetVar.r(false);
                    } else if (i4VarR0.contains(btsVar2)) {
                        fetVar.e0(-421504353);
                        i4VarG0 = dyb.g0(rsm0.w(R.string.cs2_stream, 0, fetVar));
                        fetVar.r(false);
                    } else if (i4VarR0.contains(bts.Zone)) {
                        fetVar.e0(-421501442);
                        i4VarG0 = dyb.g0(rsm0.w(R.string.cs2_radar, 0, fetVar));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-421499361);
                        fetVar.r(false);
                        i4VarG0 = lak0.c;
                    }
                    int iIndexOf = i4VarR0.indexOf(btsVar);
                    if (iIndexOf < 0) {
                        iIndexOf = 0;
                    }
                    if (j2 == 46) {
                        fetVar.e0(409028333);
                        zfn zfnVar = m8m0.f21378a;
                        exh0Var = new exh0(new y3d(((StaticColors) fetVar.k(zfnVar)).m75getBlack600d7_KjU()), new y3d(ijg.M), new y3d(((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU()), new y3d(((StaticColors) fetVar.k(zfnVar)).m130getWhite600d7_KjU()));
                        z4 = false;
                        fetVar.r(false);
                    } else if (j2 == 1) {
                        fetVar.e0(409418127);
                        zfn zfnVar2 = m8m0.f21378a;
                        exh0Var = new exh0(new y3d(((StaticColors) fetVar.k(zfnVar2)).m75getBlack600d7_KjU()), new y3d(ijg.l0), new y3d(((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU()), new y3d(((StaticColors) fetVar.k(zfnVar2)).m130getWhite600d7_KjU()));
                        z4 = false;
                        fetVar.r(false);
                    } else {
                        z4 = false;
                        fetVar.e0(-1372255019);
                        fetVar.r(false);
                        exh0Var = fxh0.f10310a;
                    }
                    d7m d7mVar = new d7m(i4VarG0, iIndexOf, exh0Var);
                    fetVar.r(z4);
                    e7mVar = d7mVar;
                }
                boolean zG3 = fetVar.g(i4VarR0) | fetVar.g(pz40Var);
                Object objP4 = fetVar.P();
                if (zG3 || objP4 == cl5Var) {
                    objP4 = new f3s(i4VarR0, pz40Var, (byte) 9);
                    fetVar.o0(objP4);
                }
                function2 = function1;
                z2 = z4;
                final gts gtsVar2 = gtsVar;
                z3 = true;
                fetVar2 = fetVar;
                dtb.n(mm40Var, e7mVar, (Function1) objP4, u1c.M(-1886036075, new xdr() { // from class: a.xss
                    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
                    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
                    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        Function1 function3;
                        boolean zG4;
                        Object objP5;
                        fts ftsVar;
                        ir8 ir8Var = (ir8) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ir8Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar3.g(ir8Var) ? 4 : 2;
                        }
                        if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            jm40 jm40Var = jm40.b;
                            mm40 mm40VarA = ir8Var.a(jm40Var);
                            pz40 pz40Var2 = pz40Var;
                            bts btsVar3 = (bts) pz40Var2.getValue();
                            gts gtsVar3 = gtsVar2;
                            zss.c(mm40VarA, gtsVar3, btsVar3, sekVar, bekVar, fetVar3, 0);
                            if (gtsVar3 == null) {
                                fetVar3.e0(-138116344);
                                mm40 mm40VarA2 = ir8Var.a(jm40Var);
                                boolean z6 = gtsVar3 == null;
                                function3 = function2;
                                zG4 = fetVar3.g(function3);
                                objP5 = fetVar3.P();
                                if (zG4 || objP5 == ukd.f35823a) {
                                    objP5 = new hcr(function3, (byte) 25);
                                    fetVar3.o0(objP5);
                                }
                                zss.a(mm40VarA2, j, j2, z6, (Function0) objP5, fetVar3, 0);
                                fetVar3.r(false);
                            } else {
                                int iOrdinal = ((bts) pz40Var2.getValue()).ordinal();
                                if (iOrdinal == 0) {
                                    ftsVar = gtsVar3.f11896a;
                                } else {
                                    if (iOrdinal != 1) {
                                        t9f.b();
                                        return null;
                                    }
                                    ftsVar = gtsVar3.b;
                                }
                                if (ftsVar instanceof ets) {
                                    fetVar3.e0(-137773267);
                                    fetVar3.r(false);
                                } else {
                                    fetVar3.e0(-138116344);
                                    mm40 mm40VarA3 = ir8Var.a(jm40Var);
                                    if (gtsVar3 == null) {
                                    }
                                    function3 = function2;
                                    zG4 = fetVar3.g(function3);
                                    objP5 = fetVar3.P();
                                    if (zG4) {
                                        objP5 = new hcr(function3, (byte) 25);
                                        fetVar3.o0(objP5);
                                    } else {
                                        objP5 = new hcr(function3, (byte) 25);
                                        fetVar3.o0(objP5);
                                    }
                                    zss.a(mm40VarA3, j, j2, z6, (Function0) objP5, fetVar3, 0);
                                    fetVar3.r(false);
                                }
                            }
                        } else {
                            fetVar3.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar2, (i2 & 14) | 3072);
                fetVar2.r(z2);
            } else {
                fetVar2 = fetVar;
                z2 = false;
                z3 = true;
                fetVar2.e0(-2006230300);
                fetVar2.r(false);
            }
            Unit unit = Unit.f46060a;
            boolean zI = fetVar2.i(r19) | ((i2 & 29360128) == 8388608 ? z3 : z2);
            Object objP5 = fetVar2.P();
            if (zI || objP5 == cl5Var) {
                objP5 = new bb4(view, function2);
                fetVar2.o0(objP5);
            }
            m0x0.n(function2, unit, (Function1) objP5, fetVar2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final Function1 function3 = function2;
            yfe0VarU.d = new Function2(l7m0Var, sekVar, bekVar, j, j2, z, function3, i) { // from class: a.yss
                public final /* synthetic */ l7m0 b;
                public final /* synthetic */ sek c;
                public final /* synthetic */ bek d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ Function1 h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    zss.b(this.f43186a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void c(mm40 mm40Var, gts gtsVar, bts btsVar, sek sekVar, bek bekVar, fet fetVar, int i) {
        fetVar.g0(483194946);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(gtsVar) ? 32 : 16) | (fetVar.e(btsVar.ordinal()) ? 256 : 128) | (fetVar.g(sekVar) ? 2048 : 1024) | (fetVar.g(bekVar) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) fetVar.k(dy2.f);
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new sqs((byte) 4);
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) e9x.Q(objArr, (Function0) objP, fetVar, 48)).intValue();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new pq8();
                fetVar.o0(objP2);
            }
            pq8 pq8Var = (pq8) objP2;
            boolean zE = fetVar.e(iIntValue);
            Object objP3 = fetVar.P();
            if (zE || objP3 == cl5Var) {
                objP3 = new dx2(iIntValue, (byte) 18);
                fetVar.o0(objP3);
            }
            Function1 function1 = (Function1) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new vls((byte) 1);
                fetVar.o0(objP4);
            }
            Function1 function2 = (Function1) objP4;
            boolean zI = fetVar.i(view) | fetVar.i(pq8Var);
            Object objP5 = fetVar.P();
            if (zI || objP5 == cl5Var) {
                objP5 = new f3s(pq8Var, view, (byte) 8);
                fetVar.o0(objP5);
            }
            Function1 function3 = (Function1) objP5;
            boolean zI2 = ((i2 & 112) == 32) | fetVar.i(view) | ((i2 & 896) == 256) | fetVar.i(pq8Var) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objP6 = fetVar.P();
            if (zI2 || objP6 == cl5Var) {
                bg0 bg0Var = new bg0(view, gtsVar, btsVar, pq8Var, sekVar, bekVar, (byte) 8);
                fetVar.o0(bg0Var);
                objP6 = bg0Var;
            }
            dwi0.c(function1, mm40Var, function2, function3, (Function1) objP6, fetVar, ((i2 << 3) & 112) | 384, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) gtsVar, (Object) btsVar, (Object) sekVar, (Object) bekVar, i, (byte) 26);
        }
    }

    public static final void d(androidx.fragment.app.e eVar, String str) {
        Fragment fragmentJ = eVar.J(str);
        if (fragmentJ != null) {
            zb5 zb5Var = new zb5(eVar);
            zb5Var.n(fragmentJ);
            zb5Var.i();
        }
    }
}
