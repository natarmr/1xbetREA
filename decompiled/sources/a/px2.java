package a;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.collection.MutableIntList;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27735a;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat b;

    public /* synthetic */ px2(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, byte b) {
        this.f27735a = b;
        this.b = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27735a;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.b;
        switch (b) {
            case 0:
                View view = androidComposeViewAccessibilityDelegateCompat.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                pah0 pah0Var = (pah0) obj;
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                if (pah0Var.b.contains(pah0Var)) {
                    eg80 snapshotObserver = androidComposeViewAccessibilityDelegateCompat.d.getSnapshotObserver();
                    snapshotObserver.f7752a.d(pah0Var, androidComposeViewAccessibilityDelegateCompat.n1, new mc((Object) pah0Var, (Object) androidComposeViewAccessibilityDelegateCompat, (byte) 23));
                }
                return Unit.f46060a;
        }
    }
}
