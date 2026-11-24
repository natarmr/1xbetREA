package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u5u extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5u(pwi pwiVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.l = pwiVar;
        this.j = z;
    }

    private final Object l(Object obj) {
        Object value;
        x5y x5yVar;
        e6y e6yVar = (e6y) this.l;
        ql5 ql5Var = (ql5) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            int i = e6y.G;
            p7m0 p7m0Var = e6yVar.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                x5yVar = (x5y) value;
            } while (!p7m0Var.m(value, x5y.a(x5yVar, null, zw6.a(x5yVar.c, androidx.compose.runtime.e.e(new a8q0("", 0L, 6)), 0.0d, 0.0d, 0.0d, 14), false, true, 27)));
            if (((pzu) e6yVar.r.f15453a).G().b != ql5Var.f28916a) {
                ngu nguVar = e6yVar.q;
                this.k = ql5Var;
                this.j = true;
                if (nguVar.a(ql5Var, this) == wneVar) {
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
        e6yVar.H(new ns6(ql5Var, ((x5y) e6yVar.D()).b.e, b));
        sac.V(jiu0.a(e6yVar), d6y.f5571a, null, e6yVar.A.f22085a, new cin(e6yVar, yjeVar, (byte) 24), 10);
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        s8y s8yVar = (s8y) this.k;
        ThreadLocal threadLocal = s8yVar.b;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        try {
            if (!z) {
                z1x.P(obj);
                Object obj2 = threadLocal.get();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.d(obj2, bool)) {
                    jf4.n("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    return null;
                }
                threadLocal.set(bool);
                wbj wbjVar = s8yVar.c;
                myh myhVar = new myh((Function1) this.l, yjeVar, (byte) 2);
                this.j = true;
                obj = wbjVar.a(new kyh(myhVar, null, (byte) 3), this);
                if (obj == wneVar) {
                    return wneVar;
                }
            } else {
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            az40 az40Var = (az40) obj;
            threadLocal.set(Boolean.FALSE);
            return az40Var;
        } catch (Throwable th) {
            threadLocal.set(Boolean.FALSE);
            throw th;
        }
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                u5u u5uVar = new u5u(obj2, yjeVar, (byte) 0);
                u5uVar.k = obj;
                return u5uVar;
            case 1:
                return new u5u((pau) this.k, (List) obj2, yjeVar, (byte) 1);
            case 2:
                return new u5u((pau) this.k, (List) obj2, yjeVar, (byte) 2);
            case 3:
                u5u u5uVar2 = new u5u(obj2, yjeVar, (byte) 3);
                u5uVar2.k = obj;
                return u5uVar2;
            case 4:
                u5u u5uVar3 = new u5u(obj2, yjeVar, (byte) 4);
                u5uVar3.k = obj;
                return u5uVar3;
            case 5:
                return new u5u((msu) this.k, (Set) obj2, yjeVar, (byte) 5);
            case 6:
                u5u u5uVar4 = new u5u(obj2, yjeVar, (byte) 6);
                u5uVar4.k = obj;
                return u5uVar4;
            case 7:
                return new u5u(obj2, yjeVar, (byte) 7);
            case 8:
                u5u u5uVar5 = new u5u((pwi) obj2, this.j, yjeVar);
                u5uVar5.k = obj;
                return u5uVar5;
            case 9:
                return new u5u((ndv) this.k, (String) obj2, yjeVar, (byte) 9);
            case 10:
                u5u u5uVar6 = new u5u(obj2, yjeVar, (byte) 10);
                u5uVar6.k = obj;
                return u5uVar6;
            case 11:
                return new u5u((alv) this.k, (ykv) obj2, yjeVar, (byte) 11);
            case 12:
                return new u5u((nc0) this.k, (k9s) obj2, yjeVar, (byte) 12);
            case 13:
                return new u5u((vyv) this.k, (List) obj2, yjeVar, (byte) 13);
            case 14:
                u5u u5uVar7 = new u5u(obj2, yjeVar, (byte) 14);
                u5uVar7.k = obj;
                return u5uVar7;
            case 15:
                return new u5u((naw) this.k, (pdj) obj2, yjeVar, (byte) 15);
            case 16:
                return new u5u(obj2, yjeVar, (byte) 16);
            case 17:
                return new u5u((hfw) this.k, (Long) obj2, yjeVar, (byte) 17);
            case 18:
                return new u5u((cyu) this.k, (String) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new u5u((ouu) this.k, (String) obj2, yjeVar, (byte) 19);
            case 20:
                return new u5u((ibx) this.k, (fbx) obj2, yjeVar, (byte) 20);
            case 21:
                u5u u5uVar8 = new u5u(obj2, yjeVar, (byte) 21);
                u5uVar8.k = obj;
                return u5uVar8;
            case 22:
                u5u u5uVar9 = new u5u(obj2, yjeVar, (byte) 22);
                u5uVar9.k = obj;
                return u5uVar9;
            case 23:
                u5u u5uVar10 = new u5u(obj2, yjeVar, (byte) 23);
                u5uVar10.k = obj;
                return u5uVar10;
            case 24:
                u5u u5uVar11 = new u5u(obj2, yjeVar, (byte) 24);
                u5uVar11.k = obj;
                return u5uVar11;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                u5u u5uVar12 = new u5u(obj2, yjeVar, (byte) 25);
                u5uVar12.k = obj;
                return u5uVar12;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                u5u u5uVar13 = new u5u(obj2, yjeVar, (byte) 26);
                u5uVar13.k = obj;
                return u5uVar13;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new u5u((s8y) this.k, (Function1) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new u5u((l7m0) this.k, (nly) obj2, yjeVar, (byte) 28);
            default:
                return new u5u((rny) this.k, (tny) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u5u) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((u5u) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((u5u) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((u5u) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((u5u) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((u5u) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((u5u) create((fl80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((u5u) create((l9s) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((u5u) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((u5u) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((u5u) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((u5u) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((u5u) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u5u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x042d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0430  */
    /* JADX WARN: Code duplicated, block: B:171:0x046f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0472  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v17 java.lang.Object, still in use, count: 2, list:
          (r6v17 java.lang.Object) from 0x0429: PHI (r6 I:??) = (r6v14 java.lang.Object), (r6v17 java.lang.Object) binds: [B:144:0x0428, B:579:0x0429] A[DONT_GENERATE, DONT_INLINE]
          (r6v17 java.lang.Object) from 0x041d: CHECK_CAST (a.bpw) (r6v17 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 3150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u5u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5u(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5u(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}
