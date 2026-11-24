.class public final La/q7x0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static volatile b:La/w4p0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/q7x0;->a:B

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    iget-byte p0, p0, La/q7x0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p1, p0

    .line 15
    :goto_0
    instance-of p2, p1, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    check-cast p1, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object p1, p0

    .line 23
    :goto_1
    if-nez p1, :cond_2

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_2
    instance-of p2, p1, La/af3;

    .line 28
    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    check-cast p1, La/af3;

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    move-object p1, p0

    .line 35
    :goto_2
    const-class p2, La/kdj;

    .line 36
    .line 37
    if-eqz p1, :cond_8

    .line 38
    .line 39
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, La/o5d0;

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, La/ze3;

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    move-object p1, p0

    .line 59
    :goto_3
    instance-of v0, p1, La/kdj;

    .line 60
    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    move-object p1, p0

    .line 64
    :cond_5
    check-cast p1, La/kdj;

    .line 65
    .line 66
    if-eqz p1, :cond_8

    .line 67
    .line 68
    iget-object p1, p1, La/kdj;->a:La/ls00;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object p2, p1, La/ls00;->c:La/sje;

    .line 74
    .line 75
    if-eqz p2, :cond_7

    .line 76
    .line 77
    invoke-static {p2}, La/d5c;->R(La/vne;)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    const/4 v0, 0x1

    .line 82
    if-ne p2, v0, :cond_7

    .line 83
    .line 84
    iget-object p2, p1, La/ls00;->c:La/sje;

    .line 85
    .line 86
    if-eqz p2, :cond_6

    .line 87
    .line 88
    invoke-static {p2, p0}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 89
    .line 90
    .line 91
    :cond_6
    iput-object p0, p1, La/ls00;->c:La/sje;

    .line 92
    .line 93
    iget-object p2, p1, La/ls00;->a:La/us00;

    .line 94
    .line 95
    invoke-static {p2}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v0, p2, La/cpv0;->b:La/wsd;

    .line 103
    .line 104
    iget-object v0, v0, La/wsd;->f:La/std;

    .line 105
    .line 106
    iget-object v1, p2, La/cpv0;->d:La/fpv0;

    .line 107
    .line 108
    iget-object v1, v1, La/fpv0;->a:La/xgi0;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v2, La/h5a;

    .line 114
    .line 115
    const-string v3, "LocalTimeDiffWorker"

    .line 116
    .line 117
    invoke-direct {v2, v3, p2}, La/h5a;-><init>(Ljava/lang/String;La/cpv0;)V

    .line 118
    .line 119
    .line 120
    const-string p2, "CancelWorkByName_LocalTimeDiffWorker"

    .line 121
    .line 122
    invoke-static {v0, p2, v1, v2}, La/r8x;->T(La/std;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)La/gqw0;

    .line 123
    .line 124
    .line 125
    :cond_7
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    sget-object v0, La/tvk;->a:La/rwj;

    .line 130
    .line 131
    sget-object v0, La/dvj;->c:La/dvj;

    .line 132
    .line 133
    invoke-static {p2, v0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-static {p2}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    iput-object p2, p1, La/ls00;->c:La/sje;

    .line 142
    .line 143
    new-instance v0, La/ks00;

    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    invoke-direct {v0, p1, p0, v1}, La/ks00;-><init>(La/ls00;La/yje;B)V

    .line 147
    .line 148
    .line 149
    const/4 p1, 0x3

    .line 150
    invoke-static {p2, p0, p0, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_8
    const-string p0, "Cannot create dependency "

    .line 155
    .line 156
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :goto_4
    return-void

    .line 164
    :pswitch_0
    const-string p0, "com.google.android.gms.phenotype.PACKAGE_NAME"

    .line 165
    .line 166
    invoke-virtual {p2, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-nez p0, :cond_9

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_9
    const-string p1, "../"

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    const-string p2, "PhUpdateBroadcastRecv"

    .line 180
    .line 181
    if-nez p1, :cond_c

    .line 182
    .line 183
    const-string p1, "/.."

    .line 184
    .line 185
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_a

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_a
    sget-object p1, La/q7x0;->b:La/w4p0;

    .line 193
    .line 194
    if-nez p1, :cond_b

    .line 195
    .line 196
    const-string p0, "No callback registered for P/H UPDATE broadcast. Exiting."

    .line 197
    .line 198
    invoke-static {p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_b
    iget-object p1, p1, La/w4p0;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p1, La/zas0;

    .line 205
    .line 206
    iget-object p1, p1, La/zas0;->b:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 209
    .line 210
    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    check-cast p0, La/p5x0;

    .line 215
    .line 216
    if-eqz p0, :cond_d

    .line 217
    .line 218
    iget-object p0, p0, La/p5x0;->a:La/l6x0;

    .line 219
    .line 220
    invoke-virtual {p0}, La/l6x0;->b()V

    .line 221
    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_c
    :goto_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    new-instance v0, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    add-int/lit8 p1, p1, 0x44

    .line 231
    .line 232
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 233
    .line 234
    .line 235
    const-string p1, "Got an invalid config package for P/H that includes \'..\': "

    .line 236
    .line 237
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string p0, ". Exiting."

    .line 244
    .line 245
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-static {p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    :cond_d
    :goto_6
    return-void

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
