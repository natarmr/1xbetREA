package a;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class za60 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za60(yje yjeVar, Object obj, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                za60 za60Var = new za60((yje) obj3, obj4, (byte) 0);
                za60Var.k = (kmq) obj;
                za60Var.l = obj2;
                return za60Var.invokeSuspend(Unit.f46060a);
            case 1:
                za60 za60Var2 = new za60((yje) obj3, obj4, (byte) 1);
                za60Var2.k = (kmq) obj;
                za60Var2.l = obj2;
                return za60Var2.invokeSuspend(Unit.f46060a);
            case 2:
                za60 za60Var3 = new za60((yje) obj3, obj4, (byte) 2);
                za60Var3.k = (kmq) obj;
                za60Var3.l = obj2;
                return za60Var3.invokeSuspend(Unit.f46060a);
            case 3:
                za60 za60Var4 = new za60((yje) obj3, obj4, (byte) 3);
                za60Var4.k = (kmq) obj;
                za60Var4.l = obj2;
                return za60Var4.invokeSuspend(Unit.f46060a);
            case 4:
                za60 za60Var5 = new za60((yje) obj3, obj4, (byte) 4);
                za60Var5.k = (kmq) obj;
                za60Var5.l = obj2;
                return za60Var5.invokeSuspend(Unit.f46060a);
            case 5:
                za60 za60Var6 = new za60((yje) obj3, obj4, (byte) 5);
                za60Var6.k = (kmq) obj;
                za60Var6.l = obj2;
                return za60Var6.invokeSuspend(Unit.f46060a);
            case 6:
                za60 za60Var7 = new za60((yje) obj3, obj4, (byte) 6);
                za60Var7.k = (kmq) obj;
                za60Var7.l = obj2;
                return za60Var7.invokeSuspend(Unit.f46060a);
            case 7:
                za60 za60Var8 = new za60((yje) obj3, obj4, (byte) 7);
                za60Var8.k = (kmq) obj;
                za60Var8.l = (Object[]) obj2;
                return za60Var8.invokeSuspend(Unit.f46060a);
            case 8:
                za60 za60Var9 = new za60((yje) obj3, obj4, (byte) 8);
                za60Var9.k = (kmq) obj;
                za60Var9.l = obj2;
                return za60Var9.invokeSuspend(Unit.f46060a);
            case 9:
                za60 za60Var10 = new za60(obj4, (yje) obj3, (byte) 9);
                za60Var10.k = (uwk0) obj;
                za60Var10.l = (dxk0) obj2;
                return za60Var10.invokeSuspend(Unit.f46060a);
            case 10:
                za60 za60Var11 = new za60(obj4, (yje) obj3, (byte) 10);
                za60Var11.l = obj;
                za60Var11.k = obj2;
                return za60Var11.invokeSuspend(Unit.f46060a);
            case 11:
                za60 za60Var12 = new za60(obj4, (yje) obj3, (byte) 11);
                za60Var12.k = (kmq) obj;
                za60Var12.l = (Throwable) obj2;
                return za60Var12.invokeSuspend(Unit.f46060a);
            case 12:
                za60 za60Var13 = new za60((yje) obj3, obj4, (byte) 12);
                za60Var13.k = (kmq) obj;
                za60Var13.l = obj2;
                return za60Var13.invokeSuspend(Unit.f46060a);
            case 13:
                za60 za60Var14 = new za60((yje) obj3, obj4, (byte) 13);
                za60Var14.k = (kmq) obj;
                za60Var14.l = obj2;
                return za60Var14.invokeSuspend(Unit.f46060a);
            case 14:
                za60 za60Var15 = new za60((yje) obj3, obj4, (byte) 14);
                za60Var15.k = (kmq) obj;
                za60Var15.l = obj2;
                return za60Var15.invokeSuspend(Unit.f46060a);
            case 15:
                za60 za60Var16 = new za60((yje) obj3, obj4, (byte) 15);
                za60Var16.k = (kmq) obj;
                za60Var16.l = obj2;
                return za60Var16.invokeSuspend(Unit.f46060a);
            case 16:
                za60 za60Var17 = new za60((yje) obj3, obj4, (byte) 16);
                za60Var17.k = (kmq) obj;
                za60Var17.l = obj2;
                return za60Var17.invokeSuspend(Unit.f46060a);
            case 17:
                za60 za60Var18 = new za60(obj4, (yje) obj3, (byte) 17);
                za60Var18.k = (l1q0) obj;
                za60Var18.l = (b2q0) obj2;
                return za60Var18.invokeSuspend(Unit.f46060a);
            case 18:
                za60 za60Var19 = new za60((yje) obj3, obj4, (byte) 18);
                za60Var19.k = (kmq) obj;
                za60Var19.l = obj2;
                return za60Var19.invokeSuspend(Unit.f46060a);
            default:
                za60 za60Var20 = new za60((yje) obj3, obj4, (byte) 19);
                za60Var20.k = (kmq) obj;
                za60Var20.l = obj2;
                return za60Var20.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        gmq vsg0Var;
        Object g0g0Var;
        gmq zj2Var;
        m9s m9sVar;
        Object value;
        uhh0 uhh0VarA;
        Object value2;
        uhh0 uhh0VarA2;
        byte b = this.i;
        byte b2 = 11;
        byte b3 = 0;
        byte b4 = 3;
        int i = 2;
        byte b5 = 12;
        Object obj2 = this.m;
        yje yjeVar = null;
        switch (b) {
            case 0:
                tzi tziVar = (tzi) obj2;
                n0o0 n0o0Var = (n0o0) tziVar.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = (kmq) this.k;
                    acu acuVarK = ((v7i) tziVar.g).k((List) this.l, ((sff0) n0o0Var.getValue()).J1, ((sff0) n0o0Var.getValue()).O1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, acuVarK, this) == wneVar) {
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
                qv2 qv2Var = (qv2) obj2;
                n0o0 n0o0Var2 = (n0o0) qv2Var.n;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kmq kmqVar2 = (kmq) this.k;
                    acu acuVarK2 = ((v7i) qv2Var.j).k((List) this.l, ((sff0) n0o0Var2.getValue()).J1, ((sff0) n0o0Var2.getValue()).O1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, acuVarK2, this) == wneVar2) {
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
                    kmq kmqVar3 = (kmq) this.k;
                    if (((sw00) this.l).f32897a) {
                        zpu zpuVar = (zpu) obj2;
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            g0g0Var = new dnq(((ali) zpuVar.b).p(true), new eb60(b4, yjeVar, b3), (byte) 1);
                        } catch (Throwable th) {
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                        Object vsg0Var2 = new vsg0(new fot(i, yjeVar, (byte) 6));
                        if (g0g0Var instanceof g0g0) {
                            g0g0Var = vsg0Var2;
                        }
                        vsg0Var = (gmq) g0g0Var;
                    } else {
                        vsg0Var = new vsg0(new fot(i, yjeVar, (byte) 7));
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar3, vsg0Var, this) == wneVar3) {
                        return wneVar3;
                    }
                    break;
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                j910 j910Var = (j910) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    kmq kmqVar4 = (kmq) this.k;
                    jlr jlrVar = (jlr) this.l;
                    xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
                    List<xum0> list = (xkrVar == null || (m9sVar = xkrVar.d) == null) ? null : m9sVar.H;
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    if (list.isEmpty()) {
                        zj2Var = new eu4(Boolean.FALSE, b5);
                    } else {
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (xum0 xum0Var : list) {
                            pv00 pv00Var = (pv00) j910Var.c;
                            long j = xum0Var.b;
                            n530 n530Var = ((q530) pv00Var.f27640a).f28131a;
                            n530Var.getClass();
                            arrayList.add(n530Var.b(new i530(-26L, j)));
                        }
                        zj2Var = new zj2((gmq[]) CollectionsKt.L0(arrayList).toArray(new gmq[0]), j910Var, list, (byte) 17);
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar4, zj2Var, this) == wneVar4) {
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
                    kmq kmqVar5 = (kmq) this.k;
                    gmq gmqVarP = ((sw00) this.l).f32897a ? ((ali) ((nw20) obj2).f24215a).p(true) : new vsg0(new fot(i, yjeVar, (byte) 9));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar5, gmqVarP, this) == wneVar5) {
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
                di80 di80Var = (di80) obj2;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    kmq kmqVar6 = (kmq) this.k;
                    xh80 xh80Var = (xh80) this.l;
                    fnq fnqVar = new fnq(xh80Var.f40877a.l, new st20(i, yjeVar, b2), (byte) 4);
                    ehf0 ehf0Var = di80Var.e;
                    kd30 kd30Var = new kd30();
                    ehf0Var.getClass();
                    kd30Var.b = di80Var;
                    kd30Var.f18086a = ehf0Var;
                    fl80 fl80Var = new fl80(fnqVar, kd30Var, new onv(xh80Var.f40877a), pul.n);
                    this.j = true;
                    if (kmqVar6.a(fl80Var, this) == wneVar6) {
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
                    kmq kmqVar7 = (kmq) this.k;
                    String strValueOf = String.valueOf(((Number) this.l).longValue());
                    strValueOf.getClass();
                    p6a p6aVar = new p6a("ChangePassword", "", strValueOf);
                    m430 m430Var = new m430(((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2).h.a(p6aVar), p6aVar, (byte) 21);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar7, m430Var, this) == wneVar7) {
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
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    kmq kmqVar8 = (kmq) this.k;
                    gfe[] gfeVarArr = (gfe[]) ((Object[]) this.l);
                    hyc0 hyc0Var = (hyc0) obj2;
                    gfe gfeVar = gfeVarArr[0];
                    gfeVar.getClass();
                    gfe gfeVar2 = gfeVarArr[1];
                    gfeVar2.getClass();
                    gfe gfeVar3 = gfeVarArr[2];
                    gfeVar3.getClass();
                    gfe gfeVar4 = gfeVarArr[3];
                    gfeVar4.getClass();
                    gfe gfeVar5 = gfeVarArr[4];
                    gfeVar5.getClass();
                    gfe gfeVar6 = gfeVarArr[5];
                    gfeVar6.getClass();
                    List list2 = (List) hyc0Var.L.f40549a.getValue();
                    zuc0 zuc0Var = hyc0Var.A;
                    lc00 lc00VarW = hyc0Var.w();
                    ctf0 ctf0Var = hyc0Var.o;
                    hyc0Var.q.j();
                    List listW = fww.w(list2, zuc0Var, ctf0Var, lc00VarW, gfeVar, gfeVar2, gfeVar3, gfeVar4, gfeVar5, gfeVar6, hyc0Var.x, hyc0Var.x(), 512);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar8.a(listW, this) == wneVar8) {
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
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    kmq kmqVar9 = (kmq) this.k;
                    yje yjeVar2 = null;
                    vsg0 vsg0Var3 = new vsg0(new n1((Object) new olb(((Boolean) this.l).booleanValue(), (z220) obj2, yjeVar2, b4), ibc.w0(180000L, bfn.MILLISECONDS), yjeVar2, (byte) 8));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    f7k.J(kmqVar9);
                    Object objC = vsg0Var3.c(new uap(kmqVar9, b5), this);
                    if (objC != wneVar9) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar9) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar9) {
                        return wneVar9;
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
                sih0 sih0Var = (sih0) obj2;
                vzg0 vzg0Var = sih0Var.o;
                ocj ocjVar = sih0Var.i;
                uwk0 uwk0Var = (uwk0) this.k;
                dxk0 dxk0Var = (dxk0) this.l;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    if (uwk0Var instanceof twk0) {
                        this.k = null;
                        this.l = null;
                        this.j = true;
                        int i2 = sih0.N;
                        if (sih0Var.N((twk0) uwk0Var, dxk0Var, this) == wneVar10) {
                            return wneVar10;
                        }
                    } else {
                        boolean zD = Intrinsics.d(uwk0Var, swk0.f32926a);
                        ehh0 ehh0Var = ehh0.f7810a;
                        if (zD) {
                            int i3 = sih0.N;
                            sih0Var.G(ehh0Var);
                            p7m0 p7m0Var = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var.getValue();
                                value2.getClass();
                                uhh0VarA2 = uhh0.a((uhh0) value2, null, dxk0Var.f6850a, null, null, null, null, null, null, dxk0Var.b, null, null, jfh0.f16426a, false, null, 67083255);
                                vzg0Var.e("KEY_SELECTED_SEARCH_FILTER", Long.valueOf(uhh0VarA2.k));
                            } while (!p7m0Var.m(value2, uhh0VarA2));
                        } else {
                            if (!Intrinsics.d(uwk0Var, swk0.b)) {
                                t9f.b();
                                return null;
                            }
                            int i4 = sih0.N;
                            sih0Var.G(ehh0Var);
                            p7m0 p7m0Var2 = ocjVar.f25029a;
                            do {
                                value = p7m0Var2.getValue();
                                value.getClass();
                                uhh0VarA = uhh0.a((uhh0) value, null, dxk0Var.f6850a, null, null, null, null, null, null, dxk0Var.b, null, null, kfh0.f18196a, false, null, 67083255);
                                vzg0Var.e("KEY_SELECTED_SEARCH_FILTER", Long.valueOf(uhh0VarA.k));
                            } while (!p7m0Var2.m(value, uhh0VarA));
                        }
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (z11) {
                    if (z11) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                Object obj3 = this.l;
                Object obj4 = this.k;
                this.l = null;
                this.j = true;
                Object objF = ((xdr) obj2).F(obj3, obj4, this);
                return objF == wneVar11 ? wneVar11 : objF;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    kmq kmqVar10 = (kmq) this.k;
                    Throwable th2 = (Throwable) this.l;
                    pji0 pji0VarA = ((gpj0) obj2).b.a(null);
                    gji0 gji0Var = new gji0(pji0VarA, null, null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + pji0VarA.f27093a);
                    this.k = null;
                    this.j = true;
                    if (kmqVar10.a(gji0Var, this) == wneVar12) {
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
            case 12:
                fdk0 fdk0Var = (fdk0) obj2;
                kmq kmqVar11 = (kmq) this.k;
                Object obj5 = this.l;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    ynb0 ynb0Var = (ynb0) obj5;
                    l9c l9cVar = fdk0Var.o;
                    String str = ((cdk0) fdk0Var.D()).g;
                    if (str.length() == 0) {
                        str = ((cdk0) fdk0Var.D()).f;
                    }
                    l9cVar.getClass();
                    ynb0Var.getClass();
                    vsg0 vsg0Var4 = new vsg0(new kv(l9cVar, str, ynb0Var, null, (byte) 15));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar11, vsg0Var4, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                pzu pzuVar = (pzu) obj2;
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    kmq kmqVar12 = (kmq) this.k;
                    gmq y5n0Var = ((sw00) this.l).f32897a ? new y5n0(i120.W(abp.d(((abp) ((kki) ((x4u) pzuVar.c).f40284a).b).b)), pzuVar, (byte) 1) : new vsg0(new fot(i, yjeVar, b5));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar12, y5n0Var, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                rdn0 rdn0Var = (rdn0) obj2;
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    kmq kmqVar13 = (kmq) this.k;
                    x8n0 x8n0Var = (x8n0) this.l;
                    gmq eu4Var = !x8n0Var.a().isEmpty() ? new eu4(x8n0Var, b5) : new lsa(rdn0Var.v.s(rdn0Var.O(), rdn0Var.O(), ((sff0) rdn0Var.E.getValue()).J1, null), (byte) 11);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar13, eu4Var, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                ven0 ven0Var = (ven0) obj2;
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    kmq kmqVar14 = (kmq) this.k;
                    x8n0 x8n0Var2 = (x8n0) this.l;
                    gmq eu4Var2 = !x8n0Var2.a().isEmpty() ? new eu4(x8n0Var2, b5) : new lsa(ven0Var.w.s(ven0Var.O(), ven0Var.O(), ((sff0) ven0Var.F.getValue()).J1, null), (byte) 12);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar14, eu4Var2, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                zyn0 zyn0Var = (zyn0) obj2;
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    kmq kmqVar15 = (kmq) this.k;
                    jsn0 jsn0Var = (jsn0) this.l;
                    dnq dnqVar = new dnq(new zj2(i120.W(new t7h(((tg5) zyn0Var.Q.f22289a.b).d, jsn0Var.b, (byte) 3)), jsn0Var, zyn0Var, (byte) 22), new pyn0(b4, yjeVar, b3), (byte) 1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar15, dnqVar, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                x1q0 x1q0Var = (x1q0) obj2;
                l1q0 l1q0Var = (l1q0) this.k;
                b2q0 b2q0Var = (b2q0) this.l;
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    String str2 = l1q0Var.i;
                    tgk tgkVar = x1q0Var.m;
                    tgkVar.getClass();
                    Resources resources = tgkVar.f33916a.getResources();
                    String strValueOf2 = String.valueOf(new Configuration(resources != null ? resources.getConfiguration() : null).fontScale);
                    ctf0 ctf0Var2 = x1q0Var.k;
                    boolean z19 = l1q0Var.x;
                    boolean zA = x1q0Var.s.f15225a.a();
                    b2q0Var.getClass();
                    ctf0Var2.getClass();
                    strValueOf2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    if (!zA) {
                        lsm0 lsm0Var = ctf0Var2.b;
                        arrayList2.add(new qsv(lsm0Var.a(R.string.test_authorization, Arrays.copyOf(new Object[0], 0))));
                        String strA = lsm0Var.a(R.string.test_choose_cred, Arrays.copyOf(new Object[0], 0));
                        uwx uwxVar = uwx.f36413a;
                        arrayList2.add(new yrq0(strA));
                    }
                    lsm0 lsm0Var2 = ctf0Var2.b;
                    arrayList2.add(new qsv(lsm0Var2.a(R.string.basic_tools, Arrays.copyOf(new Object[0], 0))));
                    String strA2 = lsm0Var2.a(R.string.test_client_information, Arrays.copyOf(new Object[0], 0));
                    uwx uwxVar2 = uwx.f36413a;
                    arrayList2.add(new bsq0(strA2));
                    String strA3 = lsm0Var2.a(R.string.environment_and_servers, Arrays.copyOf(new Object[0], 0));
                    uwx uwxVar3 = uwx.f36413a;
                    arrayList2.add(new dsq0(strA3));
                    arrayList2.add(new msq0(lsm0Var2.a(R.string.ui_settings, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new esq0(lsm0Var2.a(R.string.feature_toggles, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new wrq0(lsm0Var2.a(R.string.app_guid, Arrays.copyOf(new Object[0], 0))));
                    String strA4 = lsm0Var2.a(R.string.test_connected_modules, Arrays.copyOf(new Object[0], 0));
                    uwx uwxVar4 = uwx.f36413a;
                    arrayList2.add(new hsq0(strA4));
                    arrayList2.add(new qsv(lsm0Var2.a(R.string.test_remote_config, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new zuq0(lsm0Var2.a(R.string.test_remote_config_toggle_title, Arrays.copyOf(new Object[0], 0)), z19));
                    arrayList2.add(new ksq0(lsm0Var2.a(R.string.test_remote_config_keys, Arrays.copyOf(new Object[0], 0))));
                    boolean z20 = l1q0Var.v;
                    if (!(b2q0Var.b instanceof a2q0)) {
                        arrayList2.add(new qsv(lsm0Var2.a(R.string.test_tools_server, Arrays.copyOf(new Object[0], 0))));
                        arrayList2.add(new avq0(lsm0Var2.a(R.string.test_tools_server_connection, Arrays.copyOf(new Object[0], 0)), z20));
                        arrayList2.add(new lsq0(b2q0Var.f1866a));
                    }
                    arrayList2.add(new qsv(lsm0Var2.a(R.string.diagnostics, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new gsq0(lsm0Var2.a(R.string.markets_and_events, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new isq0(lsm0Var2.a(R.string.online_call, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new uuq0(lsm0Var2.a(R.string.update_web_view_debuggable, Arrays.copyOf(new Object[0], 0)), l1q0Var.h));
                    arrayList2.add(new yuq0(lsm0Var2.a(R.string.show_push_info, Arrays.copyOf(new Object[0], 0)), l1q0Var.q));
                    arrayList2.add(new csq0(lsm0Var2.a(R.string.test_debug_console, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new qsv(lsm0Var2.a(R.string.test_scenarios, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new vuq0(lsm0Var2.a(R.string.check_geo, Arrays.copyOf(new Object[0], 0)), l1q0Var.f));
                    arrayList2.add(new asq0(lsm0Var2.a(R.string.test_chose_country, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new nsq0(lsm0Var2.a(R.string.test_update, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new fsq0(lsm0Var2.a(R.string.test_coupon_generate, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new wuq0(lsm0Var2.a(R.string.internet_emulation_toggle, Arrays.copyOf(new Object[0], 0)), l1q0Var.A));
                    arrayList2.add(new bf9(lsm0Var2.a(R.string.override_update, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new df9(lsm0Var2.a(R.string.test_update, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new cf9(lsm0Var2.a(R.string.test_send_notification, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new af9(lsm0Var2.a(R.string.test_check_push_service, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new ze9(lsm0Var2.a(R.string.test_check_emulator, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new ef9(lsm0Var2.a(R.string.verification, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new ye9(lsm0Var2.a(R.string.open_camera, Arrays.copyOf(new Object[0], 0))));
                    arrayList2.add(new ho3(lsm0Var2.a(R.string.text_scale_app, Arrays.copyOf(new Object[]{strValueOf2}, 1))));
                    arrayList2.add(new ho3(lsm0Var2.a(R.string.test_app_version, Arrays.copyOf(new Object[]{l1q0Var.m}, 1))));
                    p7m0 p7m0Var3 = x1q0Var.t;
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, arrayList2);
                    if (Unit.f46060a == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    kmq kmqVar16 = (kmq) this.k;
                    gmq eu4Var3 = ((Boolean) this.l).booleanValue() ? new eu4(Boolean.FALSE, b5) : aoq.c(new fnq(((s5r0) obj2).d, new fot(i, yjeVar, (byte) 13)), new r5r0(3, null));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar16, eu4Var3, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar17 = (kmq) this.k;
                Object obj6 = this.l;
                wne wneVar20 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    ynb0 ynb0Var2 = (ynb0) obj6;
                    dyu0 dyu0Var = (dyu0) obj2;
                    iw20 iw20Var = dyu0Var.r;
                    long j2 = dyu0Var.q.b;
                    iw20Var.getClass();
                    ynb0Var2.getClass();
                    vsg0 vsg0Var5 = new vsg0(new ze1((Object) iw20Var, j2, (Object) ynb0Var2, (yje) null, (byte) 11));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar17, vsg0Var5, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za60(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
    }
}
