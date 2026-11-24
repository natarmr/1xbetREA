.class public final synthetic La/ftq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:La/pu90;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;La/pu90;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ftq;->a:B

    iput-object p1, p0, La/ftq;->b:Ljava/util/ArrayList;

    iput-object p2, p0, La/ftq;->c:La/pu90;

    iput p3, p0, La/ftq;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/ftq;->a:B

    .line 2
    .line 3
    const-string v1, "TOTAL_CONTENT_ID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget v4, p0, La/ftq;->d:I

    .line 8
    .line 9
    iget-object v5, p0, La/ftq;->c:La/pu90;

    .line 10
    .line 11
    iget-object p0, p0, La/ftq;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    check-cast p1, La/ou90;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    move v7, v2

    .line 27
    :goto_0
    if-ge v7, v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    check-cast v8, La/pu90;

    .line 34
    .line 35
    invoke-virtual {v8}, La/pu90;->n()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    instance-of v10, v9, La/p6z;

    .line 40
    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    check-cast v9, La/p6z;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move-object v9, v3

    .line 47
    :goto_1
    if-eqz v9, :cond_1

    .line 48
    .line 49
    invoke-interface {v9}, La/p6z;->g0()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    move-object v9, v3

    .line 55
    :goto_2
    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    iget v9, v8, La/pu90;->a:I

    .line 62
    .line 63
    sub-int v9, v4, v9

    .line 64
    .line 65
    invoke-virtual {p1, v8, v9, v2, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 66
    .line 67
    .line 68
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    if-eqz v5, :cond_4

    .line 72
    .line 73
    invoke-virtual {p1, v5, v2, v2, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 74
    .line 75
    .line 76
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    move v7, v2

    .line 87
    move v8, v7

    .line 88
    :goto_3
    if-ge v7, v0, :cond_a

    .line 89
    .line 90
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    check-cast v9, La/pu90;

    .line 95
    .line 96
    invoke-virtual {v9}, La/pu90;->n()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    instance-of v11, v10, La/p6z;

    .line 101
    .line 102
    if-eqz v11, :cond_5

    .line 103
    .line 104
    check-cast v10, La/p6z;

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move-object v10, v3

    .line 108
    :goto_4
    if-eqz v10, :cond_6

    .line 109
    .line 110
    invoke-interface {v10}, La/p6z;->g0()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    goto :goto_5

    .line 115
    :cond_6
    move-object v10, v3

    .line 116
    :goto_5
    const-string v11, "RED_CARDS_CONTENT_ID"

    .line 117
    .line 118
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    if-nez v11, :cond_8

    .line 123
    .line 124
    const-string v11, "YELLOW_CARDS_CONTENT_ID"

    .line 125
    .line 126
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-nez v11, :cond_8

    .line 131
    .line 132
    const-string v11, "CORNERS_CONTENT_ID"

    .line 133
    .line 134
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-eqz v11, :cond_7

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_7
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-eqz v10, :cond_9

    .line 146
    .line 147
    iget v10, v9, La/pu90;->a:I

    .line 148
    .line 149
    sub-int v10, v4, v10

    .line 150
    .line 151
    invoke-virtual {p1, v9, v10, v2, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 152
    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_8
    :goto_6
    invoke-virtual {p1, v9, v8, v2, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 156
    .line 157
    .line 158
    iget v9, v9, La/pu90;->a:I

    .line 159
    .line 160
    add-int/2addr v8, v9

    .line 161
    :cond_9
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_a
    if-eqz v5, :cond_b

    .line 165
    .line 166
    invoke-virtual {p1, v5, v8, v2, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 167
    .line 168
    .line 169
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
