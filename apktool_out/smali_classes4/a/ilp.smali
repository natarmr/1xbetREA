.class public final La/ilp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qlp;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Z

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/util/List;

.field public final m:La/dlp;

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;JZILjava/lang/String;IZZZZLjava/util/List;La/dlp;ZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, La/ilp;->a:J

    .line 14
    .line 15
    iput-object p3, p0, La/ilp;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p4, p0, La/ilp;->c:J

    .line 18
    .line 19
    iput-boolean p6, p0, La/ilp;->d:Z

    .line 20
    .line 21
    iput p7, p0, La/ilp;->e:I

    .line 22
    .line 23
    iput-object p8, p0, La/ilp;->f:Ljava/lang/String;

    .line 24
    .line 25
    iput p9, p0, La/ilp;->g:I

    .line 26
    .line 27
    iput-boolean p10, p0, La/ilp;->h:Z

    .line 28
    .line 29
    iput-boolean p11, p0, La/ilp;->i:Z

    .line 30
    .line 31
    iput-boolean p12, p0, La/ilp;->j:Z

    .line 32
    .line 33
    iput-boolean p13, p0, La/ilp;->k:Z

    .line 34
    .line 35
    iput-object p14, p0, La/ilp;->l:Ljava/util/List;

    .line 36
    .line 37
    iput-object p15, p0, La/ilp;->m:La/dlp;

    .line 38
    .line 39
    move/from16 p1, p16

    .line 40
    .line 41
    iput-boolean p1, p0, La/ilp;->n:Z

    .line 42
    .line 43
    move/from16 p1, p17

    .line 44
    .line 45
    iput-boolean p1, p0, La/ilp;->o:Z

    .line 46
    .line 47
    move/from16 p1, p18

    .line 48
    .line 49
    iput-boolean p1, p0, La/ilp;->p:Z

    .line 50
    .line 51
    move/from16 p1, p19

    .line 52
    .line 53
    iput-boolean p1, p0, La/ilp;->q:Z

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/ilp;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ilp;

    .line 12
    .line 13
    iget-wide v0, p0, La/ilp;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/ilp;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, La/ilp;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/ilp;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_3
    iget-wide v0, p0, La/ilp;->c:J

    .line 36
    .line 37
    iget-wide v2, p1, La/ilp;->c:J

    .line 38
    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_4
    iget-boolean v0, p0, La/ilp;->d:Z

    .line 46
    .line 47
    iget-boolean v1, p1, La/ilp;->d:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_5

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :cond_5
    iget v0, p0, La/ilp;->e:I

    .line 54
    .line 55
    iget v1, p1, La/ilp;->e:I

    .line 56
    .line 57
    if-eq v0, v1, :cond_6

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_6
    iget-object v0, p0, La/ilp;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, La/ilp;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_7
    iget v0, p0, La/ilp;->g:I

    .line 72
    .line 73
    iget v1, p1, La/ilp;->g:I

    .line 74
    .line 75
    if-ne v0, v1, :cond_f

    .line 76
    .line 77
    iget-boolean v0, p0, La/ilp;->h:Z

    .line 78
    .line 79
    iget-boolean v1, p1, La/ilp;->h:Z

    .line 80
    .line 81
    if-eq v0, v1, :cond_8

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_8
    iget-boolean v0, p0, La/ilp;->i:Z

    .line 85
    .line 86
    iget-boolean v1, p1, La/ilp;->i:Z

    .line 87
    .line 88
    if-eq v0, v1, :cond_9

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_9
    iget-boolean v0, p0, La/ilp;->j:Z

    .line 92
    .line 93
    iget-boolean v1, p1, La/ilp;->j:Z

    .line 94
    .line 95
    if-eq v0, v1, :cond_a

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_a
    iget-boolean v0, p0, La/ilp;->k:Z

    .line 99
    .line 100
    iget-boolean v1, p1, La/ilp;->k:Z

    .line 101
    .line 102
    if-eq v0, v1, :cond_b

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_b
    iget-object v0, p0, La/ilp;->l:Ljava/util/List;

    .line 106
    .line 107
    iget-object v1, p1, La/ilp;->l:Ljava/util/List;

    .line 108
    .line 109
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_c

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_c
    iget-object v0, p0, La/ilp;->m:La/dlp;

    .line 117
    .line 118
    iget-object v1, p1, La/ilp;->m:La/dlp;

    .line 119
    .line 120
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_d

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_d
    iget-boolean v0, p0, La/ilp;->n:Z

    .line 128
    .line 129
    iget-boolean v1, p1, La/ilp;->n:Z

    .line 130
    .line 131
    if-eq v0, v1, :cond_e

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_e
    iget-boolean v0, p0, La/ilp;->o:Z

    .line 135
    .line 136
    iget-boolean v1, p1, La/ilp;->o:Z

    .line 137
    .line 138
    if-ne v0, v1, :cond_f

    .line 139
    .line 140
    iget-boolean v0, p0, La/ilp;->p:Z

    .line 141
    .line 142
    iget-boolean v1, p1, La/ilp;->p:Z

    .line 143
    .line 144
    if-ne v0, v1, :cond_f

    .line 145
    .line 146
    iget-boolean p0, p0, La/ilp;->q:Z

    .line 147
    .line 148
    iget-boolean p1, p1, La/ilp;->q:Z

    .line 149
    .line 150
    if-ne p0, p1, :cond_f

    .line 151
    .line 152
    :goto_0
    const/4 p0, 0x1

    .line 153
    return p0

    .line 154
    :cond_f
    :goto_1
    const/4 p0, 0x0

    .line 155
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/ilp;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    instance-of p0, p2, La/ilp;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    check-cast p1, La/ilp;

    .line 17
    .line 18
    iget-wide p0, p1, La/ilp;->a:J

    .line 19
    .line 20
    check-cast p2, La/ilp;

    .line 21
    .line 22
    iget-wide v1, p2, La/ilp;->a:J

    .line 23
    .line 24
    cmp-long p0, p0, v1

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v0
.end method

