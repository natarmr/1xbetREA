package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nkw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23701a;
    public final /* synthetic */ ukw b;

    public /* synthetic */ nkw(ukw ukwVar, byte b) {
        this.f23701a = b;
        this.b = ukwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23701a;
        ukw ukwVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ukwVar.B.b(th, new x2w((byte) 20));
                break;
            case 1:
                ukwVar.G(new sjw(new xdk0(rek0.b, ukwVar.r.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ukwVar.B.b(th2, new x2w((byte) 22));
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ukwVar.B.b(th3, new x2w((byte) 17));
                break;
            default:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ukwVar.B.b(th4, new x2w((byte) 18));
                break;
        }
        return Unit.f46060a;
    }
}
