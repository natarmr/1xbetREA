package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.swipex.impl.navigation.SwipexScreenFactoryImpl$getSwipexScreen$1;

/* JADX INFO: loaded from: classes6.dex */
public final class agn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = nfj0Var;
    }

    private final Object l(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        zco0 zco0Var = (zco0) this.k;
        tzi tziVar = zco0Var.D;
        pzu pzuVar = zco0Var.t;
        mne mneVar = zco0Var.C;
        oyg0 oyg0Var = zco0Var.f;
        ocj ocjVar = zco0Var.i;
        vne vneVar = (vne) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            int i = zco0.r0;
            sh60 sh60Var = sh60.b;
            utb utbVarC = aoq.c(new vsg0(new pnd0(zco0Var, sh60Var, yjeVar, (byte) 15)), new fe0(yjeVar, (Object) zco0Var, (Object) sh60Var, (byte) 18));
            this.l = vneVar;
            this.j = true;
            if (ntb.K(utbVarC, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        int i2 = zco0.r0;
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, glb0.a((glb0) value, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554429)));
        boolean z2 = false;
        boolean z3 = ((qnf0) this.m) == qnf0.f29025a;
        bby bbyVar = zco0Var.j0;
        if (bbyVar == null || !bbyVar.isActive()) {
            zco0Var.j0 = sac.V(jiu0.a(zco0Var), yco0.f42391a, null, mneVar.f22085a, new lcl0(zco0Var, yjeVar, (byte) 13), 10);
        }
        boolean zA = zco0Var.K.a();
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value2, glb0.a((glb0) value2, zA, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554427)));
        byte b = 7;
        byte b2 = 6;
        byte b3 = 4;
        if (zA) {
            v3c.N(zco0Var.h0);
            zco0Var.h0 = sac.T(new fnq(new vsg0(new mco0(zco0Var, yjeVar, b3)), new kco0(zco0Var, yjeVar, b2), b3), d5c.S(jiu0.a(zco0Var), mneVar.b), new kco0(zco0Var, yjeVar, b));
        } else {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, glb0.a((glb0) value3, false, false, null, null, null, null, null, new jn00(iun.f15405a), null, null, null, null, null, null, null, null, null, null, false, 33546239)));
        }
        if (z3 || bdx.l0(((glb0) zco0Var.D()).p)) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value4 = p7m0Var4.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value4, glb0.a((glb0) value4, false, false, null, null, null, null, null, null, null, new nn00(), null, null, null, null, null, null, null, null, false, 33521663)));
        }
        sac.T(new fnq(zco0Var.x.v(z3, false, false, zco0Var.P().J1, new gco0(zco0Var, yjeVar, b2)), new mco0(zco0Var, yjeVar, (byte) 1), b3), vneVar, new lco0(zco0Var, vneVar, yjeVar, b3));
        if (z3 || bdx.l0(((glb0) zco0Var.D()).q)) {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            while (true) {
                Object value7 = p7m0Var5.getValue();
                value7.getClass();
                oyg0Var.getClass();
                if (p7m0Var5.m(value7, glb0.a((glb0) value7, false, false, null, null, null, null, null, null, null, null, new nn00(), null, null, null, null, null, null, null, false, 33488895))) {
                    break;
                }
                z2 = z2;
            }
        }
        byte b4 = 3;
        sac.T(new fnq(zco0Var.w.s(z3, z2, zco0Var.P().J1, new gco0(zco0Var, yjeVar, (byte) 5)), new mco0(zco0Var, yjeVar, (byte) 0), b3), vneVar, new lco0(zco0Var, vneVar, yjeVar, b4));
        if (z3 || bdx.l0(((glb0) zco0Var.D()).r)) {
            p7m0 p7m0Var6 = ocjVar.f25029a;
            while (true) {
                Object value8 = p7m0Var6.getValue();
                value8.getClass();
                oyg0Var.getClass();
                if (p7m0Var6.m(value8, glb0.a((glb0) value8, false, false, null, null, null, null, null, null, null, null, null, new nn00(), null, null, null, null, null, null, false, 33423359))) {
                    break;
                }
                tziVar = tziVar;
                z2 = z2;
            }
        }
        sac.T(new fnq(pzuVar.b0(z3, true, new gco0(zco0Var, yjeVar, (byte) 8)), new mco0(zco0Var, yjeVar, b4), b3), vneVar, new lco0(zco0Var, vneVar, yjeVar, b2));
        if (z3 || bdx.l0(((glb0) zco0Var.D()).s)) {
            p7m0 p7m0Var7 = ocjVar.f25029a;
            while (true) {
                Object value9 = p7m0Var7.getValue();
                value9.getClass();
                oyg0Var.getClass();
                if (p7m0Var7.m(value9, glb0.a((glb0) value9, false, false, null, null, null, null, null, null, null, null, null, null, new nn00(), null, null, null, null, null, false, 33292287))) {
                    break;
                }
                tziVar = tziVar;
                z2 = z2;
            }
        }
        byte b5 = 2;
        sac.T(new fnq(pzuVar.b0(z3, z2, new gco0(zco0Var, yjeVar, b)), new mco0(zco0Var, yjeVar, b5), b3), vneVar, new lco0(zco0Var, vneVar, yjeVar, (byte) 5));
        if (z3 || bdx.l0(((glb0) zco0Var.D()).t)) {
            p7m0 p7m0Var8 = ocjVar.f25029a;
            while (true) {
                Object value10 = p7m0Var8.getValue();
                value10.getClass();
                oyg0Var.getClass();
                if (p7m0Var8.m(value10, glb0.a((glb0) value10, false, false, null, null, null, null, null, null, null, null, null, null, null, new nn00(), null, null, null, null, false, 33030143))) {
                    break;
                }
                tziVar = tziVar;
                z2 = z2;
            }
        }
        boolean z4 = zco0Var.P().J1;
        gco0 gco0Var = new gco0(zco0Var, yjeVar, b4);
        tziVar.getClass();
        boolean z5 = z3;
        byte b6 = 0;
        byte b7 = 1;
        sac.T(new fnq(new vsg0(new q0v(tziVar, z5, true, z4, gco0Var, null)), new kco0(zco0Var, yjeVar, b7), b3), vneVar, new lco0(zco0Var, vneVar, yjeVar, b7));
        if (z5 || bdx.l0(((glb0) zco0Var.D()).u)) {
            p7m0 p7m0Var9 = ocjVar.f25029a;
            do {
                value5 = p7m0Var9.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var9.m(value5, glb0.a((glb0) value5, false, false, null, null, null, null, null, null, null, null, null, null, null, null, new nn00(), null, null, null, false, 32505855)));
        }
        boolean z6 = zco0Var.P().J1;
        gco0 gco0Var2 = new gco0(zco0Var, yjeVar, b5);
        tziVar.getClass();
        sac.T(new fnq(new vsg0(new q0v(tziVar, z5, false, z6, gco0Var2, null)), new kco0(zco0Var, yjeVar, b6), b3), vneVar, new lco0(zco0Var, vneVar, yjeVar, b6));
        if (z5 || bdx.l0(((glb0) zco0Var.D()).v)) {
            p7m0 p7m0Var10 = ocjVar.f25029a;
            do {
                value6 = p7m0Var10.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var10.m(value6, glb0.a((glb0) value6, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, new nn00(), null, null, false, 31457279)));
        }
        a6u a6uVar = zco0Var.Z;
        gco0 gco0Var3 = new gco0(zco0Var, yjeVar, b3);
        a6uVar.getClass();
        if (z5) {
            Iterator it = yeu.c.iterator();
            while (it.hasNext()) {
                a6uVar.a((yeu) it.next());
            }
        }
        sac.T(new fnq(new p6d(((m0o0) ((ocl) a6uVar.c).f25032a).b(), new vsg0(new efu(z5, a6uVar, gco0Var3, (yje) null)), new y8p(b4, yjeVar, b5), (byte) 1), new kco0(zco0Var, yjeVar, b5), b3), vneVar, new lco0(zco0Var, vneVar, yjeVar, b5));
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                i89 i89Var = (i89) this.l;
                clz clzVar = (clz) this.k;
                lkz lkzVar = lkz.f20223a;
                return new agn0(i89Var, clzVar, (nfj0) obj2, yjeVar);
            case 1:
                gmq gmqVar = (gmq) this.l;
                clz clzVar2 = (clz) this.k;
                lkz lkzVar2 = lkz.f20223a;
                return new agn0(gmqVar, clzVar2, (z2n0) obj2, yjeVar);
            case 2:
                xae0 xae0Var = (xae0) this.l;
                clz clzVar3 = (clz) this.k;
                lkz lkzVar3 = lkz.f20223a;
                return new agn0(xae0Var, clzVar3, (ssl0) obj2, yjeVar);
            case 3:
                dnq dnqVar = (dnq) this.l;
                clz clzVar4 = (clz) this.k;
                lkz lkzVar4 = lkz.f20223a;
                return new agn0(dnqVar, clzVar4, (ijn0) obj2, yjeVar);
            case 4:
                gmq gmqVar2 = (gmq) this.l;
                clz clzVar5 = (clz) this.k;
                lkz lkzVar5 = lkz.f20223a;
                return new agn0(gmqVar2, clzVar5, (ijn0) obj2, yjeVar);
            case 5:
                gmq gmqVar3 = (gmq) this.l;
                clz clzVar6 = (clz) this.k;
                lkz lkzVar6 = lkz.f20223a;
                return new agn0(gmqVar3, clzVar6, (ijn0) obj2, yjeVar, (byte) 0);
            case 6:
                i89 i89Var2 = (i89) this.l;
                clz clzVar7 = (clz) this.k;
                lkz lkzVar7 = lkz.f20223a;
                return new agn0(i89Var2, clzVar7, (nfj0) obj2, yjeVar, (byte) 0);
            case 7:
                i89 i89Var3 = (i89) this.l;
                clz clzVar8 = (clz) this.k;
                lkz lkzVar8 = lkz.f20223a;
                return new agn0(i89Var3, clzVar8, (nfj0) obj2, yjeVar, (char) 0);
            case 8:
                s6n0 s6n0Var = (s6n0) this.l;
                clz clzVar9 = (clz) this.k;
                lkz lkzVar9 = lkz.f20223a;
                return new agn0(s6n0Var, clzVar9, (mpn0) obj2, yjeVar);
            case 9:
                gmq gmqVar4 = (gmq) this.l;
                clz clzVar10 = (clz) this.k;
                lkz lkzVar10 = lkz.f20223a;
                return new agn0(gmqVar4, clzVar10, (mpn0) obj2, yjeVar);
            case 10:
                dnq dnqVar2 = (dnq) this.l;
                clz clzVar11 = (clz) this.k;
                lkz lkzVar11 = lkz.f20223a;
                return new agn0(dnqVar2, clzVar11, (wpn0) obj2, yjeVar);
            case 11:
                xae0 xae0Var2 = (xae0) this.l;
                clz clzVar12 = (clz) this.k;
                lkz lkzVar12 = lkz.f20223a;
                return new agn0(xae0Var2, clzVar12, (wpn0) obj2, yjeVar);
            case 12:
                xae0 xae0Var3 = (xae0) this.l;
                clz clzVar13 = (clz) this.k;
                lkz lkzVar13 = lkz.f20223a;
                return new agn0(xae0Var3, clzVar13, (wpn0) obj2, yjeVar, (byte) 0);
            case 13:
                agn0 agn0Var = new agn0(obj2, yjeVar, (byte) 13);
                agn0Var.k = obj;
                return agn0Var;
            case 14:
                gmq gmqVar5 = (gmq) this.l;
                clz clzVar14 = (clz) this.k;
                lkz lkzVar14 = lkz.f20223a;
                return new agn0(gmqVar5, clzVar14, (aun0) obj2, yjeVar);
            case 15:
                gmq gmqVar6 = (gmq) this.l;
                clz clzVar15 = (clz) this.k;
                lkz lkzVar15 = lkz.f20223a;
                return new agn0(gmqVar6, clzVar15, (aun0) obj2, yjeVar, (byte) 0);
            case 16:
                s6n0 s6n0Var2 = (s6n0) this.l;
                clz clzVar16 = (clz) this.k;
                lkz lkzVar16 = lkz.f20223a;
                return new agn0(s6n0Var2, clzVar16, (aun0) obj2, yjeVar);
            case 17:
                return new agn0(obj2, yjeVar, (byte) 17);
            case 18:
                i89 i89Var4 = (i89) this.l;
                clz clzVar17 = (clz) this.k;
                lkz lkzVar17 = lkz.f20223a;
                return new agn0(i89Var4, clzVar17, (nfj0) obj2, yjeVar, 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new agn0(obj2, yjeVar, (byte) 19);
            case 20:
                i89 i89Var5 = (i89) this.l;
                clz clzVar18 = (clz) this.k;
                lkz lkzVar18 = lkz.f20223a;
                return new agn0(i89Var5, clzVar18, (tvn0) obj2, yjeVar);
            case 21:
                gmq gmqVar7 = (gmq) this.l;
                clz clzVar19 = (clz) this.k;
                lkz lkzVar19 = lkz.f20223a;
                return new agn0(gmqVar7, clzVar19, (tvn0) obj2, yjeVar);
            case 22:
                agn0 agn0Var2 = new agn0(obj2, yjeVar, (byte) 22);
                agn0Var2.k = obj;
                return agn0Var2;
            case 23:
                i89 i89Var6 = (i89) this.l;
                clz clzVar20 = (clz) this.k;
                lkz lkzVar20 = lkz.f20223a;
                return new agn0(i89Var6, clzVar20, (nfj0) obj2, yjeVar, (short) 0);
            case 24:
                agn0 agn0Var3 = new agn0((zco0) this.k, (qnf0) obj2, yjeVar);
                agn0Var3.l = obj;
                return agn0Var3;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gmq gmqVar8 = (gmq) this.l;
                nfo0 nfo0Var = (nfo0) this.k;
                lkz lkzVar21 = lkz.f20223a;
                return new agn0(gmqVar8, nfo0Var, (bdl0) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gmq gmqVar9 = (gmq) this.l;
                clz clzVar21 = (clz) this.k;
                lkz lkzVar22 = lkz.f20223a;
                return new agn0(gmqVar9, clzVar21, (sfo0) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gmq gmqVar10 = (gmq) this.l;
                clz clzVar22 = (clz) this.k;
                lkz lkzVar23 = lkz.f20223a;
                return new agn0(gmqVar10, clzVar22, (sfo0) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gmq gmqVar11 = (gmq) this.l;
                clz clzVar23 = (clz) this.k;
                lkz lkzVar24 = lkz.f20223a;
                return new agn0(gmqVar11, clzVar23, (iho0) obj2, yjeVar);
            default:
                gmq gmqVar12 = (gmq) this.l;
                clz clzVar24 = (clz) this.k;
                lkz lkzVar25 = lkz.f20223a;
                return new agn0(gmqVar12, clzVar24, (iho0) obj2, yjeVar, (byte) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((agn0) create((jsn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((agn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM;
        arn0 arn0Var;
        v88 v88Var;
        Object objG;
        i1w0 i1w0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        bvn0 bvn0Var;
        Object next;
        Object g0g0Var;
        Object objA;
        m0o0 m0o0Var;
        byte b = this.i;
        byte b2 = 29;
        byte b3 = 21;
        byte b4 = 7;
        Object obj2 = this.m;
        boolean z = false;
        byte b5 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var = new r0m0((nfj0) obj2, b3);
                    this.j = true;
                    if (bq9VarB.c(r0m0Var, this) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var2 = new r0m0((z2n0) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB2.c(r0m0Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var3 = new r0m0((ssl0) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB3.c(r0m0Var3, this) == wneVar3) {
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
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((dnq) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var4 = new r0m0((ijn0) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB4.c(r0m0Var4, this) == wneVar4) {
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
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var5 = new r0m0((ijn0) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB5.c(r0m0Var5, this) == wneVar5) {
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
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var6 = new r0m0((ijn0) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB6.c(r0m0Var6, this) == wneVar6) {
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
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var7 = new r0m0((nfj0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB7.c(r0m0Var7, this) == wneVar7) {
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
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var8 = new r0m0((nfj0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB8.c(r0m0Var8, this) == wneVar8) {
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
                    bq9 bq9VarB9 = hkb.B((s6n0) this.l, ((clz) this.k).x(), lkz.d);
                    r0m0 r0m0Var9 = new r0m0((mpn0) obj2, b2);
                    this.j = true;
                    if (bq9VarB9.c(r0m0Var9, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var = new lpn0((mpn0) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB10.c(lpn0Var, this) == wneVar10) {
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
                    bq9 bq9VarB11 = hkb.B((dnq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var2 = new lpn0((wpn0) obj2, b5);
                    this.j = true;
                    if (bq9VarB11.c(lpn0Var2, this) == wneVar11) {
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
                    bq9 bq9VarB12 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var3 = new lpn0((wpn0) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB12.c(lpn0Var3, this) == wneVar12) {
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
                wne wneVar13 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var4 = new lpn0((wpn0) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB13.c(lpn0Var4, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                arn0 arn0Var2 = (arn0) obj2;
                jsn0 jsn0Var = (jsn0) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    byte b6 = 3;
                    dnq dnqVar = new dnq(new zj2(i120.W(new t7h(((tg5) arn0Var2.l.f22289a.b).d, jsn0Var.b, b6)), jsn0Var, arn0Var2, b3), new pr60(b6, z ? 1 : 0, b2), b5);
                    this.k = null;
                    this.l = arn0Var2;
                    this.j = true;
                    objM = ntb.M(dnqVar, this);
                    if (objM == wneVar14) {
                        return wneVar14;
                    }
                    arn0Var = arn0Var2;
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arn0 arn0Var3 = (arn0) this.l;
                    z1x.P(obj);
                    arn0Var = arn0Var3;
                    objM = obj;
                }
                arn0Var.z = (ksn0) objM;
                ol60 ol60Var = arn0Var2.v;
                ksn0 ksn0Var = arn0Var2.z;
                String str = ksn0Var != null ? ksn0Var.f18823a : null;
                if (str == null) {
                    str = "";
                }
                String str2 = ksn0Var != null ? ksn0Var.c : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = ksn0Var != null ? ksn0Var.b : null;
                ol60Var.f(new mqn0(str, str2, str3 != null ? str3 : ""));
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var5 = new lpn0((aun0) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB14.c(lpn0Var5, this) == wneVar15) {
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
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var6 = new lpn0((aun0) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB15.c(lpn0Var6, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((s6n0) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var7 = new lpn0((aun0) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB16.c(lpn0Var7, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                pun0 pun0Var = (pun0) obj2;
                wne wneVar18 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    i8i.D("screen", "bottom_change_bet_amount", pun0Var.p.f31532a, "deposit_call");
                    e41 e41Var = pun0Var.s;
                    String strG = pun0Var.t.g();
                    e41Var.getClass();
                    e41Var.f7161a.a(tx3.l0(new k1p[]{new j1p("bottom_change_bet_amount", (byte) 0), new j1p(strG, (byte) 2)}), 3043L);
                    v88Var = pun0Var.c;
                    i1w0 i1w0Var2 = pun0Var.h;
                    khf0 khf0Var = pun0Var.m;
                    bm5 bm5Var = bm5.j;
                    this.l = v88Var;
                    this.k = i1w0Var2;
                    this.j = true;
                    objG = khf0.G(khf0Var, bm5Var, this);
                    if (objG == wneVar18) {
                        return wneVar18;
                    }
                    i1w0Var = i1w0Var2;
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var = (i1w0) this.k;
                    v88 v88Var2 = (v88) this.l;
                    z1x.P(obj);
                    v88Var = v88Var2;
                    objG = obj;
                }
                ql5 ql5Var = (ql5) objG;
                pun0Var.n.a(bm5.j, ql5Var);
                v88.b(v88Var, i1w0Var, ql5Var.f28916a, 2);
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var8 = new lpn0((nfj0) obj2, b4);
                    this.j = true;
                    if (bq9VarB17.c(lpn0Var8, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bvn0 bvn0Var2 = (bvn0) obj2;
                wne wneVar20 = wne.f39444a;
                boolean z21 = this.j;
                yje yjeVar = null;
                if (!z21) {
                    z1x.P(obj);
                    int i = bvn0.E;
                    ArrayList arrayList3 = new ArrayList(bvn0Var2.N());
                    ArrayList<hpn0> arrayListO = bvn0Var2.O();
                    if (arrayList3.isEmpty() && arrayListO.isEmpty()) {
                        return Unit.f46060a;
                    }
                    for (hpn0 hpn0Var : arrayListO) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                epn0 epn0Var = (epn0) next;
                                bvn0Var = bvn0Var2;
                                if (epn0Var.d != hpn0Var.f13452a || epn0Var.e != hpn0Var.c) {
                                    bvn0Var2 = bvn0Var;
                                }
                            } else {
                                bvn0Var = bvn0Var2;
                                next = null;
                            }
                        }
                        if (next != null) {
                            bvn0Var2 = bvn0Var;
                        } else {
                            List list = ((gvn0) bvn0Var.D()).e;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : list) {
                                epn0 epn0Var2 = (epn0) obj3;
                                if (epn0Var2.d == hpn0Var.f13452a && epn0Var2.e == hpn0Var.c) {
                                    arrayList4.add(obj3);
                                }
                            }
                            bvn0Var2 = bvn0Var;
                            bvn0Var2.H(new mo1(arrayList4, b4));
                            arrayList3.addAll(arrayList4);
                        }
                    }
                    dq00 dq00Var = bvn0Var2.w;
                    this.l = arrayList3;
                    this.k = arrayListO;
                    this.j = true;
                    Object objD0 = qjj.d0(((mne) dq00Var.c).b, new qkb0(dq00Var, arrayList3, arrayListO, yjeVar, (byte) 10), this);
                    Object obj4 = objD0;
                    if (objD0 != wne.f39444a) {
                        obj4 = Unit.f46060a;
                    }
                    if (obj4 == wneVar20) {
                        return wneVar20;
                    }
                    arrayList = arrayList3;
                    arrayList2 = arrayListO;
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList2 = (ArrayList) this.k;
                    arrayList = (ArrayList) this.l;
                    z1x.P(obj);
                }
                mi9 mi9Var = bvn0Var2.s;
                List list2 = ((gvn0) bvn0Var2.D()).e;
                mi9Var.getClass();
                list2.getClass();
                mi9Var.f21833a.a(list2);
                ok50 ok50Var = bvn0Var2.r;
                List list3 = ((gvn0) bvn0Var2.D()).f;
                ok50Var.getClass();
                list3.getClass();
                ((z220) ok50Var.f25390a).b(list3);
                ((yvn0) bvn0Var2.z.f22575a.d).f.o(null, Boolean.TRUE);
                ArrayList arrayList5 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    axq.t(((hpn0) it2.next()).f13452a, arrayList5);
                }
                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(new Integer(((epn0) it3.next()).f8198a));
                }
                ArrayList arrayList7 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    axq.t(((hpn0) it4.next()).c, arrayList7);
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj5 : arrayList7) {
                    if (((Number) obj5).longValue() != -1) {
                        arrayList8.add(obj5);
                    }
                }
                s31 s31Var = bvn0Var2.A;
                s31Var.getClass();
                s31Var.f31532a.a("swipex_filter_call", xp20.f(new Pair("sport_id", CollectionsKt.b0(arrayList5, Separators.COMMA, null, null, null, 62)), new Pair("championship_id", CollectionsKt.b0(arrayList6, Separators.COMMA, null, null, null, 62)), new Pair("sub_sport_id", CollectionsKt.b0(arrayList8, Separators.COMMA, null, null, null, 62))));
                e41 e41Var2 = bvn0Var2.B;
                e41Var2.getClass();
                e41Var2.f7161a.a(!arrayList8.isEmpty() ? tx3.l0(new k1p[]{new j1p(CollectionsKt.b0(arrayList5, Separators.COMMA, null, null, null, 62), (byte) 0), new j1p(CollectionsKt.b0(arrayList6, Separators.COMMA, null, null, null, 62), (byte) 1), new j1p(CollectionsKt.b0(arrayList8, Separators.COMMA, null, null, null, 62), (byte) 2)}) : tx3.l0(new k1p[]{new j1p(CollectionsKt.b0(arrayList5, Separators.COMMA, null, null, null, 62), (byte) 0), new j1p(CollectionsKt.b0(arrayList6, Separators.COMMA, null, null, null, 62), (byte) 1)}), 3126L);
                i1w0 i1w0Var3 = bvn0Var2.v;
                k0w0 k0w0VarI = cs0.i(i1w0Var3, i1w0Var3);
                bvn0Var2.C.getClass();
                k0w0VarI.c(new SwipexScreenFactoryImpl$getSwipexScreen$1());
                ListIterator listIteratorO = b1j.o(i1w0Var3, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var3.a((oe50) pawVar.next());
                }
                break;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var9 = new lpn0((tvn0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB18.c(lpn0Var9, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var10 = new lpn0((tvn0) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB19.c(lpn0Var10, this) == wneVar22) {
                        return wneVar22;
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
                m0o0 m0o0Var2 = (m0o0) obj2;
                wne wneVar23 = wne.f39444a;
                boolean z24 = this.j;
                try {
                    if (!z24) {
                        z1x.P(obj);
                        e0g0 e0g0Var = j0g0.b;
                        wti wtiVar = m0o0Var2.f20964a;
                        String strA = m0o0Var2.c.a();
                        String strC = m0o0Var2.e.c();
                        this.k = null;
                        this.l = m0o0Var2;
                        this.j = true;
                        objA = ((ucp) ((ntl) wtiVar.c).invoke()).a(strA, strC, this);
                        if (objA == wneVar23) {
                            return wneVar23;
                        }
                        m0o0Var = m0o0Var2;
                    } else {
                        if (!z24) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m0o0 m0o0Var3 = (m0o0) this.l;
                        z1x.P(obj);
                        m0o0Var = m0o0Var3;
                        objA = obj;
                    }
                    m0o0Var.a(lgb.p0((hcp) ((dx5) objA).a()));
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Throwable thA = j0g0.a(g0g0Var);
                if (thA == null) {
                    return Unit.f46060a;
                }
                iun iunVar = iun.f15405a;
                j7p j7pVar = new j7p(0L, 0L, 0L, 0L);
                iunVar.getClass();
                abp abpVar = m0o0Var2.b;
                abpVar.getClass();
                abpVar.e.o(null, "");
                abpVar.f590a.o(null, new iap(j7pVar));
                abpVar.b.o(null, new iap(iunVar));
                abpVar.c.o(null, new iap(iunVar));
                abpVar.d.o(null, new iap(iunVar));
                throw thA;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var11 = new lpn0((nfj0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB20.c(lpn0Var11, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                return l(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar25 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((gmq) this.l, ((nfo0) this.k).u1, lkz.d);
                    lpn0 lpn0Var12 = new lpn0((bdl0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB21.c(lpn0Var12, this) == wneVar25) {
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
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar26 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var13 = new lpn0((sfo0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB22.c(lpn0Var13, this) == wneVar26) {
                        return wneVar26;
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
                wne wneVar27 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var14 = new lpn0((sfo0) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB23.c(lpn0Var14, this) == wneVar27) {
                        return wneVar27;
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
                wne wneVar28 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB24 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var15 = new lpn0((iho0) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB24.c(lpn0Var15, this) == wneVar28) {
                        return wneVar28;
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
                wne wneVar29 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    bq9 bq9VarB25 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    lpn0 lpn0Var16 = new lpn0((iho0) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB25.c(lpn0Var16, this) == wneVar29) {
                        return wneVar29;
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
    public agn0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(i89 i89Var, clz clzVar, tvn0 tvn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = tvn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, z2n0 z2n0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = z2n0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, ijn0 ijn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = ijn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, ijn0 ijn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = ijn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, mpn0 mpn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = mpn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, aun0 aun0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = aun0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, aun0 aun0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = aun0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, tvn0 tvn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = tvn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, sfo0 sfo0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = sfo0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, sfo0 sfo0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = sfo0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, iho0 iho0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = iho0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, clz clzVar, iho0 iho0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = iho0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(gmq gmqVar, nfo0 nfo0Var, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = nfo0Var;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(dnq dnqVar, clz clzVar, ijn0 ijn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = ijn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(dnq dnqVar, clz clzVar, wpn0 wpn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = wpn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(xae0 xae0Var, clz clzVar, ssl0 ssl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(xae0 xae0Var, clz clzVar, wpn0 wpn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = wpn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(xae0 xae0Var, clz clzVar, wpn0 wpn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = wpn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(s6n0 s6n0Var, clz clzVar, mpn0 mpn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.l = s6n0Var;
        this.k = clzVar;
        this.m = mpn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(s6n0 s6n0Var, clz clzVar, aun0 aun0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.l = s6n0Var;
        this.k = clzVar;
        this.m = aun0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agn0(zco0 zco0Var, qnf0 qnf0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.k = zco0Var;
        this.m = qnf0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agn0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
    }
}
