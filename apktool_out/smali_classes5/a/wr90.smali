.class public final synthetic La/wr90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xr90;


# direct methods
.method public synthetic constructor <init>(La/xr90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wr90;->a:B

    iput-object p1, p0, La/wr90;->b:La/xr90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wr90;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v0, v0, La/wr90;->b:La/xr90;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, La/xr90;->e:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    new-instance v3, La/sr90;

    .line 34
    .line 35
    iget-object v0, v0, La/xr90;->c:La/n0o0;

    .line 36
    .line 37
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {v3, v1, v0}, La/sr90;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-object v3

    .line 47
    :pswitch_0
    move-object/from16 v1, p1

    .line 48
    .line 49
    check-cast v1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iget-object v4, v0, La/xr90;->d:La/n0o0;

    .line 56
    .line 57
    iget-object v5, v0, La/xr90;->a:La/ctf0;

    .line 58
    .line 59
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    if-eqz v1, :cond_2

    .line 73
    .line 74
    new-instance v3, La/pr90;

    .line 75
    .line 76
    iget-object v0, v0, La/xr90;->h:La/n0o0;

    .line 77
    .line 78
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, La/fee;

    .line 83
    .line 84
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/c6q0;

    .line 89
    .line 90
    new-instance v6, La/wul;

    .line 91
    .line 92
    sget-object v7, La/qul;->e:La/qul;

    .line 93
    .line 94
    sget-object v8, La/oe9;->a:La/oe9;

    .line 95
    .line 96
    new-instance v9, La/ue9;

    .line 97
    .line 98
    new-array v1, v2, [Ljava/lang/Object;

    .line 99
    .line 100
    iget-object v4, v5, La/ctf0;->b:La/lsm0;

    .line 101
    .line 102
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const v2, 0x7f130057

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-direct {v9, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x0

    .line 118
    const/4 v10, 0x1

    .line 119
    invoke-direct/range {v6 .. v12}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 120
    .line 121
    .line 122
    invoke-direct {v3, v0, v6}, La/pr90;-><init>(La/c6q0;La/wul;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    new-instance v3, La/qr90;

    .line 127
    .line 128
    new-array v0, v2, [Ljava/lang/Object;

    .line 129
    .line 130
    iget-object v1, v5, La/ctf0;->b:La/lsm0;

    .line 131
    .line 132
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const v2, 0x7f130059

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-direct {v3, v0}, La/qr90;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :goto_0
    return-object v3

    .line 147
    :pswitch_1
    iget-object v0, v0, La/xr90;->a:La/ctf0;

    .line 148
    .line 149
    move-object/from16 v1, p1

    .line 150
    .line 151
    check-cast v1, La/zqp;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object v5, v1, La/zqp;->a:Ljava/lang/String;

    .line 157
    .line 158
    iget-boolean v4, v1, La/zqp;->b:Z

    .line 159
    .line 160
    if-eqz v4, :cond_3

    .line 161
    .line 162
    new-instance v4, La/s7q0;

    .line 163
    .line 164
    new-array v6, v2, [Ljava/lang/Object;

    .line 165
    .line 166
    iget-object v7, v0, La/ctf0;->b:La/lsm0;

    .line 167
    .line 168
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    const v8, 0x7f13005a

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-direct {v4, v6}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :goto_1
    move-object v8, v4

    .line 183
    goto :goto_2

    .line 184
    :cond_3
    new-instance v4, La/s7q0;

    .line 185
    .line 186
    const-string v6, ""

    .line 187
    .line 188
    invoke-direct {v4, v6}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :goto_2
    new-instance v11, La/y5q0;

    .line 193
    .line 194
    new-instance v4, La/ujj;

    .line 195
    .line 196
    const/4 v6, 0x1

    .line 197
    invoke-direct {v4, v6}, La/ujj;-><init>(B)V

    .line 198
    .line 199
    .line 200
    const/4 v6, 0x4

    .line 201
    const/4 v7, 0x3

    .line 202
    invoke-direct {v11, v7, v4, v3, v6}, La/y5q0;-><init>(ILa/vuu0;La/oie;I)V

    .line 203
    .line 204
    .line 205
    iget-boolean v10, v1, La/zqp;->b:Z

    .line 206
    .line 207
    new-array v1, v2, [Ljava/lang/Object;

    .line 208
    .line 209
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 210
    .line 211
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    const v2, 0x7f13047f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    new-instance v4, La/c6q0;

    .line 223
    .line 224
    const/16 v16, 0x0

    .line 225
    .line 226
    const v17, 0x3fd00

    .line 227
    .line 228
    .line 229
    sget-object v6, La/e6q0;->a:La/e6q0;

    .line 230
    .line 231
    sget-object v7, La/o6q0;->a:La/o6q0;

    .line 232
    .line 233
    const/4 v9, 0x1

    .line 234
    const/4 v13, 0x0

    .line 235
    const/4 v14, 0x0

    .line 236
    const/4 v15, 0x0

    .line 237
    invoke-direct/range {v4 .. v17}, La/c6q0;-><init>(Ljava/lang/String;La/f6q0;La/p6q0;La/t7q0;ZZLa/b6q0;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    return-object v4

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
