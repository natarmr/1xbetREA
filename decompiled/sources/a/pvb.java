package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pvb implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pvb f27654a = new pvb();
    public static final ewb0 b = new ewb0("kotlin.Char", zvb0.d);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return Character.valueOf(rkjVar.v());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bwnVar.w(((Character) obj).charValue());
    }
}
