package androidx.constraintlayout.widget;

import a.a3e;
import a.fqd0;
import a.jvv;
import a.k4e;
import a.lpd0;
import a.m3e;
import a.n3e;
import a.n4e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f45350a;
    public int b;
    public final Context c;
    public jvv d;
    public String e;
    public String f;
    public final HashMap g;

    public ConstraintHelper(Context context) {
        super(context);
        this.f45350a = new int[32];
        this.g = new HashMap();
        this.c = context;
        i(null);
    }

    public final void a(String str) {
        if (str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        int iH = h(strTrim);
        if (iH != 0) {
            this.g.put(Integer.valueOf(iH), strTrim);
            b(iH);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + Separators.DOUBLE_QUOTE);
        }
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.b + 1;
        int[] iArrCopyOf = this.f45350a;
        if (i2 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f45350a = iArrCopyOf;
        }
        int i3 = this.b;
        iArrCopyOf[i3] = i;
        this.b = i3 + 1;
    }

    public final void c(String str) {
        if (str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof a3e) && strTrim.equals(((a3e) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View viewM = constraintLayout.m(this.f45350a[i]);
            if (viewM != null) {
                viewM.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM.setTranslationZ(viewM.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f45350a, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final int h(String str) {
        int iG;
        HashMap map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iG = 0;
        } else {
            Object obj = (str == null || (map = constraintLayout.m) == null || !map.containsKey(str)) ? null : constraintLayout.m.get(str);
            if (obj instanceof Integer) {
                iG = ((Integer) obj).intValue();
            } else {
                iG = 0;
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = lpd0.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iG != 0) {
            return iG;
        }
        Context context = this.c;
        return context.getResources().getIdentifier(str, ParameterNames.ID, context.getPackageName());
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, fqd0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void j(m3e m3eVar, jvv jvvVar, n4e n4eVar, SparseArray sparseArray) {
        n3e n3eVar = m3eVar.e;
        int[] iArr = n3eVar.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = n3eVar.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = n3eVar.k0.split(Separators.COMMA);
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int iH = h(str2.trim());
                        if (iH != 0) {
                            iArrCopyOf[i2] = iH;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    n3eVar.j0 = iArrCopyOf;
                } else {
                    n3eVar.j0 = null;
                }
            }
        }
        jvvVar.v0 = 0;
        Arrays.fill(jvvVar.u0, (Object) null);
        if (n3eVar.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = n3eVar.j0;
            if (i >= iArr2.length) {
                return;
            }
            k4e k4eVar = (k4e) sparseArray.get(iArr2[i]);
            if (k4eVar != null) {
                jvvVar.W(k4eVar);
            }
            i++;
        }
    }

    public final void m() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof a3e) {
            ((a3e) layoutParams).p0 = this.d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.e = null;
        this.b = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.e == null) {
            b(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45350a = new int[32];
        this.g = new HashMap();
        this.c = context;
        i(attributeSet);
    }

    public void l() {
    }

    public void k(k4e k4eVar, boolean z) {
    }
}
