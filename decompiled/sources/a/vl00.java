package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vl00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pmi f37600a;
    public final uqe b;

    public vl00(pmi pmiVar, uqe uqeVar) {
        this.f37600a = pmiVar;
        this.b = uqeVar;
    }

    public static ArrayList a(List list, List list2) {
        int iA = wp20.a(r3d.q(list2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list2) {
            linkedHashMap.put(Integer.valueOf(((cm90) obj).f4593a), obj);
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tkt tktVar = (tkt) it.next();
            cm90 cm90VarA = (cm90) linkedHashMap.get(Integer.valueOf(tktVar.f34113a));
            if (cm90VarA == null) {
                cm90.Companion.getClass();
                cm90VarA = am90.a();
            }
            arrayList.add(new yqe(tktVar.f34113a, tktVar.b, tktVar.c, tktVar.d, tktVar.e, tktVar.f, cm90VarA.b, cm90VarA.c, cm90VarA.d));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0276  */
    /* JADX WARN: Code duplicated, block: B:102:0x0278 A[Catch: all -> 0x0095, PHI: r0 r1 r5 r6
  0x0278: PHI (r0v54 java.lang.Object) = (r0v53 java.lang.Object), (r0v1 java.lang.Object) binds: [B:100:0x0274, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0278: PHI (r1v13 ??) = (r1v27 ??), (r1v28 ??) binds: [B:100:0x0274, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0278: PHI (r5v33 ??) = (r5v48 ??), (r5v49 ??) binds: [B:100:0x0274, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0278: PHI (r6v39 ??) = (r6v53 ??), (r6v54 ??) binds: [B:100:0x0274, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0095, blocks: (B:19:0x0090, B:102:0x0278, B:99:0x0257), top: B:136:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x028a  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02db A[PHI: r0 r13 r14
  0x02db: PHI (r0v56 java.lang.Object) = (r0v20 java.lang.Object), (r0v60 java.lang.Object) binds: [B:116:0x02d7, B:16:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x02db: PHI (r13v8 boolean) = (r13v1 boolean), (r13v9 boolean) binds: [B:116:0x02d7, B:16:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x02db: PHI (r14v3 boolean) = (r14v1 boolean), (r14v4 boolean) binds: [B:116:0x02d7, B:16:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x031c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0345  */
    /* JADX WARN: Code duplicated, block: B:140:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x014f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
    /* JADX WARN: Code duplicated, block: B:69:0x019a  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0217  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0241  */
    /* JADX WARN: Code duplicated, block: B:95:0x024a A[PHI: r5 r6 r12
  0x024a: PHI (r5v28 boolean) = (r5v21 boolean), (r5v31 boolean) binds: [B:83:0x01fc, B:94:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024a: PHI (r6v32 boolean) = (r6v26 boolean), (r6v35 boolean) binds: [B:83:0x01fc, B:94:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024a: PHI (r12v14 java.lang.Object) = (r12v10 java.lang.Object), (r12v15 java.lang.Object) binds: [B:83:0x01fc, B:94:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x024e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0257 A[Catch: all -> 0x0095, TRY_ENTER, TryCatch #1 {all -> 0x0095, blocks: (B:19:0x0090, B:102:0x0278, B:99:0x0257), top: B:136:0x002c }] */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b2, code lost:
    
        if (r0 == r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0347, code lost:
    
        if (r0 == r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0243, code lost:
    
        if (r0 == r4) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.vl00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r17, a.zje r18) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vl00.b(boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0 A[LOOP:0: B:49:0x00aa->B:51:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r1 == r4) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.zje r18, java.util.List r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vl00.c(a.zje, java.util.List, boolean):java.lang.Object");
    }
}
