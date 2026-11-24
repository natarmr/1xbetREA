package a;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qev0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28602a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ qev0(Bundle bundle, byte b) {
        this.f28602a = b;
        this.b = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        byte b = this.f28602a;
        Bundle bundle = this.b;
        switch (b) {
            case 0:
                i = bundle.getInt("appWidgetMinWidth", 0);
                break;
            default:
                i = bundle.getInt("appWidgetMaxHeight", 0);
                break;
        }
        return Integer.valueOf(i);
    }
}