.method public final h(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2, p1, p2}, La/rw2;->y(La/p6t0;La/p6t0;La/p6t0;La/p6t0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/ilp;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, La/ilp;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/ilp;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/ilp;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/ilp;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/ilp;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/ilp;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/ilp;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/ilp;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/ilp;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/ilp;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/ilp;->l:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/ilp;->m:La/dlp;

    .line 77
    .line 78
    invoke-virtual {v2}, La/dlp;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-boolean v0, p0, La/ilp;->n:Z

    .line 85
    .line 86
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, La/ilp;->o:Z

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-boolean v2, p0, La/ilp;->p:Z

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-boolean p0, p0, La/ilp;->q:Z

    .line 103
    .line 104
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    add-int/2addr p0, v0

    .line 109
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/ilp;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    instance-of p0, p2, La/ilp;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    check-cast p1, La/ilp;

    .line 22
    .line 23
    iget-object v1, p1, La/ilp;->m:La/dlp;

    .line 24
    .line 25
    check-cast p2, La/ilp;

    .line 26
    .line 27
    iget-object v2, p2, La/ilp;->m:La/dlp;

    .line 28
    .line 29
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget v1, p1, La/ilp;->g:I

    .line 33
    .line 34
    new-instance v2, La/elp;

    .line 35
    .line 36
    invoke-direct {v2, v1}, La/elp;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iget v1, p2, La/ilp;->g:I

    .line 40
    .line 41
    new-instance v3, La/elp;

    .line 42
    .line 43
    invoke-direct {v3, v1}, La/elp;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v2, v3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v1, p1, La/ilp;->o:Z

    .line 50
    .line 51
    new-instance v2, La/flp;

    .line 52
    .line 53
    invoke-direct {v2, v1}, La/flp;-><init>(Z)V

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p2, La/ilp;->o:Z

    .line 57
    .line 58
    new-instance v3, La/flp;

    .line 59
    .line 60
    invoke-direct {v3, v1}, La/flp;-><init>(Z)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v2, v3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-boolean v1, p1, La/ilp;->p:Z

    .line 67
    .line 68
    new-instance v2, La/glp;

    .line 69
    .line 70
    invoke-direct {v2, v1}, La/glp;-><init>(Z)V

    .line 71
    .line 72
    .line 73
    iget-boolean v1, p2, La/ilp;->p:Z

    .line 74
    .line 75
    new-instance v3, La/glp;

    .line 76
    .line 77
    invoke-direct {v3, v1}, La/glp;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v2, v3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-boolean p1, p1, La/ilp;->q:Z

    .line 84
    .line 85
    new-instance v1, La/hlp;

    .line 86
    .line 87
    invoke-direct {v1, p1}, La/hlp;-><init>(Z)V

    .line 88
    .line 89
    .line 90
    iget-boolean p1, p2, La/ilp;->q:Z

    .line 91
    .line 92
    new-instance p2, La/hlp;

    .line 93
    .line 94
    invoke-direct {p2, p1}, La/hlp;-><init>(Z)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0, v1, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_0

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget v0, p0, La/ilp;->g:I

    .line 2
    .line 3
    const-string v1, "GamesCount(value="

    .line 4
    .line 5
    const-string v2, ")"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v1, p0, La/ilp;->o:Z

    .line 12
    .line 13
    const-string v3, "MultiSelectEnabled(value="

    .line 14
    .line 15
    invoke-static {v3, v2, v1}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-boolean v3, p0, La/ilp;->p:Z

    .line 20
    .line 21
    const-string v4, "Selected(value="

    .line 22
    .line 23
    invoke-static {v4, v2, v3}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-boolean v4, p0, La/ilp;->q:Z

    .line 28
    .line 29
    const-string v5, "SelectionEnabled(value="

    .line 30
    .line 31
    invoke-static {v5, v2, v4}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-string v5, "FeedsChampSingleItem(id="

    .line 36
    .line 37
    const-string v6, ", title="

    .line 38
    .line 39
    iget-wide v7, p0, La/ilp;->a:J

    .line 40
    .line 41
    iget-object v9, p0, La/ilp;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v7, v8, v5, v6, v9}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const-string v6, ", sportId="

    .line 48
    .line 49
    const-string v7, ", live="

    .line 50
    .line 51
    iget-wide v8, p0, La/ilp;->c:J

    .line 52
    .line 53
    invoke-static {v5, v6, v8, v9, v7}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v6, ", subSportId="

    .line 57
    .line 58
    const-string v7, ", image="

    .line 59
    .line 60
    iget v8, p0, La/ilp;->e:I

    .line 61
    .line 62
    iget-boolean v9, p0, La/ilp;->d:Z

    .line 63
    .line 64
    invoke-static {v8, v6, v7, v5, v9}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 65
    .line 66
    .line 67
    const-string v6, ", gamesCount="

    .line 68
    .line 69
    const-string v7, ", top="

    .line 70
    .line 71
    iget-object v8, p0, La/ilp;->f:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v5, v8, v6, v0, v7}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v0, ", new="

    .line 77
    .line 78
    const-string v6, ", expanded="

    .line 79
    .line 80
    iget-boolean v7, p0, La/ilp;->h:Z

    .line 81
    .line 82
    iget-boolean v8, p0, La/ilp;->i:Z

    .line 83
    .line 84
    invoke-static {v0, v6, v5, v7, v8}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 85
    .line 86
    .line 87
    const-string v0, ", expandedEnabled="

    .line 88
    .line 89
    const-string v6, ", games="

    .line 90
    .line 91
    iget-boolean v7, p0, La/ilp;->j:Z

    .line 92
    .line 93
    iget-boolean v8, p0, La/ilp;->k:Z

    .line 94
    .line 95
    invoke-static {v0, v6, v5, v7, v8}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, La/ilp;->l:Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, ", favorite="

    .line 104
    .line 105
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, La/ilp;->m:La/dlp;

    .line 109
    .line 110
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v0, ", bettingDisabled="

    .line 114
    .line 115
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, ", multiSelectEnabled="

    .line 119
    .line 120
    const-string v6, ", selected="

    .line 121
    .line 122
    iget-boolean p0, p0, La/ilp;->n:Z

    .line 123
    .line 124
    invoke-static {v0, v1, v6, v5, p0}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 125
    .line 126
    .line 127
    const-string p0, ", selectionEnabled="

    .line 128
    .line 129
    invoke-static {v5, v3, p0, v4, v2}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0
.end method
