package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eu60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8404a;
    public final /* synthetic */ mdm b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ eu60(mdm mdmVar, Function0 function0, int i, byte b) {
        this.f8404a = b;
        this.b = mdmVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8404a;
        Function0 function0 = this.c;
        mdm mdmVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jiq0.o(mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 1:
                hmw0.y(mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 2:
                dwi0.o(mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 3:
                hp4.j(mdmVar, function0, fetVar, x8x.L(1));
                break;
            default:
                uc9.v(mdmVar, function0, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
