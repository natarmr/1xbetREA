package a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tvl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34605a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tvl0(mm40 mm40Var, String str, String str2, Object obj, Object obj2, int i, byte b) {
        this.f34605a = b;
        this.b = mm40Var;
        this.d = str;
        this.e = str2;
        this.c = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        q3u0 q3u0VarD;
        byte b = this.f34605a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                n2x.o((mm40) obj7, (a4x) obj6, (String) obj5, (String) obj4, (String) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                t9x.z((va00) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ycm0.a((qgn0) obj7, (au6) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                wb.A((mm40) obj7, (lyo0) obj6, (e2d) obj5, (Function1) obj4, (ugd) obj3, (fet) obj, x8x.L(24577));
                return Unit.f46060a;
            case 4:
                kwj kwjVar = (kwj) obj7;
                ftp0 ftp0Var = (ftp0) obj6;
                k6z k6zVar = (k6z) obj5;
                Map map = (Map) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q5x.e(kwjVar, null, null, null, 0, 0.0f, gqw0.j, null, true, null, null, null, null, u1c.M(-837445837, new g54((Object) ftp0Var, (Object) k6zVar, (Object) map, (Object) function1, (byte) 13), fetVar), fetVar, 102236160, 24576, 16062);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ltt0.i((mm40) obj7, (awr0) obj6, (Function1) obj5, (Function1) obj4, (xdr) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ltt0.a((mm40) obj7, (String) obj5, (String) obj4, (y9q0) obj6, (y9q0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                hhm0.j((mm40) obj7, (qfr0) obj6, (d9z) obj5, (hh80) obj4, (Function1) obj3, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                knm0.e((mm40) obj7, (String) obj5, (String) obj4, (Function0) obj6, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                XmlResourceParser xmlResourceParser = (XmlResourceParser) obj7;
                Resources resources = (Resources) obj6;
                Resources.Theme theme = (Resources.Theme) obj5;
                AttributeSet attributeSet = (AttributeSet) obj4;
                ghn ghnVar = (ghn) obj3;
                q3u0 q3u0Var = (q3u0) obj;
                List list = (List) obj2;
                q3u0 q3u0Var2 = s1w0.f31475a;
                xmlResourceParser.next();
                q3u0 q3u0Var3 = null;
                while (!j5n0.B(xmlResourceParser) && (xmlResourceParser.getEventType() != 3 || !Intrinsics.d(xmlResourceParser.getName(), "propertyValuesHolder"))) {
                    if (xmlResourceParser.getEventType() == 2 && Intrinsics.d(xmlResourceParser.getName(), "keyframe")) {
                        int[] iArr = cy2.h;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0)) == null) {
                            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                        }
                        if (q3u0Var == null) {
                            try {
                                q3u0VarD = s1w0.d(new int[]{typedArrayObtainAttributes.peekValue(0).type}, typedArrayObtainAttributes.getInt(2, 4));
                                if (q3u0VarD == null) {
                                    q3u0VarD = q3u0Var2;
                                }
                            } catch (Throwable th) {
                                typedArrayObtainAttributes.recycle();
                                throw th;
                            }
                        } else {
                            q3u0VarD = q3u0Var;
                        }
                        dmy dmyVarB = s1w0.b(typedArrayObtainAttributes, typedArrayObtainAttributes.getFloat(3, 0.0f), s1w0.a(typedArrayObtainAttributes, resources, theme, 1, ghnVar), q3u0VarD, 0);
                        typedArrayObtainAttributes.recycle();
                        if (q3u0Var3 == null) {
                            q3u0Var3 = q3u0VarD;
                        }
                        list.add(dmyVarB);
                    }
                    xmlResourceParser.next();
                }
                if (q3u0Var3 == null) {
                    return q3u0Var == null ? q3u0Var2 : q3u0Var;
                }
                return q3u0Var3;
        }
    }

    public /* synthetic */ tvl0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f34605a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ tvl0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.f34605a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
