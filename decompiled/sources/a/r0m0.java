package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r0m0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29638a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0m0(Object obj, byte b) {
        this.f29638a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        txm0 txm0Var;
        Long lValueOf;
        xum0 xum0Var;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        byte b = this.f29638a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((ssl0) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((ah0) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                Object objInvoke3 = ((ah0) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 3:
                Object objInvoke4 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 4:
                Object objInvoke5 = ((gqm0) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 5:
                Object objInvoke6 = ((gqm0) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 6:
                Object objInvoke7 = ((gvm0) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 7:
                Object objInvoke8 = ((gvm0) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 8:
                Object objInvoke9 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 9:
                v5s v5sVar = (v5s) obj;
                wxm0 wxm0Var = (wxm0) obj2;
                if (v5sVar instanceof t5s) {
                    List list = ((t5s) v5sVar).h.H;
                    int i = wxm0.q;
                    p7m0 p7m0Var = wxm0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        txm0Var = (txm0) value;
                        wxm0Var.f.getClass();
                        lValueOf = txm0Var.b;
                        if (lValueOf == null && (xum0Var = (xum0) CollectionsKt.firstOrNull(list)) != null) {
                            lValueOf = Long.valueOf(xum0Var.b);
                        }
                    } while (!p7m0Var.m(value, txm0.a(txm0Var, list, lValueOf, null, 4)));
                } else {
                    int i2 = wxm0.q;
                    wxm0Var.G(qxm0.f29492a);
                }
                return Unit.f46060a;
            case 10:
                Object objInvoke10 = ((dym0) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 11:
                Object objInvoke11 = ((dym0) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 12:
                Object objInvoke12 = ((dym0) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 13:
                Object objInvoke13 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 14:
                Object objInvoke14 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 15:
                Object objInvoke15 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 16:
                Object objInvoke16 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 17:
                x8n0 x8n0Var = (x8n0) obj;
                rdn0 rdn0Var = (rdn0) obj2;
                oyg0 oyg0Var = rdn0Var.f;
                int i3 = rdn0.I;
                ocj ocjVar = rdn0Var.i;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, hdn0.a((hdn0) value2, null, false, null, null, null, null, false, false, false, null, false, false, false, 8063)));
                List listG = rdn0Var.z.g(x8n0Var.a());
                if (x8n0Var.a().isEmpty()) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value5 = p7m0Var3.getValue();
                        value5.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value5, hdn0.a((hdn0) value5, iun.f15405a, false, bdn0.f2407a, cdn0.c, null, null, false, false, false, null, false, false, false, 8178)));
                } else if (x8n0Var instanceof v8n0) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value4, hdn0.a((hdn0) value4, listG, false, bdn0.b, cdn0.f4170a, null, null, false, false, false, null, false, false, false, 8178)));
                } else if (x8n0Var instanceof w8n0) {
                    boolean z = ((hdn0) rdn0Var.D()).c == bdn0.b;
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var5.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var5.m(value3, hdn0.a((hdn0) value3, listG, z, bdn0.c, cdn0.f4170a, null, null, false, false, false, null, false, false, false, 8176)));
                }
                return Unit.f46060a;
            case 18:
                List list2 = (List) obj;
                een0 een0Var = list2.isEmpty() ? een0.d : een0.c;
                ren0 ren0Var = (ren0) obj2;
                int i4 = ren0.D;
                p7m0 p7m0Var6 = ren0Var.i.f25029a;
                while (true) {
                    Object value10 = p7m0Var6.getValue();
                    value10.getClass();
                    ren0Var.f.getClass();
                    List list3 = list2;
                    if (p7m0Var6.m(value10, jen0.a((jen0) value10, false, false, false, list2, een0Var, 5))) {
                        return Unit.f46060a;
                    }
                    list2 = list3;
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                x8n0 x8n0Var2 = (x8n0) obj;
                ven0 ven0Var = (ven0) obj2;
                oyg0 oyg0Var2 = ven0Var.f;
                int i5 = ven0.K;
                ocj ocjVar2 = ven0Var.i;
                p7m0 p7m0Var7 = ocjVar2.f25029a;
                do {
                    value6 = p7m0Var7.getValue();
                    value6.getClass();
                    oyg0Var2.getClass();
                } while (!p7m0Var7.m(value6, tbn0.a((tbn0) value6, null, false, null, null, null, null, false, false, false, null, false, false, false, 8063)));
                List listG2 = ven0Var.A.g(x8n0Var2.a());
                if (x8n0Var2.a().isEmpty()) {
                    p7m0 p7m0Var8 = ocjVar2.f25029a;
                    do {
                        value9 = p7m0Var8.getValue();
                        value9.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var8.m(value9, tbn0.a((tbn0) value9, iun.f15405a, false, tan0.f33621a, zan0.c, null, null, false, false, false, null, false, false, false, 8178)));
                } else if (x8n0Var2 instanceof v8n0) {
                    p7m0 p7m0Var9 = ocjVar2.f25029a;
                    do {
                        value8 = p7m0Var9.getValue();
                        value8.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var9.m(value8, tbn0.a((tbn0) value8, listG2, false, tan0.b, zan0.f44079a, null, null, false, false, false, null, false, false, false, 8178)));
                } else if (x8n0Var2 instanceof w8n0) {
                    boolean z2 = ((tbn0) ven0Var.D()).c == tan0.b;
                    p7m0 p7m0Var10 = ocjVar2.f25029a;
                    do {
                        value7 = p7m0Var10.getValue();
                        value7.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var10.m(value7, tbn0.a((tbn0) value7, listG2, z2, tan0.c, zan0.f44079a, null, null, false, false, false, null, false, false, false, 8176)));
                }
                return Unit.f46060a;
            case 20:
                Object objInvoke17 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 21:
                Object objInvoke18 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 22:
                Object objInvoke19 = ((z2n0) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 23:
                Object objInvoke20 = ((ssl0) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 24:
                Object objInvoke21 = ((ijn0) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke22 = ((ijn0) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke23 = ((ijn0) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke24 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke25 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            default:
                Object objInvoke26 = ((mpn0) obj2).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
        }
    }
}
