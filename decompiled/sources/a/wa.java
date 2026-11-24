package a;

import a.h97;
import a.ka9;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xplatform.playersduel.api.presentation.PlayerDuelParams;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes3.dex */
public final class wa extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wa(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return new wa((ab) obj2, yjeVar, (byte) 0);
            case 1:
                return new wa((wj) obj2, yjeVar, (byte) 1);
            case 2:
                return new wa((s20) obj2, yjeVar, (byte) 2);
            case 3:
                return new wa((bk1) obj2, yjeVar, (byte) 3);
            case 4:
                return new wa((wk1) obj2, yjeVar, (byte) 4);
            case 5:
                return new wa((n92) obj2, yjeVar, (byte) 5);
            case 6:
                return new wa((qi2) obj2, yjeVar, (byte) 6);
            case 7:
                return new wa((fk2) obj2, yjeVar, (byte) 7);
            case 8:
                return new wa((ij3) obj2, yjeVar, (byte) 8);
            case 9:
                return new wa((on3) obj2, yjeVar, (byte) 9);
            case 10:
                return new wa((to3) obj2, yjeVar, (byte) 10);
            case 11:
                return new wa((kc4) obj2, yjeVar, (byte) 11);
            case 12:
                return new wa((hl4) obj2, yjeVar, (byte) 12);
            case 13:
                return new wa((il4) obj2, yjeVar, (byte) 13);
            case 14:
                return new wa((fy4) obj2, yjeVar, (byte) 14);
            case 15:
                return new wa((g85) obj2, yjeVar, (byte) 15);
            case 16:
                return new wa((dk5) obj2, yjeVar, (byte) 16);
            case 17:
                return new wa((p36) obj2, yjeVar, (byte) 17);
            case 18:
                return new wa((p36) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new wa((bxq0) obj2, yjeVar, (byte) 19);
            case 20:
                return new wa((me6) obj2, yjeVar, (byte) 20);
            case 21:
                return new wa((dk6) obj2, yjeVar, (byte) 21);
            case 22:
                return new wa((vp6) obj2, yjeVar, (byte) 22);
            case 23:
                return new wa((as6) obj2, yjeVar, (byte) 23);
            case 24:
                return new wa((dt6) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new wa((st6) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new wa((f97) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new wa((tu7) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new wa((r9a) obj2, yjeVar, (byte) 28);
            default:
                return new wa((w5b) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wa) create((ab50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wa) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wa) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((wa) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wa) create((fqp0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wa) create((nj2) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wa) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((wa) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((wa) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((wa) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((wa) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((wa) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((wa) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((wa) create((za50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((wa) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        jh3 jh3VarA;
        Object value5;
        Object value6;
        Object value7;
        s75 s75Var;
        Object value8;
        Object value9;
        c820 c820Var;
        svj0 svj0Var;
        Object value10;
        boolean z;
        Object value11;
        byte b = this.i;
        o0w0 o0w0Var = o0w0.f24450a;
        byte b2 = 3;
        yje yjeVar = null;
        boolean z2 = false;
        z2 = false;
        byte b3 = 1;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((ab) obj2).w0.f(aa.f499a);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                wj wjVar = (wj) obj2;
                xr xrVar = wjVar.p;
                ActionMenuDialogParams actionMenuDialogParams = wjVar.b;
                xrVar.v(actionMenuDialogParams.f, "duel");
                final gl5 gl5Var = wjVar.j;
                final PlayerDuelParams playerDuelParams = new PlayerDuelParams(actionMenuDialogParams.f46984a, actionMenuDialogParams.e, actionMenuDialogParams.f);
                gl5Var.getClass();
                wjVar.w(new FragmentScreen() { // from class: org.xplatform.playersduel.impl.navigation.BuildDuelScreenFactoryImpl$getScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        ka9.Q1.getClass();
                        ka9 ka9Var = new ka9();
                        ka9Var.M1.J(ka9Var, ka9.R1[0], playerDuelParams);
                        return ka9Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        gl5Var.getClass();
                        return h97.h(playerDuelParams.f46823a, "BUILD_DUEL_FRAGMENT");
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                }, false, true);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                s20 s20Var = (s20) obj2;
                i1w0 i1w0Var = s20Var.q;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        s20Var.G(i20.f14026a);
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i = bk1.D;
                p7m0 p7m0Var = ((bk1) obj2).i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, j8d0.a((j8d0) value, false, c8d0.f3909a, null, null, 3839)));
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                int i2 = wk1.w;
                ((wk1) obj2).M();
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                n92 n92Var = (n92) obj2;
                IntRange intRange = n92.h0;
                n92Var.O();
                n92Var.P();
                bby bbyVar = n92Var.Z;
                if (bbyVar == null || !bbyVar.isActive()) {
                    n92Var.Z = i3t0.K(n92Var, null, null, new j92(n92Var, yjeVar, z2 ? (byte) 1 : (byte) 0), 3);
                }
                n92Var.N();
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                int i3 = qi2.D;
                p7m0 p7m0Var2 = ((qi2) obj2).i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ei2.a((ei2) value2, null, false, null, false, false, null, 111)));
                break;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                int i4 = fk2.K;
                p7m0 p7m0Var3 = ((fk2) obj2).i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, pj2.a((pj2) value3, null, false, null, false, false, false, false, 239)));
                break;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                ij3 ij3Var = (ij3) obj2;
                oc5 oc5VarA = ij3Var.k.a(ed5.f7601a);
                if (oc5VarA != null) {
                    p7m0 p7m0Var4 = ij3Var.j0;
                    do {
                        value4 = p7m0Var4.getValue();
                        jh3VarA = (jh3) value4;
                        if (jh3VarA.f == null) {
                            jh3VarA = jh3.a(jh3VarA, null, null, null, oc5VarA, null, null, null, null, false, false, 4063);
                        }
                    } while (!p7m0Var4.m(value4, jh3VarA));
                }
                break;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                on3 on3Var = (on3) obj2;
                oc5 oc5VarA2 = on3Var.p.a(ed5.b);
                p7m0 p7m0Var5 = on3Var.r;
                do {
                    value5 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value5, um3.a((um3) value5, null, null, oc5VarA2, null, false, false, false, false, false, 65527)));
                break;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((to3) obj2).g();
                break;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                int i5 = kc4.Y;
                p7m0 p7m0Var6 = ((kc4) obj2).i.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                } while (!p7m0Var6.m(value6, mb4.a((mb4) value6, false, false, true, null, null, null, 0, false, null, null, false, 16375)));
                break;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                hl4 hl4Var = (hl4) obj2;
                i1w0 i1w0Var2 = hl4Var.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                c8d c8dVar = new c8d(y7d.f42146a, o0w0Var);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ2, c8dVar, c8dVar, i1w0Var2, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator;
                    if (!pawVar2.hasNext()) {
                        p7m0 p7m0Var7 = hl4Var.h;
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, wk4.f39291a);
                    } else {
                        i1w0Var2.a((oe50) pawVar2.next());
                    }
                    break;
                }
                break;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                il4 il4Var = (il4) obj2;
                i1w0 i1w0Var3 = il4Var.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                c8d c8dVar2 = new c8d(y7d.f42146a, o0w0Var);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ3, c8dVar2, c8dVar2, i1w0Var3, copyOnWriteArrayListQ3).listIterator(0);
                while (true) {
                    paw pawVar3 = (paw) listIterator2;
                    if (!pawVar3.hasNext()) {
                        p7m0 p7m0Var8 = il4Var.h;
                        p7m0Var8.getClass();
                        p7m0Var8.o(null, xk4.f41013a);
                    } else {
                        i1w0Var3.a((oe50) pawVar3.next());
                    }
                    break;
                }
                break;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ((fy4) obj2).H(bwo0.f3335a);
                break;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                int i6 = g85.A;
                p7m0 p7m0Var9 = ((g85) obj2).i.f25029a;
                do {
                    value7 = p7m0Var9.getValue();
                    value7.getClass();
                    s75Var = (s75) value7;
                } while (!p7m0Var9.m(value7, s75.a(s75Var, m65.a(s75Var.f31733a, true, false, null, false, null, 28), false, false, 14)));
                break;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                dk5 dk5Var = (dk5) obj2;
                ffs0 ffs0Var = dk5Var.O;
                if (ffs0Var != null) {
                    ffs0Var.c();
                }
                qes0 qes0Var = dk5Var.P;
                if (qes0Var != null) {
                    qes0Var.c();
                }
                bby bbyVar2 = dk5Var.X;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                break;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                ((p36) obj2).f();
                break;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ((p36) obj2).g();
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                ((bxq0) obj2).a();
                break;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                me6 me6Var = (me6) obj2;
                me6Var.z(new xd6(me6Var, b2));
                me6Var.x();
                break;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                dk6 dk6Var = (dk6) obj2;
                sac.T(new fnq(i120.W(new rf0(new fnq(((n9s) dk6Var.r.f40284a).a(), new qj6(dk6Var, yjeVar, b3), (byte) 4), (byte) 2)), new pj6(dk6Var, yjeVar, b2), (byte) 4), jiu0.a(dk6Var), uj6.h);
                break;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                vp6 vp6Var = (vp6) obj2;
                boolean z3 = !((jp6) vp6Var.D()).d;
                ArrayList arrayListA = vp6Var.s.a();
                if (!vp6.O(arrayListA) && ((jp6) vp6Var.D()).r) {
                    z2 = true;
                }
                p7m0 p7m0Var10 = vp6Var.i.f25029a;
                do {
                    value8 = p7m0Var10.getValue();
                    value8.getClass();
                } while (!p7m0Var10.m(value8, jp6.a((jp6) value8, false, false, false, z3, null, null, null, null, null, false, null, false, false, false, null, false, null, false, 2097143)));
                vp6Var.S(arrayListA, z2);
                break;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                ((as6) obj2).F.f(vct.f37203a);
                break;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                dt6 dt6Var = (dt6) obj2;
                int i7 = dt6.e0;
                nwo0 nwo0VarC = dt6Var.o.c();
                boolean z4 = ((c820) dt6Var.D()).j;
                if (((c820) dt6Var.D()).i && (nwo0VarC.f24244a || z4)) {
                    p7m0 p7m0Var11 = dt6Var.i.f25029a;
                    do {
                        value9 = p7m0Var11.getValue();
                        value9.getClass();
                        c820Var = (c820) value9;
                        svj0Var = c820Var.d;
                    } while (!p7m0Var11.m(value9, c820.a(c820Var, null, null, null, svj0.a(svj0Var, null, null, lwo0.a(svj0Var.c, true, true, 0.0d, null, 60), 11), null, null, false, false, false, false, null, 8183)));
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                st6 st6Var = (st6) obj2;
                yk5 yk5Var = st6.R1;
                st6Var.G0().c.u();
                st6Var.G0().c.setIsNeedClearText(true);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                int i8 = f97.R0;
                p7m0 p7m0Var12 = ((f97) obj2).i.f25029a;
                do {
                    value10 = p7m0Var12.getValue();
                    value10.getClass();
                } while (!p7m0Var12.m(value10, i77.a((i77) value10, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, true, false, null, null, null, null, null, -33554433, 2047)));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                tu7 tu7Var = (tu7) obj2;
                int i9 = tu7.D;
                c4m0 c4m0Var = tu7Var.C;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    tu7Var.C = sac.T(new fnq(new i89(tu7Var.u.f44923a.f2157a.b, (byte) 22), new yg1(tu7Var, yjeVar, b2), (byte) 4), jiu0.a(tu7Var), foe.h);
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                ((r9a) obj2).l(true);
                break;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                w5b w5bVar = (w5b) obj2;
                sff0 sff0VarA = w5bVar.r.a();
                if (sff0VarA.B0) {
                    r9u r9uVar = w5bVar.x;
                    ygp ygpVar = ygp.u;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    if (j1q0Var.f15748a.d(ygpVar)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                boolean zJ = w5bVar.s.j();
                boolean z5 = sff0VarA.L.f30534a;
                mum0 mum0Var = sff0VarA.g;
                String str = mum0Var.i.f12896a;
                vcp vcpVar = mum0Var.B;
                q1w0 q1w0Var = sff0VarA.d;
                boolean z6 = q1w0Var.b;
                hl1 hl1Var = sff0VarA.b;
                z4b z4bVar = new z4b(zJ, z5, z6, hl1Var.b, hl1Var.C, str, q1w0Var.f27973a.b, vcpVar, z, w5bVar.y.l());
                p7m0 p7m0Var13 = w5bVar.i.f25029a;
                do {
                    value11 = p7m0Var13.getValue();
                    value11.getClass();
                } while (!p7m0Var13.m(value11, p5b.a((p5b) value11, z4bVar, null, null, null, false, false, null, false, 254)));
                break;
        }
        return Unit.f46060a;
    }
}
