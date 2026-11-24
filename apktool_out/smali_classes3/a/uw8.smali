.class public final La/uw8;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/uw8;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cl5",
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
.field public static final S1:La/cl5;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/oai;

.field public L1:La/ynb;

.field public M1:La/wdk0;

.field public N1:La/ii;

.field public final O1:La/a8z;

.field public final P1:La/s0r;

.field public final Q1:La/yzn0;

.field public final R1:La/e9o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/uw8;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentBrandGamesRedesignBinding;"

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
    const-string v3, "brandModel"

    .line 16
    .line 17
    const-string v5, "getBrandModel()Lorg/xplatform/aggregator/api/navigation/AggregatorBrandItemModel;"

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
    sput-object v1, La/uw8;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/cl5;

    .line 33
    .line 34
    const/16 v1, 0xb

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/cl5;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/uw8;->S1:La/cl5;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d020a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/ty8;

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
    new-instance v1, La/qw8;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/qw8;-><init>(La/uw8;B)V

    .line 19
    .line 20
    .line 21
    const/16 v2, 0xe

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/uw8;->O1:La/a8z;

    .line 29
    .line 30
    sget-object v0, La/tw8;->a:La/tw8;

    .line 31
    .line 32
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/uw8;->P1:La/s0r;

    .line 37
    .line 38
    new-instance v0, La/yzn0;

    .line 39
    .line 40
    const-string v1, "BRAND_MODEL_KEY"

    .line 41
    .line 42
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/uw8;->Q1:La/yzn0;

    .line 46
    .line 47
    new-instance v0, La/e9o0;

    .line 48
    .line 49
    const v1, 0x7f040b5d

    .line 50
    .line 51
    .line 52
    const/16 v2, 0xc

    .line 53
    .line 54
    invoke-direct {v0, v1, v1, v2}, La/e9o0;-><init>(III)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, La/uw8;->R1:La/e9o0;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, La/rw8;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, v1}, La/rw8;-><init>(La/uw8;B)V

    .line 13
    .line 14
    .line 15
    const-string v2, "REQUEST_KEY_CLOSE_GAME"

    .line 16
    .line 17
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, La/qw8;

    .line 21
    .line 22
    invoke-direct {p1, p0, v1}, La/qw8;-><init>(La/uw8;B)V

    .line 23
    .line 24
    .line 25
    const-string v0, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY"

    .line 26
    .line 27
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, La/rw8;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v0, p0, v2}, La/rw8;-><init>(La/uw8;B)V

    .line 38
    .line 39
    .line 40
    const-string v3, "PRESSED_INFO_BACK_BUTTON_KEY"

    .line 41
    .line 42
    invoke-virtual {p1, v3, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, La/uw8;->U1:[La/iiy;

    .line 46
    .line 47
    aget-object p1, p1, v2

    .line 48
    .line 49
    iget-object v0, p0, La/uw8;->P1:La/s0r;

    .line 50
    .line 51
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    check-cast p1, La/ryq;

    .line 59
    .line 60
    iget-object p1, p1, La/ryq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 61
    .line 62
    new-instance v0, La/owp0;

    .line 63
    .line 64
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, La/tx;

    .line 68
    .line 69
    const/16 v3, 0xb

    .line 70
    .line 71
    invoke-direct {v2, p0, v3}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    new-instance p0, La/ugd;

    .line 75
    .line 76
    const v3, 0x5121789d

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, v3, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final C0()V
    .locals 37

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
    const-class v2, La/wu8;

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
    instance-of v4, v1, La/wu8;

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
    check-cast v3, La/wu8;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/uw8;->U1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/uw8;->Q1:La/yzn0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object/from16 v32, v1

    .line 69
    .line 70
    check-cast v32, La/uc0;

    .line 71
    .line 72
    iget-object v14, v3, La/wu8;->b:La/u58;

    .line 73
    .line 74
    iget-object v6, v3, La/wu8;->a:La/ehf0;

    .line 75
    .line 76
    iget-object v5, v3, La/wu8;->l:La/cad;

    .line 77
    .line 78
    iget-object v13, v3, La/wu8;->m:La/oeg0;

    .line 79
    .line 80
    iget-object v1, v3, La/wu8;->c:La/gii0;

    .line 81
    .line 82
    iget-object v2, v3, La/wu8;->d:La/r9u;

    .line 83
    .line 84
    iget-object v4, v3, La/wu8;->e:La/m1e;

    .line 85
    .line 86
    iget-object v7, v3, La/wu8;->f:La/s91;

    .line 87
    .line 88
    iget-object v8, v3, La/wu8;->g:La/v88;

    .line 89
    .line 90
    move-object/from16 v19, v8

    .line 91
    .line 92
    iget-object v8, v3, La/wu8;->r:La/wsf0;

    .line 93
    .line 94
    iget-object v12, v3, La/wu8;->o:La/ii;

    .line 95
    .line 96
    iget-object v9, v3, La/wu8;->j:La/ih5;

    .line 97
    .line 98
    iget-object v15, v3, La/wu8;->h:La/ih5;

    .line 99
    .line 100
    iget-object v10, v3, La/wu8;->i:La/gg5;

    .line 101
    .line 102
    iget-object v11, v3, La/wu8;->k:La/duj;

    .line 103
    .line 104
    move-object/from16 v18, v7

    .line 105
    .line 106
    iget-object v7, v3, La/wu8;->u:La/peg0;

    .line 107
    .line 108
    move-object/from16 v16, v1

    .line 109
    .line 110
    iget-object v1, v3, La/wu8;->n:La/ctf0;

    .line 111
    .line 112
    move-object/from16 v22, v1

    .line 113
    .line 114
    iget-object v1, v3, La/wu8;->p:La/ntu;

    .line 115
    .line 116
    move-object/from16 v23, v1

    .line 117
    .line 118
    iget-object v1, v3, La/wu8;->q:La/l7k;

    .line 119
    .line 120
    move-object/from16 v24, v1

    .line 121
    .line 122
    iget-object v1, v3, La/wu8;->s:La/pru;

    .line 123
    .line 124
    move-object/from16 v25, v1

    .line 125
    .line 126
    iget-object v1, v3, La/wu8;->t:La/gst0;

    .line 127
    .line 128
    move-object/from16 v26, v1

    .line 129
    .line 130
    iget-object v1, v3, La/wu8;->v:La/peg0;

    .line 131
    .line 132
    move-object/from16 v27, v1

    .line 133
    .line 134
    iget-object v1, v3, La/wu8;->w:La/wdk0;

    .line 135
    .line 136
    move-object/from16 v28, v1

    .line 137
    .line 138
    iget-object v1, v3, La/wu8;->x:La/dmt;

    .line 139
    .line 140
    move-object/from16 v20, v9

    .line 141
    .line 142
    iget-object v9, v3, La/wu8;->y:La/lrc;

    .line 143
    .line 144
    move-object/from16 v29, v1

    .line 145
    .line 146
    iget-object v1, v3, La/wu8;->z:La/au0;

    .line 147
    .line 148
    move-object/from16 v30, v1

    .line 149
    .line 150
    iget-object v1, v3, La/wu8;->A:La/wyu;

    .line 151
    .line 152
    move-object/from16 v17, v1

    .line 153
    .line 154
    iget-object v1, v3, La/wu8;->B:La/ix0;

    .line 155
    .line 156
    move-object/from16 v31, v1

    .line 157
    .line 158
    iget-object v1, v3, La/wu8;->C:La/bzt;

    .line 159
    .line 160
    move-object/from16 v21, v16

    .line 161
    .line 162
    move-object/from16 v16, v10

    .line 163
    .line 164
    iget-object v10, v3, La/wu8;->D:La/wsf0;

    .line 165
    .line 166
    move-object/from16 v33, v21

    .line 167
    .line 168
    move-object/from16 v21, v11

    .line 169
    .line 170
    iget-object v11, v3, La/wu8;->E:La/peg0;

    .line 171
    .line 172
    move-object/from16 v34, v1

    .line 173
    .line 174
    iget-object v1, v3, La/wu8;->F:La/ytt;

    .line 175
    .line 176
    move-object/from16 v35, v1

    .line 177
    .line 178
    iget-object v1, v3, La/wu8;->G:La/gw8;

    .line 179
    .line 180
    iget-object v3, v3, La/wu8;->H:La/cmt;

    .line 181
    .line 182
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-object/from16 v17, v4

    .line 216
    .line 217
    new-instance v4, La/o9i;

    .line 218
    .line 219
    move-object/from16 v36, v3

    .line 220
    .line 221
    move-object/from16 v33, v34

    .line 222
    .line 223
    move-object/from16 v34, v35

    .line 224
    .line 225
    move-object/from16 v35, v1

    .line 226
    .line 227
    invoke-direct/range {v4 .. v36}, La/o9i;-><init>(La/cad;La/ehf0;La/peg0;La/wsf0;La/lrc;La/wsf0;La/peg0;La/ii;La/oeg0;La/u58;La/ih5;La/gg5;La/m1e;La/s91;La/v88;La/ih5;La/duj;La/ctf0;La/ntu;La/l7k;La/pru;La/gst0;La/peg0;La/wdk0;La/dmt;La/au0;La/ix0;La/uc0;La/bzt;La/ytt;La/gw8;La/cmt;)V

    .line 228
    .line 229
    .line 230
    move-object/from16 v1, v28

    .line 231
    .line 232
    iget-object v2, v4, La/o9i;->n:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v2, La/n5d0;

    .line 235
    .line 236
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    check-cast v2, La/oai;

    .line 241
    .line 242
    iput-object v2, v0, La/uw8;->K1:La/oai;

    .line 243
    .line 244
    iget-object v2, v7, La/peg0;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v2, La/yzn0;

    .line 247
    .line 248
    invoke-virtual {v2}, La/yzn0;->i()La/ynb;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iput-object v2, v0, La/uw8;->L1:La/ynb;

    .line 256
    .line 257
    iput-object v1, v0, La/uw8;->M1:La/wdk0;

    .line 258
    .line 259
    iput-object v12, v0, La/uw8;->N1:La/ii;

    .line 260
    .line 261
    return-void

    .line 262
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 263
    .line 264
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/uw8;->O1:La/a8z;

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

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/hxm0;->m(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/uw8;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/yt8;->a:La/yt8;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final x0()Z
    .locals 3

    .line 1
    sget-object v0, La/uw8;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v2, p0, La/uw8;->Q1:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v2, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/uc0;

    .line 13
    .line 14
    iget-boolean p0, p0, La/uc0;->i:Z

    .line 15
    .line 16
    xor-int/2addr p0, v1

    .line 17
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/uw8;->R1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
