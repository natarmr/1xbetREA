package a;

/* JADX INFO: loaded from: classes.dex */
public final class e34 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7117a;
    public final boolean b;

    public e34(int i, boolean z) {
        super(twn.m(i, "AudioOutput write failed: "));
        this.b = z;
        this.f7117a = i;
    }
}
