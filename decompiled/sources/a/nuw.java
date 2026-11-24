package a;

/* JADX INFO: loaded from: classes.dex */
public final class nuw implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nuw f24165a = new nuw();
    public static final wgi0 b = x2x.F("IGenerateCoupon", new ugi0[0]);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        throw new UnsupportedOperationException("Deserialization of IGenerateCoupon is not supported");
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        muw muwVar = (muw) obj;
        muwVar.getClass();
        if (muwVar instanceof mht) {
            bwnVar.C(mht.Companion.serializer(), muwVar);
            return;
        }
        if (muwVar instanceof sht) {
            bwnVar.C(sht.Companion.serializer(), muwVar);
        } else if (muwVar instanceof pht) {
            bwnVar.C(pht.Companion.serializer(), muwVar);
        } else {
            t9f.b();
        }
    }
}
