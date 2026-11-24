package a;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ycy implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ycy f42406a = new ycy();
    public static final ewb0 b = x2x.j("kotlinx.serialization.json.JsonLiteral", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        icy icyVarT = fww.t(rkjVar);
        mcy mcyVarG = icyVarT.g();
        if (mcyVarG instanceof xcy) {
            return (xcy) mcyVarG;
        }
        throw new kcy(xww.B(-1, kng0.g(sre0.f32672a, mcyVarG.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), null, null, icyVarT.d().f37162a.i ? xww.R(-1, mcyVarG.toString()).toString() : null));
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        Boolean bool;
        xcy xcyVar = (xcy) obj;
        xcyVar.getClass();
        fww.u(bwnVar);
        boolean z = xcyVar.f40670a;
        String str = xcyVar.c;
        if (z) {
            bwnVar.E(str);
            return;
        }
        ugi0 ugi0Var = xcyVar.b;
        if (ugi0Var != null) {
            bwnVar.A(ugi0Var).E(str);
            return;
        }
        Long lT0 = StringsKt.t0(str);
        if (lT0 != null) {
            bwnVar.l(lT0.longValue());
            return;
        }
        h2t0 h2t0VarE = kotlin.text.g.e(str);
        if (h2t0VarE != null) {
            long j = h2t0VarE.f12353a;
            h2t0.b.getClass();
            bwnVar.A(l2t0.b).l(j);
            return;
        }
        Double dI = kotlin.text.b.i(str);
        if (dI != null) {
            bwnVar.g(dI.doubleValue());
            return;
        }
        if (Intrinsics.d(str, "true")) {
            bool = Boolean.TRUE;
        } else {
            bool = Intrinsics.d(str, "false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            bwnVar.s(bool.booleanValue());
        } else {
            bwnVar.E(str);
        }
    }
}
