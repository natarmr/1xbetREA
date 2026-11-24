package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qcy implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qcy f28507a = new qcy();
    public static final wgi0 b = x2x.G("kotlinx.serialization.json.JsonElement", tua0.c, new ugi0[0], new djx(12));

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return fww.t(rkjVar).g();
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mcy mcyVar = (mcy) obj;
        mcyVar.getClass();
        fww.u(bwnVar);
        if (mcyVar instanceof jdy) {
            bwnVar.C(mdy.f21620a, mcyVar);
            return;
        }
        if (mcyVar instanceof edy) {
            bwnVar.C(gdy.f11125a, mcyVar);
        } else if (mcyVar instanceof yby) {
            bwnVar.C(acy.f653a, mcyVar);
        } else {
            t9f.b();
        }
    }
}
