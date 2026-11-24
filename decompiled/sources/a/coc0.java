package a;

import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class coc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ coc0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                coc0 coc0Var = new coc0((doc0) obj2, yjeVar, (byte) 0);
                coc0Var.j = ((Boolean) obj).booleanValue();
                return coc0Var;
            case 1:
                return new coc0((a1d0) obj2, yjeVar, (byte) 1);
            case 2:
                return new coc0((pzu) obj2, yjeVar, (byte) 2);
            case 3:
                coc0 coc0Var2 = new coc0((gfd0) obj2, yjeVar, (byte) 3);
                coc0Var2.j = ((Boolean) obj).booleanValue();
                return coc0Var2;
            case 4:
                coc0 coc0Var3 = new coc0((jid0) obj2, yjeVar, (byte) 4);
                coc0Var3.j = ((Boolean) obj).booleanValue();
                return coc0Var3;
            case 5:
                return new coc0((ijd0) obj2, yjeVar, (byte) 5);
            case 6:
                return new coc0((hxd0) obj2, yjeVar, (byte) 6);
            case 7:
                return new coc0((q2e0) obj2, yjeVar, (byte) 7);
            case 8:
                coc0 coc0Var4 = new coc0((a6e0) obj2, yjeVar, (byte) 8);
                coc0Var4.j = ((Boolean) obj).booleanValue();
                return coc0Var4;
            case 9:
                coc0 coc0Var5 = new coc0((x8e0) obj2, yjeVar, (byte) 9);
                coc0Var5.j = ((Boolean) obj).booleanValue();
                return coc0Var5;
            case 10:
                coc0 coc0Var6 = new coc0((u9e0) obj2, yjeVar, (byte) 10);
                coc0Var6.j = ((Boolean) obj).booleanValue();
                return coc0Var6;
            case 11:
                coc0 coc0Var7 = new coc0((mce0) obj2, yjeVar, (byte) 11);
                coc0Var7.j = ((Boolean) obj).booleanValue();
                return coc0Var7;
            case 12:
                coc0 coc0Var8 = new coc0((wfe0) obj2, yjeVar, (byte) 12);
                coc0Var8.j = ((Boolean) obj).booleanValue();
                return coc0Var8;
            case 13:
                return new coc0((ume0) obj2, yjeVar, (byte) 13);
            case 14:
                coc0 coc0Var9 = new coc0((ppe0) obj2, yjeVar, (byte) 14);
                coc0Var9.j = ((Boolean) obj).booleanValue();
                return coc0Var9;
            case 15:
                return new coc0((tpe0) obj2, yjeVar, (byte) 15);
            case 16:
                return new coc0((gue0) obj2, yjeVar, (byte) 16);
            case 17:
                return new coc0((lue0) obj2, yjeVar, (byte) 17);
            case 18:
                coc0 coc0Var10 = new coc0((eze0) obj2, yjeVar, (byte) 18);
                coc0Var10.j = ((Boolean) obj).booleanValue();
                return coc0Var10;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new coc0((g8f0) obj2, yjeVar, (byte) 19);
            case 20:
                coc0 coc0Var11 = new coc0((hef0) obj2, yjeVar, (byte) 20);
                coc0Var11.j = ((Boolean) obj).booleanValue();
                return coc0Var11;
            case 21:
                return new coc0((nff0) obj2, yjeVar, (byte) 21);
            case 22:
                return new coc0((ekf0) obj2, yjeVar, (byte) 22);
            case 23:
                return new coc0((rnf0) obj2, yjeVar, (byte) 23);
            case 24:
                coc0 coc0Var12 = new coc0((wuf0) obj2, yjeVar, (byte) 24);
                coc0Var12.j = ((Boolean) obj).booleanValue();
                return coc0Var12;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                coc0 coc0Var13 = new coc0((hxf0) obj2, yjeVar, (byte) 25);
                coc0Var13.j = ((Boolean) obj).booleanValue();
                return coc0Var13;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new coc0((sxf0) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                coc0 coc0Var14 = new coc0((ayf0) obj2, yjeVar, (byte) 27);
                coc0Var14.j = ((Boolean) obj).booleanValue();
                return coc0Var14;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new coc0((o9g0) obj2, yjeVar, (byte) 28);
            default:
                return new coc0((pbg0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((coc0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((coc0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((coc0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((coc0) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((coc0) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((coc0) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((coc0) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((coc0) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((coc0) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((coc0) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((coc0) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((coc0) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                return ((coc0) create(bool13, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                return ((coc0) create(bool14, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((coc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        Object objB;
        Object value4;
        int i;
        int i2;
        long j;
        boolean z;
        int i3;
        Object objB2;
        Object value5;
        int i4;
        int i5;
        long j2;
        boolean z2;
        int i6;
        Object value6;
        Object value7;
        Object objA2;
        Object objA3;
        Object objI;
        byte b = this.i;
        byte b2 = 7;
        byte b3 = 0;
        int iX = 0;
        byte b4 = 1;
        yje yjeVar = null;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                boolean z3 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                doc0 doc0Var = (doc0) obj2;
                if (!doc0Var.q && z3) {
                    doc0Var.y();
                }
                doc0Var.q = z3;
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ylt0 ylt0Var = (ylt0) ((a1d0) obj2).b.get();
                    this.j = true;
                    if (ylt0Var.a(true, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    this.j = true;
                    if (qem0.s(new fxc0((pzu) obj2, null), this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                boolean z6 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                mi70 mi70Var = gfd0.S1;
                ((gfd0) obj2).H0().b.setSecondButtonEnabled(z6);
                return Unit.f46060a;
            case 4:
                boolean z7 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = ((jid0) obj2).k;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, iid0.a((iid0) value, null, false, z7, 7)));
                return Unit.f46060a;
            case 5:
                ijd0 ijd0Var = (ijd0) obj2;
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    if (!((fjd0) ijd0Var.h.getValue()).b) {
                        ijd0Var.i.f(ajd0.f969a);
                        return Unit.f46060a;
                    }
                    this.j = true;
                    if (ijd0Var.y(this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                hxd0 hxd0Var = (hxd0) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    h3c h3cVar = hxd0Var.r;
                    this.j = true;
                    objA = h3cVar.a(40L, 15L, this);
                    if (objA == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                hxd0Var.q.c().d(new oac0(hxd0Var, (String) objA, (byte) 16));
                return Unit.f46060a;
            case 7:
                q2e0 q2e0Var = (q2e0) obj2;
                wne wneVar8 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    int i7 = q2e0.s;
                    p7m0 p7m0Var2 = q2e0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, t2e0.a((t2e0) value2, 0, false, 5)));
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var = q2e0Var.o;
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
            case 8:
                a6e0 a6e0Var = (a6e0) obj2;
                boolean z11 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (z11 && (((v5e0) a6e0Var.D()).b || ((v5e0) a6e0Var.D()).f36823a)) {
                    a6e0Var.M(false);
                }
                return Unit.f46060a;
            case 9:
                x8e0 x8e0Var = (x8e0) obj2;
                boolean z12 = this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                if (z12 && (((l8e0) x8e0Var.D()).f19600a || ((l8e0) x8e0Var.D()).b)) {
                    x8e0Var.M();
                }
                return Unit.f46060a;
            case 10:
                boolean z13 = this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                u9e0 u9e0Var = (u9e0) obj2;
                int i8 = u9e0.u;
                p7m0 p7m0Var3 = u9e0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, o7e0.a((o7e0) value3, null, null, null, z13, 15)));
                if (z13) {
                    bby bbyVar = u9e0Var.t;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    u9e0Var.t = i3t0.K(u9e0Var, null, null, new hhb0(u9e0Var, yjeVar, b4), 3);
                }
                return Unit.f46060a;
            case 11:
                boolean z14 = this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((FrameLayout) ((mce0) obj2).I0().g.c).setVisibility(z14 ? (byte) 0 : (byte) 8);
                return Unit.f46060a;
            case 12:
                wfe0 wfe0Var = (wfe0) obj2;
                boolean z15 = this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                if (z15 && (((nfe0) wfe0Var.D()).f23433a instanceof fhe)) {
                    wfe0Var.O();
                }
                return Unit.f46060a;
            case 13:
                ume0 ume0Var = (ume0) obj2;
                wne wneVar14 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    zqu zquVar = ume0Var.o;
                    String str = ume0Var.p;
                    zquVar.getClass();
                    str.getClass();
                    ddm0 ddm0Var = zquVar.f44824a.c;
                    ddm0Var.getClass();
                    byte b5 = 20;
                    eu4 eu4Var = new eu4(new zj2(vtb.M(ddm0Var.c), ddm0Var, str, b5), (byte) 13);
                    mld0 mld0Var = new mld0(ume0Var, b5);
                    this.j = true;
                    if (eu4Var.c(mld0Var, this) == wneVar14) {
                        return wneVar14;
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
                boolean z17 = this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                zie0 zie0Var = ppe0.S1;
                ((ppe0) obj2).G0().b.setImageResource(z17 ? R.drawable.ic_calendar_time_interval : R.drawable.ic_calendar_range);
                return Unit.f46060a;
            case 15:
                tpe0 tpe0Var = (tpe0) obj2;
                wne wneVar16 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    s5k s5kVar = tpe0Var.d;
                    int i9 = tpe0Var.l;
                    this.j = true;
                    Object objH = s5kVar.f31657a.h(i9, this);
                    if (objH != wneVar16) {
                        objH = Unit.f46060a;
                    }
                    if (objH == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                tpe0Var.w();
                return Unit.f46060a;
            case 16:
                gue0 gue0Var = (gue0) obj2;
                wne wneVar17 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    ytt yttVar = gue0Var.o;
                    int i10 = ((mg8) gue0Var.D()).b;
                    long j3 = ((mg8) gue0Var.D()).c;
                    this.j = true;
                    objB = yttVar.f43236a.b(i10, j3, this);
                    if (objB == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                List list = (List) objB;
                int i11 = gue0.r;
                p7m0 p7m0Var4 = gue0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    mg8 mg8Var = (mg8) value4;
                    i = mg8Var.f21729a;
                    i2 = mg8Var.b;
                    j = mg8Var.c;
                    z = mg8Var.d;
                    i3 = mg8Var.f;
                    list.getClass();
                } while (!p7m0Var4.m(value4, new mg8(i, i2, j, z, list, i3)));
                return Unit.f46060a;
            case 17:
                lue0 lue0Var = (lue0) obj2;
                wne wneVar18 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    ytt yttVar2 = lue0Var.o;
                    int i12 = ((vg8) lue0Var.D()).b;
                    long j4 = ((vg8) lue0Var.D()).c;
                    this.j = true;
                    objB2 = yttVar2.f43236a.b(i12, j4, this);
                    if (objB2 == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB2 = obj;
                }
                List list2 = (List) objB2;
                int i13 = lue0.r;
                p7m0 p7m0Var5 = lue0Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    vg8 vg8Var = (vg8) value5;
                    i4 = vg8Var.f37369a;
                    i5 = vg8Var.b;
                    j2 = vg8Var.c;
                    z2 = vg8Var.d;
                    i6 = vg8Var.f;
                    list2.getClass();
                } while (!p7m0Var5.m(value5, new vg8(i4, i5, j2, z2, list2, i6)));
                return Unit.f46060a;
            case 18:
                boolean z21 = this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                int i14 = eze0.y0;
                p7m0 p7m0Var6 = ((eze0) obj2).i.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                } while (!p7m0Var6.m(value6, aye0.a((aye0) value6, false, false, false, null, null, null, null, null, null, null, null, null, z21, null, null, null, null, null, null, null, null, 2147418111)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z22 = this.j;
                if (z22) {
                    if (z22) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                e1f0 e1f0Var = ((g8f0) obj2).f10862a;
                this.j = true;
                Object objA4 = e1f0Var.a(this);
                return objA4 == wneVar20 ? wneVar20 : objA4;
            case 20:
                boolean z23 = this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                hef0 hef0Var = (hef0) obj2;
                if (!z23) {
                    int i15 = hef0.C;
                    hef0Var.M();
                } else if (hef0Var.o.f46881a) {
                    bby bbyVar2 = hef0Var.z;
                    if (bbyVar2 != null) {
                        e3c.n(bbyVar2);
                    }
                    hef0Var.z = hef0Var.I(hef0Var.v.f22085a, new eef0(hef0Var, b3), new bu(hef0Var, yjeVar, (byte) 15));
                } else {
                    hef0Var.N();
                }
                return Unit.f46060a;
            case 21:
                nff0 nff0Var = (nff0) obj2;
                wne wneVar22 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    ro00 ro00Var = nff0Var.d;
                    this.j = true;
                    if (ro00Var.a(this) == wneVar22) {
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
                if (!z25) {
                    z1x.P(obj);
                    qnq qnqVarU = dtb.U(((ekf0) obj2).s, 2);
                    this.j = true;
                    if (slb.N(qnqVarU, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                rnf0 rnf0Var = (rnf0) obj2;
                wne wneVar24 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    byte b6 = 12;
                    dnq dnqVar = new dnq(new fnq(new eu4(Boolean.TRUE, b6), new d7a0(rnf0Var, yjeVar, (byte) 27)), new jgb0(rnf0Var, yjeVar, b2), (byte) 1);
                    npe0 npe0Var = new npe0(rnf0Var, b6);
                    this.j = true;
                    if (dnqVar.c(npe0Var, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wuf0 wuf0Var = (wuf0) obj2;
                p7m0 p7m0Var7 = wuf0Var.s;
                boolean z27 = this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                if (z27 && !(p7m0Var7.getValue() instanceof puf0)) {
                    wuf0Var.w();
                } else if (!z27 && !(p7m0Var7.getValue() instanceof puf0)) {
                    wuf0Var.y();
                }
                p7m0 p7m0Var8 = wuf0Var.r;
                do {
                    value7 = p7m0Var8.getValue();
                } while (!p7m0Var8.m(value7, vuf0.a((vuf0) value7, false, false, z27, 3)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                boolean z28 = this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                zie0 zie0Var2 = hxf0.V1;
                twn.A(z28, ((f190) ((hxf0) obj2).U1.getValue()).d, null);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sxf0 sxf0Var = (sxf0) obj2;
                wne wneVar27 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    if (sxf0Var.m.f15225a.a()) {
                        rou rouVar = sxf0Var.n;
                        this.j = true;
                        objA2 = rouVar.a(false, this);
                        if (objA2 == wneVar27) {
                            return wneVar27;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z29) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                String str2 = ((m2c0) objA2).T;
                if (str2.length() > 0) {
                    sxf0Var.t.f(new kxf0(String.format(sxf0Var.q.b.a(R.string.by_email_send_code_confirmation_v2, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{str2}, 1)), str2));
                    sxf0Var.u = str2;
                    sxf0Var.f.l(true);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                boolean z30 = this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                eke0 eke0Var = ayf0.S1;
                twn.A(z30, ((f190) ((ayf0) obj2).R1.getValue()).d, null);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                o9g0 o9g0Var = (o9g0) obj2;
                wne wneVar29 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    if (o9g0Var.x.f15225a.a()) {
                        rou rouVar2 = o9g0Var.y;
                        this.j = true;
                        objA3 = rouVar2.a(false, this);
                        if (objA3 == wneVar29) {
                            return wneVar29;
                        }
                    }
                    return new Integer(iX);
                }
                if (!z31) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA3 = obj;
                iX = wvb.X(((m2c0) objA3).c);
                return new Integer(iX);
            default:
                pbg0 pbg0Var = (pbg0) obj2;
                wne wneVar30 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    yfu yfuVar = pbg0Var.b;
                    this.j = true;
                    objI = ((gxu) yfuVar.f42558a).i(this);
                    if (objI == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                pbg0Var.h.f(new mbg0((String) objI));
                return Unit.f46060a;
        }
    }
}
