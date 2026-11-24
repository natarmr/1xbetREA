package a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.widget.AppCompatButton;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class nf60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf60(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    private final Object l(Object obj) {
        qh70 qh70Var = (qh70) this.k;
        zh70 zh70Var = (zh70) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (zh70Var != null) {
            boolean z = true;
            if (zh70Var instanceof uh70) {
                nh70 nh70Var = qh70.O1;
                qh70Var.J0(true);
                qh70Var.I0(true);
            } else {
                if (zh70Var instanceof xh70) {
                    boolean z2 = ((xh70) zh70Var).f40875a;
                    nh70 nh70Var2 = qh70.O1;
                    qh70Var.H0().d.setVisibility(z2 ? 0 : 8);
                    qh70Var.H0().c.setVisibility(z2 ? 8 : 0);
                    if (z2) {
                        j120.Y(qh70Var);
                    }
                } else if (zh70Var instanceof wh70) {
                    nh70 nh70Var3 = qh70.O1;
                    new z2t().H0(qh70Var.C(), z2t.class.getSimpleName());
                } else if (zh70Var instanceof th70) {
                    th70 th70Var = (th70) zh70Var;
                    if (!th70Var.f33949a && !th70Var.b) {
                        z = false;
                    }
                    nh70 nh70Var4 = qh70.O1;
                    qh70Var.J0(z);
                    qh70Var.I0(false);
                } else if (zh70Var instanceof yh70) {
                    boolean z3 = ((yh70) zh70Var).f42625a;
                    nh70 nh70Var5 = qh70.O1;
                    qh70Var.J0(z3);
                } else if (zh70Var instanceof vh70) {
                    boolean z4 = ((vh70) zh70Var).f37415a;
                    nh70 nh70Var6 = qh70.O1;
                    qh70Var.I0(z4);
                } else if (zh70Var instanceof rh70) {
                    nh70 nh70Var7 = qh70.O1;
                    oi70.P1.getClass();
                    qh70Var.G0(new oi70(), R.id.onex_holder_instant_bet_container);
                    aj70.P1.getClass();
                    qh70Var.G0(new aj70(), R.id.onex_holder_options_container);
                    mh70.Q1.getClass();
                    qh70Var.G0(new mh70(), R.id.onex_holder_bet_container);
                } else if (zh70Var instanceof sh70) {
                    boolean z5 = ((sh70) zh70Var).f32199a;
                    nh70 nh70Var8 = qh70.O1;
                    qh70Var.J0(z5);
                    qh70Var.I0(false);
                }
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object m(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        p7m0 p7m0Var = ((jk70) this.j).y;
        bk70 bk70Var = (bk70) this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, bk70Var);
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        p7m0 p7m0Var = ((yk70) this.j).x;
        rk70 rk70Var = (rk70) this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, rk70Var);
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        AppCompatButton appCompatButton;
        hl70 hl70Var = (hl70) this.k;
        ll70 ll70Var = (ll70) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (ll70Var != null) {
            if (ll70Var instanceof il70) {
                boolean z = ((il70) ll70Var).f14963a;
                fl70 fl70Var = hl70.Q1;
                hl70Var.G0().b.setAlpha(z ? 1.0f : 0.5f);
                hl70Var.G0().e.setClickable(z);
                hl70Var.G0().d.setClickable(z);
                hl70Var.G0().c.setClickable(z);
            } else if (ll70Var instanceof kl70) {
                boolean z2 = ((kl70) ll70Var).f18472a;
                fl70 fl70Var2 = hl70.Q1;
                String strH = hl70Var.H(z2 ? R.string.games_quick_bets_message_min : R.string.games_quick_bets_message_max);
                strH.getClass();
                hl70Var.o0();
                ii iiVar = hl70Var.M1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH2 = hl70Var.H(R.string.error);
                String strH3 = hl70Var.H(R.string.ok);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH, (CharSequence) strH3, hl70Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_BET_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                androidx.fragment.app.e eVarC = hl70Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
            } else if (ll70Var instanceof jl70) {
                jl70 jl70Var = (jl70) ll70Var;
                gxo gxoVar = jl70Var.f16702a;
                double d = jl70Var.b;
                String str = jl70Var.c;
                fl70 fl70Var3 = hl70.Q1;
                int iOrdinal = gxoVar.ordinal();
                if (iOrdinal == 0) {
                    appCompatButton = hl70Var.G0().e;
                } else if (iOrdinal == 1) {
                    appCompatButton = hl70Var.G0().d;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    appCompatButton = hl70Var.G0().c;
                }
                pn40 pn40Var = pn40.f27267a;
                appCompatButton.setText(pn40.d(d, str, p3u0.g));
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object s(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        p7m0 p7m0Var = ((wm70) this.j).o;
        tm70 tm70Var = (tm70) this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, tm70Var);
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ((to70) this.j).a0.f((in70) this.k);
        return Unit.f46060a;
    }

    private final Object x(Object obj) {
        zy5 zy5Var = (zy5) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (zy5Var instanceof mle) {
            zo70 zo70Var = (zo70) this.k;
            qjj.W(jiu0.a(zo70Var), null, null, new wk70(zo70Var, new vo70(), null, (byte) 15), 3);
        }
        return Unit.f46060a;
    }

    private final Object y(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        k3t0 k3t0Var = (k3t0) this.j;
        v480 v480Var = (v480) this.k;
        k3t0Var.x(new v380(v480Var.e, v480Var.b));
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new nf60((of60) this.j, (Map) obj2, yjeVar, (byte) 0);
            case 1:
                return new nf60((jj60) this.j, (lk60) obj2, yjeVar, (byte) 1);
            case 2:
                nf60 nf60Var = new nf60((oj60) obj2, yjeVar, (byte) 2);
                nf60Var.j = obj;
                return nf60Var;
            case 3:
                return new nf60((pk60) this.j, (ArrayList) obj2, yjeVar, (byte) 3);
            case 4:
                return new nf60((pk60) this.j, (lk60) obj2, yjeVar, (byte) 4);
            case 5:
                nf60 nf60Var2 = new nf60((hl60) obj2, yjeVar, (byte) 5);
                nf60Var2.j = obj;
                return nf60Var2;
            case 6:
                nf60 nf60Var3 = new nf60((gl60) obj2, yjeVar, (byte) 6);
                nf60Var3.j = obj;
                return nf60Var3;
            case 7:
                return new nf60((gs60) this.j, (d9z) obj2, yjeVar, (byte) 7);
            case 8:
                nf60 nf60Var4 = new nf60((gs60) obj2, yjeVar, (byte) 8);
                nf60Var4.j = obj;
                return nf60Var4;
            case 9:
                nf60 nf60Var5 = new nf60((xt60) obj2, yjeVar, (byte) 9);
                nf60Var5.j = obj;
                return nf60Var5;
            case 10:
                nf60 nf60Var6 = new nf60((gx60) obj2, yjeVar, (byte) 10);
                nf60Var6.j = obj;
                return nf60Var6;
            case 11:
                nf60 nf60Var7 = new nf60((p170) obj2, yjeVar, (byte) 11);
                nf60Var7.j = obj;
                return nf60Var7;
            case 12:
                nf60 nf60Var8 = new nf60((k370) obj2, yjeVar, (byte) 12);
                nf60Var8.j = obj;
                return nf60Var8;
            case 13:
                return new nf60((g670) this.j, (v570) obj2, yjeVar, (byte) 13);
            case 14:
                return new nf60((n870) this.j, (xd70) obj2, yjeVar, (byte) 14);
            case 15:
                return new nf60((qf70) this.j, (ql5) obj2, yjeVar, (byte) 15);
            case 16:
                nf60 nf60Var9 = new nf60((qf70) obj2, yjeVar, (byte) 16);
                nf60Var9.j = obj;
                return nf60Var9;
            case 17:
                nf60 nf60Var10 = new nf60((sf70) obj2, yjeVar, (byte) 17);
                nf60Var10.j = obj;
                return nf60Var10;
            case 18:
                nf60 nf60Var11 = new nf60((hg70) obj2, yjeVar, (byte) 18);
                nf60Var11.j = obj;
                return nf60Var11;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                nf60 nf60Var12 = new nf60((mh70) obj2, yjeVar, (byte) 19);
                nf60Var12.j = obj;
                return nf60Var12;
            case 20:
                nf60 nf60Var13 = new nf60((qh70) obj2, yjeVar, (byte) 20);
                nf60Var13.j = obj;
                return nf60Var13;
            case 21:
                nf60 nf60Var14 = new nf60((oi70) obj2, yjeVar, (byte) 21);
                nf60Var14.j = obj;
                return nf60Var14;
            case 22:
                return new nf60((jk70) this.j, (bk70) obj2, yjeVar, (byte) 22);
            case 23:
                return new nf60((yk70) this.j, (rk70) obj2, yjeVar, (byte) 23);
            case 24:
                nf60 nf60Var15 = new nf60((hl70) obj2, yjeVar, (byte) 24);
                nf60Var15.j = obj;
                return nf60Var15;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new nf60((wm70) this.j, (tm70) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new nf60((to70) this.j, (in70) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                nf60 nf60Var16 = new nf60((zo70) obj2, yjeVar, (byte) 27);
                nf60Var16.j = obj;
                return nf60Var16;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new nf60((k3t0) this.j, (v480) obj2, yjeVar, (byte) 28);
            default:
                nf60 nf60Var17 = new nf60((gk70) obj2, yjeVar, (byte) 29);
                nf60Var17.j = obj;
                return nf60Var17;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((nf60) create((bl60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((nf60) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((nf60) create((xkb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((nf60) create((b370) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((nf60) create((b370) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((nf60) create((b370) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((nf60) create((b370) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((nf60) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((nf60) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((nf60) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((nf60) create((tf70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((nf60) create((qg70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((nf60) create((bi70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((nf60) create((zh70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((nf60) create((si70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((nf60) create((ll70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((nf60) create((zy5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((nf60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nf60) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        int i;
        Integer numValueOf;
        Integer numValueOf2;
        char c;
        String str;
        String str2;
        Object value;
        Object value2;
        kat katVar;
        Object value3;
        xb70 xb70Var;
        Object value4;
        xb70 xb70Var2;
        String strH;
        AppCompatButton appCompatButton;
        byte b = this.i;
        char c2 = 3;
        byte b2 = 6;
        char c3 = 2;
        char c4 = 1;
        z = true;
        boolean z = true;
        byte b3 = 0;
        yje yjeVar = null;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                w5z w5zVar = ((of60) this.j).g2;
                if (w5zVar == null) {
                    return null;
                }
                Map map = (Map) obj2;
                pf60.f26887a.getClass();
                EnumSet enumSet = pf60.b;
                enumSet.getClass();
                if (TextUtils.isEmpty("users.getCurrentUser")) {
                    jf4.o(((Context) w5zVar.f38604a).getString(R.string.api_method_cant_be_empty));
                    return null;
                }
                TreeMap treeMap = new TreeMap();
                if (map != null && !map.isEmpty()) {
                    treeMap.putAll(map);
                }
                treeMap.put("application_key", (String) w5zVar.e);
                treeMap.put("method", "users.getCurrentUser");
                if (!enumSet.contains(pf60.e)) {
                    treeMap.put("platform", "ANDROID");
                }
                if (enumSet.contains(pf60.d)) {
                    String str3 = (String) w5zVar.d;
                    if (str3 == null) {
                        jf4.o("SDK token is required for method call, have not forget to call sdkInit?");
                        return null;
                    }
                    treeMap.put("sdkToken", str3);
                }
                String str4 = (String) w5zVar.b;
                if (str4 != null && enumSet.contains(pf60.c)) {
                    StringBuilder sb = new StringBuilder(100);
                    for (Map.Entry entry : treeMap.entrySet()) {
                        sb.append((String) entry.getKey());
                        sb.append('=');
                        sb.append((String) entry.getValue());
                    }
                    treeMap.put("sig", ewm0.v(sb.toString() + ((String) w5zVar.c)));
                    treeMap.put("access_token", str4);
                }
                if (!treeMap.containsKey("method") || !treeMap.containsKey("application_key")) {
                    return null;
                }
                ArrayList<Pair> arrayList = new ArrayList();
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    arrayList.add(new Pair((String) entry2.getKey(), (String) entry2.getValue()));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://api.ok.ru/fb.do").openConnection()));
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setConnectTimeout(JosStatusCodes.RTN_CODE_COMMON_ERROR);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (Pair pair : arrayList) {
                    Object obj3 = pair.first;
                    if (obj3 != null && pair.second != null) {
                        arrayList2.add(URLEncoder.encode((String) obj3, "UTF-8") + "=" + URLEncoder.encode((String) pair.second, "UTF-8"));
                    }
                }
                String strJoin = TextUtils.join("&", arrayList2);
                if (strJoin.length() > 0) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                    bufferedWriter.write(strJoin);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                StringBuilder sb2 = new StringBuilder(Math.max(httpURLConnection.getContentLength(), 128));
                char[] cArr = new char[4096];
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                do {
                    try {
                        i = inputStreamReader.read(cArr, 0, 4096);
                        if (i > 0) {
                            sb2.append(cArr, 0, i);
                        }
                    } finally {
                        try {
                            inputStreamReader.close();
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } while (i >= 0);
                return sb2.toString();
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jj60 jj60Var = (jj60) this.j;
                fj60 fj60Var = new fj60(((lk60) obj2).f20185a);
                int i2 = jj60.t;
                jj60Var.G(fj60Var);
                return Unit.f46060a;
            case 2:
                oj60 oj60Var = (oj60) obj2;
                a8z a8zVar = oj60Var.M1;
                bl60 bl60Var = (bl60) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (bl60Var instanceof al60) {
                    iiy[] iiyVarArr = oj60.P1;
                    ii iiVar = ((imi) a8zVar.getValue()).o;
                    String strH2 = oj60Var.H(R.string.confirmation);
                    String strH3 = oj60Var.H(R.string.authenticator_phone_alert);
                    String strH4 = oj60Var.H(R.string.bind);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, oj60Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = oj60Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    if (!Intrinsics.d(bl60Var, zk60.f44514a)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr2 = oj60.P1;
                    ii iiVar2 = ((imi) a8zVar.getValue()).o;
                    String strH5 = oj60Var.H(R.string.error);
                    String strH6 = oj60Var.H(R.string.something_went_wrong);
                    String strH7 = oj60Var.H(R.string.ok_new);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = oj60Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                pk60 pk60Var = (pk60) this.j;
                p7m0 p7m0Var = pk60Var.p;
                zri zriVar = pk60Var.l;
                ArrayList<fk60> arrayListA = (ArrayList) obj2;
                zriVar.getClass();
                if (((iqt) zriVar.c).f15225a.a()) {
                    pru pruVar = (pru) zriVar.b;
                    if (!pruVar.a().e1 || pruVar.a().b.f13233a.f8987a) {
                        arrayListA = zri.a(arrayListA);
                    }
                } else {
                    arrayListA = zri.a(arrayListA);
                }
                ArrayList arrayList3 = new ArrayList();
                for (fk60 fk60Var : arrayListA) {
                    ctf0 ctf0Var = pk60Var.k;
                    fk60Var.getClass();
                    ctf0Var.getClass();
                    int iOrdinal = fk60Var.ordinal();
                    if (iOrdinal != 26) {
                        switch (iOrdinal) {
                            case 0:
                                numValueOf = Integer.valueOf(R.string.settings);
                                break;
                            case 1:
                                numValueOf = Integer.valueOf(R.string.betconstructor);
                                break;
                            case 2:
                                numValueOf = Integer.valueOf(R.string.finance_bets);
                                break;
                            case 3:
                                numValueOf = Integer.valueOf(R.string.coupon);
                                break;
                            case 4:
                                numValueOf = Integer.valueOf(R.string.cyber_sport);
                                break;
                            case 5:
                                numValueOf = Integer.valueOf(R.string.event_screen);
                                break;
                            case 6:
                                numValueOf = Integer.valueOf(R.string.statistic_info_rating);
                                break;
                            case 7:
                                numValueOf = Integer.valueOf(R.string.navigation_tips);
                                break;
                            case 8:
                                numValueOf = Integer.valueOf(R.string.game_insights_title);
                                break;
                            case 9:
                                numValueOf = Integer.valueOf(R.string.swipex);
                                break;
                            case 10:
                                numValueOf = Integer.valueOf(R.string.on_boarding_my_casino);
                                break;
                            case 11:
                                numValueOf = Integer.valueOf(R.string.on_boarding_casino_slots);
                                break;
                            case 12:
                                numValueOf = Integer.valueOf(R.string.on_boarding_live_casino);
                                break;
                            case 13:
                                numValueOf = Integer.valueOf(R.string.casino_promo_description);
                                break;
                            case 14:
                                numValueOf = Integer.valueOf(R.string.referee_tour);
                                break;
                            case 15:
                                numValueOf = Integer.valueOf(R.string.toto_name);
                                break;
                            default:
                                numValueOf = null;
                                break;
                        }
                    } else {
                        numValueOf = Integer.valueOf(R.string.team_bet_title);
                    }
                    int iOrdinal2 = fk60Var.ordinal();
                    if (iOrdinal2 != 26) {
                        switch (iOrdinal2) {
                            case 0:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_setting_gray);
                                break;
                            case 1:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_nav_bet_constructor);
                                break;
                            case 2:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_nav_finbets);
                                break;
                            case 3:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_coupon);
                                break;
                            case 4:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_cyber_sport);
                                break;
                            case 5:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_game_screen_onboard);
                                break;
                            case 6:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_rating);
                                break;
                            case 7:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_navigation_onboarding);
                                break;
                            case 8:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_insight);
                                break;
                            case 9:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_swipe_x);
                                break;
                            case 10:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_cards);
                                break;
                            case 11:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_slots);
                                break;
                            case 12:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_peak);
                                break;
                            case 13:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_gift);
                                break;
                            case 14:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_tournaments);
                                break;
                            case 15:
                                numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_toto);
                                break;
                            default:
                                numValueOf2 = null;
                                break;
                        }
                    } else {
                        numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_team);
                    }
                    lk60 lk60Var = (numValueOf == null || numValueOf2 == null) ? null : new lk60(fk60Var.f9675a, numValueOf2.intValue(), ctf0Var.f(numValueOf.intValue(), new Object[0]));
                    if (lk60Var != null) {
                        arrayList3.add(lk60Var);
                    }
                }
                p7m0Var.getClass();
                p7m0Var.o(null, arrayList3);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ((pk60) this.j).q.f(new Integer(((lk60) obj2).f20185a));
                return Unit.f46060a;
            case 5:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                hl60 hl60Var = (hl60) obj2;
                p7m0 p7m0Var2 = hl60Var.u;
                while (true) {
                    Object value5 = p7m0Var2.getValue();
                    ek60 ek60Var = (ek60) value5;
                    ctf0 ctf0Var2 = hl60Var.o;
                    myb mybVar = hl60Var.q;
                    nyb nybVar = hl60Var.h;
                    lsm0 lsm0Var = ctf0Var2.b;
                    lsm0 lsm0Var2 = ctf0Var2.b;
                    char c5 = c2;
                    String strA = lsm0Var.a(R.string.onboarding_title_authenticator, Arrays.copyOf(new Object[0], 0));
                    zcl zclVar = qmk.f28987a;
                    rj60 rj60Var = new rj60(strA, 16.0f, 0.0f, z9q0.f44032a, false);
                    String strA2 = lsm0Var2.a(R.string.auth_onboarding_subtitle1, Arrays.copyOf(new Object[0], 0));
                    z9q0 z9q0Var = z9q0.b;
                    rj60 rj60Var2 = new rj60(strA2, 16.0f, 0.0f, z9q0Var, false);
                    String strA3 = lsm0Var2.a(R.string.auth_onboarding_body_intro, Arrays.copyOf(new Object[0], 0));
                    z9q0 z9q0Var2 = z9q0.c;
                    rj60 rj60Var3 = new rj60(strA3, 16.0f, 0.0f, z9q0Var2, false);
                    uaq0.f35345a.getClass();
                    byte b4 = b2;
                    if (s9m0.i(uaq0Var)) {
                        String strB = mybVar.b();
                        nybVar.a();
                        c = '\b';
                        str = "/static/img/android/instructions/onboarding_authenticator/" + strB + "/1_d_1.png";
                    } else {
                        c = '\b';
                        if (s9m0.k(uaq0Var)) {
                            String strB2 = mybVar.b();
                            nybVar.a();
                            str = "/static/img/android/instructions/onboarding_authenticator/" + strB2 + "/1_n_1.png";
                        } else {
                            String strB3 = mybVar.b();
                            nybVar.a();
                            str = "/static/img/android/instructions/onboarding_authenticator/" + strB3 + "/1_l_1.png";
                        }
                    }
                    qj60 qj60Var = new qj60(str, 0.0f);
                    rj60 rj60Var4 = new rj60(lsm0Var2.a(R.string.auth_onboarding_body_instruction, Arrays.copyOf(new Object[0], 0)), 16.0f, 0.0f, z9q0Var2, false);
                    if (s9m0.i(uaq0Var)) {
                        String strB4 = mybVar.b();
                        nybVar.a();
                        str2 = "/static/img/android/instructions/onboarding_authenticator/" + strB4 + "/2_d_1.png";
                    } else if (s9m0.k(uaq0Var)) {
                        String strB5 = mybVar.b();
                        nybVar.a();
                        str2 = "/static/img/android/instructions/onboarding_authenticator/" + strB5 + "/2_n_1.png";
                    } else {
                        String strB6 = mybVar.b();
                        nybVar.a();
                        str2 = "/static/img/android/instructions/onboarding_authenticator/" + strB6 + "/2_l_1.png";
                    }
                    qj60 qj60Var2 = new qj60(str2, 8.0f);
                    rj60 rj60Var5 = new rj60(lsm0Var2.a(R.string.auth_onboarding_body_history_notice, Arrays.copyOf(new Object[0], 0)), 16.0f, 0.0f, z9q0Var2, false);
                    rj60 rj60Var6 = new rj60(lsm0Var2.a(R.string.auth_onboarding_subtitle2, Arrays.copyOf(new Object[0], 0)), 16.0f, 16.0f, z9q0Var, false);
                    rj60 rj60Var7 = new rj60(lsm0Var2.a(R.string.auth_onboarding_body_3, Arrays.copyOf(new Object[0], 0)), 0.0f, 0.0f, z9q0Var2, true);
                    char c6 = c3;
                    rj60 rj60Var8 = new rj60(lsm0Var2.a(R.string.auth_onboarding_body4, Arrays.copyOf(new Object[0], 0)), 16.0f, 0.0f, z9q0Var2, true);
                    char c7 = c4;
                    rj60 rj60Var9 = new rj60(lsm0Var2.a(R.string.auth_onboarding_body_5, Arrays.copyOf(new Object[0], 0)), 16.0f, 8.0f, z9q0Var2, false);
                    sj60[] sj60VarArr = new sj60[11];
                    sj60VarArr[0] = rj60Var;
                    sj60VarArr[c7 == true ? 1 : 0] = rj60Var2;
                    sj60VarArr[c6] = rj60Var3;
                    sj60VarArr[c5] = qj60Var;
                    sj60VarArr[4] = rj60Var4;
                    sj60VarArr[5] = qj60Var2;
                    sj60VarArr[b4] = rj60Var5;
                    sj60VarArr[7] = rj60Var6;
                    sj60VarArr[c] = rj60Var7;
                    sj60VarArr[9] = rj60Var8;
                    sj60VarArr[10] = rj60Var9;
                    if (p7m0Var2.m(value5, ek60.a(ek60Var, false, dyb.o0(q3d.j(sj60VarArr)), 7))) {
                        return Unit.f46060a;
                    }
                    c2 = c5;
                    b2 = b4;
                    c3 = c6;
                    c4 = c7 == true ? 1 : 0;
                }
                break;
            case 6:
                xkb0 xkb0Var = (xkb0) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                int i3 = gl60.z;
                p7m0 p7m0Var3 = ((gl60) obj2).i.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                } while (!p7m0Var3.m(value, new sk60(xkb0Var)));
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                gs60 gs60Var = (gs60) this.j;
                uuz uuzVar = gs60.R1;
                gmq gmqVarC = ((i3t0) gs60Var.G0()).C();
                yd60 yd60Var = new yd60(obj2, (Object) gs60Var, yjeVar, (byte) 15);
                lkz lkzVar = lkz.f20223a;
                clz clzVarW = aac.W(gs60Var);
                qjj.W(x0x.Q(clzVarW.x()), null, null, new yd60((i89) gmqVarC, clzVarW, yd60Var, (yje) null), 3);
                return Unit.f46060a;
            case 8:
                b370 b370Var = (b370) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                pat patVar = b370Var.f1889a;
                pat patVar2 = b370Var.b;
                gs60 gs60Var2 = (gs60) obj2;
                uuz uuzVar2 = gs60.R1;
                gs60Var2.G0().x(new yo60(patVar));
                gs60Var2.G0().x(new mp60(patVar2));
                gs60Var2.G0().x(wo60.f39479a);
                return Unit.f46060a;
            case 9:
                b370 b370Var2 = (b370) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                xt60 xt60Var = (xt60) obj2;
                xuz xuzVar = xt60.V1;
                xt60Var.G0().x(new ys60(b370Var2.f1889a));
                xt60Var.G0().x(new bt60(b370Var2.b));
                return Unit.f46060a;
            case 10:
                b370 b370Var3 = (b370) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                pat patVar3 = b370Var3.f1889a;
                pat patVar4 = b370Var3.b;
                gx60 gx60Var = (gx60) obj2;
                atz atzVar = gx60.R1;
                gx60Var.G0().x(new jw60(patVar3));
                gx60Var.G0().x(new sw60(patVar4));
                return Unit.f46060a;
            case 11:
                b370 b370Var4 = (b370) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                p170 p170Var = (p170) obj2;
                xuz xuzVar2 = p170.Q1;
                p170Var.G0().x(new s070(b370Var4.f1889a));
                p170Var.G0().x(new v070(b370Var4.b));
                return Unit.f46060a;
            case 12:
                k370 k370Var = (k370) obj2;
                sw00 sw00Var = (sw00) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var.f32897a != sw00Var.b && k370Var.n.y()) {
                    p7m0 p7m0Var4 = k370Var.p;
                    do {
                        value2 = p7m0Var4.getValue();
                        katVar = kat.f17982a;
                    } while (!p7m0Var4.m(value2, b370.a(katVar, katVar)));
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ((g670) this.j).D.f((v570) obj2);
                return Unit.f46060a;
            case 14:
                xd70 xd70Var = (xd70) obj2;
                ocj ocjVar = xd70Var.i;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                cir cirVar = ((n870) this.j).f23076a;
                boolean z2 = cirVar.c == tir.b;
                char c8 = (!z2 && ((xb70) xd70Var.D()).n.h && ((xb70) xd70Var.D()).h) ? (char) 1 : (char) 0;
                if ((!z2 && !((xb70) xd70Var.D()).n.d && ((xb70) xd70Var.D()).n.g && ((xb70) xd70Var.D()).h) || c8 != 0) {
                    int i4 = xd70.B0;
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var5.getValue();
                        value4.getClass();
                        xb70Var2 = (xb70) value4;
                    } while (!p7m0Var5.m(value4, xb70.a(xb70Var2, null, null, null, false, false, false, false, false, null, false, false, 0, false, fa70.a(xb70Var2.n, false, false, false, false, 0L, false, false, false, 127), null, null, null, 122879)));
                } else if (z2 && ((xb70) xd70Var.D()).n.g) {
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var6.getValue();
                        value3.getClass();
                        xb70Var = (xb70) value3;
                    } while (!p7m0Var6.m(value3, xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, fa70.a(xb70Var.n, false, false, false, false, 0L, false, false, true, 127), null, null, null, 122879)));
                }
                xh20 xh20Var = new xh20(z2, (cirVar.d || !z2 || ((xb70) xd70Var.D()).p.b.a()) ? ((xb70) xd70Var.D()).p.b : csr.e, b2);
                int i5 = xd70.B0;
                xd70Var.H(xh20Var);
                xd70Var.G(new qa70(((xb70) xd70Var.D()).o.c));
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                ((qf70) this.j).x((ql5) obj2);
                return Unit.f46060a;
            case 16:
                ql5 ql5Var = (ql5) this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                qf70 qf70Var = (qf70) obj2;
                qf70Var.F(ql5Var);
                qf70Var.x(ql5Var);
                return Unit.f46060a;
            case 17:
                tf70 tf70Var = (tf70) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                sf70 sf70Var = (sf70) obj2;
                sf70Var.G0().b.setEnabled(!tf70Var.f33854a);
                sf70Var.G0().b.setText(sf70Var.H(tf70Var.b));
                return Unit.f46060a;
            case 18:
                hg70 hg70Var = (hg70) obj2;
                qg70 qg70Var = (qg70) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                if (qg70Var != null) {
                    if (qg70Var instanceof lg70) {
                        evz evzVar = hg70.P1;
                        hg70Var.J0(true);
                        hg70Var.I0(true);
                    } else if (qg70Var instanceof og70) {
                        boolean z3 = ((og70) qg70Var).f25203a;
                        evz evzVar2 = hg70.P1;
                        hg70Var.H0().d.setVisibility(z3 ? 0 : 8);
                        hg70Var.H0().c.setVisibility(!z3 ? 0 : 8);
                        if (z3) {
                            j120.Y(hg70Var);
                        }
                    } else if (qg70Var instanceof ng70) {
                        evz evzVar3 = hg70.P1;
                        new z2t().H0(hg70Var.C(), z2t.class.getSimpleName());
                    } else if (qg70Var instanceof kg70) {
                        kg70 kg70Var = (kg70) qg70Var;
                        boolean z4 = kg70Var.b;
                        if (!kg70Var.f18227a && !z4) {
                            z = false;
                        }
                        evz evzVar4 = hg70.P1;
                        hg70Var.J0(z);
                        hg70Var.I0(z4);
                    } else if (qg70Var instanceof pg70) {
                        boolean z5 = ((pg70) qg70Var).f26940a;
                        evz evzVar5 = hg70.P1;
                        hg70Var.J0(z5);
                    } else if (qg70Var instanceof mg70) {
                        boolean z6 = ((mg70) qg70Var).f21728a;
                        evz evzVar6 = hg70.P1;
                        hg70Var.I0(z6);
                    } else if (qg70Var instanceof ig70) {
                        ig70 ig70Var = (ig70) qg70Var;
                        boolean z7 = ig70Var.f14723a;
                        evz evzVar7 = hg70.P1;
                        hl70.Q1.getClass();
                        hl70 hl70Var = new hl70();
                        hl70Var.P1.v(hl70Var, hl70.R1[1], z7);
                        hg70Var.G0(hl70Var, R.id.onex_holder_instant_bet_container);
                        ul70.Q1.getClass();
                        ul70 ul70Var = new ul70();
                        ul70Var.P1.v(ul70Var, ul70.R1[1], z7);
                        hg70Var.G0(ul70Var, R.id.onex_holder_options_container);
                        hg70Var.I0(ig70Var.b);
                        dg70.Q1.getClass();
                        hg70Var.G0(new dg70(), R.id.onex_holder_bet_container);
                    } else if (qg70Var instanceof jg70) {
                        boolean z8 = ((jg70) qg70Var).f16468a;
                        evz evzVar8 = hg70.P1;
                        hg70Var.J0(z8);
                        hg70Var.I0(false);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bi70 bi70Var = (bi70) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                mh70 mh70Var = (mh70) obj2;
                boolean z9 = bi70Var.f2647a;
                String str5 = bi70Var.d;
                jh70 jh70Var = mh70.Q1;
                mh70Var.H0().c.setAlpha(z9 ? 1.0f : 0.5f);
                mh70Var.H0().p.setClickable(z9);
                mh70Var.H0().n.setClickable(z9);
                mh70Var.H0().s.setClickable(z9);
                mh70Var.H0().j.setClickable(z9);
                mh70Var.H0().f.setEnabled(z9);
                boolean z10 = bi70Var.f;
                boolean z11 = !z10;
                mh70Var.H0().p.setAlpha(!z10 ? 1.0f : 0.5f);
                mh70Var.H0().p.setEnabled(z11);
                boolean z12 = bi70Var.i;
                boolean z13 = !z12;
                mh70Var.H0().j.setAlpha(!z12 ? 1.0f : 0.5f);
                mh70Var.H0().j.setEnabled(z13);
                boolean z14 = bi70Var.h;
                boolean z15 = !z14;
                mh70Var.H0().s.setAlpha(!z14 ? 1.0f : 0.5f);
                mh70Var.H0().s.setEnabled(z15);
                boolean z16 = bi70Var.g;
                boolean z17 = !z16;
                mh70Var.H0().n.setAlpha(z16 ? 0.5f : 1.0f);
                mh70Var.H0().n.setEnabled(z17);
                boolean z18 = bi70Var.j;
                mh70Var.H0().m.setVisibility(z18 ? 0 : 8);
                mh70Var.H0().l.setVisibility(!z18 ? 0 : 8);
                mh70Var.H0().r.setTextColor(mh70Var.H0().r.getContext().getColor(z18 ? R.color.static_gray : R.color.static_red));
                double d = bi70Var.e;
                boolean z19 = bi70Var.k;
                p3u0 p3u0Var = kotlin.text.c.n(String.valueOf(mh70Var.H0().f.getText()), ".0", false) ? p3u0.h : p3u0.g;
                if (d == ji70.z) {
                    strH = "";
                } else {
                    pn40 pn40Var = pn40.f27267a;
                    strH = pn40.h(d, p3u0Var, z19);
                }
                if (!String.valueOf(mh70Var.H0().f.getText()).equals(strH)) {
                    mh70Var.H0().f.setText(strH);
                    mh70Var.H0().f.setSelection(mh70Var.H0().f.length());
                }
                mh70Var.H0().b.setText(str5);
                double d2 = bi70Var.c;
                double d3 = bi70Var.b;
                pn40 pn40Var2 = pn40.f27267a;
                p3u0 p3u0Var2 = p3u0.g;
                mh70Var.H0().r.setText(mh70Var.I(R.string.xgames_bet_min_max, pn40.d(d3, str5, p3u0Var2), pn40.d(d2, str5, p3u0Var2)));
                mh70Var.H0().f.addTextChangedListener(new da0(new fsp0(2, new ih70(mh70Var, b3))));
                boolean z20 = bi70Var.l;
                boolean z21 = bi70Var.m;
                h0r h0rVarH0 = mh70Var.H0();
                ShimmerFrameLayout shimmerFrameLayout = h0rVarH0.d;
                ShimmerFrameLayout shimmerFrameLayout2 = h0rVarH0.o;
                ShimmerFrameLayout shimmerFrameLayout3 = h0rVarH0.k;
                ShimmerFrameLayout shimmerFrameLayout4 = h0rVarH0.t;
                ShimmerFrameLayout shimmerFrameLayout5 = h0rVarH0.q;
                if (z20) {
                    shimmerFrameLayout5.b();
                    shimmerFrameLayout4.b();
                    shimmerFrameLayout3.b();
                    shimmerFrameLayout2.b();
                    shimmerFrameLayout.b();
                } else {
                    shimmerFrameLayout5.c();
                    shimmerFrameLayout4.c();
                    shimmerFrameLayout3.c();
                    shimmerFrameLayout2.c();
                    shimmerFrameLayout.c();
                }
                h0rVarH0.e.setVisibility(z20 ? 0 : 8);
                h0rVarH0.i.setVisibility((z20 || !z21) ? 8 : 0);
                h0rVarH0.h.setVisibility((z20 || !z21) ? 8 : 0);
                return Unit.f46060a;
            case 20:
                return l(obj);
            case 21:
                oi70 oi70Var = (oi70) obj2;
                si70 si70Var = (si70) this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                if (si70Var != null) {
                    if (si70Var instanceof pi70) {
                        boolean z22 = ((pi70) si70Var).f27031a;
                        mi70 mi70Var = oi70.P1;
                        l0r l0rVarG0 = oi70Var.G0();
                        l0rVarG0.b.setAlpha(z22 ? 1.0f : 0.5f);
                        l0rVarG0.e.setClickable(z22);
                        l0rVarG0.d.setClickable(z22);
                        l0rVarG0.c.setClickable(z22);
                    } else if (si70Var instanceof ri70) {
                        boolean z23 = ((ri70) si70Var).f30527a;
                        mi70 mi70Var2 = oi70.P1;
                        String strH8 = oi70Var.H(z23 ? R.string.games_quick_bets_message_min : R.string.games_quick_bets_message_max);
                        strH8.getClass();
                        oi70Var.o0();
                        ii iiVar3 = oi70Var.M1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH9 = oi70Var.H(R.string.error);
                        String strH10 = oi70Var.H(R.string.ok);
                        strH10.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH9, (CharSequence) strH8, (CharSequence) strH10, oi70Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_BET_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC3 = oi70Var.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    } else if (si70Var instanceof qi70) {
                        qi70 qi70Var = (qi70) si70Var;
                        gxo gxoVar = qi70Var.f28777a;
                        double d4 = qi70Var.b;
                        String str6 = qi70Var.c;
                        mi70 mi70Var3 = oi70.P1;
                        int iOrdinal3 = gxoVar.ordinal();
                        if (iOrdinal3 == 0) {
                            appCompatButton = oi70Var.G0().e;
                        } else if (iOrdinal3 == 1) {
                            appCompatButton = oi70Var.G0().d;
                        } else {
                            if (iOrdinal3 != 2) {
                                t9f.b();
                                return null;
                            }
                            appCompatButton = oi70Var.G0().c;
                        }
                        pn40 pn40Var3 = pn40.f27267a;
                        appCompatButton.setText(pn40.d(d4, str6, p3u0.g));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 22:
                return m(obj);
            case 23:
                return o(obj);
            case 24:
                return r(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return s(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return t(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return x(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return y(obj);
            default:
                Throwable th = (Throwable) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                ((gk70) obj2).invoke(th);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf60(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
