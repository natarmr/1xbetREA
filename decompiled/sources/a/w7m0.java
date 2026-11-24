package a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class w7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38681a;
    public roi0 b;
    public int[][] c;
    public roi0[] d;

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        v7m0 v7m0Var;
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
                int[] iArr = rpd0.S;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i = typedValuePeekValue.type;
                    if (i == 5) {
                        v7m0Var = new v7m0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()), 2);
                    } else if (i == 6) {
                        v7m0Var = new v7m0(typedValuePeekValue.getFraction(1.0f, 1.0f), 1);
                    } else {
                        v7m0Var = null;
                    }
                } else {
                    v7m0Var = null;
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R.attr.widthChange) {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i2] = attributeNameResource;
                        i2 = i4;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i2);
                roi0 roi0Var = new roi0();
                roi0Var.f30839a = v7m0Var;
                int i5 = this.f38681a;
                if (i5 == 0 || iArrTrimStateSet.length == 0) {
                    this.b = roi0Var;
                }
                int[][] iArr3 = this.c;
                if (i5 >= iArr3.length) {
                    int i6 = i5 + 10;
                    int[][] iArr4 = new int[i6][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i5);
                    this.c = iArr4;
                    roi0[] roi0VarArr = new roi0[i6];
                    System.arraycopy(this.d, 0, roi0VarArr, 0, i5);
                    this.d = roi0VarArr;
                }
                int[][] iArr5 = this.c;
                int i7 = this.f38681a;
                iArr5[i7] = iArrTrimStateSet;
                this.d[i7] = roi0Var;
                this.f38681a = i7 + 1;
            }
        }
    }
}
