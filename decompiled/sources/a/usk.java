package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class usk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36216a;
    public final /* synthetic */ atk b;

    public /* synthetic */ usk(atk atkVar, byte b) {
        this.f36216a = b;
        this.b = atkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36216a;
        atk atkVar = this.b;
        switch (b) {
            case 0:
                atkVar.G(new isk(new xdk0(rek0.b, atkVar.s.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                atkVar.t.b(th, new svj((byte) 22));
                break;
        }
        return Unit.f46060a;
    }
}
