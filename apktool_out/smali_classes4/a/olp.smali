.class public final La/olp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qlp;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:Z

.field public final h:Z

.field public final i:Ljava/util/List;

.field public final j:La/jlp;

.field public k:Z

.field public final l:Z

.field public final m:La/yi00;

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;JILjava/lang/String;IZZLjava/util/List;La/jlp;ZLa/yi00;ZZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, La/olp;->a:J

    .line 14
    .line 15
    iput-object p3, p0, La/olp;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p4, p0, La/olp;->c:J

    .line 18
    .line 19
    iput p6, p0, La/olp;->d:I

    .line 20
    .line 21
    iput-object p7, p0, La/olp;->e:Ljava/lang/String;

    .line 22
    .line 23
    iput p8, p0, La/olp;->f:I

    .line 24
    .line 25
    iput-boolean p9, p0, La/olp;->g:Z

    .line 26
    .line 27
    iput-boolean p10, p0, La/olp;->h:Z

    .line 28
    .line 29
    iput-object p11, p0, La/olp;->i:Ljava/util/List;

    .line 30
    .line 31
    iput-object p12, p0, La/olp;->j:La/jlp;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    iput-boolean p1, p0, La/olp;->k:Z

    .line 35
    .line 36
    iput-boolean p13, p0, La/olp;->l:Z

    .line 37
    .line 38
    iput-object p14, p0, La/olp;->m:La/yi00;

    .line 39
    .line 40
    iput-boolean p15, p0, La/olp;->n:Z

    .line 41
    .line 42
    move/from16 p1, p16

    .line 43
    .line 44
    iput-boolean p1, p0, La/olp;->o:Z

    .line 45
    .line 46
    move/from16 p1, p17

    .line 47
    .line 48
    iput-boolean p1, p0, La/olp;->p:Z

    .line 49
    .line 50
    move/from16 p1, p18

    .line 51
    .line 52
    iput-boolean p1, p0, La/olp;->q:Z

    .line 53
    .line 54
    move/from16 p1, p19

    .line 55
    .line 56
    iput-boolean p1, p0, La/olp;->r:Z

    .line 57
    .line 58
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
    instance-of v0, p1, La/olp;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/olp;

    .line 12
    .line 13
    iget-wide v0, p0, La/olp;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/olp;->a:J

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
    iget-object v0, p0, La/olp;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/olp;->b:Ljava/lang/String;

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
    iget-wide v0, p0, La/olp;->c:J

    .line 36
    .line 37
    iget-wide v2, p1, La/olp;->c:J

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
    iget v0, p0, La/olp;->d:I

    .line 46
    .line 47
    iget v1, p1, La/olp;->d:I

    .line 48
    .line 49
    if-eq v0, v1, :cond_5

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :cond_5
    iget-object v0, p0, La/olp;->e:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, p1, La/olp;->e:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_6
    iget v0, p0, La/olp;->f:I

    .line 66
    .line 67
    iget v1, p1, La/olp;->f:I

    .line 68
    .line 69
    if-ne v0, v1, :cond_10

    .line 70
    .line 71
    iget-boolean v0, p0, La/olp;->g:Z

    .line 72
    .line 73
    iget-boolean v1, p1, La/olp;->g:Z

    .line 74
    .line 75
    if-eq v0, v1, :cond_7

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_7
    iget-boolean v0, p0, La/olp;->h:Z

    .line 79
    .line 80
    iget-boolean v1, p1, La/olp;->h:Z

    .line 81
    .line 82
    if-eq v0, v1, :cond_8

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_8
    iget-object v0, p0, La/olp;->i:Ljava/util/List;

    .line 86
    .line 87
    iget-object v1, p1, La/olp;->i:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_9

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_9
    iget-object v0, p0, La/olp;->j:La/jlp;

    .line 97
    .line 98
    iget-object v1, p1, La/olp;->j:La/jlp;

    .line 99
    .line 100
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_a

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_a
    iget-boolean v0, p0, La/olp;->k:Z

    .line 108
    .line 109
    iget-boolean v1, p1, La/olp;->k:Z

    .line 110
    .line 111
    if-eq v0, v1, :cond_b

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_b
    iget-boolean v0, p0, La/olp;->l:Z

    .line 115
    .line 116
    iget-boolean v1, p1, La/olp;->l:Z

    .line 117
    .line 118
    if-eq v0, v1, :cond_c

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_c
    iget-object v0, p0, La/olp;->m:La/yi00;

    .line 122
    .line 123
    iget-object v1, p1, La/olp;->m:La/yi00;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, La/yi00;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_d

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_d
    iget-boolean v0, p0, La/olp;->n:Z

    .line 133
    .line 134
    iget-boolean v1, p1, La/olp;->n:Z

    .line 135
    .line 136
    if-ne v0, v1, :cond_10

    .line 137
    .line 138
    iget-boolean v0, p0, La/olp;->o:Z

    .line 139
    .line 140
    iget-boolean v1, p1, La/olp;->o:Z

    .line 141
    .line 142
    if-ne v0, v1, :cond_10

    .line 143
    .line 144
    iget-boolean v0, p0, La/olp;->p:Z

    .line 145
    .line 146
    iget-boolean v1, p1, La/olp;->p:Z

    .line 147
    .line 148
    if-eq v0, v1, :cond_e

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_e
    iget-boolean v0, p0, La/olp;->q:Z

    .line 152
    .line 153
    iget-boolean v1, p1, La/olp;->q:Z

    .line 154
    .line 155
    if-eq v0, v1, :cond_f

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_f
    iget-boolean p0, p0, La/olp;->r:Z

    .line 159
    .line 160
    iget-boolean p1, p1, La/olp;->r:Z

    .line 161
    .line 162
    if-ne p0, p1, :cond_10

    .line 163
    .line 164
    :goto_0
    const/4 p0, 0x1

    .line 165
    return p0

    .line 166
    :cond_10
    :goto_1
    const/4 p0, 0x0

    .line 167
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
    instance-of p0, p1, La/olp;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    instance-of p0, p2, La/olp;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    check-cast p1, La/olp;

    .line 17
    .line 18
    iget-wide p0, p1, La/olp;->a:J

    .line 19
    .line 20
    check-cast p2, La/olp;

    .line 21
    .line 22
    iget-wide v1, p2, La/olp;->a:J

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
    iget-wide v0, p0, La/olp;->a:J

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
    iget-object v2, p0, La/olp;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/olp;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v3, p0, La/olp;->d:I

    .line 28
    .line 29
    invoke-static {v3, v0, v1}, La/twn;->a(III)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v3, p0, La/olp;->e:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v3, p0, La/olp;->f:I

    .line 40
    .line 41
    invoke-static {v3, v0, v1}, La/twn;->a(III)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-boolean v3, p0, La/olp;->g:Z

    .line 46
    .line 47
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget-boolean v3, p0, La/olp;->h:Z

    .line 52
    .line 53
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v3, p0, La/olp;->i:Ljava/util/List;

    .line 58
    .line 59
    invoke-static {v0, v1, v3}, La/dw9;->a(IILjava/util/List;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v3, p0, La/olp;->j:La/jlp;

    .line 64
    .line 65
    invoke-virtual {v3}, La/jlp;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/2addr v3, v0

    .line 70
    mul-int/2addr v3, v1

    .line 71
    iget-boolean v0, p0, La/olp;->k:Z

    .line 72
    .line 73
    invoke-static {v3, v1, v0}, La/brm0;->e(IIZ)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-boolean v3, p0, La/olp;->l:Z

    .line 78
    .line 79
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v3, p0, La/olp;->m:La/yi00;

    .line 84
    .line 85
    iget v3, v3, La/yi00;->a:I

    .line 86
    .line 87
    invoke-static {v3, v0, v1}, La/twn;->a(III)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget-boolean v2, p0, La/olp;->n:Z

    .line 96
    .line 97
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget-boolean v2, p0, La/olp;->o:Z

    .line 102
    .line 103
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget-boolean v2, p0, La/olp;->p:Z

    .line 108
    .line 109
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iget-boolean v2, p0, La/olp;->q:Z

    .line 114
    .line 115
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget-boolean p0, p0, La/olp;->r:Z

    .line 120
    .line 121
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    add-int/2addr p0, v0

    .line 126
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
    instance-of p0, p1, La/olp;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    instance-of p0, p2, La/olp;

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
    check-cast p1, La/olp;

    .line 22
    .line 23
    iget-object v1, p1, La/olp;->j:La/jlp;

    .line 24
    .line 25
    check-cast p2, La/olp;

    .line 26
    .line 27
    iget-object v2, p2, La/olp;->j:La/jlp;

    .line 28
    .line 29
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget v1, p1, La/olp;->f:I

    .line 33
    .line 34
    new-instance v2, La/klp;

    .line 35
    .line 36
    invoke-direct {v2, v1}, La/klp;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iget v1, p2, La/olp;->f:I

    .line 40
    .line 41
    new-instance v3, La/klp;

    .line 42
    .line 43
    invoke-direct {v3, v1}, La/klp;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v2, v3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v1, p1, La/olp;->n:Z

    .line 50
    .line 51
    new-instance v2, La/llp;

    .line 52
    .line 53
    invoke-direct {v2, v1}, La/llp;-><init>(Z)V

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p2, La/olp;->n:Z

    .line 57
    .line 58
    new-instance v3, La/llp;

    .line 59
    .line 60
    invoke-direct {v3, v1}, La/llp;-><init>(Z)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v2, v3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-boolean v1, p1, La/olp;->o:Z

    .line 67
    .line 68
    new-instance v2, La/mlp;

    .line 69
    .line 70
    invoke-direct {v2, v1}, La/mlp;-><init>(Z)V

    .line 71
    .line 72
    .line 73
    iget-boolean v1, p2, La/olp;->o:Z

    .line 74
    .line 75
    new-instance v3, La/mlp;

    .line 76
    .line 77
    invoke-direct {v3, v1}, La/mlp;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v2, v3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-boolean p1, p1, La/olp;->r:Z

    .line 84
    .line 85
    new-instance v1, La/nlp;

    .line 86
    .line 87
    invoke-direct {v1, p1}, La/nlp;-><init>(Z)V

    .line 88
    .line 89
    .line 90
    iget-boolean p1, p2, La/olp;->r:Z

    .line 91
    .line 92
    new-instance p2, La/nlp;

    .line 93
    .line 94
    invoke-direct {p2, p1}, La/nlp;-><init>(Z)V

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
    .locals 11

    .line 1
    iget v0, p0, La/olp;->f:I

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
    iget-boolean v1, p0, La/olp;->k:Z

    .line 12
    .line 13
    iget-boolean v3, p0, La/olp;->n:Z

    .line 14
    .line 15
    const-string v4, "MultiSelectEnabled(value="

    .line 16
    .line 17
    invoke-static {v4, v2, v3}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-boolean v4, p0, La/olp;->o:Z

    .line 22
    .line 23
    const-string v5, "Selected(value="

    .line 24
    .line 25
    invoke-static {v5, v2, v4}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-boolean v5, p0, La/olp;->r:Z

    .line 30
    .line 31
    const-string v6, "SelectionEnabled(value="

    .line 32
    .line 33
    invoke-static {v6, v2, v5}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v6, "FeedsChampSubItem(id="

    .line 38
    .line 39
    const-string v7, ", title="

    .line 40
    .line 41
    iget-wide v8, p0, La/olp;->a:J

    .line 42
    .line 43
    iget-object v10, p0, La/olp;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v8, v9, v6, v7, v10}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v7, ", sportId="

    .line 50
    .line 51
    const-string v8, ", live=false, subSportId="

    .line 52
    .line 53
    iget-wide v9, p0, La/olp;->c:J

    .line 54
    .line 55
    invoke-static {v6, v7, v9, v10, v8}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v7, ", image="

    .line 59
    .line 60
    const-string v8, ", gamesCount="

    .line 61
    .line 62
    iget v9, p0, La/olp;->d:I

    .line 63
    .line 64
    iget-object v10, p0, La/olp;->e:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v9, v7, v10, v8, v6}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 67
    .line 68
    .line 69
    const-string v7, ", top="

    .line 70
    .line 71
    const-string v8, ", new="

    .line 72
    .line 73
    iget-boolean v9, p0, La/olp;->g:Z

    .line 74
    .line 75
    invoke-static {v0, v7, v8, v6, v9}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, ", games="

    .line 79
    .line 80
    const-string v7, ", favorite="

    .line 81
    .line 82
    iget-object v8, p0, La/olp;->i:Ljava/util/List;

    .line 83
    .line 84
    iget-boolean v9, p0, La/olp;->h:Z

    .line 85
    .line 86
    invoke-static {v6, v0, v8, v7, v9}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, La/olp;->j:La/jlp;

    .line 90
    .line 91
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, ", lastInGroup="

    .line 95
    .line 96
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v0, ", bettingDisabled="

    .line 103
    .line 104
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-boolean v0, p0, La/olp;->l:Z

    .line 108
    .line 109
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, ", expressType="

    .line 113
    .line 114
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, La/olp;->m:La/yi00;

    .line 118
    .line 119
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v0, ", champImageResId=0, multiSelectEnabled="

    .line 123
    .line 124
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v0, ", selected="

    .line 128
    .line 129
    const-string v1, ", expanded="

    .line 130
    .line 131
    invoke-static {v6, v3, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v0, ", expandedEnabled="

    .line 135
    .line 136
    const-string v1, ", selectionEnabled="

    .line 137
    .line 138
    iget-boolean v3, p0, La/olp;->p:Z

    .line 139
    .line 140
    iget-boolean p0, p0, La/olp;->q:Z

    .line 141
    .line 142
    invoke-static {v0, v1, v6, v3, p0}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 143
    .line 144
    .line 145
    invoke-static {v6, v5, v2}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0
.end method
