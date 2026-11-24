package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dbr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5818a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ hdz c;

    public /* synthetic */ dbr(Function1 function1, hdz hdzVar, byte b) {
        this.f5818a = b;
        this.b = function1;
        this.c = hdzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5818a;
        final hdz hdzVar = this.c;
        final Function1 function1 = this.b;
        final DsButton dsButton = (DsButton) obj;
        switch (b) {
            case 0:
                dsButton.getClass();
                final byte b2 = 0;
                dyb.O(dsButton, new Function1() { // from class: a.ebr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b3 = b2;
                        hdz hdzVar2 = hdzVar;
                        Function1 function2 = function1;
                        DsButton dsButton2 = dsButton;
                        View view = (View) obj2;
                        switch (b3) {
                            case 0:
                                view.getClass();
                                dsButton2.setLoading(true);
                                function2.invoke(hdzVar2.d().d);
                                break;
                            default:
                                view.getClass();
                                dsButton2.setLoading(true);
                                function2.invoke(hdzVar2.d().d);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                dsButton.getClass();
                final byte b3 = 1;
                dyb.O(dsButton, new Function1() { // from class: a.ebr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b3;
                        hdz hdzVar2 = hdzVar;
                        Function1 function2 = function1;
                        DsButton dsButton2 = dsButton;
                        View view = (View) obj2;
                        switch (b4) {
                            case 0:
                                view.getClass();
                                dsButton2.setLoading(true);
                                function2.invoke(hdzVar2.d().d);
                                break;
                            default:
                                view.getClass();
                                dsButton2.setLoading(true);
                                function2.invoke(hdzVar2.d().d);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }
}
