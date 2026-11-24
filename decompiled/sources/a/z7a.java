package a;

import android.content.Intent;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z7a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43908a;
    public final /* synthetic */ b8a b;

    public /* synthetic */ z7a(b8a b8aVar, byte b) {
        this.f43908a = b;
        this.b = b8aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f43908a;
        b8a b8aVar = this.b;
        switch (b) {
            case 0:
                Log.d("b8a", "Finishing due to inactivity");
                b8aVar.f2147a.finish();
                break;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra(Payload.RESPONSE_TIMEOUT, true);
                b8aVar.f2147a.setResult(0, intent);
                b8aVar.a();
                break;
        }
    }
}
