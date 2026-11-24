package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class l4p implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19419a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l4p(Object obj, byte b) {
        this.f19419a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.f19419a;
        yje yjeVar2 = null;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                List list = (List) obj;
                org.xplatform.favorites.impl.presentation.category.a aVar = (org.xplatform.favorites.impl.presentation.category.a) obj2;
                oyg0 oyg0Var = aVar.f;
                ocj ocjVar = aVar.i;
                int i = org.xplatform.favorites.impl.presentation.category.a.L;
                boolean z = ((CharSequence) ((p7m0) aVar.F).getValue()).length() == 0;
                if (list.isEmpty() && !z) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, x4p.a((x4p) value2, null, null, null, f4p.d, null, null, false, false, false, false, null, false, false, 16119)));
                } else if (list.isEmpty()) {
                    c4m0 c4m0Var = aVar.H;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        aVar.H = sac.T(new fnq(new dnq(aVar.r.M0(((sff0) aVar.E.getValue()).J1), new s4p(aVar, yjeVar2, b2), (byte) 1), new sxk(aVar, yjeVar2, (byte) 12), (byte) 4), d5c.S(jiu0.a(aVar), aVar.t.b), new pfl(2, aVar, org.xplatform.favorites.impl.presentation.category.a.class, "onDataLoadError", "onDataLoadError(Ljava/lang/Throwable;)V", 4, (byte) 6));
                    }
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, x4p.a((x4p) value, null, list, null, f4p.f8926a, null, null, false, false, false, false, null, false, false, 16117)));
                    c4m0 c4m0Var2 = aVar.H;
                    if (c4m0Var2 != null) {
                        c4m0Var2.cancel(null);
                    }
                }
                return Unit.f46060a;
            case 2:
                Object objInvoke2 = ((r5p) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 3:
                Object objInvoke3 = ((r5p) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 4:
                Object objInvoke4 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 5:
                List list2 = (List) obj;
                h7p h7pVar = (h7p) obj2;
                int i2 = h7p.r;
                p7m0 p7m0Var3 = h7pVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    h7pVar.f.getClass();
                } while (!p7m0Var3.m(value3, d7p.a((d7p) value3, list2, null, 2)));
                if (list2.isEmpty()) {
                    h7pVar.G(x6p.f40374a);
                }
                return Unit.f46060a;
            case 6:
                hc80 hc80Var = (hc80) obj;
                ccp ccpVar = (ccp) obj2;
                int i3 = ccp.u0;
                p7m0 p7m0Var4 = ccpVar.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    ccpVar.f.getClass();
                } while (!p7m0Var4.m(value4, dd80.a((dd80) value4, false, false, false, false, false, false, hc80Var, null, false, 7997)));
                return Unit.f46060a;
            case 7:
                Object objInvoke5 = ((sxk) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 8:
                Pair pair = (Pair) obj;
                List list3 = (List) pair.f46059a;
                boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
                org.xplatform.favorites.impl.presentation.category.f fVar = (org.xplatform.favorites.impl.presentation.category.f) obj2;
                p7m0 p7m0Var5 = fVar.x;
                if (list3.isEmpty() && zBooleanValue) {
                    nep nepVar = new nep((jkm) fVar.v.getValue());
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, nepVar);
                } else if (list3.isEmpty()) {
                    c4m0 c4m0Var3 = fVar.A;
                    if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                        fVar.A = qjj.W(jiu0.a(fVar), fVar.m.b, null, new fr9(fVar, yjeVar2, (byte) 28), 2);
                    }
                } else {
                    mep mepVar = new mep(list3, true);
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, mepVar);
                    c4m0 c4m0Var4 = fVar.A;
                    if (c4m0Var4 != null) {
                        c4m0Var4.cancel(null);
                    }
                }
                return Unit.f46060a;
            case 9:
                bo0 bo0Var = new bo0((List) obj, (byte) 13);
                int i4 = eop.Z;
                ((eop) obj2).H(bo0Var);
                return Unit.f46060a;
            case 10:
                Object objInvoke6 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 11:
                Object objInvoke7 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 12:
                Object objInvoke8 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 13:
                Object objInvoke9 = ((h6q) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 14:
                Object objInvoke10 = ((h6q) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 15:
                Object objInvoke11 = ((h6q) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 16:
                Object objInvoke12 = ((h6q) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 17:
                Object objInvoke13 = ((h6q) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 18:
                Object objInvoke14 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke15 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 20:
                ((Collection) obj2).add(obj);
                return Unit.f46060a;
            case 21:
                Object objInvoke16 = ((jjr) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 22:
                Object objInvoke17 = ((kjr) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 23:
                Object objInvoke18 = ((jjr) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 24:
                Object objInvoke19 = ((kjr) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke20 = ((sxk) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke21 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke22 = ((jv0) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke23 = ((g6g) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            default:
                Object objInvoke24 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
        }
    }
}
