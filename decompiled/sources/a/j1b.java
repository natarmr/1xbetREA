package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j1b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15725a;
    public final /* synthetic */ h2b b;

    public /* synthetic */ j1b(h2b h2bVar, byte b) {
        this.f15725a = b;
        this.b = h2bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15725a;
        byte b2 = 10;
        h2b h2bVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                h2bVar.p.b(th, new pua((byte) 7));
                break;
            case 1:
                th.getClass();
                h2bVar.p.b(th, new pua((byte) 9));
                break;
            case 2:
                th.getClass();
                h2bVar.p.b(th, new pua((byte) 10));
                break;
            case 3:
                th.getClass();
                h2bVar.p.b(th, new kea(h2bVar, th, b2));
                break;
            case 4:
                th.getClass();
                h2bVar.p.b(th, new pua((byte) 8));
                break;
            default:
                th.getClass();
                h2bVar.p.b(th, new pua((byte) 12));
                break;
        }
        return Unit.f46060a;
    }
}
