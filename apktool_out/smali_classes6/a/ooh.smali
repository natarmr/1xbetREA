.class public final synthetic La/ooh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/sqh;ZI)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/ooh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ooh;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/ooh;->b:Z

    iput p3, p0, La/ooh;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZIB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/ooh;->a:B

    iput-object p1, p0, La/ooh;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/ooh;->b:Z

    iput p3, p0, La/ooh;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLa/jts0;I)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    iput-byte v0, p0, La/ooh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/ooh;->b:Z

    iput-object p2, p0, La/ooh;->d:Ljava/lang/Object;

    iput p3, p0, La/ooh;->c:I

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 4
    const/4 v0, 0x4

    iput-byte v0, p0, La/ooh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/ooh;->b:Z

    iput-object p2, p0, La/ooh;->d:Ljava/lang/Object;

    iput p3, p0, La/ooh;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/ooh;->a:B

    .line 2
    .line 3
    iget v1, p0, La/ooh;->c:I

    .line 4
    .line 5
    iget-object v2, p0, La/ooh;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-boolean p0, p0, La/ooh;->b:Z

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, La/jts0;

    .line 13
    .line 14
    check-cast p1, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    or-int/lit8 p2, v1, 0x1

    .line 22
    .line 23
    invoke-static {p2}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-static {p0, v2, p1, p2}, La/vbw0;->M(ZLa/jts0;La/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast v2, La/gxo0;

    .line 34
    .line 35
    check-cast p1, La/fet;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    or-int/lit8 p2, v1, 0x1

    .line 43
    .line 44
    invoke-static {p2}, La/x8x;->L(I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-static {v2, p0, p1, p2}, La/jtm0;->e(La/gxo0;ZLa/fet;I)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast v2, La/ydm0;

    .line 55
    .line 56
    check-cast p1, La/fet;

    .line 57
    .line 58
    check-cast p2, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    or-int/lit8 p2, v1, 0x1

    .line 64
    .line 65
    invoke-static {p2}, La/x8x;->L(I)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-static {v2, p0, p1, p2}, La/hfm0;->i(La/ydm0;ZLa/fet;I)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_2
    check-cast v2, La/zdm0;

    .line 76
    .line 77
    check-cast p1, La/fet;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    or-int/lit8 p2, v1, 0x1

    .line 85
    .line 86
    invoke-static {p2}, La/x8x;->L(I)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    invoke-static {v2, p0, p1, p2}, La/zcm0;->a(La/zdm0;ZLa/fet;I)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_3
    check-cast v2, La/gfa0;

    .line 97
    .line 98
    check-cast p1, La/fet;

    .line 99
    .line 100
    check-cast p2, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    or-int/lit8 p2, v1, 0x1

    .line 106
    .line 107
    invoke-static {p2}, La/x8x;->L(I)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    invoke-static {v2, p0, p1, p2}, La/vvw;->g(La/gfa0;ZLa/fet;I)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_4
    check-cast v2, La/vdm0;

    .line 118
    .line 119
    check-cast p1, La/fet;

    .line 120
    .line 121
    check-cast p2, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    or-int/lit8 p2, v1, 0x1

    .line 127
    .line 128
    invoke-static {p2}, La/x8x;->L(I)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    invoke-static {v2, p0, p1, p2}, La/yyw;->k(La/vdm0;ZLa/fet;I)V

    .line 133
    .line 134
    .line 135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    check-cast p1, La/fet;

    .line 141
    .line 142
    check-cast p2, Ljava/lang/Integer;

    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    or-int/lit8 p2, v1, 0x1

    .line 148
    .line 149
    invoke-static {p2}, La/x8x;->L(I)I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    invoke-static {p0, v2, p1, p2}, La/y9a;->B(ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_6
    check-cast v2, La/v5m;

    .line 160
    .line 161
    check-cast p1, La/fet;

    .line 162
    .line 163
    check-cast p2, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    or-int/lit8 p2, v1, 0x1

    .line 169
    .line 170
    invoke-static {p2}, La/x8x;->L(I)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-static {v2, p0, p1, p2}, La/d6m;->d(La/v5m;ZLa/fet;I)V

    .line 175
    .line 176
    .line 177
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_7
    check-cast v2, La/y5m;

    .line 181
    .line 182
    check-cast p1, La/fet;

    .line 183
    .line 184
    check-cast p2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    or-int/lit8 p2, v1, 0x1

    .line 190
    .line 191
    invoke-static {p2}, La/x8x;->L(I)I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    invoke-static {v2, p0, p1, p2}, La/gkb;->C(La/y5m;ZLa/fet;I)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_8
    check-cast v2, La/sqh;

    .line 202
    .line 203
    check-cast p1, La/fet;

    .line 204
    .line 205
    check-cast p2, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    or-int/lit8 p2, v1, 0x1

    .line 211
    .line 212
    invoke-static {p2}, La/x8x;->L(I)I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    invoke-static {v2, p0, p1, p2}, La/jeb;->g(La/sqh;ZLa/fet;I)V

    .line 217
    .line 218
    .line 219
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_9
    check-cast v2, La/c280;

    .line 223
    .line 224
    check-cast p1, La/fet;

    .line 225
    .line 226
    check-cast p2, Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    or-int/lit8 p2, v1, 0x1

    .line 232
    .line 233
    invoke-static {p2}, La/x8x;->L(I)I

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    invoke-static {v2, p0, p1, p2}, La/u1c;->o(La/c280;ZLa/fet;I)V

    .line 238
    .line 239
    .line 240
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
