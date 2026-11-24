package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
public final class c3d implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3669a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c3d(Object obj, byte b) {
        this.f3669a = b;
        this.b = obj;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        byte b = this.f3669a;
        Object obj = this.b;
        switch (b) {
            case 0:
                f3d f3dVar = (f3d) obj;
                if (f3dVar.f && Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f && f3dVar.f8856a.l() < f3dVar.d.l()) {
                    return f3dVar.c(j);
                }
                return 0L;
            case 1:
                h5m h5mVar = (h5m) obj;
                agk0 agk0Var = h5mVar.b;
                bby bbyVar = h5mVar.d;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                float fL = h5mVar.f12487a.l();
                if (fL <= 0.0f) {
                    return 0L;
                }
                int i2 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i2) >= 0.0f) {
                    return 0L;
                }
                float fC = l1e0.c(agk0Var.l(), 0.0f, fL);
                float fC2 = l1e0.c(fC - Float.intBitsToFloat(i2), 0.0f, fL);
                agk0Var.m(fC2);
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fC - fC2)) & 4294967295L);
            case 2:
                zyn zynVar = (zyn) obj;
                oyq0 oyq0Var = zynVar.f45214a;
                if (!((Boolean) zynVar.d.invoke()).booleanValue()) {
                    return 0L;
                }
                float fL2 = oyq0Var.c.l();
                oyq0Var.c(Float.intBitsToFloat((int) (4294967295L & j)) + oyq0Var.c.l());
                if (fL2 == oyq0Var.c.l()) {
                    return 0L;
                }
                return ne60.a(j, 0.0f, 0.0f, 2);
            default:
                clo cloVar = (clo) obj;
                oyq0 oyq0Var2 = cloVar.f4569a;
                if (!((Boolean) cloVar.d.invoke()).booleanValue()) {
                    return 0L;
                }
                int i3 = (int) (4294967295L & j);
                if (Float.intBitsToFloat(i3) > 0.0f) {
                    return 0L;
                }
                float fL3 = oyq0Var2.c.l();
                oyq0Var2.c(Float.intBitsToFloat(i3) + oyq0Var2.c.l());
                if (fL3 == oyq0Var2.c.l()) {
                    return 0L;
                }
                return ne60.a(j, 0.0f, 0.0f, 2);
        }
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        byte b = this.f3669a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (Float.intBitsToFloat((int) (j2 & 4294967295L)) > 0.0f) {
                    return ((f3d) obj).c(j2);
                }
                return 0L;
            case 1:
                h5m h5mVar = (h5m) obj;
                agk0 agk0Var = h5mVar.b;
                bby bbyVar = h5mVar.d;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                float fL = h5mVar.f12487a.l();
                if (fL <= 0.0f) {
                    return 0L;
                }
                int i2 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i2) <= 0.0f) {
                    return 0L;
                }
                float fC = l1e0.c(agk0Var.l(), 0.0f, fL);
                float fC2 = l1e0.c(fC - Float.intBitsToFloat(i2), 0.0f, fL);
                agk0Var.m(fC2);
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fC - fC2)) & 4294967295L);
            case 2:
                zyn zynVar = (zyn) obj;
                oyq0 oyq0Var = zynVar.f45214a;
                if (((Boolean) zynVar.d.invoke()).booleanValue()) {
                    int i3 = (int) (j & 4294967295L);
                    oyq0Var.b(Float.intBitsToFloat(i3) + oyq0Var.b.l());
                    oyq0Var.c(Float.intBitsToFloat(i3) + oyq0Var.c.l());
                }
                return 0L;
            default:
                clo cloVar = (clo) obj;
                oyq0 oyq0Var2 = cloVar.f4569a;
                if (!((Boolean) cloVar.d.invoke()).booleanValue()) {
                    return 0L;
                }
                int i4 = (int) (j & 4294967295L);
                oyq0Var2.b(Float.intBitsToFloat(i4) + oyq0Var2.b.l());
                int i5 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i5) < 0.0f || Float.intBitsToFloat(i4) < 0.0f) {
                    float fL2 = oyq0Var2.c.l();
                    oyq0Var2.c(Float.intBitsToFloat(i4) + oyq0Var2.c.l());
                    return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(oyq0Var2.c.l() - fL2)) & 4294967295L);
                }
                if (Float.intBitsToFloat(i5) <= 0.0f) {
                    return 0L;
                }
                float fL3 = oyq0Var2.c.l();
                oyq0Var2.c(Float.intBitsToFloat(i5) + oyq0Var2.c.l());
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(oyq0Var2.c.l() - fL3)) & 4294967295L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        b3d b3dVar;
        long j3;
        g5m g5mVar;
        Object objD0;
        yyn yynVar;
        yyn yynVar2;
        long j4;
        blo bloVar;
        blo bloVar2;
        long j5;
        long j6 = j2;
        byte b = this.f3669a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (zjeVar instanceof b3d) {
                    b3dVar = (b3d) zjeVar;
                    int i = b3dVar.m;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b3dVar.m = i - Integer.MIN_VALUE;
                    } else {
                        b3dVar = new b3d(this, zjeVar);
                    }
                } else {
                    b3dVar = new b3d(this, zjeVar);
                }
                b3d b3dVar2 = b3dVar;
                Object obj2 = b3dVar2.k;
                Object obj3 = wne.f39444a;
                int i2 = b3dVar2.m;
                if (i2 == 0) {
                    z1x.P(obj2);
                    b3dVar2.i = j;
                    b3dVar2.j = j6;
                    b3dVar2.m = 1;
                    if (((f3d) obj).e(b3dVar2) != obj3) {
                        j3 = j;
                    }
                    return obj3;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        z1x.P(obj2);
                        return obj2;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j7 = b3dVar2.j;
                long j8 = b3dVar2.i;
                z1x.P(obj2);
                j6 = j7;
                j3 = j8;
                b3dVar2.i = j3;
                b3dVar2.j = j6;
                b3dVar2.m = 2;
                Object objG = super.g(j3, j6, b3dVar2);
                if (objG != obj3) {
                    return objG;
                }
                return obj3;
            case 1:
                long j9 = j;
                if (zjeVar instanceof g5m) {
                    g5mVar = (g5m) zjeVar;
                    int i3 = g5mVar.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        g5mVar.m = i3 - Integer.MIN_VALUE;
                    } else {
                        g5mVar = new g5m(this, zjeVar);
                    }
                } else {
                    g5mVar = new g5m(this, zjeVar);
                }
                Object obj4 = g5mVar.k;
                Object obj5 = wne.f39444a;
                int i4 = g5mVar.m;
                if (i4 == 0) {
                    z1x.P(obj4);
                    h5m h5mVar = (h5m) obj;
                    cgk0 cgk0Var = h5mVar.f12487a;
                    agk0 agk0Var = h5mVar.b;
                    g5mVar.i = j9;
                    g5mVar.j = j6;
                    g5mVar.m = 1;
                    float fL = cgk0Var.l();
                    if (fL <= 0.0f) {
                        objD0 = Unit.f46060a;
                    } else {
                        float f = (cgk0Var.l() > 0 ? l1e0.c(agk0Var.l() / ((float) cgk0Var.l()), 0.0f, 1.0f) : 0.0f) >= 0.5f ? fL : 0.0f;
                        if (agk0Var.l() != f) {
                            vne vneVar = h5mVar.c;
                            CoroutineContext coroutineContext = vneVar != null ? vneVar.getCoroutineContext() : null;
                            if (coroutineContext != null) {
                                objD0 = qjj.d0(coroutineContext, new ep8(h5mVar, f, (yje) null), g5mVar);
                                if (objD0 != obj5) {
                                    objD0 = Unit.f46060a;
                                }
                            } else {
                                agk0Var.m(f);
                                objD0 = Unit.f46060a;
                            }
                        } else {
                            objD0 = Unit.f46060a;
                        }
                    }
                    if (objD0 != obj5) {
                    }
                    return obj5;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        z1x.P(obj4);
                        return obj4;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j6 = g5mVar.j;
                long j10 = g5mVar.i;
                z1x.P(obj4);
                j9 = j10;
                g5mVar.i = j9;
                g5mVar.j = j6;
                g5mVar.m = 2;
                Object objG2 = super.g(j9, j6, g5mVar);
                if (objG2 != obj5) {
                    return objG2;
                }
                return obj5;
            case 2:
                zyn zynVar = (zyn) obj;
                oyq0 oyq0Var = zynVar.f45214a;
                if (zjeVar instanceof yyn) {
                    yynVar = (yyn) zjeVar;
                    int i5 = yynVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yynVar.l = i5 - Integer.MIN_VALUE;
                    } else {
                        yynVar = new yyn(this, zjeVar);
                    }
                } else {
                    yynVar = new yyn(this, zjeVar);
                }
                Object objG3 = yynVar.j;
                Object obj6 = wne.f39444a;
                int i6 = yynVar.l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        j6 = yynVar.i;
                        z1x.P(objG3);
                        yynVar2 = yynVar;
                    } else {
                        if (i6 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j4 = yynVar.i;
                        z1x.P(objG3);
                    }
                    return new g6u0(g6u0.e(j4, ((g6u0) objG3).f10786a));
                }
                z1x.P(objG3);
                if (g6u0.c(j6) > 0.0f && (oyq0Var.c.l() == 0.0f || oyq0Var.c.l() == oyq0Var.f26070a)) {
                    oyq0Var.b(0.0f);
                }
                yynVar.i = j6;
                yynVar.l = 1;
                yynVar2 = yynVar;
                objG3 = super.g(j, j6, yynVar2);
                if (objG3 != obj6) {
                }
                return obj6;
                long j11 = ((g6u0) objG3).f10786a;
                float fC = g6u0.c(j6);
                sjj sjjVar = zynVar.c;
                nul0 nul0Var = zynVar.b;
                yynVar2.i = j11;
                yynVar2.l = 2;
                Object objE = ob3.e(oyq0Var, fC, sjjVar, nul0Var, yynVar2);
                if (objE != obj6) {
                    objG3 = objE;
                    j4 = j11;
                    return new g6u0(g6u0.e(j4, ((g6u0) objG3).f10786a));
                }
                return obj6;
            default:
                clo cloVar = (clo) obj;
                oyq0 oyq0Var2 = cloVar.f4569a;
                if (zjeVar instanceof blo) {
                    bloVar = (blo) zjeVar;
                    int i7 = bloVar.l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        bloVar.l = i7 - Integer.MIN_VALUE;
                    } else {
                        bloVar = new blo(this, zjeVar);
                    }
                } else {
                    bloVar = new blo(this, zjeVar);
                }
                Object objG4 = bloVar.j;
                Object obj7 = wne.f39444a;
                int i8 = bloVar.l;
                if (i8 == 0) {
                    z1x.P(objG4);
                    if (g6u0.c(j6) > 0.0f) {
                        oyq0Var2.b(0.0f);
                    }
                    bloVar.i = j6;
                    bloVar.l = 1;
                    bloVar2 = bloVar;
                    objG4 = super.g(j, j6, bloVar2);
                    if (objG4 != obj7) {
                    }
                    return obj7;
                }
                if (i8 == 1) {
                    j6 = bloVar.i;
                    z1x.P(objG4);
                    bloVar2 = bloVar;
                } else {
                    if (i8 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j5 = bloVar.i;
                    z1x.P(objG4);
                }
                return new g6u0(g6u0.e(j5, ((g6u0) objG4).f10786a));
                long j12 = ((g6u0) objG4).f10786a;
                float fC2 = g6u0.c(j6);
                sjj sjjVar2 = cloVar.c;
                nul0 nul0Var2 = cloVar.b;
                bloVar2.i = j12;
                bloVar2.l = 2;
                Object objE2 = ob3.e(oyq0Var2, fC2, sjjVar2, nul0Var2, bloVar2);
                if (objE2 != obj7) {
                    objG4 = objE2;
                    j5 = j12;
                    return new g6u0(g6u0.e(j5, ((g6u0) objG4).f10786a));
                }
                return obj7;
        }
    }
}
