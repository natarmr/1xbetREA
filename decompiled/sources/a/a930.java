package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a930 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a930 f457a = new a930();
    public static final uw3 b = (uw3) mrv.K(mcy.Companion.serializer()).c;

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        z830 z830Var;
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
                if (strB == null) {
                    z830Var = null;
                } else {
                    int iHashCode = strB.hashCode();
                    if (iHashCode != 509884608) {
                        if (iHashCode != 1949288814) {
                            if (iHashCode == 2129993387 && strB.equals("orderedList")) {
                                vby vbyVarD = icyVar.d();
                                vbyVarD.getClass();
                                z830Var = (z830) vbyVarD.a(v830.Companion.serializer(), edyVar);
                            } else {
                                z830Var = null;
                            }
                        } else if (strB.equals("paragraph")) {
                            vby vbyVarD2 = icyVar.d();
                            vbyVarD2.getClass();
                            z830Var = (z830) vbyVarD2.a(y830.Companion.serializer(), edyVar);
                        } else {
                            z830Var = null;
                        }
                    } else if (strB.equals("bulletList")) {
                        vby vbyVarD3 = icyVar.d();
                        vbyVarD3.getClass();
                        z830Var = (z830) vbyVarD3.a(s830.Companion.serializer(), edyVar);
                    } else {
                        z830Var = null;
                    }
                }
            } else {
                z830Var = null;
            }
            if (z830Var != null) {
                arrayList.add(z830Var);
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
