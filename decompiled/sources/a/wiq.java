package a;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class wiq implements d28 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ajq f39229a;
    public final int b;
    public final mtc c = new mtc();

    public wiq(ajq ajqVar, int i) {
        this.f39229a = ajqVar;
        this.b = i;
    }

    public final long a(guo guoVar) {
        mtc mtcVar;
        ajq ajqVar;
        int iL;
        while (true) {
            long jI = guoVar.i();
            long length = guoVar.getLength() - 6;
            mtcVar = this.c;
            ajqVar = this.f39229a;
            if (jI >= length) {
                break;
            }
            long jI2 = guoVar.i();
            fq80 fq80Var = new fq80(17);
            int i = 0;
            boolean zQ = false;
            guoVar.n(fq80Var.f9961a, 0, 2);
            char cG = fq80Var.g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.b;
            if (cG != i2) {
                guoVar.g();
                guoVar.j((int) (jI2 - guoVar.getPosition()));
            } else {
                byte[] bArr = fq80Var.f9961a;
                while (i < 15 && (iL = guoVar.l(bArr, 2 + i, 15 - i)) != -1) {
                    i += iL;
                }
                fq80Var.L(i + 2);
                guoVar.g();
                guoVar.j((int) (jI2 - guoVar.getPosition()));
                zQ = ieb.Q(fq80Var, ajqVar, i2, mtcVar);
            }
            if (zQ) {
                break;
            }
            guoVar.j(1);
        }
        if (guoVar.i() < guoVar.getLength() - 6) {
            return mtcVar.f22363a;
        }
        guoVar.j((int) (guoVar.getLength() - guoVar.i()));
        return ajqVar.j;
    }

    @Override // a.d28
    public final c28 j(guo guoVar, long j) {
        long position = guoVar.getPosition();
        long jA = a(guoVar);
        long jI = guoVar.i();
        guoVar.j(Math.max(6, this.f39229a.c));
        long jA2 = a(guoVar);
        long jI2 = guoVar.i();
        if (jA > j || jA2 <= j) {
            return jA2 <= j ? new c28(-2, jA2, jI2) : new c28(-1, jA, position);
        }
        return new c28(0, -9223372036854775807L, jI);
    }
}
