package a;

/* JADX INFO: loaded from: classes2.dex */
public final class u2t0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2t0 f34963a = new u2t0();
    public static final scx b;

    static {
        qqj0.f29169a.getClass();
        b = ucx.i(urj0.f36166a, "kotlin.UShort");
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return new q2t0(rkjVar.y(b).p());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.A(b).r(((q2t0) obj).f28019a);
    }
}
