.class public final synthetic La/puj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/quj;


# direct methods
.method public synthetic constructor <init>(La/quj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/puj;->a:B

    iput-object p1, p0, La/puj;->b:La/quj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/puj;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/puj;->b:La/quj;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object p0, v0, La/quj;->a:La/b8z;

    .line 10
    .line 11
    invoke-virtual {p0}, La/b8z;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/mtv;

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iget-object v3, v0, La/quj;->c:La/p5d0;

    .line 22
    .line 23
    invoke-interface {v3}, La/p5d0;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, La/yyj;

    .line 28
    .line 29
    invoke-virtual {v3}, La/yyj;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :try_start_1
    invoke-static {v1, v2}, La/mtv;->b(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, La/zsb0;

    .line 39
    .line 40
    invoke-direct {v2, v3}, La/zsb0;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, La/mtv;->a:La/s8y;

    .line 44
    .line 45
    new-instance v5, La/k9v;

    .line 46
    .line 47
    invoke-direct {v5, p0, v1, v3, v2}, La/k9v;-><init>(La/mtv;Ljava/lang/String;Ljava/lang/String;La/zsb0;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v5}, La/s8y;->a(Lkotlin/jvm/functions/Function1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    :try_start_2
    monitor-exit p0

    .line 54
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_0

    .line 59
    :catchall_1
    move-exception v1

    .line 60
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 61
    :try_start_4
    throw v1

    .line 62
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 63
    throw p0

    .line 64
    :pswitch_0
    iget-object p0, p0, La/puj;->b:La/quj;

    .line 65
    .line 66
    monitor-enter p0

    .line 67
    :try_start_5
    iget-object v0, p0, La/quj;->a:La/b8z;

    .line 68
    .line 69
    invoke-virtual {v0}, La/b8z;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/mtv;

    .line 74
    .line 75
    invoke-virtual {v0}, La/mtv;->a()Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    monitor-enter v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 80
    :try_start_6
    iget-object v2, v0, La/mtv;->a:La/s8y;

    .line 81
    .line 82
    new-instance v3, La/umu;

    .line 83
    .line 84
    invoke-direct {v3, v0}, La/umu;-><init>(La/mtv;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, La/s8y;->a(Lkotlin/jvm/functions/Function1;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 88
    .line 89
    .line 90
    :try_start_7
    monitor-exit v0

    .line 91
    new-instance v0, Lorg/json/JSONArray;

    .line 92
    .line 93
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-ge v2, v3, :cond_0

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    check-cast v3, La/x35;

    .line 108
    .line 109
    new-instance v4, Lorg/json/JSONObject;

    .line 110
    .line 111
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v5, "agent"

    .line 115
    .line 116
    iget-object v6, v3, La/x35;->a:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    const-string v5, "dates"

    .line 122
    .line 123
    new-instance v6, Lorg/json/JSONArray;

    .line 124
    .line 125
    iget-object v3, v3, La/x35;->b:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v6, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 134
    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :catchall_2
    move-exception v0

    .line 140
    goto :goto_5

    .line 141
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 142
    .line 143
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v2, "heartbeats"

    .line 147
    .line 148
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    const-string v0, "version"

    .line 152
    .line 153
    const-string v2, "2"

    .line 154
    .line 155
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 159
    .line 160
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 161
    .line 162
    .line 163
    new-instance v2, Landroid/util/Base64OutputStream;

    .line 164
    .line 165
    const/16 v3, 0xb

    .line 166
    .line 167
    invoke-direct {v2, v0, v3}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 168
    .line 169
    .line 170
    :try_start_8
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    .line 171
    .line 172
    invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 173
    .line 174
    .line 175
    :try_start_9
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v4, "UTF-8"

    .line 180
    .line 181
    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 186
    .line 187
    .line 188
    :try_start_a
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 189
    .line 190
    .line 191
    :try_start_b
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V

    .line 192
    .line 193
    .line 194
    const-string v1, "UTF-8"

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 201
    return-object v0

    .line 202
    :catchall_3
    move-exception v0

    .line 203
    goto :goto_3

    .line 204
    :catchall_4
    move-exception v0

    .line 205
    :try_start_c
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :catchall_5
    move-exception v1

    .line 210
    :try_start_d
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    :goto_2
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 214
    :goto_3
    :try_start_e
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :catchall_6
    move-exception v1

    .line 219
    :try_start_f
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    :goto_4
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 223
    :catchall_7
    move-exception v1

    .line 224
    :try_start_10
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 225
    :try_start_11
    throw v1

    .line 226
    :goto_5
    monitor-exit p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 227
    throw v0

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
