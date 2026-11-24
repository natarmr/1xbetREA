package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ysm0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ysm0 f43175a = new ysm0();
    public static final ewb0 b = new ewb0("kotlin.String", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return rkjVar.z();
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        String str = (String) obj;
        str.getClass();
        bwnVar.E(str);
    }
}
