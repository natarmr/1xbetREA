package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ooh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25595a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ooh(boolean z, jts0 jts0Var, int i) {
        this.f25595a = (byte) 10;
        this.b = z;
        this.d = jts0Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25595a;
        int i = this.c;
        Object obj3 = this.d;
        boolean z = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                u1c.o((c280) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                jeb.g((sqh) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gkb.C((y5m) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                d6m.d((v5m) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                y9a.B(z, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                yyw.k((vdm0) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                vvw.g((gfa0) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                zcm0.a((zdm0) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                hfm0.i((ydm0) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                jtm0.e((gxo0) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vbw0.M(z, (jts0) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ooh(Object obj, boolean z, int i, byte b) {
        this.f25595a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ ooh(sqh sqhVar, boolean z, int i) {
        this.f25595a = (byte) 1;
        this.d = sqhVar;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ ooh(boolean z, Function1 function1, int i) {
        this.f25595a = (byte) 4;
        this.b = z;
        this.d = function1;
        this.c = i;
    }
}
