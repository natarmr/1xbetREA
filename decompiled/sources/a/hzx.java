package a;

import android.widget.ProgressBar;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hzx;", "La/wgk0;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hzx extends wgk0 {
    public final phf0 e2 = new phf0("ITS_ME_CLIENT_ID");
    public final phf0 f2 = new phf0("ITS_ME_SERVICE");
    public final phf0 g2 = new phf0("ITS_ME_REDIRECT_URL");
    public final phf0 h2 = new phf0("ITS_ME_DOMAIN");
    public final p7m0 i2 = q7m0.a("");
    public static final /* synthetic */ iiy[] k2 = {new ez40(hzx.class, "itsMeClientId", "getItsMeClientId()Ljava/lang/String;", 0), new ez40(hzx.class, "itsMeService", "getItsMeService()Ljava/lang/String;", 0), new ez40(hzx.class, "itsMeRedirectUrl", "getItsMeRedirectUrl()Ljava/lang/String;", 0), new ez40(hzx.class, "itsMeDomain", "getItsMeDomain()Ljava/lang/String;", 0)};
    public static final bst j2 = new bst();

    @Override // a.wgk0, a.by5
    public final void K0() throws Exception {
        super.K0();
        ProgressBar progressBar = I0().b;
        iiy[] iiyVarArr = k2;
        String strL = kng0.l("openid service:", this.f2.n(this, iiyVarArr[1]), " profile email phone address");
        String strN = this.h2.n(this, iiyVarArr[3]);
        String strN2 = this.e2.n(this, iiyVarArr[0]);
        String strO = rw2.o(b1j.n("https://idp.", strN, ".itsme.services/v2/authorization?client_id=", strN2, "&redirect_uri="), this.g2.n(this, iiyVarArr[2]), "&response_type=code&claims={\"id_token\":{\"gender\":null,\"given_name\":null,\"family_name\":null,\"middle_name\":null,\"birthdate\":null,\"email\":null,\"http://itsme.services/v2/claim/BENationalNumber\":null,\"http://itsme.services/v2/claim/BEeidSn\":null,\"http://itsme.services/v2/claim/validityTo\":null,\"http://itsme.services/v2/claim/IDDocumentSN\":null,\"http://itsme.services/v2/claim/claim_citizenship_as_iso\":null,\"address\":null,\"phone_number\":null,\"http://itsme.services/v2/claim/physical_person_photo\":null}}&scope=", strL);
        lkz lkzVar = lkz.f20223a;
        kaw kawVar = new kaw(this, null, (byte) 10);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r1w(this.i2, clzVarW, kawVar, (yje) null), 3);
        I0().d.c(strO);
        siq fixedWebView = I0().d.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setFixedWebViewClient(new gzx(this, progressBar));
        }
        I0().c.setTitleCentered(true);
    }

    @Override // a.by5
    public final int N0() {
        return R.string.social_its_me;
    }
}
