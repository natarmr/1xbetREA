package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.javax.sip.message.Response;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class wt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f39722a;
    public final h8m0 b;
    public vt40 c;
    public final ArrayList d;
    public final vt40 e;
    public final ArrayList f;
    public final SparseArray g;
    public final HashMap h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public h03 o;
    public boolean p;
    public final vkr0 q;
    public float r;
    public float s;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public wt40(Context context, MotionLayout motionLayout, int i) {
        this.b = null;
        this.c = null;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList();
        this.g = new SparseArray();
        this.h = new HashMap();
        this.i = new SparseIntArray();
        this.j = Response.BAD_REQUEST;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.f39722a = motionLayout;
        this.q = new vkr0(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            vt40 vt40Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                h(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                iky ikyVar = new iky(context, xml);
                                if (vt40Var != null) {
                                    vt40Var.k.add(ikyVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                j(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                vlu0 vlu0Var = new vlu0(context, xml);
                                vkr0 vkr0Var = this.q;
                                ((ArrayList) vkr0Var.c).add(vlu0Var);
                                vkr0Var.d = null;
                                int i2 = vlu0Var.b;
                                if (i2 == 4) {
                                    vkr0.u(vlu0Var);
                                } else if (i2 == 5) {
                                    vkr0.u(vlu0Var);
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                vt40Var = new vt40(this, context, xml);
                                boolean z = vt40Var.b;
                                arrayList.add(vt40Var);
                                if (this.c == null && !z) {
                                    this.c = vt40Var;
                                    fwr0 fwr0Var = vt40Var.l;
                                    if (fwr0Var != null) {
                                        fwr0Var.c(this.p);
                                    }
                                }
                                if (z) {
                                    if (vt40Var.c == -1) {
                                        this.e = vt40Var;
                                    } else {
                                        this.f.add(vt40Var);
                                    }
                                    arrayList.remove(vt40Var);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && vt40Var != null && !motionLayout.isInEditMode()) {
                                vt40Var.m.add(new ut40(context, vt40Var, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (vt40Var == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + Separators.RPAREN);
                                }
                                if (vt40Var != null) {
                                    vt40Var.l = new fwr0(context, motionLayout, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                k(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new h8m0(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                j(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.g.put(R.id.motion_base, new r3e());
        this.h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    public static int c(Context context, String str) {
        int identifier;
        if (str.contains(Separators.SLASH)) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), ParameterNames.ID, context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final boolean a(int i, MotionLayout motionLayout) {
        vt40 vt40Var;
        if (this.o != null) {
            return false;
        }
        for (vt40 vt40Var2 : this.d) {
            int i2 = vt40Var2.n;
            if (i2 != 0 && ((vt40Var = this.c) != vt40Var2 || (vt40Var.r & 2) == 0)) {
                int i3 = vt40Var2.d;
                zs40 zs40Var = zs40.d;
                zs40 zs40Var2 = zs40.c;
                zs40 zs40Var3 = zs40.b;
                if (i == i3 && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState(zs40Var);
                    motionLayout.setTransition(vt40Var2);
                    if (vt40Var2.n == 4) {
                        motionLayout.u(1.0f);
                        motionLayout.O1 = null;
                        motionLayout.setState(zs40Var3);
                        motionLayout.setState(zs40Var2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.w(true);
                    motionLayout.setState(zs40Var3);
                    motionLayout.setState(zs40Var2);
                    motionLayout.setState(zs40Var);
                    motionLayout.A();
                    return true;
                }
                if (i == vt40Var2.c && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState(zs40Var);
                    motionLayout.setTransition(vt40Var2);
                    if (vt40Var2.n == 3) {
                        motionLayout.u(0.0f);
                        motionLayout.setState(zs40Var3);
                        motionLayout.setState(zs40Var2);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.w(true);
                    motionLayout.setState(zs40Var3);
                    motionLayout.setState(zs40Var2);
                    motionLayout.setState(zs40Var);
                    motionLayout.A();
                    return true;
                }
            }
        }
        return false;
    }

    public final r3e b(int i) {
        int iC;
        h8m0 h8m0Var = this.b;
        if (h8m0Var != null && (iC = h8m0Var.c(i)) != -1) {
            i = iC;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i) != null) {
            return (r3e) sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + ozb.T(i, this.f39722a.getContext()) + " In MotionScene");
        return (r3e) sparseArray.get(sparseArray.keyAt(0));
    }

    public final Interpolator d() {
        vt40 vt40Var = this.c;
        int i = vt40Var.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f39722a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new cs40(fhn.f(vt40Var.f), (byte) 1);
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void e(ds40 ds40Var) {
        vt40 vt40Var = this.c;
        if (vt40Var != null) {
            Iterator it = vt40Var.k.iterator();
            while (it.hasNext()) {
                ((iky) it.next()).a(ds40Var);
            }
        } else {
            vt40 vt40Var2 = this.e;
            if (vt40Var2 != null) {
                Iterator it2 = vt40Var2.k.iterator();
                while (it2.hasNext()) {
                    ((iky) it2.next()).a(ds40Var);
                }
            }
        }
    }

    public final float f() {
        fwr0 fwr0Var;
        vt40 vt40Var = this.c;
        if (vt40Var == null || (fwr0Var = vt40Var.l) == null) {
            return 0.0f;
        }
        return fwr0Var.t;
    }

    public final int g() {
        vt40 vt40Var = this.c;
        if (vt40Var == null) {
            return -1;
        }
        return vt40Var.d;
    }

    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        r3e r3eVar = new r3e();
        r3eVar.f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iC2 = c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        r3eVar.d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                r3eVar.d = 4;
                                break;
                            case "left":
                                r3eVar.d = 2;
                                break;
                            case "none":
                                r3eVar.d = 0;
                                break;
                            case "right":
                                r3eVar.d = 1;
                                break;
                            case "x_right":
                                r3eVar.d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iC = c(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(iC));
                    r3eVar.f29782a = ozb.T(iC, context);
                    break;
                case "stateLabels":
                    r3eVar.c = attributeValue.split(Separators.COMMA);
                    int i2 = 0;
                    while (true) {
                        String[] strArr = r3eVar.c;
                        if (i2 < strArr.length) {
                            strArr[i2] = strArr[i2].trim();
                            i2++;
                        }
                    }
                    break;
            }
        }
        if (iC != -1) {
            int i3 = this.f39722a.m1;
            r3eVar.k(context, xmlResourceParser);
            if (iC2 != -1) {
                this.i.put(iC, iC2);
            }
            this.g.put(iC, r3eVar);
        }
        return iC;
    }

    public final int i(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), fqd0.x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                i(typedArrayObtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), fqd0.n);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(int i, MotionLayout motionLayout) {
        SparseArray sparseArray = this.g;
        r3e r3eVar = (r3e) sparseArray.get(i);
        String str = r3eVar.f29782a;
        HashMap map = r3eVar.g;
        r3eVar.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            l(i2, motionLayout);
            r3e r3eVar2 = (r3e) sparseArray.get(i2);
            if (r3eVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + ozb.T(i2, this.f39722a.getContext()));
                return;
            }
            HashMap map2 = r3eVar2.g;
            r3eVar.b += Separators.SLASH + r3eVar2.b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                m3e m3eVar = (m3e) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new m3e());
                }
                m3e m3eVar2 = (m3e) map.get(num);
                if (m3eVar2 != null) {
                    n3e n3eVar = m3eVar2.e;
                    if (!n3eVar.b) {
                        n3eVar.a(m3eVar.e);
                    }
                    p3e p3eVar = m3eVar2.c;
                    if (!p3eVar.f26295a) {
                        p3e p3eVar2 = m3eVar.c;
                        p3eVar.f26295a = p3eVar2.f26295a;
                        p3eVar.b = p3eVar2.b;
                        p3eVar.d = p3eVar2.d;
                        p3eVar.e = p3eVar2.e;
                        p3eVar.c = p3eVar2.c;
                    }
                    q3e q3eVar = m3eVar2.f;
                    if (!q3eVar.f28048a) {
                        q3eVar.a(m3eVar.f);
                    }
                    o3e o3eVar = m3eVar2.d;
                    if (!o3eVar.f24579a) {
                        o3eVar.a(m3eVar.d);
                    }
                    for (String str2 : m3eVar.g.keySet()) {
                        if (!m3eVar2.g.containsKey(str2)) {
                            m3eVar2.g.put(str2, (x2e) m3eVar.g.get(str2));
                        }
                    }
                }
            }
        } else {
            r3eVar.b = axq.n(new StringBuilder(), r3eVar.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                a3e a3eVar = (a3e) childAt.getLayoutParams();
                int id = childAt.getId();
                if (r3eVar.f && id == -1) {
                    itt0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new m3e());
                }
                m3e m3eVar3 = (m3e) map.get(Integer.valueOf(id));
                if (m3eVar3 != null) {
                    p3e p3eVar3 = m3eVar3.c;
                    n3e n3eVar2 = m3eVar3.e;
                    q3e q3eVar2 = m3eVar3.f;
                    if (!n3eVar2.b) {
                        m3eVar3.c(id, a3eVar);
                        if (childAt instanceof ConstraintHelper) {
                            n3eVar2.j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                n3eVar2.o0 = barrier.getAllowsGoneWidget();
                                n3eVar2.g0 = barrier.getType();
                                n3eVar2.h0 = barrier.getMargin();
                            }
                        }
                        n3eVar2.b = true;
                    }
                    if (!p3eVar3.f26295a) {
                        p3eVar3.b = childAt.getVisibility();
                        p3eVar3.d = childAt.getAlpha();
                        p3eVar3.f26295a = true;
                    }
                    if (!q3eVar2.f28048a) {
                        q3eVar2.f28048a = true;
                        q3eVar2.b = childAt.getRotation();
                        q3eVar2.c = childAt.getRotationX();
                        q3eVar2.d = childAt.getRotationY();
                        q3eVar2.e = childAt.getScaleX();
                        q3eVar2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            q3eVar2.g = pivotX;
                            q3eVar2.h = pivotY;
                        }
                        q3eVar2.j = childAt.getTranslationX();
                        q3eVar2.k = childAt.getTranslationY();
                        q3eVar2.l = childAt.getTranslationZ();
                        if (q3eVar2.m) {
                            q3eVar2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (m3e m3eVar4 : map.values()) {
            if (m3eVar4.h != null) {
                if (m3eVar4.b == null) {
                    m3eVar4.h.e(r3eVar.i(m3eVar4.f21110a));
                } else {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        m3e m3eVarI = r3eVar.i(((Integer) it.next()).intValue());
                        String str3 = m3eVarI.e.l0;
                        if (str3 != null && m3eVar4.b.matches(str3)) {
                            m3eVar4.h.e(m3eVarI);
                            m3eVarI.g.putAll((HashMap) m3eVar4.g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void m(int i, int i2) {
        int iC;
        int iC2;
        vt40 vt40Var;
        ArrayList arrayList;
        Iterator it;
        vt40 vt40Var2;
        vt40 vt40Var3;
        vt40 vt40Var4;
        int i3;
        fwr0 fwr0Var;
        h8m0 h8m0Var = this.b;
        if (h8m0Var != null) {
            iC = h8m0Var.c(i);
            if (iC == -1) {
                iC = i;
            }
            iC2 = h8m0Var.c(i2);
            if (iC2 == -1) {
            }
            vt40Var = this.c;
            if (vt40Var == null && vt40Var.c == i2 && vt40Var.d == i) {
                return;
            }
            arrayList = this.d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    vt40Var2 = this.e;
                    for (vt40 vt40Var5 : this.f) {
                        if (vt40Var5.c == i2) {
                            vt40Var2 = vt40Var5;
                        }
                    }
                    vt40Var3 = new vt40(this, vt40Var2);
                    vt40Var3.d = iC;
                    vt40Var3.c = iC2;
                    if (iC != -1) {
                        arrayList.add(vt40Var3);
                    }
                    this.c = vt40Var3;
                    return;
                }
                vt40Var4 = (vt40) it.next();
                i3 = vt40Var4.c;
                if ((i3 != iC2 && vt40Var4.d == iC) || (i3 == i2 && vt40Var4.d == i)) {
                    break;
                }
            }
            this.c = vt40Var4;
            fwr0Var = vt40Var4.l;
            if (fwr0Var != null) {
                fwr0Var.c(this.p);
            }
        }
        iC = i;
        iC2 = i2;
        vt40Var = this.c;
        if (vt40Var == null) {
        }
        arrayList = this.d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                vt40Var2 = this.e;
                while (r9.hasNext()) {
                    if (vt40Var5.c == i2) {
                        vt40Var2 = vt40Var5;
                    }
                }
                vt40Var3 = new vt40(this, vt40Var2);
                vt40Var3.d = iC;
                vt40Var3.c = iC2;
                if (iC != -1) {
                    arrayList.add(vt40Var3);
                }
                this.c = vt40Var3;
                return;
            }
            vt40Var4 = (vt40) it.next();
            i3 = vt40Var4.c;
            if (i3 != iC2) {
            }
        }
        this.c = vt40Var4;
        fwr0Var = vt40Var4.l;
        if (fwr0Var != null) {
            fwr0Var.c(this.p);
        }
    }

    public final boolean n() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((vt40) it.next()).l != null) {
                return true;
            }
        }
        vt40 vt40Var = this.c;
        return (vt40Var == null || vt40Var.l == null) ? false : true;
    }
}
