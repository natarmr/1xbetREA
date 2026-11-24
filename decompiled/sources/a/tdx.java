package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tdx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33792a;
    public final xlw b;
    public final xlw c;
    public final xlw d;
    public final xlw e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public tdx(tdx[] tdxVarArr) {
        final byte b = 0;
        this.f33792a = (byte) 0;
        this.f = tdxVarArr;
        int length = tdxVarArr.length;
        final xlw[] xlwVarArr = new xlw[length];
        for (int i = 0; i < length; i++) {
            xlwVarArr[i] = ((tdx[]) this.f)[i].b();
        }
        final byte b2 = 1;
        this.b = new xlw(new Function2() { // from class: a.kcu0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                float fQ;
                byte b3 = b2;
                xlw[] xlwVarArr2 = xlwVarArr;
                ou90 ou90Var = (ou90) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fQ = xww.Q(ou90Var, false, xlwVarArr2, fFloatValue);
                        break;
                    default:
                        fQ = xww.Q(ou90Var, true, xlwVarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fQ);
            }
        }, (byte) 1);
        int length2 = ((tdx[]) this.f).length;
        final xlw[] xlwVarArr2 = new xlw[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            xlwVarArr2[i2] = ((tdx[]) this.f)[i2].d();
        }
        this.c = new xlw(new Function2() { // from class: a.wlw
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                float fQ;
                byte b3 = b2;
                xlw[] xlwVarArr3 = xlwVarArr2;
                ou90 ou90Var = (ou90) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fQ = xww.Q(ou90Var, false, xlwVarArr3, fFloatValue);
                        break;
                    default:
                        fQ = xww.Q(ou90Var, true, xlwVarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fQ);
            }
        }, (byte) 0);
        int length3 = ((tdx[]) this.f).length;
        final xlw[] xlwVarArr3 = new xlw[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            xlwVarArr3[i3] = ((tdx[]) this.f)[i3].c();
        }
        this.d = new xlw(new Function2() { // from class: a.kcu0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                float fQ;
                byte b3 = b;
                xlw[] xlwVarArr4 = xlwVarArr3;
                ou90 ou90Var = (ou90) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fQ = xww.Q(ou90Var, false, xlwVarArr4, fFloatValue);
                        break;
                    default:
                        fQ = xww.Q(ou90Var, true, xlwVarArr4, fFloatValue);
                        break;
                }
                return Float.valueOf(fQ);
            }
        }, (byte) 1);
        int length4 = ((tdx[]) this.f).length;
        final xlw[] xlwVarArr4 = new xlw[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            xlwVarArr4[i4] = ((tdx[]) this.f)[i4].a();
        }
        this.e = new xlw(new Function2() { // from class: a.wlw
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                float fQ;
                byte b3 = b;
                xlw[] xlwVarArr5 = xlwVarArr4;
                ou90 ou90Var = (ou90) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fQ = xww.Q(ou90Var, false, xlwVarArr5, fFloatValue);
                        break;
                    default:
                        fQ = xww.Q(ou90Var, true, xlwVarArr5, fFloatValue);
                        break;
                }
                return Float.valueOf(fQ);
            }
        }, (byte) 0);
    }

    public final xlw a() {
        byte b = this.f33792a;
        return this.e;
    }

    public final xlw b() {
        byte b = this.f33792a;
        return this.b;
    }

    public final xlw c() {
        byte b = this.f33792a;
        return this.d;
    }

    public final xlw d() {
        byte b = this.f33792a;
        return this.c;
    }

    public final String toString() {
        byte b = this.f33792a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return tx3.N((tdx[]) obj, null, "innermostOf(", Separators.RPAREN, null, 57);
            default:
                return kng0.l("RectRulers(", (String) obj, Separators.RPAREN);
        }
    }

    public tdx(String str) {
        this.f33792a = (byte) 1;
        this.f = str;
        this.b = new xlw(null, (byte) 1);
        this.c = new xlw(null, (byte) 0);
        this.d = new xlw(null, (byte) 1);
        this.e = new xlw(null, (byte) 0);
    }
}
