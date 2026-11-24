package a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class njn0 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f23645a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public njn0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f23645a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        mjn0 mjn0Var = new mjn0(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    itt0.k("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                itt0.k("Unexpected end of document");
                return;
            }
            Menu menu2 = mjn0Var.f21904a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mqd0.p);
                        mjn0Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        mjn0Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        mjn0Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        mjn0Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        mjn0Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        mjn0Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, mqd0.q);
                        mjn0Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        mjn0Var.j = (typedArrayObtainStyledAttributes2.getInt(5, mjn0Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, mjn0Var.d) & 65535);
                        mjn0Var.k = typedArrayObtainStyledAttributes2.getText(7);
                        mjn0Var.l = typedArrayObtainStyledAttributes2.getText(8);
                        mjn0Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        mjn0Var.n = string == null ? (char) 0 : string.charAt(0);
                        mjn0Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        mjn0Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                        mjn0Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            mjn0Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            mjn0Var.r = mjn0Var.e;
                        }
                        mjn0Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        mjn0Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, mjn0Var.f);
                        mjn0Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, mjn0Var.g);
                        mjn0Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        mjn0Var.y = typedArrayObtainStyledAttributes2.getString(12);
                        mjn0Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        mjn0Var.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && mjn0Var.w == 0 && mjn0Var.x == null) {
                            mjn0Var.z = (pz30) mjn0Var.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            mjn0Var.z = null;
                        }
                        mjn0Var.A = typedArrayObtainStyledAttributes2.getText(17);
                        mjn0Var.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            mjn0Var.D = qhl.c(typedArrayObtainStyledAttributes2.getInt(19, -1), mjn0Var.D);
                        } else {
                            mjn0Var.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = jiq0.n0(resourceId, context)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            mjn0Var.C = colorStateList;
                        } else {
                            mjn0Var.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        mjn0Var.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        mjn0Var.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(mjn0Var.b, mjn0Var.i, mjn0Var.j, mjn0Var.k);
                        mjn0Var.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        mjn0Var.b = 0;
                        mjn0Var.c = 0;
                        mjn0Var.d = 0;
                        mjn0Var.e = 0;
                        mjn0Var.f = true;
                        mjn0Var.g = true;
                    } else if (name3.equals("item")) {
                        if (!mjn0Var.h) {
                            pz30 pz30Var = mjn0Var.z;
                            if (pz30Var == null || !pz30Var.b.hasSubMenu()) {
                                mjn0Var.h = true;
                                mjn0Var.b(menu2.add(mjn0Var.b, mjn0Var.i, mjn0Var.j, mjn0Var.k));
                            } else {
                                mjn0Var.h = true;
                                mjn0Var.b(menu2.addSubMenu(mjn0Var.b, mjn0Var.i, mjn0Var.j, mjn0Var.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof ox30)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof ox30) {
                    ox30 ox30Var = (ox30) menu;
                    if (!ox30Var.p) {
                        ox30Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((ox30) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((ox30) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
