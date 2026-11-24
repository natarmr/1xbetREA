.class public final synthetic La/qwy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fql0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/fql0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/qwy;->a:B

    iput-object p1, p0, La/qwy;->b:La/fql0;

    iput-object p2, p0, La/qwy;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/fql0;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    iput-byte v0, p0, La/qwy;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qwy;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/qwy;->b:La/fql0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/qwy;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/qwy;->b:La/fql0;

    .line 4
    .line 5
    iget-object p0, p0, La/qwy;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/p62;

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/p62;-><init>(La/fql0;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget-object v0, v1, La/fql0;->g:La/sfl0;

    .line 22
    .line 23
    sget-object v2, La/sfl0;->c:La/sfl0;

    .line 24
    .line 25
    if-eq v0, v2, :cond_0

    .line 26
    .line 27
    sget-object v2, La/sfl0;->b:La/sfl0;

    .line 28
    .line 29
    if-eq v0, v2, :cond_0

    .line 30
    .line 31
    new-instance v0, La/l62;

    .line 32
    .line 33
    iget-wide v1, v1, La/fql0;->a:J

    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, La/l62;-><init>(J)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    iget-object v0, v1, La/fql0;->g:La/sfl0;

    .line 45
    .line 46
    iget-wide v1, v1, La/fql0;->a:J

    .line 47
    .line 48
    sget-object v3, La/sfl0;->c:La/sfl0;

    .line 49
    .line 50
    if-eq v0, v3, :cond_2

    .line 51
    .line 52
    sget-object v3, La/sfl0;->b:La/sfl0;

    .line 53
    .line 54
    if-ne v0, v3, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance v0, La/i62;

    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, La/i62;-><init>(J)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    new-instance v0, La/j62;

    .line 67
    .line 68
    invoke-direct {v0, v1, v2}, La/j62;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_2
    iget-object v0, v1, La/fql0;->g:La/sfl0;

    .line 78
    .line 79
    sget-object v2, La/sfl0;->c:La/sfl0;

    .line 80
    .line 81
    if-eq v0, v2, :cond_3

    .line 82
    .line 83
    sget-object v2, La/sfl0;->b:La/sfl0;

    .line 84
    .line 85
    if-eq v0, v2, :cond_3

    .line 86
    .line 87
    new-instance v0, La/l62;

    .line 88
    .line 89
    iget-wide v1, v1, La/fql0;->a:J

    .line 90
    .line 91
    invoke-direct {v0, v1, v2}, La/l62;-><init>(J)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_3
    iget-object v0, v1, La/fql0;->g:La/sfl0;

    .line 101
    .line 102
    iget-wide v1, v1, La/fql0;->a:J

    .line 103
    .line 104
    sget-object v3, La/sfl0;->c:La/sfl0;

    .line 105
    .line 106
    if-eq v0, v3, :cond_5

    .line 107
    .line 108
    sget-object v3, La/sfl0;->b:La/sfl0;

    .line 109
    .line 110
    if-ne v0, v3, :cond_4

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    new-instance v0, La/i62;

    .line 114
    .line 115
    invoke-direct {v0, v1, v2}, La/i62;-><init>(J)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    :goto_2
    new-instance v0, La/j62;

    .line 123
    .line 124
    invoke-direct {v0, v1, v2}, La/j62;-><init>(J)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_4
    iget-object v0, v1, La/fql0;->g:La/sfl0;

    .line 134
    .line 135
    sget-object v2, La/sfl0;->c:La/sfl0;

    .line 136
    .line 137
    if-eq v0, v2, :cond_6

    .line 138
    .line 139
    sget-object v2, La/sfl0;->b:La/sfl0;

    .line 140
    .line 141
    if-eq v0, v2, :cond_6

    .line 142
    .line 143
    new-instance v0, La/l62;

    .line 144
    .line 145
    iget-wide v1, v1, La/fql0;->a:J

    .line 146
    .line 147
    invoke-direct {v0, v1, v2}, La/l62;-><init>(J)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_5
    iget-object v0, v1, La/fql0;->g:La/sfl0;

    .line 157
    .line 158
    iget-wide v1, v1, La/fql0;->a:J

    .line 159
    .line 160
    sget-object v3, La/sfl0;->c:La/sfl0;

    .line 161
    .line 162
    if-eq v0, v3, :cond_8

    .line 163
    .line 164
    sget-object v3, La/sfl0;->b:La/sfl0;

    .line 165
    .line 166
    if-ne v0, v3, :cond_7

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_7
    new-instance v0, La/i62;

    .line 170
    .line 171
    invoke-direct {v0, v1, v2}, La/i62;-><init>(J)V

    .line 172
    .line 173
    .line 174
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_8
    :goto_4
    new-instance v0, La/j62;

    .line 179
    .line 180
    invoke-direct {v0, v1, v2}, La/j62;-><init>(J)V

    .line 181
    .line 182
    .line 183
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_6
    iget-object v0, v1, La/fql0;->g:La/sfl0;

    .line 190
    .line 191
    sget-object v2, La/sfl0;->c:La/sfl0;

    .line 192
    .line 193
    if-eq v0, v2, :cond_9

    .line 194
    .line 195
    sget-object v2, La/sfl0;->b:La/sfl0;

    .line 196
    .line 197
    if-eq v0, v2, :cond_9

    .line 198
    .line 199
    new-instance v0, La/l62;

    .line 200
    .line 201
    iget-wide v1, v1, La/fql0;->a:J

    .line 202
    .line 203
    invoke-direct {v0, v1, v2}, La/l62;-><init>(J)V

    .line 204
    .line 205
    .line 206
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_7
    iget-object v0, v1, La/fql0;->g:La/sfl0;

    .line 213
    .line 214
    iget-wide v1, v1, La/fql0;->a:J

    .line 215
    .line 216
    sget-object v3, La/sfl0;->c:La/sfl0;

    .line 217
    .line 218
    if-eq v0, v3, :cond_b

    .line 219
    .line 220
    sget-object v3, La/sfl0;->b:La/sfl0;

    .line 221
    .line 222
    if-ne v0, v3, :cond_a

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_a
    new-instance v0, La/i62;

    .line 226
    .line 227
    invoke-direct {v0, v1, v2}, La/i62;-><init>(J)V

    .line 228
    .line 229
    .line 230
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_b
    :goto_6
    new-instance v0, La/j62;

    .line 235
    .line 236
    invoke-direct {v0, v1, v2}, La/j62;-><init>(J)V

    .line 237
    .line 238
    .line 239
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
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
