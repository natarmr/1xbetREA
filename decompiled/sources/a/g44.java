package a;

import android.media.AudioTrack;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ExceptionCode;

/* JADX INFO: loaded from: classes.dex */
public final class g44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f44 f10645a;
    public final int b;
    public final bbw0 c;
    public byte d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    public g44(AudioTrack audioTrack, bbw0 bbw0Var) {
        this.f10645a = new f44(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = bbw0Var;
        a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            return;
        }
        if (i == 1) {
            this.f = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = ExceptionCode.CRASH_EXCEPTION;
        } else if (i == 4) {
            this.f = 500000;
        } else {
            v4i0.e();
        }
    }
}
