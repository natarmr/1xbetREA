package a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class ofk {
    public static final /* synthetic */ iiy[] j = {new j0d0(ofk.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new j0d0(ofk.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f25174a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final zt00 d;
    public final zt00 e;
    public final xg f;
    public final cu00 g;
    public final cu00 h;
    public final /* synthetic */ pfk i;

    public ofk(pfk pfkVar, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.i = pfkVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            g950 g950VarL = ydx.L((h950) pfkVar.b.b, ((i3d0) ((z3) obj)).f);
            Object arrayList = linkedHashMap.get(g950VarL);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(g950VarL, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f25174a = a(linkedHashMap);
        pfk pfkVar2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            g950 g950VarL2 = ydx.L((h950) pfkVar2.b.b, ((p3d0) ((z3) obj2)).f);
            Object arrayList2 = linkedHashMap2.get(g950VarL2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(g950VarL2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = a(linkedHashMap2);
        ((lwf) ((f6i) this.i.b.f10647a).c).getClass();
        pfk pfkVar3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            g950 g950VarL3 = ydx.L((h950) pfkVar3.b.b, ((c4d0) ((z3) obj3)).e);
            Object arrayList3 = linkedHashMap3.get(g950VarL3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(g950VarL3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = a(linkedHashMap3);
        byte b = 0;
        this.d = ((eu00) ((f6i) this.i.b.f10647a).e).c(new mfk(this, b));
        byte b2 = 1;
        this.e = ((eu00) ((f6i) this.i.b.f10647a).e).c(new mfk(this, b2));
        this.f = ((eu00) ((f6i) this.i.b.f10647a).e).d(new mfk(this, (byte) 2));
        pfk pfkVar4 = this.i;
        eu00 eu00Var = (eu00) ((f6i) pfkVar4.b.f10647a).e;
        nfk nfkVar = new nfk(this, pfkVar4, b);
        eu00Var.getClass();
        this.g = new cu00(eu00Var, nfkVar);
        pfk pfkVar5 = this.i;
        eu00 eu00Var2 = (eu00) ((f6i) pfkVar5.b.f10647a).e;
        nfk nfkVar2 = new nfk(this, pfkVar5, b2);
        eu00Var2.getClass();
        this.h = new cu00(eu00Var2, nfkVar2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<z3> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
            for (z3 z3Var : iterable) {
                int iD = z3Var.d();
                int iR = tyc.r(iD) + iD;
                if (iR > 4096) {
                    iR = 4096;
                }
                tyc tycVarM = tyc.M(byteArrayOutputStream, iR);
                tycVarM.s0(iD);
                z3Var.g(tycVarM);
                tycVarM.c0();
                arrayList.add(Unit.f46060a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
