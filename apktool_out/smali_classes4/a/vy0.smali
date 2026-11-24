.class public final synthetic La/vy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:La/a4x;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;ZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/vy0;->a:B

    iput-object p1, p0, La/vy0;->b:La/mm40;

    iput-object p2, p0, La/vy0;->d:La/a4x;

    iput-boolean p3, p0, La/vy0;->c:Z

    iput-object p4, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/vy0;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;ZLa/a4x;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/vy0;->a:B

    iput-object p1, p0, La/vy0;->b:La/mm40;

    iput-boolean p2, p0, La/vy0;->c:Z

    iput-object p3, p0, La/vy0;->d:La/a4x;

    iput-object p4, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/vy0;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/vy0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v2, p1

    .line 7
    check-cast v2, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, La/vy0;->f:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v3, p0, La/vy0;->d:La/a4x;

    .line 23
    .line 24
    iget-object v4, p0, La/vy0;->b:La/mm40;

    .line 25
    .line 26
    iget-object v5, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    iget-boolean v6, p0, La/vy0;->c:Z

    .line 29
    .line 30
    invoke-static/range {v1 .. v6}, La/ohq0;->U(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    move-object v1, p1

    .line 37
    check-cast v1, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget p1, p0, La/vy0;->f:I

    .line 45
    .line 46
    or-int/lit8 p1, p1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/vy0;->d:La/a4x;

    .line 53
    .line 54
    iget-object v3, p0, La/vy0;->b:La/mm40;

    .line 55
    .line 56
    iget-object v4, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    .line 57
    .line 58
    iget-boolean v5, p0, La/vy0;->c:Z

    .line 59
    .line 60
    invoke-static/range {v0 .. v5}, La/unh0;->g0(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_1
    move-object v1, p1

    .line 67
    check-cast v1, La/fet;

    .line 68
    .line 69
    check-cast p2, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget p1, p0, La/vy0;->f:I

    .line 75
    .line 76
    or-int/lit8 p1, p1, 0x1

    .line 77
    .line 78
    invoke-static {p1}, La/x8x;->L(I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/vy0;->d:La/a4x;

    .line 83
    .line 84
    iget-object v3, p0, La/vy0;->b:La/mm40;

    .line 85
    .line 86
    iget-object v4, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    .line 87
    .line 88
    iget-boolean v5, p0, La/vy0;->c:Z

    .line 89
    .line 90
    invoke-static/range {v0 .. v5}, La/wha0;->m(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_2
    move-object v1, p1

    .line 97
    check-cast v1, La/fet;

    .line 98
    .line 99
    check-cast p2, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget p1, p0, La/vy0;->f:I

    .line 105
    .line 106
    or-int/lit8 p1, p1, 0x1

    .line 107
    .line 108
    invoke-static {p1}, La/x8x;->L(I)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-object v2, p0, La/vy0;->d:La/a4x;

    .line 113
    .line 114
    iget-object v3, p0, La/vy0;->b:La/mm40;

    .line 115
    .line 116
    iget-object v4, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    .line 117
    .line 118
    iget-boolean v5, p0, La/vy0;->c:Z

    .line 119
    .line 120
    invoke-static/range {v0 .. v5}, La/jar0;->s(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_3
    move-object v1, p1

    .line 127
    check-cast v1, La/fet;

    .line 128
    .line 129
    check-cast p2, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget p1, p0, La/vy0;->f:I

    .line 135
    .line 136
    or-int/lit8 p1, p1, 0x1

    .line 137
    .line 138
    invoke-static {p1}, La/x8x;->L(I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iget-object v2, p0, La/vy0;->d:La/a4x;

    .line 143
    .line 144
    iget-object v3, p0, La/vy0;->b:La/mm40;

    .line 145
    .line 146
    iget-object v4, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    .line 147
    .line 148
    iget-boolean v5, p0, La/vy0;->c:Z

    .line 149
    .line 150
    invoke-static/range {v0 .. v5}, La/vfc;->y(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_4
    move-object v1, p1

    .line 157
    check-cast v1, La/fet;

    .line 158
    .line 159
    check-cast p2, Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget p1, p0, La/vy0;->f:I

    .line 165
    .line 166
    or-int/lit8 p1, p1, 0x1

    .line 167
    .line 168
    invoke-static {p1}, La/x8x;->L(I)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iget-object v2, p0, La/vy0;->d:La/a4x;

    .line 173
    .line 174
    iget-object v3, p0, La/vy0;->b:La/mm40;

    .line 175
    .line 176
    iget-object v4, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    .line 177
    .line 178
    iget-boolean v5, p0, La/vy0;->c:Z

    .line 179
    .line 180
    invoke-static/range {v0 .. v5}, La/lgb;->e(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_5
    move-object v1, p1

    .line 187
    check-cast v1, La/fet;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/Integer;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    iget p1, p0, La/vy0;->f:I

    .line 195
    .line 196
    or-int/lit8 p1, p1, 0x1

    .line 197
    .line 198
    invoke-static {p1}, La/x8x;->L(I)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iget-object v2, p0, La/vy0;->d:La/a4x;

    .line 203
    .line 204
    iget-object v3, p0, La/vy0;->b:La/mm40;

    .line 205
    .line 206
    iget-object v4, p0, La/vy0;->e:Lkotlin/jvm/functions/Function1;

    .line 207
    .line 208
    iget-boolean v5, p0, La/vy0;->c:Z

    .line 209
    .line 210
    invoke-static/range {v0 .. v5}, La/saj;->a(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 211
    .line 212
    .line 213
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    nop

    .line 217
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
