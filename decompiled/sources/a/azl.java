package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class azl implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1721a = 0;
    public final oyq0 b;
    public final sjj c;
    public final nul0 d;
    public final Object e;

    public azl(sjj sjjVar, nul0 nul0Var, oyq0 oyq0Var, Function0 function0) {
        function0.getClass();
        oyq0Var.getClass();
        this.e = function0;
        this.b = oyq0Var;
        this.c = sjjVar;
        this.d = nul0Var;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        byte b = this.f1721a;
        Object obj = this.e;
        oyq0 oyq0Var = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) ((Function0) ((hgk0) ((bzl) obj).e).getValue()).invoke()).booleanValue()) {
                    return 0L;
                }
                agk0 agk0Var = oyq0Var.c;
                agk0 agk0Var2 = oyq0Var.c;
                float fL = agk0Var.l();
                oyq0Var.c(Float.intBitsToFloat((int) (j & 4294967295L)) + agk0Var2.l());
                float fL2 = agk0Var2.l() - fL;
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fL2)) & 4294967295L);
            default:
                int i2 = (int) (4294967295L & j);
                if (Float.intBitsToFloat(i2) > 0.0f || !((Boolean) ((Function0) obj).invoke()).booleanValue()) {
                    return 0L;
                }
                agk0 agk0Var3 = oyq0Var.c;
                agk0 agk0Var4 = oyq0Var.c;
                float fL3 = agk0Var3.l();
                oyq0Var.c(Float.intBitsToFloat(i2) + agk0Var4.l());
                if (fL3 == agk0Var4.l()) {
                    return 0L;
                }
                return ne60.a(j, 0.0f, 0.0f, 2);
        }
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        byte b = this.f1721a;
        Object obj = this.e;
        oyq0 oyq0Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) ((Function0) ((hgk0) ((bzl) obj).e).getValue()).invoke()).booleanValue()) {
                    oyq0Var.b(Float.intBitsToFloat((int) (j & 4294967295L)) + oyq0Var.b.l());
                }
                return 0L;
            default:
                if (!((Boolean) ((Function0) obj).invoke()).booleanValue()) {
                    return 0L;
                }
                agk0 agk0Var = oyq0Var.b;
                agk0 agk0Var2 = oyq0Var.c;
                int i2 = (int) (j & 4294967295L);
                oyq0Var.b(Float.intBitsToFloat(i2) + agk0Var.l());
                int i3 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i3) < 0.0f) {
                    float fL = agk0Var2.l();
                    oyq0Var.c(Float.intBitsToFloat(i3) + agk0Var2.l());
                    float fL2 = agk0Var2.l() - fL;
                    jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    iFloatToRawIntBits = Float.floatToRawIntBits(fL2);
                } else {
                    if (Float.intBitsToFloat(i2) == 0.0f && Float.intBitsToFloat(i3) > 0.0f) {
                        oyq0Var.b(0.0f);
                    }
                    if (Float.intBitsToFloat(i3) <= 0.0f) {
                        return 0L;
                    }
                    float fL3 = agk0Var2.l();
                    oyq0Var.c(Float.intBitsToFloat(i3) + agk0Var2.l());
                    float fL4 = agk0Var2.l() - fL3;
                    jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    iFloatToRawIntBits = Float.floatToRawIntBits(fL4);
                }
                return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        zyl zylVar;
        long j3;
        long j4;
        long j5;
        oip oipVar;
        long j6;
        long j7 = j;
        long j8 = j2;
        byte b = this.f1721a;
        nul0 nul0Var = this.d;
        sjj sjjVar = this.c;
        oyq0 oyq0Var = this.b;
        switch (b) {
            case 0:
                if (zjeVar instanceof zyl) {
                    zylVar = (zyl) zjeVar;
                    int i = zylVar.n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        zylVar.n = i - Integer.MIN_VALUE;
                    } else {
                        zylVar = new zyl(this, zjeVar);
                    }
                } else {
                    zylVar = new zyl(this, zjeVar);
                }
                zyl zylVar2 = zylVar;
                Object objG = zylVar2.l;
                Object obj = wne.f39444a;
                int i2 = zylVar2.n;
                if (i2 == 0) {
                    z1x.P(objG);
                    zylVar2.i = j7;
                    zylVar2.j = j8;
                    zylVar2.n = 1;
                    objG = super.g(j7, j8, zylVar2);
                    if (objG != obj) {
                        j3 = j;
                        j4 = j2;
                    }
                    return obj;
                }
                if (i2 == 1) {
                    j4 = zylVar2.j;
                    j3 = zylVar2.i;
                    z1x.P(objG);
                } else {
                    if (i2 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j5 = zylVar2.k;
                    z1x.P(objG);
                }
                return new g6u0(g6u0.e(j5, ((g6u0) objG).f10786a));
                long j9 = ((g6u0) objG).f10786a;
                float fC = g6u0.c(j4);
                zylVar2.i = j3;
                zylVar2.j = j4;
                zylVar2.k = j9;
                zylVar2.n = 2;
                objG = mbc.b0(oyq0Var, fC, sjjVar, nul0Var, zylVar2);
                if (objG != obj) {
                    j5 = j9;
                    return new g6u0(g6u0.e(j5, ((g6u0) objG).f10786a));
                }
                return obj;
            default:
                if (zjeVar instanceof oip) {
                    oipVar = (oip) zjeVar;
                    int i3 = oipVar.n;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oipVar.n = i3 - Integer.MIN_VALUE;
                    } else {
                        oipVar = new oip(this, zjeVar);
                    }
                } else {
                    oipVar = new oip(this, zjeVar);
                }
                oip oipVar2 = oipVar;
                Object objG2 = oipVar2.l;
                Object obj2 = wne.f39444a;
                int i4 = oipVar2.n;
                if (i4 == 0) {
                    z1x.P(objG2);
                    if (g6u0.c(j8) > 0.0f) {
                        oyq0Var.b(0.0f);
                    }
                    oipVar2.i = j7;
                    oipVar2.j = j8;
                    oipVar2.n = 1;
                    objG2 = super.g(j7, j8, oipVar2);
                    if (objG2 != obj2) {
                    }
                    return obj2;
                }
                if (i4 == 1) {
                    long j10 = oipVar2.j;
                    long j11 = oipVar2.i;
                    z1x.P(objG2);
                    j8 = j10;
                    j7 = j11;
                } else {
                    if (i4 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j6 = oipVar2.k;
                    z1x.P(objG2);
                }
                return new g6u0(g6u0.e(j6, ((g6u0) objG2).f10786a));
                long j12 = ((g6u0) objG2).f10786a;
                float fC2 = g6u0.c(j8);
                oipVar2.i = j7;
                oipVar2.j = j8;
                oipVar2.k = j12;
                oipVar2.n = 2;
                objG2 = nip.e(oyq0Var, fC2, sjjVar, nul0Var, oipVar2);
                if (objG2 != obj2) {
                    j6 = j12;
                    return new g6u0(g6u0.e(j6, ((g6u0) objG2).f10786a));
                }
                return obj2;
        }
    }

    public azl(bzl bzlVar, oyq0 oyq0Var, sjj sjjVar, nul0 nul0Var) {
        oyq0Var.getClass();
        this.e = bzlVar;
        this.b = oyq0Var;
        this.c = sjjVar;
        this.d = nul0Var;
    }
}
