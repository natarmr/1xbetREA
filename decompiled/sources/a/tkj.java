package a;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class tkj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34097a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.f34097a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = vtt0.f38024a;
        Locale locale = Locale.US;
        StringBuilder sbT = dw9.t("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", "\n queuedInputBuffers=", i2);
        axq.r(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbT);
        axq.r(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbT);
        axq.r(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbT);
        axq.r(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbT);
        ua80.v(sbT, j, "\n videoFrameProcessingOffsetCount=", i11);
        sbT.append("\n}");
        return sbT.toString();
    }
}
