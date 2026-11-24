.class public final La/uuu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/kmq;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/uuu;->a:B

    iput-object p1, p0, La/uuu;->b:La/kmq;

    iput p2, p0, La/uuu;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/uuu;->a:B

    .line 2
    .line 3
    iget v1, p0, La/uuu;->c:I

    .line 4
    .line 5
    iget-object v2, p0, La/uuu;->b:La/kmq;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/ypp0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/ypp0;

    .line 22
    .line 23
    iget v7, v0, La/ypp0;->j:I

    .line 24
    .line 25
    and-int v8, v7, v5

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v5

    .line 30
    iput v7, v0, La/ypp0;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/ypp0;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/ypp0;-><init>(La/uuu;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/ypp0;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/ypp0;->j:I

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    check-cast p1, Ljava/util/Map;

    .line 60
    .line 61
    new-instance p0, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-direct {p0, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/util/List;

    .line 71
    .line 72
    if-nez p0, :cond_3

    .line 73
    .line 74
    sget-object p0, La/iun;->a:La/iun;

    .line 75
    .line 76
    :cond_3
    iput v6, v0, La/ypp0;->j:I

    .line 77
    .line 78
    invoke-interface {v2, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, p2, :cond_4

    .line 83
    .line 84
    move-object v3, p2

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    :goto_2
    return-object v3

    .line 89
    :pswitch_0
    instance-of v0, p2, La/fi80;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    move-object v0, p2

    .line 94
    check-cast v0, La/fi80;

    .line 95
    .line 96
    iget v7, v0, La/fi80;->j:I

    .line 97
    .line 98
    and-int v8, v7, v5

    .line 99
    .line 100
    if-eqz v8, :cond_5

    .line 101
    .line 102
    sub-int/2addr v7, v5

    .line 103
    iput v7, v0, La/fi80;->j:I

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    new-instance v0, La/fi80;

    .line 107
    .line 108
    invoke-direct {v0, p0, p2}, La/fi80;-><init>(La/uuu;La/yje;)V

    .line 109
    .line 110
    .line 111
    :goto_3
    iget-object p0, v0, La/fi80;->i:Ljava/lang/Object;

    .line 112
    .line 113
    sget-object p2, La/wne;->a:La/wne;

    .line 114
    .line 115
    iget v5, v0, La/fi80;->j:I

    .line 116
    .line 117
    if-eqz v5, :cond_7

    .line 118
    .line 119
    if-ne v5, v6, :cond_6

    .line 120
    .line 121
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_7
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    check-cast p1, La/vmu0;

    .line 133
    .line 134
    new-instance p0, La/rjt;

    .line 135
    .line 136
    invoke-direct {p0, v1, p1}, La/rjt;-><init>(ILa/vmu0;)V

    .line 137
    .line 138
    .line 139
    iput v6, v0, La/fi80;->j:I

    .line 140
    .line 141
    invoke-interface {v2, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-ne p0, p2, :cond_8

    .line 146
    .line 147
    move-object v3, p2

    .line 148
    goto :goto_5

    .line 149
    :cond_8
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    :goto_5
    return-object v3

    .line 152
    :pswitch_1
    instance-of v0, p2, La/tuu;

    .line 153
    .line 154
    if-eqz v0, :cond_9

    .line 155
    .line 156
    move-object v0, p2

    .line 157
    check-cast v0, La/tuu;

    .line 158
    .line 159
    iget v7, v0, La/tuu;->j:I

    .line 160
    .line 161
    and-int v8, v7, v5

    .line 162
    .line 163
    if-eqz v8, :cond_9

    .line 164
    .line 165
    sub-int/2addr v7, v5

    .line 166
    iput v7, v0, La/tuu;->j:I

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_9
    new-instance v0, La/tuu;

    .line 170
    .line 171
    invoke-direct {v0, p0, p2}, La/tuu;-><init>(La/uuu;La/yje;)V

    .line 172
    .line 173
    .line 174
    :goto_6
    iget-object p0, v0, La/tuu;->i:Ljava/lang/Object;

    .line 175
    .line 176
    sget-object p2, La/wne;->a:La/wne;

    .line 177
    .line 178
    iget v5, v0, La/tuu;->j:I

    .line 179
    .line 180
    if-eqz v5, :cond_b

    .line 181
    .line 182
    if-ne v5, v6, :cond_a

    .line 183
    .line 184
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_b
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    check-cast p1, Ljava/util/List;

    .line 196
    .line 197
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    iput v6, v0, La/tuu;->j:I

    .line 202
    .line 203
    invoke-interface {v2, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    if-ne p0, p2, :cond_c

    .line 208
    .line 209
    move-object v3, p2

    .line 210
    goto :goto_8

    .line 211
    :cond_c
    :goto_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    :goto_8
    return-object v3

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
