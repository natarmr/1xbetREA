package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class vnn extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vnn(byte b, yje yjeVar, i3t0 i3t0Var, boolean z) {
        super(1, yjeVar);
        this.i = b;
        this.k = z;
        this.l = i3t0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        boolean z = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new vnn(obj, z, yjeVar, (byte) 0);
            case 1:
                return new vnn((byte) 1, yjeVar, (i3t0) obj, z);
            case 2:
                return new vnn((byte) 2, yjeVar, (i3t0) obj, z);
            case 3:
                return new vnn(obj, z, yjeVar, (byte) 3);
            case 4:
                return new vnn(obj, z, yjeVar, (byte) 4);
            case 5:
                return new vnn((byte) 5, yjeVar, (i3t0) obj, z);
            case 6:
                return new vnn(obj, z, yjeVar, (byte) 6);
            case 7:
                return new vnn(obj, z, yjeVar, (byte) 7);
            case 8:
                return new vnn((byte) 8, yjeVar, (i3t0) obj, z);
            case 9:
                return new vnn(obj, z, yjeVar, (byte) 9);
            default:
                return new vnn(obj, z, yjeVar, (byte) 10);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((vnn) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object objE;
        Object value3;
        Object objK;
        Object objE2;
        p7m0 p7m0Var;
        Object value4;
        Object value5;
        Object value6;
        byte b = this.i;
        byte b2 = 16;
        byte b3 = 13;
        byte b4 = 4;
        byte b5 = 5;
        byte b6 = 6;
        int i = 3;
        boolean z = this.k;
        Object obj2 = this.l;
        yje yjeVar = null;
        byte b7 = 1;
        switch (b) {
            case 0:
                wnn wnnVar = (wnn) obj2;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = wnn.g0;
                    wnnVar.T();
                    tzi tziVar = wnnVar.S;
                    long j = wnnVar.o;
                    this.j = true;
                    if (tziVar.m(j, this, z) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = wnn.g0;
                wnnVar.P();
                String str = ((vqc) wnnVar.E.f25032a).d().f36579a;
                ag3 ag3Var = wnnVar.x;
                ag3Var.getClass();
                str.getClass();
                i8i.D("coupon_id", str, ag3Var.f809a, "coupon_edit_save");
                ik4 ik4Var = wnnVar.y;
                ik4Var.getClass();
                ik4Var.f14907a.a(cui0.b(new j1p(str, (byte) 0)), 3221L);
                wnnVar.G(new gnn(new xdk0(qek0.f28589a, wnnVar.A.b.a(R.string.success, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
                wnnVar.G(dnn.f6378a);
                wnnVar.M();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(8000L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ocj ocjVar = ((tqo) obj2).i;
                if (z) {
                    int i4 = tqo.G;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, pqo.a((pqo) value2, null, false, iun.f15405a, null, null, null, null, null, 2015)));
                } else {
                    int i5 = tqo.G;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                    } while (!p7m0Var3.m(value, pqo.a((pqo) value, null, false, null, iun.f15405a, null, null, null, null, 1983)));
                }
                return Unit.f46060a;
            case 2:
                pup pupVar = (pup) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (z) {
                        int i6 = pup.C;
                        bby bbyVar = pupVar.A;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        pupVar.A = i3t0.K(pupVar, null, null, new epp(pupVar, yjeVar, b7), 3);
                    }
                    a7q a7qVar = pupVar.x;
                    String str2 = pupVar.o;
                    this.j = true;
                    objE = ((wti) a7qVar.f384a).e(this, str2, true);
                    if (objE == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                dsp dspVar = (dsp) objE;
                bby bbyVar2 = pupVar.A;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                ctf0 ctf0Var = pupVar.s;
                dspVar.getClass();
                ctf0Var.getClass();
                lsm0 lsm0Var = ctf0Var.b;
                String strA = lsm0Var.a(R.string.country_title, Arrays.copyOf(new Object[0], 0));
                ssp sspVar = dspVar.f6622a;
                ssp sspVar2 = dspVar.b;
                String str3 = sspVar.c;
                if (str3.length() == 0) {
                    str3 = "-";
                }
                String str4 = sspVar2.c;
                nfv nfvVar = sspVar2.m;
                iuj0 iuj0Var = sspVar2.l;
                if (str4.length() == 0) {
                    str4 = "-";
                }
                ytp ytpVar = new ytp(strA, str3, str4);
                String strA2 = lsm0Var.a(R.string.statistic_fight_record, Arrays.copyOf(new Object[0], 0));
                String str5 = sspVar.d;
                nfv nfvVar2 = sspVar.m;
                iuj0 iuj0Var2 = sspVar.l;
                if (str5.length() == 0) {
                    str5 = "-";
                }
                String str6 = sspVar2.d;
                if (str6.length() == 0) {
                    str6 = "-";
                }
                ytp ytpVar2 = new ytp(strA2, str5, str6);
                String strA3 = lsm0Var.a(R.string.knockout, Arrays.copyOf(new Object[0], 0));
                String str7 = sspVar.e;
                if (str7.length() == 0) {
                    str7 = "-";
                }
                String str8 = sspVar2.e;
                if (str8.length() == 0) {
                    str8 = "-";
                }
                ytp ytpVar3 = new ytp(strA3, str7, str8);
                String strA4 = lsm0Var.a(R.string.pain_techniques, Arrays.copyOf(new Object[0], 0));
                String str9 = sspVar.f;
                if (str9.length() == 0) {
                    str9 = "-";
                }
                String str10 = sspVar2.f;
                if (str10.length() == 0) {
                    str10 = "-";
                }
                ytp ytpVar4 = new ytp(strA4, str9, str10);
                String strA5 = lsm0Var.a(R.string.judgment, Arrays.copyOf(new Object[0], 0));
                String str11 = sspVar.g;
                if (str11.length() == 0) {
                    str11 = "-";
                }
                String str12 = sspVar2.g;
                if (str12.length() == 0) {
                    str12 = "-";
                }
                ytp ytpVar5 = new ytp(strA5, str11, str12);
                String strA6 = lsm0Var.a(R.string.height, Arrays.copyOf(new Object[0], 0));
                String str13 = sspVar.h;
                if (str13.length() == 0) {
                    str13 = "-";
                }
                String str14 = sspVar2.h;
                if (str14.length() == 0) {
                    str14 = "-";
                }
                ytp ytpVar6 = new ytp(strA6, str13, str14);
                String strA7 = lsm0Var.a(R.string.weight, Arrays.copyOf(new Object[0], 0));
                String str15 = sspVar.i;
                if (str15.length() == 0) {
                    str15 = "-";
                }
                String str16 = sspVar2.i;
                if (str16.length() == 0) {
                    str16 = "-";
                }
                ytp ytpVar7 = new ytp(strA7, str15, str16);
                String strA8 = lsm0Var.a(R.string.arm_span, Arrays.copyOf(new Object[0], 0));
                String str17 = sspVar.j;
                if (str17.length() == 0) {
                    str17 = "-";
                }
                String str18 = sspVar2.j;
                if (str18.length() == 0) {
                    str18 = "-";
                }
                ytp ytpVar8 = new ytp(strA8, str17, str18);
                String strA9 = lsm0Var.a(R.string.leg_span, Arrays.copyOf(new Object[0], 0));
                String str19 = sspVar.k;
                if (str19.length() == 0) {
                    str19 = "-";
                }
                String str20 = sspVar2.k;
                if (str20.length() == 0) {
                    str20 = "-";
                }
                ytp ytpVar9 = new ytp(strA9, str19, str20);
                xtp xtpVar = new xtp(lsm0Var.a(R.string.significant_hits, Arrays.copyOf(new Object[0], 0)));
                String strA10 = lsm0Var.a(R.string.hits_per_minute, Arrays.copyOf(new Object[0], 0));
                String str21 = iuj0Var2.f15400a;
                if (str21.length() == 0) {
                    str21 = "-";
                }
                String str22 = iuj0Var.f15400a;
                if (str22.length() == 0) {
                    str22 = "-";
                }
                ytp ytpVar10 = new ytp(strA10, str21, str22);
                String strA11 = lsm0Var.a(R.string.hits_accuracy, Arrays.copyOf(new Object[0], 0));
                String str23 = iuj0Var2.b;
                if (str23.length() == 0) {
                    str23 = "-";
                }
                String str24 = iuj0Var.b;
                if (str24.length() == 0) {
                    str24 = "-";
                }
                ytp ytpVar11 = new ytp(strA11, str23, str24);
                String strA12 = lsm0Var.a(R.string.hits_received_per_minute, Arrays.copyOf(new Object[0], 0));
                String str25 = iuj0Var2.c;
                if (str25.length() == 0) {
                    str25 = "-";
                }
                String str26 = iuj0Var.c;
                if (str26.length() == 0) {
                    str26 = "-";
                }
                ytp ytpVar12 = new ytp(strA12, str25, str26);
                String strA13 = lsm0Var.a(R.string.hits_protection, Arrays.copyOf(new Object[0], 0));
                String str27 = iuj0Var2.d;
                if (str27.length() == 0) {
                    str27 = "-";
                }
                String str28 = iuj0Var.d;
                if (str28.length() == 0) {
                    str28 = "-";
                }
                ytp ytpVar13 = new ytp(strA13, str27, str28);
                xtp xtpVar2 = new xtp(lsm0Var.a(R.string.grappling, Arrays.copyOf(new Object[0], 0)));
                String strA14 = lsm0Var.a(R.string.takedown_averaged, Arrays.copyOf(new Object[0], 0));
                String str29 = nfvVar2.f23456a;
                if (str29.length() == 0) {
                    str29 = "-";
                }
                String str30 = nfvVar.f23456a;
                if (str30.length() == 0) {
                    str30 = "-";
                }
                ytp ytpVar14 = new ytp(strA14, str29, str30);
                String strA15 = lsm0Var.a(R.string.takedown_accuracy, Arrays.copyOf(new Object[0], 0));
                String str31 = nfvVar2.b;
                if (str31.length() == 0) {
                    str31 = "-";
                }
                String str32 = nfvVar.b;
                if (str32.length() == 0) {
                    str32 = "-";
                }
                ytp ytpVar15 = new ytp(strA15, str31, str32);
                String strA16 = lsm0Var.a(R.string.takedown_protection, Arrays.copyOf(new Object[0], 0));
                String str33 = nfvVar2.c;
                if (str33.length() == 0) {
                    str33 = "-";
                }
                String str34 = nfvVar.c;
                if (str34.length() == 0) {
                    str34 = "-";
                }
                ytp ytpVar16 = new ytp(strA16, str33, str34);
                String strA17 = lsm0Var.a(R.string.free_defeat, Arrays.copyOf(new Object[0], 0));
                String str35 = nfvVar2.d;
                if (str35.length() == 0) {
                    str35 = "-";
                }
                String str36 = nfvVar.d;
                if (str36.length() == 0) {
                    str36 = "-";
                }
                i4 i4VarG0 = dyb.g0(ytpVar, ytpVar2, ytpVar3, ytpVar4, ytpVar5, ytpVar6, ytpVar7, ytpVar8, ytpVar9, xtpVar, ytpVar10, ytpVar11, ytpVar12, ytpVar13, xtpVar2, ytpVar14, ytpVar15, ytpVar16, new ytp(strA17, str35, str36));
                p7m0 p7m0Var4 = pupVar.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    pupVar.f.getClass();
                } while (!p7m0Var4.m(value3, hup.a((hup) value3, null, null, new ttp(i4VarG0), 11)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    p6d p6dVarT = ((w5z) ((a6u) obj2).b).t(z);
                    this.j = true;
                    objK = ntb.K(p6dVarT, this);
                    if (objK == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                Collection collection = (Collection) objK;
                return Boolean.valueOf(collection == null || collection.isEmpty());
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    e1u e1uVar = (e1u) ((tzi) obj2).j;
                    this.j = true;
                    objE2 = e1uVar.e(z);
                    if (objE2 == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE2 = obj;
                }
                return Boolean.valueOf(((List) objE2).isEmpty());
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    dde0 dde0Var = (dde0) obj2;
                    if (z) {
                        dde0Var.p.f7224a.c.i = true;
                    } else {
                        fqu fquVar = dde0Var.q;
                        this.j = true;
                        if (fquVar.a(this) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                l2k0 l2k0Var = (l2k0) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    sd60 sd60Var = l2k0Var.D;
                    if (sd60Var != null && (p7m0Var = (p7m0) sd60Var.h) != null) {
                        p6d p6dVar = new p6d(p7m0Var, ((hk5) ((yk50) l2k0Var.v.f384a).b).f13192a, new jgb0(i, yjeVar, b2), (byte) 1);
                        k2k0 k2k0Var = new k2k0(l2k0Var, z, yjeVar, b7);
                        this.j = true;
                        if (slb.O(p6dVar, k2k0Var, this) == wneVar7) {
                            return wneVar7;
                        }
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                b0p0 b0p0Var = (b0p0) obj2;
                TeamBetScreenParams teamBetScreenParams = b0p0Var.o;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    long jF = ynq0.f(b0p0Var.r.a());
                    qgd qgdVar = b0p0Var.p;
                    long j2 = teamBetScreenParams.f46640a;
                    qgdVar.getClass();
                    vsg0 vsg0Var = new vsg0(new fsu(qgdVar, j2, jF, this.k, (yje) null));
                    ywq0 ywq0Var = b0p0Var.q;
                    long j3 = teamBetScreenParams.f46640a;
                    ywq0Var.getClass();
                    dnq dnqVar = new dnq(new p6d(vsg0Var, new vsg0(new fsu(ywq0Var, j3, this.k, jF, (yje) null)), new p4b0(b0p0Var, yjeVar, b3), (byte) 1), new jgb0((Object) b0p0Var, yjeVar, (byte) 24), (byte) 1);
                    lpn0 lpn0Var = new lpn0(b0p0Var, (byte) 22);
                    this.j = true;
                    if (dnqVar.c(lpn0Var, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                i3p0 i3p0Var = (i3p0) obj2;
                ocj ocjVar2 = i3p0Var.i;
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    if (z) {
                        s1p0 s1p0Var = (s1p0) ((ywu) i3p0Var.r.b).c;
                        s1p0Var.f31469a = null;
                        s1p0Var.b = null;
                        p7m0 p7m0Var5 = ocjVar2.f25029a;
                        do {
                            value5 = p7m0Var5.getValue();
                            value5.getClass();
                        } while (!p7m0Var5.m(value5, z2p0.a((z2p0) value5, null, null, false, null, false, true, 63)));
                    } else {
                        int i7 = i3p0.C;
                        p7m0 p7m0Var6 = ocjVar2.f25029a;
                        do {
                            value4 = p7m0Var6.getValue();
                            value4.getClass();
                        } while (!p7m0Var6.m(value4, z2p0.a((z2p0) value4, null, null, false, null, true, false, 95)));
                    }
                    kv kvVar = new kv(i3p0Var, yjeVar, (byte) 21);
                    this.j = true;
                    if (d5c.J(this, kvVar) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                fir0 fir0Var = (fir0) obj2;
                ctu ctuVar = fir0Var.t;
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bby bbyVar3 = fir0Var.V;
                    if (bbyVar3 != null) {
                        bbyVar3.cancel(null);
                    }
                    if (z) {
                        v3c.N(fir0Var.V);
                        fir0Var.V = i3t0.K(fir0Var, null, new ddr0(1, fir0Var, fir0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 20), new cir0(fir0Var, yjeVar, b6), 1);
                    }
                    if (ctuVar.f4960a.r().c == ulr0.NONE) {
                        fir0Var.T = i3t0.K(fir0Var, null, new ddr0(1, fir0Var, fir0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 14), new cir0(fir0Var, yjeVar, b5), 1);
                    }
                    bby bbyVar4 = fir0Var.T;
                    if (bbyVar4 != null) {
                        this.j = true;
                        if (bbyVar4.join(this) == wneVar10) {
                            return wneVar10;
                        }
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (ctuVar.f4960a.r().c != ulr0.NONE) {
                    v3c.N(fir0Var.S);
                    fir0Var.S = i3t0.K(fir0Var, null, new ddr0(1, fir0Var, fir0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 15), new fwk0(fir0Var, yjeVar, b4), 1);
                }
                return Unit.f46060a;
            default:
                u0v0 u0v0Var = (u0v0) obj2;
                wne wneVar11 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    u0v0Var.s.f44322a.c("change_bill_approved");
                    ql5 ql5Var = ((j0v0) u0v0Var.D()).h;
                    if (ql5Var != null) {
                        long j4 = ql5Var.e;
                        this.j = true;
                        if (u0v0Var.O(ql5Var, j4, this) == wneVar11) {
                            return wneVar11;
                        }
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((vlk) u0v0Var.D.b).f37628a.e("changeBalance", z);
                p7m0 p7m0Var7 = u0v0Var.i.f25029a;
                do {
                    value6 = p7m0Var7.getValue();
                    value6.getClass();
                } while (!p7m0Var7.m(value6, j0v0.a((j0v0) value6, false, false, false, false, null, null, null, null, null, 0L, false, 1919)));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vnn(Object obj, boolean z, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = z;
    }
}
