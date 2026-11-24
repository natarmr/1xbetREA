package a;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class jx9 {
    public static final Map c = wp20.b(new Pair("Google", tx3.l0(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"})));
    public static final Map d = xp20.f(new Pair(Payload.SOURCE_GOOGLE, tx3.l0(new String[]{"pixel 4", "pixel 4 xl"})), new Pair(Payload.SOURCE_SAMSUNG, cui0.b("sm-g770f")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ix9 f17293a;
    public final bsm0 b;

    public jx9(ix9 ix9Var, bsm0 bsm0Var) {
        ix9Var.getClass();
        bsm0Var.getClass();
        this.f17293a = ix9Var;
        this.b = bsm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final boolean a(String str) {
        boolean z;
        str.getClass();
        this.b.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            b1a b1aVar = c1a.a0;
            c1a c1aVarA = this.f17293a.a(str);
            b1aVar.getClass();
            if (b1a.c(c1aVarA)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z || ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1"));
    }
}
