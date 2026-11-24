package a;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class cig0 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final cf60 c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public com.google.android.gms.cloudmessaging.zzd g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nuj0 f4413a = new nuj0(0);
    public final Messenger e = new Messenger(new egx0(this, Looper.getMainLooper()));

    public cig0(Context context) {
        this.b = context;
        this.c = new cf60(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new n950("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final void a(Bundle bundle, String str) {
        nuj0 nuj0Var = this.f4413a;
        synchronized (nuj0Var) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) nuj0Var.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
                sb.append("Missing callback for ");
                sb.append(str);
                Log.w("Rpc", sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    public final Task b(Bundle bundle) {
        String string;
        int iR;
        Context context;
        synchronized (cig0.class) {
            int i2 = h;
            h = i2 + 1;
            string = Integer.toString(i2);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        nuj0 nuj0Var = this.f4413a;
        synchronized (nuj0Var) {
            nuj0Var.put(string, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.r() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.b;
        synchronized (cig0.class) {
            try {
                PendingIntent broadcast = i;
                if (broadcast == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    broadcast = PendingIntent.getBroadcast(context2, 0, intent2, e8x0.f7396a);
                    i = broadcast;
                }
                intent.putExtra(Payload.TYPE_APP, broadcast);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", rw2.o(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, HiAnalyticsConstant.REPORT_VAL_SEPARATOR));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f == null && this.g == null) {
            iR = this.c.r();
            context = this.b;
            if (iR == 2) {
                context.startService(intent);
            } else if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.g.f45479a.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iR = this.c.r();
                context = this.b;
                if (iR == 2) {
                    context.startService(intent);
                } else if (Build.VERSION.SDK_INT < 34) {
                    context.sendBroadcast(intent);
                } else {
                    context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                }
            }
        }
        taskCompletionSource.getTask().addOnCompleteListener(haw0.d, new ykv0(this, string, this.d.schedule(new fju0((Object) taskCompletionSource, (byte) 6), 30L, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }
}
