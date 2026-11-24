package a;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a1i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f70a;
    public final /* synthetic */ w6k b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ a1i(pz40 pz40Var, w6k w6kVar) {
        this.f70a = (byte) 3;
        this.c = pz40Var;
        this.b = w6kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f70a;
        pz40 pz40Var = this.c;
        w6k w6kVar = this.b;
        switch (b) {
            case 0:
                pz40Var.setValue(new ycl(w6kVar.r0((int) (((qkx) obj).f28908a >> 32))));
                return Unit.f46060a;
            case 1:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                float fR0 = w6kVar.r0((int) (j6zVar.g() & 4294967295L));
                zcl zclVar = qmk.f28987a;
                pz40Var.setValue(new ycl(fR0 - 56.0f));
                return Unit.f46060a;
            case 2:
                j6z j6zVar2 = (j6z) obj;
                j6zVar2.getClass();
                pz40Var.setValue(new ycl(w6kVar.r0((int) (j6zVar2.g() & 4294967295L))));
                return Unit.f46060a;
            case 3:
                pz40Var.setValue(new ycl(w6kVar.r0((int) (((qkx) obj).f28908a & 4294967295L))));
                return Unit.f46060a;
            case 4:
                j6z j6zVar3 = (j6z) obj;
                j6zVar3.getClass();
                pz40Var.setValue(new ycl(w6kVar.r0((int) (j6zVar3.g() & 4294967295L))));
                return Unit.f46060a;
            case 5:
                vpj0 vpj0Var = new vpj0((Function0) obj, (byte) 7);
                a1i a1iVar = new a1i(w6kVar, pz40Var, (byte) 6);
                if (op10.a()) {
                    return op10.a() ? new lp10(vpj0Var, a1iVar, Build.VERSION.SDK_INT == 28 ? aw90.f1563a : cw90.f5071a) : jm40.b;
                }
                v4i0.p("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                bdl bdlVar = (bdl) obj;
                pz40Var.setValue(new qkx((((long) w6kVar.T(bdl.a(bdlVar.f2404a))) & 4294967295L) | (((long) w6kVar.T(bdl.b(bdlVar.f2404a))) << 32)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ a1i(w6k w6kVar, pz40 pz40Var, byte b) {
        this.f70a = b;
        this.b = w6kVar;
        this.c = pz40Var;
    }
}
