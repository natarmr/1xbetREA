package a;

/* JADX INFO: loaded from: classes5.dex */
public final class sns0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sns0 f32511a = new sns0();
    public static final wgi0 b = x2x.F("TranslationMainResponse", new ugi0[0]);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        icy icyVar = (icy) rkjVar;
        vby vbyVarD = icyVar.d();
        mcy mcyVarG = icyVar.g();
        if ((mcyVarG instanceof bdy) || mcyVarG == null) {
            return null;
        }
        if (!(mcyVarG instanceof jdy)) {
            if (mcyVarG instanceof edy) {
                return (rns0) vbyVarD.a(rns0.Companion.serializer(), mcyVarG);
            }
            return null;
        }
        jdy jdyVar = (jdy) mcyVarG;
        if (jdyVar.c()) {
            return (rns0) vbyVarD.b(rns0.Companion.serializer(), jdyVar.b());
        }
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        throw new IllegalStateException("TranslationMainResponseSerializer deserialization only");
    }
}
