.class public final La/j77;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/j77;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/j77;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    return-void
.end method

.method public static a(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Z)Ljava/util/ArrayList;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p0, v1, :cond_8

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq p0, v2, :cond_6

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    if-eq p0, v2, :cond_4

    .line 15
    .line 16
    const/4 v2, 0x7

    .line 17
    if-eq p0, v2, :cond_2

    .line 18
    .line 19
    sget-object v3, La/i0w;->b:La/i0w;

    .line 20
    .line 21
    sget-object v4, La/i0w;->c:La/i0w;

    .line 22
    .line 23
    sget-object v5, La/i0w;->d:La/i0w;

    .line 24
    .line 25
    sget-object v6, La/i0w;->e:La/i0w;

    .line 26
    .line 27
    sget-object v7, La/i0w;->f:La/i0w;

    .line 28
    .line 29
    sget-object p0, La/i0w;->i:La/i0w;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    :goto_0
    move-object v8, p0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    sget-object v9, La/i0w;->h:La/i0w;

    .line 38
    .line 39
    filled-new-array/range {v3 .. v9}, [La/i0w;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    check-cast p0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, La/i0w;

    .line 73
    .line 74
    new-instance v2, La/h0w;

    .line 75
    .line 76
    invoke-direct {v2, v0, v1}, La/h0w;-><init>(La/jvw;Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    return-object p1

    .line 84
    :cond_2
    sget-object p0, La/rc10;->e:La/c0o;

    .line 85
    .line 86
    new-instance p1, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, La/b3;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/rc10;

    .line 110
    .line 111
    new-instance v2, La/h0w;

    .line 112
    .line 113
    invoke-direct {v2, v0, v1}, La/h0w;-><init>(La/jvw;Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    return-object p1

    .line 121
    :cond_4
    sget-object p0, La/w21;->a:La/w21;

    .line 122
    .line 123
    sget-object p1, La/w21;->b:La/w21;

    .line 124
    .line 125
    sget-object v2, La/j31;->a:La/j31;

    .line 126
    .line 127
    sget-object v3, La/j31;->b:La/j31;

    .line 128
    .line 129
    filled-new-array {p0, p1, v2, v3}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    new-instance p1, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_5

    .line 155
    .line 156
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    new-instance v2, La/h0w;

    .line 161
    .line 162
    check-cast v0, La/jvw;

    .line 163
    .line 164
    invoke-direct {v2, v0, v1}, La/h0w;-><init>(La/jvw;Z)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_5
    return-object p1

    .line 172
    :cond_6
    sget-object p0, La/zw4;->e:La/c0o;

    .line 173
    .line 174
    new-instance p1, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, La/b3;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_7

    .line 192
    .line 193
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, La/zw4;

    .line 198
    .line 199
    new-instance v2, La/h0w;

    .line 200
    .line 201
    invoke-direct {v2, v0, v1}, La/h0w;-><init>(La/jvw;Z)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_7
    return-object p1

    .line 209
    :cond_8
    sget-object p0, La/i0w;->b:La/i0w;

    .line 210
    .line 211
    sget-object p1, La/i0w;->c:La/i0w;

    .line 212
    .line 213
    sget-object v2, La/i0w;->d:La/i0w;

    .line 214
    .line 215
    sget-object v3, La/i0w;->e:La/i0w;

    .line 216
    .line 217
    sget-object v4, La/i0w;->f:La/i0w;

    .line 218
    .line 219
    filled-new-array {p0, p1, v2, v3, v4}, [La/i0w;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    new-instance p1, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_9

    .line 245
    .line 246
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, La/i0w;

    .line 251
    .line 252
    new-instance v2, La/h0w;

    .line 253
    .line 254
    invoke-direct {v2, v0, v1}, La/h0w;-><init>(La/jvw;Z)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_9
    return-object p1
.end method
