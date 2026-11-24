package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sjs implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32316a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sjs(Object obj, Object obj2, byte b) {
        this.f32316a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        o49 o49Var;
        Object value;
        Object value2;
        byte b = this.f32316a;
        ?? ValueOf = 0;
        ValueOf = 0;
        byte b2 = 1;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                njs njsVar = (njs) obj2;
                ((oyg0) obj).getClass();
                njsVar.getClass();
                njs njsVarA = njs.a(njsVar, 0L, null, null, false, 0L, 0L, null, null, (o49) obj4, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -1025, 65535);
                ((yks) obj3).o.e("KEY_BROADCASTING_TAB", njsVarA.k);
                return njsVarA;
            case 1:
                js20 js20Var = (js20) obj4;
                yks yksVar = (yks) obj3;
                njs njsVar2 = (njs) obj2;
                ((oyg0) obj).getClass();
                njsVar2.getClass();
                if (js20Var != null) {
                    if (!(js20Var instanceof gs20) && !(js20Var instanceof hs20)) {
                        if (js20Var instanceof is20) {
                            ValueOf = Long.valueOf(((is20) js20Var).f15285a);
                        }
                    }
                    njs njsVarA2 = njs.a(njsVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, js20Var, ValueOf, null, null, null, null, null, null, -1, 65151);
                    yksVar.o.e("KEY_CATEGORY_ID", njsVarA2.O);
                    return njsVarA2;
                }
                t9f.b();
                return null;
            case 2:
                vzg0 vzg0Var = ((yks) obj3).o;
                njs njsVar3 = (njs) obj2;
                ((oyg0) obj).getClass();
                njsVar3.getClass();
                tf50 tf50Var = tf50.b;
                usr usrVar = (usr) ((xsr) obj4);
                if (usrVar != null) {
                    if (usrVar instanceof ssr) {
                        o49Var = o49.f24622a;
                    } else if (usrVar instanceof tsr) {
                        o49Var = o49.b;
                    }
                    njs njsVarA3 = njs.a(njsVar3, 0L, null, null, false, 0L, 0L, null, tf50Var, o49Var, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -1537, 65535);
                    vzg0Var.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA3.j);
                    vzg0Var.e("KEY_BROADCASTING_TAB", njsVarA3.k);
                    return njsVarA3;
                }
                t9f.b();
                return null;
            case 3:
                ju40 ju40Var = (ju40) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ju40Var.f17134a.F(obj3, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                pwi pwiVar = (pwi) obj4;
                t9k0 t9k0Var = (t9k0) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof zjd) {
                    ((xz40) pwiVar.i).b((zjd) obj2);
                } else if (!(obj2 instanceof tag0)) {
                    if (obj2 instanceof jet) {
                        cwr0.Q(t9k0Var, iIntValue2, obj2);
                        pwiVar.g((jet) obj2);
                    } else if (obj2 instanceof yfe0) {
                        cwr0.Q(t9k0Var, iIntValue2, obj2);
                        ((yfe0) obj2).c();
                    }
                }
                return Unit.f46060a;
            case 5:
                sit sitVar = (sit) obj3;
                oyg0 oyg0Var = sitVar.f;
                ocj ocjVar = sitVar.i;
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                if (agc.M((Throwable) obj4)) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, zht.a((zht) value2, null, null, false, null, null, false, true, null, null, 927)));
                } else {
                    sac.V(jiu0.a(sitVar), rit.f30560a, null, sitVar.q.f22085a, new j0s(sitVar, str, ValueOf, (byte) 12), 10);
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, zht.a((zht) value, null, null, false, null, null, false, false, null, null, 991)));
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                fbc.D((wnq0) obj4, (bav) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                jdv jdvVar = (jdv) obj4;
                pz40 pz40Var = (pz40) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objP = fetVar2.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = new y9v(pz40Var, b2);
                        fetVar2.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    boolean zI = fetVar2.i(jdvVar);
                    Object objP2 = fetVar2.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new f3s(jdvVar, pz40Var, (byte) 16);
                        fetVar2.o0(objP2);
                    }
                    dwi0.b(function1, null, (Function1) objP2, fetVar2, 6, 2);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                jeb.z((mm40) obj4, (vrp) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                hkb.s((w1z) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                nkb.o((mm40) obj4, (ib30) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                vtb.K((mm40) obj4, (tqv) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                f7k.o((c8w) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                f7k.p((b8w) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                m0x0.z((mm40) obj4, (hdw) obj3, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case 15:
                ((Integer) obj).getClass();
                ((Function1) obj4).invoke((jfw) obj3);
                return Unit.f46060a;
            case 16:
                onw onwVar = (onw) obj4;
                Function1 function2 = (Function1) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mbc.y(o7k0.d(jm40.b, 1.0f), onwVar, function2, fetVar3, 6);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                gpw.a((dbd) obj4, (ugd) obj3, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                qcc.v((k3t0) obj4, (llm0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                hsw.a((mm40) obj4, (jsw) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                isw.a((mm40) obj4, (ksw) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                uc9.B((fcx) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                hsv0 hsv0Var = (hsv0) obj4;
                ib50 ib50Var = (ib50) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    hsv0Var.a(null, ib50Var.f14471a, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                l7x.z((mm40) obj4, (eoa0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                l8x.v((mm40) obj4, (y7y) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                q8x.g((mm40) obj4, (apq0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                x8x.b((mm40) obj4, (ypq0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                ucx.j((mm40) obj4, (zy6) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                bdx.g((mm40) obj4, (az6) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                idx.b((mm40) obj4, (bz6) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ sjs(Object obj, Object obj2, int i, byte b) {
        this.f32316a = b;
        this.c = obj;
        this.b = obj2;
    }
}
