.class public final La/ua4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:La/pz40;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/pz40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ua4;->i:B

    iput-object p1, p0, La/ua4;->j:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/ua4;->k:La/pz40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/ua4;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/ua4;->k:La/pz40;

    .line 4
    .line 5
    iget-object p0, p0, La/ua4;->j:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/ua4;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/ua4;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/ua4;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/ua4;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/ua4;

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/ua4;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_2
    new-instance p1, La/ua4;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-direct {p1, p0, v0, p2, v1}, La/ua4;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_3
    new-instance p1, La/ua4;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-direct {p1, p0, v0, p2, v1}, La/ua4;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_4
    new-instance p1, La/ua4;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {p1, p0, v0, p2, v1}, La/ua4;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;La/yje;B)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_5
    new-instance p1, La/ua4;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {p1, p0, v0, p2, v1}, La/ua4;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ua4;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ua4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ua4;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ua4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ua4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ua4;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ua4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ua4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ua4;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ua4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/ua4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/ua4;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/ua4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/ua4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/ua4;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/ua4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/ua4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/ua4;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/ua4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, La/ua4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/ua4;

    .line 93
    .line 94
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/ua4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/ua4;->i:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    const-string v4, ""

    .line 7
    .line 8
    iget-object v5, p0, La/ua4;->j:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iget-object p0, p0, La/ua4;->k:La/pz40;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    new-instance p1, La/a8q0;

    .line 33
    .line 34
    invoke-direct {p1, v4, v2, v3, v1}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 49
    .line 50
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    new-instance p1, La/a8q0;

    .line 66
    .line 67
    invoke-direct {p1, v4, v2, v3, v1}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 82
    .line 83
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    new-instance p1, La/a8q0;

    .line 99
    .line 100
    invoke-direct {p1, v4, v2, v3, v1}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 115
    .line 116
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_3

    .line 130
    .line 131
    new-instance p1, La/a8q0;

    .line 132
    .line 133
    invoke-direct {p1, v4, v2, v3, v1}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 148
    .line 149
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    sget-object p1, La/sw6;->a:La/rw90;

    .line 153
    .line 154
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_5

    .line 165
    .line 166
    if-eqz v5, :cond_4

    .line 167
    .line 168
    new-instance p1, La/a8q0;

    .line 169
    .line 170
    invoke-direct {p1, v4, v2, v3, v1}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    :cond_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 185
    .line 186
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_7

    .line 200
    .line 201
    if-eqz v5, :cond_6

    .line 202
    .line 203
    new-instance p1, La/a8q0;

    .line 204
    .line 205
    invoke-direct {p1, v4, v2, v3, v1}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    :cond_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 220
    .line 221
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    check-cast p0, La/ob4;

    .line 229
    .line 230
    iget-boolean p0, p0, La/ob4;->a:Z

    .line 231
    .line 232
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-interface {v5, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
