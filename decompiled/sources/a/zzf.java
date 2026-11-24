package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class zzf {
    public static final yzf Companion = new yzf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f45251a;
    public final Boolean b;

    public /* synthetic */ zzf(int i, Boolean bool, Long l) {
        if ((i & 1) == 0) {
            this.f45251a = null;
        } else {
            this.f45251a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }
}
