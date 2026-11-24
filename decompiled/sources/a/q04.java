package a;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q04 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27877a;
    public final /* synthetic */ int b;

    public /* synthetic */ q04(int i, byte b) {
        this.f27877a = b;
        this.b = i;
    }

    @Override // a.lin0
    public final Object get() {
        byte b = this.f27877a;
        int i = this.b;
        switch (b) {
            case 0:
                return new HandlerThread(r04.a(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(r04.a(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
