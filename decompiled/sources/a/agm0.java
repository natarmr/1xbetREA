package a;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class agm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f831a;
    public final /* synthetic */ Window b;
    public final /* synthetic */ eme c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ agm0(Window window, eme emeVar, boolean z, byte b) {
        this.f831a = b;
        this.b = window;
        this.c = emeVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f831a;
        boolean z = this.d;
        eme emeVar = this.c;
        Window window = this.b;
        switch (b) {
            case 0:
                if (window != null) {
                    ffb0.N(window, emeVar, z);
                }
                break;
            default:
                if (window != null) {
                    ffb0.N(window, emeVar, z);
                }
                break;
        }
        return Unit.f46060a;
    }
}
