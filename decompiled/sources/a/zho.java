package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zho implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44404a;
    public final /* synthetic */ cio b;

    public /* synthetic */ zho(cio cioVar, byte b) {
        this.f44404a = b;
        this.b = cioVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44404a;
        cio cioVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                ddk ddkVar = cio.P1;
                uidVar.getClass();
                cioVar.H0().x(new sf2(uidVar));
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                ddk ddkVar2 = cio.P1;
                cioVar.H0().x(new bg2(iIntValue));
                break;
            default:
                String str = (String) obj;
                ddk ddkVar3 = cio.P1;
                str.getClass();
                cioVar.H0().x(new dg2(str));
                break;
        }
        return Unit.f46060a;
    }
}
