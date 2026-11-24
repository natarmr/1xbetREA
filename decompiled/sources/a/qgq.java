package a;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: loaded from: classes2.dex */
public final class qgq extends pd90 {
    public static final f03 e = f03.d();
    public final ll50 c;
    public final Context d;

    public qgq(ll50 ll50Var, Context context) {
        this.d = context;
        this.c = ll50Var;
    }

    @Override // a.pd90
    public final boolean a() {
        String str;
        ll50 ll50Var = this.c;
        String strD = ll50Var.D();
        boolean zIsEmpty = strD == null ? true : strD.trim().isEmpty();
        f03 f03Var = e;
        if (zIsEmpty) {
            f03Var.f("URL is missing:" + ll50Var.D());
            return false;
        }
        String strD2 = ll50Var.D();
        URI uriCreate = null;
        if (strD2 != null) {
            try {
                uriCreate = URI.create(strD2);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                f03Var.g("getResultUrl throws exception %s", e2.getMessage());
            }
        }
        if (uriCreate == null) {
            f03Var.f("URL cannot be parsed");
            return false;
        }
        Context context = this.d;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            f03.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (ltt0.b == null) {
                ltt0.b = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = ltt0.b;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        f03Var.f("URL fails allowlist rule: " + uriCreate);
                        return false;
                    }
                    if (host.contains(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            f03Var.f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            f03Var.f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            f03Var.f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            f03Var.f("URL port is less than or equal to 0");
            return false;
        }
        int iV = ll50Var.F() ? ll50Var.v() : 0;
        if (iV == 0 || iV == 1) {
            switch (ll50Var.v()) {
                case 1:
                    str = "HTTP_METHOD_UNKNOWN";
                    break;
                case 2:
                    str = "GET";
                    break;
                case 3:
                    str = "PUT";
                    break;
                case 4:
                    str = "POST";
                    break;
                case 5:
                    str = "DELETE";
                    break;
                case 6:
                    str = "HEAD";
                    break;
                case 7:
                    str = "PATCH";
                    break;
                case 8:
                    str = "OPTIONS";
                    break;
                case 9:
                    str = "TRACE";
                    break;
                case 10:
                    str = "CONNECT";
                    break;
                default:
                    str = "null";
                    break;
            }
            f03Var.f("HTTP Method is null or invalid: ".concat(str));
            return false;
        }
        if (ll50Var.G() && ll50Var.w() <= 0) {
            f03Var.f("HTTP ResponseCode is a negative value:" + ll50Var.w());
            return false;
        }
        if (ll50Var.H() && ll50Var.y() < 0) {
            f03Var.f("Request Payload is a negative value:" + ll50Var.y());
            return false;
        }
        if (ll50Var.I() && ll50Var.z() < 0) {
            f03Var.f("Response Payload is a negative value:" + ll50Var.z());
            return false;
        }
        if (!ll50Var.E() || ll50Var.t() <= 0) {
            f03Var.f("Start time of the request is null, or zero, or a negative value:" + ll50Var.t());
            return false;
        }
        if (ll50Var.J() && ll50Var.A() < 0) {
            f03Var.f("Time to complete the request is a negative value:" + ll50Var.A());
            return false;
        }
        if (ll50Var.L() && ll50Var.C() < 0) {
            f03Var.f("Time from the start of the request to the start of the response is null or a negative value:" + ll50Var.C());
            return false;
        }
        if (!ll50Var.K() || ll50Var.B() <= 0) {
            f03Var.f("Time from the start of the request to the end of the response is null, negative or zero:" + ll50Var.B());
            return false;
        }
        if (ll50Var.G()) {
            return true;
        }
        f03Var.f("Did not receive a HTTP Response Code");
        return false;
    }
}
