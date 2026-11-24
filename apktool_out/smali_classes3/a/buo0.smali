.class public final La/buo0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/y3v;

.field public final b:La/gst0;


# direct methods
.method public constructor <init>(La/y3v;La/gst0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/buo0;->a:La/y3v;

    .line 8
    .line 9
    iput-object p2, p0, La/buo0;->b:La/gst0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/hae0;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/buo0;->a:La/y3v;

    .line 2
    .line 3
    iget-object v0, v0, La/y3v;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/zto0;

    .line 6
    .line 7
    instance-of v1, p2, La/auo0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, p2

    .line 12
    check-cast v1, La/auo0;

    .line 13
    .line 14
    iget v2, v1, La/auo0;->k:I

    .line 15
    .line 16
    const/high16 v3, -0x80000000

    .line 17
    .line 18
    and-int v4, v2, v3

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v3

    .line 23
    iput v2, v1, La/auo0;->k:I

    .line 24
    .line 25
    :goto_0
    move-object v7, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v1, La/auo0;

    .line 28
    .line 29
    invoke-direct {v1, p0, p2}, La/auo0;-><init>(La/buo0;La/zje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object p2, v7, La/auo0;->i:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v1, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v2, v7, La/auo0;->k:I

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    const/4 v8, 0x1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-eq v2, v8, :cond_2

    .line 44
    .line 45
    if-ne v2, v3, :cond_1

    .line 46
    .line 47
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-boolean p2, v0, La/zto0;->b:Z

    .line 66
    .line 67
    if-eqz p2, :cond_9

    .line 68
    .line 69
    iget-object p2, p0, La/buo0;->b:La/gst0;

    .line 70
    .line 71
    invoke-virtual {p2}, La/gst0;->a()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-nez p2, :cond_4

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_4
    move p2, v3

    .line 79
    iget-object v3, v0, La/zto0;->a:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v4, v0, La/zto0;->e:Ljava/lang/String;

    .line 82
    .line 83
    iget v5, v0, La/zto0;->f:I

    .line 84
    .line 85
    sget-object v2, La/hae0;->c:La/hae0;

    .line 86
    .line 87
    if-ne p1, v2, :cond_6

    .line 88
    .line 89
    iget-boolean v2, v0, La/zto0;->c:Z

    .line 90
    .line 91
    if-nez v2, :cond_6

    .line 92
    .line 93
    iput v8, v7, La/auo0;->k:I

    .line 94
    .line 95
    move-object v2, p0

    .line 96
    move-object v6, p1

    .line 97
    invoke-virtual/range {v2 .. v7}, La/buo0;->b(Ljava/lang/String;Ljava/lang/String;ILa/hae0;La/auo0;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-ne p0, v1, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    :goto_2
    iput-boolean v8, v0, La/zto0;->c:Z

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_6
    move-object v2, p0

    .line 108
    move-object v6, p1

    .line 109
    sget-object p0, La/hae0;->d:La/hae0;

    .line 110
    .line 111
    if-ne v6, p0, :cond_8

    .line 112
    .line 113
    iget-boolean p0, v0, La/zto0;->d:Z

    .line 114
    .line 115
    if-nez p0, :cond_8

    .line 116
    .line 117
    iput p2, v7, La/auo0;->k:I

    .line 118
    .line 119
    invoke-virtual/range {v2 .. v7}, La/buo0;->b(Ljava/lang/String;Ljava/lang/String;ILa/hae0;La/auo0;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-ne p0, v1, :cond_7

    .line 124
    .line 125
    :goto_3
    return-object v1

    .line 126
    :cond_7
    :goto_4
    iput-boolean v8, v0, La/zto0;->d:Z

    .line 127
    .line 128
    :cond_8
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_9
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;ILa/hae0;La/auo0;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, La/buo0;->a:La/y3v;

    .line 6
    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p2, p3, p4, p5}, La/y3v;->t(Ljava/lang/String;ILa/hae0;La/zje;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-virtual {p0, p1, p4, p5}, La/y3v;->u(Ljava/lang/String;La/hae0;La/zje;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object p1, La/wne;->a:La/wne;

    .line 26
    .line 27
    if-ne p0, p1, :cond_2

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
