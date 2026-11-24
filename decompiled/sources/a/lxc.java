package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lxc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20807a;
    public final /* synthetic */ qxc b;

    public /* synthetic */ lxc(qxc qxcVar, byte b) {
        this.f20807a = b;
        this.b = qxcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20807a;
        qxc qxcVar = this.b;
        switch (b) {
            case 0:
                qxcVar.x();
                return Unit.f46060a;
            default:
                return qxcVar.i.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0));
        }
    }
}
