.class public final La/ek50;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/hps0;
.implements La/vj50;


# instance fields
.field public o:La/vj50;

.field public p:La/yj50;

.field public q:La/ek50;

.field public final r:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/vj50;La/yj50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ek50;->o:La/vj50;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, La/yj50;

    .line 9
    .line 10
    invoke-direct {p2}, La/yj50;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p2, p0, La/ek50;->p:La/yj50;

    .line 14
    .line 15
    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    .line 16
    .line 17
    iput-object p1, p0, La/ek50;->r:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 2

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/ek50;->a1()La/ek50;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, La/ek50;->C(IJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    :goto_1
    iget-object p0, p0, La/ek50;->o:La/vj50;

    .line 21
    .line 22
    invoke-static {p2, p3, v0, v1}, La/ne60;->e(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p2

    .line 26
    invoke-interface {p0, p1, p2, p3}, La/vj50;->C(IJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    invoke-static {v0, v1, p0, p1}, La/ne60;->f(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0
.end method

.method public final I0(JLa/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, La/dk50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/dk50;

    .line 7
    .line 8
    iget v1, v0, La/dk50;->l:I

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
    iput v1, v0, La/dk50;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/dk50;

    .line 21
    .line 22
    check-cast p3, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, La/dk50;-><init>(La/ek50;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, La/dk50;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/dk50;->l:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-wide p0, v0, La/dk50;->i:J

    .line 43
    .line 44
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-wide p1, v0, La/dk50;->i:J

    .line 55
    .line 56
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-boolean p3, p0, La/lm40;->n:Z

    .line 64
    .line 65
    if-eqz p3, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, La/ek50;->a1()La/ek50;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :cond_4
    if-eqz v3, :cond_6

    .line 72
    .line 73
    iput-wide p1, v0, La/dk50;->i:J

    .line 74
    .line 75
    iput v5, v0, La/dk50;->l:I

    .line 76
    .line 77
    invoke-virtual {v3, p1, p2, v0}, La/ek50;->I0(JLa/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    if-ne p3, v1, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    :goto_1
    check-cast p3, La/g6u0;

    .line 85
    .line 86
    iget-wide v2, p3, La/g6u0;->a:J

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    const-wide/16 v2, 0x0

    .line 90
    .line 91
    :goto_2
    iget-object p0, p0, La/ek50;->o:La/vj50;

    .line 92
    .line 93
    invoke-static {p1, p2, v2, v3}, La/g6u0;->d(JJ)J

    .line 94
    .line 95
    .line 96
    move-result-wide p1

    .line 97
    iput-wide v2, v0, La/dk50;->i:J

    .line 98
    .line 99
    iput v4, v0, La/dk50;->l:I

    .line 100
    .line 101
    invoke-interface {p0, p1, p2, v0}, La/vj50;->I0(JLa/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    if-ne p3, v1, :cond_7

    .line 106
    .line 107
    :goto_3
    return-object v1

    .line 108
    :cond_7
    move-wide p0, v2

    .line 109
    :goto_4
    check-cast p3, La/g6u0;

    .line 110
    .line 111
    iget-wide p2, p3, La/g6u0;->a:J

    .line 112
    .line 113
    invoke-static {p0, p1, p2, p3}, La/g6u0;->e(JJ)J

    .line 114
    .line 115
    .line 116
    move-result-wide p0

    .line 117
    new-instance p2, La/g6u0;

    .line 118
    .line 119
    invoke-direct {p2, p0, p1}, La/g6u0;-><init>(J)V

    .line 120
    .line 121
    .line 122
    return-object p2
.end method

.method public final R0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/ek50;->p:La/yj50;

    .line 2
    .line 3
    iput-object p0, v0, La/yj50;->a:La/ek50;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, La/yj50;->b:La/ek50;

    .line 7
    .line 8
    iput-object v1, p0, La/ek50;->q:La/ek50;

    .line 9
    .line 10
    new-instance v1, La/np30;

    .line 11
    .line 12
    const/16 v2, 0x13

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, La/yj50;->c:Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iput-object p0, v0, La/yj50;->d:La/vne;

    .line 24
    .line 25
    return-void
.end method

.method public final S(IJJ)J
    .locals 6

    .line 1
    iget-object v0, p0, La/ek50;->o:La/vj50;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-interface/range {v0 .. v5}, La/vj50;->S(IJJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iget-boolean p3, p0, La/lm40;->n:Z

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, La/ek50;->a1()La/ek50;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    move-object v0, p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {v2, v3, p1, p2}, La/ne60;->f(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v4, v5, p1, p2}, La/ne60;->e(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-virtual/range {v0 .. v5}, La/ek50;->S(IJJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p3

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    const-wide/16 p3, 0x0

    .line 38
    .line 39
    :goto_2
    invoke-static {p1, p2, p3, p4}, La/ne60;->f(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide p0

    .line 43
    return-wide p0
.end method

.method public final S0()V
    .locals 3

    .line 1
    new-instance v0, La/mie0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/cx2;

    .line 7
    .line 8
    const/4 v2, 0x7

    .line 9
    invoke-direct {v1, v0, v2}, La/cx2;-><init>(La/mie0;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, La/etm0;->u(La/hps0;Lkotlin/jvm/functions/Function1;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/hps0;

    .line 18
    .line 19
    check-cast v0, La/ek50;

    .line 20
    .line 21
    iput-object v0, p0, La/ek50;->q:La/ek50;

    .line 22
    .line 23
    iget-object v1, p0, La/ek50;->p:La/yj50;

    .line 24
    .line 25
    iput-object v0, v1, La/yj50;->b:La/ek50;

    .line 26
    .line 27
    iget-object v0, v1, La/yj50;->a:La/ek50;

    .line 28
    .line 29
    if-ne v0, p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    iput-object p0, v1, La/yj50;->a:La/ek50;

    .line 33
    .line 34
    iput-object p0, v1, La/yj50;->d:La/vne;

    .line 35
    .line 36
    sget-object p0, La/knx;->h:La/th50;

    .line 37
    .line 38
    iput-object p0, v1, La/yj50;->c:Lkotlin/jvm/functions/Function0;

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final Z0()La/vne;
    .locals 4

    .line 1
    invoke-virtual {p0}, La/ek50;->a1()La/ek50;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, La/ek50;->Z0()La/vne;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    if-ne v2, v3, :cond_1

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    iget-object p0, p0, La/ek50;->p:La/yj50;

    .line 25
    .line 26
    iget-object p0, p0, La/yj50;->d:La/vne;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    const-string p0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 32
    .line 33
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method

.method public final a1()La/ek50;
    .locals 10

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    iget-object v0, p0, La/lm40;->a:La/lm40;

    .line 7
    .line 8
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "visitAncestors called on an unattached node"

    .line 13
    .line 14
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, La/lm40;->a:La/lm40;

    .line 18
    .line 19
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 20
    .line 21
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    if-eqz v2, :cond_b

    .line 26
    .line 27
    iget-object v3, v2, La/e7z;->h1:La/tzi;

    .line 28
    .line 29
    iget-object v3, v3, La/tzi;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, La/lm40;

    .line 32
    .line 33
    iget v3, v3, La/lm40;->d:I

    .line 34
    .line 35
    const/high16 v4, 0x40000

    .line 36
    .line 37
    and-int/2addr v3, v4

    .line 38
    if-eqz v3, :cond_9

    .line 39
    .line 40
    :goto_1
    if-eqz v0, :cond_9

    .line 41
    .line 42
    iget v3, v0, La/lm40;->c:I

    .line 43
    .line 44
    and-int/2addr v3, v4

    .line 45
    if-eqz v3, :cond_8

    .line 46
    .line 47
    move-object v3, v0

    .line 48
    move-object v5, v1

    .line 49
    :goto_2
    if-eqz v3, :cond_8

    .line 50
    .line 51
    instance-of v6, v3, La/hps0;

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    move-object v6, v3

    .line 56
    check-cast v6, La/hps0;

    .line 57
    .line 58
    iget-object v7, p0, La/ek50;->r:Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {v6}, La/hps0;->j()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_1

    .line 69
    .line 70
    const-class v7, La/ek50;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    if-ne v7, v8, :cond_1

    .line 77
    .line 78
    move-object v1, v6

    .line 79
    goto :goto_5

    .line 80
    :cond_1
    iget v6, v3, La/lm40;->c:I

    .line 81
    .line 82
    and-int/2addr v6, v4

    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    instance-of v6, v3, La/f3k;

    .line 86
    .line 87
    if-eqz v6, :cond_7

    .line 88
    .line 89
    move-object v6, v3

    .line 90
    check-cast v6, La/f3k;

    .line 91
    .line 92
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    :goto_3
    const/4 v8, 0x1

    .line 96
    if-eqz v6, :cond_6

    .line 97
    .line 98
    iget v9, v6, La/lm40;->c:I

    .line 99
    .line 100
    and-int/2addr v9, v4

    .line 101
    if-eqz v9, :cond_5

    .line 102
    .line 103
    add-int/lit8 v7, v7, 0x1

    .line 104
    .line 105
    if-ne v7, v8, :cond_2

    .line 106
    .line 107
    move-object v3, v6

    .line 108
    goto :goto_4

    .line 109
    :cond_2
    if-nez v5, :cond_3

    .line 110
    .line 111
    new-instance v5, La/xz40;

    .line 112
    .line 113
    const/16 v8, 0x10

    .line 114
    .line 115
    new-array v8, v8, [La/lm40;

    .line 116
    .line 117
    invoke-direct {v5, v8}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    if-eqz v3, :cond_4

    .line 121
    .line 122
    invoke-virtual {v5, v3}, La/xz40;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    move-object v3, v1

    .line 126
    :cond_4
    invoke-virtual {v5, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_4
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    if-ne v7, v8, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    invoke-static {v5}, La/vcc;->V(La/xz40;)La/lm40;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    goto :goto_2

    .line 140
    :cond_8
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_9
    invoke-virtual {v2}, La/e7z;->v()La/e7z;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    if-eqz v2, :cond_a

    .line 148
    .line 149
    iget-object v0, v2, La/e7z;->h1:La/tzi;

    .line 150
    .line 151
    if-eqz v0, :cond_a

    .line 152
    .line 153
    iget-object v0, v0, La/tzi;->f:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, La/wso0;

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_a
    move-object v0, v1

    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_b
    :goto_5
    check-cast v1, La/ek50;

    .line 163
    .line 164
    :cond_c
    return-object v1
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, La/ck50;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/ck50;

    .line 9
    .line 10
    iget v2, v1, La/ck50;->m:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/ck50;->m:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, La/ck50;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, La/ck50;-><init>(La/ek50;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v7, La/ck50;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v1, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v7, La/ck50;->m:I

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x2

    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v3, :cond_2

    .line 41
    .line 42
    if-ne v2, v9, :cond_1

    .line 43
    .line 44
    iget-wide p0, v7, La/ck50;->i:J

    .line 45
    .line 46
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_6

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v8

    .line 56
    :cond_2
    iget-wide p1, v7, La/ck50;->j:J

    .line 57
    .line 58
    iget-wide v2, v7, La/ck50;->i:J

    .line 59
    .line 60
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-wide v10, v2

    .line 64
    move-wide v2, p1

    .line 65
    move-wide p1, v10

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, La/ek50;->o:La/vj50;

    .line 71
    .line 72
    iput-wide p1, v7, La/ck50;->i:J

    .line 73
    .line 74
    move-wide v5, p3

    .line 75
    iput-wide v5, v7, La/ck50;->j:J

    .line 76
    .line 77
    iput v3, v7, La/ck50;->m:I

    .line 78
    .line 79
    move-wide v3, p1

    .line 80
    invoke-interface/range {v2 .. v7}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-ne v0, v1, :cond_4

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_4
    move-wide v2, p3

    .line 88
    :goto_2
    check-cast v0, La/g6u0;

    .line 89
    .line 90
    iget-wide v4, v0, La/g6u0;->a:J

    .line 91
    .line 92
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {p0}, La/ek50;->a1()La/ek50;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    :cond_5
    :goto_3
    move-object p0, v8

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    iget-object v8, p0, La/ek50;->q:La/ek50;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :goto_4
    if-eqz p0, :cond_8

    .line 108
    .line 109
    invoke-static {p1, p2, v4, v5}, La/g6u0;->e(JJ)J

    .line 110
    .line 111
    .line 112
    move-result-wide p1

    .line 113
    invoke-static {v2, v3, v4, v5}, La/g6u0;->d(JJ)J

    .line 114
    .line 115
    .line 116
    move-result-wide v2

    .line 117
    iput-wide v4, v7, La/ck50;->i:J

    .line 118
    .line 119
    iput v9, v7, La/ck50;->m:I

    .line 120
    .line 121
    move-wide p3, v2

    .line 122
    move-object/from16 p5, v7

    .line 123
    .line 124
    invoke-virtual/range {p0 .. p5}, La/ek50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v1, :cond_7

    .line 129
    .line 130
    :goto_5
    return-object v1

    .line 131
    :cond_7
    move-wide p0, v4

    .line 132
    :goto_6
    check-cast v0, La/g6u0;

    .line 133
    .line 134
    iget-wide v0, v0, La/g6u0;->a:J

    .line 135
    .line 136
    move-wide v4, p0

    .line 137
    goto :goto_7

    .line 138
    :cond_8
    const-wide/16 v0, 0x0

    .line 139
    .line 140
    :goto_7
    invoke-static {v4, v5, v0, v1}, La/g6u0;->e(JJ)J

    .line 141
    .line 142
    .line 143
    move-result-wide p0

    .line 144
    new-instance p2, La/g6u0;

    .line 145
    .line 146
    invoke-direct {p2, p0, p1}, La/g6u0;-><init>(J)V

    .line 147
    .line 148
    .line 149
    return-object p2
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/ek50;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
