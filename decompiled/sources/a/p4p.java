package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p4p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26365a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ p4p(byte b, int i, a4x a4xVar, Function1 function1) {
        this.f26365a = b;
        this.b = a4xVar;
        this.c = i;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26365a;
        Function1 function1 = this.d;
        int i = this.c;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(a4xVar.size(), new d2p(new x6o((byte) 22), a4xVar, (byte) 4), new a8(new cl2(i, (byte) 2), a4xVar, (byte) 13), new v2m(a4xVar, (byte) 25), new ugd(-1942245546, true, new yul(a4xVar, function1, (byte) 7)));
                break;
            default:
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                i8zVar2.e(a4xVar.size(), new d2p(new x6o((byte) 23), a4xVar, (byte) 3), new a8(new cl2(i, (byte) 3), a4xVar, (byte) 12), new v2m(a4xVar, (byte) 24), new ugd(-1942245546, true, new yul(a4xVar, function1, (byte) 6)));
                break;
        }
        return Unit.f46060a;
    }
}
