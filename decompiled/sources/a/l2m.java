package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l2m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19316a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ l2m(long j, boolean z, nyq0 nyq0Var, ugd ugdVar, int i) {
        this.f19316a = (byte) 5;
        this.e = j;
        this.d = z;
        this.b = nyq0Var;
        this.c = ugdVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19316a;
        int i = this.f;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj3;
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                boolean z = this.d;
                long j = this.e;
                int i2 = z ? 1 : 0;
                vdb.f(iL, i2, j, (fet) obj, (mm40) obj4, str);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                long j2 = this.e;
                kbc.K(iL2, j2, (fet) obj, (mm40) obj4, (String) obj3, this.d);
                break;
            case 2:
                String str2 = (String) obj3;
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                boolean z2 = this.d;
                long j3 = this.e;
                int i3 = z2 ? 1 : 0;
                dyb.r(iL3, i3, j3, (fet) obj, (mm40) obj4, str2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                long j4 = this.e;
                n4c.C(iL4, j4, (fet) obj, (mm40) obj4, (String) obj3, this.d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                long j5 = this.e;
                l8x.O(iL5, j5, (fet) obj, (mm40) obj4, (String) obj3, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                long j6 = this.e;
                boolean z3 = this.d;
                qzb.g(j6, z3, (nyq0) obj4, (ugd) obj3, (fet) obj, iL6);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l2m(mm40 mm40Var, String str, long j, int i, int i2, byte b) {
        this.f19316a = b;
        this.b = mm40Var;
        this.c = str;
        this.e = j;
        this.f = i;
        this.d = i2;
    }

    public /* synthetic */ l2m(mm40 mm40Var, String str, long j, boolean z, int i, byte b) {
        this.f19316a = b;
        this.b = mm40Var;
        this.c = str;
        this.e = j;
        this.d = z;
        this.f = i;
    }

    public /* synthetic */ l2m(mm40 mm40Var, String str, boolean z, long j, int i) {
        this.f19316a = (byte) 1;
        this.b = mm40Var;
        this.c = str;
        this.d = z;
        this.e = j;
        this.f = i;
    }
}
