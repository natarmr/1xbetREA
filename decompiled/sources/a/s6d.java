package a;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class s6d extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public Object j;
    public Object k;
    public boolean l;
    public /* synthetic */ Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6d(ryn rynVar, mie0 mie0Var, mie0 mie0Var2, o1x o1xVar, Object obj, mie0 mie0Var3, gqw0 gqw0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.n = rynVar;
        this.q = mie0Var;
        this.j = mie0Var2;
        this.o = o1xVar;
        this.m = obj;
        this.p = mie0Var3;
        this.k = gqw0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (b) {
            case 0:
                return new s6d((gmq) this.n, (CoroutineContext) this.q, this.m, (hzb0) this.j, (kmq) obj3, (xdr) obj2, (dby) this.k, yjeVar, (byte) 0);
            case 1:
                s6d s6dVar = new s6d((gmq) this.n, (gmq) this.q, (kmq) obj3, (xdr) obj2, yjeVar);
                s6dVar.m = obj;
                return s6dVar;
            case 2:
                s6d s6dVar2 = new s6d((Function0) this.n, (t33) this.q, (t33) this.j, (t33) obj3, (t33) obj2, (t33) this.k, yjeVar);
                s6dVar2.m = obj;
                return s6dVar2;
            case 3:
                return new s6d((ryn) this.n, (mie0) this.q, (mie0) this.j, (o1x) obj3, this.m, (mie0) obj2, (gqw0) this.k, yjeVar);
            case 4:
                return new s6d((ryn) this.n, (o1x) this.q, this.m, (a780) this.j, (gqw0) obj3, (jr30) obj2, (ibe0) this.k, yjeVar, (byte) 4);
            case 5:
                return new s6d((LinkedHashMap) this.m, (i7a) this.j, (cyh) obj3, (v0) obj2, (y6a) this.k, yjeVar);
            case 6:
                return new s6d((qg20) this.q, (hxu) this.m, (ozc) this.j, (StepInputUiModel) obj3, (txu) obj2, (q4f) this.k, yjeVar);
            case 7:
                return new s6d((xcz) this.n, (l7m0) this.q, (pz40) this.m, (pz40) this.j, (cgk0) obj3, (nw20) obj2, (egk0) this.k, yjeVar, (byte) 7);
            default:
                return new s6d((l7m0) this.n, (roq0) this.q, (lme0) this.m, (Fragment) this.j, (Function1) obj3, (Function0) obj2, (Function0) this.k, yjeVar, (byte) 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((s6d) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((s6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((s6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((s6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((s6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((s6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((s6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((s6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((s6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0469 A[Catch: all -> 0x03d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03d1, blocks: (B:158:0x03cc, B:182:0x0461, B:187:0x0469), top: B:200:0x03be }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [a.a2, a.hzb0, a.jbi0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [a.htb] */
    /* JADX WARN: Type inference failed for: r2v13, types: [a.hzb0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.wne, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.htb] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        dby dbyVarG;
        ?? r2;
        ?? r3;
        Object objC;
        boolean z;
        jbe0 jbe0VarD;
        LinkedHashMap linkedHashMap;
        Object objA;
        i7a i7aVar;
        qg20 qg20Var;
        Object objB;
        String str;
        byte b = 0;
        yje yjeVar = null;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.l;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVar = (gmq) this.n;
                    r6d r6dVar = new r6d((CoroutineContext) this.q, this.m, (hzb0) this.j, (kmq) this.o, (xdr) this.p, (dby) this.k);
                    this.l = true;
                    if (gmqVar.c(r6dVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                vne vneVar = (vne) this.m;
                ?? r4 = wne.f39444a;
                boolean z3 = this.l;
                try {
                    if (z3) {
                        if (!z3) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dbyVarG = (dby) this.k;
                        r2 = (hzb0) this.j;
                        try {
                            z1x.P(obj);
                            r3 = r2;
                        } catch (t e) {
                            e = e;
                            r3 = r2;
                            if (e.f33092a != dbyVarG) {
                                throw e;
                            }
                        }
                        break;
                    } else {
                        z1x.P(obj);
                        v6d v6dVar = new v6d((gmq) this.n, yjeVar, b);
                        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
                        i99 i99Var = i99.f14377a;
                        yne yneVar = yne.f42936a;
                        ?? hzb0Var = new hzb0(jne.b(vneVar, gVar), vtb.d(0, i99Var, null, 4));
                        hzb0Var.d0(yneVar, hzb0Var, v6dVar);
                        dbyVarG = zvw.g();
                        hzb0Var.c(new w0((Object) dbyVarG, (byte) 15));
                        try {
                            try {
                                CoroutineContext coroutineContext = vneVar.getCoroutineContext();
                                Object objB2 = ecq0.b(coroutineContext);
                                CoroutineContext coroutineContextPlus = vneVar.getCoroutineContext().plus(dbyVarG);
                                Unit unit = Unit.f46060a;
                                try {
                                    s6d s6dVar = new s6d((gmq) this.q, coroutineContext, objB2, hzb0Var, (kmq) this.o, (xdr) this.p, dbyVarG, null, (byte) 0);
                                    this.m = null;
                                    this.j = hzb0Var;
                                    this.k = dbyVarG;
                                    this.l = true;
                                    if (ntb.d0(coroutineContextPlus, unit, ecq0.b(coroutineContextPlus), s6dVar, this) == r4) {
                                        return r4;
                                    }
                                    r3 = hzb0Var;
                                } catch (t e2) {
                                    e = e2;
                                    dbyVarG = dbyVarG;
                                    r2 = hzb0Var;
                                    r3 = r2;
                                    if (e.f33092a != dbyVarG) {
                                        throw e;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                r4 = hzb0Var;
                                r4.cancel(null);
                                throw th;
                            }
                        } catch (t e3) {
                            e = e3;
                        }
                    }
                    r3.cancel(null);
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            case 2:
                vne vneVar2 = (vne) this.m;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.l;
                if (!z4) {
                    z1x.P(obj);
                    List listJ = q3d.j(qjj.W(vneVar2, null, null, new my7((t33) this.q, yjeVar, (byte) 17), 3), qjj.W(vneVar2, null, null, new my7((t33) this.j, yjeVar, (byte) 18), 3), qjj.W(vneVar2, null, null, new my7((t33) this.o, yjeVar, (byte) 19), 3), qjj.W(vneVar2, null, null, new my7((t33) this.p, yjeVar, (byte) 20), 3), qjj.W(vneVar2, null, null, new my7((t33) this.k, yjeVar, (byte) 21), 3));
                    this.m = null;
                    this.l = true;
                    if (qjj.T(listJ, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((Function0) this.n).invoke();
                return Unit.f46060a;
            case 3:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.l;
                if (z5) {
                    if (z5) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ryn rynVar = (ryn) this.n;
                hmk0 hmk0Var = (hmk0) ((mie0) this.q).f21842a;
                ngd ngdVar = (ngd) ((mie0) this.j).f21842a;
                o1x o1xVar = (o1x) this.o;
                Object obj2 = this.m;
                a780 a780Var = (a780) ((mie0) this.p).f21842a;
                gqw0 gqw0Var = (gqw0) this.k;
                this.l = true;
                Object objB3 = rynVar.b(hmk0Var, ngdVar, o1xVar, obj2, a780Var, gqw0Var, this);
                return objB3 == wneVar3 ? wneVar3 : objB3;
            case 4:
                Object hhn0Var = wne.f39444a;
                boolean z6 = this.l;
                if (!z6) {
                    z1x.P(obj);
                    ryn rynVar2 = (ryn) this.n;
                    o1x o1xVar2 = (o1x) this.q;
                    Object obj3 = this.m;
                    a780 a780Var2 = (a780) this.j;
                    gqw0 gqw0Var2 = (gqw0) this.o;
                    this.l = true;
                    objC = rynVar2.c(o1xVar2, obj3, a780Var2, gqw0Var2, this);
                    if (objC != hhn0Var) {
                    }
                    return hhn0Var;
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objC = obj;
                myn mynVar = (myn) objC;
                td9 td9Var = ((ryn) this.n).b;
                synchronized (td9Var) {
                    try {
                        gbe0 gbe0Var = (gbe0) ((WeakReference) td9Var.b).get();
                        if (gbe0Var == null) {
                            td9Var.i();
                        } else if (((Context) td9Var.e) == null) {
                            Context context = gbe0Var.f11014a.f5800a;
                            td9Var.e = context;
                            context.registerComponentCallbacks((qz2) td9Var.d);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                nr00 nr00Var = ((ryn) this.n).d;
                jr30 jr30Var = (jr30) this.p;
                o1x o1xVar3 = (o1x) this.q;
                if (jr30Var == null || !o1xVar3.l.b || !mynVar.f22610a.l() || (jbe0VarD = ((gbe0) nr00Var.f23980a).d()) == null) {
                    z = false;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("coil#is_sampled", Boolean.valueOf(mynVar.b));
                    String str2 = mynVar.d;
                    if (str2 != null) {
                        linkedHashMap2.put("coil#disk_cache_key", str2);
                    }
                    dyw dywVar = mynVar.f22610a;
                    Map mapF0 = aac.f0(linkedHashMap2);
                    synchronized (jbe0VarD.c) {
                        long jM = dywVar.m();
                        if (jM < 0) {
                            throw new IllegalStateException(("Image size must be non-negative: " + jM).toString());
                        }
                        jbe0VarD.f16237a.i(jr30Var, dywVar, mapF0, jM);
                    }
                    z = true;
                }
                dyw dywVar2 = mynVar.f22610a;
                o1x o1xVar4 = (o1x) this.q;
                ibj ibjVar = mynVar.c;
                jr30 jr30Var2 = z ? (jr30) this.p : null;
                String str3 = mynVar.d;
                boolean z7 = mynVar.b;
                ibe0 ibe0Var = (ibe0) this.k;
                hhn0Var = new hhn0(dywVar2, o1xVar4, ibjVar, jr30Var2, str3, z7, ibe0Var != null && ibe0Var.b);
                return hhn0Var;
            case 5:
                wne wneVar4 = wne.f39444a;
                boolean z8 = this.l;
                if (!z8) {
                    z1x.P(obj);
                    linkedHashMap = (LinkedHashMap) this.m;
                    i7a i7aVar2 = (i7a) this.j;
                    izx izxVar = ((cyh) this.o).d;
                    v0 v0Var = (v0) this.p;
                    String str4 = ((y6a) this.k).f42087a;
                    this.n = linkedHashMap;
                    this.q = i7aVar2;
                    this.l = true;
                    objA = izxVar.a(v0Var, str4, i7aVar2, this);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                    i7aVar = i7aVar2;
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7aVar = (i7a) this.q;
                    linkedHashMap = (LinkedHashMap) this.n;
                    z1x.P(obj);
                    objA = obj;
                }
                linkedHashMap.put(i7aVar, objA);
                return Unit.f46060a;
            case 6:
                wne wneVar5 = wne.f39444a;
                boolean z9 = this.l;
                if (!z9) {
                    z1x.P(obj);
                    qg20Var = (qg20) this.q;
                    hxu hxuVar = (hxu) this.m;
                    ozc ozcVar = (ozc) this.j;
                    StepInputUiModel stepInputUiModel = (StepInputUiModel) this.o;
                    txu txuVar = (txu) this.p;
                    q4f q4fVar = (q4f) this.k;
                    this.n = qg20Var;
                    this.l = true;
                    objB = qg20Var.B(hxuVar, ozcVar, stepInputUiModel, txuVar, q4fVar, this);
                    if (objB == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qg20Var = (qg20) this.n;
                    z1x.P(obj);
                    objB = obj;
                }
                qg20Var.e0((jnb0) objB);
                return Unit.f46060a;
            case 7:
                wne wneVar6 = wne.f39444a;
                boolean z10 = this.l;
                if (!z10) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new ck60((xcz) this.n, (l7m0) this.q, (pz40) this.m, (byte) 8)));
                    y38 y38Var = new y38(this.j, this.o, this.p, this.k, (byte) 9);
                    this.l = true;
                    if (gmqVarW.c(y38Var, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                Fragment fragment = (Fragment) this.j;
                l7m0 l7m0Var = (l7m0) this.n;
                wne wneVar7 = wne.f39444a;
                boolean z11 = this.l;
                if (!z11) {
                    z1x.P(obj);
                    hdb0 hdb0Var = (hdb0) l7m0Var.getValue();
                    if (hdb0Var != null) {
                        bdb0 bdb0Var = bdb0.f2391a;
                        if (hdb0Var.equals(bdb0Var)) {
                            hdb0Var = null;
                        }
                        if (hdb0Var != null) {
                            roq0 roq0Var = (roq0) this.q;
                            lme0 lme0Var = (lme0) this.m;
                            Function1 function1 = (Function1) this.o;
                            if (hdb0Var.equals(bdb0Var)) {
                                str = "AUTH_OFFER_DIALOG_TAG";
                            } else if (hdb0Var.equals(cdb0.f4154a)) {
                                str = "GREETING_KZ_DIALOG_TAG";
                            } else if (hdb0Var.equals(edb0.f7608a) || hdb0Var.equals(fdb0.f9352a) || hdb0Var.equals(ddb0.f5888a)) {
                                roq0Var.getClass();
                                str = "TipsDialogTag";
                            } else {
                                if (!hdb0Var.equals(gdb0.f11097a)) {
                                    t9f.b();
                                    return null;
                                }
                                lme0Var.getClass();
                                zuf0.e2.getClass();
                                str = zuf0.g2;
                            }
                            if (fragment.C().J(str) == null) {
                                function1.invoke(hdb0Var);
                            }
                        }
                    }
                    vsg0 vsg0VarV = ydx.V(null, new wda0(l7m0Var, (byte) 11));
                    ju7 ju7Var = new ju7(fragment, (roq0) this.q, (lme0) this.m, (Function0) this.p, (Function0) this.k);
                    this.l = true;
                    Object objC2 = vsg0VarV.c(new uap((kmq) ju7Var, (byte) 12), this);
                    if (objC2 != wneVar7) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6d(gmq gmqVar, gmq gmqVar2, kmq kmqVar, xdr xdrVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.n = gmqVar;
        this.q = gmqVar2;
        this.o = kmqVar;
        this.p = xdrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6d(qg20 qg20Var, hxu hxuVar, ozc ozcVar, StepInputUiModel stepInputUiModel, txu txuVar, q4f q4fVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.q = qg20Var;
        this.m = hxuVar;
        this.j = ozcVar;
        this.o = stepInputUiModel;
        this.p = txuVar;
        this.k = q4fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
        this.q = obj2;
        this.m = obj3;
        this.j = obj4;
        this.o = obj5;
        this.p = obj6;
        this.k = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6d(LinkedHashMap linkedHashMap, i7a i7aVar, cyh cyhVar, v0 v0Var, y6a y6aVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.m = linkedHashMap;
        this.j = i7aVar;
        this.o = cyhVar;
        this.p = v0Var;
        this.k = y6aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6d(Function0 function0, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, t33 t33Var5, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.n = function0;
        this.q = t33Var;
        this.j = t33Var2;
        this.o = t33Var3;
        this.p = t33Var4;
        this.k = t33Var5;
    }
}
