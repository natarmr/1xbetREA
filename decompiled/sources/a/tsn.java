package a;

import android.app.ActivityManager;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class tsn implements Runnable {
    public static final /* synthetic */ tsn b = new tsn((byte) 2);
    public static final /* synthetic */ tsn c = new tsn((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34467a;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.f34467a) {
            case 0:
                try {
                    Method method = ebs0.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (qsn.d()) {
                        qsn.a().e();
                        break;
                    }
                    return;
                } finally {
                    Method method2 = ebs0.b;
                    Trace.endSection();
                }
            case 1:
            case 2:
            case 3:
                return;
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
                    sb.append("Memory state is: ");
                    sb.append(i);
                    Log.i("PhenotypeProcessReaper", sb.toString());
                    z = runningAppProcessInfo.importance >= 400;
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                if (new Boolean(z).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ tsn(byte b2) {
        this.f34467a = b2;
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }
}
