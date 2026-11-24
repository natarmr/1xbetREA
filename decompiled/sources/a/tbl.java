package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tbl implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tbl f33669a = new tbl();
    public static final ewb0 b = new ewb0("kotlin.Double", zvb0.e);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return Double.valueOf(rkjVar.s());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.g(((Number) obj).doubleValue());
    }
}
