package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class lpn0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20451a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lpn0(Object obj, byte b) {
        this.f20451a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        Object value;
        Object value2;
        byte b = this.f20451a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((mpn0) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((wpn0) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                Object objInvoke3 = ((wpn0) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 3:
                Object objInvoke4 = ((wpn0) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 4:
                Object objInvoke5 = ((aun0) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 5:
                Object objInvoke6 = ((aun0) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 6:
                Object objInvoke7 = ((aun0) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 7:
                Object objInvoke8 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 8:
                Object objInvoke9 = ((tvn0) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 9:
                Object objInvoke10 = ((tvn0) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 10:
                ksn0 ksn0Var = (ksn0) obj;
                zyn0 zyn0Var = (zyn0) obj2;
                int i = zyn0.u0;
                p7m0 p7m0Var = zyn0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    zyn0Var.f.getClass();
                } while (!p7m0Var.m(value, vxn0.a((vxn0) value, null, null, false, false, false, false, false, false, ksn0Var.f18823a, ksn0Var.b, ksn0Var.c, ksn0Var.d, null, false, false, false, null, 127231)));
                return Unit.f46060a;
            case 11:
                Object objInvoke11 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 12:
                return c(((Boolean) obj).booleanValue(), yjeVar);
            case 13:
                Object objInvoke12 = ((bdl0) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 14:
                Object objInvoke13 = ((sfo0) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 15:
                Object objInvoke14 = ((sfo0) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 16:
                return b((Map) obj, yjeVar);
            case 17:
                Object objInvoke15 = ((iho0) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 18:
                Object objInvoke16 = ((iho0) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return b((Map) obj, yjeVar);
            case 20:
                List list = (List) obj;
                umo0 umo0Var = (umo0) obj2;
                if (((x2m0) umo0Var.D()).c == null) {
                    return Unit.f46060a;
                }
                p7m0 p7m0Var2 = umo0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    umo0Var.f.getClass();
                } while (!p7m0Var2.m(value2, x2m0.a((x2m0) value2, false, false, null, list, null, null, 119)));
                return Unit.f46060a;
            case 21:
                Object objInvoke17 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 22:
                jzo0 jzo0Var = (jzo0) obj;
                b0p0 b0p0Var = (b0p0) obj2;
                int i2 = b0p0.I;
                ArrayList arrayList = jzo0Var.b;
                ArrayList arrayList2 = jzo0Var.b;
                d0t d0tVar = jzo0Var.f17426a;
                boolean z = (arrayList.isEmpty() && d0tVar == null) ? false : true;
                if (z) {
                    i3t0.A(b0p0Var, b0p0Var.s, new did(CollectionsKt.q0(q3d.k(d0tVar), arrayList2)), null, null, 6);
                }
                p7m0 p7m0Var3 = b0p0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    szo0 szo0Var = (szo0) value3;
                    b0p0Var.f.getClass();
                    ArrayList arrayList3 = arrayList2;
                    if (p7m0Var3.m(value3, szo0.a(szo0Var, jzo0Var.f17426a, arrayList3, z ? izo0.f15644a : izo0.c, null, false, 40))) {
                        return Unit.f46060a;
                    }
                    arrayList2 = arrayList3;
                }
                break;
            case 23:
                Object objInvoke18 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 24:
                Object objInvoke19 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke20 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke21 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke22 = ((ssl0) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke23 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            default:
                Object objInvoke24 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0217  */
    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0364 A[PHI: r0 r1 r5 r7
  0x0364: PHI (r0v21 java.lang.Object) = (r0v20 java.lang.Object), (r0v1 java.lang.Object) binds: [B:158:0x0361, B:111:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x0364: PHI (r1v3 java.util.Map) = (r1v2 java.util.Map), (r1v10 java.util.Map) binds: [B:158:0x0361, B:111:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x0364: PHI (r5v22 a.p7m0) = (r5v21 a.p7m0), (r5v27 a.p7m0) binds: [B:158:0x0361, B:111:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x0364: PHI (r7v2 int) = (r7v1 int), (r7v13 int) binds: [B:158:0x0361, B:111:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x017c A[PHI: r1 r2 r4 r5 r6
  0x017c: PHI (r1v20 int) = (r1v19 int), (r1v34 int) binds: [B:66:0x0179, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x017c: PHI (r2v21 java.lang.Object) = (r2v20 java.lang.Object), (r2v5 java.lang.Object) binds: [B:66:0x0179, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x017c: PHI (r4v14 a.rio0) = (r4v13 a.rio0), (r4v17 a.rio0) binds: [B:66:0x0179, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x017c: PHI (r5v50 java.util.Map) = (r5v49 java.util.Map), (r5v60 java.util.Map) binds: [B:66:0x0179, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x017c: PHI (r6v4 a.p7m0) = (r6v3 a.p7m0), (r6v8 a.p7m0) binds: [B:66:0x0179, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01da  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ea A[LOOP:1: B:77:0x01d4->B:84:0x01ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f5  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v20 java.lang.Object, still in use, count: 2, list:
          (r5v20 java.lang.Object) from 0x028a: PHI (r5 I:??) = (r5v17 java.lang.Object), (r5v20 java.lang.Object) binds: [B:122:0x0289, B:207:0x028a] A[DONT_GENERATE, DONT_INLINE]
          (r5v20 java.lang.Object) from 0x0282: CHECK_CAST (a.yx10) (r5v20 java.lang.Object)
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
    public java.lang.Object b(java.util.Map r24, a.yje r25) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lpn0.b(java.util.Map, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object c(boolean z, yje yjeVar) {
        peo0 peo0Var;
        if (yjeVar instanceof peo0) {
            peo0Var = (peo0) yjeVar;
            int i = peo0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                peo0Var.k = i - Integer.MIN_VALUE;
            } else {
                peo0Var = new peo0(this, yjeVar);
            }
        } else {
            peo0Var = new peo0(this, yjeVar);
        }
        peo0 peo0Var2 = peo0Var;
        Object obj = peo0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = peo0Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            t33 t33Var = (t33) this.b;
            Float f = new Float(z ? 1.0f : 0.0f);
            peo0Var2.k = 1;
            if (t33.a(t33Var, f, null, null, null, peo0Var2, 14) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
