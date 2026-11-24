package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class abk implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f584a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abk(Object obj, byte b) {
        this.f584a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        Object value;
        hhe hheVar;
        Object value2;
        Object value3;
        byte b = this.f584a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((hij) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                Object objInvoke3 = ((otk) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 3:
                Object objInvoke4 = ((otk) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 4:
                Object objInvoke5 = ((e9g) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 5:
                Object objInvoke6 = ((e9g) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 6:
                Object objInvoke7 = ((qzk) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 7:
                Object objInvoke8 = ((qzk) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 8:
                Object objInvoke9 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 9:
                Object objInvoke10 = ((d7e) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 10:
                Object objInvoke11 = ((pfl) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 11:
                if (((y3m) obj) == y3m.c) {
                    ((hgk0) ((x3m) obj2).b).setValue(Boolean.FALSE);
                }
                return Unit.f46060a;
            case 12:
                Object objInvoke12 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 13:
                Object objInvoke13 = ((pfl) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 14:
                Object objInvoke14 = ((pfl) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    kin kinVar = (kin) obj2;
                    p7m0 p7m0Var = kinVar.w;
                    if (!(p7m0Var.getValue() instanceof xin)) {
                        p7m0Var.o(null, new win(new xhn(kinVar.v, kinVar.p.c())));
                    }
                }
                return Unit.f46060a;
            case 16:
                Object objInvoke15 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 17:
                Object objInvoke16 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 18:
                Object objInvoke17 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke18 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 20:
                Object objInvoke19 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 21:
                Object objInvoke20 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 22:
                Object objInvoke21 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 23:
                Object objInvoke22 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case 24:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                tqo tqoVar = (tqo) obj2;
                oyg0 oyg0Var = tqoVar.f;
                ocj ocjVar = tqoVar.i;
                if (zBooleanValue) {
                    int i = tqo.G;
                    tqoVar.M(false);
                } else {
                    eke0 eke0Var = swh0.b;
                    swh0 swh0Var = ((pqo) tqoVar.D()).b;
                    eke0Var.getClass();
                    boolean z = swh0Var == swh0.LIVE;
                    hhe hheVar2 = new hhe(new UnknownHostException());
                    if (z && (((pqo) tqoVar.D()).h instanceof phe)) {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var2.m(value2, pqo.a((pqo) value2, null, false, null, null, hheVar2, null, null, null, 1919)));
                    } else if (!z && (((pqo) tqoVar.D()).i instanceof phe)) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value = p7m0Var3.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                            hheVar = hheVar2;
                            hheVar2 = hheVar;
                        } while (!p7m0Var3.m(value, pqo.a((pqo) value, null, false, null, null, null, hheVar, null, null, 1791)));
                    }
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke23 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return b(((Boolean) obj).booleanValue(), yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke24 = ((sxk) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke25 = ((brk) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            default:
                List list = (List) obj;
                i3p i3pVar = (i3p) obj2;
                int i2 = i3p.F;
                p7m0 p7m0Var4 = i3pVar.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    i3pVar.f.getClass();
                } while (!p7m0Var4.m(value3, w2p.a((w2p) value3, false, false, false, list, null, 90)));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object b(boolean z, yje yjeVar) {
        dzo dzoVar;
        Object value;
        Object value2;
        Object value3;
        gzo gzoVar = (gzo) this.b;
        oyg0 oyg0Var = gzoVar.f;
        ocj ocjVar = gzoVar.i;
        if (yjeVar instanceof dzo) {
            dzoVar = (dzo) yjeVar;
            int i = dzoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dzoVar.k = i - Integer.MIN_VALUE;
            } else {
                dzoVar = new dzo(this, yjeVar);
            }
        } else {
            dzoVar = new dzo(this, yjeVar);
        }
        Object objA = dzoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = dzoVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            int i3 = gzo.H;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, syo.a((syo) value, false, z, null, null, null, null, null, null, null, null, 2043)));
            if (z && ((syo) gzoVar.D()).g.isEmpty()) {
                e0c e0cVar = gzoVar.s;
                dzoVar.k = 1;
                objA = e0cVar.a(dzoVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else if (((syo) gzoVar.D()).f33030a) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, syo.a((syo) value2, false, false, null, null, null, null, null, null, null, null, 2046)));
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        List list = (List) objA;
        int i4 = gzo.H;
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value3 = p7m0Var3.getValue();
            value3.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value3, syo.a((syo) value3, false, false, null, null, null, list, null, null, null, null, 1982)));
        return Unit.f46060a;
    }
}
