package a;

/* JADX INFO: loaded from: classes2.dex */
public final class cdy implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cdy f4187a = new cdy();
    public static final wgi0 b = x2x.H("kotlinx.serialization.json.JsonNull", zgi0.b, new ugi0[0]);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        fww.t(rkjVar);
        if (rkjVar.A()) {
            throw new kcy(xww.B(-1, "Expected 'null' literal", null, null, null));
        }
        return bdy.INSTANCE;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ((bdy) obj).getClass();
        fww.u(bwnVar);
        bwnVar.q();
    }
}
