package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rfx implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30407a;
    public final /* synthetic */ sfx b;

    public /* synthetic */ rfx(sfx sfxVar, byte b) {
        this.f30407a = b;
        this.b = sfxVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30407a;
        sfx sfxVar = this.b;
        hps0 hps0Var = (hps0) obj;
        switch (b) {
            case 0:
                hps0Var.getClass();
                sfx sfxVar2 = (sfx) hps0Var;
                vhv0 vhv0Var = sfxVar.p;
                if (!Intrinsics.d(sfxVar2.o, vhv0Var)) {
                    sfxVar2.o = vhv0Var;
                    sfxVar2.a1();
                }
                return gps0.b;
            default:
                hps0Var.getClass();
                sfxVar.o = ((sfx) hps0Var).p;
                return Boolean.FALSE;
        }
    }
}
