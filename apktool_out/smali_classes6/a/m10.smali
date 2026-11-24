.class public final La/m10;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/m10;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/pek0",
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
.field public static final P1:La/pek0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/zz2;

.field public M1:La/e6i;

.field public N1:La/ii;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/m10;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/m10;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/pek0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/m10;->P1:La/pek0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/k10;->a:La/k10;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/m10;->K1:La/s0r;

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
    iput-object v0, p0, La/m10;->L1:La/zz2;

    .line 23
    .line 24
    const-class v0, La/s20;

    .line 25
    .line 26
    sget-object v1, La/sre0;->a:La/tre0;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/j10;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, La/j10;-><init>(La/m10;B)V

    .line 36
    .line 37
    .line 38
    const/16 v2, 0xe

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, La/m10;->O1:La/a8z;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/j10;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/j10;-><init>(La/m10;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p0, p1}, La/qcc;->W(Landroidx/fragment/app/Fragment;La/clz;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/m10;->Q1:[La/iiy;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aget-object p1, p1, v1

    .line 14
    .line 15
    iget-object v1, p0, La/m10;->K1:La/s0r;

    .line 16
    .line 17
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, La/aid;

    .line 25
    .line 26
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 27
    .line 28
    new-instance v1, La/o00;

    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    invoke-direct {v1, p0, v2}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    new-instance p0, La/ugd;

    .line 35
    .line 36
    const v2, 0x4cc3436f    # 1.02374264E8f

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final C0()V
    .locals 28

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
    const-class v2, La/o10;

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
    instance-of v4, v1, La/o10;

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
    check-cast v3, La/o10;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v23

    .line 61
    new-instance v5, La/x860;

    .line 62
    .line 63
    sget-object v1, La/m10;->Q1:[La/iiy;

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    aget-object v1, v1, v2

    .line 67
    .line 68
    iget-object v2, v0, La/m10;->L1:La/zz2;

    .line 69
    .line 70
    invoke-virtual {v2, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {v5, v1, v2}, La/x860;-><init>(IZ)V

    .line 80
    .line 81
    .line 82
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v15, v3, La/o10;->a:La/ctf0;

    .line 86
    .line 87
    iget-object v1, v3, La/o10;->b:La/rou;

    .line 88
    .line 89
    iget-object v2, v3, La/o10;->c:La/mne;

    .line 90
    .line 91
    iget-object v4, v3, La/o10;->d:La/m1e;

    .line 92
    .line 93
    iget-object v6, v3, La/o10;->e:La/iw20;

    .line 94
    .line 95
    iget-object v7, v3, La/o10;->f:La/zas0;

    .line 96
    .line 97
    iget-object v8, v3, La/o10;->g:La/bbw0;

    .line 98
    .line 99
    iget-object v9, v3, La/o10;->h:La/ani0;

    .line 100
    .line 101
    iget-object v10, v3, La/o10;->i:La/pv00;

    .line 102
    .line 103
    iget-object v11, v3, La/o10;->j:La/s9m0;

    .line 104
    .line 105
    iget-object v12, v3, La/o10;->k:La/atz;

    .line 106
    .line 107
    iget-object v13, v3, La/o10;->l:La/r7v;

    .line 108
    .line 109
    iget-object v14, v3, La/o10;->m:La/j1q0;

    .line 110
    .line 111
    move-object/from16 v16, v1

    .line 112
    .line 113
    iget-object v1, v3, La/o10;->n:La/wdk0;

    .line 114
    .line 115
    move-object/from16 v19, v1

    .line 116
    .line 117
    iget-object v1, v3, La/o10;->o:La/bzt;

    .line 118
    .line 119
    move-object/from16 v17, v14

    .line 120
    .line 121
    iget-object v14, v3, La/o10;->p:La/epi0;

    .line 122
    .line 123
    move-object/from16 v20, v1

    .line 124
    .line 125
    iget-object v1, v3, La/o10;->q:La/ii;

    .line 126
    .line 127
    move-object/from16 v21, v1

    .line 128
    .line 129
    iget-object v1, v3, La/o10;->r:La/jau0;

    .line 130
    .line 131
    move-object/from16 v22, v1

    .line 132
    .line 133
    iget-object v1, v3, La/o10;->s:La/g2v;

    .line 134
    .line 135
    move-object/from16 v24, v1

    .line 136
    .line 137
    iget-object v1, v3, La/o10;->t:La/i7u0;

    .line 138
    .line 139
    move-object/from16 v25, v1

    .line 140
    .line 141
    iget-object v1, v3, La/o10;->u:La/q7u0;

    .line 142
    .line 143
    iget-object v3, v3, La/o10;->v:La/cmt;

    .line 144
    .line 145
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-object/from16 v18, v4

    .line 164
    .line 165
    new-instance v4, La/f6i;

    .line 166
    .line 167
    move-object/from16 v26, v1

    .line 168
    .line 169
    move-object/from16 v17, v2

    .line 170
    .line 171
    move-object/from16 v27, v3

    .line 172
    .line 173
    invoke-direct/range {v4 .. v27}, La/f6i;-><init>(La/x860;La/iw20;La/zas0;La/bbw0;La/ani0;La/pv00;La/s9m0;La/atz;La/r7v;La/epi0;La/ctf0;La/rou;La/mne;La/m1e;La/wdk0;La/bzt;La/ii;La/jau0;La/i1w0;La/g2v;La/i7u0;La/q7u0;La/cmt;)V

    .line 174
    .line 175
    .line 176
    move-object/from16 v1, v21

    .line 177
    .line 178
    iget-object v2, v4, La/f6i;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, La/n5d0;

    .line 181
    .line 182
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, La/e6i;

    .line 187
    .line 188
    iput-object v2, v0, La/m10;->M1:La/e6i;

    .line 189
    .line 190
    iput-object v1, v0, La/m10;->N1:La/ii;

    .line 191
    .line 192
    return-void

    .line 193
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 194
    .line 195
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m10;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method
