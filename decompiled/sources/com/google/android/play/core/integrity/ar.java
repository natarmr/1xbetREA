package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
final class ar extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f45603a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f45603a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f45603a.f45604a.trySetResult(3);
        } else if (i == 2) {
            this.f45603a.f45604a.trySetResult(2);
        } else {
            if (i != 3) {
                return;
            }
            this.f45603a.f45604a.trySetResult(1);
        }
    }
}
