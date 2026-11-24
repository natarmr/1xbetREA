package a;

import java.io.IOException;
import java.io.Serializable;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public class zhi0 extends IOException implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44396a;
    public final int b;
    public kuw c;
    public final uhi0 d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public zhi0(String str, int i, uhi0 uhi0Var, Integer num) {
        boolean z;
        boolean z2;
        super(str);
        str.getClass();
        this.c = ujn.n;
        this.e = true;
        this.d = uhi0Var;
        i2o.Companion.getClass();
        this.c = h2o.a(i);
        if (num != null) {
            int iIntValue = num.intValue();
            IntRange intRange = pnm0.c;
            int i2 = intRange.f46068a;
            if (iIntValue > intRange.b || i2 > iIntValue) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        this.e = z;
        this.f44396a = num != null ? num.intValue() : 0;
        if (uhi0Var != null) {
            w0o w0oVar = uhi0Var.g;
            Integer num2 = w0oVar != null ? w0oVar.f38359a : null;
            if (num2 != null) {
                i = num2.intValue();
            }
        }
        this.b = i;
        if (num != null) {
            IntRange intRange2 = pnm0.b;
            int i3 = intRange2.f46068a;
            int i4 = intRange2.b;
            int iIntValue2 = num.intValue();
            z2 = i3 <= iIntValue2 && iIntValue2 <= i4;
        }
        this.f = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhi0(uhi0 uhi0Var) {
        super(uhi0Var.b);
        uhi0Var.getClass();
        kuw kuwVar = ujn.n;
        this.c = kuwVar;
        this.e = true;
        this.d = uhi0Var;
        w0o w0oVar = uhi0Var.g;
        i2o i2oVar = w0oVar != null ? w0oVar.b : null;
        this.c = i2oVar != null ? i2oVar : kuwVar;
        Integer num = w0oVar != null ? w0oVar.f38359a : null;
        this.b = num != null ? num.intValue() : 0;
        Integer num2 = uhi0Var.c;
        this.f44396a = num2 != null ? num2.intValue() : 0;
    }

    public zhi0() {
        this.c = ujn.n;
        this.e = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhi0(String str) {
        super(str);
        str.getClass();
        this.c = ujn.n;
        this.e = true;
    }

    public /* synthetic */ zhi0(String str, int i, Integer num, int i2) {
        this(str, i, (uhi0) null, (i2 & 8) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    public zhi0(String str, kuw kuwVar, Integer num, int i) {
        boolean z;
        boolean z2;
        super(str);
        num = (i & 8) != 0 ? null : num;
        str.getClass();
        juw juwVar = ujn.n;
        this.c = juwVar;
        this.e = true;
        this.d = null;
        this.c = kuwVar == null ? juwVar : kuwVar;
        if (num != null) {
            int iIntValue = num.intValue();
            IntRange intRange = pnm0.c;
            int i2 = intRange.f46068a;
            if (iIntValue > intRange.b || i2 > iIntValue) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        this.e = z;
        this.f44396a = num != null ? num.intValue() : 0;
        this.b = 0;
        if (num != null) {
            IntRange intRange2 = pnm0.b;
            int i3 = intRange2.f46068a;
            int i4 = intRange2.b;
            int iIntValue2 = num.intValue();
            z2 = i3 <= iIntValue2 && iIntValue2 <= i4;
        }
        this.f = z2;
    }
}
