.class public final synthetic La/lg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eh0;


# direct methods
.method public synthetic constructor <init>(La/eh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lg0;->a:B

    iput-object p1, p0, La/lg0;->b:La/eh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lg0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/lg0;->b:La/eh0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    sget-object v1, La/eh0;->e0:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v1, La/fg0;->a:La/fg0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/pb0;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 32
    .line 33
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 43
    .line 44
    move-object v5, v3

    .line 45
    check-cast v5, La/hg0;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v4, v1, La/pb0;->a:La/ql5;

    .line 51
    .line 52
    const v19, 0x2ffff

    .line 53
    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    move-object/from16 v18, v4

    .line 70
    .line 71
    invoke-static/range {v5 .. v19}, La/hg0;->a(La/hg0;La/fs80;Ljava/util/List;La/a4x;La/a4x;Ljava/util/List;ZZZZZZLa/mdm;La/ql5;I)La/hg0;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_1
    move-object/from16 v1, p1

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Throwable;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, La/eh0;->U()V

    .line 92
    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_2
    move-object/from16 v1, p1

    .line 98
    .line 99
    check-cast v1, Ljava/lang/Throwable;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, La/eh0;->U()V

    .line 105
    .line 106
    .line 107
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_3
    move-object/from16 v1, p1

    .line 111
    .line 112
    check-cast v1, Ljava/lang/Throwable;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 118
    .line 119
    .line 120
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 121
    .line 122
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 123
    .line 124
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 132
    .line 133
    move-object v4, v2

    .line 134
    check-cast v4, La/hg0;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    sget-object v9, La/lak0;->c:La/lak0;

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    const v18, 0x3dfef

    .line 144
    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v6, 0x0

    .line 148
    const/4 v7, 0x0

    .line 149
    const/4 v8, 0x0

    .line 150
    const/4 v10, 0x0

    .line 151
    const/4 v11, 0x0

    .line 152
    const/4 v12, 0x0

    .line 153
    const/4 v13, 0x0

    .line 154
    const/4 v14, 0x0

    .line 155
    const/4 v15, 0x0

    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    invoke-static/range {v4 .. v18}, La/hg0;->a(La/hg0;La/fs80;Ljava/util/List;La/a4x;La/a4x;Ljava/util/List;ZZZZZZLa/mdm;La/ql5;I)La/hg0;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_1

    .line 167
    .line 168
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_4
    move-object/from16 v1, p1

    .line 172
    .line 173
    check-cast v1, Ljava/lang/Throwable;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 179
    .line 180
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 181
    .line 182
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 190
    .line 191
    move-object v4, v2

    .line 192
    check-cast v4, La/hg0;

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object v6, La/iun;->a:La/iun;

    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    const v18, 0x3fbfd

    .line 202
    .line 203
    .line 204
    const/4 v5, 0x0

    .line 205
    const/4 v7, 0x0

    .line 206
    const/4 v8, 0x0

    .line 207
    const/4 v9, 0x0

    .line 208
    const/4 v10, 0x0

    .line 209
    const/4 v11, 0x0

    .line 210
    const/4 v12, 0x0

    .line 211
    const/4 v13, 0x0

    .line 212
    const/4 v14, 0x0

    .line 213
    const/4 v15, 0x0

    .line 214
    const/16 v16, 0x0

    .line 215
    .line 216
    invoke-static/range {v4 .. v18}, La/hg0;->a(La/hg0;La/fs80;Ljava/util/List;La/a4x;La/a4x;Ljava/util/List;ZZZZZZLa/mdm;La/ql5;I)La/hg0;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_2

    .line 225
    .line 226
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_5
    move-object/from16 v1, p1

    .line 230
    .line 231
    check-cast v1, Ljava/lang/Throwable;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, La/eh0;->U()V

    .line 237
    .line 238
    .line 239
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

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
