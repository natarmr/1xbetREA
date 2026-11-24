package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fbn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9269a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ fbn0(byte b, a4x a4xVar, Function1 function1, boolean z, boolean z2) {
        this.f9269a = b;
        this.b = z;
        this.c = a4xVar;
        this.d = z2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9269a;
        Function1 function1 = this.e;
        boolean z = this.d;
        a4x a4xVar = this.c;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                if (z2) {
                    i8z.d(i8zVar, new f8l0((byte) 21), o050.f);
                }
                i8zVar.e(a4xVar.size(), new o3l0(new f8l0((byte) 22), a4xVar, (byte) 29), null, new y9k0(a4xVar, (byte) 29), new ugd(-1117249557, true, new cz0(a4xVar, z, function1, (byte) 10)));
                break;
            default:
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                if (z2) {
                    i8z.d(i8zVar2, new f8l0((byte) 25), y860.h);
                }
                i8zVar2.e(a4xVar.size(), new zcn0(new f8l0((byte) 26), a4xVar, (byte) 0), null, new adn0(a4xVar, (byte) 0), new ugd(-1117249557, true, new cz0(a4xVar, z, function1, (byte) 11)));
                break;
        }
        return Unit.f46060a;
    }
}
