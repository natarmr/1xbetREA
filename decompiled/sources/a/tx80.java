package a;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public enum tx80 {
    DEFAULT,
    ONJABET,
    ONE_X_CASINO_38,
    APP_300,
    B2B_PLATFORM;

    private static final /* synthetic */ a0o $ENTRIES = dtb.B(values());
    public static final a Companion = new a(null);

    public static a0o getEntries() {
        return $ENTRIES;
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final tx80 find(String str) {
            str.getClass();
            switch (str.hashCode()) {
                case -1372644884:
                    if (str.equals("oneXCasino38")) {
                        return tx80.ONE_X_CASINO_38;
                    }
                    break;
                case -1316219525:
                    if (str.equals("onjabet")) {
                        return tx80.ONJABET;
                    }
                    break;
                case -1130743256:
                    if (str.equals("top.apps300")) {
                        return tx80.APP_300;
                    }
                    break;
                case -405508923:
                    if (str.equals("b2bplatform")) {
                        return tx80.B2B_PLATFORM;
                    }
                    break;
            }
            return tx80.DEFAULT;
        }

        private a() {
        }
    }
}
