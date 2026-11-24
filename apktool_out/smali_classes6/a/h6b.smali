.class public final synthetic La/h6b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/m3b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/m3b;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h6b;->a:B

    iput-object p1, p0, La/h6b;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/h6b;->c:La/m3b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/h6b;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/h6b;->c:La/m3b;

    .line 4
    .line 5
    iget-object p0, p0, La/h6b;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/xgl0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/a6b;

    .line 16
    .line 17
    new-instance v2, La/b130;

    .line 18
    .line 19
    iget-wide v3, v1, La/m3b;->b:J

    .line 20
    .line 21
    iget-object v1, v1, La/m3b;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {v2, p1, v3, v4, v1}, La/b130;-><init>(La/xgl0;JLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v2}, La/a6b;-><init>(La/g130;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    check-cast p1, La/wgl0;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    instance-of v0, p1, La/vgl0;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    new-instance v0, La/a6b;

    .line 45
    .line 46
    new-instance v2, La/a130;

    .line 47
    .line 48
    check-cast p1, La/vgl0;

    .line 49
    .line 50
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 51
    .line 52
    iget-wide v3, v1, La/m3b;->b:J

    .line 53
    .line 54
    iget-object v1, v1, La/m3b;->c:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v2, p1, v3, v4, v1}, La/a130;-><init>(La/xgl0;JLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v2}, La/a6b;-><init>(La/g130;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_1
    check-cast p1, La/xgl0;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v0, La/a6b;

    .line 74
    .line 75
    new-instance v2, La/b130;

    .line 76
    .line 77
    iget-wide v3, v1, La/m3b;->b:J

    .line 78
    .line 79
    iget-object v1, v1, La/m3b;->c:Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {v2, p1, v3, v4, v1}, La/b130;-><init>(La/xgl0;JLjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v0, v2}, La/a6b;-><init>(La/g130;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_2
    check-cast p1, La/wgl0;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    instance-of v0, p1, La/vgl0;

    .line 99
    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    new-instance v0, La/a6b;

    .line 103
    .line 104
    new-instance v2, La/a130;

    .line 105
    .line 106
    check-cast p1, La/vgl0;

    .line 107
    .line 108
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 109
    .line 110
    iget-wide v3, v1, La/m3b;->b:J

    .line 111
    .line 112
    iget-object v1, v1, La/m3b;->c:Ljava/lang/String;

    .line 113
    .line 114
    invoke-direct {v2, p1, v3, v4, v1}, La/a130;-><init>(La/xgl0;JLjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v0, v2}, La/a6b;-><init>(La/g130;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_3
    check-cast p1, La/wgl0;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    instance-of v0, p1, La/vgl0;

    .line 132
    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    new-instance v0, La/a6b;

    .line 136
    .line 137
    new-instance v2, La/a130;

    .line 138
    .line 139
    check-cast p1, La/vgl0;

    .line 140
    .line 141
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 142
    .line 143
    iget-wide v3, v1, La/m3b;->b:J

    .line 144
    .line 145
    iget-object v1, v1, La/m3b;->c:Ljava/lang/String;

    .line 146
    .line 147
    invoke-direct {v2, p1, v3, v4, v1}, La/a130;-><init>(La/xgl0;JLjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, v2}, La/a6b;-><init>(La/g130;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_4
    check-cast p1, La/xgl0;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v0, La/a6b;

    .line 165
    .line 166
    new-instance v2, La/b130;

    .line 167
    .line 168
    iget-wide v3, v1, La/m3b;->b:J

    .line 169
    .line 170
    iget-object v1, v1, La/m3b;->c:Ljava/lang/String;

    .line 171
    .line 172
    invoke-direct {v2, p1, v3, v4, v1}, La/b130;-><init>(La/xgl0;JLjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v0, v2}, La/a6b;-><init>(La/g130;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_5
    check-cast p1, La/xgl0;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v0, La/a6b;

    .line 190
    .line 191
    new-instance v2, La/b130;

    .line 192
    .line 193
    iget-wide v3, v1, La/m3b;->b:J

    .line 194
    .line 195
    iget-object v1, v1, La/m3b;->c:Ljava/lang/String;

    .line 196
    .line 197
    invoke-direct {v2, p1, v3, v4, v1}, La/b130;-><init>(La/xgl0;JLjava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-direct {v0, v2}, La/a6b;-><init>(La/g130;)V

    .line 201
    .line 202
    .line 203
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_6
    check-cast p1, La/wgl0;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    instance-of v0, p1, La/vgl0;

    .line 215
    .line 216
    if-eqz v0, :cond_3

    .line 217
    .line 218
    new-instance v0, La/a6b;

    .line 219
    .line 220
    new-instance v2, La/a130;

    .line 221
    .line 222
    check-cast p1, La/vgl0;

    .line 223
    .line 224
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 225
    .line 226
    iget-wide v3, v1, La/m3b;->b:J

    .line 227
    .line 228
    iget-object v1, v1, La/m3b;->c:Ljava/lang/String;

    .line 229
    .line 230
    invoke-direct {v2, p1, v3, v4, v1}, La/a130;-><init>(La/xgl0;JLjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v0, v2}, La/a6b;-><init>(La/g130;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    nop

    .line 243
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
