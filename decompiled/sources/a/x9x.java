package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x9x {
    public static final void A(mm40 mm40Var, ytm ytmVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        String str = ytmVar.m;
        String str2 = ytmVar.l;
        fetVar2.g0(-220135583);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(ytmVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            c280 c280Var = ytmVar.e;
            String str3 = ytmVar.f43225a;
            c280 c280Var2 = ytmVar.f;
            String str4 = ytmVar.g;
            boolean z = ytmVar.b;
            String str5 = ytmVar.c;
            p(0, ytmVar.d, ytmVar.j, fetVar, c280Var, c280Var2, str3, str4, str5, ytmVar.i, z, ytmVar.h);
            fetVar2 = fetVar;
            if (str2.length() <= 0 && str.length() <= 0 && ytmVar.k.length() <= 0) {
                fetVar2.e0(-1264290217);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1264517974);
                sj3.p(6, 0, fetVar2, jm40.b, ytmVar.k, str2, str);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) ytmVar, i, (byte) 3);
        }
    }

    public static final void B(mm40 mm40Var, String str, jx6 jx6Var, fet fetVar, int i) {
        mm40 mm40Var2;
        long secondary60;
        jm40 jm40Var;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-545802412);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.e(jx6Var.ordinal()) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int iOrdinal = jx6Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar2.e0(-654156411);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarE = g1t0.e();
                if (jx6Var == jx6.b) {
                    fetVar2.e0(-653979711);
                    secondary60 = ((ThemeColors) fetVar2.k(zaq0.b)).getWarning();
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-653901219);
                    secondary60 = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60();
                    fetVar2.r(false);
                }
                jm40Var = jm40Var2;
                v8q0.a(str, null, secondary60, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarE, fetVar2, (i2 >> 3) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
                z = true;
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(810179504, fetVar2, false);
                }
                fetVar2.e0(-653658055);
                mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var2, 128.0f), 12.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar2, 0, 1), fetVar2, false);
                jm40Var = jm40Var2;
                z = true;
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var2, (Object) str, (Object) jx6Var, i, (byte) 19);
        }
    }

    public static final yae0 C(s5k0 s5k0Var) {
        s5k0Var.getClass();
        return new yae0(s5k0Var);
    }

    public static final zae0 D(emk0 emk0Var) {
        emk0Var.getClass();
        return new zae0(emk0Var);
    }

    public static final xw00 E(ctf0 ctf0Var) {
        f9x f9xVar = new f9x(ctf0Var.b.a(R.string.call_to_auth, Arrays.copyOf(new Object[0], 0)), true);
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        lsm0 lsm0Var = ctf0Var.b;
        return new xw00(f9xVar, new wul(nulVar, oe9Var, new ue9(lsm0Var.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(iul.e, oe9Var, new ue9(lsm0Var.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true));
    }

    public static final float F(c5n0 c5n0Var, i43 i43Var, k43 k43Var) {
        zcl zclVar = qmk.f28987a;
        float fW0 = c5n0Var.w0(k43Var.f().a().f) + c5n0Var.w0(2.0f);
        return i43Var.o == k6z.b ? fW0 * (-1.0f) : fW0;
    }

    public static final mm40 G(float f, float f2, float f3, float f4) {
        float f5 = f4 - f3;
        float f6 = f3 / 2.0f;
        ycl yclVar = new ycl((f * f4) - f6);
        zcl zclVar = qmk.f28987a;
        return ffb0.Q(jm40.b, ((ycl) l1e0.h(yclVar, new ycl(0.0f), new ycl(f5))).f42389a, ((ycl) l1e0.h(new ycl((f4 * f2) - f6), new ycl(0.0f), new ycl(f5))).f42389a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final bv9 H(esy esyVar, boolean z) {
        hfy hfyVar;
        bv9 qv9Var;
        bv9 rmxVar;
        boolean zM;
        osy osyVarU = esyVar.u();
        boolean zR = xvw.R(osyVarU);
        dqy dqyVar = osyVarU.f;
        if (zR) {
            return ddq0.f5908a;
        }
        ihy ihyVar = osyVarU.c;
        if (z) {
            dqyVar.getClass();
            hfyVar = j0x.v(dqyVar).c;
        } else {
            dqyVar.getClass();
            hfyVar = j0x.v(dqyVar).d;
        }
        Method methodB = hfyVar != null ? ihyVar.B(hfyVar.b, hfyVar.c) : null;
        byte b = 2;
        int i = 6;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        if (methodB == null) {
            if (gnm0.p(osyVarU) && osyVarU.getVisibility() == viy.c) {
                Class clsV = gnm0.v(((hre0) CollectionsKt.v0(osyVarU.getParameters())).p());
                if (clsV == null) {
                    throw new poe("Underlying property of inline class " + osyVarU + " should have a field");
                }
                Method methodL = gnm0.l(clsV, osyVarU);
                rmxVar = fre0.W(esyVar) ? new rmx(methodL, fre0.P(esyVar.u())) : new smx(methodL);
            } else {
                Field fieldY = osyVarU.y();
                if (fieldY == null) {
                    ohq.u(osyVarU, "No accessors or field is found for property ");
                    return null;
                }
                boolean z3 = true;
                if ((ihyVar instanceof xgy) && ((xgy) ihyVar).V() == rlc.COMPANION_OBJECT) {
                    Class<?> enclosingClass = azw.G((sgy) ihyVar).getEnclosingClass();
                    enclosingClass.getClass();
                    sgy sgyVarB = sre0.f32672a.b(enclosingClass);
                    xgy xgyVar = sgyVarB instanceof xgy ? (xgy) sgyVarB : null;
                    if (xgyVar == null) {
                        zM = false;
                    } else if (xgyVar.V() == rlc.INTERFACE || xgyVar.V() == rlc.ANNOTATION_CLASS) {
                        iiy[] iiyVarArr = eey.f7697a;
                        dqyVar.getClass();
                        zM = eey.b.m(eey.f7697a[6], dqyVar);
                    } else {
                        zM = true;
                    }
                } else {
                    zM = false;
                }
                if (!zM && Modifier.isStatic(fieldY.getModifiers())) {
                    I(esyVar);
                    qv9Var = z ? new iv9(fieldY, z2, b) : new mv9(fieldY, !xtt0.k(osyVarU.getReturnType()), objArr6 == true ? 1 : 0, b);
                } else if (z) {
                    qv9Var = fre0.W(esyVar) ? new gv9(fieldY, fre0.P(esyVar.u())) : new iv9(fieldY, z3, objArr5 == true ? 1 : 0);
                } else {
                    qv9Var = fre0.W(esyVar) ? new kv9(fieldY, !xtt0.k(osyVarU.getReturnType()), fre0.P(esyVar.u())) : new mv9(fieldY, !xtt0.k(osyVarU.getReturnType()), z3, objArr4 == true ? 1 : 0);
                }
            }
            return gnm0.j(rmxVar, esyVar, iun.f15405a, false);
        }
        if (Modifier.isStatic(methodB.getModifiers())) {
            I(esyVar);
            qv9Var = fre0.W(esyVar) ? new qv9(methodB, false, fre0.P(esyVar.u())) : new rv9(b, i, methodB, objArr == true ? 1 : 0);
        } else {
            qv9Var = fre0.W(esyVar) ? new ov9(methodB, fre0.P(esyVar.u())) : new rv9(objArr3 == true ? 1 : 0, i, methodB, objArr2 == true ? 1 : 0);
        }
        rmxVar = qv9Var;
        return gnm0.j(rmxVar, esyVar, iun.f15405a, false);
    }

    public static final void I(esy esyVar) {
        if (esyVar.u().c instanceof zhy) {
            return;
        }
        StringBuilder sb = new StringBuilder("Only top-level properties are supported for now: ");
        sb.append(esyVar.u().c);
        String name = esyVar.getName();
        sb.append('/');
        sb.append(name);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final ufp0 J(String str, List list) {
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((gip0) next).f11360a, str));
            gip0 gip0Var = (gip0) next;
            if (gip0Var != null) {
                return dnm0.q(gip0Var);
            }
        }
        return new ufp0(0, "", "", "", iun.f15405a);
    }

    public static final String K(double d) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator((char) 160);
        String str = new DecimalFormat("#,###", decimalFormatSymbols).format(Integer.valueOf((int) d));
        str.getClass();
        return str;
    }

    public static final double L(b820 b820Var) {
        fo7 fo7Var = b820Var.b;
        if (fo7Var.equals(xn7.b)) {
            gx4 gx4Var = b820Var.f;
            if (gx4Var != null) {
                return gx4Var.c.b.f38133a;
            }
        } else {
            if (fo7Var.equals(co7.b)) {
                return b820Var.d.f31171a.b.f38133a;
            }
            if (!fo7Var.equals(zn7.b)) {
                t9f.b();
                return 0.0d;
            }
        }
        return 0.0d;
    }

    public static final dem M(l2g0 l2g0Var, ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        List list = l2g0Var.y;
        if (list.isEmpty()) {
            return null;
        }
        return new dem(l2g0Var.f19307a, ctf0Var.b.a(R.string.additional_info, Arrays.copyOf(new Object[0], 0)), thb.R(list), z);
    }

    public static final fem N(l2g0 l2g0Var, boolean z) {
        List list = l2g0Var.y;
        if (list.isEmpty() || !z) {
            return null;
        }
        return new fem(thb.R(list));
    }

    public static final gem O(l2g0 l2g0Var, boolean z) {
        List list = l2g0Var.y;
        if (list.isEmpty() || !z) {
            return null;
        }
        return new gem(thb.R(list));
    }

    public static final String P(String str, boolean z) {
        String str2 = z ? "Tablet" : "Mobile";
        StringBuilder sb = new StringBuilder(ujn.h);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str3 = "/static/img/ImgDefault/Esports/Real/Rainbow/Maps/" + str2 + "/Left/" + lowerCase + ".png";
        if (str3.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
            sb.setLength(0);
            sb.append(str3);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str3, '/'));
        }
        return sb.toString();
    }

    public static final fem Q(l2g0 l2g0Var, boolean z) {
        List list = l2g0Var.y;
        if (list.isEmpty() || !z) {
            return null;
        }
        return new fem(thb.R(list));
    }

    public static SharedPreferences R(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final eem S(l2g0 l2g0Var, boolean z) {
        List list = l2g0Var.y;
        if (list.isEmpty() || !z) {
            return null;
        }
        return new eem(thb.R(list));
    }

    public static final int T(y9x y9xVar) {
        switch (y9xVar.ordinal()) {
            case 0:
                return R.string.info_about;
            case 1:
                return R.string.info_social_title;
            case 2:
                return R.string.info_contact;
            case 3:
                return R.string.rules;
            case 4:
                return R.string.info_payment;
            case 5:
                return R.string.info_question;
            case 6:
                return R.string.partners;
            case 7:
                return R.string.info_licence;
            case 8:
                return R.string.info_awards;
            case 9:
                return R.string.info_privacy_policy;
            case 10:
                return R.string.info_responsible_gaming;
            case 11:
                return R.string.info_betting_procedures;
            case 12:
                return R.string.info_request_policy;
            case 13:
                return R.string.info_personal_data_policy;
            case 14:
                return R.string.stop_list_wagering;
            case 15:
            case 16:
            case 21:
            case 22:
            default:
                return 0;
            case 17:
                return R.string.info_ussd_instructions;
            case 18:
                return R.string.info_markets;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return R.string.info_partner_programm;
            case 20:
                return R.string.info_agent_programm;
            case 23:
                return R.string.info_payment_card_security;
            case 24:
                return R.string.info_politically_exposed_person;
        }
    }

    public static final boolean U(Map map, dsh0 dsh0Var) {
        map.getClass();
        Boolean bool = (Boolean) map.get(dsh0Var);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void V(tx6 tx6Var) {
        pz40 pz40Var = tx6Var.f34681a;
        a8q0 a8q0Var = (a8q0) pz40Var.getValue();
        int iE = o9q0.e(((a8q0) pz40Var.getValue()).b);
        pz40Var.setValue(a8q0.a(a8q0Var, null, s7n0.e(iE, iE), 5));
    }

    public static final int W(li10 li10Var) {
        if (li10Var instanceof ji10) {
            return ((ji10) li10Var).f16555a;
        }
        if (li10Var instanceof ki10) {
            return ((ki10) li10Var).f18315a;
        }
        t9f.b();
        return 0;
    }

    public static final List X(cge cgeVar, boolean z, boolean z2, ctf0 ctf0Var) {
        int i;
        o0x m0xVar;
        char c;
        String str;
        n0x n0xVar;
        Object x7c0Var;
        char c2;
        ctf0Var.getClass();
        ha8 ha8Var = cgeVar.f4307a;
        if (!z) {
            if ((ha8Var instanceof x98) || (ha8Var instanceof ca8) || (ha8Var instanceof ea8)) {
                return kotlin.collections.a.c(new c250(cgeVar.getKey(), uf10.f35558a));
            }
            if (!(ha8Var instanceof da8)) {
                return iun.f15405a;
            }
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setGroupingSeparator((char) 160);
            DecimalFormat decimalFormat = new DecimalFormat("#,###", decimalFormatSymbols);
            rh10 rh10Var = (rh10) ((da8) ha8Var).b;
            yh10 yh10Var = rh10Var.b.b;
            li10 li10Var = yh10Var.b.g;
            wi10 wi10Var = yh10Var.c;
            if (li10Var instanceof ji10) {
                i = wi10Var.b;
            } else {
                if (!(li10Var instanceof ki10)) {
                    t9f.b();
                    return null;
                }
                i = ((ki10) li10Var).f18315a;
            }
            int i2 = i;
            int iW = W(li10Var);
            String key = cgeVar.getKey();
            String str2 = rh10Var.b.b.b.c;
            String strA = ctf0Var.b.a(R.string.vip_cashback_status_description, Arrays.copyOf(new Object[0], 0));
            ei10 ei10Var = rh10Var.b.b.b;
            String str3 = ei10Var.b;
            if (str3.length() > 0) {
                StringBuilder sb = new StringBuilder(ujn.h);
                if (str3.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
                    sb.setLength(0);
                    sb.append(str3);
                } else {
                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                        c = '/';
                    } else {
                        c = '/';
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(str3, c));
                }
                m0xVar = new n0x(sb.toString());
            } else {
                int i3 = ei10Var.f7836a;
                if (i3 == 1) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_copper, null, 6);
                } else if (i3 == 2) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_bronze, null, 6);
                } else if (i3 == 3) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_silver, null, 6);
                } else if (i3 == 4) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_gold, null, 6);
                } else if (i3 == 5) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_ruby, null, 6);
                } else if (i3 == 6) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_sapfir, null, 6);
                } else if (i3 == 7) {
                    m0xVar = new m0x(R.drawable.ic_glyph_color_status_brilliant, null, 6);
                } else {
                    m0xVar = i3 == 8 ? new m0x(R.drawable.ic_glyph_color_status_vip, null, 6) : new m0x(R.drawable.ic_glyph_color_status_unknown, null, 6);
                }
            }
            return kotlin.collections.a.c(new c250(key, new tf10(str2, strA, m0xVar, ohs0.n(rh10Var.b.b.b.h, " %"), decimalFormat.format(Integer.valueOf(i2)).toString(), kng0.k("/ ", decimalFormat.format(Integer.valueOf(iW))), i2, iW)));
        }
        if ((ha8Var instanceof x98) || (ha8Var instanceof ca8) || (ha8Var instanceof ea8)) {
            String key2 = cgeVar.getKey();
            lc00 lc00VarB = kotlin.collections.a.b();
            for (int i4 = 0; i4 < 3; i4++) {
                lc00VarB.add(z7c0.f43912a);
            }
            return kotlin.collections.a.c(new d250(key2, zzh.f45253a, dyb.o0(kotlin.collections.a.a(lc00VarB))));
        }
        if (ha8Var instanceof ba8) {
            String str4 = ha8Var instanceof z98 ? (String) ((z98) ha8Var).b : "";
            String key3 = cgeVar.getKey();
            lsm0 lsm0Var = ctf0Var.b;
            String strA2 = lsm0Var.a(R.string.loyalty_program_welcome_title_v2, Arrays.copyOf(new Object[]{str4}, 1));
            String strA3 = lsm0Var.a(R.string.cashback_card_status_unknown, Arrays.copyOf(new Object[0], 0));
            String strA4 = lsm0Var.a(R.string.loyalty_program_widget_level_subtitle, Arrays.copyOf(new Object[0], 0));
            String strA5 = lsm0Var.a(R.string.loyalty_info_error, Arrays.copyOf(new Object[0], 0));
            String strA6 = lsm0Var.a(R.string.loyalty_cashback_claim_button_text, Arrays.copyOf(new Object[0], 0));
            pz40 pz40Var = s6t0.f31722a;
            yzh yzhVar = new yzh(strA2, strA3, strA4, strA5, strA6, dyb.g0(new y3d(s6t0.b().f33626a.getPromoCardGradientStart()), new y3d(s6t0.b().f33626a.getPromoCardGradientEnd())));
            lc00 lc00VarB2 = kotlin.collections.a.b();
            lc00VarB2.add(new x7c0(lsm0Var.a(R.string.cashback, Arrays.copyOf(new Object[0], 0))));
            if (z2) {
                lc00VarB2.add(new v7c0(R.drawable.ic_glyph_bonus, "BONUSES", lsm0Var.a(R.string.bonuses, Arrays.copyOf(new Object[0], 0))));
                lc00VarB2.add(new v7c0(R.drawable.ic_glyph_promocode_active, "PROMO_CODE", lsm0Var.a(R.string.promocode, Arrays.copyOf(new Object[0], 0))));
            }
            return kotlin.collections.a.c(new d250(key3, yzhVar, dyb.o0(kotlin.collections.a.a(lc00VarB2))));
        }
        if (!(ha8Var instanceof da8)) {
            return iun.f15405a;
        }
        String key4 = cgeVar.getKey();
        rh10 rh10Var2 = (rh10) ((da8) ha8Var).b;
        Object[] objArr = {rh10Var2.b.f44370a};
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA7 = lsm0Var2.a(R.string.loyalty_program_welcome_title_v2, Arrays.copyOf(objArr, 1));
        String strA8 = rh10Var2.b.b.b.c;
        if (strA8.length() == 0) {
            strA8 = lsm0Var2.a(R.string.cashback_card_status_unknown, Arrays.copyOf(new Object[0], 0));
        }
        String str5 = strA8;
        String strA9 = lsm0Var2.a(R.string.loyalty_program_widget_level_subtitle, Arrays.copyOf(new Object[0], 0));
        ei10 ei10Var2 = rh10Var2.b.b.b;
        String str6 = ei10Var2.b;
        if (str6.length() > 0) {
            str = str6;
        } else {
            int i5 = ei10Var2.f7836a;
            if (i5 == 1) {
                str = "/static/img/android/casino/vip_cashback/Copper.webp";
            } else if (i5 == 2) {
                str = "/static/img/android/casino/vip_cashback/Bronze.webp";
            } else if (i5 == 3) {
                str = "/static/img/android/casino/vip_cashback/Silver.webp";
            } else if (i5 == 4) {
                str = "/static/img/android/casino/vip_cashback/Gold.webp";
            } else if (i5 == 5) {
                str = "/static/img/android/casino/vip_cashback/Ruby.webp";
            } else if (i5 == 6) {
                str = "/static/img/android/casino/vip_cashback/Sapphire.webp";
            } else if (i5 == 7) {
                str = "/static/img/android/casino/vip_cashback/Brilliant.webp";
            } else {
                str = i5 == 8 ? "/static/img/android/casino/vip_cashback/Vip.webp" : null;
            }
        }
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(ujn.h);
            if (str.length() == 0) {
                sb2.setLength(0);
            } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                sb2.setLength(0);
                sb2.append(str);
            } else {
                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                    c2 = '/';
                } else {
                    c2 = '/';
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0(str, c2));
            }
            n0xVar = new n0x(sb2.toString());
        } else {
            n0xVar = null;
        }
        String strA10 = lsm0Var2.a(R.string.loyalty_cashback_percent_v2, Arrays.copyOf(new Object[]{rh10Var2.b.b.b.h}, 1));
        String strA11 = lsm0Var2.a(R.string.loyalty_cashback_coeff_v2, Arrays.copyOf(new Object[]{Integer.valueOf(rh10Var2.b.b.b.e)}, 1));
        String strA12 = lsm0Var2.a(R.string.loyalty_cashback_experience_v2, Arrays.copyOf(new Object[]{K(rh10Var2.b.b.c.b)}, 1));
        String strK = kng0.k("/ ", K(W(rh10Var2.b.b.b.g)));
        yh10 yh10Var2 = rh10Var2.b.b;
        int i6 = yh10Var2.c.b;
        int iW2 = W(yh10Var2.b.g);
        String strA13 = lsm0Var2.a(R.string.loyalty_cashback_claim_button_text, Arrays.copyOf(new Object[0], 0));
        boolean z3 = rh10Var2.b.b.b.g instanceof ki10;
        String strA14 = lsm0Var2.a(R.string.loyalty_max_level_description, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var2 = s6t0.f31722a;
        xzh xzhVar = new xzh(strA7, str5, strA9, n0xVar, strA10, strA11, strA12, strK, i6, iW2, strA13, z3, strA14, dyb.g0(new y3d(s6t0.b().f33626a.getPromoCardGradientStart()), new y3d(s6t0.b().f33626a.getPromoCardGradientEnd())));
        lc00 lc00VarB3 = kotlin.collections.a.b();
        rh10Var2.getClass();
        boolean z4 = rh10Var2.f30466a;
        zh10 zh10Var = rh10Var2.b;
        if (z4) {
            x7c0Var = new y7c0(lsm0Var2.a(R.string.cashback, Arrays.copyOf(new Object[0], 0)));
        } else {
            yh10 yh10Var3 = zh10Var.b;
            wi10 wi10Var2 = yh10Var3.c;
            wi10 wi10Var3 = yh10Var3.c;
            vi10 vi10Var = wi10Var2.d;
            if (vi10Var == vi10.AWAITING) {
                String strA15 = lsm0Var2.a(R.string.cashback, Arrays.copyOf(new Object[0], 0));
                Date date = new Date(wi10Var3.c + 999);
                String strA16 = lsm0Var2.a(R.string.day_short, Arrays.copyOf(new Object[0], 0));
                long jW0 = ibc.w0(wi10Var3.c - System.currentTimeMillis(), bfn.MILLISECONDS);
                uen uenVar = wen.b;
                long jL = wen.l(jW0, bfn.HOURS);
                yni0 yni0Var = new yni0();
                if (jL >= 12) {
                    yni0Var.add(rol.f30844a);
                }
                yni0Var.add(rol.b);
                yni0Var.add(rol.c);
                yni0Var.add(rol.d);
                x7c0Var = new a8c0(strA15, date, strA16, dyb.t0(cui0.a(yni0Var)));
            } else if (vi10Var == vi10.AVAILABLE) {
                String strA17 = lsm0Var2.a(R.string.cashback, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var = pn40.f27267a;
                double d = wi10Var3.f;
                p3u0 p3u0Var = p3u0.c;
                x7c0Var = new w7c0(strA17, kng0.l(pn40.l(d), Separators.SP, wi10Var3.g.b));
            } else {
                x7c0Var = new x7c0(lsm0Var2.a(R.string.cashback, Arrays.copyOf(new Object[0], 0)));
            }
        }
        lc00VarB3.add(x7c0Var);
        if (z2) {
            lc00VarB3.add(new v7c0(R.drawable.ic_glyph_bonus, "BONUSES", lsm0Var2.a(R.string.bonuses, Arrays.copyOf(new Object[0], 0))));
            lc00VarB3.add(new v7c0(R.drawable.ic_glyph_promocode_active, "PROMO_CODE", lsm0Var2.a(R.string.promocode, Arrays.copyOf(new Object[0], 0))));
        }
        return kotlin.collections.a.c(new d250(key4, xzhVar, dyb.o0(kotlin.collections.a.a(lc00VarB3))));
    }

    public static final f280 Y(g380 g380Var, long j, f280 f280Var, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4) {
        Object next;
        Object next2;
        reo reoVar;
        g380Var.getClass();
        list.getClass();
        list2.getClass();
        Integer num = g380Var.f10600a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        String str = g380Var.c;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        List list3 = g380Var.b;
        String str2 = list3 != null ? (String) CollectionsKt.firstOrNull(list3) : null;
        zgo zgoVar = g380Var.d;
        if (zgoVar == null) {
            jf4.k(null);
            return null;
        }
        Integer num2 = zgoVar.c;
        seo seoVar = f280Var != null ? f280Var.d : null;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ueo ueoVar = (ueo) next;
            if (num2 != null && ueoVar.f35538a == num2.intValue()) {
                break;
            }
        }
        ueo ueoVar2 = (ueo) next;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            long j2 = ((xco) next2).f40655a;
            Long l = zgoVar.f44354a;
            if (l != null && j2 == l.longValue()) {
                break;
            }
        }
        xco xcoVar = (xco) next2;
        String str3 = xcoVar != null ? xcoVar.b : null;
        String str4 = str3 == null ? "" : str3;
        int i = ueoVar2 != null ? ueoVar2.c : 0;
        Integer num3 = zgoVar.b;
        vgo vgoVar = zgoVar.e;
        Double d = zgoVar.d;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        int iIntValue3 = num2 != null ? num2.intValue() : 0;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        if (vgoVar != null) {
            Long l2 = vgoVar.f37391a;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            String str5 = vgoVar.b;
            if (str5 == null) {
                str5 = "";
            }
            reoVar = new reo(jLongValue, str5);
        } else {
            reoVar = new reo(0L, "");
        }
        Double d2 = zgoVar.f;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double dValueOf = (z || seoVar == null) ? null : Double.valueOf(seoVar.e);
        String str6 = zgoVar.g;
        if (str6 == null) {
            str6 = "";
        }
        Boolean bool = zgoVar.h;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num4 = zgoVar.i;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        String str7 = ueoVar2 != null ? ueoVar2.b : null;
        String str8 = str7 == null ? "" : str7;
        rgo rgoVar = zgoVar.j;
        List list4 = rgoVar != null ? rgoVar.f30448a : null;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        List list5 = list4;
        List list6 = rgoVar != null ? rgoVar.b : null;
        if (list6 == null) {
            list6 = iun.f15405a;
        }
        return new f280(iIntValue, str, str2, new seo(iIntValue2, iIntValue3, dDoubleValue, reoVar, dDoubleValue2, dValueOf, str6, zBooleanValue, iIntValue4, false, false, str4, dii0.a(str8, list5, list6, Integer.valueOf(i), z2, kotlin.text.b.h(String.valueOf(d)), vgoVar != null ? vgoVar.b : null, Long.valueOf(j), ueoVar2 != null ? ueoVar2.f35538a : 0L, nt20.o, z3, z4)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e A[PHI: r2
  0x007e: PHI (r2v5 a.amb0) = (r2v4 a.amb0), (r2v6 a.amb0), (r2v7 a.amb0) binds: [B:37:0x00a6, B:32:0x0095, B:26:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[LOOP:1: B:40:0x00af->B:44:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00a9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final rib0 Z(wrd wrdVar) {
        ?? arrayList;
        amb0 amb0Var;
        int i;
        wrdVar.getClass();
        Boolean bool = wrdVar.C.q;
        Boolean bool2 = Boolean.TRUE;
        boolean zD = Intrinsics.d(bool, bool2);
        boolean zD2 = Intrinsics.d(wrdVar.n0.b0, bool2);
        boolean zD3 = Intrinsics.d(wrdVar.o0.c0, bool2);
        Integer num = wrdVar.C6.b;
        int iIntValue = num != null ? num.intValue() : 20;
        boolean zD4 = Intrinsics.d(wrdVar.f0.T, bool2);
        List list = wrdVar.D6.c;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = list;
        List<String> list3 = wrdVar.E6.d;
        if (list3 != null) {
            arrayList = new ArrayList();
            for (String str : list3) {
                int iHashCode = str.hashCode();
                amb0 amb0Var2 = null;
                if (iHashCode != -1367569419) {
                    if (iHashCode != -761348791) {
                        if (iHashCode == 466165515 && str.equals("virtual")) {
                            amb0Var = amb0.AGGREGATOR;
                            if (ay3.W(wrdVar)) {
                                amb0Var2 = amb0Var;
                            }
                        } else {
                            for (amb0 amb0Var3 : amb0.values()) {
                                if (amb0Var3.f1100a.equals(str)) {
                                    amb0Var2 = amb0Var3;
                                    break;
                                }
                            }
                        }
                    } else if (str.equals("xgames")) {
                        amb0Var = amb0.ONE_X_GAMES;
                        if (Intrinsics.d(wrdVar.W2.l, Boolean.TRUE)) {
                            amb0Var2 = amb0Var;
                        }
                    } else {
                        while (i < r10) {
                            if (amb0Var3.f1100a.equals(str)) {
                                amb0Var2 = amb0Var3;
                                break;
                            }
                        }
                    }
                } else if (str.equals("casino")) {
                    amb0Var = amb0.AGGREGATOR;
                    if (ay3.V(wrdVar)) {
                        amb0Var2 = amb0Var;
                    }
                } else {
                    while (i < r10) {
                        if (amb0Var3.f1100a.equals(str)) {
                            amb0Var2 = amb0Var3;
                            break;
                        }
                    }
                }
                if (amb0Var2 != null) {
                    arrayList.add(amb0Var2);
                }
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new rib0(zD2, zD3, iIntValue, list2, zD, zD4, arrayList);
    }

    public static final void a(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(-1557187288);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                wul wulVar = new wul(mul.e, oe9.c, new te9(i), z, false, false);
                fetVar.o0(wulVar);
                objP = wulVar;
            }
            int i4 = 6 | ((i3 >> 3) & 896);
            jm40 jm40Var = jm40.b;
            qzb.n(jm40Var, (wul) objP, function0, fetVar, i4, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, i, z, function0, i2, (byte) 7);
        }
    }

    public static final a7c0 a0(czc0 czc0Var, ctf0 ctf0Var, boolean z) {
        wyc0 wyc0Var;
        boolean z2;
        mlc0 mlc0Var;
        czc0Var.getClass();
        ctf0Var.getClass();
        tyc0 tyc0Var = czc0Var.f5218a;
        azc0 azc0Var = new azc0(tyc0Var.f34747a, tyc0Var.b, tyc0Var.c, true, tyc0Var.d, tyc0Var.e);
        if (z) {
            wyc0Var = wyc0.b;
        } else {
            int iOrdinal = czc0Var.b.ordinal();
            if (iOrdinal == 0) {
                wyc0Var = wyc0.f39969a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                wyc0Var = wyc0.b;
            }
        }
        qlc0 qlc0Var = czc0Var.c;
        double d = qlc0Var.f28928a;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        String str = qlc0Var.c;
        p3u0 p3u0Var = p3u0.c;
        mlc0 mlc0Var2 = new mlc0(strA, cy7.e(pn40.d(d, str, p3u0Var)), false);
        mlc0 mlc0Var3 = new mlc0(lsm0Var.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), qlc0Var.b, false);
        mlc0 mlc0Var4 = qlc0Var.f ? new mlc0(lsm0Var.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(qlc0Var.e, str, p3u0Var)), true) : null;
        if (qlc0Var.g) {
            z2 = true;
            mlc0Var = new mlc0(lsm0Var.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((qlc0Var.d - 1.0d) * d, str, p3u0Var)), true);
        } else {
            z2 = true;
            mlc0Var = null;
        }
        slc0 slc0Var = new slc0(dyb.r0(tx3.z(new mlc0[]{mlc0Var2, mlc0Var3, mlc0Var4, mlc0Var})), qlc0Var.h);
        boolean z3 = czc0Var.d;
        String strA2 = lsm0Var.a(R.string.new_bet_promo_info_line, Arrays.copyOf(new Object[0], 0));
        String strConcat = z3 ? Separators.RETURN.concat(lsm0Var.a(R.string.bet_promo_balance_description, Arrays.copyOf(new Object[0], 0))) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        String strConcat2 = strA2.concat(strConcat);
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        boolean z4 = false;
        ue9 ue9Var = new ue9(lsm0Var.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
        if (czc0Var.e && !z) {
            z4 = z2;
        }
        return new a7c0(azc0Var, wyc0Var, slc0Var, strConcat2, new wul(iulVar, oe9Var, ue9Var, z4, false, true));
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(mm40 mm40Var, final tx6 tx6Var, jx6 jx6Var, mke mkeVar, String str, String str2, Function1 function1, final Function0 function0, final Function0 function2, fet fetVar, int i) {
        final tx6 tx6Var2;
        mm40 mm40Var2;
        fet fetVar2;
        androidx.compose.runtime.d dVar;
        long background;
        fet fetVar3;
        long background2;
        Object obj;
        float f;
        boolean z;
        fet fetVar4;
        Object obj2;
        int i2;
        fet fetVar5;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objP;
        final byte b;
        fet fetVar6 = fetVar;
        boolean z5 = mkeVar.c;
        fetVar6.g0(-1556235814);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar6.g(tx6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar6.e(jx6Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar6.g(mkeVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar6.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar6.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar6.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar6.i(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= fetVar6.i(function2) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (fetVar6.U(i4 & 1, (i4 & 38347923) != 38347922)) {
            Object[] objArr = new Object[0];
            Object objP2 = fetVar6.P();
            Object obj3 = ukd.f35823a;
            if (objP2 == obj3) {
                objP2 = new qgx((byte) 20);
                fetVar6.o0(objP2);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP2, fetVar6, 48);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar6.e0(-893978207);
                dVar = zaq0.b;
                background = ((ThemeColors) fetVar6.k(dVar)).getPrimary();
            } else {
                fetVar6.e0(-893977212);
                dVar = zaq0.b;
                background = ((ThemeColors) fetVar6.k(dVar)).getBackground();
            }
            fetVar6.r(false);
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
            int i5 = i4 >> 6;
            int iOrdinal = jx6Var.ordinal();
            if (iOrdinal == 0) {
                fetVar3 = fetVar;
                fetVar3.e0(2137300087);
                background2 = ((ThemeColors) fetVar3.k(dVar)).getBackground();
                fetVar3.r(false);
            } else if (iOrdinal == 1) {
                fetVar3 = fetVar;
                fetVar3.e0(2137301880);
                background2 = ((ThemeColors) fetVar3.k(dVar)).getWarningTint();
                fetVar3.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(2137298283, fetVar, false);
                }
                fetVar3 = fetVar;
                fetVar3.e0(2137303799);
                background2 = ((ThemeColors) fetVar3.k(dVar)).getBackground();
                fetVar3.r(false);
            }
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarS, background2, jd8.n), 8.0f, 6.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar3, 54);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarK);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (z5) {
                fetVar3.e0(-465698270);
                boolean z6 = mkeVar.f21939a;
                boolean z7 = ((i4 & 234881024) == 67108864) | ((i4 & 112) == 32);
                Object objP3 = fetVar3.P();
                if (z7 || objP3 == obj3) {
                    b = 0;
                    objP3 = new Function0() { // from class: a.c7y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b2 = b;
                            Function0 function3 = function2;
                            tx6 tx6Var3 = tx6Var;
                            switch (b2) {
                                case 0:
                                    x9x.V(tx6Var3);
                                    function3.invoke();
                                    break;
                                default:
                                    x9x.V(tx6Var3);
                                    function3.invoke();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar3.o0(objP3);
                } else {
                    b = 0;
                }
                Function0 function3 = (Function0) objP3;
                fet fetVar7 = fetVar3;
                obj = obj3;
                f = 1.0f;
                z = true;
                a(R.drawable.ic_glyph_minus_small, 0, fetVar7, null, function3, z6);
                fet fetVar8 = fetVar7;
                fetVar8.r(b);
                fetVar4 = fetVar8;
            } else {
                obj = obj3;
                fet fetVar9 = fetVar3;
                f = 1.0f;
                z = true;
                fetVar9.e0(-465411892);
                fetVar9.r(false);
                fetVar4 = fetVar9;
            }
            x7z x7zVar = new x7z(f, z);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            boolean zG = fetVar4.g(pz40Var);
            Object objP4 = fetVar4.P();
            if (zG) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (objP4 == obj2) {
                }
                Function1 function4 = (Function1) objP4;
                i2 = i4 & 112;
                int i6 = (i5 & 896) | i2 | ((i4 << 3) & 7168) | (57344 & (i4 >> 3)) | (i4 & 3670016);
                Object obj4 = obj2;
                fetVar5 = fetVar4;
                m(x7zVar, tx6Var, str, jx6Var, str2, zBooleanValue, function1, function4, fetVar5, i6);
                tx6Var2 = tx6Var;
                if (z5) {
                    fetVar5.e0(-464977179);
                    boolean z8 = mkeVar.b;
                    if (i2 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i4 & 29360128) == 8388608) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z3 | z2;
                    objP = fetVar5.P();
                    if (z4 || objP == obj4) {
                        final byte b2 = 1;
                        objP = new Function0() { // from class: a.c7y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = b2;
                                Function0 function5 = function0;
                                tx6 tx6Var3 = tx6Var2;
                                switch (b3) {
                                    case 0:
                                        x9x.V(tx6Var3);
                                        function5.invoke();
                                        break;
                                    default:
                                        x9x.V(tx6Var3);
                                        function5.invoke();
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar5.o0(objP);
                    }
                    a(R.drawable.ic_glyph_plus_small, 0, fetVar5, null, (Function0) objP, z8);
                    fetVar5.r(false);
                } else {
                    fetVar5.e0(-464693684);
                    fetVar5.r(false);
                }
                fetVar5.r(true);
                mm40Var2 = jm40Var;
                fetVar2 = fetVar5;
            }
            objP4 = new y9v(pz40Var, (byte) 6);
            fetVar4.o0(objP4);
            Function1 function5 = (Function1) objP4;
            i2 = i4 & 112;
            int i7 = (i5 & 896) | i2 | ((i4 << 3) & 7168) | (57344 & (i4 >> 3)) | (i4 & 3670016);
            Object obj5 = obj2;
            fetVar5 = fetVar4;
            m(x7zVar, tx6Var, str, jx6Var, str2, zBooleanValue, function1, function5, fetVar5, i7);
            tx6Var2 = tx6Var;
            if (z5) {
                fetVar5.e0(-464977179);
                boolean z9 = mkeVar.b;
                if (i2 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i4 & 29360128) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | z2;
                objP = fetVar5.P();
                if (z4) {
                    final byte b3 = 1;
                    objP = new Function0() { // from class: a.c7y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            Function0 function6 = function0;
                            tx6 tx6Var3 = tx6Var2;
                            switch (b4) {
                                case 0:
                                    x9x.V(tx6Var3);
                                    function6.invoke();
                                    break;
                                default:
                                    x9x.V(tx6Var3);
                                    function6.invoke();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar5.o0(objP);
                } else {
                    final byte b4 = 1;
                    objP = new Function0() { // from class: a.c7y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            Function0 function6 = function0;
                            tx6 tx6Var3 = tx6Var2;
                            switch (b5) {
                                case 0:
                                    x9x.V(tx6Var3);
                                    function6.invoke();
                                    break;
                                default:
                                    x9x.V(tx6Var3);
                                    function6.invoke();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar5.o0(objP);
                }
                a(R.drawable.ic_glyph_plus_small, 0, fetVar5, null, (Function0) objP, z9);
                fetVar5.r(false);
            } else {
                fetVar5.e0(-464693684);
                fetVar5.r(false);
            }
            fetVar5.r(true);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar5;
        } else {
            tx6Var2 = tx6Var;
            fetVar6.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ez3(mm40Var2, (Object) tx6Var2, (Object) jx6Var, (Object) mkeVar, str, (Object) str2, (wdr) function1, (wdr) function0, (wdr) function2, i, (byte) 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r105v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v41, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.util.ArrayList] */
    public static final sff0 b0(wrd wrdVar) throws roe {
        k8l0 k8l0Var;
        gm7 gm7Var;
        xte xteVar;
        ate ateVar;
        pmt0 pmt0Var;
        cgx0 cgx0Var;
        ua20 ua20Var;
        dyv0 dyv0Var;
        gx7 gx7Var;
        vbb0 vbb0Var;
        cbe0 cbe0Var;
        nnu0 nnu0Var;
        g5h g5hVar;
        n2o n2oVar;
        jao0 jao0Var;
        ?? G;
        yfw yfwVar;
        if (wrdVar == null) {
            throw new roe();
        }
        ujg ujgVar = wrdVar.f7;
        lnh0 lnh0Var = wrdVar.W2;
        ns10 ns10Var = wrdVar.F0;
        ns10 ns10Var2 = wrdVar.i0;
        Boolean bool = wrdVar.s.g;
        Boolean bool2 = Boolean.TRUE;
        boolean zD = Intrinsics.d(bool, bool2);
        boolean zD2 = Intrinsics.d(wrdVar.t.h, bool2);
        boolean zD3 = Intrinsics.d(wrdVar.D.r, bool2);
        boolean zD4 = Intrinsics.d(wrdVar.G.u, bool2);
        boolean zD5 = Intrinsics.d(wrdVar.H.v, bool2);
        boolean zD6 = Intrinsics.d(wrdVar.I.w, bool2);
        boolean zD7 = Intrinsics.d(wrdVar.J.x, bool2);
        boolean zD8 = Intrinsics.d(wrdVar.P.D, bool2);
        boolean zD9 = Intrinsics.d(wrdVar.R.F, bool2);
        boolean zD10 = Intrinsics.d(wrdVar.e0.S, bool2);
        boolean zD11 = Intrinsics.d(wrdVar.g0.U, bool2);
        boolean zD12 = Intrinsics.d(wrdVar.h0.V, bool2);
        Intrinsics.d(ns10Var2.W, bool2);
        gm7 gm7Var2 = new gm7(Intrinsics.d(wrdVar.E0.s0, bool2), zD, zD2, zD8, zD9, zD11, zD12, Intrinsics.d(wrdVar.H0.v0, bool2), Intrinsics.d(wrdVar.l0.Z, bool2), Intrinsics.d(wrdVar.m0.a0, bool2), Intrinsics.d(wrdVar.p0.d0, bool2), zD4, zD5, zD6, zD7, zD10, zD3, Intrinsics.d(wrdVar.q1.e1, bool2), Intrinsics.d(wrdVar.F.t, bool2));
        Intrinsics.d(ns10Var.t0, bool2);
        Integer num = wrdVar.o.c;
        int iIntValue = num != null ? num.intValue() : 0;
        boolean zD13 = Intrinsics.d(wrdVar.X.L, bool2);
        Intrinsics.d(wrdVar.Y.M, bool2);
        boolean zD14 = Intrinsics.d(wrdVar.m4.b, bool2);
        boolean zD15 = Intrinsics.d(wrdVar.n4.c, bool2);
        boolean zD16 = Intrinsics.d(wrdVar.Z.N, bool2);
        boolean zD17 = Intrinsics.d(wrdVar.a0.O, bool2);
        boolean zD18 = Intrinsics.d(wrdVar.b0.P, bool2);
        boolean zD19 = Intrinsics.d(wrdVar.J0.x0, bool2);
        Intrinsics.d(wrdVar.u1.i1, bool2);
        q57 q57Var = new q57(zD16, zD17, zD18, iIntValue, zD14, zD15, zD13, zD19, Intrinsics.d(wrdVar.t1.h1, bool2));
        boolean zD20 = Intrinsics.d(wrdVar.p.d, bool2);
        boolean zD21 = Intrinsics.d(wrdVar.S.G, bool2);
        boolean zD22 = Intrinsics.d(wrdVar.T.H, bool2);
        boolean zD23 = Intrinsics.d(wrdVar.b3.q, bool2);
        boolean zD24 = Intrinsics.d(wrdVar.G0.u0, bool2);
        boolean zD25 = Intrinsics.d(wrdVar.M6.m, bool2);
        boolean zD26 = Intrinsics.d(wrdVar.N6.n, bool2);
        boolean zD27 = Intrinsics.d(wrdVar.G1.u1, bool2);
        String str = wrdVar.m5.D;
        xte[] xteVarArrValues = xte.values();
        int length = xteVarArrValues.length;
        int i = 0;
        while (true) {
            k8l0Var = null;
            if (i >= length) {
                gm7Var = gm7Var2;
                xteVar = null;
                break;
            }
            int i2 = i;
            xteVar = xteVarArrValues[i2];
            gm7Var = gm7Var2;
            if (xteVar.f41462a.equals(str)) {
                break;
            }
            i = i2 + 1;
            gm7Var2 = gm7Var;
        }
        if (xteVar == null) {
            xteVar = xte.COEF_WITH_BIG_ACCENT_TEAM;
        }
        xte xteVar2 = xteVar;
        String str2 = wrdVar.n5.E;
        ate[] ateVarArrValues = ate.values();
        int length2 = ateVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                ateVar = null;
                break;
            }
            ateVar = ateVarArrValues[i3];
            ate[] ateVarArr = ateVarArrValues;
            if (ateVar.f1428a.equals(str2)) {
                break;
            }
            i3++;
            ateVarArrValues = ateVarArr;
        }
        if (ateVar == null) {
            ateVar = ate.OFFSET;
        }
        b3f b3fVar = new b3f(zD20, zD21, zD22, zD24, zD23, zD25, zD26, zD27, xteVar2, ateVar);
        Boolean bool3 = wrdVar.E.s;
        Boolean bool4 = Boolean.TRUE;
        boolean zD28 = Intrinsics.d(bool3, bool4);
        boolean zD29 = Intrinsics.d(wrdVar.U2.j, bool4);
        String str3 = wrdVar.m3.B;
        String str4 = str3 == null ? "" : str3;
        boolean zD30 = Intrinsics.d(wrdVar.k1.Y0, bool4);
        boolean zD31 = Intrinsics.d(wrdVar.l1.Z0, bool4);
        boolean zD32 = Intrinsics.d(wrdVar.K.y, bool4);
        boolean zD33 = Intrinsics.d(wrdVar.L.z, bool4);
        String str5 = wrdVar.a1.O0;
        String str6 = str5 == null ? "" : str5;
        String str7 = wrdVar.b1.P0;
        String str8 = str7 == null ? "" : str7;
        boolean zD34 = Intrinsics.d(wrdVar.K0.y0, bool4);
        boolean zD35 = Intrinsics.d(wrdVar.C7.l, bool4);
        if (Intrinsics.d(wrdVar.t7.c, bool4)) {
            pmt0Var = pmt0.c;
        } else {
            pmt0Var = Intrinsics.d(wrdVar.u7.d, bool4) ? pmt0.b : pmt0.f27254a;
        }
        List list = wrdVar.D7.m;
        if (list == null) {
            list = iun.f15405a;
        }
        cgx0 cgx0Var2 = new cgx0(zD35, pmt0Var, list);
        String str9 = wrdVar.a6.r0;
        ua20[] ua20VarArrValues = ua20.values();
        int length3 = ua20VarArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                cgx0Var = cgx0Var2;
                ua20Var = null;
                break;
            }
            int i5 = i4;
            ua20Var = ua20VarArrValues[i5];
            cgx0Var = cgx0Var2;
            if (ua20Var.f35311a.equals(str9)) {
                break;
            }
            i4 = i5 + 1;
            cgx0Var2 = cgx0Var;
        }
        if (ua20Var == null) {
            ua20Var = ua20.MEDIUM_NO_GAME_INFO;
        }
        gx7 gx7Var2 = new gx7(gm7Var, q57Var, b3fVar, zD28, zD29, str4, zD30, zD31, zD32, zD33, str6, str8, zD34, cgx0Var, ua20Var);
        hl1 hl1VarU0 = b34.u0(wrdVar);
        Boolean bool5 = lnh0Var.l;
        Boolean bool6 = Boolean.TRUE;
        if (Intrinsics.d(bool5, bool6)) {
            String str10 = wrdVar.G6.g;
            String str11 = str10 == null ? "" : str10;
            boolean zD36 = Intrinsics.d(wrdVar.i3.x, bool6);
            boolean zD37 = Intrinsics.d(wrdVar.h3.w, bool6);
            Long l = wrdVar.E7.n;
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = wrdVar.F7.o;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            Boolean bool7 = wrdVar.G7.p;
            dyv0Var = new dyv0(jLongValue, jLongValue2, str11, true, zD36, zD37, bool7 != null ? bool7.booleanValue() : false);
        } else {
            dyv0Var = new dyv0(0L, 0L, "", false, false, false, false);
        }
        q1w0 q1w0Var = new q1w0(dyv0Var, Intrinsics.d(lnh0Var.l, bool6), Intrinsics.d(wrdVar.X2.m, bool6));
        boolean zD38 = Intrinsics.d(wrdVar.u.i, bool6);
        boolean zD39 = Intrinsics.d(wrdVar.v.j, bool6);
        boolean zD40 = Intrinsics.d(wrdVar.w.k, bool6);
        String str12 = wrdVar.B.p;
        x6j0 x6j0Var = new x6j0(str12 == null ? "" : str12, zD38, zD39, zD40, Intrinsics.d(wrdVar.S2.h, bool6), Intrinsics.d(wrdVar.a3.p, bool6));
        ucq ucqVar = new ucq(Intrinsics.d(wrdVar.O1.f4701a, bool6), Intrinsics.d(wrdVar.P1.b, bool6), Intrinsics.d(wrdVar.T1.f, bool6), Intrinsics.d(wrdVar.V1.h, bool6), Intrinsics.d(wrdVar.W1.i, bool6), Intrinsics.d(wrdVar.X1.j, bool6), Intrinsics.d(wrdVar.Y1.k, bool6), Intrinsics.d(wrdVar.Z1.l, bool6), Intrinsics.d(wrdVar.Q1.c, bool6), Intrinsics.d(wrdVar.R1.d, bool6), Intrinsics.d(wrdVar.S1.e, bool6), Intrinsics.d(wrdVar.b2.m, bool6), Intrinsics.d(wrdVar.c2.n, bool6), Intrinsics.d(wrdVar.d2.o, bool6), Intrinsics.d(wrdVar.e2.p, bool6), Intrinsics.d(wrdVar.f2.q, bool6), Intrinsics.d(wrdVar.U1.g, bool6));
        mum0 mum0VarS = ltt0.s(wrdVar);
        hdh hdhVar = new hdh(Intrinsics.d(ujgVar.b, bool6), Intrinsics.d(wrdVar.h7.d, bool6), Intrinsics.d(wrdVar.e7.f35777a, bool6), Intrinsics.d(wrdVar.i7.e, bool6));
        boolean zD41 = Intrinsics.d(ujgVar.b, bool6);
        boolean zD42 = Intrinsics.d(wrdVar.g7.c, bool6);
        boolean zD43 = Intrinsics.d(wrdVar.I7.s, bool6);
        String str13 = wrdVar.L4.b;
        if (str13 == null) {
            str13 = "rectangleHorizontal";
        }
        String str14 = str13;
        boolean zD44 = Intrinsics.d(wrdVar.j6.A0, bool6);
        Integer num2 = wrdVar.l7.i;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List list2 = wrdVar.m7.j;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = list2;
        List list4 = wrdVar.n7.k;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        List list5 = list4;
        List list6 = wrdVar.o7.l;
        if (list6 == null) {
            list6 = iun.f15405a;
        }
        List list7 = list6;
        String str15 = wrdVar.B5.S;
        vbb0[] vbb0VarArrValues = vbb0.values();
        int length4 = vbb0VarArrValues.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length4) {
                gx7Var = gx7Var2;
                vbb0Var = null;
                break;
            }
            vbb0Var = vbb0VarArrValues[i6];
            gx7Var = gx7Var2;
            if (vbb0Var.f37134a.equals(str15)) {
                break;
            }
            i6++;
            gx7Var2 = gx7Var;
        }
        if (vbb0Var == null) {
            vbb0Var = vbb0.SQUARE_S;
        }
        vbb0 vbb0Var2 = vbb0Var;
        String str16 = wrdVar.C5.T;
        cbe0[] cbe0VarArrValues = cbe0.values();
        int length5 = cbe0VarArrValues.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length5) {
                cbe0Var = null;
                break;
            }
            cbe0Var = cbe0VarArrValues[i7];
            if (cbe0Var.f4058a.equals(str16)) {
                break;
            }
            i7++;
        }
        if (cbe0Var == null) {
            cbe0Var = cbe0.SQUARE_S;
        }
        cbe0 cbe0Var2 = cbe0Var;
        String str17 = wrdVar.D5.U;
        nnu0[] nnu0VarArrValues = nnu0.values();
        int length6 = nnu0VarArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length6) {
                nnu0Var = null;
                break;
            }
            nnu0Var = nnu0VarArrValues[i8];
            if (nnu0Var.f23842a.equals(str17)) {
                break;
            }
            i8++;
        }
        if (nnu0Var == null) {
            nnu0Var = nnu0.SQUARE_S;
        }
        nnu0 nnu0Var2 = nnu0Var;
        Integer num3 = wrdVar.T5.k0;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        String str18 = wrdVar.V5.m0;
        g5h[] g5hVarArrValues = g5h.values();
        int length7 = g5hVarArrValues.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length7) {
                g5hVar = null;
                break;
            }
            g5hVar = g5hVarArrValues[i9];
            if (g5hVar.f10717a.equals(str18)) {
                break;
            }
            i9++;
        }
        if (g5hVar == null) {
            g5hVar = g5h.DEFAULT;
        }
        g5h g5hVar2 = g5hVar;
        List list8 = wrdVar.p7.m;
        if (list8 == null) {
            list8 = iun.f15405a;
        }
        List list9 = list8;
        String str19 = wrdVar.W5.n0;
        n2o[] n2oVarArrValues = n2o.values();
        int length8 = n2oVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length8) {
                n2oVar = null;
                break;
            }
            n2oVar = n2oVarArrValues[i10];
            if (n2oVar.f22811a.equals(str19)) {
                break;
            }
            i10++;
        }
        if (n2oVar == null) {
            n2oVar = n2o.DEFAULT;
        }
        ech echVar = new ech(hdhVar, zD41, zD42, zD43, str14, zD44, iIntValue2, list3, list5, list7, vbb0Var2, cbe0Var2, nnu0Var2, iIntValue3, g5hVar2, list9, n2oVar);
        Boolean bool8 = wrdVar.h2.s;
        Boolean bool9 = Boolean.TRUE;
        boolean zD45 = Intrinsics.d(bool8, bool9);
        boolean zD46 = Intrinsics.d(wrdVar.i2.t, bool9);
        boolean zD47 = Intrinsics.d(wrdVar.m2.x, bool9);
        boolean zD48 = Intrinsics.d(wrdVar.n2.y, bool9);
        boolean zD49 = Intrinsics.d(wrdVar.u2.G, bool9);
        boolean zD50 = Intrinsics.d(wrdVar.v2.I, bool9);
        boolean zD51 = Intrinsics.d(wrdVar.w2.J, bool9);
        boolean zD52 = Intrinsics.d(wrdVar.j3.y, bool9);
        boolean zD53 = Intrinsics.d(wrdVar.r6.f9546a, bool9);
        boolean zD54 = Intrinsics.d(wrdVar.s6.b, bool9);
        boolean zD55 = Intrinsics.d(wrdVar.t6.c, bool9);
        boolean zD56 = Intrinsics.d(wrdVar.u6.d, bool9);
        boolean zD57 = Intrinsics.d(wrdVar.v6.e, bool9);
        boolean zD58 = Intrinsics.d(wrdVar.w6.f, bool9);
        boolean zD59 = Intrinsics.d(wrdVar.x6.g, bool9);
        boolean zD60 = Intrinsics.d(wrdVar.y6.h, bool9);
        boolean zD61 = Intrinsics.d(wrdVar.z6.i, bool9);
        boolean zD62 = Intrinsics.d(wrdVar.C2.R, bool9);
        boolean zD63 = Intrinsics.d(wrdVar.A6.j, bool9);
        List list10 = wrdVar.D2.U;
        if (list10 == null) {
            list10 = iun.f15405a;
        }
        f3c0 f3c0Var = new f3c0(zD51, zD45, zD46, zD48, zD49, zD50, zD47, zD52, zD53, zD54, zD55, zD56, zD57, zD58, zD59, zD60, zD61, zD63, zD62, list10, Intrinsics.d(wrdVar.Q0.E0, bool9), Intrinsics.d(wrdVar.R0.F0, bool9), Intrinsics.d(wrdVar.Z6.f, bool9));
        toc0 toc0Var = new toc0(Intrinsics.d(wrdVar.M.A, bool9), Intrinsics.d(wrdVar.q4.f, bool9), Intrinsics.d(wrdVar.r4.g, bool9), Intrinsics.d(wrdVar.s4.h, bool9), Intrinsics.d(wrdVar.t4.i, bool9), Intrinsics.d(wrdVar.u4.j, bool9), Intrinsics.d(wrdVar.q0.e0, bool9), Intrinsics.d(wrdVar.r0.f0, bool9), Intrinsics.d(wrdVar.P2.e, bool9), Intrinsics.d(wrdVar.Q2.f, bool9), Intrinsics.d(wrdVar.R2.g, bool9), Intrinsics.d(wrdVar.V2.k, bool9), Intrinsics.d(wrdVar.M2.b, bool9), Intrinsics.d(wrdVar.I0.w0, bool9), Intrinsics.d(wrdVar.N.B, bool9), Intrinsics.d(wrdVar.O.C, bool9), Intrinsics.d(wrdVar.L0.z0, bool9), Intrinsics.d(wrdVar.q7.f30502a, bool9), Intrinsics.d(wrdVar.k3.z, bool9), Intrinsics.d(wrdVar.l3.A, bool9), Intrinsics.d(wrdVar.v4.k, bool9), Intrinsics.d(wrdVar.w4.l, bool9), Intrinsics.d(wrdVar.W0.K0, bool9), Intrinsics.d(wrdVar.X0.L0, bool9), Intrinsics.d(wrdVar.M0.A0, bool9));
        boolean zD64 = Intrinsics.d(wrdVar.v3.f26581a, bool9);
        boolean zD65 = Intrinsics.d(wrdVar.w3.b, bool9);
        boolean zD66 = Intrinsics.d(wrdVar.x3.c, bool9);
        boolean zD67 = Intrinsics.d(wrdVar.y3.d, bool9);
        boolean zD68 = Intrinsics.d(wrdVar.D3.i, bool9);
        boolean zD69 = Intrinsics.d(wrdVar.E3.j, bool9);
        boolean zD70 = Intrinsics.d(wrdVar.F3.k, bool9);
        boolean zD71 = Intrinsics.d(wrdVar.G3.l, bool9);
        boolean zD72 = Intrinsics.d(wrdVar.H3.m, bool9);
        boolean zD73 = Intrinsics.d(wrdVar.z3.e, bool9);
        String str20 = wrdVar.A3.f;
        String str21 = str20 == null ? "" : str20;
        String str22 = wrdVar.B3.g;
        String str23 = str22 == null ? "" : str22;
        boolean zD74 = Intrinsics.d(wrdVar.h4.f, bool9);
        boolean zD75 = Intrinsics.d(wrdVar.I3.n, bool9);
        boolean zD76 = Intrinsics.d(wrdVar.K3.p, bool9);
        boolean zD77 = Intrinsics.d(wrdVar.N3.s, bool9);
        boolean zD78 = Intrinsics.d(wrdVar.P3.u, bool9);
        boolean zD79 = Intrinsics.d(wrdVar.R3.w, bool9);
        boolean zD80 = Intrinsics.d(wrdVar.d4.b, bool9);
        Intrinsics.d(wrdVar.e4.c, bool9);
        String str24 = wrdVar.C3.h;
        String str25 = str24 == null ? "" : str24;
        String str26 = wrdVar.f4.d;
        String str27 = str26 == null ? "" : str26;
        String str28 = wrdVar.J3.o;
        String str29 = str28 == null ? "" : str28;
        String str30 = wrdVar.L3.q;
        String str31 = str30 == null ? "" : str30;
        String str32 = wrdVar.M3.r;
        String str33 = str32 == null ? "" : str32;
        String str34 = wrdVar.O3.t;
        String str35 = str34 == null ? "" : str34;
        String str36 = wrdVar.Q3.v;
        String str37 = str36 == null ? "" : str36;
        String str38 = wrdVar.S3.x;
        String str39 = str38 == null ? "" : str38;
        String str40 = wrdVar.o3.D;
        String str41 = str40 == null ? "" : str40;
        boolean zD81 = Intrinsics.d(wrdVar.T3.y, bool9);
        String str42 = wrdVar.W3.B;
        String str43 = str42 == null ? "" : str42;
        boolean zD82 = Intrinsics.d(wrdVar.X3.C, bool9);
        String str44 = wrdVar.Y3.D;
        String str45 = str44 == null ? "" : str44;
        boolean zD83 = Intrinsics.d(wrdVar.Z3.E, bool9);
        String str46 = wrdVar.a4.F;
        o9x o9xVar = new o9x(zD64, zD65, zD66, zD67, zD68, zD69, zD70, zD71, zD72, zD73, str21, str23, zD74, zD75, zD76, zD77, zD78, zD79, zD80, str25, str27, str29, str31, str33, str35, str37, str39, str41, zD81, str43, zD82, str45, zD83, str46 == null ? "" : str46, Intrinsics.d(wrdVar.b4.G, bool9));
        boolean zD84 = Intrinsics.d(wrdVar.q.e, bool9);
        boolean zD85 = Intrinsics.d(wrdVar.s7.q, bool9);
        boolean zD86 = Intrinsics.d(wrdVar.r.f, bool9);
        boolean zD87 = Intrinsics.d(wrdVar.y0.m0, bool9);
        List list11 = wrdVar.z0.n0;
        if (list11 == null) {
            list11 = iun.f15405a;
        }
        String str47 = wrdVar.A0.o0;
        if (str47 == null) {
            str47 = "";
        }
        boolean zD88 = Intrinsics.d(wrdVar.U.I, bool9);
        boolean zD89 = Intrinsics.d(wrdVar.V.J, bool9);
        boolean zD90 = Intrinsics.d(wrdVar.W.K, bool9);
        boolean zD91 = Intrinsics.d(wrdVar.g2.r, bool9);
        boolean zD92 = Intrinsics.d(wrdVar.c0.Q, bool9);
        boolean zD93 = Intrinsics.d(wrdVar.d0.R, bool9);
        boolean zD94 = Intrinsics.d(wrdVar.j0.X, bool9);
        boolean zD95 = Intrinsics.d(wrdVar.k0.Y, bool9);
        boolean zD96 = Intrinsics.d(wrdVar.s0.g0, bool9);
        boolean zD97 = Intrinsics.d(wrdVar.t0.h0, bool9);
        boolean zD98 = Intrinsics.d(wrdVar.u0.i0, bool9);
        boolean zD99 = Intrinsics.d(wrdVar.v0.j0, bool9);
        boolean zD100 = Intrinsics.d(wrdVar.w0.k0, bool9);
        List list12 = wrdVar.x0.l0;
        if (list12 == null) {
            list12 = iun.f15405a;
        }
        co4 co4VarT = ffb0.T(wrdVar);
        List list13 = list12;
        boolean zD101 = Intrinsics.d(wrdVar.L2.f20346a, bool9);
        boolean zD102 = Intrinsics.d(wrdVar.T2.i, bool9);
        boolean zD103 = Intrinsics.d(wrdVar.B0.p0, bool9);
        boolean zD104 = Intrinsics.d(wrdVar.C0.q0, bool9);
        boolean zD105 = Intrinsics.d(wrdVar.D0.r0, bool9);
        boolean zD106 = Intrinsics.d(ns10Var.t0, bool9);
        rib0 rib0VarZ = Z(wrdVar);
        dq00 dq00VarM = q8x.M(wrdVar);
        String str48 = wrdVar.B6.f33309a;
        String str49 = str48 == null ? "" : str48;
        String str50 = wrdVar.F6.e;
        if (str50 == null) {
            str50 = "";
        }
        boolean zD107 = Intrinsics.d(ns10Var2.W, bool9);
        puy puyVar = wrdVar.n.b;
        String str51 = puyVar != null ? zdx.J(puyVar).c : "en_GB";
        lc00 lc00VarB = kotlin.collections.a.b();
        String str52 = str50;
        lc00VarB.add(csj0.HISTORY_SHORTCUT);
        lc00VarB.add(csj0.LINE_SHORTCUT);
        lc00VarB.add(csj0.LIVE_SHORTCUT);
        if (Intrinsics.d(lnh0Var.l, bool9)) {
            lc00VarB.add(csj0.ONE_X_GAMES_SHORTCUT);
        }
        if (Intrinsics.d(ujgVar.b, bool9)) {
            lc00VarB.add(csj0.CYBER_SPORT_SHORTCUT);
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        boolean zD108 = Intrinsics.d(wrdVar.B2.Q, bool9);
        boolean zD109 = Intrinsics.d(wrdVar.r7.b, bool9);
        boolean zD110 = Intrinsics.d(wrdVar.o0.c0, bool9);
        boolean zD111 = Intrinsics.d(wrdVar.b7.h, bool9);
        boolean zD112 = Intrinsics.d(wrdVar.c7.i, bool9);
        Integer num4 = wrdVar.n3.C;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        boolean zD113 = Intrinsics.d(wrdVar.g4.e, bool9);
        boolean zD114 = Intrinsics.d(wrdVar.i4.g, bool9);
        boolean zD115 = Intrinsics.d(wrdVar.j4.h, bool9);
        boolean zD116 = Intrinsics.d(wrdVar.k4.i, bool9);
        boolean zD117 = Intrinsics.d(wrdVar.c4.f44957a, bool9);
        boolean zD118 = Intrinsics.d(wrdVar.A7.j, bool9);
        boolean zD119 = Intrinsics.d(wrdVar.v7.e, bool9);
        List list14 = wrdVar.E2.V;
        if (list14 == null) {
            list14 = iun.f15405a;
        }
        List list15 = list14;
        List listG = wrdVar.F2.W;
        if (listG == null) {
            listG = q3d.g();
        }
        List list16 = listG;
        boolean zD120 = Intrinsics.d(wrdVar.w7.f, bool9);
        String str53 = wrdVar.R6.r;
        String str54 = str53 == null ? "" : str53;
        boolean zD121 = Intrinsics.d(wrdVar.N0.B0, bool9);
        Boolean bool10 = wrdVar.O0.C0;
        boolean zBooleanValue = bool10 != null ? bool10.booleanValue() : false;
        boolean zD122 = Intrinsics.d(wrdVar.P0.D0, bool9);
        boolean zD123 = Intrinsics.d(wrdVar.a7.g, bool9);
        boolean zD124 = Intrinsics.d(wrdVar.S0.G0, bool9);
        boolean zD125 = Intrinsics.d(wrdVar.T0.H0, bool9);
        boolean zD126 = Intrinsics.d(wrdVar.U0.I0, bool9);
        boolean zD127 = Intrinsics.d(wrdVar.U6.f19577a, bool9);
        boolean zD128 = Intrinsics.d(wrdVar.V6.b, bool9);
        boolean zD129 = Intrinsics.d(wrdVar.W6.c, bool9);
        boolean zD130 = Intrinsics.d(wrdVar.X6.d, bool9);
        boolean zD131 = Intrinsics.d(wrdVar.Y6.e, bool9);
        boolean zD132 = Intrinsics.d(wrdVar.V0.J0, bool9);
        boolean zD133 = Intrinsics.d(wrdVar.U3.z, bool9);
        boolean zD134 = Intrinsics.d(wrdVar.Y2.n, bool9);
        boolean zD135 = Intrinsics.d(wrdVar.Z2.o, bool9);
        boolean zD136 = Intrinsics.d(wrdVar.V3.A, bool9);
        boolean zD137 = Intrinsics.d(wrdVar.j7.f, bool9);
        boolean zD138 = Intrinsics.d(wrdVar.k7.h, bool9);
        boolean zD139 = Intrinsics.d(wrdVar.Y0.M0, bool9);
        boolean zD140 = Intrinsics.d(wrdVar.Z0.N0, bool9);
        boolean zD141 = Intrinsics.d(wrdVar.c1.Q0, bool9);
        Long l3 = wrdVar.d1.R0;
        long jLongValue3 = l3 != null ? l3.longValue() : 180L;
        Boolean bool11 = wrdVar.e1.S0;
        boolean zBooleanValue2 = bool11 != null ? bool11.booleanValue() : false;
        Boolean bool12 = wrdVar.g1.U0;
        boolean zBooleanValue3 = bool12 != null ? bool12.booleanValue() : false;
        Boolean bool13 = wrdVar.h1.V0;
        boolean zBooleanValue4 = bool13 != null ? bool13.booleanValue() : false;
        boolean zD142 = Intrinsics.d(wrdVar.G2.X, bool9);
        boolean zD143 = Intrinsics.d(wrdVar.H2.Y, bool9);
        boolean zD144 = Intrinsics.d(wrdVar.g6.x0, bool9);
        boolean zD145 = Intrinsics.d(wrdVar.h6.y0, bool9);
        boolean zD146 = Intrinsics.d(wrdVar.i6.z0, bool9);
        boolean zD147 = Intrinsics.d(wrdVar.i1.W0, bool9);
        hh3 hh3VarD0 = hmw0.d0(wrdVar);
        tm3 tm3VarO = cfx0.O(wrdVar);
        String str55 = wrdVar.Q4.g;
        jao0[] jao0VarArrValues = jao0.values();
        int length9 = jao0VarArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length9) {
                jao0Var = null;
                break;
            }
            int i12 = i11;
            jao0Var = jao0VarArrValues[i12];
            int i13 = length9;
            if (jao0Var.f16200a.equals(str55)) {
                break;
            }
            i11 = i12 + 1;
            length9 = i13;
        }
        if (jao0Var == null) {
            jao0Var = jao0.MAIN_BUTTON_ACCENT;
        }
        boolean zD148 = Intrinsics.d(wrdVar.U4.k, bool9);
        List listL = wrdVar.L();
        if (listL != null) {
            G = new ArrayList(r3d.q(listL, 10));
            Iterator it = listL.iterator();
            while (it.hasNext()) {
                G.add(idx.V((String) it.next()));
            }
        } else {
            G = 0;
        }
        if (G == 0) {
            G = q3d.g();
        }
        ?? r105 = G;
        zuc0 zuc0VarE0 = b5x.e0(wrdVar.M());
        Boolean boolN = wrdVar.N();
        Boolean bool14 = Boolean.TRUE;
        boolean zD149 = Intrinsics.d(boolN, bool14);
        boolean zD150 = Intrinsics.d(wrdVar.i(), bool14);
        boolean zD151 = Intrinsics.d(wrdVar.r(), bool14);
        boolean zD152 = Intrinsics.d(wrdVar.t(), bool14);
        Long lK = wrdVar.K();
        long jLongValue4 = lK != null ? lK.longValue() : 60L;
        List listH0 = wrdVar.h0();
        if (listH0 == null) {
            listH0 = q3d.g();
        }
        List list17 = listH0;
        boolean zD153 = Intrinsics.d(wrdVar.W(), bool14);
        boolean zD154 = Intrinsics.d(wrdVar.k(), bool14);
        Boolean boolQ = wrdVar.q();
        boolean zBooleanValue5 = boolQ != null ? boolQ.booleanValue() : false;
        boolean zD155 = Intrinsics.d(wrdVar.h(), bool14);
        Boolean boolG0 = wrdVar.g0();
        boolean zBooleanValue6 = boolG0 != null ? boolG0.booleanValue() : false;
        Boolean boolQ2 = wrdVar.Q();
        boolean zBooleanValue7 = boolQ2 != null ? boolQ2.booleanValue() : false;
        boolean zD156 = Intrinsics.d(wrdVar.V(), bool14);
        udl0 udl0VarK = q7x.K(wrdVar.g());
        Boolean boolS = wrdVar.S();
        boolean zBooleanValue8 = boolS != null ? boolS.booleanValue() : true;
        Boolean boolT = wrdVar.T();
        boolean zBooleanValue9 = boolT != null ? boolT.booleanValue() : false;
        boolean zD157 = Intrinsics.d(wrdVar.F(), bool14);
        boolean zD158 = Intrinsics.d(wrdVar.E(), bool14);
        boolean zD159 = Intrinsics.d(wrdVar.C(), bool14);
        List listA = wrdVar.A();
        if (listA == null) {
            listA = q3d.g();
        }
        List list18 = listA;
        List listB = wrdVar.b();
        if (listB == null) {
            listB = q3d.g();
        }
        List list19 = listB;
        boolean zD160 = Intrinsics.d(wrdVar.O(), bool14);
        boolean zD161 = Intrinsics.d(wrdVar.P(), bool14);
        List listC = wrdVar.c();
        if (listC == null) {
            listC = q3d.g();
        }
        List list20 = listC;
        String strV = wrdVar.v();
        yfw[] yfwVarArrValues = yfw.values();
        jao0 jao0Var2 = jao0Var;
        int length10 = yfwVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length10) {
                yfwVar = null;
                break;
            }
            yfwVar = yfwVarArrValues[i14];
            int i15 = length10;
            if (Intrinsics.d(yfwVar.getValue(), strV)) {
                break;
            }
            i14++;
            length10 = i15;
        }
        if (yfwVar == null) {
            yfwVar = yfw.DEFAULT;
        }
        yfw yfwVar2 = yfwVar;
        String strX = wrdVar.x();
        String string = strX != null ? StringsKt.u0(strX).toString() : null;
        if (string == null) {
            string = "";
        }
        String strW = wrdVar.w();
        String string2 = strW != null ? StringsKt.u0(strW).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        zfw zfwVar = new zfw(yfwVar2, string, string2);
        Long lJ = wrdVar.J();
        long jLongValue5 = lJ != null ? lJ.longValue() : 10L;
        Boolean boolD0 = wrdVar.d0();
        boolean zBooleanValue10 = boolD0 != null ? boolD0.booleanValue() : false;
        String strR = wrdVar.R();
        long j = jLongValue5;
        k8l0[] k8l0VarArrValues = k8l0.values();
        int length11 = k8l0VarArrValues.length;
        int i16 = 0;
        while (i16 < length11) {
            k8l0 k8l0Var2 = k8l0VarArrValues[i16];
            int i17 = i16;
            if (Intrinsics.d(k8l0Var2.getValue(), strR)) {
                k8l0Var = k8l0Var2;
                break;
            }
            i16 = i17 + 1;
        }
        if (k8l0Var == null) {
            k8l0Var = k8l0.None;
        }
        Boolean boolG = wrdVar.G();
        Boolean bool15 = Boolean.TRUE;
        boolean zD162 = Intrinsics.d(boolG, bool15);
        Boolean boolN2 = wrdVar.n();
        boolean zBooleanValue11 = boolN2 != null ? boolN2.booleanValue() : false;
        Integer numE = wrdVar.e();
        int iIntValue5 = numE != null ? numE.intValue() : 0;
        Integer numH = wrdVar.H();
        int iIntValue6 = numH != null ? numH.intValue() : 0;
        Integer numI = wrdVar.I();
        int iIntValue7 = numI != null ? numI.intValue() : 0;
        Boolean boolX = wrdVar.X();
        boolean zBooleanValue12 = boolX != null ? boolX.booleanValue() : false;
        Boolean boolU = wrdVar.u();
        boolean zBooleanValue13 = boolU != null ? boolU.booleanValue() : false;
        String strY = wrdVar.y();
        String str56 = strY == null ? "" : strY;
        Boolean boolC0 = wrdVar.c0();
        boolean zBooleanValue14 = boolC0 != null ? boolC0.booleanValue() : false;
        Boolean boolD = wrdVar.d();
        boolean zBooleanValue15 = boolD != null ? boolD.booleanValue() : false;
        Boolean boolB = wrdVar.B();
        boolean zBooleanValue16 = boolB != null ? boolB.booleanValue() : false;
        oxk0 oxk0VarR = n7x.R(wrdVar.U());
        Boolean boolE0 = wrdVar.e0();
        boolean zBooleanValue17 = boolE0 != null ? boolE0.booleanValue() : false;
        boolean zD163 = Intrinsics.d(wrdVar.m(), bool15);
        Boolean boolA = wrdVar.a();
        boolean zBooleanValue18 = boolA != null ? boolA.booleanValue() : false;
        Boolean boolJ = wrdVar.j();
        boolean zBooleanValue19 = boolJ != null ? boolJ.booleanValue() : false;
        Boolean boolO = wrdVar.o();
        boolean zBooleanValue20 = boolO != null ? boolO.booleanValue() : true;
        Boolean boolF0 = wrdVar.f0();
        boolean zBooleanValue21 = boolF0 != null ? boolF0.booleanValue() : false;
        String strF = wrdVar.f();
        if (strF == null) {
            strF = "typeDecimal";
        }
        String str57 = strF;
        boolean zD164 = Intrinsics.d(wrdVar.D(), bool15);
        boolean zD165 = Intrinsics.d(wrdVar.Y(), bool15);
        boolean zD166 = Intrinsics.d(wrdVar.Z(), bool15);
        Boolean boolI0 = wrdVar.i0();
        boolean zBooleanValue22 = boolI0 != null ? boolI0.booleanValue() : false;
        Boolean boolP = wrdVar.p();
        boolean zBooleanValue23 = boolP != null ? boolP.booleanValue() : false;
        Boolean boolA0 = wrdVar.a0();
        boolean zBooleanValue24 = boolA0 != null ? boolA0.booleanValue() : false;
        Boolean boolB0 = wrdVar.b0();
        boolean zBooleanValue25 = boolB0 != null ? boolB0.booleanValue() : false;
        boolean zD167 = Intrinsics.d(wrdVar.s(), bool15);
        Boolean boolL = wrdVar.l();
        boolean zBooleanValue26 = boolL != null ? boolL.booleanValue() : false;
        String strZ = wrdVar.z();
        return new sff0(gx7Var, hl1VarU0, echVar, q1w0Var, x6j0Var, ucqVar, mum0VarS, zD137, zD138, zD85, f3c0Var, toc0Var, o9xVar, zD84, zD86, zD87, list11, str47, zD88, zD89, zD90, zD91, zD92, zD93, zD94, zD95, zD96, zD98, zD99, zD100, list13, zD101, zD102, zD103, zD104, zD105, zD106, rib0VarZ, dq00VarM, co4VarT, str49, str52, zD107, lc00VarA, str51, zD108, zD109, zD110, zD111, zD112, iIntValue4, zD113, zD114, zD115, zD116, zD117, zD118, zD119, list15, list16, zD120, str54, zD121, zBooleanValue, zD122, zD123, zD124, zD125, zD126, zD127, zD128, zD129, zD130, zD131, zD132, zD133, zD134, zD135, zD136, zD97, zD153, zD139, zD140, zD141, jLongValue3, zBooleanValue2, zBooleanValue3, zBooleanValue4, zD142, zD143, zD144, zD145, zD146, zD147, hh3VarD0, tm3VarO, jao0Var2, zD148, r105, zuc0VarE0, zD149, zD150, zD151, zD152, jLongValue4, list17, zD154, zBooleanValue5, zD155, zBooleanValue6, zBooleanValue7, udl0VarK, zD156, zBooleanValue8, zBooleanValue9, zD157, zD158, zD159, list18, list19, zD160, zD161, list20, zfwVar, j, zBooleanValue10, k8l0Var, zD162, zBooleanValue11, iIntValue5, iIntValue6, iIntValue7, zBooleanValue12, zBooleanValue13, str56, zBooleanValue14, zBooleanValue15, zBooleanValue16, oxk0VarR, zBooleanValue17, zD163, zBooleanValue18, zBooleanValue19, zBooleanValue20, zBooleanValue21, str57, zD164, zD165, zD166, zBooleanValue22, zBooleanValue23, zBooleanValue24, zBooleanValue25, zD167, zBooleanValue26, strZ == null ? "" : strZ);
    }

    public static final void c(di40 di40Var, float f, fet fetVar, int i) {
        fetVar.g0(113035713);
        int i2 = (fetVar.g(di40Var) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_mobile_legends, 0, fetVar);
            androidx.compose.runtime.d dVar = m8m0.f21378a;
            oil oilVarT = ju70.T(pm80VarF, new m78(((StaticColors) fetVar.k(dVar)).m70getBlack200d7_KjU(), 5), null, 10);
            Object obj = di40Var.f6123a;
            long jM62getBlack0d7_KjU = di40Var.d;
            boolean zG = fetVar.g(obj);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objA = di40Var.f6123a.a();
            boolean zG2 = fetVar.g(pz40Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj2) {
                objP2 = new y9v(pz40Var, (byte) 19);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zG3 = fetVar.g(pz40Var);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj2) {
                objP3 = new y9v(pz40Var, (byte) 20);
                fetVar.o0(objP3);
            }
            pge pgeVar = gqw0.A;
            mz3 mz3VarY = l7x.Y(objA, oilVarT, oilVarT, oilVarT, function1, (Function1) objP3, fetVar, 12587584, 272);
            float f2 = di40Var.b / 100.0f;
            float f3 = di40Var.c / 100.0f;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(G(f2, f3, 24.0f, f), 24.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = lgb.J(s5x0.J(i120.S(mm40VarN, 2.0f, jM62getBlack0d7_KjU, ugg0Var), 2.0f), ugg0Var);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar.e0(1253175974);
                jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(dVar)).m62getBlack0d7_KjU();
            } else {
                fetVar.e0(1253176486);
            }
            fetVar.r(false);
            j0x.b(mz3VarY, null, i120.Q(mm40VarJ, jM62getBlack0d7_KjU, jd8.n), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rx7((byte) 3, f, i, di40Var);
        }
    }

    public static final zxj0 c0(dao daoVar) {
        daoVar.getClass();
        long j = daoVar.c;
        sh7 sh7Var = daoVar.m;
        return new zxj0(j, sh7Var.f32198a, daoVar.l, sh7Var.b, daoVar.k, daoVar.d, daoVar.f, daoVar.i, daoVar.q, daoVar.b, daoVar.e, daoVar.s, yfa0.INSTANCE);
    }

    public static final void d(ci40 ci40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        long jM129getWhite400d7_KjU;
        fetVar.g0(-1818723524);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ci40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 52.0f), 58.0f);
            zfn zfnVar = m8m0.f21378a;
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.S(mm40VarE, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 8.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            pm80 pm80VarF = a8k0.F(ci40Var.f4394a, 0, fetVar);
            if (ci40Var.c) {
                fetVar.e0(-3296917);
                jM129getWhite400d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            } else {
                fetVar.e0(-3295795);
                jM129getWhite400d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m129getWhite400d7_KjU();
            }
            fetVar.r(false);
            fetVar2 = fetVar;
            dww.c(pm80VarF, null, mm40VarN, jM129getWhite400d7_KjU, fetVar2, 56, 0);
            Long l = ci40Var.b;
            if (l == null) {
                fetVar2.e0(-102080736);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-102080735);
                t(l.longValue(), fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(ci40Var, i, (byte) 28);
        }
    }

    public static String d0(String str) {
        return kng0.l("LineStatisticScore(value=", str, Separators.RPAREN);
    }

    public static final void e(mm40 mm40Var, l7m0 l7m0Var, String str, String str2, boolean z, boolean z2, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0 l7m0Var2;
        String str3;
        boolean z3;
        mm40 mm40Var2;
        long textPrimary;
        fetVar.g0(-494999654);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= fetVar.g(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i2 |= fetVar.h(z3) ? 16384 : 8192;
        } else {
            z3 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            a8q0 a8q0Var = (a8q0) l7m0Var2.getValue();
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new qgx((byte) 21);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            Object[] objArr2 = new Object[0];
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new qgx((byte) 23);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) e9x.Q(objArr2, (Function0) objP2, fetVar, 48);
            if (z2) {
                fetVar.e0(-625650919);
                textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary60();
                fetVar.r(false);
            } else {
                fetVar.e0(-625592391);
                textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            }
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean zG = fetVar.g(pz40Var) | ((i2 & 3670016) == 1048576);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = new ua4(function1, pz40Var, null, (byte) 5);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, bool, (Function2) objP3);
            boolean z4 = z3;
            mm40Var2 = jm40Var;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1763109268, new y6y(str2, textPrimary, a8q0Var, pz40Var, pz40Var2, function2, function1, z4, str3, (byte) 0), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z6y(mm40Var2, l7m0Var2, str, str2, z, z2, function1, function2, i, (byte) 0);
        }
    }

    public static final void f(mm40 mm40Var, qx6 qx6Var, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        jx6 jx6Var = qx6Var.d;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        fetVar.g0(124640323);
        int i2 = i | 6 | (fetVar.g(qx6Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = epv0.N(s5x0.L(jm40Var, 16.0f, 0.0f, 2), jx6Var == jx6.c ? 0.5f : 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            b(null, qx6Var.f29465a, jx6Var, qx6Var.c, qx6Var.b, qx6Var.e, function1, function0, function2, fetVar, (i2 << 12) & 267911168);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var2, (Object) qx6Var, (Object) function1, (Object) function0, (Object) function2, i, (byte) 1);
        }
    }

    public static final void g(Object obj, int i, qbz qbzVar, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(qbzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zG = fetVar.g(obj) | fetVar.g(qbzVar);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = new pbz(obj, qbzVar);
                fetVar.o0(objP);
            }
            pbz pbzVar = (pbz) objP;
            pbzVar.c = i;
            pz40 pz40Var = pbzVar.g;
            androidx.compose.runtime.d dVar = hu90.f13669a;
            pbz pbzVar2 = (pbz) fetVar.k(dVar);
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                if (pbzVar2 != ((pbz) ((hgk0) pz40Var).getValue())) {
                    ((hgk0) pz40Var).setValue(pbzVar2);
                    if (pbzVar.d > 0) {
                        pbz pbzVar3 = pbzVar.e;
                        if (pbzVar3 != null) {
                            pbzVar3.b();
                        }
                        if (pbzVar2 != null) {
                            pbzVar2.a();
                        } else {
                            pbzVar2 = null;
                        }
                        pbzVar.e = pbzVar2;
                    }
                }
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                boolean zG2 = fetVar.g(pbzVar);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj2) {
                    objP2 = new r39(pbzVar, (byte) 2);
                    fetVar.o0(objP2);
                }
                m0x0.o(pbzVar, (Function1) objP2, fetVar);
                obc.d(dVar.a(pbzVar), ugdVar, fetVar, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th;
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6(obj, i, (Object) qbzVar, ugdVar, i2, (byte) 4);
        }
    }

    public static final void h(mm40 mm40Var, tx6 tx6Var, jx6 jx6Var, String str, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(952392022);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(tx6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(jx6Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        boolean z2 = true;
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 22.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            pz40 pz40Var = tx6Var.f34681a;
            String str2 = tx6Var.b;
            if (jx6Var == jx6.c) {
                z2 = false;
            }
            boolean z3 = (i2 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new i1y(function1, (byte) 8);
                fetVar.o0(objP);
            }
            int i3 = i2 & 7168;
            int i4 = i2 << 3;
            e(null, pz40Var, str2, str, z2, z, (Function1) objP, function2, fetVar, i3 | (458752 & i4) | (i4 & 29360128));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, (Object) tx6Var, (Enum) jx6Var, str, z, function1, function2, i, (byte) 13);
        }
    }

    public static final void i(mm40 mm40Var, li40 li40Var, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1498893770);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(li40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarO = ny9.O(1.0f, o7k0.g(mm40Var, 0.0f, 384.0f, 1), false);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            fetVar2 = fetVar;
            nnw0.g(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO), ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU(), jd8.n), null, false, u1c.M(2086078368, new un6(li40Var, b), fetVar), fetVar2, 3072, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var, li40Var, i, (byte) 9);
        }
    }

    public static final void j(final int i, final long j, final float f, final float f2, final float f3, final float f4, fet fetVar, final int i2) {
        int i3;
        fetVar.g0(-1645721762);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.d(f4) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            dww.c(a8k0.F(i, i3 & 14, fetVar), null, o7k0.n(G(f2, f3, f, f4), f), j, fetVar, 56 | ((i3 << 6) & 7168), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ei40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    x9x.j(i, j, f, f2, f3, f4, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void k(ji40 ji40Var, float f, fet fetVar, int i) {
        fetVar.g0(-456908589);
        byte b = 4;
        int i2 = (fetVar.g(ji40Var) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.e0(-1002486599);
            for (hi40 hi40Var : ji40Var.c) {
                long j = hi40Var.b;
                zcl zclVar = qmk.f28987a;
                gi40 gi40Var = hi40Var.f13096a;
                j(R.drawable.ic_glyph_cyber_ml_tower, j, 16.0f, gi40Var.c, gi40Var.d, f, fetVar, (i2 << 12) & 458752);
            }
            fetVar.r(false);
            zfn zfnVar = jjg.f16616a;
            ((ijg) fetVar.k(zfnVar)).getClass();
            long j2 = ijg.J0;
            zcl zclVar2 = qmk.f28987a;
            int i3 = ((i2 << 12) & 458752) | 27648;
            j(R.drawable.ic_glyph_cyber_ml_base, j2, 24.0f, 0.10869565f, 0.90217394f, f, fetVar, i3);
            ((ijg) fetVar.k(zfnVar)).getClass();
            j(R.drawable.ic_glyph_cyber_ml_base, ijg.l0, 24.0f, 0.8913044f, 0.097826086f, f, fetVar, i3);
            Iterator<E> it = ji40Var.b.iterator();
            while (it.hasNext()) {
                c((di40) it.next(), f, fetVar, i2 & 112);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rx7(b, f, i, ji40Var);
        }
    }

    public static final void l(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, Function1 function1, Function1 function2, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, Function1 function3, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        xdrVar3.getClass();
        function3.getClass();
        fetVar.g0(-1223167156);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(xdrVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            byte b = 0;
            c030.a(s5x0.L(i120.Q(mm40Var, backgroundContent, jd8.n), qmk.a(fetVar).d, 0.0f, 2), l7m0Var, s5x0.u(0.0f, 8.0f, 0.0f, 24.0f, 5), xczVar, u1c.M(1607931206, new vz20(xdrVar2, xdrVar3, function3, b), fetVar), u1c.M(-402017190, new wz20(function1, function2, b), fetVar), u1c.M(1131373107, new xz20(xdrVar, function1, function2, (byte) 0), fetVar), jd8.d, jd8.e, fetVar, (i2 & 112) | 115040256 | ((i2 << 3) & 7168), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yz20(mm40Var, l7m0Var, xczVar, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, i, (byte) 0);
        }
    }

    public static final void m(mm40 mm40Var, tx6 tx6Var, String str, jx6 jx6Var, String str2, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        jx6 jx6Var2;
        fetVar.g0(-254693983);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(tx6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(jx6Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = (i2 & 112) | 6;
            int i4 = i2 >> 3;
            jx6Var2 = jx6Var;
            h(o7k0.d(jm40.b, 1.0f), tx6Var, jx6Var2, str2, z, function1, function2, fetVar, (3670016 & i4) | i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4));
            B(null, str, jx6Var2, fetVar, i4 & 1008);
            fetVar.r(true);
        } else {
            jx6Var2 = jx6Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, (Object) tx6Var, str, (Enum) jx6Var2, str2, z, function1, function2, i, (byte) 11);
        }
    }

    public static final void n(mm40 mm40Var, ii40 ii40Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(797223567);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ii40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-829649457, new q2n((Object) mm40Var, pkd.d(fetVar), (Object) ii40Var, (byte) 14), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, ii40Var, i, (byte) 19);
        }
    }

    public static final void o(c280 c280Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1190856219);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(c280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            mm40 mm40VarE = o7k0.e(jm40.b, 24.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.m(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5l0(c280Var, str, i, (byte) 2);
        }
    }

    public static final void p(int i, long j, long j2, fet fetVar, c280 c280Var, c280 c280Var2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        c280 c280Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(573213333);
        int i2 = (fetVar2.f(j2) ? 536870912 : 268435456) | i | (fetVar.g(c280Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(c280Var2) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.g(str3) ? 131072 : 65536) | (fetVar2.f(j) ? 1048576 : 524288) | (fetVar2.h(z2) ? 8388608 : 4194304) | (fetVar2.g(str4) ? 67108864 : 33554432);
        if (fetVar2.U(i2 & 1, (306783379 & i2) != 306783378)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 52.0f), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            c280Var3 = c280Var;
            o(c280Var3, str, fetVar2, i2 & 126);
            o(c280Var2, str2, fetVar2, (i2 >> 6) & 126);
            fetVar2.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            v((i2 >> 12) & 1022, j, fetVar2, str3, z);
            fetVar2 = fetVar;
            v((i2 >> 21) & 1022, j2, fetVar2, str4, z2);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            c280Var3 = c280Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5l0(c280Var3, str, c280Var2, str2, z, str3, j, z2, str4, j2, i, (byte) 0);
        }
    }

    public static final void q(mm40 mm40Var, mx80 mx80Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        pge pgeVar = gqw0.B;
        mx80Var.getClass();
        fetVar.g0(1461133943);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mx80Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new t330(b);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            if (mx80Var instanceof kx80) {
                fetVar.e0(-851106261);
                j0x.b(a8k0.F(((kx80) mx80Var).f19041a, 0, fetVar), null, mm40VarQ, null, pgeVar, 0.0f, null, fetVar, 24632, 104);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                if (!(mx80Var instanceof lx80)) {
                    throw b1j.f(-304551181, fetVar2, false);
                }
                fetVar2.e0(-304542383);
                oja0.k(mm40VarQ, ((lx80) mx80Var).f20803a, null, pgeVar, null, fetVar2, 24576, 44);
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680(mm40Var, mx80Var, i, b);
        }
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(315282789);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            List listJ = q3d.j(4, 3, 1, 2, 3);
            float f = 1.0f;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 12.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            Iterator itV = kng0.v(fetVar, mm40VarC0, shdVar, 438411138, listJ);
            while (itV.hasNext()) {
                int iIntValue = ((Number) itV.next()).intValue();
                mm40 mm40VarD2 = o7k0.d(jm40.b, f);
                zcl zclVar2 = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                fetVar.e0(184797950);
                for (int i3 = 0; i3 < iIntValue; i3++) {
                    t9x.m(0, fetVar);
                }
                fetVar.r(false);
                fetVar.r(true);
                f = 1.0f;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 9);
        }
    }

    public static final void s(g110 g110Var, mm40 mm40Var, fet fetVar, int i) {
        g110Var.getClass();
        fetVar.g0(250890740);
        int i2 = i | (fetVar.g(g110Var) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mbc.f(mm40Var, 0.5f, 0.5f, u1c.M(-1714130577, new j110(g110Var, b), fetVar), u1c.M(-550549392, new j110(g110Var, (byte) 6), fetVar), u1c.M(613031793, new j110(g110Var, (byte) 7), fetVar), null, u1c.M(-1354773133, new j110(g110Var, (byte) 8), fetVar), u1c.M(-456385167, new j110(g110Var, (byte) 9), fetVar), u1c.M(707196018, new j110(g110Var, (byte) 10), fetVar), u1c.M(1870777203, new j110(g110Var, (byte) 11), fetVar), fetVar, ((i2 >> 3) & 14) | 819662208, 438, 274);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((Object) g110Var, (Object) mm40Var, i, (byte) 0);
        }
    }

    public static final void t(long j, fet fetVar, int i) {
        long j2;
        fet fetVar2;
        fetVar.g0(570467146);
        int i2 = (fetVar.f(j) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            j2 = j;
            fetVar2 = fetVar;
            yhh.a(j2, false, 0L, null, x8f.c, fetVar2, (i2 & 14) | 24624, 12);
        } else {
            j2 = j;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a21(j2, i, (byte) 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(final jgg0 jgg0Var, fet fetVar, int i) {
        pm80 i4dVar;
        pm80 i4dVar2;
        boolean z;
        boolean z2;
        jgg0 jgg0Var2 = jgg0Var;
        fet fetVar2 = fetVar;
        jgg0Var2.getClass();
        fetVar2.g0(-1189847910);
        int i2 = i | (fetVar2.g(jgg0Var2) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            ngg0 ngg0Var = jgg0Var2.b;
            ngg0 ngg0Var2 = jgg0Var2.c;
            int i3 = ngg0Var2.f23485a;
            if (ngg0Var.f23485a != 0) {
                fetVar2.e0(-393830573);
                i4dVar = a8k0.F(ngg0Var.f23485a, 0, fetVar2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-393741231);
                fetVar2.r(false);
                i4dVar = new i4d(y3d.f);
            }
            pm80 pm80Var = i4dVar;
            if (i3 != 0) {
                fetVar2.e0(-393590478);
                i4dVar2 = a8k0.F(i3, 0, fetVar2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-393500175);
                fetVar2.r(false);
                i4dVar2 = new i4d(y3d.f);
            }
            pm80 pm80Var2 = i4dVar2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "ROUND_STATISTIC_RESULT");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE1 = o2e.e0(o7k0.s(jm40Var, 24.0f), "RoundNumberTestTag");
            String str = jgg0Var2.f16478a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE1, StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.e(), fetVar, 0, 0, 130040);
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 24.0f);
            long j = ngg0Var.b;
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = o2e.e0(i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "FirstTeamImageViewTestTag");
            int i4 = i2 & 14;
            boolean z3 = i4 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                z = false;
                final Object[] objArr = 0 == true ? 1 : 0;
                objP = new Function1() { // from class: a.mgg0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b = objArr;
                        jgg0 jgg0Var3 = jgg0Var;
                        abi0 abi0Var = (abi0) obj;
                        switch (b) {
                            case 0:
                                abi0Var.getClass();
                                cbi0.a(abi0Var, jgg0Var3.b.b);
                                break;
                            default:
                                abi0Var.getClass();
                                cbi0.a(abi0Var, jgg0Var3.c.b);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            } else {
                z = false;
            }
            mm40 mm40VarA = pai0.a(mm40VarE2, z, (Function1) objP);
            pge pgeVar = gqw0.f1;
            j0x.b(pm80Var, null, mm40VarA, null, pgeVar, 0.0f, null, fetVar, 24632, 104);
            mm40 mm40VarE3 = o2e.e0(i120.Q(o7k0.n(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 24.0f), ngg0Var2.b, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "SecondTeamImageViewTestTag");
            boolean z4 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                z2 = true;
                final char c = 1 == true ? 1 : 0;
                objP2 = new Function1() { // from class: a.mgg0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b = c;
                        jgg0 jgg0Var3 = jgg0Var;
                        abi0 abi0Var = (abi0) obj;
                        switch (b) {
                            case 0:
                                abi0Var.getClass();
                                cbi0.a(abi0Var, jgg0Var3.b.b);
                                break;
                            default:
                                abi0Var.getClass();
                                cbi0.a(abi0Var, jgg0Var3.c.b);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            } else {
                z2 = true;
            }
            mm40 mm40VarA2 = pai0.a(mm40VarE3, false, (Function1) objP2);
            jgg0Var2 = jgg0Var;
            fetVar2 = fetVar;
            j0x.b(pm80Var2, null, mm40VarA2, null, pgeVar, 0.0f, null, fetVar2, 24632, 104);
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dke0(jgg0Var2, i, (byte) 20);
        }
    }

    public static final void v(int i, long j, fet fetVar, String str, boolean z) {
        int i2;
        long j2;
        fetVar.g0(1408880021);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= fetVar.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 26.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarS = o7k0.s(s5x0.N(o7k0.c(jm40Var, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (z) {
                fetVar.e0(-1126160726);
                vzb.h(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1126117481);
                fetVar.r(false);
            }
            fetVar.r(true);
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 144.0f, 1), j2, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, ((i2 >> 3) & 14) | (i2 & 896), 24960, 110576);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5l0(z, str, j, i, (byte) 0);
        }
    }

    public static final void w(mm40 mm40Var, j83 j83Var, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-2120981518);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j83Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.b(j83Var, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 18) & 234881024) | 24576, 245758);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3h0(mm40Var, j83Var, y9q0Var, i, (byte) 2);
        }
    }

    public static final void x(Function1 function1, b8j0 b8j0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        function1.getClass();
        b8j0Var.getClass();
        fetVar.g0(-89475996);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(b8j0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int length = b8j0Var.l().length();
            cl5 cl5Var = ukd.f35823a;
            if (length > 0) {
                fetVar.e0(1508535144);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = e7j0.f7330a;
                    fetVar.o0(objP);
                }
                xdr xdrVar = (xdr) ((jhy) objP);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new wvi0((byte) 19);
                    fetVar.o0(objP2);
                }
                Function1 function2 = (Function1) objP2;
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new nb(b8j0Var, function1, b2);
                    fetVar.o0(objP3);
                }
                y860.g(xdrVar, null, function2, null, (Function1) objP3, fetVar, 390, 10);
                fetVar.r(false);
            } else {
                fetVar.e0(1509379460);
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = f7j0.f9060a;
                    fetVar.o0(objP4);
                }
                xdr xdrVar2 = (xdr) ((jhy) objP4);
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = new wvi0((byte) 20);
                    fetVar.o0(objP5);
                }
                Function1 function3 = (Function1) objP5;
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objP6 = fetVar.P();
                if (z2 || objP6 == cl5Var) {
                    objP6 = new nb(b8j0Var, function1, b);
                    fetVar.o0(objP6);
                }
                y860.g(xdrVar2, null, function3, null, (Function1) objP6, fetVar, 390, 10);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) function1, (Object) b8j0Var, mm40Var, i, (byte) 12);
        }
    }

    public static final void y(boolean z, ci40 ci40Var, fet fetVar, int i) {
        mm40 mm40VarS;
        fetVar.g0(-941888946);
        int i2 = (fetVar.h(z) ? 32 : 16) | i | (fetVar.g(ci40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                mm40VarS = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            } else {
                zcl zclVar = qmk.f28987a;
                mm40VarS = o7k0.s(jm40.b, 52.0f);
            }
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (ci40Var != null) {
                fetVar.e0(-1650875487);
                d(ci40Var, fetVar, (i2 >> 6) & 14);
                fetVar.r(false);
            } else {
                fetVar.e0(-1650832242);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20(z, (Object) ci40Var, i, (byte) 4);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(2129997429);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            wwb.i(null, str, 0L, 0, 0L, fetVar, i2 & 112, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str, i, (byte) 19);
        }
    }

    public abstract void e0(j jVar);
}
