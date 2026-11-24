package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dya implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6883a;
    public final /* synthetic */ mdm b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dya(mdm mdmVar, Function0 function0, int i, byte b) {
        this.f6883a = b;
        this.b = mdmVar;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6883a;
        byte b2 = this.d;
        Function0 function0 = this.c;
        mdm mdmVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                zgc.k(mdmVar, function0, fetVar, x8x.L(b2 | 1));
                break;
            case 1:
                zgc.k(mdmVar, function0, fetVar, x8x.L(b2 | 1));
                break;
            case 2:
                mbc.s(mdmVar, function0, fetVar, x8x.L(b2 | 1));
                break;
            default:
                xf0.m(mdmVar, function0, fetVar, x8x.L(b2 | 1));
                break;
        }
        return Unit.f46060a;
    }
}
