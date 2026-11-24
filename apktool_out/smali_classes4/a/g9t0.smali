.class public final La/g9t0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/g9t0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/svs0",
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
.field public static final U1:La/svs0;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:Z

.field public M1:La/fiu0;

.field public N1:La/ujd;

.field public O1:La/wdk0;

.field public P1:La/poq0;

.field public final Q1:La/a8z;

.field public final R1:La/qdz;

.field public final S1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/g9t0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/g9t0;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/svs0;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, v1}, La/svs0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/g9t0;->U1:La/svs0;

    .line 27
    .line 28
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
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const v3, 0x7f040b5d

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/g9t0;->K1:La/e9o0;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, La/g9t0;->L1:Z

    .line 24
    .line 25
    const-class v0, La/jdt0;

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
    new-instance v1, La/f9t0;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, La/f9t0;-><init>(La/g9t0;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/g9t0;->Q1:La/a8z;

    .line 44
    .line 45
    new-instance v0, La/qdz;

    .line 46
    .line 47
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/g9t0;->R1:La/qdz;

    .line 51
    .line 52
    new-instance v0, La/khf0;

    .line 53
    .line 54
    const-string v1, "UNIVERSAL_CHAMP_PARAMS"

    .line 55
    .line 56
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/g9t0;->S1:La/khf0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 36

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
    const-class v2, La/h9t0;

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
    instance-of v4, v1, La/h9t0;

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
    check-cast v3, La/h9t0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/g9t0;->V1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/g9t0;->S1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object/from16 v16, v1

    .line 69
    .line 70
    check-cast v16, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 71
    .line 72
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 73
    .line 74
    .line 75
    move-result-object v17

    .line 76
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v5, v3, La/h9t0;->a:La/cad;

    .line 80
    .line 81
    iget-object v6, v3, La/h9t0;->b:La/lsn;

    .line 82
    .line 83
    iget-object v7, v3, La/h9t0;->c:La/iip;

    .line 84
    .line 85
    iget-object v8, v3, La/h9t0;->d:La/pyg;

    .line 86
    .line 87
    iget-object v9, v3, La/h9t0;->e:La/vqc;

    .line 88
    .line 89
    iget-object v10, v3, La/h9t0;->f:La/ugf0;

    .line 90
    .line 91
    iget-object v11, v3, La/h9t0;->g:La/itr;

    .line 92
    .line 93
    iget-object v12, v3, La/h9t0;->h:La/xri;

    .line 94
    .line 95
    iget-object v13, v3, La/h9t0;->i:La/rrc;

    .line 96
    .line 97
    iget-object v14, v3, La/h9t0;->j:La/roi0;

    .line 98
    .line 99
    iget-object v15, v3, La/h9t0;->k:La/gt5;

    .line 100
    .line 101
    iget-object v1, v3, La/h9t0;->l:La/ctf0;

    .line 102
    .line 103
    iget-object v2, v3, La/h9t0;->m:La/pru;

    .line 104
    .line 105
    iget-object v4, v3, La/h9t0;->n:La/rtu;

    .line 106
    .line 107
    move-object/from16 v18, v1

    .line 108
    .line 109
    iget-object v1, v3, La/h9t0;->o:La/lbu;

    .line 110
    .line 111
    move-object/from16 v21, v1

    .line 112
    .line 113
    iget-object v1, v3, La/h9t0;->p:La/y78;

    .line 114
    .line 115
    move-object/from16 v22, v1

    .line 116
    .line 117
    iget-object v1, v3, La/h9t0;->r:La/r9u;

    .line 118
    .line 119
    move-object/from16 v23, v1

    .line 120
    .line 121
    iget-object v1, v3, La/h9t0;->s:La/pmi;

    .line 122
    .line 123
    move-object/from16 v24, v1

    .line 124
    .line 125
    iget-object v1, v3, La/h9t0;->t:La/wiu;

    .line 126
    .line 127
    move-object/from16 v25, v1

    .line 128
    .line 129
    iget-object v1, v3, La/h9t0;->u:La/wdk0;

    .line 130
    .line 131
    move-object/from16 v27, v1

    .line 132
    .line 133
    iget-object v1, v3, La/h9t0;->v:La/grj;

    .line 134
    .line 135
    move-object/from16 v28, v1

    .line 136
    .line 137
    iget-object v1, v3, La/h9t0;->w:La/knf0;

    .line 138
    .line 139
    move-object/from16 v29, v1

    .line 140
    .line 141
    iget-object v1, v3, La/h9t0;->x:La/gii0;

    .line 142
    .line 143
    move-object/from16 v30, v1

    .line 144
    .line 145
    iget-object v1, v3, La/h9t0;->y:La/g2v;

    .line 146
    .line 147
    move-object/from16 v31, v1

    .line 148
    .line 149
    iget-object v1, v3, La/h9t0;->z:La/m1e;

    .line 150
    .line 151
    move-object/from16 v32, v1

    .line 152
    .line 153
    iget-object v1, v3, La/h9t0;->q:La/kt2;

    .line 154
    .line 155
    move-object/from16 v26, v1

    .line 156
    .line 157
    iget-object v1, v3, La/h9t0;->A:La/poq0;

    .line 158
    .line 159
    move-object/from16 v33, v1

    .line 160
    .line 161
    iget-object v1, v3, La/h9t0;->B:La/zr1;

    .line 162
    .line 163
    iget-object v3, v3, La/h9t0;->C:La/vby;

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-object/from16 v20, v4

    .line 205
    .line 206
    new-instance v4, La/mai;

    .line 207
    .line 208
    move-object/from16 v34, v1

    .line 209
    .line 210
    move-object/from16 v19, v2

    .line 211
    .line 212
    move-object/from16 v35, v3

    .line 213
    .line 214
    invoke-direct/range {v4 .. v35}, La/mai;-><init>(La/cad;La/lsn;La/iip;La/pyg;La/vqc;La/ugf0;La/itr;La/xri;La/rrc;La/roi0;La/gt5;Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;La/i1w0;La/ctf0;La/pru;La/rtu;La/lbu;La/y78;La/r9u;La/pmi;La/wiu;La/kt2;La/wdk0;La/grj;La/knf0;La/gii0;La/g2v;La/m1e;La/poq0;La/zr1;La/vby;)V

    .line 215
    .line 216
    .line 217
    move-object/from16 v1, v27

    .line 218
    .line 219
    move-object/from16 v2, v33

    .line 220
    .line 221
    new-instance v3, La/fiu0;

    .line 222
    .line 223
    iget-object v4, v4, La/mai;->i:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v4, La/msi;

    .line 226
    .line 227
    const-class v5, La/jdt0;

    .line 228
    .line 229
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 234
    .line 235
    .line 236
    iput-object v3, v0, La/g9t0;->M1:La/fiu0;

    .line 237
    .line 238
    invoke-interface {v11}, La/itr;->d()La/ujd;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    iput-object v3, v0, La/g9t0;->N1:La/ujd;

    .line 246
    .line 247
    iput-object v1, v0, La/g9t0;->O1:La/wdk0;

    .line 248
    .line 249
    iput-object v2, v0, La/g9t0;->P1:La/poq0;

    .line 250
    .line 251
    return-void

    .line 252
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 253
    .line 254
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g9t0;->Q1:La/a8z;

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

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x6

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, La/g9t0;->O1:La/wdk0;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-boolean p3, p0, La/g9t0;->L1:Z

    .line 20
    .line 21
    invoke-static {p2, p0, p3}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 22
    .line 23
    .line 24
    new-instance p2, La/owp0;

    .line 25
    .line 26
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 27
    .line 28
    .line 29
    new-instance p3, La/p6r0;

    .line 30
    .line 31
    const/16 v1, 0x1a

    .line 32
    .line 33
    invoke-direct {p3, p0, v1}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance p0, La/ugd;

    .line 37
    .line 38
    const v1, -0x3d00ad61

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-direct {p0, v1, v2, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    const-string p0, "snackbarManager"

    .line 50
    .line 51
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/g9t0;->N1:La/ujd;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, La/ls2;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/e9t0;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, p0, v3}, La/e9t0;-><init>(La/g9t0;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "composeGameCardFragmentDelegate"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/g9t0;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g9t0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
