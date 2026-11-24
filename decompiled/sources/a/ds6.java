package a;

import android.view.View;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public final class ds6 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f6597a;
    public final Chip b;

    public ds6(Chip chip, Chip chip2) {
        this.f6597a = chip;
        this.b = chip2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6597a;
    }
}
