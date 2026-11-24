.class public final La/wv40;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements La/bvw;


# instance fields
.field public final synthetic a:Landroidx/room3/MultiInstanceInvalidationService;


# direct methods
.method public constructor <init>(Landroidx/room3/MultiInstanceInvalidationService;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wv40;->a:Landroidx/room3/MultiInstanceInvalidationService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, La/bvw;->i:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6

    .line 1
    sget-object v0, La/bvw;->i:Ljava/lang/String;

    .line 2
    .line 3
    const v1, 0xffffff

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-lt p1, v2, :cond_0

    .line 8
    .line 9
    if-gt p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v3, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    if-ne p1, v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    const/4 v1, 0x0

    .line 34
    if-eq p1, v2, :cond_b

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    if-eq p1, v3, :cond_8

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    if-eq p1, v1, :cond_3

    .line 41
    .line 42
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/wv40;->a:Landroidx/room3/MultiInstanceInvalidationService;

    .line 59
    .line 60
    iget-object p3, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 61
    .line 62
    monitor-enter p3

    .line 63
    :try_start_0
    iget-object p4, p0, Landroidx/room3/MultiInstanceInvalidationService;->b:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {p4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    check-cast p4, Ljava/lang/String;

    .line 74
    .line 75
    if-nez p4, :cond_4

    .line 76
    .line 77
    const-string p0, "ROOM"

    .line 78
    .line 79
    const-string p1, "Remote invalidation client ID not registered"

    .line 80
    .line 81
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    :goto_0
    monitor-exit p3

    .line 85
    goto :goto_4

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_5

    .line 88
    :cond_4
    :try_start_1
    iget-object v1, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 91
    .line 92
    .line 93
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    :goto_1
    iget-object v3, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 95
    .line 96
    if-ge v0, v1, :cond_7

    .line 97
    .line 98
    :try_start_2
    invoke-virtual {v3, v0}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    check-cast v3, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    iget-object v5, p0, Landroidx/room3/MultiInstanceInvalidationService;->b:Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    invoke-virtual {v5, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Ljava/lang/String;

    .line 118
    .line 119
    if-eq p1, v4, :cond_6

    .line 120
    .line 121
    invoke-virtual {p4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    if-nez v3, :cond_5

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    :try_start_3
    iget-object v3, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 129
    .line 130
    invoke-virtual {v3, v0}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, La/zuw;

    .line 135
    .line 136
    invoke-interface {v3, p2}, La/zuw;->a([Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :catchall_1
    move-exception p1

    .line 141
    goto :goto_3

    .line 142
    :catch_0
    move-exception v3

    .line 143
    :try_start_4
    const-string v4, "ROOM"

    .line 144
    .line 145
    const-string v5, "Error invoking a remote callback"

    .line 146
    .line 147
    invoke-static {v4, v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 148
    .line 149
    .line 150
    :cond_6
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :goto_3
    :try_start_5
    iget-object p0, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_7
    invoke-virtual {v3}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :goto_4
    return v2

    .line 164
    :goto_5
    monitor-exit p3

    .line 165
    throw p0

    .line 166
    :cond_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-nez p1, :cond_9

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_9
    sget-object p4, La/zuw;->g:Ljava/lang/String;

    .line 174
    .line 175
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 176
    .line 177
    .line 178
    move-result-object p4

    .line 179
    if-eqz p4, :cond_a

    .line 180
    .line 181
    instance-of v0, p4, La/zuw;

    .line 182
    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    move-object v1, p4

    .line 186
    check-cast v1, La/zuw;

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_a
    new-instance v1, La/xuw;

    .line 190
    .line 191
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    iput-object p1, v1, La/xuw;->a:Landroid/os/IBinder;

    .line 195
    .line 196
    :goto_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object p0, p0, La/wv40;->a:Landroidx/room3/MultiInstanceInvalidationService;

    .line 204
    .line 205
    iget-object p2, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 206
    .line 207
    monitor-enter p2

    .line 208
    :try_start_6
    iget-object p4, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 209
    .line 210
    invoke-virtual {p4, v1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 211
    .line 212
    .line 213
    iget-object p0, p0, Landroidx/room3/MultiInstanceInvalidationService;->b:Ljava/util/LinkedHashMap;

    .line 214
    .line 215
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 224
    .line 225
    monitor-exit p2

    .line 226
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 227
    .line 228
    .line 229
    return v2

    .line 230
    :catchall_2
    move-exception p0

    .line 231
    monitor-exit p2

    .line 232
    throw p0

    .line 233
    :cond_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    if-nez p1, :cond_c

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_c
    sget-object p4, La/zuw;->g:Ljava/lang/String;

    .line 241
    .line 242
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 243
    .line 244
    .line 245
    move-result-object p4

    .line 246
    if-eqz p4, :cond_d

    .line 247
    .line 248
    instance-of v1, p4, La/zuw;

    .line 249
    .line 250
    if-eqz v1, :cond_d

    .line 251
    .line 252
    move-object v1, p4

    .line 253
    check-cast v1, La/zuw;

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_d
    new-instance v1, La/xuw;

    .line 257
    .line 258
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 259
    .line 260
    .line 261
    iput-object p1, v1, La/xuw;->a:Landroid/os/IBinder;

    .line 262
    .line 263
    :goto_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    if-nez p1, :cond_e

    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_e
    iget-object p0, p0, La/wv40;->a:Landroidx/room3/MultiInstanceInvalidationService;

    .line 274
    .line 275
    iget-object p2, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 276
    .line 277
    monitor-enter p2

    .line 278
    :try_start_7
    iget p4, p0, Landroidx/room3/MultiInstanceInvalidationService;->a:I

    .line 279
    .line 280
    add-int/2addr p4, v2

    .line 281
    iput p4, p0, Landroidx/room3/MultiInstanceInvalidationService;->a:I

    .line 282
    .line 283
    iget-object v3, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 284
    .line 285
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v3, v1, v4}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-eqz v1, :cond_f

    .line 294
    .line 295
    iget-object p0, p0, Landroidx/room3/MultiInstanceInvalidationService;->b:Ljava/util/LinkedHashMap;

    .line 296
    .line 297
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move v0, p4

    .line 305
    goto :goto_8

    .line 306
    :catchall_3
    move-exception p0

    .line 307
    goto :goto_a

    .line 308
    :cond_f
    iget p1, p0, Landroidx/room3/MultiInstanceInvalidationService;->a:I

    .line 309
    .line 310
    add-int/lit8 p1, p1, -0x1

    .line 311
    .line 312
    iput p1, p0, Landroidx/room3/MultiInstanceInvalidationService;->a:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 313
    .line 314
    :goto_8
    monitor-exit p2

    .line 315
    :goto_9
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 319
    .line 320
    .line 321
    return v2

    .line 322
    :goto_a
    monitor-exit p2

    .line 323
    throw p0
.end method
