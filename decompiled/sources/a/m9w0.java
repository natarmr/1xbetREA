package a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class m9w0 extends jaw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21432a;
    public final /* synthetic */ oav b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9w0(oav oavVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte) 0);
        this.b = oavVar;
        this.f21432a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = pav.f26674a;
        oav oavVar = this.b;
        Context context = this.f21432a;
        int iC = oavVar.c(context, i2);
        AtomicBoolean atomicBoolean = bbv.f2326a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = oavVar.a(context, iC, "n");
            oavVar.g(context, new ConnectionResult(iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592), null));
        }
    }
}
