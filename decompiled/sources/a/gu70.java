package a;

import android.app.PendingIntent;
import android.net.sip.SipAudioCall;
import android.net.sip.SipManager;
import android.net.sip.SipProfile;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class gu70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SipManager f11916a;
    public final String b;
    public final n6k0 c;
    public final PendingIntent d;
    public SipProfile e;
    public SipAudioCall f;
    public String g;
    public String h;
    public String i;
    public String j;
    public xiz k;
    public xiz l;
    public xiz m;
    public xiz n;
    public xiz o;
    public xiz p;
    public xiz q;
    public final a8z r;
    public final n0o0 s;

    public gu70(SipManager sipManager, String str, n6k0 n6k0Var, PendingIntent pendingIntent) {
        sipManager.getClass();
        str.getClass();
        n6k0Var.getClass();
        pendingIntent.getClass();
        this.f11916a = sipManager;
        this.b = str;
        this.c = n6k0Var;
        this.d = pendingIntent;
        final byte b = 0;
        this.r = maz.a(wez.b, new Function0(this) { // from class: a.du70
            public final /* synthetic */ gu70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                gu70 gu70Var = this.b;
                switch (b2) {
                    case 0:
                        return new fu70(gu70Var);
                    default:
                        return new eu70(gu70Var);
                }
            }
        });
        final byte b2 = 1;
        this.s = maz.b(new Function0(this) { // from class: a.du70
            public final /* synthetic */ gu70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                gu70 gu70Var = this.b;
                switch (b3) {
                    case 0:
                        return new fu70(gu70Var);
                    default:
                        return new eu70(gu70Var);
                }
            }
        });
    }

    public static String b(SipProfile sipProfile) {
        bzu bzuVar = new bzu((byte) 19);
        String profileName = sipProfile.getProfileName();
        if (profileName == null) {
            profileName = "";
        }
        cww.G(bzuVar, "profile.profileName", profileName);
        String uriString = sipProfile.getUriString();
        if (uriString == null) {
            uriString = "";
        }
        cww.G(bzuVar, "profile.uriString", uriString);
        String authUserName = sipProfile.getAuthUserName();
        if (authUserName == null) {
            authUserName = "";
        }
        cww.G(bzuVar, "profile.authUserName", authUserName);
        String displayName = sipProfile.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        cww.G(bzuVar, "profile.displayName", displayName);
        cww.G(bzuVar, "profile.port", String.valueOf(sipProfile.getPort()));
        String protocol = sipProfile.getProtocol();
        if (protocol == null) {
            protocol = "";
        }
        cww.G(bzuVar, "profile.protocol", protocol);
        String userName = sipProfile.getUserName();
        if (userName == null) {
            userName = "";
        }
        cww.G(bzuVar, "profile.userName", userName);
        String sipDomain = sipProfile.getSipDomain();
        cww.G(bzuVar, "profile.sipDomain", sipDomain != null ? sipDomain : "");
        return bzuVar.a().toString();
    }

    public final void a() {
        SipProfile sipProfile = this.e;
        if (sipProfile != null) {
            try {
                this.f11916a.close(sipProfile.getUriString());
            } catch (Exception e) {
                e.printStackTrace();
                String message = e.getMessage();
                if (message != null) {
                    this.c.a("errorCloseCall", "error - ".concat(message));
                }
            }
        }
    }
}
