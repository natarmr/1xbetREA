package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class whb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39159a;
    public final /* synthetic */ bib b;

    public /* synthetic */ whb(bib bibVar, byte b) {
        this.f39159a = b;
        this.b = bibVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        siq fixedWebView;
        byte b = this.f39159a;
        Integer numValueOf = null;
        bib bibVar = this.b;
        switch (b) {
            case 0:
                bj5 bj5Var = bib.X1;
                fiu0 fiu0Var = bibVar.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                FixedWebView fixedWebView2 = bibVar.O1;
                if (fixedWebView2 != null && (fixedWebView = fixedWebView2.getFixedWebView()) != null) {
                    numValueOf = Integer.valueOf(fixedWebView.getScrollY());
                }
                bibVar.Q1 = numValueOf;
                return Unit.f46060a;
            default:
                bj5 bj5Var2 = bib.X1;
                bibVar.J0().x(lhb.f20046a);
                return Unit.f46060a;
        }
    }
}
