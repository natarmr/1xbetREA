package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vwo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38162a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d4d c;

    public /* synthetic */ vwo0(String str, d4d d4dVar, int i, byte b) {
        this.f38162a = b;
        this.b = str;
        this.c = d4dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38162a;
        d4d d4dVar = this.c;
        String str = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tnq0.c(str, d4dVar, fetVar, x8x.L(1));
                break;
            default:
                xsm0.f(str, d4dVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
