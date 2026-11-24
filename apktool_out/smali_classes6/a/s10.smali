.class public final La/s10;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/s10;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qek0",
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
.field public static final Q1:La/qek0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/zz2;

.field public M1:La/g6i;

.field public N1:La/wdk0;

.field public O1:La/ii;

.field public final P1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/s10;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/verification/status/impl/databinding/AdditionalVerificationStatusFragmentBinding;"

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
    const-string v3, "verificationTypeValue"

    .line 16
    .line 17
    const-string v5, "getVerificationTypeValue()I"

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
    sput-object v1, La/s10;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/qek0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/s10;->Q1:La/qek0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0027

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/r10;->a:La/r10;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/s10;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/zz2;

    .line 16
    .line 17
    const-string v1, "VERIFICATION_TYPE_BUNDLE"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/s10;->L1:La/zz2;

    .line 23
    .line 24
    new-instance v0, La/p10;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/p10;-><init>(La/s10;B)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/o5;

    .line 31
    .line 32
    const/16 v2, 0x1b

    .line 33
    .line 34
    invoke-direct {v1, p0, v2}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    sget-object v2, La/wez;->b:La/wez;

    .line 38
    .line 39
    new-instance v3, La/o5;

    .line 40
    .line 41
    const/16 v4, 0x1c

    .line 42
    .line 43
    invoke-direct {v3, v1, v4}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-class v2, La/f20;

    .line 51
    .line 52
    sget-object v3, La/sre0;->a:La/tre0;

    .line 53
    .line 54
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-instance v3, La/k8;

    .line 59
    .line 60
    const/16 v4, 0x12

    .line 61
    .line 62
    invoke-direct {v3, v1, v4}, La/k8;-><init>(La/a8z;B)V

    .line 63
    .line 64
    .line 65
    new-instance v4, La/k8;

    .line 66
    .line 67
    const/16 v5, 0x13

    .line 68
    .line 69
    invoke-direct {v4, v1, v5}, La/k8;-><init>(La/a8z;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/s10;->P1:La/kiu0;

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/s10;->G0()La/n10;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/n10;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    const v0, 0x7f131767

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/s10;->G0()La/n10;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/n10;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 22
    .line 23
    new-instance v0, La/q10;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, La/f8;

    .line 33
    .line 34
    invoke-virtual {p0}, La/s10;->H0()La/f20;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x4

    .line 40
    const/4 v3, 0x0

    .line 41
    const-class v5, La/f20;

    .line 42
    .line 43
    const-string v6, "onExit"

    .line 44
    .line 45
    const-string v7, "onExit()V"

    .line 46
    .line 47
    invoke-direct/range {v2 .. v9}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, p0, v2}, La/qcc;->W(Landroidx/fragment/app/Fragment;La/clz;Lkotlin/jvm/functions/Function0;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/s10;->G0()La/n10;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p1, p1, La/n10;->b:Lcom/google/android/material/button/MaterialButton;

    .line 58
    .line 59
    new-instance v0, La/t1;

    .line 60
    .line 61
    const/16 v1, 0x11

    .line 62
    .line 63
    invoke-direct {v0, p0, v1}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final C0()V
    .locals 24

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
    const-class v2, La/t10;

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
    instance-of v4, v1, La/t10;

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
    check-cast v3, La/t10;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    new-instance v5, La/x860;

    .line 58
    .line 59
    sget-object v1, La/s10;->R1:[La/iiy;

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    aget-object v1, v1, v2

    .line 63
    .line 64
    iget-object v2, v0, La/s10;->L1:La/zz2;

    .line 65
    .line 66
    invoke-virtual {v2, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-direct {v5, v1, v2}, La/x860;-><init>(IZ)V

    .line 76
    .line 77
    .line 78
    iget-object v15, v3, La/t10;->a:La/ctf0;

    .line 79
    .line 80
    iget-object v1, v3, La/t10;->b:La/rou;

    .line 81
    .line 82
    iget-object v2, v3, La/t10;->c:La/mne;

    .line 83
    .line 84
    iget-object v4, v3, La/t10;->d:La/m1e;

    .line 85
    .line 86
    iget-object v6, v3, La/t10;->e:La/sa10;

    .line 87
    .line 88
    move-object/from16 v19, v6

    .line 89
    .line 90
    iget-object v6, v3, La/t10;->f:La/iw20;

    .line 91
    .line 92
    iget-object v7, v3, La/t10;->g:La/zas0;

    .line 93
    .line 94
    iget-object v8, v3, La/t10;->h:La/bbw0;

    .line 95
    .line 96
    iget-object v9, v3, La/t10;->i:La/ani0;

    .line 97
    .line 98
    iget-object v10, v3, La/t10;->j:La/pv00;

    .line 99
    .line 100
    iget-object v11, v3, La/t10;->k:La/s9m0;

    .line 101
    .line 102
    iget-object v12, v3, La/t10;->l:La/atz;

    .line 103
    .line 104
    iget-object v13, v3, La/t10;->m:La/r7v;

    .line 105
    .line 106
    iget-object v14, v3, La/t10;->n:La/j1q0;

    .line 107
    .line 108
    move-object/from16 v16, v1

    .line 109
    .line 110
    iget-object v1, v3, La/t10;->o:La/wdk0;

    .line 111
    .line 112
    move-object/from16 v20, v1

    .line 113
    .line 114
    iget-object v1, v3, La/t10;->p:La/bzt;

    .line 115
    .line 116
    move-object/from16 v17, v14

    .line 117
    .line 118
    iget-object v14, v3, La/t10;->q:La/epi0;

    .line 119
    .line 120
    move-object/from16 v21, v1

    .line 121
    .line 122
    iget-object v1, v3, La/t10;->r:La/ii;

    .line 123
    .line 124
    iget-object v3, v3, La/t10;->s:La/jau0;

    .line 125
    .line 126
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-object/from16 v18, v4

    .line 145
    .line 146
    new-instance v4, La/h6i;

    .line 147
    .line 148
    move-object/from16 v22, v1

    .line 149
    .line 150
    move-object/from16 v17, v2

    .line 151
    .line 152
    move-object/from16 v23, v3

    .line 153
    .line 154
    invoke-direct/range {v4 .. v23}, La/h6i;-><init>(La/x860;La/iw20;La/zas0;La/bbw0;La/ani0;La/pv00;La/s9m0;La/atz;La/r7v;La/epi0;La/ctf0;La/rou;La/mne;La/m1e;La/sa10;La/wdk0;La/bzt;La/ii;La/jau0;)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v1, v20

    .line 158
    .line 159
    move-object/from16 v2, v22

    .line 160
    .line 161
    iget-object v3, v4, La/h6i;->c:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v3, La/n5d0;

    .line 164
    .line 165
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, La/g6i;

    .line 170
    .line 171
    iput-object v3, v0, La/s10;->M1:La/g6i;

    .line 172
    .line 173
    iput-object v1, v0, La/s10;->N1:La/wdk0;

    .line 174
    .line 175
    iput-object v2, v0, La/s10;->O1:La/ii;

    .line 176
    .line 177
    return-void

    .line 178
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 179
    .line 180
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public final D0()V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/s10;->H0()La/f20;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/f20;->A:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/i8;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v8, 0x5

    .line 11
    const/4 v2, 0x2

    .line 12
    const-class v4, La/s10;

    .line 13
    .line 14
    const-string v5, "handleViewState"

    .line 15
    .line 16
    const-string v6, "handleViewState(Lorg/xplatform/verification/status/impl/presentation/old/AdditionalVerificationStatusOldViewModel$ViewState;)V"

    .line 17
    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    invoke-direct/range {v1 .. v8}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/lkz;->a:La/lkz;

    .line 24
    .line 25
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v5, La/kz;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct {v5, v0, v2, v1, v6}, La/kz;-><init>(La/gmq;La/clz;La/i8;La/yje;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    invoke-static {v3, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p0 .. p0}, La/s10;->H0()La/f20;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v7, v1, La/f20;->B:La/ol60;

    .line 52
    .line 53
    new-instance v9, La/i8;

    .line 54
    .line 55
    const/4 v15, 0x4

    .line 56
    const/16 v16, 0x6

    .line 57
    .line 58
    const/4 v10, 0x2

    .line 59
    const-string v13, "handleSingleEvent"

    .line 60
    .line 61
    const-string v14, "handleSingleEvent(Lorg/xplatform/verification/status/impl/presentation/old/AdditionalVerificationStatusOldViewModel$SingleEvent;)V"

    .line 62
    .line 63
    move-object/from16 v11, p0

    .line 64
    .line 65
    move-object v12, v4

    .line 66
    invoke-direct/range {v9 .. v16}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 67
    .line 68
    .line 69
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    move-object v10, v6

    .line 82
    new-instance v6, La/kz;

    .line 83
    .line 84
    const/4 v11, 0x0

    .line 85
    invoke-direct/range {v6 .. v11}, La/kz;-><init>(La/gmq;La/clz;La/i8;La/yje;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v10, v10, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final G0()La/n10;
    .locals 2

    .line 1
    sget-object v0, La/s10;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/s10;->K1:La/s0r;

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
    check-cast p0, La/n10;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/f20;
    .locals 0

    .line 1
    iget-object p0, p0, La/s10;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/f20;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/s10;->H0()La/f20;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, v0, La/f20;->C:Z

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 6

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/s10;->H0()La/f20;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/f20;->z:La/c4m0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, La/f20;->z:La/c4m0;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, La/f20;->g:La/m1e;

    .line 28
    .line 29
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v3, La/pa;

    .line 34
    .line 35
    const/16 v4, 0x8

    .line 36
    .line 37
    invoke-direct {v3, p0, v2, v4}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 38
    .line 39
    .line 40
    new-instance v4, La/fnq;

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    invoke-direct {v4, v0, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v3, p0, La/f20;->f:La/mne;

    .line 51
    .line 52
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 53
    .line 54
    invoke-static {v0, v3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v3, La/e20;

    .line 59
    .line 60
    invoke-direct {v3, p0, v2, v1}, La/e20;-><init>(La/f20;La/yje;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v0, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/f20;->z:La/c4m0;

    .line 68
    .line 69
    return-void
.end method
