package a;

/* JADX INFO: loaded from: classes.dex */
public class m2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4d f21053a;
    public final y4d b;
    public final y4d c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public m2e(y4d y4dVar, y4d y4dVar2, int i) {
        y4d y4dVarE = kbc.T(y4dVar.b, 12884901888L) ? qbc.E(y4dVar) : y4dVar;
        y4d y4dVarE2 = kbc.T(y4dVar2.b, 12884901888L) ? qbc.E(y4dVar2) : y4dVar2;
        float[] fArrA = j47.t;
        float[] fArr = null;
        if (i == 3) {
            boolean zT = kbc.T(y4dVar.b, 12884901888L);
            boolean zT2 = kbc.T(y4dVar2.b, 12884901888L);
            if ((!zT || !zT2) && (zT || zT2)) {
                nav0 nav0Var = ((ubg0) (zT ? y4dVar : y4dVar2)).d;
                float[] fArrA2 = zT ? nav0Var.a() : fArrA;
                fArrA = zT2 ? nav0Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(y4dVar2, y4dVarE, y4dVarE2, fArr);
    }

    public long a(long j) {
        float fH = y3d.h(j);
        float fG = y3d.g(j);
        float fE = y3d.e(j);
        float fD = y3d.d(j);
        y4d y4dVar = this.b;
        long jD = y4dVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = y4dVar.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.f21053a);
    }

    public m2e(y4d y4dVar, y4d y4dVar2, y4d y4dVar3, float[] fArr) {
        this.f21053a = y4dVar;
        this.b = y4dVar2;
        this.c = y4dVar3;
        this.d = fArr;
    }
}
