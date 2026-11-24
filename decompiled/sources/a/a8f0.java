package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a8f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f422a = 1;
    public final /* synthetic */ bzt b;
    public final /* synthetic */ ctf0 c;

    public /* synthetic */ a8f0(bzt bztVar, ctf0 ctf0Var) {
        this.b = bztVar;
        this.c = ctf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d8f0 d8f0Var;
        String strA;
        long primary;
        int i;
        y0b y0bVar;
        char c;
        Object obj2;
        r0i0 q0i0Var;
        char c2;
        byte b = this.f422a;
        ctf0 ctf0Var = this.c;
        bzt bztVar = this.b;
        switch (b) {
            case 0:
                y7f0 y7f0Var = (y7f0) obj;
                y7f0Var.getClass();
                boolean z = bztVar.f3488a.a().C;
                ctf0Var.getClass();
                List<q7f0> list = y7f0Var.f42149a;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (q7f0 q7f0Var : list) {
                    q7f0 q7f0Var2 = q7f0.REGULATOR;
                    int iK = R.drawable.ic_reg_import_personal_data_new;
                    if (q7f0Var == q7f0Var2) {
                        String strA2 = ctf0Var.b.a(R.string.reg_import_personal_data, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        d8f0Var = new d8f0(q7f0Var, p7x.p(strA2, R.drawable.ic_reg_import_personal_data_new, z ? StaticColors.INSTANCE.m121getTransparent0d7_KjU() : s6t0.b().f33626a.getPrimary(), z ? new y3d(CustomColors.INSTANCE.m42getItsme0d7_KjU()) : null));
                    } else {
                        Integer num = y7f0Var.b;
                        int iOrdinal = q7f0Var.ordinal();
                        if (iOrdinal == 0) {
                            strA = ctf0Var.b.a(R.string.registration_by_email, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal == 1) {
                            strA = ctf0Var.b.a(R.string.registration_by_phone, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal == 2) {
                            strA = ctf0Var.b.a(R.string.one_click_registration_new, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (iOrdinal != 3) {
                                if (iOrdinal == 4) {
                                    strA = ctf0Var.b.a(R.string.reg_import_personal_data, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            if (num != null) {
                                int iIntValue = num.intValue();
                                if (iIntValue == 1) {
                                    i = R.string.social_vk_label;
                                } else if (iIntValue == 5) {
                                    i = R.string.social_ok_label;
                                } else if (iIntValue == 7) {
                                    i = R.string.social_yandex_label;
                                } else if (iIntValue == 9) {
                                    i = R.string.social_mailru_label_new;
                                } else if (iIntValue == 11) {
                                    i = R.string.social_google;
                                } else if (iIntValue == 13) {
                                    i = R.string.social_x_label;
                                } else if (iIntValue == 17) {
                                    i = R.string.social_telegram;
                                } else if (iIntValue == 19) {
                                    i = R.string.social_apple_id;
                                } else if (iIntValue != 26) {
                                    i = iIntValue != 31 ? -1 : R.string.social_discord;
                                } else {
                                    i = R.string.social_its_me;
                                }
                                lsm0 lsm0Var = ctf0Var.b;
                                strA = lsm0Var.a(R.string.registration_networks_one_v2, Arrays.copyOf(new Object[]{lsm0Var.a(i, Arrays.copyOf(new Object[0], 0))}, 1));
                            } else {
                                strA = ctf0Var.b.a(R.string.social_networks_new, Arrays.copyOf(new Object[0], 0));
                            }
                        }
                        int iOrdinal2 = q7f0Var.ordinal();
                        if (iOrdinal2 == 0) {
                            iK = R.drawable.ic_reg_email;
                        } else if (iOrdinal2 == 1) {
                            iK = R.drawable.ic_reg_phone_new;
                        } else if (iOrdinal2 == 2) {
                            iK = R.drawable.ic_reg_one_click_new;
                        } else if (iOrdinal2 == 3) {
                            iK = num != null ? xvw.K(num.intValue()) : R.drawable.ic_reg_social_network_new;
                        } else if (iOrdinal2 != 4) {
                            t9f.b();
                            return null;
                        }
                        if (q7f0Var != q7f0.SOCIAL || num == null) {
                            pz40 pz40Var2 = s6t0.f31722a;
                            primary = s6t0.b().f33626a.getPrimary();
                        } else {
                            pz40 pz40Var3 = s6t0.f31722a;
                            primary = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                        }
                        d8f0Var = new d8f0(q7f0Var, p7x.p(strA, iK, primary, null));
                    }
                    arrayList.add(d8f0Var);
                }
                boolean zIsEmpty = arrayList.isEmpty();
                lsm0 lsm0Var2 = ctf0Var.b;
                return new z7f0(zIsEmpty, lsm0Var2.a(R.string.registration, Arrays.copyOf(new Object[0], 0)), new v7f0(dyb.o0(arrayList), new ww00(lsm0Var2.a(R.string.already_have_an_account, Arrays.copyOf(new Object[0], 0)), new wul(qul.e, oe9.c, new ue9(lsm0Var2.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, false))));
            default:
                s0i0 s0i0Var = (s0i0) obj;
                s0i0Var.getClass();
                ctf0Var.getClass();
                boolean z2 = s0i0Var.e;
                Long l = s0i0Var.b;
                if (z2) {
                    return new v0i0(true);
                }
                if (l == null || (y0bVar = s0i0Var.c) == y0b.NO_CASHBACK) {
                    if (!s0i0Var.f) {
                        return new v0i0(false);
                    }
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.g;
                    int i2 = bztVar.f3488a.a().r;
                    xuzVar.getClass();
                    return new u0i0(new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                toc0 toc0Var = s0i0Var.f31409a;
                lc00 lc00VarB = kotlin.collections.a.b();
                if (toc0Var.p) {
                    y0b y0bVar2 = y0b.PROMO;
                    String strA3 = ctf0Var.b.a(R.string.cashback_promo_title, Arrays.copyOf(new Object[0], 0));
                    StringBuilder sb = new StringBuilder(ujn.h);
                    if (StringsKt.O("/static/img/android/actions/cashback_percent/promo_banner.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/actions/cashback_percent/promo_banner.webp", "https://", false)) {
                        c = '/';
                        sb.setLength(0);
                        sb.append("/static/img/android/actions/cashback_percent/promo_banner.webp");
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        c = '/';
                        sb.append(StringsKt.y0("/static/img/android/actions/cashback_percent/promo_banner.webp", '/'));
                    }
                    lc00VarB.add(new axa(y0bVar2, strA3, new n0x(sb.toString()), y0bVar == y0bVar2, false));
                } else {
                    c = '/';
                }
                if (toc0Var.o) {
                    y0b y0bVar3 = y0b.PERCENT;
                    String strA4 = ctf0Var.b.a(R.string.cashback_percent_title, Arrays.copyOf(new Object[0], 0));
                    StringBuilder sb2 = new StringBuilder(ujn.h);
                    if (StringsKt.O("/static/img/android/actions/cashback_percent/percent_banner_android.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/actions/cashback_percent/percent_banner_android.webp", "https://", false)) {
                        sb2.setLength(0);
                        sb2.append("/static/img/android/actions/cashback_percent/percent_banner_android.webp");
                    } else {
                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                            c2 = c;
                        } else {
                            c2 = c;
                            sb2.append(c2);
                        }
                        sb2.append(StringsKt.y0("/static/img/android/actions/cashback_percent/percent_banner_android.webp", c2));
                    }
                    lc00VarB.add(new axa(y0bVar3, strA4, new n0x(sb2.toString()), y0bVar == y0bVar3, false));
                }
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                boolean z3 = lc00VarA.b() > 1;
                ArrayList arrayList2 = new ArrayList(r3d.q(lc00VarA, 10));
                ListIterator listIterator = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        a4x a4xVarO0 = dyb.o0(arrayList2);
                        long jLongValue = l.longValue();
                        if (lc00VarA.b() > 1) {
                            q0i0Var = o0i0.f24426a;
                        } else {
                            ListIterator listIterator2 = lc00VarA.listIterator(0);
                            while (true) {
                                paw pawVar2 = (paw) listIterator2;
                                if (pawVar2.hasNext()) {
                                    Object next = pawVar2.next();
                                    if (!((axa) next).d) {
                                        obj2 = next;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            axa axaVar = (axa) obj2;
                            q0i0Var = axaVar != null ? new q0i0(axaVar.f1614a.f41797a) : p0i0.f26152a;
                        }
                        return new t0i0(a4xVarO0, jLongValue, q0i0Var);
                    }
                    axa axaVar2 = (axa) pawVar.next();
                    y0b y0bVar4 = axaVar2.f1614a;
                    String str = axaVar2.b;
                    o0x o0xVar = axaVar2.c;
                    boolean z4 = axaVar2.d;
                    str.getClass();
                    arrayList2.add(new axa(y0bVar4, str, o0xVar, z4, z3));
                }
                break;
        }
    }

    public /* synthetic */ a8f0(ctf0 ctf0Var, bzt bztVar) {
        this.c = ctf0Var;
        this.b = bztVar;
    }
}
