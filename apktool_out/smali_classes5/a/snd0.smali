.class public final La/snd0;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/mhn0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/snd0;",
        "La/stl;",
        "La/mhn0;",
        "<init>",
        "()V",
        "a/rl70",
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
.field public static final n2:La/rl70;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final g2:La/yzn0;

.field public final h2:La/yzn0;

.field public final i2:La/n0o0;

.field public final j2:La/n0o0;

.field public k2:La/fiu0;

.field public l2:La/wdk0;

.field public final m2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/snd0;

    .line 4
    .line 5
    const-string v2, "balanceScreenTypeBundle"

    .line 6
    .line 7
    const-string v3, "getBalanceScreenTypeBundle()Lorg/xplatform/balance/model/BalanceScreenType;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "quickBetItemBundle"

    .line 16
    .line 17
    const-string v5, "getQuickBetItemBundle()Lorg/xplatform/make_bet_settings/impl/presentation/adapter/quickbets/model/SettingsMakeBetQuickBetsEditorItem;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/snd0;->o2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/rl70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/snd0;->n2:La/rl70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yzn0;

    .line 5
    .line 6
    const-string v1, "BALANCE_TYPE_BUNDLE_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/snd0;->g2:La/yzn0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "QUICK_BET_EDITOR_ITEM_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/snd0;->h2:La/yzn0;

    .line 21
    .line 22
    new-instance v0, La/rnd0;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, La/rnd0;-><init>(La/snd0;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, La/snd0;->i2:La/n0o0;

    .line 33
    .line 34
    new-instance v0, La/rnd0;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-direct {v0, p0, v1}, La/rnd0;-><init>(La/snd0;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, La/snd0;->j2:La/n0o0;

    .line 45
    .line 46
    new-instance v0, La/rnd0;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    invoke-direct {v0, p0, v1}, La/rnd0;-><init>(La/snd0;B)V

    .line 50
    .line 51
    .line 52
    new-instance v1, La/f1d0;

    .line 53
    .line 54
    const/16 v2, 0x17

    .line 55
    .line 56
    invoke-direct {v1, p0, v2}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    sget-object v2, La/wez;->b:La/wez;

    .line 60
    .line 61
    new-instance v3, La/f1d0;

    .line 62
    .line 63
    const/16 v4, 0x18

    .line 64
    .line 65
    invoke-direct {v3, v1, v4}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-class v2, La/qnd0;

    .line 73
    .line 74
    sget-object v3, La/sre0;->a:La/tre0;

    .line 75
    .line 76
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    new-instance v3, La/ync0;

    .line 81
    .line 82
    const/16 v4, 0x1a

    .line 83
    .line 84
    invoke-direct {v3, v1, v4}, La/ync0;-><init>(La/a8z;B)V

    .line 85
    .line 86
    .line 87
    new-instance v4, La/ync0;

    .line 88
    .line 89
    const/16 v5, 0x1b

    .line 90
    .line 91
    invoke-direct {v4, v1, v5}, La/ync0;-><init>(La/a8z;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, La/snd0;->m2:La/kiu0;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/snd0;->V0()La/mhn0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 10

    .line 1
    new-instance v0, La/kp8;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const v2, 0x7f13026c

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v2, 0x7f1404af

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, La/kp8;-><init>(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, La/stl;->I0(La/kp8;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/snd0;->m2:La/kiu0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/qnd0;

    .line 33
    .line 34
    sget-object v1, La/snd0;->o2:[La/iiy;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    aget-object v1, v1, v2

    .line 38
    .line 39
    iget-object v3, p0, La/snd0;->h2:La/yzn0;

    .line 40
    .line 41
    invoke-virtual {v3, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, La/h4j0;

    .line 46
    .line 47
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, La/ond0;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-direct {v4, v0, v9}, La/ond0;-><init>(La/qnd0;B)V

    .line 55
    .line 56
    .line 57
    iget-object v5, v0, La/qnd0;->i:La/mne;

    .line 58
    .line 59
    iget-object v6, v5, La/mne;->a:La/rwj;

    .line 60
    .line 61
    new-instance v7, La/pnd0;

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-direct {v7, v0, v1, v5, v9}, La/pnd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    const/16 v8, 0xa

    .line 68
    .line 69
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/snd0;->V0()La/mhn0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 77
    .line 78
    new-instance v1, La/tjj;

    .line 79
    .line 80
    const/16 v3, 0xd

    .line 81
    .line 82
    const/4 v4, 0x2

    .line 83
    invoke-direct {v1, v3, v4}, La/tjj;-><init>(II)V

    .line 84
    .line 85
    .line 86
    new-array v3, v2, [Landroid/text/InputFilter;

    .line 87
    .line 88
    aput-object v1, v3, v9

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setFilters([Landroid/text/InputFilter;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, La/snd0;->V0()La/mhn0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 98
    .line 99
    iget-object v1, p0, La/snd0;->j2:La/n0o0;

    .line 100
    .line 101
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, La/da0;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, La/snd0;->V0()La/mhn0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v0, v0, La/mhn0;->d:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;

    .line 120
    .line 121
    new-instance v1, La/l910;

    .line 122
    .line 123
    const/16 v3, 0x1a

    .line 124
    .line 125
    invoke-direct {v1, p0, v3}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, La/snd0;->V0()La/mhn0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v0, v0, La/mhn0;->e:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetSpacing;

    .line 136
    .line 137
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const v3, 0x7f0706f8

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetSpacing;->setSpace(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, La/snd0;->V0()La/mhn0;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, La/mhn0;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetSpacing;

    .line 156
    .line 157
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetSpacing;->setSpace(I)V

    .line 166
    .line 167
    .line 168
    iget-object p0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 169
    .line 170
    if-eqz p0, :cond_0

    .line 171
    .line 172
    iput-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 173
    .line 174
    :cond_0
    return-void
.end method

.method public final U0()V
    .locals 11

    .line 1
    iget-object v8, p0, La/snd0;->m2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qnd0;

    .line 8
    .line 9
    iget-object v9, v0, La/qnd0;->m:La/p7m0;

    .line 10
    .line 11
    new-instance v0, La/jjc0;

    .line 12
    .line 13
    const/4 v6, 0x4

    .line 14
    const/16 v7, 0xb

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const-class v3, La/snd0;

    .line 18
    .line 19
    const-string v4, "updateUiState"

    .line 20
    .line 21
    const-string v5, "updateUiState(Lorg/xplatform/make_bet_settings/impl/presentation/model/EditSumBottomSheetScreenState;)V"

    .line 22
    .line 23
    move-object v2, p0

    .line 24
    invoke-direct/range {v0 .. v7}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 25
    .line 26
    .line 27
    sget-object v1, La/lkz;->a:La/lkz;

    .line 28
    .line 29
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v4, La/fxc0;

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    invoke-direct {v4, v9, v1, v0, v10}, La/fxc0;-><init>(La/p7m0;La/clz;La/jjc0;La/yje;)V

    .line 45
    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    invoke-static {v2, v10, v10, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/qnd0;

    .line 56
    .line 57
    iget-object v8, v0, La/qnd0;->n:La/ol60;

    .line 58
    .line 59
    new-instance v0, La/jjc0;

    .line 60
    .line 61
    const/16 v7, 0xc

    .line 62
    .line 63
    const/4 v1, 0x2

    .line 64
    const-string v4, "handleActions"

    .line 65
    .line 66
    const-string v5, "handleActions(Lorg/xplatform/make_bet_settings/impl/presentation/model/EditSumBottomSheetAction;)V"

    .line 67
    .line 68
    move-object v2, p0

    .line 69
    invoke-direct/range {v0 .. v7}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-instance v3, La/fxc0;

    .line 85
    .line 86
    invoke-direct {v3, v8, v1, v0, v10}, La/fxc0;-><init>(La/ol60;La/clz;La/jjc0;La/yje;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v10, v10, v3, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/p2j0;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/p2j0;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/p2j0;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object v0, La/snd0;->o2:[La/iiy;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    aget-object v0, v0, v2

    .line 66
    .line 67
    iget-object v2, p0, La/snd0;->g2:La/yzn0;

    .line 68
    .line 69
    invoke-virtual {v2, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/bm5;

    .line 74
    .line 75
    invoke-virtual {v1, p1, v0}, La/p2j0;->a(La/i1w0;La/bm5;)La/i7i;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, La/i7i;->x()La/fiu0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/snd0;->k2:La/fiu0;

    .line 84
    .line 85
    iget-object p1, p1, La/i7i;->z:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, La/wdk0;

    .line 88
    .line 89
    iput-object p1, p0, La/snd0;->l2:La/wdk0;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 93
    .line 94
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final V0()La/mhn0;
    .locals 0

    .line 1
    iget-object p0, p0, La/snd0;->i2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, La/mhn0;

    .line 11
    .line 12
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/snd0;->V0()La/mhn0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 6
    .line 7
    iget-object v1, p0, La/snd0;->j2:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/da0;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 21
    .line 22
    .line 23
    invoke-super {p0}, La/stl;->Z()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
