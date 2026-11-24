package a;

import android.gov.nist.core.LexerCore;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes.dex */
public final class k19 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17510a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k19(Object obj, byte b) {
        this.f17510a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        byte b = this.f17510a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    kj5 kj5Var = m19.U1;
                    ((m19) obj2).G0().x(x09.f40061a);
                }
                return Unit.f46060a;
            case 1:
                Object objInvoke = ((o47) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 2:
                Object objInvoke2 = ((yp6) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 3:
                Object objInvoke3 = ((yp6) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 4:
                Object objInvoke4 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 5:
                Object objInvoke5 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 6:
                Object objInvoke6 = ((o47) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 7:
                nlx nlxVar = (nlx) obj;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                if (nlxVar instanceof rsw) {
                    snapshotStateList.add(nlxVar);
                } else if (nlxVar instanceof ssw) {
                    snapshotStateList.remove(((ssw) nlxVar).f32747a);
                } else if (nlxVar instanceof qpq) {
                    snapshotStateList.add(nlxVar);
                } else if (nlxVar instanceof rpq) {
                    snapshotStateList.remove(((rpq) nlxVar).f30899a);
                } else if (nlxVar instanceof jub0) {
                    snapshotStateList.add(nlxVar);
                } else if (nlxVar instanceof kub0) {
                    snapshotStateList.remove(((kub0) nlxVar).f18904a);
                } else if (nlxVar instanceof iub0) {
                    snapshotStateList.remove(((iub0) nlxVar).f15389a);
                }
                return Unit.f46060a;
            case 8:
                return c((IndexedValue) obj, yjeVar);
            case 9:
                Object objInvoke7 = ((o47) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 10:
                Object objInvoke8 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 11:
                Object objInvoke9 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 12:
                Object objInvoke10 = ((o47) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 13:
                d3a d3aVar = (d3a) obj;
                qw9 qw9Var = (qw9) obj2;
                p7m0 p7m0Var = qw9Var.f;
                if (d3aVar instanceof z2a) {
                    p7m0Var.getClass();
                    p7m0Var.o(null, d3aVar);
                    Unit unit = Unit.f46060a;
                    wne wneVar = wne.f39444a;
                    return unit;
                }
                if (d3aVar instanceof b3a) {
                    p7m0Var.getClass();
                    p7m0Var.o(null, d3aVar);
                    Unit unit2 = Unit.f46060a;
                    wne wneVar2 = wne.f39444a;
                    return unit2;
                }
                if (!(d3aVar instanceof a3a)) {
                    return Unit.f46060a;
                }
                qoj0 qoj0Var = qw9Var.h;
                Unit unit3 = Unit.f46060a;
                Object objA = qoj0Var.a(unit3, yjeVar);
                return objA == wne.f39444a ? objA : unit3;
            case 14:
                Object objInvoke11 = ((nz9) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 15:
                Object objInvoke12 = ((nz9) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 16:
                Object objInvoke13 = ((nz9) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 17:
                Object objInvoke14 = ((nz9) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 18:
                Object objInvoke15 = ((nz9) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke16 = ((nz9) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 20:
                Object objInvoke17 = ((nz9) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 21:
                return b((w7a) obj, yjeVar);
            case 22:
                om5 om5Var = (om5) obj;
                wsa wsaVar = (wsa) obj2;
                int i = wsa.Q;
                p7m0 p7m0Var2 = wsaVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    wsaVar.f.getClass();
                } while (!p7m0Var2.m(value, gsa.a((gsa) value, null, om5Var, false, null, 0, 0, null, false, false, null, LexerCore.ID_NO_WHITESPACE)));
                return Unit.f46060a;
            case 23:
                Object objInvoke18 = ((o47) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 24:
                Object objInvoke19 = ((o47) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke20 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke21 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke22 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke23 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            default:
                Object objInvoke24 = ((c48) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public Object b(w7a w7aVar, yje yjeVar) {
        p7a p7aVar;
        odd oddVar;
        if (yjeVar instanceof p7a) {
            p7aVar = (p7a) yjeVar;
            int i = p7aVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7aVar.m = i - Integer.MIN_VALUE;
            } else {
                p7aVar = new p7a(this, yjeVar);
            }
        } else {
            p7aVar = new p7a(this, yjeVar);
        }
        Object objI = p7aVar.k;
        wne wneVar = wne.f39444a;
        int i2 = p7aVar.m;
        try {
            if (i2 == 0) {
                z1x.P(objI);
                odd oddVar2 = w7aVar.f38662a;
                dfv dfvVar = ((x7a) ((q7a) this.b).o.getValue()).f40404a;
                p7aVar.i = oddVar2;
                p7aVar.j = oddVar2;
                p7aVar.m = 1;
                objI = dfvVar.i(p7aVar);
                if (objI == wneVar) {
                    return wneVar;
                }
                oddVar = oddVar2;
                w7aVar = oddVar2;
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                odd oddVar3 = p7aVar.j;
                odd oddVar4 = p7aVar.i;
                z1x.P(objI);
                oddVar = oddVar3;
                w7aVar = oddVar4;
            }
            oddVar.N(objI);
        } catch (Throwable th) {
            w7aVar.b0(th);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r6.C(r7, r1) == r8) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.collections.IndexedValue r7, a.yje r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            a.gr00 r0 = (a.gr00) r0
            boolean r1 = r8 instanceof a.yj9
            if (r1 == 0) goto L17
            r1 = r8
            a.yj9 r1 = (a.yj9) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.l = r2
            goto L1c
        L17:
            a.yj9 r1 = new a.yj9
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r1.j
            a.wne r8 = a.wne.f39444a
            int r2 = r1.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L5c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            kotlin.collections.IndexedValue r7 = r1.i
            a.z1x.P(r6)
            goto L4d
        L3b:
            a.z1x.P(r6)
            java.lang.Object r6 = r0.b
            a.qoj0 r6 = (a.qoj0) r6
            r1.i = r7
            r1.l = r5
            java.lang.Object r6 = r6.a(r7, r1)
            if (r6 != r8) goto L4d
            goto L5b
        L4d:
            java.lang.Object r6 = r0.f11760a
            a.zz2 r6 = (a.zz2) r6
            r1.i = r3
            r1.l = r4
            java.lang.Object r6 = r6.C(r7, r1)
            if (r6 != r8) goto L5c
        L5b:
            return r8
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k19.c(kotlin.collections.IndexedValue, a.yje):java.lang.Object");
    }
}
