package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aok implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1204a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ aok(String str, String str2, ugd ugdVar, int i, byte b) {
        this.f1204a = b;
        this.b = str;
        this.c = str2;
        this.d = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1204a;
        ugd ugdVar = this.d;
        String str = this.c;
        String str2 = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                dub.i(str2, str, ugdVar, fetVar, x8x.L(385));
                break;
            default:
                fww.a(str2, str, ugdVar, fetVar, x8x.L(385));
                break;
        }
        return Unit.f46060a;
    }
}
