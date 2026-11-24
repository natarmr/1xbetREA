.class public final La/hq50;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/hq50;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xuz",
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
.field public static final R1:La/xuz;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/a8z;

.field public final M1:La/zz2;

.field public final N1:La/phf0;

.field public final O1:La/phf0;

.field public final P1:Z

.field public final Q1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/hq50;

    .line 4
    .line 5
    const-string v2, "bannerType"

    .line 6
    .line 7
    const-string v3, "getBannerType()I"

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
    const-string v3, "bundleTitle"

    .line 16
    .line 17
    const-string v5, "getBundleTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bundleCode"

    .line 25
    .line 26
    const-string v6, "getBundleCode()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentComposeBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/hq50;->S1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/xuz;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/hq50;->R1:La/xuz;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d021b

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/sq50;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/eq50;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/eq50;-><init>(La/hq50;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/hq50;->L1:La/a8z;

    .line 26
    .line 27
    new-instance v0, La/zz2;

    .line 28
    .line 29
    const-string v1, "ID"

    .line 30
    .line 31
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/hq50;->M1:La/zz2;

    .line 35
    .line 36
    new-instance v0, La/phf0;

    .line 37
    .line 38
    const-string v1, "BANNER_TITLE"

    .line 39
    .line 40
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/hq50;->N1:La/phf0;

    .line 44
    .line 45
    new-instance v0, La/phf0;

    .line 46
    .line 47
    const-string v1, "BANNER_CODE"

    .line 48
    .line 49
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, La/hq50;->O1:La/phf0;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, La/hq50;->P1:Z

    .line 56
    .line 57
    sget-object v0, La/fq50;->a:La/fq50;

    .line 58
    .line 59
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/hq50;->Q1:La/s0r;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/o7k0;->c:La/n0q;

    .line 2
    .line 3
    sget-object v0, La/hq50;->S1:[La/iiy;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    iget-object v1, p0, La/hq50;->Q1:La/s0r;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v0, La/ezq;

    .line 18
    .line 19
    iget-object v0, v0, La/ezq;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 20
    .line 21
    new-instance v1, La/ba30;

    .line 22
    .line 23
    const/16 v2, 0x17

    .line 24
    .line 25
    invoke-direct {v1, p0, p1, v2}, La/ba30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance p0, La/ugd;

    .line 29
    .line 30
    const p1, 0x593384c4

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {p0, p1, v2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final C0()V
    .locals 23

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
    const-class v2, La/kt50;

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
    instance-of v4, v1, La/kt50;

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
    check-cast v3, La/kt50;

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
    new-instance v1, La/ws5;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    sget-object v4, La/hq50;->S1:[La/iiy;

    .line 65
    .line 66
    aget-object v2, v4, v2

    .line 67
    .line 68
    iget-object v5, v0, La/hq50;->M1:La/zz2;

    .line 69
    .line 70
    invoke-virtual {v5, v0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    sget-object v5, La/mvc;->b:La/cl5;

    .line 79
    .line 80
    iget-object v6, v0, La/hq50;->O1:La/phf0;

    .line 81
    .line 82
    const/4 v7, 0x2

    .line 83
    aget-object v4, v4, v7

    .line 84
    .line 85
    invoke-virtual {v6, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v4}, La/cl5;->r(Ljava/lang/String;)La/mvc;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-direct {v1, v2, v4}, La/ws5;-><init>(ILa/mvc;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v5, La/iw20;

    .line 103
    .line 104
    invoke-direct {v5, v1}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v3, La/kt50;->a:La/nv20;

    .line 108
    .line 109
    iget-object v1, v1, La/nv20;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, La/h6i;

    .line 112
    .line 113
    invoke-virtual {v1}, La/h6i;->c()La/yox;

    .line 114
    .line 115
    .line 116
    move v1, v7

    .line 117
    iget-object v7, v3, La/kt50;->f:La/m1e;

    .line 118
    .line 119
    iget-object v8, v3, La/kt50;->b:La/qu;

    .line 120
    .line 121
    iget-object v9, v3, La/kt50;->c:La/zrt;

    .line 122
    .line 123
    iget-object v10, v3, La/kt50;->d:La/yo4;

    .line 124
    .line 125
    iget-object v11, v3, La/kt50;->e:La/x20;

    .line 126
    .line 127
    iget-object v13, v3, La/kt50;->g:La/duj;

    .line 128
    .line 129
    iget-object v14, v3, La/kt50;->h:La/wv70;

    .line 130
    .line 131
    iget-object v6, v3, La/kt50;->i:La/cad;

    .line 132
    .line 133
    iget-object v15, v3, La/kt50;->j:La/sa10;

    .line 134
    .line 135
    iget-object v2, v3, La/kt50;->k:La/wdk0;

    .line 136
    .line 137
    iget-object v4, v3, La/kt50;->l:La/lyt;

    .line 138
    .line 139
    iget-object v1, v3, La/kt50;->m:La/pru;

    .line 140
    .line 141
    move-object/from16 v18, v1

    .line 142
    .line 143
    iget-object v1, v3, La/kt50;->n:La/pyg;

    .line 144
    .line 145
    move-object/from16 v17, v1

    .line 146
    .line 147
    iget-object v1, v3, La/kt50;->o:La/nyt;

    .line 148
    .line 149
    move-object/from16 v19, v1

    .line 150
    .line 151
    iget-object v1, v3, La/kt50;->p:La/dst;

    .line 152
    .line 153
    move-object/from16 v20, v1

    .line 154
    .line 155
    iget-object v1, v3, La/kt50;->q:La/ctf0;

    .line 156
    .line 157
    move-object/from16 v21, v1

    .line 158
    .line 159
    iget-object v1, v3, La/kt50;->r:La/fsd;

    .line 160
    .line 161
    iget-object v3, v3, La/kt50;->s:La/bzt;

    .line 162
    .line 163
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-object/from16 v17, v4

    .line 179
    .line 180
    new-instance v4, La/gbi;

    .line 181
    .line 182
    move-object/from16 v16, v2

    .line 183
    .line 184
    move-object/from16 v22, v3

    .line 185
    .line 186
    const/4 v1, 0x2

    .line 187
    invoke-direct/range {v4 .. v22}, La/gbi;-><init>(La/iw20;La/cad;La/m1e;La/qu;La/zrt;La/yo4;La/x20;La/i1w0;La/duj;La/wv70;La/sa10;La/wdk0;La/lyt;La/pru;La/nyt;La/dst;La/ctf0;La/bzt;)V

    .line 188
    .line 189
    .line 190
    new-instance v2, La/fiu0;

    .line 191
    .line 192
    new-instance v3, La/iyk;

    .line 193
    .line 194
    invoke-direct {v3, v1}, La/iyk;-><init>(I)V

    .line 195
    .line 196
    .line 197
    iget-object v1, v4, La/gbi;->r:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, La/gji;

    .line 200
    .line 201
    const-class v5, La/uw50;

    .line 202
    .line 203
    invoke-virtual {v3, v5, v1}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iget-object v1, v4, La/gbi;->s:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, La/gji;

    .line 209
    .line 210
    const-class v4, La/sq50;

    .line 211
    .line 212
    invoke-virtual {v3, v4, v1}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, La/iyk;->a()Ljava/util/Map;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-direct {v2, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 220
    .line 221
    .line 222
    iput-object v2, v0, La/hq50;->K1:La/fiu0;

    .line 223
    .line 224
    return-void

    .line 225
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 226
    .line 227
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/hq50;->P1:Z

    .line 2
    .line 3
    return p0
.end method
