.class public final La/pqf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/drf0;

.field public final b:La/ztt;

.field public final c:La/do00;


# direct methods
.method public constructor <init>(La/drf0;La/ztt;La/do00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pqf0;->a:La/drf0;

    .line 5
    .line 6
    iput-object p2, p0, La/pqf0;->b:La/ztt;

    .line 7
    .line 8
    iput-object p3, p0, La/pqf0;->c:La/do00;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(DLjava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, La/oqf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/oqf0;

    .line 7
    .line 8
    iget v1, v0, La/oqf0;->n:I

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
    iput v1, v0, La/oqf0;->n:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/oqf0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p4}, La/oqf0;-><init>(La/pqf0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v7, La/oqf0;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/oqf0;->n:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object p4

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    iget-wide p1, v7, La/oqf0;->i:D

    .line 53
    .line 54
    iget-object p3, v7, La/oqf0;->k:La/drf0;

    .line 55
    .line 56
    iget-object v1, v7, La/oqf0;->j:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object v5, v1

    .line 62
    move-object v1, p3

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p3, v7, La/oqf0;->j:Ljava/lang/String;

    .line 68
    .line 69
    iget-object p4, p0, La/pqf0;->a:La/drf0;

    .line 70
    .line 71
    iput-object p4, v7, La/oqf0;->k:La/drf0;

    .line 72
    .line 73
    iput-wide p1, v7, La/oqf0;->i:D

    .line 74
    .line 75
    iput v4, v7, La/oqf0;->n:I

    .line 76
    .line 77
    iget-object v1, p0, La/pqf0;->c:La/do00;

    .line 78
    .line 79
    iget-object v4, v1, La/do00;->a:La/pbt;

    .line 80
    .line 81
    iget-object v4, v4, La/pbt;->a:La/j5t;

    .line 82
    .line 83
    iget-object v4, v4, La/j5t;->q:La/ql5;

    .line 84
    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    iget-object v1, v1, La/do00;->b:La/wsf0;

    .line 88
    .line 89
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, La/g45;

    .line 92
    .line 93
    invoke-virtual {v1}, La/g45;->y()La/ahu;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v4, La/bm5;->d:La/bm5;

    .line 98
    .line 99
    invoke-virtual {v1, v4, v7}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    move-object v1, v4

    .line 105
    :goto_2
    if-ne v1, v0, :cond_5

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_5
    move-object v5, v1

    .line 109
    move-object v1, p4

    .line 110
    move-object p4, v5

    .line 111
    move-object v5, p3

    .line 112
    :goto_3
    check-cast p4, La/ql5;

    .line 113
    .line 114
    iget-object p3, p4, La/ql5;->f:Ljava/lang/String;

    .line 115
    .line 116
    iget-object p0, p0, La/pqf0;->b:La/ztt;

    .line 117
    .line 118
    invoke-virtual {p0}, La/ztt;->a()La/csr;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    iput-object v2, v7, La/oqf0;->j:Ljava/lang/String;

    .line 123
    .line 124
    iput-object v2, v7, La/oqf0;->k:La/drf0;

    .line 125
    .line 126
    iput-wide p1, v7, La/oqf0;->i:D

    .line 127
    .line 128
    iput v3, v7, La/oqf0;->n:I

    .line 129
    .line 130
    move-wide v3, p1

    .line 131
    move-object v2, p3

    .line 132
    invoke-virtual/range {v1 .. v7}, La/drf0;->b(Ljava/lang/String;DLjava/lang/String;La/csr;La/zje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-ne p0, v0, :cond_6

    .line 137
    .line 138
    :goto_4
    return-object v0

    .line 139
    :cond_6
    return-object p0
.end method
