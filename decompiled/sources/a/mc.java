package a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.javax.sip.message.Response;
import android.view.KeyEvent;
import androidx.collection.MutableIntList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorJackpotBottomSheetParams;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.results.impl.presentation.dialogs.results.params.SelectDateScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21528a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mc(vq vqVar, Fragment fragment, ms2 ms2Var) {
        this.f21528a = (byte) 3;
        this.b = vqVar;
        this.c = ms2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        tai0 tai0Var;
        e7z e7zVar;
        byte b = this.f21528a;
        int i = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Function1) obj2).invoke(new jc(((gc) obj).f11035a));
                return Unit.f46060a;
            case 1:
                ((v6d0) obj2).invoke((rl) obj);
                return Unit.f46060a;
            case 2:
                ((Function1) obj2).invoke(((fm) ((hm) obj)).b.f44861a.a());
                return Unit.f46060a;
            case 3:
                ((vq) obj2).g((ms2) obj, aao.c);
                return Unit.f46060a;
            case 4:
                tnp0 tnp0Var = (tnp0) obj;
                m0o0 m0o0Var = (m0o0) ((es) obj2).f8305a;
                tnp0Var.getClass();
                xcp xcpVar = new xcp(tnp0Var.a(), tnp0Var, "", "", 0L, iun.f15405a, 0, false, "");
                abp abpVar = m0o0Var.b;
                abpVar.getClass();
                p7m0 p7m0Var = abpVar.c;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new iap(CollectionsKt.r0(abp.e((kap) value), xcpVar))));
                return Unit.f46060a;
            case 5:
                ((Function1) obj2).invoke(((rx) obj).d);
                return Unit.f46060a;
            case 6:
                ((Function1) obj2).invoke((fc0) obj);
                return Unit.f46060a;
            case 7:
                ((Function1) obj2).invoke(new el0(((xl0) obj).c));
                return Unit.f46060a;
            case 8:
                gfk0 gfk0Var = uu0.o2;
                ((k3t0) ((uu0) obj2).n2.getValue()).x(new ru0(((pu0) obj).b));
                return Unit.f46060a;
            case 9:
                return new wu0((String) obj2, av0.d, ((iqt) obj).f15225a.a());
            case 10:
                ((Function1) obj2).invoke(new ey0(((ly0) obj).d));
                return Unit.f46060a;
            case 11:
                ctf0 ctf0Var = (ctf0) obj2;
                String strA = ctf0Var.b.a(R.string.aggregator_jackpot_dialog_title, Arrays.copyOf(new Object[0], 0));
                String strK = kng0.k("€ ", ((AggregatorJackpotBottomSheetParams) obj).f46275a);
                lsm0 lsm0Var = ctf0Var.b;
                String strA2 = lsm0Var.a(R.string.aggregator_jackpot_dialog_description, Arrays.copyOf(new Object[0], 0));
                String strA3 = lsm0Var.a(R.string.take_part, Arrays.copyOf(new Object[0], 0));
                String strA4 = lsm0Var.a(R.string.later, Arrays.copyOf(new Object[0], 0));
                List list = u0d.f34849a;
                return new b41(strA, strK, strA2, strA3, strA4, new n0x(u0d.q("/static/img/android/casino/jackpot/jackpot_bottom.webp")));
            case 12:
                ((Function1) obj2).invoke((ayq0) obj);
                return Unit.f46060a;
            case 13:
                String str = (String) obj2;
                rek0 rek0Var = cb1.e2;
                gfk0 gfk0Var2 = uu0.o2;
                androidx.fragment.app.e eVarC = ((cb1) obj).C();
                eVarC.getClass();
                gfk0Var2.getClass();
                str.getClass();
                if (eVarC.J("AggregatorSelectGameModeDialog") == null) {
                    uu0 uu0Var = new uu0();
                    iiy[] iiyVarArr = uu0.p2;
                    uu0Var.k2.x(uu0Var, iiyVarArr[0], str);
                    uu0Var.l2.x(uu0Var, iiyVarArr[1], "SELECT_GAME_MODE_REQUEST_KEY");
                    uu0Var.H0(eVarC, "AggregatorSelectGameModeDialog");
                }
                return Unit.f46060a;
            case 14:
                mh1 mh1Var = (mh1) obj2;
                mh1Var.D.a(false);
                s91 s91Var = mh1Var.C;
                int i2 = ((pf1) mh1Var.D()).p;
                int i3 = ((pf1) mh1Var.D()).q;
                int iOrdinal = ((d7v) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                    } else {
                        i = 1;
                    }
                }
                s91Var.c(new AggregatorScreenModel(null, null, 0L, new dm1(i2, i3, i, !((pf1) mh1Var.D()).r), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                return Unit.f46060a;
            case 15:
                ((Function1) obj2).invoke(new ym1(((gn1) obj).e));
                return Unit.f46060a;
            case 16:
                tr1 tr1Var = (tr1) obj;
                ((Function2) obj2).invoke(Long.valueOf(tr1Var.f34402a), tr1Var.b);
                return Unit.f46060a;
            case 17:
                ((Function1) obj2).invoke(((r02) obj).f29607a);
                return Unit.f46060a;
            case 18:
                pek0 pek0Var = w62.Q1;
                zie0 zie0Var = x1i0.n2;
                androidx.fragment.app.e eVarC2 = ((w62) obj2).C();
                eVarC2.getClass();
                SelectDateScreenParams selectDateScreenParams = new SelectDateScreenParams(((z62) ((b72) obj)).f43844a, "SELECT_DATE_TIME_REQUEST_KEY");
                zie0Var.getClass();
                zie0.g(eVarC2, selectDateScreenParams);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rek0 rek0Var2 = ia2.Q1;
                zie0 zie0Var2 = x1i0.n2;
                androidx.fragment.app.e eVarC3 = ((ia2) obj2).C();
                eVarC3.getClass();
                SelectDateScreenParams selectDateScreenParams2 = new SelectDateScreenParams(((ua2) ((va2) obj)).f35310a, "SELECT_DATE_TIME_REQUEST_KEY");
                zie0Var2.getClass();
                zie0.g(eVarC3, selectDateScreenParams2);
                return Unit.f46060a;
            case 20:
                hfk0 hfk0Var = ef2.V1;
                zie0 zie0Var3 = x1i0.n2;
                androidx.fragment.app.e eVarC4 = ((ef2) obj2).C();
                eVarC4.getClass();
                SelectDateScreenParams selectDateScreenParams3 = new SelectDateScreenParams((Date) obj, "SELECT_DATE_TIME_REQUEST_KEY");
                zie0Var3.getClass();
                zie0.g(eVarC4, selectDateScreenParams3);
                return Unit.f46060a;
            case 21:
                g2v g2vVar = (g2v) obj2;
                iun iunVar = iun.f15405a;
                pb10 pb10Var = pb10.g;
                mdm mdmVarB = g2v.b(g2vVar, pb10Var, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                pdm pdmVar = pdm.b;
                return new xm2(true, false, false, iunVar, iunVar, iunVar, mdmVarB, g2v.b(g2vVar, pb10Var, pdmVar, null, R.drawable.ic_glyph_circle_book, R.string.viewed_empty_title, R.string.viewed_empty_subtitle, 0, 0, 0L, 0L, 964), g2v.b(g2vVar, pb10Var, pdmVar, null, R.drawable.ic_glyph_circle_book, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 980), null, true, true, ((svu) obj).l(), false, false, false, false);
            case 22:
                return Boolean.valueOf(AndroidComposeView.g((AndroidComposeView) obj2, (KeyEvent) obj));
            case 23:
                pah0 pah0Var = (pah0) obj2;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj;
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                t9h0 t9h0Var = pah0Var.e;
                t9h0 t9h0Var2 = pah0Var.f;
                Float f = pah0Var.c;
                Float f2 = pah0Var.d;
                float fFloatValue = (t9h0Var == null || f == null) ? 0.0f : ((Number) t9h0Var.f33563a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (t9h0Var2 == null || f2 == null) ? 0.0f : ((Number) t9h0Var2.f33563a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = androidComposeViewAccessibilityDelegateCompat.A(pah0Var.f26654a);
                    vai0 vai0Var = (vai0) androidComposeViewAccessibilityDelegateCompat.s().b(androidComposeViewAccessibilityDelegateCompat.k);
                    if (vai0Var != null) {
                        try {
                            k7 k7Var = androidComposeViewAccessibilityDelegateCompat.m;
                            if (k7Var != null) {
                                k7Var.i(androidComposeViewAccessibilityDelegateCompat.k(vai0Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    vai0 vai0Var2 = (vai0) androidComposeViewAccessibilityDelegateCompat.s().b(androidComposeViewAccessibilityDelegateCompat.l);
                    if (vai0Var2 != null) {
                        try {
                            k7 k7Var2 = androidComposeViewAccessibilityDelegateCompat.n;
                            if (k7Var2 != null) {
                                k7Var2.i(androidComposeViewAccessibilityDelegateCompat.k(vai0Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    androidComposeViewAccessibilityDelegateCompat.d.invalidate();
                    vai0 vai0Var3 = (vai0) androidComposeViewAccessibilityDelegateCompat.s().b(iA);
                    if (vai0Var3 != null && (tai0Var = vai0Var3.f37089a) != null && (e7zVar = tai0Var.c) != null) {
                        if (t9h0Var != null) {
                            androidComposeViewAccessibilityDelegateCompat.p.j(iA, t9h0Var);
                        }
                        if (t9h0Var2 != null) {
                            androidComposeViewAccessibilityDelegateCompat.q.j(iA, t9h0Var2);
                        }
                        androidComposeViewAccessibilityDelegateCompat.w(e7zVar);
                    }
                }
                if (t9h0Var != null) {
                    pah0Var.c = (Float) t9h0Var.f33563a.invoke();
                }
                if (t9h0Var2 != null) {
                    pah0Var.d = (Float) t9h0Var2.f33563a.invoke();
                }
                return Unit.f46060a;
            case 24:
                ((mie0) obj2).f21842a = ((Function0) obj).invoke();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((htb) obj2).f(obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((ij3) obj2).z((g8d) obj, null);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ApplicationActivity applicationActivity = (ApplicationActivity) obj2;
                String str2 = (String) obj;
                int i4 = ApplicationActivity.F1;
                Object systemService = applicationActivity.getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                ClipData clipDataNewPlainText = ClipData.newPlainText(applicationActivity.getResources().getString(R.string.push_info), str2);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(clipDataNewPlainText);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) obj2).invoke(Integer.valueOf(((ra4) obj).b));
                return Unit.f46060a;
            default:
                Function0 function0 = (Function0) obj;
                if (((Boolean) ((l7m0) obj2).getValue()).booleanValue()) {
                    function0.invoke();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ mc(Object obj, Object obj2, byte b) {
        this.f21528a = b;
        this.b = obj;
        this.c = obj2;
    }
}
