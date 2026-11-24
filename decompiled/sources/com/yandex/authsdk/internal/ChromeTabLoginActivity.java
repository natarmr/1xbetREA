package com.yandex.authsdk.internal;

import a.fob;
import a.mii0;
import a.nr;
import a.pv00;
import a.qjj;
import a.rwj;
import a.svs0;
import a.tkz;
import a.tvk;
import a.x0x;
import a.x2x;
import a.yc3;
import a.ys10;
import a.yzn0;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.authsdk.YandexAuthOptions;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ChromeTabLoginActivity extends yc3 {
    public nr B;

    @Override // a.kxq, a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) throws UnsupportedEncodingException {
        super.onCreate(bundle);
        YandexAuthOptions yandexAuthOptions = (YandexAuthOptions) x2x.U(getIntent(), "com.yandex.authsdk.EXTRA_OPTIONS", YandexAuthOptions.class);
        if (yandexAuthOptions == null) {
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("com.yandex.authsdk.EXTRA_STATE");
        stringExtra.getClass();
        nr nrVar = new nr(new pv00((Activity) this), stringExtra, new svs0((byte) 4), yandexAuthOptions.f46055a);
        this.B = nrVar;
        if (bundle == null) {
            Intent intent = getIntent();
            intent.getClass();
            String strQ = nrVar.q(intent, "yandex_auth_sdk_android_ct");
            String stringExtra2 = getIntent().getStringExtra("com.yandex.authsdk.internal.EXTRA_PACKAGE_NAME");
            yzn0 yzn0VarM = new mii0((byte) 22).m();
            Intent intent2 = (Intent) yzn0VarM.f43523a;
            intent2.putExtra("android.intent.extra.REFERRER", Uri.parse("android-app://" + getPackageName()));
            intent2.setPackage(stringExtra2);
            intent2.setData(Uri.parse(strQ));
            startActivity(intent2, (Bundle) yzn0VarM.b);
        }
    }

    @Override // a.agd, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data != null) {
            nr nrVar = this.B;
            if (nrVar == null) {
                Intrinsics.h("loginHandler");
                throw null;
            }
            setResult(-1, nrVar.A(data));
            finish();
        }
    }

    @Override // a.yc3, a.kxq, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        tkz tkzVarQ = x0x.Q(this.f44297a);
        rwj rwjVar = tvk.f34603a;
        qjj.W(tkzVarQ, ys10.f43147a, null, new fob(this, null, (byte) 9), 2);
    }
}
