package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m180 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20995a = 0;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pu90 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ pu90 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ pu90 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ pu90 l;
    public final /* synthetic */ pu90 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Object s;

    public /* synthetic */ m180(pu90 pu90Var, int i, int i2, pu90 pu90Var2, int i3, int i4, pu90 pu90Var3, int i5, pu90 pu90Var4, int i6, int i7, pu90 pu90Var5, int i8, int i9, pu90 pu90Var6, j00 j00Var, int i10, boolean z) {
        this.b = pu90Var;
        this.c = i;
        this.d = i2;
        this.e = pu90Var2;
        this.f = i3;
        this.g = i4;
        this.h = pu90Var3;
        this.i = i5;
        this.j = pu90Var4;
        this.k = i6;
        this.n = i7;
        this.l = pu90Var5;
        this.o = i8;
        this.p = i9;
        this.m = pu90Var6;
        this.s = j00Var;
        this.q = i10;
        this.r = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pu90 pu90Var;
        int iD;
        byte b = this.f20995a;
        boolean z = this.r;
        int i = this.q;
        int i2 = this.p;
        Object obj2 = this.s;
        int i3 = this.o;
        int i4 = this.n;
        pu90 pu90Var2 = this.m;
        pu90 pu90Var3 = this.l;
        int i5 = this.k;
        pu90 pu90Var4 = this.j;
        int i6 = this.i;
        pu90 pu90Var5 = this.h;
        int i7 = this.g;
        int i8 = this.f;
        pu90 pu90Var6 = this.e;
        int i9 = this.d;
        int i10 = this.c;
        pu90 pu90Var7 = this.b;
        switch (b) {
            case 0:
                j00 j00Var = (j00) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                n180.f(pu90Var7, z, ou90Var, i10, i9);
                n180.f(pu90Var6, z, ou90Var, i8, i7);
                n180.f(pu90Var5, z, ou90Var, i6, i7);
                n180.f(pu90Var4, z, ou90Var, i5, i4);
                n180.f(pu90Var3, z, ou90Var, i3, i2);
                if (pu90Var2 != null) {
                    if (j00Var.g == kgp0.f18250a) {
                        pu90Var = pu90Var2;
                        iD = hne.d(pu90Var6.f27604a, pu90Var.f27604a, 2, i8);
                    } else {
                        pu90Var = pu90Var2;
                        iD = hne.d(pu90Var5.f27604a, pu90Var.f27604a, 2, i6);
                    }
                    int i11 = pu90Var6.b;
                    n180.f(pu90Var, z, ou90Var, iD, (i7 + i11) - (i11 - i));
                }
                break;
            default:
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                kp2.h(pu90Var7, z, ou90Var2, i10, i9);
                kp2.h(pu90Var6, z, ou90Var2, i8, i7);
                int i12 = i6 + i7;
                kp2.h(pu90Var5, z, ou90Var2, i8, i12);
                kp2.h(pu90Var4, z, ou90Var2, i5, i7);
                kp2.h(pu90Var3, z, ou90Var2, i5, i12);
                kp2.h(pu90Var2, z, ou90Var2, i4, i3);
                kp2.h((pu90) obj2, z, ou90Var2, i2, i);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ m180(pu90 pu90Var, int i, int i2, pu90 pu90Var2, int i3, int i4, pu90 pu90Var3, int i5, pu90 pu90Var4, int i6, pu90 pu90Var5, pu90 pu90Var6, int i7, int i8, pu90 pu90Var7, int i9, int i10, boolean z) {
        this.b = pu90Var;
        this.c = i;
        this.d = i2;
        this.e = pu90Var2;
        this.f = i3;
        this.g = i4;
        this.h = pu90Var3;
        this.i = i5;
        this.j = pu90Var4;
        this.k = i6;
        this.l = pu90Var5;
        this.m = pu90Var6;
        this.n = i7;
        this.o = i8;
        this.s = pu90Var7;
        this.p = i9;
        this.q = i10;
        this.r = z;
    }
}
