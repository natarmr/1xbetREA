.class public final La/tai0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lm40;

.field public final b:Z

.field public final c:La/e7z;

.field public final d:La/nai0;

.field public e:La/tai0;

.field public final f:I


# direct methods
.method public constructor <init>(La/lm40;ZLa/e7z;La/nai0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tai0;->a:La/lm40;

    .line 5
    .line 6
    iput-boolean p2, p0, La/tai0;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, La/tai0;->c:La/e7z;

    .line 9
    .line 10
    iput-object p4, p0, La/tai0;->d:La/nai0;

    .line 11
    .line 12
    iget p1, p3, La/e7z;->b:I

    .line 13
    .line 14
    iput p1, p0, La/tai0;->f:I

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic j(ILa/tai0;)Ljava/util/List;
    .locals 3

    .line 1
    and-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p1, La/tai0;->b:Z

    .line 8
    .line 9
    xor-int/2addr v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    and-int/lit8 p0, p0, 0x2

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move v1, v2

    .line 18
    :goto_1
    invoke-virtual {p1, v0, v1}, La/tai0;->i(ZZ)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public final a(La/s460;)La/jge0;
    .locals 9

    .line 1
    invoke-virtual {p0}, La/tai0;->l()La/tai0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, La/jge0;->e:La/jge0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/tai0;->c:La/e7z;

    .line 11
    .line 12
    iget-object v0, v0, La/e7z;->h1:La/tzi;

    .line 13
    .line 14
    iget-object v0, v0, La/tzi;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/lm40;

    .line 17
    .line 18
    iget v1, v0, La/lm40;->d:I

    .line 19
    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    and-int/2addr v1, v2

    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v1, :cond_9

    .line 26
    .line 27
    :goto_0
    if-eqz v0, :cond_9

    .line 28
    .line 29
    iget v1, v0, La/lm40;->c:I

    .line 30
    .line 31
    and-int/2addr v1, v2

    .line 32
    if-eqz v1, :cond_8

    .line 33
    .line 34
    move-object v1, v0

    .line 35
    move-object v5, v4

    .line 36
    :goto_1
    if-eqz v1, :cond_8

    .line 37
    .line 38
    instance-of v6, v1, La/qai0;

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    move-object v6, v1

    .line 43
    check-cast v6, La/qai0;

    .line 44
    .line 45
    invoke-interface {v6}, La/qai0;->e()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_7

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_1
    iget v6, v1, La/lm40;->c:I

    .line 53
    .line 54
    and-int/2addr v6, v2

    .line 55
    if-eqz v6, :cond_7

    .line 56
    .line 57
    instance-of v6, v1, La/f3k;

    .line 58
    .line 59
    if-eqz v6, :cond_7

    .line 60
    .line 61
    move-object v6, v1

    .line 62
    check-cast v6, La/f3k;

    .line 63
    .line 64
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    :goto_2
    if-eqz v6, :cond_6

    .line 68
    .line 69
    iget v8, v6, La/lm40;->c:I

    .line 70
    .line 71
    and-int/2addr v8, v2

    .line 72
    if-eqz v8, :cond_5

    .line 73
    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    if-ne v7, v3, :cond_2

    .line 77
    .line 78
    move-object v1, v6

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    if-nez v5, :cond_3

    .line 81
    .line 82
    new-instance v5, La/xz40;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [La/lm40;

    .line 87
    .line 88
    invoke-direct {v5, v8}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    if-eqz v1, :cond_4

    .line 92
    .line 93
    invoke-virtual {v5, v1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v1, v4

    .line 97
    :cond_4
    invoke-virtual {v5, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_3
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    if-ne v7, v3, :cond_7

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    invoke-static {v5}, La/vcc;->V(La/xz40;)La/lm40;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    goto :goto_1

    .line 111
    :cond_8
    iget v1, v0, La/lm40;->d:I

    .line 112
    .line 113
    and-int/2addr v1, v2

    .line 114
    if-eqz v1, :cond_9

    .line 115
    .line 116
    iget-object v0, v0, La/lm40;->f:La/lm40;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_9
    move-object v1, v4

    .line 120
    :goto_4
    check-cast v1, La/qai0;

    .line 121
    .line 122
    if-eqz v1, :cond_a

    .line 123
    .line 124
    invoke-static {v1, v2}, La/vcc;->X(La/yzj;I)La/s460;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    :cond_a
    if-nez v4, :cond_b

    .line 129
    .line 130
    invoke-virtual {p0, p1}, La/tai0;->a(La/s460;)La/jge0;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :cond_b
    invoke-virtual {v4, p1, v3}, La/s460;->w(La/j6z;Z)La/jge0;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0
.end method

.method public final b(La/ucg0;Lkotlin/jvm/functions/Function1;)La/tai0;
    .locals 5

    .line 1
    new-instance v0, La/nai0;

    .line 2
    .line 3
    invoke-direct {v0}, La/nai0;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, La/nai0;->c:Z

    .line 8
    .line 9
    iput-boolean v1, v0, La/nai0;->d:Z

    .line 10
    .line 11
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    new-instance v2, La/tai0;

    .line 15
    .line 16
    new-instance v3, La/sai0;

    .line 17
    .line 18
    invoke-direct {v3, p2}, La/sai0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    new-instance p2, La/e7z;

    .line 22
    .line 23
    iget v4, p0, La/tai0;->f:I

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const p1, 0x3b9aca00

    .line 28
    .line 29
    .line 30
    :goto_0
    add-int/2addr v4, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const p1, 0x77359400

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    const/4 p1, 0x1

    .line 37
    invoke-direct {p2, p1, v4}, La/e7z;-><init>(ZI)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v3, v1, p2, v0}, La/tai0;-><init>(La/lm40;ZLa/e7z;La/nai0;)V

    .line 41
    .line 42
    .line 43
    iput-object p0, v2, La/tai0;->e:La/tai0;

    .line 44
    .line 45
    return-object v2
.end method

.method public final c(La/e7z;Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, La/e7z;->z()La/xz40;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/xz40;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, La/xz40;->c:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_2

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, La/e7z;

    .line 15
    .line 16
    invoke-virtual {v2}, La/e7z;->I()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    iget-boolean v3, v2, La/e7z;->s1:Z

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    iget-object v3, v2, La/e7z;->h1:La/tzi;

    .line 27
    .line 28
    const/16 v4, 0x8

    .line 29
    .line 30
    invoke-virtual {v3, v4}, La/tzi;->j(I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    iget-boolean v3, p0, La/tai0;->b:Z

    .line 37
    .line 38
    invoke-static {v2, v3}, La/x0x;->o(La/e7z;Z)La/tai0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {p0, v2, p2}, La/tai0;->c(La/e7z;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-void
.end method

.method public final d()La/s460;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/tai0;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, La/tai0;->l()La/tai0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/tai0;->d()La/s460;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0

    .line 20
    :cond_1
    invoke-virtual {p0}, La/tai0;->f()La/qai0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    const/16 p0, 0x8

    .line 27
    .line 28
    invoke-static {v0, p0}, La/vcc;->X(La/yzj;I)La/s460;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    iget-object p0, p0, La/tai0;->c:La/e7z;

    .line 34
    .line 35
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 36
    .line 37
    iget-object p0, p0, La/tzi;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, La/rdx;

    .line 40
    .line 41
    return-object p0
.end method

.method public final e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, p1, v1}, La/tai0;->q(Ljava/util/ArrayList;Z)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    :goto_0
    if-ge v0, p0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/tai0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/tai0;->o()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v2, v1, La/tai0;->d:La/nai0;

    .line 32
    .line 33
    iget-boolean v2, v2, La/nai0;->d:Z

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1, p1, p2}, La/tai0;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method

.method public final f()La/qai0;
    .locals 10

    .line 1
    iget-object v0, p0, La/tai0;->d:La/nai0;

    .line 2
    .line 3
    iget-boolean v0, v0, La/nai0;->c:Z

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object p0, p0, La/tai0;->c:La/e7z;

    .line 11
    .line 12
    if-eqz v0, :cond_b

    .line 13
    .line 14
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 15
    .line 16
    iget-object p0, p0, La/tzi;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/lm40;

    .line 19
    .line 20
    iget v0, p0, La/lm40;->d:I

    .line 21
    .line 22
    and-int/lit8 v0, v0, 0x8

    .line 23
    .line 24
    if-eqz v0, :cond_14

    .line 25
    .line 26
    move-object v0, v4

    .line 27
    :goto_0
    if-eqz p0, :cond_a

    .line 28
    .line 29
    iget v5, p0, La/lm40;->c:I

    .line 30
    .line 31
    and-int/lit8 v5, v5, 0x8

    .line 32
    .line 33
    if-eqz v5, :cond_9

    .line 34
    .line 35
    move-object v5, p0

    .line 36
    move-object v6, v4

    .line 37
    :goto_1
    if-eqz v5, :cond_9

    .line 38
    .line 39
    instance-of v7, v5, La/qai0;

    .line 40
    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    move-object v7, v5

    .line 44
    check-cast v7, La/qai0;

    .line 45
    .line 46
    invoke-interface {v7}, La/qai0;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_1

    .line 51
    .line 52
    invoke-interface {v7}, La/qai0;->J0()Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_0

    .line 57
    .line 58
    return-object v7

    .line 59
    :cond_0
    if-nez v0, :cond_1

    .line 60
    .line 61
    move-object v0, v7

    .line 62
    :cond_1
    move v7, v2

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move v7, v3

    .line 65
    :goto_2
    if-eqz v7, :cond_8

    .line 66
    .line 67
    iget v7, v5, La/lm40;->c:I

    .line 68
    .line 69
    and-int/lit8 v7, v7, 0x8

    .line 70
    .line 71
    if-eqz v7, :cond_8

    .line 72
    .line 73
    instance-of v7, v5, La/f3k;

    .line 74
    .line 75
    if-eqz v7, :cond_8

    .line 76
    .line 77
    move-object v7, v5

    .line 78
    check-cast v7, La/f3k;

    .line 79
    .line 80
    iget-object v7, v7, La/f3k;->p:La/lm40;

    .line 81
    .line 82
    move v8, v2

    .line 83
    :goto_3
    if-eqz v7, :cond_7

    .line 84
    .line 85
    iget v9, v7, La/lm40;->c:I

    .line 86
    .line 87
    and-int/lit8 v9, v9, 0x8

    .line 88
    .line 89
    if-eqz v9, :cond_6

    .line 90
    .line 91
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    if-ne v8, v3, :cond_3

    .line 94
    .line 95
    move-object v5, v7

    .line 96
    goto :goto_4

    .line 97
    :cond_3
    if-nez v6, :cond_4

    .line 98
    .line 99
    new-instance v6, La/xz40;

    .line 100
    .line 101
    new-array v9, v1, [La/lm40;

    .line 102
    .line 103
    invoke-direct {v6, v9}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    if-eqz v5, :cond_5

    .line 107
    .line 108
    invoke-virtual {v6, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v5, v4

    .line 112
    :cond_5
    invoke-virtual {v6, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    :goto_4
    iget-object v7, v7, La/lm40;->f:La/lm40;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    if-ne v8, v3, :cond_8

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_8
    invoke-static {v6}, La/vcc;->V(La/xz40;)La/lm40;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    goto :goto_1

    .line 126
    :cond_9
    iget v5, p0, La/lm40;->d:I

    .line 127
    .line 128
    and-int/lit8 v5, v5, 0x8

    .line 129
    .line 130
    if-eqz v5, :cond_a

    .line 131
    .line 132
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_a
    :goto_5
    move-object v4, v0

    .line 136
    goto/16 :goto_a

    .line 137
    .line 138
    :cond_b
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 139
    .line 140
    iget-object p0, p0, La/tzi;->g:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, La/lm40;

    .line 143
    .line 144
    iget v0, p0, La/lm40;->d:I

    .line 145
    .line 146
    and-int/lit8 v0, v0, 0x8

    .line 147
    .line 148
    if-eqz v0, :cond_14

    .line 149
    .line 150
    :goto_6
    if-eqz p0, :cond_14

    .line 151
    .line 152
    iget v0, p0, La/lm40;->c:I

    .line 153
    .line 154
    and-int/lit8 v0, v0, 0x8

    .line 155
    .line 156
    if-eqz v0, :cond_13

    .line 157
    .line 158
    move-object v0, p0

    .line 159
    move-object v5, v4

    .line 160
    :goto_7
    if-eqz v0, :cond_13

    .line 161
    .line 162
    instance-of v6, v0, La/qai0;

    .line 163
    .line 164
    if-eqz v6, :cond_c

    .line 165
    .line 166
    move-object v6, v0

    .line 167
    check-cast v6, La/qai0;

    .line 168
    .line 169
    invoke-interface {v6}, La/qai0;->e()Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_12

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_c
    iget v6, v0, La/lm40;->c:I

    .line 177
    .line 178
    and-int/lit8 v6, v6, 0x8

    .line 179
    .line 180
    if-eqz v6, :cond_12

    .line 181
    .line 182
    instance-of v6, v0, La/f3k;

    .line 183
    .line 184
    if-eqz v6, :cond_12

    .line 185
    .line 186
    move-object v6, v0

    .line 187
    check-cast v6, La/f3k;

    .line 188
    .line 189
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 190
    .line 191
    move v7, v2

    .line 192
    :goto_8
    if-eqz v6, :cond_11

    .line 193
    .line 194
    iget v8, v6, La/lm40;->c:I

    .line 195
    .line 196
    and-int/lit8 v8, v8, 0x8

    .line 197
    .line 198
    if-eqz v8, :cond_10

    .line 199
    .line 200
    add-int/lit8 v7, v7, 0x1

    .line 201
    .line 202
    if-ne v7, v3, :cond_d

    .line 203
    .line 204
    move-object v0, v6

    .line 205
    goto :goto_9

    .line 206
    :cond_d
    if-nez v5, :cond_e

    .line 207
    .line 208
    new-instance v5, La/xz40;

    .line 209
    .line 210
    new-array v8, v1, [La/lm40;

    .line 211
    .line 212
    invoke-direct {v5, v8}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_e
    if-eqz v0, :cond_f

    .line 216
    .line 217
    invoke-virtual {v5, v0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    move-object v0, v4

    .line 221
    :cond_f
    invoke-virtual {v5, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_10
    :goto_9
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_11
    if-ne v7, v3, :cond_12

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_12
    invoke-static {v5}, La/vcc;->V(La/xz40;)La/lm40;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    goto :goto_7

    .line 235
    :cond_13
    iget v0, p0, La/lm40;->d:I

    .line 236
    .line 237
    and-int/lit8 v0, v0, 0x8

    .line 238
    .line 239
    if-eqz v0, :cond_14

    .line 240
    .line 241
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_14
    :goto_a
    check-cast v4, La/qai0;

    .line 245
    .line 246
    return-object v4
.end method

.method public final g()La/jge0;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/tai0;->d()La/s460;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, La/k7x;->C(La/j6z;)La/j6z;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-interface {v0, p0, v1}, La/j6z;->w(La/j6z;Z)La/jge0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object p0, La/jge0;->e:La/jge0;

    .line 30
    .line 31
    return-object p0
.end method

.method public final h()La/jge0;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/tai0;->d()La/s460;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {p0, v0}, La/k7x;->z(La/j6z;Z)La/jge0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object p0, La/jge0;->e:La/jge0;

    .line 26
    .line 27
    return-object p0
.end method

.method public final i(ZZ)Ljava/util/List;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, La/tai0;->d:La/nai0;

    .line 4
    .line 5
    iget-boolean p1, p1, La/nai0;->d:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p0, La/iun;->a:La/iun;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/tai0;->o()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance p2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, La/tai0;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 29
    .line 30
    .line 31
    return-object p2

    .line 32
    :cond_1
    invoke-virtual {p0, p1, p2}, La/tai0;->q(Ljava/util/ArrayList;Z)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final k()La/nai0;
    .locals 3

    .line 1
    invoke-virtual {p0}, La/tai0;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/tai0;->d:La/nai0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, La/nai0;

    .line 10
    .line 11
    invoke-direct {v0}, La/nai0;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-boolean v2, v1, La/nai0;->c:Z

    .line 15
    .line 16
    iput-boolean v2, v0, La/nai0;->c:Z

    .line 17
    .line 18
    iget-boolean v2, v1, La/nai0;->d:Z

    .line 19
    .line 20
    iput-boolean v2, v0, La/nai0;->d:Z

    .line 21
    .line 22
    iget-object v2, v0, La/nai0;->a:La/hz40;

    .line 23
    .line 24
    iget-object v1, v1, La/nai0;->a:La/hz40;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, La/hz40;->k(La/hz40;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1, v0}, La/tai0;->p(Ljava/util/ArrayList;La/nai0;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    return-object v1
.end method

.method public final l()La/tai0;
    .locals 5

    .line 1
    iget-object v0, p0, La/tai0;->e:La/tai0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, La/tai0;->c:La/e7z;

    .line 7
    .line 8
    iget-boolean p0, p0, La/tai0;->b:Z

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :goto_0
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {v2}, La/e7z;->x()La/nai0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iget-boolean v3, v3, La/nai0;->c:Z

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    if-ne v3, v4, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v2}, La/e7z;->v()La/e7z;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object v2, v1

    .line 37
    :goto_1
    if-nez v2, :cond_5

    .line 38
    .line 39
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_2
    if-eqz v0, :cond_4

    .line 44
    .line 45
    iget-object v2, v0, La/e7z;->h1:La/tzi;

    .line 46
    .line 47
    const/16 v3, 0x8

    .line 48
    .line 49
    invoke-virtual {v2, v3}, La/tzi;->j(I)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    move-object v2, v0

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    move-object v2, v1

    .line 63
    :cond_5
    :goto_3
    if-nez v2, :cond_6

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_6
    invoke-static {v2, p0}, La/x0x;->o(La/e7z;Z)La/tai0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public final m()La/jge0;
    .locals 3

    .line 1
    invoke-virtual {p0}, La/tai0;->f()La/qai0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/tai0;->c:La/e7z;

    .line 8
    .line 9
    iget-object p0, p0, La/e7z;->h1:La/tzi;

    .line 10
    .line 11
    iget-object p0, p0, La/tzi;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/rdx;

    .line 14
    .line 15
    invoke-virtual {p0}, La/s460;->D1()La/jge0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    check-cast v0, La/lm40;

    .line 21
    .line 22
    iget-object v0, v0, La/lm40;->a:La/lm40;

    .line 23
    .line 24
    sget-object v1, La/mai0;->b:La/zai0;

    .line 25
    .line 26
    iget-object p0, p0, La/tai0;->d:La/nai0;

    .line 27
    .line 28
    iget-object p0, p0, La/nai0;->a:La/hz40;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    :cond_1
    const/4 v1, 0x1

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    move p0, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    :goto_0
    iget-object v2, v0, La/lm40;->a:La/lm40;

    .line 44
    .line 45
    iget-boolean v2, v2, La/lm40;->n:Z

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    sget-object p0, La/jge0;->e:La/jge0;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    const/16 v2, 0x8

    .line 53
    .line 54
    if-nez p0, :cond_4

    .line 55
    .line 56
    invoke-static {v0, v2}, La/vcc;->X(La/yzj;I)La/s460;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, La/k7x;->C(La/j6z;)La/j6z;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0, p0, v1}, La/j6z;->w(La/j6z;Z)La/jge0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_4
    invoke-static {v0, v2}, La/vcc;->X(La/yzj;I)La/s460;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, La/s460;->D1()La/jge0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public final n()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/tai0;->e:La/tai0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La/tai0;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/tai0;->d:La/nai0;

    .line 6
    .line 7
    iget-boolean p0, p0, La/nai0;->c:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final p(Ljava/util/ArrayList;La/nai0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/tai0;->d:La/nai0;

    .line 2
    .line 3
    iget-boolean v0, v0, La/nai0;->d:Z

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, p1, v1}, La/tai0;->q(Ljava/util/ArrayList;Z)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :goto_0
    if-ge v0, p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/tai0;

    .line 26
    .line 27
    invoke-virtual {v1}, La/tai0;->o()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    iget-object v2, v1, La/tai0;->d:La/nai0;

    .line 34
    .line 35
    invoke-virtual {p2, v2}, La/nai0;->e(La/nai0;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, La/tai0;->p(Ljava/util/ArrayList;La/nai0;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void
.end method

.method public final q(Ljava/util/ArrayList;Z)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p0}, La/tai0;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, La/iun;->a:La/iun;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, La/tai0;->c:La/e7z;

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, La/tai0;->c(La/e7z;Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_5

    .line 16
    .line 17
    iget-object p2, p0, La/tai0;->d:La/nai0;

    .line 18
    .line 19
    iget-object v0, p2, La/nai0;->a:La/hz40;

    .line 20
    .line 21
    sget-object v1, La/xai0;->z:La/zai0;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    move-object v1, v2

    .line 31
    :cond_1
    check-cast v1, La/ucg0;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-boolean v4, p2, La/nai0;->c:Z

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    new-instance v4, La/rai0;

    .line 47
    .line 48
    invoke-direct {v4, v1, v3}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1, v4}, La/tai0;->b(La/ucg0;Lkotlin/jvm/functions/Function1;)La/tai0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_2
    sget-object v1, La/xai0;->a:La/zai0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, La/hz40;->c(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_5

    .line 71
    .line 72
    iget-boolean p2, p2, La/nai0;->c:Z

    .line 73
    .line 74
    if-eqz p2, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0, v1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-nez p2, :cond_3

    .line 81
    .line 82
    move-object p2, v2

    .line 83
    :cond_3
    check-cast p2, Ljava/util/List;

    .line 84
    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Ljava/lang/String;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    move-object p2, v2

    .line 95
    :goto_0
    if-eqz p2, :cond_5

    .line 96
    .line 97
    new-instance v0, La/ka6;

    .line 98
    .line 99
    const/16 v1, 0xd

    .line 100
    .line 101
    invoke-direct {v0, p2, v1}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v2, v0}, La/tai0;->b(La/ucg0;Lkotlin/jvm/functions/Function1;)La/tai0;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p1, v3, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    return-object p1
.end method
