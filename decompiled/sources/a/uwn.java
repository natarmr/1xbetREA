package a;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class uwn implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f36402a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final String c;
    public final a50 d;
    public final igk e;

    public uwn(String str, SharedPreferences sharedPreferences, a50 a50Var, igk igkVar) {
        this.c = str;
        this.f36402a = sharedPreferences;
        this.d = a50Var;
        this.e = igkVar;
    }

    public static uwn a(us00 us00Var, String str, h70 h70Var) {
        ywu ywuVarI;
        ywu ywuVarI2;
        String str2 = h70Var.b;
        int i = jgk.f16484a;
        pcf0.h(lgk.b);
        if (!foq0.a()) {
            pcf0.f(new o50(n70.class, new m50[]{new m50(igk.class, (byte) 6)}, (byte) 6), true);
        }
        b50.a();
        Context applicationContext = us00Var.getApplicationContext();
        ywq0 ywq0Var = new ywq0();
        ywq0Var.f = r7x.w("AES256_SIV");
        if (applicationContext == null) {
            jf4.o("need an Android context");
            return null;
        }
        ywq0Var.f43384a = applicationContext;
        ywq0Var.b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        ywq0Var.c = str;
        String strK = kng0.k("android-keystore://", str2);
        if (!strK.startsWith("android-keystore://")) {
            jf4.o("key URI must start with android-keystore://");
            return null;
        }
        ywq0Var.d = strK;
        yk50 yk50VarC = ywq0Var.c();
        synchronized (yk50VarC) {
            ywuVarI = ((yox) yk50VarC.b).i();
        }
        ywq0 ywq0Var2 = new ywq0();
        ywq0Var2.f = r7x.w("AES256_GCM");
        ywq0Var2.f43384a = applicationContext;
        ywq0Var2.b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        ywq0Var2.c = str;
        String strK2 = kng0.k("android-keystore://", str2);
        if (!strK2.startsWith("android-keystore://")) {
            jf4.o("key URI must start with android-keystore://");
            return null;
        }
        ywq0Var2.d = strK2;
        yk50 yk50VarC2 = ywq0Var2.c();
        synchronized (yk50VarC2) {
            ywuVarI2 = ((yox) yk50VarC2.b).i();
        }
        igk igkVar = (igk) ywuVarI.r(igk.class);
        return new uwn(str, applicationContext.getSharedPreferences(str, 0), (a50) ywuVarI2.r(a50.class), igkVar);
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(ev5.b(this.e.a(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            udk.g("Could not encrypt key. ", e2.getMessage(), e2);
            return null;
        }
    }

    public final Object c(String str) {
        int i;
        String str2;
        if (d(str)) {
            throw new SecurityException(ohs0.n(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.f36402a.getString(strB, null);
            if (string != null) {
                byte[] bArrA = ev5.a(string);
                a50 a50Var = this.d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(a50Var.b(bArrA, strB.getBytes(charset)));
                byteBufferWrap.position(0);
                int i2 = byteBufferWrap.getInt();
                if (i2 == 0) {
                    i = 1;
                } else if (i2 == 1) {
                    i = 2;
                } else if (i2 == 2) {
                    i = 3;
                } else if (i2 == 3) {
                    i = 4;
                } else if (i2 != 4) {
                    i = i2 != 5 ? 0 : 6;
                } else {
                    i = 5;
                }
                if (i == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i2);
                }
                int iE = hne.E(i);
                if (iE == 0) {
                    int i3 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i3);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iE != 1) {
                        if (iE == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iE == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iE == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iE == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    lx3 lx3Var = new lx3(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i4 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i4);
                        byteBufferWrap.position(byteBufferWrap.position() + i4);
                        lx3Var.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (lx3Var.c != 1 || !"__NULL__".equals(lx3Var.b[0])) {
                        return lx3Var;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            udk.g("Could not decrypt value. ", e.getMessage(), e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (d(str)) {
            throw new SecurityException(ohs0.n(str, " is a reserved key for the encryption keyset."));
        }
        return this.f36402a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new swn(this, this.f36402a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f36402a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.e.b(ev5.a(entry.getKey()), this.c.getBytes()), StandardCharsets.UTF_8);
                    String str2 = str.equals("__NULL__") ? null : str;
                    map.put(str2, c(str2));
                } catch (GeneralSecurityException e) {
                    udk.g("Could not decrypt key. ", e.getMessage(), e);
                    return null;
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objC = c(str);
        return objC instanceof Float ? ((Float) objC).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objC = c(str);
        Set lx3Var = objC instanceof Set ? (Set) objC : new lx3(0);
        return lx3Var.size() > 0 ? lx3Var : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
