.class public final La/wpr0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wpr0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/s9m0",
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
.field public static final P1:La/s9m0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public N1:La/ii;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/wpr0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/toto_jackpot/impl/databinding/FragmentTotoJackpotDsBinding;"

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
    sput-object v1, La/wpr0;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/s9m0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/wpr0;->P1:La/s9m0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d02fb

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
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/wpr0;->K1:La/e9o0;

    .line 23
    .line 24
    sget-object v0, La/vpr0;->a:La/vpr0;

    .line 25
    .line 26
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/wpr0;->L1:La/s0r;

    .line 31
    .line 32
    const-class v0, La/psr0;

    .line 33
    .line 34
    sget-object v1, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, La/upr0;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v1, p0, v2}, La/upr0;-><init>(La/wpr0;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/wpr0;->O1:La/a8z;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    new-instance p1, La/upr0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/upr0;-><init>(La/wpr0;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "REQUEST_JACKPOT_CLEAR_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/wpr0;->Q1:[La/iiy;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    iget-object v3, p0, La/wpr0;->L1:La/s0r;

    .line 18
    .line 19
    invoke-virtual {v3, v2, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast v2, La/e6r;

    .line 27
    .line 28
    iget-object v2, v2, La/e6r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 29
    .line 30
    sget-object v4, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-static {v2}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    iget-object v2, v2, La/xiv0;->a:La/uiv0;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, La/uiv0;->i(I)La/pfx;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    iget v2, v2, La/pfx;->b:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v2, v1

    .line 50
    :goto_0
    aget-object p1, p1, v1

    .line 51
    .line 52
    invoke-virtual {v3, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast p1, La/e6r;

    .line 60
    .line 61
    iget-object p1, p1, La/e6r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 62
    .line 63
    new-instance v1, La/nb50;

    .line 64
    .line 65
    const/16 v3, 0x17

    .line 66
    .line 67
    invoke-direct {v1, p0, v2, v3}, La/nb50;-><init>(Ljava/lang/Object;IB)V

    .line 68
    .line 69
    .line 70
    new-instance v2, La/ugd;

    .line 71
    .line 72
    const v3, 0x39c136c7

    .line 73
    .line 74
    .line 75
    invoke-direct {v2, v3, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-static {p1, v0, v2}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 80
    .line 81
    .line 82
    new-instance p1, La/upr0;

    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    invoke-direct {p1, p0, v0}, La/upr0;-><init>(La/wpr0;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final C0()V
    .locals 22

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
    const-class v2, La/u0y;

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
    instance-of v4, v1, La/u0y;

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
    check-cast v3, La/u0y;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v8, v3, La/u0y;->c:La/sa10;

    .line 65
    .line 66
    iget-object v9, v3, La/u0y;->d:La/m1e;

    .line 67
    .line 68
    iget-object v7, v3, La/u0y;->b:La/gle0;

    .line 69
    .line 70
    iget-object v10, v3, La/u0y;->e:La/duj;

    .line 71
    .line 72
    iget-object v5, v3, La/u0y;->f:La/wsf0;

    .line 73
    .line 74
    iget-object v11, v3, La/u0y;->g:La/pru;

    .line 75
    .line 76
    iget-object v1, v3, La/u0y;->h:La/wdk0;

    .line 77
    .line 78
    iget-object v13, v3, La/u0y;->i:La/ii;

    .line 79
    .line 80
    iget-object v6, v3, La/u0y;->a:La/cad;

    .line 81
    .line 82
    iget-object v14, v3, La/u0y;->j:La/ctf0;

    .line 83
    .line 84
    iget-object v15, v3, La/u0y;->k:La/csr0;

    .line 85
    .line 86
    iget-object v2, v3, La/u0y;->l:La/knf0;

    .line 87
    .line 88
    iget-object v4, v3, La/u0y;->m:La/gii0;

    .line 89
    .line 90
    move-object/from16 v16, v1

    .line 91
    .line 92
    iget-object v1, v3, La/u0y;->n:La/btt0;

    .line 93
    .line 94
    move-object/from16 v19, v1

    .line 95
    .line 96
    iget-object v1, v3, La/u0y;->o:La/hqr0;

    .line 97
    .line 98
    move-object/from16 v17, v1

    .line 99
    .line 100
    iget-object v1, v3, La/u0y;->p:La/tgk;

    .line 101
    .line 102
    iget-object v3, v3, La/u0y;->q:La/r9u;

    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-object/from16 v18, v4

    .line 138
    .line 139
    new-instance v4, La/cr;

    .line 140
    .line 141
    move-object/from16 v20, v1

    .line 142
    .line 143
    move-object/from16 v21, v3

    .line 144
    .line 145
    move-object/from16 v16, v17

    .line 146
    .line 147
    move-object/from16 v17, v2

    .line 148
    .line 149
    invoke-direct/range {v4 .. v21}, La/cr;-><init>(La/wsf0;La/cad;La/gle0;La/sa10;La/m1e;La/duj;La/pru;La/i1w0;La/ii;La/ctf0;La/csr0;La/hqr0;La/knf0;La/gii0;La/btt0;La/tgk;La/r9u;)V

    .line 150
    .line 151
    .line 152
    new-instance v1, La/fiu0;

    .line 153
    .line 154
    iget-object v2, v4, La/cr;->q:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v2, La/tii;

    .line 157
    .line 158
    const-class v3, La/psr0;

    .line 159
    .line 160
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 165
    .line 166
    .line 167
    iput-object v1, v0, La/wpr0;->M1:La/fiu0;

    .line 168
    .line 169
    iput-object v13, v0, La/wpr0;->N1:La/ii;

    .line 170
    .line 171
    return-void

    .line 172
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 173
    .line 174
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wpr0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
