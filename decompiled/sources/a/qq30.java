package a;

import android.app.ActivityManager;
import android.os.StatFs;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class qq30 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29148a;
    public final /* synthetic */ zpu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq30(zpu zpuVar, byte b) {
        super(0);
        this.f29148a = b;
        this.b = zpuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29148a;
        zpu zpuVar = this.b;
        switch (b) {
            case 0:
                StatFs statFs = (StatFs) zpuVar.c;
                statFs.getClass();
                return Long.valueOf(statFs.getTotalBytes());
            default:
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ActivityManager activityManager = (ActivityManager) zpuVar.b;
                activityManager.getClass();
                activityManager.getMemoryInfo(memoryInfo);
                return Long.valueOf(memoryInfo.totalMem);
        }
    }
}
