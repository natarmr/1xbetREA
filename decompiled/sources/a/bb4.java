package a;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bb4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2291a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ bb4(View view, Function1 function1) {
        this.b = view;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2291a;
        Function1 function1 = this.c;
        View view = this.b;
        switch (b) {
            case 0:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                function1.invoke(Float.valueOf(view.getHeight() - k7x.z(j6zVar, true).d));
                return Unit.f46060a;
            default:
                ((lwk) obj).getClass();
                view.getClass();
                Fragment fragmentH = androidx.fragment.app.e.H(view);
                vcc.g0(fragmentH, "KEY_LANDSCAPE_VIDEO_REQUEST", new x6s(function1, (byte) 5));
                return new va4(fragmentH);
        }
    }

    public /* synthetic */ bb4(Function1 function1, View view) {
        this.c = function1;
        this.b = view;
    }
}
