package a;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class az2 implements vf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6k f1696a;
    public long b = 9205357640488583168L;
    public final jjn c;
    public final pz40 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final f3k i;

    public az2(Context context, w6k w6kVar, long j, lh80 lh80Var) {
        this.f1696a = w6kVar;
        jjn jjnVar = new jjn(context, fbc.U(j));
        this.c = jjnVar;
        this.d = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        zy2 zy2Var = new zy2(this, (byte) 0);
        woa0 woa0Var = fnn0.f9847a;
        jnn0 jnn0Var = new jnn0(null, null, zy2Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new a9v(jnn0Var, this, jjnVar) : new a9v(jnn0Var, this, jjnVar, lh80Var);
    }

    @Override // a.vf80
    public final yzj a() {
        return this.i;
    }

    @Override // a.vf80
    public final boolean b() {
        jjn jjnVar = this.c;
        EdgeEffect edgeEffect = jjnVar.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? gy2.f(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = jjnVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? gy2.f(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = jjnVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? gy2.f(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = jjnVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? gy2.f(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:105:0x020d  */
    /* JADX WARN: Code duplicated, block: B:108:0x021d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0222  */
    /* JADX WARN: Code duplicated, block: B:112:0x022a  */
    /* JADX WARN: Code duplicated, block: B:113:0x022e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0237  */
    /* JADX WARN: Code duplicated, block: B:121:0x023f  */
    /* JADX WARN: Code duplicated, block: B:132:0x027a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0297  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:171:0x031b  */
    /* JADX WARN: Code duplicated, block: B:173:0x032c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0330  */
    /* JADX WARN: Code duplicated, block: B:180:0x0340  */
    /* JADX WARN: Code duplicated, block: B:187:0x034a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b A[PHI: r7
  0x012b: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x0159, B:62:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    @Override // a.vf80
    public final long c(long j, int i, Function1 function1) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fJ;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jE;
        long jE2;
        boolean z;
        boolean zF;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        z8v z8vVar;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        z8v z8vVar2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        z8v z8vVar3;
        float f3;
        int i3;
        long j3;
        boolean z2;
        int i4;
        boolean z3;
        if (h7k0.f(this.g)) {
            return ((ne60) function1.invoke(new ne60(j))).f23370a;
        }
        boolean z4 = this.f;
        boolean z5 = true;
        jjn jjnVar = this.c;
        if (!z4) {
            if (jjn.g(jjnVar.f)) {
                i(0L);
            }
            if (jjn.g(jjnVar.g)) {
                j(0L);
            }
            if (jjn.g(jjnVar.d)) {
                k(0L);
            }
            if (jjn.g(jjnVar.e)) {
                h(0L);
            }
            this.f = true;
        }
        int i5 = p03.f26128a;
        float f4 = i == 2 ? 4.0f : 1.0f;
        long jG = ne60.g(f4, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!jjn.g(jjnVar.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (jjn.g(jjnVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fH = h(jG);
                    if (!jjn.g(jjnVar.e)) {
                        jjnVar.b().finish();
                    }
                    fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jG & 4294967295L)) ? Float.intBitsToFloat(i6) : fH / f4;
                }
            } else {
                float fK = k(jG);
                j2 = 4294967295L;
                if (!jjn.g(jjnVar.d)) {
                    jjnVar.e().finish();
                }
                fIntBitsToFloat = fK == Float.intBitsToFloat((int) (jG & 4294967295L)) ? Float.intBitsToFloat(i6) : fK / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!jjn.g(jjnVar.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fJ = i(jG);
                if (!jjn.g(jjnVar.f)) {
                    jjnVar.c().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jG >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f4;
                }
            } else if (jjn.g(jjnVar.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fJ = j(jG);
                if (!jjn.g(jjnVar.g)) {
                    jjnVar.d().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jG >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!ne60.c(jFloatToRawIntBits, 0L)) {
                g();
            }
            jE = ne60.e(j, jFloatToRawIntBits);
            long j4 = ((ne60) function1.invoke(new ne60(jE))).f23370a;
            jE2 = ne60.e(jE, j4);
            if ((Float.intBitsToFloat((int) (jE >> 32)) == 0.0f || Float.intBitsToFloat((int) (jE & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (jjn.g(jjnVar.f) || jjn.g(jjnVar.d) || jjn.g(jjnVar.g) || jjn.g(jjnVar.e)))) {
                e();
            }
            if (i == 1) {
                i3 = (int) (jE2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    j3 = jE2;
                    i(j3);
                } else {
                    j3 = jE2;
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        j(j3);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i4) > 1056964608) {
                        k(j3);
                    } else {
                        if (Float.intBitsToFloat(i4) < -1090519040) {
                            h(j3);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        h(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!ne60.c(jE, 0L)) {
                if (jjn.f(jjnVar.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = jjnVar.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof z8v) {
                        z8v z8vVar4 = (z8v) edgeEffectC;
                        float f5 = z8vVar4.b + fIntBitsToFloat6;
                        z8vVar4.b = f5;
                        if (Math.abs(f5) > z8vVar4.f43986a) {
                            z8vVar4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = jjn.f(jjnVar.f);
                }
                if (jjn.f(jjnVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = jjnVar.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof z8v) {
                        z8vVar3 = (z8v) edgeEffectD;
                        f3 = z8vVar3.b + fIntBitsToFloat5;
                        z8vVar3.b = f3;
                        if (Math.abs(f3) > z8vVar3.f43986a) {
                            z8vVar3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || jjn.f(jjnVar.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (jjn.f(jjnVar.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    edgeEffectE = jjnVar.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof z8v) {
                        z8vVar2 = (z8v) edgeEffectE;
                        f2 = z8vVar2.b + fIntBitsToFloat4;
                        z8vVar2.b = f2;
                        if (Math.abs(f2) > z8vVar2.f43986a) {
                            z8vVar2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || jjn.f(jjnVar.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (jjn.f(jjnVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    edgeEffectB = jjnVar.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof z8v) {
                        z8vVar = (z8v) edgeEffectB;
                        f = z8vVar.b + fIntBitsToFloat3;
                        z8vVar.b = f;
                        if (Math.abs(f) > z8vVar.f43986a) {
                            z8vVar.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || jjn.f(jjnVar.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF && !z) {
                    z5 = false;
                }
                z = z5;
            }
            if (z) {
                g();
            }
            return ne60.f(jFloatToRawIntBits, j4);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!jjn.g(jjnVar.f)) {
            if (jjn.g(jjnVar.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (jjn.g(jjnVar.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!ne60.c(jFloatToRawIntBits, 0L)) {
            g();
        }
        jE = ne60.e(j, jFloatToRawIntBits);
        long j5 = ((ne60) function1.invoke(new ne60(jE))).f23370a;
        jE2 = ne60.e(jE, j5);
        if (Float.intBitsToFloat((int) (jE >> 32)) == 0.0f) {
            e();
        } else {
            e();
        }
        if (i == 1) {
            i3 = (int) (jE2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                j3 = jE2;
                i(j3);
            } else {
                j3 = jE2;
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    j(j3);
                } else {
                    z2 = false;
                }
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        h(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (j3 & j2);
            if (Float.intBitsToFloat(i4) > 1056964608) {
                k(j3);
            } else {
                if (Float.intBitsToFloat(i4) < -1090519040) {
                    h(j3);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!ne60.c(jE, 0L)) {
            if (jjn.f(jjnVar.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (jjn.f(jjnVar.g)) {
                edgeEffectD = jjnVar.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof z8v) {
                    z8vVar3 = (z8v) edgeEffectD;
                    f3 = z8vVar3.b + fIntBitsToFloat5;
                    z8vVar3.b = f3;
                    if (Math.abs(f3) > z8vVar3.f43986a) {
                        z8vVar3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (jjn.f(jjnVar.d)) {
                edgeEffectE = jjnVar.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                if (edgeEffectE instanceof z8v) {
                    z8vVar2 = (z8v) edgeEffectE;
                    f2 = z8vVar2.b + fIntBitsToFloat4;
                    z8vVar2.b = f2;
                    if (Math.abs(f2) > z8vVar2.f43986a) {
                        z8vVar2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (jjn.f(jjnVar.e)) {
                edgeEffectB = jjnVar.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                if (edgeEffectB instanceof z8v) {
                    z8vVar = (z8v) edgeEffectB;
                    f = z8vVar.b + fIntBitsToFloat3;
                    z8vVar.b = f;
                    if (Math.abs(f) > z8vVar.f43986a) {
                        z8vVar.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (!zF) {
                z5 = false;
            }
            z = z5;
        }
        if (z) {
            g();
        }
        return ne60.f(jFloatToRawIntBits, j5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r20.invoke(r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (r4 == r6) goto L51;
     */
    @Override // a.vf80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r18, kotlin.jvm.functions.Function2 r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.az2.d(long, kotlin.jvm.functions.Function2, a.zje):java.lang.Object");
    }

    public final void e() {
        boolean z;
        jjn jjnVar = this.c;
        EdgeEffect edgeEffect = jjnVar.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = jjnVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = jjnVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = jjnVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            g();
        }
    }

    public final long f() {
        long jU = this.b;
        if ((9223372034707292159L & jU) == 9205357640488583168L) {
            jU = p7x.u(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jU & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void g() {
        if (this.e) {
            ((hgk0) this.d).setValue(Unit.f46060a);
        }
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fI = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fI = gy2.i(edgeEffectB, fI, f);
        } else {
            edgeEffectB.onPull(fI, f);
        }
        return (i2 >= 31 ? gy2.f(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fI) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = gy2.i(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? gy2.f(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fI = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fI = gy2.i(edgeEffectD, fI, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fI, fIntBitsToFloat);
        }
        return (i2 >= 31 ? gy2.f(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fI) : Float.intBitsToFloat(i);
    }

    public final float k(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = gy2.i(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? gy2.f(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void l(long j) {
        boolean zB = h7k0.b(this.g, 0L);
        boolean zB2 = h7k0.b(j, this.g);
        this.g = j;
        if (!zB2) {
            int iB = si30.b(Float.intBitsToFloat((int) (j >> 32)));
            long jB = (((long) si30.b(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
            jjn jjnVar = this.c;
            jjnVar.c = jB;
            EdgeEffect edgeEffect = jjnVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = jjnVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = jjnVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = jjnVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = jjnVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = jjnVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = jjnVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = jjnVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jB), (int) (jB >> 32));
            }
        }
        if (zB || zB2) {
            return;
        }
        e();
    }
}
