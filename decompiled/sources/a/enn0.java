package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class enn0 implements PointerInputEventHandler, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f8104a;

    public enn0(Function2 function2) {
        this.f8104a = function2;
    }

    @Override // a.fer
    public final wdr b() {
        return this.f8104a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof fer)) {
            return false;
        }
        return Intrinsics.d(this.f8104a, ((fer) obj).b());
    }

    public final int hashCode() {
        return this.f8104a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(hpa0 hpa0Var, yje yjeVar) {
        return this.f8104a.invoke(hpa0Var, yjeVar);
    }
}
