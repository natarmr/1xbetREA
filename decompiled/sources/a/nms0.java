package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class nms0 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final gx3 c = new gx3(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23787a;

    public nms0(Context context) {
        this.f23787a = context;
    }

    public final Object a(AttributeSet attributeSet, Class cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            gx3 gx3Var = c;
            synchronized (gx3Var) {
                try {
                    Constructor constructor = (Constructor) gx3Var.get(attributeValue);
                    if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f23787a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = clsAsSubclass.getConstructor(b);
                        constructor.setAccessible(true);
                        gx3Var.put(attributeValue, constructor);
                    }
                    objNewInstance = constructor.newInstance(this.f23787a, attributeSet);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0307  */
    /* JADX WARN: Code duplicated, block: B:152:0x030d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0312  */
    /* JADX WARN: Code duplicated, block: B:155:0x0318 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x031b A[SYNTHETIC] */
    public final gms0 b(XmlPullParser xmlPullParser, AttributeSet attributeSet, gms0 gms0Var) throws XmlPullParserException, IOException {
        gms0 gms0Var2;
        int depth = xmlPullParser.getDepth();
        gms0 gms0Var3 = null;
        bns0 bns0Var = gms0Var instanceof bns0 ? (bns0) gms0Var : null;
        gms0 bns0Var2 = null;
        while (true) {
            int next = xmlPullParser.next();
            int i = 3;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            if (next == 1) {
                break;
            }
            int i2 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                boolean zEquals = "fade".equals(name);
                Context context = this.f23787a;
                if (zEquals) {
                    ewo ewoVar = new ewo(context, attributeSet);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x4d0.j);
                    ewoVar.Y(zsm0.p(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, ewoVar.j1));
                    typedArrayObtainStyledAttributes.recycle();
                    bns0Var2 = ewoVar;
                } else if ("changeBounds".equals(name)) {
                    zob zobVar = new zob(context, attributeSet);
                    zobVar.j1 = false;
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, x4d0.h);
                    boolean z = zsm0.r((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes2.getBoolean(0, false) : false;
                    typedArrayObtainStyledAttributes2.recycle();
                    zobVar.j1 = z;
                    bns0Var2 = zobVar;
                } else if ("slide".equals(name)) {
                    d8k0 d8k0Var = new d8k0(context, attributeSet);
                    b8k0 b8k0Var = d8k0.t1;
                    d8k0Var.l1 = b8k0Var;
                    TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, x4d0.l);
                    int iP = zsm0.p(typedArrayObtainStyledAttributes3, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iP == 3) {
                        d8k0Var.l1 = d8k0.o1;
                    } else if (iP == 5) {
                        d8k0Var.l1 = d8k0.r1;
                    } else if (iP == 48) {
                        d8k0Var.l1 = d8k0.q1;
                    } else if (iP == 80) {
                        d8k0Var.l1 = b8k0Var;
                    } else if (iP == 8388611) {
                        d8k0Var.l1 = d8k0.p1;
                    } else {
                        if (iP != 8388613) {
                            jf4.o("Invalid slide direction");
                            return gms0Var3;
                        }
                        d8k0Var.l1 = d8k0.s1;
                    }
                    otj0 otj0Var = new otj0();
                    otj0Var.s = iP;
                    d8k0Var.A = otj0Var;
                    bns0Var2 = d8k0Var;
                } else if ("explode".equals(name)) {
                    woo wooVar = new woo(context, attributeSet);
                    wooVar.l1 = new int[2];
                    wooVar.A = new ekc();
                    bns0Var2 = wooVar;
                } else if ("changeImageTransform".equals(name)) {
                    bns0Var2 = new gpb(context, attributeSet);
                } else if ("changeTransform".equals(name)) {
                    nsb nsbVar = new nsb(context, attributeSet);
                    nsbVar.j1 = true;
                    nsbVar.k1 = true;
                    nsbVar.l1 = new Matrix();
                    TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, x4d0.k);
                    XmlPullParser xmlPullParser2 = (XmlPullParser) attributeSet;
                    nsbVar.j1 = !zsm0.r(xmlPullParser2, "reparentWithOverlay") ? true : typedArrayObtainStyledAttributes4.getBoolean(1, true);
                    nsbVar.k1 = zsm0.r(xmlPullParser2, "reparent") ? typedArrayObtainStyledAttributes4.getBoolean(0, true) : true;
                    typedArrayObtainStyledAttributes4.recycle();
                    bns0Var2 = nsbVar;
                } else if ("changeClipBounds".equals(name)) {
                    bns0Var2 = new bpb(context, attributeSet);
                } else if ("autoTransition".equals(name)) {
                    j15 j15Var = new j15(context, attributeSet);
                    j15Var.W();
                    bns0Var2 = j15Var;
                } else if ("changeScroll".equals(name)) {
                    bns0Var2 = new hsb(context, attributeSet);
                } else if ("transitionSet".equals(name)) {
                    bns0Var2 = new bns0(context, attributeSet);
                } else {
                    if ("transition".equals(name)) {
                        bns0Var2 = (gms0) a(attributeSet, gms0.class, "transition");
                    } else {
                        gms0Var2 = gms0Var3;
                        if ("targets".equals(name)) {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if ((next2 == i && xmlPullParser.getDepth() <= depth2) || next2 == 1) {
                                    break;
                                }
                                if (next2 != i2) {
                                    i = 3;
                                } else {
                                    if (!xmlPullParser.getName().equals("target")) {
                                        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                                    }
                                    TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(attributeSet, x4d0.f);
                                    int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "targetId") != null ? typedArrayObtainStyledAttributes5.getResourceId(1, 0) : 0;
                                    if (resourceId != 0) {
                                        gms0Var.b(resourceId);
                                    } else {
                                        int resourceId2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "excludeId") != null ? typedArrayObtainStyledAttributes5.getResourceId(i2, 0) : 0;
                                        if (resourceId2 != 0) {
                                            gms0Var.s(resourceId2);
                                        } else {
                                            String strQ = zsm0.q(typedArrayObtainStyledAttributes5, xmlPullParser, "targetName", 4);
                                            if (strQ != null) {
                                                gms0Var.d(strQ);
                                            } else {
                                                String strQ2 = zsm0.q(typedArrayObtainStyledAttributes5, xmlPullParser, "excludeName", 5);
                                                if (strQ2 != null) {
                                                    gms0Var.u(strQ2);
                                                } else {
                                                    String strQ3 = zsm0.q(typedArrayObtainStyledAttributes5, xmlPullParser, "excludeClass", 3);
                                                    if (strQ3 != null) {
                                                        try {
                                                            gms0Var.t(Class.forName(strQ3));
                                                        } catch (ClassNotFoundException e) {
                                                            typedArrayObtainStyledAttributes5.recycle();
                                                            e9d0.m(kng0.k("Could not create ", strQ3), e);
                                                            return gms0Var2;
                                                        }
                                                    } else {
                                                        String strQ4 = zsm0.q(typedArrayObtainStyledAttributes5, xmlPullParser, "targetClass", 0);
                                                        if (strQ4 != null) {
                                                            gms0Var.c(Class.forName(strQ4));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    typedArrayObtainStyledAttributes5.recycle();
                                    i = 3;
                                    i2 = 2;
                                }
                            }
                        } else if ("arcMotion".equals(name)) {
                            if (gms0Var == null) {
                                itt0.k("Invalid use of arcMotion element");
                                return gms0Var2;
                            }
                            cw3 cw3Var = new cw3();
                            cw3Var.f5061a = 0.0f;
                            cw3Var.b = 0.0f;
                            cw3Var.c = cw3.d;
                            TypedArray typedArrayObtainStyledAttributes6 = context.obtainStyledAttributes(attributeSet, x4d0.n);
                            XmlPullParser xmlPullParser3 = (XmlPullParser) attributeSet;
                            cw3Var.b = cw3.b(!zsm0.r(xmlPullParser3, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes6.getFloat(1, 0.0f));
                            cw3Var.f5061a = cw3.b(xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "minimumHorizontalAngle") != null ? typedArrayObtainStyledAttributes6.getFloat(0, 0.0f) : 0.0f);
                            cw3Var.c = cw3.b(xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "maximumAngle") != null ? typedArrayObtainStyledAttributes6.getFloat(2, 70.0f) : 70.0f);
                            typedArrayObtainStyledAttributes6.recycle();
                            gms0Var.P(cw3Var);
                        } else if ("pathMotion".equals(name)) {
                            if (gms0Var == null) {
                                itt0.k("Invalid use of pathMotion element");
                                return gms0Var2;
                            }
                            gms0Var.P((f290) a(attributeSet, f290.class, "pathMotion"));
                        } else {
                            if (!"patternPathMotion".equals(name)) {
                                throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                            }
                            if (gms0Var == null) {
                                itt0.k("Invalid use of patternPathMotion element");
                                return gms0Var2;
                            }
                            gms0Var.P(new c390(context, attributeSet));
                        }
                    }
                    if (bns0Var2 != null) {
                        if (!xmlPullParser.isEmptyElementTag()) {
                            b(xmlPullParser, attributeSet, bns0Var2);
                        }
                        if (bns0Var != null) {
                            bns0Var.U(bns0Var2);
                            bns0Var2 = gms0Var2;
                        } else if (gms0Var != null) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                    gms0Var3 = gms0Var2;
                }
                gms0Var2 = gms0Var3;
                if (bns0Var2 != null) {
                    if (!xmlPullParser.isEmptyElementTag()) {
                        b(xmlPullParser, attributeSet, bns0Var2);
                    }
                    if (bns0Var != null) {
                        bns0Var.U(bns0Var2);
                        bns0Var2 = gms0Var2;
                    } else if (gms0Var != null) {
                        throw new InflateException("Could not add transition to another transition.");
                    }
                }
                gms0Var3 = gms0Var2;
            }
        }
        return bns0Var2;
    }
}
