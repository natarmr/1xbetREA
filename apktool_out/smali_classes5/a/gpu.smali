.class public final La/gpu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ivn;

.field public final b:La/a6u;


# direct methods
.method public synthetic constructor <init>(La/ivn;La/a6u;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gpu;->a:La/ivn;

    iput-object p2, p0, La/gpu;->b:La/a6u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJLa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p5, La/oru;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/oru;

    .line 7
    .line 8
    iget v1, v0, La/oru;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/oru;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/oru;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/oru;-><init>(La/gpu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/oru;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/oru;->m:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p5

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    iget-wide p3, v0, La/oru;->j:J

    .line 51
    .line 52
    iget-wide p1, v0, La/oru;->i:J

    .line 53
    .line 54
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-wide p1, v0, La/oru;->i:J

    .line 62
    .line 63
    iput-wide p3, v0, La/oru;->j:J

    .line 64
    .line 65
    iput v4, v0, La/oru;->m:I

    .line 66
    .line 67
    iget-object p5, p0, La/gpu;->a:La/ivn;

    .line 68
    .line 69
    invoke-virtual {p5, p1, p2, v0}, La/ivn;->k(JLa/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p5

    .line 73
    if-ne p5, v1, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    :goto_1
    check-cast p5, La/asc0;

    .line 77
    .line 78
    iget-object p5, p5, La/asc0;->c:Ljava/util/List;

    .line 79
    .line 80
    new-instance v2, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p5

    .line 89
    :cond_5
    :goto_2
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    move-object v5, v4

    .line 100
    check-cast v5, La/vrc0;

    .line 101
    .line 102
    invoke-interface {v5}, La/vrc0;->getId()J

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    cmp-long v5, v5, p3

    .line 107
    .line 108
    if-eqz v5, :cond_5

    .line 109
    .line 110
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_6
    iput-wide p1, v0, La/oru;->i:J

    .line 115
    .line 116
    iput-wide p3, v0, La/oru;->j:J

    .line 117
    .line 118
    iput v3, v0, La/oru;->m:I

    .line 119
    .line 120
    iget-object p0, p0, La/gpu;->b:La/a6u;

    .line 121
    .line 122
    const-string p1, "static/img/android/promo_store/showcase"

    .line 123
    .line 124
    invoke-virtual {p0, v0, p1, v2}, La/a6u;->w(La/zje;Ljava/lang/String;Ljava/util/List;)Ljava/io/Serializable;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-ne p0, v1, :cond_7

    .line 129
    .line 130
    :goto_3
    return-object v1

    .line 131
    :cond_7
    return-object p0
.end method

.method public b(JLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/fpu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/fpu;

    .line 7
    .line 8
    iget v1, v0, La/fpu;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/fpu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fpu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/fpu;-><init>(La/gpu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/fpu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fpu;->l:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p3

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    iget-wide p1, v0, La/fpu;->i:J

    .line 51
    .line 52
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-wide p1, v0, La/fpu;->i:J

    .line 60
    .line 61
    iput v4, v0, La/fpu;->l:I

    .line 62
    .line 63
    iget-object p3, p0, La/gpu;->a:La/ivn;

    .line 64
    .line 65
    invoke-virtual {p3, p1, p2, v0}, La/ivn;->k(JLa/zje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    if-ne p3, v1, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_1
    check-cast p3, La/asc0;

    .line 73
    .line 74
    iget-object p3, p3, La/asc0;->c:Ljava/util/List;

    .line 75
    .line 76
    iput-wide p1, v0, La/fpu;->i:J

    .line 77
    .line 78
    iput v3, v0, La/fpu;->l:I

    .line 79
    .line 80
    iget-object p0, p0, La/gpu;->b:La/a6u;

    .line 81
    .line 82
    const-string p1, "static/img/android/promo_store/showcase/square"

    .line 83
    .line 84
    invoke-virtual {p0, v0, p1, p3}, La/a6u;->w(La/zje;Ljava/lang/String;Ljava/util/List;)Ljava/io/Serializable;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-ne p0, v1, :cond_5

    .line 89
    .line 90
    :goto_2
    return-object v1

    .line 91
    :cond_5
    return-object p0
.end method
