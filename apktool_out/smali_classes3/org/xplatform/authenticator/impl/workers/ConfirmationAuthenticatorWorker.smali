.class public final Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "a/ga3",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:La/ot10;

.field public final i:La/ctf0;

.field public final j:La/sxs0;

.field public final k:La/t760;

.field public final l:La/epc;

.field public final m:La/nyb;

.field public final n:La/oif0;

.field public final o:La/ojj;

.field public final p:La/a8z;

.field public final q:La/n0o0;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public final t:La/n0o0;

.field public final u:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->g:Landroid/content/Context;

    .line 11
    .line 12
    new-instance p1, La/mzd;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, La/mzd;-><init>(Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;B)V

    .line 16
    .line 17
    .line 18
    sget-object p2, La/wez;->b:La/wez;

    .line 19
    .line 20
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->p:La/a8z;

    .line 25
    .line 26
    new-instance p1, La/mzd;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p1, p0, p2}, La/mzd;-><init>(Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->q:La/n0o0;

    .line 37
    .line 38
    new-instance p1, La/mzd;

    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    invoke-direct {p1, p0, p2}, La/mzd;-><init>(Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->r:La/n0o0;

    .line 49
    .line 50
    new-instance p1, La/mzd;

    .line 51
    .line 52
    const/4 p2, 0x3

    .line 53
    invoke-direct {p1, p0, p2}, La/mzd;-><init>(Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->s:La/n0o0;

    .line 61
    .line 62
    new-instance p1, La/mzd;

    .line 63
    .line 64
    const/4 v0, 0x4

    .line 65
    invoke-direct {p1, p0, v0}, La/mzd;-><init>(Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->t:La/n0o0;

    .line 73
    .line 74
    new-instance p1, La/mzd;

    .line 75
    .line 76
    const/4 v0, 0x5

    .line 77
    invoke-direct {p1, p0, v0}, La/mzd;-><init>(Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->u:La/n0o0;

    .line 85
    .line 86
    iget-object p1, p0, La/og00;->a:Landroid/content/Context;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    check-cast p1, Landroid/app/Application;

    .line 92
    .line 93
    instance-of v0, p1, La/af3;

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    if-eqz v0, :cond_0

    .line 97
    .line 98
    check-cast p1, La/af3;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move-object p1, v1

    .line 102
    :goto_0
    const-class v0, La/pzd;

    .line 103
    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, La/o5d0;

    .line 115
    .line 116
    if-eqz p1, :cond_1

    .line 117
    .line 118
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, La/ze3;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    move-object p1, v1

    .line 126
    :goto_1
    instance-of v2, p1, La/pzd;

    .line 127
    .line 128
    if-nez v2, :cond_2

    .line 129
    .line 130
    move-object p1, v1

    .line 131
    :cond_2
    check-cast p1, La/pzd;

    .line 132
    .line 133
    if-eqz p1, :cond_3

    .line 134
    .line 135
    iget-object v0, p1, La/pzd;->a:La/sp4;

    .line 136
    .line 137
    iget-object v0, v0, La/sp4;->a:La/b9i;

    .line 138
    .line 139
    iget-object v1, p1, La/pzd;->b:La/h760;

    .line 140
    .line 141
    iget-object v2, p1, La/pzd;->d:La/ctf0;

    .line 142
    .line 143
    iget-object v3, p1, La/pzd;->c:La/ot10;

    .line 144
    .line 145
    iget-object p1, p1, La/pzd;->e:La/ojj;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iput-object v3, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->h:La/ot10;

    .line 154
    .line 155
    iput-object v2, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->i:La/ctf0;

    .line 156
    .line 157
    new-instance v2, La/sxs0;

    .line 158
    .line 159
    invoke-direct {v2, p2}, La/sxs0;-><init>(B)V

    .line 160
    .line 161
    .line 162
    iput-object v2, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->j:La/sxs0;

    .line 163
    .line 164
    invoke-interface {v1}, La/h760;->a()La/t760;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-static {p2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iput-object p2, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->k:La/t760;

    .line 172
    .line 173
    new-instance p2, La/epc;

    .line 174
    .line 175
    invoke-virtual {v0}, La/b9i;->x()La/ts4;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {p2, v1}, La/epc;-><init>(La/ts4;)V

    .line 180
    .line 181
    .line 182
    iput-object p2, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->l:La/epc;

    .line 183
    .line 184
    new-instance p2, La/nyb;

    .line 185
    .line 186
    invoke-virtual {v0}, La/b9i;->x()La/ts4;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-direct {p2, v1}, La/nyb;-><init>(La/ts4;)V

    .line 191
    .line 192
    .line 193
    iput-object p2, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->m:La/nyb;

    .line 194
    .line 195
    new-instance p2, La/oif0;

    .line 196
    .line 197
    new-instance v1, La/myb;

    .line 198
    .line 199
    invoke-virtual {v0}, La/b9i;->x()La/ts4;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-direct {v1, v2}, La/myb;-><init>(La/ts4;)V

    .line 204
    .line 205
    .line 206
    iget-object v2, v0, La/b9i;->m:La/rou;

    .line 207
    .line 208
    iget-object v0, v0, La/b9i;->o:La/eqx;

    .line 209
    .line 210
    const/16 v3, 0xc

    .line 211
    .line 212
    invoke-direct {p2, v1, v2, v0, v3}, La/oif0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 213
    .line 214
    .line 215
    iput-object p2, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->n:La/oif0;

    .line 216
    .line 217
    iput-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->o:La/ojj;

    .line 218
    .line 219
    return-void

    .line 220
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 221
    .line 222
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v1
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->r:La/n0o0;

    .line 2
    .line 3
    instance-of v1, p1, La/ozd;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, La/ozd;

    .line 9
    .line 10
    iget v2, v1, La/ozd;->m:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/ozd;->m:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/ozd;

    .line 23
    .line 24
    check-cast p1, La/zje;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, La/ozd;-><init>(Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, La/ozd;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/ozd;->m:I

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    const/4 v5, 0x3

    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v12, 0x0

    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    if-eq v3, v7, :cond_3

    .line 43
    .line 44
    if-eq v3, v6, :cond_2

    .line 45
    .line 46
    if-eq v3, v5, :cond_2

    .line 47
    .line 48
    if-ne v3, v4, :cond_1

    .line 49
    .line 50
    iget-object v0, v1, La/ozd;->j:Ljava/lang/Throwable;

    .line 51
    .line 52
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v10, p0

    .line 56
    goto/16 :goto_9

    .line 57
    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0

    .line 65
    :cond_2
    iget-object v0, v1, La/ozd;->j:Ljava/lang/Throwable;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, v1, La/ozd;->i:Landroid/app/Application;

    .line 70
    .line 71
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    goto/16 :goto_a

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    move-object v9, p1

    .line 79
    move-object v11, v3

    .line 80
    goto/16 :goto_6

    .line 81
    .line 82
    :cond_3
    iget-object v3, v1, La/ozd;->i:Landroid/app/Application;

    .line 83
    .line 84
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->g:Landroid/content/Context;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    instance-of v3, p1, Landroid/app/Application;

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    check-cast p1, Landroid/app/Application;

    .line 102
    .line 103
    move-object v3, p1

    .line 104
    goto :goto_1

    .line 105
    :cond_5
    move-object v3, v12

    .line 106
    :goto_1
    if-nez v3, :cond_6

    .line 107
    .line 108
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_6
    :try_start_2
    iget-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->h:La/ot10;

    .line 114
    .line 115
    if-eqz p1, :cond_10

    .line 116
    .line 117
    iput-object v3, v1, La/ozd;->i:Landroid/app/Application;

    .line 118
    .line 119
    iput v7, v1, La/ozd;->m:I

    .line 120
    .line 121
    invoke-virtual {p1, v1}, La/ot10;->d(La/zje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v2, :cond_7

    .line 126
    .line 127
    goto/16 :goto_8

    .line 128
    .line 129
    :cond_7
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 130
    .line 131
    iget-object v8, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->j:La/sxs0;

    .line 132
    .line 133
    if-eqz v8, :cond_f

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v8, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-nez v8, :cond_8

    .line 145
    .line 146
    sput-object p1, La/ujn;->h:Ljava/lang/String;

    .line 147
    .line 148
    :cond_8
    const-string p1, "notification"

    .line 149
    .line 150
    invoke-virtual {v3, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    check-cast p1, Landroid/app/NotificationManager;

    .line 158
    .line 159
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    check-cast v8, Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    invoke-virtual {p1, v8}, Landroid/app/NotificationManager;->cancel(I)V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->q:La/n0o0;

    .line 173
    .line 174
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, La/r080;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_13

    .line 185
    .line 186
    if-eq p1, v7, :cond_e

    .line 187
    .line 188
    if-ne p1, v6, :cond_d

    .line 189
    .line 190
    iput-object v3, v1, La/ozd;->i:Landroid/app/Application;

    .line 191
    .line 192
    iput-object v12, v1, La/ozd;->j:Ljava/lang/Throwable;

    .line 193
    .line 194
    iput v5, v1, La/ozd;->m:I

    .line 195
    .line 196
    iget-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->l:La/epc;

    .line 197
    .line 198
    if-eqz p1, :cond_c

    .line 199
    .line 200
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Ljava/lang/String;

    .line 205
    .line 206
    iget-object p1, p1, La/epc;->a:La/ts4;

    .line 207
    .line 208
    iget-object v5, p1, La/ts4;->m:La/zo4;

    .line 209
    .line 210
    invoke-virtual {v5}, La/zo4;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, La/ws4;

    .line 215
    .line 216
    iget-object p1, p1, La/ts4;->h:La/btt0;

    .line 217
    .line 218
    invoke-virtual {p1}, La/btt0;->a()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    const-string v6, "application/vnd.xenvelop+json"

    .line 223
    .line 224
    invoke-interface {v5, p1, v0, v6, v1}, La/ws4;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    if-ne p1, v2, :cond_9

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    :goto_3
    if-ne p1, v2, :cond_a

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_a
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    :goto_4
    if-ne p1, v2, :cond_b

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_b
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    :goto_5
    if-ne p1, v2, :cond_13

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_c
    const-string p1, "declineOperationV2UseCase"

    .line 247
    .line 248
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v12

    .line 252
    :cond_d
    new-instance p1, La/m460;

    .line 253
    .line 254
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    :cond_e
    iput-object v3, v1, La/ozd;->i:Landroid/app/Application;

    .line 259
    .line 260
    iput-object v12, v1, La/ozd;->j:Ljava/lang/Throwable;

    .line 261
    .line 262
    iput v6, v1, La/ozd;->m:I

    .line 263
    .line 264
    invoke-virtual {p0, v1}, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->e(La/zje;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    if-ne p0, v2, :cond_13

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_f
    const-string p1, "updateApiEndpointUseCase"

    .line 272
    .line 273
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v12

    .line 277
    :cond_10
    const-string p1, "mainDomainResolver"

    .line 278
    .line 279
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 283
    :goto_6
    invoke-virtual {v9}, Ljava/lang/Throwable;->printStackTrace()V

    .line 284
    .line 285
    .line 286
    iput-object v12, v1, La/ozd;->i:Landroid/app/Application;

    .line 287
    .line 288
    iput-object v9, v1, La/ozd;->j:Ljava/lang/Throwable;

    .line 289
    .line 290
    iput v4, v1, La/ozd;->m:I

    .line 291
    .line 292
    sget-object p1, La/tvk;->a:La/rwj;

    .line 293
    .line 294
    sget-object p1, La/ys10;->a:La/vs10;

    .line 295
    .line 296
    new-instance v8, La/ee0;

    .line 297
    .line 298
    const/16 v13, 0x19

    .line 299
    .line 300
    move-object v10, p0

    .line 301
    invoke-direct/range {v8 .. v13}, La/ee0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 302
    .line 303
    .line 304
    invoke-static {p1, v8, v1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    sget-object p1, La/wne;->a:La/wne;

    .line 309
    .line 310
    if-ne p0, p1, :cond_11

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    :goto_7
    if-ne p0, v2, :cond_12

    .line 316
    .line 317
    :goto_8
    return-object v2

    .line 318
    :cond_12
    move-object v0, v9

    .line 319
    :goto_9
    iget-object p0, v10, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->o:La/ojj;

    .line 320
    .line 321
    if-eqz p0, :cond_14

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    new-instance v1, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v2, "Authenticator_confirmation error: "

    .line 330
    .line 331
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-virtual {p0, p1, v0}, La/ojj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    :cond_13
    :goto_a
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    return-object p0

    .line 349
    :cond_14
    const-string p0, "logManager"

    .line 350
    .line 351
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v12
.end method

.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, La/lvq;

    .line 2
    .line 3
    new-instance v1, La/g760;

    .line 4
    .line 5
    iget-object p0, p0, La/og00;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v2, "confirm_auth"

    .line 8
    .line 9
    invoke-direct {v1, p0, v2}, La/g760;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const p0, 0x7f080bba

    .line 13
    .line 14
    .line 15
    iget-object v2, v1, La/g760;->s:Landroid/app/Notification;

    .line 16
    .line 17
    iput p0, v2, Landroid/app/Notification;->icon:I

    .line 18
    .line 19
    const/4 p0, -0x2

    .line 20
    iput p0, v1, La/g760;->j:I

    .line 21
    .line 22
    invoke-virtual {v1}, La/g760;->a()Landroid/app/Notification;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {v0, v2, p0, v1}, La/lvq;-><init>(ILandroid/app/Notification;I)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/nzd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/nzd;

    .line 7
    .line 8
    iget v1, v0, La/nzd;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/nzd;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nzd;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/nzd;-><init>(Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/nzd;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nzd;->k:I

    .line 30
    .line 31
    iget-object v3, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->r:La/n0o0;

    .line 32
    .line 33
    iget-object v4, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->u:La/n0o0;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v7, :cond_2

    .line 41
    .line 42
    if-ne v2, v6, :cond_1

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch La/zhi0; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catch_0
    move-exception p1

    .line 59
    goto :goto_4

    .line 60
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iget-object p1, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->m:La/nyb;

    .line 64
    .line 65
    if-eqz p1, :cond_7

    .line 66
    .line 67
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, Ljava/lang/String;

    .line 78
    .line 79
    iput v7, v0, La/nzd;->k:I

    .line 80
    .line 81
    iget-object p1, p1, La/nyb;->a:La/ts4;

    .line 82
    .line 83
    invoke-virtual {p1, v2, v8, v0}, La/ts4;->b(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v1, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    :goto_1
    check-cast p1, La/ap4;

    .line 91
    .line 92
    iget-object p1, p1, La/ap4;->e:Ljava/lang/String;
    :try_end_1
    .catch La/zhi0; {:try_start_1 .. :try_end_1} :catch_0

    .line 93
    .line 94
    iget-object p0, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->n:La/oif0;

    .line 95
    .line 96
    if-eqz p0, :cond_6

    .line 97
    .line 98
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Ljava/lang/String;

    .line 109
    .line 110
    iput v6, v0, La/nzd;->k:I

    .line 111
    .line 112
    invoke-virtual {p0, v2, v3, p1, v0}, La/oif0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v1, :cond_5

    .line 117
    .line 118
    :goto_2
    return-object v1

    .line 119
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_6
    const-string p0, "confirmOperationV2Scenario"

    .line 123
    .line 124
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v5

    .line 128
    :cond_7
    :try_start_2
    const-string p1, "getActiveOperationV2UseCase"

    .line 129
    .line 130
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v5
    :try_end_2
    .catch La/zhi0; {:try_start_2 .. :try_end_2} :catch_0

    .line 134
    :goto_4
    iget-object v0, p1, La/zhi0;->c:La/kuw;

    .line 135
    .line 136
    sget-object v1, La/i2o;->i1:La/i2o;

    .line 137
    .line 138
    if-ne v0, v1, :cond_9

    .line 139
    .line 140
    new-instance p1, La/zhi0;

    .line 141
    .line 142
    iget-object p0, p0, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;->i:La/ctf0;

    .line 143
    .line 144
    if-eqz p0, :cond_8

    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    new-array v1, v0, [Ljava/lang/Object;

    .line 148
    .line 149
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 150
    .line 151
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const v1, 0x7f1307ca

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-direct {p1, p0}, La/zhi0;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_8
    const-string p0, "resourceManager"

    .line 167
    .line 168
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v5

    .line 172
    :cond_9
    throw p1
.end method
