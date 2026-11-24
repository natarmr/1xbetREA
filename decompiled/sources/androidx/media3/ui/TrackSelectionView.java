package androidx.media3.ui;

import a.ccs0;
import a.lcs0;
import a.pcs0;
import a.psc;
import a.qds0;
import a.tcs0;
import a.wh;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45394a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final wh e;
    public final ArrayList f;
    public final HashMap g;
    public boolean h;
    public boolean i;
    public lcs0 j;
    public CheckedTextView[][] k;
    public boolean l;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f45394a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.b = layoutInflaterFrom;
        wh whVar = new wh(this, (byte) 6);
        this.e = whVar;
        this.j = new psc(getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(org.xbet.client1.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(whVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(org.xbet.client1.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(org.xbet.client1.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(whVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.c.setChecked(this.l);
        boolean z = this.l;
        HashMap map = this.g;
        this.d.setChecked(!z && map.isEmpty());
        for (int i = 0; i < this.k.length; i++) {
            pcs0 pcs0Var = (pcs0) map.get(((qds0) this.f.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (pcs0Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.k[i][i2].setChecked(pcs0Var.b.contains(Integer.valueOf(((tcs0) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.d;
        CheckedTextView checkedTextView2 = this.c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.k = new CheckedTextView[arrayList.size()][];
        boolean z = this.i && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            qds0 qds0Var = (qds0) arrayList.get(i);
            boolean z2 = this.h && qds0Var.c;
            CheckedTextView[][] checkedTextViewArr = this.k;
            int i2 = qds0Var.f28550a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            tcs0[] tcs0VarArr = new tcs0[i2];
            for (int i3 = 0; i3 < qds0Var.f28550a; i3++) {
                tcs0VarArr[i3] = new tcs0(qds0Var, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.b;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(org.xbet.client1.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f45394a);
                lcs0 lcs0Var = this.j;
                tcs0 tcs0Var = tcs0VarArr[i4];
                checkedTextView3.setText(((psc) lcs0Var).i(tcs0Var.f33734a.b.d[tcs0Var.b]));
                checkedTextView3.setTag(tcs0VarArr[i4]);
                if (qds0Var.a(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.k[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map<ccs0, pcs0> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.h != z) {
            this.h = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z) {
                HashMap map = this.g;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        pcs0 pcs0Var = (pcs0) map.get(((qds0) arrayList.get(i)).b);
                        if (pcs0Var != null && map2.isEmpty()) {
                            map2.put(pcs0Var.f26775a, pcs0Var);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(lcs0 lcs0Var) {
        lcs0Var.getClass();
        this.j = lcs0Var;
        b();
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
