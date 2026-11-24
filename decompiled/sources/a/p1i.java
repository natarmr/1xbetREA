package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p1i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26203a;
    public final /* synthetic */ o4i b;

    public /* synthetic */ p1i(o4i o4iVar, byte b) {
        this.f26203a = b;
        this.b = o4iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26203a;
        o4i o4iVar = this.b;
        switch (b) {
            case 0:
                return new u6n(d4d.SECONDARY60, w6n.j, o4iVar.b);
            case 1:
                return new u6n(d4d.SECONDARY60, w6n.j, o4iVar.c);
            case 2:
                return new u6n(d4d.SECONDARY60, w6n.j, o4iVar.b);
            default:
                return new u6n(d4d.SECONDARY60, w6n.j, o4iVar.c);
        }
    }
}
