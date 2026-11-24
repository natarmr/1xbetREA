package a;

import android.widget.ProgressBar;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gr10;", "La/wgk0;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gr10 extends wgk0 {
    public final phf0 e2 = new phf0("MAIL_RU_ID_KEY");
    public final phf0 f2 = new phf0("MAIL_RU_CALLBACK_URL_KEY");
    public static final /* synthetic */ iiy[] h2 = {new ez40(gr10.class, "mailruId", "getMailruId()Ljava/lang/String;", 0), new ez40(gr10.class, "mailruCallbackUrl", "getMailruCallbackUrl()Ljava/lang/String;", 0)};
    public static final xuz g2 = new xuz();

    @Override // a.wgk0, a.by5
    public final void K0() {
        super.K0();
        ProgressBar progressBar = I0().b;
        iiy[] iiyVarArr = h2;
        I0().d.c(ua80.i("https://connect.mail.ru/oauth/authorize?redirect_uri=", this.f2.n(this, iiyVarArr[1]), "&response_type=token&client_id=", this.e2.n(this, iiyVarArr[0])));
        siq fixedWebView = I0().d.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setFixedWebViewClient(new fr10(this, progressBar));
        }
    }

    @Override // a.by5
    public final int N0() {
        return R.string.social_mailru_label_new;
    }
}
