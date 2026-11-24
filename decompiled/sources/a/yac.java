package a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class yac implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f42287a;
    public final /* synthetic */ abc b;

    public yac(abc abcVar) {
        this.b = abcVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        abc abcVar = this.b;
        if (view == abcVar && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            m9c m9cVar = abcVar.h;
            Chip chip = (Chip) view2;
            ((HashMap) m9cVar.c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                m9cVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new ok50(m9cVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f42287a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        abc abcVar = this.b;
        if (view == abcVar && (view2 instanceof Chip)) {
            m9c m9cVar = abcVar.h;
            Chip chip = (Chip) view2;
            m9cVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) m9cVar.c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) m9cVar.d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f42287a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
