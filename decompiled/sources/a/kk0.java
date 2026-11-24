package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Property;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18412a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kk0(vgg vggVar, String str, hhq0 hhq0Var) {
        this.f18412a = (byte) 24;
        this.b = vggVar;
        this.d = str;
        this.c = hhq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        jge0 jge0Var;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        byte b = this.f18412a;
        byte b2 = 0;
        byte b3 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((kb0) obj3).v(((myr0) obj2).f22617a, (String) obj);
                return Unit.f46060a;
            case 1:
                bv0 bv0Var = (bv0) obj3;
                return new jw0(bv0Var.f3259a, bv0Var.b, bv0Var.c, bv0Var.d, bv0Var.e, bv0Var.f, ((j1q0) obj2).f15748a.b(), false, false, false, ((bzt) obj).f3488a.a().X, new ax0(null, null));
            case 2:
                return Boolean.valueOf(vw0.d((vw0) obj3, (WebView) obj2, (String) obj));
            case 3:
                return Boolean.valueOf(vw0.e((vw0) obj3, (WebView) obj2, (WebResourceRequest) obj));
            case 4:
                mum0 mum0Var = ((pru) obj3).a().g;
                v5l0 v5l0Var = mum0Var.y;
                h8l0 h8l0Var = mum0Var.v;
                zvh0 zvh0Var = mum0Var.x;
                iun iunVar = iun.f15405a;
                ygp ygpVar = ygp.t;
                j1q0 j1q0Var = ((r9u) obj2).f30104a;
                j1q0Var.getClass();
                return new ce2("", false, qhe.f28733a, v5l0Var, h8l0Var, zvh0Var, 0, false, iunVar, (y78) obj, null, false, false, j1q0Var.f15748a.d(ygpVar));
            case 5:
                View view = (View) obj3;
                view.setTranslationY(0.0f);
                view.setAlpha(0.0f);
                view.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.8f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.8f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.addListener(unh0.h0((clz) obj2, null, new tq((Function0) obj, (byte) 5), 11));
                animatorSet.setDuration(400L);
                animatorSet.setInterpolator(new f0p((byte) 1));
                animatorSet.start();
                return Unit.f46060a;
            case 6:
                ((pa5) obj3).a();
                a14 a14Var = (a14) ((gr00) obj2).c;
                int i2 = ((kie0) obj).f18333a;
                do {
                    i = a14Var.get();
                } while (!a14Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
                return Unit.f46060a;
            case 7:
                oyq0 oyq0Var = (oyq0) obj3;
                imm immVar = (imm) obj2;
                imm immVar2 = (imm) obj;
                float fL = oyq0Var.c.l();
                float f = oyq0Var.f26070a;
                return (fL != f || f == 0.0f) ? immVar2 : immVar;
            case 8:
                Intent intent = (Intent) obj3;
                dz5 dz5Var = (dz5) obj2;
                Context context = (Context) obj;
                long longExtra = intent.getLongExtra("selected_game_id", -1L);
                if (longExtra == -1) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("widget_shared_prefs", 0);
                    sharedPreferences.getClass();
                    longExtra = sharedPreferences.getLong("widget_selected_game_id", -1L);
                }
                long longExtra2 = intent.getLongExtra("selected_sub_game_id", 0L);
                boolean booleanExtra = intent.getBooleanExtra("is_live", true);
                long longExtra3 = intent.getLongExtra("sportId", 0L);
                long longExtra4 = intent.getLongExtra("subSportId", 0L);
                long longExtra5 = intent.getLongExtra("champ_id", 0L);
                boolean booleanExtra2 = intent.getBooleanExtra("favorite", false);
                if (longExtra == -1) {
                    return Unit.f46060a;
                }
                dz5Var.o(longExtra3, longExtra4, longExtra5, booleanExtra, booleanExtra2);
                Intent intentQ = j120.Q(context);
                if (intentQ != null) {
                    Intent intentAddCategory = intentQ.putExtra("sportId", longExtra3).putExtra("subSportId", longExtra4).putExtra("is_live", booleanExtra).putExtra("selected_game_id", longExtra).putExtra("selected_sub_game_id", longExtra2).addCategory("CUSTOM_INTENT");
                    intentAddCategory.getClass();
                    context.startActivity(intentAddCategory);
                }
                return Unit.f46060a;
            case 9:
                bxq0 bxq0Var = (bxq0) obj3;
                vne vneVar = (vne) obj2;
                pz40 pz40Var = (pz40) obj;
                if (bxq0Var.b()) {
                    qjj.W(vneVar, null, null, new wa(bxq0Var, null, (byte) 19), 3);
                    pz40Var.setValue(Boolean.FALSE);
                }
                return Unit.f46060a;
            case 10:
                sbx0 sbx0Var = (sbx0) obj3;
                r9u r9uVar = (r9u) obj;
                iun iunVar2 = iun.f15405a;
                String str = (String) sbx0Var.d;
                String str2 = (String) sbx0Var.e;
                int i3 = sbx0Var.b;
                String str3 = (String) sbx0Var.c;
                v5l0 v5l0Var2 = ((pru) obj2).a().g.y;
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new zp7(iunVar2, true, false, true, str, str2, i3, str3, v5l0Var2, j1q0Var2.f15748a.d(ygpVar2));
            case 11:
                ((Function1) obj3).invoke(new uh8(((fh8) ((jh8) obj2)).b, (String) obj));
                dyb.u0();
                return Boolean.TRUE;
            case 12:
                boolean zA = ((k9c) obj3).a();
                boolean zC = ((m1e) obj2).c();
                boolean z = ((pru) obj).a().d.f27973a.g;
                je8 je8Var = je8.ALL;
                csr csrVar = csr.e;
                iun iunVar3 = iun.f15405a;
                return new kl8(zA, zC, u3t.f35014a, je8Var, csrVar, true, false, iunVar3, iunVar3, false, iunVar3, new ql5(-1L, 0.0d, false, false, 0L, "", "", 0, txs0.d, "", "", false, ""), false, kg.PRIMARY, false, z);
            case 13:
                g39 g39Var = (g39) obj3;
                jge0 jge0VarZ0 = g39.Z0(g39Var, (s460) obj2, (gj4) obj);
                if (jge0VarZ0 == null) {
                    return null;
                }
                nee neeVar = g39Var.o;
                if (qkx.a(neeVar.v, -1L)) {
                    adx.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return jge0VarZ0.m(neeVar.d1(jge0VarZ0, neeVar.a1(), 0L) ^ (-9223372034707292160L));
            case 14:
                BroadcastingZoneLandscapeParams broadcastingZoneLandscapeParams = (BroadcastingZoneLandscapeParams) obj3;
                long j = broadcastingZoneLandscapeParams.f46690a;
                long j2 = broadcastingZoneLandscapeParams.b;
                int i4 = broadcastingZoneLandscapeParams.c;
                long j3 = broadcastingZoneLandscapeParams.d;
                String strA = ((bdu) obj2).a();
                String strA2 = ((wgu) obj).a();
                w3w0 w3w0Var = w3w0.b;
                return new o79(j, j2, i4, j3, strA, strA2, false, false, false, false, w3w0Var, w3w0Var, false, true, "");
            case 15:
                ((zfb) obj3).z(((kie0) obj2).f18333a, (lk50) obj);
                return Unit.f46060a;
            case 16:
                qjj.W((vne) obj3, null, null, new nbd((pz40) obj, null, b2), 3);
                ((dk5) obj2).O();
                return Unit.f46060a;
            case 17:
                k6z k6zVar = (k6z) obj;
                mcz mczVarJ = ((xcz) obj3).j();
                float fW0 = ((w6k) obj2).w0(36.0f);
                ncz nczVar = (ncz) CollectionsKt.firstOrNull(mczVarJ.l);
                if (nczVar == null || nczVar.f23317a != 0) {
                    nczVar = null;
                }
                ncz nczVar2 = (ncz) CollectionsKt.f0(mczVarJ.l);
                ncz nczVar3 = (nczVar2 == null || nczVar2.f23317a != mczVarJ.o - 1) ? null : nczVar2;
                float fC = nczVar != null ? l1e0.c((mczVarJ.m - nczVar.p) / fW0, 0.0f, 1.0f) : 1.0f;
                float fC2 = nczVar3 != null ? l1e0.c(((nczVar3.p + nczVar3.q) - mczVarJ.n) / fW0, 0.0f, 1.0f) : 1.0f;
                return k6zVar == k6z.b ? new Pair(Float.valueOf(fC2), Float.valueOf(fC)) : new Pair(Float.valueOf(fC), Float.valueOf(fC2));
            case 18:
                pjd pjdVar = (pjd) obj;
                e720 e720Var = ((ujd) obj3).c;
                androidx.fragment.app.e eVarC = ((Fragment) obj2).C();
                eVarC.getClass();
                e720Var.b(eVarC, pjdVar.b, pjdVar.f27084a, pjdVar.c);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                CertificateChainCleaner certificateChainCleaner = ((CertificatePinner) obj3).b;
                certificateChainCleaner.getClass();
                return certificateChainCleaner.a(((Address) obj).i.d, ((Handshake) obj2).a());
            case 20:
                nee neeVar2 = (nee) obj3;
                aht0 aht0Var = (aht0) obj2;
                j39 j39Var = (j39) obj;
                h03 h03Var = neeVar2.t;
                while (true) {
                    xz40 xz40Var = (xz40) h03Var.b;
                    int i5 = xz40Var.c;
                    if (i5 != 0) {
                        if (i5 == 0) {
                            v4i0.o("MutableVector is empty.");
                            return null;
                        }
                        jge0 jge0Var2 = (jge0) ((lee) xz40Var.f41739a[i5 - 1]).f19897a.invoke();
                        if (jge0Var2 == null ? true : nee.b1(neeVar2, jge0Var2, 0L, 0L, 3)) {
                            xz40 xz40Var2 = (xz40) h03Var.b;
                            n5a n5aVar = ((lee) xz40Var2.k(xz40Var2.c - 1)).b;
                            Unit unit = Unit.f46060a;
                            e0g0 e0g0Var = j0g0.b;
                            n5aVar.resumeWith(unit);
                        }
                    }
                }
                if (neeVar2.u && (jge0Var = (jge0) neeVar2.s.invoke()) != null && nee.b1(neeVar2, jge0Var, 0L, 0L, 3)) {
                    neeVar2.u = false;
                }
                aht0Var.e = neeVar2.Z0(j39Var, 0L);
                return Unit.f46060a;
            case 21:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0((Executor) obj3, (ybf) obj2, (mie0) obj);
            case 22:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0((Exception) obj3, (Executor) obj2, (ybf) obj);
            case 23:
                return new prs0(((pz40) obj3).getValue(), ((pz40) obj2).getValue(), ((pz40) obj).getValue());
            case 24:
                vgg vggVar = (vgg) obj3;
                String str4 = (String) obj;
                hhq0 hhq0Var = (hhq0) obj2;
                qud qudVar = vgg.Q1;
                if (vggVar.C().J(str4) != null) {
                    return Unit.f46060a;
                }
                kwd kwdVar = djg.n2;
                ygq0 ygq0Var = hhq0Var.f13078a;
                long j4 = hhq0Var.b;
                long j5 = hhq0Var.c;
                kwdVar.getClass();
                ygq0Var.getClass();
                djg djgVar = new djg();
                byte b4 = ygq0Var.f42598a;
                iiy[] iiyVarArr = djg.o2;
                djgVar.k2.I(djgVar, iiyVarArr[0], b4);
                djgVar.l2.j(djgVar, iiyVarArr[1], j4);
                djgVar.m2.j(djgVar, iiyVarArr[2], j5);
                djgVar.H0(vggVar.C(), str4);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((ujd) obj3).c((Fragment) obj2, new jr2(), new ebh((k3t0) obj, b3));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Function2 function2 = (Function2) obj3;
                l9n l9nVar = (l9n) obj2;
                pz40 pz40Var2 = (pz40) obj;
                if (function2 != null) {
                    function2.invoke(l9nVar, (String) pz40Var2.getValue());
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                xej xejVar = (xej) obj3;
                c2 c2Var = (c2) obj2;
                Calendar calendar = (Calendar) obj;
                nwd nwdVar = xej.l2;
                calendar.getClass();
                if (c2Var != null) {
                    if (c2Var instanceof gfj) {
                        androidx.fragment.app.e eVarF = xejVar.F();
                        gfj gfjVar = (gfj) c2Var;
                        xk9 xk9VarQ = gfjVar.Q();
                        SimpleDateTime simpleDateTime = xk9VarQ != null ? xk9VarQ.f41021a : null;
                        if (simpleDateTime != null) {
                            wdx.I(simpleDateTime, calendar);
                            lValueOf3 = Long.valueOf(calendar.getTimeInMillis());
                        } else {
                            lValueOf3 = null;
                        }
                        Pair pair = new Pair("RESULT_KEY_CALENDAR_START_SIMPLE_DATE", lValueOf3);
                        xk9 xk9VarQ2 = gfjVar.Q();
                        SimpleDateTime simpleDateTime2 = xk9VarQ2 != null ? xk9VarQ2.b : null;
                        if (simpleDateTime2 != null) {
                            wdx.I(simpleDateTime2, calendar);
                            lValueOf4 = Long.valueOf(calendar.getTimeInMillis());
                        } else {
                            lValueOf4 = null;
                        }
                        eVarF.t0(i120.V(pair, new Pair("RESULT_KEY_CALENDAR_END_SIMPLE_DATE", lValueOf4)), "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST");
                    } else if (c2Var instanceof ffj) {
                        androidx.fragment.app.e eVarF2 = xejVar.F();
                        ffj ffjVar = (ffj) c2Var;
                        wk9 wk9VarQ = ffjVar.Q();
                        SimpleDate simpleDate = wk9VarQ != null ? wk9VarQ.f39296a : null;
                        if (simpleDate != null) {
                            wdx.J(simpleDate, calendar);
                            lValueOf = Long.valueOf(calendar.getTimeInMillis());
                        } else {
                            lValueOf = null;
                        }
                        Pair pair2 = new Pair("RESULT_KEY_CALENDAR_START_SIMPLE_DATE", lValueOf);
                        wk9 wk9VarQ2 = ffjVar.Q();
                        SimpleDate simpleDate2 = wk9VarQ2 != null ? wk9VarQ2.b : null;
                        if (simpleDate2 != null) {
                            wdx.J(simpleDate2, calendar);
                            lValueOf2 = Long.valueOf(calendar.getTimeInMillis());
                        } else {
                            lValueOf2 = null;
                        }
                        eVarF2.t0(i120.V(pair2, new Pair("RESULT_KEY_CALENDAR_END_SIMPLE_DATE", lValueOf2)), "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST");
                    }
                    xejVar.x0();
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wyj wyjVar = (wyj) obj3;
                n0o0 n0o0Var = wyjVar.s;
                n0o0 n0o0Var2 = wyjVar.q;
                n0o0 n0o0Var3 = wyjVar.p;
                n0o0 n0o0Var4 = wyjVar.m;
                n0o0 n0o0Var5 = wyjVar.r;
                n0o0 n0o0Var6 = wyjVar.l;
                n0o0 n0o0Var7 = wyjVar.o;
                n0o0 n0o0Var8 = wyjVar.n;
                jih jihVar = (jih) obj2;
                List list = ((zjw) obj).c;
                n0o0 n0o0Var9 = wyjVar.k;
                fee feeVar = (fee) n0o0Var9.getValue();
                Object obj4 = jihVar.f16574a;
                e0g0 e0g0Var2 = j0g0.b;
                if (obj4 instanceof g0g0) {
                    obj4 = null;
                }
                Object obj5 = (List) obj4;
                if (obj5 == null) {
                    obj5 = iun.f15405a;
                }
                feeVar.d(obj5);
                fee feeVar2 = (fee) n0o0Var8.getValue();
                Object obj6 = jihVar.b;
                if (obj6 instanceof g0g0) {
                    obj6 = null;
                }
                Object obj7 = (List) obj6;
                if (obj7 == null) {
                    obj7 = iun.f15405a;
                }
                feeVar2.d(obj7);
                fee feeVar3 = (fee) n0o0Var7.getValue();
                Object obj8 = jihVar.e;
                if (obj8 instanceof g0g0) {
                    obj8 = null;
                }
                Object obj9 = (List) obj8;
                if (obj9 == null) {
                    obj9 = iun.f15405a;
                }
                feeVar3.d(obj9);
                fee feeVar4 = (fee) n0o0Var6.getValue();
                Object obj10 = jihVar.c;
                if (obj10 instanceof g0g0) {
                    obj10 = null;
                }
                Object obj11 = (List) obj10;
                if (obj11 == null) {
                    obj11 = iun.f15405a;
                }
                feeVar4.d(obj11);
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(kih.a(jihVar, ((ekw) wyjVar.b().c()).f7971a, false)));
                fee feeVar5 = (fee) n0o0Var4.getValue();
                Object obj12 = jihVar.d;
                if (obj12 instanceof g0g0) {
                    obj12 = null;
                }
                Object obj13 = (List) obj12;
                if (obj13 == null) {
                    obj13 = iun.f15405a;
                }
                feeVar5.d(obj13);
                fee feeVar6 = (fee) n0o0Var3.getValue();
                Object obj14 = jihVar.f;
                if (obj14 instanceof g0g0) {
                    obj14 = null;
                }
                List list2 = (List) obj14;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                Object obj15 = jihVar.g;
                if (obj15 instanceof g0g0) {
                    obj15 = null;
                }
                List list3 = (List) obj15;
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                feeVar6.d(new fiw(list2, list3));
                fee feeVar7 = (fee) n0o0Var2.getValue();
                Object obj16 = jihVar.i;
                Object obj17 = (List) (obj16 instanceof g0g0 ? null : obj16);
                if (obj17 == null) {
                    obj17 = iun.f15405a;
                }
                feeVar7.d(obj17);
                ((fee) n0o0Var.getValue()).d(list);
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(((fee) n0o0Var9.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var8.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var6.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var4.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var5.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var7.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) n0o0Var2.getValue()).b(), lc00VarB);
            default:
                ((Function2) obj3).invoke(Long.valueOf(((ctk) obj2).f4941a), (sip) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kk0(Object obj, Object obj2, Object obj3, byte b) {
        this.f18412a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
