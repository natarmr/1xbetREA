package a;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class b570 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b570 f1988a = new b570();
    public static final wgi0 b;

    static {
        ugi0[] ugi0VarArr = new ugi0[0];
        if (StringsKt.W("OneXGamesTypeCommon")) {
            jf4.o("Blank serial names are prohibited");
            return;
        }
        cmc cmcVar = new cmc("OneXGamesTypeCommon");
        iun iunVar = iun.f15405a;
        s710 s710Var = s710.f31729a;
        cmcVar.a("GAME_ID", s710.b, iunVar);
        ysm0 ysm0Var = ysm0.f43175a;
        cmcVar.a("ONE_XGAMES_TYPE", ysm0.b, iunVar);
        b = new wgi0("OneXGamesTypeCommon", aum0.b, cmcVar.c.size(), tx3.g0(ugi0VarArr), cmcVar);
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long lValueOf;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("This serializer can be used only with Json format");
            return null;
        }
        edy edyVarI = ncy.i(icyVar.g());
        mcy mcyVar = (mcy) edyVarI.get("GAME_ID");
        if (mcyVar != null) {
            try {
                lValueOf = Long.valueOf(ncy.k(ncy.j(mcyVar)));
            } catch (kcy unused) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                mcy mcyVar2 = (mcy) edyVarI.get("ONE_XGAMES_TYPE");
                String strB = mcyVar2 != null ? ncy.j(mcyVar2).b() : null;
                if (Intrinsics.d(strB, w470.class.getSimpleName())) {
                    s470.Companion.getClass();
                    return new w470(r470.a(jLongValue));
                }
                if (Intrinsics.d(strB, z470.class.getSimpleName())) {
                    return new z470(jLongValue);
                }
                v4i0.n(kng0.k("Unknown class type in ONE_XGAMES_TYPE: ", strB));
                return null;
            }
        }
        v4i0.n("Field GAME_ID is missing or not a Long");
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a570 a570Var = (a570) obj;
        a570Var.getClass();
        scy scyVar = bwnVar instanceof scy ? (scy) bwnVar : null;
        if (scyVar == null) {
            v4i0.n("This serializer can be used only with Json format");
            return;
        }
        bzu bzuVar = new bzu((byte) 19);
        if (a570Var instanceof w470) {
            cww.F(bzuVar, "GAME_ID", Long.valueOf(((w470) a570Var).f38531a.a()));
            cww.G(bzuVar, "ONE_XGAMES_TYPE", w470.class.getSimpleName());
        } else if (!(a570Var instanceof z470)) {
            t9f.b();
            return;
        } else {
            cww.F(bzuVar, "GAME_ID", Long.valueOf(((z470) a570Var).f43755a));
            cww.G(bzuVar, "ONE_XGAMES_TYPE", z470.class.getSimpleName());
        }
        scyVar.f(bzuVar.a());
    }
}
