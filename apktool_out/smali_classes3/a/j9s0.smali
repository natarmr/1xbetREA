.class public final La/j9s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:La/btt0;

.field public final c:La/zas0;

.field public final d:La/r9s0;

.field public final e:La/knf0;


# direct methods
.method public constructor <init>(La/mne;La/btt0;La/zas0;La/r9s0;La/knf0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/j9s0;->a:La/mne;

    .line 14
    .line 15
    iput-object p2, p0, La/j9s0;->b:La/btt0;

    .line 16
    .line 17
    iput-object p3, p0, La/j9s0;->c:La/zas0;

    .line 18
    .line 19
    iput-object p4, p0, La/j9s0;->d:La/r9s0;

    .line 20
    .line 21
    iput-object p5, p0, La/j9s0;->e:La/knf0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(JIIZLa/zje;)Ljava/io/Serializable;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, La/f9s0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/f9s0;

    .line 11
    .line 12
    iget v3, v2, La/f9s0;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/f9s0;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v14, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/f9s0;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/f9s0;-><init>(La/j9s0;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v14, La/f9s0;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v14, La/f9s0;->k:I

    .line 36
    .line 37
    const/4 v15, 0x0

    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-ne v3, v4, :cond_1

    .line 42
    .line 43
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v15

    .line 53
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, La/j9s0;->e:La/knf0;

    .line 57
    .line 58
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iget-object v1, v0, La/j9s0;->b:La/btt0;

    .line 63
    .line 64
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput v4, v14, La/f9s0;->k:I

    .line 69
    .line 70
    iget-object v0, v0, La/j9s0;->c:La/zas0;

    .line 71
    .line 72
    iget-object v0, v0, La/zas0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/lkr0;

    .line 75
    .line 76
    invoke-virtual {v0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    move-object v3, v0

    .line 81
    check-cast v3, La/b9s0;

    .line 82
    .line 83
    new-instance v13, La/fk9;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-direct {v13, v0}, La/fk9;-><init>(Z)V

    .line 87
    .line 88
    .line 89
    const/16 v8, 0x16

    .line 90
    .line 91
    const/4 v9, 0x1

    .line 92
    move-wide/from16 v5, p1

    .line 93
    .line 94
    move/from16 v10, p3

    .line 95
    .line 96
    move/from16 v11, p4

    .line 97
    .line 98
    move/from16 v12, p5

    .line 99
    .line 100
    move-object v4, v1

    .line 101
    invoke-interface/range {v3 .. v14}, La/b9s0;->c(Ljava/lang/String;JLjava/lang/String;IIIIZLa/fk9;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-ne v1, v2, :cond_3

    .line 106
    .line 107
    return-object v2

    .line 108
    :cond_3
    :goto_2
    check-cast v1, La/dx5;

    .line 109
    .line 110
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/r9g0;

    .line 115
    .line 116
    iget-object v0, v0, La/r9g0;->a:Ljava/util/List;

    .line 117
    .line 118
    if-eqz v0, :cond_4

    .line 119
    .line 120
    new-instance v15, Ljava/util/ArrayList;

    .line 121
    .line 122
    const/16 v1, 0xa

    .line 123
    .line 124
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_4

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, La/r2g0;

    .line 146
    .line 147
    invoke-static {v1}, La/x0x;->g0(La/r2g0;)La/o2g0;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    if-nez v15, :cond_5

    .line 156
    .line 157
    sget-object v0, La/iun;->a:La/iun;

    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_5
    return-object v15
.end method

.method public final b(JLa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, La/g9s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/g9s0;

    .line 7
    .line 8
    iget v1, v0, La/g9s0;->k:I

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
    iput v1, v0, La/g9s0;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/g9s0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, La/g9s0;-><init>(La/j9s0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v7, La/g9s0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/g9s0;->k:I

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v8

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p3, p0, La/j9s0;->e:La/knf0;

    .line 53
    .line 54
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3}, La/knf0;->c()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-object p3, p0, La/j9s0;->b:La/btt0;

    .line 62
    .line 63
    invoke-virtual {p3}, La/btt0;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    iput v2, v7, La/g9s0;->k:I

    .line 68
    .line 69
    iget-object p0, p0, La/j9s0;->c:La/zas0;

    .line 70
    .line 71
    iget-object p0, p0, La/zas0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, La/lkr0;

    .line 74
    .line 75
    invoke-virtual {p0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    move-object v1, p0

    .line 80
    check-cast v1, La/b9s0;

    .line 81
    .line 82
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    new-instance v6, La/fk9;

    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    invoke-direct {v6, p0}, La/fk9;-><init>(Z)V

    .line 90
    .line 91
    .line 92
    const/16 v4, 0x16

    .line 93
    .line 94
    move-object v2, p3

    .line 95
    invoke-interface/range {v1 .. v7}, La/b9s0;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    if-ne p3, v0, :cond_3

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_3
    :goto_2
    check-cast p3, La/dx5;

    .line 103
    .line 104
    invoke-virtual {p3}, La/dx5;->a()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/v9s0;

    .line 109
    .line 110
    iget-object p0, p0, La/v9s0;->a:Ljava/util/List;

    .line 111
    .line 112
    if-eqz p0, :cond_5

    .line 113
    .line 114
    new-instance p1, Ljava/util/ArrayList;

    .line 115
    .line 116
    const/16 p2, 0xa

    .line 117
    .line 118
    invoke-static {p0, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_4

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    check-cast p2, La/z2s0;

    .line 140
    .line 141
    invoke-static {p2}, La/yum0;->o(La/z2s0;)La/w2s0;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    check-cast p0, La/w2s0;

    .line 154
    .line 155
    return-object p0

    .line 156
    :cond_5
    return-object v8
.end method

.method public final c(JIIIZLa/zje;)Ljava/io/Serializable;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, v1, La/h9s0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/h9s0;

    .line 11
    .line 12
    iget v3, v2, La/h9s0;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/h9s0;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v14, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/h9s0;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/h9s0;-><init>(La/j9s0;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v14, La/h9s0;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v14, La/h9s0;->k:I

    .line 36
    .line 37
    const/4 v15, 0x0

    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-ne v3, v4, :cond_1

    .line 42
    .line 43
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v15

    .line 53
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, La/j9s0;->e:La/knf0;

    .line 57
    .line 58
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    iput v4, v14, La/h9s0;->k:I

    .line 63
    .line 64
    iget-object v0, v0, La/j9s0;->c:La/zas0;

    .line 65
    .line 66
    iget-object v0, v0, La/zas0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/lkr0;

    .line 69
    .line 70
    invoke-virtual {v0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v3, v0

    .line 75
    check-cast v3, La/b9s0;

    .line 76
    .line 77
    new-instance v13, La/fk9;

    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    invoke-direct {v13, v0}, La/fk9;-><init>(Z)V

    .line 81
    .line 82
    .line 83
    const/16 v7, 0x16

    .line 84
    .line 85
    const/4 v8, 0x1

    .line 86
    move-wide/from16 v4, p1

    .line 87
    .line 88
    move/from16 v9, p3

    .line 89
    .line 90
    move/from16 v10, p4

    .line 91
    .line 92
    move/from16 v11, p5

    .line 93
    .line 94
    move/from16 v12, p6

    .line 95
    .line 96
    invoke-interface/range {v3 .. v14}, La/b9s0;->b(JLjava/lang/String;IIIIIZLa/fk9;La/yje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-ne v1, v2, :cond_3

    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_3
    :goto_2
    check-cast v1, La/dx5;

    .line 104
    .line 105
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/r9g0;

    .line 110
    .line 111
    iget-object v0, v0, La/r9g0;->a:Ljava/util/List;

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    new-instance v15, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v1, 0xa

    .line 118
    .line 119
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, La/r2g0;

    .line 141
    .line 142
    invoke-static {v1}, La/x0x;->g0(La/r2g0;)La/o2g0;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_4
    if-nez v15, :cond_5

    .line 151
    .line 152
    sget-object v0, La/iun;->a:La/iun;

    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_5
    return-object v15
.end method
