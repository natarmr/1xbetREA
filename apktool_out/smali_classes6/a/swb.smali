.class public final synthetic La/swb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLa/xwb;Ljava/util/List;IFLa/g9q0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/swb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/swb;->c:F

    iput-object p2, p0, La/swb;->e:Ljava/lang/Object;

    iput-object p3, p0, La/swb;->f:Ljava/lang/Object;

    iput p4, p0, La/swb;->b:I

    iput p5, p0, La/swb;->d:F

    iput-object p6, p0, La/swb;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/t33;La/agk0;IFFLa/t33;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/swb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/swb;->e:Ljava/lang/Object;

    iput-object p2, p0, La/swb;->f:Ljava/lang/Object;

    iput p3, p0, La/swb;->b:I

    iput p4, p0, La/swb;->c:F

    iput p5, p0, La/swb;->d:F

    iput-object p6, p0, La/swb;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/swb;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/swb;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, v0, La/swb;->d:F

    .line 8
    .line 9
    iget v4, v0, La/swb;->c:F

    .line 10
    .line 11
    iget v5, v0, La/swb;->b:I

    .line 12
    .line 13
    iget-object v6, v0, La/swb;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, v0, La/swb;->e:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, La/t33;

    .line 21
    .line 22
    check-cast v6, La/agk0;

    .line 23
    .line 24
    check-cast v2, La/t33;

    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    const/4 v8, 0x0

    .line 45
    cmpg-float v7, v7, v8

    .line 46
    .line 47
    if-nez v7, :cond_0

    .line 48
    .line 49
    sub-int/2addr v1, v5

    .line 50
    int-to-float v0, v1

    .line 51
    sub-float/2addr v0, v4

    .line 52
    sub-float/2addr v0, v3

    .line 53
    invoke-virtual {v6}, La/agk0;->l()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v6}, La/agk0;->l()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    sub-float/2addr v0, v3

    .line 62
    invoke-virtual {v2}, La/t33;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    mul-float/2addr v2, v0

    .line 73
    add-float/2addr v2, v1

    .line 74
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v6}, La/agk0;->l()F

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/high16 v2, 0x3f800000    # 1.0f

    .line 94
    .line 95
    sub-float/2addr v2, v0

    .line 96
    mul-float/2addr v2, v1

    .line 97
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    :pswitch_0
    check-cast v0, La/xwb;

    .line 107
    .line 108
    check-cast v6, Ljava/util/List;

    .line 109
    .line 110
    move-object v7, v2

    .line 111
    check-cast v7, La/g9q0;

    .line 112
    .line 113
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, La/fhl;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    const/high16 v4, 0x42200000    # 40.0f

    .line 125
    .line 126
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-eqz v8, :cond_1

    .line 139
    .line 140
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    check-cast v8, Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    sub-int v9, v8, v5

    .line 151
    .line 152
    int-to-float v9, v9

    .line 153
    div-float/2addr v9, v3

    .line 154
    mul-float/2addr v9, v2

    .line 155
    add-float v19, v9, v4

    .line 156
    .line 157
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    new-instance v9, La/j83;

    .line 162
    .line 163
    invoke-direct {v9, v8}, La/j83;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    move-object v8, v9

    .line 167
    iget-object v9, v0, La/xwb;->e:La/y9q0;

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/16 v18, 0x7fc

    .line 172
    .line 173
    const/4 v10, 0x0

    .line 174
    const/4 v11, 0x0

    .line 175
    const/4 v12, 0x0

    .line 176
    const-wide/16 v13, 0x0

    .line 177
    .line 178
    const/4 v15, 0x0

    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    invoke-static/range {v7 .. v18}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    iget-wide v10, v9, La/a9q0;->c:J

    .line 186
    .line 187
    move-wide v12, v10

    .line 188
    iget-wide v10, v0, La/xwb;->f:J

    .line 189
    .line 190
    invoke-interface {v1}, La/fhl;->d()J

    .line 191
    .line 192
    .line 193
    move-result-wide v14

    .line 194
    const/16 v8, 0x20

    .line 195
    .line 196
    shr-long/2addr v14, v8

    .line 197
    long-to-int v14, v14

    .line 198
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 199
    .line 200
    .line 201
    move-result v14

    .line 202
    move/from16 p1, v8

    .line 203
    .line 204
    move-object/from16 p0, v9

    .line 205
    .line 206
    shr-long v8, v12, p1

    .line 207
    .line 208
    long-to-int v8, v8

    .line 209
    int-to-float v8, v8

    .line 210
    sub-float/2addr v14, v8

    .line 211
    sget-object v8, La/qmk;->a:La/zcl;

    .line 212
    .line 213
    const/high16 v8, 0x41800000    # 16.0f

    .line 214
    .line 215
    invoke-interface {v1, v8}, La/w6k;->w0(F)F

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    sub-float/2addr v14, v8

    .line 220
    const-wide v8, 0xffffffffL

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    and-long/2addr v12, v8

    .line 226
    long-to-int v12, v12

    .line 227
    int-to-float v12, v12

    .line 228
    const/high16 v13, 0x40000000    # 2.0f

    .line 229
    .line 230
    div-float/2addr v12, v13

    .line 231
    sub-float v19, v19, v12

    .line 232
    .line 233
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    int-to-long v12, v12

    .line 238
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    int-to-long v14, v14

    .line 243
    shl-long v12, v12, p1

    .line 244
    .line 245
    and-long/2addr v8, v14

    .line 246
    or-long/2addr v12, v8

    .line 247
    const/16 v14, 0xf8

    .line 248
    .line 249
    move-object/from16 v9, p0

    .line 250
    .line 251
    move-object v8, v1

    .line 252
    invoke-static/range {v8 .. v14}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V

    .line 253
    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
