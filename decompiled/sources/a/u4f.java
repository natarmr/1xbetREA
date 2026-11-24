package a;

import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u4f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35044a;
    public final /* synthetic */ r7f b;

    public /* synthetic */ u4f(r7f r7fVar, byte b) {
        this.f35044a = b;
        this.b = r7fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35044a) {
            case 0:
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                this.b.R(new a4f(str, "", rek0.b));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                r7f r7fVar = this.b;
                mne mneVar = r7fVar.Y0;
                yje yjeVar = null;
                if (th instanceof UnknownHostException) {
                    if (Intrinsics.d(r7fVar.Z1.getValue(), aje.f970a)) {
                        sac.V(jiu0.a(r7fVar), l7f.f19554a, null, mneVar.b, new a6f(r7fVar, yjeVar, (byte) 7), 10);
                    }
                } else if (!(th instanceof j7t0)) {
                    if (th instanceof zhi0) {
                        kuw kuwVar = ((zhi0) th).c;
                        if (kuwVar == i2o.BetSumExceeded) {
                            ((ave) r7fVar.m1.f34374a.c).g = 0.0d;
                        } else if (kuwVar == i2o.OpponentNotFound) {
                            sac.V(jiu0.a(r7fVar), new z6e(1, r7fVar, r7f.class, "showSnackBarError", "showSnackBarError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, mneVar.b, new d5f(r7fVar, yjeVar, (byte) 5), 10);
                        }
                        r7fVar.f0(th);
                    } else {
                        r7fVar.f0(th);
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
