package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class wom {
    public long b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t33 f39505a = new t33(Float.valueOf(0.0f), hp4.j, null, 12);
    public final pz40 c = androidx.compose.runtime.e.e(Boolean.FALSE);

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r13 == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r12, a.zje r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof a.uom
            if (r0 == 0) goto L14
            r0 = r13
            a.uom r0 = (a.uom) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.uom r0 = new a.uom
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.j
            a.wne r0 = a.wne.f39444a
            int r1 = r6.l
            a.pz40 r8 = r11.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L31
            a.z1x.P(r13)     // Catch: java.lang.Throwable -> L2e
            goto L77
        L2e:
            r0 = move-exception
            r11 = r0
            goto L83
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L38:
            boolean r12 = r6.i
            a.z1x.P(r13)
            goto L5e
        L3e:
            a.z1x.P(r13)
            if (r12 != 0) goto L5e
            long r4 = java.lang.System.currentTimeMillis()
            long r9 = r11.b
            long r4 = r4 - r9
            r9 = 800(0x320, double:3.953E-321)
            long r9 = r9 - r4
            r4 = 0
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 <= 0) goto L5e
            r6.i = r12
            r6.l = r3
            java.lang.Object r13 = a.qcc.O(r9, r6)
            if (r13 != r0) goto L5e
            goto L76
        L5e:
            a.t33 r1 = r11.f39505a     // Catch: java.lang.Throwable -> L2e
            r11 = r2
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2e
            r13 = 0
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L2e
            r6.i = r12     // Catch: java.lang.Throwable -> L2e
            r6.l = r11     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            java.lang.Object r13 = a.t33.a(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e
            if (r13 != r0) goto L77
        L76:
            return r0
        L77:
            a.h73 r13 = (a.h73) r13     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            a.hgk0 r8 = (a.hgk0) r8
            r8.setValue(r11)
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        L83:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            a.hgk0 r8 = (a.hgk0) r8
            r8.setValue(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wom.a(boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(zje zjeVar) {
        vom vomVar;
        if (zjeVar instanceof vom) {
            vomVar = (vom) zjeVar;
            int i = vomVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vomVar.k = i - Integer.MIN_VALUE;
            } else {
                vomVar = new vom(this, zjeVar);
            }
        } else {
            vomVar = new vom(this, zjeVar);
        }
        vom vomVar2 = vomVar;
        Object obj = vomVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = vomVar2.k;
        if (i2 == 0) {
            z1x.P(obj);
            ((hgk0) this.c).setValue(Boolean.TRUE);
            this.b = System.currentTimeMillis();
            Float f = new Float(1.0f);
            vomVar2.k = 1;
            if (t33.a(this.f39505a, f, null, null, null, vomVar2, 14) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public final float c() {
        return ((Number) this.f39505a.d()).floatValue();
    }
}
