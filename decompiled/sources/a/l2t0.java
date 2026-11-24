package a;

/* JADX INFO: loaded from: classes2.dex */
public final class l2t0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2t0 f19330a = new l2t0();
    public static final scx b;

    static {
        c710.f3840a.getClass();
        b = ucx.i(s710.f31729a, "kotlin.ULong");
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return new h2t0(rkjVar.y(b).i());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.A(b).l(((h2t0) obj).f12353a);
    }
}
