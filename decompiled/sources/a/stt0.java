package a;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class stt0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32789a;

    public /* synthetic */ stt0(byte b) {
        this.f32789a = b;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f32789a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            default:
                return new Thread(runnable, "vk-api-network-thread-" + wvt0.f39856a.getAndIncrement());
        }
    }
}
