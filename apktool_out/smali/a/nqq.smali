.class public final La/nqq;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/vld;
.implements La/fe60;
.implements La/rm40;
.implements La/yzj;


# instance fields
.field public final o:Z

.field public final p:Lkotlin/jvm/functions/Function2;

.field public q:Z

.field public r:Z

.field public final s:I

.field public t:La/ezg0;


# direct methods
.method public constructor <init>(ILkotlin/jvm/functions/Function2;I)V
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p3, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :cond_1
    and-int/lit8 p3, p3, 0x4

    .line 13
    .line 14
    if-eqz p3, :cond_2

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    :cond_2
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, p0, La/nqq;->o:Z

    .line 21
    .line 22
    iput-object p2, p0, La/nqq;->p:Lkotlin/jvm/functions/Function2;

    .line 23
    .line 24
    iput p1, p0, La/nqq;->s:I

    .line 25
    .line 26
    return-void
.end method

.method public static i1(La/nqq;)Z
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p0, v0}, La/nqq;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method


# virtual methods
.method public final O0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final R()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/nqq;->f1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final R0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final S0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/nqq;->e1()La/iqq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, La/cg80;->getFocusOwner()La/wpq;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p0}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    iget-boolean v2, v2, La/nqq;->o:Z

    .line 40
    .line 41
    if-ne v2, v1, :cond_4

    .line 42
    .line 43
    check-cast v0, La/ypq;

    .line 44
    .line 45
    iget-object v1, v0, La/ypq;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->E()Z

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, La/ypq;->d:La/tpq;

    .line 51
    .line 52
    invoke-virtual {v0}, La/tpq;->a()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, La/cg80;->getFocusOwner()La/wpq;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/ypq;

    .line 65
    .line 66
    const/16 v2, 0x8

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-virtual {v0, v2, v1, v3}, La/ypq;->d(IZZ)Z

    .line 70
    .line 71
    .line 72
    iget-boolean v1, p0, La/nqq;->o:Z

    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    iget-object v1, v0, La/ypq;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 77
    .line 78
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->E()Z

    .line 79
    .line 80
    .line 81
    :cond_3
    iget-object v0, v0, La/ypq;->d:La/tpq;

    .line 82
    .line 83
    invoke-virtual {v0}, La/tpq;->a()V

    .line 84
    .line 85
    .line 86
    :cond_4
    :goto_0
    iget-object v0, p0, La/nqq;->t:La/ezg0;

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    check-cast v0, La/nvu;

    .line 91
    .line 92
    invoke-virtual {v0}, La/nvu;->W()V

    .line 93
    .line 94
    .line 95
    :cond_5
    const/4 v0, 0x0

    .line 96
    iput-object v0, p0, La/nqq;->t:La/ezg0;

    .line 97
    .line 98
    return-void
.end method

