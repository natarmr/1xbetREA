.class public final synthetic La/frm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Z

.field public final synthetic e:La/prm;

.field public final synthetic f:J

.field public final synthetic g:F

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:F

.field public final synthetic k:J

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(ZFFZLa/prm;JFJJFJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/frm;->a:Z

    iput p2, p0, La/frm;->b:F

    iput p3, p0, La/frm;->c:F

    iput-boolean p4, p0, La/frm;->d:Z

    iput-object p5, p0, La/frm;->e:La/prm;

    iput-wide p6, p0, La/frm;->f:J

    iput p8, p0, La/frm;->g:F

    iput-wide p9, p0, La/frm;->h:J

    iput-wide p11, p0, La/frm;->i:J

    iput p13, p0, La/frm;->j:F

    iput-wide p14, p0, La/frm;->k:J

    move-wide/from16 p1, p16

    iput-wide p1, p0, La/frm;->l:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/pi9;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 11
    .line 12
    invoke-interface {v2}, La/y99;->d()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    const-wide v4, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v2, v4

    .line 22
    long-to-int v2, v2

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/high16 v3, 0x40000000    # 2.0f

    .line 28
    .line 29
    div-float v24, v2, v3

    .line 30
    .line 31
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 32
    .line 33
    invoke-interface {v2}, La/y99;->d()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    and-long/2addr v6, v4

    .line 38
    long-to-int v2, v6

    .line 39
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    div-float v22, v2, v3

    .line 44
    .line 45
    iget-boolean v2, v0, La/frm;->a:Z

    .line 46
    .line 47
    iget v6, v0, La/frm;->b:F

    .line 48
    .line 49
    const/high16 v7, 0x3f800000    # 1.0f

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    sub-float v6, v7, v6

    .line 54
    .line 55
    :cond_0
    iget-object v8, v1, La/pi9;->a:La/y99;

    .line 56
    .line 57
    invoke-interface {v8}, La/y99;->d()J

    .line 58
    .line 59
    .line 60
    move-result-wide v8

    .line 61
    const/16 v10, 0x20

    .line 62
    .line 63
    shr-long/2addr v8, v10

    .line 64
    long-to-int v8, v8

    .line 65
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    sub-float v8, v8, v24

    .line 70
    .line 71
    sub-float v8, v8, v24

    .line 72
    .line 73
    mul-float/2addr v8, v6

    .line 74
    add-float v15, v8, v24

    .line 75
    .line 76
    iget v11, v0, La/frm;->c:F

    .line 77
    .line 78
    div-float v3, v11, v3

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    int-to-long v8, v6

    .line 85
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    int-to-long v12, v6

    .line 90
    shl-long/2addr v8, v10

    .line 91
    and-long/2addr v12, v4

    .line 92
    or-long/2addr v8, v12

    .line 93
    iget-object v6, v1, La/pi9;->a:La/y99;

    .line 94
    .line 95
    invoke-interface {v6}, La/y99;->d()J

    .line 96
    .line 97
    .line 98
    move-result-wide v12

    .line 99
    shr-long/2addr v12, v10

    .line 100
    long-to-int v6, v12

    .line 101
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    sub-float/2addr v6, v3

    .line 106
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    int-to-long v12, v6

    .line 111
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    move-wide/from16 v16, v4

    .line 116
    .line 117
    int-to-long v4, v6

    .line 118
    shl-long/2addr v12, v10

    .line 119
    and-long v4, v4, v16

    .line 120
    .line 121
    or-long/2addr v4, v12

    .line 122
    iget-boolean v6, v0, La/frm;->d:Z

    .line 123
    .line 124
    if-eqz v6, :cond_4

    .line 125
    .line 126
    iget-object v6, v0, La/frm;->e:La/prm;

    .line 127
    .line 128
    iget-object v6, v6, La/prm;->d:La/a4x;

    .line 129
    .line 130
    iget-object v12, v1, La/pi9;->a:La/y99;

    .line 131
    .line 132
    invoke-interface {v12}, La/y99;->d()J

    .line 133
    .line 134
    .line 135
    move-result-wide v12

    .line 136
    shr-long/2addr v12, v10

    .line 137
    long-to-int v10, v12

    .line 138
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-nez v12, :cond_3

    .line 147
    .line 148
    sub-float v12, v10, v3

    .line 149
    .line 150
    sub-float/2addr v12, v3

    .line 151
    new-instance v13, Ljava/util/ArrayList;

    .line 152
    .line 153
    const/16 v14, 0xa

    .line 154
    .line 155
    invoke-static {v6, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-eqz v14, :cond_2

    .line 171
    .line 172
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v14

    .line 176
    check-cast v14, Ljava/lang/Number;

    .line 177
    .line 178
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    const/4 v7, 0x0

    .line 183
    sub-float/2addr v14, v7

    .line 184
    const/high16 v16, 0x42c80000    # 100.0f

    .line 185
    .line 186
    div-float v14, v14, v16

    .line 187
    .line 188
    move/from16 v16, v2

    .line 189
    .line 190
    const/high16 v2, 0x3f800000    # 1.0f

    .line 191
    .line 192
    invoke-static {v14, v7, v2}, La/l1e0;->c(FFF)F

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    mul-float/2addr v7, v12

    .line 197
    add-float/2addr v7, v3

    .line 198
    if-eqz v16, :cond_1

    .line 199
    .line 200
    sub-float v7, v10, v7

    .line 201
    .line 202
    :cond_1
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move v7, v2

    .line 210
    move/from16 v2, v16

    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_2
    move/from16 v16, v2

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_3
    move/from16 v16, v2

    .line 217
    .line 218
    sget-object v13, La/iun;->a:La/iun;

    .line 219
    .line 220
    :goto_1
    move-object v14, v13

    .line 221
    goto :goto_2

    .line 222
    :cond_4
    move/from16 v16, v2

    .line 223
    .line 224
    sget-object v13, La/iun;->a:La/iun;

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :goto_2
    new-instance v6, La/grm;

    .line 228
    .line 229
    iget-wide v12, v0, La/frm;->f:J

    .line 230
    .line 231
    iget v2, v0, La/frm;->g:F

    .line 232
    .line 233
    move/from16 v17, v2

    .line 234
    .line 235
    iget-wide v2, v0, La/frm;->h:J

    .line 236
    .line 237
    move-wide/from16 v18, v2

    .line 238
    .line 239
    iget-wide v2, v0, La/frm;->i:J

    .line 240
    .line 241
    iget v7, v0, La/frm;->j:F

    .line 242
    .line 243
    move-wide/from16 v20, v2

    .line 244
    .line 245
    iget-wide v2, v0, La/frm;->k:J

    .line 246
    .line 247
    move-wide/from16 v25, v2

    .line 248
    .line 249
    iget-wide v2, v0, La/frm;->l:J

    .line 250
    .line 251
    move-wide/from16 v27, v2

    .line 252
    .line 253
    move/from16 v23, v7

    .line 254
    .line 255
    move-wide v7, v8

    .line 256
    move-wide v9, v4

    .line 257
    invoke-direct/range {v6 .. v28}, La/grm;-><init>(JJFJLjava/util/List;FZFJJFFFJJ)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v6}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    return-object v0
.end method
