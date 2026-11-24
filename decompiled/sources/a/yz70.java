package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yz70 extends mjq {
    public static final yz70 d = new yz70(1, 0, 2);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        int[] iArr;
        bet betVar;
        int iC;
        int iF = hu5Var.f(0);
        if (t9k0Var.n != 0) {
            ykd.a("Cannot move a group while inserting");
        }
        if (iF < 0) {
            ykd.a("Parameter offset is out of bounds");
        }
        if (iF == 0) {
            return;
        }
        int i = t9k0Var.t;
        int i2 = t9k0Var.v;
        int i3 = t9k0Var.u;
        int i4 = i;
        while (true) {
            iArr = t9k0Var.b;
            if (iF <= 0) {
                break;
            }
            i4 += iArr[(t9k0Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                ykd.a("Parameter offset is out of bounds");
            }
            iF--;
        }
        int i5 = iArr[(t9k0Var.q(i4) * 5) + 3];
        int iF2 = t9k0Var.f(t9k0Var.b, t9k0Var.q(t9k0Var.t));
        int iF3 = t9k0Var.f(t9k0Var.b, t9k0Var.q(i4));
        int i6 = i4 + i5;
        int iF4 = t9k0Var.f(t9k0Var.b, t9k0Var.q(i6));
        int i7 = iF4 - iF3;
        t9k0Var.w(i7, Math.max(t9k0Var.t - 1, 0));
        t9k0Var.v(i5);
        int[] iArr2 = t9k0Var.b;
        int iQ = t9k0Var.q(i6) * 5;
        qx3.d(t9k0Var.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = t9k0Var.c;
            int iG = t9k0Var.g(iF3 + i7);
            System.arraycopy(objArr, iG, objArr, iF2, t9k0Var.g(iF4 + i7) - iG);
        }
        int i8 = iF3 + i7;
        int i9 = i8 - iF2;
        int i10 = t9k0Var.k;
        int i11 = t9k0Var.l;
        int length = t9k0Var.c.length;
        int i12 = t9k0Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = t9k0Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = t9k0.h(t9k0.h(t9k0Var.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), t9k0Var.k, t9k0Var.l, t9k0Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iO = t9k0Var.o();
        int iB = s9k0.b(t9k0Var.d, i6, iO);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < t9k0Var.d.size() && (iC = t9k0Var.c((betVar = (bet) t9k0Var.d.get(iB)))) >= i6 && iC < i16) {
                arrayList.add(betVar);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            bet betVar2 = (bet) arrayList.get(i18);
            int iC2 = t9k0Var.c(betVar2) + i17;
            if (iC2 >= t9k0Var.g) {
                betVar2.f2467a = -(iO - iC2);
            } else {
                betVar2.f2467a = iC2;
            }
            t9k0Var.d.add(s9k0.b(t9k0Var.d, iC2, iO), betVar2);
        }
        if (t9k0Var.J(i6, i5)) {
            ykd.a("Unexpectedly removed anchors");
        }
        t9k0Var.l(i2, t9k0Var.u, i);
        if (i7 > 0) {
            t9k0Var.K(i8, i7, i6 - 1);
        }
    }
}
