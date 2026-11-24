package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class eju0 extends cky {
    public static eju0 e(String str) {
        byte b = 1;
        if (str.startsWith("CUSTOM")) {
            bju0 bju0Var = new bju0();
            bju0Var.g = new float[1];
            return bju0Var;
        }
        byte b2 = 9;
        byte b3 = 8;
        byte b4 = 7;
        byte b5 = 6;
        byte b6 = 5;
        byte b7 = 4;
        byte b8 = 3;
        byte b9 = 2;
        byte b10 = 0;
        switch (str) {
            case "rotationX":
                return new aju0(b8);
            case "rotationY":
                return new aju0(b7);
            case "translationX":
                return new aju0(b4);
            case "translationY":
                return new aju0(b3);
            case "translationZ":
                return new aju0(b2);
            case "progress":
                dju0 dju0Var = new dju0();
                dju0Var.g = false;
                return dju0Var;
            case "scaleX":
                return new aju0(b6);
            case "scaleY":
                return new aju0(b5);
            case "waveVariesBy":
                return new aju0(b10);
            case "rotation":
                return new aju0(b9);
            case "elevation":
                return new aju0(b);
            case "transitionPathRotate":
                return new cju0();
            case "alpha":
                return new aju0(b10);
            case "waveOffset":
                return new aju0(b10);
            default:
                return null;
        }
    }

    public void f(View view, float f) {
    }
}
