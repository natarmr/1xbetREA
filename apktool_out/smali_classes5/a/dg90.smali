.class public final synthetic La/dg90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/xdr;

.field public final synthetic e:La/ugd;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/pz40;La/xdr;La/ugd;IB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/dg90;->a:B

    iput-object p1, p0, La/dg90;->b:La/mm40;

    iput-object p2, p0, La/dg90;->c:La/pz40;

    iput-object p3, p0, La/dg90;->d:La/xdr;

    iput-object p4, p0, La/dg90;->e:La/ugd;

    iput p5, p0, La/dg90;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/dg90;->a:B

    .line 2
    .line 3
    iget v1, p0, La/dg90;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v6, p1

    .line 9
    check-cast v6, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    iget-object v2, p0, La/dg90;->b:La/mm40;

    .line 23
    .line 24
    iget-object v3, p0, La/dg90;->c:La/pz40;

    .line 25
    .line 26
    iget-object v4, p0, La/dg90;->d:La/xdr;

    .line 27
    .line 28
    iget-object v5, p0, La/dg90;->e:La/ugd;

    .line 29
    .line 30
    invoke-static/range {v2 .. v7}, La/q5x;->r(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    move-object v4, p1

    .line 37
    check-cast v4, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    or-int/lit8 p1, v1, 0x1

    .line 45
    .line 46
    invoke-static {p1}, La/x8x;->L(I)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    iget-object v0, p0, La/dg90;->b:La/mm40;

    .line 51
    .line 52
    iget-object v1, p0, La/dg90;->c:La/pz40;

    .line 53
    .line 54
    iget-object v2, p0, La/dg90;->d:La/xdr;

    .line 55
    .line 56
    iget-object v3, p0, La/dg90;->e:La/ugd;

    .line 57
    .line 58
    invoke-static/range {v0 .. v5}, La/n6x;->d(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_1
    move-object v4, p1

    .line 65
    check-cast v4, La/fet;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    or-int/lit8 p1, v1, 0x1

    .line 73
    .line 74
    invoke-static {p1}, La/x8x;->L(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    iget-object v0, p0, La/dg90;->b:La/mm40;

    .line 79
    .line 80
    iget-object v1, p0, La/dg90;->c:La/pz40;

    .line 81
    .line 82
    iget-object v2, p0, La/dg90;->d:La/xdr;

    .line 83
    .line 84
    iget-object v3, p0, La/dg90;->e:La/ugd;

    .line 85
    .line 86
    invoke-static/range {v0 .. v5}, La/d7x;->f(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_2
    move-object v4, p1

    .line 93
    check-cast v4, La/fet;

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    or-int/lit8 p1, v1, 0x1

    .line 101
    .line 102
    invoke-static {p1}, La/x8x;->L(I)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    iget-object v0, p0, La/dg90;->b:La/mm40;

    .line 107
    .line 108
    iget-object v1, p0, La/dg90;->c:La/pz40;

    .line 109
    .line 110
    iget-object v2, p0, La/dg90;->d:La/xdr;

    .line 111
    .line 112
    iget-object v3, p0, La/dg90;->e:La/ugd;

    .line 113
    .line 114
    invoke-static/range {v0 .. v5}, La/b5x;->m(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_3
    move-object v4, p1

    .line 121
    check-cast v4, La/fet;

    .line 122
    .line 123
    check-cast p2, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    or-int/lit8 p1, v1, 0x1

    .line 129
    .line 130
    invoke-static {p1}, La/x8x;->L(I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    iget-object v0, p0, La/dg90;->b:La/mm40;

    .line 135
    .line 136
    iget-object v1, p0, La/dg90;->c:La/pz40;

    .line 137
    .line 138
    iget-object v2, p0, La/dg90;->d:La/xdr;

    .line 139
    .line 140
    iget-object v3, p0, La/dg90;->e:La/ugd;

    .line 141
    .line 142
    invoke-static/range {v0 .. v5}, La/d7x;->f(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 143
    .line 144
    .line 145
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_4
    move-object v4, p1

    .line 149
    check-cast v4, La/fet;

    .line 150
    .line 151
    check-cast p2, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    or-int/lit8 p1, v1, 0x1

    .line 157
    .line 158
    invoke-static {p1}, La/x8x;->L(I)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    iget-object v0, p0, La/dg90;->b:La/mm40;

    .line 163
    .line 164
    iget-object v1, p0, La/dg90;->c:La/pz40;

    .line 165
    .line 166
    iget-object v2, p0, La/dg90;->d:La/xdr;

    .line 167
    .line 168
    iget-object v3, p0, La/dg90;->e:La/ugd;

    .line 169
    .line 170
    invoke-static/range {v0 .. v5}, La/n6x;->d(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 171
    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_5
    move-object v4, p1

    .line 177
    check-cast v4, La/fet;

    .line 178
    .line 179
    check-cast p2, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    or-int/lit8 p1, v1, 0x1

    .line 185
    .line 186
    invoke-static {p1}, La/x8x;->L(I)I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    iget-object v0, p0, La/dg90;->b:La/mm40;

    .line 191
    .line 192
    iget-object v1, p0, La/dg90;->c:La/pz40;

    .line 193
    .line 194
    iget-object v2, p0, La/dg90;->d:La/xdr;

    .line 195
    .line 196
    iget-object v3, p0, La/dg90;->e:La/ugd;

    .line 197
    .line 198
    invoke-static/range {v0 .. v5}, La/q5x;->r(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 199
    .line 200
    .line 201
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_6
    move-object v4, p1

    .line 205
    check-cast v4, La/fet;

    .line 206
    .line 207
    check-cast p2, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    or-int/lit8 p1, v1, 0x1

    .line 213
    .line 214
    invoke-static {p1}, La/x8x;->L(I)I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    iget-object v0, p0, La/dg90;->b:La/mm40;

    .line 219
    .line 220
    iget-object v1, p0, La/dg90;->c:La/pz40;

    .line 221
    .line 222
    iget-object v2, p0, La/dg90;->d:La/xdr;

    .line 223
    .line 224
    iget-object v3, p0, La/dg90;->e:La/ugd;

    .line 225
    .line 226
    invoke-static/range {v0 .. v5}, La/b5x;->m(La/mm40;La/pz40;La/xdr;La/ugd;La/fet;I)V

    .line 227
    .line 228
    .line 229
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object p0

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
