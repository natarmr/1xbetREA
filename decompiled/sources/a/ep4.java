package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models.BonusAccountUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ep4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8168a;
    public final /* synthetic */ ctf0 b;

    public /* synthetic */ ep4(ctf0 ctf0Var, byte b) {
        this.f8168a = b;
        this.b = ctf0Var;
    }

    private final Object a(Object obj) {
        Boolean boolB;
        btb btbVar = (btb) obj;
        btbVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        ipb ipbVar = btbVar.d;
        mcy mcyVar = btbVar.f;
        String str = btbVar.e;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.test_client_config_edit_key_title, Arrays.copyOf(new Object[0], 0));
        mcy mcyVar2 = btbVar.b;
        mcy mcyVar3 = btbVar.c;
        boolean z = !Intrinsics.d(mcyVar2, mcyVar3);
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        wul wulVar = new wul(nulVar, oe9Var, new ue9(lsm0Var.a(R.string.test_client_config_edit_key_reset_value, Arrays.copyOf(new Object[0], 0))), true, false, false);
        wul wulVar2 = new wul(nulVar, oe9Var, new ue9(lsm0Var.a(R.string.test_client_config_edit_key_set_null, Arrays.copyOf(new Object[0], 0))), true, false, false);
        wul wulVar3 = new wul(lul.e, oe9Var, new ue9(lsm0Var.a(R.string.test_client_config_edit_key_refresh, Arrays.copyOf(new Object[0], 0))), true, false, false);
        hjm hjmVar = new hjm(kng0.l(lsm0Var.a(R.string.test_client_config_edit_key_name, Arrays.copyOf(new Object[0], 0)), Separators.SP, btbVar.f3175a), null, null, null, null, null, false, null, null, false, null, null, 8190);
        hjm hjmVar2 = new hjm(kng0.l(lsm0Var.a(R.string.test_client_config_edit_key_source_value, Arrays.copyOf(new Object[0], 0)), Separators.SP, dtb.V(mcyVar2)), null, null, null, null, null, false, null, null, false, null, null, 8190);
        boolean z2 = mcyVar2 == null;
        String upperCase = lsm0Var.a(R.string.test_client_config_empty, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        hjm hjmVar3 = new hjm(upperCase, null, new y3d(staticColors.m113getRed0d7_KjU()), null, null, null, false, null, null, false, null, null, 8186);
        hjm hjmVar4 = new hjm(!Intrinsics.d(mcyVar2, mcyVar3) ? lsm0Var.a(R.string.test_client_config_edit_key_changed_alert, Arrays.copyOf(new Object[0], 0)) : "", null, new y3d(staticColors.m113getRed0d7_KjU()), null, null, null, false, null, null, false, null, null, 8186);
        hjm hjmVar5 = new hjm(kng0.l(lsm0Var.a(R.string.test_client_config_edit_key_changed_value, Arrays.copyOf(new Object[0], 0)), Separators.SP, dtb.V(mcyVar3)), null, null, null, null, null, false, null, null, false, null, null, 8190);
        ArrayList arrayList = null;
        c6q0 c6q0Var = new c6q0(mcyVar != null ? dtb.V(mcyVar) : str, e6q0.f7299a, o6q0.f24750a, new s7q0(""), true, false, new y5q0(1, null, null, 6), lsm0Var.a(R.string.test_client_config_edit_key_new_value_hint, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 261120);
        jdy jdyVar = mcyVar instanceof jdy ? (jdy) mcyVar : null;
        if (jdyVar != null) {
            scx scxVar = ncy.f23316a;
            boolB = wsm0.b(jdyVar.b());
        } else {
            boolB = null;
        }
        List<mcy> list = btbVar.g;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (mcy mcyVar4 : list) {
                arrayList.add(new fnb0(mcyVar4, dtb.V(mcyVar4), Intrinsics.d(mcyVar4, mcyVar)));
            }
        }
        return new ctb(ipbVar, str, strA, z, wulVar, wulVar2, wulVar3, hjmVar, hjmVar2, z2, hjmVar3, hjmVar4, hjmVar5, c6q0Var, boolB, arrayList);
    }

    private final Object b(Object obj) {
        ((whg) obj).getClass();
        return new m72(this.b, (byte) 12);
    }

    private final Object c(Object obj) {
        z0j z0jVar = (z0j) obj;
        z0jVar.getClass();
        return new ov0(this.b, z0jVar);
    }

    private final Object g(Object obj) {
        b2j b2jVar = (b2j) obj;
        b2jVar.getClass();
        return new d2j(this.b, b2jVar);
    }

    private final Object h(Object obj) {
        ((m5j) obj).getClass();
        return new n5j(this.b);
    }

    private final Object i(Object obj) {
        w5j w5jVar = (w5j) obj;
        w5jVar.getClass();
        return new xa9(this.b, w5jVar);
    }

    private final Object l(Object obj) {
        hbk hbkVar = (hbk) obj;
        hbkVar.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        String str = hbkVar.f12774a;
        String str2 = hbkVar.b;
        pz40 pz40Var = s6t0.f31722a;
        imm immVar = new imm(klm.f18497a, mlm.f21997a, new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_cancel, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        lsm0 lsm0Var = ctf0Var.b;
        return new ibk(str, str2, immVar, new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))), true, false, false), rk.h), new itl(new wul(nul.e, oe9Var, new ue9(lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, false), rk.p))));
    }

    /* JADX WARN: Code duplicated, block: B:310:0x0a7c A[PHI: r14 r15
  0x0a7c: PHI (r14v49 int) = (r14v40 int), (r14v42 int), (r14v46 int), (r14v31 int) binds: [B:417:0x0b66, B:401:0x0b45, B:384:0x0b20, B:309:0x0a7b] A[DONT_GENERATE, DONT_INLINE]
  0x0a7c: PHI (r15v41 a.sso0) = (r15v22 a.sso0), (r15v22 a.sso0), (r15v22 a.sso0), (r15v42 a.sso0) binds: [B:417:0x0b66, B:401:0x0b45, B:384:0x0b20, B:309:0x0a7b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:311:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:327:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:343:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:359:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:375:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:428:0x0b7e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:431:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:433:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:435:0x0bae  */
    /* JADX WARN: Code duplicated, block: B:436:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:438:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:439:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:441:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:442:0x0bec  */
    /* JADX WARN: Code duplicated, block: B:444:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:445:0x0c02  */
    /* JADX WARN: Code duplicated, block: B:447:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:448:0x0c18  */
    /* JADX WARN: Code duplicated, block: B:450:0x0c1c  */
    /* JADX WARN: Code duplicated, block: B:497:0x0df9  */
    /* JADX WARN: Code duplicated, block: B:499:0x0e02 A[LOOP:12: B:498:0x0e00->B:499:0x0e02, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:502:0x0e15  */
    /* JADX WARN: Code duplicated, block: B:505:0x0e31  */
    /* JADX WARN: Code duplicated, block: B:507:0x0e39  */
    /* JADX WARN: Code duplicated, block: B:509:0x0e3d  */
    /* JADX WARN: Code duplicated, block: B:510:0x0e40  */
    /* JADX WARN: Code duplicated, block: B:512:0x0e4a  */
    /* JADX WARN: Code duplicated, block: B:513:0x0e4d  */
    /* JADX WARN: Code duplicated, block: B:519:0x0e85  */
    /* JADX WARN: Code duplicated, block: B:520:0x0e87  */
    /* JADX WARN: Code duplicated, block: B:560:0x0c2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x0e58 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hq8 eq8Var;
        hq8 fq8Var;
        List list;
        ArrayList arrayList;
        int i;
        boolean z;
        a4x a4xVarO0;
        int i2;
        wui0 wui0Var;
        lc00 lc00VarB;
        int i3;
        ioo0 ioo0Var;
        sso0 sso0Var;
        sso0 sso0Var2;
        sso0 sso0Var3;
        uoo0 moo0Var;
        xb8 xb8Var;
        rl8 ql8Var;
        String strA;
        byte b = this.f8168a;
        fa50 fa50Var = fa50.f9191a;
        String strA2 = "";
        int i4 = 0;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                zn4 zn4Var = (zn4) obj;
                zn4Var.getClass();
                ctf0Var.getClass();
                boolean z2 = zn4Var.d;
                bo4 bo4Var = zn4Var.g;
                String str = zn4Var.b;
                boolean z3 = zn4Var.c;
                x1o v1oVar = zn4Var.f44656a ? new v1o(zn4Var.e) : w1o.f38412a;
                if (!zn4Var.f) {
                    if (bo4Var != null) {
                        lsm0 lsm0Var = ctf0Var.b;
                        fq8Var = new fq8(oja0.Z(bo4Var, ctf0Var, wui0.f39793a), lsm0Var.a(R.string.authenticator_close_session, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.security_exit_sessions_confirm_button_title, Arrays.copyOf(new Object[0], 0)));
                    } else {
                        eq8Var = gq8.f11719a;
                    }
                    if (zn4Var.c) {
                        lc00VarB = kotlin.collections.a.b();
                        for (i3 = 0; i3 < 9; i3++) {
                            lc00VarB.add(t84.f33495a);
                        }
                        a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                    } else {
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        list = zn4Var.h;
                        arrayList = new ArrayList(r3d.q(list, 10));
                        i = 0;
                        for (Object obj2 : list) {
                            i2 = i + 1;
                            if (i >= 0) {
                                q3d.p();
                                throw null;
                            }
                            bo4 bo4Var2 = (bo4) obj2;
                            if (i == 0) {
                                wui0Var = wui0.b;
                            } else if (i == list.size() - 1) {
                                wui0Var = wui0.d;
                            } else {
                                wui0Var = wui0.c;
                            }
                            arrayList.add(oja0.Z(bo4Var2, ctf0Var, wui0Var));
                            i = i2;
                        }
                        lc00VarB2.addAll(arrayList);
                        lsm0 lsm0Var2 = ctf0Var.b;
                        String strA3 = lsm0Var2.a(R.string.authenticator_close_all_sessions_item_title, Arrays.copyOf(new Object[0], 0));
                        String strA4 = lsm0Var2.a(R.string.security_exit_description, Arrays.copyOf(new Object[0], 0));
                        if (list.size() > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        lc00VarB2.add(new s44(strA3, strA4, z));
                        a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB2));
                    }
                    return new g94(str, z2, z3, v1oVar, fq8Var, a4xVarO0);
                }
                lsm0 lsm0Var3 = ctf0Var.b;
                eq8Var = new eq8(lsm0Var3.a(R.string.authenticator_close_all_sessions, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.authenticator_close_all_sessions_desc, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.security_exit_sessions_confirm_button_title, Arrays.copyOf(new Object[0], 0)));
                fq8Var = eq8Var;
                if (zn4Var.c) {
                    lc00VarB = kotlin.collections.a.b();
                    while (i3 < 9) {
                        lc00VarB.add(t84.f33495a);
                    }
                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                } else {
                    lc00 lc00VarB3 = kotlin.collections.a.b();
                    list = zn4Var.h;
                    arrayList = new ArrayList(r3d.q(list, 10));
                    i = 0;
                    while (r8.hasNext()) {
                        i2 = i + 1;
                        if (i >= 0) {
                            q3d.p();
                            throw null;
                        }
                        bo4 bo4Var3 = (bo4) obj2;
                        if (i == 0) {
                            wui0Var = wui0.b;
                        } else if (i == list.size() - 1) {
                            wui0Var = wui0.d;
                        } else {
                            wui0Var = wui0.c;
                        }
                        arrayList.add(oja0.Z(bo4Var3, ctf0Var, wui0Var));
                        i = i2;
                    }
                    lc00VarB3.addAll(arrayList);
                    lsm0 lsm0Var4 = ctf0Var.b;
                    String strA5 = lsm0Var4.a(R.string.authenticator_close_all_sessions_item_title, Arrays.copyOf(new Object[0], 0));
                    String strA6 = lsm0Var4.a(R.string.security_exit_description, Arrays.copyOf(new Object[0], 0));
                    if (list.size() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    lc00VarB3.add(new s44(strA5, strA6, z));
                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB3));
                }
                return new g94(str, z2, z3, v1oVar, fq8Var, a4xVarO0);
            case 1:
                ((er4) obj).getClass();
                return new m72(ctf0Var, (byte) 7);
            case 2:
                uj7 uj7Var = (uj7) obj;
                uj7Var.getClass();
                ctf0Var.getClass();
                a5w a5wVar = uj7Var.f35763a;
                String str2 = uj7Var.e;
                double d = uj7Var.f;
                if (a5wVar == null || !(a5wVar instanceof kzv)) {
                    return vj7.f37512a;
                }
                double d2 = d == -1.0d ? ((kzv) a5wVar).m : d;
                kzv kzvVar = (kzv) a5wVar;
                double dDoubleValue = kzvVar.m;
                List list2 = uj7Var.b;
                int i5 = 4;
                List list3 = uj7Var.c;
                k77 k77Var = uj7Var.g;
                List list4 = uj7Var.d;
                b1j.B(list2, list3, list4);
                String strJ = jwb.J(kzvVar, ctf0Var, list2);
                boolean z4 = kzvVar.q;
                int i6 = kzvVar.t;
                String str3 = kzvVar.f19169a;
                List list5 = kzvVar.Y;
                ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                for (Iterator it = list5.iterator(); it.hasNext(); it = it) {
                    arrayList2.add(Long.valueOf(((z0w) it.next()).F));
                }
                HashSet hashSetJ0 = CollectionsKt.J0(arrayList2);
                boolean zA = i7u.b.a(list5, list4);
                rdj rdjVar = rdj.f30294a;
                lsm0 lsm0Var5 = ctf0Var.b;
                String strG = rdj.g(new znq0(kzvVar.d), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                String str4 = kzvVar.B;
                String strQ = w6x.q(strG, " · \u200e", lsm0Var5.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str3}, 1)));
                too0 too0Var = new too0("TagLines.Title".concat(str3), lsm0Var5.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str3}, 1)));
                joo0 joo0Var = new joo0(twn.m(i6, "Counter"), i6);
                if (i6 == 1) {
                    joo0Var = null;
                }
                ooo0 ooo0Var = new ooo0(lsm0Var5.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), "TagLive", kro0.f18776a);
                if (!z4 || k77Var == k77.TABS_AND_ACCORDEON) {
                    ooo0Var = null;
                }
                qoo0 qoo0Var = new qoo0(lsm0Var5.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), "TagPromo", tqo0.f34390a);
                if (!kzvVar.G) {
                    qoo0Var = null;
                }
                roo0 roo0Var = new roo0(strJ, "TopChampTag".concat(strJ), bro0.f3088a);
                if (strJ.length() <= 0) {
                    roo0Var = null;
                }
                ooo0 ooo0Var2 = ooo0Var;
                koo0 koo0Var = new koo0(lsm0Var5.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), "TagAdvance", cpo0.f4759a);
                if (kzvVar.V == 0.0d) {
                    koo0Var = null;
                }
                koo0 koo0Var2 = koo0Var;
                loo0 loo0Var = new loo0(lsm0Var5.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), "TagAutoSale", wro0.f39654a);
                if (!kzvVar.x) {
                    loo0Var = null;
                }
                ioo0 ioo0Var2 = new ioo0(lsm0Var5.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    ioo0 ioo0Var3 = ioo0Var2;
                    loo0 loo0Var2 = loo0Var;
                    if (((xco) obj3).e) {
                        arrayList3.add(obj3);
                    }
                    ioo0Var2 = ioo0Var3;
                    loo0Var = loo0Var2;
                }
                ioo0 ioo0Var4 = ioo0Var2;
                loo0 loo0Var3 = loo0Var;
                if (arrayList3.isEmpty()) {
                    ioo0Var = null;
                } else {
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            ioo0Var = null;
                        } else if (hashSetJ0.contains(Long.valueOf(((xco) it2.next()).f40655a))) {
                            ioo0Var = ioo0Var4;
                        }
                    }
                }
                moo0 moo0Var2 = new moo0(lsm0Var5.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)), "EachWay", opo0.f25653a);
                if (!zA) {
                    moo0Var2 = null;
                }
                int i7 = 2;
                int i8 = 3;
                List listZ = tx3.z(new uoo0[]{too0Var, joo0Var, ooo0Var2, qoo0Var, roo0Var, koo0Var2, loo0Var3, ioo0Var, moo0Var2});
                ArrayList arrayList4 = new ArrayList(r3d.q(listZ, 10));
                for (uoo0 ooo0Var3 : (ArrayList) listZ) {
                    if (ooo0Var3 instanceof soo0) {
                        soo0 soo0Var = (soo0) ooo0Var3;
                        boolean z5 = soo0Var instanceof ooo0;
                        if (z5) {
                            int iOrdinal = k77Var.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == i7) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var4 = (ooo0) soo0Var;
                                    String str5 = ooo0Var4.c;
                                    String str6 = ooo0Var4.d;
                                    str5.getClass();
                                    str6.getClass();
                                    ooo0Var3 = new ooo0(str5, str6, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var2 = (qoo0) soo0Var;
                                        String str7 = qoo0Var2.c;
                                        String str8 = qoo0Var2.d;
                                        str7.getClass();
                                        str8.getClass();
                                        moo0Var = new qoo0(str7, str8, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var2 = (roo0) soo0Var;
                                        String str9 = roo0Var2.c;
                                        String str10 = roo0Var2.d;
                                        str9.getClass();
                                        str10.getClass();
                                        moo0Var = new roo0(str9, str10, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var3 = (koo0) soo0Var;
                                        String str11 = koo0Var3.c;
                                        String str12 = koo0Var3.d;
                                        str11.getClass();
                                        str12.getClass();
                                        moo0Var = new koo0(str11, str12, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var4 = (loo0) soo0Var;
                                        String str13 = loo0Var4.c;
                                        String str14 = loo0Var4.d;
                                        str13.getClass();
                                        str14.getClass();
                                        moo0Var = new loo0(str13, str14, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var = (poo0) soo0Var;
                                        String str15 = poo0Var.c;
                                        String str16 = poo0Var.d;
                                        str15.getClass();
                                        str16.getClass();
                                        moo0Var = new poo0(str15, str16, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var = (noo0) soo0Var;
                                        String str17 = noo0Var.c;
                                        String str18 = noo0Var.d;
                                        str17.getClass();
                                        str18.getClass();
                                        moo0Var = new noo0(str17, str18, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var3 = (moo0) soo0Var;
                                        String str19 = moo0Var3.c;
                                        String str20 = moo0Var3.d;
                                        str19.getClass();
                                        str20.getClass();
                                        moo0Var = new moo0(str19, str20, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal == i8) {
                                sso0Var3 = oro0.f25744a;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var5 = (ooo0) soo0Var;
                                    String str21 = ooo0Var5.c;
                                    String str22 = ooo0Var5.d;
                                    str21.getClass();
                                    str22.getClass();
                                    ooo0Var3 = new ooo0(str21, str22, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var3 = (qoo0) soo0Var;
                                        String str23 = qoo0Var3.c;
                                        String str24 = qoo0Var3.d;
                                        str23.getClass();
                                        str24.getClass();
                                        moo0Var = new qoo0(str23, str24, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var3 = (roo0) soo0Var;
                                        String str25 = roo0Var3.c;
                                        String str110 = roo0Var3.d;
                                        str25.getClass();
                                        str110.getClass();
                                        moo0Var = new roo0(str25, str110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var4 = (koo0) soo0Var;
                                        String str111 = koo0Var4.c;
                                        String str112 = koo0Var4.d;
                                        str111.getClass();
                                        str112.getClass();
                                        moo0Var = new koo0(str111, str112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var5 = (loo0) soo0Var;
                                        String str113 = loo0Var5.c;
                                        String str114 = loo0Var5.d;
                                        str113.getClass();
                                        str114.getClass();
                                        moo0Var = new loo0(str113, str114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var2 = (poo0) soo0Var;
                                        String str115 = poo0Var2.c;
                                        String str116 = poo0Var2.d;
                                        str115.getClass();
                                        str116.getClass();
                                        moo0Var = new poo0(str115, str116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var2 = (noo0) soo0Var;
                                        String str117 = noo0Var2.c;
                                        String str118 = noo0Var2.d;
                                        str117.getClass();
                                        str118.getClass();
                                        moo0Var = new noo0(str117, str118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var4 = (moo0) soo0Var;
                                        String str119 = moo0Var4.c;
                                        String str26 = moo0Var4.d;
                                        str119.getClass();
                                        str26.getClass();
                                        moo0Var = new moo0(str119, str26, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal == i5 || iOrdinal == 5) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var6 = (ooo0) soo0Var;
                                    String str27 = ooo0Var6.c;
                                    String str28 = ooo0Var6.d;
                                    str27.getClass();
                                    str28.getClass();
                                    ooo0Var3 = new ooo0(str27, str28, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var4 = (qoo0) soo0Var;
                                        String str29 = qoo0Var4.c;
                                        String str210 = qoo0Var4.d;
                                        str29.getClass();
                                        str210.getClass();
                                        moo0Var = new qoo0(str29, str210, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var4 = (roo0) soo0Var;
                                        String str211 = roo0Var4.c;
                                        String str1110 = roo0Var4.d;
                                        str211.getClass();
                                        str1110.getClass();
                                        moo0Var = new roo0(str211, str1110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var5 = (koo0) soo0Var;
                                        String str1111 = koo0Var5.c;
                                        String str1112 = koo0Var5.d;
                                        str1111.getClass();
                                        str1112.getClass();
                                        moo0Var = new koo0(str1111, str1112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var6 = (loo0) soo0Var;
                                        String str1113 = loo0Var6.c;
                                        String str1114 = loo0Var6.d;
                                        str1113.getClass();
                                        str1114.getClass();
                                        moo0Var = new loo0(str1113, str1114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var3 = (poo0) soo0Var;
                                        String str1115 = poo0Var3.c;
                                        String str1116 = poo0Var3.d;
                                        str1115.getClass();
                                        str1116.getClass();
                                        moo0Var = new poo0(str1115, str1116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var3 = (noo0) soo0Var;
                                        String str1117 = noo0Var3.c;
                                        String str1118 = noo0Var3.d;
                                        str1117.getClass();
                                        str1118.getClass();
                                        moo0Var = new noo0(str1117, str1118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var5 = (moo0) soo0Var;
                                        String str1119 = moo0Var5.c;
                                        String str212 = moo0Var5.d;
                                        str1119.getClass();
                                        str212.getClass();
                                        moo0Var = new moo0(str1119, str212, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else {
                                t9f.b();
                            }
                        } else if (soo0Var instanceof qoo0) {
                            int iOrdinal2 = k77Var.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == i7) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var7 = (ooo0) soo0Var;
                                    String str213 = ooo0Var7.c;
                                    String str214 = ooo0Var7.d;
                                    str213.getClass();
                                    str214.getClass();
                                    ooo0Var3 = new ooo0(str213, str214, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var5 = (qoo0) soo0Var;
                                        String str215 = qoo0Var5.c;
                                        String str216 = qoo0Var5.d;
                                        str215.getClass();
                                        str216.getClass();
                                        moo0Var = new qoo0(str215, str216, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var5 = (roo0) soo0Var;
                                        String str217 = roo0Var5.c;
                                        String str11110 = roo0Var5.d;
                                        str217.getClass();
                                        str11110.getClass();
                                        moo0Var = new roo0(str217, str11110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var6 = (koo0) soo0Var;
                                        String str11111 = koo0Var6.c;
                                        String str11112 = koo0Var6.d;
                                        str11111.getClass();
                                        str11112.getClass();
                                        moo0Var = new koo0(str11111, str11112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var7 = (loo0) soo0Var;
                                        String str11113 = loo0Var7.c;
                                        String str11114 = loo0Var7.d;
                                        str11113.getClass();
                                        str11114.getClass();
                                        moo0Var = new loo0(str11113, str11114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var4 = (poo0) soo0Var;
                                        String str11115 = poo0Var4.c;
                                        String str11116 = poo0Var4.d;
                                        str11115.getClass();
                                        str11116.getClass();
                                        moo0Var = new poo0(str11115, str11116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var4 = (noo0) soo0Var;
                                        String str11117 = noo0Var4.c;
                                        String str11118 = noo0Var4.d;
                                        str11117.getClass();
                                        str11118.getClass();
                                        moo0Var = new noo0(str11117, str11118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var6 = (moo0) soo0Var;
                                        String str11119 = moo0Var6.c;
                                        String str218 = moo0Var6.d;
                                        str11119.getClass();
                                        str218.getClass();
                                        moo0Var = new moo0(str11119, str218, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal2 == i8) {
                                sso0Var3 = xqo0.f41332a;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var8 = (ooo0) soo0Var;
                                    String str219 = ooo0Var8.c;
                                    String str2110 = ooo0Var8.d;
                                    str219.getClass();
                                    str2110.getClass();
                                    ooo0Var3 = new ooo0(str219, str2110, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var6 = (qoo0) soo0Var;
                                        String str2111 = qoo0Var6.c;
                                        String str2112 = qoo0Var6.d;
                                        str2111.getClass();
                                        str2112.getClass();
                                        moo0Var = new qoo0(str2111, str2112, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var6 = (roo0) soo0Var;
                                        String str2113 = roo0Var6.c;
                                        String str111110 = roo0Var6.d;
                                        str2113.getClass();
                                        str111110.getClass();
                                        moo0Var = new roo0(str2113, str111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var7 = (koo0) soo0Var;
                                        String str111111 = koo0Var7.c;
                                        String str111112 = koo0Var7.d;
                                        str111111.getClass();
                                        str111112.getClass();
                                        moo0Var = new koo0(str111111, str111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var8 = (loo0) soo0Var;
                                        String str111113 = loo0Var8.c;
                                        String str111114 = loo0Var8.d;
                                        str111113.getClass();
                                        str111114.getClass();
                                        moo0Var = new loo0(str111113, str111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var5 = (poo0) soo0Var;
                                        String str111115 = poo0Var5.c;
                                        String str111116 = poo0Var5.d;
                                        str111115.getClass();
                                        str111116.getClass();
                                        moo0Var = new poo0(str111115, str111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var5 = (noo0) soo0Var;
                                        String str111117 = noo0Var5.c;
                                        String str111118 = noo0Var5.d;
                                        str111117.getClass();
                                        str111118.getClass();
                                        moo0Var = new noo0(str111117, str111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var7 = (moo0) soo0Var;
                                        String str111119 = moo0Var7.c;
                                        String str2114 = moo0Var7.d;
                                        str111119.getClass();
                                        str2114.getClass();
                                        moo0Var = new moo0(str111119, str2114, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal2 == 4 || iOrdinal2 == 5) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var9 = (ooo0) soo0Var;
                                    String str2115 = ooo0Var9.c;
                                    String str2116 = ooo0Var9.d;
                                    str2115.getClass();
                                    str2116.getClass();
                                    ooo0Var3 = new ooo0(str2115, str2116, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var7 = (qoo0) soo0Var;
                                        String str2117 = qoo0Var7.c;
                                        String str2118 = qoo0Var7.d;
                                        str2117.getClass();
                                        str2118.getClass();
                                        moo0Var = new qoo0(str2117, str2118, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var7 = (roo0) soo0Var;
                                        String str2119 = roo0Var7.c;
                                        String str1111110 = roo0Var7.d;
                                        str2119.getClass();
                                        str1111110.getClass();
                                        moo0Var = new roo0(str2119, str1111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var8 = (koo0) soo0Var;
                                        String str1111111 = koo0Var8.c;
                                        String str1111112 = koo0Var8.d;
                                        str1111111.getClass();
                                        str1111112.getClass();
                                        moo0Var = new koo0(str1111111, str1111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var9 = (loo0) soo0Var;
                                        String str1111113 = loo0Var9.c;
                                        String str1111114 = loo0Var9.d;
                                        str1111113.getClass();
                                        str1111114.getClass();
                                        moo0Var = new loo0(str1111113, str1111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var6 = (poo0) soo0Var;
                                        String str1111115 = poo0Var6.c;
                                        String str1111116 = poo0Var6.d;
                                        str1111115.getClass();
                                        str1111116.getClass();
                                        moo0Var = new poo0(str1111115, str1111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var6 = (noo0) soo0Var;
                                        String str1111117 = noo0Var6.c;
                                        String str1111118 = noo0Var6.d;
                                        str1111117.getClass();
                                        str1111118.getClass();
                                        moo0Var = new noo0(str1111117, str1111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var8 = (moo0) soo0Var;
                                        String str1111119 = moo0Var8.c;
                                        String str21110 = moo0Var8.d;
                                        str1111119.getClass();
                                        str21110.getClass();
                                        moo0Var = new moo0(str1111119, str21110, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else {
                                t9f.b();
                            }
                        } else if (soo0Var instanceof roo0) {
                            int iOrdinal3 = k77Var.ordinal();
                            if (iOrdinal3 == 0 || iOrdinal3 == 1 || iOrdinal3 == i7) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var10 = (ooo0) soo0Var;
                                    String str21111 = ooo0Var10.c;
                                    String str21112 = ooo0Var10.d;
                                    str21111.getClass();
                                    str21112.getClass();
                                    ooo0Var3 = new ooo0(str21111, str21112, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var8 = (qoo0) soo0Var;
                                        String str21113 = qoo0Var8.c;
                                        String str21114 = qoo0Var8.d;
                                        str21113.getClass();
                                        str21114.getClass();
                                        moo0Var = new qoo0(str21113, str21114, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var8 = (roo0) soo0Var;
                                        String str21115 = roo0Var8.c;
                                        String str11111110 = roo0Var8.d;
                                        str21115.getClass();
                                        str11111110.getClass();
                                        moo0Var = new roo0(str21115, str11111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var9 = (koo0) soo0Var;
                                        String str11111111 = koo0Var9.c;
                                        String str11111112 = koo0Var9.d;
                                        str11111111.getClass();
                                        str11111112.getClass();
                                        moo0Var = new koo0(str11111111, str11111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var10 = (loo0) soo0Var;
                                        String str11111113 = loo0Var10.c;
                                        String str11111114 = loo0Var10.d;
                                        str11111113.getClass();
                                        str11111114.getClass();
                                        moo0Var = new loo0(str11111113, str11111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var7 = (poo0) soo0Var;
                                        String str11111115 = poo0Var7.c;
                                        String str11111116 = poo0Var7.d;
                                        str11111115.getClass();
                                        str11111116.getClass();
                                        moo0Var = new poo0(str11111115, str11111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var7 = (noo0) soo0Var;
                                        String str11111117 = noo0Var7.c;
                                        String str11111118 = noo0Var7.d;
                                        str11111117.getClass();
                                        str11111118.getClass();
                                        moo0Var = new noo0(str11111117, str11111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var9 = (moo0) soo0Var;
                                        String str11111119 = moo0Var9.c;
                                        String str21116 = moo0Var9.d;
                                        str11111119.getClass();
                                        str21116.getClass();
                                        moo0Var = new moo0(str11111119, str21116, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal3 == i8) {
                                sso0Var3 = ero0.f8292a;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var11 = (ooo0) soo0Var;
                                    String str21117 = ooo0Var11.c;
                                    String str21118 = ooo0Var11.d;
                                    str21117.getClass();
                                    str21118.getClass();
                                    ooo0Var3 = new ooo0(str21117, str21118, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var9 = (qoo0) soo0Var;
                                        String str21119 = qoo0Var9.c;
                                        String str211110 = qoo0Var9.d;
                                        str21119.getClass();
                                        str211110.getClass();
                                        moo0Var = new qoo0(str21119, str211110, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var9 = (roo0) soo0Var;
                                        String str211111 = roo0Var9.c;
                                        String str111111110 = roo0Var9.d;
                                        str211111.getClass();
                                        str111111110.getClass();
                                        moo0Var = new roo0(str211111, str111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var10 = (koo0) soo0Var;
                                        String str111111111 = koo0Var10.c;
                                        String str111111112 = koo0Var10.d;
                                        str111111111.getClass();
                                        str111111112.getClass();
                                        moo0Var = new koo0(str111111111, str111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var11 = (loo0) soo0Var;
                                        String str111111113 = loo0Var11.c;
                                        String str111111114 = loo0Var11.d;
                                        str111111113.getClass();
                                        str111111114.getClass();
                                        moo0Var = new loo0(str111111113, str111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var8 = (poo0) soo0Var;
                                        String str111111115 = poo0Var8.c;
                                        String str111111116 = poo0Var8.d;
                                        str111111115.getClass();
                                        str111111116.getClass();
                                        moo0Var = new poo0(str111111115, str111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var8 = (noo0) soo0Var;
                                        String str111111117 = noo0Var8.c;
                                        String str111111118 = noo0Var8.d;
                                        str111111117.getClass();
                                        str111111118.getClass();
                                        moo0Var = new noo0(str111111117, str111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var10 = (moo0) soo0Var;
                                        String str111111119 = moo0Var10.c;
                                        String str211112 = moo0Var10.d;
                                        str111111119.getClass();
                                        str211112.getClass();
                                        moo0Var = new moo0(str111111119, str211112, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal3 == 4 || iOrdinal3 == 5) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var12 = (ooo0) soo0Var;
                                    String str211113 = ooo0Var12.c;
                                    String str211114 = ooo0Var12.d;
                                    str211113.getClass();
                                    str211114.getClass();
                                    ooo0Var3 = new ooo0(str211113, str211114, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var10 = (qoo0) soo0Var;
                                        String str211115 = qoo0Var10.c;
                                        String str211116 = qoo0Var10.d;
                                        str211115.getClass();
                                        str211116.getClass();
                                        moo0Var = new qoo0(str211115, str211116, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var10 = (roo0) soo0Var;
                                        String str211117 = roo0Var10.c;
                                        String str1111111110 = roo0Var10.d;
                                        str211117.getClass();
                                        str1111111110.getClass();
                                        moo0Var = new roo0(str211117, str1111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var11 = (koo0) soo0Var;
                                        String str1111111111 = koo0Var11.c;
                                        String str1111111112 = koo0Var11.d;
                                        str1111111111.getClass();
                                        str1111111112.getClass();
                                        moo0Var = new koo0(str1111111111, str1111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var12 = (loo0) soo0Var;
                                        String str1111111113 = loo0Var12.c;
                                        String str1111111114 = loo0Var12.d;
                                        str1111111113.getClass();
                                        str1111111114.getClass();
                                        moo0Var = new loo0(str1111111113, str1111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var9 = (poo0) soo0Var;
                                        String str1111111115 = poo0Var9.c;
                                        String str1111111116 = poo0Var9.d;
                                        str1111111115.getClass();
                                        str1111111116.getClass();
                                        moo0Var = new poo0(str1111111115, str1111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var9 = (noo0) soo0Var;
                                        String str1111111117 = noo0Var9.c;
                                        String str1111111118 = noo0Var9.d;
                                        str1111111117.getClass();
                                        str1111111118.getClass();
                                        moo0Var = new noo0(str1111111117, str1111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var11 = (moo0) soo0Var;
                                        String str1111111119 = moo0Var11.c;
                                        String str211118 = moo0Var11.d;
                                        str1111111119.getClass();
                                        str211118.getClass();
                                        moo0Var = new moo0(str1111111119, str211118, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else {
                                t9f.b();
                            }
                        } else if (soo0Var instanceof koo0) {
                            int iOrdinal4 = k77Var.ordinal();
                            if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == i7) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var13 = (ooo0) soo0Var;
                                    String str211119 = ooo0Var13.c;
                                    String str2111110 = ooo0Var13.d;
                                    str211119.getClass();
                                    str2111110.getClass();
                                    ooo0Var3 = new ooo0(str211119, str2111110, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var11 = (qoo0) soo0Var;
                                        String str2111111 = qoo0Var11.c;
                                        String str2111112 = qoo0Var11.d;
                                        str2111111.getClass();
                                        str2111112.getClass();
                                        moo0Var = new qoo0(str2111111, str2111112, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var11 = (roo0) soo0Var;
                                        String str2111113 = roo0Var11.c;
                                        String str11111111110 = roo0Var11.d;
                                        str2111113.getClass();
                                        str11111111110.getClass();
                                        moo0Var = new roo0(str2111113, str11111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var12 = (koo0) soo0Var;
                                        String str11111111111 = koo0Var12.c;
                                        String str11111111112 = koo0Var12.d;
                                        str11111111111.getClass();
                                        str11111111112.getClass();
                                        moo0Var = new koo0(str11111111111, str11111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var13 = (loo0) soo0Var;
                                        String str11111111113 = loo0Var13.c;
                                        String str11111111114 = loo0Var13.d;
                                        str11111111113.getClass();
                                        str11111111114.getClass();
                                        moo0Var = new loo0(str11111111113, str11111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var10 = (poo0) soo0Var;
                                        String str11111111115 = poo0Var10.c;
                                        String str11111111116 = poo0Var10.d;
                                        str11111111115.getClass();
                                        str11111111116.getClass();
                                        moo0Var = new poo0(str11111111115, str11111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var10 = (noo0) soo0Var;
                                        String str11111111117 = noo0Var10.c;
                                        String str11111111118 = noo0Var10.d;
                                        str11111111117.getClass();
                                        str11111111118.getClass();
                                        moo0Var = new noo0(str11111111117, str11111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var12 = (moo0) soo0Var;
                                        String str11111111119 = moo0Var12.c;
                                        String str2111114 = moo0Var12.d;
                                        str11111111119.getClass();
                                        str2111114.getClass();
                                        moo0Var = new moo0(str11111111119, str2111114, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal4 == i8) {
                                sso0Var3 = gpo0.f11692a;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var14 = (ooo0) soo0Var;
                                    String str2111115 = ooo0Var14.c;
                                    String str2111116 = ooo0Var14.d;
                                    str2111115.getClass();
                                    str2111116.getClass();
                                    ooo0Var3 = new ooo0(str2111115, str2111116, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var12 = (qoo0) soo0Var;
                                        String str2111117 = qoo0Var12.c;
                                        String str2111118 = qoo0Var12.d;
                                        str2111117.getClass();
                                        str2111118.getClass();
                                        moo0Var = new qoo0(str2111117, str2111118, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var12 = (roo0) soo0Var;
                                        String str2111119 = roo0Var12.c;
                                        String str111111111110 = roo0Var12.d;
                                        str2111119.getClass();
                                        str111111111110.getClass();
                                        moo0Var = new roo0(str2111119, str111111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var13 = (koo0) soo0Var;
                                        String str111111111111 = koo0Var13.c;
                                        String str111111111112 = koo0Var13.d;
                                        str111111111111.getClass();
                                        str111111111112.getClass();
                                        moo0Var = new koo0(str111111111111, str111111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var14 = (loo0) soo0Var;
                                        String str111111111113 = loo0Var14.c;
                                        String str111111111114 = loo0Var14.d;
                                        str111111111113.getClass();
                                        str111111111114.getClass();
                                        moo0Var = new loo0(str111111111113, str111111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var11 = (poo0) soo0Var;
                                        String str111111111115 = poo0Var11.c;
                                        String str111111111116 = poo0Var11.d;
                                        str111111111115.getClass();
                                        str111111111116.getClass();
                                        moo0Var = new poo0(str111111111115, str111111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var11 = (noo0) soo0Var;
                                        String str111111111117 = noo0Var11.c;
                                        String str111111111118 = noo0Var11.d;
                                        str111111111117.getClass();
                                        str111111111118.getClass();
                                        moo0Var = new noo0(str111111111117, str111111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var13 = (moo0) soo0Var;
                                        String str111111111119 = moo0Var13.c;
                                        String str21111110 = moo0Var13.d;
                                        str111111111119.getClass();
                                        str21111110.getClass();
                                        moo0Var = new moo0(str111111111119, str21111110, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal4 == 4 || iOrdinal4 == 5) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var15 = (ooo0) soo0Var;
                                    String str21111111 = ooo0Var15.c;
                                    String str21111112 = ooo0Var15.d;
                                    str21111111.getClass();
                                    str21111112.getClass();
                                    ooo0Var3 = new ooo0(str21111111, str21111112, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var13 = (qoo0) soo0Var;
                                        String str21111113 = qoo0Var13.c;
                                        String str21111114 = qoo0Var13.d;
                                        str21111113.getClass();
                                        str21111114.getClass();
                                        moo0Var = new qoo0(str21111113, str21111114, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var13 = (roo0) soo0Var;
                                        String str21111115 = roo0Var13.c;
                                        String str1111111111110 = roo0Var13.d;
                                        str21111115.getClass();
                                        str1111111111110.getClass();
                                        moo0Var = new roo0(str21111115, str1111111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var14 = (koo0) soo0Var;
                                        String str1111111111111 = koo0Var14.c;
                                        String str1111111111112 = koo0Var14.d;
                                        str1111111111111.getClass();
                                        str1111111111112.getClass();
                                        moo0Var = new koo0(str1111111111111, str1111111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var15 = (loo0) soo0Var;
                                        String str1111111111113 = loo0Var15.c;
                                        String str1111111111114 = loo0Var15.d;
                                        str1111111111113.getClass();
                                        str1111111111114.getClass();
                                        moo0Var = new loo0(str1111111111113, str1111111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var12 = (poo0) soo0Var;
                                        String str1111111111115 = poo0Var12.c;
                                        String str1111111111116 = poo0Var12.d;
                                        str1111111111115.getClass();
                                        str1111111111116.getClass();
                                        moo0Var = new poo0(str1111111111115, str1111111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var12 = (noo0) soo0Var;
                                        String str1111111111117 = noo0Var12.c;
                                        String str1111111111118 = noo0Var12.d;
                                        str1111111111117.getClass();
                                        str1111111111118.getClass();
                                        moo0Var = new noo0(str1111111111117, str1111111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var14 = (moo0) soo0Var;
                                        String str1111111111119 = moo0Var14.c;
                                        String str21111116 = moo0Var14.d;
                                        str1111111111119.getClass();
                                        str21111116.getClass();
                                        moo0Var = new moo0(str1111111111119, str21111116, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else {
                                t9f.b();
                            }
                        } else if (soo0Var instanceof loo0) {
                            int iOrdinal5 = k77Var.ordinal();
                            if (iOrdinal5 == 0 || iOrdinal5 == 1 || iOrdinal5 == i7) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var16 = (ooo0) soo0Var;
                                    String str21111117 = ooo0Var16.c;
                                    String str21111118 = ooo0Var16.d;
                                    str21111117.getClass();
                                    str21111118.getClass();
                                    ooo0Var3 = new ooo0(str21111117, str21111118, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var14 = (qoo0) soo0Var;
                                        String str21111119 = qoo0Var14.c;
                                        String str211111110 = qoo0Var14.d;
                                        str21111119.getClass();
                                        str211111110.getClass();
                                        moo0Var = new qoo0(str21111119, str211111110, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var14 = (roo0) soo0Var;
                                        String str211111111 = roo0Var14.c;
                                        String str11111111111110 = roo0Var14.d;
                                        str211111111.getClass();
                                        str11111111111110.getClass();
                                        moo0Var = new roo0(str211111111, str11111111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var15 = (koo0) soo0Var;
                                        String str11111111111111 = koo0Var15.c;
                                        String str11111111111112 = koo0Var15.d;
                                        str11111111111111.getClass();
                                        str11111111111112.getClass();
                                        moo0Var = new koo0(str11111111111111, str11111111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var16 = (loo0) soo0Var;
                                        String str11111111111113 = loo0Var16.c;
                                        String str11111111111114 = loo0Var16.d;
                                        str11111111111113.getClass();
                                        str11111111111114.getClass();
                                        moo0Var = new loo0(str11111111111113, str11111111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var13 = (poo0) soo0Var;
                                        String str11111111111115 = poo0Var13.c;
                                        String str11111111111116 = poo0Var13.d;
                                        str11111111111115.getClass();
                                        str11111111111116.getClass();
                                        moo0Var = new poo0(str11111111111115, str11111111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var13 = (noo0) soo0Var;
                                        String str11111111111117 = noo0Var13.c;
                                        String str11111111111118 = noo0Var13.d;
                                        str11111111111117.getClass();
                                        str11111111111118.getClass();
                                        moo0Var = new noo0(str11111111111117, str11111111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var15 = (moo0) soo0Var;
                                        String str11111111111119 = moo0Var15.c;
                                        String str211111112 = moo0Var15.d;
                                        str11111111111119.getClass();
                                        str211111112.getClass();
                                        moo0Var = new moo0(str11111111111119, str211111112, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal5 == i8) {
                                sso0Var3 = zro0.f44866a;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var17 = (ooo0) soo0Var;
                                    String str211111113 = ooo0Var17.c;
                                    String str211111114 = ooo0Var17.d;
                                    str211111113.getClass();
                                    str211111114.getClass();
                                    ooo0Var3 = new ooo0(str211111113, str211111114, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var15 = (qoo0) soo0Var;
                                        String str211111115 = qoo0Var15.c;
                                        String str211111116 = qoo0Var15.d;
                                        str211111115.getClass();
                                        str211111116.getClass();
                                        moo0Var = new qoo0(str211111115, str211111116, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var15 = (roo0) soo0Var;
                                        String str211111117 = roo0Var15.c;
                                        String str111111111111110 = roo0Var15.d;
                                        str211111117.getClass();
                                        str111111111111110.getClass();
                                        moo0Var = new roo0(str211111117, str111111111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var16 = (koo0) soo0Var;
                                        String str111111111111111 = koo0Var16.c;
                                        String str111111111111112 = koo0Var16.d;
                                        str111111111111111.getClass();
                                        str111111111111112.getClass();
                                        moo0Var = new koo0(str111111111111111, str111111111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var17 = (loo0) soo0Var;
                                        String str111111111111113 = loo0Var17.c;
                                        String str111111111111114 = loo0Var17.d;
                                        str111111111111113.getClass();
                                        str111111111111114.getClass();
                                        moo0Var = new loo0(str111111111111113, str111111111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var14 = (poo0) soo0Var;
                                        String str111111111111115 = poo0Var14.c;
                                        String str111111111111116 = poo0Var14.d;
                                        str111111111111115.getClass();
                                        str111111111111116.getClass();
                                        moo0Var = new poo0(str111111111111115, str111111111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var14 = (noo0) soo0Var;
                                        String str111111111111117 = noo0Var14.c;
                                        String str111111111111118 = noo0Var14.d;
                                        str111111111111117.getClass();
                                        str111111111111118.getClass();
                                        moo0Var = new noo0(str111111111111117, str111111111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var16 = (moo0) soo0Var;
                                        String str111111111111119 = moo0Var16.c;
                                        String str211111118 = moo0Var16.d;
                                        str111111111111119.getClass();
                                        str211111118.getClass();
                                        moo0Var = new moo0(str111111111111119, str211111118, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (iOrdinal5 == 4 || iOrdinal5 == 5) {
                                sso0Var3 = soo0Var.b;
                                sso0Var = sso0Var3;
                                if (z5) {
                                    ooo0 ooo0Var18 = (ooo0) soo0Var;
                                    String str211111119 = ooo0Var18.c;
                                    String str2111111110 = ooo0Var18.d;
                                    str211111119.getClass();
                                    str2111111110.getClass();
                                    ooo0Var3 = new ooo0(str211111119, str2111111110, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var16 = (qoo0) soo0Var;
                                        String str2111111111 = qoo0Var16.c;
                                        String str2111111112 = qoo0Var16.d;
                                        str2111111111.getClass();
                                        str2111111112.getClass();
                                        moo0Var = new qoo0(str2111111111, str2111111112, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var16 = (roo0) soo0Var;
                                        String str2111111113 = roo0Var16.c;
                                        String str1111111111111110 = roo0Var16.d;
                                        str2111111113.getClass();
                                        str1111111111111110.getClass();
                                        moo0Var = new roo0(str2111111113, str1111111111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var17 = (koo0) soo0Var;
                                        String str1111111111111111 = koo0Var17.c;
                                        String str1111111111111112 = koo0Var17.d;
                                        str1111111111111111.getClass();
                                        str1111111111111112.getClass();
                                        moo0Var = new koo0(str1111111111111111, str1111111111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var18 = (loo0) soo0Var;
                                        String str1111111111111113 = loo0Var18.c;
                                        String str1111111111111114 = loo0Var18.d;
                                        str1111111111111113.getClass();
                                        str1111111111111114.getClass();
                                        moo0Var = new loo0(str1111111111111113, str1111111111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var15 = (poo0) soo0Var;
                                        String str1111111111111115 = poo0Var15.c;
                                        String str1111111111111116 = poo0Var15.d;
                                        str1111111111111115.getClass();
                                        str1111111111111116.getClass();
                                        moo0Var = new poo0(str1111111111111115, str1111111111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var15 = (noo0) soo0Var;
                                        String str1111111111111117 = noo0Var15.c;
                                        String str1111111111111118 = noo0Var15.d;
                                        str1111111111111117.getClass();
                                        str1111111111111118.getClass();
                                        moo0Var = new noo0(str1111111111111117, str1111111111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var17 = (moo0) soo0Var;
                                        String str1111111111111119 = moo0Var17.c;
                                        String str2111111114 = moo0Var17.d;
                                        str1111111111111119.getClass();
                                        str2111111114.getClass();
                                        moo0Var = new moo0(str1111111111111119, str2111111114, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else {
                                t9f.b();
                            }
                        } else {
                            boolean z6 = soo0Var instanceof poo0;
                            sso0Var = hqo0.f13494a;
                            if (z6) {
                                int iOrdinal6 = k77Var.ordinal();
                                if (iOrdinal6 != 0 && iOrdinal6 != 1 && iOrdinal6 != i7) {
                                    i8 = 3;
                                    if (iOrdinal6 != 3) {
                                        if (iOrdinal6 != 4 && iOrdinal6 != 5) {
                                            t9f.b();
                                        }
                                    } else if (z5) {
                                        ooo0 ooo0Var19 = (ooo0) soo0Var;
                                        String str2111111115 = ooo0Var19.c;
                                        String str2111111116 = ooo0Var19.d;
                                        str2111111115.getClass();
                                        str2111111116.getClass();
                                        ooo0Var3 = new ooo0(str2111111115, str2111111116, sso0Var);
                                    } else {
                                        if (soo0Var instanceof qoo0) {
                                            qoo0 qoo0Var17 = (qoo0) soo0Var;
                                            String str2111111117 = qoo0Var17.c;
                                            String str2111111118 = qoo0Var17.d;
                                            str2111111117.getClass();
                                            str2111111118.getClass();
                                            moo0Var = new qoo0(str2111111117, str2111111118, sso0Var);
                                        } else if (soo0Var instanceof roo0) {
                                            roo0 roo0Var17 = (roo0) soo0Var;
                                            String str2111111119 = roo0Var17.c;
                                            String str11111111111111110 = roo0Var17.d;
                                            str2111111119.getClass();
                                            str11111111111111110.getClass();
                                            moo0Var = new roo0(str2111111119, str11111111111111110, sso0Var);
                                        } else if (soo0Var instanceof koo0) {
                                            koo0 koo0Var18 = (koo0) soo0Var;
                                            String str11111111111111111 = koo0Var18.c;
                                            String str11111111111111112 = koo0Var18.d;
                                            str11111111111111111.getClass();
                                            str11111111111111112.getClass();
                                            moo0Var = new koo0(str11111111111111111, str11111111111111112, sso0Var);
                                        } else if (soo0Var instanceof loo0) {
                                            loo0 loo0Var19 = (loo0) soo0Var;
                                            String str11111111111111113 = loo0Var19.c;
                                            String str11111111111111114 = loo0Var19.d;
                                            str11111111111111113.getClass();
                                            str11111111111111114.getClass();
                                            moo0Var = new loo0(str11111111111111113, str11111111111111114, sso0Var);
                                        } else if (soo0Var instanceof poo0) {
                                            poo0 poo0Var16 = (poo0) soo0Var;
                                            String str11111111111111115 = poo0Var16.c;
                                            String str11111111111111116 = poo0Var16.d;
                                            str11111111111111115.getClass();
                                            str11111111111111116.getClass();
                                            moo0Var = new poo0(str11111111111111115, str11111111111111116, sso0Var);
                                        } else if (soo0Var instanceof noo0) {
                                            noo0 noo0Var16 = (noo0) soo0Var;
                                            String str11111111111111117 = noo0Var16.c;
                                            String str11111111111111118 = noo0Var16.d;
                                            str11111111111111117.getClass();
                                            str11111111111111118.getClass();
                                            moo0Var = new noo0(str11111111111111117, str11111111111111118, sso0Var);
                                        } else if (soo0Var instanceof moo0) {
                                            moo0 moo0Var18 = (moo0) soo0Var;
                                            String str11111111111111119 = moo0Var18.c;
                                            String str21111111110 = moo0Var18.d;
                                            str11111111111111119.getClass();
                                            str21111111110.getClass();
                                            moo0Var = new moo0(str11111111111111119, str21111111110, sso0Var);
                                        } else {
                                            t9f.b();
                                        }
                                        ooo0Var3 = moo0Var;
                                    }
                                }
                                sso0Var2 = soo0Var.b;
                                sso0Var = sso0Var2;
                                i8 = 3;
                                if (z5) {
                                    ooo0 ooo0Var110 = (ooo0) soo0Var;
                                    String str21111111111 = ooo0Var110.c;
                                    String str21111111112 = ooo0Var110.d;
                                    str21111111111.getClass();
                                    str21111111112.getClass();
                                    ooo0Var3 = new ooo0(str21111111111, str21111111112, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var18 = (qoo0) soo0Var;
                                        String str21111111113 = qoo0Var18.c;
                                        String str21111111114 = qoo0Var18.d;
                                        str21111111113.getClass();
                                        str21111111114.getClass();
                                        moo0Var = new qoo0(str21111111113, str21111111114, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var18 = (roo0) soo0Var;
                                        String str21111111115 = roo0Var18.c;
                                        String str111111111111111110 = roo0Var18.d;
                                        str21111111115.getClass();
                                        str111111111111111110.getClass();
                                        moo0Var = new roo0(str21111111115, str111111111111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var19 = (koo0) soo0Var;
                                        String str111111111111111111 = koo0Var19.c;
                                        String str111111111111111112 = koo0Var19.d;
                                        str111111111111111111.getClass();
                                        str111111111111111112.getClass();
                                        moo0Var = new koo0(str111111111111111111, str111111111111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var110 = (loo0) soo0Var;
                                        String str111111111111111113 = loo0Var110.c;
                                        String str111111111111111114 = loo0Var110.d;
                                        str111111111111111113.getClass();
                                        str111111111111111114.getClass();
                                        moo0Var = new loo0(str111111111111111113, str111111111111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var17 = (poo0) soo0Var;
                                        String str111111111111111115 = poo0Var17.c;
                                        String str111111111111111116 = poo0Var17.d;
                                        str111111111111111115.getClass();
                                        str111111111111111116.getClass();
                                        moo0Var = new poo0(str111111111111111115, str111111111111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var17 = (noo0) soo0Var;
                                        String str111111111111111117 = noo0Var17.c;
                                        String str111111111111111118 = noo0Var17.d;
                                        str111111111111111117.getClass();
                                        str111111111111111118.getClass();
                                        moo0Var = new noo0(str111111111111111117, str111111111111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var19 = (moo0) soo0Var;
                                        String str111111111111111119 = moo0Var19.c;
                                        String str21111111116 = moo0Var19.d;
                                        str111111111111111119.getClass();
                                        str21111111116.getClass();
                                        moo0Var = new moo0(str111111111111111119, str21111111116, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (soo0Var instanceof noo0) {
                                int iOrdinal7 = k77Var.ordinal();
                                if (iOrdinal7 != 0 && iOrdinal7 != 1 && iOrdinal7 != i7) {
                                    i8 = 3;
                                    if (iOrdinal7 != 3) {
                                        if (iOrdinal7 != 4 && iOrdinal7 != 5) {
                                            t9f.b();
                                        }
                                    } else if (z5) {
                                        ooo0 ooo0Var111 = (ooo0) soo0Var;
                                        String str21111111117 = ooo0Var111.c;
                                        String str21111111118 = ooo0Var111.d;
                                        str21111111117.getClass();
                                        str21111111118.getClass();
                                        ooo0Var3 = new ooo0(str21111111117, str21111111118, sso0Var);
                                    } else {
                                        if (soo0Var instanceof qoo0) {
                                            qoo0 qoo0Var19 = (qoo0) soo0Var;
                                            String str21111111119 = qoo0Var19.c;
                                            String str211111111110 = qoo0Var19.d;
                                            str21111111119.getClass();
                                            str211111111110.getClass();
                                            moo0Var = new qoo0(str21111111119, str211111111110, sso0Var);
                                        } else if (soo0Var instanceof roo0) {
                                            roo0 roo0Var19 = (roo0) soo0Var;
                                            String str211111111111 = roo0Var19.c;
                                            String str1111111111111111110 = roo0Var19.d;
                                            str211111111111.getClass();
                                            str1111111111111111110.getClass();
                                            moo0Var = new roo0(str211111111111, str1111111111111111110, sso0Var);
                                        } else if (soo0Var instanceof koo0) {
                                            koo0 koo0Var110 = (koo0) soo0Var;
                                            String str1111111111111111111 = koo0Var110.c;
                                            String str1111111111111111112 = koo0Var110.d;
                                            str1111111111111111111.getClass();
                                            str1111111111111111112.getClass();
                                            moo0Var = new koo0(str1111111111111111111, str1111111111111111112, sso0Var);
                                        } else if (soo0Var instanceof loo0) {
                                            loo0 loo0Var111 = (loo0) soo0Var;
                                            String str1111111111111111113 = loo0Var111.c;
                                            String str1111111111111111114 = loo0Var111.d;
                                            str1111111111111111113.getClass();
                                            str1111111111111111114.getClass();
                                            moo0Var = new loo0(str1111111111111111113, str1111111111111111114, sso0Var);
                                        } else if (soo0Var instanceof poo0) {
                                            poo0 poo0Var18 = (poo0) soo0Var;
                                            String str1111111111111111115 = poo0Var18.c;
                                            String str1111111111111111116 = poo0Var18.d;
                                            str1111111111111111115.getClass();
                                            str1111111111111111116.getClass();
                                            moo0Var = new poo0(str1111111111111111115, str1111111111111111116, sso0Var);
                                        } else if (soo0Var instanceof noo0) {
                                            noo0 noo0Var18 = (noo0) soo0Var;
                                            String str1111111111111111117 = noo0Var18.c;
                                            String str1111111111111111118 = noo0Var18.d;
                                            str1111111111111111117.getClass();
                                            str1111111111111111118.getClass();
                                            moo0Var = new noo0(str1111111111111111117, str1111111111111111118, sso0Var);
                                        } else if (soo0Var instanceof moo0) {
                                            moo0 moo0Var110 = (moo0) soo0Var;
                                            String str1111111111111111119 = moo0Var110.c;
                                            String str211111111112 = moo0Var110.d;
                                            str1111111111111111119.getClass();
                                            str211111111112.getClass();
                                            moo0Var = new moo0(str1111111111111111119, str211111111112, sso0Var);
                                        } else {
                                            t9f.b();
                                        }
                                        ooo0Var3 = moo0Var;
                                    }
                                }
                                sso0Var2 = soo0Var.b;
                                sso0Var = sso0Var2;
                                i8 = 3;
                                if (z5) {
                                    ooo0 ooo0Var112 = (ooo0) soo0Var;
                                    String str211111111113 = ooo0Var112.c;
                                    String str211111111114 = ooo0Var112.d;
                                    str211111111113.getClass();
                                    str211111111114.getClass();
                                    ooo0Var3 = new ooo0(str211111111113, str211111111114, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var110 = (qoo0) soo0Var;
                                        String str211111111115 = qoo0Var110.c;
                                        String str211111111116 = qoo0Var110.d;
                                        str211111111115.getClass();
                                        str211111111116.getClass();
                                        moo0Var = new qoo0(str211111111115, str211111111116, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var110 = (roo0) soo0Var;
                                        String str211111111117 = roo0Var110.c;
                                        String str11111111111111111110 = roo0Var110.d;
                                        str211111111117.getClass();
                                        str11111111111111111110.getClass();
                                        moo0Var = new roo0(str211111111117, str11111111111111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var111 = (koo0) soo0Var;
                                        String str11111111111111111111 = koo0Var111.c;
                                        String str11111111111111111112 = koo0Var111.d;
                                        str11111111111111111111.getClass();
                                        str11111111111111111112.getClass();
                                        moo0Var = new koo0(str11111111111111111111, str11111111111111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var112 = (loo0) soo0Var;
                                        String str11111111111111111113 = loo0Var112.c;
                                        String str11111111111111111114 = loo0Var112.d;
                                        str11111111111111111113.getClass();
                                        str11111111111111111114.getClass();
                                        moo0Var = new loo0(str11111111111111111113, str11111111111111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var19 = (poo0) soo0Var;
                                        String str11111111111111111115 = poo0Var19.c;
                                        String str11111111111111111116 = poo0Var19.d;
                                        str11111111111111111115.getClass();
                                        str11111111111111111116.getClass();
                                        moo0Var = new poo0(str11111111111111111115, str11111111111111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var19 = (noo0) soo0Var;
                                        String str11111111111111111117 = noo0Var19.c;
                                        String str11111111111111111118 = noo0Var19.d;
                                        str11111111111111111117.getClass();
                                        str11111111111111111118.getClass();
                                        moo0Var = new noo0(str11111111111111111117, str11111111111111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var111 = (moo0) soo0Var;
                                        String str11111111111111111119 = moo0Var111.c;
                                        String str211111111118 = moo0Var111.d;
                                        str11111111111111111119.getClass();
                                        str211111111118.getClass();
                                        moo0Var = new moo0(str11111111111111111119, str211111111118, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else if (soo0Var instanceof moo0) {
                                int iOrdinal8 = k77Var.ordinal();
                                if (iOrdinal8 == 0 || iOrdinal8 == 1 || iOrdinal8 == i7) {
                                    i8 = 3;
                                } else {
                                    i8 = 3;
                                    if (iOrdinal8 != 3) {
                                        if (iOrdinal8 != 4 && iOrdinal8 != 5) {
                                            t9f.b();
                                        }
                                    } else if (z5) {
                                        ooo0 ooo0Var113 = (ooo0) soo0Var;
                                        String str211111111119 = ooo0Var113.c;
                                        String str2111111111110 = ooo0Var113.d;
                                        str211111111119.getClass();
                                        str2111111111110.getClass();
                                        ooo0Var3 = new ooo0(str211111111119, str2111111111110, sso0Var);
                                    } else {
                                        if (soo0Var instanceof qoo0) {
                                            qoo0 qoo0Var111 = (qoo0) soo0Var;
                                            String str2111111111111 = qoo0Var111.c;
                                            String str2111111111112 = qoo0Var111.d;
                                            str2111111111111.getClass();
                                            str2111111111112.getClass();
                                            moo0Var = new qoo0(str2111111111111, str2111111111112, sso0Var);
                                        } else if (soo0Var instanceof roo0) {
                                            roo0 roo0Var111 = (roo0) soo0Var;
                                            String str2111111111113 = roo0Var111.c;
                                            String str111111111111111111110 = roo0Var111.d;
                                            str2111111111113.getClass();
                                            str111111111111111111110.getClass();
                                            moo0Var = new roo0(str2111111111113, str111111111111111111110, sso0Var);
                                        } else if (soo0Var instanceof koo0) {
                                            koo0 koo0Var112 = (koo0) soo0Var;
                                            String str111111111111111111111 = koo0Var112.c;
                                            String str111111111111111111112 = koo0Var112.d;
                                            str111111111111111111111.getClass();
                                            str111111111111111111112.getClass();
                                            moo0Var = new koo0(str111111111111111111111, str111111111111111111112, sso0Var);
                                        } else if (soo0Var instanceof loo0) {
                                            loo0 loo0Var113 = (loo0) soo0Var;
                                            String str111111111111111111113 = loo0Var113.c;
                                            String str111111111111111111114 = loo0Var113.d;
                                            str111111111111111111113.getClass();
                                            str111111111111111111114.getClass();
                                            moo0Var = new loo0(str111111111111111111113, str111111111111111111114, sso0Var);
                                        } else if (soo0Var instanceof poo0) {
                                            poo0 poo0Var110 = (poo0) soo0Var;
                                            String str111111111111111111115 = poo0Var110.c;
                                            String str111111111111111111116 = poo0Var110.d;
                                            str111111111111111111115.getClass();
                                            str111111111111111111116.getClass();
                                            moo0Var = new poo0(str111111111111111111115, str111111111111111111116, sso0Var);
                                        } else if (soo0Var instanceof noo0) {
                                            noo0 noo0Var110 = (noo0) soo0Var;
                                            String str111111111111111111117 = noo0Var110.c;
                                            String str111111111111111111118 = noo0Var110.d;
                                            str111111111111111111117.getClass();
                                            str111111111111111111118.getClass();
                                            moo0Var = new noo0(str111111111111111111117, str111111111111111111118, sso0Var);
                                        } else if (soo0Var instanceof moo0) {
                                            moo0 moo0Var112 = (moo0) soo0Var;
                                            String str111111111111111111119 = moo0Var112.c;
                                            String str2111111111114 = moo0Var112.d;
                                            str111111111111111111119.getClass();
                                            str2111111111114.getClass();
                                            moo0Var = new moo0(str111111111111111111119, str2111111111114, sso0Var);
                                        } else {
                                            t9f.b();
                                        }
                                        ooo0Var3 = moo0Var;
                                    }
                                }
                                sso0Var = soo0Var.b;
                                if (z5) {
                                    ooo0 ooo0Var114 = (ooo0) soo0Var;
                                    String str2111111111115 = ooo0Var114.c;
                                    String str2111111111116 = ooo0Var114.d;
                                    str2111111111115.getClass();
                                    str2111111111116.getClass();
                                    ooo0Var3 = new ooo0(str2111111111115, str2111111111116, sso0Var);
                                } else {
                                    if (soo0Var instanceof qoo0) {
                                        qoo0 qoo0Var112 = (qoo0) soo0Var;
                                        String str2111111111117 = qoo0Var112.c;
                                        String str2111111111118 = qoo0Var112.d;
                                        str2111111111117.getClass();
                                        str2111111111118.getClass();
                                        moo0Var = new qoo0(str2111111111117, str2111111111118, sso0Var);
                                    } else if (soo0Var instanceof roo0) {
                                        roo0 roo0Var112 = (roo0) soo0Var;
                                        String str2111111111119 = roo0Var112.c;
                                        String str1111111111111111111110 = roo0Var112.d;
                                        str2111111111119.getClass();
                                        str1111111111111111111110.getClass();
                                        moo0Var = new roo0(str2111111111119, str1111111111111111111110, sso0Var);
                                    } else if (soo0Var instanceof koo0) {
                                        koo0 koo0Var113 = (koo0) soo0Var;
                                        String str1111111111111111111111 = koo0Var113.c;
                                        String str1111111111111111111112 = koo0Var113.d;
                                        str1111111111111111111111.getClass();
                                        str1111111111111111111112.getClass();
                                        moo0Var = new koo0(str1111111111111111111111, str1111111111111111111112, sso0Var);
                                    } else if (soo0Var instanceof loo0) {
                                        loo0 loo0Var114 = (loo0) soo0Var;
                                        String str1111111111111111111113 = loo0Var114.c;
                                        String str1111111111111111111114 = loo0Var114.d;
                                        str1111111111111111111113.getClass();
                                        str1111111111111111111114.getClass();
                                        moo0Var = new loo0(str1111111111111111111113, str1111111111111111111114, sso0Var);
                                    } else if (soo0Var instanceof poo0) {
                                        poo0 poo0Var111 = (poo0) soo0Var;
                                        String str1111111111111111111115 = poo0Var111.c;
                                        String str1111111111111111111116 = poo0Var111.d;
                                        str1111111111111111111115.getClass();
                                        str1111111111111111111116.getClass();
                                        moo0Var = new poo0(str1111111111111111111115, str1111111111111111111116, sso0Var);
                                    } else if (soo0Var instanceof noo0) {
                                        noo0 noo0Var111 = (noo0) soo0Var;
                                        String str1111111111111111111117 = noo0Var111.c;
                                        String str1111111111111111111118 = noo0Var111.d;
                                        str1111111111111111111117.getClass();
                                        str1111111111111111111118.getClass();
                                        moo0Var = new noo0(str1111111111111111111117, str1111111111111111111118, sso0Var);
                                    } else if (soo0Var instanceof moo0) {
                                        moo0 moo0Var113 = (moo0) soo0Var;
                                        String str1111111111111111111119 = moo0Var113.c;
                                        String str21111111111110 = moo0Var113.d;
                                        str1111111111111111111119.getClass();
                                        str21111111111110.getClass();
                                        moo0Var = new moo0(str1111111111111111111119, str21111111111110, sso0Var);
                                    } else {
                                        t9f.b();
                                    }
                                    ooo0Var3 = moo0Var;
                                }
                            } else {
                                t9f.b();
                            }
                        }
                        return null;
                    }
                    arrayList4.add(ooo0Var3);
                    i7 = 2;
                    i5 = 4;
                }
                ik7 ik7Var = new ik7(str4, strQ, dyb.r0(arrayList4), lmc.a0(kzvVar), k77Var == k77.TABS_AND_ACCORDEON ? z4 : false);
                j3w j3wVar = new j3w(lsm0Var5.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0)), kzvVar.i);
                double d3 = kzvVar.L;
                double d4 = kzvVar.f;
                String strA7 = lsm0Var5.a(d3 < d4 ? R.string.history_bet_rate_partially_sold : R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var = pn40.f27267a;
                double d5 = d4 - kzvVar.E;
                p3u0 p3u0Var = p3u0.c;
                String strC = pn40.c(d5, p3u0Var);
                e3w e3wVar = e3w.f7156a;
                f3w f3wVar = new f3w("", strA7, strC, str2, e3wVar);
                f3w f3wVar2 = new f3w("", lsm0Var5.a(R.string.current_sum_with_colon, Arrays.copyOf(new Object[0], 0)), pn40.c(dDoubleValue, p3u0Var), str2, e3wVar);
                String strA8 = lsm0Var5.a(R.string.credited_to_account_with_sum_new, Arrays.copyOf(new Object[0], 0));
                Double dValueOf = d == -1.0d ? null : Double.valueOf(d);
                if (dValueOf != null) {
                    dDoubleValue = dValueOf.doubleValue();
                }
                kb90 kb90Var = new kb90(strA8, pn40.c(dDoubleValue, p3u0Var), str2);
                String strD = pn40.d(d2, str2, p3u0Var);
                return new wj7(ik7Var, j3wVar, f3wVar, f3wVar2, kb90Var, cy7.c() ? ua80.i("\u200e", strD, Separators.SP, StringsKt.v0(lsm0Var5.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{""}, 1))).toString()) : lsm0Var5.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{strD}, 1)), u1c.y(a5wVar) ? new nro(vcc.J(kzvVar, ctf0Var)) : oro.f25743a);
            case 3:
                cc8 cc8Var = (cc8) obj;
                cc8Var.getClass();
                ctf0Var.getClass();
                a4x<BonusAccountUiModel> a4xVar = cc8Var.f4097a;
                BonusAccountUiModel.Slots slots = BonusAccountUiModel.Slots.f47316a;
                if (a4xVar.contains(slots)) {
                    strA2 = ctf0Var.b.a(R.string.cases_casino, Arrays.copyOf(new Object[0], 0));
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : a4xVar) {
                        if (obj4 instanceof BonusAccountUiModel.Games) {
                            arrayList5.add(obj4);
                        }
                    }
                    BonusAccountUiModel.Games games = (BonusAccountUiModel.Games) CollectionsKt.firstOrNull(arrayList5);
                    String str30 = games != null ? games.f47315a : null;
                    if (str30 != null) {
                        strA2 = str30;
                    }
                }
                lsm0 lsm0Var6 = ctf0Var.b;
                String strA9 = lsm0Var6.a(R.string.bonus_account, Arrays.copyOf(new Object[0], 0));
                String strA10 = lsm0Var6.a(R.string.bonus_account_description_mask_v2, Arrays.copyOf(new Object[]{strA2}, 1));
                ArrayList arrayList6 = new ArrayList(r3d.q(a4xVar, 10));
                for (BonusAccountUiModel bonusAccountUiModel : a4xVar) {
                    if (bonusAccountUiModel instanceof BonusAccountUiModel.Games) {
                        xb8Var = new xb8(bonusAccountUiModel, R.drawable.ic_glyph_games, lsm0Var6.a(R.string.navigate_to_v2, Arrays.copyOf(new Object[]{((BonusAccountUiModel.Games) bonusAccountUiModel).f47315a}, 1)), lsm0Var6.a(R.string.uses_bonus_account, Arrays.copyOf(new Object[0], 0)));
                    } else {
                        if (!Intrinsics.d(bonusAccountUiModel, slots)) {
                            t9f.b();
                            return null;
                        }
                        xb8Var = new xb8(bonusAccountUiModel, R.drawable.ic_glyph_cards, lsm0Var6.a(R.string.navigate_to_v2, Arrays.copyOf(new Object[]{lsm0Var6.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0))}, 1)), lsm0Var6.a(R.string.uses_bonus_account, Arrays.copyOf(new Object[0], 0)));
                    }
                    arrayList6.add(xb8Var);
                }
                return new dc8(dyb.o0(arrayList6), strA9, strA10);
            case 4:
                df8 df8Var = (df8) obj;
                df8Var.getClass();
                ctf0Var.getClass();
                xuz xuzVar = pb10.c;
                mdm mdmVar = new mdm(R.string.lottie_main_error, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 0L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                id50 id50Var = new id50(new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new plm(ctf0Var.b.a(R.string.promo_bonus_games_title, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)), fa50.f9191a), fmm.f9790a, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), false, null));
                boolean z7 = df8Var.f5986a;
                mdm mdmVar2 = df8Var.g;
                mdm mdmVar3 = df8Var.f;
                if (z7) {
                    return new gf8(id50Var);
                }
                boolean z8 = df8Var.c;
                if ((z8 && mdmVar3 != null) || mdmVar2 != null) {
                    if (mdmVar3 == null) {
                        mdmVar3 = mdmVar;
                    }
                    return new ff8(id50Var, mdmVar3, mdmVar2);
                }
                if (!z8) {
                    if (mdmVar3 == null) {
                        mdmVar3 = mdmVar;
                    }
                    return new ff8(id50Var, mdmVar3, mdmVar2);
                }
                List list6 = df8Var.e;
                ArrayList arrayList7 = new ArrayList(r3d.q(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((ke8) it3.next()).f18141a);
                }
                a4x a4xVarO1 = dyb.o0(arrayList7);
                return new ef8(id50Var, !a4xVarO1.isEmpty() ? new ftr(a4xVarO1) : new gtr(true));
            case 5:
                nl8 nl8Var = (nl8) obj;
                nl8Var.getClass();
                int i9 = nl8Var.b;
                ctf0Var.getClass();
                boolean z9 = nl8Var.c;
                boolean z10 = nl8Var.d;
                mdm mdmVar4 = nl8Var.e;
                List list7 = nl8Var.f23715a;
                ArrayList arrayList8 = new ArrayList(r3d.q(list7, 10));
                Iterator it4 = list7.iterator();
                while (it4.hasNext()) {
                    ak8 ak8Var = (ak8) it4.next();
                    boolean z11 = nl8Var.f;
                    ak8Var.getClass();
                    int i10 = ak8Var.f1010a;
                    double d6 = ak8Var.e;
                    int i11 = ak8Var.f1010a;
                    nl8 nl8Var2 = nl8Var;
                    String str31 = ak8Var.b;
                    String strConcat = ctf0Var.f(R.string.expires, new Object[i4]).concat(" %s");
                    boolean z12 = z9;
                    long j = ak8Var.h;
                    String strA11 = ctf0Var.b.a(R.string.bonus_balance, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var2 = pn40.f27267a;
                    double d7 = ak8Var.g;
                    p3u0 p3u0Var2 = p3u0.c;
                    String strC2 = pn40.c(d7, p3u0Var2);
                    ctf0 ctf0Var2 = ctf0Var;
                    double d8 = ak8Var.d;
                    Iterator it5 = it4;
                    String str32 = ak8Var.i;
                    String strL = kng0.l(strC2, Separators.SP, "/ ".concat(pn40.d(d8, str32, p3u0Var2)));
                    String strC3 = pn40.c(d6, p3u0Var2);
                    double d9 = ak8Var.f;
                    String strConcat2 = "/ ".concat(pn40.d(d9, str32, p3u0Var2));
                    int i12 = d9 > 0.0d ? (int) ((d6 / d9) * 100.0d) : 0;
                    if (z11) {
                        ql8Var = new ol8(i9 == i10, ak8Var.j == 10);
                    } else if (ak8Var.c == 6) {
                        ql8Var = new ql8(i9 == i10);
                    } else {
                        ql8Var = pl8.f27171a;
                    }
                    arrayList8.add(new sl8(i11, str31, strConcat, j, strA11, strL, strC3, strConcat2, i12, ql8Var));
                    nl8Var = nl8Var2;
                    z9 = z12;
                    ctf0Var = ctf0Var2;
                    it4 = it5;
                    i4 = 0;
                }
                return new wl8(arrayList8, z9, z10, mdmVar4);
            case 6:
                jw8 jw8Var = (jw8) obj;
                jw8Var.getClass();
                return new nw8(jw8Var, ctf0Var);
            case 7:
                yx8 yx8Var = (yx8) obj;
                yx8Var.getClass();
                return new by8(yx8Var, ctf0Var);
            case 8:
                cz8 cz8Var = (cz8) obj;
                cz8Var.getClass();
                return new ez8(cz8Var, ctf0Var);
            case 9:
                zz8 zz8Var = (zz8) obj;
                zz8Var.getClass();
                return new b09(zz8Var, ctf0Var);
            case 10:
                x19 x19Var = (x19) obj;
                x19Var.getClass();
                return new z19(x19Var, ctf0Var);
            case 11:
                if (((Boolean) obj).booleanValue()) {
                    return ctf0Var.b.a(R.string.no_data, Arrays.copyOf(new Object[0], 0));
                }
                return null;
            case 12:
                o79 o79Var = (o79) obj;
                o79Var.getClass();
                return new ee2(o79Var, ctf0Var);
            case 13:
                ((gsa) obj).getClass();
                return new m72(ctf0Var, (byte) 8);
            case 14:
                lua luaVar = (lua) obj;
                luaVar.getClass();
                ctf0Var.getClass();
                String strA12 = ctf0Var.b.a(R.string.cards_info_title, Arrays.copyOf(new Object[0], 0));
                pz40 pz40Var = s6t0.f31722a;
                imm immVar = new imm(klm.f18497a, new plm(strA12, s6t0.b().f33626a.getSecondary(), fa50Var), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                List list8 = luaVar.f;
                List list9 = luaVar.d;
                List list10 = luaVar.e;
                List list11 = luaVar.c;
                if (list8 == null) {
                    return new mua(immVar, lak0.c, false, gq80.d0(ctf0Var, false, false), true);
                }
                if (luaVar.g) {
                    ArrayList arrayList9 = new ArrayList(r3d.q(list11, 10));
                    int i13 = 0;
                    for (Object obj5 : list11) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            q3d.p();
                            throw null;
                        }
                        dja djaVar = (dja) obj5;
                        arrayList9.add(vbw0.b0(djaVar, ctf0Var, i13, list11.size(), list10.contains(djaVar)));
                        i13 = i14;
                    }
                    return new mua(immVar, dyb.o0(arrayList9), !list11.equals(list9), gq80.d0(ctf0Var, false, true), false);
                }
                ArrayList arrayList10 = new ArrayList(r3d.q(list11, 10));
                int i15 = 0;
                for (Object obj6 : list11) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        q3d.p();
                        throw null;
                    }
                    dja djaVar2 = (dja) obj6;
                    arrayList10.add(vbw0.b0(djaVar2, ctf0Var, i15, list11.size(), list10.contains(djaVar2)));
                    i15 = i16;
                }
                return new mua(immVar, dyb.o0(arrayList10), !list11.equals(list9), gq80.d0(ctf0Var, !list11.equals(list8), false), false);
            case 15:
                ((p5b) obj).getClass();
                return new m72(ctf0Var, (byte) 9);
            case 16:
                vrb vrbVar = (vrb) obj;
                vrbVar.getClass();
                ctf0Var.getClass();
                fsb fsbVar = vrbVar.f;
                String strA13 = fsbVar.equals(csb.f4880a) ? ctf0Var.b.a(R.string.enter_pin_code_empty_error, Arrays.copyOf(new Object[0], 0)) : fsbVar.equals(dsb.f6605a) ? ctf0Var.b.a(R.string.wrong_pin_code_error, Arrays.copyOf(new Object[0], 0)) : "";
                boolean zEquals = fsbVar.equals(asb.f1382a);
                esb esbVar = esb.f8321a;
                if (zEquals) {
                    strA = ctf0Var.b.a(R.string.enter_pin_code_length_error_v2, Arrays.copyOf(new Object[]{4}, 1));
                } else if (fsbVar.equals(esbVar)) {
                    strA = ctf0Var.b.a(R.string.pin_codes_not_matches_error, Arrays.copyOf(new Object[0], 0));
                } else {
                    strA = fsbVar.equals(zrb.f44844a) ? ctf0Var.b.a(R.string.pin_codes_same_error, Arrays.copyOf(new Object[0], 0)) : "";
                }
                if (fsbVar.equals(yrb.f43113a)) {
                    strA2 = ctf0Var.b.a(R.string.enter_pin_code_length_error_v2, Arrays.copyOf(new Object[]{4}, 1));
                } else if (fsbVar.equals(esbVar)) {
                    strA2 = ctf0Var.b.a(R.string.pin_codes_not_matches_error, Arrays.copyOf(new Object[0], 0));
                }
                pz40 pz40Var2 = s6t0.f31722a;
                ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                lsm0 lsm0Var7 = ctf0Var.b;
                imm immVar2 = new imm(ilmVar, new plm(lsm0Var7.a(R.string.change_pin_code_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50Var), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, new y3d(s6t0.b().f33626a.getSeparator60()));
                String str33 = vrbVar.c;
                a6q0 a6q0Var = new a6q0(true, false);
                int length = strA13.length();
                t7q0 s7q0Var = r7q0.f29989a;
                t7q0 s7q0Var2 = length > 0 ? new s7q0(strA13) : s7q0Var;
                boolean z13 = strA13.length() > 0;
                String strA14 = lsm0Var7.a(R.string.enter_old_pin_code, Arrays.copyOf(new Object[0], 0));
                e6q0 e6q0Var = e6q0.f7299a;
                i6q0 i6q0Var = i6q0.f14254a;
                c6q0 c6q0Var = new c6q0(str33, e6q0Var, i6q0Var, s7q0Var2, true, z13, a6q0Var, strA14, null, false, 0, "0123456789", 212224);
                c6q0 c6q0Var2 = new c6q0(vrbVar.d, e6q0Var, i6q0Var, strA.length() > 0 ? new s7q0(strA) : s7q0Var, true, strA.length() > 0, new a6q0(true, true), lsm0Var7.a(R.string.enter_new_pin_code, Arrays.copyOf(new Object[0], 0)), null, false, 0, "0123456789", 212224);
                String str34 = vrbVar.e;
                a6q0 a6q0Var2 = new a6q0(true, true);
                if (strA2.length() > 0) {
                    s7q0Var = new s7q0(strA2);
                }
                return new wrb(immVar2, c6q0Var, c6q0Var2, new c6q0(str34, e6q0Var, i6q0Var, s7q0Var, true, strA2.length() > 0, a6q0Var2, lsm0Var7.a(R.string.enter_new_pin_code_again, Arrays.copyOf(new Object[0], 0)), null, true, 0, "0123456789", 210176), new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var7.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0))), vrbVar.f37892a, false, true), rk.r))), vrbVar.b);
            case 17:
                return a(obj);
            case 18:
                afc afcVar = (afc) obj;
                afcVar.getClass();
                ctf0Var.getClass();
                pz40 pz40Var3 = s6t0.f31722a;
                imm immVar3 = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.login_and_pass, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50Var), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                List<d1q0> list12 = afcVar.f771a;
                ArrayList arrayList11 = new ArrayList(r3d.q(list12, 10));
                for (d1q0 d1q0Var : list12) {
                    arrayList11.add(new e1q0(d1q0Var.f5322a, d1q0Var.b));
                }
                return new gfc(immVar3, dyb.o0(arrayList11));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                jic jicVar = (jic) obj;
                jicVar.getClass();
                ctf0Var.getClass();
                String strA15 = ctf0Var.b.a(R.string.bets_on_players_choose_subgame_title, Arrays.copyOf(new Object[0], 0));
                ArrayList<uvm0> arrayList12 = jicVar.f16567a;
                ArrayList arrayList13 = new ArrayList(r3d.q(arrayList12, 10));
                for (uvm0 uvm0Var : arrayList12) {
                    long j2 = uvm0Var.f36357a;
                    boolean z14 = j2 == jicVar.b;
                    String str35 = uvm0Var.d;
                    if (str35 == null) {
                        str35 = "";
                    }
                    arrayList13.add(new twm0(str35, j2, z14));
                }
                return new kic(dyb.o0(arrayList13), strA15);
            case 20:
                ((onc) obj).getClass();
                return new m72(ctf0Var, (byte) 10);
            case 21:
                ((hsc) obj).getClass();
                return new m72(ctf0Var, (byte) 11);
            case 22:
                l2f l2fVar = (l2f) obj;
                l2fVar.getClass();
                return new t2f(l2fVar, ctf0Var);
            case 23:
                return b(obj);
            case 24:
                return c(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return g(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return h(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return i(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return l(obj);
            default:
                long jLongValue = ((Long) obj).longValue();
                aal aalVar = aal.TOTAL_VALUE;
                if (jLongValue == 1) {
                    return ctf0Var.b.a(R.string.lol_statistic_tab, Arrays.copyOf(new Object[0], 0));
                }
                if (jLongValue == 2) {
                    return ctf0Var.b.a(R.string.cyber_game_dota_hero_items, Arrays.copyOf(new Object[0], 0));
                }
                return jLongValue == 3 ? ctf0Var.b.a(R.string.cyber_game_dota_hero_talent_tab, Arrays.copyOf(new Object[0], 0)) : "";
        }
    }
}
