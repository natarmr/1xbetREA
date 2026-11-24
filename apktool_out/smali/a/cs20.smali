.class public final synthetic La/cs20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:I

.field public final synthetic d:Ljava/util/ArrayList;

.field public final synthetic e:La/kie0;


# direct methods
.method public synthetic constructor <init>(La/pu90;ILjava/util/ArrayList;La/kie0;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/cs20;->a:B

    iput-object p1, p0, La/cs20;->b:La/pu90;

    iput p2, p0, La/cs20;->c:I

    iput-object p3, p0, La/cs20;->d:Ljava/util/ArrayList;

    iput-object p4, p0, La/cs20;->e:La/kie0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/cs20;->a:B

    .line 2
    .line 3
    const-string v1, "MarketCategoriesSubGamesContainerITEMS"

    .line 4
    .line 5
    const-string v2, "MarketCategoriesSubGamesContainerHEADER"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/cs20;->e:La/kie0;

    .line 9
    .line 10
    iget-object v5, p0, La/cs20;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    iget v6, p0, La/cs20;->c:I

    .line 13
    .line 14
    iget-object p0, p0, La/cs20;->b:La/pu90;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    check-cast p1, La/ou90;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    iget v0, p0, La/pu90;->b:I

    .line 29
    .line 30
    sub-int/2addr v6, v0

    .line 31
    invoke-virtual {p1, p0, v7, v6, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/pu90;

    .line 49
    .line 50
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    instance-of v6, v5, La/p6z;

    .line 55
    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    check-cast v5, La/p6z;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v5, v3

    .line 62
    :goto_1
    if-eqz v5, :cond_3

    .line 63
    .line 64
    invoke-interface {v5}, La/p6z;->g0()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object v5, v3

    .line 70
    :goto_2
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1, v0, v7, v7, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_1

    .line 85
    .line 86
    iget v5, v4, La/kie0;->a:I

    .line 87
    .line 88
    invoke-virtual {p1, v0, v5, v7, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    if-eqz p0, :cond_6

    .line 99
    .line 100
    iget v0, p0, La/pu90;->b:I

    .line 101
    .line 102
    sub-int/2addr v6, v0

    .line 103
    invoke-virtual {p1, p0, v7, v6, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 104
    .line 105
    .line 106
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    :cond_7
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_b

    .line 115
    .line 116
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/pu90;

    .line 121
    .line 122
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    instance-of v6, v5, La/p6z;

    .line 127
    .line 128
    if-eqz v6, :cond_8

    .line 129
    .line 130
    check-cast v5, La/p6z;

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_8
    move-object v5, v3

    .line 134
    :goto_4
    if-eqz v5, :cond_9

    .line 135
    .line 136
    invoke-interface {v5}, La/p6z;->g0()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    goto :goto_5

    .line 141
    :cond_9
    move-object v5, v3

    .line 142
    :goto_5
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_a

    .line 147
    .line 148
    invoke-virtual {p1, v0, v7, v7, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_a
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    iget v5, v4, La/kie0;->a:I

    .line 159
    .line 160
    invoke-virtual {p1, v0, v5, v7, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
