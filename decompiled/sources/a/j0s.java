package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;

/* JADX INFO: loaded from: classes3.dex */
public final class j0s extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0s(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    private final Object l(Object obj) {
        List list = (List) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        t0w t0wVar = (t0w) this.k;
        art artVar = t0w.l2;
        a8z a8zVar = t0wVar.k2;
        ((o0w) a8zVar.getValue()).f = list;
        ((o0w) a8zVar.getValue()).g();
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        pdj pdjVar = ((odj) ((psc) ((jru) this.j).b).b).f25078a;
        v0w v0wVar = (v0w) this.k;
        p7m0 p7m0Var = v0wVar.d;
        ArrayList<pdj> arrayList = new ArrayList();
        if (v0wVar.b) {
            arrayList.add(pdj.f26809a);
            arrayList.add(pdj.b);
        }
        if (v0wVar.c) {
            arrayList.add(pdj.c);
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (pdj pdjVar2 : arrayList) {
            pdjVar2.getClass();
            pdjVar.getClass();
            arrayList2.add(new u0w(pdjVar2, pdjVar2 == pdjVar ? R.attr.uikitPrimary : R.attr.uikitTextPrimary));
        }
        p7m0Var.getClass();
        p7m0Var.o(null, arrayList2);
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        s1w s1wVar = (s1w) this.j;
        bst bstVar = s1w.d2;
        s1wVar.I0().o.y0(((r9w) ((s9w) this.k)).f30107a);
        naw nawVarM0 = s1wVar.M0();
        sac.V(jiu0.a(nawVarM0), law.f19726a, null, nawVarM0.L.c, new v9w(nawVarM0, null, (byte) 4), 10);
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        r2w r2wVar = (r2w) this.k;
        dc60 dc60Var = (dc60) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (dc60Var != null) {
            if (dc60Var instanceof cc60) {
                n3w n3wVar = ((cc60) dc60Var).f4094a;
                if (Intrinsics.d(n3wVar.f22868a, r2wVar.d.f22868a)) {
                    r2wVar.E(n3wVar);
                }
            } else if (dc60Var instanceof bc60) {
                n3w n3wVar2 = ((bc60) dc60Var).f2339a;
                if (Intrinsics.d(n3wVar2.f22868a, r2wVar.d.f22868a)) {
                    r2wVar.E(n3wVar2);
                }
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new j0s((iia) this.j, (l0s) obj2, yjeVar, (byte) 0);
            case 1:
                return new j0s((j2s) this.j, (l7m0) obj2, yjeVar, (byte) 1);
            case 2:
                return new j0s((i7s) this.j, (l7m0) obj2, yjeVar, (byte) 2);
            case 3:
                j0s j0sVar = new j0s((sbs) obj2, yjeVar, (byte) 3);
                j0sVar.j = obj;
                return j0sVar;
            case 4:
                return new j0s((cjs) this.j, (l7m0) obj2, yjeVar, (byte) 4);
            case 5:
                return new j0s((Throwable) this.j, (zns) obj2, yjeVar, (byte) 5);
            case 6:
                return new j0s((i4) this.j, (pz40) obj2, yjeVar, (byte) 6);
            case 7:
                j0s j0sVar2 = new j0s((GameVideoWindowService) obj2, yjeVar, (byte) 7);
                j0sVar2.j = obj;
                return j0sVar2;
            case 8:
                j0s j0sVar3 = new j0s((x1t) obj2, yjeVar, (byte) 8);
                j0sVar3.j = obj;
                return j0sVar3;
            case 9:
                j0s j0sVar4 = new j0s((GameZoneWindowService) obj2, yjeVar, (byte) 9);
                j0sVar4.j = obj;
                return j0sVar4;
            case 10:
                j0s j0sVar5 = new j0s((z2t) obj2, yjeVar, (byte) 10);
                j0sVar5.j = obj;
                return j0sVar5;
            case 11:
                j0s j0sVar6 = new j0s((a9t) obj2, yjeVar, (byte) 11);
                j0sVar6.j = obj;
                return j0sVar6;
            case 12:
                return new j0s((sit) this.j, (String) obj2, yjeVar, (byte) 12);
            case 13:
                j0s j0sVar7 = new j0s((hkt) obj2, yjeVar, (byte) 13);
                j0sVar7.j = obj;
                return j0sVar7;
            case 14:
                j0s j0sVar8 = new j0s((qgd) obj2, yjeVar, (byte) 14);
                j0sVar8.j = obj;
                return j0sVar8;
            case 15:
                j0s j0sVar9 = new j0s((abu) obj2, yjeVar, (byte) 15);
                j0sVar9.j = obj;
                return j0sVar9;
            case 16:
                j0s j0sVar10 = new j0s((r4v) obj2, yjeVar, (byte) 16);
                j0sVar10.j = obj;
                return j0sVar10;
            case 17:
                j0s j0sVar11 = new j0s((g8v) obj2, yjeVar, (byte) 17);
                j0sVar11.j = obj;
                return j0sVar11;
            case 18:
                j0s j0sVar12 = new j0s((u8v) obj2, yjeVar, (byte) 18);
                j0sVar12.j = obj;
                return j0sVar12;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new j0s((l7m0) this.j, (ngk0) obj2, yjeVar, (byte) 19);
            case 20:
                return new j0s((Throwable) this.j, (wav) obj2, yjeVar, (byte) 20);
            case 21:
                j0s j0sVar13 = new j0s((bhv) obj2, yjeVar, (byte) 21);
                j0sVar13.j = obj;
                return j0sVar13;
            case 22:
                j0s j0sVar14 = new j0s((eiv) obj2, yjeVar, (byte) 22);
                j0sVar14.j = obj;
                return j0sVar14;
            case 23:
                j0s j0sVar15 = new j0s((lkv) obj2, yjeVar, (byte) 23);
                j0sVar15.j = obj;
                return j0sVar15;
            case 24:
                j0s j0sVar16 = new j0s((rwv) obj2, yjeVar, (byte) 24);
                j0sVar16.j = obj;
                return j0sVar16;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                j0s j0sVar17 = new j0s((t0w) obj2, yjeVar, (byte) 25);
                j0sVar17.j = obj;
                return j0sVar17;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new j0s((jru) this.j, (v0w) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new j0s((s1w) this.j, (s9w) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                j0s j0sVar18 = new j0s((r2w) obj2, yjeVar, (byte) 28);
                j0sVar18.j = obj;
                return j0sVar18;
            default:
                return new j0s((naw) this.j, (String) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((j0s) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((j0s) create((bzs) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((j0s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((j0s) create((i1t) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((j0s) create((l3t) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((j0s) create((zy5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((j0s) create((d9h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((j0s) create((uwk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((j0s) create((qqp0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((j0s) create((q8v) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((j0s) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((j0s) create((fhv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((j0s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((j0s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((j0s) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((j0s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((j0s) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((j0s) create((dc60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x0299  */
    /* JADX WARN: Code duplicated, block: B:92:0x029d  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v67 java.lang.Object, still in use, count: 2, list:
          (r3v67 java.lang.Object) from 0x0294: PHI (r3 I:??) = (r3v64 java.lang.Object), (r3v67 java.lang.Object) binds: [B:87:0x0293, B:505:0x0294] A[DONT_GENERATE, DONT_INLINE]
          (r3v67 java.lang.Object) from 0x0286: CHECK_CAST (a.sfp0) (r3v67 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 3258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j0s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0s(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
