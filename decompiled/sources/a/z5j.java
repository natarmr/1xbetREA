package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z5j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43819a;
    public final /* synthetic */ pru b;
    public final /* synthetic */ bzt c;

    public /* synthetic */ z5j(pru pruVar, bzt bztVar, byte b) {
        this.f43819a = b;
        this.b = pruVar;
        this.c = bztVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43819a;
        bzt bztVar = this.c;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                return new w5j(bztVar.f3488a.a().r, bm5.e, true, true, pruVar.a().b.z, h6j.f12532a, null);
            default:
                return new f2k0(null, null, ygs0.f42601a, ui5.f35713a, false, 10, pruVar.a(), bztVar.f3488a.a());
        }
    }
}
