.class public final synthetic La/bur0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/bur0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/bur0;->b:I

    return-void
.end method

.method public synthetic constructor <init>(ILa/cur0;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    iput-byte p2, p0, La/bur0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/bur0;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/bur0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget p0, p0, La/bur0;->b:I

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/2addr p0, v1

    .line 17
    invoke-static {p0}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0, p1}, La/vbw0;->O(ILa/fet;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, La/fet;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    or-int/2addr p0, v1

    .line 35
    invoke-static {p0}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p0, p1}, La/pvm0;->k(ILa/fet;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    check-cast p1, La/fet;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    or-int/2addr p0, v1

    .line 53
    invoke-static {p0}, La/x8x;->L(I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0, p1}, La/qem0;->c(ILa/fet;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, La/oyg0;

    .line 64
    .line 65
    check-cast p2, La/ztr0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object p1, p2, La/ztr0;->b:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La/vd80;

    .line 80
    .line 81
    iget-object v2, v0, La/vd80;->d:Ljava/util/List;

    .line 82
    .line 83
    new-instance v3, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, La/vd80;->a:La/be80;

    .line 89
    .line 90
    sget-object v5, La/be80;->a:La/be80;

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    if-ne v4, v5, :cond_0

    .line 94
    .line 95
    move v5, v1

    .line 96
    goto :goto_0

    .line 97
    :cond_0
    move v5, v6

    .line 98
    :goto_0
    if-eqz v5, :cond_1

    .line 99
    .line 100
    move v7, v6

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    :goto_1
    iget v8, p2, La/ztr0;->d:I

    .line 107
    .line 108
    iget v0, v0, La/vd80;->c:I

    .line 109
    .line 110
    sub-int/2addr v8, v0

    .line 111
    add-int/2addr v8, v7

    .line 112
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, La/vd80;

    .line 117
    .line 118
    new-instance v0, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    move v9, v6

    .line 128
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-eqz v10, :cond_5

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    add-int/lit8 v11, v9, 0x1

    .line 139
    .line 140
    if-ltz v9, :cond_4

    .line 141
    .line 142
    check-cast v10, La/ntr0;

    .line 143
    .line 144
    sget-object v12, La/be80;->c:La/be80;

    .line 145
    .line 146
    if-eq v4, v12, :cond_3

    .line 147
    .line 148
    sget-object v12, La/be80;->b:La/be80;

    .line 149
    .line 150
    if-ne v4, v12, :cond_2

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_2
    move v12, v6

    .line 154
    goto :goto_4

    .line 155
    :cond_3
    :goto_3
    move v12, v1

    .line 156
    :goto_4
    invoke-static {v10, v12}, La/ntr0;->a(La/ntr0;Z)La/ntr0;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    invoke-virtual {v0, v9, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move v9, v11

    .line 164
    goto :goto_2

    .line 165
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 166
    .line 167
    .line 168
    const/4 p0, 0x0

    .line 169
    throw p0

    .line 170
    :cond_5
    if-eqz v5, :cond_6

    .line 171
    .line 172
    sget-object v1, La/be80;->b:La/be80;

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_6
    sget-object v1, La/be80;->a:La/be80;

    .line 176
    .line 177
    :goto_5
    invoke-static {p1, v1, v7, v0}, La/vd80;->a(La/vd80;La/be80;ILjava/util/ArrayList;)La/vd80;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {v3, p0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    iget-object p0, p2, La/ztr0;->a:La/he80;

    .line 185
    .line 186
    iget p1, p2, La/ztr0;->c:I

    .line 187
    .line 188
    new-instance p2, La/ztr0;

    .line 189
    .line 190
    invoke-direct {p2, p0, v3, p1, v8}, La/ztr0;-><init>(La/he80;Ljava/util/List;II)V

    .line 191
    .line 192
    .line 193
    return-object p2

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
