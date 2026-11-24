package a;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends giv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45275a = true;
    public final lhp b = lhp.d;

    @Override // a.giv
    public final lhp a() {
        return this.b;
    }

    public final String toString() {
        String strL;
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        boolean z = this.f45275a;
        if (z) {
            strL = !z ? brm0.l("UNDEFINED(", z ? 1 : 0, ')') : "JPEG_R";
        } else {
            strL = "JPEG";
        }
        return axq.m(sb, strL, ')');
    }
}
