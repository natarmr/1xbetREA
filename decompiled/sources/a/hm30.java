package a;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class hm30 extends ypc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13287a;

    public hm30(IllegalStateException illegalStateException, jm30 jm30Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(jm30Var == null ? null : jm30Var.f16746a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f13287a = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
