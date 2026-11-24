package a;

import android.javax.sip.message.Response;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.feed.notifictation.data.NotificationInfoUiModel;
import org.xplatform.feed.notifictation.presentation.models.GameNotificationScreenParams;
import org.xplatform.feed.notifictation.presentation.models.GameSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.PeriodSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventSettingsUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionPeriodUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class zns extends i3t0 {
    public static final /* synthetic */ int H = 0;
    public final ix0 A;
    public final qu B;
    public final m1e C;
    public final mne D;
    public final duj E;
    public final ctf0 F;
    public bby G;
    public final vzg0 o;
    public final i1w0 p;
    public final eke0 q;
    public final GameNotificationScreenParams r;
    public final rvt s;
    public final svt t;
    public final cj9 u;
    public final hru v;
    public final sd60 w;
    public final rjo x;
    public final wdd0 y;
    public final bn6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zns(vzg0 vzg0Var, i1w0 i1w0Var, eke0 eke0Var, GameNotificationScreenParams gameNotificationScreenParams, rvt rvtVar, svt svtVar, cj9 cj9Var, hru hruVar, sd60 sd60Var, rjo rjoVar, wdd0 wdd0Var, bn6 bn6Var, ix0 ix0Var, qu quVar, m1e m1eVar, bzt bztVar, mne mneVar, duj dujVar, ctf0 ctf0Var) {
        super(null, new gmo(gameNotificationScreenParams, bztVar, (byte) 26), new bcn(ctf0Var, (byte) 17), cvm0.p(mneVar.c, mneVar.f22085a), null);
        wdd0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = eke0Var;
        this.r = gameNotificationScreenParams;
        this.s = rvtVar;
        this.t = svtVar;
        this.u = cj9Var;
        this.v = hruVar;
        this.w = sd60Var;
        this.x = rjoVar;
        this.y = wdd0Var;
        this.z = bn6Var;
        this.A = ix0Var;
        this.B = quVar;
        this.C = m1eVar;
        this.D = mneVar;
        this.E = dujVar;
        this.F = ctf0Var;
        sac.V(jiu0.a(this), new h2s(1, this, zns.class, "handleErrorState", "handleErrorState(Ljava/lang/Throwable;)V", 0, (byte) 18), null, null, new vns(this, null, (byte) 1), 14);
    }

    public static ArrayList N(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            j760 j760Var = ((NotificationInfoUiModel) obj).f46676a;
            if (j760Var == j760.b || j760Var == j760.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((NotificationInfoUiModel) obj2).c) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel, zje zjeVar) {
        tns tnsVar;
        if (zjeVar instanceof tns) {
            tnsVar = (tns) zjeVar;
            int i = tnsVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnsVar.k = i - Integer.MIN_VALUE;
            } else {
                tnsVar = new tns(this, zjeVar);
            }
        } else {
            tnsVar = new tns(this, zjeVar);
        }
        Object objY = tnsVar.i;
        wne wneVar = wne.f39444a;
        int i2 = tnsVar.k;
        lns lnsVar = lns.f20362a;
        try {
            if (i2 == 0) {
                z1x.P(objY);
                List listC = kotlin.collections.a.c(new Long(gameSubscriptionSettingsScreenUiModel.f46678a));
                cj9 cj9Var = this.u;
                tnsVar.k = 1;
                objY = cj9Var.f4449a.Y(listC, tnsVar);
                if (objY == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objY);
            }
            if (((Boolean) objY).booleanValue()) {
                G(ins.f15088a);
            } else {
                G(lnsVar);
            }
        } catch (Throwable th) {
            this.E.b(th, new t4s((byte) 26));
            G(lnsVar);
            this.x.a(th);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object O(boolean z, zje zjeVar) {
        uns unsVar;
        if (zjeVar instanceof uns) {
            unsVar = (uns) zjeVar;
            int i = unsVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsVar.k = i - Integer.MIN_VALUE;
            } else {
                unsVar = new uns(this, zjeVar);
            }
        } else {
            unsVar = new uns(this, zjeVar);
        }
        uns unsVar2 = unsVar;
        Object objA = unsVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = unsVar2.k;
        vzg0 vzg0Var = this.o;
        if (i2 == 0) {
            z1x.P(objA);
            GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel = (GameSubscriptionSettingsScreenUiModel) vzg0Var.a("game_subscription_settings_key");
            if (gameSubscriptionSettingsScreenUiModel != null && z) {
                return gameSubscriptionSettingsScreenUiModel;
            }
            GameNotificationScreenParams gameNotificationScreenParams = this.r;
            long j = gameNotificationScreenParams.d;
            long j2 = gameNotificationScreenParams.b;
            boolean z2 = gameNotificationScreenParams.f;
            unsVar2.k = 1;
            objA = this.s.a(j, j2, unsVar2, z2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        zts ztsVar = (zts) objA;
        ztsVar.getClass();
        ots otsVar = ztsVar.f44977a;
        long j3 = otsVar.f25844a;
        boolean z3 = otsVar.b;
        List<xf90> list = ztsVar.b;
        int i3 = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (xf90 xf90Var : list) {
            SubscriptionPeriodUiModel subscriptionPeriodUiModel = new SubscriptionPeriodUiModel(xf90Var.f40781a, xf90Var.b);
            List<sho> list2 = xf90Var.c;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, i3));
            for (sho shoVar : list2) {
                arrayList2.add(new SubscriptionEventSettingsUiModel(new SubscriptionEventUiModel(shoVar.f32222a, shoVar.c), shoVar.b));
            }
            arrayList.add(new PeriodSubscriptionSettingsScreenUiModel(subscriptionPeriodUiModel, arrayList2));
            i3 = 10;
        }
        GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel2 = new GameSubscriptionSettingsScreenUiModel(j3, z3, arrayList);
        vzg0Var.e("game_subscription_settings_key", gameSubscriptionSettingsScreenUiModel2);
        return gameSubscriptionSettingsScreenUiModel2;
    }

    public final boolean P(Throwable th) {
        Object value;
        if ((th instanceof zhi0) && ((zhi0) th).c == i2o.SelfExclusionChangesProhibited) {
            G(kns.f18599a);
            return true;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, qns.a((qns) value, false, false, true, null, null, null, Response.SERVICE_UNAVAILABLE)));
        return false;
    }

    public final void Q(Throwable th) {
        this.E.b(th, new sns(this, th, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:151:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x0409  */
    /* JADX WARN: Code duplicated, block: B:168:0x0426  */
    /* JADX WARN: Code duplicated, block: B:170:0x0443  */
    /* JADX WARN: Code duplicated, block: B:171:0x0446 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0448  */
    /* JADX WARN: Code duplicated, block: B:173:0x044b  */
    /* JADX WARN: Code duplicated, block: B:174:0x044e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x0450  */
    /* JADX WARN: Code duplicated, block: B:176:0x0453  */
    /* JADX WARN: Code duplicated, block: B:177:0x0456 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0458  */
    /* JADX WARN: Code duplicated, block: B:179:0x045b  */
    /* JADX WARN: Code duplicated, block: B:180:0x045e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x0460  */
    /* JADX WARN: Code duplicated, block: B:182:0x0463  */
    /* JADX WARN: Code duplicated, block: B:183:0x0466 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0468  */
    /* JADX WARN: Code duplicated, block: B:185:0x046b  */
    /* JADX WARN: Code duplicated, block: B:186:0x046e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0470  */
    /* JADX WARN: Code duplicated, block: B:188:0x0473  */
    /* JADX WARN: Code duplicated, block: B:193:0x048b  */
    /* JADX WARN: Code duplicated, block: B:199:0x04bc A[LOOP:7: B:197:0x04b6->B:199:0x04bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:209:0x050d A[LOOP:9: B:207:0x0507->B:209:0x050d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x052d  */
    /* JADX WARN: Code duplicated, block: B:219:0x055e A[LOOP:11: B:217:0x0558->B:219:0x055e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x058c  */
    /* JADX WARN: Code duplicated, block: B:224:0x058f  */
    /* JADX WARN: Code duplicated, block: B:227:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:253:0x040c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x04a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r5v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v34 */
    public final void R() {
        Object next;
        Object next2;
        ?? arrayList;
        String str;
        long j;
        String str2;
        ?? r29;
        boolean z;
        yni0 yni0Var;
        String str3;
        ArrayList<s760> arrayList2;
        String str4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Iterator it2;
        ArrayList arrayList8;
        ArrayList arrayList9;
        Iterator it3;
        long j2;
        long j3;
        long j4;
        r760 r760VarF;
        boolean z2;
        String str5;
        long j5;
        if (!((qns) D()).d && !((qns) D()).f29046a) {
            Set setF = eui0.f(CollectionsKt.P0(N(((qns) D()).i)), CollectionsKt.P0(N(((qns) D()).h)));
            ArrayList arrayList10 = new ArrayList(r3d.q(setF, 10));
            Iterator it4 = setF.iterator();
            while (it4.hasNext()) {
                arrayList10.add(NotificationInfoUiModel.a((NotificationInfoUiModel) it4.next(), false));
            }
            ArrayList<NotificationInfoUiModel> arrayListQ0 = CollectionsKt.q0(CollectionsKt.L0(eui0.f(CollectionsKt.P0(N(((qns) D()).h)), CollectionsKt.P0(N(((qns) D()).i)))), CollectionsKt.L0(arrayList10));
            Iterator it5 = ((qns) D()).i.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (((NotificationInfoUiModel) next).f46676a != j760.f16026a);
            NotificationInfoUiModel notificationInfoUiModel = (NotificationInfoUiModel) next;
            Iterator it6 = ((qns) D()).h.iterator();
            loop2: while (true) {
                if (!it6.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it6.next();
                NotificationInfoUiModel notificationInfoUiModel2 = (NotificationInfoUiModel) next2;
                if (notificationInfoUiModel2.f46676a == j760.f16026a && (notificationInfoUiModel == null || notificationInfoUiModel.c != notificationInfoUiModel2.c)) {
                    List list = ((qns) D()).h;
                    if (list != null && list.isEmpty()) {
                        break;
                    }
                    Iterator it7 = list.iterator();
                    do {
                        if (!it7.hasNext()) {
                            break loop2;
                        }
                    } while (((NotificationInfoUiModel) it7.next()).c);
                    List list2 = ((qns) D()).h;
                    if (list2 != null && list2.isEmpty()) {
                        break;
                    }
                    Iterator it8 = list2.iterator();
                    do {
                        if (!it8.hasNext()) {
                            break loop2;
                        }
                    } while (!((NotificationInfoUiModel) it8.next()).c);
                }
            }
            NotificationInfoUiModel notificationInfoUiModel3 = (NotificationInfoUiModel) next2;
            if (!arrayListQ0.isEmpty()) {
                Integer numValueOf = notificationInfoUiModel3 != null ? Integer.valueOf(notificationInfoUiModel3.c ? 1 : 0) : null;
                if (numValueOf == null) {
                    arrayList = new ArrayList(r3d.q(arrayListQ0, 10));
                    for (NotificationInfoUiModel notificationInfoUiModel4 : arrayListQ0) {
                        arrayList.add(new s760(notificationInfoUiModel4.d, notificationInfoUiModel4.c, notificationInfoUiModel4.e));
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                GameNotificationScreenParams gameNotificationScreenParams = this.r;
                boolean z3 = gameNotificationScreenParams.f;
                long j6 = gameNotificationScreenParams.f46677a;
                long j7 = gameNotificationScreenParams.e;
                long j8 = gameNotificationScreenParams.d;
                String strValueOf = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
                String str6 = "";
                if (strValueOf == null) {
                    strValueOf = "";
                }
                qu quVar = this.B;
                quVar.getClass();
                arrayList.getClass();
                kt2 kt2Var = quVar.f29324a;
                jo20 jo20Var = new jo20();
                jo20Var.put(Payload.TYPE, z3 ? "live" : "line");
                String str7 = "mb_penalty_off";
                if (strValueOf.length() > 0) {
                    jo20Var.put("action", strValueOf);
                } else {
                    if (!arrayList.isEmpty()) {
                        ArrayList<s760> arrayList11 = new ArrayList();
                        Iterator it9 = arrayList.iterator();
                        ?? r5 = arrayList;
                        while (it9.hasNext()) {
                            ?? r210 = r5;
                            Object next3 = it9.next();
                            Iterator it10 = it9;
                            atz atzVar = b860.f2142a;
                            String str8 = str7;
                            long j9 = ((s760) next3).f31735a;
                            atzVar.getClass();
                            if (atz.a(j9) == b860.b) {
                                arrayList11.add(next3);
                            }
                            r5 = r210;
                            it9 = it10;
                            str7 = str8;
                        }
                        ?? r211 = r5;
                        str = str7;
                        ArrayList arrayList12 = new ArrayList(r3d.q(arrayList11, 10));
                        for (s760 s760Var : arrayList11) {
                            s760Var.getClass();
                            evz evzVar = r760.f29964a;
                            long j10 = j7;
                            long j11 = s760Var.b;
                            evzVar.getClass();
                            r760 r760VarF2 = evz.f(j11);
                            boolean z4 = s760Var.c;
                            switch (r760VarF2.ordinal()) {
                                case 4:
                                    str2 = z4 ? "mb_penalty_on" : str;
                                    break;
                                case 5:
                                    str2 = z4 ? "mb_1m_on" : "mb_1m_off";
                                    break;
                                case 6:
                                    str2 = z4 ? "mb_5m_on" : "mb_5m_off";
                                    break;
                                case 7:
                                    str2 = z4 ? "mb_15m_on" : "mb_15m_off";
                                    break;
                                case 8:
                                    str2 = z4 ? "mb_30m_on" : "mb_30m_off";
                                    break;
                                case 9:
                                    str2 = z4 ? "mb_1h_on" : "mb_1h_off";
                                    break;
                                default:
                                    str2 = "";
                                    break;
                            }
                            arrayList12.add(str2);
                            j7 = j10;
                        }
                        j = j7;
                        if (!arrayList12.isEmpty()) {
                            jo20Var.put("point", arrayList12);
                        }
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj : r211) {
                            atz atzVar2 = b860.f2142a;
                            long j12 = ((s760) obj).f31735a;
                            atzVar2.getClass();
                            if (atz.a(j12) == b860.c) {
                                arrayList13.add(obj);
                            }
                        }
                        ArrayList arrayList14 = new ArrayList(r3d.q(arrayList13, 10));
                        Iterator it11 = arrayList13.iterator();
                        while (it11.hasNext()) {
                            arrayList14.add(wpm0.m((s760) it11.next()));
                        }
                        if (!arrayList14.isEmpty()) {
                            jo20Var.put("filter", arrayList14);
                        }
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj2 : r211) {
                            atz atzVar3 = b860.f2142a;
                            long j13 = ((s760) obj2).f31735a;
                            atzVar3.getClass();
                            if (atz.a(j13) == b860.d) {
                                arrayList15.add(obj2);
                            }
                        }
                        ArrayList arrayList16 = new ArrayList(r3d.q(arrayList15, 10));
                        Iterator it12 = arrayList15.iterator();
                        while (it12.hasNext()) {
                            arrayList16.add(x1x.L((s760) it12.next()));
                        }
                        if (!arrayList16.isEmpty()) {
                            jo20Var.put("option", arrayList16);
                        }
                        ArrayList arrayList17 = new ArrayList();
                        for (Object obj3 : r211) {
                            atz atzVar4 = b860.f2142a;
                            long j14 = ((s760) obj3).f31735a;
                            atzVar4.getClass();
                            if (atz.a(j14) == b860.e) {
                                arrayList17.add(obj3);
                            }
                        }
                        ArrayList arrayList18 = new ArrayList(r3d.q(arrayList17, 10));
                        Iterator it13 = arrayList17.iterator();
                        while (it13.hasNext()) {
                            arrayList18.add(x8x.B((s760) it13.next()));
                        }
                        r29 = r211;
                        if (!arrayList18.isEmpty()) {
                            jo20Var.put("index", arrayList18);
                            r29 = r211;
                        }
                    }
                    jo20Var.put("sport_id", Long.valueOf(j8));
                    if (j8 == 40) {
                        jo20Var.put("sub_sport_id", Long.valueOf(j));
                    }
                    jo20Var.put("game_id", Long.valueOf(j6));
                    kt2Var.a("push_sub_unsub_game", jo20Var.b());
                    z = gameNotificationScreenParams.f;
                    ix0 ix0Var = this.A;
                    ix0Var.getClass();
                    s1p s1pVar = ix0Var.f15516a;
                    yni0Var = new yni0();
                    if (numValueOf != null) {
                        yni0Var.add(new i1p(numValueOf));
                    }
                    if (!r29.isEmpty() && numValueOf == null) {
                        ArrayList arrayList19 = new ArrayList();
                        arrayList2 = new ArrayList();
                        for (Object obj4 : r29) {
                            atz atzVar5 = b860.f2142a;
                            String str9 = str6;
                            j5 = ((s760) obj4).f31735a;
                            atzVar5.getClass();
                            if (atz.a(j5) == b860.b) {
                                arrayList2.add(obj4);
                            }
                            str6 = str9;
                        }
                        str4 = str6;
                        arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        for (s760 s760Var2 : arrayList2) {
                            s760Var2.getClass();
                            evz evzVar2 = r760.f29964a;
                            long j15 = s760Var2.b;
                            evzVar2.getClass();
                            r760VarF = evz.f(j15);
                            z2 = s760Var2.c;
                            switch (r760VarF.ordinal()) {
                                case 4:
                                    if (z2) {
                                        str5 = "mb_penalty_on";
                                    } else {
                                        str5 = str;
                                    }
                                    break;
                                case 5:
                                    if (z2) {
                                        str5 = "mb_1m_on";
                                    } else {
                                        str5 = "mb_1m_off";
                                    }
                                    break;
                                case 6:
                                    if (z2) {
                                        str5 = "mb_5m_on";
                                    } else {
                                        str5 = "mb_5m_off";
                                    }
                                    break;
                                case 7:
                                    if (z2) {
                                        str5 = "mb_15m_on";
                                    } else {
                                        str5 = "mb_15m_off";
                                    }
                                    break;
                                case 8:
                                    if (z2) {
                                        str5 = "mb_30m_on";
                                    } else {
                                        str5 = "mb_30m_off";
                                    }
                                    break;
                                case 9:
                                    if (z2) {
                                        str5 = "mb_1h_on";
                                    } else {
                                        str5 = "mb_1h_off";
                                    }
                                    break;
                                default:
                                    str5 = str4;
                                    break;
                            }
                            arrayList3.add(str5);
                        }
                        arrayList19.addAll(arrayList3);
                        arrayList4 = new ArrayList();
                        for (Object obj5 : r29) {
                            atz atzVar6 = b860.f2142a;
                            j4 = ((s760) obj5).f31735a;
                            atzVar6.getClass();
                            if (atz.a(j4) == b860.c) {
                                arrayList4.add(obj5);
                            }
                        }
                        arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                        it = arrayList4.iterator();
                        while (it.hasNext()) {
                            arrayList5.add(wpm0.m((s760) it.next()));
                        }
                        arrayList19.addAll(arrayList5);
                        arrayList6 = new ArrayList();
                        for (Object obj6 : r29) {
                            atz atzVar7 = b860.f2142a;
                            j3 = ((s760) obj6).f31735a;
                            atzVar7.getClass();
                            if (atz.a(j3) == b860.d) {
                                arrayList6.add(obj6);
                            }
                        }
                        arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            arrayList7.add(x1x.L((s760) it2.next()));
                        }
                        arrayList19.addAll(arrayList7);
                        arrayList8 = new ArrayList();
                        for (Object obj7 : r29) {
                            atz atzVar8 = b860.f2142a;
                            j2 = ((s760) obj7).f31735a;
                            atzVar8.getClass();
                            if (atz.a(j2) == b860.e) {
                                arrayList8.add(obj7);
                            }
                        }
                        arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                        it3 = arrayList8.iterator();
                        while (it3.hasNext()) {
                            arrayList9.add(x8x.B((s760) it3.next()));
                        }
                        arrayList19.addAll(arrayList9);
                        yni0Var.add(new j1p(CollectionsKt.b0(arrayList19, null, null, null, null, 63), (byte) 0));
                    }
                    if (z) {
                        str3 = "live";
                    } else {
                        str3 = "line";
                    }
                    yni0Var.add(new j1p(str3, (byte) 1));
                    yni0Var.add(new i1p((byte) 0, j8));
                    yni0Var.add(new i1p((byte) 1, j6));
                    if (j8 == 40) {
                        yni0Var.add(new h1p(j, (byte) 0));
                    }
                    s1pVar.a(cui0.a(yni0Var), 11247L);
                }
                r29 = arrayList;
                str = "mb_penalty_off";
                j = j7;
                jo20Var.put("sport_id", Long.valueOf(j8));
                if (j8 == 40) {
                    jo20Var.put("sub_sport_id", Long.valueOf(j));
                }
                jo20Var.put("game_id", Long.valueOf(j6));
                kt2Var.a("push_sub_unsub_game", jo20Var.b());
                z = gameNotificationScreenParams.f;
                ix0 ix0Var2 = this.A;
                ix0Var2.getClass();
                s1p s1pVar2 = ix0Var2.f15516a;
                yni0Var = new yni0();
                if (numValueOf != null) {
                    yni0Var.add(new i1p(numValueOf));
                }
                if (!r29.isEmpty()) {
                    ArrayList arrayList110 = new ArrayList();
                    arrayList2 = new ArrayList();
                    while (r7.hasNext()) {
                        atz atzVar9 = b860.f2142a;
                        String str10 = str6;
                        j5 = ((s760) obj4).f31735a;
                        atzVar9.getClass();
                        if (atz.a(j5) == b860.b) {
                            arrayList2.add(obj4);
                        }
                        str6 = str10;
                    }
                    str4 = str6;
                    arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    while (r6.hasNext()) {
                        s760Var2.getClass();
                        evz evzVar3 = r760.f29964a;
                        long j16 = s760Var2.b;
                        evzVar3.getClass();
                        r760VarF = evz.f(j16);
                        z2 = s760Var2.c;
                        switch (r760VarF.ordinal()) {
                            case 4:
                                if (z2) {
                                    str5 = "mb_penalty_on";
                                } else {
                                    str5 = str;
                                }
                                break;
                            case 5:
                                if (z2) {
                                    str5 = "mb_1m_on";
                                } else {
                                    str5 = "mb_1m_off";
                                }
                                break;
                            case 6:
                                if (z2) {
                                    str5 = "mb_5m_on";
                                } else {
                                    str5 = "mb_5m_off";
                                }
                                break;
                            case 7:
                                if (z2) {
                                    str5 = "mb_15m_on";
                                } else {
                                    str5 = "mb_15m_off";
                                }
                                break;
                            case 8:
                                if (z2) {
                                    str5 = "mb_30m_on";
                                } else {
                                    str5 = "mb_30m_off";
                                }
                                break;
                            case 9:
                                if (z2) {
                                    str5 = "mb_1h_on";
                                } else {
                                    str5 = "mb_1h_off";
                                }
                                break;
                            default:
                                str5 = str4;
                                break;
                        }
                        arrayList3.add(str5);
                    }
                    arrayList110.addAll(arrayList3);
                    arrayList4 = new ArrayList();
                    while (r7.hasNext()) {
                        atz atzVar10 = b860.f2142a;
                        j4 = ((s760) obj5).f31735a;
                        atzVar10.getClass();
                        if (atz.a(j4) == b860.c) {
                            arrayList4.add(obj5);
                        }
                    }
                    arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(wpm0.m((s760) it.next()));
                    }
                    arrayList110.addAll(arrayList5);
                    arrayList6 = new ArrayList();
                    while (r7.hasNext()) {
                        atz atzVar11 = b860.f2142a;
                        j3 = ((s760) obj6).f31735a;
                        atzVar11.getClass();
                        if (atz.a(j3) == b860.d) {
                            arrayList6.add(obj6);
                        }
                    }
                    arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                    it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(x1x.L((s760) it2.next()));
                    }
                    arrayList110.addAll(arrayList7);
                    arrayList8 = new ArrayList();
                    while (r7.hasNext()) {
                        atz atzVar12 = b860.f2142a;
                        j2 = ((s760) obj7).f31735a;
                        atzVar12.getClass();
                        if (atz.a(j2) == b860.e) {
                            arrayList8.add(obj7);
                        }
                    }
                    arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                    it3 = arrayList8.iterator();
                    while (it3.hasNext()) {
                        arrayList9.add(x8x.B((s760) it3.next()));
                    }
                    arrayList110.addAll(arrayList9);
                    yni0Var.add(new j1p(CollectionsKt.b0(arrayList110, null, null, null, null, 63), (byte) 0));
                }
                if (z) {
                    str3 = "live";
                } else {
                    str3 = "line";
                }
                yni0Var.add(new j1p(str3, (byte) 1));
                yni0Var.add(new i1p((byte) 0, j8));
                yni0Var.add(new i1p((byte) 1, j6));
                if (j8 == 40) {
                    yni0Var.add(new h1p(j, (byte) 0));
                }
                s1pVar2.a(cui0.a(yni0Var), 11247L);
            }
        }
        i1w0 i1w0Var = this.p;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void S(NotificationInfoUiModel notificationInfoUiModel, boolean z) {
        sac.V(jiu0.a(this), new h2s(1, this, zns.class, "handleThrowable", "handleThrowable(Ljava/lang/Throwable;)V", 0, (byte) 20), null, null, new ys8((Object) this, (Object) notificationInfoUiModel, z, (yje) null, (byte) 8), 14);
    }

    public final void T() {
        sac.V(jiu0.a(this), new h2s(1, this, zns.class, "handleThrowable", "handleThrowable(Ljava/lang/Throwable;)V", 0, (byte) 21), null, null, new vns(this, null, (byte) 2), 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(zje zjeVar) {
        xns xnsVar;
        String str;
        if (zjeVar instanceof xns) {
            xnsVar = (xns) zjeVar;
            int i = xnsVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnsVar.l = i - Integer.MIN_VALUE;
            } else {
                xnsVar = new xns(this, zjeVar);
            }
        } else {
            xnsVar = new xns(this, zjeVar);
        }
        Object obj = xnsVar.j;
        Object obj2 = wne.f39444a;
        int i2 = xnsVar.l;
        vzg0 vzg0Var = this.o;
        if (i2 == 0) {
            z1x.P(obj);
            GameNotificationScreenParams gameNotificationScreenParams = this.r;
            long j = gameNotificationScreenParams.f46677a;
            long j2 = gameNotificationScreenParams.d;
            StringBuilder sbQ = kng0.q(j, "selected_item_key__", BundleUtil.UNDERLINE_TAG);
            sbQ.append(j2);
            String string = sbQ.toString();
            if (((GameSubscriptionSettingsScreenUiModel) vzg0Var.a(string)) != null) {
                return Unit.f46060a;
            }
            xnsVar.i = string;
            xnsVar.l = 1;
            Object objO = O(true, xnsVar);
            if (objO == obj2) {
                return obj2;
            }
            obj = objO;
            str = string;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = xnsVar.i;
            z1x.P(obj);
        }
        GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel = (GameSubscriptionSettingsScreenUiModel) obj;
        long j3 = gameSubscriptionSettingsScreenUiModel.f46678a;
        boolean z = gameSubscriptionSettingsScreenUiModel.b;
        ArrayList<PeriodSubscriptionSettingsScreenUiModel> arrayList = gameSubscriptionSettingsScreenUiModel.c;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (PeriodSubscriptionSettingsScreenUiModel periodSubscriptionSettingsScreenUiModel : arrayList) {
            SubscriptionPeriodUiModel subscriptionPeriodUiModel = periodSubscriptionSettingsScreenUiModel.f46679a;
            long j4 = subscriptionPeriodUiModel.f46682a;
            String str2 = subscriptionPeriodUiModel.b;
            str2.getClass();
            SubscriptionPeriodUiModel subscriptionPeriodUiModel2 = new SubscriptionPeriodUiModel(j4, str2);
            ArrayList<SubscriptionEventSettingsUiModel> arrayList3 = periodSubscriptionSettingsScreenUiModel.b;
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            for (SubscriptionEventSettingsUiModel subscriptionEventSettingsUiModel : arrayList3) {
                SubscriptionEventUiModel subscriptionEventUiModel = subscriptionEventSettingsUiModel.f46680a;
                boolean z2 = subscriptionEventSettingsUiModel.b;
                subscriptionEventUiModel.getClass();
                arrayList4.add(new SubscriptionEventSettingsUiModel(subscriptionEventUiModel, z2));
            }
            arrayList2.add(new PeriodSubscriptionSettingsScreenUiModel(subscriptionPeriodUiModel2, arrayList4));
        }
        vzg0Var.e(str, new GameSubscriptionSettingsScreenUiModel(j3, z, arrayList2));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V(GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel, boolean z, zje zjeVar) {
        yns ynsVar;
        if (zjeVar instanceof yns) {
            ynsVar = (yns) zjeVar;
            int i = ynsVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ynsVar.k = i - Integer.MIN_VALUE;
            } else {
                ynsVar = new yns(this, zjeVar);
            }
        } else {
            ynsVar = new yns(this, zjeVar);
        }
        Object objQ = ynsVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ynsVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objQ);
                zts ztsVarP0 = kpb.p0(gameSubscriptionSettingsScreenUiModel);
                svt svtVar = this.t;
                ynsVar.k = 1;
                objQ = svtVar.f32886a.Q(ztsVarP0, z, ynsVar);
                if (objQ == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objQ);
            }
            if (((Boolean) objQ).booleanValue()) {
                G(ins.f15088a);
            } else {
                G(ons.f25562a);
            }
        } catch (Throwable th) {
            this.E.b(th, new sns(this, th, (byte) 0));
            this.x.a(th);
        }
        return Unit.f46060a;
    }

    public final void W(GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel) {
        oyg0 oyg0Var;
        Object value;
        boolean z = ((qns) D()).e;
        j760 j760Var = j760.f16026a;
        List listC = kotlin.collections.a.c(new NotificationInfoUiModel(this.F.b.a(R.string.select_all, Arrays.copyOf(new Object[0], 0)), gameSubscriptionSettingsScreenUiModel.a()));
        GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel2 = gameSubscriptionSettingsScreenUiModel;
        ArrayList arrayList = gameSubscriptionSettingsScreenUiModel2.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if ((((PeriodSubscriptionSettingsScreenUiModel) obj).f46679a.f46682a != 3 && z) || !z) {
                arrayList2.add(obj);
            }
        }
        List<PeriodSubscriptionSettingsScreenUiModel> listA0 = CollectionsKt.A0(arrayList2, new e3l((byte) 17));
        ArrayList arrayList3 = new ArrayList();
        for (PeriodSubscriptionSettingsScreenUiModel periodSubscriptionSettingsScreenUiModel : listA0) {
            ArrayList arrayList4 = periodSubscriptionSettingsScreenUiModel.b;
            ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
            for (Iterator it = arrayList4.iterator(); it.hasNext(); it = it) {
                SubscriptionEventSettingsUiModel subscriptionEventSettingsUiModel = (SubscriptionEventSettingsUiModel) it.next();
                j760 j760Var2 = j760.c;
                SubscriptionEventUiModel subscriptionEventUiModel = subscriptionEventSettingsUiModel.f46680a;
                arrayList5.add(new NotificationInfoUiModel(j760Var2, subscriptionEventUiModel.b, subscriptionEventSettingsUiModel.b, periodSubscriptionSettingsScreenUiModel.f46679a.f46682a, subscriptionEventUiModel.f46681a));
                periodSubscriptionSettingsScreenUiModel = periodSubscriptionSettingsScreenUiModel;
            }
            w3d.u(arrayList3, arrayList5);
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(listC, arrayList3);
        ocj ocjVar = this.i;
        p7m0 p7m0Var = ocjVar.f25029a;
        while (true) {
            Object value2 = p7m0Var.getValue();
            value2.getClass();
            oyg0Var = this.f;
            oyg0Var.getClass();
            if (p7m0Var.m(value2, qns.a((qns) value2, false, false, false, gameSubscriptionSettingsScreenUiModel2, arrayListQ0, null, 319))) {
                break;
            } else {
                gameSubscriptionSettingsScreenUiModel2 = gameSubscriptionSettingsScreenUiModel;
            }
        }
        if (((qns) D()).i.isEmpty()) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, qns.a((qns) value, false, false, false, null, null, arrayListQ0, 255)));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ans ansVar = (ans) obj;
        ansVar.getClass();
        super.x(ansVar);
        yje yjeVar = null;
        if (ansVar instanceof zms) {
            bby bbyVar = this.G;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.G = sac.V(jiu0.a(this), new h2s(1, this, zns.class, "handleThrowable", "handleThrowable(Ljava/lang/Throwable;)V", 0, (byte) 16), null, null, new cin(this, yjeVar, (byte) 10), 14);
                return;
            }
            return;
        }
        if (ansVar instanceof qms) {
            E();
            return;
        }
        if (ansVar instanceof rms) {
            if (!this.v.i()) {
                T();
                return;
            }
            NotificationInfoUiModel notificationInfoUiModel = (NotificationInfoUiModel) this.o.a("selected_item_key");
            if (notificationInfoUiModel != null) {
                S(notificationInfoUiModel, notificationInfoUiModel.c);
                return;
            }
            return;
        }
        if (ansVar instanceof sms) {
            R();
            return;
        }
        if (ansVar instanceof tms) {
            sac.V(jiu0.a(this), new h2s(1, this, zns.class, "handleThrowable", "handleThrowable(Ljava/lang/Throwable;)V", 0, (byte) 19), null, null, new fhq(this, yjeVar, (byte) 4), 14);
            return;
        }
        if (ansVar instanceof ums) {
            ums umsVar = (ums) ansVar;
            S(umsVar.f35931a, umsVar.b);
            return;
        }
        if (ansVar instanceof xms) {
            if (!((qns) D()).c || ((qns) D()).d) {
                R();
                return;
            } else {
                sac.V(jiu0.a(this), new h2s(1, this, zns.class, "handleThrowable", "handleThrowable(Ljava/lang/Throwable;)V", 0, (byte) 22), null, null, new atj(this, yjeVar, (byte) 12), 14);
                return;
            }
        }
        if (ansVar instanceof yms) {
            T();
            return;
        }
        boolean z = ansVar instanceof wms;
        ix0 ix0Var = this.A;
        qu quVar = this.B;
        if (z) {
            quVar.f29324a.a("push_permission_alert_click", xp20.f(new Pair("action", "settings"), new Pair("screen", "notifications")));
            ix0Var.f15516a.a(tx3.l0(new k1p[]{new j1p("settings", (byte) 0), new j1p("notifications", (byte) 1)}), 3344L);
        } else if (!(ansVar instanceof vms)) {
            t9f.b();
        } else {
            quVar.f29324a.a("push_permission_alert_click", xp20.f(new Pair("action", "cancel"), new Pair("screen", "notifications")));
            ix0Var.f15516a.a(tx3.l0(new k1p[]{new j1p("cancel", (byte) 0), new j1p("notifications", (byte) 1)}), 3344L);
        }
    }
}