.method public final T0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/nqq;->e1()La/iqq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/iqq;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, La/cg80;->getFocusOwner()La/wpq;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    check-cast p0, La/ypq;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-virtual {p0, v0, v1, v1}, La/ypq;->d(IZZ)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final Z0(I)Z
    .locals 1

    .line 1
    invoke-static {p0, p1}, La/qzb;->L0(La/nqq;I)La/ixf;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    if-eq p1, p0, :cond_2

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    if-ne p1, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    :cond_1
    return p0

    .line 26
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_3
    invoke-static {p0}, La/qzb;->M0(La/nqq;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final a1(La/iqq;La/iqq;)V
    .locals 10

    .line 1
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, La/cg80;->getFocusOwner()La/wpq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/ypq;

    .line 10
    .line 11
    invoke-virtual {v0}, La/ypq;->h()La/nqq;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, La/nqq;->p:Lkotlin/jvm/functions/Function2;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v2, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, La/lm40;->a:La/lm40;

    .line 29
    .line 30
    iget-boolean v2, p1, La/lm40;->n:Z

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    const-string v2, "visitAncestors called on an unattached node"

    .line 35
    .line 36
    invoke-static {v2}, La/xcx;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v2, p0, La/lm40;->a:La/lm40;

    .line 40
    .line 41
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_0
    if-eqz p0, :cond_e

    .line 46
    .line 47
    iget-object v3, p0, La/e7z;->h1:La/tzi;

    .line 48
    .line 49
    iget-object v3, v3, La/tzi;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, La/lm40;

    .line 52
    .line 53
    iget v3, v3, La/lm40;->d:I

    .line 54
    .line 55
    and-int/lit16 v3, v3, 0x1400

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    if-eqz v3, :cond_c

    .line 59
    .line 60
    :goto_1
    if-eqz v2, :cond_c

    .line 61
    .line 62
    iget v3, v2, La/lm40;->c:I

    .line 63
    .line 64
    and-int/lit16 v5, v3, 0x1400

    .line 65
    .line 66
    if-eqz v5, :cond_b

    .line 67
    .line 68
    if-eq v2, p1, :cond_2

    .line 69
    .line 70
    and-int/lit16 v5, v3, 0x400

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_2
    and-int/lit16 v3, v3, 0x1000

    .line 77
    .line 78
    if-eqz v3, :cond_b

    .line 79
    .line 80
    move-object v3, v2

    .line 81
    move-object v5, v4

    .line 82
    :goto_2
    if-eqz v3, :cond_b

    .line 83
    .line 84
    instance-of v6, v3, La/lpq;

    .line 85
    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    check-cast v3, La/lpq;

    .line 89
    .line 90
    invoke-virtual {v0}, La/ypq;->h()La/nqq;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eq v1, v6, :cond_3

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_3
    invoke-interface {v3, p2}, La/lpq;->L(La/iqq;)V

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_4
    iget v6, v3, La/lm40;->c:I

    .line 102
    .line 103
    and-int/lit16 v6, v6, 0x1000

    .line 104
    .line 105
    if-eqz v6, :cond_a

    .line 106
    .line 107
    instance-of v6, v3, La/f3k;

    .line 108
    .line 109
    if-eqz v6, :cond_a

    .line 110
    .line 111
    move-object v6, v3

    .line 112
    check-cast v6, La/f3k;

    .line 113
    .line 114
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    :goto_3
    const/4 v8, 0x1

    .line 118
    if-eqz v6, :cond_9

    .line 119
    .line 120
    iget v9, v6, La/lm40;->c:I

    .line 121
    .line 122
    and-int/lit16 v9, v9, 0x1000

    .line 123
    .line 124
    if-eqz v9, :cond_8

    .line 125
    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    if-ne v7, v8, :cond_5

    .line 129
    .line 130
    move-object v3, v6

    .line 131
    goto :goto_4

    .line 132
    :cond_5
    if-nez v5, :cond_6

    .line 133
    .line 134
    new-instance v5, La/xz40;

    .line 135
    .line 136
    const/16 v8, 0x10

    .line 137
    .line 138
    new-array v8, v8, [La/lm40;

    .line 139
    .line 140
    invoke-direct {v5, v8}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    if-eqz v3, :cond_7

    .line 144
    .line 145
    invoke-virtual {v5, v3}, La/xz40;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object v3, v4

    .line 149
    :cond_7
    invoke-virtual {v5, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_8
    :goto_4
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_9
    if-ne v7, v8, :cond_a

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_a
    :goto_5
    invoke-static {v5}, La/vcc;->V(La/xz40;)La/lm40;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    goto :goto_2

    .line 163
    :cond_b
    iget-object v2, v2, La/lm40;->e:La/lm40;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_c
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-eqz p0, :cond_d

    .line 171
    .line 172
    iget-object v2, p0, La/e7z;->h1:La/tzi;

    .line 173
    .line 174
    if-eqz v2, :cond_d

    .line 175
    .line 176
    iget-object v2, v2, La/tzi;->f:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, La/wso0;

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_d
    move-object v2, v4

    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_e
    :goto_6
    return-void
.end method

.method public final b1()La/aqq;
    .locals 12

    .line 1
    new-instance v0, La/aqq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, La/aqq;->a:Z

    .line 8
    .line 9
    sget-object v2, La/cqq;->b:La/cqq;

    .line 10
    .line 11
    iput-object v2, v0, La/aqq;->b:La/cqq;

    .line 12
    .line 13
    iput-object v2, v0, La/aqq;->c:La/cqq;

    .line 14
    .line 15
    iput-object v2, v0, La/aqq;->d:La/cqq;

    .line 16
    .line 17
    iput-object v2, v0, La/aqq;->e:La/cqq;

    .line 18
    .line 19
    iput-object v2, v0, La/aqq;->f:La/cqq;

    .line 20
    .line 21
    iput-object v2, v0, La/aqq;->g:La/cqq;

    .line 22
    .line 23
    iput-object v2, v0, La/aqq;->h:La/cqq;

    .line 24
    .line 25
    iput-object v2, v0, La/aqq;->i:La/cqq;

    .line 26
    .line 27
    new-instance v2, La/rnp;

    .line 28
    .line 29
    const/16 v3, 0xf

    .line 30
    .line 31
    invoke-direct {v2, v3}, La/rnp;-><init>(B)V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, La/aqq;->j:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    new-instance v2, La/rnp;

    .line 37
    .line 38
    const/16 v3, 0x10

    .line 39
    .line 40
    invoke-direct {v2, v3}, La/rnp;-><init>(B)V

    .line 41
    .line 42
    .line 43
    iput-object v2, v0, La/aqq;->k:Lkotlin/jvm/functions/Function1;

    .line 44
    .line 45
    sget-object v2, La/jtv;->j:La/jge0;

    .line 46
    .line 47
    iput-object v2, v0, La/aqq;->l:La/jge0;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    iget v4, p0, La/nqq;->s:I

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    if-ne v4, v1, :cond_0

    .line 54
    .line 55
    move v4, v1

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    if-nez v4, :cond_2

    .line 58
    .line 59
    sget-object v4, La/bmd;->m:La/zfn;

    .line 60
    .line 61
    invoke-static {p0, v4}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, La/afx;

    .line 66
    .line 67
    check-cast v4, La/bfx;

    .line 68
    .line 69
    iget-object v4, v4, La/bfx;->a:La/pz40;

    .line 70
    .line 71
    check-cast v4, La/hgk0;

    .line 72
    .line 73
    invoke-virtual {v4}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, La/zex;

    .line 78
    .line 79
    iget v4, v4, La/zex;->a:I

    .line 80
    .line 81
    if-ne v4, v1, :cond_1

    .line 82
    .line 83
    move v4, v1

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v4, v5

    .line 86
    :goto_0
    xor-int/2addr v4, v1

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const/4 v6, 0x2

    .line 89
    if-ne v4, v6, :cond_10

    .line 90
    .line 91
    move v4, v5

    .line 92
    :goto_1
    iput-boolean v4, v0, La/aqq;->a:Z

    .line 93
    .line 94
    iget-object v4, p0, La/lm40;->a:La/lm40;

    .line 95
    .line 96
    iget-boolean v6, v4, La/lm40;->n:Z

    .line 97
    .line 98
    if-nez v6, :cond_3

    .line 99
    .line 100
    const-string v6, "visitAncestors called on an unattached node"

    .line 101
    .line 102
    invoke-static {v6}, La/xcx;->b(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    iget-object v6, p0, La/lm40;->a:La/lm40;

    .line 106
    .line 107
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    :goto_2
    if-eqz p0, :cond_f

    .line 112
    .line 113
    iget-object v7, p0, La/e7z;->h1:La/tzi;

    .line 114
    .line 115
    iget-object v7, v7, La/tzi;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v7, La/lm40;

    .line 118
    .line 119
    iget v7, v7, La/lm40;->d:I

    .line 120
    .line 121
    and-int/lit16 v7, v7, 0xc00

    .line 122
    .line 123
    if-eqz v7, :cond_d

    .line 124
    .line 125
    :goto_3
    if-eqz v6, :cond_d

    .line 126
    .line 127
    iget v7, v6, La/lm40;->c:I

    .line 128
    .line 129
    and-int/lit16 v8, v7, 0xc00

    .line 130
    .line 131
    if-eqz v8, :cond_c

    .line 132
    .line 133
    if-eq v6, v4, :cond_4

    .line 134
    .line 135
    and-int/lit16 v8, v7, 0x400

    .line 136
    .line 137
    if-eqz v8, :cond_4

    .line 138
    .line 139
    goto/16 :goto_8

    .line 140
    .line 141
    :cond_4
    and-int/lit16 v7, v7, 0x800

    .line 142
    .line 143
    if-eqz v7, :cond_c

    .line 144
    .line 145
    move-object v8, v2

    .line 146
    move-object v7, v6

    .line 147
    :goto_4
    if-eqz v7, :cond_c

    .line 148
    .line 149
    instance-of v9, v7, La/bqq;

    .line 150
    .line 151
    if-eqz v9, :cond_5

    .line 152
    .line 153
    check-cast v7, La/bqq;

    .line 154
    .line 155
    invoke-interface {v7, v0}, La/bqq;->n(La/zpq;)V

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_5
    iget v9, v7, La/lm40;->c:I

    .line 160
    .line 161
    and-int/lit16 v9, v9, 0x800

    .line 162
    .line 163
    if-eqz v9, :cond_b

    .line 164
    .line 165
    instance-of v9, v7, La/f3k;

    .line 166
    .line 167
    if-eqz v9, :cond_b

    .line 168
    .line 169
    move-object v9, v7

    .line 170
    check-cast v9, La/f3k;

    .line 171
    .line 172
    iget-object v9, v9, La/f3k;->p:La/lm40;

    .line 173
    .line 174
    move v10, v5

    .line 175
    :goto_5
    if-eqz v9, :cond_a

    .line 176
    .line 177
    iget v11, v9, La/lm40;->c:I

    .line 178
    .line 179
    and-int/lit16 v11, v11, 0x800

    .line 180
    .line 181
    if-eqz v11, :cond_9

    .line 182
    .line 183
    add-int/lit8 v10, v10, 0x1

    .line 184
    .line 185
    if-ne v10, v1, :cond_6

    .line 186
    .line 187
    move-object v7, v9

    .line 188
    goto :goto_6

    .line 189
    :cond_6
    if-nez v8, :cond_7

    .line 190
    .line 191
    new-instance v8, La/xz40;

    .line 192
    .line 193
    new-array v11, v3, [La/lm40;

    .line 194
    .line 195
    invoke-direct {v8, v11}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_7
    if-eqz v7, :cond_8

    .line 199
    .line 200
    invoke-virtual {v8, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    move-object v7, v2

    .line 204
    :cond_8
    invoke-virtual {v8, v9}, La/xz40;->b(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_9
    :goto_6
    iget-object v9, v9, La/lm40;->f:La/lm40;

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_a
    if-ne v10, v1, :cond_b

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_b
    :goto_7
    invoke-static {v8}, La/vcc;->V(La/xz40;)La/lm40;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    goto :goto_4

    .line 218
    :cond_c
    iget-object v6, v6, La/lm40;->e:La/lm40;

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_d
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    if-eqz p0, :cond_e

    .line 226
    .line 227
    iget-object v6, p0, La/e7z;->h1:La/tzi;

    .line 228
    .line 229
    if-eqz v6, :cond_e

    .line 230
    .line 231
    iget-object v6, v6, La/tzi;->f:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v6, La/wso0;

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_e
    move-object v6, v2

    .line 237
    goto :goto_2

    .line 238
    :cond_f
    :goto_8
    return-object v0

    .line 239
    :cond_10
    const-string p0, "Unknown Focusability"

    .line 240
    .line 241
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-object v2
.end method

.method public final c1(La/j6z;)La/jge0;
    .locals 4

    .line 1
    invoke-virtual {p0}, La/nqq;->b1()La/aqq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/aqq;->l:La/jge0;

    .line 6
    .line 7
    sget-object v1, La/jtv;->j:La/jge0;

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {p0}, La/vcc;->Y(La/yzj;)La/s460;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p1, p0, v2, v3}, La/j6z;->F(La/j6z;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    invoke-virtual {v0, p0, p1}, La/jge0;->m(J)La/jge0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, La/vcc;->Y(La/yzj;)La/s460;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-interface {p1, p0, v0}, La/j6z;->w(La/j6z;Z)La/jge0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-static {p0}, La/vcc;->Y(La/yzj;)La/s460;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-wide p0, p0, La/pu90;->c:J

    .line 46
    .line 47
    invoke-static {p0, p1}, La/n2x;->Q(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    invoke-static {v2, v3, p0, p1}, La/k9x;->r(JJ)La/jge0;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final d1()La/taz;
    .locals 6

    .line 1
    iget-object v0, p0, La/lm40;->a:La/lm40;

    .line 2
    .line 3
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, La/lm40;->a:La/lm40;

    .line 13
    .line 14
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 15
    .line 16
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    const/4 v1, 0x0

    .line 21
    if-eqz p0, :cond_d

    .line 22
    .line 23
    iget-object v2, p0, La/e7z;->h1:La/tzi;

    .line 24
    .line 25
    iget-object v2, v2, La/tzi;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, La/lm40;

    .line 28
    .line 29
    iget v2, v2, La/lm40;->d:I

    .line 30
    .line 31
    const v3, 0x800020

    .line 32
    .line 33
    .line 34
    and-int/2addr v2, v3

    .line 35
    if-eqz v2, :cond_b

    .line 36
    .line 37
    :goto_1
    if-eqz v0, :cond_b

    .line 38
    .line 39
    iget v2, v0, La/lm40;->c:I

    .line 40
    .line 41
    and-int v4, v2, v3

    .line 42
    .line 43
    if-eqz v4, :cond_a

    .line 44
    .line 45
    const/high16 v4, 0x800000

    .line 46
    .line 47
    and-int/2addr v4, v2

    .line 48
    if-eqz v4, :cond_5

    .line 49
    .line 50
    instance-of p0, v0, La/taz;

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_1
    instance-of p0, v0, La/f3k;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    check-cast v0, La/f3k;

    .line 60
    .line 61
    iget-object p0, v0, La/f3k;->p:La/lm40;

    .line 62
    .line 63
    move-object v0, v1

    .line 64
    :goto_2
    if-eqz p0, :cond_4

    .line 65
    .line 66
    instance-of v2, p0, La/taz;

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    move-object v0, p0

    .line 71
    :cond_2
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v0, v1

    .line 75
    :cond_4
    :goto_3
    check-cast v0, La/taz;

    .line 76
    .line 77
    if-eqz v0, :cond_d

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_5
    and-int/lit8 v2, v2, 0x20

    .line 81
    .line 82
    if-eqz v2, :cond_a

    .line 83
    .line 84
    instance-of v2, v0, La/rm40;

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    move-object v4, v0

    .line 89
    goto :goto_5

    .line 90
    :cond_6
    instance-of v2, v0, La/f3k;

    .line 91
    .line 92
    if-eqz v2, :cond_8

    .line 93
    .line 94
    move-object v2, v0

    .line 95
    check-cast v2, La/f3k;

    .line 96
    .line 97
    iget-object v2, v2, La/f3k;->p:La/lm40;

    .line 98
    .line 99
    move-object v4, v1

    .line 100
    :goto_4
    if-eqz v2, :cond_9

    .line 101
    .line 102
    instance-of v5, v2, La/rm40;

    .line 103
    .line 104
    if-eqz v5, :cond_7

    .line 105
    .line 106
    move-object v4, v2

    .line 107
    :cond_7
    iget-object v2, v2, La/lm40;->f:La/lm40;

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    move-object v4, v1

    .line 111
    :cond_9
    :goto_5
    check-cast v4, La/rm40;

    .line 112
    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    invoke-interface {v4}, La/rm40;->I()La/azw;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    sget-object v5, La/x4d0;->a:La/i5d0;

    .line 120
    .line 121
    invoke-virtual {v2, v5}, La/azw;->D(La/i5d0;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_a

    .line 126
    .line 127
    invoke-interface {v4}, La/rm40;->I()La/azw;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, La/azw;->E()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, La/taz;

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_a
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_b
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_c

    .line 146
    .line 147
    iget-object v0, p0, La/e7z;->h1:La/tzi;

    .line 148
    .line 149
    if-eqz v0, :cond_c

    .line 150
    .line 151
    iget-object v0, v0, La/tzi;->f:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, La/wso0;

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_c
    move-object v0, v1

    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_d
    return-object v1
.end method

.method public final e1()La/iqq;
    .locals 9

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, La/iqq;->c:La/iqq;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, La/cg80;->getFocusOwner()La/wpq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, La/ypq;

    .line 17
    .line 18
    invoke-virtual {v0}, La/ypq;->h()La/nqq;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object p0, La/iqq;->c:La/iqq;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    if-ne p0, v0, :cond_2

    .line 28
    .line 29
    sget-object p0, La/iqq;->a:La/iqq;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    iget-boolean v1, v0, La/lm40;->n:Z

    .line 33
    .line 34
    if-eqz v1, :cond_e

    .line 35
    .line 36
    iget-object v1, v0, La/lm40;->a:La/lm40;

    .line 37
    .line 38
    iget-boolean v1, v1, La/lm40;->n:Z

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    const-string v1, "visitAncestors called on an unattached node"

    .line 43
    .line 44
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object v1, v0, La/lm40;->a:La/lm40;

    .line 48
    .line 49
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 50
    .line 51
    invoke-static {v0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    if-eqz v0, :cond_e

    .line 56
    .line 57
    iget-object v2, v0, La/e7z;->h1:La/tzi;

    .line 58
    .line 59
    iget-object v2, v2, La/tzi;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, La/lm40;

    .line 62
    .line 63
    iget v2, v2, La/lm40;->d:I

    .line 64
    .line 65
    and-int/lit16 v2, v2, 0x400

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    if-eqz v2, :cond_c

    .line 69
    .line 70
    :goto_1
    if-eqz v1, :cond_c

    .line 71
    .line 72
    iget v2, v1, La/lm40;->c:I

    .line 73
    .line 74
    and-int/lit16 v2, v2, 0x400

    .line 75
    .line 76
    if-eqz v2, :cond_b

    .line 77
    .line 78
    move-object v2, v1

    .line 79
    move-object v4, v3

    .line 80
    :goto_2
    if-eqz v2, :cond_b

    .line 81
    .line 82
    instance-of v5, v2, La/nqq;

    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    check-cast v2, La/nqq;

    .line 87
    .line 88
    if-ne p0, v2, :cond_a

    .line 89
    .line 90
    sget-object p0, La/iqq;->b:La/iqq;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_4
    iget v5, v2, La/lm40;->c:I

    .line 94
    .line 95
    and-int/lit16 v5, v5, 0x400

    .line 96
    .line 97
    if-eqz v5, :cond_a

    .line 98
    .line 99
    instance-of v5, v2, La/f3k;

    .line 100
    .line 101
    if-eqz v5, :cond_a

    .line 102
    .line 103
    move-object v5, v2

    .line 104
    check-cast v5, La/f3k;

    .line 105
    .line 106
    iget-object v5, v5, La/f3k;->p:La/lm40;

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    :goto_3
    const/4 v7, 0x1

    .line 110
    if-eqz v5, :cond_9

    .line 111
    .line 112
    iget v8, v5, La/lm40;->c:I

    .line 113
    .line 114
    and-int/lit16 v8, v8, 0x400

    .line 115
    .line 116
    if-eqz v8, :cond_8

    .line 117
    .line 118
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    if-ne v6, v7, :cond_5

    .line 121
    .line 122
    move-object v2, v5

    .line 123
    goto :goto_4

    .line 124
    :cond_5
    if-nez v4, :cond_6

    .line 125
    .line 126
    new-instance v4, La/xz40;

    .line 127
    .line 128
    const/16 v7, 0x10

    .line 129
    .line 130
    new-array v7, v7, [La/lm40;

    .line 131
    .line 132
    invoke-direct {v4, v7}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    if-eqz v2, :cond_7

    .line 136
    .line 137
    invoke-virtual {v4, v2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move-object v2, v3

    .line 141
    :cond_7
    invoke-virtual {v4, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    :goto_4
    iget-object v5, v5, La/lm40;->f:La/lm40;

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_9
    if-ne v6, v7, :cond_a

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    invoke-static {v4}, La/vcc;->V(La/xz40;)La/lm40;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    goto :goto_2

    .line 155
    :cond_b
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_c
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-eqz v0, :cond_d

    .line 163
    .line 164
    iget-object v1, v0, La/e7z;->h1:La/tzi;

    .line 165
    .line 166
    if-eqz v1, :cond_d

    .line 167
    .line 168
    iget-object v1, v1, La/tzi;->f:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, La/wso0;

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_d
    move-object v1, v3

    .line 174
    goto :goto_0

    .line 175
    :cond_e
    sget-object p0, La/iqq;->c:La/iqq;

    .line 176
    .line 177
    return-object p0
.end method

.method public final f1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/nqq;->e1()La/iqq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    if-ne v0, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, La/mie0;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v2, La/gmo;

    .line 31
    .line 32
    const/16 v3, 0xe

    .line 33
    .line 34
    invoke-direct {v2, v0, p0, v3}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v2}, La/c9x;->B(La/lm40;Lkotlin/jvm/functions/Function0;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    check-cast v0, La/zpq;

    .line 45
    .line 46
    invoke-interface {v0}, La/zpq;->d()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p0}, La/cg80;->getFocusOwner()La/wpq;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/ypq;

    .line 61
    .line 62
    invoke-virtual {p0, v1}, La/ypq;->b(Z)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void

    .line 66
    :cond_3
    const-string p0, "focusProperties"

    .line 67
    .line 68
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0
.end method

.method public final g1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final h1(I)Z
    .locals 2

    .line 1
    const-string v0, "FocusTransactions:requestFocus"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, La/nqq;->b1()La/aqq;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-boolean v0, v0, La/aqq;->a:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/nqq;->Z0(I)Z

    .line 15
    .line 16
    .line 17
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return p0

    .line 22
    :cond_0
    :try_start_1
    new-instance v0, La/dx2;

    .line 23
    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, La/dx2;-><init>(IB)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1, v0}, La/k7n0;->t(La/nqq;ILkotlin/jvm/functions/Function1;)Z

    .line 30
    .line 31
    .line 32
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 34
    .line 35
    .line 36
    return p0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 39
    .line 40
    .line 41
    throw p0
.end method
