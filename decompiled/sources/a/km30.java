package a;

/* JADX INFO: loaded from: classes.dex */
public final class km30 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18520a;
    public final boolean b;
    public final jm30 c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    public km30(androidx.media3.common.b bVar, om30 om30Var, boolean z, int i) {
        String str = "Decoder init failed: [" + i + "], " + bVar;
        String str2 = bVar.p;
        StringBuilder sbT = brm0.t("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        sbT.append(Math.abs(i));
        this(str, om30Var, str2, z, null, sbT.toString());
    }

    public km30(String str, Throwable th, String str2, boolean z, jm30 jm30Var, String str3) {
        super(str, th);
        this.f18520a = str2;
        this.b = z;
        this.c = jm30Var;
        this.d = str3;
    }
}
