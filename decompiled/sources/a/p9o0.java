package a;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p9o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f26617a;

    public final void a() {
        this.f26617a = null;
        ArrayList arrayList = q9o0.b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        Message message = this.f26617a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
