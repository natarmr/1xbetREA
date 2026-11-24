package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h08 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12221a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h08(int i, int i2, mm40 mm40Var, String str, boolean z) {
        this.e = mm40Var;
        this.f = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12221a;
        short s = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                String str = (String) obj3;
                ((Integer) obj2).getClass();
                int iL = x8x.L(s | 1);
                byte b2 = this.d;
                vbw0.H(iL, b2, (fet) obj, (mm40) obj4, str, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(s | 1);
                boolean z = this.b;
                dem0.e((taq0) obj4, z, (ugd) obj3, (fet) obj, iL2, this.d);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h08(taq0 taq0Var, boolean z, ugd ugdVar, int i, int i2) {
        this.e = taq0Var;
        this.b = z;
        this.f = ugdVar;
        this.c = i;
        this.d = i2;
    }
}
