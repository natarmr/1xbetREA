.class public final synthetic La/cwy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/olp;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/olp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cwy;->a:B

    iput-object p1, p0, La/cwy;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/cwy;->c:La/olp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/cwy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/cwy;->c:La/olp;

    .line 5
    .line 6
    iget-object p0, p0, La/cwy;->b:Lkotlin/jvm/functions/Function1;

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
    iget-wide v0, v2, La/olp;->a:J

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
    iget-wide v0, v2, La/olp;->a:J

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
    iget-wide v0, v2, La/olp;->a:J

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
    iget-wide v4, v2, La/olp;->a:J

    .line 81
    .line 82
    iget-wide v6, v2, La/olp;->c:J

    .line 83
    .line 84
    iget v0, v2, La/olp;->d:I

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
    const/4 v9, 0x0

    .line 92
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 93
    .line 94
    .line 95
    iget-object v0, v2, La/olp;->j:La/jlp;

    .line 96
    .line 97
    iget-boolean v0, v0, La/jlp;->a:Z

    .line 98
    .line 99
    xor-int/2addr v0, v1

    .line 100
    invoke-direct {p1, v3, v0}, La/ylp;-><init>(La/npn;Z)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    if-eq p1, v1, :cond_4

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    new-instance p1, La/omp;

    .line 122
    .line 123
    iget-wide v0, v2, La/olp;->a:J

    .line 124
    .line 125
    invoke-direct {p1, v0, v1}, La/omp;-><init>(J)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    new-instance p1, La/ylp;

    .line 133
    .line 134
    new-instance v3, La/npn;

    .line 135
    .line 136
    iget-wide v4, v2, La/olp;->a:J

    .line 137
    .line 138
    iget-wide v6, v2, La/olp;->c:J

    .line 139
    .line 140
    iget v0, v2, La/olp;->d:I

    .line 141
    .line 142
    int-to-long v8, v0

    .line 143
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    const/4 v9, 0x0

    .line 148
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v2, La/olp;->j:La/jlp;

    .line 152
    .line 153
    iget-boolean v0, v0, La/jlp;->a:Z

    .line 154
    .line 155
    xor-int/2addr v0, v1

    .line 156
    invoke-direct {p1, v3, v0}, La/ylp;-><init>(La/npn;Z)V

    .line 157
    .line 158
    .line 159
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_7

    .line 173
    .line 174
    if-eq p1, v1, :cond_6

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    new-instance p1, La/omp;

    .line 178
    .line 179
    iget-wide v0, v2, La/olp;->a:J

    .line 180
    .line 181
    invoke-direct {p1, v0, v1}, La/omp;-><init>(J)V

    .line 182
    .line 183
    .line 184
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_7
    new-instance p1, La/ylp;

    .line 189
    .line 190
    new-instance v3, La/npn;

    .line 191
    .line 192
    iget-wide v4, v2, La/olp;->a:J

    .line 193
    .line 194
    iget-wide v6, v2, La/olp;->c:J

    .line 195
    .line 196
    iget v0, v2, La/olp;->d:I

    .line 197
    .line 198
    int-to-long v8, v0

    .line 199
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    const/4 v9, 0x0

    .line 204
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 205
    .line 206
    .line 207
    iget-object v0, v2, La/olp;->j:La/jlp;

    .line 208
    .line 209
    iget-boolean v0, v0, La/jlp;->a:Z

    .line 210
    .line 211
    xor-int/2addr v0, v1

    .line 212
    invoke-direct {p1, v3, v0}, La/ylp;-><init>(La/npn;Z)V

    .line 213
    .line 214
    .line 215
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_9

    .line 229
    .line 230
    if-eq p1, v1, :cond_8

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_8
    new-instance p1, La/omp;

    .line 234
    .line 235
    iget-wide v0, v2, La/olp;->a:J

    .line 236
    .line 237
    invoke-direct {p1, v0, v1}, La/omp;-><init>(J)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_9
    new-instance p1, La/ylp;

    .line 245
    .line 246
    new-instance v3, La/npn;

    .line 247
    .line 248
    iget-wide v4, v2, La/olp;->a:J

    .line 249
    .line 250
    iget-wide v6, v2, La/olp;->c:J

    .line 251
    .line 252
    iget v0, v2, La/olp;->d:I

    .line 253
    .line 254
    int-to-long v8, v0

    .line 255
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    const/4 v9, 0x0

    .line 260
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 261
    .line 262
    .line 263
    iget-object v0, v2, La/olp;->j:La/jlp;

    .line 264
    .line 265
    iget-boolean v0, v0, La/jlp;->a:Z

    .line 266
    .line 267
    xor-int/2addr v0, v1

    .line 268
    invoke-direct {p1, v3, v0}, La/ylp;-><init>(La/npn;Z)V

    .line 269
    .line 270
    .line 271
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
