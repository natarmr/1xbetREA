package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ko30 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ko30 f18611a = new ko30();
    public static final uw3 b = (uw3) mrv.K(mcy.Companion.serializer()).c;

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        xl30 xl30Var;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("This class can be decoded only by Json");
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
                if (Intrinsics.d(strB, "ImageSize")) {
                    vby vbyVarD = icyVar.d();
                    vbyVarD.getClass();
                    xl30Var = (xl30) vbyVarD.a(sl30.Companion.serializer(), edyVar);
                } else if (Intrinsics.d(strB, "ImageStrippedSize")) {
                    vby vbyVarD2 = icyVar.d();
                    vbyVarD2.getClass();
                    xl30Var = (xl30) vbyVarD2.a(vl30.Companion.serializer(), edyVar);
                } else {
                    xl30Var = null;
                }
            } else {
                xl30Var = null;
            }
            if (xl30Var != null) {
                arrayList.add(xl30Var);
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
