package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y4o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y4o f42012a = new y4o(3, b1o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticCrystalOddsItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_crystal_odds_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.imgBlueCrystal;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.imgBlueCrystal);
        if (imageView != null) {
            i = R.id.imgCyanCrystal;
            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.imgCyanCrystal);
            if (imageView2 != null) {
                i = R.id.imgOrangeCrystal;
                ImageView imageView3 = (ImageView) yum0.f(viewInflate, R.id.imgOrangeCrystal);
                if (imageView3 != null) {
                    i = R.id.imgPurpleCrystal;
                    ImageView imageView4 = (ImageView) yum0.f(viewInflate, R.id.imgPurpleCrystal);
                    if (imageView4 != null) {
                        i = R.id.imgRedCrystal;
                        ImageView imageView5 = (ImageView) yum0.f(viewInflate, R.id.imgRedCrystal);
                        if (imageView5 != null) {
                            i = R.id.imgYellowCrystal;
                            ImageView imageView6 = (ImageView) yum0.f(viewInflate, R.id.imgYellowCrystal);
                            if (imageView6 != null) {
                                i = R.id.tvX5FirstValue;
                                if (((TextView) yum0.f(viewInflate, R.id.tvX5FirstValue)) != null) {
                                    i = R.id.tvX5FiveValue;
                                    if (((TextView) yum0.f(viewInflate, R.id.tvX5FiveValue)) != null) {
                                        i = R.id.tvX5FourValue;
                                        if (((TextView) yum0.f(viewInflate, R.id.tvX5FourValue)) != null) {
                                            i = R.id.tvX5SecondValue;
                                            if (((TextView) yum0.f(viewInflate, R.id.tvX5SecondValue)) != null) {
                                                i = R.id.tvX5SixValue;
                                                if (((TextView) yum0.f(viewInflate, R.id.tvX5SixValue)) != null) {
                                                    i = R.id.tvX5ThirdValue;
                                                    if (((TextView) yum0.f(viewInflate, R.id.tvX5ThirdValue)) != null) {
                                                        i = R.id.tvX5Value;
                                                        if (((TextView) yum0.f(viewInflate, R.id.tvX5Value)) != null) {
                                                            i = R.id.tvX6FirstValue;
                                                            if (((TextView) yum0.f(viewInflate, R.id.tvX6FirstValue)) != null) {
                                                                i = R.id.tvX6FiveValue;
                                                                if (((TextView) yum0.f(viewInflate, R.id.tvX6FiveValue)) != null) {
                                                                    i = R.id.tvX6FourValue;
                                                                    if (((TextView) yum0.f(viewInflate, R.id.tvX6FourValue)) != null) {
                                                                        i = R.id.tvX6SecondValue;
                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvX6SecondValue)) != null) {
                                                                            i = R.id.tvX6SixValue;
                                                                            if (((TextView) yum0.f(viewInflate, R.id.tvX6SixValue)) != null) {
                                                                                i = R.id.tvX6ThirdValue;
                                                                                if (((TextView) yum0.f(viewInflate, R.id.tvX6ThirdValue)) != null) {
                                                                                    i = R.id.tvX6Value;
                                                                                    if (((TextView) yum0.f(viewInflate, R.id.tvX6Value)) != null) {
                                                                                        i = R.id.tvX7FirstValue;
                                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvX7FirstValue)) != null) {
                                                                                            i = R.id.tvX7FiveValue;
                                                                                            if (((TextView) yum0.f(viewInflate, R.id.tvX7FiveValue)) != null) {
                                                                                                i = R.id.tvX7FourValue;
                                                                                                if (((TextView) yum0.f(viewInflate, R.id.tvX7FourValue)) != null) {
                                                                                                    i = R.id.tvX7SecondValue;
                                                                                                    if (((TextView) yum0.f(viewInflate, R.id.tvX7SecondValue)) != null) {
                                                                                                        i = R.id.tvX7SixValue;
                                                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvX7SixValue)) != null) {
                                                                                                            i = R.id.tvX7ThirdValue;
                                                                                                            if (((TextView) yum0.f(viewInflate, R.id.tvX7ThirdValue)) != null) {
                                                                                                                i = R.id.tvX7Value;
                                                                                                                if (((TextView) yum0.f(viewInflate, R.id.tvX7Value)) != null) {
                                                                                                                    i = R.id.tvX8FirstValue;
                                                                                                                    if (((TextView) yum0.f(viewInflate, R.id.tvX8FirstValue)) != null) {
                                                                                                                        i = R.id.tvX8FiveValue;
                                                                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvX8FiveValue)) != null) {
                                                                                                                            i = R.id.tvX8FourValue;
                                                                                                                            if (((TextView) yum0.f(viewInflate, R.id.tvX8FourValue)) != null) {
                                                                                                                                i = R.id.tvX8SecondValue;
                                                                                                                                if (((TextView) yum0.f(viewInflate, R.id.tvX8SecondValue)) != null) {
                                                                                                                                    i = R.id.tvX8SixValue;
                                                                                                                                    if (((TextView) yum0.f(viewInflate, R.id.tvX8SixValue)) != null) {
                                                                                                                                        i = R.id.tvX8ThirdValue;
                                                                                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvX8ThirdValue)) != null) {
                                                                                                                                            i = R.id.tvX8Value;
                                                                                                                                            if (((TextView) yum0.f(viewInflate, R.id.tvX8Value)) != null) {
                                                                                                                                                i = R.id.tvX9FirstValue;
                                                                                                                                                if (((TextView) yum0.f(viewInflate, R.id.tvX9FirstValue)) != null) {
                                                                                                                                                    i = R.id.tvX9FiveValue;
                                                                                                                                                    if (((TextView) yum0.f(viewInflate, R.id.tvX9FiveValue)) != null) {
                                                                                                                                                        i = R.id.tvX9FourValue;
                                                                                                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvX9FourValue)) != null) {
                                                                                                                                                            i = R.id.tvX9SecondValue;
                                                                                                                                                            if (((TextView) yum0.f(viewInflate, R.id.tvX9SecondValue)) != null) {
                                                                                                                                                                i = R.id.tvX9SixValue;
                                                                                                                                                                if (((TextView) yum0.f(viewInflate, R.id.tvX9SixValue)) != null) {
                                                                                                                                                                    i = R.id.tvX9ThirdValue;
                                                                                                                                                                    if (((TextView) yum0.f(viewInflate, R.id.tvX9ThirdValue)) != null) {
                                                                                                                                                                        i = R.id.tvX9Value;
                                                                                                                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvX9Value)) != null) {
                                                                                                                                                                            return new b1o0((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, imageView4, imageView5, imageView6);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
