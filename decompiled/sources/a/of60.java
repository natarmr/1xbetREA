package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/of60;", "La/wgk0;", "<init>", "()V", "a/evz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class of60 extends wgk0 {
    public final phf0 e2 = new phf0("OK_ID_KEY");
    public final phf0 f2 = new phf0("OK_KEY_KEY");
    public w5z g2;
    public mne h2;
    public static final /* synthetic */ iiy[] j2 = {new ez40(of60.class, "okId", "getOkId()Ljava/lang/String;", 0), new ez40(of60.class, "okKey", "getOkKey()Ljava/lang/String;", 0)};
    public static final evz i2 = new evz();

    @Override // a.wgk0, a.by5
    public final void K0() {
        super.K0();
        I0().d.c("https://connect.ok.ru/oauth/authorize?client_id=" + this.e2.n(this, j2[0]) + "&response_type=token&redirect_uri=okauth://auth&layout=m&platform=ANDROID&scope=VALUABLE_ACCESS");
        siq fixedWebView = I0().d.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setFixedWebViewClient(new mf60(this));
        }
    }

    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hhk0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hhk0 hhk0Var = (hhk0) (ze3Var instanceof hhk0 ? ze3Var : null);
            if (hhk0Var != null) {
                this.h2 = (mne) hhk0Var.a().c;
                return;
            }
        }
        jf4.n(b1j.i(hhk0.class, "Cannot create dependency "));
    }

    @Override // a.by5
    public final int N0() {
        return R.string.social_ok;
    }

    public final boolean T0(String str) {
        Map linkedHashMap;
        if (!kotlin.text.c.x(str, "okauth://auth", false)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        String fragment = uri.getFragment();
        if (fragment == null) {
            linkedHashMap = lun.f20680a;
            linkedHashMap.getClass();
        } else {
            List listSplit$default = StringsKt__StringsKt.split$default(fragment, new String[]{"&"}, false, 0, 6, null);
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : listSplit$default) {
                if (StringsKt.P((String) obj, '=')) {
                    arrayList.add(obj);
                }
            }
            int iA = wp20.a(r3d.q(arrayList, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
            for (String str2 : arrayList) {
                linkedHashMap2.put(StringsKt.u0(StringsKt.q0(str2, '=')).toString(), StringsKt.u0(StringsKt.n0(str2, '=')).toString());
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (str3.length() > 0 && str4.length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        String str5 = (String) linkedHashMap.get("access_token");
        String str6 = (String) linkedHashMap.get("session_secret_key");
        if (str6 == null) {
            str6 = (String) linkedHashMap.get("refresh_token");
        }
        if (str5 == null || str6 == null) {
            F().t0(i120.V(new Pair("CLOSE_SOCIAL", "")), "CLOSE_SOCIAL");
            y0();
            return true;
        }
        Context contextO0 = o0();
        iiy[] iiyVarArr = j2;
        String strN = this.e2.n(this, iiyVarArr[0]);
        String strN2 = this.f2.n(this, iiyVarArr[1]);
        strN.getClass();
        strN2.getClass();
        if (StringsKt.W(strN) || StringsKt.W(strN2)) {
            jf4.o(contextO0.getString(R.string.no_application_data));
            return false;
        }
        Context applicationContext = contextO0.getApplicationContext();
        applicationContext.getClass();
        w5z w5zVar = new w5z(applicationContext, strN, strN2);
        this.g2 = w5zVar;
        w5zVar.b = str5;
        w5zVar.c = str6;
        sac.V(x0x.Q(this.u1), new cd60((Object) this, (byte) 3), null, null, new yd60((Object) this, (Object) str5, (Object) wp20.b(new Pair("fields", "uid, name, last_name")), (yje) null, (byte) 1), 14);
        return true;
    }
}
