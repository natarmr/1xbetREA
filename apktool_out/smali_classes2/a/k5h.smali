.class public final synthetic La/k5h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m0x;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(IJLa/m0x;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput-byte p1, p0, La/k5h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, La/k5h;->b:La/m0x;

    iput-object p5, p0, La/k5h;->c:Ljava/lang/String;

    iput-wide p2, p0, La/k5h;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JLa/m0x;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/k5h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/k5h;->b:La/m0x;

    iput-wide p1, p0, La/k5h;->d:J

    iput-object p4, p0, La/k5h;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k5h;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object/from16 v7, p1

    .line 10
    .line 11
    check-cast v7, La/fet;

    .line 12
    .line 13
    move-object/from16 v1, p2

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    iget-object v3, v0, La/k5h;->b:La/m0x;

    .line 25
    .line 26
    iget-object v4, v0, La/k5h;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget-wide v5, v0, La/k5h;->d:J

    .line 29
    .line 30
    invoke-static/range {v3 .. v8}, La/knx;->L(La/m0x;Ljava/lang/String;JLa/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v12, p1

    .line 37
    .line 38
    check-cast v12, La/fet;

    .line 39
    .line 40
    move-object/from16 v1, p2

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    and-int/lit8 v3, v1, 0x3

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    if-eq v3, v4, :cond_0

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v3, 0x0

    .line 56
    :goto_0
    and-int/2addr v1, v2

    .line 57
    invoke-virtual {v12, v1, v3}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    sget-object v1, La/qmk;->a:La/zcl;

    .line 64
    .line 65
    new-instance v1, La/qw3;

    .line 66
    .line 67
    new-instance v3, La/jf4;

    .line 68
    .line 69
    const/16 v4, 0xe

    .line 70
    .line 71
    invoke-direct {v3, v4}, La/jf4;-><init>(B)V

    .line 72
    .line 73
    .line 74
    const/high16 v4, 0x40000000    # 2.0f

    .line 75
    .line 76
    invoke-direct {v1, v4, v2, v3}, La/qw3;-><init>(FZLa/rw3;)V

    .line 77
    .line 78
    .line 79
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 80
    .line 81
    const/16 v4, 0x30

    .line 82
    .line 83
    invoke-static {v1, v3, v12, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-wide v3, v12, La/fet;->T:J

    .line 88
    .line 89
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    sget-object v5, La/jm40;->b:La/jm40;

    .line 98
    .line 99
    invoke-static {v12, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12}, La/fet;->i0()V

    .line 109
    .line 110
    .line 111
    iget-boolean v7, v12, La/fet;->S:Z

    .line 112
    .line 113
    if-eqz v7, :cond_1

    .line 114
    .line 115
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 116
    .line 117
    invoke-virtual {v12, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    invoke-virtual {v12}, La/fet;->r0()V

    .line 122
    .line 123
    .line 124
    :goto_1
    sget-object v7, La/gqw0;->x:La/shd;

    .line 125
    .line 126
    invoke-static {v12, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    sget-object v1, La/gqw0;->w:La/shd;

    .line 130
    .line 131
    invoke-static {v12, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    sget-object v3, La/gqw0;->y:La/shd;

    .line 139
    .line 140
    invoke-static {v12, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 144
    .line 145
    .line 146
    sget-object v1, La/gqw0;->v:La/shd;

    .line 147
    .line 148
    invoke-static {v12, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    const/high16 v1, 0x41600000    # 14.0f

    .line 152
    .line 153
    invoke-static {v5, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {v5, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    const v1, 0x7f0808bb

    .line 162
    .line 163
    .line 164
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    new-instance v7, La/y3d;

    .line 169
    .line 170
    iget-wide v8, v0, La/k5h;->d:J

    .line 171
    .line 172
    invoke-direct {v7, v8, v9}, La/y3d;-><init>(J)V

    .line 173
    .line 174
    .line 175
    new-instance v1, La/y3d;

    .line 176
    .line 177
    invoke-direct {v1, v8, v9}, La/y3d;-><init>(J)V

    .line 178
    .line 179
    .line 180
    sget-object v10, La/gqw0;->A:La/pge;

    .line 181
    .line 182
    const/high16 v13, 0xc00000

    .line 183
    .line 184
    const/16 v14, 0x140

    .line 185
    .line 186
    iget-object v5, v0, La/k5h;->b:La/m0x;

    .line 187
    .line 188
    move-wide v15, v8

    .line 189
    const/4 v9, 0x0

    .line 190
    const/4 v11, 0x0

    .line 191
    move-object v8, v1

    .line 192
    invoke-static/range {v3 .. v14}, La/uc9;->c(La/mm40;La/mm40;La/o0x;Ljava/lang/Integer;La/y3d;La/y3d;La/u12;La/qge;La/a4x;La/fet;II)V

    .line 193
    .line 194
    .line 195
    move-wide v5, v15

    .line 196
    new-instance v15, La/f2q0;

    .line 197
    .line 198
    const/4 v1, 0x3

    .line 199
    invoke-direct {v15, v1}, La/f2q0;-><init>(I)V

    .line 200
    .line 201
    .line 202
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 203
    .line 204
    invoke-virtual {v12, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, La/g1t0;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 214
    .line 215
    .line 216
    move-result-object v23

    .line 217
    const/16 v26, 0x6180

    .line 218
    .line 219
    const v27, 0x1abfa

    .line 220
    .line 221
    .line 222
    iget-object v3, v0, La/k5h;->c:Ljava/lang/String;

    .line 223
    .line 224
    const/4 v4, 0x0

    .line 225
    const/4 v7, 0x0

    .line 226
    const-wide/16 v8, 0x0

    .line 227
    .line 228
    const/4 v10, 0x0

    .line 229
    move-object/from16 v24, v12

    .line 230
    .line 231
    const/4 v12, 0x0

    .line 232
    const-wide/16 v13, 0x0

    .line 233
    .line 234
    const-wide/16 v16, 0x0

    .line 235
    .line 236
    const/16 v18, 0x2

    .line 237
    .line 238
    const/16 v19, 0x0

    .line 239
    .line 240
    const/16 v20, 0x1

    .line 241
    .line 242
    const/16 v21, 0x0

    .line 243
    .line 244
    const/16 v22, 0x0

    .line 245
    .line 246
    const/16 v25, 0x0

    .line 247
    .line 248
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 249
    .line 250
    .line 251
    move-object/from16 v12, v24

    .line 252
    .line 253
    invoke-virtual {v12, v2}, La/fet;->r(Z)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_2
    invoke-virtual {v12}, La/fet;->X()V

    .line 258
    .line 259
    .line 260
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
