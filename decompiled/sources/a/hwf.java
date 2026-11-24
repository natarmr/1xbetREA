package a;

/* JADX INFO: loaded from: classes6.dex */
public final class hwf extends kpb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f13767a;
    public double[] b;

    @Override // a.kpb
    public final double O(double d) {
        return this.b[0];
    }

    @Override // a.kpb
    public final void P(double d, double[] dArr) {
        double[] dArr2 = this.b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // a.kpb
    public final void Q(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.b;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // a.kpb
    public final void W(double d, double[] dArr) {
        for (int i = 0; i < this.b.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // a.kpb
    public final double[] Y() {
        return new double[]{this.f13767a};
    }
}
