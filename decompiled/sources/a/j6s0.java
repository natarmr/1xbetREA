package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j6s0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16004a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ bzt d;

    public /* synthetic */ j6s0(long j, String str, bzt bztVar) {
        this.b = j;
        this.c = str;
        this.d = bztVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16004a;
        bzt bztVar = this.d;
        switch (b) {
            case 0:
                return new e6s0(this.b, 0L, this.c, "", r7s0.f29993a, false, gqt0.h, bztVar.f3488a.a().r, false);
            default:
                int i = bztVar.f3488a.a().r;
                return new sas0(this.b, this.c, eas0.f7484a, i, false);
        }
    }

    public /* synthetic */ j6s0(bzt bztVar, long j, String str) {
        this.d = bztVar;
        this.b = j;
        this.c = str;
    }
}
