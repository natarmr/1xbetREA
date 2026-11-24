package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xiz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40970a;
    public final /* synthetic */ yiz b;

    public /* synthetic */ xiz(yiz yizVar, byte b) {
        this.f40970a = b;
        this.b = yizVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40970a;
        br70 br70Var = br70.f3065a;
        yiz yizVar = this.b;
        switch (b) {
            case 0:
                yizVar.i(dr70.f6544a);
                break;
            case 1:
                yizVar.i(ar70.f1332a);
                break;
            case 2:
                yizVar.i(zq70.f44794a);
                break;
            case 3:
                yizVar.i(br70Var);
                break;
            case 4:
                yizVar.i(br70Var);
                break;
            case 5:
                yizVar.i(new er70(true));
                break;
            default:
                yizVar.i(new er70(false));
                break;
        }
        return Unit.f46060a;
    }
}
