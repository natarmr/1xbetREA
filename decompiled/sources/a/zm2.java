package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zm2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44604a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zm2(tsv tsvVar, float f, Function2 function2, ugd ugdVar, int i) {
        this.f44604a = (byte) 2;
        this.d = tsvVar;
        this.b = f;
        this.e = function2;
        this.f = ugdVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44604a;
        int i = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                float f = this.b;
                nnw0.w((mm40) obj5, (whe) obj4, f, (bzl) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                float f2 = this.b;
                u1c.p((String) obj5, f2, (l7m0) obj4, (Function0) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                float f3 = this.b;
                vdb.H((tsv) obj5, f3, (Function2) obj4, (ugd) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                float f4 = this.b;
                km10.m((xm10) obj5, f4, (Float) obj4, (Function1) obj3, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(27649);
                x2x.i((mm40) obj5, this.c, this.b, (ugd) obj4, (ugd) obj3, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                float f5 = this.b;
                idm0.f((mm40) obj5, f5, (l7m0) obj4, (Function1) obj3, (fet) obj, iL6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                dnm0.e((mm40) obj5, (exr0) obj4, this.b, (Function2) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                dnm0.a((cxr0) obj5, (String) obj4, this.b, (Function2) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                dnm0.b((dxr0) obj5, (String) obj4, this.b, (Function2) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                int iL7 = x8x.L(i | 1);
                float f6 = this.b;
                xnm0.a((rwr0) obj5, f6, (Function2) obj4, (Function1) obj3, (fet) obj, iL7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(i | 1);
                float f7 = this.b;
                nnw0.B((mm40) obj5, (a4x) obj4, f7, (lh80) obj3, (fet) obj, iL8);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zm2(mm40 mm40Var, int i, float f, ugd ugdVar, ugd ugdVar2, int i2) {
        this.f44604a = (byte) 4;
        this.d = mm40Var;
        this.c = i;
        this.b = f;
        this.e = ugdVar;
        this.f = ugdVar2;
    }

    public /* synthetic */ zm2(Object obj, float f, Object obj2, wdr wdrVar, int i, byte b) {
        this.f44604a = b;
        this.d = obj;
        this.b = f;
        this.e = obj2;
        this.f = wdrVar;
        this.c = i;
    }

    public /* synthetic */ zm2(Object obj, Object obj2, float f, Object obj3, int i, byte b) {
        this.f44604a = b;
        this.d = obj;
        this.e = obj2;
        this.b = f;
        this.f = obj3;
        this.c = i;
    }
}
