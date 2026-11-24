package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class vt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37985a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public final float i;
    public final wt40 j;
    public final ArrayList k;
    public fwr0 l;
    public final ArrayList m;
    public final int n;
    public final boolean o;
    public int p;
    public final int q;
    public final int r;

    public vt40(wt40 wt40Var, Context context, XmlResourceParser xmlResourceParser) {
        this.f37985a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = Response.BAD_REQUEST;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.r = 0;
        int i = wt40Var.j;
        SparseArray sparseArray = wt40Var.g;
        this.h = i;
        this.q = wt40Var.k;
        this.j = wt40Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), fqd0.u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 2) {
                this.c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    r3e r3eVar = new r3e();
                    r3eVar.j(this.c, context);
                    sparseArray.append(this.c, r3eVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.c = wt40Var.i(this.c, context);
                }
            } else if (index == 3) {
                this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                if ("layout".equals(resourceTypeName2)) {
                    r3e r3eVar2 = new r3e();
                    r3eVar2.j(this.d, context);
                    sparseArray.append(this.d, r3eVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.d = wt40Var.i(this.d, context);
                }
            } else if (index == 6) {
                int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.g = resourceId;
                    if (resourceId != -1) {
                        this.e = -2;
                    }
                } else if (i3 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string;
                    if (string != null) {
                        if (string.indexOf(Separators.SLASH) > 0) {
                            this.g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.e = -2;
                        } else {
                            this.e = -1;
                        }
                    }
                } else {
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                }
            } else if (index == 4) {
                int i4 = typedArrayObtainStyledAttributes.getInt(index, this.h);
                this.h = i4;
                if (i4 < 8) {
                    this.h = 8;
                }
            } else if (index == 8) {
                this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
            } else if (index == 1) {
                this.n = typedArrayObtainStyledAttributes.getInteger(index, this.n);
            } else if (index == 0) {
                this.f37985a = typedArrayObtainStyledAttributes.getResourceId(index, this.f37985a);
            } else if (index == 9) {
                this.o = typedArrayObtainStyledAttributes.getBoolean(index, this.o);
            } else if (index == 7) {
                this.p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.d == -1) {
            this.b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public vt40(wt40 wt40Var, int i) {
        this.f37985a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = Response.BAD_REQUEST;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.f37985a = -1;
        this.j = wt40Var;
        this.d = R.id.view_transition;
        this.c = i;
        this.h = wt40Var.j;
        this.q = wt40Var.k;
    }

    public vt40(wt40 wt40Var, vt40 vt40Var) {
        this.f37985a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = Response.BAD_REQUEST;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.j = wt40Var;
        this.h = wt40Var.j;
        if (vt40Var != null) {
            this.p = vt40Var.p;
            this.e = vt40Var.e;
            this.f = vt40Var.f;
            this.g = vt40Var.g;
            this.h = vt40Var.h;
            this.k = vt40Var.k;
            this.i = vt40Var.i;
            this.q = vt40Var.q;
        }
    }
}
