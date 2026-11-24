.class public final La/z1u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ul9;


# direct methods
.method public constructor <init>(La/ul9;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/z1u;->a:La/ul9;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/z1u;->a:La/ul9;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/c5g;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object p0, p0, La/z1u;->a:La/ul9;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ul9;->b()La/o4g;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget v0, p1, La/c5g;->b:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    add-int/2addr v0, v1

    .line 11
    iget-object v2, p2, La/o4g;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, La/d5g;

    .line 18
    .line 19
    iget-object p2, p2, La/o4g;->b:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, La/d5g;

    .line 26
    .line 27
    if-eqz v2, :cond_9

    .line 28
    .line 29
    iget-object v2, v2, La/d5g;->b:Ljava/util/List;

    .line 30
    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_0
    iget-object v4, v3, La/d5g;->b:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, La/d5g;

    .line 59
    .line 60
    iget v6, v5, La/d5g;->a:I

    .line 61
    .line 62
    iget v7, p1, La/c5g;->a:I

    .line 63
    .line 64
    if-ne v6, v7, :cond_2

    .line 65
    .line 66
    iget-object v5, v5, La/d5g;->b:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v0, v5}, La/rz4;->C(ILjava/util/List;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0, p1}, La/ul9;->h(La/c5g;)Lkotlin/Unit;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    sget-object p1, La/wne;->a:La/wne;

    .line 79
    .line 80
    if-ne p0, p1, :cond_3

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_4
    :goto_0
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->l0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    check-cast p2, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-ge v0, p2, :cond_6

    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->l0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    sub-int/2addr p2, v1

    .line 109
    invoke-static {p1, p2, v1}, La/c5g;->a(La/c5g;II)La/c5g;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0, p1}, La/ul9;->h(La/c5g;)Lkotlin/Unit;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    sget-object p1, La/wne;->a:La/wne;

    .line 118
    .line 119
    if-ne p0, p1, :cond_5

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_6
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->i0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    check-cast p2, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-le v0, p2, :cond_8

    .line 136
    .line 137
    iget p2, v3, La/d5g;->a:I

    .line 138
    .line 139
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->i0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    sub-int/2addr v0, v1

    .line 150
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-static {v2, v3}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v2, v1, p2}, Ljava/util/Calendar;->set(II)V

    .line 163
    .line 164
    .line 165
    const/4 p2, 0x2

    .line 166
    invoke-virtual {v2, p2, v0}, Ljava/util/Calendar;->set(II)V

    .line 167
    .line 168
    .line 169
    const/4 p2, 0x5

    .line 170
    invoke-virtual {v2, p2}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-virtual {v2, p2, v0}, Ljava/util/Calendar;->set(II)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, p2}, Ljava/util/Calendar;->get(I)I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->i0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ljava/lang/Number;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    sub-int/2addr v0, v1

    .line 192
    invoke-static {p1, v0, p2}, La/c5g;->a(La/c5g;II)La/c5g;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p0, p1}, La/ul9;->h(La/c5g;)Lkotlin/Unit;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    sget-object p1, La/wne;->a:La/wne;

    .line 201
    .line 202
    if-ne p0, p1, :cond_7

    .line 203
    .line 204
    return-object p0

    .line 205
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object p0

    .line 211
    :cond_9
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0
.end method
