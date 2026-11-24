package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wn90 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39436a;
    public final /* synthetic */ ao90 b;

    public /* synthetic */ wn90(ao90 ao90Var, byte b) {
        this.f39436a = b;
        this.b = ao90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39436a;
        ao90 ao90Var = this.b;
        switch (b) {
            case 0:
                xi70 xi70Var = ao90.o2;
                ComponentCallbacks2 application = ao90Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ap90.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ap90)) {
                        ze3Var = null;
                    }
                    ap90 ap90Var = (ap90) ze3Var;
                    if (ap90Var != null) {
                        khf0 khf0Var = ao90Var.m2;
                        iiy[] iiyVarArr = ao90.p2;
                        return ap90Var.a((PickerParams) khf0Var.n(ao90Var, iiyVarArr[0]), (AnalyticsEntryPoint) ao90Var.n2.n(ao90Var, iiyVarArr[1]));
                    }
                }
                jf4.n(b1j.i(ap90.class, "Cannot create dependency "));
                return null;
            case 1:
                return new q0h0((rni) ((sni) ao90Var.k2.getValue()).n.get());
            case 2:
                xi70 xi70Var2 = ao90.o2;
                ao90Var.P0().x(bo90.f2923a);
                return Unit.f46060a;
            default:
                xi70 xi70Var3 = ao90.o2;
                ao90Var.P0().x(co90.f4689a);
                return Unit.f46060a;
        }
    }
}
