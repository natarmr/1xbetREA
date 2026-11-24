package a;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.wifi.WifiConfiguration;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.FileProvider;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTab;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;
import org.xplatform.uikit.components.cells.DsMenuCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rai0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30135a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rai0(Object obj, byte b) {
        this.f30135a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object g0g0Var;
        Object value2;
        Object value3;
        cdk0 cdk0Var;
        String message;
        SpecialEventTab specialEventTab;
        List list;
        SpecialEventTab specialEventTab2;
        byte b = this.f30135a;
        byte b2 = 6;
        byte b3 = 4;
        byte b4 = 3;
        boolean z = false;
        byte b5 = 2;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                yai0.e((abi0) obj, ((ucg0) obj2).f35427a);
                return Unit.f46060a;
            case 1:
                ((List) obj).add((Float) ((ccz) obj2).invoke());
                return true;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p7m0 p7m0Var = ((ldi0) obj2).H;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, uci0.a((uci0) value, false, false, false, false, null, false, zBooleanValue, 2047)));
                return Unit.f46060a;
            case 3:
                IntRange intRange = (IntRange) obj2;
                kls0 kls0Var = (kls0) obj;
                kls0Var.getClass();
                for (int i : kls0Var.f18507a) {
                    if (intRange.b(i)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                jiy jiyVar = (jiy) obj2;
                ((List) obj).getClass();
                return jiyVar;
            case 5:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                FrameLayout frameLayout = ((djj0) cpVar.u).f6189a;
                frameLayout.getClass();
                dyb.O(frameLayout, new huh0((uki0) obj2, cpVar, b4));
                cpVar.t(new ui80(cpVar, (byte) 25));
                return Unit.f46060a;
            case 6:
                lmi0 lmi0Var = (lmi0) obj2;
                ((Throwable) obj).getClass();
                if (lmi0Var.i) {
                    lmi0Var.c();
                }
                return Unit.f46060a;
            case 7:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ((exx) cpVar2.u).b.setOnCheckedChangeListener(new okv(b5, (lma0) obj2, cpVar2));
                cpVar2.t(new ctv(cpVar2, cpVar2, (byte) 22));
                return Unit.f46060a;
            case 8:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                o0x o0xVar = ((nui0) obj2).c;
                cbi0.c(abi0Var, o0xVar instanceof m0x ? ((m0x) o0xVar).f20977a : 0);
                return Unit.f46060a;
            case 9:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                gle0 gle0Var = ((i0j0) obj2).o;
                RuleData ruleData = new RuleData("rules_odds_type", 14, (Map) null, (String) null);
                gle0Var.getClass();
                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.info, false, false, false));
                return Unit.f46060a;
            case 10:
                ((vzg0) obj).getClass();
                return new f0j0(((k7u) obj2).f17841a.b(), CollectionsKt.L0(jvn.i));
            case 11:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                ((nxx) cpVar3.u).d.setOnCheckedChangeListener(new okv(cpVar3, (q1j0) obj2));
                cpVar3.t(new ctv(cpVar3, cpVar3, (byte) 29));
                return Unit.f46060a;
            case 12:
                njj0 njj0Var = (njj0) obj2;
                uag0 uag0Var = (uag0) obj;
                uag0Var.C(uag0Var.t.getDensity() * njj0Var.b);
                uag0Var.D(njj0Var.c);
                uag0Var.g(njj0Var.d);
                uag0Var.c(njj0Var.e);
                uag0Var.F(njj0Var.f);
                return Unit.f46060a;
            case 13:
                umj0 umj0Var = (umj0) obj2;
                qnj0 qnj0Var = (qnj0) obj;
                lme0 lme0Var = umj0.S1;
                qnj0Var.getClass();
                if (!qnj0Var.equals(mnj0.f22092a)) {
                    if (qnj0Var instanceof onj0) {
                        onj0 onj0Var = (onj0) qnj0Var;
                        Uri uri = onj0Var.f25549a;
                        String str = onj0Var.b;
                        g760 g760Var = new g760(umj0Var.o0(), onj0Var.c);
                        g760Var.s.icon = R.drawable.ic_save;
                        g760Var.e = g760.b(umj0Var.H(R.string.download_completed_text));
                        g760Var.f = g760.b(str);
                        g760Var.j = 0;
                        g760Var.c(true);
                        g760Var.g = sj3.u0(umj0Var.o0(), uri);
                        o760 o760Var = new o760(umj0Var.o0());
                        f1e0.f8761a.getClass();
                        o760Var.a(f1e0.b.b(), g760Var.a());
                        String strH = umj0Var.H(R.string.download_completed_text);
                        strH.getClass();
                        umj0.H0(umj0Var, strH, null, 2);
                    } else if (qnj0Var instanceof nnj0) {
                        File file = ((nnj0) qnj0Var).f23825a;
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            Uri uriC = FileProvider.c(umj0Var.o0(), file, "org.xbet.client1.provider");
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("image/*");
                            intent.putExtra("android.intent.extra.STREAM", uriC);
                            intent.setClipData(ClipData.newRawUri(null, uriC));
                            intent.addFlags(1);
                            umj0Var.w0(Intent.createChooser(intent, null));
                            g0g0Var = Unit.f46060a;
                        } catch (Throwable th) {
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                        Throwable thA = j0g0.a(g0g0Var);
                        if (thA != null) {
                            umj0Var.G0().x(new gmj0(thA));
                        }
                    } else {
                        if (!(qnj0Var instanceof pnj0)) {
                            t9f.b();
                            return null;
                        }
                        pnj0 pnj0Var = (pnj0) qnj0Var;
                        umj0.H0(umj0Var, pnj0Var.f27291a, pnj0Var.b, 4);
                    }
                    break;
                } else {
                    qog0 qog0Var = (qog0) umj0Var.Q1.getValue();
                    lz9 lz9Var = new lz9(qog0Var, umj0Var, b2);
                    qog0Var.getClass();
                    qog0Var.f29072a.add(lz9Var);
                    qog0Var.a();
                }
                umj0Var.G0().x(fmj0.f9785a);
                return Unit.f46060a;
            case 14:
                eoj0 eoj0Var = (eoj0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = eoj0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    eoj0Var.f.getClass();
                } while (!p7m0Var2.m(value2, rnj0.a((rnj0) value2, null, false, true, false, 9)));
                return Unit.f46060a;
            case 15:
                hoj0 hoj0Var = (hoj0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var3 = hoj0Var.n;
                hm00 hm00Var = new hm00(sa10.b(hoj0Var.g, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                p7m0Var3.getClass();
                p7m0Var3.o(null, hm00Var);
                return Unit.f46060a;
            case 16:
                zie0 zie0Var = jvj0.W1;
                ((View) obj).getClass();
                xxj0 xxj0VarJ0 = ((jvj0) obj2).J0();
                ms2 ms2Var = xxj0VarJ0.O;
                if (ms2Var instanceof ds2) {
                    g1x.v((ds2) ms2Var);
                } else {
                    kpb.v0(ms2Var);
                }
                ((kt2) xxj0VarJ0.S.b).c("bet_avance_responce");
                xxj0VarJ0.X.f40143a.a(xun.f41520a, 3166L);
                sac.V(jiu0.a(xxj0VarJ0), new iwj0(xxj0VarJ0, b3), new goi0(xxj0VarJ0, b2), xxj0VarJ0.d.b, new ze1(xxj0VarJ0, null), 8);
                return Unit.f46060a;
            case 17:
                gyj0 gyj0Var = (gyj0) obj2;
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.w(gyj0Var.o);
                uag0Var2.y(gyj0Var.p);
                uag0Var2.b(gyj0Var.q);
                uag0Var2.H(gyj0Var.r);
                uag0Var2.I(gyj0Var.s);
                uag0Var2.C(gyj0Var.t);
                uag0Var2.m(gyj0Var.u);
                uag0Var2.n(gyj0Var.v);
                uag0Var2.v(gyj0Var.w);
                float f = gyj0Var.x;
                if (uag0Var2.m != f) {
                    uag0Var2.f35327a |= 2048;
                    uag0Var2.m = f;
                }
                uag0Var2.G(gyj0Var.y);
                uag0Var2.D(gyj0Var.z);
                uag0Var2.g(gyj0Var.A);
                uag0Var2.j(gyj0Var.B);
                uag0Var2.c(gyj0Var.Y);
                uag0Var2.F(gyj0Var.Z);
                uag0Var2.h(gyj0Var.f1);
                uag0Var2.e(gyj0Var.g1);
                a4d a4dVar = gyj0Var.h1;
                if (!Intrinsics.d(uag0Var2.w, a4dVar)) {
                    uag0Var2.f35327a |= 262144;
                    uag0Var2.w = a4dVar;
                }
                z5z z5zVar = gyj0Var.i1;
                if (!Intrinsics.d(uag0Var2.s, z5zVar)) {
                    uag0Var2.f35327a |= 1048576;
                    uag0Var2.s = z5zVar;
                }
                return Unit.f46060a;
            case 18:
                c4k0 c4k0Var = (c4k0) obj2;
                jbi0 jbi0Var = c4k0Var.g;
                jbi0Var.getClass();
                if (!Intrinsics.d(c4k0Var.g, jbi0Var)) {
                    dsb0.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                iz40 iz40Var = c4k0Var.f;
                Object obj3 = c4k0Var.d;
                if (iz40Var != null) {
                    if (obj3 != null) {
                        dsb0.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    iz40Var.a(obj);
                } else if (obj3 == null) {
                    c4k0Var.d = obj;
                } else {
                    iz40 iz40Var2 = v1h0.f36630a;
                    iz40 iz40Var3 = new iz40();
                    iz40Var3.a(obj3);
                    iz40Var3.a(obj);
                    c4k0Var.f = iz40Var3;
                    c4k0Var.d = null;
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(((q9k0) obj2).b(obc.J(((mu40) obj).e)));
            case 20:
                ecr ecrVar = (ecr) obj2;
                xck0 xck0Var = (xck0) obj;
                xck0Var.getClass();
                if (xck0Var instanceof wck0) {
                    ctf0 ctf0Var = ecrVar.b;
                    long j = ((wck0) xck0Var).f38928a;
                    return ctf0Var.b.a(R.string.sms_code_resend_timer_title, Arrays.copyOf(new Object[]{String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2))}, 1));
                }
                if (xck0Var.equals(vck0.f37191a)) {
                    return null;
                }
                t9f.b();
                return null;
            case 21:
                fdk0 fdk0Var = (fdk0) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.FailedCheckSmsCode) {
                    p7m0 p7m0Var4 = fdk0Var.i.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                        cdk0Var = (cdk0) value3;
                        fdk0Var.f.getClass();
                        message = th2.getMessage();
                        if (message == null) {
                            message = "";
                        }
                    } while (!p7m0Var4.m(value3, cdk0.a(cdk0Var, null, message, null, false, true, null, false, 26615)));
                } else {
                    fdk0Var.v.b(th2, new edk0(fdk0Var, false ? (byte) 1 : (byte) 0));
                }
                return Unit.f46060a;
            case 22:
                pgk0 pgk0Var = (pgk0) obj2;
                synchronized (pgk0Var.g) {
                    ogk0 ogk0Var = pgk0Var.i;
                    ogk0Var.getClass();
                    Object obj4 = ogk0Var.b;
                    obj4.getClass();
                    int i2 = ogk0Var.d;
                    ry40 ry40Var = ogk0Var.c;
                    if (ry40Var == null) {
                        ry40Var = new ry40();
                        ogk0Var.c = ry40Var;
                        ogk0Var.f.n(obj4, ry40Var);
                    }
                    ogk0Var.b(obj, i2, obj4, ry40Var);
                }
                return Unit.f46060a;
            case 23:
                try {
                    return ((Field) obj2).get((WifiConfiguration) obj);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            case 24:
                qe9 qe9Var = (qe9) obj2;
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                iiy[] iiyVarArr = cbi0.f4063a;
                qe9Var.getClass();
                zai0 zai0Var = cbi0.g;
                iiy iiyVar = cbi0.f4063a[5];
                zai0Var.getClass();
                abi0Var2.b(zai0Var, qe9Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                cbi0.c(abi0Var3, ((bhk0) obj2).b);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uag0 uag0Var3 = (uag0) obj;
                zie0 zie0Var2 = fpk0.V1;
                uag0Var3.getClass();
                uag0Var3.g(true);
                uag0Var3.D((yjt) obj2);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                jpk0 jpk0Var = (jpk0) obj2;
                lwk0 lwk0Var = (lwk0) obj;
                lwk0Var.getClass();
                int i3 = jpk0Var.f16907a;
                String str2 = jpk0Var.b;
                SpecialEventTab.Schedule schedule = SpecialEventTab.Schedule.c;
                str2.getClass();
                List<SpecialEventTabs> list2 = lwk0Var.b;
                int iIndexOf = list2.indexOf(lwk0Var.f20768a);
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                for (SpecialEventTabs specialEventTabs : list2) {
                    int iOrdinal = specialEventTabs.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            specialEventTab2 = SpecialEventTab.MyGames.c;
                        } else if (iOrdinal == 2) {
                            specialEventTab2 = SpecialEventTab.Statistic.c;
                        } else {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            specialEventTab2 = SpecialEventTab.Tournament.c;
                        }
                        specialEventTab = specialEventTab2;
                    } else {
                        specialEventTab = schedule;
                    }
                    boolean zEquals = specialEventTab.equals(schedule);
                    int iOrdinal2 = specialEventTabs.ordinal();
                    if (iOrdinal2 == 0) {
                        list = lwk0Var.d;
                    } else if (iOrdinal2 == 1) {
                        list = lwk0Var.e;
                    } else if (iOrdinal2 == 2) {
                        list = lwk0Var.f;
                    } else {
                        if (iOrdinal2 != 3) {
                            t9f.b();
                            return null;
                        }
                        list = lwk0Var.g;
                    }
                    arrayList.add(new SpecialEventTabScreenParams(i3, str2, specialEventTab, zEquals, list));
                }
                return new kwk0(iIndexOf, arrayList);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                DsMenuCell dsMenuCell = ((rok0) cpVar4.u).f30843a;
                dsMenuCell.getClass();
                dyb.c0(dsMenuCell, new huh0((wma0) obj2, cpVar4, (byte) 24));
                cpVar4.t(new kzi0(cpVar4, (byte) 8));
                return Unit.f46060a;
            default:
                ((rok0) obj2).b.setImageDrawable((Drawable) obj);
                return Unit.f46060a;
        }
    }
}
