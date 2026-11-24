package com.huawei.hms.framework.network.grs.h.g;

import a.asm0;
import a.c99;
import a.jwn;
import a.tnh0;
import a.vnh0;
import android.content.Context;
import android.gov.nist.core.Separators;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HostnameVerifier f45841a = new asm0();

    public static SSLSocketFactory a(Context context) {
        try {
            return new tnh0(new vnh0(context.getAssets().open(GrsApp.getInstance().getBrand(Separators.SLASH) + "grs_sp.bks")), jwn.a());
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e) {
            c99.l(e);
            return null;
        }
    }

    public static HostnameVerifier a() {
        return f45841a;
    }
}
