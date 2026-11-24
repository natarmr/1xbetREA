package com.google.android.play.core.integrity;

import a.h5w0;
import a.h8w0;
import a.qa3;
import a.y7w0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes2.dex */
final class as extends y7w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f45604a;
    final h5w0 b;
    private final h8w0 c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, h5w0 h5w0Var) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new h8w0("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.f45604a = taskCompletionSource;
        this.f = activity;
        this.b = h5w0Var;
    }

    @Override // a.y7w0
    public final void b(Bundle bundle) {
        this.b.d(this.f45604a);
        this.c.b("onRequestDialog(%s)", this.d);
        qa3 qa3VarA = this.e.a(bundle);
        if (qa3VarA != null) {
            this.f45604a.trySetException(qa3VarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            h8w0 h8w0Var = this.c;
            Object[] objArr = {this.d};
            h8w0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", h8w0.c(h8w0Var.f12650a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f45604a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        h8w0 h8w0Var2 = this.c;
        Object[] objArr2 = new Object[0];
        h8w0Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", h8w0.c(h8w0Var2.f12650a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
