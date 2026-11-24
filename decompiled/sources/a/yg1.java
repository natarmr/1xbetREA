package a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;
import org.xplatform.favorites.impl.data.workers.FavoriteLocalNotificationWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class yg1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg1(long j, m940 m940Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        this.j = j;
        this.k = m940Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new yg1((mh1) obj2, this.j, yjeVar, (byte) 0);
            case 1:
                yg1 yg1Var = new yg1(obj2, yjeVar, (byte) 1);
                yg1Var.j = ((ynq0) obj).f42952a;
                return yg1Var;
            case 2:
                yg1 yg1Var2 = new yg1(obj2, yjeVar, (byte) 2);
                yg1Var2.j = ((Number) obj).longValue();
                return yg1Var2;
            case 3:
                yg1 yg1Var3 = new yg1(obj2, yjeVar, (byte) 3);
                yg1Var3.j = ((Number) obj).longValue();
                return yg1Var3;
            case 4:
                yg1 yg1Var4 = new yg1(obj2, yjeVar, (byte) 4);
                yg1Var4.j = ((Number) obj).longValue();
                return yg1Var4;
            case 5:
                yg1 yg1Var5 = new yg1(obj2, yjeVar, (byte) 5);
                yg1Var5.j = ((Number) obj).longValue();
                return yg1Var5;
            case 6:
                yg1 yg1Var6 = new yg1(obj2, yjeVar, (byte) 6);
                yg1Var6.j = ((Number) obj).longValue();
                return yg1Var6;
            case 7:
                yg1 yg1Var7 = new yg1(obj2, yjeVar, (byte) 7);
                yg1Var7.j = ((Number) obj).longValue();
                return yg1Var7;
            case 8:
                yg1 yg1Var8 = new yg1(obj2, yjeVar, (byte) 8);
                yg1Var8.j = ((Number) obj).longValue();
                return yg1Var8;
            case 9:
                yg1 yg1Var9 = new yg1(obj2, yjeVar, (byte) 9);
                yg1Var9.j = ((Number) obj).longValue();
                return yg1Var9;
            case 10:
                return new yg1((e6j) obj2, this.j, yjeVar, (byte) 10);
            case 11:
                return new yg1((egk0) obj2, this.j, yjeVar, (byte) 11);
            case 12:
                yg1 yg1Var10 = new yg1(obj2, yjeVar, (byte) 12);
                yg1Var10.j = ((Number) obj).longValue();
                return yg1Var10;
            case 13:
                return new yg1((ptc) obj2, this.j, yjeVar, (byte) 13);
            case 14:
                yg1 yg1Var11 = new yg1(obj2, yjeVar, (byte) 14);
                yg1Var11.j = ((Number) obj).longValue();
                return yg1Var11;
            case 15:
                return new yg1((z4w) obj2, this.j, yjeVar, (byte) 15);
            case 16:
                return new yg1((qi00) obj2, this.j, yjeVar, (byte) 16);
            case 17:
                yg1 yg1Var12 = new yg1(obj2, yjeVar, (byte) 17);
                yg1Var12.j = ((Number) obj).longValue();
                return yg1Var12;
            case 18:
                yg1 yg1Var13 = new yg1(obj2, yjeVar, (byte) 18);
                yg1Var13.j = ((Number) obj).longValue();
                return yg1Var13;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                yg1 yg1Var14 = new yg1(obj2, yjeVar, (byte) 19);
                yg1Var14.j = ((Number) obj).longValue();
                return yg1Var14;
            case 20:
                return new yg1(this.j, (m940) obj2, yjeVar);
            case 21:
                yg1 yg1Var15 = new yg1(obj2, yjeVar, (byte) 21);
                yg1Var15.j = ((Number) obj).longValue();
                return yg1Var15;
            case 22:
                yg1 yg1Var16 = new yg1(obj2, yjeVar, (byte) 22);
                yg1Var16.j = ((Number) obj).longValue();
                return yg1Var16;
            case 23:
                yg1 yg1Var17 = new yg1(obj2, yjeVar, (byte) 23);
                yg1Var17.j = ((Number) obj).longValue();
                return yg1Var17;
            case 24:
                yg1 yg1Var18 = new yg1(obj2, yjeVar, (byte) 24);
                yg1Var18.j = ((Number) obj).longValue();
                return yg1Var18;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                yg1 yg1Var19 = new yg1(obj2, yjeVar, (byte) 25);
                yg1Var19.j = ((Number) obj).longValue();
                return yg1Var19;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                yg1 yg1Var20 = new yg1(obj2, yjeVar, (byte) 26);
                yg1Var20.j = ((Number) obj).longValue();
                return yg1Var20;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                yg1 yg1Var21 = new yg1(obj2, yjeVar, (byte) 27);
                yg1Var21.j = ((Number) obj).longValue();
                return yg1Var21;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                yg1 yg1Var22 = new yg1(obj2, yjeVar, (byte) 28);
                yg1Var22.j = ((Number) obj).longValue();
                return yg1Var22;
            default:
                yg1 yg1Var23 = new yg1(obj2, yjeVar, (byte) 29);
                yg1Var23.j = ((ynq0) obj).f42952a;
                return yg1Var23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                return ((yg1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                long j = ((ynq0) obj).f42952a;
                yg1 yg1Var = new yg1(obj3, (yje) obj2, (byte) 1);
                yg1Var.j = j;
                return yg1Var.invokeSuspend(Unit.f46060a);
            case 2:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((yg1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((yg1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((yg1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((yg1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((yg1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((yg1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((yg1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                long j2 = ((ynq0) obj).f42952a;
                yg1 yg1Var2 = new yg1(obj3, (yje) obj2, (byte) 29);
                yg1Var2.j = j2;
                return yg1Var2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object sudVar;
        Object zzdVar;
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        byte b2 = 4;
        byte b3 = 7;
        byte b4 = 6;
        int i = 2;
        byte b5 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mh1 mh1Var = (mh1) obj2;
                i3t0.A(mh1Var, mh1Var.r, new o2j(mh1.E0, this.j), null, null, 6);
                c4m0 c4m0Var = mh1Var.p0;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    mh1Var.p0 = sac.T(new fnq(mh1Var.a0.f(), new vg1(mh1Var, objArr2 == true ? 1 : 0, b5), b2), d5c.S(jiu0.a(mh1Var), mh1Var.o.b), new pd(i, objArr == true ? 1 : 0, b3));
                }
                return Unit.f46060a;
            case 1:
                long j = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                IntRange intRange = n92.h0;
                p7m0 p7m0Var = ((n92) obj2).i.f25029a;
                while (true) {
                    Object value4 = p7m0Var.getValue();
                    value4.getClass();
                    long j2 = j;
                    if (p7m0Var.m(value4, d92.a((d92) value4, null, null, null, null, null, j, null, 1791))) {
                        return Unit.f46060a;
                    }
                    j = j2;
                }
                break;
            case 2:
                long j3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                long jAbs = Math.abs(j3);
                zu3 zu3Var = (zu3) obj2;
                ol60 ol60Var = zu3Var.h0;
                if (jAbs > 60) {
                    ony onyVar = ((qv00) zu3Var.O.get()).f29367a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("timeZoneDiff", ncy.c(String.valueOf(j3)));
                    ((rny) onyVar).a("TimeZoneDiff", new tny("event", xp20.n(linkedHashMap)));
                    ol60Var.f(st3.f32755a);
                } else {
                    ol60Var.f(et3.f8357a);
                }
                return Unit.f46060a;
            case 3:
                long j4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                tu7 tu7Var = (tu7) obj2;
                bby bbyVar = tu7Var.B;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                }
                yje yjeVar = null;
                if (j4 != ((pu7) tu7Var.D()).c) {
                    ehf0 ehf0Var = tu7Var.v;
                    tga0 tga0Var = ((uga0) ehf0Var.b).f35616a;
                    tga0Var.f33901a.clear();
                    tga0Var.b.clear();
                    ((hqp0) ehf0Var.c).f13495a.f44771a.o(null, nqp0.f23971a);
                }
                p7m0 p7m0Var2 = tu7Var.i.f25029a;
                while (true) {
                    Object value5 = p7m0Var2.getValue();
                    value5.getClass();
                    long j5 = j4;
                    if (p7m0Var2.m(value5, pu7.a((pu7) value5, null, null, j5, null, 11))) {
                        tu7Var.B = sac.i0(jiu0.a(tu7Var), tu7.class.getName().concat(".getBetsByPlayers"), 3, 0L, null, null, new hu3(tu7Var, j5, yjeVar, (byte) 3), null, null, new os5(tu7Var, (byte) 27), null, 732);
                        return Unit.f46060a;
                    }
                    j4 = j5;
                }
                break;
            case 4:
                long j6 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                s1c s1cVar = (s1c) obj2;
                long j7 = j6 / 1000;
                if (j7 == 0) {
                    s1cVar.y(v0c.f36574a);
                } else {
                    s1cVar.y(new u0c(j7));
                }
                return Unit.f46060a;
            case 5:
                long j8 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                svd svdVar = (svd) obj2;
                long j9 = j8 / 1000;
                p7m0 p7m0Var3 = svdVar.y;
                if (j9 == 0) {
                    sudVar = rud.f31121a;
                } else {
                    ctf0 ctf0Var = svdVar.g;
                    ctf0Var.getClass();
                    String str = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j9 / 60), Long.valueOf(j9 % 60)}, 2));
                    String strF = ctf0Var.f(R.string.restore_password_confirm_timer_v2, str);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int iV = StringsKt.V(strF, str, 0, false, 6);
                    spannableStringBuilder.append((CharSequence) strF).setSpan(new StyleSpan(1), iV, str.length() + iV, 33);
                    sudVar = new sud(spannableStringBuilder);
                }
                p7m0Var3.getClass();
                p7m0Var3.o(null, sudVar);
                return Unit.f46060a;
            case 6:
                long j10 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                g1e g1eVar = (g1e) obj2;
                long j11 = j10 / 1000;
                p7m0 p7m0Var4 = g1eVar.y;
                if (j11 <= 0) {
                    zzdVar = xzd.f41749a;
                } else {
                    ctf0 ctf0Var2 = g1eVar.n;
                    ctf0Var2.getClass();
                    String str2 = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 / 60), Long.valueOf(j11 % 60)}, 2));
                    String strF2 = ctf0Var2.f(R.string.restore_password_confirm_timer_v2, str2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    int iV2 = StringsKt.V(strF2, str2, 0, false, 6);
                    spannableStringBuilder2.append((CharSequence) strF2).setSpan(new StyleSpan(1), iV2, str2.length() + iV2, 33);
                    zzdVar = new zzd(spannableStringBuilder2);
                }
                p7m0Var4.getClass();
                p7m0Var4.o(null, zzdVar);
                g1eVar.H(g1eVar.B);
                return Unit.f46060a;
            case 7:
                long j12 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                anq0 anq0Var = (anq0) obj2;
                znq0 znq0Var = anq0Var.h;
                znq0 znq0Var2 = znq0Var != null ? new znq0(znq0Var.f44687a - j12) : null;
                if (!anq0Var.i) {
                    j12 = anq0Var.d;
                } else if (!anq0Var.j) {
                    j12 = anq0Var.g - j12;
                }
                return anq0.a(anq0Var, j12, znq0Var2, 887);
            case 8:
                long j13 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                r7f r7fVar = (r7f) obj2;
                long jA = r7fVar.k1.a();
                boolean z = j13 != jA;
                r7fVar.A1 = z;
                if (z) {
                    r7fVar.x(j13);
                    if (r7fVar.C1 == w4f.c) {
                        ((ave) r7fVar.j.f22172a.c).b = 0L;
                    }
                }
                b5 = (jA == 0 || Math.abs(j13 - jA) != 1) ? (byte) 0 : (byte) 1;
                ((vwb0) r7fVar.l1.f24624a.e).g("coupon_last_events_count", j13);
                if (b5 != 0) {
                    r7fVar.b0.b();
                }
                ArrayList arrayListI = r7fVar.I();
                if (r7fVar.i.a() == q4f.i && r7fVar.b.i() <= 1.0d) {
                    r7fVar.q0(arrayListI.indexOf(q4f.d), false);
                }
                return Unit.f46060a;
            case 9:
                long j14 = this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                Cs2GameLogBombTimerView cs2GameLogBombTimerView = (Cs2GameLogBombTimerView) obj2;
                long j15 = j14 / 1000;
                long j16 = j15 / 60;
                cs2GameLogBombTimerView.getBinding().c.setText(j16 + " : " + cs2GameLogBombTimerView.b.format(j15 - TimeUnit.MINUTES.toSeconds(j16)));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                e6j e6jVar = (e6j) obj2;
                e6jVar.u.b(wuo0.c.getId(), this.j);
                c4m0 c4m0Var2 = e6jVar.K;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    e6jVar.K = sac.T(new fnq(e6jVar.v.f(), new b6j(e6jVar, objArr4 == true ? 1 : 0, b5), b2), d5c.S(jiu0.a(e6jVar), e6jVar.q.c), new f1e(i, objArr3 == true ? 1 : 0, (byte) 15));
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                egk0 egk0Var = (egk0) obj2;
                long j17 = this.j;
                if (j17 > 59999000) {
                    j17 = 59999000;
                }
                egk0Var.m(j17);
                return Unit.f46060a;
            case 12:
                long j18 = this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                o5o.b(j18, (TextView) obj2);
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                Context applicationContext = ((ptc) obj2).f27557a.getApplicationContext();
                applicationContext.getClass();
                cpv0 cpv0VarD = cpv0.d(applicationContext);
                cpv0VarD.getClass();
                long j19 = this.j;
                sl50 sl50Var = sl50.f32381a;
                o4e o4eVar = new o4e(new hl50(null), sl50.f32381a, false, false, false, false, -1L, -1L, CollectionsKt.P0(new LinkedHashSet()));
                xl60 xl60Var = new xl60(FavoriteLocalNotificationWorker.class);
                uen uenVar = wen.b;
                long jW0 = ibc.w0(j19, bfn.MILLISECONDS);
                Duration durationOfSeconds = Duration.ofSeconds(wen.l(jW0, bfn.SECONDS), wen.f(jW0));
                durationOfSeconds.getClass();
                ((ppv0) xl60Var.c).g = ga3.L(durationOfSeconds);
                if (Long.MAX_VALUE - System.currentTimeMillis() <= ((ppv0) xl60Var.c).g) {
                    jf4.o("The given initial delay is too large and will cause an overflow!");
                    return null;
                }
                xl60 xl60Var2 = (xl60) xl60Var.g("FavoriteLocalNotificationWorker");
                ((ppv0) xl60Var2.c).j = o4eVar;
                cpv0VarD.c("FavoriteLocalNotificationWorker", zko.f44542a, (yl60) xl60Var2.k());
                return Unit.f46060a;
            case 14:
                long j20 = this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                if (j20 == 0) {
                    ((Function0) obj2).invoke();
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                z4w z4wVar = (z4w) obj2;
                if (this.j == 0) {
                    z4wVar.B();
                } else {
                    z4wVar.u.f(l4w.f19429a);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                qi00 qi00Var = (qi00) obj2;
                LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(((nj00) qi00Var.D()).e);
                long j21 = this.j;
                if (linkedHashSetO0.contains(new Long(j21))) {
                    linkedHashSetO0.remove(new Long(j21));
                } else {
                    linkedHashSetO0.add(new Long(j21));
                }
                p7m0 p7m0Var5 = qi00Var.i.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                } while (!p7m0Var5.m(value, nj00.a((nj00) value, null, null, null, null, CollectionsKt.P0(linkedHashSetO0), false, null, false, 495)));
                qi00Var.o.e("COLLAPSED_ITEMS_STATE_KEY", linkedHashSetO0);
                return Unit.f46060a;
            case 17:
                long j22 = this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var6 = ((h620) obj2).o0;
                Long l = new Long(j22);
                p7m0Var6.getClass();
                p7m0Var6.o(null, l);
                return Unit.f46060a;
            case 18:
                long j23 = this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var7 = ((x920) obj2).B;
                Long l2 = new Long(j23);
                p7m0Var7.getClass();
                p7m0Var7.o(null, l2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                qg20 qg20Var = (qg20) obj2;
                long j24 = this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                if (j24 != 0) {
                    p7m0 p7m0Var8 = qg20Var.p1;
                    Long l3 = new Long(j24);
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, l3);
                }
                bby bbyVar2 = qg20Var.M0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                qg20Var.Q(true);
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                m940 m940Var = (m940) obj2;
                m940Var.o.d(new bw20((Object) m940Var, (Object) mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200), this.j, 0L, 0L, null, false, false, false, 262142), (byte) 21));
                return Unit.f46060a;
            case 21:
                bv70 bv70Var = (bv70) obj2;
                long j25 = this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                if (j25 == 0) {
                    bv70Var.K.a(suy.a(((hu70) bv70Var.D()).t, wuy.f39812a, 0L, 0L, false, 8));
                }
                return Unit.f46060a;
            case 22:
                long j26 = this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                fgd0 fgd0Var = (fgd0) obj2;
                sac.V(jiu0.a(fgd0Var), egd0.f7759a, null, null, new wn10(fgd0Var, j26 / 1000, null, (byte) 11), 14);
                return Unit.f46060a;
            case 23:
                long j27 = this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                ((shd0) obj2).D(j27);
                return Unit.f46060a;
            case 24:
                long j28 = this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                e3b0 e3b0Var = new e3b0(b4, j28);
                int i2 = xxi0.Y0;
                ((xxi0) obj2).H(e3b0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                long j29 = this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                e3b0 e3b0Var2 = new e3b0(b3, j29);
                int i3 = odj0.V0;
                ((odj0) obj2).H(e3b0Var2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                long j30 = this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var9 = ((org.xplatform.settings.impl.presentation.a) obj2).X0;
                boolean z2 = ((caj0) p7m0Var9.getValue()).u;
                boolean z3 = Math.abs(j30) > 60;
                do {
                    value2 = p7m0Var9.getValue();
                } while (!p7m0Var9.m(value2, caj0.a((caj0) value2, false, !z2 && z3, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, z3, false, false, false, 31457277)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                long j31 = this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                e3b0 e3b0Var3 = new e3b0((byte) 8, j31);
                int i4 = ngj0.Y0;
                ((ngj0) obj2).H(e3b0Var3);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                long j32 = this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                long j33 = j32 / 1000;
                int i5 = fdk0.y;
                p7m0 p7m0Var10 = ((fdk0) obj2).i.f25029a;
                do {
                    value3 = p7m0Var10.getValue();
                    value3.getClass();
                } while (!p7m0Var10.m(value3, cdk0.a((cdk0) value3, null, null, null, false, false, j33 == 0 ? vck0.f37191a : new wck0(j33), false, 24575)));
                return Unit.f46060a;
            default:
                long j34 = this.j;
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                IntRange intRange2 = tpk0.Z;
                p7m0 p7m0Var11 = ((tpk0) obj2).i.f25029a;
                while (true) {
                    Object value6 = p7m0Var11.getValue();
                    value6.getClass();
                    long j35 = j34;
                    if (p7m0Var11.m(value6, jpk0.a((jpk0) value6, null, null, null, j35, null, false, 2015))) {
                        return Unit.f46060a;
                    }
                    j34 = j35;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg1(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.j = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg1(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
