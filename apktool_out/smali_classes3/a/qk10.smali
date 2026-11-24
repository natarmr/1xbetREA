.class public final La/qk10;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/rk10;)La/csr;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/csr;

    .line 5
    .line 6
    new-instance v1, La/bsr;

    .line 7
    .line 8
    iget-object v2, p0, La/rk10;->a:La/uk10;

    .line 9
    .line 10
    const/4 v7, -0x1

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    move v2, v7

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v3, La/pk10;->a:[I

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    aget v2, v3, v2

    .line 22
    .line 23
    :goto_0
    const/4 v8, 0x2

    .line 24
    const/4 v9, 0x1

    .line 25
    if-eq v2, v9, :cond_5

    .line 26
    .line 27
    if-eq v2, v8, :cond_4

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    if-eq v2, v3, :cond_3

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    if-eq v2, v3, :cond_2

    .line 34
    .line 35
    const/4 v3, 0x5

    .line 36
    if-eq v2, v3, :cond_1

    .line 37
    .line 38
    sget-object v2, La/esr;->c:La/esr;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    sget-object v2, La/esr;->i:La/esr;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    sget-object v2, La/esr;->g:La/esr;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    sget-object v2, La/esr;->f:La/esr;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    sget-object v2, La/esr;->e:La/esr;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_5
    sget-object v2, La/esr;->d:La/esr;

    .line 54
    .line 55
    :goto_1
    iget-wide v3, p0, La/rk10;->c:J

    .line 56
    .line 57
    iget-object v5, p0, La/rk10;->g:Ljava/lang/Double;

    .line 58
    .line 59
    if-eqz v5, :cond_6

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    goto :goto_2

    .line 66
    :cond_6
    const-wide/16 v5, 0x0

    .line 67
    .line 68
    :goto_2
    invoke-direct/range {v1 .. v6}, La/bsr;-><init>(La/esr;JD)V

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, La/rk10;->b:Ljava/lang/String;

    .line 72
    .line 73
    if-nez v2, :cond_7

    .line 74
    .line 75
    const-string v2, ""

    .line 76
    .line 77
    :cond_7
    iget-object v3, p0, La/rk10;->d:La/de8;

    .line 78
    .line 79
    if-nez v3, :cond_8

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_8
    sget-object v4, La/pk10;->b:[I

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    aget v7, v4, v3

    .line 89
    .line 90
    :goto_3
    if-eq v7, v9, :cond_a

    .line 91
    .line 92
    if-eq v7, v8, :cond_9

    .line 93
    .line 94
    sget-object v3, La/dsr;->b:La/dsr;

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_9
    sget-object v3, La/dsr;->d:La/dsr;

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_a
    sget-object v3, La/dsr;->c:La/dsr;

    .line 101
    .line 102
    :goto_4
    iget-wide v4, p0, La/rk10;->e:J

    .line 103
    .line 104
    invoke-direct/range {v0 .. v5}, La/csr;-><init>(La/bsr;Ljava/lang/String;La/dsr;J)V

    .line 105
    .line 106
    .line 107
    return-object v0
.end method


# virtual methods
.method public final serializer()La/jiy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/jiy;"
        }
    .end annotation

    .line 1
    sget-object p0, La/ok10;->a:La/ok10;

    .line 2
    .line 3
    return-object p0
.end method
