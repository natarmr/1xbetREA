package a;

import android.content.Context;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ntj implements jbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24102a;
    public final ArrayList b;
    public final jbj c;
    public ezp d;
    public ny3 e;
    public aee f;
    public jbj g;
    public m3t0 h;
    public gbj i;
    public bae0 j;
    public jbj k;

    public ntj(Context context, jbj jbjVar) {
        this.f24102a = context.getApplicationContext();
        jbjVar.getClass();
        this.c = jbjVar;
        this.b = new ArrayList();
    }

    public static void o(jbj jbjVar, rsj rsjVar) {
        if (jbjVar != null) {
            jbjVar.c(rsjVar);
        }
    }

    @Override // a.jbj
    public final void c(rsj rsjVar) {
        rsjVar.getClass();
        this.c.c(rsjVar);
        this.b.add(rsjVar);
        o(this.d, rsjVar);
        o(this.e, rsjVar);
        o(this.f, rsjVar);
        o(this.g, rsjVar);
        o(this.h, rsjVar);
        o(this.i, rsjVar);
        o(this.j, rsjVar);
    }

    @Override // a.jbj
    public final void close() {
        jbj jbjVar = this.k;
        if (jbjVar != null) {
            try {
                jbjVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // a.jbj
    public final long d(mbj mbjVar) {
        jbj jbjVar;
        x0x.K(this.k == null);
        Uri uri = mbjVar.f21512a;
        String scheme = uri.getScheme();
        String str = vtt0.f38024a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f24102a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    ezp ezpVar = new ezp(false);
                    this.d = ezpVar;
                    f(ezpVar);
                }
                jbjVar = this.d;
                this.k = jbjVar;
            } else {
                if (this.e == null) {
                    ny3 ny3Var = new ny3(context);
                    this.e = ny3Var;
                    f(ny3Var);
                }
                jbjVar = this.e;
                this.k = jbjVar;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                ny3 ny3Var2 = new ny3(context);
                this.e = ny3Var2;
                f(ny3Var2);
            }
            jbjVar = this.e;
            this.k = jbjVar;
        } else if (RemoteMessageConst.Notification.CONTENT.equals(scheme)) {
            if (this.f == null) {
                aee aeeVar = new aee(context);
                this.f = aeeVar;
                f(aeeVar);
            }
            jbjVar = this.f;
            this.k = jbjVar;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            jbj jbjVar2 = this.c;
            if (zEquals) {
                jbjVar = this.g;
                if (jbjVar == null) {
                    try {
                        jbj jbjVar3 = (jbj) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = jbjVar3;
                        f(jbjVar3);
                    } catch (ClassNotFoundException unused) {
                        f1t0.g0("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        e9d0.m("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    jbj jbjVar4 = this.g;
                    if (jbjVar4 == null) {
                        this.g = jbjVar2;
                    } else {
                        jbjVar2 = jbjVar4;
                    }
                    jbjVar = jbjVar2;
                }
                this.k = jbjVar;
            } else if (ParameterNames.UDP.equals(scheme)) {
                if (this.h == null) {
                    m3t0 m3t0Var = new m3t0();
                    this.h = m3t0Var;
                    f(m3t0Var);
                }
                jbjVar = this.h;
                this.k = jbjVar;
            } else if (RemoteMessageConst.DATA.equals(scheme)) {
                if (this.i == null) {
                    gbj gbjVar = new gbj(false);
                    this.i = gbjVar;
                    f(gbjVar);
                }
                jbjVar = this.i;
                this.k = jbjVar;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    bae0 bae0Var = new bae0(context);
                    this.j = bae0Var;
                    f(bae0Var);
                }
                jbjVar = this.j;
                this.k = jbjVar;
            } else {
                this.k = jbjVar2;
                jbjVar = jbjVar2;
            }
        }
        return jbjVar.d(mbjVar);
    }

    @Override // a.jbj
    public final Map e() {
        jbj jbjVar = this.k;
        return jbjVar == null ? Collections.EMPTY_MAP : jbjVar.e();
    }

    public final void f(jbj jbjVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            jbjVar.c((rsj) arrayList.get(i));
            i++;
        }
    }

    @Override // a.jbj
    public final Uri getUri() {
        jbj jbjVar = this.k;
        if (jbjVar == null) {
            return null;
        }
        return jbjVar.getUri();
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) {
        jbj jbjVar = this.k;
        jbjVar.getClass();
        return jbjVar.read(bArr, i, i2);
    }
}
