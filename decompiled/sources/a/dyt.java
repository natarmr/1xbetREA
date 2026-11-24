package a;

import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class dyt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7q f6911a;

    public dyt(h7q h7qVar, byte b) {
        h7qVar.getClass();
        switch (b) {
            case 1:
                this.f6911a = h7qVar;
                break;
            default:
                this.f6911a = h7qVar;
                break;
        }
    }

    public long a() {
        return this.f6911a.c.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List b() {
        TreeMap treeMap = new TreeMap();
        int i = 0;
        b5q b5qVar = new b5q(pgi0.h(CollectionsKt.I((List) this.f6911a.c.d.getValue()), new umu((byte) (0 == true ? 1 : 0))));
        while (b5qVar.hasNext()) {
            sbq sbqVar = (sbq) b5qVar.next();
            treeMap.put(Double.valueOf(sbqVar.c), Long.valueOf(sbqVar.d));
        }
        long[] jArr = new long[treeMap.size()];
        Collection<Long> collectionValues = treeMap.values();
        collectionValues.getClass();
        for (Long l : collectionValues) {
            l.getClass();
            jArr[i] = l.longValue();
            i++;
        }
        return tx3.f0(jArr);
    }
}
