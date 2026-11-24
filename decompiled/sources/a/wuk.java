package a;

import android.content.ComponentCallbacks2;
import android.net.Uri;
import android.os.Build;
import android.widget.ProgressBar;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wuk;", "La/wgk0;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wuk extends wgk0 {
    public final phf0 e2 = new phf0("CLIENT_DISCORD_ID_KEY");
    public final phf0 f2 = new phf0("DISCORD_CALLBACK_URL_KEY");
    public sje g2;
    public zri h2;
    public mne i2;
    public static final /* synthetic */ iiy[] k2 = {new ez40(wuk.class, "clientDiscordId", "getClientDiscordId()Ljava/lang/String;", 0), new ez40(wuk.class, "discordCallbackUrl", "getDiscordCallbackUrl()Ljava/lang/String;", 0)};
    public static final nek j2 = new nek();

    @Override // a.wgk0, a.by5
    public final void K0() throws NoSuchAlgorithmException {
        String strEncodeToString;
        super.K0();
        IntRange intRange = new IntRange(1, 64, 1);
        ArrayList arrayList = new ArrayList(r3d.q(intRange, 10));
        Iterator it = intRange.iterator();
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            f1e0.f8761a.getClass();
            arrayList.add(Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-._~".charAt(f1e0.b.f(66))));
        }
        String strB0 = CollectionsKt.b0(arrayList, "", null, null, null, 62);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = strB0.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        if (Build.VERSION.SDK_INT >= 26) {
            strEncodeToString = Base64.getUrlEncoder().withoutPadding().encodeToString(bArrDigest);
            strEncodeToString.getClass();
        } else {
            strEncodeToString = android.util.Base64.encodeToString(bArrDigest, 11);
            strEncodeToString.getClass();
        }
        iiy[] iiyVarArr = k2;
        String strN = axq.n(b1j.n("https://discord.com/oauth2/authorize?client_id=", this.e2.n(this, iiyVarArr[0]), "&response_type=code&redirect_uri=", this.f2.n(this, iiyVarArr[1]), "&scope=identify+email+openid&code_challenge="), strEncodeToString, "&&code_challenge_method=S256");
        ProgressBar progressBar = I0().b;
        I0().d.c(strN);
        siq fixedWebView = I0().d.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setFixedWebViewClient(new vuk(this, strB0, progressBar));
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
                khf0 khf0VarA = hhk0Var.a();
                this.h2 = new zri((azj0) khf0VarA.b);
                this.i2 = (mne) khf0VarA.c;
                return;
            }
        }
        jf4.n(b1j.i(hhk0.class, "Cannot create dependency "));
    }

    @Override // a.by5
    public final int N0() {
        return R.string.social_discord;
    }

    public final boolean T0(String str, String str2) {
        sje sjeVar;
        if (!kotlin.text.c.x(str, this.f2.n(this, k2[1]), false)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        String queryParameter = uri.getQueryParameter("code");
        Uri uri2 = Uri.parse(str);
        uri2.getClass();
        String queryParameter2 = uri2.getQueryParameter("error");
        if (queryParameter2 != null) {
            if (queryParameter2.equals("access_denied")) {
                F().t0(i120.V(new Pair("CLOSE_SOCIAL", "")), "CLOSE_SOCIAL");
                y0();
                return true;
            }
            F().t0(i120.V(new Pair("ERROR_SOCIAL", H(R.string.exit_from_social))), "ERROR_SOCIAL");
            y0();
            return true;
        }
        if (queryParameter == null || ((sjeVar = this.g2) != null && d5c.R(sjeVar))) {
            return true;
        }
        kin0 kin0VarE = qem0.e();
        mne mneVar = this.i2;
        yje yjeVar = null;
        if (mneVar == null) {
            Intrinsics.h("coroutineDispatchers");
            throw null;
        }
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(kin0VarE, mneVar.b));
        this.g2 = sjeVarA;
        sac.V(sjeVarA, new e3j(this, (byte) 19), null, null, new xb2((Object) this, (Object) queryParameter, (Object) str2, yjeVar, (byte) 14), 14);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        sje sjeVar = this.g2;
        if (sjeVar != null) {
            d5c.G(sjeVar, null);
        }
        this.g2 = null;
        this.j1 = true;
    }
}
