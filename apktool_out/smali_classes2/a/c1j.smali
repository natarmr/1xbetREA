.class public final La/c1j;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public o:La/b4j;

.field public p:La/je;


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/t0j;

    .line 2
    .line 3
    iget-object v0, p0, La/c1j;->p:La/je;

    .line 4
    .line 5
    iget-object v1, p0, La/c1j;->o:La/b4j;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    instance-of v2, p1, La/p0j;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    instance-of v2, p1, La/q0j;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 26
    .line 27
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 28
    .line 29
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, La/z0j;

    .line 38
    .line 39
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-object v1, p1

    .line 45
    check-cast v1, La/q0j;

    .line 46
    .line 47
    iget-wide v3, v1, La/q0j;->a:J

    .line 48
    .line 49
    iget v5, v1, La/q0j;->b:I

    .line 50
    .line 51
    iget v1, v1, La/q0j;->c:I

    .line 52
    .line 53
    new-instance v6, La/z0j;

    .line 54
    .line 55
    invoke-direct {v6, v5, v1, v3, v4}, La/z0j;-><init>(IIJ)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v0, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    instance-of v2, p1, La/r0j;

    .line 66
    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, La/z0j;

    .line 74
    .line 75
    iget p1, p1, La/z0j;->c:I

    .line 76
    .line 77
    const-string v2, "onboard_more"

    .line 78
    .line 79
    invoke-virtual {v1, p1, v2}, La/b4j;->e(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, La/z0j;

    .line 87
    .line 88
    iget p1, p1, La/z0j;->c:I

    .line 89
    .line 90
    invoke-virtual {v0, p1, v2}, La/je;->c(ILjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance p1, La/x0j;

    .line 94
    .line 95
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/z0j;

    .line 100
    .line 101
    iget-wide v0, v0, La/z0j;->a:J

    .line 102
    .line 103
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, La/z0j;

    .line 108
    .line 109
    iget v2, v2, La/z0j;->b:I

    .line 110
    .line 111
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, La/z0j;

    .line 116
    .line 117
    iget v3, v3, La/z0j;->c:I

    .line 118
    .line 119
    invoke-direct {p1, v2, v3, v0, v1}, La/x0j;-><init>(IIJ)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    instance-of p1, p1, La/s0j;

    .line 127
    .line 128
    if-eqz p1, :cond_4

    .line 129
    .line 130
    iget-object p1, v1, La/b4j;->a:La/kt2;

    .line 131
    .line 132
    const-string v1, "dchallenge_section_more_close"

    .line 133
    .line 134
    const-string v2, "position"

    .line 135
    .line 136
    const-string v3, "button"

    .line 137
    .line 138
    invoke-static {v2, v3, p1, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object p1, v0, La/je;->a:La/s1p;

    .line 142
    .line 143
    const-wide/16 v0, 0x2ab8

    .line 144
    .line 145
    invoke-static {v3, p1, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 146
    .line 147
    .line 148
    sget-object p1, La/w0j;->a:La/w0j;

    .line 149
    .line 150
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 155
    .line 156
    .line 157
    return-void
.end method
