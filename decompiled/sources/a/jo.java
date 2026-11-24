package a;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class jo {
    public static final io Companion = new io();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16834a;
    public final Boolean b;

    public /* synthetic */ jo(int i, Boolean bool, String str) {
        this.f16834a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }
}
