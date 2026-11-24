.class public final La/ffw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/zz2;


# instance fields
.field public final a:La/nmt0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/zz2;

    .line 2
    .line 3
    const-string v1, "FirebaseAuthFallback:"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "FirebaseAuth"

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, La/zz2;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/ffw0;->b:La/zz2;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/nfq;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, La/nfq;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, La/nfq;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, La/x860;->i()La/x860;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, La/nmt0;

    .line 20
    .line 21
    new-instance v2, La/ywq0;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, v2, La/ywq0;->e:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {p1}, La/nfq;->a()V

    .line 29
    .line 30
    .line 31
    iget-object v3, p1, La/nfq;->c:La/mgq;

    .line 32
    .line 33
    iget-object v3, v3, La/mgq;->a:Ljava/lang/String;

    .line 34
    .line 35
    iput-object v3, v2, La/ywq0;->f:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {p1}, La/nfq;->a()V

    .line 38
    .line 39
    .line 40
    iget-object v4, p1, La/nfq;->c:La/mgq;

    .line 41
    .line 42
    iget-object v4, v4, La/mgq;->h:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v0, v2, La/ywq0;->d:Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    iput-object v0, v2, La/ywq0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v0, v2, La/ywq0;->a:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v0, v2, La/ywq0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    const-string v0, "firebear.secureToken"

    .line 54
    .line 55
    invoke-static {v0}, La/qim0;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    sget-object v4, La/xgw0;->a:La/gx3;

    .line 66
    .line 67
    monitor-enter v4

    .line 68
    :try_start_0
    invoke-virtual {v4, v3}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_0

    .line 73
    .line 74
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    const-string v0, "https://securetoken.googleapis.com/v1"

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 81
    .line 82
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :goto_0
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    throw p0

    .line 88
    :cond_1
    const-string v4, "LocalClient"

    .line 89
    .line 90
    const-string v5, "Found hermetic configuration for secureToken URL: "

    .line 91
    .line 92
    invoke-static {v5, v0, v4}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v4, v2, La/ywq0;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v4, La/rfw0;

    .line 98
    .line 99
    if-nez v4, :cond_2

    .line 100
    .line 101
    new-instance v4, La/rfw0;

    .line 102
    .line 103
    invoke-virtual {v2}, La/ywq0;->J()La/fht0;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-direct {v4, v0, v5}, La/c2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iput-object v4, v2, La/ywq0;->c:Ljava/lang/Object;

    .line 111
    .line 112
    :cond_2
    const-string v0, "firebear.identityToolkit"

    .line 113
    .line 114
    invoke-static {v0}, La/qim0;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_3

    .line 123
    .line 124
    invoke-static {v3}, La/xgw0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    const-string v0, "https://www.googleapis.com/identitytoolkit/v3/relyingparty"

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    const-string v4, "LocalClient"

    .line 131
    .line 132
    const-string v5, "Found hermetic configuration for identityToolkit URL: "

    .line 133
    .line 134
    invoke-static {v5, v0, v4}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_2
    iget-object v4, v2, La/ywq0;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v4, La/rfw0;

    .line 140
    .line 141
    if-nez v4, :cond_4

    .line 142
    .line 143
    new-instance v4, La/rfw0;

    .line 144
    .line 145
    invoke-virtual {v2}, La/ywq0;->J()La/fht0;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-direct {v4, v0, v5}, La/c2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iput-object v4, v2, La/ywq0;->a:Ljava/lang/Object;

    .line 153
    .line 154
    :cond_4
    const-string v0, "firebear.identityToolkitV2"

    .line 155
    .line 156
    invoke-static {v0}, La/qim0;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_6

    .line 165
    .line 166
    sget-object v4, La/xgw0;->a:La/gx3;

    .line 167
    .line 168
    monitor-enter v4

    .line 169
    :try_start_2
    invoke-virtual {v4, v3}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-nez v0, :cond_5

    .line 174
    .line 175
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 176
    const-string v0, "https://identitytoolkit.googleapis.com/v2"

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :catchall_1
    move-exception p0

    .line 180
    goto :goto_3

    .line 181
    :cond_5
    :try_start_3
    new-instance p0, Ljava/lang/ClassCastException;

    .line 182
    .line 183
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 184
    .line 185
    .line 186
    throw p0

    .line 187
    :goto_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 188
    throw p0

    .line 189
    :cond_6
    const-string v4, "LocalClient"

    .line 190
    .line 191
    const-string v5, "Found hermetic configuration for identityToolkitV2 URL: "

    .line 192
    .line 193
    invoke-static {v5, v0, v4}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :goto_4
    iget-object v4, v2, La/ywq0;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v4, La/rfw0;

    .line 199
    .line 200
    if-nez v4, :cond_7

    .line 201
    .line 202
    new-instance v4, La/rfw0;

    .line 203
    .line 204
    invoke-virtual {v2}, La/ywq0;->J()La/fht0;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-direct {v4, v0, v5}, La/c2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iput-object v4, v2, La/ywq0;->b:Ljava/lang/Object;

    .line 212
    .line 213
    :cond_7
    const-class v0, La/zdw0;

    .line 214
    .line 215
    invoke-virtual {p1, v0}, La/nfq;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, La/zdw0;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    sget-object p1, La/xgw0;->b:La/gx3;

    .line 225
    .line 226
    monitor-enter p1

    .line 227
    :try_start_4
    invoke-virtual {p1, v3}, La/nuj0;->containsKey(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_8

    .line 232
    .line 233
    invoke-virtual {p1, v3}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, Ljava/util/List;

    .line 238
    .line 239
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 240
    .line 241
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :catchall_2
    move-exception p0

    .line 249
    goto :goto_6

    .line 250
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 256
    .line 257
    invoke-direct {v4, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, v3, v0}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    :goto_5
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 267
    invoke-direct {v1, v2}, La/nmt0;-><init>(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    iput-object v1, p0, La/ffw0;->a:La/nmt0;

    .line 271
    .line 272
    new-instance p0, La/tgw0;

    .line 273
    .line 274
    invoke-direct {p0, p2}, La/tgw0;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :goto_6
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 279
    throw p0
.end method


# virtual methods
.method public final a(La/mhw0;La/efw0;)V
    .locals 3

    .line 1
    invoke-static {p2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/mhw0;->c:Lcom/google/firebase/auth/EmailAuthCredential;

    .line 5
    .line 6
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, La/mhw0;->c:Lcom/google/firebase/auth/EmailAuthCredential;

    .line 10
    .line 11
    iget-object p1, p1, La/mhw0;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v1, La/hcp0;

    .line 14
    .line 15
    sget-object v2, La/ffw0;->b:La/zz2;

    .line 16
    .line 17
    invoke-direct {v1, p2, v2}, La/hcp0;-><init>(La/efw0;La/zz2;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-boolean p2, v0, Lcom/google/firebase/auth/EmailAuthCredential;->e:Z

    .line 24
    .line 25
    iget-object p0, p0, La/ffw0;->a:La/nmt0;

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    iget-object p2, v0, Lcom/google/firebase/auth/EmailAuthCredential;->d:Ljava/lang/String;

    .line 30
    .line 31
    new-instance v2, La/h0q0;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, v2, La/h0q0;->a:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object p1, v2, La/h0q0;->b:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, v2, La/h0q0;->c:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p0, v2, La/h0q0;->d:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {p0, p2, v2}, La/nmt0;->h(Ljava/lang/String;La/ngw0;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    new-instance p2, La/mhw0;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {p2, v0, v2, p1}, La/mhw0;-><init>(Lcom/google/firebase/auth/EmailAuthCredential;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p2, v1}, La/nmt0;->f(La/mhw0;La/hcp0;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/firebase-auth-api/zzajg;La/efw0;)V
    .locals 2

    .line 1
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/hcp0;

    .line 8
    .line 9
    sget-object v1, La/ffw0;->b:La/zz2;

    .line 10
    .line 11
    invoke-direct {v0, p2, v1}, La/hcp0;-><init>(La/efw0;La/zz2;)V

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    iput-boolean p2, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->o:Z

    .line 16
    .line 17
    iget-object p0, p0, La/ffw0;->a:La/nmt0;

    .line 18
    .line 19
    iget-object p2, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, La/ywq0;

    .line 22
    .line 23
    new-instance v1, La/afm0;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, La/afm0;-><init>(La/nmt0;La/hcp0;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p2, La/ywq0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/rfw0;

    .line 31
    .line 32
    iget-object p2, p2, La/ywq0;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/String;

    .line 35
    .line 36
    const-string v0, "/verifyAssertion"

    .line 37
    .line 38
    invoke-virtual {p0, v0, p2}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    new-instance v0, La/ljw0;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, La/fht0;

    .line 50
    .line 51
    invoke-static {p2, p1, v1, v0, p0}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final c(Lcom/google/firebase/auth/PhoneAuthCredential;Ljava/lang/String;La/efw0;)V
    .locals 2

    .line 1
    invoke-static {p3}, La/s0x;->H(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, La/ihm0;->r(Lcom/google/firebase/auth/PhoneAuthCredential;)La/lsj;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p2, p1, La/lsj;->g:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance p2, La/hcp0;

    .line 14
    .line 15
    sget-object v0, La/ffw0;->b:La/zz2;

    .line 16
    .line 17
    invoke-direct {p2, p3, v0}, La/hcp0;-><init>(La/efw0;La/zz2;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/ffw0;->a:La/nmt0;

    .line 21
    .line 22
    iget-object p3, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p3, La/ywq0;

    .line 25
    .line 26
    new-instance v0, La/okt0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/okt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p3, La/ywq0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/rfw0;

    .line 35
    .line 36
    iget-object p2, p3, La/ywq0;->f:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/String;

    .line 39
    .line 40
    const-string p3, "/verifyPhoneNumber"

    .line 41
    .line 42
    invoke-virtual {p0, p3, p2}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance p3, La/njw0;

    .line 47
    .line 48
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, La/fht0;

    .line 54
    .line 55
    invoke-static {p2, p1, v0, p3, p0}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/efw0;)V
    .locals 2

    .line 1
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, La/s0x;->E(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p5}, La/s0x;->H(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, La/hcp0;

    .line 11
    .line 12
    sget-object v1, La/ffw0;->b:La/zz2;

    .line 13
    .line 14
    invoke-direct {v0, p5, v1}, La/hcp0;-><init>(La/efw0;La/zz2;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, La/s0x;->E(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance p5, La/v35;

    .line 24
    .line 25
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p5, La/v35;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p2}, La/s0x;->E(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object p2, p5, La/v35;->b:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p3, p5, La/v35;->c:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p4, p5, La/v35;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object p0, p0, La/ffw0;->a:La/nmt0;

    .line 43
    .line 44
    iget-object p1, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, La/ywq0;

    .line 47
    .line 48
    new-instance p2, La/trm0;

    .line 49
    .line 50
    const/16 p3, 0x12

    .line 51
    .line 52
    const/4 p4, 0x0

    .line 53
    invoke-direct {p2, p0, v0, p4, p3}, La/trm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p1, La/ywq0;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/rfw0;

    .line 59
    .line 60
    iget-object p1, p1, La/ywq0;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Ljava/lang/String;

    .line 63
    .line 64
    const-string p3, "/verifyPassword"

    .line 65
    .line 66
    invoke-virtual {p0, p3, p1}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p3, La/mjw0;

    .line 71
    .line 72
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, La/fht0;

    .line 78
    .line 79
    invoke-static {p1, p5, p2, p3, p0}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method
