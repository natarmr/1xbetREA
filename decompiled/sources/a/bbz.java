package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bbz {
    public p4e b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ dbz h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zaz[] f2330a = lv00.j;
    public int e = 1;

    public bbz(dbz dbzVar) {
        this.h = dbzVar;
    }

    public static void b(bbz bbzVar, kbz kbzVar, vne vneVar, afv afvVar, int i, int i2, boolean z) {
        bbzVar.h.getClass();
        long jI = kbzVar.i(0);
        bbzVar.a(kbzVar, vneVar, afvVar, i, i2, (int) (!z ? jI & 4294967295L : jI >> 32));
    }

    public final void a(kbz kbzVar, vne vneVar, afv afvVar, int i, int i2, int i3) {
        zaz[] zazVarArr;
        zaz[] zazVarArr2 = this.f2330a;
        int length = zazVarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                zaz zazVar = zazVarArr2[i4];
                if (zazVar != null && zazVar.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = kbzVar.g().size();
        int length2 = this.f2330a.length;
        while (true) {
            zazVarArr = this.f2330a;
            if (size >= length2) {
                break;
            }
            zaz zazVar2 = zazVarArr[size];
            if (zazVar2 != null) {
                zazVar2.d();
            }
            size++;
        }
        if (zazVarArr.length != kbzVar.g().size()) {
            this.f2330a = (zaz[]) Arrays.copyOf(this.f2330a, kbzVar.g().size());
        }
        this.b = new p4e(kbzVar.d());
        this.c = i3;
        this.d = kbzVar.j();
        this.e = kbzVar.b();
        int size2 = kbzVar.g().size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object objN = ((pu90) kbzVar.g().get(i5)).n();
            oaz oazVar = objN instanceof oaz ? (oaz) objN : null;
            zaz[] zazVarArr3 = this.f2330a;
            if (oazVar == null) {
                zaz zazVar3 = zazVarArr3[i5];
                if (zazVar3 != null) {
                    zazVar3.d();
                }
                this.f2330a[i5] = null;
            } else {
                zaz zazVar4 = zazVarArr3[i5];
                if (zazVar4 == null) {
                    zazVar4 = new zaz(vneVar, afvVar, new y2x(this.h, (byte) 29));
                    this.f2330a[i5] = zazVar4;
                }
                zazVar4.d = oazVar.o;
                zazVar4.e = oazVar.p;
                zazVar4.f = oazVar.q;
            }
        }
    }
}
