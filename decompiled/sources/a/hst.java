package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hst {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oif0 f13600a;

    public int a() {
        List listN = this.f13600a.n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (!((hf6) obj).c.isEmpty()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((hf6) it.next()).e) {
                    return arrayList.size() - 1;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r14.G(r1) == r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(double r15, a.zje r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof a.sni0
            if (r1 == 0) goto L15
            r1 = r0
            a.sni0 r1 = (a.sni0) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            a.sni0 r1 = new a.sni0
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.j
            a.wne r2 = a.wne.f39444a
            int r3 = r1.l
            r4 = 2
            r5 = 1
            a.oif0 r14 = r14.f13600a
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2e
            a.z1x.P(r0)
            goto L8f
        L2e:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            r14 = 0
            return r14
        L35:
            double r5 = r1.i
            a.z1x.P(r0)
            goto L84
        L3b:
            a.z1x.P(r0)
            java.util.List r0 = r14.n()
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = a.r3d.q(r0, r6)
            r3.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r0.next()
            r7 = r6
            a.hf6 r7 = (a.hf6) r7
            r10 = 0
            r13 = 23
            r8 = 0
            r9 = 0
            r11 = r15
            a.hf6 r6 = a.hf6.a(r7, r8, r9, r10, r11, r13)
            r3.add(r6)
            goto L51
        L6c:
            r14.I(r3)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            a.hf6 r0 = (a.hf6) r0
            if (r0 == 0) goto L8f
            r11 = r15
            r1.i = r11
            r1.l = r5
            java.lang.Object r0 = r14.F(r0, r1)
            if (r0 != r2) goto L83
            goto L8e
        L83:
            r5 = r11
        L84:
            r1.i = r5
            r1.l = r4
            java.lang.Object r14 = r14.G(r1)
            if (r14 != r2) goto L8f
        L8e:
            return r2
        L8f:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hst.b(double, a.zje):java.lang.Object");
    }
}
