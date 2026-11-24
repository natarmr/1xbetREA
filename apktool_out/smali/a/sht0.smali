.class public final La/sht0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/rht0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:La/yb9;

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:J

.field public final m:J

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/rht0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/sht0;->Companion:La/rht0;

    .line 7
    .line 8
    sget-object v0, La/yb9;->Companion:La/xb9;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IZZZLa/yb9;Ljava/lang/String;ZIIJJIIII)V
    .locals 2

    .line 1
    const v0, 0x1ffff

    .line 2
    .line 3
    .line 4
    and-int v1, p1, v0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, La/sht0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, La/sht0;->b:Ljava/lang/String;

    .line 14
    .line 15
    iput p4, p0, La/sht0;->c:I

    .line 16
    .line 17
    iput-boolean p5, p0, La/sht0;->d:Z

    .line 18
    .line 19
    iput-boolean p6, p0, La/sht0;->e:Z

    .line 20
    .line 21
    iput-boolean p7, p0, La/sht0;->f:Z

    .line 22
    .line 23
    iput-object p8, p0, La/sht0;->g:La/yb9;

    .line 24
    .line 25
    iput-object p9, p0, La/sht0;->h:Ljava/lang/String;

    .line 26
    .line 27
    iput-boolean p10, p0, La/sht0;->i:Z

    .line 28
    .line 29
    iput p11, p0, La/sht0;->j:I

    .line 30
    .line 31
    iput p12, p0, La/sht0;->k:I

    .line 32
    .line 33
    move-wide p1, p13

    .line 34
    iput-wide p1, p0, La/sht0;->l:J

    .line 35
    .line 36
    move-wide/from16 p1, p15

    .line 37
    .line 38
    iput-wide p1, p0, La/sht0;->m:J

    .line 39
    .line 40
    move/from16 p1, p17

    .line 41
    .line 42
    iput p1, p0, La/sht0;->n:I

    .line 43
    .line 44
    move/from16 p1, p18

    .line 45
    .line 46
    iput p1, p0, La/sht0;->o:I

    .line 47
    .line 48
    move/from16 p1, p19

    .line 49
    .line 50
    iput p1, p0, La/sht0;->p:I

    .line 51
    .line 52
    move/from16 p1, p20

    .line 53
    .line 54
    iput p1, p0, La/sht0;->q:I

    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    sget-object p0, La/qht0;->a:La/qht0;

    .line 58
    .line 59
    invoke-virtual {p0}, La/qht0;->getDescriptor()La/ugi0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p1, v0, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;ZLa/yb9;Ljava/lang/String;IIJJII)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, La/sht0;->a:Ljava/lang/String;

    .line 70
    const-string p1, "0.0"

    iput-object p1, p0, La/sht0;->b:Ljava/lang/String;

    const/4 p1, 0x0

    .line 71
    iput p1, p0, La/sht0;->c:I

    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, La/sht0;->d:Z

    .line 73
    iput-boolean p1, p0, La/sht0;->e:Z

    .line 74
    iput-boolean p2, p0, La/sht0;->f:Z

    .line 75
    iput-object p3, p0, La/sht0;->g:La/yb9;

    .line 76
    iput-object p4, p0, La/sht0;->h:Ljava/lang/String;

    .line 77
    iput-boolean v0, p0, La/sht0;->i:Z

    .line 78
    iput p5, p0, La/sht0;->j:I

    .line 79
    iput p6, p0, La/sht0;->k:I

    .line 80
    iput-wide p7, p0, La/sht0;->l:J

    .line 81
    iput-wide p9, p0, La/sht0;->m:J

    const/16 p1, 0x16

    .line 82
    iput p1, p0, La/sht0;->n:I

    .line 83
    iput v0, p0, La/sht0;->o:I

    .line 84
    iput p11, p0, La/sht0;->p:I

    .line 85
    iput p12, p0, La/sht0;->q:I

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
    instance-of v1, p1, La/sht0;

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
    check-cast p1, La/sht0;

    .line 12
    .line 13
    iget-object v1, p0, La/sht0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, La/sht0;->a:Ljava/lang/String;

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
    iget-object v1, p0, La/sht0;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, La/sht0;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, La/sht0;->c:I

    .line 36
    .line 37
    iget v3, p1, La/sht0;->c:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-boolean v1, p0, La/sht0;->d:Z

    .line 43
    .line 44
    iget-boolean v3, p1, La/sht0;->d:Z

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-boolean v1, p0, La/sht0;->e:Z

    .line 50
    .line 51
    iget-boolean v3, p1, La/sht0;->e:Z

    .line 52
    .line 53
    if-eq v1, v3, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    iget-boolean v1, p0, La/sht0;->f:Z

    .line 57
    .line 58
    iget-boolean v3, p1, La/sht0;->f:Z

    .line 59
    .line 60
    if-eq v1, v3, :cond_7

    .line 61
    .line 62
    return v2

    .line 63
    :cond_7
    iget-object v1, p0, La/sht0;->g:La/yb9;

    .line 64
    .line 65
    iget-object v3, p1, La/sht0;->g:La/yb9;

    .line 66
    .line 67
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    iget-object v1, p0, La/sht0;->h:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v3, p1, La/sht0;->h:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    iget-boolean v1, p0, La/sht0;->i:Z

    .line 86
    .line 87
    iget-boolean v3, p1, La/sht0;->i:Z

    .line 88
    .line 89
    if-eq v1, v3, :cond_a

    .line 90
    .line 91
    return v2

    .line 92
    :cond_a
    iget v1, p0, La/sht0;->j:I

    .line 93
    .line 94
    iget v3, p1, La/sht0;->j:I

    .line 95
    .line 96
    if-eq v1, v3, :cond_b

    .line 97
    .line 98
    return v2

    .line 99
    :cond_b
    iget v1, p0, La/sht0;->k:I

    .line 100
    .line 101
    iget v3, p1, La/sht0;->k:I

    .line 102
    .line 103
    if-eq v1, v3, :cond_c

    .line 104
    .line 105
    return v2

    .line 106
    :cond_c
    iget-wide v3, p0, La/sht0;->l:J

    .line 107
    .line 108
    iget-wide v5, p1, La/sht0;->l:J

    .line 109
    .line 110
    cmp-long v1, v3, v5

    .line 111
    .line 112
    if-eqz v1, :cond_d

    .line 113
    .line 114
    return v2

    .line 115
    :cond_d
    iget-wide v3, p0, La/sht0;->m:J

    .line 116
    .line 117
    iget-wide v5, p1, La/sht0;->m:J

    .line 118
    .line 119
    cmp-long v1, v3, v5

    .line 120
    .line 121
    if-eqz v1, :cond_e

    .line 122
    .line 123
    return v2

    .line 124
    :cond_e
    iget v1, p0, La/sht0;->n:I

    .line 125
    .line 126
    iget v3, p1, La/sht0;->n:I

    .line 127
    .line 128
    if-eq v1, v3, :cond_f

    .line 129
    .line 130
    return v2

    .line 131
    :cond_f
    iget v1, p0, La/sht0;->o:I

    .line 132
    .line 133
    iget v3, p1, La/sht0;->o:I

    .line 134
    .line 135
    if-eq v1, v3, :cond_10

    .line 136
    .line 137
    return v2

    .line 138
    :cond_10
    iget v1, p0, La/sht0;->p:I

    .line 139
    .line 140
    iget v3, p1, La/sht0;->p:I

    .line 141
    .line 142
    if-eq v1, v3, :cond_11

    .line 143
    .line 144
    return v2

    .line 145
    :cond_11
    iget p0, p0, La/sht0;->q:I

    .line 146
    .line 147
    iget p1, p1, La/sht0;->q:I

    .line 148
    .line 149
    if-eq p0, p1, :cond_12

    .line 150
    .line 151
    return v2

    .line 152
    :cond_12
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/sht0;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/sht0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/sht0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/sht0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/sht0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/sht0;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/sht0;->g:La/yb9;

    .line 41
    .line 42
    invoke-virtual {v2}, La/yb9;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object v0, p0, La/sht0;->h:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/sht0;->i:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget v2, p0, La/sht0;->j:I

    .line 61
    .line 62
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget v2, p0, La/sht0;->k:I

    .line 67
    .line 68
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-wide v2, p0, La/sht0;->l:J

    .line 73
    .line 74
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-wide v2, p0, La/sht0;->m:J

    .line 79
    .line 80
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget v2, p0, La/sht0;->n:I

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget v2, p0, La/sht0;->o:I

    .line 91
    .line 92
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget v2, p0, La/sht0;->p:I

    .line 97
    .line 98
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget p0, p0, La/sht0;->q:I

    .line 103
    .line 104
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    add-int/2addr p0, v0

    .line 109
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", sum="

    .line 2
    .line 3
    const-string v1, ", checkCoef="

    .line 4
    .line 5
    const-string v2, "UpdateCouponBuilderRequest(appGUID="

    .line 6
    .line 7
    iget-object v3, p0, La/sht0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/sht0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", noWait="

    .line 16
    .line 17
    const-string v2, ", advanceBet="

    .line 18
    .line 19
    iget v3, p0, La/sht0;->c:I

    .line 20
    .line 21
    iget-boolean v4, p0, La/sht0;->d:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", addPromoCodes="

    .line 27
    .line 28
    const-string v2, ", builderCoupon="

    .line 29
    .line 30
    iget-boolean v3, p0, La/sht0;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/sht0;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, La/sht0;->g:La/yb9;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", lng="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, La/sht0;->h:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", isNewBuilder="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", cfView="

    .line 58
    .line 59
    const-string v2, ", kind="

    .line 60
    .line 61
    iget v3, p0, La/sht0;->j:I

    .line 62
    .line 63
    iget-boolean v4, p0, La/sht0;->i:Z

    .line 64
    .line 65
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 66
    .line 67
    .line 68
    iget v1, p0, La/sht0;->k:I

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", userId="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-wide v1, p0, La/sht0;->l:J

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", userBonusId="

    .line 84
    .line 85
    const-string v2, ", source="

    .line 86
    .line 87
    iget-wide v3, p0, La/sht0;->m:J

    .line 88
    .line 89
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v1, ", refId="

    .line 93
    .line 94
    const-string v2, ", country="

    .line 95
    .line 96
    iget v3, p0, La/sht0;->n:I

    .line 97
    .line 98
    iget v4, p0, La/sht0;->o:I

    .line 99
    .line 100
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 101
    .line 102
    .line 103
    const-string v1, ", vid="

    .line 104
    .line 105
    const-string v2, ")"

    .line 106
    .line 107
    iget v3, p0, La/sht0;->p:I

    .line 108
    .line 109
    iget p0, p0, La/sht0;->q:I

    .line 110
    .line 111
    invoke-static {v3, p0, v1, v2, v0}, La/w6x;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method
