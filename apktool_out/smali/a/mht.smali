.class public final La/mht;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/muw;


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/lht;

.field public static final m:[La/a8z;


# instance fields
.field public final a:D

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:D

.field public final i:I

.field public final j:J

.field public final k:J

.field public final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/lht;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/mht;->Companion:La/lht;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/tet;

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-direct {v1, v2}, La/tet;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v3, La/tet;

    .line 21
    .line 22
    const/4 v4, 0x7

    .line 23
    invoke-direct {v3, v4}, La/tet;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v5, La/tet;

    .line 31
    .line 32
    const/16 v6, 0x8

    .line 33
    .line 34
    invoke-direct {v5, v6}, La/tet;-><init>(B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/16 v5, 0xc

    .line 42
    .line 43
    new-array v5, v5, [La/a8z;

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    aput-object v8, v5, v7

    .line 48
    .line 49
    const/4 v7, 0x1

    .line 50
    aput-object v8, v5, v7

    .line 51
    .line 52
    const/4 v7, 0x2

    .line 53
    aput-object v1, v5, v7

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    aput-object v3, v5, v1

    .line 57
    .line 58
    const/4 v1, 0x4

    .line 59
    aput-object v0, v5, v1

    .line 60
    .line 61
    const/4 v0, 0x5

    .line 62
    aput-object v8, v5, v0

    .line 63
    .line 64
    aput-object v8, v5, v2

    .line 65
    .line 66
    aput-object v8, v5, v4

    .line 67
    .line 68
    aput-object v8, v5, v6

    .line 69
    .line 70
    const/16 v0, 0x9

    .line 71
    .line 72
    aput-object v8, v5, v0

    .line 73
    .line 74
    const/16 v0, 0xa

    .line 75
    .line 76
    aput-object v8, v5, v0

    .line 77
    .line 78
    const/16 v0, 0xb

    .line 79
    .line 80
    aput-object v8, v5, v0

    .line 81
    .line 82
    sput-object v5, La/mht;->m:[La/a8z;

    .line 83
    .line 84
    return-void
.end method

.method public constructor <init>(DILjava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;DIJJI)V
    .locals 0

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-wide p1, p0, La/mht;->a:D

    .line 53
    iput p3, p0, La/mht;->b:I

    .line 54
    iput-object p4, p0, La/mht;->c:Ljava/util/List;

    .line 55
    iput-object p5, p0, La/mht;->d:Ljava/util/List;

    .line 56
    iput-object p6, p0, La/mht;->e:Ljava/util/List;

    .line 57
    iput-object p7, p0, La/mht;->f:Ljava/lang/String;

    const/4 p1, 0x1

    .line 58
    iput p1, p0, La/mht;->g:I

    .line 59
    iput-wide p8, p0, La/mht;->h:D

    .line 60
    iput p10, p0, La/mht;->i:I

    .line 61
    iput-wide p11, p0, La/mht;->j:J

    .line 62
    iput-wide p13, p0, La/mht;->k:J

    .line 63
    iput p15, p0, La/mht;->l:I

    return-void
.end method

.method public synthetic constructor <init>(IDILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IDIJJI)V
    .locals 2

    .line 1
    and-int/lit16 v0, p1, 0xfff

    .line 2
    .line 3
    const/16 v1, 0xfff

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p2, p0, La/mht;->a:D

    .line 11
    .line 12
    iput p4, p0, La/mht;->b:I

    .line 13
    .line 14
    iput-object p5, p0, La/mht;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-object p6, p0, La/mht;->d:Ljava/util/List;

    .line 17
    .line 18
    iput-object p7, p0, La/mht;->e:Ljava/util/List;

    .line 19
    .line 20
    iput-object p8, p0, La/mht;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput p9, p0, La/mht;->g:I

    .line 23
    .line 24
    iput-wide p10, p0, La/mht;->h:D

    .line 25
    .line 26
    iput p12, p0, La/mht;->i:I

    .line 27
    .line 28
    move-wide p1, p13

    .line 29
    iput-wide p1, p0, La/mht;->j:J

    .line 30
    .line 31
    move-wide/from16 p1, p15

    .line 32
    .line 33
    iput-wide p1, p0, La/mht;->k:J

    .line 34
    .line 35
    move/from16 p1, p17

    .line 36
    .line 37
    iput p1, p0, La/mht;->l:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    sget-object p0, La/kht;->a:La/kht;

    .line 41
    .line 42
    invoke-virtual {p0}, La/kht;->getDescriptor()La/ugi0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
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
    instance-of v1, p1, La/mht;

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
    check-cast p1, La/mht;

    .line 12
    .line 13
    iget-wide v3, p0, La/mht;->a:D

    .line 14
    .line 15
    iget-wide v5, p1, La/mht;->a:D

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
    iget v1, p0, La/mht;->b:I

    .line 25
    .line 26
    iget v3, p1, La/mht;->b:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, La/mht;->c:Ljava/util/List;

    .line 32
    .line 33
    iget-object v3, p1, La/mht;->c:Ljava/util/List;

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
    iget-object v1, p0, La/mht;->d:Ljava/util/List;

    .line 43
    .line 44
    iget-object v3, p1, La/mht;->d:Ljava/util/List;

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
    iget-object v1, p0, La/mht;->e:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, La/mht;->e:Ljava/util/List;

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
    iget-object v1, p0, La/mht;->f:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v3, p1, La/mht;->f:Ljava/lang/String;

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
    iget v1, p0, La/mht;->g:I

    .line 76
    .line 77
    iget v3, p1, La/mht;->g:I

    .line 78
    .line 79
    if-eq v1, v3, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-wide v3, p0, La/mht;->h:D

    .line 83
    .line 84
    iget-wide v5, p1, La/mht;->h:D

    .line 85
    .line 86
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget v1, p0, La/mht;->i:I

    .line 94
    .line 95
    iget v3, p1, La/mht;->i:I

    .line 96
    .line 97
    if-eq v1, v3, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-wide v3, p0, La/mht;->j:J

    .line 101
    .line 102
    iget-wide v5, p1, La/mht;->j:J

    .line 103
    .line 104
    cmp-long v1, v3, v5

    .line 105
    .line 106
    if-eqz v1, :cond_b

    .line 107
    .line 108
    return v2

    .line 109
    :cond_b
    iget-wide v3, p0, La/mht;->k:J

    .line 110
    .line 111
    iget-wide v5, p1, La/mht;->k:J

    .line 112
    .line 113
    cmp-long v1, v3, v5

    .line 114
    .line 115
    if-eqz v1, :cond_c

    .line 116
    .line 117
    return v2

    .line 118
    :cond_c
    iget p0, p0, La/mht;->l:I

    .line 119
    .line 120
    iget p1, p1, La/mht;->l:I

    .line 121
    .line 122
    if-eq p0, p1, :cond_d

    .line 123
    .line 124
    return v2

    .line 125
    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/mht;->a:D

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
    iget v2, p0, La/mht;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/mht;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/mht;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/mht;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/mht;->f:Ljava/lang/String;

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    :goto_0
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    iget v2, p0, La/mht;->g:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, La/mht;->h:D

    .line 53
    .line 54
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, La/mht;->i:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-wide v2, p0, La/mht;->j:J

    .line 65
    .line 66
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-wide v2, p0, La/mht;->k:J

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget p0, p0, La/mht;->l:I

    .line 77
    .line 78
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v0

    .line 83
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GenerateCouponRequest(betSize="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, La/mht;->a:D

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
    iget v1, p0, La/mht;->b:I

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
    iget-object v3, p0, La/mht;->c:Ljava/util/List;

    .line 28
    .line 29
    iget-object v4, p0, La/mht;->d:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v1, v2, v0, v3, v4}, La/hne;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", sports="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/mht;->e:Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", lng="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/mht;->f:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", partner="

    .line 55
    .line 56
    const-string v2, ", payout="

    .line 57
    .line 58
    iget v3, p0, La/mht;->g:I

    .line 59
    .line 60
    invoke-static {v0, v1, v3, v2}, La/rw2;->x(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v1, ", timeFilter="

    .line 64
    .line 65
    iget-wide v2, p0, La/mht;->h:D

    .line 66
    .line 67
    iget v4, p0, La/mht;->i:I

    .line 68
    .line 69
    invoke-static {v0, v2, v3, v1, v4}, La/rz4;->w(Ljava/lang/StringBuilder;DLjava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    const-string v1, ", userId="

    .line 73
    .line 74
    const-string v2, ", userIdBonus="

    .line 75
    .line 76
    iget-wide v3, p0, La/mht;->j:J

    .line 77
    .line 78
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, ", countryId="

    .line 82
    .line 83
    iget-wide v2, p0, La/mht;->k:J

    .line 84
    .line 85
    iget p0, p0, La/mht;->l:I

    .line 86
    .line 87
    invoke-static {v0, v2, v3, v1, p0}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    const-string p0, ")"

    .line 91
    .line 92
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0
.end method
