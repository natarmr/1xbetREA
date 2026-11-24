package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.util.Log;
import android.util.Xml;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class vlu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37646a;
    public int e;
    public final iky f;
    public final m3e g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* JADX WARN: Code duplicated, block: B:36:0x0097 A[Catch: IOException -> 0x0043, XmlPullParserException -> 0x0046, TryCatch #2 {IOException -> 0x0043, XmlPullParserException -> 0x0046, blocks: (B:3:0x0028, B:37:0x00ca, B:11:0x0037, B:18:0x0049, B:19:0x0051, B:36:0x0097, B:21:0x0055, B:26:0x0066, B:24:0x005e, B:27:0x006e, B:29:0x0074, B:30:0x0078, B:32:0x0080, B:33:0x0088, B:35:0x0090), top: B:42:0x0028 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0097, please report this as an issue */
    public vlu0(Context context, XmlResourceParser xmlResourceParser) {
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                Log.e("ViewTransition", ozb.R() + " unknown tag " + name);
                                StringBuilder sb = new StringBuilder();
                                sb.append(".xml:");
                                sb.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb.toString());
                            } else {
                                this.g = r3e.d(context, xmlResourceParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                Log.e("ViewTransition", ozb.R() + " unknown tag " + name);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(".xml:");
                                sb2.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb2.toString());
                            } else {
                                this.f = new iky(context, xmlResourceParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                Log.e("ViewTransition", ozb.R() + " unknown tag " + name);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(".xml:");
                                sb3.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb3.toString());
                            } else {
                                d(context, xmlResourceParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                Log.e("ViewTransition", ozb.R() + " unknown tag " + name);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(".xml:");
                                sb4.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb4.toString());
                            } else {
                                x2e.d(context, xmlResourceParser, this.g.g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                Log.e("ViewTransition", ozb.R() + " unknown tag " + name);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(".xml:");
                                sb5.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb5.toString());
                            } else {
                                x2e.d(context, xmlResourceParser, this.g.g);
                            }
                            break;
                        default:
                            Log.e("ViewTransition", ozb.R() + " unknown tag " + name);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(".xml:");
                            sb6.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb6.toString());
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    public final void a(vkr0 vkr0Var, MotionLayout motionLayout, int i, r3e r3eVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        iky ikyVar = this.f;
        int i3 = 0;
        if (i2 != 2) {
            m3e m3eVar = this.g;
            if (i2 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                int i4 = 0;
                while (i4 < constraintSetIds.length) {
                    int i5 = constraintSetIds[i4];
                    if (i5 != i) {
                        wt40 wt40Var = motionLayout.q;
                        r3e r3eVarB = wt40Var == null ? null : wt40Var.b(i5);
                        int length = viewArr.length;
                        for (int i6 = i3; i6 < length; i6++) {
                            m3e m3eVarI = r3eVarB.i(viewArr[i6].getId());
                            if (m3eVar != null) {
                                l3e l3eVar = m3eVar.h;
                                if (l3eVar != null) {
                                    l3eVar.e(m3eVarI);
                                }
                                m3eVarI.g.putAll(m3eVar.g);
                            }
                        }
                    }
                    i4++;
                    i3 = 0;
                }
            }
            r3e r3eVar2 = new r3e();
            HashMap map = r3eVar2.g;
            map.clear();
            for (Integer num : r3eVar.g.keySet()) {
                m3e m3eVar2 = (m3e) r3eVar.g.get(num);
                if (m3eVar2 != null) {
                    map.put(num, m3eVar2.clone());
                }
            }
            for (View view : viewArr) {
                m3e m3eVarI2 = r3eVar2.i(view.getId());
                if (m3eVar != null) {
                    l3e l3eVar2 = m3eVar.h;
                    if (l3eVar2 != null) {
                        l3eVar2.e(m3eVarI2);
                    }
                    m3eVarI2.g.putAll(m3eVar.g);
                }
            }
            motionLayout.H(i, r3eVar2);
            motionLayout.H(R.id.view_transition, r3eVar);
            motionLayout.C(R.id.view_transition);
            vt40 vt40Var = new vt40(motionLayout.q, i);
            for (View view2 : viewArr) {
                int i7 = this.h;
                if (i7 != -1) {
                    vt40Var.h = Math.max(i7, 8);
                }
                vt40Var.p = this.d;
                int i8 = this.l;
                String str = this.m;
                int i9 = this.n;
                vt40Var.e = i8;
                vt40Var.f = str;
                vt40Var.g = i9;
                int id = view2.getId();
                if (ikyVar != null) {
                    ArrayList arrayList = (ArrayList) ikyVar.f14951a.get(-1);
                    iky ikyVar2 = new iky();
                    ikyVar2.f14951a = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        rjy rjyVarB = ((rjy) it.next()).clone();
                        rjyVarB.b = id;
                        ikyVar2.b(rjyVarB);
                    }
                    vt40Var.k.add(ikyVar2);
                }
            }
            motionLayout.setTransition(vt40Var);
            qaq0 qaq0Var = new qaq0(this, viewArr, (byte) 18);
            motionLayout.u(1.0f);
            motionLayout.O1 = qaq0Var;
            return;
        }
        View view3 = viewArr[0];
        ds40 ds40Var = new ds40(view3);
        pt40 pt40Var = ds40Var.f;
        pt40Var.c = 0.0f;
        pt40Var.d = 0.0f;
        ds40Var.H = true;
        pt40Var.d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        ds40Var.g.d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        int visibility = view3.getVisibility();
        as40 as40Var = ds40Var.h;
        as40Var.c = visibility;
        as40Var.e = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
        as40Var.f = view3.getElevation();
        as40Var.g = view3.getRotation();
        as40Var.h = view3.getRotationX();
        as40Var.f1376a = view3.getRotationY();
        as40Var.i = view3.getScaleX();
        as40Var.j = view3.getScaleY();
        as40Var.k = view3.getPivotX();
        as40Var.l = view3.getPivotY();
        as40Var.m = view3.getTranslationX();
        as40Var.n = view3.getTranslationY();
        as40Var.o = view3.getTranslationZ();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        int visibility2 = view3.getVisibility();
        as40 as40Var2 = ds40Var.i;
        as40Var2.c = visibility2;
        as40Var2.e = view3.getVisibility() == 0 ? view3.getAlpha() : 0.0f;
        as40Var2.f = view3.getElevation();
        as40Var2.g = view3.getRotation();
        as40Var2.h = view3.getRotationX();
        as40Var2.f1376a = view3.getRotationY();
        as40Var2.i = view3.getScaleX();
        as40Var2.j = view3.getScaleY();
        as40Var2.k = view3.getPivotX();
        as40Var2.l = view3.getPivotY();
        as40Var2.m = view3.getTranslationX();
        as40Var2.n = view3.getTranslationY();
        as40Var2.o = view3.getTranslationZ();
        ArrayList arrayList2 = (ArrayList) ikyVar.f14951a.get(-1);
        if (arrayList2 != null) {
            ds40Var.w.addAll(arrayList2);
        }
        ds40Var.g(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
        int i10 = this.h;
        int i11 = this.i;
        int i12 = this.b;
        Context context = motionLayout.getContext();
        int i13 = this.l;
        if (i13 == -2) {
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
        } else if (i13 == -1) {
            interpolatorLoadInterpolator = new cs40(fhn.f(this.m), (byte) 2);
        } else if (i13 == 0) {
            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i13 == 1) {
            interpolatorLoadInterpolator = new AccelerateInterpolator();
        } else if (i13 == 2) {
            interpolatorLoadInterpolator = new DecelerateInterpolator();
        } else if (i13 == 4) {
            interpolatorLoadInterpolator = new BounceInterpolator();
        } else {
            if (i13 != 5) {
                if (i13 != 6) {
                    interpolator = null;
                } else {
                    interpolatorLoadInterpolator = new AnticipateInterpolator();
                }
                new ulu0(vkr0Var, ds40Var, i10, i11, i12, interpolator, this.p, this.q);
            }
            interpolatorLoadInterpolator = new OvershootInterpolator();
        }
        interpolator = interpolatorLoadInterpolator;
        new ulu0(vkr0Var, ds40Var, i10, i11, i12, interpolator, this.p, this.q);
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof a3e) && (str = ((a3e) view.getLayoutParams()).Y) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), fqd0.w);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f37646a = typedArrayObtainStyledAttributes.getResourceId(index, this.f37646a);
            } else if (index == 8) {
                if (MotionLayout.Y1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf(Separators.SLASH) <= 0) {
                        this.l = -1;
                    } else {
                        this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + ozb.T(this.f37646a, this.o) + Separators.RPAREN;
    }
}
