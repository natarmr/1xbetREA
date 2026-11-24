package a;

import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wcj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38926a;
    public final /* synthetic */ SimpleDate b;

    public /* synthetic */ wcj(SimpleDate simpleDate, byte b) {
        this.f38926a = b;
        this.b = simpleDate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38926a;
        SimpleDate simpleDate = this.b;
        switch (b) {
            case 0:
                return androidx.compose.runtime.e.b(simpleDate.c);
            default:
                return androidx.compose.runtime.e.e(simpleDate);
        }
    }
}
