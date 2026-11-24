.class public final synthetic La/bzb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/krs0;

.field public final synthetic c:La/s45;


# direct methods
.method public synthetic constructor <init>(La/krs0;La/s45;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bzb0;->a:B

    iput-object p1, p0, La/bzb0;->b:La/krs0;

    iput-object p2, p0, La/bzb0;->c:La/s45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-byte v0, p0, La/bzb0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/bzb0;->c:La/s45;

    .line 5
    .line 6
    iget-object p0, p0, La/bzb0;->b:La/krs0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v2, La/s45;->a:La/dzb0;

    .line 12
    .line 13
    const/16 v3, 0xb

    .line 14
    .line 15
    :try_start_0
    iget-object v4, p0, La/krs0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, La/r45;

    .line 18
    .line 19
    iget-object v4, v4, La/r45;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, La/krs0;->e(La/s45;)La/b1x;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v4, La/oh60;

    .line 36
    .line 37
    const/16 v5, 0xa

    .line 38
    .line 39
    invoke-direct {v4, v0, p0, v5}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    check-cast v2, La/lmv;

    .line 43
    .line 44
    invoke-virtual {v2, v4}, La/lmv;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch La/ozw; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catch_0
    move-exception p0

    .line 49
    goto :goto_0

    .line 50
    :catch_1
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :catch_2
    move-exception p0

    .line 53
    goto :goto_2

    .line 54
    :goto_0
    new-instance v2, La/ozw;

    .line 55
    .line 56
    const-string v4, "Processing failed."

    .line 57
    .line 58
    invoke-direct {v2, v1, v4, p0}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance v1, La/oh60;

    .line 66
    .line 67
    invoke-direct {v1, v0, v2, v3}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    check-cast p0, La/lmv;

    .line 71
    .line 72
    invoke-virtual {p0, v1}, La/lmv;->execute(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :goto_1
    new-instance v2, La/ozw;

    .line 77
    .line 78
    const-string v4, "Processing failed due to low memory."

    .line 79
    .line 80
    invoke-direct {v2, v1, v4, p0}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    new-instance v1, La/oh60;

    .line 88
    .line 89
    invoke-direct {v1, v0, v2, v3}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    check-cast p0, La/lmv;

    .line 93
    .line 94
    invoke-virtual {p0, v1}, La/lmv;->execute(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :goto_2
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    new-instance v2, La/oh60;

    .line 103
    .line 104
    invoke-direct {v2, v0, p0, v3}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    check-cast v1, La/lmv;

    .line 108
    .line 109
    invoke-virtual {v1, v2}, La/lmv;->execute(Ljava/lang/Runnable;)V

    .line 110
    .line 111
    .line 112
    :goto_3
    return-void

    .line 113
    :pswitch_0
    new-instance v0, La/bzb0;

    .line 114
    .line 115
    const/4 v1, 0x2

    .line 116
    invoke-direct {v0, p0, v2, v1}, La/bzb0;-><init>(La/krs0;La/s45;B)V

    .line 117
    .line 118
    .line 119
    const-string p0, "CX:processInputPacket"

    .line 120
    .line 121
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :try_start_1
    invoke-virtual {v0}, La/bzb0;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    .line 127
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :catchall_0
    move-exception p0

    .line 132
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :pswitch_1
    const-string v0, "Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: "

    .line 137
    .line 138
    iget-object v3, v2, La/s45;->a:La/dzb0;

    .line 139
    .line 140
    :try_start_2
    iget-object v4, p0, La/krs0;->d:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v4, La/xi70;

    .line 143
    .line 144
    invoke-virtual {v4, v2}, La/xi70;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, La/n45;

    .line 149
    .line 150
    iget v5, v4, La/n45;->c:I

    .line 151
    .line 152
    const/16 v6, 0x23

    .line 153
    .line 154
    if-eq v5, v6, :cond_0

    .line 155
    .line 156
    const/16 v6, 0x100

    .line 157
    .line 158
    if-eq v5, v6, :cond_0

    .line 159
    .line 160
    const/16 v6, 0x1005

    .line 161
    .line 162
    if-ne v5, v6, :cond_1

    .line 163
    .line 164
    :cond_0
    const/4 v1, 0x1

    .line 165
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v0, v1}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 178
    .line 179
    .line 180
    iget-object p0, p0, La/krs0;->j:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, La/bst;

    .line 183
    .line 184
    invoke-virtual {p0, v4}, La/bst;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Landroid/graphics/Bitmap;

    .line 189
    .line 190
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v1, La/oh60;

    .line 195
    .line 196
    const/16 v4, 0x9

    .line 197
    .line 198
    invoke-direct {v1, v3, p0, v4}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 199
    .line 200
    .line 201
    check-cast v0, La/lmv;

    .line 202
    .line 203
    invoke-virtual {v0, v1}, La/lmv;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :catch_3
    move-exception p0

    .line 208
    iget-object v0, v2, La/s45;->b:La/b1x;

    .line 209
    .line 210
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 211
    .line 212
    .line 213
    const-string v0, "ProcessingNode"

    .line 214
    .line 215
    const-string v1, "process postview input packet failed."

    .line 216
    .line 217
    invoke-static {v0, v1, p0}, La/l8x;->Y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :goto_4
    return-void

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
