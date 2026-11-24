package a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vs00 extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f37925a;
    public final l4x b;
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs00(Resources resources, l4x l4xVar, boolean z) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        resources.getClass();
        l4xVar.getClass();
        this.f37925a = resources;
        this.b = l4xVar;
        this.c = z;
    }

    public final String a(String str) {
        return this.c ? ohs0.n(str, kotlin.text.c.q(10, ws00.f39671a.replace(str, Separators.SP))) : str;
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... objArr) {
        String string;
        objArr.getClass();
        l4x l4xVar = this.b;
        String strA = l4xVar.a(i);
        try {
            if (strA != null) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                string = String.format(strA, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            } else {
                String strB = l4xVar.b(i);
                if (strB != null) {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
                    string = String.format(strB, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                } else {
                    string = this.f37925a.getString(i, Arrays.copyOf(objArr, objArr.length));
                    string.getClass();
                }
            }
            return a(string);
        } catch (Exception e) {
            String string2 = Arrays.toString(objArr);
            string2.getClass();
            throw new RuntimeException("string = " + strA + " formatArgs = " + string2, e);
        }
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) {
        Object g0g0Var;
        Resources resources = this.f37925a;
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        typedArrayObtainTypedArray.getClass();
        int length = typedArrayObtainTypedArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Integer.valueOf(typedArrayObtainTypedArray.getResourceId(i2, 0)));
        }
        typedArrayObtainTypedArray.recycle();
        try {
            e0g0 e0g0Var = j0g0.b;
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(getString(((Number) it.next()).intValue()));
            }
            g0g0Var = (String[]) arrayList2.toArray(new String[0]);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        String[] stringArray = resources.getStringArray(i);
        e0g0 e0g0Var3 = j0g0.b;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = stringArray;
        }
        return (String[]) g0g0Var;
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) {
        l4x l4xVar = this.b;
        CharSequence charSequenceA = l4xVar.a(i);
        if (charSequenceA == null && (charSequenceA = l4xVar.b(i)) == null) {
            charSequenceA = this.f37925a.getText(i);
        }
        charSequenceA.getClass();
        if (!this.c) {
            return charSequenceA;
        }
        return ((Object) charSequenceA) + kotlin.text.c.q(10, ws00.f39671a.replace(charSequenceA, Separators.SP));
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        l4x l4xVar = this.b;
        String strA = l4xVar.a(i);
        if (strA == null && (strA = l4xVar.b(i)) == null) {
            strA = this.f37925a.getString(i);
            strA.getClass();
        }
        return a(strA);
    }
}
