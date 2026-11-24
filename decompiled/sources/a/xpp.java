package a;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class xpp extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpp(qgd qgdVar, kmq kmqVar, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 16;
        this.n = qgdVar;
        this.k = kmqVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                xpp xppVar = new xpp((yje) obj3, obj4, this.l, (byte) 0);
                xppVar.k = (kmq) obj;
                xppVar.m = obj2;
                return xppVar.invokeSuspend(Unit.f46060a);
            case 1:
                xpp xppVar2 = new xpp((yje) obj3, this.l, (List) obj4);
                xppVar2.k = (kmq) obj;
                xppVar2.m = (Object[]) obj2;
                return xppVar2.invokeSuspend(Unit.f46060a);
            case 2:
                xpp xppVar3 = new xpp((yje) obj3, obj4, this.l, (byte) 2);
                xppVar3.k = (kmq) obj;
                xppVar3.m = obj2;
                return xppVar3.invokeSuspend(Unit.f46060a);
            case 3:
                xpp xppVar4 = new xpp((yje) obj3, obj4, this.l, (byte) 3);
                xppVar4.k = (kmq) obj;
                xppVar4.m = obj2;
                return xppVar4.invokeSuspend(Unit.f46060a);
            case 4:
                xpp xppVar5 = new xpp((yje) obj3, obj4, this.l, (byte) 4);
                xppVar5.k = (kmq) obj;
                xppVar5.m = obj2;
                return xppVar5.invokeSuspend(Unit.f46060a);
            case 5:
                xpp xppVar6 = new xpp((yje) obj3, obj4, this.l, (byte) 5);
                xppVar6.k = (kmq) obj;
                xppVar6.m = obj2;
                return xppVar6.invokeSuspend(Unit.f46060a);
            case 6:
                xpp xppVar7 = new xpp((yje) obj3, obj4, this.l, (byte) 6);
                xppVar7.k = (kmq) obj;
                xppVar7.m = obj2;
                return xppVar7.invokeSuspend(Unit.f46060a);
            case 7:
                xpp xppVar8 = new xpp((yje) obj3, obj4, this.l, (byte) 7);
                xppVar8.k = (kmq) obj;
                xppVar8.m = obj2;
                return xppVar8.invokeSuspend(Unit.f46060a);
            case 8:
                xpp xppVar9 = new xpp(obj4, this.l, (yje) obj3, (byte) 8);
                xppVar9.k = (kmq) obj;
                xppVar9.m = (Throwable) obj2;
                return xppVar9.invokeSuspend(Unit.f46060a);
            case 9:
                xpp xppVar10 = new xpp((yje) obj3, obj4, this.l, (byte) 9);
                xppVar10.k = (kmq) obj;
                xppVar10.m = obj2;
                return xppVar10.invokeSuspend(Unit.f46060a);
            case 10:
                xpp xppVar11 = new xpp((yje) obj3, obj4, this.l, (byte) 10);
                xppVar11.k = (kmq) obj;
                xppVar11.m = obj2;
                return xppVar11.invokeSuspend(Unit.f46060a);
            case 11:
                xpp xppVar12 = new xpp(obj4, this.l, (yje) obj3, (byte) 11);
                xppVar12.k = (kmq) obj;
                xppVar12.m = (Throwable) obj2;
                return xppVar12.invokeSuspend(Unit.f46060a);
            case 12:
                xpp xppVar13 = new xpp((yje) obj3, obj4, this.l, (byte) 12);
                xppVar13.k = (kmq) obj;
                xppVar13.m = obj2;
                return xppVar13.invokeSuspend(Unit.f46060a);
            case 13:
                xpp xppVar14 = new xpp((yje) obj3, obj4, this.l, (byte) 13);
                xppVar14.k = (kmq) obj;
                xppVar14.m = obj2;
                return xppVar14.invokeSuspend(Unit.f46060a);
            case 14:
                xpp xppVar15 = new xpp((yje) obj3, obj4, this.l, (byte) 14);
                xppVar15.k = (kmq) obj;
                xppVar15.m = obj2;
                return xppVar15.invokeSuspend(Unit.f46060a);
            case 15:
                xpp xppVar16 = new xpp((yje) obj3, obj4, this.l, (byte) 15);
                xppVar16.k = (kmq) obj;
                xppVar16.m = obj2;
                return xppVar16.invokeSuspend(Unit.f46060a);
            case 16:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xpp xppVar17 = new xpp((qgd) obj4, this.k, (yje) obj3);
                xppVar17.m = (jkk0) obj;
                xppVar17.l = zBooleanValue;
                return xppVar17.invokeSuspend(Unit.f46060a);
            default:
                xpp xppVar18 = new xpp((yje) obj3, obj4, this.l, (byte) 17);
                xppVar18.k = (kmq) obj;
                xppVar18.m = obj2;
                return xppVar18.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        byte b = this.i;
        byte b2 = 5;
        byte b3 = 6;
        int i = 3;
        byte b4 = 0;
        byte b5 = 22;
        byte b6 = 2;
        Object obj2 = this.n;
        byte b7 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    sgs sgsVar = (sgs) this.m;
                    tzi tziVar = (tzi) obj2;
                    yje yjeVar2 = null;
                    zj2 zj2Var = new zj2(aoq.c(new fnq(new i89(((ros) ((f4u) tziVar.b).b).b.f44549a, b5), new j0l((Object) tziVar, (Object) sgsVar, yjeVar2, (byte) 28)), new twu(tziVar, sgsVar, this.l, yjeVar2, (byte) 2)), sgsVar, tziVar, b2);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar, zj2Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                kmq kmqVar2 = this.k;
                Object[] objArr = (Object[]) this.m;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    Object obj6 = objArr[3];
                    Object obj7 = objArr[4];
                    Object obj8 = objArr[5];
                    Object obj9 = objArr[6];
                    Object obj10 = ((j0g0) objArr[7]).f15681a;
                    j0g0 j0g0Var = (j0g0) obj9;
                    Object obj11 = j0g0Var.f15681a;
                    j0g0 j0g0Var2 = (j0g0) obj8;
                    Object obj12 = j0g0Var2.f15681a;
                    j0g0 j0g0Var3 = (j0g0) obj7;
                    Object obj13 = j0g0Var3.f15681a;
                    j0g0 j0g0Var4 = (j0g0) obj6;
                    e0g0 e0g0Var = j0g0.b;
                    j0g0 j0g0Var5 = new j0g0(new kuk((j0g0) obj3, (j0g0) obj4, (j0g0) obj5, j0g0Var4, this.l, (List) obj2, j0g0Var3, j0g0Var2, j0g0Var, obj10));
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (kmqVar2.a(j0g0Var5, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kmq kmqVar3 = this.k;
                    q5u q5uVar = (q5u) obj2;
                    acu acuVarK = q5uVar.e.k((List) this.m, this.l, ((sff0) q5uVar.p.getValue()).O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar3, acuVarK, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    kmq kmqVar4 = this.k;
                    pwi pwiVar = (pwi) obj2;
                    acu acuVarK2 = ((v7i) pwiVar.f).k((List) this.m, this.l, ((pru) pwiVar.j).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar4, acuVarK2, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    kmq kmqVar5 = this.k;
                    dgu dguVar = (dgu) obj2;
                    acu acuVarK3 = ((v7i) dguVar.b).k((List) this.m, this.l, ((pru) dguVar.d).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar5, acuVarK3, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    kmq kmqVar6 = this.k;
                    f7u f7uVar = (f7u) obj2;
                    acu acuVarK4 = ((v7i) f7uVar.c).k((List) this.m, this.l, ((pru) f7uVar.e).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar6, acuVarK4, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    kmq kmqVar7 = this.k;
                    a6u a6uVar = (a6u) obj2;
                    acu acuVarK5 = ((v7i) a6uVar.b).k((List) this.m, this.l, ((pru) a6uVar.f).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar7, acuVarK5, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                kmq kmqVar8 = this.k;
                Object obj14 = this.m;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    wdu wduVar = (wdu) obj2;
                    acu acuVarK6 = ((v7i) wduVar.d).k((List) obj14, this.l, ((pru) wduVar.j).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar8, acuVarK6, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                kmq kmqVar9 = this.k;
                Throwable th = (Throwable) this.m;
                Object obj15 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    yhi yhiVar = (yhi) obj2;
                    boolean z10 = this.l;
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (agc.L(th)) {
                        throw th;
                    }
                    Object objQ = slb.Q(kmqVar9, aoq.c(new p6d(new xu3(((g8n0) ((zoc) yhiVar.d).f44712a.b).b.c(), (byte) 10), new xu3(((g8n0) ((rvt) yhiVar.e).f31187a.b).c.c(), (byte) 9), new y8p(i, yjeVar, b3), b7), new qwu(yjeVar, yhiVar, z10, b4)), this);
                    if (objQ != obj15) {
                        objQ = Unit.f46060a;
                    }
                    if (objQ == obj15) {
                        return obj15;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    kmq kmqVar10 = this.k;
                    xzp xzpVar = (xzp) obj2;
                    acu acuVarK7 = ((v7i) xzpVar.e).k((List) this.m, this.l, ((pru) xzpVar.g).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar10, acuVarK7, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                qgd qgdVar = (qgd) obj2;
                wne wneVar10 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    kmq kmqVar11 = this.k;
                    jvn jvnVar = (jvn) this.m;
                    boolean z13 = this.l;
                    hie0 hie0Var = new hie0();
                    hie0Var.f13108a = z13;
                    byte b8 = 20;
                    ltb ltbVarB = aoq.b(new i89(uvw.P(new a1g(new qqu(bkb.h0(8L, TimeUnit.SECONDS, new atj(qgdVar, jvnVar, yjeVar, b8)), hie0Var, (byte) 8), new h0v(qgdVar, yjeVar, b7), b8), new lqu(hie0Var, (byte) 11), 8L, new m91(qgdVar, yjeVar, (byte) 11), null, null, 56), b5), new i89(((w5z) qgdVar.b).r(y9s.b), b5));
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar11, ltbVarB, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                kmq kmqVar12 = this.k;
                Throwable th2 = (Throwable) this.m;
                wne wneVar11 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    if (((daf) obj2).d(this.l)) {
                        throw th2;
                    }
                    iun iunVar = iun.f15405a;
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (kmqVar12.a(iunVar, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar12 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    kmq kmqVar13 = this.k;
                    wdu wduVar2 = (wdu) obj2;
                    acu acuVarK8 = ((v7i) wduVar2.d).k((List) this.m, this.l, ((pru) wduVar2.j).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar13, acuVarK8, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar13 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    kmq kmqVar14 = this.k;
                    rrd rrdVar = (rrd) obj2;
                    acu acuVarK9 = ((v7i) rrdVar.d).k((List) this.m, this.l, ((pru) rrdVar.h).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar14, acuVarK9, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                pzu pzuVar = (pzu) obj2;
                wne wneVar14 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    kmq kmqVar15 = this.k;
                    utb utbVarC = aoq.c(((rpt) pzuVar.d).e(xvs.COMPLETE), new jb60(((Number) this.m).intValue(), null, pzuVar, this.l));
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar15, utbVarC, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                sd60 sd60Var = (sd60) obj2;
                wne wneVar15 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    kmq kmqVar16 = this.k;
                    zos zosVar = (zos) this.m;
                    utb utbVarC2 = aoq.c(i120.W(new p6d(((q530) ((nmo) sd60Var.d).f23782a).f28131a.c, ((cmt) sd60Var.e).a(), new wvt(zosVar, yjeVar, b6), b7)), new od60(null, sd60Var, zosVar, this.l));
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar16, utbVarC2, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                qgd qgdVar2 = (qgd) obj2;
                jkk0 jkk0Var = (jkk0) this.m;
                boolean z19 = this.l;
                wne wneVar16 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    kkk0 kkk0Var = jkk0Var.e;
                    if (kkk0Var == kkk0.d || kkk0Var == kkk0.e) {
                        p7m0 p7m0Var = ((epc) qgdVar2.f).f8179a.l.f30868a;
                        do {
                            value = p7m0Var.getValue();
                            ((Number) value).longValue();
                        } while (!p7m0Var.m(value, -1L));
                    }
                    if (z19) {
                        qgdVar2.O();
                        throw null;
                    }
                    kmq kmqVar17 = this.k;
                    this.m = null;
                    this.l = z19;
                    this.j = true;
                    if (kmqVar17.a(jkk0Var, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar17 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    kmq kmqVar18 = this.k;
                    h0q0 h0q0Var = (h0q0) obj2;
                    acu acuVarK10 = ((v7i) h0q0Var.b).k((List) this.m, this.l, ((pru) h0q0Var.d).a().O1);
                    this.k = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar18, acuVarK10, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpp(yje yjeVar, Object obj, boolean z, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.n = obj;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpp(yje yjeVar, boolean z, List list) {
        super(3, yjeVar);
        this.i = (byte) 1;
        this.l = z;
        this.n = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpp(Object obj, boolean z, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.n = obj;
        this.l = z;
    }
}
