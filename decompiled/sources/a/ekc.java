package a;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ekc extends saj {
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    @Override // a.saj
    public final long W(ViewGroup viewGroup, gms0 gms0Var, mns0 mns0Var, mns0 mns0Var2) {
        int i;
        Integer num;
        if (mns0Var == null && mns0Var2 == null) {
            return 0L;
        }
        if (mns0Var2 == null) {
            i = -1;
        } else {
            if (((mns0Var == null || (num = (Integer) mns0Var.f22105a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                i = -1;
            } else {
                mns0Var = mns0Var2;
                i = 1;
            }
        }
        int iX = saj.X(mns0Var, 0);
        int iX2 = saj.X(mns0Var, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        float fRound = Math.round(viewGroup.getTranslationX() + ((viewGroup.getWidth() / 2) + iArr[0])) - iX;
        float fRound2 = Math.round(viewGroup.getTranslationY() + ((viewGroup.getHeight() / 2) + iArr[1])) - iX2;
        float fSqrt = (float) Math.sqrt((fRound2 * fRound2) + (fRound * fRound));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j = gms0Var.c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * fSqrt2);
    }
}
