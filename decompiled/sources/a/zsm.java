package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zsm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44911a;
    public final /* synthetic */ r3i b;

    public /* synthetic */ zsm(r3i r3iVar, byte b) {
        this.f44911a = b;
        this.b = r3iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44911a;
        r3i r3iVar = this.b;
        switch (b) {
            case 0:
                return new u6n(d4d.SECONDARY60, w6n.j, r3iVar.b);
            case 1:
                return new u6n(d4d.SECONDARY60, w6n.j, r3iVar.c);
            case 2:
                return new u6n(d4d.SECONDARY60, w6n.j, r3iVar.b);
            default:
                return new u6n(d4d.SECONDARY60, w6n.j, r3iVar.c);
        }
    }
}
