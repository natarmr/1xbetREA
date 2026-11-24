package a;

import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes.dex */
public final class aqj0 extends p4 {
    @Override // a.p4
    public final p4 r0(TypedArray typedArray) {
        cqj0 cqj0Var = (cqj0) this.b;
        super.r0(typedArray);
        if (typedArray.hasValue(2)) {
            cqj0Var.e = (typedArray.getColor(2, cqj0Var.e) & 16777215) | (cqj0Var.e & (-16777216));
        }
        if (typedArray.hasValue(12)) {
            cqj0Var.d = typedArray.getColor(12, cqj0Var.d);
        }
        return this;
    }

    @Override // a.p4
    public final p4 B0() {
        return this;
    }
}
