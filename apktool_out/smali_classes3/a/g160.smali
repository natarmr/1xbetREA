.class public final synthetic La/g160;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/mm40;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/g160;->a:B

    iput-object p1, p0, La/g160;->b:La/a4x;

    iput-object p2, p0, La/g160;->c:La/mm40;

    iput-object p3, p0, La/g160;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/g160;->a:B

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const v2, 0x2fd4df92

    .line 6
    .line 7
    .line 8
    const v3, -0x4297e015

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x6

    .line 12
    iget-object v5, p0, La/g160;->d:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iget-object v6, p0, La/g160;->c:La/mm40;

    .line 15
    .line 16
    iget-object p0, p0, La/g160;->b:La/a4x;

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast p1, La/hcz;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, La/jfa0;

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-direct {v0, v1}, La/jfa0;-><init>(B)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    new-instance v3, La/zu90;

    .line 39
    .line 40
    invoke-direct {v3, v1, v0, p0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v0, La/a580;

    .line 44
    .line 45
    const/16 v1, 0x19

    .line 46
    .line 47
    invoke-direct {v0, p0, v1}, La/a580;-><init>(Ljava/util/List;B)V

    .line 48
    .line 49
    .line 50
    new-instance v1, La/kp0;

    .line 51
    .line 52
    invoke-direct {v1, p0, v6, v5, v4}, La/kp0;-><init>(Ljava/util/List;La/mm40;Lkotlin/jvm/functions/Function1;B)V

    .line 53
    .line 54
    .line 55
    new-instance p0, La/ugd;

    .line 56
    .line 57
    const v4, 0x799532c4

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v4, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2, v3, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    move-object v0, p1

    .line 70
    check-cast v0, La/i8z;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance p1, La/r580;

    .line 76
    .line 77
    invoke-direct {p1, v7}, La/r580;-><init>(B)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    new-instance v2, La/m160;

    .line 85
    .line 86
    const/16 v4, 0xd

    .line 87
    .line 88
    invoke-direct {v2, p1, p0, v4}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    new-instance v4, La/a580;

    .line 92
    .line 93
    invoke-direct {v4, p0, v7}, La/a580;-><init>(Ljava/util/List;B)V

    .line 94
    .line 95
    .line 96
    new-instance p1, La/kp0;

    .line 97
    .line 98
    const/4 v8, 0x5

    .line 99
    invoke-direct {p1, p0, v6, v5, v8}, La/kp0;-><init>(Ljava/util/List;La/mm40;Lkotlin/jvm/functions/Function1;B)V

    .line 100
    .line 101
    .line 102
    new-instance v5, La/ugd;

    .line 103
    .line 104
    invoke-direct {v5, v3, v7, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    invoke-virtual/range {v0 .. v5}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_1
    check-cast p1, La/hcz;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v0, La/mb50;

    .line 120
    .line 121
    const/16 v1, 0xf

    .line 122
    .line 123
    invoke-direct {v0, v1}, La/mb50;-><init>(B)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    new-instance v3, La/m160;

    .line 131
    .line 132
    const/4 v4, 0x3

    .line 133
    invoke-direct {v3, v0, p0, v4}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    new-instance v0, La/ap30;

    .line 137
    .line 138
    const/16 v8, 0x1b

    .line 139
    .line 140
    invoke-direct {v0, p0, v8}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 141
    .line 142
    .line 143
    new-instance v8, La/kp0;

    .line 144
    .line 145
    invoke-direct {v8, p0, v6, v5, v4}, La/kp0;-><init>(Ljava/util/List;La/mm40;Lkotlin/jvm/functions/Function1;B)V

    .line 146
    .line 147
    .line 148
    new-instance p0, La/ugd;

    .line 149
    .line 150
    invoke-direct {p0, v2, v7, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v1, v3, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_2
    move-object v0, p1

    .line 160
    check-cast v0, La/i8z;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance p1, La/mb50;

    .line 166
    .line 167
    const/16 v2, 0x11

    .line 168
    .line 169
    invoke-direct {p1, v2}, La/mb50;-><init>(B)V

    .line 170
    .line 171
    .line 172
    move v8, v1

    .line 173
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    new-instance v2, La/ygy;

    .line 178
    .line 179
    invoke-direct {v2, p1, p0, v8}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 180
    .line 181
    .line 182
    new-instance v4, La/ap30;

    .line 183
    .line 184
    const/16 p1, 0x17

    .line 185
    .line 186
    invoke-direct {v4, p0, p1}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 187
    .line 188
    .line 189
    new-instance p1, La/kp0;

    .line 190
    .line 191
    const/4 v8, 0x2

    .line 192
    invoke-direct {p1, p0, v6, v5, v8}, La/kp0;-><init>(Ljava/util/List;La/mm40;Lkotlin/jvm/functions/Function1;B)V

    .line 193
    .line 194
    .line 195
    new-instance v5, La/ugd;

    .line 196
    .line 197
    invoke-direct {v5, v3, v7, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    const/4 v3, 0x0

    .line 201
    invoke-virtual/range {v0 .. v5}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 202
    .line 203
    .line 204
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_3
    move v8, v1

    .line 208
    check-cast p1, La/hcz;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance v0, La/mb50;

    .line 214
    .line 215
    const/16 v1, 0xe

    .line 216
    .line 217
    invoke-direct {v0, v1}, La/mb50;-><init>(B)V

    .line 218
    .line 219
    .line 220
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    new-instance v3, La/m160;

    .line 225
    .line 226
    invoke-direct {v3, v0, p0, v4}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 227
    .line 228
    .line 229
    new-instance v0, La/ap30;

    .line 230
    .line 231
    invoke-direct {v0, p0, v8}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 232
    .line 233
    .line 234
    new-instance v4, La/kp0;

    .line 235
    .line 236
    const/4 v8, 0x4

    .line 237
    invoke-direct {v4, p0, v6, v5, v8}, La/kp0;-><init>(Ljava/util/List;La/mm40;Lkotlin/jvm/functions/Function1;B)V

    .line 238
    .line 239
    .line 240
    new-instance p0, La/ugd;

    .line 241
    .line 242
    invoke-direct {p0, v2, v7, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v1, v3, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 246
    .line 247
    .line 248
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
