package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.format.DateFormat;
import android.view.inputmethod.ExtractedText;
import androidx.fragment.app.Fragment;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d9x {
    public static final void A(mm40 mm40Var, boolean z, ttm ttmVar, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(843170236);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        int i3 = i2 | (fetVar.g(ttmVar) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                fetVar.e0(-1462214525);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1462213601);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            d280 d280Var = ttmVar.f34516a;
            String str = ttmVar.c;
            k(0, ttmVar.e, ttmVar.h, fetVar, d280Var, ttmVar.b, str, ttmVar.f, ttmVar.d, ttmVar.g);
            obc.d(bmd.n.a(k6zVar), u1c.M(1236051398, new edk0(ttmVar, (byte) 8), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13((byte) 5, i, mm40Var, (Object) ttmVar, z);
        }
    }

    public static final void B(mm40 mm40Var, d4n d4nVar, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        d4nVar.getClass();
        fetVar.g0(1540846892);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(d4nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                fetVar.e0(-1009844109);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1009843185);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            boolean z2 = k6zVar == k6z.f17794a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            ugd ugdVarM = u1c.M(847749865, new lfc0(d4nVar, z2, function1, function2), fetVar);
            int i3 = i2 >> 3;
            boolean z3 = ((((i3 & 14) ^ 6) > 4 && fetVar.g(d4nVar)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && fetVar.h(z)) || (i3 & 48) == 32);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new n180(d4nVar, z, b);
                fetVar.o0(objP);
            }
            l7x.s(mm40VarD, ugdVarM, (tj30) objP, fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var, d4nVar, z, function1, function2, i);
        }
    }

    public static final void C(mm40 mm40Var, String str, String str2, zia ziaVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fetVar.g0(235018680);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(ziaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            d(((i2 >> 3) & 112) | ((i2 << 3) & 896), fetVar, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true), str2, str);
            if (ziaVar instanceof wia) {
                fetVar.e0(1893174240);
                fetVar.r(false);
                jm40Var = jm40Var2;
            } else if (ziaVar instanceof via) {
                fetVar.e0(-1441069867);
                jm40Var = jm40Var2;
                j6n.h(((via) ziaVar).f37469a, xqo0.f41332a, s5x0.N(yyw.U(jm40Var2, 0.3f), 4.0f, 12.0f, 0.0f, 0.0f, 12), 0, 0, fetVar, 48, 24);
                fetVar.r(false);
            } else {
                jm40Var = jm40Var2;
                if (ziaVar instanceof xia) {
                    fetVar.e0(-1440656606);
                    j6n.h(((xia) ziaVar).f40935a, dqo0.f6527a, s5x0.N(yyw.U(jm40Var, 0.3f), 4.0f, 12.0f, 0.0f, 0.0f, 12), 0, 0, fetVar, 48, 24);
                    fetVar.r(false);
                } else {
                    if (!(ziaVar instanceof yia)) {
                        throw b1j.f(1893173480, fetVar, false);
                    }
                    fetVar.e0(-1440248739);
                    j6n.h(((yia) ziaVar).f42678a, opo0.f25653a, s5x0.N(yyw.U(jm40Var, 0.3f), 4.0f, 12.0f, 0.0f, 0.0f, 12), 0, 0, fetVar, 48, 24);
                    fetVar.r(false);
                }
            }
            boolean z = (i2 & 57344) == 16384;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new l3c0(function0, (byte) 14);
                fetVar.o0(objP);
            }
            jd8.o(0, 1, fetVar, null, (Function0) objP);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var2, (Object) str, (Object) str2, (Object) ziaVar, (wdr) function0, i, (byte) 22);
        }
    }

    public static final void D(mm40 mm40Var, w7p w7pVar, fet fetVar, int i) {
        fetVar.g0(1003025442);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(w7pVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            m(384, fetVar, null, null, w7pVar.f38685a);
            m(384, fetVar, null, null, w7pVar.b);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, w7pVar, i, (byte) 7);
        }
    }

    public static final void E(mm40 mm40Var, x7p x7pVar, fet fetVar, int i) {
        fetVar.g0(835600898);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(x7pVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            m(0, fetVar, null, x7pVar.c, x7pVar.f40423a);
            m(0, fetVar, null, x7pVar.d, x7pVar.b);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, x7pVar, i, (byte) 9);
        }
    }

    public static final void F(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellRightSwitch) ((k3j0) yfu0Var).b.e).setChecked(((q3j0) cpVar.u()).c);
        k3j0 k3j0Var = (k3j0) yfu0Var;
        ((DsCellMiddleTitle) k3j0Var.b.c).setTitle(R.string.auto_clean_coupon_after_end_event);
        ((DsSettingsCell) k3j0Var.b.d).setFirst(false);
        ((DsSettingsCell) k3j0Var.b.d).setLast(true);
    }

    public static final void G(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellRightSwitch) ((k3j0) yfu0Var).c.e).setChecked(((q3j0) cpVar.u()).b);
        k3j0 k3j0Var = (k3j0) yfu0Var;
        ((DsCellMiddleTitle) k3j0Var.c.c).setTitle(R.string.clear_coupon_after_bet);
        ((DsSettingsCell) k3j0Var.c.d).setFirst(false);
        ((DsSettingsCell) k3j0Var.c.d).setLast(false);
    }

    public static final void H(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellRightSwitch) ((k3j0) yfu0Var).d.e).setChecked(((q3j0) cpVar.u()).f28056a);
        k3j0 k3j0Var = (k3j0) yfu0Var;
        ((DsCellMiddleTitle) k3j0Var.d.c).setTitle(R.string.subscribe_to_bet_updates);
        ((DsSettingsCell) k3j0Var.d.d).setFirst(true);
        ((DsSettingsCell) k3j0Var.d.d).setLast(false);
    }

    public static psw I(Locale locale) {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "j");
        bestDateTimePattern.getClass();
        if (StringsKt.U('K', 0, 6, bestDateTimePattern) >= 0) {
            return psw.f27534a;
        }
        if (StringsKt.U('h', 0, 6, bestDateTimePattern) >= 0) {
            return psw.b;
        }
        if (StringsKt.U('k', 0, 6, bestDateTimePattern) >= 0) {
            return psw.d;
        }
        return StringsKt.U('H', 0, 6, bestDateTimePattern) >= 0 ? psw.c : psw.c;
    }

    public static final void J(androidx.fragment.app.e eVar, roq0 roq0Var, lme0 lme0Var) {
        Fragment fragmentJ = eVar.J("AUTH_OFFER_DIALOG_TAG");
        if (fragmentJ != null) {
            sik sikVar = fragmentJ instanceof sik ? (sik) fragmentJ : null;
            if (sikVar != null) {
                sikVar.y0();
            }
        }
        Fragment fragmentJ2 = eVar.J("GREETING_KZ_DIALOG_TAG");
        if (fragmentJ2 != null) {
            sik sikVar2 = fragmentJ2 instanceof sik ? (sik) fragmentJ2 : null;
            if (sikVar2 != null) {
                sikVar2.y0();
            }
        }
        roq0Var.a(eVar);
        lme0Var.getClass();
        zuf0.e2.getClass();
        Fragment fragmentJ3 = eVar.J(zuf0.g2);
        if (fragmentJ3 != null) {
            sik sikVar3 = fragmentJ3 instanceof sik ? (sik) fragmentJ3 : null;
            if (sikVar3 != null) {
                sikVar3.y0();
            }
        }
    }

    public static String K(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((ocs0) it.next()).f25043a.g.p;
            if (mg40.m(str2)) {
                return "video/mp4";
            }
            if (mg40.i(str2)) {
                z = true;
            } else if (mg40.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static final String L(k3z k3zVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (k3zVar.equals(gqw0.p1)) {
            return ctf0Var.b.a(R.string.no_data, Arrays.copyOf(new Object[0], 0));
        }
        if (k3zVar.equals(m2a.q)) {
            return ctf0Var.b.a(R.string.not_found_line, Arrays.copyOf(new Object[0], 0));
        }
        if (k3zVar.equals(lwf.q)) {
            return ctf0Var.b.a(R.string.not_found_live, Arrays.copyOf(new Object[0], 0));
        }
        if (k3zVar.equals(ujn.r)) {
            return ctf0Var.b.a(R.string.no_data, Arrays.copyOf(new Object[0], 0));
        }
        t9f.b();
        return null;
    }

    public static final int M(mrh0 mrh0Var) {
        mrh0Var.getClass();
        int iOrdinal = mrh0Var.ordinal();
        if (iOrdinal == 0) {
            return R.string.empty_str;
        }
        if (iOrdinal == 1) {
            return R.string.security_level_title_low_new;
        }
        if (iOrdinal == 2) {
            return R.string.security_level_title_bad_new;
        }
        if (iOrdinal == 3) {
            return R.string.security_level_title_normal_new;
        }
        if (iOrdinal == 4) {
            return R.string.security_level_title_high_new;
        }
        t9f.b();
        return 0;
    }

    public static int N(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b = byteBuffer.get();
            i |= (b & 127) << (i2 * 7);
            if ((b & 128) == 0) {
                return i;
            }
        }
        return i;
    }

    public static final mm40 O(boolean z, fet fetVar) {
        jm40 jm40Var = jm40.b;
        if (!z) {
            fetVar.e0(-1723497791);
            fetVar.r(false);
            return jm40Var;
        }
        fetVar.e0(-1723671577);
        zcl zclVar = qmk.f28987a;
        long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
        zcl zclVar2 = qmk.e;
        ugg0 ugg0Var = vgg0.f37379a;
        mm40 mm40VarS = i120.S(jm40Var, 2.0f, primary, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
        fetVar.r(false);
        return mm40VarS;
    }

    public static final List P(xpg0 xpg0Var) {
        int iA = z1x.A(xpg0Var, ParameterNames.ID);
        int iA2 = z1x.A(xpg0Var, "seq");
        int iA3 = z1x.A(xpg0Var, RemoteMessageConst.FROM);
        int iA4 = z1x.A(xpg0Var, RemoteMessageConst.TO);
        lc00 lc00VarB = kotlin.collections.a.b();
        while (xpg0Var.W0()) {
            lc00VarB.add(new ovq((int) xpg0Var.getLong(iA), xpg0Var.J0(iA3), (int) xpg0Var.getLong(iA2), xpg0Var.J0(iA4)));
        }
        return CollectionsKt.z0(kotlin.collections.a.a(lc00VarB));
    }

    public static final yjo0 Q(qpg0 qpg0Var, String str, boolean z) {
        xpg0 xpg0VarZ0 = qpg0Var.Z0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = z1x.A(xpg0VarZ0, "seqno");
            int iA2 = z1x.A(xpg0VarZ0, "cid");
            int iA3 = z1x.A(xpg0VarZ0, "name");
            int iA4 = z1x.A(xpg0VarZ0, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (xpg0VarZ0.W0()) {
                    if (((int) xpg0VarZ0.getLong(iA2)) >= 0) {
                        int i = (int) xpg0VarZ0.getLong(iA);
                        String strJ0 = xpg0VarZ0.J0(iA3);
                        String str2 = xpg0VarZ0.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strJ0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listA0 = CollectionsKt.A0(linkedHashMap.entrySet(), new mjf0((byte) 5));
                ArrayList arrayList = new ArrayList(r3d.q(listA0, 10));
                Iterator it = listA0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listL0 = CollectionsKt.L0(arrayList);
                List listA1 = CollectionsKt.A0(linkedHashMap2.entrySet(), new mjf0((byte) 6));
                ArrayList arrayList2 = new ArrayList(r3d.q(listA1, 10));
                Iterator it2 = listA1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                yjo0 yjo0Var = new yjo0(str, z, listL0, CollectionsKt.L0(arrayList2));
                ay3.L(xpg0VarZ0, null);
                return yjo0Var;
            }
            ay3.L(xpg0VarZ0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public static e9x R(Metadata metadata) {
        String string;
        if (metadata.mv().length == 0) {
            jf4.o("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        vd40 vd40Var = new vd40(metadata.mv(), (metadata.xi() & 8) != 0);
        boolean zA = vd40Var.a(1, 1, 0);
        if (!zA) {
            if (zA) {
                StringBuilder sb = new StringBuilder("while maximum supported version is ");
                sb.append(vd40Var.f ? vd40.g : vd40.h);
                sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            itt0.l("Provided Metadata instance has version ", vd40Var, ", ", string);
            return null;
        }
        try {
            int iK = metadata.k();
            if (iK == 1) {
                return new dry(metadata);
            }
            if (iK == 2) {
                return new ery(metadata);
            }
            if (iK == 3) {
                return new hry(metadata);
            }
            if (iK != 4) {
                if (iK == 5) {
                    return new gry(metadata);
                }
                hry hryVar = new hry();
                new gfy(metadata.mv());
                metadata.xi();
                return hryVar;
            }
            List listC = qx3.c(metadata.d1());
            new gfy(metadata.mv());
            metadata.xi();
            listC.getClass();
            fry fryVar = new fry();
            fryVar.f10041a = listC;
            return fryVar;
        } catch (Throwable th) {
            if ((th instanceof IllegalArgumentException) || (th instanceof VirtualMachineError) || (th instanceof ThreadDeath)) {
                throw th;
            }
            throw new w4x("Exception occurred when reading Kotlin metadata", th);
        }
    }

    public static final ppm0 S(boolean z, boolean z2, Function0 function0, fet fetVar, int i) {
        j39 j39Var = (j39) fetVar.k(l39.f19347a);
        k6z k6zVar = (k6z) fetVar.k(bmd.n);
        boolean zE = ((((i & 896) ^ 384) > 256 && fetVar.g(function0)) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && fetVar.h(z)) || (i & 6) == 4) | fetVar.e(k6zVar.ordinal()) | fetVar.g(j39Var) | ((((i & 112) ^ 48) > 32 && fetVar.h(z2)) || (i & 48) == 32);
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            Object ppm0Var = new ppm0(function0, z, k6zVar, z2, j39Var);
            fetVar.o0(ppm0Var);
            objP = ppm0Var;
        }
        return (ppm0) objP;
    }

    public static ArrayList T(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            try {
                byte b = byteBufferAsReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iN = ((b >> 1) & 1) != 0 ? N(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iN > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position());
                ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate2.limit(byteBufferAsReadOnlyBuffer.position() + iN);
                arrayList.add(new je60(i, byteBufferDuplicate2));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iN);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static final wsy U(hzs0 hzs0Var) throws wzs0 {
        hzs0Var.getClass();
        vjj vjjVarJ = hzs0Var.j();
        vjjVarJ.getClass();
        byte b = 0;
        if (vjjVarJ instanceof goc) {
            List parameters = ((goc) vjjVarJ).h().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(r3d.q(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((hzs0) it.next()).h());
            }
            List upperBounds = hzs0Var.getUpperBounds();
            upperBounds.getClass();
            int i = rek.f30339a;
            ym40 ym40VarC = oek.c(hzs0Var);
            ym40VarC.getClass();
            ary aryVarC = ym40VarC.c();
            wsy wsyVarH = new xzs0(new r4m0(arrayList, b)).h((wsy) CollectionsKt.U(upperBounds), t3u0.e);
            return wsyVarH == null ? aryVarC.n() : wsyVarH;
        }
        if (!(vjjVarJ instanceof mer)) {
            jf4.o("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((mer) vjjVarJ).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(r3d.q(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((hzs0) it2.next()).h());
        }
        List upperBounds2 = hzs0Var.getUpperBounds();
        upperBounds2.getClass();
        int i2 = rek.f30339a;
        ym40 ym40VarC2 = oek.c(hzs0Var);
        ym40VarC2.getClass();
        ary aryVarC2 = ym40VarC2.c();
        wsy wsyVarH2 = new xzs0(new r4m0(arrayList2, b)).h((wsy) CollectionsKt.U(upperBounds2), t3u0.e);
        return wsyVarH2 == null ? aryVarC2.n() : wsyVarH2;
    }

    public static final ExtractedText V(a8q0 a8q0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = a8q0Var.f440a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = a8q0Var.b;
        extractedText.selectionStart = o9q0.f(j);
        extractedText.selectionEnd = o9q0.e(j);
        extractedText.flags = !StringsKt.P(a8q0Var.f440a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 ??, still in use, count: 1, list:
          (r2v2 ?? I:a.rml0) from 0x04b3: CONSTRUCTOR (r11v1 ?? I:a.xll0) = (r13v0 ?? I:long), (r1v3 ?? I:a.fol0), (r2v2 ?? I:a.rml0) A[MD:(long, a.fol0, a.rml0):void (m)] (LINE:1204) call: a.xll0.<init>(long, a.fol0, a.rml0):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final a.cml0 W(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 ??, still in use, count: 1, list:
          (r2v2 ?? I:a.rml0) from 0x04b3: CONSTRUCTOR (r11v1 ?? I:a.xll0) = (r13v0 ?? I:long), (r1v3 ?? I:a.fol0), (r2v2 ?? I:a.rml0) A[MD:(long, a.fol0, a.rml0):void (m)] (LINE:1204) call: a.xll0.<init>(long, a.fol0, a.rml0):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r41v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */

    public static final zvj0 X(pvj0 pvj0Var, ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        bx6 bx6Var = pvj0Var.f27665a;
        return new zvj0(unh0.m0(bx6Var, ctf0Var, pvj0Var.b, z), jtt0.r(pvj0Var.c, bx6Var.b.f, z));
    }

    public static final i8m0 Y(mrh0 mrh0Var) {
        mrh0Var.getClass();
        int iOrdinal = mrh0Var.ordinal();
        if (iOrdinal == 0) {
            return i8m0.WARNING_RED;
        }
        if (iOrdinal == 1) {
            return i8m0.WARNING_RED;
        }
        if (iOrdinal == 2) {
            return i8m0.WARNING_ORANGE;
        }
        if (iOrdinal == 3) {
            return i8m0.WARNING_YELLOW;
        }
        if (iOrdinal == 4) {
            return i8m0.CHECK;
        }
        t9f.b();
        return null;
    }

    public static final void a(mm40 mm40Var, String str, chl0 chl0Var, boolean z, Function0 function0, fet fetVar, int i) {
        Function0 function1;
        mm40 mm40Var2;
        boolean z2;
        boolean z3;
        long textPrimary;
        fet fetVar2 = fetVar;
        fetVar2.g0(827401314);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(chl0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        } else {
            function1 = function0;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            float f = z ? 0.5f : 1.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(y860.W(jm40Var, null, null, !z, null, function1, 24), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(s5x0.N(o7k0.g(mm40VarD, 44.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13), 12.0f, 0.0f, 2);
            boolean zD = fetVar2.d(f);
            Object objP = fetVar2.P();
            if (zD || objP == ukd.f35823a) {
                objP = new f54(f, (byte) 28);
                fetVar2.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarL, (Function1) objP);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
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
            g((i2 << 3) & 896, fetVar2, ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true), chl0Var.f4366a, str);
            if (z) {
                fetVar2.e0(-185345879);
                z2 = false;
                z3 = true;
                dww.c(a8k0.F(R.drawable.ic_glyph_lock, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 16.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                z2 = false;
                z3 = true;
                fetVar2.e0(-185033244);
                fetVar2.r(false);
            }
            mm40 mm40VarW = o7k0.w(o7k0.g(yyw.U(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 0.6f), 20.0f, 0.0f, 2), gqw0.k, z2, 2);
            String str2 = chl0Var.b;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarI = g1t0.i();
            int iOrdinal = chl0Var.c.ordinal();
            if (iOrdinal == 0 || iOrdinal == z3) {
                fetVar2.e0(-2026189681);
                textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                fetVar2.r(z2);
            } else if (iOrdinal == 2) {
                fetVar2.e0(-2026187410);
                textPrimary = ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefHigher();
                fetVar2.r(z2);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(-2026192455, fetVar2, z2);
                }
                fetVar2.e0(-2026185203);
                textPrimary = ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefLower();
                fetVar2.r(z2);
            }
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarW, textPrimary, new n05(j, g1t0.j().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarI, fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(z3);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new heb(mm40Var2, str, chl0Var, z, function0, i, (byte) 1);
        }
    }

    public static final void b(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(-560317339);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarD, 16.0f, 0.0f, 2), "INFO_LABEL");
            long secondary80 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary80();
            f2q0 f2q0Var = new f2q0(3);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE0, secondary80, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 0, 0, null, g1t0.g(), fetVar, (i5 >> 3) & 14, 384, 125944);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z05(mm40Var2, str, i, i2, (byte) 4);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(1585118583);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            a0y a0yVar = (a0y) l7m0Var.getValue();
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            bdx.g(null, a0yVar.f43a, fetVar2, 0);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            pz40 pz40VarF = androidx.compose.runtime.e.f(a0yVar.b, fetVar2);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new u9x(function1, (byte) 17);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new u9x(function1, (byte) 18);
                fetVar2.o0(objP2);
            }
            t9x.e(mm40VarL, pz40VarF, function0, (Function0) objP2, fetVar2, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            qx6 qx6Var = a0yVar.c;
            boolean z4 = i3 == 256;
            Object objP3 = fetVar.P();
            byte b = 3;
            if (z4 || objP3 == cl5Var) {
                objP3 = new i1y(function1, b);
                fetVar.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            boolean z5 = i3 == 256;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new u9x(function1, (byte) 19);
                fetVar.o0(objP4);
            }
            Function0 function3 = (Function0) objP4;
            boolean z6 = i3 == 256;
            Object objP5 = fetVar.P();
            if (z6 || objP5 == cl5Var) {
                objP5 = new u9x(function1, (byte) 20);
                fetVar.o0(objP5);
            }
            x9x.f(null, qx6Var, function2, function3, (Function0) objP5, fetVar, 0);
            wvb.o(null, 4.0f, 0L, fetVar, 0, 5);
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 16.0f, 8.0f);
            wul wulVar = a0yVar.d;
            boolean z7 = i3 == 256;
            Object objP6 = fetVar.P();
            if (z7 || objP6 == cl5Var) {
                objP6 = new u9x(function1, (byte) 21);
                fetVar.o0(objP6);
            }
            qzb.n(mm40VarK, wulVar, phu0.G(0, 1, fetVar, (Function0) objP6), fetVar, 0, 0);
            wvb.o(null, 4.0f, 0L, fetVar, 0, 5);
            String str = a0yVar.e;
            mm40 mm40VarL2 = s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2);
            long secondary80 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary80();
            f2q0 f2q0Var = new f2q0(3);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL2, secondary80, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 0, 0, null, g1t0.g(), fetVar, 0, 384, 125944);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            wvb.o(i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ljcVar), 8.0f, 0L, fetVar2, 0, 4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 23);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        int i2;
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-333361611);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= fetVar2.g(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.g(mm40VarD, 50.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.g(o2e.e0(jm40Var, "EVENT_CARD_INFO_LABEL"), 16.0f, 0.0f, 2), gqw0.k, false, 2);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, mm40VarW, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar2, (i2 >> 3) & 14, 24960, 110584);
            mm40 mm40VarE0 = o2e.e0(jm40Var, "TRACKED_CARD_TITLE");
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            String str4 = str3;
            v8q0.a(str4, mm40VarE0, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, ((i2 >> 6) & 14) | 48, 24960, 110584);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var, str, str2, i, (byte) 12);
        }
    }

    public static final void e(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        float f3;
        long j;
        fetVar.g0(2092382550);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.d(f) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f4 = f + f2;
            float f5 = 0.0f;
            if (f4 == 0.0f) {
                f3 = 0.0f;
            } else {
                f3 = f == f2 ? 1.0f : f / f4;
            }
            if (f4 != 0.0f) {
                f5 = f == f2 ? 1.0f : f2 / f4;
            }
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zfn zfnVar = zaq0.b;
            long primary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarC = o7k0.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            boolean zF = fetVar.f(background) | fetVar.d(f3) | fetVar.f(primary);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                u9c u9cVar = new u9c(background, f3, primary, (byte) 3);
                j = primary;
                fetVar.o0(u9cVar);
                objP = u9cVar;
            } else {
                j = primary;
            }
            zq8.a(0, fetVar, rq8.K(mm40VarC, (Function1) objP));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarC2 = o7k0.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            boolean zF2 = fetVar.f(background) | fetVar.d(f5) | fetVar.f(j);
            Object objP2 = fetVar.P();
            if (zF2 || objP2 == cl5Var) {
                u9c u9cVar2 = new u9c(background, f5, j, (byte) 5);
                fetVar.o0(u9cVar2);
                objP2 = u9cVar2;
            }
            zq8.a(0, fetVar, rq8.K(mm40VarC2, (Function1) objP2));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vil(mm40Var, f, f2, i, (byte) 3);
        }
    }

    public static final void f(n610 n610Var, sek sekVar, bek bekVar, z5s z5sVar, qdz qdzVar, xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, Function1 function1, fet fetVar, int i) {
        byte b;
        n610Var.getClass();
        sekVar.getClass();
        bekVar.getClass();
        qdzVar.getClass();
        xexVar.getClass();
        function1.getClass();
        fetVar.g0(2085262784);
        int i2 = i | (fetVar.g(n610Var) ? 4 : 2) | (fetVar.g(sekVar) ? 32 : 16) | (fetVar.g(bekVar) ? 256 : 128) | (fetVar.g(z5sVar) ? 2048 : 1024) | (fetVar.g(qdzVar) ? 16384 : 8192) | (fetVar.g(xexVar) ? 131072 : 65536) | (fetVar.g(cyberBottomSheetParams) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = 29360128 & i2;
            boolean z = i3 == 8388608;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dg00(function1, (byte) 18);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 8388608;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dg00(function1, (byte) 20);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            l7m0 l7m0Var = n610Var.f22973a;
            l7m0 l7m0Var2 = n610Var.b;
            l7m0 l7m0Var3 = n610Var.c;
            l7m0 l7m0Var4 = n610Var.d;
            l7m0 l7m0Var5 = n610Var.e;
            l7m0 l7m0Var6 = n610Var.f;
            l7m0 l7m0Var7 = n610Var.g;
            boolean z3 = i3 == 8388608;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new dg00(function1, (byte) 21);
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean z4 = i3 == 8388608;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new dg00(function1, (byte) 22);
                fetVar.o0(objP4);
            }
            Function0 function3 = (Function0) objP4;
            boolean z5 = i3 == 8388608;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new dg00(function1, (byte) 23);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean z6 = i3 == 8388608;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var) {
                objP6 = new dg00(function1, (byte) 24);
                fetVar.o0(objP6);
            }
            Function0 function5 = (Function0) objP6;
            boolean z7 = i3 == 8388608;
            Object objP7 = fetVar.P();
            if (z7 || objP7 == cl5Var) {
                objP7 = new lj00(function1, (byte) 6);
                fetVar.o0(objP7);
            }
            Function1 function6 = (Function1) objP7;
            boolean z8 = i3 == 8388608;
            Object objP8 = fetVar.P();
            if (z8 || objP8 == cl5Var) {
                objP8 = new lj00(function1, (byte) 7);
                fetVar.o0(objP8);
            }
            Function1 function7 = (Function1) objP8;
            boolean z9 = i3 == 8388608;
            Object objP9 = fetVar.P();
            if (z9 || objP9 == cl5Var) {
                b = 1;
                objP9 = new lj00(function1, b);
                fetVar.o0(objP9);
            } else {
                b = 1;
            }
            Function1 function8 = (Function1) objP9;
            byte b2 = i3 == 8388608 ? b : (byte) 0;
            Object objP10 = fetVar.P();
            if (b2 != 0 || objP10 == cl5Var) {
                objP10 = new lj00(function1, (byte) 2);
                fetVar.o0(objP10);
            }
            mrv.x(l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, false, function2, function3, function4, function5, function6, function7, function8, (Function1) objP10, u1c.M(412367885, new rkb(function1, qdzVar, (byte) 4), fetVar), fetVar, (i2 << 18) & 2143289344, (i2 >> 15) & 126, 12288);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6((Object) n610Var, sekVar, bekVar, z5sVar, (Object) qdzVar, (Object) xexVar, (Object) cyberBottomSheetParams, function1, i, (byte) 5);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        int i2;
        String str3;
        String str4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1017307022);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= fetVar2.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str3, null, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarA, fetVar2, (i2 >> 3) & 14, 24960, 110586);
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str4, null, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, (i2 >> 6) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var, str, str2, i, (byte) 11);
        }
    }

    public static final void h(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        ugd ugdVar3;
        Function1 function2 = function1;
        l7m0Var.getClass();
        function2.getClass();
        fetVar.g0(-204584608);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ugdVar3 = ugdVar;
            i2 |= fetVar.i(ugdVar3) ? 2048 : 1024;
        } else {
            ugdVar3 = ugdVar;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            lz20 lz20Var = (lz20) l7m0Var.getValue();
            if (lz20Var != null) {
                boolean z = lz20Var instanceof jz20;
                Object obj = ukd.f35823a;
                if (z) {
                    fetVar.e0(962701792);
                    boolean zI = fetVar.i(wpqVar);
                    Object objP = fetVar.P();
                    if (zI || objP == obj) {
                        objP = new bz20(wpqVar, (byte) 0);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarA = pzw.A(i3 & 14, fetVar, mm40Var, (Function0) objP);
                    int iOrdinal = ((jz20) lz20Var).f17389a.ordinal();
                    if (iOrdinal == 0) {
                        fetVar.e0(2031326648);
                        r8x.m(mm40VarA, u1c.M(1760382545, new w(ugdVar2, (byte) 18), fetVar), fetVar, 48);
                        fetVar.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar.e0(65535040);
                        q8x.h(mm40VarA, u1c.M(584068716, new w(ugdVar2, (byte) 19), fetVar), fetVar, 48);
                        fetVar.r(false);
                    } else if (iOrdinal == 2) {
                        fetVar.e0(65542146);
                        x8x.d(mm40VarA, u1c.M(2095107847, new w(ugdVar2, (byte) 20), fetVar), fetVar, 48);
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 3) {
                            throw b1j.f(65525590, fetVar, false);
                        }
                        fetVar.e0(65549144);
                        c9x.c(mm40VarA, u1c.M(1420550242, new w(ugdVar2, (byte) 21), fetVar), fetVar, 48);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else if (lz20Var instanceof kz20) {
                    fetVar.e0(-220744423);
                    boolean zI2 = fetVar.i(wpqVar);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == obj) {
                        objP2 = new bz20(wpqVar, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarA2 = pzw.A(i3 & 14, fetVar, mm40Var, (Function0) objP2);
                    kz20 kz20Var = (kz20) lz20Var;
                    int iOrdinal2 = kz20Var.i.ordinal();
                    if (iOrdinal2 == 0) {
                        fetVar.e0(-1843918023);
                        function2 = function1;
                        k9x.e(mm40VarA2, kz20Var, function2, ugdVar, fetVar, i3 & 8064);
                        fetVar.r(false);
                    } else if (iOrdinal2 == 1) {
                        fetVar.e0(-1843911462);
                        function2 = function1;
                        e9x.j(mm40VarA2, kz20Var, function2, ugdVar, fetVar, i3 & 8064);
                        fetVar.r(false);
                    } else if (iOrdinal2 == 2) {
                        fetVar.e0(-1843904837);
                        function2 = function1;
                        t9x.h(mm40VarA2, kz20Var, function2, ugdVar, fetVar, i3 & 8064);
                        fetVar.r(false);
                    } else {
                        if (iOrdinal2 != 3) {
                            throw b1j.f(-1843919389, fetVar, false);
                        }
                        fetVar.e0(-1843898346);
                        w9x.d(mm40VarA2, kz20Var, function2, ugdVar3, fetVar, i3 & 8064);
                        fetVar.r(false);
                        function2 = function1;
                    }
                    fetVar.r(false);
                }
                Unit unit = Unit.f46060a;
                boolean z2 = (i3 & 896) == 256;
                Object objP3 = fetVar.P();
                if (z2 || objP3 == obj) {
                    objP3 = new lj00(function2, (byte) 16);
                    fetVar.o0(objP3);
                }
                m0x0.o(unit, (Function1) objP3, fetVar);
            }
            throw b1j.f(962699321, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp(mm40Var, l7m0Var, function2, ugdVar, ugdVar2, i);
        }
    }

    public static final void i(mm40 mm40Var, u7p u7pVar, fet fetVar, int i) {
        fetVar.g0(2025664738);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(u7pVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            m(384, fetVar, null, null, u7pVar.f35195a);
            m(384, fetVar, null, null, u7pVar.b);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, u7pVar, i, (byte) 8);
        }
    }

    public static final void j(d280 d280Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(700509728);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(d280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 32.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
                objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
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
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.m(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5l0(d280Var, str, i, (byte) 0);
        }
    }

    public static final void k(int i, long j, long j2, fet fetVar, d280 d280Var, d280 d280Var2, String str, String str2, String str3, String str4) {
        long j3;
        d280 d280Var3;
        long j4 = j2;
        String str5 = str3;
        String str6 = str4;
        fetVar.g0(-1227215898);
        int i2 = i | (fetVar.g(d280Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(d280Var2) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str5) ? 16384 : 8192) | (fetVar.f(j) ? 131072 : 65536) | (fetVar.g(str6) ? 1048576 : 524288) | (fetVar.f(j4) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 64.0f), true);
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            d280Var3 = d280Var;
            j(d280Var3, str, fetVar, i2 & 126);
            j(d280Var2, str2, fetVar, (i2 >> 6) & 126);
            fetVar.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 64.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.o, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            j3 = j;
            str5 = str3;
            y(str5, j3, fetVar, (i2 >> 12) & 126);
            j4 = j2;
            str6 = str4;
            y(str6, j4, fetVar, (i2 >> 18) & 126);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            j3 = j;
            d280Var3 = d280Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q5l0(d280Var3, str, d280Var2, str2, str5, j3, str6, j4, i, (byte) 0);
        }
    }

    public static final void l(mm40 mm40Var, v7p v7pVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1279685204);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(v7pVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 64.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarG);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = v7pVar.f36939a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, qmk.C, 2, false, 4, 0, null, g1t0.d(), fetVar, 0, 24960, 108538);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, v7pVar, i, (byte) 6);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var, d280 d280Var, String str) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(1683065520);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.g(d280Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 32.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
            if (d280Var == null) {
                fetVar.e0(866500498);
                fetVar.r(false);
            } else {
                fetVar.e0(866500499);
                boolean zG = fetVar.g(d280Var);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                    fetVar.o0(objP);
                }
                u6n u6nVar = (u6n) objP;
                boolean zG2 = fetVar.g(u6nVar);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new d1n(u6nVar, (byte) 1);
                    fetVar.o0(objP2);
                }
                kkb.p(1, fetVar, null, (Function0) objP2);
                fetVar.r(false);
            }
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            int i3 = (i2 >> 3) & 14;
            mm40Var2 = jm40Var;
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.d(), fetVar, i3, 24960, 108538);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var2, str, d280Var, i, (byte) 14);
        }
    }

    public static final void n(mm40 mm40Var, uw80 uw80Var, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(1769169362);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(uw80Var) : fetVar.i(uw80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b = 0;
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (uw80Var instanceof sw80) {
            fetVar.e0(1781116802);
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(uw80Var)));
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new qw80(function1, uw80Var, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarD = o7k0.d(feb.O(mm40Var, (Function0) objP), 1.0f);
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), z ? 20.0f : 8.0f, 20.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            sw80 sw80Var = (sw80) uw80Var;
            o(s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), sw80Var.b, fetVar, 0);
            p(jm40Var, sw80Var.c, z, fetVar, (i2 & 896) | 6);
            fetVar.r(true);
            fetVar.r(false);
        } else {
            if (!uw80Var.equals(tw80.f34638a)) {
                throw b1j.f(-635283878, fetVar, false);
            }
            fetVar.e0(1782173902);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 5, i, (Object) mm40Var, (Object) uw80Var, (Object) function1, z);
        }
    }

    public static final void o(mm40 mm40Var, pw80 pw80Var, fet fetVar, int i) {
        pw80 pw80Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-721498722);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(pw80Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "PARTNER_BOTTOM_INFO_ANOUNCE_DATE");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 36.0f);
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            n0x n0xVar = pw80Var.c;
            m0x m0xVar = pw80Var.d;
            long secondary60 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary60();
            pge pgeVar = gqw0.B;
            mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            lgb.w(jr8Var.b(mm40VarN2, zx7Var), jr8Var.b(o7k0.n(jm40Var, 24.0f), zx7Var), n0xVar, m0xVar, secondary60, null, null, pgeVar, fetVar2, 12582912, 96);
            fetVar2.r(true);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            pw80Var2 = pw80Var;
            v8q0.a(pw80Var2.f27699a, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.e(), fetVar, 0, 0, 131066);
            v8q0.a(pw80Var2.b, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), new n05(idm0.t(12), idm0.t(18), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.r(), fetVar, 0, 0, 131058);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            pw80Var2 = pw80Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var, pw80Var2, i, (byte) 4);
        }
    }

    public static final void p(mm40 mm40Var, rw80 rw80Var, boolean z, fet fetVar, int i) {
        int i2;
        ox80 ox80Var;
        shd shdVar;
        boolean z2;
        shd shdVar2;
        shd shdVar3;
        pcy pcyVar;
        shd shdVar4;
        boolean z3;
        shd shdVar5;
        fet fetVar2 = fetVar;
        ox80 ox80Var2 = rw80Var.f31207a;
        fetVar2.g0(-1224337176);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(rw80Var) : fetVar2.i(rw80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "PARTNER_BOTTOM_INFO_ANOUNCE_TEAMS");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar6 = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar6);
            shd shdVar7 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar7);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar8 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar8);
            jpm0.n(fetVar2);
            shd shdVar9 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar9);
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar2.e0(-570812239);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                shdVar2 = shdVar8;
                shdVar = shdVar9;
                z2 = false;
                shdVar3 = shdVar6;
                pcyVar = pcyVar2;
                shdVar4 = shdVar7;
                ox80Var = ox80Var2;
                v8q0.a(ox80Var2.f26000a, mm40VarN.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                ox80Var = ox80Var2;
                shdVar = shdVar9;
                z2 = false;
                shdVar2 = shdVar8;
                shdVar3 = shdVar6;
                pcyVar = pcyVar2;
                shdVar4 = shdVar7;
                fetVar2.e0(-570397738);
                fetVar2.r(false);
            }
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, z2);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar3);
            jpm0.o(fetVar2, bh90VarM2, shdVar4);
            shd shdVar10 = shdVar2;
            vqd.u(iHashCode2, fetVar2, shdVar10, fetVar2);
            shd shdVar11 = shdVar;
            jpm0.o(fetVar2, mm40VarC1, shdVar11);
            ox80 ox80Var3 = ox80Var;
            String str = ox80Var3.e;
            ox80 ox80Var4 = rw80Var.b;
            String str2 = ox80Var4.e;
            mm40 mm40VarO = O(ox80Var3.d, fetVar2);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO);
            shd shdVar12 = shdVar3;
            long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarN2 = o7k0.n(i120.Q(mm40VarE, backgroundContent, ljcVar), 46.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar12);
            jpm0.o(fetVar2, bh90VarM3, shdVar4);
            vqd.u(iHashCode3, fetVar2, shdVar10, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar11);
            n0x n0xVar = ox80Var3.b;
            m0x m0xVar = ox80Var3.c;
            long secondary60 = afn0.m(fetVar2).getSecondary60();
            pge pgeVar = gqw0.B;
            mm40 mm40VarN3 = o7k0.n(jm40Var, 28.0f);
            zx7 zx7Var2 = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            shd shdVar13 = shdVar4;
            lgb.w(jr8Var.b(mm40VarN3, zx7Var2), jr8Var.b(o7k0.n(jm40Var, 28.0f), zx7Var2), n0xVar, m0xVar, secondary60, null, null, pgeVar, fetVar2, 12582912, 96);
            fetVar2.r(true);
            if (str.length() > 0) {
                fetVar2.e0(-2124537093);
                mm40 mm40VarQ = ffb0.Q(jm40Var, 24.0f, 36.0f);
                long secondaryButtonBackground = afn0.m(fetVar2).getSecondaryButtonBackground();
                zcl zclVar3 = qmk.i;
                mm40 mm40VarK = s5x0.K(o7k0.u(i120.Q(mm40VarQ, secondaryButtonBackground, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 30.0f, 0.0f, 2), 6.0f, 4.0f);
                tj30 tj30VarC3 = zq8.c(zx7Var2, false);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarK);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC3, shdVar12);
                jpm0.o(fetVar2, bh90VarM4, shdVar13);
                vqd.u(iHashCode4, fetVar2, shdVar10, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar11);
                shdVar5 = shdVar11;
                z3 = true;
                v8q0.a(str, null, afn0.m(fetVar2).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24576, 114682);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z3 = true;
                shdVar5 = shdVar11;
                fetVar2.e0(-2123717360);
                fetVar2.r(false);
            }
            fetVar2.r(z3);
            n4c.l(o7k0.s(jm40Var, 48.0f), new lpm(opm.f25648a, new hpm(0L, 3)), false, fetVar2, 4);
            tj30 tj30VarC4 = zq8.c(zx7Var, false);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC4, shdVar12);
            jpm0.o(fetVar2, bh90VarM5, shdVar13);
            vqd.u(iHashCode5, fetVar2, shdVar10, fetVar2);
            shd shdVar14 = shdVar5;
            jpm0.o(fetVar2, mm40VarC4, shdVar14);
            mm40 mm40VarN4 = o7k0.n(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, O(ox80Var4.d, fetVar2)), afn0.m(fetVar2).getBackgroundContent(), ljcVar), 46.0f);
            tj30 tj30VarC5 = zq8.c(zx7Var, false);
            int iHashCode6 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM6 = fetVar2.m();
            mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarN4);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC5, shdVar12);
            jpm0.o(fetVar2, bh90VarM6, shdVar13);
            vqd.u(iHashCode6, fetVar2, shdVar10, fetVar2);
            jpm0.o(fetVar2, mm40VarC5, shdVar14);
            lgb.w(jr8Var.b(o7k0.n(jm40Var, 28.0f), zx7Var2), jr8Var.b(jm40Var, zx7Var2), ox80Var4.b, ox80Var4.c, afn0.m(fetVar2).getSecondary60(), null, null, pgeVar, fetVar2, 12582912, 96);
            fetVar2.r(z3);
            if (str2.length() > 0) {
                fetVar2.e0(-156408037);
                mm40 mm40VarB0 = x8f.b0();
                long secondaryButtonBackground2 = afn0.m(fetVar2).getSecondaryButtonBackground();
                zcl zclVar4 = qmk.i;
                mm40 mm40VarK2 = s5x0.K(o7k0.u(i120.Q(mm40VarB0, secondaryButtonBackground2, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 30.0f, 0.0f, 2), 6.0f, 4.0f);
                tj30 tj30VarC6 = zq8.c(zx7Var2, false);
                int iHashCode7 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM7 = fetVar2.m();
                mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarK2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC6, shdVar12);
                jpm0.o(fetVar2, bh90VarM7, shdVar13);
                vqd.u(iHashCode7, fetVar2, shdVar10, fetVar2);
                jpm0.o(fetVar2, mm40VarC6, shdVar14);
                v8q0.a(str2, null, afn0.m(fetVar2).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24576, 114682);
                fetVar2 = fetVar;
                fetVar2.r(z3);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-155579655);
                fetVar2.r(false);
            }
            fetVar2.r(z3);
            if (z) {
                fetVar2.e0(-566476052);
                mm40 mm40VarN5 = s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                v8q0.a(ox80Var4.f26000a, mm40VarN5.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), afn0.m(fetVar2).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-566056746);
                fetVar2.r(false);
            }
            j0x.b(iom0.r(jpm0.t(R.drawable.ic_glyph_chevron_right_small, 6, fetVar2), fetVar2), null, o2e.e0(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), "ANNOUNCE_IMAGE"), null, null, 0.0f, new m78(afn0.m(fetVar2).getPrimary(), 5), fetVar, 56, 56);
            fetVar2 = fetVar;
            fetVar2.r(z3);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) mm40Var, (Object) rw80Var, z, i, (byte) 6);
        }
    }

    public static final void q(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(546163822);
        if (fetVar.U(i & 1, i != 0)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f);
            long j = kkg.j;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            fetVar2 = fetVar;
            dww.c(pm80VarF, null, s5x0.J(i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f), y3d.c, fetVar2, 3128, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i, (byte) 28);
        }
    }

    public static final void r(Fragment fragment, l7m0 l7m0Var, roq0 roq0Var, lme0 lme0Var, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i) {
        clz clzVar;
        l7m0Var.getClass();
        roq0Var.getClass();
        lme0Var.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        fetVar.g0(-758271679);
        int i2 = i | (fetVar.i(fragment) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(roq0Var) ? 256 : 128) | (fetVar.g(lme0Var) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            clz clzVar2 = (clz) fetVar.k(or00.f25714a);
            androidx.fragment.app.e eVarC = fragment.C();
            int i3 = i2 & 896;
            int i4 = i2 & 7168;
            boolean zI = fetVar.i(fragment) | (i3 == 256) | (i4 == 2048);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new jl40((Object) fragment, (Object) roq0Var, (Object) lme0Var, (byte) 29);
                fetVar.o0(objP);
            }
            m0x0.o(eVarC, (Function1) objP, fetVar);
            androidx.fragment.app.e eVarC2 = fragment.C();
            boolean zI2 = ((i2 & 112) == 32) | fetVar.i(clzVar2) | (i3 == 256) | (i4 == 2048) | fetVar.i(fragment) | ((i2 & 57344) == 16384) | ((i2 & 458752) == 131072) | ((i2 & 3670016) == 1048576);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                clzVar = clzVar2;
                dj3 dj3Var = new dj3(clzVar, l7m0Var, roq0Var, lme0Var, fragment, function1, function0, function2, null, (byte) 4);
                fetVar.o0(dj3Var);
                objP2 = dj3Var;
            } else {
                clzVar = clzVar2;
            }
            m0x0.v(eVarC2, clzVar, (Function2) objP2, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) fragment, (Object) l7m0Var, (Object) roq0Var, (Object) lme0Var, function1, (wdr) function0, (wdr) function2, i, (byte) 12);
        }
    }

    public static final void s(z6c0 z6c0Var, Function1 function1, fet fetVar, int i) {
        z6c0Var.getClass();
        function1.getClass();
        fetVar.g0(1175651741);
        int i2 = (fetVar.g(z6c0Var) ? 32 : 16) | i | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 145) != 144)) {
            zyc0 zyc0Var = z6c0Var.f43860a;
            tlc0 tlc0Var = z6c0Var.c;
            vyc0 vyc0Var = z6c0Var.b;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new rpa0(function1, (byte) 19);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wta0(function1, (byte) 24);
                fetVar.o0(objP2);
            }
            d7x.k(null, zyc0Var, vyc0Var, function2, (Function0) objP2, null, null, fetVar, 0, 97);
            if (tlc0Var.b) {
                fetVar.e0(-1616831387);
                zcl zclVar = qmk.f28987a;
                wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
                piz.u(0, fetVar, tlc0Var.f34136a, null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1616667118);
                zcl zclVar2 = qmk.f28987a;
                wvb.o(null, 6.0f, 0L, fetVar, 0, 5);
                e9x.a(0, fetVar, null, z6c0Var.d);
                fetVar.r(false);
            }
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(z6c0Var, function1, i, (byte) 18);
        }
    }

    public static final void t(mm40 mm40Var, r5d0 r5d0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        r5d0Var.getClass();
        fetVar.g0(-1864666546);
        int i2 = i | 6 | (fetVar.g(r5d0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = ny9.O(2.0f, jm40Var, false);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarO, vgg0.a(16.0f));
            pz40 pz40Var = s6t0.f31722a;
            k7x.b(r5d0Var.b.a(), null, s5x0.J(i120.S(mm40VarJ, 2.0f, s6t0.b().f33626a.getPrimary(), vgg0.a(16.0f)), 2.0f), a8k0.F(R.drawable.ic_aggregator_placeholder, 0, fetVar), a8k0.F(R.drawable.ic_aggregator_placeholder, 0, fetVar), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var2, r5d0Var, i, (byte) 2);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1293949546);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, o7k0.n(mm40Var, 24.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 18);
        }
    }

    public static final void v(mm40 mm40Var, egg0 egg0Var, fet fetVar, int i) {
        int i2;
        int i3;
        long jM123getWhite0d7_KjU;
        fetVar.g0(1238102601);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(egg0Var) : fetVar.i(egg0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 24.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            mm40 mm40VarB = jr8.f16991a.b(o7k0.n(jm40.b, 16.0f), zx7Var);
            int iOrdinal = egg0Var.f7764a.ordinal();
            if (iOrdinal == 0) {
                i3 = R.drawable.ic_glyph_cyber_rainbow_six_atack;
            } else if (iOrdinal == 1) {
                i3 = R.drawable.ic_glyph_cyber_rainbow_six_kills;
            } else if (iOrdinal == 2) {
                i3 = R.drawable.ic_glyph_cyber_rainbow_six_obj;
            } else if (iOrdinal == 3) {
                i3 = R.drawable.ic_glyph_cyber_rainbow_six_def;
            } else if (iOrdinal == 4) {
                i3 = R.drawable.ic_glyph_cyber_rainbow_six_time;
            } else {
                if (iOrdinal != 5) {
                    t9f.b();
                    return;
                }
                i3 = R.drawable.ic_glyph_cyber_rainbow_six_swap;
            }
            s4u0 s4u0VarR = iom0.r(jpm0.t(i3, 6, fetVar), fetVar);
            int iOrdinal2 = egg0Var.b.ordinal();
            if (iOrdinal2 == 0) {
                jM123getWhite0d7_KjU = kkg.q;
            } else if (iOrdinal2 == 1) {
                jM123getWhite0d7_KjU = kkg.r;
            } else {
                if (iOrdinal2 != 2) {
                    t9f.b();
                    return;
                }
                jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            }
            dww.c(s4u0VarR, null, mm40VarB, jM123getWhite0d7_KjU, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) egg0Var, i, (byte) 21);
        }
    }

    public static final void w(mm40 mm40Var, bgg0 bgg0Var, fet fetVar, int i, int i2) {
        int i3;
        fetVar.g0(-451924882);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (fetVar.i(bgg0Var) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            ggg0 ggg0Var = bgg0Var.f2555a;
            if (ggg0Var.equals(dgg0.f6042a)) {
                fetVar.e0(-508108698);
                u(i5 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (ggg0Var instanceof egg0) {
                fetVar.e0(-508106655);
                v(mm40Var, (egg0) ggg0Var, fetVar, i5 & 14);
                fetVar.r(false);
            } else {
                if (!(ggg0Var instanceof fgg0)) {
                    throw b1j.f(-508111021, fetVar, false);
                }
                fetVar.e0(-508103742);
                x(mm40Var, (fgg0) ggg0Var, fetVar, i5 & 14);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n(mm40Var, bgg0Var, i, i2);
        }
    }

    public static final void x(mm40 mm40Var, fgg0 fgg0Var, fet fetVar, int i) {
        int i2;
        long jM130getWhite600d7_KjU;
        fet fetVar2 = fetVar;
        fetVar2.g0(1977189021);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(fgg0Var) : fetVar2.i(fgg0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 24.0f);
            int iOrdinal = fgg0Var.b.ordinal();
            if (iOrdinal == 0) {
                jM130getWhite600d7_KjU = kkg.q;
            } else if (iOrdinal == 1) {
                jM130getWhite600d7_KjU = kkg.r;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
                jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
            }
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, jM130getWhite600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            v8q0.a(fgg0Var.f9492a, jm40.b, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) fgg0Var, i, (byte) 22);
        }
    }

    public static final void y(String str, long j, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1905782033);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 32.0f);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, s5x0.L(o7k0.u(jm40Var, 0.0f, 144.0f, 1), 8.0f, 0.0f, 2), j, new n05(qmk.o, g1t0.i().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.i(), fetVar2, (i2 & 14) | ((i2 << 3) & 896), 24960, 110576);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w9m(str, j, i, (byte) 2);
        }
    }

    public static final void z(mm40 mm40Var, q7p q7pVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(801918119);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar2.g(q7pVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2);
            boolean z = fetVar2.k(bmd.n) == k6z.b;
            mm40 mm40VarD = o7k0.d(y860.W(mm40Var, null, null, false, null, function0, 28), 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), "FAVORITE_EVENT_CARD");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zx7 zx7Var = gqw0.c;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            boolean zH = fetVar2.h(z);
            Object objP = fetVar2.P();
            int i4 = i3;
            byte b = 5;
            if (zH || objP == ukd.f35823a) {
                objP = new jno(b, z);
                fetVar2.o0(objP);
            }
            k7x.b(q7pVar.b.a(), null, o7k0.n(i4w0.T(mm40VarB, (Function1) objP), 120.0f), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, new m78(((ThemeColors) fetVar2.k(zfnVar)).getBackgroundGroupSecondary(), 5), fetVar, 36912, 6, 27616);
            fetVar2 = fetVar;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            C(null, q7pVar.f28262a, q7pVar.d, q7pVar.h, function2, fetVar2, i4 & 57344);
            y7p y7pVar = q7pVar.c;
            if (y7pVar instanceof u7p) {
                fetVar2.e0(141824500);
                i(jm40Var, (u7p) y7pVar, fetVar2, 0);
                fetVar2.r(false);
            } else if (y7pVar instanceof v7p) {
                fetVar2.e0(142012887);
                l(jm40Var, (v7p) y7pVar, fetVar2, 0);
                fetVar2.r(false);
            } else if (y7pVar instanceof w7p) {
                fetVar2.e0(142199414);
                D(jm40Var, (w7p) y7pVar, fetVar2, 0);
                fetVar2.r(false);
            } else {
                if (!(y7pVar instanceof x7p)) {
                    throw b1j.f(-1935089607, fetVar2, false);
                }
                fetVar2.e0(142386871);
                E(jm40Var, (x7p) y7pVar, fetVar2, 0);
                fetVar2.r(false);
            }
            a(null, q7pVar.e, q7pVar.f, q7pVar.g, function1, fetVar2, (i4 << 3) & 57344);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new geb(mm40Var, q7pVar, function0, function1, function2, i, (byte) 4);
        }
    }
}
