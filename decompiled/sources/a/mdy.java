package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mdy implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mdy f21620a = new mdy();
    public static final wgi0 b = x2x.H("kotlinx.serialization.json.JsonPrimitive", zvb0.j, new ugi0[0]);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        icy icyVarT = fww.t(rkjVar);
        mcy mcyVarG = icyVarT.g();
        if (mcyVarG instanceof jdy) {
            return (jdy) mcyVarG;
        }
        throw new kcy(xww.B(-1, kng0.g(sre0.f32672a, mcyVarG.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), null, null, icyVarT.d().f37162a.i ? xww.R(-1, mcyVarG.toString()).toString() : null));
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jdy jdyVar = (jdy) obj;
        jdyVar.getClass();
        fww.u(bwnVar);
        if (jdyVar instanceof bdy) {
            bwnVar.C(cdy.f4187a, bdy.INSTANCE);
        } else {
            bwnVar.C(ycy.f42406a, (xcy) jdyVar);
        }
    }
}
