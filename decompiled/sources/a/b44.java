package a;

/* JADX INFO: loaded from: classes.dex */
public final class b44 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1939a;

    /* JADX WARN: Illegal instructions before constructor call */
    public b44(int i, int i2, int i3, int i4, androidx.media3.common.b bVar, boolean z, i34 i34Var) {
        StringBuilder sbT = dw9.t("AudioTrack init failed 0 Config(", i, ", ", ", ", i2);
        axq.r(i3, i4, ", ", ") ", sbT);
        sbT.append(bVar);
        sbT.append(z ? " (recoverable)" : "");
        super(sbT.toString(), i34Var);
        this.f1939a = z;
    }
}
