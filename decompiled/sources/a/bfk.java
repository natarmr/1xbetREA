package a;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bfk extends g8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2507a;
    public final /* synthetic */ AbstractCollection b;

    public /* synthetic */ bfk(AbstractCollection abstractCollection, byte b) {
        this.f2507a = b;
        this.b = abstractCollection;
    }

    @Override // a.g8x
    public final void t(mp9 mp9Var) {
        byte b = this.f2507a;
        AbstractCollection abstractCollection = this.b;
        switch (b) {
            case 0:
                mp9Var.getClass();
                sf80.r(mp9Var, null);
                ((ArrayList) abstractCollection).add(mp9Var);
                return;
            default:
                if (mp9Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "fakeOverride", "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4", "addFakeOverride"));
                }
                sf80.r(mp9Var, null);
                ((LinkedHashSet) abstractCollection).add(mp9Var);
                return;
        }
    }

    @Override // a.g8x
    public final void y(mp9 mp9Var, mp9 mp9Var2) {
        switch (this.f2507a) {
            case 0:
                if (mp9Var2 instanceof oer) {
                    oer oerVar = (oer) mp9Var2;
                    Map linkedHashMap = oerVar.Z;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        oerVar.Z = linkedHashMap;
                    }
                    linkedHashMap.put(ifk.f14692a, mp9Var);
                }
                break;
        }
    }

    private final void b0(mp9 mp9Var, mp9 mp9Var2) {
    }
}
