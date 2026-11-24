package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"La/nx2;", "La/um40;", "La/ix2;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nx2 extends um40 {
    public final /* synthetic */ AndroidComposeView b;

    public nx2(AndroidComposeView androidComposeView) {
        this.b = androidComposeView;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // a.um40
    public final lm40 f() {
        return new ix2(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
