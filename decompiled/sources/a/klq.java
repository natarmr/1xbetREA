package a;

/* JADX INFO: loaded from: classes2.dex */
public final class klq implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final klq f18504a = new klq();
    public static final ewb0 b = new ewb0("kotlin.Float", zvb0.f);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return Float.valueOf(rkjVar.q());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.t(((Number) obj).floatValue());
    }
}
