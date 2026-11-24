.class public final La/i6q;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/i6q;",
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
.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/e9o0;

.field public M1:La/fiu0;

.field public N1:La/xi70;

.field public O1:La/ii;

.field public P1:La/wdk0;

.field public Q1:La/lgn0;

.field public R1:La/d720;

.field public final S1:La/kiu0;

.field public final U1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/i6q;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetFragmentBinding;"

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
    sput-object v1, La/i6q;->V1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01cf

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/i6q;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/e9o0;

    .line 12
    .line 13
    const v1, 0x7f040ae3

    .line 14
    .line 15
    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    invoke-direct {v0, v1, v1, v2}, La/e9o0;-><init>(III)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/i6q;->L1:La/e9o0;

    .line 22
    .line 23
    new-instance v0, La/d6q;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/d6q;-><init>(La/i6q;B)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/jfl;

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    invoke-direct {v1, p0, v2}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    sget-object v2, La/wez;->b:La/wez;

    .line 37
    .line 38
    new-instance v3, La/jfl;

    .line 39
    .line 40
    const/16 v4, 0x13

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-class v2, La/r8q;

    .line 50
    .line 51
    sget-object v3, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v3, La/r6p;

    .line 58
    .line 59
    const/4 v4, 0x4

    .line 60
    invoke-direct {v3, v1, v4}, La/r6p;-><init>(La/a8z;B)V

    .line 61
    .line 62
    .line 63
    new-instance v4, La/r6p;

    .line 64
    .line 65
    const/4 v5, 0x5

    .line 66
    invoke-direct {v4, v1, v5}, La/r6p;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/i6q;->S1:La/kiu0;

    .line 74
    .line 75
    sget-object v0, La/f6q;->a:La/f6q;

    .line 76
    .line 77
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/i6q;->U1:La/s0r;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/j6q;->m:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p1, v0}, La/knm0;->i(Landroid/view/View;Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p1, p1, La/j6q;->t:Landroid/widget/TextView;

    .line 16
    .line 17
    const v1, 0x7f1308bb

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, La/j6q;->j:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 32
    .line 33
    new-instance v1, La/d6q;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, p0, v2}, La/d6q;-><init>(La/i6q;B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, La/j6q;->k:Landroid/widget/FrameLayout;

    .line 47
    .line 48
    sget-object v1, La/ymx;->f:La/ymx;

    .line 49
    .line 50
    new-instance v3, La/e6q;

    .line 51
    .line 52
    invoke-direct {v3, p0, v0}, La/e6q;-><init>(La/i6q;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v1, v3}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p1, p1, La/j6q;->t:Landroid/widget/TextView;

    .line 63
    .line 64
    new-instance v0, La/e6q;

    .line 65
    .line 66
    invoke-direct {v0, p0, v2}, La/e6q;-><init>(La/i6q;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v1, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object p1, p1, La/j6q;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 77
    .line 78
    new-instance v0, La/e6q;

    .line 79
    .line 80
    const/4 v2, 0x2

    .line 81
    invoke-direct {v0, p0, v2}, La/e6q;-><init>(La/i6q;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v1, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p1, p1, La/j6q;->k:Landroid/widget/FrameLayout;

    .line 92
    .line 93
    new-instance v0, La/e6q;

    .line 94
    .line 95
    const/4 v3, 0x3

    .line 96
    invoke-direct {v0, p0, v3}, La/e6q;-><init>(La/i6q;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1, v1, v0}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p1, p1, La/j6q;->e:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;

    .line 107
    .line 108
    new-instance v0, La/f5o;

    .line 109
    .line 110
    const/16 v1, 0x17

    .line 111
    .line 112
    invoke-direct {v0, p0, v1}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->setOnSpinnerValueClicked(Lkotlin/jvm/functions/Function2;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object p1, p1, La/j6q;->e:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;

    .line 123
    .line 124
    new-instance v0, La/e6q;

    .line 125
    .line 126
    const/4 v1, 0x4

    .line 127
    invoke-direct {v0, p0, v1}, La/e6q;-><init>(La/i6q;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->setOnCarriageViewClicked(Lkotlin/jvm/functions/Function1;)V

    .line 131
    .line 132
    .line 133
    new-instance p1, La/d6q;

    .line 134
    .line 135
    invoke-direct {p1, p0, v3}, La/d6q;-><init>(La/i6q;B)V

    .line 136
    .line 137
    .line 138
    const-string v0, "BET_ALREADY_DONE_REQUEST_KEY"

    .line 139
    .line 140
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance v0, La/z9f;

    .line 148
    .line 149
    const/16 v1, 0x19

    .line 150
    .line 151
    invoke-direct {v0, p0, v1}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    const-string v1, "REQUEST_FINISH_MAKE_BET_DIALOG_KEY"

    .line 155
    .line 156
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 157
    .line 158
    .line 159
    new-instance p1, La/e6q;

    .line 160
    .line 161
    const/4 v0, 0x5

    .line 162
    invoke-direct {p1, p0, v0}, La/e6q;-><init>(La/i6q;B)V

    .line 163
    .line 164
    .line 165
    const-string v0, "CHOOSE_INSTRUMENTS_DIALOG_KEY"

    .line 166
    .line 167
    invoke-static {p0, v0, p1}, La/sj3;->t0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 168
    .line 169
    .line 170
    new-instance p1, La/d6q;

    .line 171
    .line 172
    invoke-direct {p1, p0, v2}, La/d6q;-><init>(La/i6q;B)V

    .line 173
    .line 174
    .line 175
    const-string v0, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY"

    .line 176
    .line 177
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final C0()V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/k6q;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/k6q;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/k6q;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v5, v3, La/k6q;->a:La/cad;

    .line 68
    .line 69
    iget-object v15, v3, La/k6q;->b:La/m1e;

    .line 70
    .line 71
    iget-object v1, v3, La/k6q;->c:La/ctf0;

    .line 72
    .line 73
    iget-object v2, v3, La/k6q;->d:La/btt0;

    .line 74
    .line 75
    iget-object v4, v3, La/k6q;->e:La/ort;

    .line 76
    .line 77
    iget-object v6, v3, La/k6q;->g:La/sa10;

    .line 78
    .line 79
    iget-object v7, v3, La/k6q;->h:La/mii0;

    .line 80
    .line 81
    iget-object v8, v3, La/k6q;->i:La/duj;

    .line 82
    .line 83
    iget-object v13, v3, La/k6q;->n:La/lgn0;

    .line 84
    .line 85
    iget-object v12, v3, La/k6q;->f:La/ii;

    .line 86
    .line 87
    iget-object v9, v3, La/k6q;->j:La/v88;

    .line 88
    .line 89
    move-object/from16 v21, v8

    .line 90
    .line 91
    iget-object v8, v3, La/k6q;->o:La/wsf0;

    .line 92
    .line 93
    move-object/from16 v19, v6

    .line 94
    .line 95
    iget-object v6, v3, La/k6q;->k:La/rmd0;

    .line 96
    .line 97
    move-object/from16 v20, v7

    .line 98
    .line 99
    iget-object v7, v3, La/k6q;->p:La/drm0;

    .line 100
    .line 101
    iget-object v10, v3, La/k6q;->m:La/gii0;

    .line 102
    .line 103
    iget-object v11, v3, La/k6q;->l:La/knf0;

    .line 104
    .line 105
    move-object/from16 v16, v1

    .line 106
    .line 107
    iget-object v1, v3, La/k6q;->q:La/wdk0;

    .line 108
    .line 109
    move-object/from16 v22, v9

    .line 110
    .line 111
    iget-object v9, v3, La/k6q;->r:La/o2j0;

    .line 112
    .line 113
    move-object/from16 v24, v10

    .line 114
    .line 115
    iget-object v10, v3, La/k6q;->s:La/vqc;

    .line 116
    .line 117
    move-object/from16 v25, v1

    .line 118
    .line 119
    iget-object v1, v3, La/k6q;->t:La/j1q0;

    .line 120
    .line 121
    move-object/from16 v17, v1

    .line 122
    .line 123
    iget-object v1, v3, La/k6q;->u:La/pru;

    .line 124
    .line 125
    move-object/from16 v26, v1

    .line 126
    .line 127
    iget-object v1, v3, La/k6q;->v:La/pmi;

    .line 128
    .line 129
    move-object/from16 v23, v11

    .line 130
    .line 131
    iget-object v11, v3, La/k6q;->w:La/d1p;

    .line 132
    .line 133
    move-object/from16 v27, v1

    .line 134
    .line 135
    iget-object v1, v3, La/k6q;->x:La/q6q;

    .line 136
    .line 137
    move-object/from16 v28, v1

    .line 138
    .line 139
    iget-object v1, v3, La/k6q;->y:La/dev;

    .line 140
    .line 141
    move-object/from16 v29, v1

    .line 142
    .line 143
    iget-object v1, v3, La/k6q;->z:La/lbu;

    .line 144
    .line 145
    move-object/from16 v30, v1

    .line 146
    .line 147
    iget-object v1, v3, La/k6q;->A:La/r9u;

    .line 148
    .line 149
    iget-object v3, v3, La/k6q;->B:La/rou;

    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-object/from16 v18, v4

    .line 194
    .line 195
    new-instance v4, La/t7i;

    .line 196
    .line 197
    move-object/from16 v31, v1

    .line 198
    .line 199
    move-object/from16 v17, v2

    .line 200
    .line 201
    move-object/from16 v32, v3

    .line 202
    .line 203
    invoke-direct/range {v4 .. v32}, La/t7i;-><init>(La/cad;La/rmd0;La/drm0;La/wsf0;La/o2j0;La/vqc;La/d1p;La/ii;La/lgn0;La/i1w0;La/m1e;La/ctf0;La/btt0;La/ort;La/sa10;La/mii0;La/duj;La/v88;La/knf0;La/gii0;La/wdk0;La/pru;La/pmi;La/q6q;La/dev;La/lbu;La/r9u;La/rou;)V

    .line 204
    .line 205
    .line 206
    move-object v5, v4

    .line 207
    move-object/from16 v1, v25

    .line 208
    .line 209
    move-object/from16 v2, v26

    .line 210
    .line 211
    move-object/from16 v3, v30

    .line 212
    .line 213
    move-object/from16 v4, v31

    .line 214
    .line 215
    new-instance v7, La/fiu0;

    .line 216
    .line 217
    iget-object v5, v5, La/t7i;->y:La/n5d0;

    .line 218
    .line 219
    check-cast v5, La/f7i;

    .line 220
    .line 221
    const-class v8, La/r8q;

    .line 222
    .line 223
    invoke-static {v8, v5}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-direct {v7, v5}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 228
    .line 229
    .line 230
    iput-object v7, v0, La/i6q;->M1:La/fiu0;

    .line 231
    .line 232
    invoke-interface {v6}, La/rmd0;->f()La/xi70;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    iput-object v5, v0, La/i6q;->N1:La/xi70;

    .line 237
    .line 238
    iput-object v12, v0, La/i6q;->O1:La/ii;

    .line 239
    .line 240
    iput-object v1, v0, La/i6q;->P1:La/wdk0;

    .line 241
    .line 242
    iput-object v13, v0, La/i6q;->Q1:La/lgn0;

    .line 243
    .line 244
    new-instance v1, La/d720;

    .line 245
    .line 246
    new-instance v5, La/lk5;

    .line 247
    .line 248
    const/4 v6, 0x3

    .line 249
    invoke-direct {v5, v2, v4, v6}, La/lk5;-><init>(La/pru;La/r9u;B)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v1, v3, v5}, La/d720;-><init>(La/lbu;La/lk5;)V

    .line 253
    .line 254
    .line 255
    iput-object v1, v0, La/i6q;->R1:La/d720;

    .line 256
    .line 257
    return-void

    .line 258
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 259
    .line 260
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/r8q;->T:La/ol60;

    .line 6
    .line 7
    new-instance v4, La/h6q;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    const/4 v9, 0x0

    .line 11
    invoke-direct {v4, p0, v9, v0}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, La/g6q;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v5, v9

    .line 32
    invoke-direct/range {v1 .. v6}, La/g6q;-><init>(La/gmq;La/clz;La/h6q;La/yje;B)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-static {v0, v9, v9, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v0, v0, La/r8q;->Q:La/p7m0;

    .line 44
    .line 45
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-instance v8, La/h6q;

    .line 50
    .line 51
    invoke-direct {v8, p0, v9, v2}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v5, La/g6q;

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    invoke-direct/range {v5 .. v10}, La/g6q;-><init>(La/xae0;La/clz;La/h6q;La/yje;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v0, v0, La/r8q;->S:La/p7m0;

    .line 80
    .line 81
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    new-instance v8, La/h6q;

    .line 86
    .line 87
    const/4 v0, 0x4

    .line 88
    invoke-direct {v8, p0, v9, v0}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v5, La/g6q;

    .line 104
    .line 105
    invoke-direct/range {v5 .. v10}, La/g6q;-><init>(La/xae0;La/clz;La/h6q;La/yje;C)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-object v0, v0, La/r8q;->U:La/p7m0;

    .line 116
    .line 117
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    new-instance v1, La/h6q;

    .line 122
    .line 123
    const/4 v3, 0x0

    .line 124
    invoke-direct {v1, p0, v9, v3}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 125
    .line 126
    .line 127
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    new-instance v5, La/g6q;

    .line 140
    .line 141
    invoke-direct {v5, v0, v3, v1, v9}, La/g6q;-><init>(La/xae0;La/clz;La/h6q;La/yje;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v4, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v0, v0, La/r8q;->R:La/p7m0;

    .line 152
    .line 153
    new-instance v1, La/h6q;

    .line 154
    .line 155
    const/4 v3, 0x1

    .line 156
    invoke-direct {v1, p0, v9, v3}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 157
    .line 158
    .line 159
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    new-instance v4, La/g6q;

    .line 172
    .line 173
    invoke-direct {v4, v0, p0, v1, v9}, La/g6q;-><init>(La/gmq;La/clz;La/h6q;La/yje;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v3, v9, v9, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public final G0()La/j6q;
    .locals 2

    .line 1
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/i6q;->U1:La/s0r;

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
    check-cast p0, La/j6q;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/r8q;
    .locals 0

    .line 1
    iget-object p0, p0, La/i6q;->S1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r8q;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Z)V
    .locals 2

    .line 1
    xor-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/i6q;->J0(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, La/j6q;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v1, 0x8

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p1, p1, La/j6q;->t:Landroid/widget/TextView;

    .line 28
    .line 29
    const v0, 0x7f1308bb

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final J0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/j6q;->l:Landroid/view/View;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/high16 v1, 0x3f000000    # 0.5f

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/j6q;->l:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, La/j6q;->k:Landroid/widget/FrameLayout;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final K0(DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p6

    .line 4
    .line 5
    move-object/from16 v7, p9

    .line 6
    .line 7
    move-object/from16 v8, p5

    .line 8
    .line 9
    invoke-static {v8, v5, v7}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v9, v0, La/i6q;->Q1:La/lgn0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v9, :cond_1

    .line 16
    .line 17
    new-instance v10, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 18
    .line 19
    const v2, 0x7f13025d

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-direct {v10, v2, v1, v1, v1}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const v1, 0x7f1308b8

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v11

    .line 39
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    new-instance v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 44
    .line 45
    const v2, 0x7f130494

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-object/from16 v3, p7

    .line 56
    .line 57
    invoke-direct {v1, v2, v3}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v12, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    new-instance v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 64
    .line 65
    const v2, 0x7f130270

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object v2, La/pn40;->a:La/pn40;

    .line 76
    .line 77
    sget-object v2, La/p3u0;->c:La/p3u0;

    .line 78
    .line 79
    move-wide/from16 v13, p1

    .line 80
    .line 81
    invoke-static {v13, v14, v2}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const v6, 0x7f040b72

    .line 90
    .line 91
    .line 92
    invoke-static {v6, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    const/4 v6, 0x1

    .line 97
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    if-nez p10, :cond_0

    .line 104
    .line 105
    new-instance v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 106
    .line 107
    const-string v2, ":"

    .line 108
    .line 109
    const-string v3, ""

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    invoke-static {v7, v2, v3, v4}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v2}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    move-object/from16 v6, p8

    .line 125
    .line 126
    invoke-static {v6, v5, v3, v4}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-static {v3}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const v6, 0x7f040aeb

    .line 143
    .line 144
    .line 145
    invoke-static {v6, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    const/4 v6, 0x0

    .line 150
    move v15, v3

    .line 151
    move-object v3, v2

    .line 152
    move v2, v15

    .line 153
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    :cond_0
    invoke-static {v12}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    new-instance v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 164
    .line 165
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    const-string v6, "SIMPLE"

    .line 170
    .line 171
    const-string v4, "REQUEST_SUCCESS_BET_KEY"

    .line 172
    .line 173
    move-object v3, v8

    .line 174
    move-object v2, v11

    .line 175
    invoke-direct/range {v1 .. v7}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9, v10, v1, v0}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_1
    const-string v0, "successBetAlertManager"

    .line 183
    .line 184
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v1
.end method

.method public final L0(JLjava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/i6q;->Q1:La/lgn0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 10
    .line 11
    const v3, 0x7f13025d

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3, v1, v1, v1}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v1, 0x7f131011

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const v3, 0x7f1308b8

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, ": "

    .line 39
    .line 40
    invoke-static {v1, v4, v3}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    new-instance v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 45
    .line 46
    const v3, 0x7f130494

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-object/from16 v4, p4

    .line 57
    .line 58
    invoke-direct {v1, v3, v4}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    new-instance v5, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 66
    .line 67
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    const-string v10, "PROMO"

    .line 72
    .line 73
    const-string v8, "REQUEST_SUCCESS_BET_KEY"

    .line 74
    .line 75
    move-object v7, p3

    .line 76
    invoke-direct/range {v5 .. v11}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2, v5, p0}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_0
    const-string p0, "successBetAlertManager"

    .line 84
    .line 85
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1
.end method

.method public final M0(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, La/j6q;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f080634

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p1, p1, La/j6q;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 28
    .line 29
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const v0, 0x7f0606d0

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, v0}, La/j5d;->c(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p1, p1, La/j6q;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const v1, 0x7f080644

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, La/i6q;->G0()La/j6q;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p1, p1, La/j6q;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 71
    .line 72
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const v0, 0x7f0606c1

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v0, v0}, La/j5d;->c(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/r8q;->V:La/c4m0;

    .line 9
    .line 10
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/r8q;->Q:La/p7m0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v0, v0, La/f8q;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    sget-object v0, La/g8q;->a:La/g8q;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 5

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/r8q;->p:La/w4p0;

    .line 9
    .line 10
    iget-object v0, v0, La/w4p0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/h7q;

    .line 13
    .line 14
    iget-object v0, v0, La/h7q;->c:La/q6q;

    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    iput-wide v1, v0, La/q6q;->c:J

    .line 19
    .line 20
    iget-object v0, p0, La/r8q;->Q:La/p7m0;

    .line 21
    .line 22
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    instance-of v0, v0, La/g8q;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, La/r8q;->X:La/sje;

    .line 31
    .line 32
    iget-object v1, p0, La/r8q;->i:La/mne;

    .line 33
    .line 34
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 35
    .line 36
    new-instance v2, La/e3p;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x2

    .line 40
    invoke-direct {v2, p0, v3, v4}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1, v3, v2, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i6q;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i6q;->L1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
