.class public final La/ipc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/oif0;


# direct methods
.method public synthetic constructor <init>(La/oif0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ipc;->a:La/oif0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(DILa/zje;)Ljava/lang/Object;
    .locals 14

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, La/rni0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/rni0;

    .line 11
    .line 12
    iget v3, v2, La/rni0;->m:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/rni0;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/rni0;

    .line 25
    .line 26
    invoke-direct {v2, p0, v1}, La/rni0;-><init>(La/ipc;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/rni0;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/rni0;->m:I

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    iget-object p0, p0, La/ipc;->a:La/oif0;

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_2
    iget-wide v6, v2, La/rni0;->j:D

    .line 57
    .line 58
    iget v0, v2, La/rni0;->i:I

    .line 59
    .line 60
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-wide v11, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, La/oif0;->n()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    move-object v7, v4

    .line 77
    check-cast v7, La/hf6;

    .line 78
    .line 79
    if-eqz v7, :cond_5

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    const/16 v13, 0x17

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    move-wide v11, p1

    .line 87
    invoke-static/range {v7 .. v13}, La/hf6;->a(La/hf6;IILjava/util/List;DI)La/hf6;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    new-instance v7, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v0, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v7}, La/oif0;->I(Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    iput v0, v2, La/rni0;->i:I

    .line 106
    .line 107
    iput-wide v11, v2, La/rni0;->j:D

    .line 108
    .line 109
    iput v6, v2, La/rni0;->m:I

    .line 110
    .line 111
    invoke-virtual {p0, v4, v2}, La/oif0;->F(La/hf6;La/zje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-ne v1, v3, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    :goto_1
    iput v0, v2, La/rni0;->i:I

    .line 119
    .line 120
    iput-wide v11, v2, La/rni0;->j:D

    .line 121
    .line 122
    iput v5, v2, La/rni0;->m:I

    .line 123
    .line 124
    invoke-virtual {p0, v2}, La/oif0;->G(La/zje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-ne p0, v3, :cond_5

    .line 129
    .line 130
    :goto_2
    return-object v3

    .line 131
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0
.end method

.method public b(La/zje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/ipc;->a:La/oif0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/oif0;->e(La/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, La/wne;->a:La/wne;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method
