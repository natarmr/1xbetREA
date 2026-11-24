package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13972a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ long c;

    public /* synthetic */ i11(byte b, long j, Function1 function1) {
        this.f13972a = b;
        this.b = function1;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13972a;
        long j = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new s01(j));
                break;
            case 1:
                function1.invoke(new s01(j));
                break;
            case 2:
                function1.invoke(new s01(j));
                break;
            case 3:
                function1.invoke(new s01(j));
                break;
            case 4:
                function1.invoke(new kxq0(new ak0(j)));
                break;
            case 5:
                function1.invoke(new kxq0(new ak0(j)));
                break;
            case 6:
                function1.invoke(new gkb0(j));
                break;
            case 7:
                function1.invoke(new o3j(j));
                break;
            case 8:
                function1.invoke(new w3j(j));
                break;
            case 9:
                function1.invoke(new rdm(j));
                break;
            case 10:
                function1.invoke(new rdm(j));
                break;
            default:
                function1.invoke(new wya0(j));
                break;
        }
        return Unit.f46060a;
    }
}
