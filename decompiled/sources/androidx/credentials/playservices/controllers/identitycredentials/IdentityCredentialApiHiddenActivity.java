package androidx.credentials.playservices.controllers.identitycredentials;

import a.acf;
import a.ecf;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f45365a;
    public boolean b;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.f45365a;
        if (resultReceiver != null) {
            acf acfVar = ecf.f7564a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i);
            bundle.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, bundle);
        }
        this.b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f45365a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_ERROR_NAME");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.b) {
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
        if (pendingIntent != null) {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), ecf.c ? 1 : 0, null, 0, 0, 0, null);
            return;
        }
        ResultReceiver resultReceiver2 = this.f45365a;
        if (resultReceiver2 != null) {
            acf acfVar = ecf.f7564a;
            acf.b(resultReceiver2, stringExtra, "Internal error");
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }
}
