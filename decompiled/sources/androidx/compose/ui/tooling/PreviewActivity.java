package androidx.compose.ui.tooling;

import a.agd;
import a.b1j;
import a.bgd;
import a.hw6;
import a.jf4;
import a.o090;
import a.tsy;
import a.ugd;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends agd {
    public static final /* synthetic */ int w = 0;
    public final String v = "PreviewActivity";

    @Override // a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.v;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String strS0 = StringsKt.s0(stringExtra, '.');
        String strO0 = StringsKt.o0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strO0 + "' without a parameter provider.");
            bgd.a(this, new ugd(-840626948, true, new hw6(strS0, strO0, (byte) 17)));
            return;
        }
        Log.d(str, b1j.k("Previewing '", strO0, "' with parameter provider: '", stringExtra2, Separators.QUOTE));
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + Separators.QUOTE, e);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i2 = 0;
        if (cls == null) {
            bgd.a(this, new ugd(-1901447514, true, new o090((Object) strS0, (Object) strO0, (Object) new Object[0], (byte) 23)));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i2 >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            z = true;
                            constructor = constructor2;
                        }
                    }
                    i2++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null).getClass();
            throw new ClassCastException();
        } catch (tsy unused) {
            jf4.n("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
