package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class myj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(h2c h2cVar, clz clzVar, jbh0 jbh0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.l = h2cVar;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                xae0 xae0Var = (xae0) this.l;
                clz clzVar = (clz) this.k;
                lkz lkzVar = lkz.f20223a;
                return new myj0(xae0Var, clzVar, (nyj0) obj2, yjeVar);
            case 1:
                gmq gmqVar = (gmq) this.l;
                clz clzVar2 = (clz) this.k;
                lkz lkzVar2 = lkz.f20223a;
                return new myj0(gmqVar, clzVar2, (nyj0) obj2, yjeVar);
            case 2:
                xae0 xae0Var2 = (xae0) this.l;
                clz clzVar3 = (clz) this.k;
                lkz lkzVar3 = lkz.f20223a;
                return new myj0(xae0Var2, clzVar3, (nyj0) obj2, yjeVar, (byte) 0);
            case 3:
                return new myj0((wyj0) obj2, yjeVar);
            case 4:
                return new myj0(this.l, this.k, obj2, yjeVar, (byte) 4);
            case 5:
                return new myj0(this.l, this.k, obj2, yjeVar, (byte) 5);
            case 6:
                i89 i89Var = (i89) this.l;
                clz clzVar4 = (clz) this.k;
                lkz lkzVar4 = lkz.f20223a;
                return new myj0(i89Var, clzVar4, (nfj0) obj2, yjeVar);
            case 7:
                return new myj0(this.l, this.k, obj2, yjeVar, (byte) 7);
            case 8:
                gmq gmqVar2 = (gmq) this.l;
                clz clzVar5 = (clz) this.k;
                lkz lkzVar5 = lkz.f20223a;
                return new myj0(gmqVar2, clzVar5, (jbh0) obj2, yjeVar);
            case 9:
                qaf0 qaf0Var = (qaf0) this.l;
                clz clzVar6 = (clz) this.k;
                lkz lkzVar6 = lkz.f20223a;
                return new myj0(qaf0Var, clzVar6, (jbh0) obj2, yjeVar);
            case 10:
                myj0 myj0Var = new myj0(this.k, obj2, yjeVar, (byte) 10);
                myj0Var.l = obj;
                return myj0Var;
            case 11:
                gmq gmqVar3 = (gmq) this.l;
                clz clzVar7 = (clz) this.k;
                lkz lkzVar7 = lkz.f20223a;
                return new myj0(gmqVar3, clzVar7, (eyk0) obj2, yjeVar);
            case 12:
                gmq gmqVar4 = (gmq) this.l;
                clz clzVar8 = (clz) this.k;
                lkz lkzVar8 = lkz.f20223a;
                return new myj0(gmqVar4, clzVar8, (eyk0) obj2, yjeVar, (byte) 0);
            case 13:
                gmq gmqVar5 = (gmq) this.l;
                clz clzVar9 = (clz) this.k;
                lkz lkzVar9 = lkz.f20223a;
                return new myj0(gmqVar5, clzVar9, (eyk0) obj2, yjeVar, (char) 0);
            case 14:
                gmq gmqVar6 = (gmq) this.l;
                clz clzVar10 = (clz) this.k;
                lkz lkzVar10 = lkz.f20223a;
                return new myj0(gmqVar6, clzVar10, (eyk0) obj2, yjeVar, 0);
            case 15:
                gmq gmqVar7 = (gmq) this.l;
                clz clzVar11 = (clz) this.k;
                lkz lkzVar11 = lkz.f20223a;
                return new myj0(gmqVar7, clzVar11, (eyk0) obj2, yjeVar, (short) 0);
            case 16:
                gmq gmqVar8 = (gmq) this.l;
                clz clzVar12 = (clz) this.k;
                lkz lkzVar12 = lkz.f20223a;
                return new myj0(gmqVar8, clzVar12, (eyk0) obj2, yjeVar, (byte) 0, false);
            case 17:
                myj0 myj0Var2 = new myj0(this.k, obj2, yjeVar, (byte) 17);
                myj0Var2.l = obj;
                return myj0Var2;
            case 18:
                qaf0 qaf0Var2 = (qaf0) this.l;
                clz clzVar13 = (clz) this.k;
                lkz lkzVar13 = lkz.f20223a;
                return new myj0(qaf0Var2, clzVar13, (jbh0) obj2, yjeVar, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                qaf0 qaf0Var3 = (qaf0) this.l;
                clz clzVar14 = (clz) this.k;
                lkz lkzVar14 = lkz.f20223a;
                return new myj0(qaf0Var3, clzVar14, (jbh0) obj2, yjeVar, (char) 0);
            case 20:
                gmq gmqVar9 = (gmq) this.l;
                clz clzVar15 = (clz) this.k;
                lkz lkzVar15 = lkz.f20223a;
                return new myj0(gmqVar9, clzVar15, (jbh0) obj2, yjeVar, (byte) 0);
            case 21:
                gmq gmqVar10 = (gmq) this.l;
                clz clzVar16 = (clz) this.k;
                lkz lkzVar16 = lkz.f20223a;
                return new myj0(gmqVar10, clzVar16, (jbh0) obj2, yjeVar, (char) 0);
            case 22:
                omi0 omi0Var = (omi0) this.l;
                clz clzVar17 = (clz) this.k;
                lkz lkzVar17 = lkz.f20223a;
                return new myj0(omi0Var, clzVar17, (jbh0) obj2, yjeVar);
            case 23:
                s6n0 s6n0Var = (s6n0) this.l;
                clz clzVar18 = (clz) this.k;
                lkz lkzVar18 = lkz.f20223a;
                return new myj0(s6n0Var, clzVar18, (jbh0) obj2, yjeVar);
            case 24:
                omi0 omi0Var2 = (omi0) this.l;
                clz clzVar19 = (clz) this.k;
                lkz lkzVar19 = lkz.f20223a;
                return new myj0(omi0Var2, clzVar19, (jbh0) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                h2c h2cVar = (h2c) this.l;
                clz clzVar20 = (clz) this.k;
                lkz lkzVar20 = lkz.f20223a;
                return new myj0(h2cVar, clzVar20, (jbh0) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                p7m0 p7m0Var = (p7m0) this.l;
                clz clzVar21 = (clz) this.k;
                lkz lkzVar21 = lkz.f20223a;
                return new myj0(p7m0Var, clzVar21, (jbh0) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gmq gmqVar11 = (gmq) this.l;
                clz clzVar22 = (clz) this.k;
                lkz lkzVar22 = lkz.f20223a;
                return new myj0(gmqVar11, clzVar22, (bdl0) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qaf0 qaf0Var4 = (qaf0) this.l;
                clz clzVar23 = (clz) this.k;
                lkz lkzVar23 = lkz.f20223a;
                return new myj0(qaf0Var4, clzVar23, (bdl0) obj2, yjeVar);
            default:
                return new myj0(this.l, this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((myj0) create((rzv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((myj0) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((myj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        v88 v88Var;
        Object objG;
        i1w0 i1w0Var;
        byte b = this.i;
        byte b2 = 2;
        byte b3 = 3;
        byte b4 = 15;
        Object obj2 = this.m;
        byte b5 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    anj0 anj0Var = new anj0((nyj0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB.c(anj0Var, this) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    anj0 anj0Var2 = new anj0((nyj0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB2.c(anj0Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    anj0 anj0Var3 = new anj0((nyj0) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB3.c(anj0Var3, this) == wneVar3) {
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
                wyj0 wyj0Var = (wyj0) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    v88Var = wyj0Var.c;
                    i1w0 i1w0Var2 = wyj0Var.b;
                    khf0 khf0Var = wyj0Var.e;
                    bm5 bm5Var = bm5.l;
                    this.l = v88Var;
                    this.k = i1w0Var2;
                    this.j = true;
                    objG = khf0.G(khf0Var, bm5Var, this);
                    if (objG == wneVar4) {
                        return wneVar4;
                    }
                    i1w0Var = i1w0Var2;
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var = (i1w0) this.k;
                    v88Var = (v88) this.l;
                    z1x.P(obj);
                    objG = obj;
                }
                ql5 ql5Var = (ql5) objG;
                wyj0Var.q.a(bm5.l, ql5Var);
                v88.b(v88Var, i1w0Var, ql5Var.f28916a, 2);
                return Unit.f46060a;
            case 4:
                k6k0 k6k0Var = (k6k0) this.l;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                try {
                    if (!z5) {
                        z1x.P(obj);
                        tn30 tn30Var = k6k0Var.g;
                        String str = (String) this.k;
                        int i = ((v6k0) ((x6k0) obj2)).b;
                        this.j = true;
                        if (tn30Var.d(i, this, str) == wneVar5) {
                            return wneVar5;
                        }
                    } else {
                        if (!z5) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    k6k0Var.t.set(false);
                    x5k0 x5k0Var = k6k0Var.c;
                    c4m0 c4m0Var = x5k0Var.g;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    x5k0Var.g = qjj.W(x5k0Var.f, null, null, new kbh0(x5k0Var, yjeVar, b4), 3);
                    k6k0Var.b(c6k0.f3821a);
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    k6k0Var.d(e2);
                }
                return Unit.f46060a;
            case 5:
                pz40 pz40Var = (pz40) obj2;
                pz40 pz40Var2 = (pz40) this.k;
                e960 e960Var = (e960) this.l;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    zsf zsfVar = dak0.f5752a;
                    if (!Intrinsics.d((e960) pz40Var2.getValue(), e960Var)) {
                        pz40Var2.setValue(e960Var);
                        if (e960Var instanceof d960) {
                            pz40Var.setValue(wke.b);
                            uen uenVar = wen.b;
                            long jV0 = ibc.v0(500, bfn.MILLISECONDS);
                            this.j = true;
                            if (qcc.P(jV0, this) == wneVar6) {
                                return wneVar6;
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                wke wkeVar = wke.c;
                zsf zsfVar2 = dak0.f5752a;
                pz40Var.setValue(wkeVar);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var = new i6k0((nfj0) obj2, b5);
                    this.j = true;
                    if (bq9VarB4.c(i6k0Var, this) == wneVar7) {
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
                    t33 t33Var = (t33) this.l;
                    Float f = new Float(1.0f);
                    nul0 nul0Var = (nul0) this.k;
                    this.j = true;
                    if (t33.a(t33Var, f, nul0Var, null, null, this, 12) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((Function0) obj2).invoke();
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var2 = new i6k0((jbh0) obj2, b2);
                    this.j = true;
                    if (bq9VarB5.c(i6k0Var2, this) == wneVar9) {
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
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((qaf0) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var3 = new i6k0((jbh0) obj2, b3);
                    this.j = true;
                    if (bq9VarB6.c(i6k0Var3, this) == wneVar10) {
                        return wneVar10;
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
                yhi yhiVar = (yhi) obj2;
                rzv rzvVar = (rzv) this.l;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    ((hie0) this.k).f13108a = false;
                    zpx zpxVar = (zpx) yhiVar.j;
                    cqk0 cqk0Var = new cqk0(rzvVar);
                    n0w n0wVar = (n0w) yhiVar.v;
                    this.l = null;
                    this.j = true;
                    if (zpxVar.a(cqk0Var, n0wVar, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var4 = new i6k0((eyk0) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB7.c(i6k0Var4, this) == wneVar12) {
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
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var5 = new i6k0((eyk0) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB8.c(i6k0Var5, this) == wneVar13) {
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
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var6 = new i6k0((eyk0) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB9.c(i6k0Var6, this) == wneVar14) {
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
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var7 = new i6k0((eyk0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB10.c(i6k0Var7, this) == wneVar15) {
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
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var8 = new i6k0((eyk0) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB11.c(i6k0Var8, this) == wneVar16) {
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
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var9 = new i6k0((eyk0) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB12.c(i6k0Var9, this) == wneVar17) {
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
                qpg0 qpg0Var = (qpg0) this.l;
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    this.l = null;
                    this.j = true;
                    if (((m4l0) this.k).b.k0(qpg0Var, (ArrayList) obj2) == wneVar18) {
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
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((qaf0) this.l, ((clz) this.k).x(), lkz.e);
                    i6k0 i6k0Var10 = new i6k0((jbh0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB13.c(i6k0Var10, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((qaf0) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var11 = new i6k0((jbh0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB14.c(i6k0Var11, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var12 = new i6k0((jbh0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB15.c(i6k0Var12, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var13 = new i6k0((jbh0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB16.c(i6k0Var13, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((omi0) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var14 = new i6k0((jbh0) obj2, b4);
                    this.j = true;
                    if (bq9VarB17.c(i6k0Var14, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((s6n0) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var15 = new i6k0((jbh0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB18.c(i6k0Var15, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((omi0) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var16 = new i6k0((jbh0) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB19.c(i6k0Var16, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((h2c) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var17 = new i6k0((jbh0) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB20.c(i6k0Var17, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((p7m0) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var18 = new i6k0((jbh0) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB21.c(i6k0Var18, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var19 = new i6k0((bdl0) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB22.c(i6k0Var19, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((qaf0) this.l, ((clz) this.k).x(), lkz.d);
                    i6k0 i6k0Var20 = new i6k0((bdl0) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB23.c(i6k0Var20, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    if (((kfl0) this.l).f) {
                        xcz xczVar = (xcz) this.k;
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.f(0, 0, this) == wneVar30) {
                            return wneVar30;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z30) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ((Function1) ((pz40) obj2).getValue()).invoke(xfl0.f40796a);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, jbh0 jbh0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, jbh0 jbh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, jbh0 jbh0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, nyj0 nyj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = nyj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, eyk0 eyk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = eyk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, eyk0 eyk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = eyk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, eyk0 eyk0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = eyk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, eyk0 eyk0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = eyk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, eyk0 eyk0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = eyk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, eyk0 eyk0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = eyk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(gmq gmqVar, clz clzVar, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(xae0 xae0Var, clz clzVar, nyj0 nyj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = nyj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(xae0 xae0Var, clz clzVar, nyj0 nyj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = nyj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(qaf0 qaf0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.l = qaf0Var;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(qaf0 qaf0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.l = qaf0Var;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(qaf0 qaf0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.l = qaf0Var;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(qaf0 qaf0Var, clz clzVar, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.l = qaf0Var;
        this.k = clzVar;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(omi0 omi0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.l = omi0Var;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(omi0 omi0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.l = omi0Var;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(wyj0 wyj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.m = wyj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(p7m0 p7m0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.l = p7m0Var;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myj0(s6n0 s6n0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.l = s6n0Var;
        this.k = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myj0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myj0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = obj2;
        this.m = obj3;
    }
}
