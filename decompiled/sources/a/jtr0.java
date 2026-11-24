package a;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampInfoParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampPrizePoolParams;

/* JADX INFO: loaded from: classes4.dex */
public final class jtr0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtr0(vwu0 vwu0Var, boolean z, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 10;
        this.k = vwu0Var;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.k;
        switch (b) {
            case 0:
                return new jtr0(obj, yjeVar, (byte) 0);
            case 1:
                return new jtr0(obj, yjeVar, (byte) 1);
            case 2:
                return new jtr0(obj, yjeVar, (byte) 2);
            case 3:
                return new jtr0(obj, yjeVar, (byte) 3);
            case 4:
                return new jtr0(obj, yjeVar, (byte) 4);
            case 5:
                return new jtr0(obj, yjeVar, (byte) 5);
            case 6:
                return new jtr0(obj, yjeVar, (byte) 6);
            case 7:
                return new jtr0(obj, yjeVar, (byte) 7);
            case 8:
                return new jtr0(obj, yjeVar, (byte) 8);
            case 9:
                return new jtr0(obj, yjeVar, (byte) 9);
            case 10:
                return new jtr0((vwu0) obj, this.j, yjeVar);
            case 11:
                return new jtr0(obj, yjeVar, (byte) 11);
            default:
                return new jtr0(obj, yjeVar, (byte) 12);
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
            case 10:
                break;
            case 11:
                break;
        }
        return ((jtr0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object value;
        Object obj3;
        Object value2;
        Object obj4;
        Object value3;
        AutoCloseable autoCloseable;
        Object obj5;
        Object value4;
        Object obj6;
        Object value5;
        byte b = this.i;
        Object obj7 = this.k;
        switch (b) {
            case 0:
                ltr0 ltr0Var = (ltr0) obj7;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarB = ltr0Var.H.b();
                    this.j = true;
                    obj = ntb.K(gmqVarB, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                cxi0 cxi0Var = new cxi0((byte) 22, ((Boolean) obj).booleanValue());
                int i = ltr0.Q;
                ltr0Var.H(cxi0Var);
                return Unit.f46060a;
            case 1:
                dat0 dat0Var = (dat0) obj7;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    rpt rptVar = dat0Var.r;
                    UniversalChampInfoParams universalChampInfoParams = dat0Var.o;
                    long j = universalChampInfoParams.f46550a;
                    String str = universalChampInfoParams.e;
                    this.j = true;
                    Object objN = rptVar.n(j, this, str);
                    if (objN == wneVar2) {
                        return wneVar2;
                    }
                    obj2 = objN;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj2 = ((j0g0) obj).f15681a;
                }
                int i2 = dat0.y;
                p7m0 p7m0Var = dat0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, aat0.a((aat0) value, false, new j0g0(obj2), 1)));
                return Unit.f46060a;
            case 2:
                yat0 yat0Var = (yat0) obj7;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    rpt rptVar2 = yat0Var.r;
                    UniversalChampPrizePoolParams universalChampPrizePoolParams = yat0Var.o;
                    long j2 = universalChampPrizePoolParams.f46552a;
                    String str2 = universalChampPrizePoolParams.e;
                    this.j = true;
                    Object objN2 = rptVar2.n(j2, this, str2);
                    if (objN2 == wneVar3) {
                        return wneVar3;
                    }
                    obj3 = objN2;
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj3 = ((j0g0) obj).f15681a;
                }
                int i3 = yat0.w;
                p7m0 p7m0Var2 = yat0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, new wat0(new j0g0(obj3), ((wat0) value2).f38847a)));
                return Unit.f46060a;
            case 3:
                wbt0 wbt0Var = (wbt0) obj7;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    zpu zpuVar = wbt0Var.x;
                    long j3 = wbt0Var.o.f46553a;
                    this.j = true;
                    Object objM = zpuVar.m(90, j3, this);
                    if (objM == wneVar4) {
                        return wneVar4;
                    }
                    obj4 = objM;
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj4 = ((j0g0) obj).f15681a;
                }
                int i4 = wbt0.E;
                p7m0 p7m0Var3 = wbt0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, ubt0.a((ubt0) value3, false, null, new j0g0(obj4), null, 123)));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    jdt0 jdt0Var = (jdt0) obj7;
                    hjd hjdVar = jdt0Var.t;
                    r1g r1gVar = r1g.CYBERSPORT_MAIN;
                    cid cidVar = new cid("cyber_champ", new jq2(jdt0Var.o.f46551a));
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(cidVar, this) == wneVar5) {
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
                    g8f0 g8f0Var = ((emt0) obj7).f8064a;
                    this.j = true;
                    if (g8f0Var.b(this) == wneVar6) {
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
                Object objE = wne.f39444a;
                boolean z7 = this.j;
                try {
                    try {
                        if (!z7) {
                            z1x.P(obj);
                            if (l8x.f0("CXCP")) {
                                Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOnAsync");
                            }
                            b0a b0aVarA = ((xot0) obj7).c.a();
                            this.j = true;
                            obj = b0aVarA.c(this);
                            if (obj != objE) {
                            }
                            return objE;
                        }
                        if (!z7) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objE = ((e0a) autoCloseable).e();
                        ay3.L(autoCloseable, null);
                        return objE;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ay3.L(autoCloseable, th);
                            throw th2;
                        }
                    }
                    autoCloseable = (AutoCloseable) obj;
                } catch (CancellationException e) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                    }
                    return xot0.l;
                }
                break;
            case 7:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (z8) {
                    if (z8) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                reu reuVar = ((xqt0) obj7).g;
                this.j = true;
                Object objB = ((b3c0) reuVar.b).b(this);
                return objB == wneVar7 ? wneVar7 : objB;
            case 8:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    hjd hjdVar2 = ((dqu0) obj7).q;
                    r1g r1gVar2 = r1g.CYBERSPORT_MAIN;
                    cid cidVar2 = new cid("cyber_category_game", new uq2());
                    this.j = true;
                    hjdVar2.getClass();
                    if (hjdVar2.a(cidVar2, this) == wneVar8) {
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
            case 9:
                ztu0 ztu0Var = (ztu0) obj7;
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bzu bzuVar = ztu0Var.r;
                    String str3 = ztu0Var.p.d;
                    this.j = true;
                    Object objF = bzuVar.f(str3, this);
                    if (objF == wneVar9) {
                        return wneVar9;
                    }
                    obj5 = objF;
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj5 = ((j0g0) obj).f15681a;
                }
                int i5 = ztu0.w;
                p7m0 p7m0Var4 = ztu0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, wtu0.a((wtu0) value4, false, 0L, new j0g0(obj5), 7)));
                return Unit.f46060a;
            case 10:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                rwu0 rwu0Var = new rwu0(this.j);
                int i6 = vwu0.p;
                ((vwu0) obj7).G(rwu0Var);
                return Unit.f46060a;
            case 11:
                c8v0 c8v0Var = (c8v0) obj7;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    x4u x4uVar = c8v0Var.r;
                    kgz kgzVar = c8v0Var.o.f47173a;
                    this.j = true;
                    Object objG = x4uVar.g(kgzVar, this);
                    if (objG == wneVar11) {
                        return wneVar11;
                    }
                    obj6 = objG;
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj6 = ((j0g0) obj).f15681a;
                }
                int i7 = c8v0.v;
                p7m0 p7m0Var5 = c8v0Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, new z7v0(new j0g0(obj6), ((z7v0) value5).b)));
                return Unit.f46060a;
            default:
                vcv0 vcv0Var = (vcv0) obj7;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    pwi pwiVar = vcv0Var.s;
                    int i8 = vcv0Var.o;
                    bvc bvcVarA = jiu0.a(vcv0Var);
                    boolean z13 = ((ncv0) vcv0Var.D()).f;
                    boolean z14 = vcv0Var.w.a() || vcv0Var.x.a().O1;
                    this.j = true;
                    if (pwiVar.n(i8, bvcVarA, z13, z14, false, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jtr0(Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
