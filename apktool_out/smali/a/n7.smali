.class public final synthetic La/n7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/pu90;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n7;->a:B

    iput-object p1, p0, La/n7;->b:La/pu90;

    iput p2, p0, La/n7;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/n7;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, La/n7;->c:I

    .line 6
    .line 7
    iget-object p0, p0, La/n7;->b:La/pu90;

    .line 8
    .line 9
    check-cast p1, La/ou90;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    neg-int v0, v3

    .line 18
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget v0, p0, La/pu90;->b:I

    .line 28
    .line 29
    sub-int/2addr v3, v0

    .line 30
    div-int/lit8 v3, v3, 0x2

    .line 31
    .line 32
    invoke-virtual {p1, p0, v2, v3, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    neg-int v0, v3

    .line 42
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p0, v2, v3, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget v0, p0, La/pu90;->b:I

    .line 61
    .line 62
    sub-int/2addr v3, v0

    .line 63
    div-int/lit8 v3, v3, 0x2

    .line 64
    .line 65
    invoke-virtual {p1, p0, v2, v3, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p0, v3, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget v0, p0, La/pu90;->a:I

    .line 84
    .line 85
    div-int/lit8 v0, v0, 0x2

    .line 86
    .line 87
    sub-int/2addr v0, v3

    .line 88
    iget v2, p0, La/pu90;->b:I

    .line 89
    .line 90
    div-int/lit8 v2, v2, 0x2

    .line 91
    .line 92
    sub-int/2addr v2, v3

    .line 93
    invoke-virtual {p1, p0, v0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget v0, p0, La/pu90;->b:I

    .line 103
    .line 104
    sub-int/2addr v3, v0

    .line 105
    div-int/lit8 v3, v3, 0x2

    .line 106
    .line 107
    invoke-virtual {p1, p0, v2, v3, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget v0, p0, La/pu90;->a:I

    .line 117
    .line 118
    div-int/lit8 v0, v0, 0x2

    .line 119
    .line 120
    sub-int/2addr v0, v3

    .line 121
    iget v2, p0, La/pu90;->b:I

    .line 122
    .line 123
    div-int/lit8 v2, v2, 0x2

    .line 124
    .line 125
    sub-int/2addr v2, v3

    .line 126
    invoke-virtual {p1, p0, v0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    neg-int v0, v3

    .line 136
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 137
    .line 138
    .line 139
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    neg-int v0, v3

    .line 146
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget v0, p0, La/pu90;->b:I

    .line 156
    .line 157
    sub-int/2addr v3, v0

    .line 158
    invoke-virtual {p1, p0, v2, v3, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 159
    .line 160
    .line 161
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    iget v0, p0, La/pu90;->b:I

    .line 168
    .line 169
    sub-int/2addr v3, v0

    .line 170
    div-int/lit8 v3, v3, 0x2

    .line 171
    .line 172
    invoke-virtual {p1, p0, v2, v3, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 173
    .line 174
    .line 175
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    neg-int v0, v3

    .line 182
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 183
    .line 184
    .line 185
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    neg-int v0, v3

    .line 192
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 193
    .line 194
    .line 195
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    neg-int v0, v3

    .line 202
    invoke-virtual {p1, p0, v0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 203
    .line 204
    .line 205
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, p0, v2, v3, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_10
    neg-int v0, v3

    .line 218
    invoke-static {p1, p0, v0, v2}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 219
    .line 220
    .line 221
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_11
    neg-int v0, v3

    .line 225
    invoke-static {p1, p0, v2, v0}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 226
    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
