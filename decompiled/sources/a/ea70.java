package a;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ea70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7454a;

    public ea70(byte b) {
        switch (b) {
            case 1:
                this.f7454a = new LinkedHashMap();
                break;
            case 2:
                this.f7454a = new LinkedHashMap();
                break;
            case 3:
                this.f7454a = new LinkedHashMap();
                break;
            default:
                this.f7454a = new LinkedHashMap();
                break;
        }
    }

    public void a(eg40 eg40Var) {
        eg40Var.getClass();
        byte b = eg40Var.f7744a;
        byte b2 = eg40Var.b;
        Integer numValueOf = Integer.valueOf(b);
        LinkedHashMap linkedHashMap = this.f7454a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(b2)) + " with " + eg40Var);
        }
        treeMap2.put(Integer.valueOf(b2), eg40Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:0: B:18:0x004e->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.ud70] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003f -> B:18:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x0079
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object b(a.ud70 r6, a.zje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.da70
            if (r0 == 0) goto L13
            r0 = r7
            a.da70 r0 = (a.da70) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.da70 r0 = new a.da70
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 1
            java.util.LinkedHashMap r5 = r5.f7454a
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.String r6 = r0.k
            java.util.Iterator r2 = r0.j
            kotlin.jvm.functions.Function2 r4 = r0.i
            a.z1x.P(r7)
            goto L74
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L36:
            a.z1x.P(r7)
        L39:
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L79
            java.util.Set r7 = r5.keySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.L0(r7)
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L4e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L39
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r5.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L63
            goto L4e
        L63:
            r0.i = r6
            r0.j = r2
            r0.k = r7
            r0.n = r3
            java.lang.Object r4 = r6.invoke(r4, r0)
            if (r4 != r1) goto L72
            return r1
        L72:
            r4 = r6
            r6 = r7
        L74:
            r5.remove(r6)
            r6 = r4
            goto L4e
        L79:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ea70.b(a.ud70, a.zje):java.lang.Object");
    }

    public h6m0 c(xov0 xov0Var) {
        xov0Var.getClass();
        return (h6m0) this.f7454a.remove(xov0Var);
    }

    public List d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f7454a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (Intrinsics.d(((xov0) entry.getKey()).f41241a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((xov0) it.next());
        }
        return CollectionsKt.L0(linkedHashMap.values());
    }

    public h6m0 e(xov0 xov0Var) {
        LinkedHashMap linkedHashMap = this.f7454a;
        Object h6m0Var = linkedHashMap.get(xov0Var);
        if (h6m0Var == null) {
            h6m0Var = new h6m0(xov0Var);
            linkedHashMap.put(xov0Var, h6m0Var);
        }
        return (h6m0) h6m0Var;
    }
}
