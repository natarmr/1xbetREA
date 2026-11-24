package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f2t0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2t0 f8830a = new f2t0();
    public static final scx b;

    static {
        yjx.f42760a.getClass();
        b = ucx.i(okx.f25427a, "kotlin.UInt");
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return new b2t0(rkjVar.y(b).h());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.A(b).B(((b2t0) obj).f1872a);
    }
}
