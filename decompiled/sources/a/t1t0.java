package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t1t0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1t0 f33184a = new t1t0();
    public static final scx b;

    static {
        yf9.f42529a.getClass();
        b = ucx.i(ag9.f814a, "kotlin.UByte");
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return new p1t0(rkjVar.y(b).D());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.A(b).h(((p1t0) obj).f26221a);
    }
}
