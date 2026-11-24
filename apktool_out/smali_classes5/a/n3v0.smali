.class public final La/n3v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o3v0;


# direct methods
.method public synthetic constructor <init>(La/o3v0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n3v0;->a:B

    iput-object p1, p0, La/n3v0;->b:La/o3v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/n3v0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/n3v0;->b:La/o3v0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 15
    .line 16
    iget-object p0, p0, La/o3v0;->a:La/vby;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 22
    .line 23
    sget-object v2, La/mv70;->Companion:La/lv70;

    .line 24
    .line 25
    invoke-virtual {v2}, La/lv70;->serializer()La/jiy;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/jiy;

    .line 34
    .line 35
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/wxw;

    .line 40
    .line 41
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 46
    .line 47
    new-instance p1, La/g0g0;

    .line 48
    .line 49
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object p0, p1

    .line 53
    :goto_0
    nop

    .line 54
    instance-of p1, p0, La/g0g0;

    .line 55
    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    move-object p0, v1

    .line 59
    :cond_0
    if-eqz p0, :cond_1

    .line 60
    .line 61
    check-cast p0, La/mv70;

    .line 62
    .line 63
    invoke-static {p0}, La/u7x;->I(La/mv70;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :cond_1
    return-object v1

    .line 68
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 74
    .line 75
    iget-object p0, p0, La/o3v0;->a:La/vby;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 81
    .line 82
    sget-object v2, La/sw70;->Companion:La/rw70;

    .line 83
    .line 84
    invoke-virtual {v2}, La/rw70;->serializer()La/jiy;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/jiy;

    .line 93
    .line 94
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, La/wxw;

    .line 99
    .line 100
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :catchall_1
    move-exception p0

    .line 104
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 105
    .line 106
    new-instance p1, La/g0g0;

    .line 107
    .line 108
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    move-object p0, p1

    .line 112
    :goto_1
    nop

    .line 113
    instance-of p1, p0, La/g0g0;

    .line 114
    .line 115
    if-eqz p1, :cond_2

    .line 116
    .line 117
    move-object p0, v1

    .line 118
    :cond_2
    if-eqz p0, :cond_3

    .line 119
    .line 120
    check-cast p0, La/sw70;

    .line 121
    .line 122
    invoke-static {p0}, La/h8x;->S(La/sw70;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    :cond_3
    return-object v1

    .line 127
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 133
    .line 134
    iget-object p0, p0, La/o3v0;->a:La/vby;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 140
    .line 141
    sget-object v2, La/ew70;->Companion:La/cw70;

    .line 142
    .line 143
    invoke-virtual {v2}, La/cw70;->serializer()La/jiy;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, La/jiy;

    .line 152
    .line 153
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    check-cast p0, La/wxw;

    .line 158
    .line 159
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :catchall_2
    move-exception p0

    .line 163
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 164
    .line 165
    new-instance p1, La/g0g0;

    .line 166
    .line 167
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    move-object p0, p1

    .line 171
    :goto_2
    nop

    .line 172
    instance-of p1, p0, La/g0g0;

    .line 173
    .line 174
    if-eqz p1, :cond_4

    .line 175
    .line 176
    move-object p0, v1

    .line 177
    :cond_4
    if-eqz p0, :cond_5

    .line 178
    .line 179
    check-cast p0, La/ew70;

    .line 180
    .line 181
    invoke-static {p0}, La/a8k0;->K(La/ew70;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    :cond_5
    return-object v1

    .line 186
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 192
    .line 193
    iget-object p0, p0, La/o3v0;->a:La/vby;

    .line 194
    .line 195
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    sget-object v0, La/wxw;->Companion:La/uxw;

    .line 199
    .line 200
    sget-object v2, La/jv70;->Companion:La/iv70;

    .line 201
    .line 202
    invoke-virtual {v2}, La/iv70;->serializer()La/jiy;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v0, v2}, La/uxw;->serializer(La/jiy;)La/jiy;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, La/jiy;

    .line 211
    .line 212
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, La/wxw;

    .line 217
    .line 218
    iget-object p0, p0, La/wxw;->b:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :catchall_3
    move-exception p0

    .line 222
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 223
    .line 224
    new-instance p1, La/g0g0;

    .line 225
    .line 226
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    move-object p0, p1

    .line 230
    :goto_3
    nop

    .line 231
    instance-of p1, p0, La/g0g0;

    .line 232
    .line 233
    if-eqz p1, :cond_6

    .line 234
    .line 235
    move-object p0, v1

    .line 236
    :cond_6
    if-eqz p0, :cond_7

    .line 237
    .line 238
    check-cast p0, La/jv70;

    .line 239
    .line 240
    invoke-static {p0}, La/r7x;->I(La/jv70;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    :cond_7
    return-object v1

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
