package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s710 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s710 f31729a = new s710();
    public static final ewb0 b = new ewb0("kotlin.Long", zvb0.h);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return Long.valueOf(rkjVar.i());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.l(((Number) obj).longValue());
    }
}
