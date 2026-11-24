package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ons0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ons0 f25563a = new ons0();
    public static final vgi0 b = new vgi0(x2x.j("TranslationMainInfo", zvb0.j));

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        if (!(rkjVar instanceof icy)) {
            return rkjVar.z();
        }
        icy icyVar = (icy) rkjVar;
        vby vbyVarD = icyVar.d();
        mcy mcyVarG = icyVar.g();
        if (Intrinsics.d(mcyVarG, bdy.INSTANCE)) {
            return null;
        }
        return mcyVarG instanceof jdy ? ((jdy) mcyVarG).b() : vbyVarD.d(mcy.Companion.serializer(), mcyVarG);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        String str = (String) obj;
        if (str == null) {
            bwnVar.q();
        } else {
            bwnVar.E(str);
        }
    }
}
