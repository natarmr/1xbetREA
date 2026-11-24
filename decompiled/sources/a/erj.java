package a;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.attribution.RequestError;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorMainScreen;
import org.xplatform.bonus_agreements.impl.di.feature.navigation.BonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1;
import org.xplatform.bonuses.impl.navigation.BonusesScreenFactoryImpl$getBonusesScreen$1;
import org.xplatform.client1.features.appactivity.AppScreens$PaymentConsultantFragmentOldScreen;
import org.xplatform.client1.features.appactivity.AppScreens$PaymentConsultantFragmentScreen;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$champsListScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$cyberChampScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$disciplineDetails$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$filteredChampDisciplinesScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$homeScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsScreen$1;
import org.xplatform.fast_games.impl.navigation.FastGamesScreenFactoryImpl$provideFastGamesScreen$1;
import org.xplatform.feature.balance_management.impl.balance_management.BalanceManagementScreenFactoryImpl$getScreen$1;
import org.xplatform.feature.dayexpress.impl.presentation.DayExpressScreen;
import org.xplatform.feature.office.payment.impl.di.navigation.PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1;
import org.xplatform.feed.navigation.FeedScreenFactoryImpl$getBetOnYourScreen$1;
import org.xplatform.messages.navigation.MessagesScreens$MessagesScreen;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoCodesScreen$1;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getBetWithoutRiskScreen$1;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getCmsBannerScreen$1;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsPagerScreen$1;
import org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getMainScreen$1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;
import org.xplatform.swipex.impl.navigation.SwipexScreenFactoryImpl$getSwipexScreen$1;
import org.xplatform.toto_jackpot.impl.navigation.TotoJackpotScreens$TotoJackpotDsFragmentScreen;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final class erj {
    public final kpc A;
    public final gg5 B;
    public final s31 C;
    public final zpu D;
    public final r9u E;
    public final nvu F;
    public final grj G;
    public final z4u H;
    public final eyg0 I;
    public final h3c J;
    public final zx10 K;
    public final d8c L;
    public final ytt M;
    public final owp0 N;
    public final dpc O;
    public final ani0 P;
    public final pmi0 Q;
    public final hpi0 R;
    public final prj S;
    public final zrj T;
    public final cyu U;
    public final daf V;
    public final gr00 W;
    public final wti X;
    public final n0o0 Y;
    public final p7m0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f8283a;
    public final ol60 a0;
    public final mne b;
    public final ctf0 c;
    public final vqc d;
    public final vjp e;
    public final vqc f;
    public final oct g;
    public final fvt0 h;
    public final zn00 i;
    public final p4u j;
    public final bbw0 k;
    public final gxu l;
    public final s64 m;
    public final qu n;
    public final jcu o;
    public final k9c p;
    public final lrc q;
    public final h760 r;
    public final gw60 s;
    public final rou t;
    public final ouu u;
    public final ik4 v;
    public final nr w;
    public final luu x;
    public final o470 y;
    public final qxg0 z;

    public erj(pru pruVar, us00 us00Var, mne mneVar, ctf0 ctf0Var, vqc vqcVar, vjp vjpVar, ntu ntuVar, iqt iqtVar, vqc vqcVar2, oct octVar, fvt0 fvt0Var, zn00 zn00Var, p4u p4uVar, bbw0 bbw0Var, gxu gxuVar, s64 s64Var, qu quVar, jcu jcuVar, k9c k9cVar, lrc lrcVar, h760 h760Var, gw60 gw60Var, rou rouVar, ouu ouuVar, ik4 ik4Var, nr nrVar, luu luuVar, mi70 mi70Var, rqt rqtVar, o470 o470Var, qxg0 qxg0Var, kpc kpcVar, gg5 gg5Var, s31 s31Var, zpu zpuVar, r9u r9uVar, nvu nvuVar, grj grjVar, z4u z4uVar, eyg0 eyg0Var, h3c h3cVar, zx10 zx10Var, d8c d8cVar, ytt yttVar, owp0 owp0Var, dpc dpcVar, ani0 ani0Var, pmi0 pmi0Var, hpi0 hpi0Var, lbu lbuVar, prj prjVar, zrj zrjVar, cyu cyuVar, daf dafVar, gr00 gr00Var, wti wtiVar) {
        ctf0Var.getClass();
        h760Var.getClass();
        r9uVar.getClass();
        this.f8283a = us00Var;
        this.b = mneVar;
        this.c = ctf0Var;
        this.d = vqcVar;
        this.e = vjpVar;
        this.f = vqcVar2;
        this.g = octVar;
        this.h = fvt0Var;
        this.i = zn00Var;
        this.j = p4uVar;
        this.k = bbw0Var;
        this.l = gxuVar;
        this.m = s64Var;
        this.n = quVar;
        this.o = jcuVar;
        this.p = k9cVar;
        this.q = lrcVar;
        this.r = h760Var;
        this.s = gw60Var;
        this.t = rouVar;
        this.u = ouuVar;
        this.v = ik4Var;
        this.w = nrVar;
        this.x = luuVar;
        this.y = o470Var;
        this.z = qxg0Var;
        this.A = kpcVar;
        this.B = gg5Var;
        this.C = s31Var;
        this.D = zpuVar;
        this.E = r9uVar;
        this.F = nvuVar;
        this.G = grjVar;
        this.H = z4uVar;
        this.I = eyg0Var;
        this.J = h3cVar;
        this.K = zx10Var;
        this.L = d8cVar;
        this.M = yttVar;
        this.N = owp0Var;
        this.O = dpcVar;
        this.P = ani0Var;
        this.Q = pmi0Var;
        this.R = hpi0Var;
        this.S = prjVar;
        this.T = zrjVar;
        this.U = cyuVar;
        this.V = dafVar;
        this.W = gr00Var;
        this.X = wtiVar;
        this.Y = maz.b(new hc0(pruVar, (byte) 18));
        this.Z = q7m0.a(wpe.f39540a);
        this.a0 = new ol60(3);
    }

    public static long b(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt)) {
                break;
            }
            sb.append(cCharAt);
        }
        Long lT0 = StringsKt.t0(sb.toString());
        if (lT0 != null) {
            return lT0.longValue();
        }
        return 0L;
    }

    public static void b0(erj erjVar, lr1 lr1Var, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        erjVar.W.A(lr1Var, z);
    }

    public static Long c(Uri uri) {
        String strE0 = sj3.e0(uri, ParameterNames.ID);
        if (strE0 != null) {
            return StringsKt.t0(strE0);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:119:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:98:0x014c  */
    public static pdd0 e(Uri uri, Intent intent) {
        k9h0 k9h0Var;
        jr1 jr1Var;
        String strE0;
        Long lT0;
        String strE1;
        List listL0;
        List listSplit$default;
        fr1 fr1Var;
        String strE2 = sj3.e0(uri, Payload.TYPE);
        if (strE2 == null) {
            strE2 = "";
        }
        Long lC = c(uri);
        long jLongValue = 0;
        long jLongValue2 = lC != null ? lC.longValue() : 0L;
        String strE3 = sj3.e0(uri, "section");
        if (strE3 != null) {
            switch (strE3) {
                case "brands":
                    k9h0Var = k9h0.A1;
                    break;
                case "tournaments":
                    k9h0Var = k9h0.r1;
                    break;
                case "mycasino":
                    k9h0Var = k9h0.p1;
                    break;
                case "promo":
                    k9h0Var = k9h0.u1;
                    break;
                case "tvbet":
                    k9h0Var = k9h0.w1;
                    break;
                case "virtual":
                    k9h0Var = k9h0.I1;
                    break;
                case "categories":
                    k9h0Var = k9h0.q1;
                    break;
                default:
                    k9h0Var = k9h0.b;
                    break;
            }
        } else {
            k9h0Var = k9h0.b;
        }
        int iOrdinal = k9h0Var.ordinal();
        if (iOrdinal == 0) {
            return sad0.f31884a;
        }
        if (iOrdinal == 55) {
            if (intent.getBooleanExtra("ACTIVITY_RECREATED", false)) {
                jLongValue2 = 0;
            }
            switch (strE2) {
                case "tournament":
                    jr1Var = new jr1(new evc0(false, jLongValue2));
                    break;
                case "prizes":
                    jr1Var = new jr1(new cvc0(d7v.b));
                    break;
                case "tournaments":
                    jr1Var = new jr1(new evc0(false, 0L));
                    break;
                case "promocode":
                    jr1Var = new jr1(new dvc0((int) jLongValue2));
                    break;
                case "freespins":
                    jr1Var = new jr1(new cvc0(d7v.d));
                    break;
                case "bonuses":
                    jr1Var = new jr1(new cvc0(d7v.c));
                    break;
                case "nativetournament":
                    jr1Var = new jr1(new evc0(false, jLongValue2));
                    break;
                default:
                    jr1Var = new jr1();
                    break;
            }
            return new j9d0(jr1Var);
        }
        if (iOrdinal == 58) {
            return gdd0.f11101a;
        }
        if (iOrdinal == 62) {
            return new j9d0(new er1(true, intent.getBooleanExtra("ACTIVITY_RECREATED", false) ? 0L : jLongValue2));
        }
        if (iOrdinal == 70) {
            return l9d0.f19646a;
        }
        switch (iOrdinal) {
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return new j9d0(strE2.equals("vipcashback") ? new hr1(-10L, 2) : new hr1(jLongValue, 3));
            case 51:
                if (jLongValue2 == 0) {
                    jLongValue2 = Long.MIN_VALUE;
                }
                boolean booleanExtra = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                long j = booleanExtra ? Long.MIN_VALUE : jLongValue2;
                if (!booleanExtra && (strE0 = sj3.e0(uri, "partId")) != null && (lT0 = StringsKt.t0(strE0)) != null) {
                    jLongValue = lT0.longValue();
                }
                long j2 = jLongValue;
                if (booleanExtra || (strE1 = sj3.e0(uri, "filterid")) == null || (listSplit$default = StringsKt__StringsKt.split$default(strE1, new String[]{Separators.COMMA}, false, 0, 6, null)) == null) {
                    listL0 = iun.f15405a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        Long lT1 = StringsKt.t0((String) it.next());
                        if (lT1 != null) {
                            arrayList.add(lT1);
                        }
                    }
                    listL0 = CollectionsKt.L0(arrayList);
                    if (listL0 == null) {
                        listL0 = iun.f15405a;
                    }
                }
                List list = listL0;
                q91 q91Var = intent.getBooleanExtra("IS_PUSH_NOTIFICATION", false) ? q91.c : q91.b;
                int iHashCode = strE2.hashCode();
                if (iHashCode != -987494927) {
                    if (iHashCode != 3165170) {
                        if (iHashCode == 1300380478 && strE2.equals("subcategory")) {
                            fr1Var = new fr1(new fs80(null, j, list, null, 0L, false, 121), q91Var);
                        } else {
                            fr1Var = new fr1(null, q91Var, 1);
                        }
                    } else if (strE2.equals("game")) {
                        fr1Var = new fr1(new fs80(null, 0L, null, null, j, false, 111), q91Var);
                    } else {
                        fr1Var = new fr1(null, q91Var, 1);
                    }
                } else if (strE2.equals("provider")) {
                    fr1Var = new fr1((j2 == nw80.b.getId() || j2 == nw80.f24223a.getId()) ? new fs80(null, j2, null, kotlin.collections.a.c(Long.valueOf(j)), 0L, false, 117) : new fs80(null, 0L, null, null, 0L, false, 127), q91Var);
                } else {
                    fr1Var = new fr1(null, q91Var, 1);
                }
                return new j9d0(fr1Var);
            case 52:
                if (intent.getBooleanExtra("ACTIVITY_RECREATED", false)) {
                    jLongValue2 = 0;
                }
                return new j9d0(strE2.equals("tournament") ? new jr1(new evc0(false, jLongValue2)) : new jr1(new evc0(false, intent.getBooleanExtra("OPEN_NATIVE_TOURNAMENT", false) ? intent.getLongExtra("casinoNativeTournamentId", 0L) : intent.getLongExtra("casinoTournamentId", 0L))));
            default:
                return null;
        }
    }

    public static kbd0 h(Uri uri) {
        String strE0 = sj3.e0(uri, "PARAMETER_KEY_FROM_AGGREGATOR");
        boolean z = strE0 != null ? Boolean.parseBoolean(strE0) : false;
        String strE1 = sj3.e0(uri, "PARAMETER_KEY_SHOW_NAV_BAR");
        boolean z2 = strE1 != null ? Boolean.parseBoolean(strE1) : true;
        String strE2 = sj3.e0(uri, "PARAMETER_KEY_POSITION");
        int i = strE2 != null ? Integer.parseInt(strE2) : 0;
        String strE3 = sj3.e0(uri, "PARAMETER_KEY_BANNER_ID");
        int i2 = strE3 != null ? Integer.parseInt(strE3) : 0;
        String strE4 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TYPE");
        return new kbd0(i, i2, strE4 != null ? Integer.parseInt(strE4) : 0, z, z2);
    }

    public static lbd0 i(Uri uri) {
        String strE0 = sj3.e0(uri, "PARAMETER_KEY_SHOW_NAV_BAR");
        boolean z = strE0 != null ? Boolean.parseBoolean(strE0) : true;
        String strE1 = sj3.e0(uri, "PARAMETER_KEY_NEED_AUTH");
        boolean z2 = strE1 != null ? Boolean.parseBoolean(strE1) : true;
        String strE2 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TRANSLATE_ID");
        if (strE2 == null) {
            strE2 = "";
        }
        String strE3 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TITLE");
        String str = strE3 != null ? strE3 : "";
        bj5 bj5Var = oo5.b;
        String strE4 = sj3.e0(uri, "PARAMETER_KEY_BANNER_ACTION_TYPE");
        Integer numValueOf = Integer.valueOf(strE4 != null ? Integer.parseInt(strE4) : 0);
        bj5Var.getClass();
        oo5 oo5VarC = bj5.c(numValueOf);
        if (oo5VarC == null) {
            oo5VarC = oo5.ACTION_INFO;
        }
        String strE5 = sj3.e0(uri, "PARAMETER_KEY_BANNER_PRIZE_FLAG");
        return new lbd0(z, z2, strE2, str, oo5VarC, strE5 != null ? Integer.parseInt(strE5) : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r7 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(a.hbd0 r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.hqj
            if (r0 == 0) goto L13
            r0 = r8
            a.hqj r0 = (a.hqj) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.hqj r0 = new a.hqj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L32
            if (r2 != r4) goto L2c
            a.z1x.P(r8)
            goto L9d
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L32:
            a.hbd0 r7 = r0.i
            a.z1x.P(r8)
            goto L5a
        L38:
            a.z1x.P(r8)
            int r8 = r7.f12765a
            r6.L(r8)
            a.k9c r8 = r6.p
            boolean r8 = r8.a()
            if (r8 == 0) goto L4b
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L4b:
            a.aue0 r8 = r7.b
            r0.i = r7
            r0.l = r5
            a.ytt r2 = r6.M
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L5a
            goto L9c
        L5a:
            a.bzs0 r8 = a.fzs0.f10425a
            int r7 = r7.f12765a
            r8.getClass()
            a.c0o r8 = a.fzs0.c
            a.y2 r8 = a.ohs0.h(r8, r8)
        L67:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r8.next()
            r5 = r2
            a.fzs0 r5 = (a.fzs0) r5
            int r5 = r5.a()
            if (r5 != r7) goto L67
            goto L7c
        L7b:
            r2 = r3
        L7c:
            a.fzs0 r2 = (a.fzs0) r2
            r0.i = r3
            r0.l = r4
            a.owp0 r7 = r6.N
            java.lang.Object r7 = r7.b
            a.on4 r7 = (a.on4) r7
            a.rn4 r7 = r7.b
            java.lang.Object r7 = r7.b(r2, r0)
            a.wne r8 = a.wne.f39444a
            if (r7 != r8) goto L93
            goto L95
        L93:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L95:
            if (r7 != r8) goto L98
            goto L9a
        L98:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L9a:
            if (r7 != r1) goto L9d
        L9c:
            return r1
        L9d:
            a.ani0 r7 = r6.P
            r8 = 0
            r7.d(r8)
            a.zrj r6 = r6.T
            r6.m()
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.erj.A(a.hbd0, a.zje):java.lang.Object");
    }

    public final void A0() {
        if (n().I0) {
            wv10 wv10Var = wv10.SPORT;
            this.T.a(new ab50(5), new SwipexScreenFactoryImpl$getSwipexScreen$1());
        }
    }

    public final void B() {
        if (n().t) {
            kd30.G((kd30) this.V.b, new ab50(0), new MessagesScreens$MessagesScreen(), true, false, 18);
        }
    }

    public final void B0() {
        if (!n().z0) {
            return;
        }
        zrj zrjVar = this.T;
        i1w0 i1w0VarB = zrjVar.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                wv10 wv10Var = wv10.SPORT;
                zrjVar.n(new ab50(4), new qrj(zrjVar, b), false);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final Object C(joj jojVar, zje zjeVar) {
        boolean z = n().l.i;
        zrj zrjVar = this.T;
        if (!z || !n().l.f) {
            zrjVar.p();
            return Unit.f46060a;
        }
        long j = jojVar.f16860a;
        if (j != 0) {
            zrjVar.r(j, n().V0, false);
        } else {
            PromoScreenFactoryImpl$getPromoCodesScreen$1 promoScreenFactoryImpl$getPromoCodesScreen$1 = new PromoScreenFactoryImpl$getPromoCodesScreen$1();
            wv10 wv10Var = wv10.SPORT;
            zrjVar.n(new ab50(4), new e3j(promoScreenFactoryImpl$getPromoCodesScreen$1, (byte) 7), false);
        }
        Object objA = this.M.a(jojVar.b, zjeVar);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final void C0() {
        boolean z = n().f32117a.e;
        zrj zrjVar = this.T;
        if (!z) {
            zrjVar.p();
        } else {
            wv10 wv10Var = wv10.SPORT;
            zrjVar.a(new ab50(4), zrjVar.o.a());
        }
    }

    public final void D() {
        if (!n().l.i || !n().l.q) {
            this.T.p();
            return;
        }
        zuc0 zuc0Var = n().V0;
        daf dafVar = this.V;
        i1w0 i1w0VarB = ((oeg0) dafVar.h).b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                kd30 kd30Var = (kd30) dafVar.b;
                wv10 wv10Var = wv10.SPORT;
                kd30Var.Q(new ab50(4), new ast0(dafVar, zuc0Var, b));
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D0(hpj hpjVar, zje zjeVar) {
        arj arjVar;
        if (zjeVar instanceof arj) {
            arjVar = (arj) zjeVar;
            int i = arjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                arjVar.l = i - Integer.MIN_VALUE;
            } else {
                arjVar = new arj(this, zjeVar);
            }
        } else {
            arjVar = new arj(this, zjeVar);
        }
        Object obj = arjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = arjVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            aue0 aue0Var = aue0.d;
            arjVar.i = hpjVar;
            arjVar.l = 1;
            if (this.M.a(aue0Var, arjVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hpjVar = arjVar.i;
            z1x.P(obj);
        }
        hpjVar.getClass();
        gr00 gr00Var = this.W;
        ((oeg0) gr00Var.d).c().d(new df1(gr00Var, hpjVar, (byte) 4));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(ncd0 ncd0Var, zje zjeVar) {
        iqj iqjVar;
        if (zjeVar instanceof iqj) {
            iqjVar = (iqj) zjeVar;
            int i = iqjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqjVar.k = i - Integer.MIN_VALUE;
            } else {
                iqjVar = new iqj(this, zjeVar);
            }
        } else {
            iqjVar = new iqj(this, zjeVar);
        }
        Object obj = iqjVar.i;
        wne wneVar = wne.f39444a;
        int i2 = iqjVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (this.p.a()) {
                return Unit.f46060a;
            }
            aue0 aue0Var = ncd0Var.f23288a;
            iqjVar.k = 1;
            if (this.M.a(aue0Var, iqjVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.T.j.b().d(new x2i((byte) 18));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E0(hdd0 hdd0Var, zje zjeVar) {
        zqj zqjVar;
        if (zjeVar instanceof zqj) {
            zqjVar = (zqj) zjeVar;
            int i = zqjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zqjVar.l = i - Integer.MIN_VALUE;
            } else {
                zqjVar = new zqj(this, zjeVar);
            }
        } else {
            zqjVar = new zqj(this, zjeVar);
        }
        Object obj = zqjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = zqjVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            aue0 aue0Var = aue0.d;
            zqjVar.i = hdd0Var;
            zqjVar.l = 1;
            if (this.M.a(aue0Var, zqjVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hdd0Var = zqjVar.i;
            z1x.P(obj);
        }
        boolean z = hdd0Var.b;
        hpj hpjVar = new hpj(hdd0Var.c, hdd0Var.d, hdd0Var.f12864a, z);
        gr00 gr00Var = this.W;
        ((oeg0) gr00Var.d).c().d(new df1(gr00Var, hpjVar, (byte) 4));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object F(woj wojVar, boolean z, zje zjeVar) {
        jqj jqjVar;
        List listL0;
        boolean z2;
        woj wojVar2 = wojVar;
        if (zjeVar instanceof jqj) {
            jqjVar = (jqj) zjeVar;
            int i = jqjVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqjVar.m = i - Integer.MIN_VALUE;
            } else {
                jqjVar = new jqj(this, zjeVar);
            }
        } else {
            jqjVar = new jqj(this, zjeVar);
        }
        Object objB = jqjVar.k;
        wne wneVar = wne.f39444a;
        int i2 = jqjVar.m;
        if (i2 == 0) {
            z1x.P(objB);
            long j = wojVar2.f39501a;
            t760 t760VarA = this.r.a();
            gle0 gle0Var = k9h0.f17916a;
            int i3 = (int) j;
            mnv mnvVar = (mnv) ((t940) ((kd30) this.j.f26374a).f18086a).b.get(Integer.valueOf(i3));
            if (mnvVar != null) {
                synchronized (mnvVar.f22108a) {
                    listL0 = CollectionsKt.L0(mnvVar.f22108a);
                }
                if (listL0 == null) {
                    listL0 = iun.f15405a;
                }
            } else {
                listL0 = iun.f15405a;
            }
            ((u760) t760VarA).b("TRACK_TYPE", listL0);
            ((t940) ((kd30) this.k.b).f18086a).b.remove(Integer.valueOf(i3));
            h3c h3cVar = this.J;
            long j2 = wojVar2.c;
            jqjVar.i = wojVar2;
            z2 = z;
            jqjVar.j = z2;
            jqjVar.m = 1;
            objB = h3cVar.b(j2, jqjVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = jqjVar.j;
            woj wojVar3 = jqjVar.i;
            z1x.P(objB);
            z2 = z3;
            wojVar2 = wojVar3;
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        zrj zrjVar = this.T;
        wojVar2.getClass();
        qv2 qv2Var = zrjVar.i;
        GameBroadcastType gameBroadcastType = GameBroadcastType.c;
        grs grsVar = grs.b;
        ors orsVar = ors.f25750a;
        k1g k1gVar = k1g.OPEN_REGULAR;
        zrj.c(zrjVar, new bb50(false), qv2Var.h(new GameScreenGeneralParams(wojVar2.f39501a, wojVar2.b, wojVar2.c, wojVar2.d, zBooleanValue, 0L, wojVar2.e, gameBroadcastType, grsVar, "main_screen", "", orsVar, 0, false, z2 ? k1g.OPEN_FROM_PUSH : k1g.OPEN_FROM_BANNER)), 4);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object F0(zje zjeVar, Intent intent, String str) throws Throwable {
        brj brjVar;
        Uri data;
        String str2;
        String str3;
        String strE0;
        pdd0 pdd0Var;
        cyu cyuVar = (cyu) this.K.f45137a;
        if (zjeVar instanceof brj) {
            brjVar = (brj) zjeVar;
            int i = brjVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                brjVar.n = i - Integer.MIN_VALUE;
            } else {
                brjVar = new brj(this, zjeVar);
            }
        } else {
            brjVar = new brj(this, zjeVar);
        }
        Object obj = brjVar.l;
        Object obj2 = wne.f39444a;
        int i2 = brjVar.n;
        ol60 ol60Var = this.a0;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = brjVar.j;
                str3 = brjVar.i;
                z1x.P(obj);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pdd0Var = brjVar.k;
                z1x.P(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                ol60Var.f(bvp0.f3289a);
            }
            return pdd0Var;
        }
        z1x.P(obj);
        Uri data2 = intent.getData();
        if (data2 == null || (strE0 = sj3.e0(data2, "af_dp")) == null || (data = Uri.parse(strE0)) == null) {
            data = intent.getData();
        }
        String strE1 = data != null ? sj3.e0(data, "deeplink") : null;
        String strE2 = data != null ? sj3.e0(data, "botId") : null;
        if (strE2 == null) {
            strE2 = "";
        }
        String strE3 = data != null ? sj3.e0(data, "tgUserToken") : null;
        if (strE3 == null) {
            strE3 = "";
        }
        Uri uri = Uri.parse(str + "://" + strE1);
        brjVar.i = strE2;
        brjVar.j = strE3;
        brjVar.n = 1;
        Object objD = d(intent, str, uri, brjVar);
        if (objD != obj2) {
            str2 = strE3;
            obj = objD;
            str3 = strE2;
        }
        return obj2;
        pdd0 pdd0Var2 = (pdd0) obj;
        boolean zA = this.p.a();
        if (!(pdd0Var2 instanceof ncd0) && !(pdd0Var2 instanceof hbd0)) {
            z = false;
        }
        if (z && !zA) {
            str3.getClass();
            ivp0 ivp0Var = (ivp0) cyuVar.c;
            ivp0Var.getClass();
            ivp0Var.f15457a = str3;
            return pdd0Var2;
        }
        if (zA && z) {
            str3.getClass();
            ivp0 ivp0Var2 = (ivp0) cyuVar.c;
            ivp0Var2.getClass();
            ivp0Var2.f15457a = str3;
            ol60Var.f(cvp0.f5042a);
            return pdd0Var2;
        }
        brjVar.i = null;
        brjVar.j = null;
        brjVar.k = pdd0Var2;
        brjVar.n = 2;
        Object objD2 = this.L.f5641a.d(str2, str3, brjVar);
        if (objD2 != obj2) {
            obj = objD2;
            pdd0Var = pdd0Var2;
            if (!((Boolean) obj).booleanValue()) {
                ol60Var.f(bvp0.f3289a);
            }
            return pdd0Var;
        }
        return obj2;
    }

    public final void G(lr1 lr1Var) {
        if (!n().b.f13233a.f8987a) {
            return;
        }
        wv10 wv10Var = wv10.SPORT;
        ab50 ab50Var = new ab50(6);
        gr00 gr00Var = this.W;
        AggregatorScreens$AggregatorMainScreen aggregatorScreens$AggregatorMainScreenQ = ((h7i) ((fvt0) gr00Var.c).f10231a).d().q(lr1Var);
        ((pmi0) gr00Var.e).h(ab50Var);
        i1w0 i1w0VarB = ((oeg0) gr00Var.d).b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                kd30.G((kd30) gr00Var.f11760a, ab50Var, aggregatorScreens$AggregatorMainScreenQ, false, false, 18);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G0(Intent intent, zje zjeVar) {
        crj crjVar;
        kie0 kie0Var;
        List listJ;
        Exception e;
        kie0 kie0Var2;
        if (zjeVar instanceof crj) {
            crjVar = (crj) zjeVar;
            int i = crjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                crjVar.l = i - Integer.MIN_VALUE;
            } else {
                crjVar = new crj(this, zjeVar);
            }
        } else {
            crjVar = new crj(this, zjeVar);
        }
        Object obj = crjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = crjVar.l;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kie0Var2 = crjVar.i;
            try {
                z1x.P(obj);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
            kie0Var = kie0Var2;
            break;
        }
        z1x.P(obj);
        kie0Var = new kie0();
        Bundle extras = intent.getExtras();
        if (extras != null && ((listJ = q3d.j("taskId", "messageId", "mass_mailing_key")) == null || !listJ.isEmpty())) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                if (extras.containsKey((String) it.next())) {
                    String string = extras.getString("taskId", "");
                    if (string.length() == 0) {
                        string = extras.getString("mass_mailing_key", "");
                    }
                    String string2 = extras.getString("messageId", "");
                    kie0Var.f18333a = extras.getInt("notifIssuer", 0);
                    try {
                        zn00 zn00Var = this.i;
                        string.getClass();
                        string2.getClass();
                        int i3 = kie0Var.f18333a;
                        crjVar.i = kie0Var;
                        crjVar.l = 1;
                        if (zn00Var.O0(i3, crjVar, string, string2) != wneVar) {
                            kie0Var2 = kie0Var;
                            kie0Var = kie0Var2;
                            break;
                        }
                        return wneVar;
                    } catch (Exception e3) {
                        e = e3;
                        kie0Var2 = kie0Var;
                        e.printStackTrace();
                    }
                }
            }
        }
        if (kie0Var.f18333a == 4) {
            b1j.v("push_fav_game", this.B.f11237a, 10783L);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final Object H(Intent intent, mqj mqjVar) {
        Uri data;
        String strE0;
        Uri data2 = intent.getData();
        if (data2 == null || (strE0 = sj3.e0(data2, "af_dp")) == null) {
            data = intent.getData();
        } else {
            String lowerCase = strE0.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            data = Uri.parse(lowerCase);
            if (data == null) {
                data = intent.getData();
            }
        }
        if (data != null) {
            String string = data.toString();
            string.getClass();
            M(string);
        }
        prj prjVar = this.S;
        n0o0 n0o0Var = prjVar.d;
        if (data != null) {
            String scheme = data.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            String host = data.getHost();
            String str = host != null ? host : "";
            String strA = prjVar.f27468a.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0));
            if (scheme.equalsIgnoreCase(strA) && str.equalsIgnoreCase("open")) {
                return prjVar.D(data, intent, ((sff0) n0o0Var.getValue()).f1, mqjVar);
            }
            if (str.equalsIgnoreCase("telegramBot")) {
                return prjVar.E(strA, intent, ((sff0) n0o0Var.getValue()).f1, mqjVar);
            }
            if (scheme.equalsIgnoreCase("https")) {
                List<String> pathSegments = data.getPathSegments();
                int size = pathSegments.size();
                if (size == 2) {
                    j700 j700Var = kotlin.text.c.o(pathSegments.get(0), "live") ? j700.b : j700.f16016a;
                    xun xunVar = xun.f41520a;
                    return new inj(j700Var, 0, 0L, xunVar, xunVar, false);
                }
                if (size == 3) {
                    String str2 = pathSegments.get(2);
                    str2.getClass();
                    long jV = prj.v(str2);
                    boolean zO = kotlin.text.c.o(pathSegments.get(0), "live");
                    Set setB = cui0.b(Long.valueOf(jV));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : setB) {
                        if (((Number) obj).longValue() != 0) {
                            arrayList.add(obj);
                        }
                    }
                    return new inj(zO ? j700.b : j700.f16016a, 0, 0L, xun.f41520a, CollectionsKt.P0(arrayList), false);
                }
                if (size == 4) {
                    String str3 = pathSegments.get(3);
                    str3.getClass();
                    return new bnj(prj.v(str3), 0L, 0L, 0L, kotlin.text.c.o(pathSegments.get(0), "live"));
                }
            }
        }
        return xmj.f41127a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019a, code lost:
    
        if (P(r1, r2, r3, r4, r5, r6) == r8) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(android.content.Intent r18, java.lang.String r19, java.lang.String r20, int r21, boolean r22, a.zje r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.erj.H0(android.content.Intent, java.lang.String, java.lang.String, int, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(zje zjeVar) {
        kqj kqjVar;
        if (zjeVar instanceof kqj) {
            kqjVar = (kqj) zjeVar;
            int i = kqjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqjVar.k = i - Integer.MIN_VALUE;
            } else {
                kqjVar = new kqj(this, zjeVar);
            }
        } else {
            kqjVar = new kqj(this, zjeVar);
        }
        Object objA = kqjVar.i;
        wne wneVar = wne.f39444a;
        int i2 = kqjVar.k;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(objA);
            if (n().u0 && this.p.a()) {
                kqjVar.k = 1;
                objA = this.t.a(false, kqjVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        if (((m2c0) objA).e0 != cau0.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final Object I0(Intent intent, boolean z, String str, int i, mqj mqjVar) {
        pdd0 gad0Var;
        String action = intent.getAction();
        if (action == null) {
            action = "null";
        }
        String action2 = intent.getAction();
        if (Intrinsics.d(action2, csj0.LINE_SHORTCUT.a())) {
            gad0Var = new wcd0(j700.f16016a);
        } else if (Intrinsics.d(action2, csj0.LIVE_SHORTCUT.a())) {
            gad0Var = new wcd0(j700.b);
        } else if (Intrinsics.d(action2, csj0.ONE_X_GAMES_SHORTCUT.a())) {
            gad0Var = tbd0.f33658a;
        } else if (Intrinsics.d(action2, csj0.HISTORY_SHORTCUT.a())) {
            gad0Var = cbd0.f4057a;
        } else {
            gad0Var = Intrinsics.d(action2, csj0.CYBER_SPORT_SHORTCUT.a()) ? new gad0(CyberGamesPage.Real.INSTANCE.f46556a, false) : sad0.f31884a;
        }
        pdd0 pdd0Var = gad0Var;
        List list = n().R;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((csj0) it.next()).a().equals(action)) {
                    Bundle extras = intent.getExtras();
                    Object objP = P(pdd0Var, z, i, extras != null ? new Integer(extras.getInt("notifIssuer", 0)) : null, str, mqjVar);
                    return objP == wne.f39444a ? objP : Unit.f46060a;
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(zje zjeVar) {
        lqj lqjVar;
        if (zjeVar instanceof lqj) {
            lqjVar = (lqj) zjeVar;
            int i = lqjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lqjVar.l = i - Integer.MIN_VALUE;
            } else {
                lqjVar = new lqj(this, zjeVar);
            }
        } else {
            lqjVar = new lqj(this, zjeVar);
        }
        Object objA = lqjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = lqjVar.l;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(objA);
            if (n().T && this.p.a()) {
                lqjVar.i = this;
                lqjVar.l = 1;
                objA = this.t.a(false, lqjVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = lqjVar.i;
        z1x.P(objA);
        m2c0 m2c0Var = (m2c0) objA;
        this.getClass();
        boolean z2 = m2c0Var.Z.length() == 0;
        int iOrdinal = m2c0Var.k.ordinal();
        boolean z3 = (iOrdinal == 2 || iOrdinal == 3) ? false : true;
        if (z2 || z3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0248  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[PHI: r10 r11 r12
  0x0099: PHI (r10v11 'this' a.erj) = (r10v8 'this' a.erj), (r10v19 'this' a.erj) binds: [B:49:0x00e4, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r11v7 android.content.Intent) = (r11v5 android.content.Intent), (r11v9 android.content.Intent) binds: [B:49:0x00e4, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r12v11 java.lang.Object) = (r12v10 java.lang.Object), (r12v1 java.lang.Object) binds: [B:49:0x00e4, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[Catch: all -> 0x0238, PHI: r10 r11 r12
  0x00d1: PHI (r10v8 'this' a.erj) = (r10v6 'this' a.erj), (r10v9 'this' a.erj) binds: [B:44:0x00cd, B:34:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00d1: PHI (r11v5 android.content.Intent) = (r11v3 android.content.Intent), (r11v6 android.content.Intent) binds: [B:44:0x00cd, B:34:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00d1: PHI (r12v6 java.lang.Object) = (r12v5 java.lang.Object), (r12v1 java.lang.Object) binds: [B:44:0x00cd, B:34:0x00a0] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x010c A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0114 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x011a A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0133 A[Catch: all -> 0x0238, PHI: r1 r10 r11
  0x0133: PHI (r1v2 android.content.Intent) = 
  (r1v1 android.content.Intent)
  (r1v1 android.content.Intent)
  (r1v1 android.content.Intent)
  (r1v9 android.content.Intent)
 binds: [B:59:0x0118, B:61:0x0120, B:63:0x012f, B:28:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r10v20 boolean) = (r10v16 boolean), (r10v16 boolean), (r10v16 boolean), (r10v22 boolean) binds: [B:59:0x0118, B:61:0x0120, B:63:0x012f, B:28:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r11v10 a.erj) = (r11v8 a.erj), (r11v8 a.erj), (r11v8 a.erj), (r11v14 a.erj) binds: [B:59:0x0118, B:61:0x0120, B:63:0x012f, B:28:0x008d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0148 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x019e A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b9 A[Catch: all -> 0x0238, PHI: r1 r2 r3 r4 r5 r10 r11 r12
  0x01b9: PHI (r1v18 boolean) = (r1v15 boolean), (r1v19 boolean) binds: [B:81:0x01b5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r2v14 java.lang.Integer) = (r2v11 java.lang.Integer), (r2v15 java.lang.Integer) binds: [B:81:0x01b5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r3v8 java.lang.String) = (r3v5 java.lang.String), (r3v9 java.lang.String) binds: [B:81:0x01b5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r4v9 a.erj) = (r4v6 a.erj), (r4v10 a.erj) binds: [B:81:0x01b5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r5v10 android.content.Intent) = (r5v6 android.content.Intent), (r5v11 android.content.Intent) binds: [B:81:0x01b5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r10v31 boolean) = (r10v27 boolean), (r10v32 boolean) binds: [B:81:0x01b5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r11v23 int) = (r11v19 int), (r11v24 int) binds: [B:81:0x01b5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r12v34 java.lang.Object) = (r12v29 java.lang.Object), (r12v1 java.lang.Object) binds: [B:81:0x01b5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01bb A[Catch: all -> 0x0238, PHI: r1 r2 r3 r4 r5 r10 r11 r12
  0x01bb: PHI (r1v17 boolean) = (r1v15 boolean), (r1v18 boolean) binds: [B:79:0x019c, B:83:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r2v13 java.lang.Integer) = (r2v11 java.lang.Integer), (r2v14 java.lang.Integer) binds: [B:79:0x019c, B:83:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r3v7 java.lang.String) = (r3v5 java.lang.String), (r3v8 java.lang.String) binds: [B:79:0x019c, B:83:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r4v8 a.erj) = (r4v6 a.erj), (r4v9 a.erj) binds: [B:79:0x019c, B:83:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r5v8 android.content.Intent) = (r5v6 android.content.Intent), (r5v10 android.content.Intent) binds: [B:79:0x019c, B:83:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r10v29 boolean) = (r10v27 boolean), (r10v31 boolean) binds: [B:79:0x019c, B:83:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r11v21 int) = (r11v19 int), (r11v23 int) binds: [B:79:0x019c, B:83:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r12v30 a.upj) = (r12v27 a.upj), (r12v35 a.upj) binds: [B:79:0x019c, B:83:0x01b9] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01bf A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c7 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e5 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:13:0x002c, B:99:0x0230, B:16:0x003d, B:96:0x0215, B:19:0x0058, B:83:0x01b9, B:84:0x01bb, B:86:0x01bf, B:88:0x01c7, B:89:0x01cc, B:22:0x006b, B:78:0x0198, B:80:0x019e, B:25:0x007e, B:74:0x017a, B:92:0x01e5, B:28:0x008d, B:65:0x0133, B:67:0x0148, B:69:0x0155, B:31:0x0096, B:51:0x00e8, B:100:0x0235, B:54:0x00f2, B:56:0x010c, B:58:0x0114, B:60:0x011a, B:62:0x0122, B:34:0x00a0, B:46:0x00d1, B:48:0x00d9, B:37:0x00a8, B:43:0x00c2, B:40:0x00af), top: B:109:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0211  */
    /* JADX WARN: Code duplicated, block: B:95:0x0212  */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022d, code lost:
    
        if (r10.I0(r2, r3, r4, r5, r7) == r0) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(android.content.Intent r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.erj.K(android.content.Intent, a.zje):java.lang.Object");
    }

    public final void L(int i) {
        if (i != 0) {
            b1j.r(i, this.v.f14907a, 3065L);
            b1j.w("local_notification_number", Integer.valueOf(i), (kt2) this.w.b, "auth_notification_opened");
        }
    }

    public final void M(String str) {
        str.getClass();
        b1j.v(str, this.s.f12011a, 11974L);
        this.C.f31532a.a("deeplink_transition", wp20.b(new Pair("point", str)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    public final Object N(Intent intent, mqj mqjVar) {
        Object serializableExtra;
        z660 z660Var;
        Object objB;
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("LOCAL_NOTIFICATION_TYPE", sr00.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("LOCAL_NOTIFICATION_TYPE");
            if (!(serializableExtra2 instanceof sr00)) {
                serializableExtra2 = null;
            }
            serializableExtra = (sr00) serializableExtra2;
        }
        sr00 sr00Var = (sr00) serializableExtra;
        if (sr00Var == null) {
            return Unit.f46060a;
        }
        int iOrdinal = sr00Var.ordinal();
        if (iOrdinal == 0) {
            z660Var = z660.PREVENTION_END;
        } else if (iOrdinal == 1) {
            z660Var = z660.FAVORITE_GAME_START;
        } else if (iOrdinal == 2) {
            z660Var = z660.COUPON_CONTINUE;
        } else if (iOrdinal == 7) {
            z660Var = z660.UNAUTHORIZED_24H;
        } else {
            if (iOrdinal != 8) {
                if (iOrdinal != 9) {
                    objB = Unit.f46060a;
                } else {
                    z660Var = z660.UNAUTHORIZED_120H;
                }
                if (objB == wne.f39444a) {
                    return objB;
                }
                return Unit.f46060a;
            }
            z660Var = z660.UNAUTHORIZED_72H;
        }
        String str = z660Var.f43851a;
        i8i.D("option", str, this.n.f29324a, "local_push_click");
        objB = this.m.f31684a.b(12663L, mqjVar, cui0.b(new j1p(str, (byte) 0)));
        wne wneVar = wne.f39444a;
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        if (objB == wne.f39444a) {
            return objB;
        }
        return Unit.f46060a;
    }

    public final void O(Intent intent) {
        Set<String> queryParameterNames;
        String strE0;
        Uri data = intent.getData();
        List list = null;
        if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null) {
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                str.getClass();
                if (kotlin.text.c.x(str, "utm_", false)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : arrayList) {
                Uri data2 = intent.getData();
                if (data2 != null) {
                    str2.getClass();
                    strE0 = sj3.e0(data2, str2);
                } else {
                    strE0 = null;
                }
                if (strE0 == null) {
                    strE0 = "";
                }
                arrayList2.add(new Pair(str2, strE0));
            }
            list = arrayList2;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        Map mapM = xp20.m(list);
        mapM.getClass();
        this.C.f31532a.a("deeplink_opened", mapM);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final Object P(pdd0 pdd0Var, boolean z, int i, Integer num, String str, zje zjeVar) {
        FragmentScreen fragmentScreenB;
        Long l;
        FragmentScreen cyberGamesScreenFactoryImpl$disciplineDetails$1;
        daf dafVar = this.V;
        kd30 kd30Var = (kd30) dafVar.b;
        zrj zrjVar = this.T;
        vqc vqcVar = zrjVar.k;
        vjp vjpVar = zrjVar.h;
        if (z) {
            this.l.u(i, pdd0Var, str, num);
        }
        if (pdd0Var instanceof o9d0) {
            zrjVar.k(hrj.AWARDS.toString());
        } else {
            if (pdd0Var instanceof hbd0) {
                Object objA = A((hbd0) pdd0Var, zjeVar);
                return objA == wne.f39444a ? objA : Unit.f46060a;
            }
            if (pdd0Var instanceof ncd0) {
                Object objE = E((ncd0) pdd0Var, zjeVar);
                return objE == wne.f39444a ? objE : Unit.f46060a;
            }
            if (pdd0Var instanceof vcd0) {
                dafVar.K();
            } else if (pdd0Var instanceof y9d0) {
                wv10 wv10Var = wv10.SPORT;
                zrj.c(zrjVar, new ab50(4), new BonusesScreenFactoryImpl$getBonusesScreen$1(), 4);
            } else if (pdd0Var instanceof acd0) {
                zrjVar.p();
            } else if (pdd0Var instanceof xbd0) {
                r0();
            } else if (pdd0Var instanceof s9d0) {
                s9d0 s9d0Var = (s9d0) pdd0Var;
                e0(s9d0Var.f31848a, s9d0Var.b);
            } else {
                byte b = 1;
                Object[] objArr = 0;
                if (pdd0Var instanceof zbd0) {
                    daf.L(dafVar, n().N.q == kse0.SIMPLE_SCREEN, null, 2);
                } else if (pdd0Var instanceof add0) {
                    z0(pjn0.f27099a);
                } else {
                    boolean z2 = pdd0Var instanceof n9d0;
                    ani0 ani0Var = this.P;
                    if (z2) {
                        boolean z3 = ((n9d0) pdd0Var).f23134a;
                        if (!this.p.a()) {
                            boolean z4 = n().N.q == kse0.SIMPLE_SCREEN;
                            ((zte0) this.O.f6458a.b).f44955a.set(z3);
                            ani0Var.d(false);
                            zrjVar.j.b().d(new z((byte) 13, z4));
                        }
                    } else if (pdd0Var instanceof wcd0) {
                        j700 j700Var = ((wcd0) pdd0Var).f38919a;
                        wv10 wv10Var2 = wv10.SPORT;
                        zrj.c(zrjVar, new ab50(1), vjpVar.a(j700Var), 4);
                    } else if (pdd0Var instanceof tbd0) {
                        k0();
                    } else if ((pdd0Var instanceof cbd0) || (pdd0Var instanceof bbd0)) {
                        zrj.c(zrjVar, new za50(0, 7, 0L, 0L), null, 6);
                    } else {
                        if (pdd0Var instanceof xad0) {
                            Object objX = x(z, (xad0) pdd0Var, zjeVar);
                            return objX == wne.f39444a ? objX : Unit.f46060a;
                        }
                        if (pdd0Var instanceof ycd0) {
                            ycd0 ycd0Var = (ycd0) pdd0Var;
                            Object objF = F(new woj(ycd0Var.f42380a, ycd0Var.b, ycd0Var.c, ycd0Var.d, ycd0Var.e), z, zjeVar);
                            wne wneVar = wne.f39444a;
                            if (objF != wneVar) {
                                objF = Unit.f46060a;
                            }
                            return objF == wneVar ? objF : Unit.f46060a;
                        }
                        if (pdd0Var instanceof abd0) {
                            j700 j700Var2 = ((abd0) pdd0Var).f572a;
                            wv10 wv10Var3 = wv10.SPORT;
                            zrj.c(zrjVar, new ab50(1), vjpVar.a(j700Var2), 4);
                        } else {
                            if (pdd0Var instanceof j9d0) {
                                Object objO = o(((j9d0) pdd0Var).f16132a, z, zjeVar);
                                return objO == wne.f39444a ? objO : Unit.f46060a;
                            }
                            if (pdd0Var instanceof qad0) {
                                p(new jr1(avc0.f1518a), n().N.q == kse0.SIMPLE_SCREEN);
                            } else if (pdd0Var instanceof k9d0) {
                                k9d0 k9d0Var = (k9d0) pdd0Var;
                                long j = k9d0Var.f17911a;
                                boolean z5 = k9d0Var.b;
                                if (n().b.f13233a.j) {
                                    this.y.i(true);
                                    String strK = this.I.k(new lu0(0L, null, null, kotlin.collections.a.c(new g3z(0L, z ? "push" : "deeplink"))));
                                    gr00 gr00Var = this.W;
                                    ((oeg0) gr00Var.d).c().d(new sl1(gr00Var, j, z5, strK));
                                }
                            } else if (pdd0Var instanceof l9d0) {
                                r();
                            } else if (pdd0Var instanceof wbd0) {
                                String str2 = ((wbd0) pdd0Var).f38872a;
                                if (str2.length() > 0) {
                                    kd30.G(kd30Var, new bb50(false), new PaymentScreenFactoryImpl$getPaymentRedirectionScreen$1((r990) dafVar.f, str2), true, false, 18);
                                } else {
                                    zrjVar.p();
                                }
                            } else if (pdd0Var instanceof gdd0) {
                                q(z);
                            } else if (pdd0Var instanceof ead0) {
                                ead0 ead0Var = (ead0) pdd0Var;
                                zrj.c(zrjVar, new xa50(ead0Var.f7460a, ead0Var.b), null, 6);
                            } else if (pdd0Var instanceof uad0) {
                                wv10 wv10Var4 = wv10.SPORT;
                                zrj.c(zrjVar, new ab50(2), new DayExpressScreen(true), 4);
                            } else {
                                if (pdd0Var instanceof zad0) {
                                    Object objY = y((zad0) pdd0Var, zjeVar);
                                    return objY == wne.f39444a ? objY : Unit.f46060a;
                                }
                                boolean z6 = pdd0Var instanceof yad0;
                                cyu cyuVar = this.U;
                                if (z6) {
                                    yad0 yad0Var = (yad0) pdd0Var;
                                    if (n().d.b) {
                                        String str3 = yad0Var.f42290a;
                                        int i2 = str3 != null ? Integer.parseInt(str3) : 0;
                                        ((my60) this.z.f29484a.f36498a).c = i2;
                                        cyuVar.H(i2);
                                    } else {
                                        zrjVar.p();
                                    }
                                } else if (pdd0Var instanceof jbd0) {
                                    dafVar.K();
                                } else {
                                    if (pdd0Var instanceof vbd0) {
                                        vbd0 vbd0Var = (vbd0) pdd0Var;
                                        Object objQ0 = q0(new znj(vbd0Var.f37137a, vbd0Var.b), zjeVar);
                                        return objQ0 == wne.f39444a ? objQ0 : Unit.f46060a;
                                    }
                                    if (pdd0Var instanceof ccd0) {
                                        int i3 = ((ccd0) pdd0Var).f4105a;
                                        wv10 wv10Var5 = wv10.SPORT;
                                        zrj.c(zrjVar, new ab50(4), new PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1(zrjVar.l, i3, true), 4);
                                    } else if (pdd0Var instanceof mcd0) {
                                        D();
                                    } else if (pdd0Var instanceof jcd0) {
                                        zrjVar.s(((jcd0) pdd0Var).f16271a);
                                    } else if (pdd0Var instanceof kcd0) {
                                        zrjVar.j(((kcd0) pdd0Var).f18053a);
                                    } else if (pdd0Var instanceof ebd0) {
                                        zrjVar.l(((ebd0) pdd0Var).f7514a);
                                    } else {
                                        if (pdd0Var instanceof icd0) {
                                            icd0 icd0Var = (icd0) pdd0Var;
                                            Object objC = C(new joj(icd0Var.f14532a, icd0Var.b), zjeVar);
                                            return objC == wne.f39444a ? objC : Unit.f46060a;
                                        }
                                        if (pdd0Var instanceof lcd0) {
                                            zrjVar.q();
                                        } else if (pdd0Var instanceof qcd0) {
                                            dafVar.M();
                                        } else {
                                            boolean z7 = pdd0Var instanceof gbd0;
                                            vqc vqcVar2 = this.f;
                                            if (z7) {
                                                gbd0 gbd0Var = (gbd0) pdd0Var;
                                                j700 j700Var3 = gbd0Var.f11013a;
                                                Set set = gbd0Var.d;
                                                long j2 = gbd0Var.c;
                                                Set set2 = gbd0Var.e;
                                                int size = set.size();
                                                vqc vqcVar3 = this.d;
                                                if (size == 1 && ((Number) CollectionsKt.T(set)).longValue() == 40 && j2 != 0) {
                                                    Long l2 = (Long) CollectionsKt.V(set2);
                                                    if (l2 != null) {
                                                        long jLongValue = l2.longValue();
                                                        vqcVar2.k(pzb.C(new sl1((Object) gbd0Var, jLongValue, z, (byte) 6)));
                                                        cyberGamesScreenFactoryImpl$disciplineDetails$1 = new CyberGamesScreenFactoryImpl$cyberChampScreen$1(new CyberChampParams(gbd0Var.b, jLongValue, gbd0Var.c), vqcVar3);
                                                    } else {
                                                        vqcVar2.k(pzb.C(new x9((Object) gbd0Var, z, (byte) 17)));
                                                        cyberGamesScreenFactoryImpl$disciplineDetails$1 = new CyberGamesScreenFactoryImpl$disciplineDetails$1(vqcVar3, new DisciplineDetailsParams(j2, CyberGamesPage.Real.INSTANCE));
                                                    }
                                                    zrjVar.f(cyberGamesScreenFactoryImpl$disciplineDetails$1);
                                                } else {
                                                    boolean zIsEmpty = set2.isEmpty();
                                                    vjp vjpVar2 = this.e;
                                                    if (zIsEmpty) {
                                                        fragmentScreenB = !set.isEmpty() ? vjpVar2.b(j700Var3, new d8h0(3, null), gbd0Var.d, -1L, "") : vjpVar2.a(j700Var3);
                                                    } else {
                                                        Long l3 = (Long) CollectionsKt.V(set2);
                                                        if (!gbd0Var.f || l3 == null) {
                                                            m8h0 m8h0Var = new m8h0("", xun.f41520a, false);
                                                            Set set3 = gbd0Var.e;
                                                            Set set4 = set.size() == 1 ? set : null;
                                                            fragmentScreenB = vjpVar2.b(j700Var3, m8h0Var, set3, (set4 == null || (l = (Long) CollectionsKt.V(set4)) == null) ? -1L : l.longValue(), "");
                                                        } else {
                                                            CyberChampParams cyberChampParams = new CyberChampParams("", l3.longValue(), gbd0Var.c, CyberGamesPage.Real.INSTANCE.f46556a);
                                                            vqcVar2.k(pzb.C(new r91((Object) gbd0Var, (Object) l3, z, (byte) 8)));
                                                            fragmentScreenB = new CyberGamesScreenFactoryImpl$cyberChampScreen$1(cyberChampParams, vqcVar3);
                                                        }
                                                    }
                                                    wv10 wv10Var6 = wv10.SPORT;
                                                    zrj.c(zrjVar, new ab50(5), fragmentScreenB, 4);
                                                }
                                            } else if (pdd0Var instanceof cdd0) {
                                                zrjVar.u(((cdd0) pdd0Var).f4158a);
                                            } else if (pdd0Var instanceof edd0) {
                                                C0();
                                            } else {
                                                if (pdd0Var instanceof m9d0) {
                                                    m9d0 m9d0Var = (m9d0) pdd0Var;
                                                    Object objT = T(new rlj(m9d0Var.f21405a, m9d0Var.b), zjeVar);
                                                    return objT == wne.f39444a ? objT : Unit.f46060a;
                                                }
                                                if (pdd0Var instanceof gad0) {
                                                    gad0 gad0Var = (gad0) pdd0Var;
                                                    t(new imj(gad0Var.f10961a, gad0Var.b), z);
                                                } else if (pdd0Var instanceof scd0) {
                                                    zrjVar.t();
                                                } else if (pdd0Var instanceof rcd0) {
                                                    x0(new roj(((rcd0) pdd0Var).f30234a));
                                                } else if (pdd0Var instanceof pcd0) {
                                                    zrj.c(zrjVar, new ab50(0), new ResultsScreenFactoryImpl$getMainScreen$1(), 4);
                                                } else if (pdd0Var instanceof zcd0) {
                                                    Y();
                                                } else if (pdd0Var instanceof u9d0) {
                                                    s(new ylj(((u9d0) pdd0Var).f35279a));
                                                } else if (pdd0Var instanceof had0) {
                                                    had0 had0Var = (had0) pdd0Var;
                                                    h0(z, new jmj(had0Var.f12719a, had0Var.b, had0Var.c));
                                                } else {
                                                    if (pdd0Var instanceof kad0) {
                                                        kad0 kad0Var = (kad0) pdd0Var;
                                                        Object objV = v(z, new mmj(kad0Var.f17958a, kad0Var.b, kad0Var.c, kad0Var.d), zjeVar);
                                                        return objV == wne.f39444a ? objV : Unit.f46060a;
                                                    }
                                                    if (pdd0Var instanceof nad0) {
                                                        nad0 nad0Var = (nad0) pdd0Var;
                                                        int i4 = nad0Var.f23186a;
                                                        int i5 = nad0Var.b;
                                                        List list = nad0Var.c;
                                                        list.getClass();
                                                        if (i5 == 1 && i4 == 1) {
                                                            uzg uzgVar = (uzg) zrjVar.q;
                                                            uzgVar.d.k(pzb.C(new vlf((byte) 22)));
                                                            uzgVar.f36533a.c().d(new v4f(uzgVar, list, (byte) 23));
                                                        }
                                                    } else if (pdd0Var instanceof iad0) {
                                                        iad0 iad0Var = (iad0) pdd0Var;
                                                        u(new kmj(iad0Var.b, iad0Var.f14434a, iad0Var.c), z);
                                                    } else if (pdd0Var instanceof pad0) {
                                                        pad0 pad0Var = (pad0) pdd0Var;
                                                        boolean z8 = pad0Var.b;
                                                        int i6 = pad0Var.f26651a;
                                                        wv10 wv10Var7 = wv10.SPORT;
                                                        zrj.c(zrjVar, new ab50(1), new CyberGamesScreenFactoryImpl$champsListScreen$1(vqcVar, new CyberChampsMainParams(org.xplatform.cyber.section.api.domain.entity.d.d(i6), 40L, z8, iun.f15405a)), 4);
                                                    } else if (pdd0Var instanceof oad0) {
                                                        oad0 oad0Var = (oad0) pdd0Var;
                                                        long j3 = oad0Var.f24925a;
                                                        String str4 = oad0Var.b;
                                                        long j4 = oad0Var.c;
                                                        wv10 wv10Var8 = wv10.SPORT;
                                                        zrj.c(zrjVar, new ab50(1), new CyberGamesScreenFactoryImpl$teamDetailsScreen$1(vqcVar, new TeamDetailsParams(j3, j4, str4)), 4);
                                                    } else if (pdd0Var instanceof mad0) {
                                                        mad0 mad0Var = (mad0) pdd0Var;
                                                        w(mad0Var.b, mad0Var.f21453a);
                                                    } else if (pdd0Var instanceof jad0) {
                                                        zrjVar.e();
                                                    } else if (pdd0Var instanceof wad0) {
                                                        j0(((wad0) pdd0Var).f38820a);
                                                    } else if (pdd0Var instanceof fbd0) {
                                                        z();
                                                    } else if (pdd0Var instanceof bcd0) {
                                                        B();
                                                    } else if (pdd0Var instanceof ndd0) {
                                                        G(((ndd0) pdd0Var).f23335a);
                                                    } else if (pdd0Var instanceof xcd0) {
                                                        y0(new voj(((xcd0) pdd0Var).f40642a));
                                                    } else if (pdd0Var instanceof bdd0) {
                                                        A0();
                                                    } else if (pdd0Var.equals(vad0.f37080a)) {
                                                        i0();
                                                    } else if (pdd0Var instanceof ocd0) {
                                                        ani0Var.d(false);
                                                        zrjVar.g(frj.Unknown);
                                                    } else if (!(pdd0Var instanceof p9d0)) {
                                                        if (pdd0Var instanceof w9d0) {
                                                            f0();
                                                        } else if (pdd0Var instanceof qbd0) {
                                                            long j5 = ((qbd0) pdd0Var).f28442a;
                                                            if (n().d.b) {
                                                                long jA = s470.LUCKY_WHEEL.a();
                                                                oct octVar = this.g;
                                                                cyu.G(cyuVar, j5 == jA ? oct.f(octVar, j5, d270.LUCKY_WHEEL, 0, null, null, 28) : oct.f(octVar, j5, null, 0, null, null, 30));
                                                            } else {
                                                                zrjVar.p();
                                                            }
                                                        } else if (pdd0Var instanceof sbd0) {
                                                            cyuVar.I();
                                                        } else if (pdd0Var instanceof nbd0) {
                                                            p0(t270.b);
                                                        } else if (pdd0Var instanceof pbd0) {
                                                            p0(t270.d);
                                                        } else if (pdd0Var instanceof obd0) {
                                                            p0(t270.c);
                                                        } else if (pdd0Var instanceof t9d0) {
                                                            t9d0 t9d0Var = (t9d0) pdd0Var;
                                                            zrj.c(zrjVar, new bb50(false), new PromotionsNewsScreenFactoryImpl$getBetWithoutRiskScreen$1(t9d0Var.f33556a, t9d0Var.b, t9d0Var.c, t9d0Var.d), 4);
                                                        } else if (pdd0Var instanceof kbd0) {
                                                            kbd0 kbd0Var = (kbd0) pdd0Var;
                                                            zrjVar.o(new mnj(kbd0Var.c, kbd0Var.d, kbd0Var.e, kbd0Var.f18009a, kbd0Var.b));
                                                        } else if (pdd0Var instanceof lbd0) {
                                                            lbd0 lbd0Var = (lbd0) pdd0Var;
                                                            zrjVar.b(new bb50(false), new PromotionsNewsScreenFactoryImpl$getNewsPagerScreen$1(lbd0Var.c, lbd0Var.d, lbd0Var.e, lbd0Var.f != 3 ? (byte) 0 : (byte) 1, lbd0Var.f19751a), false);
                                                        } else if (pdd0Var.equals(rbd0.f30180a)) {
                                                            o0();
                                                        } else {
                                                            if (pdd0Var instanceof hdd0) {
                                                                Object objE0 = E0((hdd0) pdd0Var, zjeVar);
                                                                return objE0 == wne.f39444a ? objE0 : Unit.f46060a;
                                                            }
                                                            if (pdd0Var instanceof r9d0) {
                                                                d0(((r9d0) pdd0Var).f30074a);
                                                            } else if (pdd0Var instanceof lad0) {
                                                                vqcVar2.k(pzb.C(new z((byte) 11, z)));
                                                                zrjVar.i();
                                                            } else if (pdd0Var instanceof rad0) {
                                                                this.G.a(((rad0) pdd0Var).f30130a);
                                                            } else if (pdd0Var.equals(fdd0.f9353a)) {
                                                                B0();
                                                            } else if (pdd0Var.equals(x9d0.f40505a)) {
                                                                a(hrj.BIND_PHONE.toString());
                                                            } else if (pdd0Var.equals(v9d0.f37031a)) {
                                                                a(hrj.BIND_EMAIL.toString());
                                                            } else if (pdd0Var.equals(bad0.f2253a)) {
                                                                a(hrj.CHANGE_PASSWORD.toString());
                                                            } else if (pdd0Var.equals(fad0.f9203a)) {
                                                                a(hrj.CREATE_LOGIN.toString());
                                                            } else if (pdd0Var.equals(tad0.f33608a)) {
                                                                a(hrj.EDIT_PROFILE_DATA.toString());
                                                            } else if (pdd0Var.equals(g9d0.f10909a)) {
                                                                c0("");
                                                            } else if (pdd0Var.equals(i9d0.f14380a)) {
                                                                c0(hrj.ADD_BALANCE.toString());
                                                            } else if (pdd0Var.equals(q9d0.f28341a)) {
                                                                c0(hrj.BALANCES.toString());
                                                            } else if (pdd0Var.equals(ybd0.f42339a)) {
                                                                c0(hrj.PAYMENT_SUPPORT.toString());
                                                            } else if (pdd0Var.equals(dad0.f5742a)) {
                                                                zrjVar.k(hrj.CONTACTS.toString());
                                                            } else if (pdd0Var.equals(ddd0.f5892a)) {
                                                                zrjVar.k(hrj.TERMS.toString());
                                                            } else if (pdd0Var.equals(dbd0.f5799a)) {
                                                                zrjVar.k("");
                                                            } else if (pdd0Var.equals(ubd0.f35375a)) {
                                                                z0(pjn0.b);
                                                            } else if (pdd0Var.equals(z9d0.f44012a)) {
                                                                z0(pjn0.c);
                                                            } else if (pdd0Var.equals(sad0.c)) {
                                                                z0(pjn0.e);
                                                            } else if (pdd0Var.equals(ibd0.f14482a)) {
                                                                l0();
                                                            } else if (pdd0Var.equals(h9d0.f12670a)) {
                                                                kd30Var.F();
                                                                wv10 wv10Var9 = wv10.SPORT;
                                                                kd30Var.Q(new ab50(5), new bst0(dafVar, b));
                                                            } else if (pdd0Var.equals(dcd0.f5846a)) {
                                                                s0();
                                                            } else if (pdd0Var.equals(aad0.f519a)) {
                                                                g0();
                                                            } else if (pdd0Var.equals(hcd0.f12818a)) {
                                                                w0();
                                                            } else if (pdd0Var.equals(ecd0.f7562a)) {
                                                                t0();
                                                            } else if (pdd0Var.equals(fcd0.f9308a)) {
                                                                u0();
                                                            } else if (pdd0Var.equals(gcd0.f11055a)) {
                                                                v0();
                                                            } else if (pdd0Var.equals(cad0.f4006a)) {
                                                                dafVar.J();
                                                            } else if (pdd0Var.equals(mbd0.f21501a)) {
                                                                kd30Var.F();
                                                                wv10 wv10Var10 = wv10.SPORT;
                                                                kd30Var.Q(new ab50(4), new bst0(dafVar, objArr == true ? 1 : 0));
                                                            } else if (pdd0Var.equals(tcd0.f33715a)) {
                                                                dafVar.N();
                                                            } else if (pdd0Var.equals(ucd0.f35424a)) {
                                                                dafVar.O();
                                                            } else if (pdd0Var.equals(idd0.f14579a)) {
                                                                dafVar.P();
                                                            } else if (pdd0Var.equals(odd0.f25070a)) {
                                                                dafVar.Q();
                                                            } else if (!pdd0Var.equals(sad0.b) && !pdd0Var.equals(sad0.f31884a)) {
                                                                boolean zEquals = pdd0Var.equals(mdd0.f21592a);
                                                                wti wtiVar = this.X;
                                                                if (zEquals) {
                                                                    wtiVar.z();
                                                                } else if (pdd0Var instanceof ldd0) {
                                                                    wtiVar.y(((ldd0) pdd0Var).f19846a);
                                                                } else if (pdd0Var instanceof jdd0) {
                                                                    wtiVar.w(((jdd0) pdd0Var).f16324a);
                                                                } else {
                                                                    if (!(pdd0Var instanceof kdd0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    kdd0 kdd0Var = (kdd0) pdd0Var;
                                                                    wtiVar.x(kdd0Var.b, kdd0Var.f18101a);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:527:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d3, code lost:
    
        if (Z((a.jnj) r1, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0235, code lost:
    
        if (C((a.joj) r1, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03bd, code lost:
    
        if (a0((a.noj) r1, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0485, code lost:
    
        if (Q(r1, r2, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x057a, code lost:
    
        if (o(r1, r2, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (T((a.rlj) r1, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06d7, code lost:
    
        if (v(r2, (a.mmj) r1, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x077c, code lost:
    
        if (q0((a.znj) r1, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x07bd, code lost:
    
        if (D0((a.hpj) r1, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x07d4, code lost:
    
        if (F((a.woj) r1, r2, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x09d4, code lost:
    
        if (r0 == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
    
        if (U((a.bnj) r1, r2, r9) == r10) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b3, code lost:
    
        if (r0 == r10) goto L530;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(a.upj r32, boolean r33, a.zje r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.erj.Q(a.upj, boolean, a.zje):java.lang.Object");
    }

    public final Object R(Bundle bundle, mqj mqjVar) {
        String string = bundle.getString("CIO-Delivery-Token", "");
        string.getClass();
        String string2 = bundle.getString("CIO-Delivery-ID", "");
        if (!(n().W ? ((u760) this.r.a()).f() : true)) {
            return Unit.f46060a;
        }
        string2.getClass();
        Object objB = ((jzf) this.q.b).b(string2, string, mqjVar);
        wne wneVar = wne.f39444a;
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        return objB == wneVar ? objB : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object S(dpj dpjVar, zje zjeVar) {
        oqj oqjVar;
        cyu cyuVar = (cyu) this.K.f45137a;
        if (zjeVar instanceof oqj) {
            oqjVar = (oqj) zjeVar;
            int i = oqjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oqjVar.k = i - Integer.MIN_VALUE;
            } else {
                oqjVar = new oqj(this, zjeVar);
            }
        } else {
            oqjVar = new oqj(this, zjeVar);
        }
        Object objD = oqjVar.i;
        wne wneVar = wne.f39444a;
        int i2 = oqjVar.k;
        ol60 ol60Var = this.a0;
        if (i2 == 0) {
            z1x.P(objD);
            String str = dpjVar.b;
            boolean zA = this.p.a();
            upj upjVar = dpjVar.f6469a;
            boolean z = (upjVar instanceof noj) || (upjVar instanceof jnj);
            if (z && !zA) {
                ivp0 ivp0Var = (ivp0) cyuVar.c;
                ivp0Var.getClass();
                ivp0Var.f15457a = str;
            } else if (zA && z) {
                ivp0 ivp0Var2 = (ivp0) cyuVar.c;
                ivp0Var2.getClass();
                ivp0Var2.f15457a = str;
                ol60Var.f(cvp0.f5042a);
            } else {
                String str2 = dpjVar.c;
                oqjVar.k = 1;
                objD = this.L.f5641a.d(str2, str, oqjVar);
                if (objD == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objD);
        if (!((Boolean) objD).booleanValue()) {
            ol60Var.f(bvp0.f3289a);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6 A[LOOP:0: B:35:0x00ad->B:37:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7 A[LOOP:1: B:44:0x00ee->B:46:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[EDGE_INSN: B:50:0x00c0->B:38:0x00c0 BREAK  A[LOOP:0: B:35:0x00ad->B:37:0x00b6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101 A[EDGE_INSN: B:51:0x0101->B:47:0x0101 BREAK  A[LOOP:1: B:44:0x00ee->B:46:0x00f7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object T(rlj rljVar, zje zjeVar) {
        pqj pqjVar;
        int i;
        int i2;
        boolean z;
        i1w0 i1w0VarB;
        ListIterator listIteratorP;
        paw pawVar;
        boolean z2;
        i1w0 i1w0VarB2;
        ListIterator listIteratorP2;
        paw pawVar2;
        zrj zrjVar = this.T;
        oeg0 oeg0Var = zrjVar.j;
        if (zjeVar instanceof pqj) {
            pqjVar = (pqj) zjeVar;
            int i3 = pqjVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pqjVar.m = i3 - Integer.MIN_VALUE;
            } else {
                pqjVar = new pqj(this, zjeVar);
            }
        } else {
            pqjVar = new pqj(this, zjeVar);
        }
        Object obj = pqjVar.k;
        wne wneVar = wne.f39444a;
        int i4 = pqjVar.m;
        yje yjeVar = null;
        byte b = 1;
        if (i4 == 0) {
            z1x.P(obj);
            vs10 vs10Var = this.b.c;
            e9g e9gVar = new e9g(this, rljVar, yjeVar, (byte) 18);
            pqjVar.i = rljVar;
            pqjVar.m = 1;
            if (qjj.d0(vs10Var, e9gVar, pqjVar) != wneVar) {
            }
            return wneVar;
        }
        if (i4 == 1) {
            rljVar = pqjVar.i;
            z1x.P(obj);
        } else {
            if (i4 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = pqjVar.j;
            rljVar = pqjVar.i;
            z1x.P(obj);
        }
        if (((m2c0) obj).n0) {
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            rljVar.getClass();
            i1w0VarB2 = oeg0Var.b();
            i1w0VarB2.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            listIteratorP2 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB2, copyOnWriteArrayList, 0);
            while (true) {
                pawVar2 = (paw) listIteratorP2;
                if (pawVar2.hasNext()) {
                    break;
                }
                i1w0VarB2.a((oe50) pawVar2.next());
            }
            wv10 wv10Var = wv10.SPORT;
            zrjVar.n(new ab50(4), new xrj(zrjVar, rljVar, z2, b), false);
        } else {
            i = i2;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            i1w0VarB = oeg0Var.b();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
            listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
            while (true) {
                pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0VarB.a((oe50) pawVar.next());
            }
            wv10 wv10Var2 = wv10.SPORT;
            zrjVar.n(new ab50(4), new vrj(zrjVar, z, b), false);
        }
        return Unit.f46060a;
        i = n().N.q == kse0.SIMPLE_SCREEN ? 1 : 0;
        if (this.p.a()) {
            pqjVar.i = rljVar;
            pqjVar.j = i;
            pqjVar.m = 2;
            Object objA = this.t.a(false, pqjVar);
            if (objA != wneVar) {
                int i5 = i;
                obj = objA;
                i2 = i5;
                if (((m2c0) obj).n0) {
                    if (i2 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rljVar.getClass();
                    i1w0VarB2 = oeg0Var.b();
                    i1w0VarB2.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    listIteratorP2 = b1j.p(copyOnWriteArrayList2, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB2, copyOnWriteArrayList2, 0);
                    while (true) {
                        pawVar2 = (paw) listIteratorP2;
                        if (pawVar2.hasNext()) {
                            break;
                            break;
                        }
                        i1w0VarB2.a((oe50) pawVar2.next());
                    }
                    wv10 wv10Var3 = wv10.SPORT;
                    zrjVar.n(new ab50(4), new xrj(zrjVar, rljVar, z2, b), false);
                } else {
                    i = i2;
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i1w0VarB = oeg0Var.b();
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarB);
                    listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        pawVar = (paw) listIteratorP;
                        if (!pawVar.hasNext()) {
                            break;
                            break;
                        }
                        i1w0VarB.a((oe50) pawVar.next());
                    }
                    wv10 wv10Var4 = wv10.SPORT;
                    zrjVar.n(new ab50(4), new vrj(zrjVar, z, b), false);
                }
            }
            return wneVar;
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        i1w0VarB = oeg0Var.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0VarB);
        listIteratorP = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ3, 0);
        while (true) {
            pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                break;
                break;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
        wv10 wv10Var5 = wv10.SPORT;
        zrjVar.n(new ab50(4), new vrj(zrjVar, z, b), false);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object U(bnj bnjVar, boolean z, zje zjeVar) {
        qqj qqjVar;
        boolean z2;
        Object objB;
        bnj bnjVar2 = bnjVar;
        if (zjeVar instanceof qqj) {
            qqjVar = (qqj) zjeVar;
            int i = qqjVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qqjVar.m = i - Integer.MIN_VALUE;
            } else {
                qqjVar = new qqj(this, zjeVar);
            }
        } else {
            qqjVar = new qqj(this, zjeVar);
        }
        Object obj = qqjVar.k;
        wne wneVar = wne.f39444a;
        int i2 = qqjVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            long j = bnjVar2.c;
            qqjVar.i = bnjVar2;
            z2 = z;
            qqjVar.j = z2;
            qqjVar.m = 1;
            objB = this.J.b(j, qqjVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = qqjVar.j;
            bnj bnjVar3 = qqjVar.i;
            z1x.P(obj);
            z2 = z3;
            bnjVar2 = bnjVar3;
            objB = obj;
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        k1g k1gVar = z2 ? k1g.OPEN_FROM_PUSH : k1g.OPEN_FROM_BANNER;
        bnjVar2.getClass();
        wv10 wv10Var = wv10.SPORT;
        ab50 ab50Var = new ab50(5);
        zrj zrjVar = this.T;
        zrj.c(zrjVar, ab50Var, zrjVar.i.h(new GameScreenGeneralParams(bnjVar2.f2886a, bnjVar2.b, bnjVar2.c, bnjVar2.d, zBooleanValue, 0L, bnjVar2.e, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1gVar)), 4);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c1 A[Catch: Exception -> 0x00d8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d8, blocks: (B:41:0x00b5, B:42:0x00bb, B:44:0x00c1), top: B:83:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[LOOP:0: B:42:0x00bb->B:49:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #3 {Exception -> 0x00d5, blocks: (B:46:0x00ca, B:53:0x00de, B:55:0x00e2), top: B:85:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0132, code lost:
    
        if (m0(r16, true, r4, a.d270.UNKNOWN, r6) == r7) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r21, a.zje r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.erj.V(long, a.zje, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(d270 d270Var, zje zjeVar) throws Throwable {
        sqj sqjVar;
        if (zjeVar instanceof sqj) {
            sqjVar = (sqj) zjeVar;
            int i = sqjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqjVar.l = i - Integer.MIN_VALUE;
            } else {
                sqjVar = new sqj(this, zjeVar);
            }
        } else {
            sqjVar = new sqj(this, zjeVar);
        }
        Object objL = sqjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = sqjVar.l;
        if (i2 == 0) {
            z1x.P(objL);
            sqjVar.i = d270Var;
            sqjVar.l = 1;
            objL = this.F.L(d270Var, sqjVar);
            if (objL == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d270Var = sqjVar.i;
            z1x.P(objL);
        }
        boolean zBooleanValue = ((Boolean) objL).booleanValue();
        cyu cyuVar = this.U;
        if (zBooleanValue) {
            d270Var.getClass();
            kd30 kd30Var = (kd30) cyuVar.b;
            wv10 wv10Var = wv10.SPORT;
            kd30.G(kd30Var, new ab50(3), null, false, false, 30);
            ((oeg0) cyuVar.c).c().d(new rw40(cyuVar, d270Var, (byte) 28));
        } else {
            cyuVar.J(t270.f33203a);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(t270 t270Var, zje zjeVar) throws Throwable {
        tqj tqjVar;
        boolean z;
        if (zjeVar instanceof tqj) {
            tqjVar = (tqj) zjeVar;
            int i = tqjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqjVar.l = i - Integer.MIN_VALUE;
            } else {
                tqjVar = new tqj(this, zjeVar);
            }
        } else {
            tqjVar = new tqj(this, zjeVar);
        }
        Object objL = tqjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = tqjVar.l;
        cyu cyuVar = this.U;
        if (i2 == 0) {
            z1x.P(objL);
            int iOrdinal = t270Var.ordinal();
            if (iOrdinal == 0) {
                cyuVar.J(t270.f33203a);
            } else if (iOrdinal == 1) {
                cyuVar.J(t270.b);
            } else if (iOrdinal == 2) {
                boolean z2 = n().l.j;
                d270 d270Var = d270.CASHBACK;
                tqjVar.i = z2;
                tqjVar.l = 1;
                objL = this.F.L(d270Var, tqjVar);
                if (objL == wneVar) {
                    return wneVar;
                }
                z = z2;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                if (n().d.f27973a.d) {
                    cyuVar.J(t270.d);
                } else {
                    cyuVar.J(t270.f33203a);
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = tqjVar.i;
        z1x.P(objL);
        if (((Boolean) objL).booleanValue() && z) {
            cyuVar.J(t270.c);
        } else {
            cyuVar.J(t270.f33203a);
        }
        return Unit.f46060a;
    }

    public final void Y() {
        if (n().J) {
            ab50 ab50Var = new ab50(0);
            zrj zrjVar = this.T;
            zrj.c(zrjVar, ab50Var, zrjVar.h.a(j700.c), 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r7 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(a.jnj r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.uqj
            if (r0 == 0) goto L13
            r0 = r8
            a.uqj r0 = (a.uqj) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.uqj r0 = new a.uqj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L32
            if (r2 != r4) goto L2c
            a.z1x.P(r8)
            goto L9d
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L32:
            a.jnj r7 = r0.i
            a.z1x.P(r8)
            goto L5a
        L38:
            a.z1x.P(r8)
            int r8 = r7.b
            r6.L(r8)
            a.k9c r8 = r6.p
            boolean r8 = r8.a()
            if (r8 == 0) goto L4b
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L4b:
            a.aue0 r8 = r7.f16816a
            r0.i = r7
            r0.l = r5
            a.ytt r2 = r6.M
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L5a
            goto L9c
        L5a:
            a.bzs0 r8 = a.fzs0.f10425a
            int r7 = r7.b
            r8.getClass()
            a.c0o r8 = a.fzs0.c
            a.y2 r8 = a.ohs0.h(r8, r8)
        L67:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r8.next()
            r5 = r2
            a.fzs0 r5 = (a.fzs0) r5
            int r5 = r5.a()
            if (r5 != r7) goto L67
            goto L7c
        L7b:
            r2 = r3
        L7c:
            a.fzs0 r2 = (a.fzs0) r2
            r0.i = r3
            r0.l = r4
            a.owp0 r7 = r6.N
            java.lang.Object r7 = r7.b
            a.on4 r7 = (a.on4) r7
            a.rn4 r7 = r7.b
            java.lang.Object r7 = r7.b(r2, r0)
            a.wne r8 = a.wne.f39444a
            if (r7 != r8) goto L93
            goto L95
        L93:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L95:
            if (r7 != r8) goto L98
            goto L9a
        L98:
            kotlin.Unit r7 = kotlin.Unit.f46060a
        L9a:
            if (r7 != r1) goto L9d
        L9c:
            return r1
        L9d:
            a.ani0 r7 = r6.P
            r8 = 0
            r7.d(r8)
            a.zrj r6 = r6.T
            r6.m()
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.erj.Z(a.jnj, a.zje):java.lang.Object");
    }

    public final void a(String str) {
        daf.L(this.V, false, str, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a0(noj nojVar, zje zjeVar) {
        vqj vqjVar;
        if (zjeVar instanceof vqj) {
            vqjVar = (vqj) zjeVar;
            int i = vqjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqjVar.k = i - Integer.MIN_VALUE;
            } else {
                vqjVar = new vqj(this, zjeVar);
            }
        } else {
            vqjVar = new vqj(this, zjeVar);
        }
        Object obj = vqjVar.i;
        wne wneVar = wne.f39444a;
        int i2 = vqjVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (this.p.a()) {
                return Unit.f46060a;
            }
            aue0 aue0Var = nojVar.f23869a;
            vqjVar.k = 1;
            if (this.M.a(aue0Var, vqjVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.T.j.b().d(new x2i((byte) 18));
        return Unit.f46060a;
    }

    public final void c0(String str) {
        str.getClass();
        daf dafVar = this.V;
        kd30 kd30Var = (kd30) dafVar.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(4), new BalanceManagementScreenFactoryImpl$getScreen$1((lk5) dafVar.m, str), true, false, 18);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:809:0x0dac  */
    /* JADX WARN: Code duplicated, block: B:811:0x0db1 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [a.erj] */
    /* JADX WARN: Type inference failed for: r4v70, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v74, types: [java.util.ArrayList] */
    public final Object d(Intent intent, String str, Uri uri, zje zjeVar) throws Throwable {
        ypj ypjVar;
        pdd0 pdd0VarB;
        Intent intent2;
        String scheme;
        String lowerCase;
        Object had0Var;
        Object objB;
        Object t9d0Var;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        Long lT0;
        Long lT1;
        Long lT2;
        Integer intOrNull4;
        Long lT3;
        Long lT4;
        Long lT5;
        Integer intOrNull5;
        Long lT6;
        Long lT7;
        ?? arrayList;
        List listSplit$default;
        Integer intOrNull6;
        Integer intOrNull7;
        boolean z;
        Long lT8;
        Long lT9;
        Integer intOrNull8;
        Long lT10;
        String strE0;
        Long lC;
        Long lC2;
        String strE1;
        List listSplit$default2;
        List list;
        ndd0 ndd0Var;
        String stringExtra;
        Long lT11;
        String strE2;
        Integer intOrNull9;
        String str2;
        Long lT12;
        Long lT13;
        Integer intOrNull10;
        Long lC3;
        long jLongValue;
        Long lT14;
        String strE3;
        String strE4;
        String str3;
        sad0 sad0Var = sad0.f31884a;
        if (zjeVar instanceof ypj) {
            ypjVar = (ypj) zjeVar;
            int i = ypjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ypjVar.l = i - Integer.MIN_VALUE;
            } else {
                ypjVar = new ypj(this, zjeVar);
            }
        } else {
            ypjVar = new ypj(this, zjeVar);
        }
        Object obj = ypjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = ypjVar.l;
        Integer intOrNull11 = null;
        if (i2 == 0) {
            z1x.P(obj);
            if (intent.getAction() != null && Intrinsics.d(intent.getAction(), CommonConstant.ACTION.HWID_SCHEME_URL)) {
                if (uri == null || (scheme = uri.getScheme()) == null) {
                    intent2 = intent;
                    pdd0VarB = null;
                } else if (scheme.equals(str)) {
                    ypjVar.i = intent;
                    ypjVar.l = 1;
                    String string = uri.toString();
                    string.getClass();
                    M(string);
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments == null || (str3 = (String) CollectionsKt.firstOrNull(pathSegments)) == null) {
                        lowerCase = null;
                    } else {
                        lowerCase = str3.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    String string2 = hrj.AWARDS.toString();
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = string2.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (Intrinsics.d(lowerCase, lowerCase2)) {
                        objB = o9d0.f24875a;
                    } else if (b1j.C(hrj.LOGIN, locale, lowerCase)) {
                        int intExtra = intent.getIntExtra("AUTH_NOTIFICATION_TYPE", 0);
                        Uri data = intent.getData();
                        if (data != null && (strE4 = sj3.e0(data, "REGISTRATION_DEFAULT_BONUS_ID")) != null) {
                            intOrNull11 = StringsKt.toIntOrNull(strE4);
                        }
                        aue0.b.getClass();
                        objB = new hbd0(intExtra, cge0.h(intOrNull11));
                    } else if (b1j.C(hrj.REGISTRATION, locale, lowerCase)) {
                        Uri data2 = intent.getData();
                        if (data2 != null && (strE3 = sj3.e0(data2, "REGISTRATION_DEFAULT_BONUS_ID")) != null) {
                            intOrNull11 = StringsKt.toIntOrNull(strE3);
                        }
                        aue0.b.getClass();
                        objB = new ncd0(cge0.h(intOrNull11));
                    } else if (b1j.C(hrj.FAVORITE_EVENTS, locale, lowerCase)) {
                        kud kudVar = frj.b;
                        String queryParameter = uri.getQueryParameter(Payload.TYPE);
                        str2 = queryParameter != null ? queryParameter : "";
                        kudVar.getClass();
                        objB = new wad0(kud.d(str2));
                    } else if (b1j.C(hrj.AUTHENTICATOR, locale, lowerCase)) {
                        objB = new m9d0("", r080.f29619a);
                    } else if (b1j.C(hrj.SPORTS, locale, lowerCase)) {
                        String strE5 = sj3.e0(uri, "oppId");
                        Long lT15 = strE5 != null ? StringsKt.t0(strE5) : null;
                        if (lT15 != null) {
                            objB = new cdd0(lT15.longValue());
                        } else {
                            String strE6 = sj3.e0(uri, Payload.TYPE);
                            str2 = strE6 != null ? strE6 : "";
                            if (sj3.e0(uri, "sportid") != null) {
                                String strE7 = sj3.e0(uri, "sportid");
                                if (strE7 == null || (lT14 = StringsKt.t0(strE7)) == null) {
                                    jLongValue = 0;
                                } else {
                                    jLongValue = lT14.longValue();
                                }
                            } else if (sj3.e0(uri, ParameterNames.ID) == null || (lC3 = c(uri)) == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = lC3.longValue();
                            }
                            Set setB = cui0.b(Long.valueOf(jLongValue));
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : setB) {
                                if (((Number) obj2).longValue() != 0) {
                                    arrayList2.add(obj2);
                                }
                            }
                            had0Var = new gbd0(str2.equals("live") ? j700.b : j700.f16016a, 0, 0L, CollectionsKt.P0(arrayList2), xun.f41520a, false);
                            objB = had0Var;
                        }
                    } else if (b1j.C(hrj.STREAM, locale, lowerCase)) {
                        objB = zcd0.f44161a;
                    } else {
                        had0Var = sad0Var;
                        if (b1j.C(hrj.CHAMPS, locale, lowerCase)) {
                            String strE8 = sj3.e0(uri, Payload.TYPE);
                            str2 = strE8 != null ? strE8 : "";
                            String strE9 = sj3.e0(uri, "cybertype");
                            int iIntValue = (strE9 == null || (intOrNull10 = StringsKt.toIntOrNull(strE9)) == null) ? 0 : intOrNull10.intValue();
                            String strE10 = sj3.e0(uri, "sportid");
                            long jLongValue2 = (strE10 == null || (lT13 = StringsKt.t0(strE10)) == null) ? 0L : lT13.longValue();
                            String strE11 = sj3.e0(uri, "champid");
                            long jLongValue3 = (strE11 == null || (lT12 = StringsKt.t0(strE11)) == null) ? 0L : lT12.longValue();
                            String strE12 = sj3.e0(uri, "iscyber");
                            boolean z2 = strE12 != null ? Boolean.parseBoolean(strE12) : false;
                            Set setB2 = cui0.b(Long.valueOf(jLongValue2));
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : setB2) {
                                if (((Number) obj3).longValue() != 0) {
                                    arrayList3.add(obj3);
                                }
                            }
                            Set setP0 = CollectionsKt.P0(arrayList3);
                            Set setB3 = cui0.b(Long.valueOf(jLongValue3));
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj4 : setB3) {
                                if (((Number) obj4).longValue() != 0) {
                                    arrayList4.add(obj4);
                                }
                            }
                            had0Var = new gbd0(str2.equals("live") ? j700.b : j700.f16016a, iIntValue, intent.getLongExtra("subSportId", 0L), setP0, CollectionsKt.P0(arrayList4), z2);
                        } else if (b1j.C(hrj.GAME, locale, lowerCase)) {
                            String strE13 = sj3.e0(uri, Payload.TYPE);
                            String str4 = strE13 == null ? "" : strE13;
                            Long lC4 = c(uri);
                            long jLongValue4 = lC4 != null ? lC4.longValue() : 0L;
                            if (jLongValue4 != 0) {
                                long longExtra = intent.getLongExtra("SPORT_ID", 0L);
                                intent.removeExtra("SPORT_ID");
                                long longExtra2 = intent.getLongExtra("selected_sub_game_id", 0L);
                                intent.removeExtra("selected_sub_game_id");
                                long longExtra3 = intent.getLongExtra("subSportId", 0L);
                                intent.removeExtra("subSportId");
                                objB = new xad0(jLongValue4, longExtra2, longExtra, longExtra3, str4.equals("live"));
                            }
                        } else if (b1j.C(hrj.GAMES, locale, lowerCase)) {
                            objB = g(uri, ypjVar);
                            if (objB != wneVar) {
                                objB = (pdd0) objB;
                            }
                        } else if (b1j.C(hrj.EXPRESS, locale, lowerCase)) {
                            objB = new uad0();
                        } else if (b1j.C(hrj.PROMO, locale, lowerCase)) {
                            String strE14 = sj3.e0(uri, ParameterNames.ID);
                            objB = new ccd0((strE14 == null || (intOrNull9 = StringsKt.toIntOrNull(strE14)) == null) ? 0 : intOrNull9.intValue());
                        } else if (b1j.C(hrj.PROMO_SHOP, locale, lowerCase)) {
                            Uri data3 = intent.getData();
                            Integer intOrNull12 = (data3 == null || (strE2 = sj3.e0(data3, "REGISTRATION_DEFAULT_BONUS_ID")) == null) ? null : StringsKt.toIntOrNull(strE2);
                            String strE15 = sj3.e0(uri, "bonusGameId");
                            long jLongValue5 = (strE15 == null || (lT11 = StringsKt.t0(strE15)) == null) ? 0L : lT11.longValue();
                            aue0.b.getClass();
                            objB = new icd0(jLongValue5, cge0.h(intOrNull12));
                        } else if (b1j.C(hrj.PROMOCODES, locale, lowerCase)) {
                            objB = lcd0.f19794a;
                        } else if (b1j.C(hrj.BONUSES, locale, lowerCase)) {
                            objB = y9d0.f42240a;
                        } else if (b1j.C(hrj.USER_PROFILE, locale, lowerCase)) {
                            boolean booleanExtra = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                            intent.removeExtra("ACTIVITY_RECREATED");
                            String str5 = (booleanExtra || (stringExtra = intent.getStringExtra("PARAM_URL")) == null) ? "" : stringExtra;
                            objB = str5.length() == 0 ? jbd0.f16235a : new acd0(str5);
                        } else if (b1j.C(hrj.USER_PROFILE_LANG, locale, lowerCase)) {
                            objB = cad0.f4006a;
                        } else if (b1j.C(hrj.USER_PROFILE_ONE_CLICK_BET, locale, lowerCase)) {
                            objB = mbd0.f21501a;
                        } else if (b1j.C(hrj.USER_PROFILE_WITHDRAW, locale, lowerCase)) {
                            objB = odd0.f25070a;
                        } else if (b1j.C(hrj.USER_PROFILE_SECURITY_SETTINGS, locale, lowerCase)) {
                            objB = ucd0.f35424a;
                        } else if (b1j.C(hrj.USER_PROFILE_SECURITY_QUESTION, locale, lowerCase)) {
                            objB = tcd0.f33715a;
                        } else if (b1j.C(hrj.USER_PROFILE_TWO_FACTOR, locale, lowerCase)) {
                            objB = idd0.f14579a;
                        } else if (b1j.C(hrj.MENU, locale, lowerCase)) {
                            String strE16 = sj3.e0(uri, Payload.TYPE);
                            objB = (n().d.b && (strE16 == null ? "" : strE16).equals("xgames")) ? sbd0.f31928a : new acd0();
                        } else if (b1j.C(hrj.AGGREGATOR, locale, lowerCase)) {
                            objB = e(uri, intent);
                        } else if (b1j.C(hrj.VIRTUAL, locale, lowerCase)) {
                            String strE17 = sj3.e0(uri, "section");
                            if (Intrinsics.d(strE17, "myvirtual")) {
                                ndd0Var = new ndd0(new hr1(0L, 3));
                            } else if (Intrinsics.d(strE17, "categories")) {
                                boolean booleanExtra2 = intent.getBooleanExtra("ACTIVITY_RECREATED", false);
                                long jLongValue6 = Long.MIN_VALUE;
                                if (!booleanExtra2 && (lC2 = c(uri)) != null) {
                                    jLongValue6 = lC2.longValue();
                                }
                                long j = jLongValue6;
                                if (booleanExtra2 || (strE1 = sj3.e0(uri, "filterid")) == null || (listSplit$default2 = StringsKt__StringsKt.split$default(strE1, new String[]{Separators.COMMA}, false, 0, 6, null)) == null) {
                                    iun iunVar = iun.f15405a;
                                    list = iunVar;
                                } else {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it = listSplit$default2.iterator();
                                    while (it.hasNext()) {
                                        Long lT16 = StringsKt.t0((String) it.next());
                                        if (lT16 != null) {
                                            arrayList5.add(lT16);
                                        }
                                    }
                                    list = arrayList5;
                                }
                                q91 q91Var = intent.getBooleanExtra("IS_PUSH_NOTIFICATION", false) ? q91.c : q91.b;
                                String strE18 = sj3.e0(uri, Payload.TYPE);
                                String str6 = strE18 == null ? "" : strE18;
                                ndd0Var = new ndd0(str6.equals("subcategory") ? new fr1(new fs80(null, j, list, null, 0L, false, 121), q91Var) : str6.equals("game") ? new fr1(new fs80(null, 0L, null, null, j, false, 111), q91Var) : new fr1(null, q91Var, 1));
                            }
                            objB = ndd0Var;
                        } else if (b1j.C(hrj.AGGREGATOR_SINGLE_GAME, locale, lowerCase)) {
                            long jLongValue7 = (intent.getBooleanExtra("ACTIVITY_RECREATED", false) || (lC = c(uri)) == null) ? 0L : lC.longValue();
                            String strE19 = sj3.e0(uri, "needTransfer");
                            objB = new k9d0(strE19 != null ? Boolean.parseBoolean(strE19) : false, jLongValue7);
                        } else if (b1j.C(hrj.PAY_SYSTEMS, locale, lowerCase)) {
                            Uri data4 = intent.getData();
                            Integer intOrNull13 = (data4 == null || (strE0 = sj3.e0(data4, "REGISTRATION_DEFAULT_BONUS_ID")) == null) ? null : StringsKt.toIntOrNull(strE0);
                            String strE20 = sj3.e0(uri, "balanceId");
                            long jLongValue8 = (strE20 == null || (lT10 = StringsKt.t0(strE20)) == null) ? 0L : lT10.longValue();
                            aue0.b.getClass();
                            objB = new vbd0(jLongValue8, cge0.h(intOrNull13));
                        } else if (b1j.C(hrj.PAYMENT_CONSULTANT, locale, lowerCase)) {
                            objB = xbd0.f40597a;
                        } else if (b1j.C(hrj.TOTO, locale, lowerCase)) {
                            objB = edd0.f7611a;
                        } else if (b1j.C(hrj.COUPON, locale, lowerCase)) {
                            String strE21 = sj3.e0(uri, ParameterNames.ID);
                            objB = new ead0(strE21 == null ? "" : strE21, false);
                        } else if (b1j.C(hrj.CYBER, locale, lowerCase)) {
                            String strE22 = sj3.e0(uri, "cybertype");
                            int iIntValue2 = (strE22 == null || (intOrNull8 = StringsKt.toIntOrNull(strE22)) == null) ? 0 : intOrNull8.intValue();
                            String strE23 = sj3.e0(uri, "isEWC");
                            objB = new gad0(iIntValue2, strE23 != null ? Boolean.parseBoolean(strE23) : false);
                        } else if (b1j.C(hrj.SEARCH, locale, lowerCase)) {
                            objB = scd0.f31981a;
                        } else if (b1j.C(hrj.SCANNER, locale, lowerCase)) {
                            String queryParameter2 = uri.getQueryParameter(Payload.TYPE);
                            objB = new rcd0(queryParameter2 == null ? "" : queryParameter2);
                        } else if (b1j.C(hrj.RESULTS, locale, lowerCase)) {
                            objB = pcd0.f26755a;
                        } else if (b1j.C(hrj.OPEN_LINK, locale, lowerCase)) {
                            objB = l(uri);
                        } else {
                            if (b1j.C(hrj.CYBER_GAME, locale, lowerCase)) {
                                Long lC5 = c(uri);
                                long jLongValue9 = lC5 != null ? lC5.longValue() : 0L;
                                String strE24 = sj3.e0(uri, "sportid");
                                long jLongValue10 = (strE24 == null || (lT9 = StringsKt.t0(strE24)) == null) ? 0L : lT9.longValue();
                                String strE25 = sj3.e0(uri, "subsportid");
                                long jLongValue11 = (strE25 == null || (lT8 = StringsKt.t0(strE25)) == null) ? 0L : lT8.longValue();
                                String strE26 = sj3.e0(uri, Payload.TYPE);
                                String lowerCase3 = (strE26 == null ? "" : strE26).toLowerCase(locale);
                                lowerCase3.getClass();
                                if (lowerCase3.equals("live")) {
                                    z = true;
                                } else {
                                    lowerCase3.equals("line");
                                    z = false;
                                }
                                t9d0Var = new kad0(jLongValue9, jLongValue10, jLongValue11, z);
                            } else if (b1j.C(hrj.CYBER_GAMES, locale, lowerCase)) {
                                String strE27 = sj3.e0(uri, "cybertype");
                                int iIntValue3 = (strE27 == null || (intOrNull7 = StringsKt.toIntOrNull(strE27)) == null) ? 0 : intOrNull7.intValue();
                                String strE28 = sj3.e0(uri, "viewtype");
                                int iIntValue4 = (strE28 == null || (intOrNull6 = StringsKt.toIntOrNull(strE28)) == null) ? 0 : intOrNull6.intValue();
                                String strE29 = sj3.e0(uri, ParameterNames.ID);
                                if (strE29 == null || (listSplit$default = StringsKt__StringsKt.split$default(strE29, new String[]{Separators.COMMA}, false, 0, 6, null)) == null) {
                                    arrayList = iun.f15405a;
                                } else {
                                    arrayList = new ArrayList();
                                    Iterator it2 = listSplit$default.iterator();
                                    while (it2.hasNext()) {
                                        Long lT17 = StringsKt.t0((String) it2.next());
                                        if (lT17 != null) {
                                            arrayList.add(lT17);
                                        }
                                    }
                                }
                                objB = new nad0(iIntValue3, iIntValue4, arrayList);
                            } else if (b1j.C(hrj.CYBER_FAQ, locale, lowerCase)) {
                                objB = jad0.f16185a;
                            } else if (b1j.C(hrj.CYBER_DISCIPLINE, locale, lowerCase)) {
                                String strE30 = sj3.e0(uri, "sportid");
                                long jLongValue12 = (strE30 == null || (lT7 = StringsKt.t0(strE30)) == null) ? 0L : lT7.longValue();
                                String strE31 = sj3.e0(uri, "subsportid");
                                long jLongValue13 = (strE31 == null || (lT6 = StringsKt.t0(strE31)) == null) ? 0L : lT6.longValue();
                                String strE32 = sj3.e0(uri, "cybertype");
                                int iIntValue5 = (strE32 == null || (intOrNull5 = StringsKt.toIntOrNull(strE32)) == null) ? 0 : intOrNull5.intValue();
                                if (iIntValue5 == CyberGamesPage.Real.INSTANCE.f46556a) {
                                    jLongValue12 = jLongValue13;
                                }
                                objB = new iad0(iIntValue5, jLongValue12, false);
                            } else if (b1j.C(hrj.CYBER_TEAM_DETAILS_AND_PARTNER_TEAM, locale, lowerCase)) {
                                String strE33 = sj3.e0(uri, "subsportid");
                                long jLongValue14 = (strE33 == null || (lT5 = StringsKt.t0(strE33)) == null) ? 0L : lT5.longValue();
                                String strE34 = sj3.e0(uri, "team_name");
                                String str7 = strE34 == null ? "" : strE34;
                                String strE35 = sj3.e0(uri, "feedid");
                                long jLongValue15 = (strE35 == null || (lT4 = StringsKt.t0(strE35)) == null) ? 0L : lT4.longValue();
                                objB = (jLongValue14 == 0 || jLongValue15 == 0) ? new mad0(str7, jLongValue15) : new oad0(jLongValue14, jLongValue15, str7);
                            } else if (b1j.C(hrj.CYBER_PARTNER_TEAM, locale, lowerCase)) {
                                String strE36 = sj3.e0(uri, "team_name");
                                if (strE36 == null) {
                                    strE36 = "";
                                }
                                String strE37 = sj3.e0(uri, "feedid");
                                objB = new mad0(strE36, (strE37 == null || (lT3 = StringsKt.t0(strE37)) == null) ? 0L : lT3.longValue());
                            } else if (b1j.C(hrj.CYBER_RANDOM_DISCIPLINE, locale, lowerCase)) {
                                objB = f(ypjVar);
                                if (objB != wneVar) {
                                    objB = (pdd0) objB;
                                }
                            } else if (b1j.C(hrj.CYBER_CHAMP, locale, lowerCase)) {
                                String strE38 = sj3.e0(uri, "cybertype");
                                int iIntValue6 = (strE38 == null || (intOrNull4 = StringsKt.toIntOrNull(strE38)) == null) ? 0 : intOrNull4.intValue();
                                String strE39 = sj3.e0(uri, "champid");
                                long jLongValue16 = (strE39 == null || (lT2 = StringsKt.t0(strE39)) == null) ? 0L : lT2.longValue();
                                String strE40 = sj3.e0(uri, "sportid");
                                long jLongValue17 = (strE40 == null || (lT1 = StringsKt.t0(strE40)) == null) ? 0L : lT1.longValue();
                                String strE41 = sj3.e0(uri, "subsportid");
                                had0Var = new had0(iIntValue6, jLongValue16, iIntValue6 == CyberGamesPage.Real.INSTANCE.f46556a ? (strE41 == null || (lT0 = StringsKt.t0(strE41)) == null) ? 0L : lT0.longValue() : jLongValue17);
                            } else if (b1j.C(hrj.CYBER_TOP_CHAMPS, locale, lowerCase)) {
                                String strE42 = sj3.e0(uri, "cybertype");
                                int iIntValue7 = (strE42 == null || (intOrNull3 = StringsKt.toIntOrNull(strE42)) == null) ? 0 : intOrNull3.intValue();
                                String strE43 = sj3.e0(uri, "islive");
                                objB = new pad0(iIntValue7, strE43 != null ? Boolean.parseBoolean(strE43) : false);
                            } else if (b1j.C(hrj.EDIT_PROFILE, locale, lowerCase)) {
                                objB = zbd0.f44110a;
                            } else if (b1j.C(hrj.SUPPORT, locale, lowerCase)) {
                                objB = add0.f674a;
                            } else if (b1j.C(hrj.HLTV_AWARDS, locale, lowerCase)) {
                                String strE44 = sj3.e0(uri, "cybertype");
                                objB = new lad0((strE44 == null || (intOrNull2 = StringsKt.toIntOrNull(strE44)) == null) ? 0 : intOrNull2.intValue());
                            } else if (b1j.C(hrj.JACKPOT_TOTO, locale, lowerCase)) {
                                objB = fbd0.f9252a;
                            } else if (b1j.C(hrj.PRIVATE_MESSAGES, locale, lowerCase)) {
                                objB = bcd0.f2353a;
                            } else {
                                String string3 = hrj.POPULAR.toString();
                                Locale locale2 = Locale.ROOT;
                                String lowerCase4 = string3.toLowerCase(locale2);
                                lowerCase4.getClass();
                                if (Intrinsics.d(lowerCase, lowerCase4)) {
                                    objB = new acd0();
                                } else if (b1j.C(hrj.GLOBAL_CHAMP, locale2, lowerCase)) {
                                    String strE45 = sj3.e0(uri, ParameterNames.ID);
                                    objB = new xcd0((strE45 == null || (intOrNull = StringsKt.toIntOrNull(strE45)) == null) ? 0 : intOrNull.intValue());
                                } else if (b1j.C(hrj.SWIPE, locale2, lowerCase)) {
                                    objB = bdd0.f2394a;
                                } else if (b1j.C(hrj.FAST_GAMES, locale2, lowerCase)) {
                                    objB = vad0.f37080a;
                                } else if (b1j.C(hrj.BET_ON_YOUR_NATIONAL_TEAM, locale2, lowerCase)) {
                                    String strE46 = sj3.e0(uri, Payload.TYPE);
                                    objB = new u9d0(strE46 == null ? "" : strE46);
                                } else if (b1j.C(hrj.REFERRAL_PROGRAM, locale2, lowerCase)) {
                                    objB = mcd0.f21547a;
                                } else if (b1j.C(hrj.BIND_NUMBER, locale2, lowerCase)) {
                                    objB = w9d0.f38775a;
                                } else if (b1j.C(hrj.BIND_PHONE, locale2, lowerCase)) {
                                    objB = x9d0.f40505a;
                                } else if (b1j.C(hrj.B2B_CONFIG, locale2, lowerCase)) {
                                    String strE47 = sj3.e0(uri, "configkey");
                                    objB = new p9d0((strE47 == null ? "" : strE47).length() > 0);
                                } else if (b1j.C(hrj.PROMOTION, locale2, lowerCase)) {
                                    objB = m(uri);
                                } else if (b1j.C(hrj.BANNER, locale2, lowerCase)) {
                                    String strE48 = sj3.e0(uri, ParameterNames.ID);
                                    objB = new r9d0(Integer.parseInt(strE48 == null ? "" : strE48));
                                } else if (b1j.C(hrj.EDIT_PROFILE_DATA, locale2, lowerCase)) {
                                    objB = tad0.f33608a;
                                } else if (b1j.C(hrj.CREATE_LOGIN, locale2, lowerCase)) {
                                    objB = fad0.f9203a;
                                } else if (b1j.C(hrj.BIND_EMAIL, locale2, lowerCase)) {
                                    objB = v9d0.f37031a;
                                } else if (b1j.C(hrj.CHANGE_PASSWORD, locale2, lowerCase)) {
                                    objB = bad0.f2253a;
                                } else if (b1j.C(hrj.SUPPORT_CHAT, locale2, lowerCase)) {
                                    objB = sad0.c;
                                } else if (b1j.C(hrj.CALL_BACK, locale2, lowerCase)) {
                                    objB = z9d0.f44012a;
                                } else if (b1j.C(hrj.ONLINE_CALL, locale2, lowerCase)) {
                                    objB = ubd0.f35375a;
                                } else if (b1j.C(hrj.PAYMENT_SUPPORT, locale2, lowerCase)) {
                                    objB = ybd0.f42339a;
                                } else if (b1j.C(hrj.BALANCES, locale2, lowerCase)) {
                                    objB = q9d0.f28341a;
                                } else if (b1j.C(hrj.ADD_BALANCE, locale2, lowerCase)) {
                                    objB = i9d0.f14380a;
                                } else if (b1j.C(hrj.CONTACTS, locale2, lowerCase)) {
                                    objB = dad0.f5742a;
                                } else if (b1j.C(hrj.TERMS, locale2, lowerCase)) {
                                    objB = ddd0.f5892a;
                                } else if (b1j.C(hrj.INFO, locale2, lowerCase)) {
                                    objB = dbd0.f5799a;
                                } else if (b1j.C(hrj.ACCOUNT, locale2, lowerCase)) {
                                    objB = g9d0.f10909a;
                                } else if (b1j.C(hrj.LOTTO, locale2, lowerCase)) {
                                    objB = ibd0.f14482a;
                                } else if (b1j.C(hrj.ACCOUNT_SELECTION, locale2, lowerCase)) {
                                    objB = h9d0.f12670a;
                                } else if (b1j.C(hrj.PROMOPAGE, locale2, lowerCase)) {
                                    objB = dcd0.f5846a;
                                } else if (b1j.C(hrj.CHAMPIONS_CLUB, locale2, lowerCase)) {
                                    objB = aad0.f519a;
                                } else if (b1j.C(hrj.PROMOPAGE_BONUS_GAMES, locale2, lowerCase)) {
                                    objB = ecd0.f7562a;
                                } else if (b1j.C(hrj.PROMOPAGE_CHOOSE_BONUS, locale2, lowerCase)) {
                                    objB = hcd0.f12818a;
                                } else if (b1j.C(hrj.PROMOPAGE_CHOICE_CASHBACK, locale2, lowerCase)) {
                                    objB = fcd0.f9308a;
                                } else if (b1j.C(hrj.PROMOPAGE_CHOICE_VIP_CASHBACK, locale2, lowerCase)) {
                                    objB = gcd0.f11055a;
                                } else if (b1j.C(hrj.HISTORY, locale2, lowerCase)) {
                                    objB = bbd0.f2304a;
                                } else if (b1j.C(hrj.GET_COUPON, locale2, lowerCase)) {
                                    String strE49 = sj3.e0(uri, ParameterNames.ID);
                                    objB = new ead0(strE49 == null ? "" : strE49, true);
                                } else {
                                    String lowerCase5 = "AGGREGATOR_TV_BET_JACKPOT".toLowerCase(locale2);
                                    lowerCase5.getClass();
                                    if (Intrinsics.d(lowerCase, lowerCase5)) {
                                        String strE50 = sj3.e0(uri, "PARAMETER_KEY_FROM_AGGREGATOR");
                                        boolean z3 = strE50 != null ? Boolean.parseBoolean(strE50) : false;
                                        String strE51 = sj3.e0(uri, "PARAMETER_KEY_SHOW_NAV_BAR");
                                        boolean z4 = strE51 != null ? Boolean.parseBoolean(strE51) : true;
                                        String strE52 = sj3.e0(uri, "PARAMETER_KEY_BANNER_IMAGE_URL");
                                        if (strE52 == null) {
                                            strE52 = "";
                                        }
                                        String strE53 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TRANSLATE_ID");
                                        objB = new hdd0(strE52, strE53 == null ? "" : strE53, z3, z4);
                                    } else {
                                        String lowerCase6 = "BET_WITHOUT_RISK".toLowerCase(locale2);
                                        lowerCase6.getClass();
                                        if (Intrinsics.d(lowerCase, lowerCase6)) {
                                            String strE54 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TITLE");
                                            String str8 = strE54 == null ? "" : strE54;
                                            String strE55 = sj3.e0(uri, "PARAMETER_KEY_BANNER_TRANSLATE_ID");
                                            String str9 = strE55 == null ? "" : strE55;
                                            String strE56 = sj3.e0(uri, "PARAMETER_KEY_BANNER_LOTTERY_ID");
                                            int i3 = strE56 != null ? Integer.parseInt(strE56) : 0;
                                            String strE57 = sj3.e0(uri, "PARAMETER_KEY_BANNER_IMAGE_URL");
                                            String str10 = strE57 == null ? "" : strE57;
                                            String strE58 = sj3.e0(uri, "PARAMETER_KEY_NEED_AUTH");
                                            t9d0Var = new t9d0(i3, str8, str9, str10, strE58 != null ? Boolean.parseBoolean(strE58) : true);
                                        } else {
                                            String lowerCase7 = "NEWS_MAIN".toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (Intrinsics.d(lowerCase, lowerCase7)) {
                                                objB = h(uri);
                                            } else {
                                                String lowerCase8 = "NEWS_PAGER".toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (Intrinsics.d(lowerCase, lowerCase8)) {
                                                    objB = i(uri);
                                                } else {
                                                    String lowerCase9 = "ONE_X_GAMES_BONUSES".toLowerCase(locale2);
                                                    lowerCase9.getClass();
                                                    if (Intrinsics.d(lowerCase, lowerCase9)) {
                                                        objB = nbd0.f23234a;
                                                    } else {
                                                        String lowerCase10 = "ONE_X_GAMES_JACKPOT".toLowerCase(locale2);
                                                        lowerCase10.getClass();
                                                        if (Intrinsics.d(lowerCase, lowerCase10)) {
                                                            objB = k(ypjVar);
                                                            if (objB != wne.f39444a) {
                                                                objB = (pdd0) objB;
                                                            }
                                                        } else {
                                                            String lowerCase11 = "ONE_X_GAMES_GAME".toLowerCase(locale2);
                                                            lowerCase11.getClass();
                                                            if (Intrinsics.d(lowerCase, lowerCase11)) {
                                                                objB = j(uri, ypjVar);
                                                                if (objB != wne.f39444a) {
                                                                    objB = (pdd0) objB;
                                                                }
                                                            } else if (Intrinsics.d(lowerCase, hrj.TRANSITION_TG_BOT.toString())) {
                                                                objB = fdd0.f9353a;
                                                            } else if (b1j.C(hrj.UFC_MAIN, locale2, lowerCase)) {
                                                                objB = mdd0.f21592a;
                                                            } else if (b1j.C(hrj.UFC_FIGHTER, locale2, lowerCase)) {
                                                                Long lC6 = c(uri);
                                                                objB = new ldd0(lC6 != null ? lC6.longValue() : 0L);
                                                            } else if (b1j.C(hrj.UFC_CHAMP, locale2, lowerCase)) {
                                                                Long lC7 = c(uri);
                                                                objB = new jdd0(lC7 != null ? lC7.longValue() : 0L);
                                                            } else if (b1j.C(hrj.UFC_FIGHT, locale2, lowerCase)) {
                                                                Long lC8 = c(uri);
                                                                objB = new kdd0(kotlin.text.c.o("live", uri.getQueryParameter(Payload.TYPE)), lC8 != null ? lC8.longValue() : 0L);
                                                            } else {
                                                                objB = blx.b(intent);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            objB = t9d0Var;
                        }
                        objB = had0Var;
                    }
                    if (objB == wneVar) {
                        return wneVar;
                    }
                    intent2 = intent;
                    obj = objB;
                } else if (scheme.equals("https")) {
                    List<String> pathSegments2 = uri.getPathSegments();
                    int size = pathSegments2.size();
                    if (size == 2) {
                        j700 j700Var = Intrinsics.d(pathSegments2.get(0), "live") ? j700.b : j700.f16016a;
                        xun xunVar = xun.f41520a;
                        pdd0VarB = new gbd0(j700Var, 0, 0L, xunVar, xunVar, false);
                    } else if (size == 3) {
                        String str11 = pathSegments2.get(2);
                        str11.getClass();
                        long jB = b(str11);
                        boolean zD = Intrinsics.d(pathSegments2.get(0), "live");
                        Set setB4 = cui0.b(Long.valueOf(jB));
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : setB4) {
                            if (((Number) obj5).longValue() != 0) {
                                arrayList6.add(obj5);
                            }
                        }
                        pdd0VarB = new gbd0(zD ? j700.b : j700.f16016a, 0, 0L, xun.f41520a, CollectionsKt.P0(arrayList6), false);
                    } else if (size != 4) {
                        pdd0VarB = null;
                    } else {
                        String str12 = pathSegments2.get(3);
                        str12.getClass();
                        pdd0VarB = new xad0(b(str12), 0L, 0L, 0L, Intrinsics.d(pathSegments2.get(0), "live"));
                    }
                } else {
                    pdd0VarB = blx.b(intent);
                }
                if (pdd0VarB == null) {
                    return blx.b(intent2);
                }
                return pdd0VarB;
            }
            pdd0VarB = blx.b(intent);
            intent2 = intent;
            if (pdd0VarB == null) {
                return blx.b(intent2);
            }
            return pdd0VarB;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        intent2 = ypjVar.i;
        z1x.P(obj);
        pdd0VarB = (pdd0) obj;
        if (pdd0VarB == null) {
            return blx.b(intent2);
        }
        return pdd0VarB;
    }

    public final void d0(int i) {
        boolean z = n().O0;
        zrj zrjVar = this.T;
        if (!z) {
            zrjVar.p();
        } else {
            zrj.c(zrjVar, new bb50(false), new PromotionsNewsScreenFactoryImpl$getCmsBannerScreen$1(i, true), 4);
        }
    }

    public final void e0(long j, long j2) {
        ((m0w) this.A.f18667a.g).h = j;
        ((t47) this.R.f13444a.e).d = j;
        zrj.c(this.T, new za50(0, 1, j, j2), null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zje zjeVar) throws Throwable {
        zpj zpjVar;
        if (zjeVar instanceof zpj) {
            zpjVar = (zpj) zjeVar;
            int i = zpjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zpjVar.k = i - Integer.MIN_VALUE;
            } else {
                zpjVar = new zpj(this, zjeVar);
            }
        } else {
            zpjVar = new zpj(this, zjeVar);
        }
        Object objJ = zpjVar.i;
        wne wneVar = wne.f39444a;
        int i2 = zpjVar.k;
        if (i2 == 0) {
            z1x.P(objJ);
            zpjVar.k = 1;
            objJ = this.D.j(zpjVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        cmg cmgVar = (cmg) objJ;
        return new iad0(CyberGamesPage.Virtual.INSTANCE.f46556a, cmgVar != null ? cmgVar.f4602a : 0L, true);
    }

    public final void f0() {
        kd30 kd30Var = (kd30) this.V.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(4), new BindPhoneNumberScreen(new i38(0)), true, false, 18);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x017c  */
    /* JADX WARN: Code duplicated, block: B:106:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x0180  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[PHI: r11
  0x0065: PHI (r11v17 java.lang.Integer) = (r11v7 java.lang.Integer), (r11v19 java.lang.Integer) binds: [B:27:0x0078, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x0157  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
    
        if (r11 == r2) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.net.Uri r10, a.zje r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.erj.g(android.net.Uri, a.zje):java.lang.Object");
    }

    public final void g0() {
        if (!n().l.y) {
            return;
        }
        zuc0 zuc0Var = n().V0;
        zrj zrjVar = this.T;
        i1w0 i1w0VarC = zrjVar.j.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                wv10 wv10Var = wv10.SPORT;
                zrjVar.n(new ab50(4), new wrj(zrjVar, zuc0Var, b), false);
                return;
            }
            i1w0VarC.a((oe50) pawVar.next());
        }
    }

    public final void h0(boolean z, jmj jmjVar) {
        boolean zContains = n().c.p.contains(Long.valueOf(jmjVar.f16768a));
        zrj zrjVar = this.T;
        if (zContains) {
            zrjVar.i();
            return;
        }
        this.f.k(pzb.C(new x9((Object) jmjVar, z, (byte) 16)));
        wv10 wv10Var = wv10.SPORT;
        zrj.c(zrjVar, new ab50(1), new CyberGamesScreenFactoryImpl$cyberChampScreen$1(new CyberChampParams(jmjVar.c, jmjVar.f16768a, jmjVar.b), zrjVar.k), 4);
    }

    public final void i0() {
        if (n().I) {
            wv10 wv10Var = wv10.SPORT;
            zrj.c(this.T, new ab50(1), new FastGamesScreenFactoryImpl$provideFastGamesScreen$1(), 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Uri uri, zje zjeVar) throws Throwable {
        bqj bqjVar;
        long j;
        long j2;
        if (zjeVar instanceof bqj) {
            bqjVar = (bqj) zjeVar;
            int i = bqjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bqjVar.l = i - Integer.MIN_VALUE;
            } else {
                bqjVar = new bqj(this, zjeVar);
            }
        } else {
            bqjVar = new bqj(this, zjeVar);
        }
        Object obj = bqjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = bqjVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            String strE0 = sj3.e0(uri, "PARAMETER_KEY_GAME_ID");
            j = strE0 != null ? Long.parseLong(strE0) : 0L;
            if (j == 311) {
                d270 d270Var = d270.LUCKY_WHEEL;
                bqjVar.i = j;
                bqjVar.l = 1;
                Object objL = this.F.L(d270Var, bqjVar);
                if (objL == wneVar) {
                    return wneVar;
                }
                obj = objL;
                j2 = j;
            }
            return new qbd0(j);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = bqjVar.i;
        z1x.P(obj);
        if (!((Boolean) obj).booleanValue()) {
            return new yad0(null);
        }
        j = j2;
        return new qbd0(j);
    }

    public final void j0(frj frjVar) {
        ygp ygpVar = ygp.o;
        r9u r9uVar = this.E;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        vcp vcpVar = n().g.B;
        gr00 gr00Var = this.W;
        cyu cyuVar = this.U;
        zrj zrjVar = this.T;
        if (!zD) {
            int iOrdinal = frjVar.ordinal();
            if (iOrdinal == 0) {
                cyuVar.J(t270.d);
                return;
            } else if (iOrdinal != 1) {
                zrjVar.g(frjVar);
                return;
            } else {
                gr00Var.A(new gr1(), false);
                return;
            }
        }
        int iOrdinal2 = vcpVar.ordinal();
        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
            zrjVar.g(frjVar);
            return;
        }
        int iOrdinal3 = frjVar.ordinal();
        if (iOrdinal3 == 0) {
            cyuVar.J(t270.d);
        } else if (iOrdinal3 != 1) {
            zrjVar.g(frjVar);
        } else {
            gr00Var.A(new gr1(), false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(zje zjeVar) throws Throwable {
        cqj cqjVar;
        if (zjeVar instanceof cqj) {
            cqjVar = (cqj) zjeVar;
            int i = cqjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqjVar.k = i - Integer.MIN_VALUE;
            } else {
                cqjVar = new cqj(this, zjeVar);
            }
        } else {
            cqjVar = new cqj(this, zjeVar);
        }
        Object objL = cqjVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cqjVar.k;
        if (i2 == 0) {
            z1x.P(objL);
            d270 d270Var = d270.JACKPOT;
            cqjVar.k = 1;
            objL = this.F.L(d270Var, cqjVar);
            if (objL == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objL);
        }
        return ((Boolean) objL).booleanValue() ? rbd0.f30180a : new yad0(null);
    }

    public final void k0() {
        cyu cyuVar = this.U;
        kd30 kd30Var = (kd30) cyuVar.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(3), oct.f((oct) cyuVar.f5196a, 0L, null, 0, null, null, 31), false, false, 24);
    }

    public final pdd0 l(Uri uri) {
        String strE0 = sj3.e0(uri, Payload.TYPE);
        if (strE0 == null) {
            strE0 = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = strE0.toLowerCase(locale);
        lowerCase.getClass();
        String strE1 = sj3.e0(uri, "subtype");
        String lowerCase2 = (strE1 != null ? strE1 : "").toLowerCase(locale);
        lowerCase2.getClass();
        String string = uri.toString();
        string.getClass();
        String strM0 = StringsKt.m0(string, "url=", string);
        if (lowerCase.equals("internal")) {
            return new ebd0(strM0);
        }
        if (!lowerCase.equals("iframe")) {
            return sad0.f31884a;
        }
        if (n().f1) {
            return m(uri);
        }
        return lowerCase2.equals("casinopromo") ? new kcd0(strM0) : new jcd0(strM0);
    }

    public final void l0() {
        boolean z = n().D1;
        zrj zrjVar = this.T;
        if (!z) {
            zrjVar.p();
            return;
        }
        i1w0 i1w0VarB = zrjVar.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                wv10 wv10Var = wv10.SPORT;
                zrjVar.n(new ab50(4), new qrj(zrjVar, (byte) 1), false);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final pdd0 m(Uri uri) {
        if (!n().f1) {
            return l(uri);
        }
        String strE0 = sj3.e0(uri, Payload.TYPE);
        if (strE0 == null) {
            strE0 = "";
        }
        String strE1 = sj3.e0(uri, ParameterNames.ID);
        if (strE1 == null) {
            strE1 = "";
        }
        String strE2 = sj3.e0(uri, RemoteMessageConst.Notification.URL);
        String strM0 = strE2 != null ? strE2 : "";
        if (kotlin.text.c.x(strM0, Separators.SLASH, false) && strE0.equals("iframecasino")) {
            strM0 = StringsKt.m0(strM0, Separators.SLASH, strM0);
        }
        int iHashCode = strE0.hashCode();
        if (iHashCode != -1191214428) {
            if (iHashCode != -1052618729) {
                if (iHashCode == 969966489 && strE0.equals("iframecasino")) {
                    return new kcd0(strM0);
                }
            } else if (strE0.equals("native")) {
                return new ccd0(Integer.parseInt(strE1));
            }
        } else if (strE0.equals("iframe")) {
            return new jcd0(strM0);
        }
        return sad0.f31884a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object m0(long j, boolean z, boolean z2, d270 d270Var, zje zjeVar) {
        wqj wqjVar;
        boolean z3;
        long j2;
        String str;
        boolean z4;
        d270 d270Var2;
        if (zjeVar instanceof wqj) {
            wqjVar = (wqj) zjeVar;
            int i = wqjVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                wqjVar.p = i - Integer.MIN_VALUE;
            } else {
                wqjVar = new wqj(this, zjeVar);
            }
        } else {
            wqjVar = new wqj(this, zjeVar);
        }
        Object obj = wqjVar.n;
        wne wneVar = wne.f39444a;
        int i2 = wqjVar.p;
        if (i2 == 0) {
            z1x.P(obj);
            String string = UUID.randomUUID().toString();
            string.getClass();
            wqjVar.l = d270Var;
            wqjVar.m = string;
            wqjVar.i = j;
            wqjVar.j = z;
            wqjVar.k = z2;
            wqjVar.p = 1;
            if (this.H.a(j, wqjVar) == wneVar) {
                return wneVar;
            }
            z3 = z;
            j2 = j;
            str = string;
            z4 = z2;
            d270Var2 = d270Var;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = wqjVar.k;
            z3 = wqjVar.j;
            long j3 = wqjVar.i;
            String str2 = wqjVar.m;
            d270 d270Var3 = wqjVar.l;
            z1x.P(obj);
            d270Var2 = d270Var3;
            str = str2;
            j2 = j3;
        }
        d270Var2.getClass();
        str.getClass();
        cyu cyuVar = this.U;
        ((oeg0) cyuVar.c).b().d(new cj(z3, (FragmentScreen) oct.f((oct) cyuVar.f5196a, j2, d270Var2, 0, null, str, 12), z4, (byte) 6));
        return Unit.f46060a;
    }

    public final sff0 n() {
        return (sff0) this.Y.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n0(zad0 zad0Var, zje zjeVar) {
        xqj xqjVar;
        String str;
        if (zjeVar instanceof xqj) {
            xqjVar = (xqj) zjeVar;
            int i = xqjVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xqjVar.m = i - Integer.MIN_VALUE;
            } else {
                xqjVar = new xqj(this, zjeVar);
            }
        } else {
            xqjVar = new xqj(this, zjeVar);
        }
        Object obj = xqjVar.k;
        wne wneVar = wne.f39444a;
        int i2 = xqjVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            if (n().d.b) {
                String strG = axq.g();
                long j = zad0Var.f44061a;
                xqjVar.i = zad0Var;
                xqjVar.j = strG;
                xqjVar.m = 1;
                if (this.H.a(j, xqjVar) == wneVar) {
                    return wneVar;
                }
                str = strG;
            } else {
                this.T.p();
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str2 = xqjVar.j;
        zad0 zad0Var2 = xqjVar.i;
        z1x.P(obj);
        str = str2;
        zad0Var = zad0Var2;
        cyu.G(this.U, oct.f(this.g, zad0Var.f44061a, zad0Var.b, 0, null, str, 12));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(lr1 lr1Var, boolean z, zje zjeVar) {
        dqj dqjVar;
        lr1 lr1Var2;
        boolean z2;
        if (zjeVar instanceof dqj) {
            dqjVar = (dqj) zjeVar;
            int i = dqjVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqjVar.n = i - Integer.MIN_VALUE;
            } else {
                dqjVar = new dqj(this, zjeVar);
            }
        } else {
            dqjVar = new dqj(this, zjeVar);
        }
        Object obj = dqjVar.l;
        wne wneVar = wne.f39444a;
        int i2 = dqjVar.n;
        if (i2 == 0) {
            z1x.P(obj);
            this.y.i(true);
            boolean zA = this.p.a();
            if (!n().b.b) {
                return Unit.f46060a;
            }
            dqjVar.i = lr1Var;
            dqjVar.j = z;
            dqjVar.k = zA;
            dqjVar.n = 1;
            Object objE = this.u.E(dqjVar);
            if (objE == wneVar) {
                return wneVar;
            }
            lr1Var2 = lr1Var;
            z2 = zA;
            obj = objE;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = dqjVar.k;
            z = dqjVar.j;
            lr1Var2 = dqjVar.i;
            z1x.P(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.Z.o(null, wpe.b);
            return Unit.f46060a;
        }
        if (!z && !z2 && (lr1Var2 instanceof fr1) && ((fr1) lr1Var2).c.e != 0) {
            b0(this, lr1Var2, false, 4);
        } else if (!z && !z2 && (lr1Var2 instanceof hr1) && ((hr1) lr1Var2).c != -10) {
            b0(this, lr1Var2, false, 4);
        } else if (!(lr1Var2 instanceof jr1) || !(((jr1) lr1Var2).c instanceof evc0)) {
            tm1 tm1Var = lr1Var2.b;
            if (tm1Var instanceof jm1) {
                p(lr1Var2, false);
            } else if (tm1Var instanceof fm1) {
                if (!(lr1Var2 instanceof hr1) || ((hr1) lr1Var2).c != -10) {
                    b0(this, lr1Var2, false, 6);
                } else if (n().l.n) {
                    b0(this, lr1Var2, true, 4);
                }
            } else if (tm1Var instanceof zl1) {
                b0(this, lr1Var2, false, 4);
            } else {
                b0(this, lr1Var2, false, 4);
            }
        } else if (n().b.f13233a.c) {
            b0(this, lr1Var2, false, 4);
        }
        return Unit.f46060a;
    }

    public final void o0() {
        if (n().d.b) {
            byte b = 0;
            boolean z = true;
            boolean z2 = n().N.q == kse0.SIMPLE_SCREEN;
            cyu cyuVar = this.U;
            kd30 kd30Var = (kd30) cyuVar.b;
            wv10 wv10Var = wv10.SPORT;
            ab50 ab50Var = new ab50(3);
            FragmentScreen fragmentScreenD = ((oct) cyuVar.f5196a).d();
            kd30Var.F();
            kd30Var.Q(ab50Var, new kf50(fragmentScreenD, z, z2, b));
        }
    }

    public final void p(lr1 lr1Var, boolean z) {
        if (n().b.f13233a.d) {
            boolean z2 = lr1Var instanceof jr1;
            if (z2 && (((jr1) lr1Var).c instanceof evc0)) {
                if (n().b.f13233a.c) {
                    b0(this, lr1Var, z, 4);
                }
            } else if (z2 && (((jr1) lr1Var).c instanceof cvc0)) {
                b0(this, lr1Var, z, 4);
            } else {
                b0(this, lr1Var, z, 4);
            }
        }
    }

    public final void p0(t270 t270Var) {
        if (!n().d.b) {
            this.T.p();
            return;
        }
        wv10 wv10Var = wv10.SPORT;
        this.Q.h(new ab50(3));
        this.U.J(t270Var);
    }

    public final void q(boolean z) {
        if (n().b.b) {
            gr00 gr00Var = this.W;
            kd30 kd30Var = (kd30) gr00Var.f11760a;
            wv10 wv10Var = wv10.SPORT;
            kd30.G(kd30Var, new ab50(2), ((h7i) ((fvt0) gr00Var.c).f10231a).d().q(new fr1(new fs80(null, nw80.i.getId(), null, null, 0L, false, 125), z ? q91.c : q91.b)), false, false, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q0(znj znjVar, zje zjeVar) {
        yqj yqjVar;
        if (zjeVar instanceof yqj) {
            yqjVar = (yqj) zjeVar;
            int i = yqjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqjVar.l = i - Integer.MIN_VALUE;
            } else {
                yqjVar = new yqj(this, zjeVar);
            }
        } else {
            yqjVar = new yqj(this, zjeVar);
        }
        Object obj = yqjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = yqjVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            aue0 aue0Var = znjVar.b;
            yqjVar.i = znjVar;
            yqjVar.l = 1;
            if (this.M.a(aue0Var, yqjVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            znjVar = yqjVar.i;
            z1x.P(obj);
        }
        boolean zA = this.p.a();
        znjVar.getClass();
        daf dafVar = this.V;
        i1w0 i1w0VarB = ((oeg0) dafVar.h).b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                ((ouu) dafVar.l).s().d(new lrc0((Object) znjVar, zA, (Object) dafVar, (byte) 7));
                return Unit.f46060a;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final void r() {
        if (n().b.f13233a.f8987a) {
            kd30 kd30Var = (kd30) this.W.f11760a;
            wv10 wv10Var = wv10.SPORT;
            kd30.G(kd30Var, new ab50(6), null, false, false, 30);
        }
    }

    public final void r0() {
        zrj zrjVar = this.T;
        r9u r9uVar = zrjVar.m;
        ygp ygpVar = ygp.g;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        zrj.c(zrjVar, new bb50(false), j1q0Var.f15748a.d(ygpVar) ? new AppScreens$PaymentConsultantFragmentScreen() : new AppScreens$PaymentConsultantFragmentOldScreen(), 4);
    }

    public final void s(ylj yljVar) {
        j700 j700Var;
        if (n().Q) {
            String str = yljVar.f42845a;
            int iHashCode = str.hashCode();
            if (iHashCode != 3321844) {
                if (iHashCode != 3322092) {
                    if (iHashCode != 95130713 || !str.equals("cyber")) {
                        return;
                    } else {
                        j700Var = j700.d;
                    }
                } else if (!str.equals("live")) {
                    return;
                } else {
                    j700Var = j700.b;
                }
            } else if (!str.equals("line")) {
                return;
            } else {
                j700Var = j700.f16016a;
            }
            if (j700Var != j700.d || n().c.f7565a.d) {
                this.T.a(new ab50(0), new FeedScreenFactoryImpl$getBetOnYourScreen$1(j700Var));
            }
        }
    }

    public final void s0() {
        zuc0 zuc0Var = n().V0;
        wv10 wv10Var = wv10.SPORT;
        ab50 ab50Var = new ab50(4);
        zrj zrjVar = this.T;
        zrjVar.a(ab50Var, jh70.i(zrjVar.n, zuc0Var));
    }

    public final void t(imj imjVar, boolean z) {
        boolean z2 = imjVar.b;
        zrj zrjVar = this.T;
        vqc vqcVar = this.f;
        if (!z2) {
            vqcVar.k(pzb.C(new wpj(imjVar, z)));
            zrjVar.f(new CyberGamesScreenFactoryImpl$homeScreen$1(this.d, new CyberHomeParams(org.xplatform.cyber.section.api.domain.entity.d.d(imjVar.f15028a), CyberGamesParentSectionModel.FromSection.INSTANCE)));
        } else {
            vqcVar.k(pzb.C(new wpj(z, imjVar)));
            wv10 wv10Var = wv10.SPORT;
            ab50 ab50Var = new ab50(1);
            vqc vqcVar2 = zrjVar.k;
            zrj.c(zrjVar, ab50Var, new CyberGamesScreenFactoryImpl$filteredChampDisciplinesScreen$1(), 4);
        }
    }

    public final void t0() {
        wv10 wv10Var = wv10.SPORT;
        ab50 ab50Var = new ab50(4);
        zrj zrjVar = this.T;
        ((esg0) zrjVar.r.f10231a).S();
        zrj.c(zrjVar, ab50Var, bbw0.h(0L), 4);
    }

    public final void u(kmj kmjVar, boolean z) {
        this.f.k(pzb.C(new x9((Object) kmjVar, z, (byte) 15)));
        wv10 wv10Var = wv10.SPORT;
        ab50 ab50Var = new ab50(1);
        zrj zrjVar = this.T;
        zrj.c(zrjVar, ab50Var, new CyberGamesScreenFactoryImpl$disciplineDetails$1(zrjVar.k, new DisciplineDetailsParams(kmjVar.f18541a, org.xplatform.cyber.section.api.domain.entity.d.d(kmjVar.b))), 4);
    }

    public final void u0() {
        boolean z = n().N.q == kse0.SIMPLE_SCREEN;
        zrj zrjVar = this.T;
        i1w0 i1w0VarB = zrjVar.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                wv10 wv10Var = wv10.SPORT;
                zrjVar.n(new ab50(4), new vrj(zrjVar, z, (byte) 2), false);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object v(boolean z, mmj mmjVar, zje zjeVar) {
        eqj eqjVar;
        mmj mmjVar2;
        boolean z2;
        if (zjeVar instanceof eqj) {
            eqjVar = (eqj) zjeVar;
            int i = eqjVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                eqjVar.m = i - Integer.MIN_VALUE;
            } else {
                eqjVar = new eqj(this, zjeVar);
            }
        } else {
            eqjVar = new eqj(this, zjeVar);
        }
        Object obj = eqjVar.k;
        wne wneVar = wne.f39444a;
        int i2 = eqjVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            long j = mmjVar.b;
            eqjVar.j = mmjVar;
            eqjVar.i = z;
            eqjVar.m = 1;
            Object objB = this.J.b(j, eqjVar);
            if (objB == wneVar) {
                return wneVar;
            }
            mmjVar2 = mmjVar;
            z2 = z;
            obj = objB;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = eqjVar.i;
            mmjVar2 = eqjVar.j;
            z1x.P(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        mmjVar2.getClass();
        wv10 wv10Var = wv10.SPORT;
        ab50 ab50Var = new ab50(1);
        zrj zrjVar = this.T;
        qv2 qv2Var = zrjVar.i;
        GameBroadcastType gameBroadcastType = GameBroadcastType.c;
        grs grsVar = grs.b;
        ors orsVar = ors.f25750a;
        k1g k1gVar = k1g.OPEN_REGULAR;
        long j2 = mmjVar2.f22040a;
        zrj.c(zrjVar, ab50Var, qv2Var.h(new GameScreenGeneralParams(j2, j2, mmjVar2.b, mmjVar2.c, zBooleanValue, 0L, mmjVar2.d, gameBroadcastType, grsVar, "main_screen", "", orsVar, 0, false, z2 ? k1g.OPEN_FROM_PUSH : k1g.OPEN_FROM_BANNER)), 4);
        return Unit.f46060a;
    }

    public final void v0() {
        gr00 gr00Var = this.W;
        i1w0 i1w0VarB = ((oeg0) gr00Var.d).b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                kd30 kd30Var = (kd30) gr00Var.f11760a;
                wv10 wv10Var = wv10.SPORT;
                kd30Var.Q(new ab50(2), new tl1(gr00Var, b));
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final void w(long j, String str) {
        zrj zrjVar = this.T;
        CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1 cyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1 = new CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1(zrjVar.k, str, j, true);
        i1w0 i1w0VarB = zrjVar.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                wv10 wv10Var = wv10.SPORT;
                zrjVar.n(new ab50(1), new trj(zrjVar, cyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1, b), false);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final void w0() {
        kd30 kd30Var = (kd30) this.V.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(4), new BonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1(), false, false, 26);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object x(boolean z, xad0 xad0Var, zje zjeVar) {
        fqj fqjVar;
        xad0 xad0Var2;
        boolean z2;
        if (zjeVar instanceof fqj) {
            fqjVar = (fqj) zjeVar;
            int i = fqjVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqjVar.m = i - Integer.MIN_VALUE;
            } else {
                fqjVar = new fqj(this, zjeVar);
            }
        } else {
            fqjVar = new fqj(this, zjeVar);
        }
        Object obj = fqjVar.k;
        wne wneVar = wne.f39444a;
        int i2 = fqjVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            long j = xad0Var.c;
            fqjVar.j = xad0Var;
            fqjVar.i = z;
            fqjVar.m = 1;
            Object objB = this.J.b(j, fqjVar);
            if (objB == wneVar) {
                return wneVar;
            }
            xad0Var2 = xad0Var;
            z2 = z;
            obj = objB;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = fqjVar.i;
            xad0Var2 = fqjVar.j;
            z1x.P(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long j2 = xad0Var2.f40547a;
        long j3 = xad0Var2.b;
        long j4 = xad0Var2.c;
        long j5 = xad0Var2.d;
        boolean z3 = xad0Var2.e;
        k1g k1gVar = z2 ? k1g.OPEN_FROM_PUSH : k1g.OPEN_FROM_BANNER;
        wv10 wv10Var = wv10.SPORT;
        ab50 ab50Var = new ab50(5);
        zrj zrjVar = this.T;
        zrj.c(zrjVar, ab50Var, zrjVar.i.h(new GameScreenGeneralParams(j2, j3, j4, j5, zBooleanValue, 0L, z3, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1gVar)), 4);
        return Unit.f46060a;
    }

    public final void x0(roj rojVar) {
        zrj zrjVar = this.T;
        oeg0 oeg0Var = zrjVar.j;
        if (n().f32117a.e) {
            String lowerCase = rojVar.f30840a.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("toto")) {
                i1w0 i1w0VarB = oeg0Var.b();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        wv10 wv10Var = wv10.SPORT;
                        zrjVar.n(new ab50(4), new qrj(zrjVar, (byte) 6), false);
                        return;
                    }
                    i1w0VarB.a((oe50) pawVar.next());
                }
            }
        }
        i1w0 i1w0VarB2 = oeg0Var.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarB2);
        ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB2, copyOnWriteArrayListQ2, 0);
        while (true) {
            paw pawVar2 = (paw) listIteratorP2;
            if (!pawVar2.hasNext()) {
                wv10 wv10Var2 = wv10.SPORT;
                zrjVar.n(new ab50(4), new qrj(zrjVar, (byte) 5), false);
                return;
            }
            i1w0VarB2.a((oe50) pawVar2.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        if (n0(r11, r0) == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(a.zad0 r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.erj.y(a.zad0, a.zje):java.lang.Object");
    }

    public final void y0(voj vojVar) {
        Object next;
        int i = vojVar.f37769a;
        Iterator it = this.x.f20692a.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((lok0) next).f20396a != i);
        lok0 lok0Var = (lok0) next;
        Integer numValueOf = lok0Var != null ? Integer.valueOf(lok0Var.f20396a) : null;
        zrj zrjVar = this.T;
        if (numValueOf != null) {
            String str = lok0Var.b;
            str.getClass();
            wv10 wv10Var = wv10.SPORT;
            zrj.c(zrjVar, new ab50(5), zrjVar.s.h(i, str), 4);
            return;
        }
        i1w0 i1w0VarS = zrjVar.b.s();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new d1w0(zx10.k(zrjVar.g, r040.TOP, false, 2))), i1w0VarS, copyOnWriteArrayList, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarS.a((oe50) pawVar.next());
            }
        }
    }

    public final void z() {
        int i = n().Y;
        zrj zrjVar = this.T;
        if (i == 0) {
            zrjVar.p();
        } else {
            wv10 wv10Var = wv10.SPORT;
            zrjVar.a(new ab50(4), new TotoJackpotScreens$TotoJackpotDsFragmentScreen());
        }
    }

    public final void z0(pjn0 pjn0Var) {
        boolean z = n().G;
        zrj zrjVar = this.T;
        if (!z) {
            zrjVar.p();
            return;
        }
        SupportMenuScreenParams supportMenuScreenParams = new SupportMenuScreenParams(true, pjn0Var, SupportMenuScreenParams.AdditionalParams.None.f47112a);
        wv10 wv10Var = wv10.SPORT;
        zrj.c(zrjVar, new ab50(4), s9m0.f(supportMenuScreenParams), 4);
    }
}
