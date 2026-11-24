package a;

import android.view.View;
import org.xplatform.uikit.components.chips.DsChip;

/* JADX INFO: loaded from: classes4.dex */
public final class xcu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsChip f40666a;
    public final DsChip b;

    public xcu0(DsChip dsChip, DsChip dsChip2) {
        this.f40666a = dsChip;
        this.b = dsChip2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40666a;
    }
}
