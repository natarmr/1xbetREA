.class public final La/jzt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:La/jzt0;

.field public static final synthetic c:La/jzt0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/jzt0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, La/jzt0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/jzt0;->b:La/jzt0;

    .line 8
    .line 9
    new-instance v0, La/jzt0;

    .line 10
    .line 11
    const/16 v1, 0xc

    .line 12
    .line 13
    invoke-direct {v0, v1}, La/jzt0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/jzt0;->c:La/jzt0;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/jzt0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-byte p0, p0, La/jzt0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/lang/Long;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 24
    .line 25
    check-cast p2, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p0, Ljava/lang/Comparable;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/Comparable;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0

    .line 56
    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/lang/String;

    .line 63
    .line 64
    check-cast p2, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    return p0

    .line 77
    :pswitch_2
    invoke-static {p1}, La/ohs0;->a(Ljava/lang/Object;)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-static {p2}, La/ohs0;->a(Ljava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-ne p0, v0, :cond_4

    .line 86
    .line 87
    invoke-static {p0}, La/hne;->E(I)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    if-eq p0, v0, :cond_2

    .line 95
    .line 96
    const/4 v0, 0x2

    .line 97
    if-eq p0, v0, :cond_1

    .line 98
    .line 99
    const/4 v0, 0x3

    .line 100
    if-ne p0, v0, :cond_0

    .line 101
    .line 102
    check-cast p1, Ljava/lang/Double;

    .line 103
    .line 104
    check-cast p2, Ljava/lang/Double;

    .line 105
    .line 106
    invoke-virtual {p1, p2}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    goto :goto_0

    .line 111
    :cond_0
    const/4 p0, 0x0

    .line 112
    throw p0

    .line 113
    :cond_1
    check-cast p1, Ljava/lang/Long;

    .line 114
    .line 115
    check-cast p2, Ljava/lang/Long;

    .line 116
    .line 117
    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    goto :goto_0

    .line 122
    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 123
    .line 124
    check-cast p2, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    goto :goto_0

    .line 131
    :cond_3
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    check-cast p2, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    goto :goto_0

    .line 140
    :cond_4
    invoke-static {p0, v0}, La/hne;->a(II)I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    :goto_0
    return p0

    .line 145
    :pswitch_3
    check-cast p1, Lcom/google/android/gms/common/api/Scope;

    .line 146
    .line 147
    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    .line 148
    .line 149
    iget-object p0, p1, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 150
    .line 151
    iget-object p1, p2, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    return p0

    .line 158
    :pswitch_4
    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    .line 159
    .line 160
    check-cast p1, Lcom/google/android/gms/common/api/Scope;

    .line 161
    .line 162
    iget-object p0, p1, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 163
    .line 164
    iget-object p1, p2, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    return p0

    .line 171
    :pswitch_5
    check-cast p1, La/d3w0;

    .line 172
    .line 173
    iget-object p0, p1, La/d3w0;->a:La/y190;

    .line 174
    .line 175
    check-cast p2, La/d3w0;

    .line 176
    .line 177
    iget-object p1, p2, La/d3w0;->a:La/y190;

    .line 178
    .line 179
    invoke-static {p0, p1}, La/hdd;->b(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    return p0

    .line 184
    :pswitch_6
    check-cast p1, La/dmy;

    .line 185
    .line 186
    iget p0, p1, La/dmy;->a:F

    .line 187
    .line 188
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    check-cast p2, La/dmy;

    .line 193
    .line 194
    iget p1, p2, La/dmy;->a:F

    .line 195
    .line 196
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    return p0

    .line 205
    :pswitch_7
    check-cast p1, La/fsv0;

    .line 206
    .line 207
    iget p0, p1, La/fsv0;->b:I

    .line 208
    .line 209
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    check-cast p2, La/fsv0;

    .line 214
    .line 215
    iget p1, p2, La/fsv0;->b:I

    .line 216
    .line 217
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 222
    .line 223
    .line 224
    move-result p0

    .line 225
    return p0

    .line 226
    :pswitch_8
    check-cast p1, La/fsv0;

    .line 227
    .line 228
    iget p0, p1, La/fsv0;->b:I

    .line 229
    .line 230
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p2, La/fsv0;

    .line 235
    .line 236
    iget p1, p2, La/fsv0;->b:I

    .line 237
    .line 238
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    return p0

    .line 247
    :pswitch_9
    check-cast p1, La/hju0;

    .line 248
    .line 249
    check-cast p2, La/hju0;

    .line 250
    .line 251
    iget p0, p1, La/hju0;->b:I

    .line 252
    .line 253
    iget p1, p2, La/hju0;->b:I

    .line 254
    .line 255
    sub-int/2addr p0, p1

    .line 256
    return p0

    .line 257
    :pswitch_a
    check-cast p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 258
    .line 259
    iget p0, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->b:I

    .line 260
    .line 261
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    check-cast p2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 266
    .line 267
    iget p1, p2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->b:I

    .line 268
    .line 269
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    return p0

    .line 278
    :pswitch_b
    check-cast p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 279
    .line 280
    iget p0, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->b:I

    .line 281
    .line 282
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    check-cast p2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 287
    .line 288
    iget p1, p2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->b:I

    .line 289
    .line 290
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    return p0

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
