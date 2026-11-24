package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fau0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fau0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f9227a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9227a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 1:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 2:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 3:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 4:
                ((Function1) this.receiver).invoke(obj);
                break;
            default:
                ((Function1) this.receiver).invoke(obj);
                break;
        }
        return Unit.f46060a;
    }
}
