.class public final La/uqq;
.super La/f3k;
.source "SourceFile"

# interfaces
.implements La/qai0;
.implements La/t7v;
.implements La/vld;
.implements La/fe60;
.implements La/hps0;


# static fields
.field public static final w:La/xak;


# instance fields
.field public q:La/gy40;

.field public final r:Lkotlin/jvm/functions/Function1;

.field public s:La/qpq;

.field public t:La/pbz;

.field public u:La/j6z;

.field public final v:La/nqq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/xak;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/xak;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/uqq;->w:La/xak;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/gy40;ILa/t0;)V
    .locals 8

    .line 1
    invoke-direct {p0}, La/f3k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uqq;->q:La/gy40;

    .line 5
    .line 6
    iput-object p3, p0, La/uqq;->r:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    new-instance v0, La/brk;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/16 v7, 0x17

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const-class v3, La/uqq;

    .line 15
    .line 16
    const-string v4, "onFocusStateChange"

    .line 17
    .line 18
    const-string v5, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 19
    .line 20
    move-object v2, p0

    .line 21
    invoke-direct/range {v0 .. v7}, La/brk;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    new-instance p0, La/nqq;

    .line 25
    .line 26
    const/16 p1, 0xa

    .line 27
    .line 28
    invoke-direct {p0, p2, v0, p1}, La/nqq;-><init>(ILkotlin/jvm/functions/Function2;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 32
    .line 33
    .line 34
    iput-object p0, v2, La/uqq;->v:La/nqq;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final O0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final P(La/s460;)V
    .locals 1

    .line 1
    iput-object p1, p0, La/uqq;->u:La/j6z;

    .line 2
    .line 3
    iget-object v0, p0, La/uqq;->v:La/nqq;

    .line 4
    .line 5
    invoke-virtual {v0}, La/nqq;->e1()La/iqq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, La/iqq;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, La/s460;->g1()La/lm40;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-boolean p1, p1, La/lm40;->n:Z

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, La/uqq;->u:La/j6z;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, La/j6z;->h()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, La/uqq;->d1()V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void

    .line 38
    :cond_2
    invoke-virtual {p0}, La/uqq;->d1()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final R()V
    .locals 3

    .line 1
    new-instance v0, La/mie0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/gmo;

    .line 7
    .line 8
    const/16 v2, 0xf

    .line 9
    .line 10
    invoke-direct {v1, v0, p0, v2}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1}, La/c9x;->B(La/lm40;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/pbz;

    .line 19
    .line 20
    iget-object v1, p0, La/uqq;->v:La/nqq;

    .line 21
    .line 22
    invoke-virtual {v1}, La/nqq;->e1()La/iqq;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, La/iqq;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, La/uqq;->t:La/pbz;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, La/pbz;->b()V

    .line 37
    .line 38
    .line 39
    :cond_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, La/pbz;->a()La/pbz;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    iput-object v0, p0, La/uqq;->t:La/pbz;

    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final T0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/uqq;->t:La/pbz;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/pbz;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, La/uqq;->t:La/pbz;

    .line 10
    .line 11
    return-void
.end method

.method public final c1(La/gy40;La/nlx;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/sje;

    .line 10
    .line 11
    iget-object v0, v0, La/sje;->a:Lkotlin/coroutines/CoroutineContext;

    .line 12
    .line 13
    sget-object v1, La/gqw0;->o1:La/gqw0;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/bby;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v1, La/f5p;

    .line 25
    .line 26
    const/16 v2, 0xc

    .line 27
    .line 28
    invoke-direct {v1, p1, p2, v2}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, La/bby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v4, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v4, v5

    .line 38
    :goto_0
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v1, La/g6q;

    .line 43
    .line 44
    const/16 v6, 0xd

    .line 45
    .line 46
    move-object v2, p1

    .line 47
    move-object v3, p2

    .line 48
    invoke-direct/range {v1 .. v6}, La/g6q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x3

    .line 52
    invoke-static {p0, v5, v5, v1, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    move-object v2, p1

    .line 57
    move-object v3, p2

    .line 58
    invoke-virtual {v2, v3}, La/gy40;->b(La/nlx;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final d1()V
    .locals 9

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, La/lm40;->a:La/lm40;

    .line 6
    .line 7
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "visitAncestors called on an unattached node"

    .line 12
    .line 13
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, La/lm40;->a:La/lm40;

    .line 17
    .line 18
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 19
    .line 20
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    if-eqz p0, :cond_c

    .line 25
    .line 26
    iget-object v1, p0, La/e7z;->h1:La/tzi;

    .line 27
    .line 28
    iget-object v1, v1, La/tzi;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, La/lm40;

    .line 31
    .line 32
    iget v1, v1, La/lm40;->d:I

    .line 33
    .line 34
    const/high16 v2, 0x40000

    .line 35
    .line 36
    and-int/2addr v1, v2

    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v1, :cond_a

    .line 39
    .line 40
    :goto_1
    if-eqz v0, :cond_a

    .line 41
    .line 42
    iget v1, v0, La/lm40;->c:I

    .line 43
    .line 44
    and-int/2addr v1, v2

    .line 45
    if-eqz v1, :cond_9

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    move-object v4, v3

    .line 49
    :goto_2
    if-eqz v1, :cond_9

    .line 50
    .line 51
    instance-of v5, v1, La/hps0;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    move-object v5, v1

    .line 56
    check-cast v5, La/hps0;

    .line 57
    .line 58
    invoke-interface {v5}, La/hps0;->j()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v6, La/vqq;->o:La/ddk;

    .line 63
    .line 64
    if-eq v6, v5, :cond_1

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_1
    return-void

    .line 68
    :cond_2
    :goto_3
    iget v5, v1, La/lm40;->c:I

    .line 69
    .line 70
    and-int/2addr v5, v2

    .line 71
    if-eqz v5, :cond_8

    .line 72
    .line 73
    instance-of v5, v1, La/f3k;

    .line 74
    .line 75
    if-eqz v5, :cond_8

    .line 76
    .line 77
    move-object v5, v1

    .line 78
    check-cast v5, La/f3k;

    .line 79
    .line 80
    iget-object v5, v5, La/f3k;->p:La/lm40;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    :goto_4
    const/4 v7, 0x1

    .line 84
    if-eqz v5, :cond_7

    .line 85
    .line 86
    iget v8, v5, La/lm40;->c:I

    .line 87
    .line 88
    and-int/2addr v8, v2

    .line 89
    if-eqz v8, :cond_6

    .line 90
    .line 91
    add-int/lit8 v6, v6, 0x1

    .line 92
    .line 93
    if-ne v6, v7, :cond_3

    .line 94
    .line 95
    move-object v1, v5

    .line 96
    goto :goto_5

    .line 97
    :cond_3
    if-nez v4, :cond_4

    .line 98
    .line 99
    new-instance v4, La/xz40;

    .line 100
    .line 101
    const/16 v7, 0x10

    .line 102
    .line 103
    new-array v7, v7, [La/lm40;

    .line 104
    .line 105
    invoke-direct {v4, v7}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-virtual {v4, v1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v1, v3

    .line 114
    :cond_5
    invoke-virtual {v4, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    :goto_5
    iget-object v5, v5, La/lm40;->f:La/lm40;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    if-ne v6, v7, :cond_8

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_8
    invoke-static {v4}, La/vcc;->V(La/xz40;)La/lm40;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    goto :goto_2

    .line 128
    :cond_9
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_a
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-eqz p0, :cond_b

    .line 136
    .line 137
    iget-object v0, p0, La/e7z;->h1:La/tzi;

    .line 138
    .line 139
    if-eqz v0, :cond_b

    .line 140
    .line 141
    iget-object v0, v0, La/tzi;->f:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, La/wso0;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_b
    move-object v0, v3

    .line 147
    goto :goto_0

    .line 148
    :cond_c
    return-void
.end method

.method public final e1(La/gy40;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/uqq;->q:La/gy40;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, La/uqq;->q:La/gy40;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, La/uqq;->s:La/qpq;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v2, La/rpq;

    .line 18
    .line 19
    invoke-direct {v2, v1}, La/rpq;-><init>(La/qpq;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, La/gy40;->b(La/nlx;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, La/uqq;->s:La/qpq;

    .line 27
    .line 28
    iput-object p1, p0, La/uqq;->q:La/gy40;

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, La/uqq;->w:La/xak;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x0(La/abi0;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/uqq;->v:La/nqq;

    .line 2
    .line 3
    invoke-virtual {v0}, La/nqq;->e1()La/iqq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, La/iqq;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, La/yai0;->a:[La/iiy;

    .line 12
    .line 13
    sget-object v1, La/xai0;->l:La/zai0;

    .line 14
    .line 15
    sget-object v2, La/yai0;->a:[La/iiy;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    aget-object v2, v2, v3

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, La/wej;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/16 v9, 0x11

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const-class v5, La/uqq;

    .line 37
    .line 38
    const-string v6, "requestFocus"

    .line 39
    .line 40
    const-string v7, "requestFocus()Z"

    .line 41
    .line 42
    move-object v4, p0

    .line 43
    invoke-direct/range {v2 .. v9}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    sget-object p0, La/mai0;->w:La/zai0;

    .line 47
    .line 48
    new-instance v0, La/m6;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v0, v1, v2}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, p0, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
