package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.login.core.presentation.model.AuthDataModel;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;
import org.xplatform.login.new_place.api.navigation.SmsCodeExtras;

/* JADX INFO: loaded from: classes3.dex */
public final class y32 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y32(boolean z, l94 l94Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        this.j = z;
        this.k = l94Var;
        this.l = str;
    }

    private final Object l(Object obj) {
        Object value;
        Object value2;
        AuthDataModel authDataModel;
        Object value3;
        Object value4;
        Object value5;
        Object smsCode;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        fh4 fh4Var = (fh4) this.l;
        ctf0 ctf0Var = fh4Var.w;
        oyg0 oyg0Var = fh4Var.f;
        ocj ocjVar = fh4Var.i;
        fd4 fd4Var = (fd4) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            rc4 rc4Var = fh4Var.y;
            this.k = fd4Var;
            this.j = true;
            rc4Var.getClass();
            if (rc4Var.a(oc4.f25010a, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        int i = fh4.c0;
        cmt cmtVar = fh4Var.J;
        if (Intrinsics.d(fd4Var, cd4.f4144a)) {
            fh4Var.G(new tf4(ctf0Var.b.a(R.string.network_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.check_connection, Arrays.copyOf(new Object[0], 0)), false));
            fh4Var.N();
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value9 = p7m0Var.getValue();
                value9.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value9, zf4.a((zf4) value9, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
        } else if (Intrinsics.d(fd4Var, tc4.f33701a)) {
            fh4Var.T();
            fh4Var.N();
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value8 = p7m0Var2.getValue();
                value8.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value8, zf4.a((zf4) value8, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
        } else if (Intrinsics.d(fd4Var, ad4.f660a)) {
            fh4Var.S(new rg4(fh4Var, b));
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value7 = p7m0Var3.getValue();
                value7.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value7, zf4.a((zf4) value7, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
        } else if (fd4Var instanceof zc4) {
            AuthDataModel authDataModel2 = ((zc4) fd4Var).f44148a;
            uu4 uu4VarA = vu4.a(authDataModel2);
            byte b2 = 3;
            p6a p6aVar = new p6a(atm0.m(uu4VarA), (byte) 3);
            byte b3 = 4;
            ac4 ac4Var = new ac4(fh4Var, uu4VarA, yjeVar, b3);
            rg4 rg4Var = new rg4(fh4Var, b3);
            ug4 ug4Var = new ug4(fh4Var, authDataModel2, (byte) 1);
            e3c.n(fh4Var.X);
            fh4Var.X = fh4Var.J(new dnq(new fnq(new fnq(fh4Var.z.a(p6aVar), new vg4(fh4Var, yjeVar, b)), new ac4(ac4Var, rg4Var, yjeVar, b2), (byte) 4), new e00(fh4Var, yjeVar, b2), (byte) 0), fh4Var.r.c, new j94(1, ug4Var, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 5));
        } else if (fd4Var instanceof xc4) {
            fn50 fn50Var = ((xc4) fd4Var).f40628a;
            String str = fn50Var.b;
            String str2 = fn50Var.f;
            if (fn50Var.d) {
                smsCode = new ConfirmationNewPlaceScreenType.Authenticator(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, fn50Var.c);
            } else {
                smsCode = fn50Var.e ? new ConfirmationNewPlaceScreenType.SmsCode(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, SmsCodeExtras.None.f46760a) : new ConfirmationNewPlaceScreenType.Simple(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, fn50Var.g);
            }
            fh4Var.S(new ys3(fh4Var, smsCode, (byte) 8));
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value6 = p7m0Var4.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value6, zf4.a((zf4) value6, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
        } else if (fd4Var instanceof yc4) {
            yc4 yc4Var = (yc4) fd4Var;
            int iIntValue = yc4Var.f42367a.intValue();
            String str3 = yc4Var.b;
            f7u f7uVar = fh4Var.I;
            ((y3v) f7uVar.b).s(String.valueOf(iIntValue));
            ((s64) f7uVar.c).h(iIntValue);
            fh4Var.G(new tf4(ctf0Var.b.a(R.string.authorization_error, Arrays.copyOf(new Object[0], 0)), str3, iIntValue == 136 ? ((zf4) fh4Var.D()).m.f : false));
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value5 = p7m0Var5.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value5, zf4.a((zf4) value5, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
            fh4Var.N();
        } else if (fd4Var instanceof bd4) {
            fh4Var.G(new tf4(ctf0Var.b.a(R.string.authorization_error, Arrays.copyOf(new Object[0], 0)), ((bd4) fd4Var).f2382a, false));
            fh4Var.N();
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value4 = p7m0Var6.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value4, zf4.a((zf4) value4, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
        } else if (fd4Var instanceof ed4) {
            fh4Var.T();
            fh4Var.N();
            p7m0 p7m0Var7 = ocjVar.f25029a;
            do {
                value3 = p7m0Var7.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var7.m(value3, zf4.a((zf4) value3, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
        } else if (fd4Var instanceof wc4) {
            String str4 = ((wc4) fd4Var).f38908a;
            AuthDataErrorModel authDataErrorModel = ((zf4) fh4Var.D()).l;
            if (authDataErrorModel != null && (authDataModel = authDataErrorModel.b) != null) {
                i3t0.A(fh4Var, fh4Var.p, new ol4(vu4.a(authDataModel), str4, cmtVar.g()), null, null, 6);
            }
        } else if (Intrinsics.d(fd4Var, vc4.f37169a)) {
            fh4Var.T();
            fh4Var.N();
            p7m0 p7m0Var8 = ocjVar.f25029a;
            do {
                value2 = p7m0Var8.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var8.m(value2, zf4.a((zf4) value2, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
        } else if (Intrinsics.d(fd4Var, uc4.f35411a)) {
            fh4Var.N();
            p7m0 p7m0Var9 = ocjVar.f25029a;
            do {
                value = p7m0Var9.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var9.m(value, zf4.a((zf4) value, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
        } else {
            if (!(fd4Var instanceof dd4)) {
                t9f.b();
                return null;
            }
            i3t0.A(fh4Var, fh4Var.p, new vl4(((dd4) fd4Var).f5878a, cmtVar.g()), null, null, 6);
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        Object value;
        ku4 ku4Var = (ku4) this.l;
        p7m0 p7m0Var = ku4Var.z;
        vne vneVar = (vne) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            dkj dkjVar = ku4Var.h;
            String strValueOf = String.valueOf(ku4Var.k.a());
            this.k = vneVar;
            this.j = true;
            obj = dkjVar.f6232a.c(strValueOf, this);
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
        qq4 qq4Var = (qq4) obj;
        ku4Var.w.n(qq4Var);
        p7m0 p7m0Var2 = ku4Var.y;
        Boolean bool = Boolean.FALSE;
        p7m0Var2.getClass();
        p7m0Var2.o(null, bool);
        ku4Var.G(ut4.f36240a);
        if (((Boolean) p7m0Var.getValue()).booleanValue()) {
            do {
                value = p7m0Var.getValue();
                ((Boolean) value).getClass();
            } while (!p7m0Var.m(value, Boolean.FALSE));
        }
        if (qq4Var.f29149a.isEmpty()) {
            d5c.G(vneVar, null);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:193:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:205:0x0304  */
    /* JADX WARN: Code duplicated, block: B:207:0x0308  */
    /* JADX WARN: Code duplicated, block: B:208:0x030f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0315  */
    /* JADX WARN: Code duplicated, block: B:212:0x0318  */
    /* JADX WARN: Code duplicated, block: B:215:0x031e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0325  */
    /* JADX WARN: Code duplicated, block: B:219:0x032b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0332  */
    /* JADX WARN: Code duplicated, block: B:223:0x0338  */
    /* JADX WARN: Code duplicated, block: B:224:0x033f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0345  */
    /* JADX WARN: Code duplicated, block: B:228:0x034c  */
    /* JADX WARN: Code duplicated, block: B:231:0x0352  */
    /* JADX WARN: Code duplicated, block: B:232:0x0359  */
    /* JADX WARN: Code duplicated, block: B:235:0x035f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0366  */
    /* JADX WARN: Code duplicated, block: B:242:0x0376  */
    /* JADX WARN: Code duplicated, block: B:249:0x039a  */
    /* JADX WARN: Code duplicated, block: B:254:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:256:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:265:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:275:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:276:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:278:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:281:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:282:0x0404  */
    /* JADX WARN: Code duplicated, block: B:289:0x0414  */
    /* JADX WARN: Code duplicated, block: B:292:0x0429 A[LOOP:3: B:290:0x0423->B:292:0x0429, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x043d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0445  */
    /* JADX WARN: Code duplicated, block: B:299:0x044a  */
    /* JADX WARN: Code duplicated, block: B:302:0x0459  */
    /* JADX WARN: Code duplicated, block: B:303:0x045c  */
    /* JADX WARN: Code duplicated, block: B:306:0x0462  */
    /* JADX WARN: Code duplicated, block: B:307:0x0465  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e9 A[PHI: r4
  0x00e9: PHI (r4v34 ??) = (r4v4 ??), (r4v8 ??), (r4v2 ??) binds: [B:50:0x0115, B:45:0x0103, B:36:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v44, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r79v0 */
    /* JADX WARN: Type inference failed for: r79v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r79v2 */
    /* JADX WARN: Type inference failed for: r89v0, types: [java.util.List] */
    private final Object o(Object obj) throws Throwable {
        Object objA;
        iy4 iy4Var;
        ?? r24;
        Long l;
        boolean z;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        double d;
        Boolean bool;
        boolean zBooleanValue;
        double dDoubleValue;
        String str3;
        String str4;
        Boolean bool2;
        boolean zBooleanValue2;
        Boolean bool3;
        boolean zBooleanValue3;
        Boolean bool4;
        boolean zBooleanValue4;
        Boolean bool5;
        boolean zBooleanValue5;
        Double d2;
        double dDoubleValue2;
        pxu pxuVar;
        hxu hxuVarN0;
        nob0 nob0Var;
        long jLongValue;
        Object obj2;
        ?? r79;
        int iIntValue;
        Double d3;
        double dDoubleValue3;
        Boolean bool6;
        boolean zBooleanValue6;
        char c;
        ?? arrayList;
        Integer num;
        int iIntValue2;
        String str5;
        String str6;
        String str7;
        String str8;
        Iterator it;
        Boolean bool7;
        wgo wgoVar;
        Long l2;
        wgo wgoVar2;
        Integer num2;
        wgo wgoVar3;
        wgo wgoVar4;
        Long l3;
        asn asnVar;
        double dDoubleValue4;
        String str9;
        int i3;
        boolean z4;
        Double d4;
        wgo wgoVar5;
        Long l4;
        es esVar = (es) this.k;
        wne wneVar = wne.f39444a;
        boolean z5 = this.j;
        Throwable th = null;
        if (!z5) {
            z1x.P(obj);
            ehf0 ehf0Var = (ehf0) esVar.f8305a;
            String strA = ((btt0) esVar.b).a();
            ww4 ww4Var = (ww4) this.l;
            cx4 cx4Var = new cx4(((knf0) esVar.c).c(), ww4Var.e, ww4Var.c, ww4Var.d, ww4Var.f39868a, ww4Var.b);
            this.j = true;
            objA = ((hv4) ((zo4) ehf0Var.c).invoke()).a(strA, cx4Var, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z5) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objA = obj;
        }
        List listA = ((c57) objA).a();
        ArrayList arrayList2 = new ArrayList(r3d.q(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            n97 n97Var = (n97) it2.next();
            n97Var.getClass();
            Long l5 = n97Var.x;
            Double d5 = n97Var.M;
            Double d6 = n97Var.P;
            Double d7 = n97Var.O;
            Double d8 = n97Var.F;
            Double d9 = n97Var.h;
            Long l6 = n97Var.f23125a;
            Integer num3 = n97Var.i;
            ivg0 ivg0Var = n97Var.r;
            Double d10 = n97Var.L;
            Throwable th2 = th;
            ?? ValueOf = n97Var.v;
            List list = n97Var.p;
            long jLongValue2 = 0;
            long jLongValue3 = l5 != null ? l5.longValue() : 0L;
            if (jLongValue3 == 1) {
                iy4Var = iy4.b;
            } else if (jLongValue3 == 2) {
                iy4Var = iy4.d;
            } else {
                iy4Var = jLongValue3 == 3 ? iy4.c : iy4.f15571a;
            }
            nwd nwdVar = q4f.f28094a;
            boolean zBooleanValue7 = false;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            nwdVar.getClass();
            q4f q4fVarA = nwd.a(iIntValue3);
            Iterator it3 = it2;
            iy4 iy4Var2 = iy4.d;
            if (iy4Var != iy4Var2 && ValueOf != 0 && ValueOf.length() > 0) {
                r24 = ValueOf;
            } else if (iy4Var == iy4Var2 || ValueOf == 0 || ValueOf.length() != 0) {
                ValueOf = l6 != null ? String.valueOf(l6.longValue()) : th2;
                if (ValueOf == 0) {
                    r24 = "";
                } else {
                    r24 = ValueOf;
                }
            } else {
                ValueOf = l6 != null ? String.valueOf(l6.longValue()) : th2;
                if (ValueOf == 0) {
                    r24 = "";
                } else {
                    r24 = ValueOf;
                }
            }
            long jLongValue4 = (list == null || (wgoVar5 = (wgo) CollectionsKt.firstOrNull(list)) == null || (l4 = wgoVar5.e) == null) ? 0L : l4.longValue();
            Double d11 = n97Var.b;
            double dDoubleValue5 = d11 != null ? d11.doubleValue() : 0.0d;
            String strR = ieb.R(n97Var, q4fVarA);
            long jLongValue5 = (iy4Var == iy4Var2 ? (l = n97Var.g) == null : (l = n97Var.w) == null) ? 0L : l.longValue();
            double dDoubleValue6 = d10 != null ? d10.doubleValue() : 0.0d;
            Double d12 = n97Var.K;
            double dDoubleValue7 = d12 != null ? d12.doubleValue() : 0.0d;
            double dDoubleValue8 = (ivg0Var == null || (d4 = ivg0Var.g) == null) ? 0.0d : d4.doubleValue();
            double dDoubleValue9 = d9 != null ? d9.doubleValue() : 0.0d;
            double dDoubleValue10 = d8 != null ? d8.doubleValue() : 0.0d;
            lb90 lb90VarW = uvw.W(n97Var.G);
            Double d13 = n97Var.H;
            double dDoubleValue11 = d13 != null ? d13.doubleValue() : 0.0d;
            double dDoubleValue12 = d8 != null ? d8.doubleValue() : 0.0d;
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z4 = false;
                            break;
                        }
                        if (Intrinsics.d(((wgo) it4.next()).M, Boolean.TRUE)) {
                            z4 = true;
                            break;
                        }
                    }
                } else {
                    z4 = false;
                    break;
                }
                z = z4;
            } else {
                z = false;
            }
            double dJ = dtb.J(n97Var);
            int iQ = acb.Q(n97Var);
            int size = list != null ? list.size() : 0;
            if (list == null || list.isEmpty()) {
                i = 0;
            } else {
                Iterator it5 = list.iterator();
                i = 0;
                while (it5.hasNext()) {
                    Boolean bool8 = ((wgo) it5.next()).L;
                    if ((bool8 != null ? bool8.booleanValue() : false) && (i = i + 1) < 0) {
                        q3d.o();
                        throw th2;
                    }
                }
            }
            int iA = q4f.d.a();
            if (num3 != null && num3.intValue() == iA) {
                ?? ValueOf2 = Integer.valueOf(i);
                if (i <= 0) {
                    ValueOf2 = th2;
                }
                if (ValueOf2 != 0) {
                    int iIntValue4 = ValueOf2.intValue();
                    if (list == null || list.isEmpty()) {
                        i3 = 0;
                    } else {
                        Iterator it6 = list.iterator();
                        i3 = 0;
                        while (it6.hasNext()) {
                            Long l7 = ((wgo) it6.next()).h;
                            if (l7 != null && l7.longValue() == 1 && (i3 = i3 + 1) < 0) {
                                q3d.o();
                                throw th2;
                            }
                        }
                    }
                    i = iIntValue4 - i3;
                    i2 = i;
                } else {
                    i2 = 0;
                }
            } else {
                i2 = i;
            }
            double dDoubleValue13 = d7 != null ? d7.doubleValue() : 0.0d;
            if (d6 != null) {
                z2 = d6.doubleValue() > 0.0d;
            } else {
                z2 = false;
            }
            double dDoubleValue14 = d6 != null ? d6.doubleValue() : 0.0d;
            boolean z6 = Intrinsics.c(d5, 0.0d) || Intrinsics.c(d7, 0.0d);
            if (list != null) {
                z3 = true;
                if (list.size() == 1 && (str9 = ((wgo) CollectionsKt.U(list)).g) != null) {
                    str = str9;
                }
                str2 = n97Var.j;
                if (str2 == null) {
                    str2 = "";
                }
                String strConcat = str2.concat(lgb.X(q4fVarA, String.valueOf(n97Var.I)));
                if (d9 != null) {
                    double dDoubleValue15 = d9.doubleValue();
                    if (d10 != null) {
                        dDoubleValue4 = d10.doubleValue();
                    } else {
                        dDoubleValue4 = 0.0d;
                    }
                    d = dDoubleValue15 - dDoubleValue4;
                } else {
                    d = 0.0d;
                }
                bool = n97Var.z;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (d10 != null) {
                    dDoubleValue = d10.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                str3 = n97Var.y;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                bool2 = n97Var.k;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                bool3 = n97Var.s;
                if (bool3 != null) {
                    zBooleanValue3 = bool3.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                bool4 = n97Var.t;
                if (bool4 != null) {
                    zBooleanValue4 = bool4.booleanValue();
                } else {
                    zBooleanValue4 = false;
                }
                bool5 = n97Var.u;
                if (bool5 != null) {
                    zBooleanValue5 = bool5.booleanValue();
                } else {
                    zBooleanValue5 = false;
                }
                d2 = n97Var.Q;
                if (d2 != null) {
                    dDoubleValue2 = d2.doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                pxuVar = n97Var.q;
                if (pxuVar != null) {
                    hxuVarN0 = dyb.n0(pxuVar);
                } else {
                    hxuVarN0 = hxu.h;
                }
                hxu hxuVar = hxuVarN0;
                if (ivg0Var != null || (asnVar = ivg0Var.b) == null) {
                    iun iunVar = iun.f15405a;
                    nob0Var = new nob0(-1, 0.0d, 0.0d, iunVar, iunVar);
                } else {
                    nob0Var = qxw.V(asnVar);
                }
                if (list != null || (wgoVar4 = (wgo) CollectionsKt.firstOrNull(list)) == null || (l3 = wgoVar4.f39126a) == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = l3.longValue();
                }
                if (list != null || (wgoVar3 = (wgo) CollectionsKt.firstOrNull(list)) == null) {
                    obj2 = th2;
                } else {
                    obj2 = wgoVar3.b;
                }
                if (obj2 == null) {
                    r79 = "";
                } else {
                    r79 = obj2;
                }
                tqt tqtVar = uoy.b;
                if (list != null || (wgoVar2 = (wgo) CollectionsKt.firstOrNull(list)) == null || (num2 = wgoVar2.u) == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = num2.intValue();
                }
                tqtVar.getClass();
                uoy uoyVarJ = tqt.j(iIntValue);
                if (list != null && (wgoVar = (wgo) CollectionsKt.firstOrNull(list)) != null && (l2 = wgoVar.G) != null) {
                    jLongValue2 = l2.longValue();
                }
                long j = jLongValue2;
                d3 = n97Var.N;
                if (d3 != null) {
                    dDoubleValue3 = d3.doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                double dDoubleValue16 = d5 != null ? d5.doubleValue() : 0.0d;
                bool6 = n97Var.J;
                if (bool6 != null) {
                    zBooleanValue6 = bool6.booleanValue();
                } else {
                    zBooleanValue6 = false;
                }
                if (ivg0Var != null && (bool7 = ivg0Var.d) != null) {
                    zBooleanValue7 = bool7.booleanValue();
                }
                boolean z7 = zBooleanValue7;
                if (list != null) {
                    c = '\n';
                    arrayList = new ArrayList(r3d.q(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(acb.b0((wgo) it.next()));
                    }
                } else {
                    c = '\n';
                    arrayList = th2;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                ?? r89 = arrayList;
                num = n97Var.l;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = -1;
                }
                azv azvVarF = hkb.F(iIntValue2);
                ozc ozcVarP0 = rcb.p0(n97Var.m, q4fVarA);
                str5 = n97Var.n;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                str7 = n97Var.o;
                if (str7 == null) {
                    str8 = "";
                } else {
                    str8 = str7;
                }
                arrayList2.add(new vw4(r24, q4fVarA, dDoubleValue10, jLongValue5, dDoubleValue5, dDoubleValue9, iy4Var, jLongValue4, strR, dDoubleValue6, dDoubleValue8, dDoubleValue7, lb90VarW, dDoubleValue12, dDoubleValue11, z, dJ, iQ, size, i2, dDoubleValue13, z2, dDoubleValue14, z6, str, strConcat, d, zBooleanValue, dDoubleValue, str4, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, dDoubleValue2, hxuVar, nob0Var, jLongValue, r79, uoyVarJ, j, dDoubleValue3, dDoubleValue16, zBooleanValue6, z7, r89, azvVarF, ozcVarP0, str6, str8));
                it2 = it3;
                th = th2;
            } else {
                z3 = true;
            }
            str = "";
            str2 = n97Var.j;
            if (str2 == null) {
                str2 = "";
            }
            String strConcat2 = str2.concat(lgb.X(q4fVarA, String.valueOf(n97Var.I)));
            if (d9 != null) {
                double dDoubleValue17 = d9.doubleValue();
                if (d10 != null) {
                    dDoubleValue4 = d10.doubleValue();
                } else {
                    dDoubleValue4 = 0.0d;
                }
                d = dDoubleValue17 - dDoubleValue4;
            } else {
                d = 0.0d;
            }
            bool = n97Var.z;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (d10 != null) {
                dDoubleValue = d10.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            str3 = n97Var.y;
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            bool2 = n97Var.k;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            bool3 = n97Var.s;
            if (bool3 != null) {
                zBooleanValue3 = bool3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            bool4 = n97Var.t;
            if (bool4 != null) {
                zBooleanValue4 = bool4.booleanValue();
            } else {
                zBooleanValue4 = false;
            }
            bool5 = n97Var.u;
            if (bool5 != null) {
                zBooleanValue5 = bool5.booleanValue();
            } else {
                zBooleanValue5 = false;
            }
            d2 = n97Var.Q;
            if (d2 != null) {
                dDoubleValue2 = d2.doubleValue();
            } else {
                dDoubleValue2 = 0.0d;
            }
            pxuVar = n97Var.q;
            if (pxuVar != null) {
                hxuVarN0 = dyb.n0(pxuVar);
            } else {
                hxuVarN0 = hxu.h;
            }
            hxu hxuVar2 = hxuVarN0;
            if (ivg0Var != null) {
                iun iunVar2 = iun.f15405a;
                nob0Var = new nob0(-1, 0.0d, 0.0d, iunVar2, iunVar2);
            } else {
                iun iunVar3 = iun.f15405a;
                nob0Var = new nob0(-1, 0.0d, 0.0d, iunVar3, iunVar3);
            }
            if (list != null) {
                jLongValue = 0;
            } else {
                jLongValue = 0;
            }
            if (list != null) {
                obj2 = th2;
            } else {
                obj2 = th2;
            }
            if (obj2 == null) {
                r79 = "";
            } else {
                r79 = obj2;
            }
            tqt tqtVar2 = uoy.b;
            if (list != null) {
                iIntValue = 0;
            } else {
                iIntValue = 0;
            }
            tqtVar2.getClass();
            uoy uoyVarJ2 = tqt.j(iIntValue);
            if (list != null) {
                jLongValue2 = l2.longValue();
            }
            long j2 = jLongValue2;
            d3 = n97Var.N;
            if (d3 != null) {
                dDoubleValue3 = d3.doubleValue();
            } else {
                dDoubleValue3 = 0.0d;
            }
            double dDoubleValue18 = d5 != null ? d5.doubleValue() : 0.0d;
            bool6 = n97Var.J;
            if (bool6 != null) {
                zBooleanValue6 = bool6.booleanValue();
            } else {
                zBooleanValue6 = false;
            }
            if (ivg0Var != null) {
                zBooleanValue7 = bool7.booleanValue();
            }
            boolean z8 = zBooleanValue7;
            if (list != null) {
                c = '\n';
                arrayList = new ArrayList(r3d.q(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(acb.b0((wgo) it.next()));
                }
            } else {
                c = '\n';
                arrayList = th2;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            ?? r810 = arrayList;
            num = n97Var.l;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = -1;
            }
            azv azvVarF2 = hkb.F(iIntValue2);
            ozc ozcVarP1 = rcb.p0(n97Var.m, q4fVarA);
            str5 = n97Var.n;
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
            str7 = n97Var.o;
            if (str7 == null) {
                str8 = "";
            } else {
                str8 = str7;
            }
            arrayList2.add(new vw4(r24, q4fVarA, dDoubleValue10, jLongValue5, dDoubleValue5, dDoubleValue9, iy4Var, jLongValue4, strR, dDoubleValue6, dDoubleValue8, dDoubleValue7, lb90VarW, dDoubleValue12, dDoubleValue11, z, dJ, iQ, size, i2, dDoubleValue13, z2, dDoubleValue14, z6, str, strConcat2, d, zBooleanValue, dDoubleValue, str4, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, dDoubleValue2, hxuVar2, nob0Var, jLongValue, r79, uoyVarJ2, j2, dDoubleValue3, dDoubleValue18, zBooleanValue6, z8, r810, azvVarF2, ozcVarP1, str6, str8));
            it2 = it3;
            th = th2;
        }
        return arrayList2;
    }

    private final Object r(Object obj) {
        rrd rrdVar = (rrd) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            String strA = ((btt0) rrdVar.g).a();
            tl5 tl5Var = (tl5) this.l;
            this.j = true;
            obj = rrdVar.j(strA, tl5Var, this);
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
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((ql5) obj2).i != txs0.b) {
                arrayList.add(obj2);
            }
        }
        rrdVar.D(arrayList);
        return arrayList;
    }

    private final Object s(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            lo5 lo5Var = (lo5) this.k;
            if (lo5Var.d) {
                d9z d9zVar = (d9z) this.l;
                int size = lo5Var.c.size() - 1;
                this.j = true;
                v0h0 v0h0Var = d9z.w;
                if (d9zVar.l(size, 0, this) == wneVar) {
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
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new y32(this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new y32((s72) this.l, yjeVar, (byte) 1);
            case 2:
                return new y32(this.k, this.l, yjeVar, (byte) 2);
            case 3:
                y32 y32Var = new y32((hh2) this.l, yjeVar, (byte) 3);
                y32Var.k = obj;
                return y32Var;
            case 4:
                y32 y32Var2 = new y32((ul2) this.l, yjeVar, (byte) 4);
                y32Var2.k = obj;
                return y32Var2;
            case 5:
                y32 y32Var3 = new y32((yn2) this.l, yjeVar, (byte) 5);
                y32Var3.k = obj;
                return y32Var3;
            case 6:
                return new y32(this.k, this.l, yjeVar, (byte) 6);
            case 7:
                return new y32(this.k, this.l, yjeVar, (byte) 7);
            case 8:
                y32 y32Var4 = new y32((c13) this.l, yjeVar, (byte) 8);
                y32Var4.k = obj;
                return y32Var4;
            case 9:
                y32 y32Var5 = new y32((rmb0) this.l, yjeVar, (byte) 9);
                y32Var5.k = obj;
                return y32Var5;
            case 10:
                y32 y32Var6 = new y32((on3) this.l, yjeVar, (byte) 10);
                y32Var6.k = obj;
                return y32Var6;
            case 11:
                return new y32((fo3) this.k, yjeVar);
            case 12:
                y32 y32Var7 = new y32((to3) this.l, yjeVar, (byte) 12);
                y32Var7.k = obj;
                return y32Var7;
            case 13:
                return new y32(this.k, this.l, yjeVar, (byte) 13);
            case 14:
                return new y32(this.k, this.l, yjeVar, (byte) 14);
            case 15:
                return new y32((kq3) this.l, yjeVar, (byte) 15);
            case 16:
                return new y32(this.k, this.l, yjeVar, (byte) 16);
            case 17:
                y32 y32Var8 = new y32((kq3) this.l, yjeVar, (byte) 17);
                y32Var8.k = obj;
                return y32Var8;
            case 18:
                y32 y32Var9 = new y32((ApplicationActivity) this.l, yjeVar, (byte) 18);
                y32Var9.k = obj;
                return y32Var9;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new y32(this.k, this.l, yjeVar, (byte) 19);
            case 20:
                return new y32((l94) this.l, yjeVar, (byte) 20);
            case 21:
                return new y32(this.j, (l94) this.k, (String) this.l, yjeVar);
            case 22:
                y32 y32Var10 = new y32((fh4) this.l, yjeVar, (byte) 22);
                y32Var10.k = obj;
                return y32Var10;
            case 23:
                y32 y32Var11 = new y32((hk4) this.l, yjeVar, (byte) 23);
                y32Var11.k = obj;
                return y32Var11;
            case 24:
                return new y32(this.k, this.l, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                y32 y32Var12 = new y32((ku4) this.l, yjeVar, (byte) 25);
                y32Var12.k = obj;
                return y32Var12;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new y32(this.k, this.l, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new y32(this.k, this.l, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new y32(this.k, this.l, yjeVar, (byte) 28);
            default:
                return new y32(this.k, this.l, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.i) {
            case 0:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((y32) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((y32) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((y32) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                ((y32) create((yex) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 9:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((y32) create((o1d0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((y32) create((zy5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((y32) create((fd4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((y32) create((mm4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((y32) create((we60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((y32) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((y32) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:344:0x083f  */
    /* JADX WARN: Code duplicated, block: B:346:0x0855  */
    /* JADX WARN: Code duplicated, block: B:348:0x0863  */
    /* JADX WARN: Code duplicated, block: B:352:0x0872  */
    /* JADX WARN: Code duplicated, block: B:354:0x0883  */
    /* JADX WARN: Code duplicated, block: B:357:0x088b  */
    /* JADX WARN: Code duplicated, block: B:480:0x0b8a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:347:0x0861 -> B:349:0x0865). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y32.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y32(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y32(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y32(fo3 fo3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        this.k = fo3Var;
    }
}
