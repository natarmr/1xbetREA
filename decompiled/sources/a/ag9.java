package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ag9 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ag9 f814a = new ag9();
    public static final ewb0 b = new ewb0("kotlin.Byte", zvb0.c);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return Byte.valueOf(rkjVar.D());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.h(((Number) obj).byteValue());
    }
}
