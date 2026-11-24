package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tld0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34138a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ int d;

    public /* synthetic */ tld0(boolean z, ugd ugdVar, int i, byte b) {
        this.f34138a = b;
        this.b = z;
        this.c = ugdVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34138a;
        int i = this.d;
        ugd ugdVar = this.c;
        boolean z = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                vld0.a(x8x.L(i | 1), ugdVar, fetVar, z);
                break;
            default:
                uld0.a(x8x.L(i | 1), ugdVar, fetVar, z);
                break;
        }
        return Unit.f46060a;
    }
}
