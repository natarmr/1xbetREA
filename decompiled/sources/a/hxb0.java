package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class hxb0 {
    public static final dxb0 Companion = new dxb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13808a;
    public final Long b;
    public final gxb0 c;

    public /* synthetic */ hxb0(int i, String str, Long l, gxb0 gxb0Var) {
        if ((i & 1) == 0) {
            this.f13808a = null;
        } else {
            this.f13808a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = gxb0Var;
        }
    }
}
