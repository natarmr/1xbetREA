.class public final La/xqe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rrc;

.field public final b:La/n0o0;


# direct methods
.method public constructor <init>(La/rrc;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xqe;->a:La/rrc;

    .line 5
    .line 6
    new-instance p1, La/jwd;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/xqe;->b:La/n0o0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/io/Serializable;
    .locals 9

    .line 1
    instance-of v0, p1, La/vqe;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/vqe;

    .line 7
    .line 8
    iget v1, v0, La/vqe;->k:I

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
    iput v1, v0, La/vqe;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/vqe;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/vqe;-><init>(La/xqe;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/vqe;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/vqe;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/xqe;->c()La/nqe;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iput v4, v0, La/vqe;->k:I

    .line 55
    .line 56
    iget-object p0, p0, La/nqe;->a:La/zdg0;

    .line 57
    .line 58
    new-instance p1, La/f1e;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    const/4 v5, 0x4

    .line 62
    invoke-direct {p1, v2, v3, v5}, La/f1e;-><init>(ILa/yje;B)V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-static {v0, p0, p1, v4, v2}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 74
    .line 75
    new-instance p0, Ljava/util/ArrayList;

    .line 76
    .line 77
    const/16 v0, 0xa

    .line 78
    .line 79
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/skt;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v1, La/tkt;

    .line 106
    .line 107
    iget v3, v0, La/skt;->a:I

    .line 108
    .line 109
    iget-object v2, v0, La/skt;->b:Ljava/lang/String;

    .line 110
    .line 111
    iget v6, v0, La/skt;->c:I

    .line 112
    .line 113
    iget-object v4, v0, La/skt;->d:Ljava/lang/String;

    .line 114
    .line 115
    iget-wide v7, v0, La/skt;->e:J

    .line 116
    .line 117
    iget-object v5, v0, La/skt;->f:Ljava/lang/String;

    .line 118
    .line 119
    invoke-direct/range {v1 .. v8}, La/tkt;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IJ)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    return-object p0
.end method

.method public final b(La/zje;)Ljava/io/Serializable;
    .locals 12

    .line 1
    instance-of v0, p1, La/wqe;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/wqe;

    .line 7
    .line 8
    iget v1, v0, La/wqe;->k:I

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
    iput v1, v0, La/wqe;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wqe;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/wqe;-><init>(La/xqe;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/wqe;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wqe;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/xqe;->c()La/nqe;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iput v4, v0, La/wqe;->k:I

    .line 55
    .line 56
    iget-object p0, p0, La/nqe;->a:La/zdg0;

    .line 57
    .line 58
    new-instance p1, La/f1e;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    const/4 v5, 0x3

    .line 62
    invoke-direct {p1, v2, v3, v5}, La/f1e;-><init>(ILa/yje;B)V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-static {v0, p0, p1, v4, v2}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 74
    .line 75
    new-instance p0, Ljava/util/ArrayList;

    .line 76
    .line 77
    const/16 v0, 0xa

    .line 78
    .line 79
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/oqe;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v1, La/yqe;

    .line 106
    .line 107
    iget v2, v0, La/oqe;->a:I

    .line 108
    .line 109
    iget-object v3, v0, La/oqe;->b:Ljava/lang/String;

    .line 110
    .line 111
    iget v4, v0, La/oqe;->c:I

    .line 112
    .line 113
    iget-object v5, v0, La/oqe;->d:Ljava/lang/String;

    .line 114
    .line 115
    iget-wide v6, v0, La/oqe;->e:J

    .line 116
    .line 117
    iget-object v8, v0, La/oqe;->f:Ljava/lang/String;

    .line 118
    .line 119
    iget v9, v0, La/oqe;->h:I

    .line 120
    .line 121
    iget v10, v0, La/oqe;->g:I

    .line 122
    .line 123
    iget-object v11, v0, La/oqe;->i:Ljava/lang/String;

    .line 124
    .line 125
    invoke-direct/range {v1 .. v11}, La/yqe;-><init>(ILjava/lang/String;ILjava/lang/String;JLjava/lang/String;IILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    return-object p0
.end method

.method public final c()La/nqe;
    .locals 0

    .line 1
    iget-object p0, p0, La/xqe;->b:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nqe;

    .line 8
    .line 9
    return-object p0
.end method
