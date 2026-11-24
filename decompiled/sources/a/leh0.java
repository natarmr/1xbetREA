package a;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class leh0 extends l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f19902a;
    public final List b;
    public final a8z c;
    public final Map d;
    public final LinkedHashMap e;

    public leh0(String str, sgy sgyVar, sgy[] sgyVarArr, jiy[] jiyVarArr, Annotation[] annotationArr) {
        sgyVar.getClass();
        this.f19902a = sgyVar;
        this.b = iun.f15405a;
        this.c = maz.a(wez.f39042a, new x6h0(str, this, (byte) 2));
        if (sgyVarArr.length != jiyVarArr.length) {
            e9d0.w(sgyVar.J(), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        Map mapM = xp20.m(tx3.n0(sgyVarArr, jiyVarArr));
        this.d = mapM;
        Set<Map.Entry> setEntrySet = mapM.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strH = ((jiy) entry.getValue()).getDescriptor().h();
            Object obj = linkedHashMap.get(strH);
            if (obj == null) {
                linkedHashMap.containsKey(strH);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.f19902a);
                sb.append("' have the same serial name '");
                sb.append(strH);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strH, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (jiy) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }

    @Override // a.l4
    public final jiy a(bld bldVar, String str) {
        jiy jiyVar = (jiy) this.e.get(str);
        return jiyVar != null ? jiyVar : super.a(bldVar, str);
    }

    @Override // a.l4
    public final jiy b(bwn bwnVar, Object obj) {
        obj.getClass();
        jiy jiyVar = (jiy) this.d.get(sre0.f32672a.b(obj.getClass()));
        jiy jiyVarB = jiyVar != null ? jiyVar : super.b(bwnVar, obj);
        if (jiyVarB != null) {
            return jiyVarB;
        }
        return null;
    }

    @Override // a.l4
    public final sgy c() {
        return this.f19902a;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return (ugi0) this.c.getValue();
    }
}
