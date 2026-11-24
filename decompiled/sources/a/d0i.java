package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d0i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5267a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d0i(float f, int i, int i2, a4x a4xVar) {
        this.f5267a = (byte) 4;
        this.b = a4xVar;
        this.d = i;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5267a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(this.d | 1);
                ro4.w((mm40) this.b, this.c, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                jiq0.Z((mm40) this.b, this.c, (fet) obj, iL2, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(this.d | 1);
                gfx.p((mm40) this.b, this.c, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(this.d | 1);
                ntr.R((mm40) this.b, this.c, (fet) obj, iL4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(7);
                gfx.t((a4x) this.b, this.d, this.c, (fet) obj, iL5);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d0i(mm40 mm40Var, float f, int i, byte b) {
        this.f5267a = b;
        this.b = mm40Var;
        this.c = f;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d0i(mm40 mm40Var, float f, int i, int i2) {
        this.f5267a = (byte) 1;
        this.b = mm40Var;
        this.c = f;
        this.d = i2;
    }
}
