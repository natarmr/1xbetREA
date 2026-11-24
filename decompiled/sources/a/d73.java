package a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d73 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5576a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d73(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f5576a = (byte) 2;
        this.b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        byte b = this.f5576a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((w1) obj).run();
                break;
            case 1:
                rwj rwjVar = tvk.f34603a;
                ((n5a) obj).D(ys10.f43147a, Long.valueOf(j));
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new fd3((Context) obj, (byte) 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ d73(Runnable runnable, byte b) {
        this.f5576a = b;
        this.b = runnable;
    }
}
