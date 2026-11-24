package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ym30 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ym30 f42868a = new ym30();
    public static final uw3 b = (uw3) mrv.K(mcy.Companion.serializer()).c;

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        wl30 wl30Var;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON");
            return null;
        }
        mcy mcyVarG = icyVar.g();
        yby ybyVar = mcyVarG instanceof yby ? (yby) mcyVarG : null;
        if (ybyVar == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (mcy mcyVar : ybyVar.f42361a) {
            edy edyVar = mcyVar instanceof edy ? (edy) mcyVar : null;
            if (edyVar != null) {
                mcy mcyVar2 = (mcy) edyVar.get("$type");
                String strB = mcyVar2 != null ? ncy.j(mcyVar2).b() : null;
                if (Intrinsics.d(strB, "DocumentAttributeFileName")) {
                    vby vbyVarD = icyVar.d();
                    vbyVarD.getClass();
                    wl30Var = (wl30) vbyVarD.a(ml30.Companion.serializer(), edyVar);
                } else if (Intrinsics.d(strB, "DocumentAttributeImage")) {
                    vby vbyVarD2 = icyVar.d();
                    vbyVarD2.getClass();
                    wl30Var = (wl30) vbyVarD2.a(pl30.Companion.serializer(), edyVar);
                } else {
                    wl30Var = null;
                }
            } else {
                wl30Var = null;
            }
            if (wl30Var != null) {
                arrayList.add(wl30Var);
            }
        }
        return arrayList;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ((List) obj).getClass();
    }
}
