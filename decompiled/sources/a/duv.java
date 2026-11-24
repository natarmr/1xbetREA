package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class duv implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6714a;
    public final /* synthetic */ mdm b;
    public final /* synthetic */ int c;

    public /* synthetic */ duv(mdm mdmVar, int i) {
        this.f6714a = (byte) 2;
        this.b = mdmVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6714a;
        int i = this.c;
        mdm mdmVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hew0.j(mdmVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                azw.a(mdmVar, fetVar, x8x.L(i | 1));
                break;
            default:
                bsr0.p(mdmVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ duv(mdm mdmVar, int i, byte b) {
        this.f6714a = b;
        this.b = mdmVar;
        this.c = i;
    }
}
