package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a2d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f118a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a2d(vne vneVar, float f, pvh0 pvh0Var, y1h0 y1h0Var) {
        this.f118a = (byte) 6;
        this.b = vneVar;
        this.c = f;
        this.d = pvh0Var;
        this.e = y1h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f118a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(3457);
                jwb.c((mm40) obj5, this.c, (ugd) obj4, (ugd) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                qzb.h((mm40) obj5, (m5h) obj4, (xcz) obj3, this.c, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                dub.k((mm40) obj5, (knh) obj4, (xcz) obj3, this.c, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                dub.l((mm40) obj5, (a4x) obj4, this.c, (Function1) obj3, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1);
                ro4.v((mm40) obj5, (f0i) obj4, this.c, (Function1) obj3, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(385);
                unh0.r((mm40) obj5, (vpl) obj4, this.c, (Function2) obj3, (fet) obj, iL6);
                break;
            case 6:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                qjj.W((vne) obj5, null, null, new x5n(fFloatValue, this.c, (pvh0) obj4, (y1h0) obj3, (yje) null), 3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(1);
                mrv.z((mm40) obj5, (c3n) obj4, this.c, (Function1) obj3, (fet) obj, iL7);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ a2d(mm40 mm40Var, float f, ugd ugdVar, ugd ugdVar2, int i) {
        this.f118a = (byte) 0;
        this.b = mm40Var;
        this.c = f;
        this.d = ugdVar;
        this.e = ugdVar2;
    }

    public /* synthetic */ a2d(mm40 mm40Var, Object obj, float f, wdr wdrVar, int i, byte b) {
        this.f118a = b;
        this.b = mm40Var;
        this.d = obj;
        this.c = f;
        this.e = wdrVar;
    }

    public /* synthetic */ a2d(mm40 mm40Var, Object obj, xcz xczVar, float f, int i, byte b) {
        this.f118a = b;
        this.b = mm40Var;
        this.d = obj;
        this.e = xczVar;
        this.c = f;
    }
}
