.class public final La/pht;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/muw;


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/oht;

.field public static final n:[La/a8z;


# instance fields
.field public final a:D

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:D

.field public final j:I

.field public final k:J

.field public final l:J

.field public final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/oht;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/pht;->Companion:La/oht;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/tet;

    .line 11
    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/tet;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v3, La/tet;

    .line 22
    .line 23
    const/16 v4, 0xa

    .line 24
    .line 25
    invoke-direct {v3, v4}, La/tet;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v5, La/tet;

    .line 33
    .line 34
    const/16 v6, 0xb

    .line 35
    .line 36
    invoke-direct {v5, v6}, La/tet;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    new-instance v7, La/tet;

    .line 44
    .line 45
    const/16 v8, 0xc

    .line 46
    .line 47
    invoke-direct {v7, v8}, La/tet;-><init>(B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v7}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const/16 v7, 0xd

    .line 55
    .line 56
    new-array v7, v7, [La/a8z;

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    aput-object v10, v7, v9

    .line 61
    .line 62
    const/4 v9, 0x1

    .line 63
    aput-object v10, v7, v9

    .line 64
    .line 65
    const/4 v9, 0x2

    .line 66
    aput-object v1, v7, v9

    .line 67
    .line 68
    const/4 v1, 0x3

    .line 69
    aput-object v3, v7, v1

    .line 70
    .line 71
    const/4 v1, 0x4

    .line 72
    aput-object v5, v7, v1

    .line 73
    .line 74
    const/4 v1, 0x5

    .line 75
    aput-object v0, v7, v1

    .line 76
    .line 77
    const/4 v0, 0x6

    .line 78
    aput-object v10, v7, v0

    .line 79
    .line 80
    const/4 v0, 0x7

    .line 81
    aput-object v10, v7, v0

    .line 82
    .line 83
    const/16 v0, 0x8

    .line 84
    .line 85
    aput-object v10, v7, v0

    .line 86
    .line 87
    aput-object v10, v7, v2

    .line 88
    .line 89
    aput-object v10, v7, v4

    .line 90
    .line 91
    aput-object v10, v7, v6

    .line 92
    .line 93
    aput-object v10, v7, v8

    .line 94
    .line 95
    sput-object v7, La/pht;->n:[La/a8z;

    .line 96
    .line 97
    return-void
.end method

.method public constructor <init>(DILjava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;DIJJI)V
    .locals 0

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-wide p1, p0, La/pht;->a:D

    .line 56
    iput p3, p0, La/pht;->b:I

    .line 57
    iput-object p4, p0, La/pht;->c:Ljava/util/List;

    .line 58
    iput-object p5, p0, La/pht;->d:Ljava/util/List;

    .line 59
    iput-object p6, p0, La/pht;->e:Ljava/util/List;

    .line 60
    iput-object p7, p0, La/pht;->f:Ljava/util/List;

    .line 61
    iput-object p8, p0, La/pht;->g:Ljava/lang/String;

    const/4 p1, 0x1

    .line 62
    iput p1, p0, La/pht;->h:I

    .line 63
    iput-wide p9, p0, La/pht;->i:D

    .line 64
    iput p11, p0, La/pht;->j:I

    .line 65
    iput-wide p12, p0, La/pht;->k:J

    .line 66
    iput-wide p14, p0, La/pht;->l:J

    move/from16 p1, p16

    .line 67
    iput p1, p0, La/pht;->m:I

    return-void
.end method

.method public synthetic constructor <init>(IDILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IDIJJI)V
    .locals 2

    .line 1
    and-int/lit16 v0, p1, 0x1fff

    .line 2
    .line 3
    const/16 v1, 0x1fff

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p2, p0, La/pht;->a:D

    .line 11
    .line 12
    iput p4, p0, La/pht;->b:I

    .line 13
    .line 14
    iput-object p5, p0, La/pht;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-object p6, p0, La/pht;->d:Ljava/util/List;

    .line 17
    .line 18
    iput-object p7, p0, La/pht;->e:Ljava/util/List;

    .line 19
    .line 20
    iput-object p8, p0, La/pht;->f:Ljava/util/List;

    .line 21
    .line 22
    iput-object p9, p0, La/pht;->g:Ljava/lang/String;

    .line 23
    .line 24
    iput p10, p0, La/pht;->h:I

    .line 25
    .line 26
    iput-wide p11, p0, La/pht;->i:D

    .line 27
    .line 28
    iput p13, p0, La/pht;->j:I

    .line 29
    .line 30
    move-wide/from16 p1, p14

    .line 31
    .line 32
    iput-wide p1, p0, La/pht;->k:J

    .line 33
    .line 34
    move-wide/from16 p1, p16

    .line 35
    .line 36
    iput-wide p1, p0, La/pht;->l:J

    .line 37
    .line 38
    move/from16 p1, p18

    .line 39
    .line 40
    iput p1, p0, La/pht;->m:I

    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    sget-object p0, La/nht;->a:La/nht;

    .line 44
    .line 45
    invoke-virtual {p0}, La/nht;->getDescriptor()La/ugi0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/pht;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/pht;

    .line 12
    .line 13
    iget-wide v3, p0, La/pht;->a:D

    .line 14
    .line 15
    iget-wide v5, p1, La/pht;->a:D

    .line 16
    .line 17
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, La/pht;->b:I

    .line 25
    .line 26
    iget v3, p1, La/pht;->b:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, La/pht;->c:Ljava/util/List;

    .line 32
    .line 33
    iget-object v3, p1, La/pht;->c:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, La/pht;->d:Ljava/util/List;

    .line 43
    .line 44
    iget-object v3, p1, La/pht;->d:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, La/pht;->e:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, La/pht;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, La/pht;->f:Ljava/util/List;

    .line 65
    .line 66
    iget-object v3, p1, La/pht;->f:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-object v1, p0, La/pht;->g:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v3, p1, La/pht;->g:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget v1, p0, La/pht;->h:I

    .line 87
    .line 88
    iget v3, p1, La/pht;->h:I

    .line 89
    .line 90
    if-eq v1, v3, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget-wide v3, p0, La/pht;->i:D

    .line 94
    .line 95
    iget-wide v5, p1, La/pht;->i:D

    .line 96
    .line 97
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_a

    .line 102
    .line 103
    return v2

    .line 104
    :cond_a
    iget v1, p0, La/pht;->j:I

    .line 105
    .line 106
    iget v3, p1, La/pht;->j:I

    .line 107
    .line 108
    if-eq v1, v3, :cond_b

    .line 109
    .line 110
    return v2

    .line 111
    :cond_b
    iget-wide v3, p0, La/pht;->k:J

    .line 112
    .line 113
    iget-wide v5, p1, La/pht;->k:J

    .line 114
    .line 115
    cmp-long v1, v3, v5

    .line 116
    .line 117
    if-eqz v1, :cond_c

    .line 118
    .line 119
    return v2

    .line 120
    :cond_c
    iget-wide v3, p0, La/pht;->l:J

    .line 121
    .line 122
    iget-wide v5, p1, La/pht;->l:J

    .line 123
    .line 124
    cmp-long v1, v3, v5

    .line 125
    .line 126
    if-eqz v1, :cond_d

    .line 127
    .line 128
    return v2

    .line 129
    :cond_d
    iget p0, p0, La/pht;->m:I

    .line 130
    .line 131
    iget p1, p1, La/pht;->m:I

    .line 132
    .line 133
    if-eq p0, p1, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/pht;->a:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

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
    iget v2, p0, La/pht;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/pht;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/pht;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/pht;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/pht;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/pht;->g:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_0
    add-int/2addr v0, v2

    .line 51
    mul-int/2addr v0, v1

    .line 52
    iget v2, p0, La/pht;->h:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v2, p0, La/pht;->i:D

    .line 59
    .line 60
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/pht;->j:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-wide v2, p0, La/pht;->k:J

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-wide v2, p0, La/pht;->l:J

    .line 77
    .line 78
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget p0, p0, La/pht;->m:I

    .line 83
    .line 84
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-int/2addr p0, v0

    .line 89
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GenerateCouponRequestTeams(betSize="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, La/pht;->a:D

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", cfView="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, La/pht;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", couponTypes="

    .line 24
    .line 25
    const-string v2, ", eventTypes="

    .line 26
    .line 27
    iget-object v3, p0, La/pht;->c:Ljava/util/List;

    .line 28
    .line 29
    iget-object v4, p0, La/pht;->d:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v1, v2, v0, v3, v4}, La/hne;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", sports="

    .line 35
    .line 36
    const-string v2, ", teamsList="

    .line 37
    .line 38
    iget-object v3, p0, La/pht;->e:Ljava/util/List;

    .line 39
    .line 40
    iget-object v4, p0, La/pht;->f:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v1, v2, v0, v3, v4}, La/hne;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    const-string v1, ", lng="

    .line 46
    .line 47
    const-string v2, ", partner="

    .line 48
    .line 49
    iget v3, p0, La/pht;->h:I

    .line 50
    .line 51
    iget-object v4, p0, La/pht;->g:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v3, v1, v4, v2, v0}, La/axq;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 54
    .line 55
    .line 56
    const-string v1, ", payout="

    .line 57
    .line 58
    const-string v2, ", timeFilter="

    .line 59
    .line 60
    iget-wide v3, p0, La/pht;->i:D

    .line 61
    .line 62
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget v1, p0, La/pht;->j:I

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", userId="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-wide v1, p0, La/pht;->k:J

    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", userIdBonus="

    .line 81
    .line 82
    const-string v2, ", countryId="

    .line 83
    .line 84
    iget-wide v3, p0, La/pht;->l:J

    .line 85
    .line 86
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string v1, ")"

    .line 90
    .line 91
    iget p0, p0, La/pht;->m:I

    .line 92
    .line 93
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method
