package com.huawei.hms.push;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<a> f45936a;

    public interface a {
        void a(Message message);
    }

    public f(a aVar) {
        this.f45936a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = this.f45936a.get();
        if (aVar != null) {
            aVar.a(message);
        }
    }
}
