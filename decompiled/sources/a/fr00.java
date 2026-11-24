package a;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class fr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f10001a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;

    public fr00(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f10001a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.f10001a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
