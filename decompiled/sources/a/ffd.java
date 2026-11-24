package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ffd extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffd(Object obj, Object obj2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x01da  */
    /* JADX WARN: Code duplicated, block: B:32:0x027a A[LOOP:0: B:30:0x0274->B:32:0x027a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x02eb  */
    private final Object l(Object obj) {
        Object objX;
        ol60 ol60Var;
        w220 w220Var;
        vwb0 vwb0Var;
        h0q0 h0q0Var;
        List listK;
        List listI;
        w220 w220Var2;
        c4m0 c4m0Var;
        w220 w220Var3;
        vzg0 vzg0Var;
        Object objA;
        Boolean bool;
        ArrayList arrayList;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        byte b = 25;
        byte b2 = 4;
        byte b3 = 3;
        byte b4 = 1;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            cb50 cb50Var = (cb50) ((w220) this.l).s0.a("NavBarScreenTypes");
            if (cb50Var != null) {
                ((qe50) ((w220) this.l).s.b).a(cb50Var, false);
            }
            rv3 rv3Var = ((w220) this.l).r;
            rv3Var.l = true;
            if (rv3Var.m) {
                rv3Var.c();
                rv3Var.m = false;
            }
            w220 w220Var4 = (w220) this.l;
            byte b5 = 26;
            sac.T(ulb.L(new fnq(new ewt(new a1t(w220Var4.B.a(), b5), w220Var4, (byte) 24), new dm10(2, w220Var4.x1, ol60.class, "emit", "emit(Ljava/lang/Object;)V", 4, (byte) 25), (byte) 4), w220Var4.C.f22085a), jiu0.a(w220Var4), new x120(w220Var4, yjeVar, (byte) 2));
            v6j0 v6j0Var = ((w220) this.l).l;
            String strValueOf = String.valueOf(Calendar.getInstance().getTime().getTime());
            v6j0Var.getClass();
            strValueOf.getClass();
            v6j0Var.f36880a.g("UNIQUE_SESSION_ID", strValueOf);
            w220 w220Var5 = (w220) this.l;
            w220Var5.x1.f(new w8h0(((Boolean) w220Var5.F0.f15232a.f8174a.f6453a.getValue()).booleanValue()));
            boolean zA = ((w220) this.l).c.f25751a.a();
            w220 w220Var6 = (w220) this.l;
            if (zA) {
                w220Var6.H();
                ((w220) this.l).x();
                w220 w220Var7 = (w220) this.l;
                ol60 ol60Var2 = w220Var7.x1;
                pmi pmiVar = w220Var7.g;
                this.k = ol60Var2;
                this.j = true;
                objX = pmiVar.x(this);
                if (objX == wneVar) {
                    return wneVar;
                }
                ol60Var = ol60Var2;
            } else {
                sac.T(ulb.L(new dnq(new fnq(new ewt(w220Var6.c.f25751a.f11847a.d, w220Var6, b), new r120(w220Var6, yjeVar, b2), (byte) 4), new lo3(b3, yjeVar, b5), (byte) 1), w220Var6.C.b), jiu0.a(w220Var6), new x120(w220Var6, yjeVar, b3));
                w220 w220Var8 = (w220) this.l;
                byte b6 = 27;
                sac.T(ulb.L(new dnq(new fnq(new a1t(w220Var8.c.a(), b6), new o120(w220Var8, yjeVar, (byte) 12), (byte) 4), new lo3(b3, yjeVar, b6), (byte) 1), w220Var8.C.b), jiu0.a(w220Var8), new x120(w220Var8, yjeVar, b2));
            }
            w220 w220Var9 = (w220) this.l;
            sac.T(ulb.L(new dnq(new fnq(w220Var9.x0.a(), new wn10(w220Var9, yjeVar, b4), (byte) 4), new lo3(b3, yjeVar, b), (byte) 1), w220Var9.C.b), jiu0.a(w220Var9), new x120(w220Var9, yjeVar, b4));
            w220Var = (w220) this.l;
            vwb0Var = (vwb0) ((hm7) w220Var.w.f41434a).f13293a.b;
            vwb0Var.getClass();
            if (!vwb0Var.b().contains("CLEAR_COUPON_AFTER_BET")) {
                lpc lpcVar = w220Var.x;
                ((vwb0) lpcVar.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", w220Var.c1.i0);
            }
            g45 g45Var = (g45) ((w220) this.l).m0.b;
            vwb0 vwb0Var2 = (vwb0) g45Var.f10647a;
            vby vbyVar = (vby) g45Var.b;
            h0q0Var = new h0q0(new ocl(new iw20(new y3v(vwb0Var2, vbyVar))), new ljf0(new iw20(new y3v(vwb0Var2, vbyVar))), new yfu(new iw20(new y3v(vwb0Var2, vbyVar))), (pru) g45Var.c);
            sff0 sff0VarA = ((pru) h0q0Var.d).a();
            listK = ((ocl) h0q0Var.f12247a).k(sff0VarA);
            listI = ((yfu) h0q0Var.c).i(sff0VarA);
            if (!listI.isEmpty() && !Intrinsics.d(listK, listI)) {
                List<nev0> listA0 = CollectionsKt.A0(listK, new sr0(listI, listK, (byte) 6));
                ljf0 ljf0Var = (ljf0) h0q0Var.b;
                arrayList = new ArrayList(r3d.q(listA0, 10));
                for (nev0 nev0Var : listA0) {
                    nev0.b.getClass();
                    nev0Var.getClass();
                    arrayList.add(Integer.valueOf(nev0Var.f23406a));
                }
                ljf0Var.c(arrayList);
            }
            w220Var2 = (w220) this.l;
            c4m0Var = w220Var2.u1;
            if (c4m0Var != null || !c4m0Var.isActive()) {
                pzu pzuVar = w220Var2.e;
                w220Var2.u1 = sac.T(new y5n0(i120.W(aoq.c(((kc60) pzuVar.f27863a).a(), new za60(yjeVar, (Object) pzuVar, (byte) 13))), pzuVar, (byte) 0), d5c.S(jiu0.a(w220Var2), w220Var2.C.f22085a), v220.h);
            }
            w220Var3 = (w220) this.l;
            vzg0Var = w220Var3.s0;
            objA = vzg0Var.a("AUTHENTICATOR_PERMISSIONS_REQUESTED");
            bool = Boolean.TRUE;
            if (!Intrinsics.d(objA, bool)) {
                vzg0Var.e("AUTHENTICATOR_PERMISSIONS_REQUESTED", bool);
                sac.g0(jiu0.a(w220Var3), w220.class.getSimpleName(), w220Var3.C.b, new p610((byte) 22), new o120(w220Var3, yjeVar, (byte) 18), 86);
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ol60Var = (ol60) this.k;
        z1x.P(obj);
        objX = obj;
        ol60Var.f(new a9h0(((Number) objX).intValue()));
        w220 w220Var10 = (w220) this.l;
        sac.T(ulb.L(new dnq(new fnq(w220Var10.x0.a(), new wn10(w220Var10, yjeVar, b4), (byte) 4), new lo3(b3, yjeVar, b), (byte) 1), w220Var10.C.b), jiu0.a(w220Var10), new x120(w220Var10, yjeVar, b4));
        w220Var = (w220) this.l;
        vwb0Var = (vwb0) ((hm7) w220Var.w.f41434a).f13293a.b;
        vwb0Var.getClass();
        if (!vwb0Var.b().contains("CLEAR_COUPON_AFTER_BET")) {
            lpc lpcVar2 = w220Var.x;
            ((vwb0) lpcVar2.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", w220Var.c1.i0);
        }
        g45 g45Var2 = (g45) ((w220) this.l).m0.b;
        vwb0 vwb0Var3 = (vwb0) g45Var2.f10647a;
        vby vbyVar2 = (vby) g45Var2.b;
        h0q0Var = new h0q0(new ocl(new iw20(new y3v(vwb0Var3, vbyVar2))), new ljf0(new iw20(new y3v(vwb0Var3, vbyVar2))), new yfu(new iw20(new y3v(vwb0Var3, vbyVar2))), (pru) g45Var2.c);
        sff0 sff0VarA2 = ((pru) h0q0Var.d).a();
        listK = ((ocl) h0q0Var.f12247a).k(sff0VarA2);
        listI = ((yfu) h0q0Var.c).i(sff0VarA2);
        if (!listI.isEmpty()) {
            List<nev0> listA1 = CollectionsKt.A0(listK, new sr0(listI, listK, (byte) 6));
            ljf0 ljf0Var2 = (ljf0) h0q0Var.b;
            arrayList = new ArrayList(r3d.q(listA1, 10));
            while (r1.hasNext()) {
                nev0.b.getClass();
                nev0Var.getClass();
                arrayList.add(Integer.valueOf(nev0Var.f23406a));
            }
            ljf0Var2.c(arrayList);
        }
        w220Var2 = (w220) this.l;
        c4m0Var = w220Var2.u1;
        if (c4m0Var != null) {
            pzu pzuVar2 = w220Var2.e;
            w220Var2.u1 = sac.T(new y5n0(i120.W(aoq.c(((kc60) pzuVar2.f27863a).a(), new za60(yjeVar, (Object) pzuVar2, (byte) 13))), pzuVar2, (byte) 0), d5c.S(jiu0.a(w220Var2), w220Var2.C.f22085a), v220.h);
        } else {
            pzu pzuVar3 = w220Var2.e;
            w220Var2.u1 = sac.T(new y5n0(i120.W(aoq.c(((kc60) pzuVar3.f27863a).a(), new za60(yjeVar, (Object) pzuVar3, (byte) 13))), pzuVar3, (byte) 0), d5c.S(jiu0.a(w220Var2), w220Var2.C.f22085a), v220.h);
        }
        w220Var3 = (w220) this.l;
        vzg0Var = w220Var3.s0;
        objA = vzg0Var.a("AUTHENTICATOR_PERMISSIONS_REQUESTED");
        bool = Boolean.TRUE;
        if (!Intrinsics.d(objA, bool)) {
            vzg0Var.e("AUTHENTICATOR_PERMISSIONS_REQUESTED", bool);
            sac.g0(jiu0.a(w220Var3), w220.class.getSimpleName(), w220Var3.C.b, new p610((byte) 22), new o120(w220Var3, yjeVar, (byte) 18), 86);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r13v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object m(Object obj) {
        Object objA;
        Object obj2;
        ?? r10;
        ?? arrayList;
        ?? arrayList2;
        Integer num;
        String strValueOf;
        Integer num2;
        String strValueOf2;
        ouu ouuVar = (ouu) this.k;
        knf0 knf0Var = (knf0) ouuVar.d;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        Object obj3 = null;
        int i = 1;
        if (!z) {
            z1x.P(obj);
            kd30 kd30Var = (kd30) ouuVar.b;
            String str = (String) this.l;
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            knf0Var.getClass();
            LinkedHashMap linkedHashMapO = ofm0.o(iB, str, strC);
            this.j = true;
            objA = ((id30) ((rx00) kd30Var.b).invoke()).a("application/vnd.xenvelop+json", linkedHashMapO, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objA = obj;
        }
        List<fd30> list = ((nd30) ((dx5) objA).a()).f23322a;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            for (fd30 fd30Var : list) {
                String str2 = fd30Var.f9340a;
                List list2 = fd30Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                    int i2 = 0;
                    for (Object obj4 : list2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            ?? r16 = obj3;
                            q3d.p();
                            throw r16;
                        }
                        doa0 doa0Var = (doa0) obj4;
                        Object obj5 = obj3;
                        String str3 = doa0Var.f6406a;
                        String str4 = str3 == null ? "" : str3;
                        String str5 = doa0Var.b;
                        String str6 = str5 == null ? "" : str5;
                        Integer num3 = doa0Var.c;
                        int iIntValue = num3 != null ? num3.intValue() : 0;
                        Integer num4 = doa0Var.d;
                        int iIntValue2 = num4 != null ? num4.intValue() : 0;
                        String str7 = (i2 != list2.size() - i || (num2 = fd30Var.c) == null || (strValueOf2 = String.valueOf(num2.intValue())) == null) ? "" : strValueOf2;
                        String str8 = (i2 != list2.size() - i || (num = fd30Var.d) == null || (strValueOf = String.valueOf(num.intValue())) == null) ? "" : strValueOf;
                        Integer num5 = doa0Var.e;
                        int iIntValue3 = num5 != null ? num5.intValue() : 0;
                        Boolean bool = doa0Var.f;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        String str9 = doa0Var.g;
                        String str10 = str9 == null ? "" : str9;
                        String str11 = doa0Var.h;
                        String str12 = str11 == null ? "" : str11;
                        List<soa0> list3 = doa0Var.i;
                        if (list3 != null) {
                            arrayList = new ArrayList(r3d.q(list3, 10));
                            for (soa0 soa0Var : list3) {
                                String str13 = soa0Var.f32537a;
                                String str14 = str13 == null ? "" : str13;
                                String str15 = soa0Var.b;
                                String str16 = str15 == null ? "" : str15;
                                Boolean bool2 = soa0Var.c;
                                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                Boolean bool3 = soa0Var.d;
                                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                                Boolean bool4 = soa0Var.e;
                                boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                                Boolean bool5 = soa0Var.f;
                                boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
                                Boolean bool6 = soa0Var.g;
                                arrayList.add(new moa0(str14, str16, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool6 != null ? bool6.booleanValue() : false));
                            }
                        } else {
                            arrayList = obj5;
                        }
                        if (arrayList == 0) {
                            arrayList = iun.f15405a;
                        }
                        ?? r28 = arrayList;
                        List<wdq0> list4 = doa0Var.j;
                        if (list4 != null) {
                            arrayList2 = new ArrayList(r3d.q(list4, 10));
                            for (wdq0 wdq0Var : list4) {
                                Integer num6 = wdq0Var.f38986a;
                                int iIntValue4 = num6 != null ? num6.intValue() : 0;
                                Integer num7 = wdq0Var.b;
                                int iIntValue5 = num7 != null ? num7.intValue() : 0;
                                Integer num8 = wdq0Var.c;
                                int iIntValue6 = num8 != null ? num8.intValue() : 0;
                                Boolean bool7 = wdq0Var.d;
                                boolean zBooleanValue6 = bool7 != null ? bool7.booleanValue() : false;
                                Boolean bool8 = wdq0Var.e;
                                boolean zBooleanValue7 = bool8 != null ? bool8.booleanValue() : false;
                                Boolean bool9 = wdq0Var.f;
                                arrayList2.add(new tdq0(iIntValue4, iIntValue5, iIntValue6, zBooleanValue6, zBooleanValue7, bool9 != null ? bool9.booleanValue() : false));
                            }
                        } else {
                            arrayList2 = obj5;
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = iun.f15405a;
                        }
                        arrayList4.add(new aoa0(str4, str6, iIntValue, iIntValue2, str7, str8, iIntValue3, zBooleanValue, str10, str12, r28, arrayList2));
                        i2 = i3;
                        obj3 = obj5;
                        i = 1;
                    }
                    obj2 = obj3;
                    r10 = arrayList4;
                } else {
                    obj2 = obj3;
                    r10 = obj2;
                }
                if (r10 == 0) {
                    r10 = iun.f15405a;
                }
                arrayList3.add(new cd30(str2, r10));
                obj3 = obj2;
                i = 1;
            }
            obj3 = arrayList3;
        }
        if (obj3 == null) {
            obj3 = iun.f15405a;
        }
        jd30 jd30Var = (jd30) ouuVar.c;
        jd30Var.getClass();
        obj3.getClass();
        or30 or30Var = jd30Var.f16311a;
        or30Var.a();
        or30Var.d(obj3);
        return obj3;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new ffd((gfd) this.k, (xdd) obj, yjeVar, (byte) 0);
            case 1:
                return new ffd((kfd) this.k, (aed) obj, yjeVar, (byte) 1);
            case 2:
                return new ffd((hjd) this.k, (d0t) obj, yjeVar, (byte) 2);
            case 3:
                return new ffd((aig) this.k, (String) obj, yjeVar, (byte) 3);
            case 4:
                return new ffd((ulg) this.k, (xah) obj, yjeVar, (byte) 4);
            case 5:
                return new ffd((dch) this.k, (ibh) obj, yjeVar, (byte) 5);
            case 6:
                return new ffd((ykh) this.k, (jo20) obj, yjeVar, (byte) 6);
            case 7:
                return new ffd((d4o) this.k, (e3o) obj, yjeVar, (byte) 7);
            case 8:
                return new ffd((tqo) this.k, (qhj) obj, yjeVar, (byte) 8);
            case 9:
                return new ffd((wgp) this.k, (ugp) obj, yjeVar, (byte) 9);
            case 10:
                return new ffd((nnp) this.k, (gmp) obj, yjeVar, (byte) 10);
            case 11:
                return new ffd((nnp) this.k, (ygs) obj, yjeVar, (byte) 11);
            case 12:
                return new ffd((kmq) this.k, (mie0) obj, yjeVar, (byte) 12);
            case 13:
                return new ffd((g9s) this.k, (anq0) obj, yjeVar, (byte) 13);
            case 14:
                return new ffd((yks) this.k, (anq0) obj, yjeVar, (byte) 14);
            case 15:
                return new ffd((wzy) this.k, (uzy) obj, yjeVar, (byte) 15);
            case 16:
                return new ffd((onv) this.k, (k4z) obj, yjeVar, (byte) 16);
            case 17:
                return new ffd((ef00) obj, yjeVar, (byte) 17);
            case 18:
                return new ffd((sf10) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ffd((ph10) obj, yjeVar, (byte) 19);
            case 20:
                return new ffd((f120) this.k, (a0z) obj, yjeVar, (byte) 20);
            case 21:
                return new ffd((w220) obj, yjeVar, (byte) 21);
            case 22:
                return new ffd((on20) this.k, (Throwable) obj, yjeVar, (byte) 22);
            case 23:
                return new ffd((nn20) this.k, (oa20) obj, yjeVar, (byte) 23);
            case 24:
                return new ffd((on20) this.k, (String) obj, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ffd((cyu) this.k, (String) obj, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ffd((ouu) this.k, (String) obj, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ffd((j340) obj, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ffd((bd40) this.k, (xb40) obj, yjeVar, (byte) 28);
            default:
                return new ffd((v360) this.k, (qbs0) obj, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((ffd) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v39, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objA;
        boolean z;
        Object objJ;
        Object value;
        Object objB;
        Object objA2;
        Object obj2;
        Object objT;
        ef00 ef00Var;
        Object value2;
        we10 we10Var;
        Object objC;
        Object value3;
        Object value4;
        Object value5;
        jg10 jg10Var;
        Object objC2;
        Object value6;
        Object value7;
        Object objA3;
        ?? arrayList;
        String str;
        List list;
        String str2;
        String str3;
        Object objT2;
        j340 j340Var;
        Object objB2;
        byte b = this.i;
        qjd qjdVar = qjd.f28832a;
        byte b2 = 12;
        h660 h660Var = h660.f12515a;
        int i = 10;
        int i2 = 0;
        ?? r11 = 0;
        Object obj3 = this.l;
        byte b3 = 1;
        ArrayList arrayList2 = null;
        ?? r15 = 0;
        ?? r16 = 0;
        ?? r17 = 0;
        ?? r18 = 0;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gfd gfdVar = (gfd) this.k;
                    kki kkiVar = gfdVar.r;
                    vdd vddVar = (vdd) ((xdd) obj3);
                    long j = ((cfd) gfdVar.D()).f4255a;
                    vddVar.getClass();
                    jed jedVar = vddVar.b;
                    String str4 = jedVar.f16367a;
                    lho lhoVar = jedVar.c;
                    long j2 = jedVar.j;
                    String strQ = w6x.q(jedVar.h, " : ", jedVar.i);
                    String str5 = jedVar.d;
                    String str6 = jedVar.f;
                    iun iunVar = iun.f15405a;
                    otc otcVar = new otc(0L, str4, lhoVar, j2, strQ, new ufp0(0, "", str5, str6, iunVar), new ufp0(0, "", jedVar.e, jedVar.g, iunVar), "", j);
                    this.j = true;
                    if (kkiVar.s(otcVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kfd kfdVar = (kfd) this.k;
                    kki kkiVar2 = kfdVar.r;
                    ydd yddVar = (ydd) ((aed) obj3);
                    long j3 = kfdVar.t;
                    yddVar.getClass();
                    rvf rvfVar = yddVar.b;
                    long j4 = rvfVar.b;
                    String str7 = rvfVar.f31165a;
                    lho lhoVar2 = rvfVar.c;
                    long j5 = rvfVar.j;
                    String strQ2 = w6x.q(rvfVar.h, " : ", rvfVar.i);
                    String str8 = rvfVar.d;
                    String str9 = rvfVar.f;
                    iun iunVar2 = iun.f15405a;
                    otc otcVar2 = new otc(j4, str7, lhoVar2, j5, strQ2, new ufp0(0, "", str8, str9, iunVar2), new ufp0(0, "", rvfVar.e, rvfVar.g, iunVar2), "", j3);
                    this.j = true;
                    if (kkiVar2.s(otcVar2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                d0t d0tVar = (d0t) obj3;
                hjd hjdVar = (hjd) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                try {
                    if (!z4) {
                        z1x.P(obj);
                        boolean zJ = hjdVar.r.j();
                        njt0 njt0Var = hjdVar.s;
                        long j6 = d0tVar.x;
                        long j7 = d0tVar.f5282a;
                        boolean z5 = d0tVar.C;
                        boolean z6 = (!d0tVar.F || d0tVar.h || zJ) ? false : true;
                        this.j = true;
                        objA = njt0Var.a(j6, j7, this, z5, z6, false);
                        if (objA == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        if (!z4) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objA = obj;
                    }
                    sjt0 sjt0Var = (sjt0) objA;
                    if ((sjt0Var instanceof ojt0) && ((ojt0) sjt0Var).f25377a) {
                        int i3 = hjd.E;
                        hjdVar.g(qjdVar);
                    }
                    if (!(sjt0Var instanceof qjt0)) {
                        long j8 = d0tVar.v;
                        long j9 = d0tVar.u;
                        int i4 = hjd.E;
                        if (sjt0Var != null) {
                            if (sjt0Var instanceof ojt0) {
                                z = true;
                            } else {
                                if (!(sjt0Var instanceof rjt0)) {
                                    if ((sjt0Var instanceof qjt0) || (sjt0Var instanceof pjt0)) {
                                    }
                                }
                                z = false;
                            }
                            boolean z7 = d0tVar.C;
                            hjdVar.p.I(j8, j9, kpb.T(((tjd) hjdVar.d()).b), z, z7);
                            hjdVar.x.f(j8, j9, kpb.T(((tjd) hjdVar.d()).b), z, z7);
                        }
                        throw new m460();
                    }
                } catch (Throwable th) {
                    hjdVar.t.f(th, new ejd(hjdVar, r11 == true ? 1 : 0));
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    this.j = true;
                    if (((aig) this.k).s.b((String) obj3) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    this.j = true;
                    int i5 = ulg.s;
                    if (((ulg) this.k).j((xah) obj3, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    hjd hjdVar2 = ((dch) this.k).w;
                    did didVar = new did(((ibh) obj3).f14486a);
                    this.j = true;
                    hjdVar2.getClass();
                    if (hjdVar2.a(didVar, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                ykh ykhVar = (ykh) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    this.j = true;
                    objJ = ykhVar.f42787a.j((jo20) obj3, this);
                    if (objJ == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objJ = obj;
                }
                Iterable iterable = (Iterable) objJ;
                ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList3.add(bkb.l0((blh) it.next(), ykhVar.c));
                }
                return arrayList3;
            case 7:
                hhq0 hhq0Var = ((e3o) obj3).f7147a;
                d4o d4oVar = (d4o) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    soi0 soi0Var = d4oVar.v;
                    this.j = true;
                    if (soi0Var.a(hhq0Var) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i6 = d4o.H;
                p7m0 p7m0Var = d4oVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, y3o.a((y3o) value, null, null, null, 0, false, false, hhq0Var.f13078a, null, hhq0Var.b, hhq0Var.c, false, false, false, 62207)));
                return Unit.f46060a;
            case 8:
                qhj qhjVar = (qhj) obj3;
                tqo tqoVar = (tqo) this.k;
                wne wneVar9 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    h3c h3cVar = tqoVar.C;
                    long j10 = qhjVar.r;
                    this.j = true;
                    objB = h3cVar.b(j10, this);
                    if (objB == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                if (qhjVar.c != 707) {
                    tqoVar.p.d(new r91(tqoVar, qhjVar, zBooleanValue, b2));
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    wgp wgpVar = (wgp) this.k;
                    kki kkiVar3 = wgpVar.r;
                    sgp sgpVar = (sgp) ((ugp) obj3);
                    long j11 = ((rgp) wgpVar.D()).e;
                    sgpVar.getClass();
                    uft0 uft0Var = sgpVar.b;
                    long j12 = uft0Var.b;
                    String str10 = uft0Var.f35591a;
                    lho lhoVar3 = uft0Var.c;
                    long jB = uft0Var.f.b();
                    ufp0 ufp0Var = uft0Var.d;
                    String str11 = ufp0Var.b;
                    String str12 = ufp0Var.d;
                    iun iunVar3 = iun.f15405a;
                    ufp0 ufp0Var2 = new ufp0(0, "", str11, str12, iunVar3);
                    ufp0 ufp0Var3 = uft0Var.e;
                    otc otcVar3 = new otc(j12, str10, lhoVar3, jB, "", ufp0Var2, new ufp0(0, "", ufp0Var3.b, ufp0Var3.d, iunVar3), "", j11);
                    this.j = true;
                    if (kkiVar3.s(otcVar3, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                nnp nnpVar = (nnp) this.k;
                gmp gmpVar = (gmp) obj3;
                wne wneVar11 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    vhp vhpVar = gmpVar.f11551a;
                    long j13 = vhpVar.f37442a;
                    long j14 = vhpVar.c;
                    long j15 = vhpVar.d;
                    boolean z16 = vhpVar.e;
                    int i7 = nnp.a0;
                    nnpVar.R(j13, j14, j15, z16);
                    this.j = true;
                    if (nnpVar.W(gmpVar, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                nnp nnpVar2 = (nnp) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z17 = this.j;
                try {
                    if (!z17) {
                        z1x.P(obj);
                        boolean zJ2 = nnpVar2.G.j();
                        njt0 njt0Var2 = nnpVar2.L;
                        ygs ygsVar = (ygs) obj3;
                        long j16 = ygsVar.b;
                        long j17 = ygsVar.f42600a;
                        boolean z18 = ygsVar.c;
                        boolean z19 = (!ygsVar.u || ygsVar.g || zJ2) ? false : true;
                        this.j = true;
                        objA2 = njt0Var2.a(j16, j17, this, z18, z19, false);
                        if (objA2 == wneVar12) {
                            return wneVar12;
                        }
                    } else {
                        if (!z17) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objA2 = obj;
                    }
                    sjt0 sjt0Var2 = (sjt0) objA2;
                    if ((sjt0Var2 instanceof ojt0) && ((ojt0) sjt0Var2).f25377a) {
                        ump umpVar = new ump(qjdVar);
                        int i8 = nnp.a0;
                        nnpVar2.G(umpVar);
                    }
                    break;
                } catch (Throwable th2) {
                    nnpVar2.F.f(th2, new zmp(nnpVar2, b3));
                }
                return Unit.f46060a;
            case 12:
                mie0 mie0Var = (mie0) obj3;
                wne wneVar13 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    kmq kmqVar = (kmq) this.k;
                    Object obj4 = mie0Var.f21842a;
                    if (obj4 == k860.f17859a) {
                        obj4 = null;
                    }
                    this.j = true;
                    if (kmqVar.a(obj4, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                mie0Var.f21842a = null;
                return Unit.f46060a;
            case 13:
                g9s g9sVar = (g9s) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    g9sVar.D.getClass();
                    gmq gmqVarF = qud.f((anq0) obj3);
                    n8s n8sVar = new n8s(g9sVar, r15 == true ? 1 : 0, b2);
                    this.j = true;
                    Object objC3 = gmqVarF.c(new vnq(h660Var, n8sVar, (byte) 2), this);
                    if (objC3 != wneVar14) {
                        objC3 = Unit.f46060a;
                    }
                    if (objC3 != wneVar14) {
                        objC3 = Unit.f46060a;
                    }
                    if (objC3 == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                yks yksVar = (yks) this.k;
                wne wneVar15 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    yksVar.D.getClass();
                    gmq gmqVarF2 = qud.f((anq0) obj3);
                    gks gksVar = new gks(yksVar, r16 == true ? 1 : 0, (byte) 11);
                    this.j = true;
                    Object objC4 = gmqVarF2.c(new vnq(h660Var, gksVar, (byte) 2), this);
                    if (objC4 != wneVar15) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 != wneVar15) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    wzy wzyVar = (wzy) this.k;
                    kki kkiVar4 = wzyVar.r;
                    szy szyVar = (szy) ((uzy) obj3);
                    long j18 = wzyVar.t;
                    String str13 = szyVar.l;
                    lho lhoVar4 = lho.GAME_STATUS_RESULT;
                    String strQ3 = w6x.q(szyVar.d, " : ", szyVar.e);
                    iun iunVar4 = iun.f15405a;
                    otc otcVar4 = new otc(0L, str13, lhoVar4, 0L, strQ3, new ufp0(0, "", "", "", iunVar4), new ufp0(0, "", "", "", iunVar4), szyVar.f33090a, j18);
                    this.j = true;
                    if (kkiVar4.s(otcVar4, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    ins0 ins0Var = (ins0) ((onv) this.k).f25567a;
                    long j19 = ((k4z) obj3).f17693a.f12456a;
                    this.j = true;
                    Object objA4 = ins0Var.a(j19, this);
                    if (objA4 == wneVar17) {
                        return wneVar17;
                    }
                    obj2 = objA4;
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj2 = ((j0g0) obj).f15681a;
                }
                return new j0g0(obj2);
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    ef00 ef00Var2 = (ef00) obj3;
                    cyu cyuVar = ef00Var2.s0;
                    this.k = ef00Var2;
                    this.j = true;
                    objT = cyuVar.t(this);
                    if (objT == wneVar18) {
                        return wneVar18;
                    }
                    ef00Var = ef00Var2;
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ef00Var = (ef00) this.k;
                    z1x.P(obj);
                    objT = obj;
                }
                i1w0 i1w0Var = ef00Var.Q;
                int iOrdinal = ((a1p0) objT).ordinal();
                if (iOrdinal == 0) {
                    i1w0Var.d(new ee00(ef00Var, (byte) 9));
                } else if (iOrdinal == 1) {
                    i1w0Var.d(new ee00(ef00Var, (byte) 10));
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    ouu ouuVar = ef00Var.Y;
                    tcp tcpVar = tcp.GAMES;
                    ouuVar.q(new ya50(5), true);
                }
                return Unit.f46060a;
            case 18:
                sf10 sf10Var = (sf10) obj3;
                ocj ocjVar = sf10Var.i;
                wne wneVar19 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    int i9 = sf10.B;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, lf10.a((lf10) value2, null, true, 127)));
                    we10Var = ((lf10) sf10Var.D()).d;
                    xfu xfuVar = sf10Var.q;
                    String str14 = ((lf10) sf10Var.D()).c;
                    this.k = we10Var;
                    this.j = true;
                    objC = ((qi10) xfuVar.f40810a).c(str14, this);
                    if (objC == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    we10 we10Var2 = (we10) this.k;
                    z1x.P(obj);
                    we10Var = we10Var2;
                    objC = obj;
                }
                wi10 wi10Var = (wi10) objC;
                if (we10Var instanceof ue10) {
                    ue10 ue10Var = (ue10) we10Var;
                    int i10 = sf10.B;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                    } while (!p7m0Var3.m(value4, lf10.a((lf10) value4, new ue10(yh10.a(ue10Var.f35505a, wi10Var)), false, 239)));
                }
                int i11 = sf10.B;
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                } while (!p7m0Var4.m(value3, lf10.a((lf10) value3, null, false, 127)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ph10 ph10Var = (ph10) obj3;
                ocj ocjVar2 = ph10Var.i;
                wne wneVar20 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    int i12 = ph10.B;
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var5.getValue();
                        value5.getClass();
                    } while (!p7m0Var5.m(value5, gh10.a((gh10) value5, null, true, 127)));
                    jg10Var = ((gh10) ph10Var.D()).d;
                    xfu xfuVar2 = ph10Var.q;
                    String str15 = ((gh10) ph10Var.D()).c;
                    this.k = jg10Var;
                    this.j = true;
                    objC2 = ((qi10) xfuVar2.f40810a).c(str15, this);
                    if (objC2 == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jg10 jg10Var2 = (jg10) this.k;
                    z1x.P(obj);
                    jg10Var = jg10Var2;
                    objC2 = obj;
                }
                wi10 wi10Var2 = (wi10) objC2;
                if (jg10Var instanceof hg10) {
                    hg10 hg10Var = (hg10) jg10Var;
                    int i13 = ph10.B;
                    p7m0 p7m0Var6 = ocjVar2.f25029a;
                    do {
                        value7 = p7m0Var6.getValue();
                        value7.getClass();
                    } while (!p7m0Var6.m(value7, gh10.a((gh10) value7, new hg10(yh10.a(hg10Var.f12997a, wi10Var2)), false, 239)));
                }
                int i14 = ph10.B;
                p7m0 p7m0Var7 = ocjVar2.f25029a;
                do {
                    value6 = p7m0Var7.getValue();
                    value6.getClass();
                } while (!p7m0Var7.m(value6, gh10.a((gh10) value6, null, false, 127)));
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    f120 f120Var = (f120) this.k;
                    kki kkiVar5 = f120Var.E;
                    a0z a0zVar = (a0z) obj3;
                    ctf0 ctf0Var = f120Var.y;
                    long j20 = f120Var.p;
                    ctf0Var.getClass();
                    String strA = a0zVar.h ? ctf0Var.b.a(R.string.statistic_last_game_adapter_vs, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.statistic_last_game_adapter_item_score, Arrays.copyOf(new Object[]{a0zVar.i, a0zVar.j}, 2));
                    long j21 = a0zVar.b;
                    String str16 = a0zVar.f44a;
                    lho lhoVar5 = a0zVar.c;
                    long j22 = a0zVar.g;
                    znp0 znp0Var = a0zVar.d;
                    String str17 = znp0Var.b;
                    String str18 = znp0Var.d;
                    iun iunVar5 = iun.f15405a;
                    ufp0 ufp0Var4 = new ufp0(0, "", str17, str18, iunVar5);
                    znp0 znp0Var2 = a0zVar.e;
                    otc otcVar5 = new otc(j21, str16, lhoVar5, j22, strA, ufp0Var4, new ufp0(0, "", znp0Var2.b, znp0Var2.d, iunVar5), "", j20);
                    this.j = true;
                    if (kkiVar5.s(otcVar5, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                return l(obj);
            case 22:
                on20 on20Var = (on20) this.k;
                wne wneVar22 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    w5z w5zVar = on20Var.C0;
                    iun iunVar6 = iun.f15405a;
                    q4f q4fVarA = on20Var.b0.a();
                    vtb0 vtb0Var = ((a820) on20Var.D()).h;
                    g920 g920Var = vtb0Var != null ? vtb0Var.g : g920.CUSTOM;
                    kuw kuwVar = ((zhi0) ((Throwable) obj3)).c;
                    long j23 = ((a820) on20Var.D()).b.f34694a;
                    String simpleName = gze.class.getSimpleName();
                    long jA = on20Var.c1.a();
                    this.j = true;
                    if (w5zVar.V(iunVar6, q4fVarA, g920Var, kuwVar, j23, simpleName, iunVar6, jA, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                nn20 nn20Var = (nn20) this.k;
                wne wneVar23 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    if (((b820) nn20Var.D()).b instanceof co7) {
                        nvu nvuVar = nn20Var.F;
                        bm5 bm5Var = bm5.b;
                        double d = ((oa20) obj3).b;
                        this.j = true;
                        if (nvuVar.J(bm5Var, d, this) == wneVar23) {
                            return wneVar23;
                        }
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                on20 on20Var2 = (on20) this.k;
                wne wneVar24 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    pc20 pc20Var = new pc20(new xdk0(pek0.f26859a, (String) obj3, null, null, jdk0.f16332a, null, 108));
                    int i15 = on20.m1;
                    on20Var2.G(pc20Var);
                    tqc tqcVar = on20Var2.G0;
                    this.j = true;
                    if (tqcVar.b(true, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cyu cyuVar2 = (cyu) this.k;
                knf0 knf0Var = (knf0) cyuVar2.c;
                wne wneVar25 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    zn00 zn00Var = (zn00) cyuVar2.f5196a;
                    String strC = knf0Var.c();
                    int iB = knf0Var.b();
                    knf0Var.getClass();
                    LinkedHashMap linkedHashMapO = ofm0.o(iB, (String) obj3, strC);
                    this.j = true;
                    objA3 = ((vb30) ((rx00) zn00Var.b).invoke()).a("application/vnd.xenvelop+json", linkedHashMapO, this);
                    if (objA3 == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                List list2 = ((kc30) ((dx5) objA3).a()).d;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                    for (Object obj5 : list2) {
                        int i16 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        dc30 dc30Var = (dc30) obj5;
                        String str19 = dc30Var.f5833a;
                        if (str19 == null) {
                            str19 = "";
                        }
                        String str20 = dc30Var.b;
                        if (str20 == null) {
                            str20 = "";
                        }
                        List<vn5> list3 = dc30Var.c;
                        if (list3 != null) {
                            arrayList = new ArrayList(r3d.q(list3, i));
                            for (vn5 vn5Var : list3) {
                                String str21 = vn5Var.f37701a;
                                if (str21 == null) {
                                    str21 = "";
                                }
                                bdf bdfVar = vn5Var.b;
                                if (bdfVar == null || (str = bdfVar.f2397a) == null) {
                                    str = "";
                                }
                                if (bdfVar == null || (list = bdfVar.b) == null) {
                                    list = iun.f15405a;
                                }
                                ycf ycfVar = new ycf(str, list);
                                hdf hdfVar = vn5Var.c;
                                if (hdfVar == null || (str2 = hdfVar.f12866a) == null) {
                                    str2 = "";
                                }
                                if (hdfVar == null || (str3 = hdfVar.b) == null) {
                                    str3 = "";
                                }
                                arrayList.add(new sn5(str21, ycfVar, new edf(str2, str3)));
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = iun.f15405a;
                        }
                        arrayList4.add(new ac30(i2, str19, str20, arrayList));
                        i2 = i16;
                        i = 10;
                    }
                    arrayList2 = arrayList4;
                }
                return arrayList2 == null ? iun.f15405a : arrayList2;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return m(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar26 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    j340 j340Var2 = (j340) obj3;
                    cyu cyuVar3 = j340Var2.R0;
                    this.k = j340Var2;
                    this.j = true;
                    objT2 = cyuVar3.t(this);
                    if (objT2 == wneVar26) {
                        return wneVar26;
                    }
                    j340Var = j340Var2;
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j340Var = (j340) this.k;
                    z1x.P(obj);
                    objT2 = obj;
                }
                int i17 = j340.i1;
                i1w0 i1w0Var2 = j340Var.q;
                int iOrdinal2 = ((a1p0) objT2).ordinal();
                if (iOrdinal2 == 0) {
                    i1w0Var2.d(new p240(j340Var, (byte) 15));
                } else if (iOrdinal2 == 1) {
                    i1w0Var2.d(new p240(j340Var, (byte) 16));
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    ouu ouuVar2 = j340Var.p;
                    tcp tcpVar2 = tcp.GAMES;
                    ouuVar2.q(new ya50(5), true);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                xb40 xb40Var = (xb40) obj3;
                bd40 bd40Var = (bd40) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z34 = this.j;
                if (!z34) {
                    z1x.P(obj);
                    cyu cyuVar4 = bd40Var.r;
                    long j24 = bd40Var.p.f46559a;
                    cyuVar4.getClass();
                    dnq dnqVar = new dnq(aoq.c(new vsg0(new mw20((Object) cyuVar4, (Enum) xb40Var, (yje) (r18 == true ? 1 : 0), (byte) 27)), new mc40(null, cyuVar4, j24)), new x5v(3, r17 == true ? 1 : 0, (byte) 4), (byte) 1);
                    clu cluVar = new clu(bd40Var, xb40Var, (byte) 18);
                    this.j = true;
                    if (dnqVar.c(cluVar, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z34) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                qbs0 qbs0Var = (qbs0) obj3;
                v360 v360Var = (v360) this.k;
                wne wneVar28 = wne.f39444a;
                boolean z35 = this.j;
                if (!z35) {
                    z1x.P(obj);
                    h3c h3cVar2 = v360Var.x;
                    long j25 = qbs0Var.f28453a.b;
                    this.j = true;
                    objB2 = h3cVar2.b(j25, this);
                    if (objB2 == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z35) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB2 = obj;
                }
                v360Var.S.d(new r91((Object) v360Var, (Object) qbs0Var, ((Boolean) objB2).booleanValue(), (byte) 21));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffd(diu0 diu0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }
}
