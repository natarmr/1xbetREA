package a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class omw0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f25524a;
    public final TaskCompletionSource b;
    public final FirebaseAuth c;
    public final /* synthetic */ s88 d;

    public omw0(s88 s88Var, kxq kxqVar, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        this.d = s88Var;
        this.f25524a = new WeakReference(kxqVar);
        this.b = taskCompletionSource;
        this.c = firebaseAuth;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Activity activity = (Activity) this.f25524a.get();
        TaskCompletionSource taskCompletionSource = this.b;
        if (activity == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            taskCompletionSource.setException(jfw0.a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
            s88.y(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            HashMap map = now0.f23886a;
            if (!intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    taskCompletionSource.setException(jfw0.a(msm0.v("WEB_CONTEXT_CANCELED")));
                    s88.y(context);
                    return;
                }
                return;
            }
            s0x.C(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
            taskCompletionSource.setException(jfw0.a((Status) (byteArrayExtra != null ? n6x.w(byteArrayExtra, creator) : null)));
            s88.y(context);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            Task taskB = this.c.b(s88.x(intent));
            s88 s88Var = this.d;
            taskB.addOnSuccessListener(new afm0(s88Var, taskCompletionSource, context)).addOnFailureListener(new fck0(s88Var, taskCompletionSource, context));
        } else {
            if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
                s88.x(intent);
                throw null;
            }
            if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                s88.x(intent);
                throw null;
            }
            taskCompletionSource.setException(jfw0.a(msm0.v("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + Separators.RPAREN)));
        }
    }
}
