.class public final La/v8u0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/v8u0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/sxs0",
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
.field public static final P1:La/sxs0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/zz2;

.field public M1:La/wdk0;

.field public N1:La/wyi;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/v8u0;

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
    const-string v3, "verificationType"

    .line 16
    .line 17
    const-string v5, "getVerificationType()I"

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
    sput-object v1, La/v8u0;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/sxs0;

    .line 33
    .line 34
    const/4 v1, 0x7

    .line 35
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/v8u0;->P1:La/sxs0;

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
    sget-object v0, La/u8u0;->a:La/u8u0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/v8u0;->K1:La/s0r;

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
    iput-object v0, p0, La/v8u0;->L1:La/zz2;

    .line 23
    .line 24
    const-class v0, La/q9u0;

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
    new-instance v1, La/t8u0;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, La/t8u0;-><init>(La/v8u0;B)V

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
    iput-object v0, p0, La/v8u0;->O1:La/a8z;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/t8u0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/t8u0;-><init>(La/v8u0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p0, p1}, La/qcc;->W(Landroidx/fragment/app/Fragment;La/clz;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/v8u0;->Q1:[La/iiy;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aget-object p1, p1, v1

    .line 14
    .line 15
    iget-object v1, p0, La/v8u0;->K1:La/s0r;

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
    new-instance v1, La/ggt0;

    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    invoke-direct {v1, p0, v2}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    new-instance p0, La/ugd;

    .line 35
    .line 36
    const v2, 0x45366a51

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
    .locals 20

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
    const-class v2, La/w8u0;

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
    instance-of v4, v1, La/w8u0;

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
    check-cast v3, La/w8u0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v17

    .line 61
    new-instance v5, La/x860;

    .line 62
    .line 63
    sget-object v1, La/v8u0;->Q1:[La/iiy;

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    aget-object v1, v1, v2

    .line 67
    .line 68
    iget-object v2, v0, La/v8u0;->L1:La/zz2;

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
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v6, v3, La/w8u0;->a:La/gii0;

    .line 86
    .line 87
    iget-object v7, v3, La/w8u0;->b:La/btt0;

    .line 88
    .line 89
    iget-object v8, v3, La/w8u0;->c:La/vwb0;

    .line 90
    .line 91
    iget-object v9, v3, La/w8u0;->d:La/vby;

    .line 92
    .line 93
    iget-object v10, v3, La/w8u0;->e:La/pmi;

    .line 94
    .line 95
    iget-object v11, v3, La/w8u0;->f:La/bbw0;

    .line 96
    .line 97
    iget-object v12, v3, La/w8u0;->g:La/ilp0;

    .line 98
    .line 99
    iget-object v13, v3, La/w8u0;->h:La/mne;

    .line 100
    .line 101
    iget-object v14, v3, La/w8u0;->i:La/wdk0;

    .line 102
    .line 103
    iget-object v15, v3, La/w8u0;->j:La/g2v;

    .line 104
    .line 105
    iget-object v1, v3, La/w8u0;->k:La/ctf0;

    .line 106
    .line 107
    iget-object v2, v3, La/w8u0;->l:La/i7u0;

    .line 108
    .line 109
    iget-object v3, v3, La/w8u0;->m:La/q7u0;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v4, La/v7i;

    .line 130
    .line 131
    move-object/from16 v16, v1

    .line 132
    .line 133
    move-object/from16 v18, v2

    .line 134
    .line 135
    move-object/from16 v19, v3

    .line 136
    .line 137
    invoke-direct/range {v4 .. v19}, La/v7i;-><init>(La/x860;La/gii0;La/btt0;La/vwb0;La/vby;La/pmi;La/bbw0;La/ilp0;La/mne;La/wdk0;La/g2v;La/ctf0;La/i1w0;La/i7u0;La/q7u0;)V

    .line 138
    .line 139
    .line 140
    iput-object v14, v0, La/v8u0;->M1:La/wdk0;

    .line 141
    .line 142
    iget-object v1, v4, La/v7i;->o:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, La/n5d0;

    .line 145
    .line 146
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, La/wyi;

    .line 151
    .line 152
    iput-object v1, v0, La/v8u0;->N1:La/wyi;

    .line 153
    .line 154
    return-void

    .line 155
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 156
    .line 157
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method
