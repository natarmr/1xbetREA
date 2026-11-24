.class public final La/eke0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>(La/zie0;La/btt0;La/gii0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/fxk0;
    .locals 1

    .line 1
    invoke-static {p1}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/fxk0;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1, p2, p3}, La/fxk0;-><init>(Ljava/lang/String;La/g950;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static c(La/n0a;La/rrd;)La/wsf0;
    .locals 10

    .line 1
    new-instance v0, La/rrc;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La/rrc;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, La/rrd;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/Set;

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "resolveFeatureGroup: sessionConfig = "

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v3, ", lensFacing = "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, La/j0a;->h()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v2, "ResolvedFeatureGroup"

    .line 39
    .line 40
    invoke-static {v2, p0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p1, La/rrd;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x0

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    return-object v4

    .line 61
    :cond_0
    iget-object v3, p1, La/rrd;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Ljava/util/List;

    .line 64
    .line 65
    move-object v5, v1

    .line 66
    check-cast v5, Ljava/util/Collection;

    .line 67
    .line 68
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-nez v5, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const-string p0, "Must have at least one required or preferred feature"

    .line 82
    .line 83
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v4

    .line 87
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, La/fot0;

    .line 102
    .line 103
    sget-object v7, La/upt0;->b:La/sxs0;

    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v6}, La/sxs0;->a(La/fot0;)La/upt0;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    sget-object v8, La/upt0;->h:La/upt0;

    .line 113
    .line 114
    if-ne v7, v8, :cond_3

    .line 115
    .line 116
    new-instance p0, La/hgp;

    .line 117
    .line 118
    invoke-direct {p0, v6}, La/hgp;-><init>(La/fot0;)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_4
    check-cast v1, Ljava/lang/Iterable;

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_6

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, La/giv;

    .line 139
    .line 140
    invoke-static {v5, v3}, La/rrc;->B(La/giv;Ljava/util/List;)La/igp;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    if-eqz v5, :cond_5

    .line 145
    .line 146
    move-object p0, v5

    .line 147
    goto :goto_3

    .line 148
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    :cond_7
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    const-string v6, "DefaultFeatureGroupResolver"

    .line 162
    .line 163
    if-eqz v5, :cond_9

    .line 164
    .line 165
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    move-object v7, v5

    .line 170
    check-cast v7, La/giv;

    .line 171
    .line 172
    invoke-static {v7, v3}, La/rrc;->B(La/giv;Ljava/util/List;)La/igp;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    if-eqz v7, :cond_8

    .line 177
    .line 178
    new-instance v8, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string v9, "resolveFeatureGroup: filtered out preferred feature due to "

    .line 181
    .line 182
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-static {v6, v8}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_8
    move-object v7, v4

    .line 197
    :goto_2
    if-nez v7, :cond_7

    .line 198
    .line 199
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string v3, "resolveFeatureGroup: filteredPreferredFeatures = "

    .line 206
    .line 207
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-static {v6, p0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const/4 p0, 0x0

    .line 221
    sget-object v3, La/iun;->a:La/iun;

    .line 222
    .line 223
    invoke-virtual {v0, p1, v1, p0, v3}, La/rrc;->A(La/rrd;Ljava/util/ArrayList;ILjava/util/List;)La/jgp;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    :goto_3
    instance-of p1, p0, La/fgp;

    .line 228
    .line 229
    if-eqz p1, :cond_a

    .line 230
    .line 231
    check-cast p0, La/fgp;

    .line 232
    .line 233
    iget-object p0, p0, La/fgp;->a:La/wsf0;

    .line 234
    .line 235
    new-instance p1, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v0, "resolvedFeatureGroup = "

    .line 238
    .line 239
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-static {v2, p1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return-object p0

    .line 253
    :cond_a
    instance-of p1, p0, La/ggp;

    .line 254
    .line 255
    if-nez p1, :cond_d

    .line 256
    .line 257
    instance-of p1, p0, La/hgp;

    .line 258
    .line 259
    if-nez p1, :cond_c

    .line 260
    .line 261
    instance-of p1, p0, La/igp;

    .line 262
    .line 263
    if-eqz p1, :cond_b

    .line 264
    .line 265
    check-cast p0, La/igp;

    .line 266
    .line 267
    iget-object p1, p0, La/igp;->a:Ljava/lang/String;

    .line 268
    .line 269
    const-string v0, " must be added for "

    .line 270
    .line 271
    iget-object p0, p0, La/igp;->b:La/giv;

    .line 272
    .line 273
    invoke-static {v0, p0, p1}, La/e9d0;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v4

    .line 277
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 278
    .line 279
    .line 280
    return-object v4

    .line 281
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 282
    .line 283
    check-cast p0, La/hgp;

    .line 284
    .line 285
    iget-object p0, p0, La/hgp;->a:La/fot0;

    .line 286
    .line 287
    new-instance v0, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string p0, " is not supported"

    .line 296
    .line 297
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw p1

    .line 308
    :cond_d
    const-string p0, "Feature group is not supported"

    .line 309
    .line 310
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v4
.end method


# virtual methods
.method public a(Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;Lorg/xplatform/feed/notifictation/data/NotificationInfoUiModel;Z)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;->c:Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object p1, p2, Lorg/xplatform/feed/notifictation/data/NotificationInfoUiModel;->a:La/j760;

    .line 7
    .line 8
    iget-wide v0, p2, Lorg/xplatform/feed/notifictation/data/NotificationInfoUiModel;->d:J

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_9

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eq p1, v2, :cond_5

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    if-ne p1, v2, :cond_4

    .line 21
    .line 22
    iget-wide p1, p2, Lorg/xplatform/feed/notifictation/data/NotificationInfoUiModel;->e:J

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v4, v2

    .line 40
    check-cast v4, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;

    .line 41
    .line 42
    iget-object v4, v4, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;->a:Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;

    .line 43
    .line 44
    iget-wide v4, v4, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;->a:J

    .line 45
    .line 46
    cmp-long v4, v4, v0

    .line 47
    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v2, v3

    .line 52
    :goto_0
    check-cast v2, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;

    .line 53
    .line 54
    if-eqz v2, :cond_b

    .line 55
    .line 56
    iget-object p0, v2, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    move-object v1, v0

    .line 73
    check-cast v1, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;

    .line 74
    .line 75
    iget-object v1, v1, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;->a:Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventUiModel;

    .line 76
    .line 77
    iget-wide v1, v1, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventUiModel;->a:J

    .line 78
    .line 79
    cmp-long v1, v1, p1

    .line 80
    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    move-object v3, v0

    .line 84
    :cond_3
    check-cast v3, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;

    .line 85
    .line 86
    if-eqz v3, :cond_b

    .line 87
    .line 88
    iput-boolean p3, v3, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;->b:Z

    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    :cond_6
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_7

    .line 109
    .line 110
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    move-object v2, p2

    .line 115
    check-cast v2, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;

    .line 116
    .line 117
    iget-object v2, v2, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;->a:Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;

    .line 118
    .line 119
    iget-wide v2, v2, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionPeriodUiModel;->a:J

    .line 120
    .line 121
    cmp-long v2, v2, v0

    .line 122
    .line 123
    if-nez v2, :cond_6

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_b

    .line 138
    .line 139
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;

    .line 144
    .line 145
    iget-object p1, p1, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;->b:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-eqz p2, :cond_8

    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    check-cast p2, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;

    .line 162
    .line 163
    iput-boolean p3, p2, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;->b:Z

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_b

    .line 175
    .line 176
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;

    .line 181
    .line 182
    iget-object p1, p1, Lorg/xplatform/feed/notifictation/presentation/models/PeriodSubscriptionSettingsScreenUiModel;->b:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_a

    .line 193
    .line 194
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    check-cast p2, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;

    .line 199
    .line 200
    iput-boolean p3, p2, Lorg/xplatform/feed/notifictation/presentation/models/SubscriptionEventSettingsUiModel;->b:Z

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_b
    return-void
.end method
