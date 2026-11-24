package a;

import android.R;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.BounceInterpolator;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z73 f3893a = new z73((byte) 0);
    public static final z73 b = new z73((byte) 1);
    public static final a83 c = new a83(new BounceInterpolator());
    public static final z73 d = new z73((byte) 2);
    public static final HashMap e;

    static {
        Integer numValueOf = Integer.valueOf(R.anim.linear_interpolator);
        z73 z73Var = ihn.d;
        Pair pair = new Pair(numValueOf, z73Var);
        Integer numValueOf2 = Integer.valueOf(R.interpolator.fast_out_linear_in);
        zsf zsfVar = ihn.c;
        Pair pair2 = new Pair(numValueOf2, zsfVar);
        Integer numValueOf3 = Integer.valueOf(R.interpolator.fast_out_slow_in);
        zsf zsfVar2 = ihn.f14788a;
        Pair pair3 = new Pair(numValueOf3, zsfVar2);
        Pair pair4 = new Pair(Integer.valueOf(R.interpolator.linear), z73Var);
        Integer numValueOf4 = Integer.valueOf(R.interpolator.linear_out_slow_in);
        zsf zsfVar3 = ihn.b;
        e = xp20.e(pair, pair2, pair3, pair4, new Pair(numValueOf4, zsfVar3), new Pair(numValueOf2, zsfVar), new Pair(numValueOf3, zsfVar2), new Pair(numValueOf4, zsfVar3));
    }

    public static final v73 a(int i, Resources.Theme theme, Resources resources) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        j5n0.C(xml);
        String name = xml.getName();
        if (Intrinsics.d(name, "set")) {
            return s1w0.e(xml, resources, theme, attributeSetAsAttributeSet);
        }
        if (Intrinsics.d(name, "objectAnimator")) {
            return s1w0.f(xml, resources, theme, attributeSetAsAttributeSet);
        }
        throw new XmlPullParserException(kng0.k("Unknown tag: ", xml.getName()));
    }
}
