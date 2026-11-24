package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fdl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9361a = 0;
    public final /* synthetic */ hie0 b;

    public /* synthetic */ fdl(a1d a1dVar, gdl gdlVar, hie0 hie0Var) {
        this.b = hie0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9361a;
        hie0 hie0Var = this.b;
        switch (b) {
            case 0:
                gdl gdlVar = (gdl) obj;
                if (!gdlVar.n) {
                    return gps0.b;
                }
                if (gdlVar.p != null) {
                    xcx.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gdlVar.p = null;
                hie0Var.f13108a = hie0Var.f13108a;
                return gps0.f11699a;
            default:
                if (!((qsw) obj).q) {
                    return gps0.f11699a;
                }
                hie0Var.f13108a = false;
                return gps0.c;
        }
    }

    public /* synthetic */ fdl(hie0 hie0Var) {
        this.b = hie0Var;
    }
}
