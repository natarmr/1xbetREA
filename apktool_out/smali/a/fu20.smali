.class public final synthetic La/fu20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uv20;


# direct methods
.method public synthetic constructor <init>(La/uv20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fu20;->a:B

    iput-object p1, p0, La/fu20;->b:La/uv20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/fu20;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x41900000    # 18.0f

    .line 4
    .line 5
    const/high16 v2, 0x41800000    # 16.0f

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/16 v4, 0x80

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    iget-object p0, p0, La/fu20;->b:La/uv20;

    .line 14
    .line 15
    check-cast p1, La/yhg0;

    .line 16
    .line 17
    check-cast p2, La/tv20;

    .line 18
    .line 19
    check-cast p3, La/fet;

    .line 20
    .line 21
    check-cast p4, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    and-int/lit16 p1, p4, 0x81

    .line 37
    .line 38
    if-eq p1, v4, :cond_0

    .line 39
    .line 40
    move p1, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move p1, v5

    .line 43
    :goto_0
    and-int/lit8 p2, p4, 0x1

    .line 44
    .line 45
    invoke-virtual {p3, p2, p1}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    sget-object p1, La/qmk;->a:La/zcl;

    .line 52
    .line 53
    invoke-static {v3, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p0, p0, La/uv20;->f:La/tv20;

    .line 58
    .line 59
    invoke-static {p1, p0, p3, v5}, La/q5x;->i(La/mm40;La/tv20;La/fet;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p3}, La/fet;->X()V

    .line 64
    .line 65
    .line 66
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    and-int/lit16 p1, p4, 0x81

    .line 76
    .line 77
    if-eq p1, v4, :cond_2

    .line 78
    .line 79
    move p1, v6

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move p1, v5

    .line 82
    :goto_2
    and-int/lit8 p2, p4, 0x1

    .line 83
    .line 84
    invoke-virtual {p3, p2, p1}, La/fet;->U(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    sget-object p1, La/qmk;->a:La/zcl;

    .line 91
    .line 92
    invoke-static {v3, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object p0, p0, La/uv20;->f:La/tv20;

    .line 97
    .line 98
    invoke-static {p1, p0, p3, v5}, La/q5x;->i(La/mm40;La/tv20;La/fet;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    invoke-virtual {p3}, La/fet;->X()V

    .line 103
    .line 104
    .line 105
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    and-int/lit16 p1, p4, 0x81

    .line 115
    .line 116
    if-eq p1, v4, :cond_4

    .line 117
    .line 118
    move p1, v6

    .line 119
    goto :goto_4

    .line 120
    :cond_4
    move p1, v5

    .line 121
    :goto_4
    and-int/lit8 p2, p4, 0x1

    .line 122
    .line 123
    invoke-virtual {p3, p2, p1}, La/fet;->U(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    sget-object p1, La/qmk;->a:La/zcl;

    .line 130
    .line 131
    invoke-static {v3, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object p0, p0, La/uv20;->f:La/tv20;

    .line 136
    .line 137
    invoke-static {p1, p0, p3, v5}, La/q5x;->i(La/mm40;La/tv20;La/fet;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_5
    invoke-virtual {p3}, La/fet;->X()V

    .line 142
    .line 143
    .line 144
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    and-int/lit16 p1, p4, 0x81

    .line 154
    .line 155
    if-eq p1, v4, :cond_6

    .line 156
    .line 157
    move p1, v6

    .line 158
    goto :goto_6

    .line 159
    :cond_6
    move p1, v5

    .line 160
    :goto_6
    and-int/lit8 p2, p4, 0x1

    .line 161
    .line 162
    invoke-virtual {p3, p2, p1}, La/fet;->U(IZ)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_7

    .line 167
    .line 168
    sget-object p1, La/qmk;->a:La/zcl;

    .line 169
    .line 170
    invoke-static {v3, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iget-object p0, p0, La/uv20;->f:La/tv20;

    .line 175
    .line 176
    invoke-static {p1, p0, p3, v5}, La/q5x;->i(La/mm40;La/tv20;La/fet;I)V

    .line 177
    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_7
    invoke-virtual {p3}, La/fet;->X()V

    .line 181
    .line 182
    .line 183
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    and-int/lit16 p1, p4, 0x81

    .line 193
    .line 194
    if-eq p1, v4, :cond_8

    .line 195
    .line 196
    move p1, v6

    .line 197
    goto :goto_8

    .line 198
    :cond_8
    move p1, v5

    .line 199
    :goto_8
    and-int/lit8 p2, p4, 0x1

    .line 200
    .line 201
    invoke-virtual {p3, p2, p1}, La/fet;->U(IZ)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_9

    .line 206
    .line 207
    sget-object p1, La/qmk;->a:La/zcl;

    .line 208
    .line 209
    invoke-static {v3, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    iget-object p0, p0, La/uv20;->f:La/tv20;

    .line 214
    .line 215
    invoke-static {p1, p0, p3, v5}, La/q5x;->i(La/mm40;La/tv20;La/fet;I)V

    .line 216
    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_9
    invoke-virtual {p3}, La/fet;->X()V

    .line 220
    .line 221
    .line 222
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
