.class public final La/h5v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/kmq;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(La/kmq;La/j5v;La/qmu0;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/h5v;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/h5v;->c:La/kmq;

    .line 8
    .line 9
    iput-object p2, p0, La/h5v;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/h5v;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/h5v;->f:Ljava/io/Serializable;

    .line 14
    .line 15
    iput-boolean p5, p0, La/h5v;->b:Z

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/mie0;ZLa/kmq;[Ljava/lang/String;[I)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/h5v;->a:B

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h5v;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/h5v;->b:Z

    iput-object p3, p0, La/h5v;->c:La/kmq;

    iput-object p4, p0, La/h5v;->e:Ljava/lang/Object;

    iput-object p5, p0, La/h5v;->f:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/h5v;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, [I

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/h5v;->b([ILa/yje;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    instance-of v0, p2, La/g5v;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move-object v0, p2

    .line 18
    check-cast v0, La/g5v;

    .line 19
    .line 20
    iget v1, v0, La/g5v;->j:I

    .line 21
    .line 22
    const/high16 v2, -0x80000000

    .line 23
    .line 24
    and-int v3, v1, v2

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    sub-int/2addr v1, v2

    .line 29
    iput v1, v0, La/g5v;->j:I

    .line 30
    .line 31
    :goto_0
    move-object v6, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v0, La/g5v;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/g5v;-><init>(La/h5v;La/yje;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object p2, v6, La/g5v;->i:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v0, La/wne;->a:La/wne;

    .line 42
    .line 43
    iget v1, v6, La/g5v;->j:I

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x2

    .line 47
    const/4 v2, 0x1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    if-eq v1, v2, :cond_2

    .line 51
    .line 52
    if-ne v1, v8, :cond_1

    .line 53
    .line 54
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v0, v7

    .line 64
    goto :goto_4

    .line 65
    :cond_2
    iget-object p0, v6, La/g5v;->k:La/kmq;

    .line 66
    .line 67
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    check-cast p1, Ljava/util/List;

    .line 75
    .line 76
    iget-object p2, p0, La/h5v;->d:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v1, p2

    .line 79
    check-cast v1, La/j5v;

    .line 80
    .line 81
    iget-object p2, p0, La/h5v;->e:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v3, p2

    .line 84
    check-cast v3, La/qmu0;

    .line 85
    .line 86
    iget-object p2, p0, La/h5v;->f:Ljava/io/Serializable;

    .line 87
    .line 88
    move-object v4, p2

    .line 89
    check-cast v4, Ljava/lang/String;

    .line 90
    .line 91
    iget-object p2, p0, La/h5v;->c:La/kmq;

    .line 92
    .line 93
    iput-object p2, v6, La/g5v;->k:La/kmq;

    .line 94
    .line 95
    iput v2, v6, La/g5v;->j:I

    .line 96
    .line 97
    iget-boolean v5, p0, La/h5v;->b:Z

    .line 98
    .line 99
    move-object v2, p1

    .line 100
    invoke-virtual/range {v1 .. v6}, La/j5v;->a(Ljava/util/List;La/qmu0;Ljava/lang/String;ZLa/zje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v0, :cond_4

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    move-object v9, p2

    .line 108
    move-object p2, p0

    .line 109
    move-object p0, v9

    .line 110
    :goto_2
    iput-object v7, v6, La/g5v;->k:La/kmq;

    .line 111
    .line 112
    iput v8, v6, La/g5v;->j:I

    .line 113
    .line 114
    invoke-interface {p0, p2, v6}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-ne p0, v0, :cond_5

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    :goto_4
    return-object v0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b([ILa/yje;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/h5v;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, La/h5v;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/mie0;

    .line 8
    .line 9
    instance-of v2, p2, La/xqs0;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v2, p2

    .line 14
    check-cast v2, La/xqs0;

    .line 15
    .line 16
    iget v3, v2, La/xqs0;->l:I

    .line 17
    .line 18
    const/high16 v4, -0x80000000

    .line 19
    .line 20
    and-int v5, v3, v4

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    iput v3, v2, La/xqs0;->l:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v2, La/xqs0;

    .line 29
    .line 30
    invoke-direct {v2, p0, p2}, La/xqs0;-><init>(La/h5v;La/yje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object p2, v2, La/xqs0;->j:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v3, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v4, v2, La/xqs0;->l:I

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x2

    .line 41
    const/4 v7, 0x1

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    if-eq v4, v7, :cond_2

    .line 45
    .line 46
    if-ne v4, v6, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v5

    .line 55
    :cond_2
    :goto_1
    iget-object p1, v2, La/xqs0;->i:[I

    .line 56
    .line 57
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p2, v1, La/mie0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v4, p0, La/h5v;->c:La/kmq;

    .line 67
    .line 68
    if-nez p2, :cond_4

    .line 69
    .line 70
    iget-boolean p0, p0, La/h5v;->b:Z

    .line 71
    .line 72
    if-eqz p0, :cond_8

    .line 73
    .line 74
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iput-object p1, v2, La/xqs0;->i:[I

    .line 79
    .line 80
    iput v7, v2, La/xqs0;->l:I

    .line 81
    .line 82
    invoke-interface {v4, p0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v3, :cond_8

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    iget-object p0, p0, La/h5v;->f:Ljava/io/Serializable;

    .line 90
    .line 91
    check-cast p0, [I

    .line 92
    .line 93
    new-instance p2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    array-length v7, v0

    .line 99
    const/4 v8, 0x0

    .line 100
    move v9, v8

    .line 101
    :goto_2
    if-ge v8, v7, :cond_7

    .line 102
    .line 103
    aget-object v10, v0, v8

    .line 104
    .line 105
    add-int/lit8 v11, v9, 0x1

    .line 106
    .line 107
    iget-object v12, v1, La/mie0;->a:Ljava/lang/Object;

    .line 108
    .line 109
    if-eqz v12, :cond_6

    .line 110
    .line 111
    check-cast v12, [I

    .line 112
    .line 113
    aget v9, p0, v9

    .line 114
    .line 115
    aget v12, v12, v9

    .line 116
    .line 117
    aget v9, p1, v9

    .line 118
    .line 119
    if-eq v12, v9, :cond_5

    .line 120
    .line 121
    invoke-virtual {p2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 125
    .line 126
    move v9, v11

    .line 127
    goto :goto_2

    .line 128
    :cond_6
    const-string p0, "Required value was null."

    .line 129
    .line 130
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object v5

    .line 134
    :cond_7
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-nez p0, :cond_8

    .line 139
    .line 140
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    iput-object p1, v2, La/xqs0;->i:[I

    .line 145
    .line 146
    iput v6, v2, La/xqs0;->l:I

    .line 147
    .line 148
    invoke-interface {v4, p0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v3, :cond_8

    .line 153
    .line 154
    :goto_3
    return-object v3

    .line 155
    :cond_8
    :goto_4
    iput-object p1, v1, La/mie0;->a:Ljava/lang/Object;

    .line 156
    .line 157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0
.end method
