package a;

import android.view.View;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wn10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ long k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn10(byte b, long j, yje yjeVar, diu0 diu0Var, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
        this.j = z;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new wn10((bo10) obj2, this.k, yjeVar, (byte) 0);
            case 1:
                wn10 wn10Var = new wn10((diu0) obj2, yjeVar, (byte) 1);
                wn10Var.k = ((Number) obj).longValue();
                return wn10Var;
            case 2:
                return new wn10((kwj) obj2, this.k, yjeVar, (byte) 2);
            case 3:
                return new wn10((wk40) obj2, this.k, yjeVar, (byte) 3);
            case 4:
                return new wn10((pm60) obj2, this.k, yjeVar, (byte) 4);
            case 5:
                wn10 wn10Var2 = new wn10((diu0) obj2, yjeVar, (byte) 5);
                wn10Var2.k = ((Number) obj).longValue();
                return wn10Var2;
            case 6:
                return new wn10((p990) obj2, this.k, yjeVar, (byte) 6);
            case 7:
                return new wn10((db90) obj2, this.k, yjeVar, (byte) 7);
            case 8:
                return new wn10((v3b0) obj2, this.k, yjeVar, (byte) 8);
            case 9:
                return new wn10((g9b0) obj2, this.k, yjeVar, (byte) 9);
            case 10:
                return new wn10((kgb0) obj2, this.k, yjeVar, (byte) 10);
            case 11:
                return new wn10((fgd0) obj2, this.k, yjeVar, (byte) 11);
            case 12:
                return new wn10((hxd0) obj2, this.k, yjeVar, (byte) 12);
            case 13:
                return new wn10((nff0) obj2, this.k, yjeVar, (byte) 13);
            case 14:
                return new wn10((t33) obj2, this.k, yjeVar, (byte) 14);
            case 15:
                boolean z = this.j;
                return new wn10((byte) 15, this.k, yjeVar, (xxi0) obj2, z);
            case 16:
                boolean z2 = this.j;
                return new wn10((byte) 16, this.k, yjeVar, (odj0) obj2, z2);
            case 17:
                boolean z3 = this.j;
                return new wn10((byte) 17, this.k, yjeVar, (org.xplatform.settings.impl.presentation.a) obj2, z3);
            case 18:
                boolean z4 = this.j;
                return new wn10((byte) 18, this.k, yjeVar, (ngj0) obj2, z4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new wn10((ncl0) obj2, this.k, yjeVar, (byte) 19);
            case 20:
                return new wn10((ins0) obj2, this.k, yjeVar, (byte) 20);
            case 21:
                return new wn10((a6t0) obj2, this.k, yjeVar, (byte) 21);
            case 22:
                return new wn10((tzt0) obj2, this.k, yjeVar, (byte) 22);
            case 23:
                return new wn10(this.k, (View) obj2, yjeVar);
            default:
                return new wn10((d7v0) obj2, this.k, yjeVar, (byte) 24);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wn10) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wn10) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wn10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:156:0x0312  */
    /* JADX WARN: Code duplicated, block: B:227:0x0474  */
    /* JADX WARN: Code duplicated, block: B:229:0x0482  */
    /* JADX WARN: Code duplicated, block: B:235:0x0500  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Object objA;
        Object objA2;
        Object objS;
        vh0 vh0Var;
        long j;
        Object objK2;
        jvn jvnVarB;
        Object objB;
        Object objE;
        Object objK3;
        byte b = this.i;
        byte b2 = 1;
        Object obj2 = this.l;
        Object obj3 = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bo10 bo10Var = (bo10) obj2;
                    long j2 = this.k;
                    csr csrVar = bo10Var.L;
                    boolean z2 = bo10Var.M == ko10.f18608a;
                    this.j = true;
                    if (bo10Var.F(j2, csrVar, z2, this) == wneVar) {
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
                w220 w220Var = (w220) obj2;
                long j3 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    w220Var.z0.a(j3 != 0);
                    p7m0 p7m0Var = w220Var.z1;
                    lm7 lm7Var = new lm7(j3);
                    this.k = j3;
                    this.j = true;
                    p7m0Var.getClass();
                    p7m0Var.o(null, lm7Var);
                    if (Unit.f46060a == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    int i = (int) this.k;
                    this.j = true;
                    if (((kwj) obj2).v(i, 0.0f, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wk40 wk40Var = (wk40) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    gmq gmqVar = (gmq) wk40Var.A.getValue();
                    this.j = true;
                    objK = ntb.K(gmqVar, this);
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
                wk40Var.l.c().d(new sl1((Object) wk40Var, this.k, jpm0.i((List) objK, this.k, 40L, 36L), (byte) 13));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    ls lsVar = ((pm60) obj2).g;
                    long j4 = this.k;
                    this.j = true;
                    if (lsVar.b(j4, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                long j5 = this.k;
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    pht0 pht0Var = ((rt70) obj2).p;
                    this.k = j5;
                    this.j = true;
                    pht0Var.f27014a.f27130a.f28880a.o(null, new Long(j5 / 1000));
                    if (Unit.f46060a == wneVar6) {
                        return wneVar6;
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
                p990 p990Var = (p990) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    sp spVar = p990Var.d;
                    long j6 = this.k;
                    this.j = true;
                    objA = spVar.a(j6, this);
                    if (objA == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                if (((Boolean) objA).booleanValue()) {
                    p990Var.x();
                } else {
                    p990Var.y.f(x890.f40454a);
                }
                return Unit.f46060a;
            case 7:
                db90 db90Var = (db90) obj2;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    sp spVar2 = db90Var.r;
                    long j7 = this.k;
                    this.j = true;
                    objA2 = spVar2.a(j7, this);
                    if (objA2 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                if (((Boolean) objA2).booleanValue()) {
                    sac.V(jiu0.a(db90Var), new ua90(db90Var, (byte) 3), null, db90Var.D.b, new n1((Object) db90Var, db90Var.o.b, (yje) null, (byte) 20), 10);
                } else {
                    int i2 = db90.M;
                    db90Var.G(x990.f40500a);
                }
                return Unit.f46060a;
            case 8:
                v3b0 v3b0Var = (v3b0) obj2;
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    abu abuVar = v3b0Var.A;
                    z7b[] z7bVarArr = {z7b.PART_TYPE_3};
                    this.j = true;
                    objS = abuVar.s(z7bVarArr, this);
                    if (objS == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objS = obj;
                }
                long j8 = this.k;
                for (Object obj4 : (Iterable) objS) {
                    if (((int) ((vh0) obj4).f37408a) == ((int) j8)) {
                        obj3 = obj4;
                        vh0Var = (vh0) obj3;
                        if (vh0Var != null) {
                            j = vh0Var.f37408a;
                            int i3 = v3b0.W;
                            if (!((u2b0) v3b0Var.D()).c) {
                                u58 u58Var = v3b0Var.x;
                                int i4 = (int) j;
                                int i5 = (int) vh0Var.g;
                                u58Var.c(i4, i5, "popular_aggregator");
                                v3b0Var.y.f(i4, i5, y1p.POPULAR_CLASSIC_AGGREGATOR);
                            }
                            if (((u2b0) v3b0Var.D()).c && vh0Var.f == 3) {
                                iun iunVar = iun.f15405a;
                                v3b0Var.U(mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iunVar, false, 131200), vh0Var.g, vh0Var.h, 0L, vh0Var.b, vh0Var.i, vh0Var.j, false, 255964), 0, v3b0Var.I.k(new lu0(3L, null, "popular_new_aggregator", iunVar)));
                            } else {
                                v3b0Var.o.d(new zga0((Object) v3b0Var, (Object) vh0Var, (byte) 11));
                            }
                        }
                        return Unit.f46060a;
                    }
                }
                vh0Var = (vh0) obj3;
                if (vh0Var != null) {
                    j = vh0Var.f37408a;
                    int i6 = v3b0.W;
                    if (!((u2b0) v3b0Var.D()).c) {
                        u58 u58Var2 = v3b0Var.x;
                        int i7 = (int) j;
                        int i8 = (int) vh0Var.g;
                        u58Var2.c(i7, i8, "popular_aggregator");
                        v3b0Var.y.f(i7, i8, y1p.POPULAR_CLASSIC_AGGREGATOR);
                    }
                    if (((u2b0) v3b0Var.D()).c) {
                        v3b0Var.o.d(new zga0((Object) v3b0Var, (Object) vh0Var, (byte) 11));
                    } else {
                        v3b0Var.o.d(new zga0((Object) v3b0Var, (Object) vh0Var, (byte) 11));
                    }
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    ls lsVar2 = ((g9b0) obj2).i;
                    long j9 = this.k;
                    this.j = true;
                    if (lsVar2.b(j9, this) == wneVar10) {
                        return wneVar10;
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
                wne wneVar11 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    ls lsVar3 = ((kgb0) obj2).L;
                    long j10 = this.k;
                    this.j = true;
                    if (lsVar3.b(j10, this) == wneVar11) {
                        return wneVar11;
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
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = ((fgd0) obj2).r;
                    long j11 = this.k;
                    Object lfd0Var = j11 == 0 ? jfd0.f16420a : new lfd0(j11);
                    this.j = true;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, lfd0Var);
                    if (Unit.f46060a == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                hxd0 hxd0Var = (hxd0) obj2;
                wne wneVar13 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    gmq gmqVar2 = (gmq) hxd0Var.L.getValue();
                    this.j = true;
                    objK2 = ntb.K(gmqVar2, this);
                    if (objK2 == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK2 = obj;
                }
                hxd0Var.q.c().d(new sl1((Object) hxd0Var, this.k, jpm0.i((List) objK2, this.k, 40L, 15L), (byte) 15));
                return Unit.f46060a;
            case 13:
                nff0 nff0Var = (nff0) obj2;
                wne wneVar14 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    v6j0 v6j0Var = nff0Var.i.f41723a;
                    if (v6j0Var.a() == 0) {
                        v6j0Var.f36880a.f("INSTALLATION_APP_DATE", System.currentTimeMillis() / 1000);
                    }
                    if (this.k == 0) {
                        switch (nff0Var.g.a().P1) {
                            case "typeDecimal":
                                jvnVarB = jvn.d;
                                break;
                            case "typeUK":
                                jvnVarB = jvn.c;
                                break;
                            case "typeUS":
                                jvnVarB = jvn.b;
                                break;
                            case "typeIndonesian":
                                jvnVarB = jvn.f;
                                break;
                            case "typeMalay":
                                jvnVarB = jvn.g;
                                break;
                            case "typeHongKong":
                                jvnVarB = jvn.e;
                                break;
                            default:
                                jvnVarB = jvn.d;
                                break;
                        }
                    } else {
                        jvnVarB = nff0Var.j.f17841a.b();
                    }
                    xoi0 xoi0Var = nff0Var.k;
                    xoi0Var.getClass();
                    q7d0 q7d0Var = xoi0Var.f41222a.f36530a;
                    q7d0Var.getClass();
                    if (!q7d0Var.a().contains("COEF_TYPE_ID")) {
                        q7d0Var.e(jvnVarB.getId(), "COEF_TYPE_ID");
                    }
                    lpi0 lpi0Var = nff0Var.e;
                    this.j = true;
                    if (lpi0Var.a(this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                nff0Var.o.o(null, i8d.c);
                nff0Var.p.invoke();
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    ne60 ne60Var = new ne60(this.k);
                    nul0 nul0Var = i5i0.d;
                    this.j = true;
                    if (t33.a((t33) obj2, ne60Var, nul0Var, null, null, this, 12) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                xxi0 xxi0Var = (xxi0) obj2;
                boolean z17 = this.j;
                long j12 = this.k;
                int i9 = xxi0.Y0;
                xxi0Var.x.g();
                if (z17) {
                    l7k l7kVar = xxi0Var.O;
                    y1p y1pVar = y1p.MAIN;
                    l7kVar.b("acc_settings", xxi0Var.Q.g());
                }
                xxi0Var.w.a(xxi0Var.A, z17, j12);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                odj0 odj0Var = (odj0) obj2;
                boolean z18 = this.j;
                long j13 = this.k;
                int i10 = odj0.V0;
                odj0Var.w.g();
                if (z18) {
                    l7k l7kVar2 = odj0Var.N;
                    y1p y1pVar2 = y1p.MAIN;
                    l7kVar2.b("acc_settings", odj0Var.P.g());
                }
                odj0Var.v.a(odj0Var.z, z18, j13);
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                org.xplatform.settings.impl.presentation.a aVar = (org.xplatform.settings.impl.presentation.a) obj2;
                boolean z19 = this.j;
                long j14 = this.k;
                aVar.i.g();
                if (z19) {
                    l7k l7kVar3 = aVar.z;
                    y1p y1pVar3 = y1p.MAIN;
                    l7kVar3.b("acc_settings", aVar.B.g());
                }
                aVar.h.a(aVar.k, z19, j14);
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ngj0 ngj0Var = (ngj0) obj2;
                boolean z20 = this.j;
                long j15 = this.k;
                int i11 = ngj0.Y0;
                ngj0Var.y.g();
                if (z20) {
                    l7k l7kVar4 = ngj0Var.P;
                    y1p y1pVar4 = y1p.MAIN;
                    l7kVar4.b("acc_settings", ngj0Var.R.g());
                }
                ngj0Var.v.a(ngj0Var.B, z20, j15);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ncl0 ncl0Var = (ncl0) obj2;
                i1w0 i1w0Var = ncl0Var.i;
                wne wneVar20 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    weu weuVar = ncl0Var.w;
                    long j16 = this.k;
                    this.j = true;
                    objB = weuVar.b(j16, this);
                    if (objB == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                h9m0 h9m0Var = (h9m0) objB;
                if (Intrinsics.d(h9m0Var, h9m0.f12685a)) {
                    i1w0Var.d(new hbl0(ncl0Var, b2));
                } else {
                    if (!Intrinsics.d(h9m0Var, h9m0.b)) {
                        t9f.b();
                        return null;
                    }
                    i1w0Var.d(new hbl0(ncl0Var, (byte) 2));
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    epi0 epi0Var = ((ins0) obj2).f15089a;
                    long j17 = this.k;
                    this.j = true;
                    objE = epi0Var.e(j17, this);
                    if (objE == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                yms0 yms0Var = (yms0) objE;
                yms0Var.getClass();
                Long l = yms0Var.i;
                long jLongValue = l != null ? l.longValue() : 0L;
                Long l2 = yms0Var.n;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                Integer num = yms0Var.s;
                return new fns0(jLongValue, num != null && num.intValue() == 1, jLongValue2);
            case 21:
                a6t0 a6t0Var = (a6t0) obj2;
                wne wneVar22 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    if (a6t0Var.y.f15225a.a()) {
                        long j18 = this.k;
                        this.j = true;
                        if (a6t0Var.N(j18, this) == wneVar22) {
                            return wneVar22;
                        }
                    } else {
                        i1w0 i1w0VarC = a6t0Var.u.c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                        c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                        ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0VarC, copyOnWriteArrayListQ).listIterator(0);
                        while (true) {
                            paw pawVar = (paw) listIterator;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                        }
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                tzt0 tzt0Var = (tzt0) obj2;
                wne wneVar23 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    gmq gmqVar3 = (gmq) tzt0Var.L.getValue();
                    this.j = true;
                    objK3 = ntb.K(gmqVar3, this);
                    if (objK3 == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK3 = obj;
                }
                tzt0Var.p.c().d(new sl1((Object) tzt0Var, this.k, jpm0.i((List) objK3, this.k, 40L, 27L), (byte) 17));
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    long j19 = this.k;
                    this.j = true;
                    if (qcc.P(j19, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                hxm0.z((View) obj2, true);
                return Unit.f46060a;
            default:
                wne wneVar25 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    ls lsVar4 = ((d7v0) obj2).k;
                    long j20 = this.k;
                    this.j = true;
                    if (lsVar4.b(j20, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn10(long j, View view, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        this.k = j;
        this.l = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn10(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn10(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = j;
    }
}
