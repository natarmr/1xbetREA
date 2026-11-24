package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class snf extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final snf f32491a = new snf(3, gth.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/counterstrike/impl/databinding/CybergameCs2WeaponItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_cs2_weapon_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.imgFirstPlayerFirstWeapon;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.imgFirstPlayerFirstWeapon);
        if (imageView != null) {
            i = R.id.imgFirstPlayerFiveWeapon;
            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.imgFirstPlayerFiveWeapon);
            if (imageView2 != null) {
                i = R.id.imgFirstPlayerFourWeapon;
                ImageView imageView3 = (ImageView) yum0.f(viewInflate, R.id.imgFirstPlayerFourWeapon);
                if (imageView3 != null) {
                    i = R.id.imgFirstPlayerInfo;
                    ImageView imageView4 = (ImageView) yum0.f(viewInflate, R.id.imgFirstPlayerInfo);
                    if (imageView4 != null) {
                        i = R.id.imgFirstPlayerSecondWeapon;
                        ImageView imageView5 = (ImageView) yum0.f(viewInflate, R.id.imgFirstPlayerSecondWeapon);
                        if (imageView5 != null) {
                            i = R.id.imgFirstPlayerThirdWeapon;
                            ImageView imageView6 = (ImageView) yum0.f(viewInflate, R.id.imgFirstPlayerThirdWeapon);
                            if (imageView6 != null) {
                                i = R.id.imgFivePlayerFirstWeapon;
                                ImageView imageView7 = (ImageView) yum0.f(viewInflate, R.id.imgFivePlayerFirstWeapon);
                                if (imageView7 != null) {
                                    i = R.id.imgFivePlayerFiveWeapon;
                                    ImageView imageView8 = (ImageView) yum0.f(viewInflate, R.id.imgFivePlayerFiveWeapon);
                                    if (imageView8 != null) {
                                        i = R.id.imgFivePlayerFourWeapon;
                                        ImageView imageView9 = (ImageView) yum0.f(viewInflate, R.id.imgFivePlayerFourWeapon);
                                        if (imageView9 != null) {
                                            i = R.id.imgFivePlayerInfo;
                                            ImageView imageView10 = (ImageView) yum0.f(viewInflate, R.id.imgFivePlayerInfo);
                                            if (imageView10 != null) {
                                                i = R.id.imgFivePlayerSecondWeapon;
                                                ImageView imageView11 = (ImageView) yum0.f(viewInflate, R.id.imgFivePlayerSecondWeapon);
                                                if (imageView11 != null) {
                                                    i = R.id.imgFivePlayerThirdWeapon;
                                                    ImageView imageView12 = (ImageView) yum0.f(viewInflate, R.id.imgFivePlayerThirdWeapon);
                                                    if (imageView12 != null) {
                                                        i = R.id.imgFourPlayerFirstWeapon;
                                                        ImageView imageView13 = (ImageView) yum0.f(viewInflate, R.id.imgFourPlayerFirstWeapon);
                                                        if (imageView13 != null) {
                                                            i = R.id.imgFourPlayerFiveWeapon;
                                                            ImageView imageView14 = (ImageView) yum0.f(viewInflate, R.id.imgFourPlayerFiveWeapon);
                                                            if (imageView14 != null) {
                                                                i = R.id.imgFourPlayerFourWeapon;
                                                                ImageView imageView15 = (ImageView) yum0.f(viewInflate, R.id.imgFourPlayerFourWeapon);
                                                                if (imageView15 != null) {
                                                                    i = R.id.imgFourPlayerInfo;
                                                                    ImageView imageView16 = (ImageView) yum0.f(viewInflate, R.id.imgFourPlayerInfo);
                                                                    if (imageView16 != null) {
                                                                        i = R.id.imgFourPlayerSecondWeapon;
                                                                        ImageView imageView17 = (ImageView) yum0.f(viewInflate, R.id.imgFourPlayerSecondWeapon);
                                                                        if (imageView17 != null) {
                                                                            i = R.id.imgFourPlayerThirdWeapon;
                                                                            ImageView imageView18 = (ImageView) yum0.f(viewInflate, R.id.imgFourPlayerThirdWeapon);
                                                                            if (imageView18 != null) {
                                                                                i = R.id.imgSecondPlayerFirstWeapon;
                                                                                ImageView imageView19 = (ImageView) yum0.f(viewInflate, R.id.imgSecondPlayerFirstWeapon);
                                                                                if (imageView19 != null) {
                                                                                    i = R.id.imgSecondPlayerFiveWeapon;
                                                                                    ImageView imageView20 = (ImageView) yum0.f(viewInflate, R.id.imgSecondPlayerFiveWeapon);
                                                                                    if (imageView20 != null) {
                                                                                        i = R.id.imgSecondPlayerFourWeapon;
                                                                                        ImageView imageView21 = (ImageView) yum0.f(viewInflate, R.id.imgSecondPlayerFourWeapon);
                                                                                        if (imageView21 != null) {
                                                                                            i = R.id.imgSecondPlayerInfo;
                                                                                            ImageView imageView22 = (ImageView) yum0.f(viewInflate, R.id.imgSecondPlayerInfo);
                                                                                            if (imageView22 != null) {
                                                                                                i = R.id.imgSecondPlayerSecondWeapon;
                                                                                                ImageView imageView23 = (ImageView) yum0.f(viewInflate, R.id.imgSecondPlayerSecondWeapon);
                                                                                                if (imageView23 != null) {
                                                                                                    i = R.id.imgSecondPlayerThirdWeapon;
                                                                                                    ImageView imageView24 = (ImageView) yum0.f(viewInflate, R.id.imgSecondPlayerThirdWeapon);
                                                                                                    if (imageView24 != null) {
                                                                                                        i = R.id.imgThirdPlayerFirstWeapon;
                                                                                                        ImageView imageView25 = (ImageView) yum0.f(viewInflate, R.id.imgThirdPlayerFirstWeapon);
                                                                                                        if (imageView25 != null) {
                                                                                                            i = R.id.imgThirdPlayerFiveWeapon;
                                                                                                            ImageView imageView26 = (ImageView) yum0.f(viewInflate, R.id.imgThirdPlayerFiveWeapon);
                                                                                                            if (imageView26 != null) {
                                                                                                                i = R.id.imgThirdPlayerFourWeapon;
                                                                                                                ImageView imageView27 = (ImageView) yum0.f(viewInflate, R.id.imgThirdPlayerFourWeapon);
                                                                                                                if (imageView27 != null) {
                                                                                                                    i = R.id.imgThirdPlayerInfo;
                                                                                                                    ImageView imageView28 = (ImageView) yum0.f(viewInflate, R.id.imgThirdPlayerInfo);
                                                                                                                    if (imageView28 != null) {
                                                                                                                        i = R.id.imgThirdPlayerSecondWeapon;
                                                                                                                        ImageView imageView29 = (ImageView) yum0.f(viewInflate, R.id.imgThirdPlayerSecondWeapon);
                                                                                                                        if (imageView29 != null) {
                                                                                                                            i = R.id.imgThirdPlayerThirdWeapon;
                                                                                                                            ImageView imageView30 = (ImageView) yum0.f(viewInflate, R.id.imgThirdPlayerThirdWeapon);
                                                                                                                            if (imageView30 != null) {
                                                                                                                                i = R.id.ivFirstPlayerMainWeapon;
                                                                                                                                ImageView imageView31 = (ImageView) yum0.f(viewInflate, R.id.ivFirstPlayerMainWeapon);
                                                                                                                                if (imageView31 != null) {
                                                                                                                                    i = R.id.ivFivePlayerMainWeapon;
                                                                                                                                    ImageView imageView32 = (ImageView) yum0.f(viewInflate, R.id.ivFivePlayerMainWeapon);
                                                                                                                                    if (imageView32 != null) {
                                                                                                                                        i = R.id.ivFourPlayerMainWeapon;
                                                                                                                                        ImageView imageView33 = (ImageView) yum0.f(viewInflate, R.id.ivFourPlayerMainWeapon);
                                                                                                                                        if (imageView33 != null) {
                                                                                                                                            i = R.id.ivSecondPlayerMainWeapon;
                                                                                                                                            ImageView imageView34 = (ImageView) yum0.f(viewInflate, R.id.ivSecondPlayerMainWeapon);
                                                                                                                                            if (imageView34 != null) {
                                                                                                                                                i = R.id.ivTeamImage;
                                                                                                                                                ImageView imageView35 = (ImageView) yum0.f(viewInflate, R.id.ivTeamImage);
                                                                                                                                                if (imageView35 != null) {
                                                                                                                                                    i = R.id.ivThirdPlayerMainWeapon;
                                                                                                                                                    ImageView imageView36 = (ImageView) yum0.f(viewInflate, R.id.ivThirdPlayerMainWeapon);
                                                                                                                                                    if (imageView36 != null) {
                                                                                                                                                        i = R.id.tvFirstPlayerName;
                                                                                                                                                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerName);
                                                                                                                                                        if (textView != null) {
                                                                                                                                                            i = R.id.tvFivePlayerName;
                                                                                                                                                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvFivePlayerName);
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                i = R.id.tvFourPlayerName;
                                                                                                                                                                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvFourPlayerName);
                                                                                                                                                                if (textView3 != null) {
                                                                                                                                                                    i = R.id.tvSecondPlayerName;
                                                                                                                                                                    TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerName);
                                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                                        i = R.id.tvTeamName;
                                                                                                                                                                        TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvTeamName);
                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                            i = R.id.tvThirdPlayerName;
                                                                                                                                                                            TextView textView6 = (TextView) yum0.f(viewInflate, R.id.tvThirdPlayerName);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                i = R.id.tvTotalCash;
                                                                                                                                                                                TextView textView7 = (TextView) yum0.f(viewInflate, R.id.tvTotalCash);
                                                                                                                                                                                if (textView7 != null) {
                                                                                                                                                                                    i = R.id.vFirstPlayer;
                                                                                                                                                                                    View viewF = yum0.f(viewInflate, R.id.vFirstPlayer);
                                                                                                                                                                                    if (viewF != null) {
                                                                                                                                                                                        i = R.id.vFivePlayer;
                                                                                                                                                                                        View viewF2 = yum0.f(viewInflate, R.id.vFivePlayer);
                                                                                                                                                                                        if (viewF2 != null) {
                                                                                                                                                                                            i = R.id.vFourPlayer;
                                                                                                                                                                                            View viewF3 = yum0.f(viewInflate, R.id.vFourPlayer);
                                                                                                                                                                                            if (viewF3 != null) {
                                                                                                                                                                                                i = R.id.vHeader;
                                                                                                                                                                                                View viewF4 = yum0.f(viewInflate, R.id.vHeader);
                                                                                                                                                                                                if (viewF4 != null) {
                                                                                                                                                                                                    i = R.id.vSecondPlayer;
                                                                                                                                                                                                    View viewF5 = yum0.f(viewInflate, R.id.vSecondPlayer);
                                                                                                                                                                                                    if (viewF5 != null) {
                                                                                                                                                                                                        i = R.id.vThirdPlayer;
                                                                                                                                                                                                        View viewF6 = yum0.f(viewInflate, R.id.vThirdPlayer);
                                                                                                                                                                                                        if (viewF6 != null) {
                                                                                                                                                                                                            return new gth((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, imageView21, imageView22, imageView23, imageView24, imageView25, imageView26, imageView27, imageView28, imageView29, imageView30, imageView31, imageView32, imageView33, imageView34, imageView35, imageView36, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewF, viewF2, viewF3, viewF4, viewF5, viewF6);
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
