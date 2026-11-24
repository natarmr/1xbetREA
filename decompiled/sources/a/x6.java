package a;

import android.hardware.camera2.params.SessionConfiguration;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class x6 {
    public static /* synthetic */ SessionConfiguration e(int i, ArrayList arrayList, Executor executor, xw2 xw2Var) {
        return new SessionConfiguration(i, arrayList, executor, xw2Var);
    }

    public static /* bridge */ /* synthetic */ SessionConfiguration f(Object obj) {
        return (SessionConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout h(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
