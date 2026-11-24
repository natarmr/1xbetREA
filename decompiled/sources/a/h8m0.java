package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class h8m0 implements zlu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f12634a = new SparseArray();
    public int b;

    public h8m0(Context context, XmlResourceParser xmlResourceParser) {
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), fqd0.s);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            f8m0 f8m0Var = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                f8m0Var = new f8m0(context, xmlResourceParser);
                                this.f12634a.put(f8m0Var.f9114a, f8m0Var);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                g8m0 g8m0Var = new g8m0(context, xmlResourceParser);
                                if (f8m0Var != null) {
                                    f8m0Var.b.add(g8m0Var);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    @Override // a.zlu0
    public ylu0 a(nj50 nj50Var) {
        h0q0 h0q0Var = new h0q0();
        h0q0Var.d = this;
        h0q0Var.f12247a = new SparseIntArray(1);
        h0q0Var.b = new SparseIntArray(1);
        h0q0Var.c = nj50Var;
        return h0q0Var;
    }

    @Override // a.zlu0
    public nj50 b(int i) {
        nj50 nj50Var = (nj50) this.f12634a.get(i);
        if (nj50Var != null) {
            return nj50Var;
        }
        jf4.o(twn.m(i, "Cannot find the wrapper for global view type "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    public int c(int i) {
        SparseArray sparseArray = this.f12634a;
        int i2 = 0;
        if (-1 == i) {
            f8m0 f8m0Var = i == -1 ? (f8m0) sparseArray.valueAt(0) : (f8m0) sparseArray.get(-1);
            if (f8m0Var != null) {
                ArrayList arrayList = f8m0Var.b;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    g8m0 g8m0Var = (g8m0) arrayList.get(i2);
                    float f = g8m0Var.d;
                    float f2 = g8m0Var.c;
                    float f3 = g8m0Var.b;
                    float f4 = g8m0Var.f10872a;
                    if ((Float.isNaN(f4) || -1.0f >= f4) && ((Float.isNaN(f3) || -1.0f >= f3) && ((Float.isNaN(f2) || -1.0f <= f2) && (Float.isNaN(f) || -1.0f <= f)))) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? f8m0Var.c : ((g8m0) arrayList.get(i2)).e;
                }
            }
        } else {
            f8m0 f8m0Var2 = (f8m0) sparseArray.get(i);
            if (f8m0Var2 != null) {
                ArrayList arrayList2 = f8m0Var2.b;
                while (i2 < arrayList2.size()) {
                    g8m0 g8m0Var2 = (g8m0) arrayList2.get(i2);
                    float f5 = g8m0Var2.d;
                    float f6 = g8m0Var2.c;
                    float f7 = g8m0Var2.b;
                    float f8 = g8m0Var2.f10872a;
                    if ((Float.isNaN(f8) || -1.0f >= f8) && ((Float.isNaN(f7) || -1.0f >= f7) && ((Float.isNaN(f6) || -1.0f <= f6) && (Float.isNaN(f5) || -1.0f <= f5)))) {
                        return i2 == -1 ? f8m0Var2.c : ((g8m0) arrayList2.get(i2)).e;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 == -1) {
                }
            }
        }
        return -1;
    }
}
