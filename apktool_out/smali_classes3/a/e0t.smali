.class public abstract La/e0t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/d0t;La/ctf0;La/y78;ZZLa/wcb;Ljava/util/List;)La/b0s;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v4, v2

    .line 32
    check-cast v4, La/lok0;

    .line 33
    .line 34
    iget v4, v4, La/lok0;->a:I

    .line 35
    .line 36
    iget v5, p0, La/d0t;->O:I

    .line 37
    .line 38
    if-ne v4, v5, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v2, v3

    .line 42
    :goto_0
    check-cast v2, La/lok0;

    .line 43
    .line 44
    iget-wide v4, p0, La/d0t;->v:J

    .line 45
    .line 46
    iget-wide v6, p0, La/d0t;->u:J

    .line 47
    .line 48
    invoke-virtual {p5, v4, v5, v6, v7}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    new-instance v6, Ljava/util/ArrayList;

    .line 53
    .line 54
    const/16 v1, 0xa

    .line 55
    .line 56
    move-object/from16 v4, p6

    .line 57
    .line 58
    invoke-static {v4, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, La/lok0;

    .line 80
    .line 81
    iget v4, v4, La/lok0;->a:I

    .line 82
    .line 83
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    const/4 v1, 0x0

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    iget-boolean v4, v2, La/lok0;->n:Z

    .line 95
    .line 96
    move v7, v4

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    move v7, v1

    .line 99
    :goto_2
    if-eqz v2, :cond_4

    .line 100
    .line 101
    iget-boolean v1, v2, La/lok0;->p:Z

    .line 102
    .line 103
    :cond_4
    move v8, v1

    .line 104
    if-eqz v2, :cond_5

    .line 105
    .line 106
    iget-object v3, v2, La/lok0;->u:Ljava/lang/String;

    .line 107
    .line 108
    :cond_5
    if-nez v3, :cond_6

    .line 109
    .line 110
    const-string v3, ""

    .line 111
    .line 112
    :cond_6
    move-object v0, p0

    .line 113
    move-object v1, p1

    .line 114
    move-object v2, p2

    .line 115
    move v4, p4

    .line 116
    move-object v9, v3

    .line 117
    move v3, p3

    .line 118
    invoke-static/range {v0 .. v9}, La/fxb;->Q(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;Ljava/util/ArrayList;ZZLjava/lang/String;)La/b0s;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0
.end method
