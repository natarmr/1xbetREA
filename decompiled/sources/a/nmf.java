package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nmf implements x0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23768a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ nmf(Function1 function1, byte b) {
        this.f23768a = b;
        this.b = function1;
    }

    @Override // a.x0a0
    public final void a(String str) {
        byte b = this.f23768a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                str.getClass();
                function1.invoke(new jkf(str));
                break;
            case 1:
                str.getClass();
                function1.invoke(new t1l(str));
                break;
            case 2:
                str.getClass();
                function1.invoke(new uy00(str));
                break;
            case 3:
                str.getClass();
                function1.invoke(new iud0(str));
                break;
            case 4:
                str.getClass();
                function1.invoke(new z110(str));
                break;
            case 5:
                str.getClass();
                function1.invoke(new jwd0(str));
                break;
            case 6:
                str.getClass();
                function1.invoke(new tyt0(str));
                break;
            default:
                str.getClass();
                function1.invoke(new hxt0(str));
                break;
        }
    }
}
