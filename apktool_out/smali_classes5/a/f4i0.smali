.class public final La/f4i0;
.super La/i3t0;
.source "SourceFile"


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 11

    .line 1
    check-cast p1, La/u1i0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/s1i0;->a:La/s1i0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget-object v1, La/z1i0;->a:La/z1i0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    instance-of v0, p1, La/r1i0;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/l2i0;

    .line 33
    .line 34
    iget-object v2, v2, La/l2i0;->c:Ljava/lang/Long;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3, v0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 v0, 0x0

    .line 51
    :goto_0
    check-cast p1, La/r1i0;

    .line 52
    .line 53
    iget-object p1, p1, La/r1i0;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    new-instance v0, La/h2i0;

    .line 62
    .line 63
    iget v1, p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 64
    .line 65
    iget v2, p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->b:I

    .line 66
    .line 67
    add-int/lit8 v2, v2, -0x1

    .line 68
    .line 69
    iget p1, p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->c:I

    .line 70
    .line 71
    invoke-direct {v0, v1, v2, p1}, La/h2i0;-><init>(III)V

    .line 72
    .line 73
    .line 74
    new-instance p1, La/a2i0;

    .line 75
    .line 76
    invoke-direct {p1, v0}, La/a2i0;-><init>(La/h2i0;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    sget-object v0, La/q1i0;->a:La/q1i0;

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    instance-of p1, p1, La/t1i0;

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 104
    .line 105
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 106
    .line 107
    :cond_5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-object v1, v0

    .line 115
    check-cast v1, La/l2i0;

    .line 116
    .line 117
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-wide v4, v1, La/l2i0;->a:J

    .line 123
    .line 124
    iget-wide v6, v1, La/l2i0;->b:J

    .line 125
    .line 126
    iget-object v8, v1, La/l2i0;->c:Ljava/lang/Long;

    .line 127
    .line 128
    iget-object v9, v1, La/l2i0;->d:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v3, La/l2i0;

    .line 134
    .line 135
    const/4 v10, 0x1

    .line 136
    invoke-direct/range {v3 .. v10}, La/l2i0;-><init>(JJLjava/lang/Long;Ljava/lang/String;Z)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    return-void

    .line 146
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 147
    .line 148
    .line 149
    return-void
.end method
