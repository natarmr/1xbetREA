package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44834a;
    public final /* synthetic */ View b;

    public /* synthetic */ zr10(View view, int i, byte b) {
        this.f44834a = b;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44834a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                c3x.a(this.b, fetVar, x8x.L(1));
                break;
            default:
                k7x.i(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
