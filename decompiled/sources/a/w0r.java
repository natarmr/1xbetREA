package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes.dex */
public final class w0r implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.e f38364a;

    public w0r(androidx.fragment.app.e eVar) {
        this.f38364a = eVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        androidx.fragment.app.f fVarJ;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        androidx.fragment.app.e eVar = this.f38364a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, eVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iqd0.f15207a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(m1r.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentI = resourceId != -1 ? eVar.I(resourceId) : null;
                    if (fragmentI == null && string != null) {
                        fragmentI = eVar.J(string);
                    }
                    if (fragmentI == null && id != -1) {
                        fragmentI = eVar.I(id);
                    }
                    if (fragmentI == null) {
                        m1r m1rVarS = eVar.S();
                        context.getClassLoader();
                        fragmentI = m1rVarS.a(attributeValue);
                        fragmentI.p = true;
                        fragmentI.z = resourceId != 0 ? resourceId : id;
                        fragmentI.A = id;
                        fragmentI.B = string;
                        fragmentI.q = true;
                        fragmentI.v = eVar;
                        jxq jxqVar = eVar.x;
                        fragmentI.w = jxqVar;
                        Context context2 = jxqVar.b;
                        fragmentI.j1 = true;
                        if ((jxqVar == null ? null : jxqVar.f17320a) != null) {
                            fragmentI.j1 = true;
                        }
                        fVarJ = eVar.a(fragmentI);
                        if (androidx.fragment.app.e.V(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentI + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentI.q) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentI.q = true;
                        fragmentI.v = eVar;
                        jxq jxqVar2 = eVar.x;
                        fragmentI.w = jxqVar2;
                        Context context3 = jxqVar2.b;
                        fragmentI.j1 = true;
                        if ((jxqVar2 == null ? null : jxqVar2.f17320a) != null) {
                            fragmentI.j1 = true;
                        }
                        fVarJ = eVar.j(fragmentI);
                        if (androidx.fragment.app.e.V(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentI + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    j5r j5rVar = k5r.f17734a;
                    s5r s5rVar = new s5r(fragmentI, "Attempting to use <fragment> tag to add fragment " + fragmentI + " to container " + viewGroup);
                    k5r.c(s5rVar);
                    j5r j5rVarA = k5r.a(fragmentI);
                    if (j5rVarA.f15946a.contains(i5r.d) && k5r.e(j5rVarA, fragmentI.getClass(), s5r.class)) {
                        k5r.b(j5rVarA, s5rVar);
                    }
                    fragmentI.k1 = viewGroup;
                    fVarJ.k();
                    fVarJ.j();
                    View view2 = fragmentI.l1;
                    if (view2 == null) {
                        jf4.n(kng0.l("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentI.l1.getTag() == null) {
                        fragmentI.l1.setTag(string);
                    }
                    fragmentI.l1.addOnAttachStateChangeListener(new j14(this, fVarJ));
                    return fragmentI.l1;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
