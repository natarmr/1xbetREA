.class public final synthetic La/awy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/ilp;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/ilp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/awy;->a:B

    iput-object p1, p0, La/awy;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/awy;->c:La/ilp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/awy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/awy;->c:La/ilp;

    .line 5
    .line 6
    iget-object p0, p0, La/awy;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    check-cast p1, La/h2l0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v0, La/z9k0;->a:[I

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    aget p1, v0, p1

    .line 23
    .line 24
    if-ne p1, v1, :cond_0

    .line 25
    .line 26
    new-instance p1, La/omp;

    .line 27
    .line 28
    iget-wide v0, v2, La/ilp;->a:J

    .line 29
    .line 30
    invoke-direct {p1, v0, v1}, La/omp;-><init>(J)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    if-eq p1, v1, :cond_2

    .line 49
    .line 50
    const/4 v0, 0x2

    .line 51
    if-eq p1, v0, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance p1, La/emp;

    .line 55
    .line 56
    iget-wide v0, v2, La/ilp;->a:J

    .line 57
    .line 58
    invoke-direct {p1, v0, v1}, La/emp;-><init>(J)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    new-instance p1, La/omp;

    .line 66
    .line 67
    iget-wide v0, v2, La/ilp;->a:J

    .line 68
    .line 69
    invoke-direct {p1, v0, v1}, La/omp;-><init>(J)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    new-instance p1, La/ylp;

    .line 77
    .line 78
    new-instance v3, La/npn;

    .line 79
    .line 80
    iget-wide v4, v2, La/ilp;->a:J

    .line 81
    .line 82
    iget-wide v6, v2, La/ilp;->c:J

    .line 83
    .line 84
    iget v0, v2, La/ilp;->e:I

    .line 85
    .line 86
    int-to-long v8, v0

    .line 87
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    iget-boolean v9, v2, La/ilp;->d:Z

    .line 92
    .line 93
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 94
    .line 95
    .line 96
    iget-object v0, v2, La/ilp;->m:La/dlp;

    .line 97
    .line 98
    iget-boolean v0, v0, La/dlp;->a:Z

    .line 99
    .line 100
    xor-int/2addr v0, v1

    .line 101
    invoke-direct {p1, v3, v0}, La/ylp;-><init>(La/npn;Z)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_5

    .line 118
    .line 119
    if-eq p1, v1, :cond_4

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    new-instance p1, La/omp;

    .line 123
    .line 124
    iget-wide v0, v2, La/ilp;->a:J

    .line 125
    .line 126
    invoke-direct {p1, v0, v1}, La/omp;-><init>(J)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    new-instance p1, La/ylp;

    .line 134
    .line 135
    new-instance v3, La/npn;

    .line 136
    .line 137
    iget-wide v4, v2, La/ilp;->a:J

    .line 138
    .line 139
    iget-wide v6, v2, La/ilp;->c:J

    .line 140
    .line 141
    iget v0, v2, La/ilp;->e:I

    .line 142
    .line 143
    int-to-long v8, v0

    .line 144
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    iget-boolean v9, v2, La/ilp;->d:Z

    .line 149
    .line 150
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v2, La/ilp;->m:La/dlp;

    .line 154
    .line 155
    iget-boolean v0, v0, La/dlp;->a:Z

    .line 156
    .line 157
    xor-int/2addr v0, v1

    .line 158
    invoke-direct {p1, v3, v0}, La/ylp;-><init>(La/npn;Z)V

    .line 159
    .line 160
    .line 161
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_7

    .line 175
    .line 176
    if-eq p1, v1, :cond_6

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    new-instance p1, La/omp;

    .line 180
    .line 181
    iget-wide v0, v2, La/ilp;->a:J

    .line 182
    .line 183
    invoke-direct {p1, v0, v1}, La/omp;-><init>(J)V

    .line 184
    .line 185
    .line 186
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_7
    new-instance p1, La/ylp;

    .line 191
    .line 192
    new-instance v3, La/npn;

    .line 193
    .line 194
    iget-wide v4, v2, La/ilp;->a:J

    .line 195
    .line 196
    iget-wide v6, v2, La/ilp;->c:J

    .line 197
    .line 198
    iget v0, v2, La/ilp;->e:I

    .line 199
    .line 200
    int-to-long v8, v0

    .line 201
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    iget-boolean v9, v2, La/ilp;->d:Z

    .line 206
    .line 207
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 208
    .line 209
    .line 210
    iget-object v0, v2, La/ilp;->m:La/dlp;

    .line 211
    .line 212
    iget-boolean v0, v0, La/dlp;->a:Z

    .line 213
    .line 214
    xor-int/2addr v0, v1

    .line 215
    invoke-direct {p1, v3, v0}, La/ylp;-><init>(La/npn;Z)V

    .line 216
    .line 217
    .line 218
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_9

    .line 232
    .line 233
    if-eq p1, v1, :cond_8

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    new-instance p1, La/omp;

    .line 237
    .line 238
    iget-wide v0, v2, La/ilp;->a:J

    .line 239
    .line 240
    invoke-direct {p1, v0, v1}, La/omp;-><init>(J)V

    .line 241
    .line 242
    .line 243
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_9
    new-instance p1, La/ylp;

    .line 248
    .line 249
    new-instance v3, La/npn;

    .line 250
    .line 251
    iget-wide v4, v2, La/ilp;->a:J

    .line 252
    .line 253
    iget-wide v6, v2, La/ilp;->c:J

    .line 254
    .line 255
    iget v0, v2, La/ilp;->e:I

    .line 256
    .line 257
    int-to-long v8, v0

    .line 258
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    iget-boolean v9, v2, La/ilp;->d:Z

    .line 263
    .line 264
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 265
    .line 266
    .line 267
    iget-object v0, v2, La/ilp;->m:La/dlp;

    .line 268
    .line 269
    iget-boolean v0, v0, La/dlp;->a:Z

    .line 270
    .line 271
    xor-int/2addr v0, v1

    .line 272
    invoke-direct {p1, v3, v0}, La/ylp;-><init>(La/npn;Z)V

    .line 273
    .line 274
    .line 275
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object p0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
