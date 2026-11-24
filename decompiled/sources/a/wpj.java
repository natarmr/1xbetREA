package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wpj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39548a = 1;
    public final /* synthetic */ imj b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wpj(imj imjVar, boolean z) {
        this.b = imjVar;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39548a;
        boolean z = this.c;
        imj imjVar = this.b;
        n1g n1gVar = (n1g) obj;
        switch (b) {
            case 0:
                n1gVar.getClass();
                n1gVar.e = new kq2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = z ? k1g.OPEN_FROM_PUSH : k1g.OPEN_FROM_BANNER;
                std stdVar = j1g.b;
                int i = imjVar.f15028a;
                stdVar.getClass();
                n1gVar.d = std.e(i);
                break;
            default:
                n1gVar.getClass();
                std stdVar2 = j1g.b;
                int i2 = imjVar.f15028a;
                stdVar2.getClass();
                n1gVar.d = std.e(i2);
                n1gVar.e = new rq2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = z ? k1g.OPEN_FROM_PUSH : k1g.OPEN_FROM_BANNER;
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ wpj(boolean z, imj imjVar) {
        this.c = z;
        this.b = imjVar;
    }
}
