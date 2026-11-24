.class public final La/kb7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/r47;


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/jb7;

.field public static final m:[La/a8z;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:J

.field public final d:I

.field public final e:Ljava/util/List;

.field public final f:Ljava/lang/Long;

.field public final g:Z

.field public final h:Z

.field public final i:I

.field public final j:Z

.field public final k:Ljava/lang/String;

.field public final l:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/jb7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/kb7;->Companion:La/jb7;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/t07;

    .line 11
    .line 12
    const/16 v2, 0xf

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/t07;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, La/t07;

    .line 22
    .line 23
    const/16 v3, 0x10

    .line 24
    .line 25
    invoke-direct {v2, v3}, La/t07;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/16 v2, 0xc

    .line 33
    .line 34
    new-array v2, v2, [La/a8z;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    aput-object v4, v2, v3

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    aput-object v4, v2, v3

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    aput-object v4, v2, v3

    .line 45
    .line 46
    const/4 v3, 0x3

    .line 47
    aput-object v4, v2, v3

    .line 48
    .line 49
    const/4 v3, 0x4

    .line 50
    aput-object v1, v2, v3

    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    aput-object v4, v2, v1

    .line 54
    .line 55
    const/4 v1, 0x6

    .line 56
    aput-object v4, v2, v1

    .line 57
    .line 58
    const/4 v1, 0x7

    .line 59
    aput-object v4, v2, v1

    .line 60
    .line 61
    const/16 v1, 0x8

    .line 62
    .line 63
    aput-object v4, v2, v1

    .line 64
    .line 65
    const/16 v1, 0x9

    .line 66
    .line 67
    aput-object v4, v2, v1

    .line 68
    .line 69
    const/16 v1, 0xa

    .line 70
    .line 71
    aput-object v4, v2, v1

    .line 72
    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    aput-object v0, v2, v1

    .line 76
    .line 77
    sput-object v2, La/kb7;->m:[La/a8z;

    .line 78
    .line 79
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IJILjava/util/List;Ljava/lang/Long;ZZIZLjava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 1
    and-int/lit16 v0, p1, 0xedf

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xedf

    .line 5
    .line 6
    if-ne v2, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, La/kb7;->a:Ljava/lang/String;

    .line 12
    .line 13
    iput p3, p0, La/kb7;->b:I

    .line 14
    .line 15
    iput-wide p4, p0, La/kb7;->c:J

    .line 16
    .line 17
    iput p6, p0, La/kb7;->d:I

    .line 18
    .line 19
    iput-object p7, p0, La/kb7;->e:Ljava/util/List;

    .line 20
    .line 21
    and-int/lit8 p2, p1, 0x20

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    iput-object v1, p0, La/kb7;->f:Ljava/lang/Long;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object p8, p0, La/kb7;->f:Ljava/lang/Long;

    .line 29
    .line 30
    :goto_0
    iput-boolean p9, p0, La/kb7;->g:Z

    .line 31
    .line 32
    iput-boolean p10, p0, La/kb7;->h:Z

    .line 33
    .line 34
    and-int/lit16 p1, p1, 0x100

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iput p1, p0, La/kb7;->i:I

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iput p11, p0, La/kb7;->i:I

    .line 43
    .line 44
    :goto_1
    iput-boolean p12, p0, La/kb7;->j:Z

    .line 45
    .line 46
    move-object/from16 p1, p13

    .line 47
    .line 48
    iput-object p1, p0, La/kb7;->k:Ljava/lang/String;

    .line 49
    .line 50
    move-object/from16 p1, p14

    .line 51
    .line 52
    iput-object p1, p0, La/kb7;->l:Ljava/util/List;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    sget-object p0, La/ib7;->a:La/ib7;

    .line 56
    .line 57
    invoke-virtual {p0}, La/ib7;->getDescriptor()La/ugi0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p1, v2, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 62
    .line 63
    .line 64
    throw v1
.end method

.method public constructor <init>(Ljava/lang/String;IJILjava/util/ArrayList;Ljava/lang/Long;ZLjava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 65
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, La/kb7;->a:Ljava/lang/String;

    .line 68
    iput p2, p0, La/kb7;->b:I

    .line 69
    iput-wide p3, p0, La/kb7;->c:J

    .line 70
    iput p5, p0, La/kb7;->d:I

    .line 71
    iput-object p6, p0, La/kb7;->e:Ljava/util/List;

    .line 72
    iput-object p7, p0, La/kb7;->f:Ljava/lang/Long;

    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, La/kb7;->g:Z

    const/4 p1, 0x0

    .line 74
    iput-boolean p1, p0, La/kb7;->h:Z

    .line 75
    iput p1, p0, La/kb7;->i:I

    .line 76
    iput-boolean p8, p0, La/kb7;->j:Z

    .line 77
    iput-object p9, p0, La/kb7;->k:Ljava/lang/String;

    .line 78
    iput-object p10, p0, La/kb7;->l:Ljava/util/List;

    return-void
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
    instance-of v1, p1, La/kb7;

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
    check-cast p1, La/kb7;

    .line 12
    .line 13
    iget-object v1, p0, La/kb7;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, La/kb7;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, La/kb7;->b:I

    .line 25
    .line 26
    iget v3, p1, La/kb7;->b:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-wide v3, p0, La/kb7;->c:J

    .line 32
    .line 33
    iget-wide v5, p1, La/kb7;->c:J

    .line 34
    .line 35
    cmp-long v1, v3, v5

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget v1, p0, La/kb7;->d:I

    .line 41
    .line 42
    iget v3, p1, La/kb7;->d:I

    .line 43
    .line 44
    if-eq v1, v3, :cond_5

    .line 45
    .line 46
    return v2

    .line 47
    :cond_5
    iget-object v1, p0, La/kb7;->e:Ljava/util/List;

    .line 48
    .line 49
    iget-object v3, p1, La/kb7;->e:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_6

    .line 56
    .line 57
    return v2

    .line 58
    :cond_6
    iget-object v1, p0, La/kb7;->f:Ljava/lang/Long;

    .line 59
    .line 60
    iget-object v3, p1, La/kb7;->f:Ljava/lang/Long;

    .line 61
    .line 62
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_7

    .line 67
    .line 68
    return v2

    .line 69
    :cond_7
    iget-boolean v1, p0, La/kb7;->g:Z

    .line 70
    .line 71
    iget-boolean v3, p1, La/kb7;->g:Z

    .line 72
    .line 73
    if-eq v1, v3, :cond_8

    .line 74
    .line 75
    return v2

    .line 76
    :cond_8
    iget-boolean v1, p0, La/kb7;->h:Z

    .line 77
    .line 78
    iget-boolean v3, p1, La/kb7;->h:Z

    .line 79
    .line 80
    if-eq v1, v3, :cond_9

    .line 81
    .line 82
    return v2

    .line 83
    :cond_9
    iget v1, p0, La/kb7;->i:I

    .line 84
    .line 85
    iget v3, p1, La/kb7;->i:I

    .line 86
    .line 87
    if-eq v1, v3, :cond_a

    .line 88
    .line 89
    return v2

    .line 90
    :cond_a
    iget-boolean v1, p0, La/kb7;->j:Z

    .line 91
    .line 92
    iget-boolean v3, p1, La/kb7;->j:Z

    .line 93
    .line 94
    if-eq v1, v3, :cond_b

    .line 95
    .line 96
    return v2

    .line 97
    :cond_b
    iget-object v1, p0, La/kb7;->k:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v3, p1, La/kb7;->k:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_c

    .line 106
    .line 107
    return v2

    .line 108
    :cond_c
    iget-object p0, p0, La/kb7;->l:Ljava/util/List;

    .line 109
    .line 110
    iget-object p1, p1, La/kb7;->l:Ljava/util/List;

    .line 111
    .line 112
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_d

    .line 117
    .line 118
    return v2

    .line 119
    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/kb7;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget v2, p0, La/kb7;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/kb7;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/kb7;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/kb7;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/kb7;->f:Ljava/lang/Long;

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
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

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
    iget-boolean v2, p0, La/kb7;->g:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/kb7;->h:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, La/kb7;->i:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/kb7;->j:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/kb7;->k:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object p0, p0, La/kb7;->l:Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

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
    const-string v0, ", cfView="

    .line 2
    .line 3
    const-string v1, ", userBonusId="

    .line 4
    .line 5
    iget v2, p0, La/kb7;->b:I

    .line 6
    .line 7
    const-string v3, "BetInfoHistoryWithSummaryByGlobalChampWithBetTypesRequest(language="

    .line 8
    .line 9
    iget-object v4, p0, La/kb7;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, La/kng0;->p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", count="

    .line 16
    .line 17
    iget-wide v2, p0, La/kb7;->c:J

    .line 18
    .line 19
    iget v4, p0, La/kb7;->d:I

    .line 20
    .line 21
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", statusList="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/kb7;->e:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", lastId="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/kb7;->f:Ljava/lang/Long;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", needSaleInfo="

    .line 45
    .line 46
    const-string v2, ", betsForSale="

    .line 47
    .line 48
    iget-boolean v3, p0, La/kb7;->g:Z

    .line 49
    .line 50
    iget-boolean v4, p0, La/kb7;->h:Z

    .line 51
    .line 52
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 53
    .line 54
    .line 55
    const-string v1, ", partnerId="

    .line 56
    .line 57
    const-string v2, ", calculateSummaryInfo="

    .line 58
    .line 59
    iget v3, p0, La/kb7;->i:I

    .line 60
    .line 61
    iget-boolean v4, p0, La/kb7;->j:Z

    .line 62
    .line 63
    invoke-static {v3, v1, v2, v0, v4}, La/dw9;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", globalChampId="

    .line 67
    .line 68
    const-string v2, ", betTypeList="

    .line 69
    .line 70
    iget-object v3, p0, La/kb7;->k:Ljava/lang/String;

    .line 71
    .line 72
    iget-object p0, p0, La/kb7;->l:Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v1, v3, v2, v0, p0}, La/ua80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    const-string p0, ")"

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method
