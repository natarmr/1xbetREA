package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class bty extends zgc {
    public static final bty g = new bty();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.xmx] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.xmx] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.hzs0] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static kzj0 V(kzj0 kzj0Var) {
        wsy wsyVarB;
        iys0 iys0VarS = kzj0Var.S();
        ?? r4 = 0;
        tft0 tft0VarG = null;
        if (iys0VarS instanceof caa) {
            caa caaVar = (caa) iys0VarS;
            pzs0 pzs0Var = caaVar.f3999a;
            pzs0 pzs0Var2 = pzs0Var.a() == t3u0.d ? pzs0Var : null;
            tft0 tft0VarJ0 = (pzs0Var2 == null || (wsyVarB = pzs0Var2.b()) == null) ? null : wsyVarB.j0();
            zl50 zl50Var = caaVar.b;
            if (zl50Var == null) {
                Collection collectionB = caaVar.b();
                ArrayList arrayList = new ArrayList(r3d.q(collectionB, 10));
                Iterator it = collectionB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((wsy) it.next()).j0());
                }
                zl50Var = new zl50(pzs0Var, new zek(arrayList, (byte) 1), (hzs0) r4, 8);
                caaVar.b = zl50Var;
            }
            return new yl50(u9a.f35274a, zl50Var, tft0VarJ0, kzj0Var.K(), kzj0Var.U(), 32);
        }
        if (!(iys0VarS instanceof xmx) || !kzj0Var.U()) {
            return kzj0Var;
        }
        ?? r0 = (xmx) iys0VarS;
        LinkedHashSet<wsy> linkedHashSet = r0.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(linkedHashSet, 10));
        boolean z = false;
        for (wsy wsyVar : linkedHashSet) {
            wsyVar.getClass();
            tft0 tft0VarG2 = e0t0.g(wsyVar);
            tft0VarG2.getClass();
            arrayList2.add(tft0VarG2);
            z = true;
        }
        if (z) {
            wsy wsyVar2 = r0.f41149a;
            if (wsyVar2 != null) {
                tft0VarG = e0t0.g(wsyVar2);
                tft0VarG.getClass();
            }
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            xmx xmxVar = new xmx(linkedHashSet2);
            xmxVar.f41149a = tft0VarG;
            r4 = xmxVar;
        }
        if (r4 != 0) {
            r0 = r4;
        }
        return r0.a();
    }

    @Override // a.zgc
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final tft0 N(aty atyVar) {
        tft0 tft0VarW;
        atyVar.getClass();
        if (!(atyVar instanceof wsy)) {
            jf4.o("Failed requirement.");
            return null;
        }
        tft0 tft0VarJ0 = ((wsy) atyVar).j0();
        if (tft0VarJ0 instanceof kzj0) {
            tft0VarW = V((kzj0) tft0VarJ0);
        } else {
            if (!(tft0VarJ0 instanceof kkq)) {
                t9f.b();
                return null;
            }
            kkq kkqVar = (kkq) tft0VarJ0;
            kzj0 kzj0Var = kkqVar.c;
            kzj0 kzj0Var2 = kkqVar.b;
            kzj0 kzj0VarV = V(kzj0Var2);
            kzj0 kzj0VarV2 = V(kzj0Var);
            tft0VarW = (kzj0VarV == kzj0Var2 && kzj0VarV2 == kzj0Var) ? tft0VarJ0 : ucx.W(kzj0VarV, kzj0VarV2);
        }
        g1y g1yVar = new g1y(1, this, bty.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;", 0, (byte) 12);
        wsy wsyVarM = xsm0.m(tft0VarJ0);
        return xsm0.z(tft0VarW, wsyVarM != null ? (wsy) g1yVar.invoke(wsyVarM) : null);
    }
}
