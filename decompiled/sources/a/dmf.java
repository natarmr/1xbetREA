package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dmf extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dmf f6320a = new dmf(3, dth.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/counterstrike/impl/databinding/CybergameCs2StatisticItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_cs2_statistic_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivTeamImage;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivTeamImage);
        if (imageView != null) {
            i = R.id.tvAdr;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvAdr);
            if (textView != null) {
                i = R.id.tvAssist;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvAssist);
                if (textView2 != null) {
                    i = R.id.tvDead;
                    TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvDead);
                    if (textView3 != null) {
                        i = R.id.tvFirstPlayerAdr;
                        TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerAdr);
                        if (textView4 != null) {
                            i = R.id.tvFirstPlayerAssist;
                            TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerAssist);
                            if (textView5 != null) {
                                i = R.id.tvFirstPlayerDead;
                                TextView textView6 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerDead);
                                if (textView6 != null) {
                                    i = R.id.tvFirstPlayerHp;
                                    TextView textView7 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerHp);
                                    if (textView7 != null) {
                                        i = R.id.tvFirstPlayerKill;
                                        TextView textView8 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerKill);
                                        if (textView8 != null) {
                                            i = R.id.tvFirstPlayerMoney;
                                            TextView textView9 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerMoney);
                                            if (textView9 != null) {
                                                i = R.id.tvFirstPlayerName;
                                                TextView textView10 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerName);
                                                if (textView10 != null) {
                                                    i = R.id.tvFivePlayerAdr;
                                                    TextView textView11 = (TextView) yum0.f(viewInflate, R.id.tvFivePlayerAdr);
                                                    if (textView11 != null) {
                                                        i = R.id.tvFivePlayerAssist;
                                                        TextView textView12 = (TextView) yum0.f(viewInflate, R.id.tvFivePlayerAssist);
                                                        if (textView12 != null) {
                                                            i = R.id.tvFivePlayerDead;
                                                            TextView textView13 = (TextView) yum0.f(viewInflate, R.id.tvFivePlayerDead);
                                                            if (textView13 != null) {
                                                                i = R.id.tvFivePlayerHp;
                                                                TextView textView14 = (TextView) yum0.f(viewInflate, R.id.tvFivePlayerHp);
                                                                if (textView14 != null) {
                                                                    i = R.id.tvFivePlayerKill;
                                                                    TextView textView15 = (TextView) yum0.f(viewInflate, R.id.tvFivePlayerKill);
                                                                    if (textView15 != null) {
                                                                        i = R.id.tvFivePlayerMoney;
                                                                        TextView textView16 = (TextView) yum0.f(viewInflate, R.id.tvFivePlayerMoney);
                                                                        if (textView16 != null) {
                                                                            i = R.id.tvFivePlayerName;
                                                                            TextView textView17 = (TextView) yum0.f(viewInflate, R.id.tvFivePlayerName);
                                                                            if (textView17 != null) {
                                                                                i = R.id.tvFourPlayerAdr;
                                                                                TextView textView18 = (TextView) yum0.f(viewInflate, R.id.tvFourPlayerAdr);
                                                                                if (textView18 != null) {
                                                                                    i = R.id.tvFourPlayerAssist;
                                                                                    TextView textView19 = (TextView) yum0.f(viewInflate, R.id.tvFourPlayerAssist);
                                                                                    if (textView19 != null) {
                                                                                        i = R.id.tvFourPlayerDead;
                                                                                        TextView textView20 = (TextView) yum0.f(viewInflate, R.id.tvFourPlayerDead);
                                                                                        if (textView20 != null) {
                                                                                            i = R.id.tvFourPlayerHp;
                                                                                            TextView textView21 = (TextView) yum0.f(viewInflate, R.id.tvFourPlayerHp);
                                                                                            if (textView21 != null) {
                                                                                                i = R.id.tvFourPlayerKill;
                                                                                                TextView textView22 = (TextView) yum0.f(viewInflate, R.id.tvFourPlayerKill);
                                                                                                if (textView22 != null) {
                                                                                                    i = R.id.tvFourPlayerMoney;
                                                                                                    TextView textView23 = (TextView) yum0.f(viewInflate, R.id.tvFourPlayerMoney);
                                                                                                    if (textView23 != null) {
                                                                                                        i = R.id.tvFourPlayerName;
                                                                                                        TextView textView24 = (TextView) yum0.f(viewInflate, R.id.tvFourPlayerName);
                                                                                                        if (textView24 != null) {
                                                                                                            i = R.id.tvHp;
                                                                                                            TextView textView25 = (TextView) yum0.f(viewInflate, R.id.tvHp);
                                                                                                            if (textView25 != null) {
                                                                                                                i = R.id.tvKill;
                                                                                                                TextView textView26 = (TextView) yum0.f(viewInflate, R.id.tvKill);
                                                                                                                if (textView26 != null) {
                                                                                                                    i = R.id.tvMoney;
                                                                                                                    TextView textView27 = (TextView) yum0.f(viewInflate, R.id.tvMoney);
                                                                                                                    if (textView27 != null) {
                                                                                                                        i = R.id.tvSecondPlayerAdr;
                                                                                                                        TextView textView28 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerAdr);
                                                                                                                        if (textView28 != null) {
                                                                                                                            i = R.id.tvSecondPlayerAssist;
                                                                                                                            TextView textView29 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerAssist);
                                                                                                                            if (textView29 != null) {
                                                                                                                                i = R.id.tvSecondPlayerDead;
                                                                                                                                TextView textView30 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerDead);
                                                                                                                                if (textView30 != null) {
                                                                                                                                    i = R.id.tvSecondPlayerHp;
                                                                                                                                    TextView textView31 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerHp);
                                                                                                                                    if (textView31 != null) {
                                                                                                                                        i = R.id.tvSecondPlayerKill;
                                                                                                                                        TextView textView32 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerKill);
                                                                                                                                        if (textView32 != null) {
                                                                                                                                            i = R.id.tvSecondPlayerMoney;
                                                                                                                                            TextView textView33 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerMoney);
                                                                                                                                            if (textView33 != null) {
                                                                                                                                                i = R.id.tvSecondPlayerName;
                                                                                                                                                TextView textView34 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerName);
                                                                                                                                                if (textView34 != null) {
                                                                                                                                                    i = R.id.tvTeamName;
                                                                                                                                                    TextView textView35 = (TextView) yum0.f(viewInflate, R.id.tvTeamName);
                                                                                                                                                    if (textView35 != null) {
                                                                                                                                                        i = R.id.tvThirdPlayerAdr;
                                                                                                                                                        TextView textView36 = (TextView) yum0.f(viewInflate, R.id.tvThirdPlayerAdr);
                                                                                                                                                        if (textView36 != null) {
                                                                                                                                                            i = R.id.tvThirdPlayerAssist;
                                                                                                                                                            TextView textView37 = (TextView) yum0.f(viewInflate, R.id.tvThirdPlayerAssist);
                                                                                                                                                            if (textView37 != null) {
                                                                                                                                                                i = R.id.tvThirdPlayerDead;
                                                                                                                                                                TextView textView38 = (TextView) yum0.f(viewInflate, R.id.tvThirdPlayerDead);
                                                                                                                                                                if (textView38 != null) {
                                                                                                                                                                    i = R.id.tvThirdPlayerHp;
                                                                                                                                                                    TextView textView39 = (TextView) yum0.f(viewInflate, R.id.tvThirdPlayerHp);
                                                                                                                                                                    if (textView39 != null) {
                                                                                                                                                                        i = R.id.tvThirdPlayerKill;
                                                                                                                                                                        TextView textView40 = (TextView) yum0.f(viewInflate, R.id.tvThirdPlayerKill);
                                                                                                                                                                        if (textView40 != null) {
                                                                                                                                                                            i = R.id.tvThirdPlayerMoney;
                                                                                                                                                                            TextView textView41 = (TextView) yum0.f(viewInflate, R.id.tvThirdPlayerMoney);
                                                                                                                                                                            if (textView41 != null) {
                                                                                                                                                                                i = R.id.tvThirdPlayerName;
                                                                                                                                                                                TextView textView42 = (TextView) yum0.f(viewInflate, R.id.tvThirdPlayerName);
                                                                                                                                                                                if (textView42 != null) {
                                                                                                                                                                                    i = R.id.vHeader;
                                                                                                                                                                                    View viewF = yum0.f(viewInflate, R.id.vHeader);
                                                                                                                                                                                    if (viewF != null) {
                                                                                                                                                                                        return new dth((ConstraintLayout) viewInflate, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, viewF);
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
