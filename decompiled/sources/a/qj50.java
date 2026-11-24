package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f28820a;

    public qj50(List list) {
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(16, 0.75f, true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jzg0 jzg0Var = (jzg0) it.next();
            linkedHashMap.put(jzg0Var.f17411a, new oj50(new q9h0(jzg0Var.b, jzg0Var.c)));
        }
        this.f28820a = linkedHashMap;
    }

    public final void a(Object obj, Function0 function0, fet fetVar, int i) {
        qj50 qj50Var;
        Object obj2;
        Function0 function1;
        fetVar.g0(-1500391956);
        int i2 = (fetVar.g(obj) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.g(this) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                qj50Var = this;
                obj2 = obj;
                function1 = function0;
                hk40 hk40Var = new hk40((Object) function1, (Object) qj50Var, obj2, (yje) null, (byte) 9);
                fetVar.o0(hk40Var);
                objP = hk40Var;
            } else {
                qj50Var = this;
                obj2 = obj;
                function1 = function0;
            }
            m0x0.t(fetVar, obj2, (Function2) objP);
        } else {
            qj50Var = this;
            obj2 = obj;
            function1 = function0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(qj50Var, obj2, function1, i, (byte) 12);
        }
    }

    public final d9z b(Object obj, fet fetVar) {
        obj.getClass();
        Object objP = fetVar.P();
        Object obj2 = ukd.f35823a;
        if (objP == obj2) {
            objP = new o240((byte) 29);
            fetVar.o0(objP);
        }
        d9z d9zVar = (d9z) d(obj, (Function2) objP);
        boolean zG = fetVar.g(d9zVar);
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj2) {
            objP2 = new md0(d9zVar, (byte) 11);
            fetVar.o0(objP2);
        }
        a(obj, (Function0) objP2, fetVar, 0);
        return d9zVar;
    }

    public final xcz c(Object obj, fet fetVar) {
        obj.getClass();
        Object objP = fetVar.P();
        Object obj2 = ukd.f35823a;
        if (objP == obj2) {
            objP = new o240((byte) 28);
            fetVar.o0(objP);
        }
        xcz xczVar = (xcz) d(obj, (Function2) objP);
        boolean zG = fetVar.g(xczVar);
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj2) {
            objP2 = new a7s(xczVar, (byte) 19);
            fetVar.o0(objP2);
        }
        a(obj, (Function0) objP2, fetVar, 0);
        return xczVar;
    }

    public final bch0 d(Object obj, Function2 function2) {
        LinkedHashMap linkedHashMap = this.f28820a;
        Object oj50Var = linkedHashMap.get(obj);
        if (oj50Var == null) {
            oj50Var = new oj50(new q9h0(0, 0));
            linkedHashMap.put(obj, oj50Var);
        }
        oj50 oj50Var2 = (oj50) oj50Var;
        q9h0 q9h0Var = oj50Var2.f25345a;
        if (linkedHashMap.size() > 64) {
            Set setKeySet = linkedHashMap.keySet();
            setKeySet.getClass();
            linkedHashMap.remove(CollectionsKt.T(setKeySet));
        }
        bch0 bch0Var = oj50Var2.b;
        if (bch0Var != null) {
            return bch0Var;
        }
        bch0 bch0Var2 = (bch0) function2.invoke(Integer.valueOf(q9h0Var.f28347a), Integer.valueOf(q9h0Var.b));
        oj50Var2.b = bch0Var2;
        return bch0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (((a.xcz) r2).l(r9, r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (((a.d9z) r2).l(r9, r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (((a.mez) r2).k(r9, r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r9, int r10, a.yje r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof a.pj50
            if (r0 == 0) goto L13
            r0 = r11
            a.pj50 r0 = (a.pj50) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.pj50 r0 = new a.pj50
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            goto L31
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L31:
            a.oj50 r8 = r0.i
            a.z1x.P(r11)
            goto L9c
        L37:
            a.z1x.P(r11)
            java.util.LinkedHashMap r8 = r8.f28820a
            java.lang.Object r8 = r8.get(r9)
            a.oj50 r8 = (a.oj50) r8
            if (r8 != 0) goto L47
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L47:
            a.q9h0 r9 = r8.f25345a
            int r11 = r9.b
            a.bch0 r2 = r8.b
            if (r2 != 0) goto L52
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L52:
            boolean r6 = r8.c
            if (r6 != 0) goto L9e
            a.q9h0 r6 = new a.q9h0
            r7 = 0
            r6.<init>(r7, r7)
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L65
            r8.c = r5
            goto L9e
        L65:
            int r9 = r9.f28347a
            if (r10 <= r9) goto L9e
            boolean r10 = r2 instanceof a.xcz
            if (r10 == 0) goto L7a
            a.xcz r2 = (a.xcz) r2
            r0.i = r8
            r0.l = r5
            java.lang.Object r9 = r2.l(r9, r11, r0)
            if (r9 != r1) goto L9c
            goto L9b
        L7a:
            boolean r10 = r2 instanceof a.d9z
            if (r10 == 0) goto L8b
            a.d9z r2 = (a.d9z) r2
            r0.i = r8
            r0.l = r4
            java.lang.Object r9 = r2.l(r9, r11, r0)
            if (r9 != r1) goto L9c
            goto L9b
        L8b:
            boolean r10 = r2 instanceof a.mez
            if (r10 == 0) goto L9c
            a.mez r2 = (a.mez) r2
            r0.i = r8
            r0.l = r3
            java.lang.Object r9 = r2.k(r9, r11, r0)
            if (r9 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r8.c = r5
        L9e:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qj50.e(java.lang.Object, int, a.yje):java.lang.Object");
    }
}
