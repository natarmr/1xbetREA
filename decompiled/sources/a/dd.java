package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5869a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ dd(boolean z, Function0 function0, byte b) {
        this.f5869a = b;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5869a;
        byte b2 = 1;
        Function0 function0 = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                DsButton dsButton = (DsButton) obj;
                dsButton.getClass();
                dsButton.setEnabled(z);
                dyb.O(dsButton, new y(function0, (byte) 2));
                break;
            case 1:
                DsButton dsButton2 = (DsButton) obj;
                dsButton2.getClass();
                dsButton2.setEnabled(z);
                dyb.O(dsButton2, new y(function0, b2));
                break;
            case 2:
                DsHeader dsHeader = (DsHeader) obj;
                dsHeader.getClass();
                DsButton button = dsHeader.getButton();
                if (button != null) {
                    button.setVisibility(z ? 0 : 8);
                }
                DsButton button2 = dsHeader.getButton();
                if (button2 != null) {
                    button2.setOnClickListener(new c0(function0, (byte) 5));
                }
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                if (z) {
                    if (iIntValue == 1) {
                        function0.invoke();
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
