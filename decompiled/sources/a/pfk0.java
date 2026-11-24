package a;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class pfk0 implements qkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tcz f26910a;
    public final sjj b;
    public final j73 c;
    public final xdr d;
    public final pz40 e;

    public pfk0(tcz tczVar, sjj sjjVar, j73 j73Var, xdr xdrVar) {
        sjjVar.getClass();
        j73Var.getClass();
        this.f26910a = tczVar;
        this.b = sjjVar;
        this.c = j73Var;
        this.d = xdrVar;
        this.e = androidx.compose.runtime.e.e(null);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // a.qkq
    public final Object a(qah0 qah0Var, float f, zje zjeVar) {
        nfk0 nfk0Var;
        float fFloatValue;
        ncz nczVar;
        Object obj;
        float f2;
        float f3;
        int iD;
        tcz tczVar = this.f26910a;
        xcz xczVar = tczVar.f33739a;
        if (zjeVar instanceof nfk0) {
            nfk0Var = (nfk0) zjeVar;
            int i = nfk0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfk0Var.k = i - Integer.MIN_VALUE;
            } else {
                nfk0Var = new nfk0(this, zjeVar);
            }
        } else {
            nfk0Var = new nfk0(this, zjeVar);
        }
        Object objC = nfk0Var.i;
        Object obj2 = wne.f39444a;
        int i2 = nfk0Var.k;
        int i3 = 1;
        if (i2 == 0) {
            z1x.P(objC);
            ucz uczVarD = tczVar.d();
            if (uczVarD == null || (nczVar = (ncz) CollectionsKt.firstOrNull(xczVar.j().l)) == null || ((nczVar.f23317a <= 0 && nczVar.p >= 0) || !tczVar.a())) {
                fFloatValue = f;
            } else {
                sjj sjjVar = this.b;
                sjjVar.getClass();
                ucz uczVarD2 = tczVar.d();
                if (uczVarD2 == null) {
                    obj = null;
                    f2 = 0.0f;
                    iD = -1;
                    i3 = 1;
                } else {
                    ncz nczVar2 = uczVarD2.f35454a;
                    float fC = tczVar.c();
                    int i4 = nczVar2.f23317a;
                    if (fC <= 0.0f) {
                        obj = null;
                        iD = i4;
                    } else {
                        int iB = tczVar.b(i4);
                        int i5 = i4 + 1;
                        int iB2 = tczVar.b(i5);
                        obj = null;
                        if (Math.abs(f) < 0.5f) {
                            if (Math.abs(iB) >= Math.abs(iB2)) {
                                i4 = i5;
                            }
                            iD = l1e0.d(i4, 0, xczVar.j().o - 1);
                        } else {
                            f2 = 0.0f;
                            float fC2 = l1e0.c(uzb.R(sjjVar, 0.0f, f), -3.4028235E38f, Float.MAX_VALUE);
                            if (f < 0.0f) {
                                f3 = fC2 + iB2;
                                if (f3 > 0.0f) {
                                    f3 = 0.0f;
                                }
                            } else {
                                f3 = fC2 + iB;
                                if (f3 < 0.0f) {
                                    f3 = 0.0f;
                                }
                            }
                            double d = fC;
                            double d2 = ((double) f3) / d;
                            i3 = 1;
                            iD = l1e0.d(si30.a(d2 - (((double) iB) / d)) + i4, 0, xczVar.j().o - 1);
                        }
                    }
                    f2 = 0.0f;
                }
                int i6 = uczVarD.f35454a.f23317a;
                if (f < f2) {
                    i6++;
                }
                int iIntValue = ((Number) this.d.F(tczVar, new Integer(i6), new Integer(iD))).intValue();
                if (iIntValue < 0 || iIntValue >= xczVar.j().o) {
                    jf4.o("Failed requirement.");
                    return obj;
                }
                nfk0Var.k = i3;
                objC = c(qah0Var, iIntValue, f, nfk0Var);
                if (objC == obj2) {
                    return obj2;
                }
            }
            return new Float(fFloatValue);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objC);
        fFloatValue = ((Number) objC).floatValue();
        return new Float(fFloatValue);
    }

    public final float b(float f) {
        ncz nczVar;
        tcz tczVar = this.f26910a;
        if ((f >= 0.0f || ((nczVar = (ncz) CollectionsKt.firstOrNull(tczVar.f33739a.j().l)) != null && (nczVar.f23317a > 0 || nczVar.p < 0))) && (f <= 0.0f || tczVar.a())) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        if (r15 == r0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.qah0 r12, int r13, float r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pfk0.c(a.qah0, int, float, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [float] */
    public final Object d(qah0 qah0Var, ucz uczVar, int i, float f, boolean z, zje zjeVar) {
        mfk0 mfk0Var;
        jie0 jie0Var;
        if (zjeVar instanceof mfk0) {
            mfk0Var = (mfk0) zjeVar;
            int i2 = mfk0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mfk0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                mfk0Var = new mfk0(this, zjeVar);
            }
        } else {
            mfk0Var = new mfk0(this, zjeVar);
        }
        mfk0 mfk0Var2 = mfk0Var;
        Object obj = mfk0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = mfk0Var2.l;
        try {
            if (i3 == 0) {
                z1x.P(obj);
                int i4 = uczVar.f35454a.f23317a;
                if (i4 == i && this.f26910a.b(i4) == 0) {
                    return new Float(b(f));
                }
                jie0 jie0Var2 = new jie0();
                jie0Var2.f16571a = f;
                jie0 jie0Var3 = new jie0();
                boolean z2 = z && Math.abs(i - uczVar.f35454a.f23317a) >= 2;
                g(new Integer(i));
                l73 l73VarD = x4d0.d(0.0f, f, 28);
                sjj sjjVar = this.b;
                zsl zslVar = new zsl(jie0Var3, qah0Var, jie0Var2, this, z2, i);
                mfk0Var2.i = jie0Var2;
                mfk0Var2.l = 1;
                if (hhm0.o(l73VarD, sjjVar, false, zslVar, mfk0Var2) == wneVar) {
                    return wneVar;
                }
                jie0Var = jie0Var2;
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jie0Var = mfk0Var2.i;
                z1x.P(obj);
            }
            g(null);
            this = jie0Var.f16571a;
            return new Float((float) this);
        } catch (Throwable th) {
            this.g(null);
            throw th;
        }
    }

    public final boolean e(i73 i73Var, ucz uczVar, int i, Function1 function1) {
        int iB;
        int i2;
        int i3;
        ncz nczVar = uczVar.f35454a;
        float fFloatValue = ((Number) i73Var.b()).floatValue();
        tcz tczVar = this.f26910a;
        if (fFloatValue <= 0.0f || (i3 = nczVar.f23317a) < i) {
            iB = (fFloatValue >= 0.0f || (i2 = nczVar.f23317a) > i - 1) ? 0 : tczVar.b(i2 + 1);
        } else {
            iB = tczVar.b(i3);
        }
        if (iB == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(iB));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [float] */
    public final Object f(qah0 qah0Var, ucz uczVar, int i, float f, zje zjeVar) {
        ofk0 ofk0Var;
        jie0 jie0Var;
        if (zjeVar instanceof ofk0) {
            ofk0Var = (ofk0) zjeVar;
            int i2 = ofk0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ofk0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                ofk0Var = new ofk0(this, zjeVar);
            }
        } else {
            ofk0Var = new ofk0(this, zjeVar);
        }
        ofk0 ofk0Var2 = ofk0Var;
        Object obj = ofk0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = ofk0Var2.l;
        try {
            if (i3 == 0) {
                z1x.P(obj);
                jie0 jie0Var2 = new jie0();
                int i4 = uczVar.f35454a.f23317a;
                float f2 = 0.0f;
                if ((i > i4 && f > 0.0f) || (i <= i4 && f < 0.0f)) {
                    f2 = f;
                }
                jie0Var2.f16571a = f2;
                jie0 jie0Var3 = new jie0();
                g(new Integer(i));
                l73 l73VarD = x4d0.d(jie0Var3.f16571a, jie0Var2.f16571a, 28);
                Float f3 = new Float(this.f26910a.b(i));
                j73 j73Var = this.c;
                kc0 kc0Var = new kc0((byte) 2, i, jie0Var3, qah0Var, jie0Var2, this);
                jie0Var = jie0Var2;
                ofk0Var2.i = jie0Var;
                ofk0Var2.l = 1;
                if (hhm0.q(l73VarD, f3, j73Var, false, kc0Var, ofk0Var2, 4) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jie0Var = ofk0Var2.i;
                z1x.P(obj);
            }
            g(null);
            this = jie0Var.f16571a;
            return new Float((float) this);
        } catch (Throwable th) {
            this.g(null);
            throw th;
        }
    }

    public final void g(Integer num) {
        ((hgk0) this.e).setValue(num);
    }
}
