package org.xplatform.client1.features.appactivity;

import a.af3;
import a.b1j;
import a.clx;
import a.dlx;
import a.fiu0;
import a.j120;
import a.jf4;
import a.kiu0;
import a.o5d0;
import a.p1w0;
import a.sre0;
import a.y2x;
import a.yc3;
import a.yr3;
import a.ze3;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class IntentForwardingActivity extends yc3 {
    public fiu0 B;
    public final kiu0 Y = new kiu0(sre0.f32672a.b(dlx.class), new clx(this, (byte) 0), new y2x(this, (byte) 8), new clx(this, (byte) 1));

    @Override // a.kxq, a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intentAddFlags;
        super.onCreate(bundle);
        ComponentCallbacks2 application = getApplication();
        application.getClass();
        Intent intentAddCategory = null;
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yr3.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof yr3)) {
                ze3Var = null;
            }
            yr3 yr3Var = (yr3) ze3Var;
            if (yr3Var != null) {
                this.B = (fiu0) yr3Var.a(p1w0.h).M0.get();
                Intent intent = getIntent();
                intent.getClass();
                if (j120.f0(this, intent)) {
                    return;
                }
                dlx dlxVar = (dlx) this.Y.getValue();
                Intent intent2 = getIntent();
                if (intent2 != null) {
                    dlxVar.b.getClass();
                    dlxVar.c.a(intent2);
                }
                Intent intentQ = j120.Q(this);
                if (intentQ != null && (intentAddFlags = intentQ.addFlags(67108864)) != null) {
                    intentAddCategory = intentAddFlags.addCategory("CUSTOM_INTENT");
                }
                startActivity(intentAddCategory);
                finish();
                return;
            }
        }
        jf4.n(b1j.i(yr3.class, "Cannot create dependency "));
    }

    @Override // a.agd, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (j120.f0(this, intent)) {
            return;
        }
        ((dlx) this.Y.getValue()).c.a(intent);
        finish();
    }
}
