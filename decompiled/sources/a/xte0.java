package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.AFInAppEventParameterName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class xte0 {
    public static final Map l = xp20.f(new Pair(u0f0.k, "email"), new Pair(u0f0.f34852a, "name"), new Pair(u0f0.c, "surname"), new Pair(u0f0.f, "city"), new Pair(u0f0.d, "country"), new Pair(u0f0.i, "currency"), new Pair(u0f0.l, ParameterNames.PASSWORD), new Pair(u0f0.n, "password2"), new Pair(u0f0.u, "promocode"), new Pair(u0f0.g, "birth_date"), new Pair(u0f0.j, "social_network"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je f41463a;
    public final nr b;
    public final zg c;
    public final au0 d;
    public final b4j e;
    public final s64 f;
    public final nvu g;
    public final sv3 h;
    public final yuu i;
    public final pru j;
    public final yu00 k;

    public xte0(je jeVar, nr nrVar, zg zgVar, au0 au0Var, b4j b4jVar, s64 s64Var, nvu nvuVar, sv3 sv3Var, xuz xuzVar, yuu yuuVar, pru pruVar, yu00 yu00Var) {
        sv3Var.getClass();
        this.f41463a = jeVar;
        this.b = nrVar;
        this.c = zgVar;
        this.d = au0Var;
        this.e = b4jVar;
        this.f = s64Var;
        this.g = nvuVar;
        this.h = sv3Var;
        this.i = yuuVar;
        this.j = pruVar;
        this.k = yu00Var;
    }

    public static String a(q7f0 q7f0Var) {
        int iOrdinal = q7f0Var.ordinal();
        if (iOrdinal == 0) {
            return "registration_by_mail";
        }
        if (iOrdinal == 1) {
            return "registration_by_phone";
        }
        if (iOrdinal == 2) {
            return "registration_one_click";
        }
        if (iOrdinal == 3) {
            return "registration_social_networks";
        }
        if (iOrdinal == 4) {
            return "registration_its_me";
        }
        t9f.b();
        return null;
    }

    public static String b(q7f0 q7f0Var) {
        int iOrdinal = q7f0Var.ordinal();
        if (iOrdinal == 0) {
            return "full";
        }
        if (iOrdinal == 1) {
            return "phone";
        }
        if (iOrdinal == 2) {
            return "one_click";
        }
        if (iOrdinal == 3) {
            return "social_media";
        }
        if (iOrdinal == 4) {
            return "itsme";
        }
        t9f.b();
        return null;
    }

    public static String e(q7f0 q7f0Var) {
        int iOrdinal = q7f0Var.ordinal();
        if (iOrdinal == 0) {
            return "полная регистрация";
        }
        if (iOrdinal == 1) {
            return "быстрая регистрация";
        }
        if (iOrdinal == 2) {
            return "в один клик";
        }
        if (iOrdinal == 3) {
            return "социальные сети";
        }
        if (iOrdinal == 4) {
            return "импорт данных";
        }
        t9f.b();
        return null;
    }

    public final void c(ArrayList arrayList, List list) {
        list.getClass();
        Map mapF = xp20.f(new Pair("regTypes", CollectionsKt.b0(arrayList, Separators.COMMA, null, null, null, 62)), new Pair("regTypesOrdering", CollectionsKt.b0(list, Separators.COMMA, null, null, null, 62)));
        ((rny) this.k.f43245a).a("REG_TYPE_MATCH_FAILED", m8x.n0(mapF));
    }

    public final void d(ldt0 ldt0Var, int i, int i2, String str, int i3) {
        long j;
        s1p s1pVar = this.f.f31684a;
        int iOrdinal = ldt0Var.ordinal();
        if (iOrdinal == 0) {
            j = 3023;
        } else if (iOrdinal == 1) {
            j = 3024;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            j = 3025;
        }
        s1pVar.a(tx3.l0(new k1p[]{new i1p(i3, (byte) 2), new i1p(i2, (byte) 0), new i1p(i, (byte) 1), new j1p(str, (byte) 0)}), j);
    }

    public final void f(q7f0 q7f0Var) {
        String strA = a(q7f0Var);
        this.c.e(strA);
        this.d.h(strA);
    }

    public final void g(zhi0 zhi0Var, q7f0 q7f0Var) {
        int errorCode = zhi0Var.c.getErrorCode();
        String strB = b(q7f0Var);
        String strValueOf = String.valueOf(errorCode);
        strValueOf.getClass();
        ((kt2) this.b.b).a("reg_error", xp20.f(new Pair("error_code", strValueOf), new Pair("option", strB)));
        this.f41463a.f16351a.a(tx3.l0(new k1p[]{new i1p(errorCode, (byte) 2), new j1p(strB, (byte) 0)}), 3031L);
    }

    public final void h() {
        this.e.f1961a.c("reg_privacy_call");
        this.f41463a.f16351a.a(xun.f41520a, 11005L);
    }

    public final void i() {
        this.e.f1961a.c("reg_rules_call");
        this.f41463a.f16351a.a(xun.f41520a, 3022L);
    }

    public final void j(q7f0 q7f0Var) {
        String strB = b(q7f0Var);
        i8i.D("option", strB, (kt2) this.b.b, "reg_leave_back");
        b1j.v(strB, this.f41463a.f16351a, 12238L);
    }

    public final void k(q7f0 q7f0Var, boolean z) {
        String strB = b(q7f0Var);
        String str = z ? "cancel" : "break";
        ((kt2) this.b.b).a("reg_leave_allert_click", xp20.f(new Pair("option", strB), new Pair("action", str)));
        this.f41463a.f16351a.a(tx3.l0(new k1p[]{new j1p(strB, (byte) 0), new j1p(str, (byte) 1)}), 12239L);
    }

    public final void l(boolean z, Map map, q7f0 q7f0Var) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        String strB = b(q7f0Var);
        Set<u0f0> setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (u0f0 u0f0Var : setKeySet) {
            String str = vte0.f38003a[u0f0Var.ordinal()] == 1 ? z ? "phone_code" : "phone_number" : (String) l.get(u0f0Var);
            if (str != null) {
                arrayList.add(str);
            }
        }
        String strB0 = CollectionsKt.b0(arrayList, Separators.COMMA, null, null, null, 62);
        if (strB0.length() > 0) {
            ((kt2) this.b.b).a("reg_page_data_error", xp20.f(new Pair("option", strB), new Pair("field", strB0)));
            this.f41463a.f16351a.a(tx3.l0(new k1p[]{new j1p(strB0, (byte) 0), new j1p(strB, (byte) 1)}), 3030L);
        }
    }

    public final void m() {
        ((kt2) this.b.b).c("reg_itsme_call");
        this.f41463a.f16351a.a(xun.f41520a, 12346L);
    }

    public final void n(int i, int i2, String str, int i3, int i4, q7f0 q7f0Var) {
        kt2 kt2Var = (kt2) this.b.b;
        int iOrdinal = q7f0Var.ordinal();
        byte b = q7f0Var.f28247a;
        if (iOrdinal == 0) {
            kt2Var.a("reg_full_call", xp20.f(new Pair("country_id", Integer.valueOf(i)), new Pair("currency_id", Long.valueOf(i2)), new Pair("reg_type", Integer.valueOf(b)), new Pair("promocode", str)));
            d(ldt0.c, i, i2, str, i3);
            return;
        }
        if (iOrdinal == 1) {
            kt2Var.a("reg_phone_call", xp20.f(new Pair("country_id", Integer.valueOf(i)), new Pair("currency_id", Long.valueOf(i2)), new Pair("reg_type", Integer.valueOf(b)), new Pair("promocode", str)));
            d(ldt0.b, i, i2, str, i3);
            return;
        }
        if (iOrdinal == 2) {
            kt2Var.a("reg_one_call", xp20.f(new Pair("country_id", Integer.valueOf(i)), new Pair("currency_id", Long.valueOf(i2)), new Pair("reg_type", Integer.valueOf(b)), new Pair("promocode", str)));
            d(ldt0.f19869a, i, i2, str, i3);
        } else if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return;
            }
            t9f.b();
        } else {
            String strF = zjb.F(i4);
            gne0 gne0Var = q7f0.b;
            kt2Var.a("reg_social_call", xp20.f(new Pair("social_media", strF), new Pair("country_id", Integer.valueOf(i)), new Pair("currency_id", Long.valueOf(i2)), new Pair("reg_type", 4), new Pair("promocode", str)));
            this.f41463a.f16351a.a(tx3.l0(new k1p[]{new i1p(i3, (byte) 2), new i1p(i2, (byte) 0), new i1p(i, (byte) 1), new j1p(str, (byte) 0), new j1p(zjb.F(i4), (byte) 1)}), 3026L);
        }
    }

    public final void o(q7f0 q7f0Var, long j) {
        if (j == 0) {
            return;
        }
        String strA = a(q7f0Var);
        this.c.d(strA);
        this.d.g(strA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object p(long j, String str, String str2, String str3, String str4, String str5, Integer num, q7f0 q7f0Var, String str6, String str7, String str8, String str9, zje zjeVar) {
        wte0 wte0Var;
        Object obj;
        sv3 sv3Var;
        float f;
        String str10;
        String str11;
        String str12;
        long j2;
        String str13;
        q7f0 q7f0Var2;
        String str14;
        String str15;
        String str16;
        if (zjeVar instanceof wte0) {
            wte0Var = (wte0) zjeVar;
            int i = wte0Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                wte0Var.s = i - Integer.MIN_VALUE;
            } else {
                wte0Var = new wte0(this, zjeVar);
            }
        } else {
            wte0Var = new wte0(this, zjeVar);
        }
        Object obj2 = wte0Var.q;
        wne wneVar = wne.f39444a;
        int i2 = wte0Var.s;
        sv3 sv3Var2 = this.h;
        if (i2 == 0) {
            obj = null;
            z1x.P(obj2);
            this.e.f1961a.a("registration", wp20.b(new Pair(Payload.TYPE, e(q7f0Var))));
            String strB = b(q7f0Var);
            int iIntValue = num != null ? num.intValue() : 0;
            str8.getClass();
            nr nrVar = this.b;
            kt2 kt2Var = (kt2) nrVar.b;
            Pair pair = new Pair("id_user", Long.valueOf(j));
            Pair pair2 = new Pair("af_id", ((knf0) nrVar.c).a());
            ((peg0) nrVar.d).i();
            sv3Var = sv3Var2;
            kt2Var.a("reg_done", xp20.f(pair, pair2, new Pair("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC"), new Pair("auth_notifications_shown", Integer.valueOf(iIntValue)), new Pair("point", str8), new Pair("option", strB), new Pair("opened_from_auth_notification", Boolean.valueOf(iIntValue != 0))));
            int iIntValue2 = num != null ? num.intValue() : 0;
            int iOrdinal = q7f0Var.ordinal();
            if (iOrdinal == 0) {
                f = 3.0f;
            } else if (iOrdinal == 1) {
                f = 2.0f;
            } else if (iOrdinal == 2) {
                f = 1.0f;
            } else if (iOrdinal == 3) {
                f = 4.0f;
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                f = 5.0f;
            }
            str2.getClass();
            str9.getClass();
            this.f.f31684a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new i1p(iIntValue2, (byte) 0), new i1p(iIntValue2 != 0 ? 1 : 0, (byte) 1), new j1p(str8, (byte) 0), new j1p(str9, (byte) 1), new j1p(str2, (byte) 2), new h1p(f, (byte) 0)}), 3032L);
            this.g.M(j);
            ((rv3) sv3Var).e(j);
            boolean z = this.j.a().N0;
            wte0Var.j = str;
            str10 = str3;
            wte0Var.k = str10;
            str11 = str4;
            wte0Var.l = str11;
            str12 = str5;
            wte0Var.m = str12;
            wte0Var.n = q7f0Var;
            wte0Var.o = str6;
            wte0Var.p = str7;
            wte0Var.i = j;
            wte0Var.s = 1;
            if (this.i.q(j, wte0Var, str, z) == wneVar) {
                return wneVar;
            }
            j2 = j;
            str13 = str;
            q7f0Var2 = q7f0Var;
            str14 = str6;
            str15 = str7;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = wte0Var.i;
            str15 = wte0Var.p;
            str14 = wte0Var.o;
            q7f0Var2 = wte0Var.n;
            String str17 = wte0Var.m;
            String str18 = wte0Var.l;
            obj = null;
            String str19 = wte0Var.k;
            str13 = wte0Var.j;
            z1x.P(obj2);
            sv3Var = sv3Var2;
            str12 = str17;
            str10 = str19;
            str11 = str18;
        }
        jo20 jo20Var = new jo20();
        jo20Var.put("af_customer_id", Long.valueOf(j2));
        int iOrdinal2 = q7f0Var2.ordinal();
        if (iOrdinal2 == 0) {
            str16 = "full";
        } else if (iOrdinal2 == 1) {
            str16 = "phone";
        } else if (iOrdinal2 == 2) {
            str16 = "one_click";
        } else if (iOrdinal2 == 3) {
            str16 = "social";
        } else {
            if (iOrdinal2 != 4) {
                t9f.b();
                return obj;
            }
            str16 = "import data";
        }
        jo20Var.put(AFInAppEventParameterName.REGISTRATION_METHOD, str16);
        jo20Var.put("country", str10);
        jo20Var.put("currency", str11);
        jo20Var.put("bonus_type", str12);
        jo20Var.put("promo_code", str13);
        if (str14.length() > 0) {
            jo20Var.put("app_type", str14);
        }
        if (str15.length() > 0 && str14.length() > 0) {
            jo20Var.put("event_value", str15);
        }
        ((rv3) sv3Var).f("registration", jo20Var.b());
        e(q7f0Var2);
        return Unit.f46060a;
    }

    public final void q() {
        ((kt2) this.b.b).c("reg_existing_error");
    }
}
