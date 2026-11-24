.class public final synthetic La/x970;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ca70;


# direct methods
.method public synthetic constructor <init>(La/ca70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x970;->a:B

    iput-object p1, p0, La/x970;->b:La/ca70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/x970;->a:B

    .line 2
    .line 3
    const-string v1, "OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY"

    .line 4
    .line 5
    const-string v2, "OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY"

    .line 6
    .line 7
    iget-object p0, p0, La/x970;->b:La/ca70;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/ca70;->U1:La/htz;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, "DEMO_UNAUTHORIZED_DIALOG"

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, La/l770;->a:La/l770;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p1, La/m770;->a:La/m770;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_0
    return-void

    .line 58
    :pswitch_0
    sget-object v0, La/ca70;->U1:La/htz;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-string v0, "DEMO_DISABLE_DIALOG"

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-nez p2, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const-string p2, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_RESULT_DISMISS_KEY"

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget-object p1, La/i770;->a:La/i770;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    sget-object p1, La/j770;->a:La/j770;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    return-void

    .line 100
    :pswitch_1
    sget-object v0, La/ca70;->U1:La/htz;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const-string v0, "DEMO_UNAVAILABLE_DIALOG"

    .line 106
    .line 107
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-nez p2, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_6

    .line 119
    .line 120
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    sget-object p1, La/o770;->a:La/o770;

    .line 125
    .line 126
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_7

    .line 135
    .line 136
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    sget-object p1, La/p770;->a:La/p770;

    .line 141
    .line 142
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    const-string p2, "OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_EXIT_KEY"

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_8

    .line 153
    .line 154
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    sget-object p1, La/n770;->a:La/n770;

    .line 159
    .line 160
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    :goto_2
    return-void

    .line 164
    :pswitch_2
    sget-object v0, La/ca70;->U1:La/htz;

    .line 165
    .line 166
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    const-string v0, "UNFINISHED_GAME_DIALOG"

    .line 170
    .line 171
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-nez p2, :cond_9

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_9
    const-string p2, "GameIsNotFinishedDialog.RESULT_KEY_CONTINUE"

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_a

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    new-instance p2, La/q770;

    .line 195
    .line 196
    invoke-direct {p2, p1}, La/q770;-><init>(Z)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_a
    const-string p2, "GameIsNotFinishedDialog.RESULT_KEY_EXIT"

    .line 204
    .line 205
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_b

    .line 210
    .line 211
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    new-instance p2, La/r770;

    .line 220
    .line 221
    invoke-direct {p2, p1}, La/r770;-><init>(Z)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :cond_b
    :goto_3
    return-void

    .line 228
    :pswitch_3
    sget-object v0, La/ca70;->U1:La/htz;

    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    const-string v0, "BALANCE_SELECTOR"

    .line 234
    .line 235
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    if-nez p2, :cond_c

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_c
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 243
    .line 244
    const/16 v0, 0x21

    .line 245
    .line 246
    if-lt p2, v0, :cond_d

    .line 247
    .line 248
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    goto :goto_4

    .line 253
    :cond_d
    const-string p2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 254
    .line 255
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    instance-of p2, p1, La/ql5;

    .line 260
    .line 261
    if-nez p2, :cond_e

    .line 262
    .line 263
    const/4 p1, 0x0

    .line 264
    :cond_e
    check-cast p1, La/ql5;

    .line 265
    .line 266
    :goto_4
    check-cast p1, La/ql5;

    .line 267
    .line 268
    if-eqz p1, :cond_f

    .line 269
    .line 270
    invoke-virtual {p0}, La/ca70;->H0()La/k3t0;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    new-instance p2, La/o670;

    .line 275
    .line 276
    invoke-direct {p2, p1}, La/o670;-><init>(La/ql5;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_f
    :goto_5
    return-void

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
