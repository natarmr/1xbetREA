package a;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class otj0 extends saj {
    public int s;

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    @Override // a.saj
    public final long W(ViewGroup viewGroup, gms0 gms0Var, mns0 mns0Var, mns0 mns0Var2) {
        int i;
        int iAbs;
        Integer num;
        mns0 mns0Var3 = mns0Var;
        if (mns0Var3 == null && mns0Var2 == null) {
            return 0L;
        }
        if (mns0Var2 == null) {
            i = -1;
        } else {
            if (((mns0Var3 == null || (num = (Integer) mns0Var3.f22105a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                i = -1;
            } else {
                mns0Var3 = mns0Var2;
                i = 1;
            }
        }
        int iX = saj.X(mns0Var3, 0);
        int iX2 = saj.X(mns0Var3, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        int i2 = (iRound + width) / 2;
        int i3 = (iRound2 + height) / 2;
        int i4 = this.s;
        if (i4 == 8388611) {
            if (viewGroup.getLayoutDirection() == 1) {
                i4 = 5;
            } else {
                i4 = 3;
            }
        } else if (i4 == 8388613) {
            if (viewGroup.getLayoutDirection() == 1) {
                i4 = 3;
            } else {
                i4 = 5;
            }
        }
        if (i4 == 3) {
            iAbs = Math.abs(i3 - iX2) + (width - iX);
        } else if (i4 == 5) {
            iAbs = Math.abs(i3 - iX2) + (iX - iRound);
        } else if (i4 != 48) {
            iAbs = i4 != 80 ? 0 : (iX2 - iRound2) + Math.abs(i2 - iX);
        } else {
            iAbs = Math.abs(i2 - iX) + (height - iX2);
        }
        float f = iAbs;
        int i5 = this.s;
        float width2 = f / ((i5 == 3 || i5 == 5 || i5 == 8388611 || i5 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j = gms0Var.c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * width2);
    }
}
