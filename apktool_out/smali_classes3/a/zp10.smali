.class public final La/zp10;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/zp10;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/htz",
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
.field public static final U1:La/htz;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public M1:La/qki;

.field public N1:La/gl5;

.field public O1:La/ii;

.field public P1:La/wdk0;

.field public final Q1:La/kiu0;

.field public final R1:La/s0r;

.field public final S1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/zp10;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/mailing/impl/databinding/FragmentMailingManagementBinding;"

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
    sput-object v1, La/zp10;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/htz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/zp10;->U1:La/htz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0260

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/zp10;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, La/zp10;->L1:La/hnm0;

    .line 20
    .line 21
    new-instance v0, La/wp10;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, v1}, La/wp10;-><init>(La/zp10;B)V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/be00;

    .line 28
    .line 29
    const/16 v2, 0x16

    .line 30
    .line 31
    invoke-direct {v1, p0, v2}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    sget-object v2, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v3, La/be00;

    .line 37
    .line 38
    const/16 v4, 0x17

    .line 39
    .line 40
    invoke-direct {v3, v1, v4}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-class v3, La/vq10;

    .line 48
    .line 49
    sget-object v4, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v4, La/j210;

    .line 56
    .line 57
    const/16 v5, 0xe

    .line 58
    .line 59
    invoke-direct {v4, v1, v5}, La/j210;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    new-instance v5, La/j210;

    .line 63
    .line 64
    const/16 v6, 0xf

    .line 65
    .line 66
    invoke-direct {v5, v1, v6}, La/j210;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/zp10;->Q1:La/kiu0;

    .line 74
    .line 75
    sget-object v0, La/xp10;->a:La/xp10;

    .line 76
    .line 77
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/zp10;->R1:La/s0r;

    .line 82
    .line 83
    new-instance v0, La/wp10;

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    invoke-direct {v0, p0, v1}, La/wp10;-><init>(La/zp10;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, La/zp10;->S1:La/a8z;

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/zp10;->G0()La/h1r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/h1r;->f:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v1, La/wp10;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, p0, v2}, La/wp10;-><init>(La/zp10;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, La/wp10;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-direct {v0, p0, v1}, La/wp10;-><init>(La/zp10;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/o0t;

    .line 26
    .line 27
    invoke-virtual {p0}, La/zp10;->H0()La/vq10;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const/4 v8, 0x0

    .line 32
    const/16 v9, 0x11

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const-class v5, La/vq10;

    .line 36
    .line 37
    const-string v6, "onActionExit"

    .line 38
    .line 39
    const-string v7, "onActionExit()V"

    .line 40
    .line 41
    invoke-direct/range {v2 .. v9}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 42
    .line 43
    .line 44
    const-string v0, "INTERRUPT_DIALOG_REQUEST_KEY"

    .line 45
    .line 46
    invoke-static {p0, v0, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p1, La/h1r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    iget-object v1, p0, La/zp10;->S1:La/a8z;

    .line 52
    .line 53
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, La/vp10;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const v2, 0x7f0706f8

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    sget-object v11, La/rmk0;->b:La/rmk0;

    .line 74
    .line 75
    new-instance v3, La/qmk0;

    .line 76
    .line 77
    new-instance v10, La/p610;

    .line 78
    .line 79
    const/16 v1, 0x11

    .line 80
    .line 81
    invoke-direct {v10, v1}, La/p610;-><init>(B)V

    .line 82
    .line 83
    .line 84
    const/16 v12, 0x11e

    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v9, 0x1

    .line 90
    invoke-direct/range {v3 .. v12}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-eqz v1, :cond_2

    .line 101
    .line 102
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    const v4, 0x7f05000f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_0

    .line 124
    .line 125
    const v3, 0x7f070714

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_0
    const v3, 0x7f0706ea

    .line 130
    .line 131
    .line 132
    :goto_0
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p1, La/h1r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 146
    .line 147
    new-instance v0, La/wp10;

    .line 148
    .line 149
    const/4 v1, 0x4

    .line 150
    invoke-direct {v0, p0, v1}, La/wp10;-><init>(La/zp10;B)V

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, La/zp10;->N1:La/gl5;

    .line 157
    .line 158
    if-eqz p1, :cond_1

    .line 159
    .line 160
    new-instance p1, La/wp10;

    .line 161
    .line 162
    const/4 v0, 0x5

    .line 163
    invoke-direct {p1, p0, v0}, La/wp10;-><init>(La/zp10;B)V

    .line 164
    .line 165
    .line 166
    new-instance v0, La/km00;

    .line 167
    .line 168
    const/4 v1, 0x7

    .line 169
    invoke-direct {v0, p0, v1}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 170
    .line 171
    .line 172
    const-string v1, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 173
    .line 174
    invoke-static {p0, v1, p1, v0}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_1
    const-string p0, "captchaDialogDelegate"

    .line 179
    .line 180
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/4 p0, 0x0

    .line 184
    throw p0

    .line 185
    :cond_2
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 186
    .line 187
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public final C0()V
    .locals 25

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
    const-class v2, La/up10;

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
    instance-of v4, v1, La/up10;

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
    check-cast v3, La/up10;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v1, v3, La/up10;->a:La/rou;

    .line 58
    .line 59
    iget-object v7, v3, La/up10;->c:La/qgd;

    .line 60
    .line 61
    iget-object v11, v3, La/up10;->d:La/duj;

    .line 62
    .line 63
    iget-object v6, v3, La/up10;->e:La/kt2;

    .line 64
    .line 65
    iget-object v8, v3, La/up10;->f:La/m1e;

    .line 66
    .line 67
    iget-object v2, v3, La/up10;->g:La/g2v;

    .line 68
    .line 69
    iget-object v5, v3, La/up10;->o:La/ii;

    .line 70
    .line 71
    iget-object v4, v3, La/up10;->h:La/pru;

    .line 72
    .line 73
    iget-object v9, v3, La/up10;->i:La/lbu;

    .line 74
    .line 75
    iget-object v10, v3, La/up10;->j:La/cyh;

    .line 76
    .line 77
    iget-object v12, v3, La/up10;->k:La/z4w0;

    .line 78
    .line 79
    iget-object v15, v3, La/up10;->l:La/ort;

    .line 80
    .line 81
    move-object/from16 v16, v9

    .line 82
    .line 83
    iget-object v9, v3, La/up10;->m:La/mne;

    .line 84
    .line 85
    iget-object v13, v3, La/up10;->n:La/ctf0;

    .line 86
    .line 87
    move-object/from16 v24, v12

    .line 88
    .line 89
    iget-object v12, v3, La/up10;->p:La/sek;

    .line 90
    .line 91
    iget-object v14, v3, La/up10;->q:La/wdk0;

    .line 92
    .line 93
    move-object/from16 v17, v1

    .line 94
    .line 95
    iget-object v1, v3, La/up10;->r:La/mi70;

    .line 96
    .line 97
    move-object/from16 v22, v13

    .line 98
    .line 99
    iget-object v13, v3, La/up10;->s:La/d1p;

    .line 100
    .line 101
    move-object/from16 v21, v1

    .line 102
    .line 103
    iget-object v1, v3, La/up10;->b:La/onv;

    .line 104
    .line 105
    iget-object v3, v3, La/up10;->t:La/rpt;

    .line 106
    .line 107
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-object/from16 v18, v4

    .line 126
    .line 127
    new-instance v4, La/gbi;

    .line 128
    .line 129
    move-object/from16 v20, v1

    .line 130
    .line 131
    move-object/from16 v19, v2

    .line 132
    .line 133
    move-object/from16 v23, v14

    .line 134
    .line 135
    move-object v14, v3

    .line 136
    invoke-direct/range {v4 .. v24}, La/gbi;-><init>(La/ii;La/kt2;La/qgd;La/m1e;La/mne;La/cyh;La/duj;La/sek;La/d1p;La/rpt;La/ort;La/lbu;La/rou;La/pru;La/g2v;La/onv;La/mi70;La/ctf0;La/wdk0;La/z4w0;)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v1, v23

    .line 140
    .line 141
    iget-object v2, v4, La/gbi;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, La/n5d0;

    .line 144
    .line 145
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, La/qki;

    .line 150
    .line 151
    iput-object v2, v0, La/zp10;->M1:La/qki;

    .line 152
    .line 153
    new-instance v2, La/gl5;

    .line 154
    .line 155
    const/16 v3, 0x11

    .line 156
    .line 157
    invoke-direct {v2, v3}, La/gl5;-><init>(B)V

    .line 158
    .line 159
    .line 160
    iput-object v2, v0, La/zp10;->N1:La/gl5;

    .line 161
    .line 162
    iput-object v5, v0, La/zp10;->O1:La/ii;

    .line 163
    .line 164
    iput-object v1, v0, La/zp10;->P1:La/wdk0;

    .line 165
    .line 166
    return-void

    .line 167
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 168
    .line 169
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/zp10;->H0()La/vq10;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/vq10;->v:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/yp10;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/yp10;-><init>(La/zp10;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/cm10;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/cm10;-><init>(La/gmq;La/clz;La/yp10;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/zp10;->H0()La/vq10;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/vq10;->w:La/qoj0;

    .line 42
    .line 43
    new-instance v6, La/yp10;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/yp10;-><init>(La/zp10;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v3, La/cm10;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/cm10;-><init>(La/gmq;La/clz;La/yp10;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final G0()La/h1r;
    .locals 2

    .line 1
    sget-object v0, La/zp10;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/zp10;->R1:La/s0r;

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
    check-cast p0, La/h1r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/vq10;
    .locals 0

    .line 1
    iget-object p0, p0, La/zp10;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vq10;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/zp10;->G0()La/h1r;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/h1r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
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
    invoke-virtual {p0}, La/zp10;->H0()La/vq10;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/vq10;->A:La/c4m0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, La/vq10;->y:La/bby;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/zp10;->H0()La/vq10;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/vq10;->A:La/c4m0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, La/vq10;->g:La/m1e;

    .line 21
    .line 22
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, La/qq10;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x3

    .line 30
    invoke-direct {v1, p0, v2, v3}, La/qq10;-><init>(La/vq10;La/yje;B)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La/fnq;

    .line 34
    .line 35
    const/4 v3, 0x4

    .line 36
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, La/vq10;->m:La/mne;

    .line 44
    .line 45
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 46
    .line 47
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v2, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/vq10;->A:La/c4m0;

    .line 56
    .line 57
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zp10;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zp10;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
