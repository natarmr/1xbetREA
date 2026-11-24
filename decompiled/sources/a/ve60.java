package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ve60 implements vf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vne f37268a;
    public final t33 b;
    public final ue60 c;

    public ve60(vne vneVar) {
        vneVar.getClass();
        this.f37268a = vneVar;
        this.b = xf0.c(0.0f);
        this.c = new ue60(this);
    }

    @Override // a.vf80
    public final yzj a() {
        return this.c;
    }

    @Override // a.vf80
    public final boolean b() {
        return !(((Number) this.b.d()).floatValue() == 0.0f);
    }

    @Override // a.vf80
    public final long c(long j, int i, Function1 function1) {
        long j2;
        long j3;
        long jFloatToRawIntBits;
        int i2 = (int) (j & 4294967295L);
        float fSignum = Math.signum(Float.intBitsToFloat(i2));
        t33 t33Var = this.b;
        boolean z = fSignum == Math.signum(((Number) t33Var.d()).floatValue());
        double dAbs = Math.abs(((Number) t33Var.d()).floatValue());
        vne vneVar = this.f37268a;
        yje yjeVar = null;
        if (dAbs <= 0.5d || z) {
            j2 = j;
            j3 = 4294967295L;
            jFloatToRawIntBits = 0;
        } else {
            float fFloatValue = ((Number) t33Var.d()).floatValue();
            if (Math.signum(fFloatValue) == Math.signum(Float.intBitsToFloat(i2) + ((Number) t33Var.d()).floatValue())) {
                j2 = j;
                qjj.W(vneVar, null, null, new te60(this, j, yjeVar, (byte) 1), 3);
                jFloatToRawIntBits = ne60.a(j2, 0.0f, 0.0f, 2);
                j3 = 4294967295L;
            } else {
                j2 = j;
                qjj.W(vneVar, null, null, new w620((Object) this, yjeVar, (byte) 26), 3);
                j3 = 4294967295L;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) + fFloatValue)) & 4294967295L);
            }
        }
        long jE = ne60.e(j2, jFloatToRawIntBits);
        long j4 = ((ne60) function1.invoke(new ne60(jE))).f23370a;
        long jE2 = ne60.e(jE, j4);
        if (Math.abs(Float.intBitsToFloat((int) (jE2 & j3))) > 0.5d && i == 1) {
            qjj.W(vneVar, null, null, new te60(this, jE2, null, (byte) 0), 3);
        }
        return ne60.f(jFloatToRawIntBits, j4);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (a.t33.a(r8.b, r2, r3, r4, null, r6, 8) == r0) goto L22;
     */
    @Override // a.vf80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r9, kotlin.jvm.functions.Function2 r11, a.zje r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof a.se60
            if (r0 == 0) goto L14
            r0 = r12
            a.se60 r0 = (a.se60) r0
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
            a.se60 r0 = new a.se60
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.j
            a.wne r0 = a.wne.f39444a
            int r1 = r6.l
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            a.z1x.P(r12)
            goto L7a
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L33:
            long r9 = r6.i
            a.z1x.P(r12)
            goto L4c
        L39:
            a.z1x.P(r12)
            a.g6u0 r12 = new a.g6u0
            r12.<init>(r9)
            r6.i = r9
            r6.l = r3
            java.lang.Object r12 = r11.invoke(r12, r6)
            if (r12 != r0) goto L4c
            goto L79
        L4c:
            a.g6u0 r12 = (a.g6u0) r12
            long r11 = r12.f10786a
            long r11 = a.g6u0.d(r9, r11)
            float r11 = a.g6u0.c(r11)
            r12 = 7
            r1 = 0
            a.uts0 r3 = a.ro4.m0(r1, r1, r4, r12)
            r12 = r2
            java.lang.Float r2 = new java.lang.Float
            r1 = 0
            r2.<init>(r1)
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r11)
            r6.i = r9
            r6.l = r12
            a.t33 r1 = r8.b
            r5 = 0
            r7 = 8
            java.lang.Object r8 = a.t33.a(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ve60.d(long, kotlin.jvm.functions.Function2, a.zje):java.lang.Object");
    }
}
