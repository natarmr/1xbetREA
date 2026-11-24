package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.xplatform.uikit.components.chips.Chip;

/* JADX INFO: loaded from: classes6.dex */
public final class zac extends abc {
    public boolean k;
    public Function1 l;
    public final bna m;

    public zac(Context context) {
        super(context, null);
        this.m = new bna(this, (byte) 24);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, bqd0.w, 0, 0);
        jmu0.j(this, ktt0.m(3, context, typedArrayObtainStyledAttributes));
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, bqd0.v, 0, 0);
        this.k = typedArrayObtainStyledAttributes2.getBoolean(4, this.k);
        typedArrayObtainStyledAttributes2.recycle();
        setTag("ChipGroup");
    }

    public static final void b(zac zacVar, Chip chip, View view) {
        int iM;
        Chip chip2;
        if (zacVar.h.b && chip.isSelected() && zacVar.getSelectedChips().size() == 1) {
            return;
        }
        chip.setSelected(!chip.isSelected());
        if (!zacVar.k || (iM = pgi0.m(zacVar.getItems(), view)) == -1) {
            return;
        }
        ViewParent parent = zacVar.getParent();
        HorizontalScrollView horizontalScrollView = parent instanceof HorizontalScrollView ? (HorizontalScrollView) parent : null;
        if (horizontalScrollView == null || (chip2 = (Chip) CollectionsKt.W(iM, pgi0.t(zacVar.getItems()))) == null) {
            return;
        }
        int left = chip2.getLeft();
        int width = horizontalScrollView.getWidth() / 2;
        horizontalScrollView.post(new f58(horizontalScrollView, left < width ? 0 : (left - width) + (chip2.getWidth() / 2), chip2, (byte) 2));
    }

    private final Sequence<Chip> getItems() {
        return pgi0.h(new ihu0(this), i13.u);
    }

    public final int a(Chip chip) {
        return pgi0.t(getItems()).indexOf(chip);
    }

    public final List<Chip> getSelectedChips() {
        return pgi0.t(pgi0.h(getItems(), new e6c((byte) 6)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        view.getClass();
        super.onViewAdded(view);
        Chip chip = view instanceof Chip ? (Chip) view : null;
        if (chip != null) {
            chip.setOnSelectInternalListener(this.m);
            chip.setOnClickListener(new wg(this, chip, (byte) 8));
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        Chip chip = view instanceof Chip ? (Chip) view : null;
        if (chip != null) {
            chip.setOnSelectInternalListener(null);
        }
        super.onViewRemoved(view);
    }

    public final void setMiddleScroll(boolean z) {
        this.k = z;
    }

    public final void setOnSelectChangeListener(Function1<? super List<Chip>, Unit> function1) {
        this.l = function1;
    }
}
