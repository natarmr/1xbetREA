.class public final La/gau0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/gau0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kys0",
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
.field public static final P1:La/kys0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/zyi;

.field public M1:La/ii;

.field public final N1:La/cgx0;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/gau0;

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
    const-string v3, "fromBlockScreen"

    .line 16
    .line 17
    const-string v5, "getFromBlockScreen()Z"

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
    sput-object v1, La/gau0;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kys0;

    .line 33
    .line 34
    const/4 v1, 0x7

    .line 35
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/gau0;->P1:La/kys0;

    .line 39
    .line 40
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
    sget-object v0, La/eau0;->a:La/eau0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/gau0;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/cgx0;

    .line 16
    .line 17
    const-string v1, "FROM_BLOCK_SCREEN_KEY"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/gau0;->N1:La/cgx0;

    .line 24
    .line 25
    const-class v0, La/lbu0;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/dau0;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-direct {v1, p0, v2}, La/dau0;-><init>(La/gau0;B)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xe

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/gau0;->O1:La/a8z;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/dau0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/dau0;-><init>(La/gau0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p0, p1}, La/qcc;->W(Landroidx/fragment/app/Fragment;La/clz;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/gau0;->Q1:[La/iiy;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aget-object p1, p1, v1

    .line 14
    .line 15
    iget-object v1, p0, La/gau0;->K1:La/s0r;

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
    new-instance v1, La/b4u0;

    .line 29
    .line 30
    const/16 v2, 0x9

    .line 31
    .line 32
    invoke-direct {v1, v2}, La/b4u0;-><init>(B)V

    .line 33
    .line 34
    .line 35
    new-instance v2, La/ggt0;

    .line 36
    .line 37
    const/4 v3, 0x7

    .line 38
    invoke-direct {v2, p0, v3}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance p0, La/ugd;

    .line 42
    .line 43
    const v3, -0x32b5ebc3

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v1, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final C0()V
    .locals 26

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
    const-class v2, La/iau0;

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
    instance-of v4, v1, La/iau0;

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
    check-cast v3, La/iau0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v20

    .line 61
    sget-object v1, La/gau0;->Q1:[La/iiy;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    aget-object v1, v1, v2

    .line 65
    .line 66
    iget-object v2, v0, La/gau0;->N1:La/cgx0;

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v21

    .line 72
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v11, v3, La/iau0;->a:La/ctf0;

    .line 76
    .line 77
    iget-object v12, v3, La/iau0;->b:La/r9u;

    .line 78
    .line 79
    iget-object v13, v3, La/iau0;->c:La/rou;

    .line 80
    .line 81
    iget-object v14, v3, La/iau0;->d:La/bzt;

    .line 82
    .line 83
    iget-object v15, v3, La/iau0;->e:La/v88;

    .line 84
    .line 85
    iget-object v1, v3, La/iau0;->f:La/mne;

    .line 86
    .line 87
    iget-object v2, v3, La/iau0;->g:La/m1e;

    .line 88
    .line 89
    iget-object v5, v3, La/iau0;->h:La/iw20;

    .line 90
    .line 91
    iget-object v6, v3, La/iau0;->i:La/zas0;

    .line 92
    .line 93
    iget-object v4, v3, La/iau0;->j:La/wdk0;

    .line 94
    .line 95
    iget-object v7, v3, La/iau0;->k:La/ii;

    .line 96
    .line 97
    move-object/from16 v18, v7

    .line 98
    .line 99
    iget-object v7, v3, La/iau0;->l:La/zx10;

    .line 100
    .line 101
    iget-object v8, v3, La/iau0;->m:La/v6k;

    .line 102
    .line 103
    iget-object v9, v3, La/iau0;->n:La/pv00;

    .line 104
    .line 105
    iget-object v10, v3, La/iau0;->o:La/jau0;

    .line 106
    .line 107
    move-object/from16 v19, v10

    .line 108
    .line 109
    iget-object v10, v3, La/iau0;->p:La/atz;

    .line 110
    .line 111
    move-object/from16 v16, v1

    .line 112
    .line 113
    iget-object v1, v3, La/iau0;->q:La/g2v;

    .line 114
    .line 115
    move-object/from16 v22, v1

    .line 116
    .line 117
    iget-object v1, v3, La/iau0;->r:La/i7u0;

    .line 118
    .line 119
    move-object/from16 v23, v1

    .line 120
    .line 121
    iget-object v1, v3, La/iau0;->s:La/q7u0;

    .line 122
    .line 123
    iget-object v3, v3, La/iau0;->t:La/cmt;

    .line 124
    .line 125
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v4, La/f6i;

    .line 144
    .line 145
    move-object/from16 v24, v1

    .line 146
    .line 147
    move-object/from16 v17, v2

    .line 148
    .line 149
    move-object/from16 v25, v3

    .line 150
    .line 151
    invoke-direct/range {v4 .. v25}, La/f6i;-><init>(La/iw20;La/zas0;La/zx10;La/v6k;La/pv00;La/atz;La/ctf0;La/r9u;La/rou;La/bzt;La/v88;La/mne;La/m1e;La/ii;La/jau0;La/i1w0;Ljava/lang/Boolean;La/g2v;La/i7u0;La/q7u0;La/cmt;)V

    .line 152
    .line 153
    .line 154
    move-object/from16 v1, v18

    .line 155
    .line 156
    iget-object v2, v4, La/f6i;->d:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v2, La/n5d0;

    .line 159
    .line 160
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, La/zyi;

    .line 165
    .line 166
    iput-object v2, v0, La/gau0;->L1:La/zyi;

    .line 167
    .line 168
    iput-object v1, v0, La/gau0;->M1:La/ii;

    .line 169
    .line 170
    return-void

    .line 171
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 172
    .line 173
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gau0;->O1:La/a8z;

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
