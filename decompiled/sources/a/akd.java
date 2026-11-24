package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import androidx.collection.MutableIntList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class akd extends zzf0 implements Function2 {
    public int j;
    public int k;
    public int l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ bkd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akd(bkd bkdVar, yje yjeVar) {
        super(2, yjeVar);
        this.o = bkdVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        akd akdVar = new akd(this.o, yjeVar);
        akdVar.n = obj;
        return akdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((akd) create((fgi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        fgi0 fgi0Var;
        int i;
        int i2;
        int i3;
        String strJ;
        int i4;
        int i5;
        String str;
        bkd bkdVar = this.o;
        vy40 vy40Var = bkdVar.f2742a;
        MutableIntList mutableIntList = bkdVar.c;
        wne wneVar = wne.f39444a;
        boolean z = this.m;
        if (!z) {
            z1x.P(obj);
            fgi0Var = (fgi0) this.n;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.l;
            i2 = this.k;
            i3 = this.j;
            fgi0Var = (fgi0) this.n;
            z1x.P(obj);
        }
        if (i3 >= Math.min(bkdVar.d + 10, mutableIntList.b)) {
            return Unit.f46060a;
        }
        int i6 = i3 + 1;
        int iC = mutableIntList.c(i3);
        switch (iC) {
            case 0:
                strJ = "up";
                break;
            case 1:
                Object objG = vy40Var.g(i2);
                i2++;
                strJ = "down " + objG;
                break;
            case 2:
                strJ = f140.j(mutableIntList.c(i6), "remove ", mutableIntList.c(i3 + 2), Separators.SP);
                i6 = i3 + 3;
                break;
            case 3:
                int iC2 = mutableIntList.c(i6);
                int iC3 = mutableIntList.c(i3 + 2);
                int iC4 = mutableIntList.c(i3 + 3);
                StringBuilder sbT = dw9.t("move ", iC2, Separators.SP, Separators.SP, iC3);
                sbT.append(iC4);
                strJ = sbT.toString();
                i6 = i3 + 4;
                break;
            case 4:
                strJ = SDPKeywords.CLEAR;
                break;
            case 5:
                i4 = i3 + 2;
                int iC5 = mutableIntList.c(i6);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + Separators.SP + vy40Var.g(i2);
                int i7 = i4;
                strJ = str;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC6 = mutableIntList.c(i6);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + Separators.SP + vy40Var.g(i2);
                int i8 = i4;
                strJ = str;
                i6 = i8;
                i2 = i5;
                break;
            case 7:
                Object objG2 = vy40Var.g(i2);
                objG2.getClass();
                zys0.e(2, objG2);
                i2 += 2;
                strJ = "apply " + ((Function2) objG2);
                break;
            case 8:
                strJ = "reuse " + bkdVar.b.g(i);
                i++;
                break;
            case 9:
                strJ = "recompose pending";
                break;
            default:
                strJ = twn.m(iC, "unknown op: ");
                break;
        }
        String strM = dw9.m(i3, ": ", strJ);
        this.n = fgi0Var;
        this.j = i6;
        this.k = i2;
        this.l = i;
        this.m = true;
        fgi0Var.a(this, strM);
        return wneVar;
    }
}
