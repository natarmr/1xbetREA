package a;

/* JADX INFO: loaded from: classes.dex */
public final class d44 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5436a;
    public final boolean b;
    public final androidx.media3.common.b c;

    public d44(int i, androidx.media3.common.b bVar, boolean z) {
        super(twn.m(i, "AudioTrack write failed: "));
        this.b = z;
        this.f5436a = i;
        this.c = bVar;
    }
}
