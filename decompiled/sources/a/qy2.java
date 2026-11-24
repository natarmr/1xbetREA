package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qy2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29513a;
    public final /* synthetic */ xjk b;

    public /* synthetic */ qy2(xjk xjkVar, byte b) {
        this.f29513a = b;
        this.b = xjkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29513a;
        xjk xjkVar = this.b;
        switch (b) {
            case 0:
                xjkVar.show();
                return new ty2(xjkVar, (byte) 0);
            default:
                xjkVar.f.getClass();
                xjkVar.e.invoke();
                return Unit.f46060a;
        }
    }
}
