package a;

import android.util.Log;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wk70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk70(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new wk70((yk70) this.k, (Throwable) obj2, yjeVar, (byte) 0);
            case 1:
                return new wk70((cl70) this.k, (zy5) obj2, yjeVar, (byte) 1);
            case 2:
                return new wk70((ol70) this.k, (zy5) obj2, yjeVar, (byte) 2);
            case 3:
                return new wk70((ol70) this.k, (Throwable) obj2, yjeVar, (byte) 3);
            case 4:
                return new wk70((ol70) this.k, (ll70) obj2, yjeVar, (byte) 4);
            case 5:
                return new wk70((nm70) this.k, (zy5) obj2, yjeVar, (byte) 5);
            case 6:
                return new wk70((nm70) this.k, (Throwable) obj2, yjeVar, (byte) 6);
            case 7:
                return new wk70((nm70) this.k, (xl70) obj2, yjeVar, (byte) 7);
            case 8:
                return new wk70((nm70) this.k, (im70) obj2, yjeVar, (byte) 8);
            case 9:
                return new wk70((wm70) this.k, (Throwable) obj2, yjeVar, (byte) 9);
            case 10:
                return new wk70((lbx) this.k, (to70) obj2, yjeVar, (byte) 10);
            case 11:
                return new wk70((to70) this.k, (zy5) obj2, yjeVar, (byte) 11);
            case 12:
                return new wk70((to70) this.k, (Throwable) obj2, yjeVar, (byte) 12);
            case 13:
                return new wk70((to70) this.k, (io70) obj2, yjeVar, (byte) 13);
            case 14:
                return new wk70((zo70) this.k, (Throwable) obj2, yjeVar, (byte) 14);
            case 15:
                return new wk70((zo70) this.k, (vo70) obj2, yjeVar, (byte) 15);
            case 16:
                return new wk70((zo70) this.k, (xo70) obj2, yjeVar, (byte) 16);
            case 17:
                return new wk70((sp70) this.k, (zy5) obj2, yjeVar, (byte) 17);
            case 18:
                return new wk70((sp70) this.k, (Throwable) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new wk70((sp70) this.k, (bp70) obj2, yjeVar, (byte) 19);
            case 20:
                return new wk70((sp70) this.k, (hp70) obj2, yjeVar, (byte) 20);
            case 21:
                return new wk70((nr70) this.k, (String) obj2, yjeVar, (byte) 21);
            case 22:
                wk70 wk70Var = new wk70((di80) obj2, yjeVar, (byte) 22);
                wk70Var.k = obj;
                return wk70Var;
            case 23:
                return new wk70((qi80) this.k, (yyj0) obj2, yjeVar, (byte) 23);
            case 24:
                return new wk70((qi80) this.k, (q99) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new wk70((jt80) this.k, (mlr) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new wk70((gz80) this.k, (by80) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new wk70((ly80) this.k, (gz80) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new wk70((Function2) this.k, (mz80) obj2, yjeVar, (byte) 28);
            default:
                wk70 wk70Var2 = new wk70((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2, yjeVar, (byte) 29);
                wk70Var2.k = obj;
                return wk70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((wk70) create((yyj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((wk70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wk70) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:80:0x0170  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [a.p7m0] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r1v105, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object objA2;
        ?? arrayList;
        Object value;
        ex80 ex80Var;
        Object value2;
        az80 az80Var;
        LinkedHashMap linkedHashMap;
        Object objO;
        by80 by80Var;
        List list;
        by80 by80Var2;
        Object value3;
        byte b = this.i;
        byte b2 = 0;
        Object obj2 = this.l;
        byte b3 = 1;
        ?? r5 = 0;
        Object obj3 = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (((yk70) this.k).o.a((Throwable) obj2, this) == wneVar) {
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
                    this.j = true;
                    if (((cl70) this.k).d.f((zy5) obj2, this) == wneVar2) {
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
                    this.j = true;
                    if (((ol70) this.k).b.f((zy5) obj2, this) == wneVar3) {
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
                    this.j = true;
                    if (((ol70) this.k).j.a((Throwable) obj2, this) == wneVar4) {
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
                    this.j = true;
                    if (((ol70) this.k).o.m(this, (ll70) obj2) == wneVar5) {
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
                    this.j = true;
                    if (((nm70) this.k).k.f((zy5) obj2, this) == wneVar6) {
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
                    this.j = true;
                    if (((nm70) this.k).o.a((Throwable) obj2, this) == wneVar7) {
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
                    p7m0 p7m0Var = ((nm70) this.k).t;
                    this.j = true;
                    p7m0Var.getClass();
                    p7m0Var.o(null, (xl70) obj2);
                    if (Unit.f46060a == wneVar8) {
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
                    this.j = true;
                    if (((nm70) this.k).s.m(this, (im70) obj2) == wneVar9) {
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
                    this.j = true;
                    if (((wm70) this.k).h.a((Throwable) obj2, this) == wneVar10) {
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
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    lbx lbxVar = (lbx) this.k;
                    y5s y5sVar = ((to70) obj2).z;
                    this.j = true;
                    pbt pbtVar = lbxVar.b;
                    s470 s470Var = y5sVar.f42064a;
                    j5t j5tVar = pbtVar.f26724a;
                    s470Var.getClass();
                    j5tVar.b = true;
                    j5tVar.c = vrs.f37917a;
                    j5tVar.d = false;
                    j5tVar.e = -1;
                    j5tVar.f = false;
                    j5tVar.g = false;
                    j5tVar.h = new HashMap();
                    j5tVar.i = new HashMap();
                    j5tVar.j = new HashMap();
                    j5tVar.k = new dqr(0.0d, 0.0d, 0.0d);
                    j5tVar.l.clear();
                    j5tVar.n = 0.0d;
                    j5tVar.o = 0.0d;
                    j5tVar.p = csr.e;
                    j5tVar.q = null;
                    j5tVar.r = null;
                    j5tVar.s = true;
                    j5tVar.y = false;
                    j5tVar.A = false;
                    j5tVar.t = false;
                    j5tVar.u = false;
                    j5tVar.v = false;
                    j5tVar.z = y5s.i;
                    Log.i("GamesProcess.Flag", "All Cleared");
                    j5tVar.getClass();
                    j5tVar.z = y5sVar;
                    j5t.a(y5sVar, "gameConfig");
                    if (!y5sVar.c || (objA = lbxVar.f19772a.a(false, this)) != wneVar11) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar11) {
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
                    this.j = true;
                    if (((to70) this.k).m.f((zy5) obj2, this) == wneVar12) {
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
                    this.j = true;
                    if (((to70) this.k).B.a((Throwable) obj2, this) == wneVar13) {
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
                    this.j = true;
                    if (((to70) this.k).X.m(this, (io70) obj2) == wneVar14) {
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
                    this.j = true;
                    if (((zo70) this.k).c.a((Throwable) obj2, this) == wneVar15) {
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
                    p7m0 p7m0Var2 = ((zo70) this.k).h;
                    this.j = true;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, (vo70) obj2);
                    if (Unit.f46060a == wneVar16) {
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
                    this.j = true;
                    if (((zo70) this.k).g.m(this, (xo70) obj2) == wneVar17) {
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
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    this.j = true;
                    if (((sp70) this.k).e.f((zy5) obj2, this) == wneVar18) {
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
                    this.j = true;
                    if (((sp70) this.k).D.a((Throwable) obj2, this) == wneVar19) {
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
                    p7m0 p7m0Var3 = ((sp70) this.k).T;
                    this.j = true;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, (bp70) obj2);
                    if (Unit.f46060a == wneVar20) {
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
                    this.j = true;
                    if (((sp70) this.k).S.m(this, (hp70) obj2) == wneVar21) {
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
                nr70 nr70Var = (nr70) this.k;
                wne wneVar22 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    lbu lbuVar = nr70Var.c;
                    nr70Var.d.getClass();
                    this.j = true;
                    objA2 = ((xuy) ((y2x) lbuVar.c).invoke()).a(1, (String) obj2, "application/vnd.xenvelop+json", this);
                    if (objA2 == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                List<tr70> list2 = ((ur70) objA2).f36150a;
                if (list2 != null) {
                    arrayList = new ArrayList(r3d.q(list2, 10));
                    for (tr70 tr70Var : list2) {
                        if (tr70Var == null) {
                            jf4.k(null);
                            return null;
                        }
                        Integer num = tr70Var.f34411a;
                        int iIntValue = num != null ? num.intValue() : 0;
                        String str = tr70Var.b;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        String str3 = tr70Var.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = tr70Var.d;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        arrayList.add(new mr70(iIntValue, str, str3, str2, false));
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                ?? r1 = arrayList;
                yuy yuyVar = nr70Var.f23987a;
                yuyVar.getClass();
                r1.getClass();
                ?? r0 = yuyVar.f43292a;
                do {
                    value = r0.getValue();
                } while (!r0.m(value, r1));
                return Unit.f46060a;
            case 22:
                di80 di80Var = (di80) obj2;
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    yyj0 yyj0Var = (yyj0) this.k;
                    gmq gmqVarS = idx.S(new qmq(i120.W(new i89(new vsg0(new xb2((Object) new fnq((h2c) di80Var.d.c, new ixy(2, r5)), (Object) new zg2(di80Var, (yje) null), (yje) r5, (byte) 24)), (byte) 22)), new za60((yje) r5, (Object) di80Var, (byte) 5), r5, b3));
                    jz6 jz6Var = new jz6(yyj0Var, (byte) 8);
                    this.j = true;
                    if (gmqVarS.c(jz6Var, this) == wneVar23) {
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
                    itb itbVarK = xkb.K(((qi80) this.k).i);
                    lh70 lh70Var = new lh70((yyj0) obj2, (byte) 29);
                    this.j = true;
                    if (itbVarK.c(lh70Var, this) == wneVar24) {
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
                if (z25) {
                    if (z25) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                h2c h2cVar = ((qi80) this.k).d;
                mi80 mi80Var = new mi80((q99) obj2, b2);
                this.j = true;
                h2cVar.c(mi80Var, this);
                return wneVar25;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                mlr mlrVar = (mlr) obj2;
                jt80 jt80Var = (jt80) this.k;
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    pw70 pw70Var = jt80Var.z;
                    int iU = jt80Var.U();
                    String strK = jt80Var.Z.k(jt80Var.O(mlrVar.f22006a));
                    this.j = true;
                    if (pw70.b(pw70Var, mlrVar, strK, iU, false, false, this, 114) == wneVar26) {
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
                String str5 = ((by80) obj2).b;
                gz80 gz80Var = (gz80) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                try {
                    if (!z27) {
                        z1x.P(obj);
                        y3v y3vVar = gz80Var.x;
                        this.j = true;
                        objO = y3vVar.o(str5, this);
                        if (objO == wneVar27) {
                            return wneVar27;
                        }
                    } else {
                        if (!z27) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objO = obj;
                    }
                    ex80Var = (ex80) objO;
                } catch (Exception e) {
                    e.printStackTrace();
                    ex80Var = null;
                }
                int i = gz80.M;
                p7m0 p7m0Var4 = gz80Var.i.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                    az80Var = (az80) value2;
                    linkedHashMap = new LinkedHashMap(az80Var.d);
                    linkedHashMap.put(str5, ex80Var);
                } while (!p7m0Var4.m(value2, az80.a(az80Var, false, null, null, linkedHashMap, 7)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ly80 ly80Var = (ly80) this.k;
                gz80 gz80Var2 = (gz80) obj2;
                wne wneVar28 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    if (ly80Var.equals(hy80.f13848a)) {
                        int i2 = gz80.M;
                        ((uzg) gz80Var2.r).a();
                    } else if (ly80Var.equals(ky80.f19095a)) {
                        int i3 = gz80.M;
                        gz80Var2.N();
                    } else if (ly80Var instanceof jy80) {
                        String str6 = ((jy80) ly80Var).f17347a;
                        int i4 = gz80.M;
                        ArrayList arrayListN0 = CollectionsKt.N0(((az80) gz80Var2.D()).c);
                        String lowerCase = str6.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (arrayListN0.contains(lowerCase)) {
                            arrayListN0.remove(lowerCase);
                        } else {
                            arrayListN0.add(lowerCase);
                            j0g0 j0g0Var = ((az80) gz80Var2.D()).b;
                            if (j0g0Var != null) {
                                Object obj4 = j0g0Var.f15681a;
                                if (obj4 instanceof g0g0) {
                                    obj4 = null;
                                }
                                list = (List) obj4;
                            } else {
                                list = null;
                            }
                            if (list != null) {
                                for (Object obj5 : list) {
                                    if (kotlin.text.c.o(((by80) obj5).f3405a, str6)) {
                                        obj3 = obj5;
                                        by80Var2 = (by80) obj3;
                                        if (by80Var2 != null) {
                                            gz80Var2.M(by80Var2);
                                        }
                                    }
                                }
                                by80Var2 = (by80) obj3;
                                if (by80Var2 != null) {
                                    gz80Var2.M(by80Var2);
                                }
                            }
                        }
                        p7m0 p7m0Var5 = gz80Var2.i.f25029a;
                        do {
                            value3 = p7m0Var5.getValue();
                            value3.getClass();
                            gz80Var2.f.getClass();
                        } while (!p7m0Var5.m(value3, az80.a((az80) value3, false, null, arrayListN0, null, 11)));
                    } else if (ly80Var instanceof iy80) {
                        iy80 iy80Var = (iy80) ly80Var;
                        String str7 = iy80Var.f15577a;
                        long j = iy80Var.b;
                        int i5 = gz80.M;
                        j0g0 j0g0Var2 = ((az80) gz80Var2.D()).b;
                        if (j0g0Var2 != null) {
                            Object obj6 = j0g0Var2.f15681a;
                            if (obj6 instanceof g0g0) {
                                obj6 = null;
                            }
                            List list3 = (List) obj6;
                            if (list3 != null) {
                                for (Object obj7 : list3) {
                                    if (Intrinsics.d(((by80) obj7).f3405a, str7)) {
                                        r5 = obj7;
                                        by80Var = (by80) r5;
                                        if (by80Var != null) {
                                            sac.V(jiu0.a(gz80Var2), new dz80(gz80Var2, b3), null, gz80Var2.v.f22085a, new ir((Object) gz80Var2, j, (Object) by80Var, (yje) null, (byte) 24), 10);
                                        }
                                    }
                                }
                                by80Var = (by80) r5;
                                if (by80Var != null) {
                                    sac.V(jiu0.a(gz80Var2), new dz80(gz80Var2, b3), null, gz80Var2.v.f22085a, new ir((Object) gz80Var2, j, (Object) by80Var, (yje) null, (byte) 24), 10);
                                }
                            }
                        }
                    } else {
                        if (!(ly80Var instanceof gy80)) {
                            t9f.b();
                            return null;
                        }
                        ow80 ow80Var = ((gy80) ly80Var).f12116a;
                        this.j = true;
                        int i6 = gz80.M;
                        if (gz80Var2.O(ow80Var, this) == wneVar28) {
                            return wneVar28;
                        }
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
                    this.j = true;
                    Object objInvoke = ((Function2) this.k).invoke((mz80) obj2, this);
                    return objInvoke == wneVar29 ? wneVar29 : objInvoke;
                }
                if (z29) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                kmq kmqVar = (kmq) this.k;
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    Long l = new Long(((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2).g.b());
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(l, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk70(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
