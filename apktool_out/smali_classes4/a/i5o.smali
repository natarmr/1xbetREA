.class public final La/i5o;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/drs;
.implements La/ers;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "La/i5o;",
        "La/yx5;",
        "La/drs;",
        "",
        "La/ers;",
        "<init>",
        "()V",
        "a/pek",
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
.field public static final Z1:La/pek;

.field public static final synthetic a2:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/bgi;

.field public M1:La/sek;

.field public N1:La/xhi;

.field public O1:La/wdk0;

.field public P1:La/bek;

.field public Q1:La/xi70;

.field public R1:La/xex;

.field public final S1:Z

.field public final U1:Z

.field public final V1:La/khf0;

.field public final W1:La/usd;

.field public final X1:La/s0r;

.field public final Y1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/i5o;

    .line 4
    .line 5
    const-string v2, "screenParams"

    .line 6
    .line 7
    const-string v3, "getScreenParams()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/i5o;->a2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/pek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/i5o;->Z1:La/pek;

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
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/i5o;->K1:La/e9o0;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, La/i5o;->S1:Z

    .line 26
    .line 27
    iput-boolean v0, p0, La/i5o;->U1:Z

    .line 28
    .line 29
    new-instance v0, La/khf0;

    .line 30
    .line 31
    const-string v1, "params_key"

    .line 32
    .line 33
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, La/i5o;->V1:La/khf0;

    .line 37
    .line 38
    new-instance v0, La/usd;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/i5o;->W1:La/usd;

    .line 44
    .line 45
    sget-object v0, La/h5o;->a:La/h5o;

    .line 46
    .line 47
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, La/i5o;->X1:La/s0r;

    .line 52
    .line 53
    const-class v0, La/b7o;

    .line 54
    .line 55
    sget-object v1, La/sre0;->a:La/tre0;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, La/ntl;

    .line 62
    .line 63
    const/16 v2, 0x10

    .line 64
    .line 65
    invoke-direct {v1, p0, v2}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    const/16 v2, 0xe

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/i5o;->Y1:La/a8z;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/i5o;->U1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/i5o;->W1:La/usd;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, La/usd;->d(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, La/i5o;->O1:La/wdk0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, p0, La/i5o;->S1:Z

    .line 15
    .line 16
    invoke-static {p1, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    sget-object p1, La/i5o;->a2:[La/iiy;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    aget-object p1, p1, v1

    .line 23
    .line 24
    iget-object v2, p0, La/i5o;->X1:La/s0r;

    .line 25
    .line 26
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p1, La/aid;

    .line 34
    .line 35
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 36
    .line 37
    new-instance v2, La/owp0;

    .line 38
    .line 39
    invoke-direct {v2, p0}, La/owp0;-><init>(La/clz;)V

    .line 40
    .line 41
    .line 42
    new-instance v3, La/f5o;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-direct {v3, p0, v4}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    new-instance p0, La/ugd;

    .line 49
    .line 50
    const v4, -0x6133196b

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v4, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const-string p0, "snackbarManager"

    .line 61
    .line 62
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0
.end method

.method public final C0()V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/k5o;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v1, v1, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->a:J

    .line 10
    .line 11
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v3, La/cb50;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v1, v2, v3}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 25
    .line 26
    .line 27
    move-result-object v19

    .line 28
    invoke-virtual {v0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-wide v2, v2, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 33
    .line 34
    const-wide/16 v4, 0x28

    .line 35
    .line 36
    cmp-long v2, v2, v4

    .line 37
    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 44
    .line 45
    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v4, La/ypr;

    .line 57
    .line 58
    invoke-virtual {v0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-wide v5, v5, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->a:J

    .line 63
    .line 64
    invoke-virtual {v0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    iget-wide v7, v7, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 69
    .line 70
    invoke-virtual {v0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    iget-wide v9, v9, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 75
    .line 76
    invoke-virtual {v0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    iget-wide v11, v11, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->j:J

    .line 81
    .line 82
    invoke-virtual {v0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    iget-object v13, v13, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->l:La/k1g;

    .line 87
    .line 88
    const-class v14, La/i5o;

    .line 89
    .line 90
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v14

    .line 94
    invoke-direct/range {v4 .. v14}, La/ypr;-><init>(JJJJLa/k1g;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v2, La/k5o;->a:Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, La/cgi;

    .line 107
    .line 108
    if-nez v5, :cond_5

    .line 109
    .line 110
    instance-of v5, v3, La/af3;

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    if-eqz v5, :cond_1

    .line 114
    .line 115
    check-cast v3, La/af3;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    move-object v3, v6

    .line 119
    :goto_1
    const-class v5, La/j5o;

    .line 120
    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    invoke-interface {v3}, La/af3;->d()La/wcf0;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3, v5}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    check-cast v3, La/o5d0;

    .line 132
    .line 133
    if-eqz v3, :cond_2

    .line 134
    .line 135
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, La/ze3;

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_2
    move-object v3, v6

    .line 143
    :goto_2
    instance-of v7, v3, La/j5o;

    .line 144
    .line 145
    if-nez v7, :cond_3

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_3
    move-object v6, v3

    .line 149
    :goto_3
    check-cast v6, La/j5o;

    .line 150
    .line 151
    if-eqz v6, :cond_4

    .line 152
    .line 153
    iget-object v5, v6, La/j5o;->a:La/clc;

    .line 154
    .line 155
    iget-object v3, v6, La/j5o;->b:La/cad;

    .line 156
    .line 157
    iget-object v7, v6, La/j5o;->c:La/ok50;

    .line 158
    .line 159
    iget-object v8, v6, La/j5o;->d:La/mki;

    .line 160
    .line 161
    invoke-virtual {v8, v4}, La/mki;->r(La/ypr;)La/xhi;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    iget-object v13, v6, La/j5o;->e:La/iip;

    .line 166
    .line 167
    iget-object v4, v6, La/j5o;->f:La/oeg0;

    .line 168
    .line 169
    iget-object v9, v6, La/j5o;->g:La/knf0;

    .line 170
    .line 171
    iget-object v10, v6, La/j5o;->h:La/gii0;

    .line 172
    .line 173
    move-object/from16 v18, v9

    .line 174
    .line 175
    iget-object v9, v6, La/j5o;->i:La/ivn;

    .line 176
    .line 177
    move-object/from16 v20, v10

    .line 178
    .line 179
    iget-object v10, v6, La/j5o;->j:La/pyg;

    .line 180
    .line 181
    iget-object v11, v6, La/j5o;->k:La/xri;

    .line 182
    .line 183
    iget-object v12, v6, La/j5o;->l:La/pru;

    .line 184
    .line 185
    iget-object v14, v6, La/j5o;->t:La/o2j0;

    .line 186
    .line 187
    iget-object v15, v6, La/j5o;->m:La/lbu;

    .line 188
    .line 189
    move-object/from16 v22, v12

    .line 190
    .line 191
    iget-object v12, v6, La/j5o;->n:La/a1d;

    .line 192
    .line 193
    move-object/from16 v21, v1

    .line 194
    .line 195
    iget-object v1, v6, La/j5o;->o:La/m1e;

    .line 196
    .line 197
    move-object/from16 v24, v1

    .line 198
    .line 199
    iget-object v1, v6, La/j5o;->p:La/g2v;

    .line 200
    .line 201
    move-object/from16 v16, v14

    .line 202
    .line 203
    iget-object v14, v6, La/j5o;->q:La/rmd0;

    .line 204
    .line 205
    move-object/from16 v25, v1

    .line 206
    .line 207
    iget-object v1, v6, La/j5o;->r:La/wdk0;

    .line 208
    .line 209
    move-object/from16 v26, v1

    .line 210
    .line 211
    iget-object v1, v6, La/j5o;->s:La/ctf0;

    .line 212
    .line 213
    move-object/from16 v23, v15

    .line 214
    .line 215
    iget-object v15, v6, La/j5o;->u:La/ugf0;

    .line 216
    .line 217
    move-object/from16 v27, v1

    .line 218
    .line 219
    iget-object v1, v6, La/j5o;->v:La/j1q0;

    .line 220
    .line 221
    move-object/from16 v17, v1

    .line 222
    .line 223
    iget-object v1, v6, La/j5o;->w:La/r9u;

    .line 224
    .line 225
    move-object/from16 v28, v1

    .line 226
    .line 227
    iget-object v1, v6, La/j5o;->x:La/h3c;

    .line 228
    .line 229
    move-object/from16 v29, v1

    .line 230
    .line 231
    iget-object v1, v6, La/j5o;->y:La/qv2;

    .line 232
    .line 233
    move-object/from16 v30, v1

    .line 234
    .line 235
    iget-object v1, v6, La/j5o;->z:La/poq0;

    .line 236
    .line 237
    move-object/from16 v31, v1

    .line 238
    .line 239
    iget-object v1, v6, La/j5o;->A:La/sjl0;

    .line 240
    .line 241
    move-object/from16 v32, v1

    .line 242
    .line 243
    iget-object v1, v6, La/j5o;->B:La/sue;

    .line 244
    .line 245
    iget-object v6, v6, La/j5o;->C:La/ii;

    .line 246
    .line 247
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    move-object/from16 v17, v4

    .line 296
    .line 297
    new-instance v4, La/cgi;

    .line 298
    .line 299
    move-object v6, v3

    .line 300
    move-object/from16 v16, v31

    .line 301
    .line 302
    move-object/from16 v31, v32

    .line 303
    .line 304
    invoke-direct/range {v4 .. v31}, La/cgi;-><init>(La/clc;La/cad;La/ok50;La/xhi;La/ivn;La/pyg;La/xri;La/a1d;La/iip;La/rmd0;La/ugf0;La/poq0;La/oeg0;La/knf0;Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;La/gii0;Ljava/lang/String;La/pru;La/lbu;La/m1e;La/g2v;La/wdk0;La/ctf0;La/r9u;La/h3c;La/qv2;La/sjl0;)V

    .line 305
    .line 306
    .line 307
    move-object/from16 v1, v21

    .line 308
    .line 309
    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-object v5, v4

    .line 313
    goto :goto_4

    .line 314
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 315
    .line 316
    invoke-static {v5, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :cond_5
    :goto_4
    iget-object v1, v5, La/cgi;->D:La/n5d0;

    .line 325
    .line 326
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, La/bgi;

    .line 331
    .line 332
    iput-object v1, v0, La/i5o;->L1:La/bgi;

    .line 333
    .line 334
    new-instance v1, La/sek;

    .line 335
    .line 336
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 337
    .line 338
    .line 339
    iput-object v1, v0, La/i5o;->M1:La/sek;

    .line 340
    .line 341
    iget-object v1, v5, La/cgi;->g:La/xhi;

    .line 342
    .line 343
    iput-object v1, v0, La/i5o;->N1:La/xhi;

    .line 344
    .line 345
    iget-object v1, v5, La/cgi;->z:La/wdk0;

    .line 346
    .line 347
    iput-object v1, v0, La/i5o;->O1:La/wdk0;

    .line 348
    .line 349
    new-instance v1, La/bek;

    .line 350
    .line 351
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 352
    .line 353
    .line 354
    iput-object v1, v0, La/i5o;->P1:La/bek;

    .line 355
    .line 356
    iget-object v1, v5, La/cgi;->l:La/rmd0;

    .line 357
    .line 358
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    iput-object v1, v0, La/i5o;->Q1:La/xi70;

    .line 363
    .line 364
    iget-object v1, v5, La/cgi;->y:La/ok50;

    .line 365
    .line 366
    iget-object v1, v1, La/ok50;->a:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v1, La/kud;

    .line 369
    .line 370
    invoke-virtual {v1}, La/kud;->a()La/xex;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    iput-object v1, v0, La/i5o;->R1:La/xex;

    .line 375
    .line 376
    return-void
.end method

.method public final G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/i5o;->a2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/i5o;->V1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i5o;->Y1:La/a8z;

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

.method public final a()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La/i5o;->G0()Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-wide v0, p0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->a:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final q()La/xhi;
    .locals 0

    .line 1
    iget-object p0, p0, La/i5o;->N1:La/xhi;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "gameScreenFeature"

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

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/i5o;->S1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i5o;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
