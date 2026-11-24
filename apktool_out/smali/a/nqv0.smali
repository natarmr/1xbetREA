.class public final La/nqv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ppv0;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:La/fpv0;

.field public final e:La/wsd;

.field public final f:La/ezb0;

.field public final g:Landroidx/work/impl/WorkDatabase;

.field public final h:La/upv0;

.field public final i:La/g7k;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/lang/String;

.field public final l:La/dby;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La/qgd;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/qgd;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/ppv0;

    .line 7
    .line 8
    iput-object v0, p0, La/nqv0;->a:La/ppv0;

    .line 9
    .line 10
    iget-object v1, p1, La/qgd;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/content/Context;

    .line 13
    .line 14
    iput-object v1, p0, La/nqv0;->b:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v1, v0, La/ppv0;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v1, p0, La/nqv0;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v2, p1, La/qgd;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, La/fpv0;

    .line 23
    .line 24
    iput-object v2, p0, La/nqv0;->d:La/fpv0;

    .line 25
    .line 26
    iget-object v2, p1, La/qgd;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, La/wsd;

    .line 29
    .line 30
    iput-object v2, p0, La/nqv0;->e:La/wsd;

    .line 31
    .line 32
    iget-object v2, p1, La/qgd;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, La/ezb0;

    .line 35
    .line 36
    iput-object v2, p0, La/nqv0;->f:La/ezb0;

    .line 37
    .line 38
    iget-object v2, p1, La/qgd;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Landroidx/work/impl/WorkDatabase;

    .line 41
    .line 42
    iput-object v2, p0, La/nqv0;->g:Landroidx/work/impl/WorkDatabase;

    .line 43
    .line 44
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iput-object v3, p0, La/nqv0;->h:La/upv0;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->s()La/g7k;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iput-object v2, p0, La/nqv0;->i:La/g7k;

    .line 55
    .line 56
    iget-object p1, p1, La/qgd;->g:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v2, p1

    .line 59
    check-cast v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    iput-object v2, p0, La/nqv0;->j:Ljava/util/ArrayList;

    .line 62
    .line 63
    iget-object p1, v0, La/ppv0;->c:Ljava/lang/String;

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    const/16 v7, 0x3e

    .line 67
    .line 68
    const-string v3, ","

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    invoke-static/range {v2 .. v7}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, ", class="

    .line 77
    .line 78
    const-string v3, ", tags={ "

    .line 79
    .line 80
    const-string v4, "Work [ id="

    .line 81
    .line 82
    invoke-static {v4, v1, v2, p1, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v1, " } ]"

    .line 87
    .line 88
    invoke-static {p1, v0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, La/nqv0;->k:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {}, La/zvw;->g()La/dby;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, La/nqv0;->l:La/dby;

    .line 99
    .line 100
    new-instance p1, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, La/nqv0;->m:Ljava/util/ArrayList;

    .line 106
    .line 107
    new-instance p1, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, La/nqv0;->n:Ljava/util/ArrayList;

    .line 113
    .line 114
    return-void
.end method


# virtual methods
.method public final a(La/kg00;)V
    .locals 4

    .line 1
    sget-object v0, La/oqv0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, La/nqv0;->k:Ljava/lang/String;

    .line 8
    .line 9
    const-string v3, "Worker result FAILURE for "

    .line 10
    .line 11
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v0, v2}, La/wv00;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/nqv0;->a:La/ppv0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/ppv0;->c()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, La/nqv0;->c()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0, p1}, La/nqv0;->f(La/ng00;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
.end method

.method public final b(I)V
    .locals 5

    .line 1
    sget-object v0, La/zov0;->a:La/zov0;

    .line 2
    .line 3
    iget-object v1, p0, La/nqv0;->h:La/upv0;

    .line 4
    .line 5
    iget-object v2, p0, La/nqv0;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v1, v0, v2}, La/upv0;->j(La/zov0;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    invoke-virtual {v1, v3, v4, v2}, La/upv0;->i(JLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/nqv0;->a:La/ppv0;

    .line 18
    .line 19
    iget p0, p0, La/ppv0;->v:I

    .line 20
    .line 21
    invoke-virtual {v1, p0, v2}, La/upv0;->h(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v3, -0x1

    .line 25
    .line 26
    invoke-virtual {v1, v3, v4, v2}, La/upv0;->g(JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1, v2}, La/upv0;->k(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final c()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, La/nqv0;->h:La/upv0;

    .line 6
    .line 7
    iget-object v3, p0, La/nqv0;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1, v3}, La/upv0;->i(JLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, La/zov0;->a:La/zov0;

    .line 13
    .line 14
    invoke-virtual {v2, v0, v3}, La/upv0;->j(La/zov0;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v2, La/upv0;->a:La/aeg0;

    .line 18
    .line 19
    new-instance v1, La/ka6;

    .line 20
    .line 21
    const/16 v4, 0x1b

    .line 22
    .line 23
    invoke-direct {v1, v3, v4}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-static {v0, v4, v5, v1}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/nqv0;->a:La/ppv0;

    .line 38
    .line 39
    iget p0, p0, La/ppv0;->v:I

    .line 40
    .line 41
    invoke-virtual {v2, p0, v3}, La/upv0;->h(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, La/ka6;

    .line 45
    .line 46
    const/16 v1, 0x1c

    .line 47
    .line 48
    invoke-direct {p0, v3, v1}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v4, v5, p0}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    const-wide/16 v0, -0x1

    .line 55
    .line 56
    invoke-virtual {v2, v0, v1, v3}, La/upv0;->g(JLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final d(I)Z
    .locals 8

    .line 1
    iget-object v0, p0, La/nqv0;->a:La/ppv0;

    .line 2
    .line 3
    iget-object v1, v0, La/ppv0;->y:Ljava/lang/Boolean;

    .line 4
    .line 5
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, La/oqv0;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v0, v0, La/ppv0;->c:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v4, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v5, "Worker "

    .line 25
    .line 26
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, " was interrupted. Backing off."

    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v3, v1, v0}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/nqv0;->b(I)V

    .line 45
    .line 46
    .line 47
    return v2

    .line 48
    :cond_0
    iget-object v0, p0, La/nqv0;->h:La/upv0;

    .line 49
    .line 50
    iget-object p0, p0, La/nqv0;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, La/upv0;->d(Ljava/lang/String;)La/zov0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v3, " is "

    .line 57
    .line 58
    const-string v4, "Status for "

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1}, La/zov0;->a()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_1

    .line 67
    .line 68
    sget-object v5, La/oqv0;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    new-instance v7, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, "; not doing any work and rescheduling for later execution"

    .line 89
    .line 90
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v6, v5, v1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sget-object v1, La/zov0;->a:La/zov0;

    .line 101
    .line 102
    invoke-virtual {v0, v1, p0}, La/upv0;->j(La/zov0;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1, p0}, La/upv0;->k(ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-wide/16 v3, -0x1

    .line 109
    .line 110
    invoke-virtual {v0, v3, v4, p0}, La/upv0;->g(JLjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return v2

    .line 114
    :cond_1
    sget-object p1, La/oqv0;->a:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string p0, " ; not doing any work"

    .line 135
    .line 136
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {v0, p1, p0}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const/4 p0, 0x0

    .line 147
    return p0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, La/nqv0;->a:La/ppv0;

    .line 6
    .line 7
    iget-object v3, v2, La/ppv0;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v2, La/ppv0;->d:Ljava/lang/String;

    .line 10
    .line 11
    instance-of v5, v0, La/mqv0;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, La/mqv0;

    .line 17
    .line 18
    iget v6, v5, La/mqv0;->k:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, La/mqv0;->k:I

    .line 28
    .line 29
    :goto_0
    move-object v6, v5

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    new-instance v5, La/mqv0;

    .line 32
    .line 33
    invoke-direct {v5, v1, v0}, La/mqv0;-><init>(La/nqv0;La/zje;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget-object v0, v6, La/mqv0;->i:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v7, La/wne;->a:La/wne;

    .line 40
    .line 41
    iget v5, v6, La/mqv0;->k:I

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    iget-object v9, v1, La/nqv0;->k:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v10, 0x1

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    if-ne v5, v10, :cond_1

    .line 50
    .line 51
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_b

    .line 55
    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto/16 :goto_c

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto/16 :goto_d

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v8

    .line 68
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, La/afn0;->w()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    iget-object v11, v2, La/ppv0;->x:Ljava/lang/String;

    .line 76
    .line 77
    const/16 v12, 0x1d

    .line 78
    .line 79
    const/4 v14, 0x0

    .line 80
    if-eqz v5, :cond_a

    .line 81
    .line 82
    if-eqz v11, :cond_a

    .line 83
    .line 84
    invoke-virtual {v2}, La/ppv0;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 89
    .line 90
    move-object/from16 p1, v8

    .line 91
    .line 92
    const/16 v8, 0x7f

    .line 93
    .line 94
    if-lt v15, v12, :cond_4

    .line 95
    .line 96
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v15

    .line 100
    if-gt v15, v8, :cond_3

    .line 101
    .line 102
    move-object v8, v11

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-virtual {v11, v14, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    :goto_2
    invoke-static {v0, v8}, La/sf3;->b(ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_4
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    if-gt v15, v8, :cond_5

    .line 117
    .line 118
    move-object v8, v11

    .line 119
    goto :goto_3

    .line 120
    :cond_5
    invoke-virtual {v11, v14, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    :goto_3
    const-string v15, "asyncTraceBegin"

    .line 125
    .line 126
    :try_start_1
    sget-object v16, La/afn0;->c:Ljava/lang/reflect/Method;

    .line 127
    .line 128
    if-nez v16, :cond_6

    .line 129
    .line 130
    const-class v12, Landroid/os/Trace;

    .line 131
    .line 132
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 133
    .line 134
    const-class v14, Ljava/lang/String;

    .line 135
    .line 136
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    filled-new-array {v10, v14, v13}, [Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-virtual {v12, v15, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 143
    .line 144
    .line 145
    move-result-object v16

    .line 146
    sput-object v16, La/afn0;->c:Ljava/lang/reflect/Method;

    .line 147
    .line 148
    :cond_6
    move-object/from16 v10, v16

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :catch_1
    move-exception v0

    .line 152
    goto :goto_5

    .line 153
    :goto_4
    if-eqz v10, :cond_7

    .line 154
    .line 155
    sget-wide v12, La/afn0;->a:J

    .line 156
    .line 157
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    filled-new-array {v12, v8, v0}, [Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const/4 v8, 0x0

    .line 170
    invoke-virtual {v10, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_7
    const-string v0, "Required value was null."

    .line 175
    .line 176
    new-instance v8, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    invoke-direct {v8, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 182
    :goto_5
    instance-of v8, v0, Ljava/lang/reflect/InvocationTargetException;

    .line 183
    .line 184
    if-eqz v8, :cond_9

    .line 185
    .line 186
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 193
    .line 194
    if-nez v1, :cond_8

    .line 195
    .line 196
    invoke-static {v0}, La/ohq;->p(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    return-object p1

    .line 200
    :cond_8
    throw v0

    .line 201
    :cond_9
    const-string v8, "Trace"

    .line 202
    .line 203
    const-string v10, "Unable to call asyncTraceBegin via reflection"

    .line 204
    .line 205
    invoke-static {v8, v10, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 206
    .line 207
    .line 208
    :cond_a
    :goto_6
    new-instance v0, La/fqv0;

    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    invoke-direct {v0, v1, v8}, La/fqv0;-><init>(La/nqv0;B)V

    .line 212
    .line 213
    .line 214
    iget-object v8, v1, La/nqv0;->g:Landroidx/work/impl/WorkDatabase;

    .line 215
    .line 216
    invoke-virtual {v8, v0}, La/aeg0;->o(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_b

    .line 227
    .line 228
    new-instance v0, La/jqv0;

    .line 229
    .line 230
    const/4 v1, 0x1

    .line 231
    invoke-direct {v0, v1}, La/jqv0;-><init>(Z)V

    .line 232
    .line 233
    .line 234
    return-object v0

    .line 235
    :cond_b
    invoke-virtual {v2}, La/ppv0;->c()Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    iget-object v10, v1, La/nqv0;->c:Ljava/lang/String;

    .line 240
    .line 241
    if-eqz v0, :cond_c

    .line 242
    .line 243
    iget-object v0, v2, La/ppv0;->e:La/maj;

    .line 244
    .line 245
    const/4 v12, 0x0

    .line 246
    goto/16 :goto_a

    .line 247
    .line 248
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    sget-object v0, La/wex;->a:Ljava/lang/String;

    .line 252
    .line 253
    :try_start_2
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 257
    const/4 v12, 0x0

    .line 258
    :try_start_3
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    check-cast v0, Landroidx/work/OverwritingInputMerger;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :catch_2
    move-exception v0

    .line 273
    goto :goto_7

    .line 274
    :catch_3
    move-exception v0

    .line 275
    const/4 v12, 0x0

    .line 276
    :goto_7
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 277
    .line 278
    .line 279
    move-result-object v13

    .line 280
    sget-object v14, La/wex;->a:Ljava/lang/String;

    .line 281
    .line 282
    const-string v15, "Trouble instantiating "

    .line 283
    .line 284
    invoke-virtual {v15, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v15

    .line 288
    invoke-virtual {v13, v14, v15, v0}, La/wv00;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    move-object v0, v12

    .line 292
    :goto_8
    if-nez v0, :cond_d

    .line 293
    .line 294
    sget-object v0, La/oqv0;->a:Ljava/lang/String;

    .line 295
    .line 296
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    new-instance v2, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v3, "Could not create Input Merger "

    .line 303
    .line 304
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-virtual {v1, v0, v2}, La/wv00;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    new-instance v0, La/jqv0;

    .line 318
    .line 319
    const/4 v4, 0x0

    .line 320
    invoke-direct {v0, v4}, La/jqv0;-><init>(Z)V

    .line 321
    .line 322
    .line 323
    return-object v0

    .line 324
    :cond_d
    const/4 v4, 0x0

    .line 325
    iget-object v0, v2, La/ppv0;->e:La/maj;

    .line 326
    .line 327
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    iget-object v2, v1, La/nqv0;->h:La/upv0;

    .line 332
    .line 333
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    iget-object v2, v2, La/upv0;->a:La/aeg0;

    .line 340
    .line 341
    new-instance v13, La/ka6;

    .line 342
    .line 343
    const/16 v14, 0x1d

    .line 344
    .line 345
    invoke-direct {v13, v10, v14}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 346
    .line 347
    .line 348
    const/4 v14, 0x1

    .line 349
    invoke-static {v2, v14, v4, v13}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    check-cast v2, Ljava/util/List;

    .line 354
    .line 355
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    new-instance v2, La/laj;

    .line 360
    .line 361
    invoke-direct {v2, v4}, La/laj;-><init>(B)V

    .line 362
    .line 363
    .line 364
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 365
    .line 366
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v13

    .line 377
    if-eqz v13, :cond_e

    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v13

    .line 383
    check-cast v13, La/maj;

    .line 384
    .line 385
    iget-object v13, v13, La/maj;->a:Ljava/util/HashMap;

    .line 386
    .line 387
    invoke-static {v13}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 388
    .line 389
    .line 390
    move-result-object v13

    .line 391
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-interface {v4, v13}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 395
    .line 396
    .line 397
    goto :goto_9

    .line 398
    :cond_e
    invoke-virtual {v2, v4}, La/laj;->c(Ljava/util/Map;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2}, La/laj;->a()La/maj;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    :goto_a
    new-instance v2, Landroidx/work/WorkerParameters;

    .line 406
    .line 407
    invoke-static {v10}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    iget-object v10, v1, La/nqv0;->e:La/wsd;

    .line 412
    .line 413
    iget-object v13, v10, La/wsd;->a:Ljava/util/concurrent/Executor;

    .line 414
    .line 415
    iget-object v10, v10, La/wsd;->b:La/rwj;

    .line 416
    .line 417
    sget-object v14, La/jtv;->f:La/jtv;

    .line 418
    .line 419
    new-instance v15, La/jpv0;

    .line 420
    .line 421
    new-instance v15, La/wov0;

    .line 422
    .line 423
    iget-object v12, v1, La/nqv0;->f:La/ezb0;

    .line 424
    .line 425
    move/from16 p1, v5

    .line 426
    .line 427
    iget-object v5, v1, La/nqv0;->d:La/fpv0;

    .line 428
    .line 429
    invoke-direct {v15, v8, v12, v5}, La/wov0;-><init>(Landroidx/work/impl/WorkDatabase;La/ezb0;La/fpv0;)V

    .line 430
    .line 431
    .line 432
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 433
    .line 434
    .line 435
    iput-object v4, v2, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 436
    .line 437
    iput-object v0, v2, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 438
    .line 439
    new-instance v0, Ljava/util/HashSet;

    .line 440
    .line 441
    iget-object v4, v1, La/nqv0;->j:Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-direct {v0, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 444
    .line 445
    .line 446
    iput-object v13, v2, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/Executor;

    .line 447
    .line 448
    iput-object v10, v2, Landroidx/work/WorkerParameters;->d:Lkotlin/coroutines/CoroutineContext;

    .line 449
    .line 450
    iput-object v5, v2, Landroidx/work/WorkerParameters;->e:La/fpv0;

    .line 451
    .line 452
    iput-object v14, v2, Landroidx/work/WorkerParameters;->f:La/jtv;

    .line 453
    .line 454
    :try_start_4
    iget-object v0, v1, La/nqv0;->b:Landroid/content/Context;

    .line 455
    .line 456
    invoke-virtual {v14, v0, v3, v2}, La/jtv;->H0(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)La/og00;

    .line 457
    .line 458
    .line 459
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 460
    const/4 v14, 0x1

    .line 461
    iput-boolean v14, v2, La/og00;->d:Z

    .line 462
    .line 463
    invoke-interface {v6}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    sget-object v3, La/gqw0;->o1:La/gqw0;

    .line 468
    .line 469
    invoke-interface {v0, v3}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    move-object v10, v0

    .line 477
    check-cast v10, La/bby;

    .line 478
    .line 479
    new-instance v0, La/t13;

    .line 480
    .line 481
    move-object v3, v5

    .line 482
    const/16 v5, 0x19

    .line 483
    .line 484
    move-object v4, v11

    .line 485
    move-object v11, v3

    .line 486
    move-object v3, v4

    .line 487
    move-object v4, v1

    .line 488
    move-object v1, v2

    .line 489
    move/from16 v2, p1

    .line 490
    .line 491
    invoke-direct/range {v0 .. v5}, La/t13;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 492
    .line 493
    .line 494
    move-object v2, v1

    .line 495
    move-object v1, v4

    .line 496
    invoke-interface {v10, v0}, La/bby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 497
    .line 498
    .line 499
    new-instance v0, La/fqv0;

    .line 500
    .line 501
    invoke-direct {v0, v1, v14}, La/fqv0;-><init>(La/nqv0;B)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v8, v0}, La/aeg0;->o(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    check-cast v0, Ljava/lang/Boolean;

    .line 512
    .line 513
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-nez v0, :cond_f

    .line 518
    .line 519
    new-instance v0, La/jqv0;

    .line 520
    .line 521
    invoke-direct {v0, v14}, La/jqv0;-><init>(Z)V

    .line 522
    .line 523
    .line 524
    return-object v0

    .line 525
    :cond_f
    invoke-interface {v10}, La/bby;->isCancelled()Z

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-eqz v0, :cond_10

    .line 530
    .line 531
    new-instance v0, La/jqv0;

    .line 532
    .line 533
    invoke-direct {v0, v14}, La/jqv0;-><init>(Z)V

    .line 534
    .line 535
    .line 536
    return-object v0

    .line 537
    :cond_10
    iget-object v0, v11, La/fpv0;->e:La/vox;

    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-static {v0}, La/obb;->Y(Ljava/util/concurrent/Executor;)La/lne;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    :try_start_5
    new-instance v0, La/kpb0;

    .line 547
    .line 548
    const/16 v5, 0x1b

    .line 549
    .line 550
    move-object v3, v15

    .line 551
    const/4 v4, 0x0

    .line 552
    invoke-direct/range {v0 .. v5}, La/kpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 553
    .line 554
    .line 555
    iput v14, v6, La/mqv0;->k:I

    .line 556
    .line 557
    invoke-static {v8, v0, v6}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    if-ne v0, v7, :cond_11

    .line 562
    .line 563
    return-object v7

    .line 564
    :cond_11
    :goto_b
    check-cast v0, La/ng00;

    .line 565
    .line 566
    new-instance v1, La/hqv0;

    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-direct {v1, v0}, La/hqv0;-><init>(La/ng00;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 572
    .line 573
    .line 574
    return-object v1

    .line 575
    :goto_c
    sget-object v1, La/oqv0;->a:Ljava/lang/String;

    .line 576
    .line 577
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const-string v3, " failed because it threw an exception/error"

    .line 582
    .line 583
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-virtual {v2, v1, v3, v0}, La/wv00;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 588
    .line 589
    .line 590
    new-instance v0, La/gqv0;

    .line 591
    .line 592
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 593
    .line 594
    .line 595
    return-object v0

    .line 596
    :goto_d
    sget-object v1, La/oqv0;->a:Ljava/lang/String;

    .line 597
    .line 598
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    const-string v3, " was cancelled"

    .line 603
    .line 604
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    iget-byte v2, v2, La/wv00;->a:B

    .line 609
    .line 610
    const/4 v4, 0x4

    .line 611
    if-gt v2, v4, :cond_12

    .line 612
    .line 613
    invoke-static {v1, v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 614
    .line 615
    .line 616
    :cond_12
    throw v0

    .line 617
    :catchall_1
    sget-object v0, La/oqv0;->a:Ljava/lang/String;

    .line 618
    .line 619
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    new-instance v2, Ljava/lang/StringBuilder;

    .line 624
    .line 625
    const-string v4, "Could not create Worker "

    .line 626
    .line 627
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    invoke-virtual {v1, v0, v2}, La/wv00;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    new-instance v0, La/jqv0;

    .line 641
    .line 642
    const/4 v4, 0x0

    .line 643
    invoke-direct {v0, v4}, La/jqv0;-><init>(Z)V

    .line 644
    .line 645
    .line 646
    return-object v0
.end method

.method public final f(La/ng00;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/nqv0;->c:Ljava/lang/String;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, La/nqv0;->i:La/g7k;

    .line 12
    .line 13
    invoke-static {v2, v0}, La/vic;->x(La/g7k;Ljava/lang/String;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p0, La/nqv0;->h:La/upv0;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, La/upv0;->d(Ljava/lang/String;)La/zov0;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    sget-object v5, La/zov0;->f:La/zov0;

    .line 43
    .line 44
    if-eq v4, v5, :cond_0

    .line 45
    .line 46
    sget-object v4, La/zov0;->d:La/zov0;

    .line 47
    .line 48
    invoke-virtual {v3, v4, v2}, La/upv0;->j(La/zov0;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_0

    .line 56
    .line 57
    iget-object v3, p0, La/nqv0;->n:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    check-cast p1, La/kg00;

    .line 64
    .line 65
    iget-object p1, p1, La/kg00;->a:La/maj;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, La/nqv0;->a:La/ppv0;

    .line 71
    .line 72
    iget p0, p0, La/ppv0;->v:I

    .line 73
    .line 74
    invoke-virtual {v3, p0, v0}, La/upv0;->h(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, v3, La/upv0;->a:La/aeg0;

    .line 78
    .line 79
    new-instance v1, La/zfv0;

    .line 80
    .line 81
    const/16 v2, 0x9

    .line 82
    .line 83
    invoke-direct {v1, p1, v0, v2}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    const/4 v0, 0x1

    .line 88
    invoke-static {p0, p1, v0, v1}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    return-void
.end method
