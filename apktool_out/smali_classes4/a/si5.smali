.class public final La/si5;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/si5;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/hfk0",
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
.field public static final Q1:La/hfk0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public M1:La/wdk0;

.field public final N1:La/s0r;

.field public final O1:La/phf0;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/si5;

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
    const-string v3, "navigatePath"

    .line 16
    .line 17
    const-string v5, "getNavigatePath()Ljava/lang/String;"

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
    sput-object v1, La/si5;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/hfk0;

    .line 33
    .line 34
    const/16 v1, 0x1d

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/hfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/si5;->Q1:La/hfk0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/ri5;->a:La/ri5;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/si5;->N1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/phf0;

    .line 16
    .line 17
    const-string v1, "NAVIGATE_PATH_KEY"

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/si5;->O1:La/phf0;

    .line 25
    .line 26
    const-class v0, La/l2k0;

    .line 27
    .line 28
    sget-object v1, La/sre0;->a:La/tre0;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, La/qi5;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, p0, v2}, La/qi5;-><init>(La/si5;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, La/si5;->P1:La/a8z;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/qi5;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/qi5;-><init>(La/si5;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "PAYMENT_ERROR_DIALOG_REQUEST_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/si5;->R1:[La/iiy;

    .line 13
    .line 14
    aget-object p1, p1, v0

    .line 15
    .line 16
    iget-object v0, p0, La/si5;->N1:La/s0r;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p1, La/aid;

    .line 26
    .line 27
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 28
    .line 29
    new-instance v0, La/fa2;

    .line 30
    .line 31
    const/16 v1, 0x12

    .line 32
    .line 33
    invoke-direct {v0, p0, v1}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance p0, La/ugd;

    .line 37
    .line 38
    const v1, 0x56003249

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

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
    const-class v2, La/fi5;

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
    instance-of v4, v1, La/fi5;

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
    check-cast v3, La/fi5;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    sget-object v1, La/si5;->R1:[La/iiy;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    aget-object v1, v1, v2

    .line 65
    .line 66
    iget-object v2, v0, La/si5;->O1:La/phf0;

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v30

    .line 72
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v5, v3, La/fi5;->a:La/cad;

    .line 79
    .line 80
    iget-object v12, v3, La/fi5;->b:La/zg;

    .line 81
    .line 82
    iget-object v8, v3, La/fi5;->v:La/rmd0;

    .line 83
    .line 84
    iget-object v13, v3, La/fi5;->c:La/qgd;

    .line 85
    .line 86
    iget-object v14, v3, La/fi5;->d:La/ih5;

    .line 87
    .line 88
    iget-object v15, v3, La/fi5;->e:La/ih5;

    .line 89
    .line 90
    iget-object v1, v3, La/fi5;->f:La/v88;

    .line 91
    .line 92
    iget-object v2, v3, La/fi5;->h:La/duj;

    .line 93
    .line 94
    iget-object v9, v3, La/fi5;->q:La/roi0;

    .line 95
    .line 96
    iget-object v4, v3, La/fi5;->i:La/rou;

    .line 97
    .line 98
    iget-object v6, v3, La/fi5;->j:La/pru;

    .line 99
    .line 100
    iget-object v7, v3, La/fi5;->k:La/btt0;

    .line 101
    .line 102
    move-object/from16 v19, v6

    .line 103
    .line 104
    iget-object v6, v3, La/fi5;->p:La/wsf0;

    .line 105
    .line 106
    iget-object v11, v3, La/fi5;->n:La/db9;

    .line 107
    .line 108
    move-object/from16 v21, v11

    .line 109
    .line 110
    iget-object v11, v3, La/fi5;->g:La/ii;

    .line 111
    .line 112
    move-object/from16 v16, v1

    .line 113
    .line 114
    iget-object v1, v3, La/fi5;->l:La/gii0;

    .line 115
    .line 116
    move-object/from16 v22, v1

    .line 117
    .line 118
    iget-object v1, v3, La/fi5;->m:La/kuy;

    .line 119
    .line 120
    move-object/from16 v23, v1

    .line 121
    .line 122
    iget-object v1, v3, La/fi5;->o:La/m1e;

    .line 123
    .line 124
    move-object/from16 v24, v1

    .line 125
    .line 126
    iget-object v1, v3, La/fi5;->r:La/lbu;

    .line 127
    .line 128
    move-object/from16 v20, v7

    .line 129
    .line 130
    iget-object v7, v3, La/fi5;->t:La/zx10;

    .line 131
    .line 132
    move-object/from16 v25, v1

    .line 133
    .line 134
    iget-object v1, v3, La/fi5;->u:La/l7k;

    .line 135
    .line 136
    move-object/from16 v26, v1

    .line 137
    .line 138
    iget-object v1, v3, La/fi5;->s:La/ctf0;

    .line 139
    .line 140
    move-object/from16 v27, v1

    .line 141
    .line 142
    iget-object v1, v3, La/fi5;->w:La/wdk0;

    .line 143
    .line 144
    move-object/from16 v28, v1

    .line 145
    .line 146
    iget-object v1, v3, La/fi5;->x:La/bzt;

    .line 147
    .line 148
    move-object/from16 v29, v1

    .line 149
    .line 150
    iget-object v1, v3, La/fi5;->y:La/ocl;

    .line 151
    .line 152
    move-object/from16 v31, v1

    .line 153
    .line 154
    iget-object v1, v3, La/fi5;->z:La/cmt;

    .line 155
    .line 156
    iget-object v3, v3, La/fi5;->A:La/hse0;

    .line 157
    .line 158
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-object/from16 v18, v4

    .line 186
    .line 187
    new-instance v4, La/o9i;

    .line 188
    .line 189
    move-object/from16 v32, v1

    .line 190
    .line 191
    move-object/from16 v17, v2

    .line 192
    .line 193
    move-object/from16 v33, v3

    .line 194
    .line 195
    invoke-direct/range {v4 .. v33}, La/o9i;-><init>(La/cad;La/wsf0;La/zx10;La/rmd0;La/roi0;La/i1w0;La/ii;La/zg;La/qgd;La/ih5;La/ih5;La/v88;La/duj;La/rou;La/pru;La/btt0;La/db9;La/gii0;La/kuy;La/m1e;La/lbu;La/l7k;La/ctf0;La/wdk0;La/bzt;Ljava/lang/String;La/ocl;La/cmt;La/hse0;)V

    .line 196
    .line 197
    .line 198
    move-object/from16 v1, v28

    .line 199
    .line 200
    new-instance v2, La/fiu0;

    .line 201
    .line 202
    iget-object v3, v4, La/o9i;->D:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v3, La/r5i;

    .line 205
    .line 206
    const-class v4, La/l2k0;

    .line 207
    .line 208
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 213
    .line 214
    .line 215
    iput-object v2, v0, La/si5;->K1:La/fiu0;

    .line 216
    .line 217
    iput-object v11, v0, La/si5;->L1:La/ii;

    .line 218
    .line 219
    iput-object v1, v0, La/si5;->M1:La/wdk0;

    .line 220
    .line 221
    return-void

    .line 222
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 223
    .line 224
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/si5;->P1:La/a8z;

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
