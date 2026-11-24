package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes2.dex */
public final class tzn0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34813a = 0;
    public Context b;
    public Object c;

    public tzn0(okt0 okt0Var) {
        this.c = okt0Var;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        uzn0 uzn0Var = (uzn0) this.c;
        if (uzn0Var != null) {
            Context context = uzn0Var.c.b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f34813a) {
            case 0:
                uzn0 uzn0Var = (uzn0) this.c;
                if (uzn0Var != null && uzn0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    uzn0 uzn0Var2 = (uzn0) this.c;
                    FirebaseMessaging firebaseMessaging = uzn0Var2.c;
                    FirebaseMessaging.b(uzn0Var2, 0L);
                    Context context2 = this.b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    throw null;
                }
                return;
        }
    }

    public /* synthetic */ tzn0() {
    }
}
