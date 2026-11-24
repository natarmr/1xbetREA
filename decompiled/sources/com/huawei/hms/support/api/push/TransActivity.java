package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.os.Bundle;
import com.huawei.hms.push.t;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hwpush_trans_activity);
        getWindow().addFlags(67108864);
        t.a(this, getIntent());
        finish();
    }
}
