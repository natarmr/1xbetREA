package a;

import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.domain.models.AggregatorGameLanguage;

/* JADX INFO: loaded from: classes3.dex */
public final class d09 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d09(boolean z, dfu0 dfu0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.j = z;
        this.k = dfu0Var;
        this.l = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new d09(this.k, obj2, yjeVar, (byte) 0);
            case 1:
                return new d09(this.k, obj2, yjeVar, (byte) 1);
            case 2:
                return new d09(this.k, obj2, yjeVar, (byte) 2);
            case 3:
                return new d09(this.k, obj2, yjeVar, (byte) 3);
            case 4:
                return new d09(this.k, obj2, yjeVar, (byte) 4);
            case 5:
                return new d09(this.k, obj2, yjeVar, (byte) 5);
            case 6:
                return new d09(this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new d09(this.j, (dfu0) this.k, (pz40) obj2, yjeVar);
            case 8:
                d09 d09Var = new d09(obj2, yjeVar, (byte) 8);
                d09Var.k = obj;
                return d09Var;
            case 9:
                return new d09(this.k, obj2, yjeVar, (byte) 9);
            case 10:
                d09 d09Var2 = new d09(obj2, yjeVar, (byte) 10);
                d09Var2.k = obj;
                return d09Var2;
            case 11:
                return new d09(this.k, obj2, yjeVar, (byte) 11);
            case 12:
                d09 d09Var3 = new d09(obj2, yjeVar, (byte) 12);
                d09Var3.k = obj;
                return d09Var3;
            case 13:
                d09 d09Var4 = new d09(obj2, yjeVar, (byte) 13);
                d09Var4.k = obj;
                return d09Var4;
            case 14:
                d09 d09Var5 = new d09(obj2, yjeVar, (byte) 14);
                d09Var5.k = obj;
                return d09Var5;
            case 15:
                return new d09(this.k, obj2, yjeVar, (byte) 15);
            case 16:
                return new d09(this.k, obj2, yjeVar, (byte) 16);
            case 17:
                return new d09(this.k, obj2, yjeVar, (byte) 17);
            case 18:
                return new d09(this.k, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new d09(this.k, obj2, yjeVar, (byte) 19);
            case 20:
                return new d09(this.k, obj2, yjeVar, (byte) 20);
            case 21:
                d09 d09Var6 = new d09(obj2, yjeVar, (byte) 21);
                d09Var6.k = obj;
                return d09Var6;
            case 22:
                return new d09(this.k, obj2, yjeVar, (byte) 22);
            case 23:
                return new d09(this.k, obj2, yjeVar, (byte) 23);
            case 24:
                d09 d09Var7 = new d09((plb) obj2, this.j, yjeVar);
                d09Var7.k = obj;
                return d09Var7;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new d09(this.k, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new d09(obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new d09(obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new d09(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new d09(this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((d09) create((rvm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((d09) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((d09) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((d09) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((d09) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((d09) create((l9s) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((d09) create((jkb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((d09) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((d09) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v59, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ArrayList arrayList;
        Object objO;
        Object value2;
        Object objO2;
        Object value3;
        Object value4;
        Object objA;
        Object objA2;
        Object value5;
        plb plbVar;
        Long lN;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        eqb eqbVar;
        Object objA3;
        boolean z;
        ctf0 ctf0Var;
        String strA;
        p7m0 p7m0Var;
        Object objE;
        Object value6;
        byte b = 29;
        byte b2 = 28;
        byte b3 = 0;
        ?? arrayList2 = 0;
        ?? r8 = 0;
        ?? r9 = 0;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    e09 e09Var = (e09) this.k;
                    gut gutVar = e09Var.s;
                    List list = ((zz8) e09Var.D()).f45239a;
                    LinkedHashSet linkedHashSet = (LinkedHashSet) this.l;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (linkedHashSet.contains(new Integer(((AggregatorGameLanguage) obj2).f46282a))) {
                            arrayList3.add(obj2);
                        }
                    }
                    this.j = true;
                    Object objE2 = ((gw8) gutVar.f11947a.f6397a).e(arrayList3, this);
                    wne wneVar2 = wne.f39444a;
                    if (objE2 != wneVar2) {
                        objE2 = Unit.f46060a;
                    }
                    if (objE2 != wneVar2) {
                        objE2 = Unit.f46060a;
                    }
                    if (objE2 == wneVar) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new md0((d9z) this.k, (byte) 5)));
                    k19 k19Var = new k19((m19) this.l, (byte) 0);
                    this.j = true;
                    if (gmqVarW.c(k19Var, this) == wneVar3) {
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
            case 2:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    d9z d9zVar = (d9z) this.k;
                    this.j = true;
                    v0h0 v0h0Var = d9z.w;
                    if (d9zVar.l(0, 0, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((nyq0) this.l).getState().c(0.0f);
                return Unit.f46060a;
            case 3:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    qoj0 qoj0Var = ((s29) this.k).X;
                    String str = (String) this.l;
                    this.j = true;
                    if (qoj0Var.a(str, this) == wneVar5) {
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
            case 4:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    a39 a39Var = (a39) this.k;
                    vb8 vb8Var = new vb8(this.l, (byte) 14);
                    this.j = true;
                    if (b34.S(a39Var, vb8Var, this) == wneVar6) {
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
            case 5:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    g39 g39Var = (g39) this.k;
                    kk0 kk0Var = (kk0) this.l;
                    this.j = true;
                    if (b34.S(g39Var, kk0Var, this) == wneVar7) {
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
            case 6:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    xk80 xk80Var = (xk80) this.k;
                    int i = ((y9j) this.l).b;
                    this.j = true;
                    if (xk80.g(xk80Var, i, null, this, 6) == wneVar8) {
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
            case 7:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                pz40 pz40Var = (pz40) this.l;
                ay90 ay90Var = (ay90) pz40Var.getValue();
                if (this.j && ay90Var != null) {
                    ((dfu0) this.k).f6017a = 0;
                    pz40Var.setValue(new ay90(ay90Var.f1661a + 1, true));
                }
                return Unit.f46060a;
            case 8:
                ab9 ab9Var = (ab9) this.l;
                rvm0 rvm0Var = (rvm0) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    int i2 = ab9.B;
                    p7m0 p7m0Var2 = ab9Var.i.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, pa9.a((pa9) value, null, null, rvm0Var, false, null, null, null, null, false, 507)));
                    this.k = null;
                    this.j = true;
                    if (ab9Var.M(this) == wneVar10) {
                        return wneVar10;
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
                wne wneVar11 = wne.f39444a;
                boolean z10 = this.j;
                if (z10) {
                    if (z10) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0Var2 = ((gy40) this.k).f12108a;
                k19 k19Var2 = new k19((SnapshotStateList) this.l, (byte) 7);
                this.j = true;
                qoj0Var2.c(k19Var2, this);
                return wneVar11;
            case 10:
                wne wneVar12 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    kmq kmqVar = (kmq) this.k;
                    kie0 kie0Var = new kie0();
                    kie0Var.f18333a = Integer.MIN_VALUE;
                    fnq fnqVar = new fnq((s6n0) ((gr00) this.l).c, new pd(2, r8 == true ? 1 : 0, (byte) 23), (byte) 2);
                    xj9 xj9Var = new xj9(kie0Var, kmqVar);
                    this.j = true;
                    if (fnqVar.c(xj9Var, this) == wneVar12) {
                        return wneVar12;
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
                wne wneVar13 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    gmq gmqVar = (gmq) this.k;
                    k19 k19Var3 = new k19((gr00) this.l, (byte) 8);
                    this.j = true;
                    Object objC = gmqVar.c(new xj9(k19Var3, new kie0()), this);
                    if (objC != wneVar13) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar13) {
                        return wneVar13;
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
                mii0 mii0Var = (mii0) this.l;
                qcq0 qcq0Var = (qcq0) mii0Var.c;
                wne wneVar14 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    hzb0 hzb0Var = (hzb0) this.k;
                    xv9 xv9Var = new xv9(hzb0Var);
                    CameraManager cameraManager = (CameraManager) ((o5d0) mii0Var.b).get();
                    if (Build.VERSION.SDK_INT >= 28) {
                        cameraManager.getClass();
                        Executor executor = (Executor) qcq0Var.j.getValue();
                        executor.getClass();
                        cameraManager.registerAvailabilityCallback(executor, xv9Var);
                    } else {
                        cameraManager.registerAvailabilityCallback(xv9Var, qcq0Var.a());
                    }
                    gj4 gj4Var = new gj4(cameraManager, xv9Var, b2);
                    this.j = true;
                    if (q7x.t(hzb0Var, gj4Var, this) == wneVar14) {
                        return wneVar14;
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
                qw9 qw9Var = (qw9) this.l;
                qcq0 qcq0Var2 = qw9Var.f29425a;
                wne wneVar15 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    hzb0 hzb0Var2 = (hzb0) this.k;
                    pw9 pw9Var = new pw9(hzb0Var2, qw9Var);
                    int i3 = Build.VERSION.SDK_INT;
                    CameraManager cameraManager2 = qw9Var.c;
                    if (i3 >= 28) {
                        cameraManager2.getClass();
                        Executor executor2 = qcq0Var2.g;
                        executor2.getClass();
                        cameraManager2.registerAvailabilityCallback(executor2, pw9Var);
                    } else {
                        cameraManager2.registerAvailabilityCallback(pw9Var, qcq0Var2.a());
                    }
                    gj4 gj4Var2 = new gj4(qw9Var, pw9Var, b);
                    this.j = true;
                    if (q7x.t(hzb0Var2, gj4Var2, this) == wneVar15) {
                        return wneVar15;
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
                wne wneVar16 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    hzb0 hzb0Var3 = (hzb0) this.k;
                    pw9 pw9Var2 = new pw9((cx9) this.l, hzb0Var3);
                    CameraManager cameraManager3 = (CameraManager) ((cx9) this.l).f5112a.get();
                    cameraManager3.registerAvailabilityCallback(pw9Var2, ((cx9) this.l).b.a());
                    cx9 cx9Var = (cx9) this.l;
                    synchronized (cx9Var.f) {
                        arrayList = cx9Var.g;
                    }
                    cx9 cx9Var2 = (cx9) this.l;
                    if (arrayList != null) {
                        cx9.e(hzb0Var3, arrayList);
                    } else {
                        ArrayList arrayListD = cx9Var2.d();
                        if (arrayListD != null) {
                            cx9.e(hzb0Var3, arrayListD);
                        }
                    }
                    yw9 yw9Var = new yw9(cameraManager3, pw9Var2, b3);
                    this.j = true;
                    if (q7x.t(hzb0Var3, yw9Var, this) == wneVar16) {
                        return wneVar16;
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
                u2g0 u2g0Var = (u2g0) this.k;
                wne wneVar17 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    odd oddVar = u2g0Var.c;
                    this.j = true;
                    if (oddVar.join(this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((g9a) this.l).f.f(u2g0Var);
                return Unit.f46060a;
            case 16:
                ArrayList arrayList4 = (ArrayList) this.l;
                uya uyaVar = (uya) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    lef0 lef0Var = uyaVar.r;
                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((pbv) it.next()).e);
                    }
                    this.j = true;
                    if (((d0b) lef0Var.f19899a).f(arrayList5, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    axq.t(x1x.D(((pbv) it2.next()).e), arrayList6);
                }
                uyaVar.u.k(arrayList6);
                uyaVar.v.g(arrayList6);
                uyaVar.G(hya.f13850a);
                return Unit.f46060a;
            case 17:
                uya uyaVar2 = (uya) this.k;
                wne wneVar19 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    es esVar = uyaVar2.t;
                    String str2 = (String) this.l;
                    this.j = true;
                    objO = esVar.o(str2, this);
                    if (objO == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objO = obj;
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : (Iterable) objO) {
                    if (((pbv) obj3).f26728a != ((kya) uyaVar2.D()).i) {
                        arrayList7.add(obj3);
                    }
                }
                a4x a4xVarO0 = dyb.o0(arrayList7);
                int i4 = uya.D;
                p7m0 p7m0Var3 = uyaVar2.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, kya.a((kya) value2, a4xVarO0, null, null, null, false, a4xVarO0.isEmpty(), 0L, null, 894)));
                return Unit.f46060a;
            case 18:
                yya yyaVar = (yya) this.k;
                ArrayList arrayList8 = yyaVar.n;
                wne wneVar20 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    es esVar2 = yyaVar.j;
                    String str3 = (String) this.l;
                    this.j = true;
                    objO2 = esVar2.o(str3, this);
                    if (objO2 == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objO2 = obj;
                }
                ArrayList<pbv> arrayList9 = new ArrayList();
                for (Object obj4 : (Iterable) objO2) {
                    if (((pbv) obj4).f26728a != yyaVar.t) {
                        arrayList9.add(obj4);
                    }
                }
                ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                for (pbv pbvVar : arrayList9) {
                    arrayList10.add(jiq0.r0(pbvVar, arrayList8.contains(pbvVar.e), arrayList8.size()));
                }
                boolean zIsEmpty = arrayList10.isEmpty();
                p7m0 p7m0Var4 = yyaVar.v;
                if (zIsEmpty) {
                    ra10 ra10VarB = sa10.b(yyaVar.h, pb10.e, R.string.nothing_found, 0, null, 28);
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, ra10VarB);
                } else {
                    p7m0Var4.n(null);
                }
                p7m0 p7m0Var5 = yyaVar.u;
                do {
                    value3 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value3, wya.a((wya) value3, arrayList10, arrayList8.size(), null, 4)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                List list2 = (List) this.l;
                yya yyaVar2 = (yya) this.k;
                wne wneVar21 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    lef0 lef0Var2 = yyaVar2.c;
                    this.j = true;
                    if (((d0b) lef0Var2.f19899a).f(list2, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    axq.t(x1x.D((a570) it3.next()), arrayList11);
                }
                yyaVar2.d.k(arrayList11);
                yyaVar2.e.g(arrayList11);
                i1w0 i1w0Var = yyaVar2.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 20:
                h2b h2bVar = (h2b) this.k;
                wne wneVar22 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    yoc yocVar = h2bVar.h;
                    List list3 = (List) this.l;
                    this.j = true;
                    if (yocVar.b(list3, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                v3c.N(h2bVar.M);
                h2bVar.D(false);
                return Unit.f46060a;
            case 21:
                y7b y7bVar = (y7b) this.l;
                l9s l9sVar = (l9s) this.k;
                wne wneVar23 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    int i5 = y7b.K;
                    p7m0 p7m0Var6 = y7bVar.i.f25029a;
                    do {
                        value4 = p7m0Var6.getValue();
                        value4.getClass();
                    } while (!p7m0Var6.m(value4, r6b.a((r6b) value4, null, null, null, null, l9sVar, null, null, null, null, null, null, null, null, null, false, false, 524271)));
                    o030 o030Var = y7bVar.v;
                    t030 t030Var = new t030(l9sVar);
                    this.k = null;
                    this.j = true;
                    if (o030Var.a(t030Var, this) == wneVar23) {
                        return wneVar23;
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
                lhf0 lhf0Var = (lhf0) this.k;
                knf0 knf0Var = (knf0) lhf0Var.d;
                wne wneVar24 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    int iB = knf0Var.b();
                    knf0Var.getClass();
                    LinkedHashMap linkedHashMapO = ofm0.o(iB, (String) this.l, knf0Var.c());
                    chf0 chf0Var = (chf0) lhf0Var.c;
                    this.j = true;
                    objA = ((mfb) ((h8a) chf0Var.c).invoke()).a(linkedHashMapO, "application/vnd.xenvelop+json", this);
                    if (objA == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                wfb wfbVar = (wfb) ((dx5) objA).a();
                Long l = wfbVar.f39062a;
                if (l == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue = l.longValue();
                rfb rfbVar = wfbVar.b;
                if (rfbVar == null) {
                    jf4.k(null);
                    return null;
                }
                String str4 = rfbVar.f30378a;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = rfbVar.b;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = rfbVar.c;
                String str7 = str6 != null ? str6 : "";
                List list4 = rfbVar.d;
                if (list4 != null) {
                    arrayList2 = new ArrayList(r3d.q(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(vdb.m0((ydb) it4.next()));
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                return new sfb(jLongValue, new ofb(arrayList2, str4, str5, str7));
            case 23:
                phf0 phf0Var = (phf0) this.k;
                knf0 knf0Var2 = (knf0) phf0Var.f26994a;
                wne wneVar25 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    ehf0 ehf0Var = (ehf0) phf0Var.b;
                    String str8 = (String) this.l;
                    String strC = knf0Var2.c();
                    int iB2 = knf0Var2.b();
                    knf0Var2.getClass();
                    LinkedHashMap linkedHashMapO2 = ofm0.o(iB2, str8, strC);
                    this.j = true;
                    objA2 = ((agb) ((h8a) ehf0Var.c).invoke()).a(linkedHashMapO2, "application/vnd.xenvelop+json", this);
                    if (objA2 == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                return g8x.Z((f1m0) ((dx5) objA2).a());
            case 24:
                jkb jkbVar = (jkb) this.k;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                plb plbVar2 = (plb) this.l;
                int i6 = plb.I;
                p7m0 p7m0Var7 = plbVar2.i.f25029a;
                do {
                    value5 = p7m0Var7.getValue();
                    value5.getClass();
                } while (!p7m0Var7.m(value5, alb.a((alb) value5, false, jkbVar, null, null, null, 15359)));
                boolean z25 = this.j;
                if (((alb) plbVar2.D()).l == null || (z25 && (j0g0Var2 = ((alb) plbVar2.D()).l) != null && (j0g0Var2.f15681a instanceof g0g0))) {
                    long j = ((alb) plbVar2.D()).f1060a.f47168a;
                    Object obj5 = jkbVar.f16659a;
                    e0g0 e0g0Var = j0g0.b;
                    if (obj5 instanceof g0g0) {
                        obj5 = null;
                    }
                    q2s0 q2s0Var = (q2s0) obj5;
                    Long lValueOf = q2s0Var != null ? Long.valueOf(q2s0Var.f28018a.e) : null;
                    bby bbyVar = plbVar2.F;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        plbVar = plbVar2;
                        plbVar.F = i3t0.K(plbVar, null, null, new nlb(plbVar, j, lValueOf, null), 3);
                    } else {
                        plbVar = plbVar2;
                    }
                } else {
                    plbVar = plbVar2;
                }
                if ((((alb) plbVar.D()).m == null || (z25 && (j0g0Var = ((alb) plbVar.D()).m) != null && (j0g0Var.f15681a instanceof g0g0))) && (lN = plbVar.N(jkbVar)) != null) {
                    Long lValueOf2 = Long.valueOf(lN.longValue());
                    bby bbyVar2 = plbVar.G;
                    if (bbyVar2 == null || !bbyVar2.isActive()) {
                        plbVar.G = i3t0.K(plbVar, null, null, new za(plbVar, lValueOf2, r9 == true ? 1 : 0, b), 3);
                    }
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar27 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    nhf0 nhf0Var = (nhf0) this.k;
                    lpb lpbVar = (lpb) nhf0Var.f23530a;
                    String strA2 = ((btt0) nhf0Var.c).a();
                    String str9 = (String) this.l;
                    this.j = true;
                    Object objA4 = ((jpb) lpbVar.f20432a.b(sre0.f32672a.b(jpb.class))).a(strA2, new opb(str9), this);
                    if (objA4 != wneVar27) {
                        objA4 = Unit.f46060a;
                    }
                    if (objA4 == wneVar27) {
                        return wneVar27;
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
                eqb eqbVar2 = (eqb) this.l;
                wne wneVar28 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    if (eqbVar2.k.a().N.p) {
                        rou rouVar = eqbVar2.m;
                        this.k = eqbVar2;
                        this.j = true;
                        objA3 = rouVar.a(false, this);
                        if (objA3 == wneVar28) {
                            return wneVar28;
                        }
                        eqbVar = eqbVar2;
                    } else {
                        eqbVar = eqbVar2;
                    }
                    eqbVar.z = z;
                    p7m0 p7m0Var8 = eqbVar2.q;
                    z = eqbVar2.z;
                    ctf0Var = eqbVar2.l;
                    if (z) {
                        strA = ctf0Var.b.a(R.string.change_login, Arrays.copyOf(new Object[0], 0));
                    } else {
                        strA = ctf0Var.b.a(R.string.install_login, Arrays.copyOf(new Object[0], 0));
                    }
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, strA);
                    return Unit.f46060a;
                }
                if (!z27) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eqb eqbVar3 = (eqb) this.k;
                z1x.P(obj);
                eqbVar = eqbVar3;
                objA3 = obj;
                boolean z28 = ((m2c0) objA3).c0.length() > 0;
                eqbVar.z = z28;
                p7m0 p7m0Var9 = eqbVar2.q;
                z = eqbVar2.z;
                ctf0Var = eqbVar2.l;
                if (z) {
                    strA = ctf0Var.b.a(R.string.change_login, Arrays.copyOf(new Object[0], 0));
                } else {
                    strA = ctf0Var.b.a(R.string.install_login, Arrays.copyOf(new Object[0], 0));
                }
                p7m0Var9.getClass();
                p7m0Var9.o(null, strA);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar29 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    eqb eqbVar4 = (eqb) this.l;
                    p7m0Var = eqbVar4.r;
                    f4u f4uVar = eqbVar4.c;
                    this.k = p7m0Var;
                    this.j = true;
                    objE = f4uVar.e(this);
                    if (objE == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7m0 p7m0Var10 = (p7m0) this.k;
                    z1x.P(obj);
                    p7m0Var = p7m0Var10;
                    objE = obj;
                }
                p7m0Var.n(objE);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    qoj0 qoj0Var3 = ((eqb) this.k).x;
                    e7a e7aVar = (e7a) this.l;
                    this.j = true;
                    if (qoj0Var3.a(e7aVar, this) == wneVar30) {
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
            default:
                String str10 = (String) this.k;
                wne wneVar31 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar31) {
                        return wneVar31;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                boolean z32 = StringsKt.u0(str10).toString().length() >= 4;
                p7m0 p7m0Var11 = ((hrb) this.l).x;
                do {
                    value6 = p7m0Var11.getValue();
                } while (!p7m0Var11.m(value6, frb.a((frb) value6, null, false, z32, str10, null, 19)));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d09(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d09(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d09(plb plbVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.l = plbVar;
        this.j = z;
    }
}
