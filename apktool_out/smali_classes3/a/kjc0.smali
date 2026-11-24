.class public abstract La/kjc0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008!\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/kjc0;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/hnm0;

.field public M1:La/kki;

.field public N1:La/ii;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/kjc0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bonus_games/impl/databinding/PromoGameHolderFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/kjc0;->P1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0539

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b7b

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bp3;->b:La/bp3;

    .line 13
    .line 14
    invoke-direct {v0, v1, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/kjc0;->K1:La/e9o0;

    .line 18
    .line 19
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 20
    .line 21
    iput-object v0, p0, La/kjc0;->L1:La/hnm0;

    .line 22
    .line 23
    sget-object v0, La/ijc0;->a:La/ijc0;

    .line 24
    .line 25
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/kjc0;->O1:La/s0r;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final D0()V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/kjc0;->K0()La/gkc0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/gkc0;->n:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/jjc0;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v2, 0x2

    .line 12
    const-class v12, La/kjc0;

    .line 13
    .line 14
    const-string v5, "observeViewState"

    .line 15
    .line 16
    const-string v6, "observeViewState(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesHolderViewModel$HolderViewState;)V"

    .line 17
    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    move-object v4, v12

    .line 21
    invoke-direct/range {v1 .. v8}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/lkz;->a:La/lkz;

    .line 25
    .line 26
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v4, La/p8c0;

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-direct {v4, v0, v2, v1, v5}, La/p8c0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    invoke-static {v3, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {p0 .. p0}, La/kjc0;->K0()La/gkc0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v6, v1, La/gkc0;->o:La/p7m0;

    .line 53
    .line 54
    new-instance v8, La/jjc0;

    .line 55
    .line 56
    const/4 v15, 0x4

    .line 57
    const/16 v16, 0x1

    .line 58
    .line 59
    const/4 v10, 0x2

    .line 60
    const-string v13, "observeBackgroundState"

    .line 61
    .line 62
    const-string v14, "observeBackgroundState(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesHolderViewModel$BackgroundState;)V"

    .line 63
    .line 64
    move-object/from16 v11, p0

    .line 65
    .line 66
    move-object v9, v8

    .line 67
    invoke-direct/range {v9 .. v16}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 68
    .line 69
    .line 70
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    move-object v9, v5

    .line 83
    new-instance v5, La/p8c0;

    .line 84
    .line 85
    const/4 v10, 0x0

    .line 86
    invoke-direct/range {v5 .. v10}, La/p8c0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;B)V

    .line 87
    .line 88
    .line 89
    move-object v2, v9

    .line 90
    invoke-static {v1, v2, v2, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {p0 .. p0}, La/kjc0;->K0()La/gkc0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v6, v1, La/gkc0;->p:La/p7m0;

    .line 98
    .line 99
    new-instance v8, La/jjc0;

    .line 100
    .line 101
    const/16 v16, 0x2

    .line 102
    .line 103
    const/4 v10, 0x2

    .line 104
    const-string v13, "observeErrorDialogState"

    .line 105
    .line 106
    const-string v14, "observeErrorDialogState(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesHolderViewModel$ErrorDialogState;)V"

    .line 107
    .line 108
    move-object v9, v8

    .line 109
    invoke-direct/range {v9 .. v16}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 110
    .line 111
    .line 112
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v5, La/p8c0;

    .line 125
    .line 126
    const/4 v10, 0x0

    .line 127
    move-object v9, v2

    .line 128
    invoke-direct/range {v5 .. v10}, La/p8c0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;C)V

    .line 129
    .line 130
    .line 131
    invoke-static {v1, v2, v2, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {p0 .. p0}, La/kjc0;->K0()La/gkc0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iget-object v6, v1, La/gkc0;->q:La/ol60;

    .line 139
    .line 140
    new-instance v8, La/jjc0;

    .line 141
    .line 142
    const/16 v16, 0x3

    .line 143
    .line 144
    const/4 v10, 0x2

    .line 145
    const-string v13, "observeOneExecuteActions"

    .line 146
    .line 147
    const-string v14, "observeOneExecuteActions(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesHolderViewModel$OneExecutionState;)V"

    .line 148
    .line 149
    move-object v9, v8

    .line 150
    invoke-direct/range {v9 .. v16}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 151
    .line 152
    .line 153
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v5, La/p8c0;

    .line 166
    .line 167
    const/4 v10, 0x0

    .line 168
    move-object v9, v2

    .line 169
    invoke-direct/range {v5 .. v10}, La/p8c0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;I)V

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v9, v9, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public final G0(ILandroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v1, La/zb5;

    .line 28
    .line 29
    invoke-direct {v1, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1, p2, v0}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, La/zb5;->f()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final H0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/kjc0;->N1:La/ii;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "actionDialogManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final I0()La/iic0;
    .locals 2

    .line 1
    sget-object v0, La/kjc0;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/kjc0;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/iic0;

    .line 16
    .line 17
    return-object p0
.end method

.method public abstract J0()Landroidx/fragment/app/Fragment;
.end method

.method public abstract K0()La/gkc0;
.end method

.method public final L0(Z)V
    .locals 13

    .line 1
    const v0, 0x7f130162

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const v0, 0x7f1317e2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const v0, 0x7f1317e1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const v0, 0x7f1317e0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v10, La/n12;->b:La/n12;

    .line 33
    .line 34
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    const/16 v12, 0x1d0

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const-string v7, "PROMO_REQUEST_DIALOG_RESTART_GAME_KEY"

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 52
    .line 53
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v2, La/sx3;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-direct {v2, v0, v3}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    new-instance v0, La/wyb0;

    .line 67
    .line 68
    const/16 v3, 0x1c

    .line 69
    .line 70
    invoke-direct {v0, v3}, La/wyb0;-><init>(B)V

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v0}, La/pgi0;->k(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v2, La/b180;->g:La/b180;

    .line 78
    .line 79
    invoke-static {v0, v2}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v2, La/b5q;

    .line 84
    .line 85
    invoke-direct {v2, v0}, La/b5q;-><init>(La/c5q;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    invoke-virtual {v2}, La/b5q;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    invoke-virtual {v2}, La/b5q;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    move-object v3, v0

    .line 99
    check-cast v3, La/hz6;

    .line 100
    .line 101
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->N()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_0

    .line 106
    .line 107
    iget-boolean v3, v3, Landroidx/fragment/app/Fragment;->m:Z

    .line 108
    .line 109
    if-nez v3, :cond_0

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    const/4 v0, 0x0

    .line 113
    :goto_0
    check-cast v0, La/hz6;

    .line 114
    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-nez v0, :cond_3

    .line 122
    .line 123
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    :cond_3
    if-eqz p1, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0}, La/kjc0;->H0()La/ii;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0, v1, v0}, La/ii;->a(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_4
    invoke-virtual {p0}, La/kjc0;->H0()La/ii;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0, v1, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/b0c0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/kjc0;->K0()La/gkc0;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v6, 0x0

    .line 11
    const/16 v7, 0xb

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-class v3, La/gkc0;

    .line 15
    .line 16
    const-string v4, "onTechnicalDialogGameClick"

    .line 17
    .line 18
    const-string v5, "onTechnicalDialogGameClick()V"

    .line 19
    .line 20
    invoke-direct/range {v0 .. v7}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    const-string p1, "BONUS_GAMES_TECHNICAL_WORKS_DIALOG_REQUEST_KEY"

    .line 24
    .line 25
    invoke-static {p0, p1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/16 v0, 0x80

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/16 v0, 0x80

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, La/kjc0;->I0()La/iic0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La/iic0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v1, v2}, La/knm0;->h(Landroid/view/View;Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/kjc0;->I0()La/iic0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v1, v1, La/iic0;->d:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    invoke-static {v1, v2}, La/knm0;->h(Landroid/view/View;Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, La/kjc0;->I0()La/iic0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, La/iic0;->c:Landroid/widget/FrameLayout;

    .line 33
    .line 34
    invoke-static {v1, v2}, La/knm0;->h(Landroid/view/View;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, La/kjc0;->I0()La/iic0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v1, v1, La/iic0;->e:Landroid/widget/FrameLayout;

    .line 42
    .line 43
    invoke-static {v1, v2}, La/knm0;->h(Landroid/view/View;Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, La/kjc0;->K0()La/gkc0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, La/gkc0;->x()V

    .line 51
    .line 52
    .line 53
    new-instance v2, La/b0c0;

    .line 54
    .line 55
    invoke-virtual {v0}, La/kjc0;->K0()La/gkc0;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const/4 v8, 0x0

    .line 60
    const/16 v9, 0x9

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    const-class v13, La/gkc0;

    .line 64
    .line 65
    const-string v6, "onRequestErrorDialogClosed"

    .line 66
    .line 67
    const-string v7, "onRequestErrorDialogClosed()V"

    .line 68
    .line 69
    move-object v5, v13

    .line 70
    invoke-direct/range {v2 .. v9}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 71
    .line 72
    .line 73
    const-string v1, "PROMO_REQUEST_DIALOG_ERROR_KEY"

    .line 74
    .line 75
    invoke-static {v0, v1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 76
    .line 77
    .line 78
    new-instance v10, La/b0c0;

    .line 79
    .line 80
    invoke-virtual {v0}, La/kjc0;->K0()La/gkc0;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    const/16 v16, 0x0

    .line 85
    .line 86
    const/16 v17, 0x8

    .line 87
    .line 88
    const/4 v11, 0x0

    .line 89
    const-string v14, "exitGame"

    .line 90
    .line 91
    const-string v15, "exitGame()V"

    .line 92
    .line 93
    invoke-direct/range {v10 .. v17}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 94
    .line 95
    .line 96
    const-string v1, "PROMO_REQUEST_DIALOG_CRITICAL_ERROR_KEY"

    .line 97
    .line 98
    invoke-static {v0, v1, v10}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, La/ssa0;

    .line 102
    .line 103
    const/16 v2, 0x18

    .line 104
    .line 105
    invoke-direct {v1, v0, v2}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    const-string v2, "PROMO_REQUEST_DIALOG_RESTART_GAME_KEY"

    .line 109
    .line 110
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 111
    .line 112
    .line 113
    new-instance v10, La/b0c0;

    .line 114
    .line 115
    invoke-virtual {v0}, La/kjc0;->K0()La/gkc0;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    const/16 v17, 0xa

    .line 120
    .line 121
    const-string v14, "onRestartGameDialogExit"

    .line 122
    .line 123
    const-string v15, "onRestartGameDialogExit()V"

    .line 124
    .line 125
    invoke-direct/range {v10 .. v17}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0, v2, v10}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, La/kjc0;->J0()Landroidx/fragment/app/Fragment;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const v2, 0x7f0a0bad

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v2, v1}, La/kjc0;->G0(ILandroidx/fragment/app/Fragment;)V

    .line 139
    .line 140
    .line 141
    new-instance v1, La/ikc0;

    .line 142
    .line 143
    invoke-direct {v1}, La/ikc0;-><init>()V

    .line 144
    .line 145
    .line 146
    const v2, 0x7f0a0baf

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2, v1}, La/kjc0;->G0(ILandroidx/fragment/app/Fragment;)V

    .line 150
    .line 151
    .line 152
    new-instance v1, La/ukc0;

    .line 153
    .line 154
    invoke-direct {v1}, La/ukc0;-><init>()V

    .line 155
    .line 156
    .line 157
    const v2, 0x7f0a0bb1

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v2, v1}, La/kjc0;->G0(ILandroidx/fragment/app/Fragment;)V

    .line 161
    .line 162
    .line 163
    new-instance v1, La/vic0;

    .line 164
    .line 165
    invoke-direct {v1}, La/vic0;-><init>()V

    .line 166
    .line 167
    .line 168
    const v2, 0x7f0a0bac

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2, v1}, La/kjc0;->G0(ILandroidx/fragment/app/Fragment;)V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kjc0;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kjc0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
