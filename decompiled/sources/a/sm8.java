package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sm8 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sm8 f32432a = new sm8();
    public static final ewb0 b = new ewb0("kotlin.Boolean", zvb0.b);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return Boolean.valueOf(rkjVar.u());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.s(((Boolean) obj).booleanValue());
    }
}
