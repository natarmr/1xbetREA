.class public final La/l3l;
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
        "La/l3l;",
        "La/yx5;",
        "La/drs;",
        "",
        "La/ers;",
        "<init>",
        "()V",
        "a/nek",
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
.field public static final b2:La/nek;

.field public static final synthetic c2:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/sfi;

.field public M1:La/sek;

.field public N1:La/bek;

.field public O1:La/xhi;

.field public P1:La/wdk0;

.field public Q1:La/poq0;

.field public R1:La/xi70;

.field public S1:La/xex;

.field public final U1:La/usd;

.field public final V1:Z

.field public final W1:Z

.field public final X1:La/a8z;

.field public final Y1:La/s0r;

.field public final Z1:La/khf0;

.field public final a2:La/amw;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/l3l;

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
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;"

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
    sput-object v1, La/l3l;->c2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/nek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/l3l;->b2:La/nek;

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
    iput-object v0, p0, La/l3l;->K1:La/e9o0;

    .line 23
    .line 24
    new-instance v0, La/usd;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/l3l;->U1:La/usd;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, La/l3l;->V1:Z

    .line 33
    .line 34
    iput-boolean v0, p0, La/l3l;->W1:Z

    .line 35
    .line 36
    const-class v0, La/ebl;

    .line 37
    .line 38
    sget-object v1, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/ucj;

    .line 45
    .line 46
    const/16 v2, 0x11

    .line 47
    .line 48
    invoke-direct {v1, p0, v2}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    const/16 v2, 0xe

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/l3l;->X1:La/a8z;

    .line 59
    .line 60
    sget-object v0, La/k3l;->a:La/k3l;

    .line 61
    .line 62
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/l3l;->Y1:La/s0r;

    .line 67
    .line 68
    new-instance v0, La/khf0;

    .line 69
    .line 70
    const-string v1, "params_key"

    .line 71
    .line 72
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, La/l3l;->Z1:La/khf0;

    .line 76
    .line 77
    new-instance v0, La/amw;

    .line 78
    .line 79
    invoke-direct {v0}, La/amw;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, La/l3l;->a2:La/amw;

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/l3l;->W1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/l3l;->U1:La/usd;

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
    iget-object p1, p0, La/l3l;->P1:La/wdk0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, p0, La/l3l;->V1:Z

    .line 15
    .line 16
    invoke-static {p1, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    sget-object p1, La/l3l;->c2:[La/iiy;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    aget-object p1, p1, v1

    .line 23
    .line 24
    iget-object v2, p0, La/l3l;->Y1:La/s0r;

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
    new-instance v3, La/i3l;

    .line 43
    .line 44
    invoke-direct {v3, p0, v1}, La/i3l;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    new-instance p0, La/ugd;

    .line 48
    .line 49
    const v1, 0x64dc9b34

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    invoke-direct {p0, v1, v4, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

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
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/n3l;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, La/l3l;->G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v1, v1, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->a:J

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
    invoke-virtual {v0}, La/l3l;->G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 25
    .line 26
    .line 27
    move-result-object v18

    .line 28
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v4, La/ypr;

    .line 42
    .line 43
    invoke-virtual {v0}, La/l3l;->G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-wide v5, v5, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->a:J

    .line 48
    .line 49
    invoke-virtual {v0}, La/l3l;->G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    iget-wide v7, v7, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->e:J

    .line 54
    .line 55
    invoke-virtual {v0}, La/l3l;->G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    iget-wide v9, v9, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->d:J

    .line 60
    .line 61
    invoke-virtual {v0}, La/l3l;->G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    iget-wide v11, v11, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->h:J

    .line 66
    .line 67
    invoke-virtual {v0}, La/l3l;->G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    iget-object v13, v13, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->j:La/k1g;

    .line 72
    .line 73
    const-class v14, La/l3l;

    .line 74
    .line 75
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    invoke-direct/range {v4 .. v14}, La/ypr;-><init>(JJJJLa/k1g;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v2, La/n3l;->a:Ljava/util/LinkedHashMap;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, La/tfi;

    .line 92
    .line 93
    if-nez v5, :cond_4

    .line 94
    .line 95
    instance-of v5, v3, La/af3;

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    if-eqz v5, :cond_0

    .line 99
    .line 100
    check-cast v3, La/af3;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move-object v3, v6

    .line 104
    :goto_0
    const-class v5, La/m3l;

    .line 105
    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    invoke-interface {v3}, La/af3;->d()La/wcf0;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v3, v5}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, La/o5d0;

    .line 117
    .line 118
    if-eqz v3, :cond_1

    .line 119
    .line 120
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, La/ze3;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    move-object v3, v6

    .line 128
    :goto_1
    instance-of v7, v3, La/m3l;

    .line 129
    .line 130
    if-nez v7, :cond_2

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    move-object v6, v3

    .line 134
    :goto_2
    check-cast v6, La/m3l;

    .line 135
    .line 136
    if-eqz v6, :cond_3

    .line 137
    .line 138
    iget-object v5, v6, La/m3l;->a:La/clc;

    .line 139
    .line 140
    iget-object v3, v6, La/m3l;->b:La/cad;

    .line 141
    .line 142
    iget-object v7, v6, La/m3l;->d:La/mki;

    .line 143
    .line 144
    invoke-virtual {v7, v4}, La/mki;->r(La/ypr;)La/xhi;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    iget-object v12, v6, La/m3l;->g:La/iip;

    .line 149
    .line 150
    iget-object v4, v6, La/m3l;->m:La/o2j0;

    .line 151
    .line 152
    iget-object v7, v6, La/m3l;->h:La/oeg0;

    .line 153
    .line 154
    iget-object v9, v6, La/m3l;->i:La/gii0;

    .line 155
    .line 156
    move-object/from16 v19, v7

    .line 157
    .line 158
    iget-object v7, v6, La/m3l;->c:La/ok50;

    .line 159
    .line 160
    move-object v10, v9

    .line 161
    iget-object v9, v6, La/m3l;->e:La/ivn;

    .line 162
    .line 163
    iget-object v11, v6, La/m3l;->f:La/xri;

    .line 164
    .line 165
    move-object v13, v10

    .line 166
    iget-object v10, v6, La/m3l;->j:La/pyg;

    .line 167
    .line 168
    iget-object v14, v6, La/m3l;->k:La/pru;

    .line 169
    .line 170
    iget-object v15, v6, La/m3l;->l:La/lbu;

    .line 171
    .line 172
    move-object/from16 v16, v11

    .line 173
    .line 174
    iget-object v11, v6, La/m3l;->n:La/a1d;

    .line 175
    .line 176
    move-object/from16 v20, v1

    .line 177
    .line 178
    iget-object v1, v6, La/m3l;->o:La/m1e;

    .line 179
    .line 180
    move-object/from16 v23, v1

    .line 181
    .line 182
    iget-object v1, v6, La/m3l;->p:La/g2v;

    .line 183
    .line 184
    move-object/from16 v24, v1

    .line 185
    .line 186
    iget-object v1, v6, La/m3l;->q:La/knf0;

    .line 187
    .line 188
    move-object/from16 v17, v13

    .line 189
    .line 190
    iget-object v13, v6, La/m3l;->r:La/rmd0;

    .line 191
    .line 192
    move-object/from16 v21, v1

    .line 193
    .line 194
    iget-object v1, v6, La/m3l;->s:La/wdk0;

    .line 195
    .line 196
    move-object/from16 v22, v21

    .line 197
    .line 198
    move-object/from16 v21, v14

    .line 199
    .line 200
    iget-object v14, v6, La/m3l;->t:La/roi0;

    .line 201
    .line 202
    move-object/from16 v25, v1

    .line 203
    .line 204
    iget-object v1, v6, La/m3l;->u:La/dwu;

    .line 205
    .line 206
    move-object/from16 v26, v22

    .line 207
    .line 208
    move-object/from16 v22, v15

    .line 209
    .line 210
    iget-object v15, v6, La/m3l;->v:La/rrc;

    .line 211
    .line 212
    move-object/from16 v27, v1

    .line 213
    .line 214
    iget-object v1, v6, La/m3l;->w:La/ctf0;

    .line 215
    .line 216
    move-object/from16 v28, v1

    .line 217
    .line 218
    iget-object v1, v6, La/m3l;->x:La/ugf0;

    .line 219
    .line 220
    move-object/from16 v29, v1

    .line 221
    .line 222
    iget-object v1, v6, La/m3l;->y:La/poq0;

    .line 223
    .line 224
    move-object/from16 v30, v1

    .line 225
    .line 226
    iget-object v1, v6, La/m3l;->z:La/r9u;

    .line 227
    .line 228
    move-object/from16 v31, v1

    .line 229
    .line 230
    iget-object v1, v6, La/m3l;->A:La/h3c;

    .line 231
    .line 232
    move-object/from16 v32, v1

    .line 233
    .line 234
    iget-object v1, v6, La/m3l;->B:La/qv2;

    .line 235
    .line 236
    move-object/from16 v33, v1

    .line 237
    .line 238
    iget-object v1, v6, La/m3l;->C:La/sue;

    .line 239
    .line 240
    move-object/from16 v34, v1

    .line 241
    .line 242
    iget-object v1, v6, La/m3l;->D:La/ii;

    .line 243
    .line 244
    iget-object v6, v6, La/m3l;->E:La/qgh;

    .line 245
    .line 246
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    new-instance v4, La/tfi;

    .line 289
    .line 290
    move-object/from16 v26, v27

    .line 291
    .line 292
    move-object/from16 v27, v28

    .line 293
    .line 294
    move-object/from16 v16, v29

    .line 295
    .line 296
    move-object/from16 v17, v30

    .line 297
    .line 298
    move-object/from16 v28, v31

    .line 299
    .line 300
    move-object/from16 v29, v32

    .line 301
    .line 302
    move-object/from16 v30, v33

    .line 303
    .line 304
    move-object/from16 v31, v6

    .line 305
    .line 306
    move-object v6, v3

    .line 307
    invoke-direct/range {v4 .. v31}, La/tfi;-><init>(La/clc;La/cad;La/ok50;La/xhi;La/ivn;La/pyg;La/a1d;La/iip;La/rmd0;La/roi0;La/rrc;La/ugf0;La/poq0;Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;La/oeg0;Ljava/lang/String;La/pru;La/lbu;La/m1e;La/g2v;La/wdk0;La/dwu;La/ctf0;La/r9u;La/h3c;La/qv2;La/qgh;)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v1, v20

    .line 311
    .line 312
    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-object v5, v4

    .line 316
    goto :goto_3

    .line 317
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 318
    .line 319
    invoke-static {v5, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :cond_4
    :goto_3
    iget-object v1, v5, La/tfi;->B:La/n5d0;

    .line 328
    .line 329
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, La/sfi;

    .line 334
    .line 335
    iput-object v1, v0, La/l3l;->L1:La/sfi;

    .line 336
    .line 337
    new-instance v1, La/sek;

    .line 338
    .line 339
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 340
    .line 341
    .line 342
    iput-object v1, v0, La/l3l;->M1:La/sek;

    .line 343
    .line 344
    new-instance v1, La/bek;

    .line 345
    .line 346
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 347
    .line 348
    .line 349
    iput-object v1, v0, La/l3l;->N1:La/bek;

    .line 350
    .line 351
    iget-object v1, v5, La/tfi;->d:La/xhi;

    .line 352
    .line 353
    iput-object v1, v0, La/l3l;->O1:La/xhi;

    .line 354
    .line 355
    iget-object v1, v5, La/tfi;->A:La/wdk0;

    .line 356
    .line 357
    iput-object v1, v0, La/l3l;->P1:La/wdk0;

    .line 358
    .line 359
    iget-object v1, v5, La/tfi;->n:La/poq0;

    .line 360
    .line 361
    iput-object v1, v0, La/l3l;->Q1:La/poq0;

    .line 362
    .line 363
    iget-object v1, v5, La/tfi;->f:La/rmd0;

    .line 364
    .line 365
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    iput-object v1, v0, La/l3l;->R1:La/xi70;

    .line 370
    .line 371
    iget-object v1, v5, La/tfi;->z:La/ok50;

    .line 372
    .line 373
    iget-object v1, v1, La/ok50;->a:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v1, La/kud;

    .line 376
    .line 377
    invoke-virtual {v1}, La/kud;->a()La/xex;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iput-object v1, v0, La/l3l;->S1:La/xex;

    .line 382
    .line 383
    return-void
.end method

.method public final G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/l3l;->c2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/l3l;->Z1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l3l;->X1:La/a8z;

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
    invoke-virtual {p0}, La/l3l;->G0()Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-wide v0, p0, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->a:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final q()La/xhi;
    .locals 0

    .line 1
    iget-object p0, p0, La/l3l;->O1:La/xhi;

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
    iget-boolean p0, p0, La/l3l;->V1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l3l;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
