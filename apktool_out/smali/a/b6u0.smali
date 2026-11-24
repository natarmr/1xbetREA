.class public final La/b6u0;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/ehl;


# instance fields
.field public o:La/vls0;

.field public p:La/pzn;

.field public q:La/alo;

.field public r:La/toj0;


# virtual methods
.method public final u0(La/g7z;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, La/g7z;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, La/b6u0;->o:La/vls0;

    .line 7
    .line 8
    new-instance v2, La/a6u0;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v0, v3}, La/a6u0;-><init>(La/b6u0;B)V

    .line 12
    .line 13
    .line 14
    iget-object v3, v0, La/b6u0;->r:La/toj0;

    .line 15
    .line 16
    invoke-virtual {v3}, La/toj0;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    iget-wide v3, v3, La/toj0;->e:J

    .line 24
    .line 25
    new-instance v6, La/y3d;

    .line 26
    .line 27
    invoke-direct {v6, v3, v4}, La/y3d;-><init>(J)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v6, v5

    .line 32
    :goto_0
    new-instance v3, La/a6u0;

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-direct {v3, v0, v4}, La/a6u0;-><init>(La/b6u0;B)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2, v6, v5, v3}, La/vls0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;La/t73;Lkotlin/jvm/functions/Function1;)La/uls0;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v2, v0, La/b6u0;->r:La/toj0;

    .line 43
    .line 44
    invoke-virtual {v1}, La/uls0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, La/y3d;

    .line 49
    .line 50
    iget-wide v3, v1, La/y3d;->a:J

    .line 51
    .line 52
    iget-object v1, v2, La/toj0;->c:La/sd60;

    .line 53
    .line 54
    invoke-virtual {v2}, La/toj0;->b()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    iget-object v5, v1, La/sd60;->h:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v5, La/pz40;

    .line 63
    .line 64
    check-cast v5, La/hgk0;

    .line 65
    .line 66
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_1

    .line 77
    .line 78
    iget-object v1, v1, La/sd60;->i:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, La/pz40;

    .line 81
    .line 82
    check-cast v1, La/hgk0;

    .line 83
    .line 84
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, La/y3d;

    .line 89
    .line 90
    iget-wide v3, v1, La/y3d;->a:J

    .line 91
    .line 92
    :cond_1
    move-wide v6, v3

    .line 93
    invoke-virtual {v2}, La/toj0;->b()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    iput-wide v6, v2, La/toj0;->e:J

    .line 100
    .line 101
    :cond_2
    invoke-static {v6, v7}, La/y3d;->d(J)F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    const/4 v2, 0x0

    .line 106
    cmpg-float v1, v1, v2

    .line 107
    .line 108
    if-nez v1, :cond_3

    .line 109
    .line 110
    return-void

    .line 111
    :cond_3
    iget-object v1, v0, La/b6u0;->p:La/pzn;

    .line 112
    .line 113
    iget-object v1, v1, La/pzn;->a:La/jms0;

    .line 114
    .line 115
    iget-object v0, v0, La/b6u0;->q:La/alo;

    .line 116
    .line 117
    iget-object v0, v0, La/alo;->a:La/jms0;

    .line 118
    .line 119
    const/4 v15, 0x0

    .line 120
    const/16 v16, 0x7e

    .line 121
    .line 122
    const-wide/16 v8, 0x0

    .line 123
    .line 124
    const-wide/16 v10, 0x0

    .line 125
    .line 126
    const/4 v12, 0x0

    .line 127
    const/4 v13, 0x0

    .line 128
    const/4 v14, 0x0

    .line 129
    move-object/from16 v5, p1

    .line 130
    .line 131
    invoke-static/range {v5 .. v16}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 132
    .line 133
    .line 134
    return-void
.end method
