package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a810 implements w6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f402a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ c810 d;

    public a810(c810 c810Var) {
        this.d = c810Var;
    }

    public final void a(xlw xlwVar, float f) {
        c810 c810Var = this.d;
        fp fpVar = c810Var.q;
        if (fpVar == null) {
            fpVar = new fp();
            c810Var.q = fpVar;
        }
        int iH = tx3.H(xlwVar, (xlw[]) fpVar.c);
        if (iH >= 0) {
            float[] fArr = (float[]) fpVar.d;
            if (fArr[iH] != f) {
                fArr[iH] = f;
                ((byte[]) fpVar.e)[iH] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) fpVar.e;
                if (bArr[iH] == 2) {
                    bArr[iH] = 0;
                    return;
                }
                return;
            }
        }
        int i = fpVar.b;
        xlw[] xlwVarArr = (xlw[]) fpVar.c;
        if (i == xlwVarArr.length) {
            int i2 = i * 2;
            fpVar.c = (xlw[]) Arrays.copyOf(xlwVarArr, i2);
            fpVar.d = Arrays.copyOf((float[]) fpVar.d, i2);
            fpVar.e = Arrays.copyOf((byte[]) fpVar.e, i2);
        }
        ((xlw[]) fpVar.c)[i] = xlwVar;
        ((byte[]) fpVar.e)[i] = 3;
        ((float[]) fpVar.d)[i] = f;
        fpVar.b++;
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.d.getDensity();
    }

    @Override // a.w6k
    public final float v0() {
        return this.d.v0();
    }
}
