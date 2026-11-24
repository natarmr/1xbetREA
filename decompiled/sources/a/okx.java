package a;

/* JADX INFO: loaded from: classes2.dex */
public final class okx implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okx f25427a = new okx();
    public static final ewb0 b = new ewb0("kotlin.Int", zvb0.g);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return Integer.valueOf(rkjVar.h());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.B(((Number) obj).intValue());
    }
}
