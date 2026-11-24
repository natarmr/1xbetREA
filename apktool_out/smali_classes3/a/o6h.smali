.class public final synthetic La/o6h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/o6h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/o6h;->b:I

    iput-object p2, p0, La/o6h;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/o6h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o6h;->c:Ljava/util/ArrayList;

    iput p2, p0, La/o6h;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/o6h;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/o6h;->c:Ljava/util/ArrayList;

    .line 5
    .line 6
    iget p0, p0, La/o6h;->b:I

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    check-cast p1, La/ou90;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_7

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/pu90;

    .line 33
    .line 34
    invoke-virtual {v2}, La/pu90;->n()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    instance-of v6, v5, La/coc;

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    check-cast v5, La/coc;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v5, v1

    .line 46
    :goto_1
    if-eqz v5, :cond_2

    .line 47
    .line 48
    iget-object v5, v5, La/coc;->b:Ljava/lang/String;

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object v5, v1

    .line 52
    :goto_2
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    sparse-switch v6, :sswitch_data_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :sswitch_0
    const-string v6, "INFORMATION_BOARD_ID"

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {p1, v2, v3, p0, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 72
    .line 73
    .line 74
    iget v2, v2, La/pu90;->b:I

    .line 75
    .line 76
    :goto_3
    add-int/2addr p0, v2

    .line 77
    goto :goto_0

    .line 78
    :sswitch_1
    const-string v6, "MARKETS_ID"

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-nez v5, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-virtual {p1, v2, v3, p0, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :sswitch_2
    const-string v6, "BACKGROUND_ID"

    .line 92
    .line 93
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-nez v5, :cond_5

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    invoke-virtual {p1, v2, v3, v3, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :sswitch_3
    const-string v6, "TOOLBAR_ID"

    .line 105
    .line 106
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_6

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_6
    invoke-virtual {p1, v2, v3, p0, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 114
    .line 115
    .line 116
    iget v2, v2, La/pu90;->b:I

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    move v5, v3

    .line 130
    move v6, v5

    .line 131
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_a

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    add-int/lit8 v8, v5, 0x1

    .line 142
    .line 143
    if-ltz v5, :cond_9

    .line 144
    .line 145
    check-cast v7, La/pu90;

    .line 146
    .line 147
    invoke-virtual {p1, v7, v3, v6, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 148
    .line 149
    .line 150
    iget v7, v7, La/pu90;->b:I

    .line 151
    .line 152
    add-int/2addr v6, v7

    .line 153
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    add-int/lit8 v7, v7, -0x1

    .line 158
    .line 159
    if-ge v5, v7, :cond_8

    .line 160
    .line 161
    add-int/2addr v6, p0

    .line 162
    :cond_8
    move v5, v8

    .line 163
    goto :goto_4

    .line 164
    :cond_9
    invoke-static {}, La/q3d;->p()V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    :sswitch_data_0
    .sparse-switch
        0x2068547f -> :sswitch_3
        0x48e075cc -> :sswitch_2
        0x5f9032c3 -> :sswitch_1
        0x660f4f07 -> :sswitch_0
    .end sparse-switch
.end method
