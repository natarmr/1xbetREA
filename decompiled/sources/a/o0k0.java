package a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.javax.sip.message.Response;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_collection.SportCollectionItem;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o0k0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24430a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0k0(lgn0 lgn0Var, v1r v1rVar, SuccessBetAlertModel successBetAlertModel) {
        this.f24430a = (byte) 17;
        this.b = v1rVar;
        this.c = successBetAlertModel;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24430a;
        boolean z = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                y3r0 y3r0Var = (y3r0) obj;
                ((Function2) obj2).invoke(Integer.valueOf(y3r0Var.f41967a), y3r0Var.b);
                return Unit.f46060a;
            case 1:
                AppCompatImageView appCompatImageView = new AppCompatImageView((Context) obj2);
                appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                appCompatImageView.setVisibility(8);
                ((org.xplatform.ui_core.viewcomponents.smart_background.c) obj).addView(appCompatImageView, 0);
                return appCompatImageView;
            case 2:
                wdk0 wdk0Var = (wdk0) obj;
                ((Function0) obj2).invoke();
                wdk0Var.b.invoke();
                wdk0Var.c.invoke();
                return Unit.f46060a;
            case 3:
                wgk0 wgk0Var = (wgk0) obj;
                iiy[] iiyVarArr = wgk0.d2;
                FixedWebView fixedWebView = ((jjk0) obj2).d;
                siq siqVar = fixedWebView.f47221a;
                if (siqVar != null) {
                    siqVar.clearHistory();
                }
                siq siqVar2 = fixedWebView.f47221a;
                if (siqVar2 != null) {
                    siqVar2.clearCache(true);
                }
                siq siqVar3 = fixedWebView.f47221a;
                if (siqVar3 != null) {
                    siqVar3.clearFormData();
                }
                siq siqVar4 = fixedWebView.f47221a;
                if (siqVar4 != null) {
                    siqVar4.clearSslPreferences();
                }
                if (wgk0Var.I0().d.b()) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeSessionCookies(null);
                    cookieManager.removeExpiredCookie();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                }
                return Unit.f46060a;
            case 4:
                ((Function1) obj2).invoke(new o9f0(((ahk0) obj).f880a));
                return Unit.f46060a;
            case 5:
                ((Function1) obj2).invoke(new dwe0(((bhk0) obj).f2612a));
                return Unit.f46060a;
            case 6:
                ((Function1) obj2).invoke(new l3f0(((chk0) obj).f4365a));
                return Unit.f46060a;
            case 7:
                Function1 function1 = (Function1) obj;
                bqv bqvVar = ((eok0) obj2).b;
                if (bqvVar != null) {
                    function1.invoke(new vqk0(bqvVar));
                }
                return Unit.f46060a;
            case 8:
                int i = SportCellMiddleView.i;
                AppCompatTextView appCompatTextView = new AppCompatTextView((Context) obj2);
                appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                appCompatTextView.setGravity(16);
                cem0.n(R.style.TextStyle_Caption_Regular_L_Secondary, appCompatTextView);
                appCompatTextView.setPadding(0, ((SportCellMiddleView) obj).d, 0, 0);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setVisibility(8);
                return appCompatTextView;
            case 9:
                SportCollectionItem sportCollectionItem = (SportCollectionItem) obj;
                int i2 = SportCollectionItem.c;
                View viewInflate = LayoutInflater.from((Context) obj2).inflate(R.layout.sport_collection_item_layout, (ViewGroup) sportCollectionItem, false);
                sportCollectionItem.addView(viewInflate);
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                int i3 = R.id.ivIcon;
                LoadableShapeableImageView loadableShapeableImageView = (LoadableShapeableImageView) yum0.f(viewInflate, R.id.ivIcon);
                if (loadableShapeableImageView != null) {
                    i3 = R.id.tvTitle;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTitle);
                    if (textView != null) {
                        return new a4l0(frameLayout, frameLayout, loadableShapeableImageView, textView);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                return null;
            case 10:
                Function1 function2 = (Function1) obj2;
                usm usmVar = (usm) obj;
                if (function2 != null) {
                    function2.invoke(usmVar);
                }
                return Unit.f46060a;
            case 11:
                ((Function1) obj2).invoke(new rol0(((ofh0) obj).c));
                return Unit.f46060a;
            case 12:
                vzg0 vzg0Var = (vzg0) obj2;
                vjp vjpVar = (vjp) obj;
                Boolean bool = (Boolean) vzg0Var.a("SAVED_STATE_SEARCH_EXPANDED");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                String str = (String) vzg0Var.a("SAVED_STATE_SEARCH_QUERY");
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                int i4 = vjpVar.f37540a.a().L.c;
                iun iunVar = iun.f15405a;
                return new lsl0(iunVar, iunVar, zBooleanValue, true, str2, true, false, i4, false, false, iunVar, iunVar, !zBooleanValue);
            case 13:
                ((Function1) obj2).invoke(new gvl0(((ojc) obj).f25351a));
                return Unit.f46060a;
            case 14:
                ((Function1) obj2).invoke((a0z) obj);
                return Unit.f46060a;
            case 15:
                ((Function1) obj2).invoke(new xzm0((g0n0) obj));
                return Unit.f46060a;
            case 16:
                m0n0 m0n0Var = (m0n0) obj2;
                Function1 function3 = (Function1) obj;
                if (m0n0Var instanceof r0n0) {
                    function3.invoke(new yzm0((r0n0) m0n0Var));
                }
                return Unit.f46060a;
            case 17:
                SuccessBetAlertModel successBetAlertModel = (SuccessBetAlertModel) obj;
                Fragment fragmentA = lgn0.a((v1r) obj2);
                if (fragmentA != null) {
                    ghn0 ghn0Var = ghn0.f11308a;
                    String str3 = successBetAlertModel.c;
                    if (str3 != null && str3.length() != 0) {
                        vcc.f0(i120.V(new Pair("HISTORY", Boolean.TRUE), new Pair("BALANCE_ID", successBetAlertModel.d), new Pair("BET_MODE", successBetAlertModel.e)), fragmentA, str3.concat("HISTORY"));
                    }
                }
                return Unit.f46060a;
            case 18:
                Context context = (Context) obj2;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(((wgn0) obj).h);
                gradientDrawable.setColor(m5d.b(R.attr.uikitBackground, context));
                View view = new View(context);
                view.setId(jmu0.d());
                view.setTag("contentBackground");
                view.setBackground(gradientDrawable);
                return view;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                List list = (List) obj;
                u15 u15Var = vrm0.f37906a;
                c1a c1aVar = ((hln0) obj2).f13272a;
                c1aVar.getClass();
                if (Build.VERSION.SDK_INT < 33) {
                    z = false;
                } else {
                    CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                    key.getClass();
                    long[] jArr = (long[]) ((ow9) c1aVar).c(key);
                    if (jArr == null || jArr.length == 0) {
                        z = false;
                    } else {
                        HashSet hashSet = new HashSet();
                        for (long j : jArr) {
                            hashSet.add(Long.valueOf(j));
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!hashSet.contains(Long.valueOf(((wln0) it.next()).c.f36171a))) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 20:
                ((Function1) obj2).invoke(new kvn0((b3q) obj));
                return Unit.f46060a;
            case 21:
                vzg0 vzg0Var2 = (vzg0) obj2;
                g2v g2vVar = (g2v) obj;
                Object obj3 = iun.f15405a;
                rzg0 rzg0Var = rzg0.b;
                kiy kiyVarA = sre0.a(epn0.class);
                KTypeProjection.c.getClass();
                KTypeProjection kTypeProjectionA = piy.a(kiyVarA);
                tre0 tre0Var = sre0.f32672a;
                Object objY = a8k0.y(vzg0Var2, "CHAMPS_KEY", n6x.b0(tre0Var.k(tre0Var.b(List.class), Collections.singletonList(kTypeProjectionA), true)), rzg0Var);
                if (objY == null) {
                    objY = obj3;
                }
                List list2 = (List) objY;
                Object objY2 = a8k0.y(vzg0Var2, "SPORTS_KEY", n6x.b0(tre0Var.k(tre0Var.b(List.class), Collections.singletonList(piy.a(sre0.a(hpn0.class))), true)), rzg0Var);
                if (objY2 != null) {
                    obj3 = objY2;
                }
                List list3 = (List) obj3;
                Object obj4 = xun.f41520a;
                Object objY3 = a8k0.y(vzg0Var2, "EXPANDED_IDS_KEY", n6x.b0(tre0Var.k(tre0Var.b(Set.class), Collections.singletonList(piy.a(sre0.a(roo.class))), true)), rzg0Var);
                if (objY3 != null) {
                    obj4 = objY3;
                }
                return new gvn0(false, true, false, false, list2, list3, (Set) obj4, g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
            case 22:
                ((Function1) obj2).invoke(new mvn0((t3q) obj));
                return Unit.f46060a;
            case 23:
                return new d2d((String) obj2, ((d9z) obj).c());
            case 24:
                ((Function1) obj2).invoke(((elo0) obj).g);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) obj2).invoke(new i37(((qgv0) obj).f));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                s2m0 s2m0Var = oxo0.q2;
                ((k3t0) ((oxo0) obj2).p2.getValue()).x(new kxo0(((pxo0) obj).f27762a));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) obj2).invoke(Integer.valueOf(((y4p0) obj).f42015a));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) obj2).invoke(new e8p0(((m9p0) obj).f21421a));
                return Unit.f46060a;
            default:
                ((Function1) obj2).invoke(((x1z) obj).f40142a);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ o0k0(Object obj, Object obj2, byte b) {
        this.f24430a = b;
        this.b = obj;
        this.c = obj2;
    }
}
