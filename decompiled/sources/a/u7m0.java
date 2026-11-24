package a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class u7m0 implements zjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35192a;
    public final akj0 b;
    public final int[][] c;
    public final akj0[] d;
    public final s7m0 e;
    public final s7m0 f;
    public final s7m0 g;
    public final s7m0 h;

    public u7m0(t7m0 t7m0Var) {
        this.f35192a = t7m0Var.f33476a;
        this.b = t7m0Var.b;
        this.c = t7m0Var.c;
        this.d = t7m0Var.d;
        this.e = t7m0Var.e;
        this.f = t7m0Var.f;
        this.g = t7m0Var.g;
        this.h = t7m0Var.h;
    }

    public static u7m0 g(int i, Context context, TypedArray typedArray) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        t7m0 t7m0Var = new t7m0();
        t7m0Var.c();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    i(t7m0Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return t7m0Var.b();
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            t7m0Var.c();
        }
    }

    public static void i(t7m0 t7m0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = rpd0.G;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                akj0 akj0VarC = akj0.g(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).c();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                t7m0Var.a(StateSet.trimStateSet(iArr2, i), akj0VarC);
            }
        }
    }

    @Override // a.zjj0
    public final akj0 a(float f) {
        return h().a(f);
    }

    @Override // a.zjj0
    public final akj0 b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        while (true) {
            i = -1;
            i2 = this.f35192a;
            iArr2 = this.c;
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            for (int i4 = 0; i4 < i2; i4++) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                    i = i4;
                    break;
                }
            }
            i3 = i;
        }
        akj0[] akj0VarArr = this.d;
        s7m0 s7m0Var = this.h;
        s7m0 s7m0Var2 = this.g;
        s7m0 s7m0Var3 = this.f;
        s7m0 s7m0Var4 = this.e;
        if (s7m0Var4 == null && s7m0Var3 == null && s7m0Var2 == null && s7m0Var == null) {
            return akj0VarArr[i3];
        }
        daf dafVarL = akj0VarArr[i3].l();
        if (s7m0Var4 != null) {
            dafVarL.f = s7m0Var4.c(iArr);
        }
        if (s7m0Var3 != null) {
            dafVarL.g = s7m0Var3.c(iArr);
        }
        if (s7m0Var2 != null) {
            dafVarL.i = s7m0Var2.c(iArr);
        }
        if (s7m0Var != null) {
            dafVarL.h = s7m0Var.c(iArr);
        }
        return dafVarL.c();
    }

    @Override // a.zjj0
    public final akj0[] c() {
        return this.d;
    }

    @Override // a.zjj0
    public final akj0 d() {
        return h();
    }

    @Override // a.zjj0
    public final akj0 e(zef0 zef0Var) {
        return h().e(zef0Var);
    }

    @Override // a.zjj0
    public final boolean f() {
        s7m0 s7m0Var;
        s7m0 s7m0Var2;
        s7m0 s7m0Var3;
        s7m0 s7m0Var4;
        return this.f35192a > 1 || ((s7m0Var = this.e) != null && s7m0Var.f31757a > 1) || (((s7m0Var2 = this.f) != null && s7m0Var2.f31757a > 1) || (((s7m0Var3 = this.g) != null && s7m0Var3.f31757a > 1) || ((s7m0Var4 = this.h) != null && s7m0Var4.f31757a > 1)));
    }

    public final akj0 h() {
        akj0 akj0Var = this.b;
        s7m0 s7m0Var = this.h;
        s7m0 s7m0Var2 = this.g;
        s7m0 s7m0Var3 = this.f;
        s7m0 s7m0Var4 = this.e;
        if (s7m0Var4 == null && s7m0Var3 == null && s7m0Var2 == null && s7m0Var == null) {
            return akj0Var;
        }
        daf dafVarL = akj0Var.l();
        if (s7m0Var4 != null) {
            dafVarL.f = s7m0Var4.b;
        }
        if (s7m0Var3 != null) {
            dafVarL.g = s7m0Var3.b;
        }
        if (s7m0Var2 != null) {
            dafVarL.i = s7m0Var2.b;
        }
        if (s7m0Var != null) {
            dafVarL.h = s7m0Var.b;
        }
        return dafVarL.c();
    }

    public final t7m0 j() {
        t7m0 t7m0Var = new t7m0();
        int i = this.f35192a;
        t7m0Var.f33476a = i;
        t7m0Var.b = this.b;
        int[][] iArr = this.c;
        int[][] iArr2 = new int[iArr.length][];
        t7m0Var.c = iArr2;
        akj0[] akj0VarArr = this.d;
        t7m0Var.d = new akj0[akj0VarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        System.arraycopy(akj0VarArr, 0, t7m0Var.d, 0, t7m0Var.f33476a);
        t7m0Var.e = this.e;
        t7m0Var.f = this.f;
        t7m0Var.g = this.g;
        t7m0Var.h = this.h;
        return t7m0Var;
    }
}
