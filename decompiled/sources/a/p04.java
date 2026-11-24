package a;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p04 implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26130a;
    public final /* synthetic */ wm30 b;

    public /* synthetic */ p04(dm30 dm30Var, wm30 wm30Var, byte b) {
        this.f26130a = b;
        this.b = wm30Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        byte b = this.f26130a;
        wm30 wm30Var = this.b;
        switch (b) {
            case 0:
                Handler handler = wm30Var.f39386a;
                if (Build.VERSION.SDK_INT >= 30) {
                    wm30Var.a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Handler handler2 = wm30Var.f39386a;
                if (Build.VERSION.SDK_INT >= 30) {
                    wm30Var.a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
