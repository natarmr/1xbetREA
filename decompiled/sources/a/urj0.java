package a;

/* JADX INFO: loaded from: classes2.dex */
public final class urj0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final urj0 f36166a = new urj0();
    public static final ewb0 b = new ewb0("kotlin.Short", zvb0.i);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return Short.valueOf(rkjVar.p());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.r(((Number) obj).shortValue());
    }
}
