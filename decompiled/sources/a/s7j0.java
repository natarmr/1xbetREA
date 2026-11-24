package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class s7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31752a;

    public s7j0(String str) {
        str.getClass();
        this.f31752a = str;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_glyph_notification_active;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7j0) && Intrinsics.d(this.f31752a, ((s7j0) obj).f31752a);
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return false;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return false;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f31752a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_notification_active, this.f31752a.hashCode() * 31, 961), 31, true), 31, true), 31, false);
    }

    @Override // a.b8j0
    public final boolean i() {
        return true;
    }

    @Override // a.b8j0
    public final boolean k() {
        return true;
    }

    @Override // a.b8j0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_glyph_notification_active, "PushNotificationsUiModel(title=", this.f31752a, ", image=", ", endText=, enable=true, clickable=true, first=false, last=false)");
    }
}
