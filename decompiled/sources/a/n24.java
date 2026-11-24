package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class n24 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlo f22782a;
    public final q9o0 b;
    public final /* synthetic */ o24 c;

    public n24(o24 o24Var, q9o0 q9o0Var, qlo qloVar) {
        this.c = o24Var;
        this.b = q9o0Var;
        this.f22782a = qloVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new w1(this, (byte) 12));
        }
    }
}
