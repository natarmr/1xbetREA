package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class msg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final msg0 f22318a;
    public static final msg0 b;
    public static final msg0 c;
    public static final msg0 d;
    public static final HashMap e;
    public static final /* synthetic */ msg0[] f;

    /* JADX INFO: Fake field, exist only in values array */
    msg0 EF1;

    static {
        msg0 msg0Var = new msg0("svg", 0);
        msg0 msg0Var2 = new msg0("a", 1);
        msg0 msg0Var3 = new msg0("circle", 2);
        msg0 msg0Var4 = new msg0("clipPath", 3);
        msg0 msg0Var5 = new msg0("defs", 4);
        msg0 msg0Var6 = new msg0("desc", 5);
        f22318a = msg0Var6;
        msg0 msg0Var7 = new msg0("ellipse", 6);
        msg0 msg0Var8 = new msg0("g", 7);
        msg0 msg0Var9 = new msg0("image", 8);
        msg0 msg0Var10 = new msg0("line", 9);
        msg0 msg0Var11 = new msg0("linearGradient", 10);
        msg0 msg0Var12 = new msg0("marker", 11);
        msg0 msg0Var13 = new msg0("mask", 12);
        msg0 msg0Var14 = new msg0("path", 13);
        msg0 msg0Var15 = new msg0("pattern", 14);
        msg0 msg0Var16 = new msg0("polygon", 15);
        msg0 msg0Var17 = new msg0("polyline", 16);
        msg0 msg0Var18 = new msg0("radialGradient", 17);
        msg0 msg0Var19 = new msg0("rect", 18);
        msg0 msg0Var20 = new msg0("solidColor", 19);
        msg0 msg0Var21 = new msg0("stop", 20);
        msg0 msg0Var22 = new msg0("style", 21);
        msg0 msg0Var23 = new msg0("SWITCH", 22);
        b = msg0Var23;
        msg0 msg0Var24 = new msg0("symbol", 23);
        msg0 msg0Var25 = new msg0(ParameterNames.TEXT, 24);
        msg0 msg0Var26 = new msg0("textPath", 25);
        msg0 msg0Var27 = new msg0("title", 26);
        c = msg0Var27;
        msg0 msg0Var28 = new msg0("tref", 27);
        msg0 msg0Var29 = new msg0("tspan", 28);
        msg0 msg0Var30 = new msg0("use", 29);
        msg0 msg0Var31 = new msg0("view", 30);
        msg0 msg0Var32 = new msg0("UNSUPPORTED", 31);
        d = msg0Var32;
        f = new msg0[]{msg0Var, msg0Var2, msg0Var3, msg0Var4, msg0Var5, msg0Var6, msg0Var7, msg0Var8, msg0Var9, msg0Var10, msg0Var11, msg0Var12, msg0Var13, msg0Var14, msg0Var15, msg0Var16, msg0Var17, msg0Var18, msg0Var19, msg0Var20, msg0Var21, msg0Var22, msg0Var23, msg0Var24, msg0Var25, msg0Var26, msg0Var27, msg0Var28, msg0Var29, msg0Var30, msg0Var31, msg0Var32};
        e = new HashMap();
        for (msg0 msg0Var33 : values()) {
            if (msg0Var33 == b) {
                e.put("switch", msg0Var33);
            } else if (msg0Var33 != d) {
                e.put(msg0Var33.name(), msg0Var33);
            }
        }
    }

    public static msg0 valueOf(String str) {
        return (msg0) Enum.valueOf(msg0.class, str);
    }

    public static msg0[] values() {
        return (msg0[]) f.clone();
    }
}
