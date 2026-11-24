.class public final synthetic La/lsw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/nsw;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/nsw;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/lsw;->a:B

    iput-object p1, p0, La/lsw;->b:La/mm40;

    iput-object p2, p0, La/lsw;->c:La/nsw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/nsw;I)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    iput-byte p3, p0, La/lsw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lsw;->b:La/mm40;

    iput-object p2, p0, La/lsw;->c:La/nsw;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lsw;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, La/lsw;->c:La/nsw;

    .line 9
    .line 10
    iget-object v0, v0, La/lsw;->b:La/mm40;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v15, p1

    .line 16
    .line 17
    check-cast v15, La/fet;

    .line 18
    .line 19
    move-object/from16 v1, p2

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    and-int/lit8 v6, v1, 0x3

    .line 28
    .line 29
    if-eq v6, v3, :cond_0

    .line 30
    .line 31
    move v3, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v2

    .line 34
    :goto_0
    and-int/2addr v1, v4

    .line 35
    invoke-virtual {v15, v1, v3}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    sget-object v1, La/uc9;->c:La/mw3;

    .line 42
    .line 43
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 44
    .line 45
    invoke-static {v1, v3, v15, v2}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-wide v2, v15, La/fet;->T:J

    .line 50
    .line 51
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v15, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v15}, La/fet;->i0()V

    .line 69
    .line 70
    .line 71
    iget-boolean v6, v15, La/fet;->S:Z

    .line 72
    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 76
    .line 77
    invoke-virtual {v15, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v15}, La/fet;->r0()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 85
    .line 86
    invoke-static {v15, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    sget-object v1, La/gqw0;->w:La/shd;

    .line 90
    .line 91
    invoke-static {v15, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    sget-object v2, La/gqw0;->y:La/shd;

    .line 99
    .line 100
    invoke-static {v15, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 104
    .line 105
    .line 106
    sget-object v1, La/gqw0;->v:La/shd;

    .line 107
    .line 108
    invoke-static {v15, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    sget-object v0, La/jm40;->b:La/jm40;

    .line 112
    .line 113
    const/high16 v1, 0x3f800000    # 1.0f

    .line 114
    .line 115
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v1, v5, La/nsw;->a:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v2, v5, La/nsw;->b:Ljava/lang/String;

    .line 122
    .line 123
    const/4 v3, 0x6

    .line 124
    invoke-static {v3, v15, v0, v1, v2}, La/vcc;->p(ILa/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v15, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-nez v0, :cond_2

    .line 136
    .line 137
    sget-object v0, La/ukd;->a:La/cl5;

    .line 138
    .line 139
    if-ne v1, v0, :cond_3

    .line 140
    .line 141
    :cond_2
    new-instance v1, La/adw;

    .line 142
    .line 143
    const/4 v0, 0x4

    .line 144
    invoke-direct {v1, v5, v0}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v15, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_3
    move-object v14, v1

    .line 151
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 152
    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    const/16 v17, 0x1ff

    .line 156
    .line 157
    const/4 v6, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v8, 0x0

    .line 160
    const/4 v9, 0x0

    .line 161
    const/4 v10, 0x0

    .line 162
    const/4 v11, 0x0

    .line 163
    const/4 v12, 0x0

    .line 164
    const/4 v13, 0x0

    .line 165
    invoke-static/range {v6 .. v17}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15, v4}, La/fet;->r(Z)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_4
    invoke-virtual {v15}, La/fet;->X()V

    .line 173
    .line 174
    .line 175
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_0
    move-object/from16 v1, p1

    .line 179
    .line 180
    check-cast v1, La/fet;

    .line 181
    .line 182
    move-object/from16 v2, p2

    .line 183
    .line 184
    check-cast v2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v4}, La/x8x;->L(I)I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-static {v0, v5, v1, v2}, La/vfc;->x(La/mm40;La/nsw;La/fet;I)V

    .line 194
    .line 195
    .line 196
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_1
    move-object/from16 v1, p1

    .line 200
    .line 201
    check-cast v1, La/fet;

    .line 202
    .line 203
    move-object/from16 v6, p2

    .line 204
    .line 205
    check-cast v6, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    and-int/lit8 v7, v6, 0x3

    .line 212
    .line 213
    if-eq v7, v3, :cond_5

    .line 214
    .line 215
    move v2, v4

    .line 216
    :cond_5
    and-int/2addr v4, v6

    .line 217
    invoke-virtual {v1, v4, v2}, La/fet;->U(IZ)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_6

    .line 222
    .line 223
    sget-object v2, La/hsw;->a:La/zfn;

    .line 224
    .line 225
    sget-object v4, La/bmd;->n:La/zfn;

    .line 226
    .line 227
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v2, v4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    new-instance v4, La/lsw;

    .line 236
    .line 237
    invoke-direct {v4, v0, v5, v3}, La/lsw;-><init>(La/mm40;La/nsw;B)V

    .line 238
    .line 239
    .line 240
    const v0, -0x1fb59883

    .line 241
    .line 242
    .line 243
    invoke-static {v0, v4, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    const/16 v3, 0x38

    .line 248
    .line 249
    invoke-static {v2, v0, v1, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_6
    invoke-virtual {v1}, La/fet;->X()V

    .line 254
    .line 255
    .line 256
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
