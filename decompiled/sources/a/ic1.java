package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;

/* JADX INFO: loaded from: classes.dex */
public final class ic1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public Object l;
    public Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(boolean z, nnp nnpVar, List list, zmb zmbVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        this.j = z;
        this.l = nnpVar;
        this.m = list;
        this.n = zmbVar;
    }

    private final Object l(Object obj) {
        t9s t9sVar = (t9s) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (t9sVar.c) {
                pmi pmiVar = (pmi) this.l;
                zos zosVar = (zos) this.m;
                sgs sgsVar = (sgs) this.n;
                this.k = null;
                this.j = true;
                if (pmiVar.H(t9sVar, zosVar, sgsVar, this) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                ic1 ic1Var = new ic1((kc1) this.m, yjeVar);
                ic1Var.k = obj;
                return ic1Var;
            case 1:
                ic1 ic1Var2 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 1);
                ic1Var2.k = obj;
                return ic1Var2;
            case 2:
                return new ic1(this.k, (t33) this.l, (pz40) this.m, (pz40) this.n, yjeVar);
            case 3:
                return new ic1(this.l, this.m, this.n, this.k, yjeVar, (byte) 3);
            case 4:
                ic1 ic1Var3 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 4);
                ic1Var3.k = obj;
                return ic1Var3;
            case 5:
                vae0 vae0Var = (vae0) this.l;
                glz glzVar = (glz) this.m;
                lkz lkzVar = lkz.f20223a;
                ic1 ic1Var4 = new ic1(vae0Var, glzVar, (vp3) this.n, yjeVar);
                ic1Var4.k = obj;
                return ic1Var4;
            case 6:
                xae0 xae0Var = (xae0) this.l;
                glz glzVar2 = (glz) this.m;
                lkz lkzVar2 = lkz.f20223a;
                ic1 ic1Var5 = new ic1(xae0Var, glzVar2, (df2) this.n, yjeVar);
                ic1Var5.k = obj;
                return ic1Var5;
            case 7:
                gmq gmqVar = (gmq) this.l;
                glz glzVar3 = (glz) this.m;
                lkz lkzVar3 = lkz.f20223a;
                ic1 ic1Var6 = new ic1(gmqVar, glzVar3, (df2) this.n, yjeVar);
                ic1Var6.k = obj;
                return ic1Var6;
            case 8:
                return new ic1((diu0) this.k, yjeVar, (byte) 8);
            case 9:
                return new ic1((diu0) this.k, yjeVar, (byte) 9);
            case 10:
                ic1 ic1Var7 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 10);
                ic1Var7.k = obj;
                return ic1Var7;
            case 11:
                return new ic1(this.l, this.m, this.n, this.k, yjeVar, (byte) 11);
            case 12:
                ic1 ic1Var8 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 12);
                ic1Var8.k = obj;
                return ic1Var8;
            case 13:
                return new ic1(this.l, this.m, this.n, this.k, yjeVar, (byte) 13);
            case 14:
                ic1 ic1Var9 = new ic1((gmq) this.l, yjeVar, this.m, this.n, (byte) 14);
                ic1Var9.k = obj;
                return ic1Var9;
            case 15:
                ic1 ic1Var10 = new ic1((gmq) this.l, yjeVar, this.m, this.n, (byte) 15);
                ic1Var10.k = obj;
                return ic1Var10;
            case 16:
                return new ic1(this.l, this.m, this.n, this.k, yjeVar, (byte) 16);
            case 17:
                return new ic1(this.l, this.m, this.n, this.k, yjeVar, (byte) 17);
            case 18:
                ic1 ic1Var11 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 18);
                ic1Var11.k = obj;
                return ic1Var11;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ic1(this.l, this.m, this.n, this.k, yjeVar, (byte) 19);
            case 20:
                return new ic1(this.l, this.m, this.n, this.k, yjeVar, (byte) 20);
            case 21:
                ic1 ic1Var12 = new ic1((gmq) this.l, yjeVar, this.m, this.n, (byte) 21);
                ic1Var12.k = obj;
                return ic1Var12;
            case 22:
                return new ic1((rzj) this.l, yjeVar, this.m, this.n, this.k, (byte) 22);
            case 23:
                return new ic1((rzj) this.l, yjeVar, this.m, this.n, this.k, (byte) 23);
            case 24:
                ic1 ic1Var13 = new ic1((mie0) this.m, (hel) this.n, yjeVar);
                ic1Var13.k = obj;
                return ic1Var13;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ic1 ic1Var14 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 25);
                ic1Var14.k = obj;
                return ic1Var14;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ic1 ic1Var15 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 26);
                ic1Var15.k = obj;
                return ic1Var15;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ic1 ic1Var16 = new ic1(this.j, (nnp) this.l, (List) this.m, (zmb) this.n, yjeVar);
                ic1Var16.k = obj;
                return ic1Var16;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ic1 ic1Var17 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 28);
                ic1Var17.k = obj;
                return ic1Var17;
            default:
                ic1 ic1Var18 = new ic1(this.l, this.m, this.n, yjeVar, (byte) 29);
                ic1Var18.k = obj;
                return ic1Var18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.i) {
            case 0:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                ((ic1) create((c13) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 2:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ic1) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ic1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ic1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ic1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ic1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ic1) create((Function1) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ic1) create((ov2) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ic1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ic1) create((IndexedValue) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ic1) create((t9s) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ic1) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:356:0x087a  */
    /* JADX WARN: Code duplicated, block: B:99:0x02db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v189 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0302 -> B:113:0x0304). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0307 -> B:115:0x030a). Please report as a decompilation issue!!! */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        f02 f02Var;
        p7m0 p7m0Var;
        Object objP;
        String str;
        ?? r1;
        n3w n3wVarD;
        f47 f47Var;
        Object objA;
        kd7 kd7Var;
        String str2;
        Object objC;
        Object g0g0Var;
        Object objC2;
        Object objA2;
        Object objA3;
        Function1 function1;
        Object obj2;
        Function1 function2;
        rdl rdlVar;
        mie0 mie0Var;
        Object objG;
        Object value;
        Object value2;
        Object value3;
        hzb0 hzb0Var;
        ?? r2 = "";
        byte b = 6;
        byte b2 = 4;
        byte b3 = 1;
        ?? r8 = 0;
        switch (this.i) {
            case 0:
                kc1 kc1Var = (kc1) this.m;
                vne vneVar = (vne) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    f02Var = ((xb1) kc1Var.D()).b;
                    if (f02Var == null) {
                        List list = kc1.P;
                        kc1Var.G(mb1.f21483a);
                    } else if (((xb1) kc1Var.D()).d) {
                        hcp0 hcp0Var = kc1Var.C;
                        this.k = vneVar;
                        this.l = kc1Var;
                        this.n = f02Var;
                        this.j = true;
                        if (hcp0Var.q(this) == wneVar) {
                            return wneVar;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f02 f02Var2 = (f02) this.n;
                kc1 kc1Var2 = (kc1) this.l;
                z1x.P(obj);
                f02Var = f02Var2;
                kc1Var = kc1Var2;
                boolean z2 = ((xb1) kc1Var.D()).f40578a.f;
                oeg0 oeg0Var = kc1Var.p;
                if (z2) {
                    oeg0Var.c().d(new hc1(f02Var, kc1Var));
                } else {
                    oeg0Var.c().d(new hc1(kc1Var, f02Var));
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    wn2 wn2Var = new wn2(this.k, this.l, this.m, this.n, (yje) null, (byte) 1);
                    this.j = true;
                    if (d5c.J(this, wn2Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                csj.b();
                return null;
            case 2:
                t33 t33Var = (t33) this.l;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (!Intrinsics.d(this.k, ((hgk0) t33Var.e).getValue())) {
                        t33 t33Var2 = (t33) this.l;
                        Object obj3 = this.k;
                        pz40 pz40Var = (pz40) this.m;
                        nul0 nul0Var = d43.f5435a;
                        j73 j73Var = (j73) pz40Var.getValue();
                        this.j = true;
                        if (t33.a(t33Var2, obj3, j73Var, null, null, this, 12) == wneVar3) {
                            return wneVar3;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                pz40 pz40Var2 = (pz40) this.n;
                nul0 nul0Var2 = d43.f5435a;
                Function1 function3 = (Function1) pz40Var2.getValue();
                if (function3 != null) {
                    function3.invoke(t33Var.d());
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ehf0 ehf0Var = ((rv3) this.l).f;
                    String str3 = (String) this.m;
                    String str4 = (String) this.n;
                    String str5 = (String) this.k;
                    this.j = true;
                    if (ehf0Var.r(str3, str4, str5, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                kmq kmqVar = (kmq) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    ts4 ts4Var = (ts4) this.l;
                    c00 c00VarG = ts4Var.g((ckk0) this.m, ts4Var.h.a(), (String) this.n);
                    this.k = null;
                    this.j = true;
                    if (slb.Q(kmqVar, c00VarG, this) == wneVar5) {
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
                vne vneVar2 = (vne) this.k;
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((vae0) this.l, (glz) this.m, lkz.d);
                    me5 me5Var = new me5(vneVar2, (vp3) this.n, (yje) r8, b2);
                    this.k = null;
                    this.j = true;
                    if (slb.O(bq9VarB, me5Var, this) == wneVar6) {
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
                vne vneVar3 = (vne) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((xae0) this.l, (glz) this.m, lkz.d);
                    me5 me5Var2 = new me5((Object) vneVar3, this.n, (yje) r8, (byte) 5);
                    this.k = null;
                    this.j = true;
                    if (slb.O(bq9VarB2, me5Var2, this) == wneVar7) {
                        return wneVar7;
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
                vne vneVar4 = (vne) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((gmq) this.l, (glz) this.m, lkz.d);
                    me5 me5Var3 = new me5(vneVar4, (df2) this.n, (yje) r8, b);
                    this.k = null;
                    this.j = true;
                    if (slb.O(bq9VarB3, me5Var3, this) == wneVar8) {
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
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    me6 me6Var = (me6) this.k;
                    p7m0Var = me6Var.z;
                    this.l = p7m0Var;
                    this.m = "";
                    this.n = "";
                    this.j = true;
                    objP = me6Var.o.a() == q4f.m ? me6Var.t.p(me6Var.b, this) : Boolean.FALSE;
                    if (objP == wneVar9) {
                        return wneVar9;
                    }
                    str = "";
                    r1 = r2;
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str6 = (String) this.n;
                    String str7 = (String) this.m;
                    p7m0 p7m0Var2 = (p7m0) this.l;
                    z1x.P(obj);
                    r1 = str7;
                    str = str6;
                    p7m0Var = p7m0Var2;
                    objP = obj;
                }
                zd6 zd6Var = new zd6(r1, str, ((Boolean) objP).booleanValue());
                p7m0Var.getClass();
                p7m0Var.o(null, zd6Var);
                return Unit.f46060a;
            case 9:
                kd7 kd7Var2 = (kd7) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    String str8 = kd7Var2.o;
                    pru pruVar = kd7Var2.z;
                    a5w a5wVar = ((rc7) kd7Var2.D()).d;
                    if (a5wVar == null) {
                        n3wVarD = n3w.d(n3w.Q1, str8, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, false, null, null, null, -2, -1);
                    } else if (a5wVar instanceof vw4) {
                        vw4 vw4Var = (vw4) a5wVar;
                        HistoryTypeModel historyTypeModel = HistoryTypeModel.EVENTS;
                        ql5 ql5Var = ((rc7) kd7Var2.D()).h;
                        String str9 = ql5Var != null ? ql5Var.f : null;
                        n3wVarD = ckb.e0(vw4Var, historyTypeModel, str9 == null ? "" : str9, false, pruVar.a().f32117a.b.h, ((rc7) kd7Var2.D()).n, ((rc7) kd7Var2.D()).i, ((rc7) kd7Var2.D()).o, ((rc7) kd7Var2.D()).j, ((rc7) kd7Var2.D()).p, ((rc7) kd7Var2.D()).q);
                    } else if (a5wVar instanceof kzv) {
                        kzv kzvVar = (kzv) a5wVar;
                        HistoryTypeModel historyTypeModel2 = HistoryTypeModel.AUTO;
                        ql5 ql5Var2 = ((rc7) kd7Var2.D()).h;
                        String str10 = ql5Var2 != null ? ql5Var2.f : null;
                        n3wVarD = ckb.f0(kzvVar, historyTypeModel2, str10 == null ? "" : str10, false, pruVar.a().f32117a.b.h, ((rc7) kd7Var2.D()).n, ((rc7) kd7Var2.D()).i, ((rc7) kd7Var2.D()).o, ((rc7) kd7Var2.D()).j, ((rc7) kd7Var2.D()).p, ((rc7) kd7Var2.D()).q);
                    } else if (a5wVar instanceof z7y) {
                        n3wVarD = ckb.g0((z7y) a5wVar);
                    } else if (a5wVar instanceof for0) {
                        for0 for0Var = (for0) a5wVar;
                        ql5 ql5Var3 = ((rc7) kd7Var2.D()).h;
                        String str11 = ql5Var3 != null ? ql5Var3.f : null;
                        n3wVarD = ckb.i0(for0Var, str11 != null ? str11 : "");
                    } else if (a5wVar instanceof nc10) {
                        nc10 nc10Var = (nc10) a5wVar;
                        ql5 ql5Var4 = ((rc7) kd7Var2.D()).h;
                        r8 = ql5Var4 != null ? ql5Var4.f : 0;
                        n3wVarD = ckb.h0(nc10Var, r8 != 0 ? r8 : "");
                    } else {
                        n3wVarD = n3w.d(n3w.Q1, str8, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, false, null, null, null, -2, -1);
                    }
                    kd7Var2.M.g(piz.X(n3wVarD));
                    ryu ryuVar = kd7Var2.Z;
                    a5w a5wVar2 = ((rc7) kd7Var2.D()).d;
                    if (a5wVar2 == null) {
                        return Unit.f46060a;
                    }
                    ryuVar.b(a5wVar2);
                    f47Var = kd7Var2.e0;
                    String str12 = kd7Var2.o;
                    this.l = kd7Var2;
                    this.m = f47Var;
                    this.n = str12;
                    this.j = true;
                    objA = ((rc7) kd7Var2.D()).h;
                    if (objA == null) {
                        objA = kd7Var2.Q.a(kd7Var2.p.b, this);
                    }
                    if (objA == wneVar10) {
                        return wneVar10;
                    }
                    kd7Var = kd7Var2;
                    str2 = str12;
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.n;
                    f47Var = (f47) this.m;
                    kd7 kd7Var3 = (kd7) this.l;
                    z1x.P(obj);
                    objA = obj;
                    kd7Var = kd7Var3;
                }
                i3t0.A(kd7Var, f47Var, new m0k(str2, ((ql5) objA).f28916a), null, null, 6);
                return Unit.f46060a;
            case 10:
                vne vneVar5 = (vne) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    ay90 ay90Var = (ay90) ((pz40) this.m).getValue();
                    if (ay90Var == null) {
                        return Unit.f46060a;
                    }
                    if (!ay90Var.b) {
                        long jA = ((dfu0) this.l).a();
                        this.k = vneVar5;
                        this.j = true;
                        if (qcc.P(jA, this) == wneVar11) {
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
                ExoPlayer exoPlayer = (ExoPlayer) this.n;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    ulo uloVar = (ulo) exoPlayer;
                    uloVar.I(uloVar.j(), -9223372036854775807L, false);
                    uloVar.E();
                    break;
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                }
                return Unit.f46060a;
            case 11:
                gbe0 gbe0Var = (gbe0) this.n;
                String str13 = (String) this.m;
                Context context = (Context) this.l;
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    k1x k1xVar = new k1x(context);
                    k1xVar.c = str13;
                    vi9 vi9Var = vi9.d;
                    k1xVar.m = vi9Var;
                    k1xVar.n = vi9Var;
                    k1xVar.o = vi9.e;
                    o1x o1xVarA = k1xVar.a();
                    this.j = true;
                    objC = gbe0Var.c(o1xVarA, this);
                    if (objC == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                u1x u1xVar = (u1x) objC;
                boolean z14 = u1xVar instanceof hhn0;
                pz40 pz40Var3 = (pz40) this.k;
                if (z14) {
                    pz40Var3.setValue(new a2x(((hhn0) u1xVar).f13073a));
                } else {
                    pz40Var3.setValue(c2x.f3645a);
                    k1x k1xVar2 = new k1x(context);
                    k1xVar2.c = str13;
                    vi9 vi9Var2 = vi9.c;
                    k1xVar2.m = vi9Var2;
                    k1xVar2.n = vi9Var2;
                    k1xVar2.o = vi9Var2;
                    gbe0Var.a(k1xVar2.a());
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z15 = this.j;
                try {
                    if (!z15) {
                        z1x.P(obj);
                        k1x k1xVar3 = new k1x(((t0d) this.l).f33114a);
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str14 = (String) this.m;
                        str14.getClass();
                        if (str14.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str14, ujn.h, false) || kotlin.text.c.x(str14, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str14);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str14, '/'));
                        }
                        k1xVar3.c = sb.toString();
                        t1x.a(k1xVar3, false);
                        o1x o1xVarA2 = k1xVar3.a();
                        gbe0 gbe0Var2 = (gbe0) this.n;
                        e0g0 e0g0Var3 = j0g0.b;
                        this.k = null;
                        this.j = true;
                        objC2 = gbe0Var2.c(o1xVarA2, this);
                        if (objC2 == wneVar13) {
                            return wneVar13;
                        }
                    } else {
                        if (!z15) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objC2 = obj;
                    }
                    g0g0Var = (u1x) objC2;
                    e0g0 e0g0Var4 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var5 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                return new j0g0(g0g0Var);
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    gkd gkdVar = (gkd) this.l;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.m;
                    Rect rect = (Rect) this.n;
                    mkx mkxVar = new mkx(rect.left, rect.top, rect.right, rect.bottom);
                    this.j = true;
                    objA2 = gkdVar.a(scrollCaptureSession, mkxVar, this);
                    if (objA2 == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                ((Consumer) this.k).accept(e9x.U((mkx) objA2));
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    kmq kmqVar2 = (kmq) this.k;
                    fnq fnqVar = (fnq) this.l;
                    yj2 yj2Var = new yj2((Object) kmqVar2, this.m, this.n, (byte) 3);
                    this.k = null;
                    this.j = true;
                    if (fnqVar.c(yj2Var, this) == wneVar15) {
                        return wneVar15;
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
                wne wneVar16 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    kmq kmqVar3 = (kmq) this.k;
                    p5a p5aVar = (p5a) this.l;
                    yj2 yj2Var2 = new yj2(kmqVar3, (mie0) this.m, (g1e) this.n, b2);
                    this.k = null;
                    this.j = true;
                    if (p5aVar.c(yj2Var2, this) == wneVar16) {
                        return wneVar16;
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
                wne wneVar17 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    zas0 zas0Var = (zas0) this.l;
                    ppv0 ppv0Var = (ppv0) this.m;
                    this.j = true;
                    objA3 = i4e.a(zas0Var, ppv0Var, this);
                    if (objA3 == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                ((AtomicInteger) this.n).set(((Number) objA3).intValue());
                ((ig00) this.k).cancel(true);
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z20 = this.j;
                if (z20) {
                    if (z20) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.l;
                og00 og00Var = (og00) this.m;
                zas0 zas0Var2 = (zas0) this.n;
                ppv0 ppv0Var2 = (ppv0) this.k;
                this.j = true;
                Object objE = constraintTrackingWorker.e(og00Var, zas0Var2, ppv0Var2, this);
                return objE == wneVar18 ? wneVar18 : objE;
            case 18:
                Function0 function0 = (Function0) this.n;
                vne vneVar6 = (vne) this.k;
                wne wneVar19 = wne.f39444a;
                boolean z21 = this.j;
                try {
                    if (!z21) {
                        z1x.P(obj);
                        Function2 function4 = (Function2) this.l;
                        this.k = null;
                        this.j = true;
                        if (function4.invoke(vneVar6, this) == wneVar19) {
                            return wneVar19;
                        }
                    } else {
                        if (!z21) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    if (function0 != null) {
                    }
                } catch (Throwable th2) {
                    try {
                        ((Function1) this.m).invoke(th2);
                    } finally {
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new vef((l7m0) this.l, (d9z) this.m, b3)));
                    na naVar = new na((x3m) this.n, (vne) this.k, (byte) 25);
                    this.j = true;
                    if (gmqVarW.c(naVar, this) == wneVar20) {
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
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    if (((Boolean) ((l7m0) this.l).getValue()).booleanValue()) {
                        d9z d9zVar = (d9z) this.m;
                        this.j = true;
                        v0h0 v0h0Var = d9z.w;
                        if (d9zVar.l(0, 0, this) == wneVar21) {
                            return wneVar21;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z23) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ((yog) this.n).b.m(0.0f);
                ((Function0) this.k).invoke();
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    kmq kmqVar4 = (kmq) this.k;
                    utb utbVar = (utb) this.l;
                    yj2 yj2Var3 = new yj2(kmqVar4, (o3c) this.m, (sip) this.n, b);
                    this.k = null;
                    this.j = true;
                    if (utbVar.c(yj2Var3, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z25 = this.j;
                if (z25) {
                    if (z25) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                jzj jzjVarH = ((rzj) this.l).n().h((Map) this.m, (oot0) this.n, (crd) this.k);
                this.j = true;
                Object objAwait = jzjVarH.await(this);
                return objAwait == wneVar23 ? wneVar23 : objAwait;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z26 = this.j;
                if (z26) {
                    if (z26) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                jzj jzjVarF = ((rzj) this.l).n().f((List) this.m, (List) this.n, (List) this.k);
                this.j = true;
                Object objQ = ((odd) jzjVarF).q(this);
                return objQ == wneVar24 ? wneVar24 : objQ;
            case 24:
                mie0 mie0Var2 = (mie0) this.m;
                wne wneVar25 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    function1 = (Function1) this.k;
                    obj2 = mie0Var2.f21842a;
                    if (!(obj2 instanceof qdl) || (obj2 instanceof ndl)) {
                        return Unit.f46060a;
                    }
                    odl odlVar = obj2 instanceof odl ? (odl) obj2 : null;
                    if (odlVar != null) {
                        function1.invoke(odlVar);
                    }
                    q99 q99Var = ((hel) this.n).u;
                    if (q99Var != null) {
                        this.k = function1;
                        this.l = mie0Var2;
                        this.j = true;
                        objG = q99Var.g(this);
                        if (objG == wneVar25) {
                            return wneVar25;
                        }
                        function2 = function1;
                        mie0Var = mie0Var2;
                    } else {
                        function2 = function1;
                        rdlVar = null;
                        mie0Var = mie0Var2;
                    }
                    mie0Var.f21842a = rdlVar;
                    function1 = function2;
                    obj2 = mie0Var2.f21842a;
                    if (obj2 instanceof qdl) {
                    }
                    return Unit.f46060a;
                }
                if (!z27) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mie0 mie0Var3 = (mie0) this.l;
                Function1 function5 = (Function1) this.k;
                z1x.P(obj);
                function2 = function5;
                mie0Var = mie0Var3;
                objG = obj;
                rdlVar = (rdl) objG;
                mie0Var.f21842a = rdlVar;
                function1 = function2;
                obj2 = mie0Var2.f21842a;
                if (obj2 instanceof qdl) {
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    ov2 ov2Var = (ov2) this.k;
                    ic1 ic1Var = (ic1) this.l;
                    sw8 sw8Var = new sw8((Object) ov2Var, this.m, this.n, (byte) 27);
                    this.j = true;
                    if (ic1Var.invoke(sw8Var, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    vne vneVar7 = (vne) this.k;
                    vel velVar = (vel) this.l;
                    xdr xdrVar = velVar.n1;
                    long jF = g6u0.f(velVar.o1 ? -1.0f : 1.0f, ((qdl) this.m).f28539a);
                    ma80 ma80Var = (ma80) this.n;
                    bk9 bk9Var = uel.f35535a;
                    Float f = new Float(ma80Var == ma80.f21447a ? g6u0.c(jF) : g6u0.b(jF));
                    this.j = true;
                    if (xdrVar.F(vneVar7, f, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                nnp nnpVar = (nnp) this.l;
                oyg0 oyg0Var = nnpVar.f;
                ocj ocjVar = nnpVar.i;
                IndexedValue indexedValue = (IndexedValue) this.k;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                int i = indexedValue.f46061a;
                jnb jnbVar = (jnb) indexedValue.b;
                if (this.j && i == 0) {
                    List list2 = (List) this.m;
                    int i2 = nnp.a0;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value3, xmp.a((xmp) value3, null, null, null, null, null, false, false, list2, false, null, false, 16127)));
                }
                zmb zmbVar = (zmb) this.n;
                int i3 = nnp.a0;
                List list3 = jnbVar.f16804a.f18576a;
                FeedsChampsItemsSelectionState feedsChampsItemsSelectionState = ((xmp) nnpVar.D()).e;
                byte b4 = 8;
                xww.q(feedsChampsItemsSelectionState.b, list3, new jbp(b4), new f5p(feedsChampsItemsSelectionState, nnpVar, b4));
                p7m0 p7m0Var4 = ocjVar.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                    oyg0 oyg0Var2 = oyg0Var;
                    jnb jnbVar2 = jnbVar;
                    if (p7m0Var4.m(value4, xmp.a((xmp) value4, jnbVar, null, null, null, null, false, false, null, false, null, false, 16382))) {
                        if (((xmp) nnpVar.D()).m != zmbVar) {
                            if (((xmp) nnpVar.D()).e.f46666a) {
                                List list4 = jnbVar2.f16804a.f18576a;
                                ArrayList<rbb> arrayList = new ArrayList();
                                for (Object obj4 : list4) {
                                    List list5 = ((rbb) obj4).d;
                                    if (list5 == null || !list5.isEmpty()) {
                                        Iterator it = list5.iterator();
                                        while (it.hasNext()) {
                                            if (((xmp) nnpVar.D()).e.b.contains(Long.valueOf(((sum0) it.next()).f32829a))) {
                                                arrayList.add(obj4);
                                            }
                                            break;
                                        }
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                for (rbb rbbVar : arrayList) {
                                    arrayList2.add(f7k.K(zmbVar, rbbVar.f30176a, rbbVar.n));
                                }
                                LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(((xmp) nnpVar.D()).d);
                                linkedHashSetO0.addAll(arrayList2);
                                nnpVar.o.e("EXPANDED_STATE_KEY", linkedHashSetO0);
                                p7m0 p7m0Var5 = ocjVar.f25029a;
                                do {
                                    value2 = p7m0Var5.getValue();
                                    value2.getClass();
                                    oyg0Var2.getClass();
                                } while (!p7m0Var5.m(value2, xmp.a((xmp) value2, null, null, null, linkedHashSetO0, null, false, false, null, false, null, false, 16375)));
                            }
                            p7m0 p7m0Var6 = ocjVar.f25029a;
                            while (true) {
                                Object value5 = p7m0Var6.getValue();
                                value5.getClass();
                                oyg0Var2.getClass();
                                zmb zmbVar2 = zmbVar;
                                if (!p7m0Var6.m(value5, xmp.a((xmp) value5, null, null, null, null, null, false, false, null, false, zmbVar2, false, 12287))) {
                                    zmbVar = zmbVar2;
                                }
                            }
                        }
                        p7m0 p7m0Var7 = ocjVar.f25029a;
                        do {
                            value = p7m0Var7.getValue();
                            value.getClass();
                            oyg0Var2.getClass();
                        } while (!p7m0Var7.m(value, xmp.a((xmp) value, null, null, null, null, null, false, false, null, false, null, false, 16159)));
                        return Unit.f46060a;
                    }
                    jnbVar = jnbVar2;
                    oyg0Var = oyg0Var2;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return l(obj);
            default:
                wne wneVar29 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    hzb0 hzb0Var2 = (hzb0) this.k;
                    glz glzVar = (glz) this.l;
                    lkz lkzVar = (lkz) this.m;
                    cbq cbqVar = new cbq((gmq) this.n, hzb0Var2, r8, b2);
                    this.k = hzb0Var2;
                    this.j = true;
                    if (efx.H(glzVar, lkzVar, cbqVar, this) == wneVar29) {
                        return wneVar29;
                    }
                    hzb0Var = hzb0Var2;
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hzb0Var = (hzb0) this.k;
                    z1x.P(obj);
                }
                hzb0Var.e0(null);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic1(rzj rzjVar, yje yjeVar, Object obj, Object obj2, Object obj3, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = rzjVar;
        this.m = obj;
        this.n = obj2;
        this.k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic1(gmq gmqVar, yje yjeVar, Object obj, Object obj2, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = gmqVar;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(gmq gmqVar, glz glzVar, df2 df2Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.m = glzVar;
        this.n = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(vae0 vae0Var, glz glzVar, vp3 vp3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.l = vae0Var;
        this.m = glzVar;
        this.n = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(xae0 xae0Var, glz glzVar, df2 df2Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.m = glzVar;
        this.n = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(mie0 mie0Var, hel helVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.m = mie0Var;
        this.n = helVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic1(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(Object obj, t33 t33Var, pz40 pz40Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.k = obj;
        this.l = t33Var;
        this.m = pz40Var;
        this.n = pz40Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic1(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic1(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.k = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(kc1 kc1Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.m = kc1Var;
    }
}
