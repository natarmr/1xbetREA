.class public final La/yiz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/uq70;


# instance fields
.field public final a:La/gu70;

.field public final b:La/p7m0;

.field public final c:La/p7m0;


# direct methods
.method public constructor <init>(La/gu70;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/yiz;->a:La/gu70;

    .line 8
    .line 9
    sget-object p1, La/cr70;->a:La/cr70;

    .line 10
    .line 11
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, La/yiz;->b:La/p7m0;

    .line 16
    .line 17
    iput-object p1, p0, La/yiz;->c:La/p7m0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/yiz;->a:La/gu70;

    .line 2
    .line 3
    iget-object v1, v0, La/gu70;->f:Landroid/net/sip/SipAudioCall;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/net/sip/SipAudioCall;->endCall()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/net/sip/SipAudioCall;->close()V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    iput-object v1, v0, La/gu70;->f:Landroid/net/sip/SipAudioCall;

    .line 15
    .line 16
    iget-object p0, p0, La/yiz;->b:La/p7m0;

    .line 17
    .line 18
    sget-object v0, La/cr70;->a:La/cr70;

    .line 19
    .line 20
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final b(La/xo9;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/yiz;->b:La/p7m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La/cr70;->a:La/cr70;

    .line 5
    .line 6
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, La/xo9;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, La/yiz;->a:La/gu70;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v3, v2, La/gu70;->j:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object v0, v2, La/gu70;->j:Ljava/lang/String;

    .line 29
    .line 30
    :goto_0
    iget-object v0, p1, La/xo9;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v3, v2, La/gu70;->i:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iput-object v0, v2, La/gu70;->i:Ljava/lang/String;

    .line 45
    .line 46
    :goto_1
    iget-object v0, p1, La/xo9;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v3, v2, La/gu70;->g:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    iput-object v0, v2, La/gu70;->g:Ljava/lang/String;

    .line 61
    .line 62
    :goto_2
    iget-object p1, p1, La/xo9;->d:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v0, v2, La/gu70;->h:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    iput-object p1, v2, La/gu70;->h:Ljava/lang/String;

    .line 77
    .line 78
    :goto_3
    new-instance p1, La/xiz;

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-direct {p1, p0, v0}, La/xiz;-><init>(La/yiz;B)V

    .line 82
    .line 83
    .line 84
    iget-object v0, v2, La/gu70;->k:La/xiz;

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    if-eq v0, p1, :cond_5

    .line 89
    .line 90
    :cond_4
    iput-object p1, v2, La/gu70;->k:La/xiz;

    .line 91
    .line 92
    :cond_5
    new-instance p1, La/xiz;

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    invoke-direct {p1, p0, v0}, La/xiz;-><init>(La/yiz;B)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v2, La/gu70;->o:La/xiz;

    .line 99
    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    if-eq v0, p1, :cond_7

    .line 103
    .line 104
    :cond_6
    iput-object p1, v2, La/gu70;->o:La/xiz;

    .line 105
    .line 106
    :cond_7
    new-instance p1, La/xiz;

    .line 107
    .line 108
    const/4 v0, 0x2

    .line 109
    invoke-direct {p1, p0, v0}, La/xiz;-><init>(La/yiz;B)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v2, La/gu70;->p:La/xiz;

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    if-eq v0, p1, :cond_9

    .line 117
    .line 118
    :cond_8
    iput-object p1, v2, La/gu70;->p:La/xiz;

    .line 119
    .line 120
    :cond_9
    new-instance p1, La/xiz;

    .line 121
    .line 122
    const/4 v0, 0x3

    .line 123
    invoke-direct {p1, p0, v0}, La/xiz;-><init>(La/yiz;B)V

    .line 124
    .line 125
    .line 126
    iget-object v0, v2, La/gu70;->n:La/xiz;

    .line 127
    .line 128
    if-eqz v0, :cond_a

    .line 129
    .line 130
    if-eq v0, p1, :cond_b

    .line 131
    .line 132
    :cond_a
    iput-object p1, v2, La/gu70;->n:La/xiz;

    .line 133
    .line 134
    :cond_b
    new-instance p1, La/xiz;

    .line 135
    .line 136
    const/4 v0, 0x4

    .line 137
    invoke-direct {p1, p0, v0}, La/xiz;-><init>(La/yiz;B)V

    .line 138
    .line 139
    .line 140
    iget-object v0, v2, La/gu70;->q:La/xiz;

    .line 141
    .line 142
    if-eqz v0, :cond_c

    .line 143
    .line 144
    if-eq v0, p1, :cond_d

    .line 145
    .line 146
    :cond_c
    iput-object p1, v2, La/gu70;->q:La/xiz;

    .line 147
    .line 148
    :cond_d
    new-instance p1, La/xiz;

    .line 149
    .line 150
    const/4 v0, 0x5

    .line 151
    invoke-direct {p1, p0, v0}, La/xiz;-><init>(La/yiz;B)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v2, La/gu70;->l:La/xiz;

    .line 155
    .line 156
    if-eqz v0, :cond_e

    .line 157
    .line 158
    if-eq v0, p1, :cond_f

    .line 159
    .line 160
    :cond_e
    iput-object p1, v2, La/gu70;->l:La/xiz;

    .line 161
    .line 162
    :cond_f
    new-instance p1, La/xiz;

    .line 163
    .line 164
    const/4 v0, 0x6

    .line 165
    invoke-direct {p1, p0, v0}, La/xiz;-><init>(La/yiz;B)V

    .line 166
    .line 167
    .line 168
    iget-object p0, v2, La/gu70;->m:La/xiz;

    .line 169
    .line 170
    if-eqz p0, :cond_10

    .line 171
    .line 172
    if-eq p0, p1, :cond_11

    .line 173
    .line 174
    :cond_10
    iput-object p1, v2, La/gu70;->m:La/xiz;

    .line 175
    .line 176
    :cond_11
    iget-object p0, v2, La/gu70;->a:Landroid/net/sip/SipManager;

    .line 177
    .line 178
    invoke-virtual {v2}, La/gu70;->a()V

    .line 179
    .line 180
    .line 181
    :try_start_0
    new-instance p1, Landroid/net/sip/SipProfile$Builder;

    .line 182
    .line 183
    iget-object v0, v2, La/gu70;->j:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v3, v2, La/gu70;->g:Ljava/lang/String;

    .line 186
    .line 187
    invoke-direct {p1, v0, v3}, Landroid/net/sip/SipProfile$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v2, La/gu70;->i:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroid/net/sip/SipProfile$Builder;->setDisplayName(Ljava/lang/String;)Landroid/net/sip/SipProfile$Builder;

    .line 193
    .line 194
    .line 195
    iget-object v0, v2, La/gu70;->b:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Landroid/net/sip/SipProfile$Builder;->setPassword(Ljava/lang/String;)Landroid/net/sip/SipProfile$Builder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/net/sip/SipProfile$Builder;->build()Landroid/net/sip/SipProfile;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iput-object p1, v2, La/gu70;->e:Landroid/net/sip/SipProfile;

    .line 205
    .line 206
    iget-object v0, v2, La/gu70;->d:Landroid/app/PendingIntent;

    .line 207
    .line 208
    invoke-virtual {p0, p1, v0, v1}, Landroid/net/sip/SipManager;->open(Landroid/net/sip/SipProfile;Landroid/app/PendingIntent;Landroid/net/sip/SipRegistrationListener;)V

    .line 209
    .line 210
    .line 211
    iget-object p1, v2, La/gu70;->e:Landroid/net/sip/SipProfile;

    .line 212
    .line 213
    iget-object v0, v2, La/gu70;->r:La/a8z;

    .line 214
    .line 215
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, La/fu70;

    .line 220
    .line 221
    const/16 v1, 0x1e

    .line 222
    .line 223
    invoke-virtual {p0, p1, v1, v0}, Landroid/net/sip/SipManager;->register(Landroid/net/sip/SipProfile;ILandroid/net/sip/SipRegistrationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :catch_0
    move-exception p0

    .line 228
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    if-eqz p0, :cond_12

    .line 236
    .line 237
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-eqz p0, :cond_12

    .line 242
    .line 243
    iget-object p1, v2, La/gu70;->c:La/n6k0;

    .line 244
    .line 245
    const-string v0, "error - "

    .line 246
    .line 247
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    const-string v0, "initializeLocalProfileError"

    .line 252
    .line 253
    invoke-virtual {p1, v0, p0}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :cond_12
    iget-object p0, v2, La/gu70;->n:La/xiz;

    .line 257
    .line 258
    if-eqz p0, :cond_13

    .line 259
    .line 260
    invoke-virtual {p0}, La/xiz;->invoke()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    :cond_13
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object p0, p0, La/yiz;->a:La/gu70;

    .line 2
    .line 3
    iget-object v0, p0, La/gu70;->c:La/n6k0;

    .line 4
    .line 5
    iget-object p0, p0, La/gu70;->e:Landroid/net/sip/SipProfile;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, La/gu70;->b(Landroid/net/sip/SipProfile;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "sipProfile "

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "onCallEndedByUser"

    .line 30
    .line 31
    invoke-virtual {v0, v1, p0}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, La/yiz;->a:La/gu70;

    .line 2
    .line 3
    invoke-virtual {p0}, La/gu70;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yiz;->a:La/gu70;

    .line 2
    .line 3
    iget-object p0, p0, La/gu70;->f:Landroid/net/sip/SipAudioCall;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/net/sip/SipAudioCall;->setSpeakerMode(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final e(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, La/yiz;->a:La/gu70;

    .line 2
    .line 3
    iget-object p0, p0, La/gu70;->f:Landroid/net/sip/SipAudioCall;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/net/sip/SipAudioCall;->isMuted()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/net/sip/SipAudioCall;->toggleMute()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/yiz;->a:La/gu70;

    .line 2
    .line 3
    iget-object v0, p0, La/gu70;->f:Landroid/net/sip/SipAudioCall;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/net/sip/SipAudioCall;->getState()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, La/gu70;->f:Landroid/net/sip/SipAudioCall;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/net/sip/SipAudioCall;->getState()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/16 v0, 0x65

    .line 23
    .line 24
    if-ne p0, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/yiz;->a:La/gu70;

    .line 2
    .line 3
    iget-object p0, p0, La/gu70;->f:Landroid/net/sip/SipAudioCall;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/net/sip/SipAudioCall;->isInCall()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final h()La/gmq;
    .locals 0

    .line 1
    iget-object p0, p0, La/yiz;->c:La/p7m0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(La/fr70;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/yiz;->b:La/p7m0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method
