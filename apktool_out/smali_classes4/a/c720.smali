.class public final La/c720;
.super La/stl;
.source "SourceFile"

# interfaces
.implements La/i620;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/c6q;",
        ">;",
        "La/i620;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "La/c720;",
        "La/stl;",
        "La/c6q;",
        "La/i620;",
        "<init>",
        "()V",
        "a/wsz",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final p2:La/wsz;

.field public static final synthetic q2:[La/iiy;


# instance fields
.field public g2:La/wdk0;

.field public final h2:La/nae0;

.field public final i2:La/kiu0;

.field public final j2:La/khf0;

.field public final k2:La/yzn0;

.field public l2:La/xze;

.field public final m2:La/xp6;

.field public n2:La/wjk;

.field public o2:La/fiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/c720;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetDialogMakeBetBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "finBetInfoModel"

    .line 16
    .line 17
    const-string v5, "getFinBetInfoModel()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "requestKey"

    .line 25
    .line 26
    const-string v6, "getRequestKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/c720;->q2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/wsz;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/c720;->p2:La/wsz;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/s620;->a:La/s620;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/c720;->h2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/n620;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/n620;-><init>(La/c720;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/pv10;

    .line 19
    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/pv10;

    .line 28
    .line 29
    const/16 v4, 0xa

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/kn20;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/j210;

    .line 47
    .line 48
    const/16 v5, 0x1d

    .line 49
    .line 50
    invoke-direct {v3, v1, v5}, La/j210;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v5, La/y620;

    .line 54
    .line 55
    const/4 v6, 0x1

    .line 56
    invoke-direct {v5, v1, v6}, La/y620;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/c720;->i2:La/kiu0;

    .line 64
    .line 65
    new-instance v0, La/khf0;

    .line 66
    .line 67
    const-string v1, "EXTRA_BET_INFO"

    .line 68
    .line 69
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, La/c720;->j2:La/khf0;

    .line 73
    .line 74
    new-instance v0, La/yzn0;

    .line 75
    .line 76
    const-string v1, "REQUEST_KEY"

    .line 77
    .line 78
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/c720;->k2:La/yzn0;

    .line 82
    .line 83
    new-instance v0, La/xp6;

    .line 84
    .line 85
    invoke-direct {v0, p0, v4}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, La/c720;->m2:La/xp6;

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/c720;->V0()La/c6q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final R0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v1, La/g2v;

    .line 20
    .line 21
    invoke-direct {v1, p0}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 25
    .line 26
    invoke-static {v0, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final S0()V
    .locals 6

    .line 1
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, La/c720;->V0()La/c6q;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/c6q;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 34
    .line 35
    .line 36
    new-instance v0, La/xze;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, La/n6r;->b()V

    .line 50
    .line 51
    .line 52
    iget-object v4, v4, La/n6r;->c:La/glz;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object v5, La/iun;->a:La/iun;

    .line 58
    .line 59
    invoke-direct {v0, v3, v4, v5, v1}, La/xze;-><init>(Landroidx/fragment/app/e;La/glz;Ljava/util/List;B)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, La/c720;->l2:La/xze;

    .line 63
    .line 64
    new-instance v0, La/s6q;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-direct {v0, v3}, La/s6q;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, La/stl;->K0(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    new-instance v3, La/sbx0;

    .line 77
    .line 78
    const/16 v4, 0xd

    .line 79
    .line 80
    invoke-direct {v3, v4}, La/sbx0;-><init>(B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, La/c720;->V0()La/c6q;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget-object v4, v4, La/c6q;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 88
    .line 89
    invoke-virtual {v3, v4}, La/sbx0;->b(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/c720;->V0()La/c6q;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-object v3, v3, La/c6q;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 97
    .line 98
    iget-object v4, p0, La/c720;->m2:La/xp6;

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, La/c720;->W0()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-object v3, v3, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->d:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, v3}, La/s6q;->setInstrumentName(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, La/c720;->W0()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iget-wide v3, v3, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->f:D

    .line 117
    .line 118
    invoke-virtual {p0, v3, v4}, La/c720;->X0(D)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, La/c720;->W0()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iget-boolean v3, v3, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    .line 126
    .line 127
    invoke-virtual {v0, v3}, La/s6q;->setPriceLevelState(Z)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;

    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    const/4 v4, 0x0

    .line 137
    const/4 v5, 0x6

    .line 138
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 142
    .line 143
    .line 144
    const v3, 0x7f130e55

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setFirstButtonText(I)V

    .line 148
    .line 149
    .line 150
    const v3, 0x7f130e56

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setSecondButtonText(I)V

    .line 154
    .line 155
    .line 156
    const v3, 0x7f140197

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setFirstButtonStyle(I)V

    .line 160
    .line 161
    .line 162
    const v3, 0x7f140188

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setSecondButtonStyle(I)V

    .line 166
    .line 167
    .line 168
    new-instance v3, La/o620;

    .line 169
    .line 170
    invoke-direct {v3, p0, v2}, La/o620;-><init>(La/c720;B)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setFirstButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    .line 175
    .line 176
    new-instance v2, La/o620;

    .line 177
    .line 178
    invoke-direct {v2, p0, v1}, La/o620;-><init>(La/c720;B)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setSecondButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v0}, La/stl;->J0(Landroid/view/View;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public final T0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/r6q;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/r6q;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/r6q;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0}, La/c720;->W0()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-class v3, La/c720;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    sget-object v4, La/ua20;->b:La/ua20;

    .line 70
    .line 71
    invoke-virtual {v2, v0, v1, v3, v4}, La/r6q;->a(La/i1w0;Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;Ljava/lang/String;La/ua20;)La/hhi;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, v0, La/hhi;->a:La/wdk0;

    .line 76
    .line 77
    iput-object v1, p0, La/c720;->g2:La/wdk0;

    .line 78
    .line 79
    invoke-virtual {v0}, La/hhi;->c()La/fiu0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/c720;->o2:La/fiu0;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 87
    .line 88
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final U0()V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    iget-object v8, v2, La/c720;->i2:La/kiu0;

    .line 4
    .line 5
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/kn20;

    .line 10
    .line 11
    iget-object v0, v0, La/kn20;->j:La/p7m0;

    .line 12
    .line 13
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    new-instance v0, La/dm10;

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    const/16 v7, 0x1a

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    const-class v3, La/c720;

    .line 24
    .line 25
    const-string v4, "handleAuthState"

    .line 26
    .line 27
    const-string v5, "handleAuthState(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/viewmodel/MakeBetViewModel$AuthState;)V"

    .line 28
    .line 29
    invoke-direct/range {v0 .. v7}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 30
    .line 31
    .line 32
    sget-object v1, La/lkz;->a:La/lkz;

    .line 33
    .line 34
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v4, La/v620;

    .line 47
    .line 48
    const/4 v14, 0x0

    .line 49
    invoke-direct {v4, v9, v1, v0, v14}, La/v620;-><init>(La/xae0;La/clz;La/dm10;La/yje;)V

    .line 50
    .line 51
    .line 52
    const/4 v9, 0x3

    .line 53
    invoke-static {v2, v14, v14, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, La/kn20;

    .line 61
    .line 62
    iget-object v0, v0, La/kn20;->h:La/p7m0;

    .line 63
    .line 64
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    new-instance v0, La/dm10;

    .line 69
    .line 70
    const/16 v7, 0x1b

    .line 71
    .line 72
    const/4 v1, 0x2

    .line 73
    const-string v4, "handleCoefState"

    .line 74
    .line 75
    const-string v5, "handleCoefState(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/viewmodel/MakeBetViewModel$CoefficientState;)V"

    .line 76
    .line 77
    move-object/from16 v2, p0

    .line 78
    .line 79
    invoke-direct/range {v0 .. v7}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 80
    .line 81
    .line 82
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    invoke-interface {v12}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v10, La/v620;

    .line 95
    .line 96
    const/4 v15, 0x0

    .line 97
    move-object v13, v0

    .line 98
    invoke-direct/range {v10 .. v15}, La/v620;-><init>(La/xae0;La/clz;La/dm10;La/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v14, v14, v10, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/kn20;

    .line 109
    .line 110
    iget-object v0, v0, La/kn20;->i:La/p7m0;

    .line 111
    .line 112
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    new-instance v0, La/dm10;

    .line 117
    .line 118
    const/16 v7, 0x1c

    .line 119
    .line 120
    const/4 v1, 0x2

    .line 121
    const-string v4, "handlePrice"

    .line 122
    .line 123
    const-string v5, "handlePrice(D)V"

    .line 124
    .line 125
    invoke-direct/range {v0 .. v7}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 126
    .line 127
    .line 128
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    invoke-interface {v12}, La/clz;->x()La/glz;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    new-instance v10, La/v620;

    .line 141
    .line 142
    move-object v13, v0

    .line 143
    invoke-direct/range {v10 .. v15}, La/v620;-><init>(La/xae0;La/clz;La/dm10;La/yje;C)V

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v14, v14, v10, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/wjk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/wjk;

    .line 9
    .line 10
    iput-object p1, p0, La/c720;->n2:La/wjk;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, La/c720;->n2:La/wjk;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final V0()La/c6q;
    .locals 2

    .line 1
    sget-object v0, La/c720;->q2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/c720;->h2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/c6q;

    .line 16
    .line 17
    return-object p0
.end method

.method public final W0()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;
    .locals 2

    .line 1
    sget-object v0, La/c720;->q2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/c720;->j2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 13
    .line 14
    return-object p0
.end method

.method public final X0(D)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/vfk;->f:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-static {v0}, La/pym0;->i(Landroid/view/ViewGroup;)La/ihu0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    move-object v2, v3

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    move-object v4, v2

    .line 34
    check-cast v4, Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    instance-of v5, v4, Landroid/view/ViewGroup;

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    check-cast v4, Landroid/view/ViewGroup;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v4, v3

    .line 47
    :goto_0
    if-eqz v4, :cond_2

    .line 48
    .line 49
    new-instance v5, La/jhu0;

    .line 50
    .line 51
    invoke-direct {v5, v4}, La/jhu0;-><init>(Landroid/view/ViewGroup;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move-object v5, v3

    .line 56
    :goto_1
    if-eqz v5, :cond_3

    .line 57
    .line 58
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/util/Iterator;

    .line 85
    .line 86
    invoke-static {v1}, La/w3d;->z(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    :goto_3
    check-cast v2, Landroid/view/View;

    .line 91
    .line 92
    instance-of v0, v2, La/s6q;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    move-object v3, v2

    .line 97
    check-cast v3, La/s6q;

    .line 98
    .line 99
    :cond_5
    if-eqz v3, :cond_6

    .line 100
    .line 101
    sget-object v0, La/pn40;->a:La/pn40;

    .line 102
    .line 103
    invoke-virtual {p0}, La/c720;->W0()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    iget p0, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    invoke-static {p1, p2, p0, v0}, La/pn40;->j(DIZ)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v3, p0}, La/s6q;->setPriceLevel(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    return-void
.end method

.method public final Z()V
    .locals 4

    .line 1
    invoke-super {p0}, La/stl;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/c720;->V0()La/c6q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/c6q;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, La/c720;->l2:La/xze;

    .line 15
    .line 16
    iget-object v0, p0, La/c720;->n2:La/wjk;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, La/wjk;->l(La/wjk;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, La/c720;->V0()La/c6q;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, La/c6q;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 28
    .line 29
    iget-object v1, p0, La/c720;->m2:La/xp6;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, La/c720;->q2:[La/iiy;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    aget-object v0, v0, v1

    .line 38
    .line 39
    iget-object v1, p0, La/c720;->k2:La/yzn0;

    .line 40
    .line 41
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    new-instance v2, Lkotlin/Pair;

    .line 50
    .line 51
    const-string v3, "REQUEST_FINISH_MAKE_BET_DIALOG_KEY"

    .line 52
    .line 53
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
