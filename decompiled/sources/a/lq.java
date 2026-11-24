package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class lq {
    public static final kq Companion = new kq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq f20463a;

    public /* synthetic */ lq(int i, jq jqVar) {
        if (1 == (i & 1)) {
            this.f20463a = jqVar;
        } else {
            m2x.I(i, 1, gq.f11707a.getDescriptor());
            throw null;
        }
    }

    public lq(String str, int i, long j) {
        str.getClass();
        this.f20463a = new jq(str, i, j);
    }
}
