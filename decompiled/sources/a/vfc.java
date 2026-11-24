package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vfc implements awh0 {
    public static final void A(mm40 mm40Var, ton tonVar, boolean z, fet fetVar, int i) {
        fetVar.g0(-1138189919);
        int i2 = (fetVar.g(tonVar) ? 32 : 16) | i | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(o7k0.d(o7k0.e(jm40Var, 56.0f), 1.0f), vbc.d0(null, fetVar, 0, 1)));
            g1x.l(s5x0.L(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).d, 0.0f, 2), u1c.M(-782473323, new jv1((Object) tonVar, z, (byte) 21), fetVar), fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpn(mm40Var, tonVar, z, i, (byte) 0);
        }
    }

    public static final void B(int i, fet fetVar) {
        fetVar.g0(2129769676);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 40.0f), 80.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svj(i, (byte) 23);
        }
    }

    public static final void C(t7o0 t7o0Var, npg0 npg0Var) {
        t7o0Var.c.setItems(npg0Var.f);
        ScrollView scrollView = t7o0Var.d;
        if (scrollView != null) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            if (!scrollView.isLaidOut() || scrollView.isLayoutRequested()) {
                scrollView.addOnLayoutChangeListener(new w23(t7o0Var, (byte) 8));
            } else {
                scrollView.fullScroll(130);
            }
        }
    }

    public static final void D(EventCardMiddleCricket eventCardMiddleCricket, zur zurVar) {
        zmk0 zmk0Var = zurVar.f45021a;
        Context context = eventCardMiddleCricket.getContext();
        context.getClass();
        eventCardMiddleCricket.setTopScore(zmk0Var.a(context));
        zmk0 zmk0Var2 = zurVar.b;
        Context context2 = eventCardMiddleCricket.getContext();
        context2.getClass();
        eventCardMiddleCricket.setBotScore(zmk0Var2.a(context2));
    }

    public static final void E(t7o0 t7o0Var, npg0 npg0Var) {
        SyntheticTimerView syntheticTimerView = t7o0Var.f;
        TextView textView = t7o0Var.g;
        String str = npg0Var.g;
        syntheticTimerView.setVisibility(str.length() > 0 ? 4 : 0);
        textView.setVisibility(str.length() != 0 ? 0 : 4);
        textView.setText(str);
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) t7o0Var.b.b).getLayoutParams();
        layoutParams.getClass();
        a3e a3eVar = (a3e) layoutParams;
        if (str.length() == 0) {
            a3eVar.j = syntheticTimerView.getId();
        } else {
            a3eVar.j = textView.getId();
        }
    }

    public static final String F(d310 d310Var, pz00 pz00Var, qz00 qz00Var, d310 d310Var2, ctf0 ctf0Var) {
        String strA;
        String strA2 = "";
        if (d310Var != d310Var2) {
            return "";
        }
        switch (qz00Var.ordinal()) {
            case 0:
                break;
            case 1:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_baron_nashor, Arrays.copyOf(new Object[0], 0));
                break;
            case 2:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_rift_heralt, Arrays.copyOf(new Object[0], 0));
                break;
            case 3:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_infernal_drake, Arrays.copyOf(new Object[0], 0));
                break;
            case 4:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_cloud_drake, Arrays.copyOf(new Object[0], 0));
                break;
            case 5:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_ocean_drake, Arrays.copyOf(new Object[0], 0));
                break;
            case 6:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_mountain_drake, Arrays.copyOf(new Object[0], 0));
                break;
            case 7:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_chemtech_drake, Arrays.copyOf(new Object[0], 0));
                break;
            case 8:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_hextech_drake, Arrays.copyOf(new Object[0], 0));
                break;
            case 9:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_elder_dragon, Arrays.copyOf(new Object[0], 0));
                break;
            case 10:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_top_t1_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 11:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_top_t2_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 12:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_top_t3_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 13:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_middle_t1_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 14:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_middle_t2_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 15:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_middle_t3_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 16:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_bottom_t1_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 17:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_bottom_t2_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 18:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_bottom_t3_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_top_nexus_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 20:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_bottom_nexus_tower, Arrays.copyOf(new Object[0], 0));
                break;
            case 21:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_top_inhibitor, Arrays.copyOf(new Object[0], 0));
                break;
            case 22:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_middle_inhibitor, Arrays.copyOf(new Object[0], 0));
                break;
            case 23:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_bottom_inhibitor, Arrays.copyOf(new Object[0], 0));
                break;
            case 24:
                strA2 = ctf0Var.b.a(R.string.lol_game_log_first_blood, Arrays.copyOf(new Object[0], 0));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                strA2 = ctf0Var.b.a(R.string.lol_event_type_win, Arrays.copyOf(new Object[0], 0));
                break;
            default:
                t9f.b();
                return null;
        }
        int iOrdinal = qz00Var.ordinal();
        if ((iOrdinal != 1 && iOrdinal != 2) || pz00Var == pz00.f27823a) {
            return strA2;
        }
        switch (pz00Var.ordinal()) {
            case 0:
                strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                break;
            case 1:
                strA = ctf0Var.b.a(R.string.first_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 2:
                strA = ctf0Var.b.a(R.string.second_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 3:
                strA = ctf0Var.b.a(R.string.third_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 4:
                strA = ctf0Var.b.a(R.string.fourth_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 5:
                strA = ctf0Var.b.a(R.string.fifth_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 6:
                strA = ctf0Var.b.a(R.string.sixth_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 7:
                strA = ctf0Var.b.a(R.string.seventh_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 8:
                strA = ctf0Var.b.a(R.string.eighth_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 9:
                strA = ctf0Var.b.a(R.string.ninth_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            case 10:
                strA = ctf0Var.b.a(R.string.tenth_event_number, Arrays.copyOf(new Object[0], 0));
                break;
            default:
                t9f.b();
                return null;
        }
        return kng0.l(strA, Separators.SP, strA2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int G(d310 d310Var, qz00 qz00Var, d310 d310Var2) {
        if (d310Var == d310Var2) {
            switch (qz00Var.ordinal()) {
                case 1:
                    return R.drawable.ic_lol_baron;
                case 2:
                    return R.drawable.ic_lol_gerald;
                case 3:
                    return R.drawable.ic_lol_dragon_infernal;
                case 4:
                    return R.drawable.ic_lol_dragon_cloud;
                case 5:
                    return R.drawable.ic_lol_dragon_ocean;
                case 6:
                    return R.drawable.ic_lol_dragon_mountain;
                case 7:
                    return R.drawable.ic_lol_dragon_chemtech;
                case 8:
                    return R.drawable.ic_lol_dragon_hextech;
                case 9:
                    return R.drawable.ic_lol_elder_dragon_statistic;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 20:
                    int iOrdinal = d310Var2.ordinal();
                    if (iOrdinal == 0) {
                        return R.drawable.cyber_lol_tower_dire_ic;
                    }
                    if (iOrdinal == 1) {
                        return R.drawable.cyber_lol_tower_radiant_ic;
                    }
                    if (iOrdinal != 2) {
                        t9f.b();
                        return 0;
                    }
                    break;
                case 21:
                case 22:
                case 23:
                    int iOrdinal2 = d310Var2.ordinal();
                    if (iOrdinal2 == 0) {
                        return R.drawable.cyber_lol_inhibitor_dire_ic;
                    }
                    if (iOrdinal2 == 1) {
                        return R.drawable.cyber_lol_inhibitor_radiant_ic;
                    }
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return 0;
                    }
                    break;
                case 24:
                    int iOrdinal3 = d310Var2.ordinal();
                    if (iOrdinal3 == 0) {
                        return R.drawable.cyber_lol_fb_radiant_ic;
                    }
                    if (iOrdinal3 == 1) {
                        return R.drawable.cyber_lol_fb_dire_ic;
                    }
                    if (iOrdinal3 != 2) {
                        t9f.b();
                        return 0;
                    }
                    break;
            }
        }
        return 0;
    }

    public static final int H(float f, float f2) {
        float f3 = f2 + f;
        if (f3 > 0.0f) {
            return si30.b((f / f3) * 100.0f);
        }
        return 0;
    }

    public static String I(FragmentScreen fragmentScreen) {
        fragmentScreen.getClass();
        return ufx.C(fragmentScreen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(ehl ehlVar) {
        if (((lm40) ehlVar).f20279a.n) {
            vcc.X(ehlVar, 1).o1();
        }
    }

    public static final jwe M(qhj qhjVar, boolean z) {
        qhjVar.getClass();
        String str = qhjVar.d;
        long j = qhjVar.p;
        String str2 = qhjVar.e;
        List list = qhjVar.g;
        List list2 = qhjVar.f;
        long j2 = qhjVar.q;
        if (j2 == 0) {
            j2 = j;
        }
        long j3 = qhjVar.v;
        long j4 = j2;
        long j5 = qhjVar.r;
        long j6 = qhjVar.c;
        String str3 = qhjVar.w;
        String strConcat = str.concat(str2.length() > 0 ? " - ".concat(str2) : "");
        int iMax = Math.max(list2.size(), list.size());
        String str4 = (String) CollectionsKt.firstOrNull(list2);
        String str5 = str4 == null ? "" : str4;
        String str6 = (String) CollectionsKt.W(1, list2);
        String str7 = str6 == null ? "" : str6;
        String str8 = (String) CollectionsKt.firstOrNull(list);
        String str9 = str8 == null ? "" : str8;
        String str10 = (String) CollectionsKt.W(1, list);
        String str11 = str10 == null ? "" : str10;
        double d = qhjVar.f28742a;
        double d2 = qhjVar.t;
        String str12 = qhjVar.n;
        String str13 = qhjVar.m;
        long j7 = qhjVar.j;
        long j8 = qhjVar.u;
        uoy uoyVar = z ? uoy.LIVE : uoy.LINE;
        yfa0 yfa0Var = yfa0.INSTANCE;
        String str14 = qhjVar.l;
        String str15 = qhjVar.B;
        String str16 = qhjVar.C;
        zeo zeoVar = qhjVar.D;
        return new jwe(j, j4, j6, j5, j3, str3, str12, str14, str13, j8, d2, strConcat, str, str2, iMax, str5, str7, str9, str11, j7, d, uoyVar, yfa0Var, str15, str16, new yeo(zeoVar.f44262a, zeoVar.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:167:0x025e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0267  */
    /* JADX WARN: Code duplicated, block: B:171:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0273  */
    /* JADX WARN: Code duplicated, block: B:173:0x027c  */
    /* JADX WARN: Code duplicated, block: B:175:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:179:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:182:0x02af  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:196:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:201:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:209:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:212:0x0304  */
    /* JADX WARN: Code duplicated, block: B:213:0x0311  */
    /* JADX WARN: Code duplicated, block: B:216:0x031f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0339  */
    /* JADX WARN: Code duplicated, block: B:224:0x0343  */
    /* JADX WARN: Code duplicated, block: B:225:0x0346  */
    /* JADX WARN: Code duplicated, block: B:226:0x0349  */
    /* JADX WARN: Code duplicated, block: B:228:0x034c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0350  */
    /* JADX WARN: Code duplicated, block: B:231:0x0357  */
    /* JADX WARN: Code duplicated, block: B:233:0x035b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0362  */
    /* JADX WARN: Code duplicated, block: B:236:0x0366  */
    /* JADX WARN: Code duplicated, block: B:238:0x0374 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x0376  */
    /* JADX WARN: Code duplicated, block: B:240:0x0379  */
    /* JADX WARN: Code duplicated, block: B:241:0x037c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0384  */
    /* JADX WARN: Code duplicated, block: B:247:0x0390  */
    /* JADX WARN: Code duplicated, block: B:250:0x039a  */
    /* JADX WARN: Code duplicated, block: B:253:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:259:0x03be  */
    /* JADX WARN: Code duplicated, block: B:262:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:263:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:266:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:267:0x03de  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:271:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:274:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:275:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:278:0x0407  */
    /* JADX WARN: Code duplicated, block: B:279:0x040e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0417  */
    /* JADX WARN: Code duplicated, block: B:283:0x041e  */
    /* JADX WARN: Code duplicated, block: B:285:0x0426  */
    /* JADX WARN: Code duplicated, block: B:286:0x042d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0441  */
    /* JADX WARN: Code duplicated, block: B:290:0x0448  */
    /* JADX WARN: Code duplicated, block: B:293:0x044e  */
    /* JADX WARN: Code duplicated, block: B:296:0x0458  */
    /* JADX WARN: Code duplicated, block: B:299:0x046d  */
    /* JADX WARN: Code duplicated, block: B:301:0x047a  */
    /* JADX WARN: Code duplicated, block: B:302:0x047d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0483  */
    /* JADX WARN: Code duplicated, block: B:306:0x048a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0490  */
    /* JADX WARN: Code duplicated, block: B:310:0x0497  */
    /* JADX WARN: Code duplicated, block: B:313:0x049d  */
    /* JADX WARN: Code duplicated, block: B:314:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:317:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:318:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:321:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:322:0x04be  */
    /* JADX WARN: Code duplicated, block: B:325:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:326:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:329:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:333:0x04de  */
    /* JADX WARN: Code duplicated, block: B:334:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:337:0x050e  */
    /* JADX WARN: Code duplicated, block: B:341:0x052a  */
    /* JADX WARN: Code duplicated, block: B:347:0x0538  */
    /* JADX WARN: Code duplicated, block: B:421:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x055f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x032b A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.wrf] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.wrf] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5, types: [int] */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5, types: [int] */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v5, types: [int] */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4, types: [int] */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v4, types: [int] */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3, types: [int] */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2, types: [int] */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [int] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public static final fof N(lrf lrfVar) {
        boolean z;
        fof fofVar;
        irf irfVar;
        boolean z2;
        boolean z3;
        rrf rrfVar;
        List listT0;
        String str;
        ?? N;
        Integer num;
        int iIntValue;
        Integer num2;
        sqf sqfVar;
        Boolean bool;
        boolean zBooleanValue;
        long jLongValue;
        ListIterator listIterator;
        Object objPrevious;
        slf slfVar;
        slf slfVar2;
        pif pifVar;
        String strY;
        int iOrdinal;
        pif pifVar2;
        qqf qqfVar;
        kif kifVar;
        long jLongValue2;
        List<spf> list;
        ?? arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        Integer num3;
        ?? IntValue;
        Integer num4;
        ?? IntValue2;
        Integer num5;
        ?? IntValue3;
        Integer num6;
        ?? IntValue4;
        Integer num7;
        ?? IntValue5;
        Integer num8;
        ?? IntValue6;
        Integer num9;
        ?? IntValue7;
        Integer num10;
        ?? IntValue8;
        boolean zO;
        int i;
        Object objSubSequence;
        isf isfVar;
        if (lrfVar == null || (rrfVar = lrfVar.f20529a) == null) {
            z = false;
            fofVar = null;
            sqf sqfVar2 = sqf.f32627a;
            kif kifVar2 = new kif(pif.d, -1, -1);
            iun iunVar = iun.f15405a;
            irfVar = new irf(0, sqfVar2, "", false, kifVar2, 0L, 0L, iunVar, iunVar, 0.0f, iunVar, 0, 0, iunVar);
        } else {
            List list2 = rrfVar.g;
            Long l = rrfVar.e;
            int i2 = 4;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    for (Map.Entry entry : ((edy) it.next()).f7643a.entrySet()) {
                        String str4 = (String) entry.getKey();
                        mcy mcyVar = (mcy) entry.getValue();
                        if (mcyVar instanceof edy) {
                            edy edyVar = (edy) mcyVar;
                            switch (str4.hashCode()) {
                                case -1861625298:
                                    if (str4.equals("suicide")) {
                                        zrf zrfVar = new zrf(edyVar);
                                        String str5 = zrfVar.f44851a;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        String str6 = zrfVar.c;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        arrayList3.add(new plf(str5, hic.E(zrfVar.b), str6));
                                    }
                                    break;
                                case -1286937752:
                                    if (str4.equals("bombplanted")) {
                                        nif nifVar = new nif(edyVar);
                                        String str7 = nifVar.f23584a;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        Integer num11 = nifVar.b;
                                        int iIntValue2 = num11 != null ? num11.intValue() : 0;
                                        Integer num12 = nifVar.c;
                                        int iIntValue3 = num12 != null ? num12.intValue() : 0;
                                        String str8 = nifVar.d;
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        llf llfVar = new llf(str7, iIntValue2, iIntValue3, str8);
                                        if (str7.length() > 0) {
                                            arrayList3.add(llfVar);
                                        }
                                    }
                                    break;
                                case -127476844:
                                    if (str4.equals("roundstart")) {
                                        arrayList3.add(rlf.f30694a);
                                    }
                                    break;
                                case -146291:
                                    if (str4.equals("roundend")) {
                                        grf grfVar = new grf(edyVar);
                                        Integer num13 = grfVar.f11776a;
                                        int iIntValue4 = num13 != null ? num13.intValue() : 0;
                                        Integer num14 = grfVar.b;
                                        int iIntValue5 = num14 != null ? num14.intValue() : 0;
                                        wpf wpfVarE = hic.E(grfVar.c);
                                        lsf lsfVar = grfVar.d;
                                        int i3 = lsfVar == null ? -1 : jsf.f17048a[lsfVar.ordinal()];
                                        if (i3 == 1) {
                                            isfVar = isf.f15300a;
                                        } else if (i3 == 2) {
                                            isfVar = isf.c;
                                        } else if (i3 == 3) {
                                            isfVar = isf.b;
                                        } else if (i3 != i2) {
                                            isfVar = i3 != 5 ? isf.f : isf.e;
                                        } else {
                                            isfVar = isf.d;
                                        }
                                        arrayList3.add(new olf(iIntValue4, iIntValue5, wpfVarE, isfVar));
                                    }
                                    break;
                                case 3291998:
                                    if (str4.equals("kill")) {
                                        iof iofVar = new iof(edyVar);
                                        String str9 = iofVar.f15114a;
                                        String str10 = str9 == null ? "" : str9;
                                        wpf wpfVarE2 = hic.E(iofVar.b);
                                        String str11 = iofVar.c;
                                        String str12 = str11 == null ? "" : str11;
                                        wpf wpfVarE3 = hic.E(iofVar.d);
                                        String str13 = iofVar.e;
                                        String str14 = str13 == null ? "" : str13;
                                        Boolean bool2 = iofVar.f;
                                        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                        Boolean bool3 = iofVar.g;
                                        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                                        Boolean bool4 = iofVar.h;
                                        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                                        Boolean bool5 = iofVar.i;
                                        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
                                        Boolean bool6 = iofVar.j;
                                        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
                                        String str15 = iofVar.k;
                                        String str16 = str15 == null ? "" : str15;
                                        wpf wpfVarE4 = hic.E(iofVar.n);
                                        String str17 = iofVar.l;
                                        String str18 = str17 == null ? "" : str17;
                                        wpf wpfVarE5 = hic.E(iofVar.m);
                                        Integer num15 = iofVar.o;
                                        int iIntValue6 = num15 != null ? num15.intValue() : -1;
                                        Integer num16 = iofVar.p;
                                        mlf mlfVar = new mlf(str10, wpfVarE2, str12, wpfVarE3, str14, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, str16, wpfVarE4, str18, wpfVarE5, iIntValue6, num16 != null ? num16.intValue() : -1);
                                        if (str10.length() > 0 && str12.length() > 0 && str14.length() > 0) {
                                            arrayList3.add(mlfVar);
                                        }
                                    }
                                    break;
                                case 752341088:
                                    if (str4.equals("bombdefused")) {
                                        String str19 = new jif(edyVar).f16572a;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        klf klfVar = new klf(str19);
                                        if (str19.length() > 0) {
                                            arrayList3.add(klfVar);
                                        }
                                    }
                                    break;
                                case 1097506319:
                                    if (str4.equals("restart")) {
                                        arrayList3.add(qlf.f28931a);
                                    }
                                    break;
                                case 2070859548:
                                    if (str4.equals("matchstarted")) {
                                        String str20 = new vpf(edyVar).f37801a;
                                        if (str20 == null) {
                                            str20 = "";
                                        }
                                        arrayList3.add(new nlf(str20));
                                    }
                                    break;
                            }
                        }
                        i2 = 4;
                    }
                }
                fofVar = null;
                listT0 = CollectionsKt.t0(arrayList3);
                if (listT0 == null) {
                }
                str = rrfVar.c;
                if (str != null) {
                    zO = StringsKt.O(str, "de_", false);
                    N = str;
                    if (zO) {
                        i = new IntRange(0, 2, 1).b + 1;
                        if (i >= 0) {
                            v4i0.m(ua80.e(i, "End index (", ") is less than start index (0)."));
                            return fofVar;
                        }
                        if (i == 0) {
                            objSubSequence = str.subSequence(0, str.length());
                        } else {
                            StringBuilder sb = new StringBuilder(str.length() - i);
                            sb.append((CharSequence) str, 0, 0);
                            sb.append((CharSequence) str, i, str.length());
                            objSubSequence = sb;
                        }
                        N = sj3.N(objSubSequence.toString());
                    }
                } else {
                    N = fofVar;
                }
                if (N == 0) {
                    N = "";
                }
                num = rrfVar.f30981a;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                num2 = rrfVar.b;
                if (num2 != null && num2.intValue() == 2) {
                    sqfVar = sqf.b;
                } else if (num2 != null && num2.intValue() == 3) {
                    sqfVar = sqf.c;
                } else if (num2 == null && num2.intValue() == 4) {
                    sqfVar = sqf.d;
                } else {
                    sqfVar = sqf.f32627a;
                }
                sqf sqfVar3 = sqfVar;
                bool = rrfVar.d;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                listT0.getClass();
                if (listT0.isEmpty()) {
                    kifVar = new kif(pif.d, -1, -1);
                    z = false;
                } else {
                    listIterator = listT0.listIterator(listT0.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                        } else {
                            objPrevious = fofVar;
                        }
                        slfVar = (slf) objPrevious;
                        slfVar2 = (slf) CollectionsKt.d0(listT0);
                        if (jLongValue > 0) {
                            strY = qzb.Y(slfVar);
                            if (strY.length() == 0) {
                                pifVar = pif.d;
                            } else {
                                pifVar = pif.f27040a;
                            }
                        } else if (slfVar2 != null) {
                            pifVar = pif.d;
                            strY = "";
                        } else if (slfVar2 instanceof llf) {
                            strY = ((llf) slfVar2).d;
                            pifVar = pif.f27040a;
                        } else if (slfVar2 instanceof klf) {
                            strY = qzb.Y(slfVar);
                            pifVar = pif.b;
                        } else if (slfVar2 instanceof olf) {
                            String strY2 = qzb.Y(slfVar);
                            iOrdinal = ((olf) slfVar2).d.ordinal();
                            if (iOrdinal != 1) {
                                pifVar2 = pif.c;
                            } else if (iOrdinal != 3) {
                                pifVar2 = pif.d;
                            } else {
                                pifVar2 = pif.b;
                            }
                            pifVar = pifVar2;
                            strY = strY2;
                        } else {
                            pifVar = pif.d;
                            strY = "";
                        }
                        switch (N) {
                            case "Mirage":
                                z = false;
                                qqfVar = qzb.X(oof.f, strY);
                                break;
                            case "Inferno":
                                qqfVar = qzb.X(nof.f, strY);
                                z = false;
                                break;
                            case "Nuke":
                                qqfVar = qzb.X(qof.f, strY);
                                z = false;
                                break;
                            case "Dust2":
                                qqfVar = qzb.X(mof.f, strY);
                                z = false;
                                break;
                            case "Train":
                                qqfVar = qzb.X(sof.f, strY);
                                z = false;
                                break;
                            case "Overpass":
                                qqfVar = qzb.X(rof.f, strY);
                                z = false;
                                break;
                            case "Ancient":
                                qqfVar = qzb.X(kof.f, strY);
                                z = false;
                                break;
                            case "Anubis":
                                qqfVar = qzb.X(lof.f, strY);
                                z = false;
                                break;
                            case "Vertigo":
                                qqfVar = qzb.X(tof.f, strY);
                                z = false;
                                break;
                            case "Dust_2":
                                qqfVar = qzb.X(mof.f, strY);
                                z = false;
                                break;
                            default:
                                z = false;
                                qqfVar = new qqf(0, 0);
                                break;
                        }
                        kifVar = new kif(pifVar, qqfVar.f29163a, qqfVar.b);
                    } while (!(((slf) objPrevious) instanceof llf));
                    slfVar = (slf) objPrevious;
                    slfVar2 = (slf) CollectionsKt.d0(listT0);
                    if (jLongValue > 0) {
                        strY = qzb.Y(slfVar);
                        if (strY.length() == 0) {
                            pifVar = pif.d;
                        } else {
                            pifVar = pif.f27040a;
                        }
                    } else if (slfVar2 != null) {
                        pifVar = pif.d;
                        strY = "";
                    } else if (slfVar2 instanceof llf) {
                        strY = ((llf) slfVar2).d;
                        pifVar = pif.f27040a;
                    } else if (slfVar2 instanceof klf) {
                        strY = qzb.Y(slfVar);
                        pifVar = pif.b;
                    } else if (slfVar2 instanceof olf) {
                        String strY3 = qzb.Y(slfVar);
                        iOrdinal = ((olf) slfVar2).d.ordinal();
                        if (iOrdinal != 1) {
                            pifVar2 = pif.c;
                        } else if (iOrdinal != 3) {
                            pifVar2 = pif.d;
                        } else {
                            pifVar2 = pif.b;
                        }
                        pifVar = pifVar2;
                        strY = strY3;
                    } else {
                        pifVar = pif.d;
                        strY = "";
                    }
                    switch (N) {
                        case -1990060279:
                            if (!N.equals("Mirage")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                z = false;
                                qqfVar = qzb.X(oof.f, strY);
                            }
                            break;
                        case -685180305:
                            if (!N.equals("Inferno")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(nof.f, strY);
                                z = false;
                            }
                            break;
                        case 2439553:
                            if (!N.equals("Nuke")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(qof.f, strY);
                                z = false;
                            }
                            break;
                        case 66399136:
                            if (!N.equals("Dust2")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(mof.f, strY);
                                z = false;
                            }
                            break;
                        case 81068520:
                            if (!N.equals("Train")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(sof.f, strY);
                                z = false;
                            }
                            break;
                        case 594574085:
                            if (!N.equals("Overpass")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(rof.f, strY);
                                z = false;
                            }
                            break;
                        case 802060952:
                            if (!N.equals("Ancient")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(kof.f, strY);
                                z = false;
                            }
                            break;
                        case 1966065220:
                            if (!N.equals("Anubis")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(lof.f, strY);
                                z = false;
                            }
                            break;
                        case 2016290848:
                            if (!N.equals("Vertigo")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(tof.f, strY);
                                z = false;
                            }
                            break;
                        case 2058374661:
                            if (!N.equals("Dust_2")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(mof.f, strY);
                                z = false;
                            }
                            break;
                        default:
                            z = false;
                            qqfVar = new qqf(0, 0);
                            break;
                    }
                    kifVar = new kif(pifVar, qqfVar.f29163a, qqfVar.b);
                }
                if (l != null) {
                    jLongValue2 = l.longValue();
                } else {
                    jLongValue2 = 0;
                }
                Long l2 = rrfVar.f;
                long jLongValue3 = l2 != null ? l2.longValue() : 0L;
                list = rrfVar.h;
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (spf spfVar : list) {
                        spfVar.getClass();
                        str2 = spfVar.f32590a;
                        if (str2 == null) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        num3 = spfVar.b;
                        if (num3 != null) {
                            IntValue = num3.intValue();
                        } else {
                            IntValue = z;
                        }
                        num4 = spfVar.c;
                        if (num4 != null) {
                            IntValue2 = num4.intValue();
                        } else {
                            IntValue2 = z;
                        }
                        num5 = spfVar.d;
                        if (num5 != null) {
                            IntValue3 = num5.intValue();
                        } else {
                            IntValue3 = z;
                        }
                        num6 = spfVar.e;
                        if (num6 != null) {
                            IntValue4 = num6.intValue();
                        } else {
                            IntValue4 = z;
                        }
                        num7 = spfVar.g;
                        if (num7 != null) {
                            IntValue5 = num7.intValue();
                        } else {
                            IntValue5 = z;
                        }
                        num8 = spfVar.f;
                        if (num8 != null) {
                            IntValue6 = num8.intValue();
                        } else {
                            IntValue6 = z;
                        }
                        num9 = spfVar.i;
                        if (num9 != null) {
                            IntValue7 = num9.intValue();
                        } else {
                            IntValue7 = z;
                        }
                        num10 = spfVar.h;
                        if (num10 != null) {
                            IntValue8 = num10.intValue();
                        } else {
                            IntValue8 = z;
                        }
                        arrayList.add(new ppf(str3, IntValue, IntValue2, IntValue3, IntValue4, IntValue6, IntValue5, IntValue8, IntValue7, hic.E(spfVar.j), hic.E(spfVar.k), hic.E(spfVar.l), hic.E(spfVar.m)));
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                ?? r30 = arrayList;
                float f = qzb.k0(N).e;
                arrayList2 = new ArrayList();
                for (slf slfVar3 : CollectionsKt.t0(listT0)) {
                    if (slfVar3 != null) {
                        if (slfVar3 instanceof olf) {
                            irfVar = new irf(iIntValue, sqfVar3, N, zBooleanValue, kifVar, jLongValue2, jLongValue3, r30, listT0, f, arrayList2, qzb.k0(N).c, qzb.k0(N).d, qzb.k0(N).b);
                        } else if (slfVar3 instanceof mlf) {
                            mlf mlfVar2 = (mlf) slfVar3;
                            arrayList2.add(new vof(mlfVar2.c, mlfVar2.o, mlfVar2.p, -1, mlfVar2.d, false, false));
                        }
                    }
                }
                irfVar = new irf(iIntValue, sqfVar3, N, zBooleanValue, kifVar, jLongValue2, jLongValue3, r30, listT0, f, arrayList2, qzb.k0(N).c, qzb.k0(N).d, qzb.k0(N).b);
            } else {
                fofVar = null;
            }
            listT0 = iun.f15405a;
            str = rrfVar.c;
            if (str != null) {
                zO = StringsKt.O(str, "de_", false);
                N = str;
                if (zO) {
                    i = new IntRange(0, 2, 1).b + 1;
                    if (i >= 0) {
                        v4i0.m(ua80.e(i, "End index (", ") is less than start index (0)."));
                        return fofVar;
                    }
                    if (i == 0) {
                        objSubSequence = str.subSequence(0, str.length());
                    } else {
                        StringBuilder sb2 = new StringBuilder(str.length() - i);
                        sb2.append((CharSequence) str, 0, 0);
                        sb2.append((CharSequence) str, i, str.length());
                        objSubSequence = sb2;
                    }
                    N = sj3.N(objSubSequence.toString());
                }
            } else {
                N = fofVar;
            }
            if (N == 0) {
                N = "";
            }
            num = rrfVar.f30981a;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            num2 = rrfVar.b;
            if (num2 != null) {
                sqfVar = sqf.b;
            } else if (num2 != null) {
                sqfVar = sqf.c;
            } else if (num2 == null) {
                sqfVar = sqf.f32627a;
            } else {
                sqfVar = sqf.d;
            }
            sqf sqfVar4 = sqfVar;
            bool = rrfVar.d;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            listT0.getClass();
            if (listT0.isEmpty()) {
                kifVar = new kif(pif.d, -1, -1);
                z = false;
            } else {
                listIterator = listT0.listIterator(listT0.size());
                do {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                    } else {
                        objPrevious = fofVar;
                    }
                    slfVar = (slf) objPrevious;
                    slfVar2 = (slf) CollectionsKt.d0(listT0);
                    if (jLongValue > 0) {
                        strY = qzb.Y(slfVar);
                        if (strY.length() == 0) {
                            pifVar = pif.d;
                        } else {
                            pifVar = pif.f27040a;
                        }
                    } else if (slfVar2 != null) {
                        pifVar = pif.d;
                        strY = "";
                    } else if (slfVar2 instanceof llf) {
                        strY = ((llf) slfVar2).d;
                        pifVar = pif.f27040a;
                    } else if (slfVar2 instanceof klf) {
                        strY = qzb.Y(slfVar);
                        pifVar = pif.b;
                    } else if (slfVar2 instanceof olf) {
                        String strY4 = qzb.Y(slfVar);
                        iOrdinal = ((olf) slfVar2).d.ordinal();
                        if (iOrdinal != 1) {
                            pifVar2 = pif.c;
                        } else if (iOrdinal != 3) {
                            pifVar2 = pif.d;
                        } else {
                            pifVar2 = pif.b;
                        }
                        pifVar = pifVar2;
                        strY = strY4;
                    } else {
                        pifVar = pif.d;
                        strY = "";
                    }
                    switch (N) {
                        case -1990060279:
                            if (!N.equals("Mirage")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                z = false;
                                qqfVar = qzb.X(oof.f, strY);
                            }
                            break;
                        case -685180305:
                            if (!N.equals("Inferno")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(nof.f, strY);
                                z = false;
                            }
                            break;
                        case 2439553:
                            if (!N.equals("Nuke")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(qof.f, strY);
                                z = false;
                            }
                            break;
                        case 66399136:
                            if (!N.equals("Dust2")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(mof.f, strY);
                                z = false;
                            }
                            break;
                        case 81068520:
                            if (!N.equals("Train")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(sof.f, strY);
                                z = false;
                            }
                            break;
                        case 594574085:
                            if (!N.equals("Overpass")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(rof.f, strY);
                                z = false;
                            }
                            break;
                        case 802060952:
                            if (!N.equals("Ancient")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(kof.f, strY);
                                z = false;
                            }
                            break;
                        case 1966065220:
                            if (!N.equals("Anubis")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(lof.f, strY);
                                z = false;
                            }
                            break;
                        case 2016290848:
                            if (!N.equals("Vertigo")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(tof.f, strY);
                                z = false;
                            }
                            break;
                        case 2058374661:
                            if (!N.equals("Dust_2")) {
                                z = false;
                                qqfVar = new qqf(0, 0);
                            } else {
                                qqfVar = qzb.X(mof.f, strY);
                                z = false;
                            }
                            break;
                        default:
                            z = false;
                            qqfVar = new qqf(0, 0);
                            break;
                    }
                    kifVar = new kif(pifVar, qqfVar.f29163a, qqfVar.b);
                } while (!(((slf) objPrevious) instanceof llf));
                slfVar = (slf) objPrevious;
                slfVar2 = (slf) CollectionsKt.d0(listT0);
                if (jLongValue > 0) {
                    strY = qzb.Y(slfVar);
                    if (strY.length() == 0) {
                        pifVar = pif.d;
                    } else {
                        pifVar = pif.f27040a;
                    }
                } else if (slfVar2 != null) {
                    pifVar = pif.d;
                    strY = "";
                } else if (slfVar2 instanceof llf) {
                    strY = ((llf) slfVar2).d;
                    pifVar = pif.f27040a;
                } else if (slfVar2 instanceof klf) {
                    strY = qzb.Y(slfVar);
                    pifVar = pif.b;
                } else if (slfVar2 instanceof olf) {
                    String strY5 = qzb.Y(slfVar);
                    iOrdinal = ((olf) slfVar2).d.ordinal();
                    if (iOrdinal != 1) {
                        pifVar2 = pif.c;
                    } else if (iOrdinal != 3) {
                        pifVar2 = pif.d;
                    } else {
                        pifVar2 = pif.b;
                    }
                    pifVar = pifVar2;
                    strY = strY5;
                } else {
                    pifVar = pif.d;
                    strY = "";
                }
                switch (N) {
                    case -1990060279:
                        if (!N.equals("Mirage")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            z = false;
                            qqfVar = qzb.X(oof.f, strY);
                        }
                        break;
                    case -685180305:
                        if (!N.equals("Inferno")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(nof.f, strY);
                            z = false;
                        }
                        break;
                    case 2439553:
                        if (!N.equals("Nuke")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(qof.f, strY);
                            z = false;
                        }
                        break;
                    case 66399136:
                        if (!N.equals("Dust2")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(mof.f, strY);
                            z = false;
                        }
                        break;
                    case 81068520:
                        if (!N.equals("Train")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(sof.f, strY);
                            z = false;
                        }
                        break;
                    case 594574085:
                        if (!N.equals("Overpass")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(rof.f, strY);
                            z = false;
                        }
                        break;
                    case 802060952:
                        if (!N.equals("Ancient")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(kof.f, strY);
                            z = false;
                        }
                        break;
                    case 1966065220:
                        if (!N.equals("Anubis")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(lof.f, strY);
                            z = false;
                        }
                        break;
                    case 2016290848:
                        if (!N.equals("Vertigo")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(tof.f, strY);
                            z = false;
                        }
                        break;
                    case 2058374661:
                        if (!N.equals("Dust_2")) {
                            z = false;
                            qqfVar = new qqf(0, 0);
                        } else {
                            qqfVar = qzb.X(mof.f, strY);
                            z = false;
                        }
                        break;
                    default:
                        z = false;
                        qqfVar = new qqf(0, 0);
                        break;
                }
                kifVar = new kif(pifVar, qqfVar.f29163a, qqfVar.b);
            }
            if (l != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = 0;
            }
            Long l3 = rrfVar.f;
            long jLongValue4 = l3 != null ? l3.longValue() : 0L;
            list = rrfVar.h;
            if (list != null) {
                arrayList = new ArrayList(r3d.q(list, 10));
                while (r4.hasNext()) {
                    spfVar.getClass();
                    str2 = spfVar.f32590a;
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    num3 = spfVar.b;
                    if (num3 != null) {
                        IntValue = num3.intValue();
                    } else {
                        IntValue = z;
                    }
                    num4 = spfVar.c;
                    if (num4 != null) {
                        IntValue2 = num4.intValue();
                    } else {
                        IntValue2 = z;
                    }
                    num5 = spfVar.d;
                    if (num5 != null) {
                        IntValue3 = num5.intValue();
                    } else {
                        IntValue3 = z;
                    }
                    num6 = spfVar.e;
                    if (num6 != null) {
                        IntValue4 = num6.intValue();
                    } else {
                        IntValue4 = z;
                    }
                    num7 = spfVar.g;
                    if (num7 != null) {
                        IntValue5 = num7.intValue();
                    } else {
                        IntValue5 = z;
                    }
                    num8 = spfVar.f;
                    if (num8 != null) {
                        IntValue6 = num8.intValue();
                    } else {
                        IntValue6 = z;
                    }
                    num9 = spfVar.i;
                    if (num9 != null) {
                        IntValue7 = num9.intValue();
                    } else {
                        IntValue7 = z;
                    }
                    num10 = spfVar.h;
                    if (num10 != null) {
                        IntValue8 = num10.intValue();
                    } else {
                        IntValue8 = z;
                    }
                    arrayList.add(new ppf(str3, IntValue, IntValue2, IntValue3, IntValue4, IntValue6, IntValue5, IntValue8, IntValue7, hic.E(spfVar.j), hic.E(spfVar.k), hic.E(spfVar.l), hic.E(spfVar.m)));
                }
            } else {
                arrayList = iun.f15405a;
            }
            ?? r31 = arrayList;
            float f2 = qzb.k0(N).e;
            arrayList2 = new ArrayList();
            while (r6.hasNext()) {
                if (slfVar3 != null) {
                    if (slfVar3 instanceof olf) {
                        irfVar = new irf(iIntValue, sqfVar4, N, zBooleanValue, kifVar, jLongValue2, jLongValue4, r31, listT0, f2, arrayList2, qzb.k0(N).c, qzb.k0(N).d, qzb.k0(N).b);
                    } else if (slfVar3 instanceof mlf) {
                        mlf mlfVar3 = (mlf) slfVar3;
                        arrayList2.add(new vof(mlfVar3.c, mlfVar3.o, mlfVar3.p, -1, mlfVar3.d, false, false));
                    }
                }
            }
            irfVar = new irf(iIntValue, sqfVar4, N, zBooleanValue, kifVar, jLongValue2, jLongValue4, r31, listT0, f2, arrayList2, qzb.k0(N).c, qzb.k0(N).d, qzb.k0(N).b);
        }
        trf trfVarW = ahb.W(lrfVar != null ? lrfVar.b : fofVar);
        List list3 = trfVarW.f34420a;
        trf trfVarW2 = ahb.W(lrfVar != null ? lrfVar.c : fofVar);
        List list4 = trfVarW2.f34420a;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    pqf pqfVar = (pqf) it2.next();
                    if (pqfVar.k != -1 && pqfVar.l != -1) {
                        z2 = true;
                    }
                } else {
                    z2 = z;
                }
            }
        } else {
            z2 = z;
        }
        if (list4 == null || !list4.isEmpty()) {
            Iterator it3 = list4.iterator();
            while (true) {
                if (it3.hasNext()) {
                    pqf pqfVar2 = (pqf) it3.next();
                    if (pqfVar2.k != -1 && pqfVar2.l != -1) {
                        z3 = true;
                    }
                } else {
                    z3 = z;
                }
            }
        } else {
            z3 = z;
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(list3, list4);
        sqf sqfVar5 = sqf.f32627a;
        kif kifVar3 = new kif(pif.d, -1, -1);
        iun iunVar2 = iun.f15405a;
        return new fof(irfVar, trfVarW, trfVarW2, arrayListQ0, !irfVar.equals(new irf(0, sqfVar5, "", false, kifVar3, 0L, 0L, iunVar2, iunVar2, 0.0f, iunVar2, 0, 0, iunVar2)), (z2 || z3) ? true : z);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    public static final idh O(vdh vdhVar, boolean z, uaq0 uaq0Var) {
        String str;
        String str2;
        String string;
        vdhVar.getClass();
        uaq0Var.getClass();
        if (vdhVar instanceof odh) {
            odh odhVar = (odh) vdhVar;
            str = z ? "ru/" : "en/";
            uaq0.f35345a.getClass();
            String str3 = "_l";
            if (!s9m0.j(uaq0Var)) {
                if (s9m0.i(uaq0Var)) {
                    str3 = "_d";
                } else if (s9m0.k(uaq0Var)) {
                    str3 = "_n";
                }
            }
            string = b1j.k("static/img/android/instructions/onboarding_cyber_sport/", str, odhVar.c, str3, ".png");
        } else {
            str = z ? "ru/" : "en/";
            String str4 = "";
            if (vdhVar instanceof kdh) {
                str2 = "event_screen/";
            } else if (vdhVar instanceof udh) {
                str2 = "tournament_screen/";
            } else if (vdhVar instanceof rdh) {
                str2 = "command_screen/";
            } else if (vdhVar instanceof qdh) {
                str2 = "esports_promo/";
            } else if (vdhVar instanceof jdh) {
                str2 = "event_calendar/";
            } else {
                str2 = vdhVar instanceof pdh ? "esports_partners/" : "";
            }
            if (vdhVar.b()) {
                uaq0.f35345a.getClass();
                if (s9m0.j(uaq0Var)) {
                    str4 = "light_theme/";
                } else if (s9m0.i(uaq0Var)) {
                    str4 = "dark_theme/";
                } else if (s9m0.k(uaq0Var)) {
                    str4 = "night_theme/";
                } else {
                    str4 = "light_theme/";
                }
            }
            StringBuilder sbN = b1j.n("static/img/ImgDefault/Esports/FAQ/", str, str2, str4, vdhVar.a());
            sbN.append(".png");
            string = sbN.toString();
        }
        return new idh(vdhVar, string);
    }

    public static final k9q P(sbq sbqVar, boolean z, wbq wbqVar) {
        eho ehoVar;
        String strR = sbqVar.f31947a;
        boolean zO = StringsKt.O(strR, Separators.SLASH, false);
        if (zO) {
            strR = kotlin.text.c.r(strR, Separators.SLASH, "/\u200b", false);
        }
        double d = sbqVar.b;
        if (d == 0.0d) {
            strR = "-";
        }
        String str = strR;
        wbq wbqVar2 = sbqVar.e;
        if (wbqVar == wbqVar2 && z) {
            ehoVar = eho.b;
        } else {
            ehoVar = z ? eho.c : eho.f7817a;
        }
        return new k9q(str, d, wbqVar2, ehoVar, zO);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public static final vcm0 Q(icg icgVar, String str) {
        bh30 bh30VarB;
        String value;
        String strR;
        String str2;
        str.getClass();
        String strValueOf = String.valueOf(icgVar.f14535a);
        long j = icgVar.f;
        cg30 cg30Var = icgVar.o;
        String str3 = icgVar.c;
        if (str3.length() == 0 || cg30Var == cg30.g) {
            str2 = "";
        } else {
            long j2 = icgVar.g;
            if (j2 == jwg.d.b) {
                bh30 bh30VarB2 = new Regex("(\\d+(?:\\.\\d+)?)").b(str3);
                String value2 = bh30VarB2 != null ? bh30VarB2.getValue() : null;
                bh30 bh30VarB3 = new Regex("(\\s[:-]\\s(\\d+(?:\\.\\d+)?))").b(str3);
                strR = ohs0.n(value2, bh30VarB3 != null ? bh30VarB3.getValue() : null);
            } else if (j2 == csg.d.b || j2 == rtg.d.b || (bh30VarB = new Regex("\\d+[:-]\\d+|\\d+ - \\d+").b(str3)) == null || (value = bh30VarB.getValue()) == null) {
                str2 = "";
            } else {
                strR = kotlin.text.c.r(value, Separators.COLON, " : ", false);
            }
            str2 = strR;
        }
        heg hegVar = icgVar.i;
        String str4 = hegVar.f12922a;
        String str5 = (String) CollectionsKt.firstOrNull(hegVar.b);
        if (str5 == null) {
            str5 = "";
        }
        iun iunVar = iun.f15405a;
        y6p0 y6p0Var = new y6p0(iunVar, "", str4, str5);
        heg hegVar2 = icgVar.j;
        String str6 = hegVar2.f12922a;
        String str7 = (String) CollectionsKt.firstOrNull(hegVar2.b);
        if (str7 == null) {
            str7 = "";
        }
        return new vcm0(strValueOf, 40L, str, j, str2, "0", "0", y6p0Var, new y6p0(iunVar, "", str6, str7), 0, 0, true, str, false, false, "0", "0");
    }

    public static final ozv R(q4f q4fVar) {
        q4fVar.getClass();
        switch (q4fVar.ordinal()) {
            case 1:
                return ozv.c;
            case 2:
                return ozv.b;
            case 3:
                return ozv.j;
            case 4:
                return ozv.e;
            case 5:
                return ozv.g;
            case 6:
                return ozv.h;
            case 7:
                return ozv.i;
            case 8:
                return ozv.d;
            case 9:
                return ozv.f;
            case 10:
            default:
                return ozv.u;
            case 11:
                return ozv.k;
            case 12:
                return ozv.n;
            case 13:
                return ozv.m;
            case 14:
                return ozv.o;
            case 15:
                return ozv.l;
            case 16:
                return ozv.q;
            case 17:
                return ozv.t;
            case 18:
                return ozv.p;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ozv.r;
            case 20:
                return ozv.s;
        }
    }

    public static final ArrayList S(String str, List list, List list2) {
        Object next;
        l070 l070Var;
        list.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i070 i070Var = (i070) it.next();
            String str2 = null;
            if (i070Var == null) {
                jf4.k(null);
                return null;
            }
            Boolean bool = i070Var.i;
            Boolean bool2 = i070Var.j;
            Long l = i070Var.f;
            long jLongValue = l != null ? l.longValue() : 0L;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    l070Var = (l070) next;
                } while (!Intrinsics.d(l070Var != null ? l070Var.f19185a : null, i070Var.b));
                l070 l070Var2 = (l070) next;
                if (l070Var2 != null) {
                    str2 = l070Var2.b;
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String strValueOf = String.valueOf(i070Var.c);
            hcs hcsVar = i070Var.e;
            if (hcsVar == null) {
                hcsVar = hcs.NONE;
            }
            hcs hcsVar2 = hcsVar;
            t470 t470Var = a570.Companion;
            long jLongValue2 = l != null ? l.longValue() : 0L;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            t470Var.getClass();
            a570 a570VarA = t470.a(zBooleanValue2, jLongValue2);
            Boolean bool3 = i070Var.g;
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            List list3 = i070Var.f13936a;
            if (list3 == null) {
                list3 = iun.f15405a;
            }
            List list4 = list3;
            Boolean bool4 = i070Var.h;
            boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
            boolean zBooleanValue5 = bool != null ? bool.booleanValue() : false;
            boolean zBooleanValue6 = bool != null ? bool.booleanValue() : false;
            boolean zBooleanValue7 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool5 = i070Var.k;
            boolean zBooleanValue8 = bool5 != null ? bool5.booleanValue() : false;
            hds.Companion.getClass();
            hds hdsVarC = dds.c(str, i070Var);
            Boolean bool6 = i070Var.l;
            boolean zBooleanValue9 = bool6 != null ? bool6.booleanValue() : false;
            Boolean bool7 = i070Var.m;
            boolean zBooleanValue10 = bool7 != null ? bool7.booleanValue() : false;
            Boolean bool8 = i070Var.n;
            if (bool8 != null) {
                zBooleanValue = bool8.booleanValue();
            }
            arrayList.add(new pbv(jLongValue, list4, str3, hcsVar2, a570VarA, strValueOf, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, hdsVarC, zBooleanValue9, zBooleanValue10, zBooleanValue, 69632));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((pbv) obj).c.length() > 0) {
                arrayList2.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(Long.valueOf(((pbv) obj2).f26728a))) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public static final List T(List list) {
        Integer num;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e070 e070Var = (e070) it.next();
                if (e070Var == null || (num = e070Var.f6976a) == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue = num.intValue();
                String str = e070Var.b;
                if (str == null) {
                    jf4.k(null);
                    return null;
                }
                arrayList2.add(new f8b(iIntValue, str));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final lbv0 U(wav0 wav0Var, long j, int i) {
        if (wav0Var instanceof uav0) {
            uav0 uav0Var = (uav0) wav0Var;
            return new jbv0(uav0Var.f35352a, uav0Var.b, j, i);
        }
        if (wav0Var instanceof vav0) {
            vav0 vav0Var = (vav0) wav0Var;
            return new kbv0(vav0Var.f37110a, vav0Var.b, j, i);
        }
        t9f.b();
        return null;
    }

    public static final void d(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-656755223);
        int i2 = (fetVar2.g(l7m0Var) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            String strS = xsm0.s(R.string.language_selection_new, fetVar2);
            zcl zclVar = qmk.f28987a;
            wwb.i(s5x0.N(jm40Var, 0.0f, 28.0f, 0.0f, 8.0f, 5), strS, 0L, 0, 0L, fetVar2, 0, 28);
            mm40 mm40VarM = s5x0.M(jm40Var, 16.0f, 8.0f, 16.0f, 12.0f);
            String strS2 = xsm0.s(R.string.search, fetVar2);
            String str = ((rgc) l7m0Var.getValue()).f30426a;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new trb(function1, (byte) 10);
                fetVar2.o0(objP);
            }
            dtb.m(mm40VarM, str, strS2, 0L, (Function1) objP, null, fetVar2, 0, 88);
            vtb.t(null, qqm.b, zfi0.f44303a, 0L, fetVar, 432, 9);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i, (byte) 24);
        }
    }

    public static final void f(j83 j83Var, fet fetVar) {
        nw3 nw3Var = uc9.f;
        ugd ugdVarM = u1c.M(213825414, new awh(j83Var, (byte) 23), fetVar);
        x5d x5dVarA = w5d.a(nw3Var, gqw0.m, fetVar, 0);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        jm40 jm40Var = jm40.b;
        mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
        ugdVarM.j(y5d.f42040a, o7k0.e(o7k0.s(s5x0.L(jm40Var, 14.0f, 0.0f, 2), 80.0f), 28.0f), fetVar, 6);
        fetVar.r(true);
    }

    public static final void g(String str, fet fetVar) {
        str.getClass();
        nw3 nw3Var = uc9.f;
        ugd ugdVarM = u1c.M(218144308, new vod(str, (byte) 0), fetVar);
        x5d x5dVarA = w5d.a(nw3Var, gqw0.m, fetVar, 0);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        jm40 jm40Var = jm40.b;
        mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
        ugdVarM.j(y5d.f42040a, o7k0.e(o7k0.s(s5x0.L(jm40Var, 14.0f, 0.0f, 2), 80.0f), 28.0f), fetVar, 6);
        fetVar.r(true);
    }

    public static final void h(ctk ctkVar, sip sipVar, Function2 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1760948305);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(ctkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(sipVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ctkVar.d;
            ThemeColors themeColors = (ThemeColors) fetVar2.k(zaq0.b);
            boolean zH = fetVar2.h(z);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                if (z) {
                    long primary = themeColors.getPrimary();
                    StaticColors staticColors = StaticColors.INSTANCE;
                    objP = new n5d(primary, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), themeColors.getPrimary());
                } else {
                    objP = new n5d(themeColors.getBackground(), themeColors.getTextPrimary(), themeColors.getBackgroundContent(), themeColors.getSecondary());
                }
                fetVar2.o0(objP);
            }
            n5d n5dVar = (n5d) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 40.0f);
            long j = n5dVar.f22939a;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new kk0(function2, ctkVar, sipVar, (byte) 29);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarF = phu0.F(mm40VarQ, null, null, false, null, (Function0) objP2, fetVar, 0, 15);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            long j2 = n5dVar.c;
            zcl zclVar3 = qmk.e;
            lgb.v(s5x0.J(o7k0.n(i120.Q(mm40VarN, j2, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 32.0f), 8.0f), s5x0.J(o7k0.n(i120.Q(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), StaticColors.INSTANCE.m123getWhite0d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 32.0f), 8.0f), ctkVar.b, R.drawable.ic_glyph_category_new, n5dVar.d, gqw0.A, fetVar, 196608, 0);
            v8q0.a(ctkVar.c, s5x0.N(jm40Var, 8.0f, 0.0f, 12.0f, 0.0f, 10), n5dVar.b, null, qmk.q, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131048);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(ctkVar, sipVar, function2, i, (byte) 7);
        }
    }

    public static final void i(final int i, final int i2, final long j, fet fetVar, mm40 mm40Var) {
        int i3;
        final mm40 mm40Var2;
        fetVar.g0(-309912188);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            tnm tnmVar = tnm.b;
            long j2 = iph.e;
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            snm.b(mm40Var2, new unm(tnmVar, j, j, j2, 4.0f, 360.0f, i, 100, true), fetVar, i3 & 14);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.bqh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    vfc.i(i, iL, j, (fet) obj, mm40Var2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void j(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1267324296);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b = 3;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.m;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v((i3 >> 6) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i, b);
        }
    }

    public static final void k(etk etkVar, sip sipVar, Function2 function2, fet fetVar, int i) {
        int i2;
        etkVar.getClass();
        function2.getClass();
        fetVar.g0(2013538046);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(etkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(sipVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (etkVar instanceof ctk) {
            fetVar.e0(1798880400);
            h((ctk) etkVar, sipVar, function2, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!(etkVar instanceof dtk)) {
                throw b1j.f(-2020183535, fetVar, false);
            }
            fetVar.e0(1799076258);
            B(0, fetVar);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(etkVar, sipVar, function2, i, (byte) 6);
        }
    }

    public static final void l(final mm40 mm40Var, final vql vqlVar, final brl brlVar, float f, fet fetVar, final int i) {
        int i2;
        final float f2;
        float f3;
        int i3;
        fetVar.g0(292691955);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | (fetVar.e(vqlVar.ordinal()) ? 32 : 16) | (fetVar.g(brlVar) ? 256 : 128) | 1024;
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                f3 = xfn.a(fetVar).c;
                i3 = i4 & (-7169);
            } else {
                fetVar.X();
                i3 = i4 & (-7169);
                f3 = f;
            }
            fetVar.s();
            mm40 mm40VarL = s5x0.L(mm40Var, f3, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int iOrdinal = vqlVar.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(829142693);
                obc.l(null, brlVar, fetVar, (i3 >> 3) & 112);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(829146273);
                qcc.f(null, brlVar, fetVar, (i3 >> 3) & 112);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(829149762);
                tdc.d(null, brlVar, fetVar, (i3 >> 3) & 112);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(829140739, fetVar, false);
                }
                fetVar.e0(829153315);
                vbc.s(null, brlVar, fetVar, (i3 >> 3) & 112);
                fetVar.r(false);
            }
            fetVar.r(true);
            f2 = f3;
        } else {
            fetVar.X();
            f2 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.rql
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vfc.l(mm40Var, vqlVar, brlVar, f2, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void m(mm40 mm40Var, wxl wxlVar, grq grqVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        grqVar.getClass();
        function0.getClass();
        fetVar.g0(-64763772);
        int i2 = i | 6 | (fetVar.g(grqVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dpl((Object) grqVar, (Object) function0, (byte) 5);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            jm40 jm40Var = jm40.b;
            v3c.n(jm40Var, wxlVar, function1, fetVar, 54, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 11, i, (Object) mm40Var2, (Object) wxlVar, (Object) grqVar, (Object) function0);
        }
    }

    public static final void n(mm40 mm40Var, lcm lcmVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        mm40Var.getClass();
        fetVar2.g0(-550325399);
        int i2 = i | (fetVar2.g(lcmVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean z = lcmVar instanceof jcm;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.e0(-853541272);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar4);
                jpm0.o(fetVar2, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC0, shdVar);
                Locale locale = Locale.ENGLISH;
                SimpleDate simpleDate = ((jcm) lcmVar).f16284a;
                String str = String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate.c)}, 1)) + Separators.DOT + String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate.b)}, 1)) + Separators.DOT + simpleDate.f47286a;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                if (!(lcmVar instanceof kcm)) {
                    throw b1j.f(-581722619, fetVar2, false);
                }
                fetVar2.e0(-852837386);
                zcl zclVar = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarE0 = o2e.e0(lgb.J(mm40VarN, ugg0Var), "DS_CYBER_TRANSFER_CARD_HEADER_IMAGE");
                mm40 mm40VarE1 = o2e.e0(s5x0.J(lgb.J(o7k0.n(jm40Var, 24.0f), ugg0Var), 1.0f), "DS_CYBER_TRANSFER_CARD_HEADER_IMAGE");
                kcm kcmVar = (kcm) lcmVar;
                SimpleDate simpleDate2 = kcmVar.c;
                n0x n0xVar = kcmVar.f18067a;
                zx7 zx7Var = gqw0.b;
                zfn zfnVar = zaq0.b;
                rq8.b(mm40VarE0, mm40VarE1, n0xVar, R.drawable.ic_glyph_placeholder_player, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60()), null, zx7Var, gqw0.A, null, fetVar2, 14155776, 288);
                mm40 mm40VarI = hne.i(1.0f, true, "DS_CYBER_TRANSFER_CARD_HEADER_NAME");
                Object objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = new wil(pz40Var, (byte) 9);
                    fetVar2.o0(objP2);
                }
                mm40 mm40VarA = pai0.a(mm40VarI, false, (Function1) objP2);
                String str2 = kcmVar.b;
                zfn zfnVar2 = j1t0.e;
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                y9q0 y9q0VarG = g1t0.g();
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                Object objP3 = fetVar2.P();
                if (objP3 == cl5Var) {
                    objP3 = new wil(pz40Var, (byte) 10);
                    fetVar2.o0(objP3);
                }
                v8q0.a(str2, mm40VarA, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP3, y9q0VarG, fetVar, 0, 1597824, 45048);
                mm40 mm40VarE2 = o2e.e0(jm40Var, "DS_CYBER_TRANSFER_CARD_HEADER_DATE");
                Locale locale2 = Locale.ENGLISH;
                String str3 = String.format(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate2.c)}, 1)) + Separators.DOT + String.format(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate2.b)}, 1)) + Separators.DOT + simpleDate2.f47286a;
                ((g1t0) fetVar.k(zfnVar2)).getClass();
                v8q0.a(str3, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 48, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, lcmVar, i, (byte) 11);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var) {
        float f = m0l0.f20961a;
        fetVar.g0(-160502187);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.d(mm40Var, 1.0f), m0l0.f20961a), vgg0.a(m0l0.b)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, i, (byte) 14);
        }
    }

    public static final void p(mm40 mm40Var, boolean z, nxm nxmVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(-657392895);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(nxmVar) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                fetVar.e0(-394372056);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-394371132);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 0.0f, 8.0f, 8.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            z(0, fetVar, null, nxmVar.f24289a);
            obc.d(bmd.n.a(k6zVar), u1c.M(-173732553, new mxm(nxmVar, b), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((Object) mm40Var, z, (Object) nxmVar, i, (byte) 18);
        }
    }

    public static final void q(mm40 mm40Var, l7m0 l7m0Var, qil0 qil0Var, Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        qil0Var.getClass();
        mm40 mm40Var2 = (i2 & 1) != 0 ? jm40.b : mm40Var;
        final Function1 function3 = (i2 & 8) != 0 ? null : function1;
        final Function1 function4 = (i2 & 16) == 0 ? function2 : null;
        boolean z = qil0Var instanceof hil0;
        final byte b = 2;
        dhl0 dhl0Var = dhl0.f6096a;
        cl5 cl5Var = ukd.f35823a;
        final byte b2 = 0;
        if (z) {
            fetVar2.e0(1711904309);
            mm40 mm40Var3 = mm40Var2;
            hil0 hil0Var = (hil0) qil0Var;
            ehl0 ehl0Var = (ehl0) l7m0Var.getValue();
            if (ehl0Var instanceof chl0) {
                fetVar2.e0(-612485002);
                pz40 pz40VarF = androidx.compose.runtime.e.f(ehl0Var, fetVar2);
                boolean zG = fetVar2.g(function3) | fetVar2.g(ehl0Var);
                Object objP = fetVar2.P();
                if (zG || objP == cl5Var) {
                    final chl0 chl0Var = (chl0) ehl0Var;
                    objP = new Function0() { // from class: a.ohl0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b;
                            chl0 chl0Var2 = chl0Var;
                            Function1 function5 = function3;
                            switch (b3) {
                                case 0:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var2.i));
                                    }
                                    break;
                                case 1:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var2.i);
                                    }
                                    break;
                                case 2:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var2.i));
                                    }
                                    break;
                                case 3:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var2.i);
                                    }
                                    break;
                                case 4:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var2.i));
                                    }
                                    break;
                                case 5:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var2.i);
                                    }
                                    break;
                                case 6:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var2.i));
                                    }
                                    break;
                                default:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var2.i);
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean zG2 = fetVar2.g(function4) | fetVar2.g(ehl0Var);
                Object objP2 = fetVar2.P();
                if (zG2 || objP2 == cl5Var) {
                    final chl0 chl0Var2 = (chl0) ehl0Var;
                    final byte b3 = 3;
                    objP2 = new Function0() { // from class: a.ohl0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            chl0 chl0Var3 = chl0Var2;
                            Function1 function5 = function4;
                            switch (b4) {
                                case 0:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var3.i));
                                    }
                                    break;
                                case 1:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var3.i);
                                    }
                                    break;
                                case 2:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var3.i));
                                    }
                                    break;
                                case 3:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var3.i);
                                    }
                                    break;
                                case 4:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var3.i));
                                    }
                                    break;
                                case 5:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var3.i);
                                    }
                                    break;
                                case 6:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var3.i));
                                    }
                                    break;
                                default:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var3.i);
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP2);
                }
                m8x.h(mm40Var3, pz40VarF, hil0Var, function0, (Function0) objP2, fetVar2, i & 910);
                fetVar2.r(false);
            } else if (ehl0Var instanceof bhl0) {
                fetVar2.e0(811542336);
                bhl0 bhl0Var = (bhl0) ehl0Var;
                ahl0 ahl0VarC = hil0Var.c();
                boolean zG3 = fetVar2.g(function3);
                Object objP3 = fetVar2.P();
                if (zG3 || objP3 == cl5Var) {
                    objP3 = new uck0(function3, (byte) 27);
                    fetVar2.o0(objP3);
                }
                m8x.a(mm40Var3, bhl0Var, ahl0VarC, (Function0) objP3, fetVar, i & 14);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (!Intrinsics.d(ehl0Var, dhl0Var)) {
                    throw b1j.f(811524814, fetVar2, false);
                }
                fetVar2.e0(811551607);
                ahl0 ahl0VarC2 = hil0Var.c();
                boolean zG4 = fetVar2.g(function3);
                Object objP4 = fetVar2.P();
                if (zG4 || objP4 == cl5Var) {
                    objP4 = new uck0(function3, (byte) 28);
                    fetVar2.o0(objP4);
                }
                m8x.o(mm40Var3, ahl0VarC2, (Function0) objP4, fetVar2, i & 14);
                fetVar2.r(false);
            }
            fetVar2.r(false);
            return;
        }
        mm40 mm40Var4 = mm40Var2;
        final byte b4 = 1;
        if (qil0Var instanceof eil0) {
            fetVar2.e0(1711911637);
            eil0 eil0Var = (eil0) qil0Var;
            ehl0 ehl0Var2 = (ehl0) l7m0Var.getValue();
            if (ehl0Var2 instanceof chl0) {
                fetVar2.e0(957005263);
                pz40 pz40VarF2 = androidx.compose.runtime.e.f(ehl0Var2, fetVar2);
                boolean zG5 = fetVar2.g(function3) | fetVar2.g(ehl0Var2);
                Object objP5 = fetVar2.P();
                if (zG5 || objP5 == cl5Var) {
                    final chl0 chl0Var3 = (chl0) ehl0Var2;
                    objP5 = new Function0() { // from class: a.ohl0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b2;
                            chl0 chl0Var4 = chl0Var3;
                            Function1 function5 = function3;
                            switch (b5) {
                                case 0:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var4.i));
                                    }
                                    break;
                                case 1:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var4.i);
                                    }
                                    break;
                                case 2:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var4.i));
                                    }
                                    break;
                                case 3:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var4.i);
                                    }
                                    break;
                                case 4:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var4.i));
                                    }
                                    break;
                                case 5:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var4.i);
                                    }
                                    break;
                                case 6:
                                    if (function5 != null) {
                                        function5.invoke(new vgl0(chl0Var4.i));
                                    }
                                    break;
                                default:
                                    if (function5 != null) {
                                        function5.invoke(chl0Var4.i);
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP5);
                }
                Function0 function5 = (Function0) objP5;
                boolean zG6 = fetVar2.g(function4) | fetVar2.g(ehl0Var2);
                Object objP6 = fetVar2.P();
                if (zG6 || objP6 == cl5Var) {
                    final chl0 chl0Var4 = (chl0) ehl0Var2;
                    objP6 = new Function0() { // from class: a.ohl0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            chl0 chl0Var5 = chl0Var4;
                            Function1 function6 = function4;
                            switch (b5) {
                                case 0:
                                    if (function6 != null) {
                                        function6.invoke(new vgl0(chl0Var5.i));
                                    }
                                    break;
                                case 1:
                                    if (function6 != null) {
                                        function6.invoke(chl0Var5.i);
                                    }
                                    break;
                                case 2:
                                    if (function6 != null) {
                                        function6.invoke(new vgl0(chl0Var5.i));
                                    }
                                    break;
                                case 3:
                                    if (function6 != null) {
                                        function6.invoke(chl0Var5.i);
                                    }
                                    break;
                                case 4:
                                    if (function6 != null) {
                                        function6.invoke(new vgl0(chl0Var5.i));
                                    }
                                    break;
                                case 5:
                                    if (function6 != null) {
                                        function6.invoke(chl0Var5.i);
                                    }
                                    break;
                                case 6:
                                    if (function6 != null) {
                                        function6.invoke(new vgl0(chl0Var5.i));
                                    }
                                    break;
                                default:
                                    if (function6 != null) {
                                        function6.invoke(chl0Var5.i);
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP6);
                }
                l8x.n(mm40Var4, pz40VarF2, eil0Var, function5, (Function0) objP6, fetVar2, i & 910);
                fetVar2.r(false);
            } else if (ehl0Var2 instanceof bhl0) {
                fetVar2.e0(1693455036);
                bhl0 bhl0Var2 = (bhl0) ehl0Var2;
                ahl0 ahl0VarC3 = eil0Var.c();
                boolean zG7 = fetVar2.g(function3);
                Object objP7 = fetVar2.P();
                if (zG7 || objP7 == cl5Var) {
                    objP7 = new uck0(function3, (byte) 25);
                    fetVar2.o0(objP7);
                }
                l8x.c(mm40Var4, bhl0Var2, ahl0VarC3, (Function0) objP7, fetVar, i & 14);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (!Intrinsics.d(ehl0Var2, dhl0Var)) {
                    throw b1j.f(1693437492, fetVar2, false);
                }
                fetVar2.e0(1693463955);
                ahl0 ahl0VarC4 = eil0Var.c();
                boolean zG8 = fetVar2.g(function3);
                Object objP8 = fetVar2.P();
                if (zG8 || objP8 == cl5Var) {
                    objP8 = new uck0(function3, (byte) 26);
                    fetVar2.o0(objP8);
                }
                l8x.D(mm40Var4, ahl0VarC4, (Function0) objP8, fetVar2, i & 14);
                fetVar2.r(false);
            }
            fetVar2.r(false);
            return;
        }
        if (qil0Var instanceof lil0) {
            fetVar2.e0(1711919130);
            lil0 lil0Var = (lil0) qil0Var;
            iil0 iil0VarD = lil0Var.d();
            s0 s0Var = new s0(new zcl(iil0VarD.f14834a), new zcl(iil0VarD.b), new zcl(iil0VarD.c), new zcl(iil0VarD.d));
            ehl0 ehl0Var3 = (ehl0) l7m0Var.getValue();
            if (ehl0Var3 instanceof chl0) {
                fetVar2.e0(-856924868);
                pz40 pz40VarF3 = androidx.compose.runtime.e.f(ehl0Var3, fetVar2);
                boolean zG9 = fetVar2.g(function3) | fetVar2.g(ehl0Var3);
                Object objP9 = fetVar2.P();
                if (zG9 || objP9 == cl5Var) {
                    final chl0 chl0Var5 = (chl0) ehl0Var3;
                    final byte b5 = 4;
                    objP9 = new Function0() { // from class: a.ohl0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b6 = b5;
                            chl0 chl0Var6 = chl0Var5;
                            Function1 function6 = function3;
                            switch (b6) {
                                case 0:
                                    if (function6 != null) {
                                        function6.invoke(new vgl0(chl0Var6.i));
                                    }
                                    break;
                                case 1:
                                    if (function6 != null) {
                                        function6.invoke(chl0Var6.i);
                                    }
                                    break;
                                case 2:
                                    if (function6 != null) {
                                        function6.invoke(new vgl0(chl0Var6.i));
                                    }
                                    break;
                                case 3:
                                    if (function6 != null) {
                                        function6.invoke(chl0Var6.i);
                                    }
                                    break;
                                case 4:
                                    if (function6 != null) {
                                        function6.invoke(new vgl0(chl0Var6.i));
                                    }
                                    break;
                                case 5:
                                    if (function6 != null) {
                                        function6.invoke(chl0Var6.i);
                                    }
                                    break;
                                case 6:
                                    if (function6 != null) {
                                        function6.invoke(new vgl0(chl0Var6.i));
                                    }
                                    break;
                                default:
                                    if (function6 != null) {
                                        function6.invoke(chl0Var6.i);
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP9);
                }
                Function0 function6 = (Function0) objP9;
                boolean zG10 = fetVar2.g(function4) | fetVar2.g(ehl0Var3);
                Object objP10 = fetVar2.P();
                if (zG10 || objP10 == cl5Var) {
                    final chl0 chl0Var6 = (chl0) ehl0Var3;
                    final byte b6 = 5;
                    objP10 = new Function0() { // from class: a.ohl0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b7 = b6;
                            chl0 chl0Var7 = chl0Var6;
                            Function1 function7 = function4;
                            switch (b7) {
                                case 0:
                                    if (function7 != null) {
                                        function7.invoke(new vgl0(chl0Var7.i));
                                    }
                                    break;
                                case 1:
                                    if (function7 != null) {
                                        function7.invoke(chl0Var7.i);
                                    }
                                    break;
                                case 2:
                                    if (function7 != null) {
                                        function7.invoke(new vgl0(chl0Var7.i));
                                    }
                                    break;
                                case 3:
                                    if (function7 != null) {
                                        function7.invoke(chl0Var7.i);
                                    }
                                    break;
                                case 4:
                                    if (function7 != null) {
                                        function7.invoke(new vgl0(chl0Var7.i));
                                    }
                                    break;
                                case 5:
                                    if (function7 != null) {
                                        function7.invoke(chl0Var7.i);
                                    }
                                    break;
                                case 6:
                                    if (function7 != null) {
                                        function7.invoke(new vgl0(chl0Var7.i));
                                    }
                                    break;
                                default:
                                    if (function7 != null) {
                                        function7.invoke(chl0Var7.i);
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP10);
                }
                q8x.c(mm40Var4, pz40VarF3, lil0Var, function6, (Function0) objP10, fetVar2, i & 910);
                fetVar2.r(false);
            } else if (ehl0Var3 instanceof bhl0) {
                fetVar2.e0(-304721483);
                bhl0 bhl0Var3 = (bhl0) ehl0Var3;
                ahl0 ahl0VarC5 = lil0Var.c();
                boolean zG11 = fetVar2.g(function3);
                Object objP11 = fetVar2.P();
                if (zG11 || objP11 == cl5Var) {
                    objP11 = new uck0(function3, (byte) 29);
                    fetVar2.o0(objP11);
                }
                q8x.a(mm40Var4, bhl0Var3, s0Var, ahl0VarC5, (Function0) objP11, fetVar2, i & 14);
                fetVar2.r(false);
            } else {
                if (!Intrinsics.d(ehl0Var3, dhl0Var)) {
                    throw b1j.f(-304738922, fetVar2, false);
                }
                fetVar2.e0(-304711380);
                ahl0 ahl0VarC6 = lil0Var.c();
                boolean zG12 = fetVar2.g(function3);
                Object objP12 = fetVar2.P();
                if (zG12 || objP12 == cl5Var) {
                    objP12 = new yhl0(function3, b2);
                    fetVar2.o0(objP12);
                }
                q8x.j(mm40Var4, s0Var, ahl0VarC6, (Function0) objP12, fetVar, i & 14);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(false);
            return;
        }
        if (!(qil0Var instanceof pil0)) {
            if (!(qil0Var instanceof bil0)) {
                throw b1j.f(1711903580, fetVar2, false);
            }
            fetVar2.e0(1711934140);
            bil0 bil0Var = (bil0) qil0Var;
            zgl0 zgl0Var = bil0Var.c;
            final ehl0 ehl0Var4 = (ehl0) l7m0Var.getValue();
            if (ehl0Var4 != null) {
                if (ehl0Var4 instanceof chl0) {
                    fetVar2.e0(-1060302651);
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f(ehl0Var4, fetVar2);
                    boolean zG13 = fetVar2.g(function3) | fetVar2.g(ehl0Var4);
                    Object objP13 = fetVar2.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new Function0() { // from class: a.fhl0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b7 = b2;
                                ehl0 ehl0Var5 = ehl0Var4;
                                Function1 function7 = function3;
                                switch (b7) {
                                    case 0:
                                        if (function7 != null) {
                                            function7.invoke(new vgl0(((chl0) ehl0Var5).i));
                                        }
                                        break;
                                    default:
                                        if (function7 != null) {
                                            function7.invoke(((chl0) ehl0Var5).i);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP13);
                    }
                    Function0 function7 = (Function0) objP13;
                    boolean zG14 = fetVar2.g(function4) | fetVar2.g(ehl0Var4);
                    Object objP14 = fetVar2.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new Function0() { // from class: a.fhl0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b7 = b4;
                                ehl0 ehl0Var5 = ehl0Var4;
                                Function1 function8 = function4;
                                switch (b7) {
                                    case 0:
                                        if (function8 != null) {
                                            function8.invoke(new vgl0(((chl0) ehl0Var5).i));
                                        }
                                        break;
                                    default:
                                        if (function8 != null) {
                                            function8.invoke(((chl0) ehl0Var5).i);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP14);
                    }
                    h8x.d(mm40Var4, pz40VarF4, bil0Var, function7, (Function0) objP14, fetVar2, i & 910);
                    fetVar2.r(false);
                } else if (ehl0Var4 instanceof bhl0) {
                    fetVar2.e0(-1059807426);
                    bhl0 bhl0Var4 = (bhl0) ehl0Var4;
                    boolean zG15 = fetVar2.g(function3);
                    Object objP15 = fetVar2.P();
                    if (zG15 || objP15 == cl5Var) {
                        objP15 = new uck0(function3, (byte) 23);
                        fetVar2.o0(objP15);
                    }
                    h8x.a(mm40Var4, bhl0Var4, zgl0Var, (Function0) objP15, fetVar, i & 14);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (ehl0Var4 instanceof dhl0) {
                    fetVar2.e0(-1059466581);
                    boolean zG16 = fetVar2.g(function3);
                    Object objP16 = fetVar2.P();
                    if (zG16 || objP16 == cl5Var) {
                        objP16 = new uck0(function3, (byte) 24);
                        fetVar2.o0(objP16);
                    }
                    h8x.j(mm40Var4, zgl0Var, (Function0) objP16, fetVar2, i & 14);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
                return;
            }
            throw b1j.f(381437227, fetVar2, false);
        }
        fetVar2.e0(1711926613);
        pil0 pil0Var = (pil0) qil0Var;
        ehl0 ehl0Var5 = (ehl0) l7m0Var.getValue();
        if (ehl0Var5 instanceof chl0) {
            fetVar2.e0(1534848999);
            pz40 pz40VarF5 = androidx.compose.runtime.e.f(ehl0Var5, fetVar2);
            boolean zG17 = fetVar2.g(function3) | fetVar2.g(ehl0Var5);
            Object objP17 = fetVar2.P();
            if (zG17 || objP17 == cl5Var) {
                final chl0 chl0Var7 = (chl0) ehl0Var5;
                final byte b7 = 6;
                objP17 = new Function0() { // from class: a.ohl0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b8 = b7;
                        chl0 chl0Var8 = chl0Var7;
                        Function1 function8 = function3;
                        switch (b8) {
                            case 0:
                                if (function8 != null) {
                                    function8.invoke(new vgl0(chl0Var8.i));
                                }
                                break;
                            case 1:
                                if (function8 != null) {
                                    function8.invoke(chl0Var8.i);
                                }
                                break;
                            case 2:
                                if (function8 != null) {
                                    function8.invoke(new vgl0(chl0Var8.i));
                                }
                                break;
                            case 3:
                                if (function8 != null) {
                                    function8.invoke(chl0Var8.i);
                                }
                                break;
                            case 4:
                                if (function8 != null) {
                                    function8.invoke(new vgl0(chl0Var8.i));
                                }
                                break;
                            case 5:
                                if (function8 != null) {
                                    function8.invoke(chl0Var8.i);
                                }
                                break;
                            case 6:
                                if (function8 != null) {
                                    function8.invoke(new vgl0(chl0Var8.i));
                                }
                                break;
                            default:
                                if (function8 != null) {
                                    function8.invoke(chl0Var8.i);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP17);
            }
            Function0 function8 = (Function0) objP17;
            boolean zG18 = fetVar2.g(function4) | fetVar2.g(ehl0Var5);
            Object objP18 = fetVar2.P();
            if (zG18 || objP18 == cl5Var) {
                final chl0 chl0Var8 = (chl0) ehl0Var5;
                final byte b8 = 7;
                objP18 = new Function0() { // from class: a.ohl0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b9 = b8;
                        chl0 chl0Var9 = chl0Var8;
                        Function1 function9 = function4;
                        switch (b9) {
                            case 0:
                                if (function9 != null) {
                                    function9.invoke(new vgl0(chl0Var9.i));
                                }
                                break;
                            case 1:
                                if (function9 != null) {
                                    function9.invoke(chl0Var9.i);
                                }
                                break;
                            case 2:
                                if (function9 != null) {
                                    function9.invoke(new vgl0(chl0Var9.i));
                                }
                                break;
                            case 3:
                                if (function9 != null) {
                                    function9.invoke(chl0Var9.i);
                                }
                                break;
                            case 4:
                                if (function9 != null) {
                                    function9.invoke(new vgl0(chl0Var9.i));
                                }
                                break;
                            case 5:
                                if (function9 != null) {
                                    function9.invoke(chl0Var9.i);
                                }
                                break;
                            case 6:
                                if (function9 != null) {
                                    function9.invoke(new vgl0(chl0Var9.i));
                                }
                                break;
                            default:
                                if (function9 != null) {
                                    function9.invoke(chl0Var9.i);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP18);
            }
            r8x.f(mm40Var4, pz40VarF5, pil0Var, function8, (Function0) objP18, fetVar2, i & 910);
            fetVar2.r(false);
        } else if (ehl0Var5 instanceof bhl0) {
            fetVar2.e0(1157905852);
            mm40 mm40VarE0 = o2e.e0(mm40Var4, "ALL_MARKETS_SMALL_CARD_NO_TEAM_LOGO");
            bhl0 bhl0Var5 = (bhl0) ehl0Var5;
            ahl0 ahl0VarC7 = pil0Var.c();
            boolean zG19 = fetVar2.g(function3);
            Object objP19 = fetVar2.P();
            if (zG19 || objP19 == cl5Var) {
                objP19 = new yhl0(function3, b4);
                fetVar2.o0(objP19);
            }
            r8x.a(mm40VarE0, bhl0Var5, ahl0VarC7, (Function0) objP19, fetVar, 0);
            fetVar2 = fetVar;
            fetVar2.r(false);
        } else {
            if (!Intrinsics.d(ehl0Var5, dhl0Var)) {
                throw b1j.f(1157888359, fetVar2, false);
            }
            fetVar2.e0(1157916486);
            ahl0 ahl0VarC8 = pil0Var.c();
            boolean zG20 = fetVar2.g(function3);
            Object objP20 = fetVar2.P();
            if (zG20 || objP20 == cl5Var) {
                objP20 = new yhl0(function3, b);
                fetVar2.o0(objP20);
            }
            r8x.o(mm40Var4, ahl0VarC8, (Function0) objP20, fetVar2, i & 14);
            fetVar2.r(false);
        }
        fetVar2.r(false);
    }

    public static final void r(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        Function0 function1;
        Function0 function2;
        fetVar.g0(924211689);
        int i4 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mdmVar) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (fetVar.i(function0) ? 256 : 128);
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new dcn((byte) 25);
                    fetVar.o0(objP);
                }
                function2 = (Function0) objP;
            } else {
                function2 = function0;
            }
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
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar, false, function2, fetVar, (i3 & 112) | ((i3 << 3) & 7168), 4);
            fetVar.r(true);
            function1 = function2;
        } else {
            fetVar.X();
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dpn(mm40Var, mdmVar, function1, i, i2, (byte) 0);
        }
    }

    public static final void s(mm40 mm40Var, jpn jpnVar, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z;
        fet fetVar2 = fetVar;
        jpnVar.getClass();
        function1.getClass();
        fetVar2.g0(-300206697);
        int i2 = i | 6 | (fetVar2.g(jpnVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var2, background, ljcVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            imm immVar = jpnVar.f16910a;
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new ylm(function1, (byte) 12);
                fetVar2.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fetVar2 = fetVar;
            uon uonVar = jpnVar.b;
            if (uonVar instanceof pon) {
                fetVar2.e0(1928353251);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                jm40Var = jm40Var2;
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                pon ponVar = (pon) uonVar;
                w(null, ponVar.f27337a, fetVar2, 0);
                z = true;
                y((i2 << 3) & 7168, fetVar, ponVar.b, new x7z(1.0f, true), function1, jpnVar.c);
                fetVar2 = fetVar;
                function2 = function1;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                function2 = function1;
                jm40Var = jm40Var2;
                z = true;
                if (uonVar instanceof qon) {
                    r(rz4.f(fetVar2, 1928894387, 1.0f, true), ((qon) uonVar).f29080a, null, fetVar2, 0, 4);
                    fetVar2.r(false);
                } else if (uonVar instanceof ron) {
                    x7z x7zVarF = rz4.f(fetVar2, 1929115293, 1.0f, true);
                    mdm mdmVar = ((ron) uonVar).f30847a;
                    boolean z4 = i3 == 256;
                    Object objP2 = fetVar2.P();
                    if (z4 || objP2 == cl5Var) {
                        objP2 = new ylm(function2, (byte) 13);
                        fetVar2.o0(objP2);
                    }
                    r(x7zVarF, mdmVar, (Function0) objP2, fetVar2, 0, 0);
                    fetVar2.r(false);
                } else if (uonVar.equals(son.f32551a)) {
                    fetVar2.e0(1929409855);
                    fetVar2.r(false);
                } else {
                    if (!(uonVar instanceof ton)) {
                        throw b1j.f(-491986745, fetVar2, false);
                    }
                    fetVar2.e0(1929465655);
                    A(jm40Var, (ton) uonVar, jpnVar.c, fetVar2, 6);
                    fetVar2.r(false);
                }
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            function2 = function1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var2, jpnVar, function2, i, (byte) 1);
        }
    }

    public static final void t(npg0 npg0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1057028830);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(npg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = a6o.f325a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean zI = fetVar.i(clzVar) | (i3 == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(clzVar, npg0Var, (byte) 12);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(clzVar) | (i3 == 4);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(clzVar, npg0Var, (byte) 9);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, npg0Var, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(npg0Var, i, (byte) 19);
        }
    }

    public static final void u(mm40 mm40Var, i3w i3wVar, fet fetVar, int i) {
        i3wVar.getClass();
        fetVar.g0(-1079323067);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(i3wVar) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            hmw0.j(o7k0.d(mm40Var, 1.0f), u1c.M(76516949, new iio(i3wVar, b), fetVar), u1c.M(1892004438, new iio(i3wVar, b2), fetVar), fetVar, 432);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, i3wVar, i, (byte) 20);
        }
    }

    public static final void v(mm40 mm40Var, z0p z0pVar, nrq nrqVar, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        nrqVar.getClass();
        fetVar2.g0(1883778512);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.i(z0pVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 24.0f);
            boolean z2 = (i2 & 112) == 32 || fetVar2.i(z0pVar);
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new yhn((Object) z0pVar, (byte) 24);
                fetVar2.o0(objP);
            }
            mm40 mm40VarQ = i120.Q(rq8.M(mm40VarE, (Function1) objP), z0pVar.a(), jd8.n);
            tj30 tj30VarC = zq8.c(z0pVar.b(), false);
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
            boolean z3 = z0pVar instanceof x0p;
            jm40 jm40Var = jm40.b;
            if (z3) {
                fetVar2.e0(924438742);
                lgb.v(null, o7k0.n(jm40Var, 20.0f), ((x0p) z0pVar).f40081a, R.drawable.ic_glyph_placeholder_player, StaticColors.INSTANCE.m130getWhite600d7_KjU(), gqw0.A, fetVar2, 196608, 1);
                fetVar2.r(false);
                z = true;
            } else {
                if (!(z0pVar instanceof y0p)) {
                    throw b1j.f(-524370341, fetVar2, false);
                }
                fetVar2.e0(924896240);
                y0p y0pVar = (y0p) z0pVar;
                z = true;
                v8q0.a(y0pVar.f41819a, o2e.e0(s5x0.N(jm40Var, y0pVar.b, 0.0f, y0pVar.c, 0.0f, 10), "FATAL_FURY_TABLE_CELL_TEXT"), y0pVar.d, null, qmk.q, null, null, nrqVar, 0L, null, 0L, 2, false, 1, 0, null, null, fetVar, 12582912, 24960, 241512);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, z0pVar, nrqVar, i, (byte) 13);
        }
    }

    public static final void w(mm40 mm40Var, vfs vfsVar, fet fetVar, int i) {
        mm40 mm40Var2;
        vfs vfsVar2 = vfsVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(606859340);
        int i2 = i | 6 | (fetVar2.g(vfsVar2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundGroup = s6t0.b().f33626a.getBackgroundGroup();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundGroup, ljcVar);
            float f = xfn.a(fetVar2).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, f, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            k7x.a(vfsVar2.f37349a, null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 16.0f), null, new m78(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), 5), fetVar2, 48, 1784);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
            v8q0.a(vfsVar2.b, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 3, 0, null, ibm0.t(g1t0.d(), fetVar2), fetVar, 48, 24576, 114684);
            vfsVar2 = vfsVar;
            v8q0.a(vfsVar2.c, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 2, 0, null, ibm0.n(g1t0.g(), fetVar), fetVar, 0, 24576, 114684);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 25, i, mm40Var2, vfsVar2);
        }
    }

    public static final void x(mm40 mm40Var, nsw nswVar, fet fetVar, int i) {
        nswVar.getClass();
        fetVar.g0(399303770);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(nswVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            kr00.a(u1c.M(286512189, new lsw(mm40Var, nswVar, b), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lsw(mm40Var, nswVar, i);
        }
    }

    public static final void y(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1, boolean z) {
        int i2;
        fetVar.g0(471299616);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8), fetVar);
            boolean zG = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(a4xVar))) | fetVar.g(xczVarA) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                Object t13Var = new t13((Object) a4xVar, (Object) xczVarA, z, (Object) function1, (byte) 10);
                xczVarA = xczVarA;
                fetVar.o0(t13Var);
                objP = t13Var;
            }
            b8k0.e(mm40Var, xczVarA, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, i2 & 14, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vy0(mm40Var, a4xVar, z, function1, i, (byte) 2);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(282836177);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.g(null) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.g(jm40Var, 38.0f, 0.0f, 2), 0.0f, 10.0f, 1);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            brm0.x(fetVar2, mm40VarC0, gqw0.v, 1713236850, false);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, textPrimary, new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarM, fetVar2, (i2 >> 3) & 14, 24960, 109554);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 22);
        }
    }

    public abstract int K(int i);

    public abstract int L(int i);

    @Override // a.awh0
    public int a(int i) {
        int iK = K(i);
        if (iK == -1 || K(iK) == -1) {
            return -1;
        }
        return iK;
    }

    @Override // a.awh0
    public int b(int i) {
        return L(i);
    }

    @Override // a.awh0
    public int c(int i) {
        return K(i);
    }

    @Override // a.awh0
    public int e(int i) {
        int iL = L(i);
        if (iL == -1 || L(iL) == -1) {
            return -1;
        }
        return iL;
    }
}
