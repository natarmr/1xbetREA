.class public final La/k8o;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/k8o;",
        "La/yx5;",
        "<init>",
        "()V",
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


# instance fields
.field public final K1:Z

.field public final L1:La/e9o0;

.field public M1:La/fiu0;

.field public N1:La/ujd;

.field public O1:La/wdk0;

.field public final P1:La/a8z;

.field public final Q1:La/qdz;


# direct methods
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
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/k8o;->K1:Z

    .line 9
    .line 10
    new-instance v0, La/e9o0;

    .line 11
    .line 12
    const v1, 0x7f040ae3

    .line 13
    .line 14
    .line 15
    const/16 v2, 0xc

    .line 16
    .line 17
    const v3, 0x7f040b5d

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/k8o;->L1:La/e9o0;

    .line 24
    .line 25
    const-class v0, La/k9o;

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
    new-instance v1, La/j8o;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, La/j8o;-><init>(La/k8o;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/k8o;->P1:La/a8z;

    .line 44
    .line 45
    new-instance v0, La/qdz;

    .line 46
    .line 47
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/k8o;->Q1:La/qdz;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 34

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
    const-class v2, La/l8o;

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
    instance-of v4, v1, La/l8o;

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
    check-cast v3, La/l8o;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 58
    .line 59
    iget-byte v1, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 60
    .line 61
    iget-object v5, v3, La/l8o;->a:La/xri;

    .line 62
    .line 63
    iget-object v6, v3, La/l8o;->b:La/iip;

    .line 64
    .line 65
    iget-object v1, v3, La/l8o;->c:La/oeg0;

    .line 66
    .line 67
    iget-object v14, v3, La/l8o;->d:La/pru;

    .line 68
    .line 69
    iget-object v7, v3, La/l8o;->e:La/itr;

    .line 70
    .line 71
    iget-object v15, v3, La/l8o;->f:La/g2v;

    .line 72
    .line 73
    iget-object v2, v3, La/l8o;->g:La/ctf0;

    .line 74
    .line 75
    iget-object v4, v3, La/l8o;->h:La/lbu;

    .line 76
    .line 77
    iget-object v8, v3, La/l8o;->i:La/y78;

    .line 78
    .line 79
    move-object/from16 v18, v8

    .line 80
    .line 81
    iget-object v8, v3, La/l8o;->j:La/cad;

    .line 82
    .line 83
    iget-object v9, v3, La/l8o;->k:La/m1e;

    .line 84
    .line 85
    iget-object v10, v3, La/l8o;->l:La/gst0;

    .line 86
    .line 87
    move-object/from16 v19, v9

    .line 88
    .line 89
    iget-object v9, v3, La/l8o;->m:La/lsn;

    .line 90
    .line 91
    iget-object v11, v3, La/l8o;->n:La/knf0;

    .line 92
    .line 93
    iget-object v12, v3, La/l8o;->o:La/gii0;

    .line 94
    .line 95
    move-object/from16 v20, v10

    .line 96
    .line 97
    iget-object v10, v3, La/l8o;->p:La/ugf0;

    .line 98
    .line 99
    iget-object v13, v3, La/l8o;->q:La/rou;

    .line 100
    .line 101
    move-object/from16 v16, v1

    .line 102
    .line 103
    iget-object v1, v3, La/l8o;->r:La/b3u;

    .line 104
    .line 105
    move-object/from16 v21, v11

    .line 106
    .line 107
    iget-object v11, v3, La/l8o;->s:La/pyg;

    .line 108
    .line 109
    move-object/from16 v22, v12

    .line 110
    .line 111
    iget-object v12, v3, La/l8o;->t:La/vqc;

    .line 112
    .line 113
    move-object/from16 v24, v1

    .line 114
    .line 115
    iget-object v1, v3, La/l8o;->x:La/n2u;

    .line 116
    .line 117
    move-object/from16 v25, v1

    .line 118
    .line 119
    iget-object v1, v3, La/l8o;->u:La/ih5;

    .line 120
    .line 121
    move-object/from16 v26, v1

    .line 122
    .line 123
    iget-object v1, v3, La/l8o;->v:La/zr1;

    .line 124
    .line 125
    move-object/from16 v27, v1

    .line 126
    .line 127
    iget-object v1, v3, La/l8o;->w:La/wdk0;

    .line 128
    .line 129
    move-object/from16 v28, v1

    .line 130
    .line 131
    iget-object v1, v3, La/l8o;->y:La/vby;

    .line 132
    .line 133
    move-object/from16 v29, v1

    .line 134
    .line 135
    iget-object v1, v3, La/l8o;->z:La/viu;

    .line 136
    .line 137
    move-object/from16 v30, v1

    .line 138
    .line 139
    iget-object v1, v3, La/l8o;->A:La/pyg0;

    .line 140
    .line 141
    move-object/from16 v31, v1

    .line 142
    .line 143
    iget-object v1, v3, La/l8o;->B:La/qyg0;

    .line 144
    .line 145
    move-object/from16 v32, v1

    .line 146
    .line 147
    iget-object v1, v3, La/l8o;->C:La/kuy;

    .line 148
    .line 149
    iget-object v3, v3, La/l8o;->D:La/epi0;

    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-object/from16 v17, v4

    .line 191
    .line 192
    new-instance v4, La/v8i;

    .line 193
    .line 194
    move-object/from16 v33, v1

    .line 195
    .line 196
    move-object/from16 v16, v2

    .line 197
    .line 198
    move-object/from16 v23, v13

    .line 199
    .line 200
    move-object v13, v3

    .line 201
    invoke-direct/range {v4 .. v33}, La/v8i;-><init>(La/xri;La/iip;La/itr;La/cad;La/lsn;La/ugf0;La/pyg;La/vqc;La/epi0;La/pru;La/g2v;La/ctf0;La/lbu;La/y78;La/m1e;La/gst0;La/knf0;La/gii0;La/rou;La/b3u;La/n2u;La/ih5;La/zr1;La/wdk0;La/vby;La/viu;La/pyg0;La/qyg0;La/kuy;)V

    .line 202
    .line 203
    .line 204
    move-object/from16 v1, v28

    .line 205
    .line 206
    new-instance v2, La/fiu0;

    .line 207
    .line 208
    iget-object v3, v4, La/v8i;->C:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v3, La/yei;

    .line 211
    .line 212
    const-class v4, La/k9o;

    .line 213
    .line 214
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 219
    .line 220
    .line 221
    iput-object v2, v0, La/k8o;->M1:La/fiu0;

    .line 222
    .line 223
    invoke-interface {v7}, La/itr;->d()La/ujd;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    iput-object v2, v0, La/k8o;->N1:La/ujd;

    .line 231
    .line 232
    iput-object v1, v0, La/k8o;->O1:La/wdk0;

    .line 233
    .line 234
    return-void

    .line 235
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 236
    .line 237
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k8o;->P1:La/a8z;

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
    iget-object p2, p0, La/k8o;->O1:La/wdk0;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-boolean p3, p0, La/k8o;->K1:Z

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
    new-instance p3, La/f5o;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-direct {p3, p0, v1}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/ugd;

    .line 36
    .line 37
    const v1, -0x707471e7

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {p0, v1, v2, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_0
    const-string p0, "snackbarManager"

    .line 49
    .line 50
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/k8o;->N1:La/ujd;

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
    new-instance v2, La/i8o;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, p0, v3}, La/i8o;-><init>(La/k8o;B)V

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
    iget-boolean p0, p0, La/k8o;->K1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k8o;->L1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
