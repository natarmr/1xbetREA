.class public final La/v2k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/x2k0;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J

.field public final d:La/y9q0;

.field public final e:I


# direct methods
.method public constructor <init>()V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 4
    .line 5
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getCommerce-0d7_KjU()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 20
    .line 21
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getCommerceTint-0d7_KjU()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    sget-object v11, La/j1t0;->b:La/qrq;

    .line 26
    .line 27
    sget-wide v8, La/qmk;->r:J

    .line 28
    .line 29
    sget-wide v17, La/qmk;->F:J

    .line 30
    .line 31
    new-instance v19, La/y9q0;

    .line 32
    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    move-object/from16 v5, v19

    .line 36
    .line 37
    const v19, 0xfdffdd

    .line 38
    .line 39
    .line 40
    const-wide/16 v6, 0x0

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    const-wide/16 v12, 0x0

    .line 44
    .line 45
    const/4 v14, 0x0

    .line 46
    const/4 v15, 0x0

    .line 47
    invoke-direct/range {v5 .. v19}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 55
    .line 56
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getCommerce-0d7_KjU()J

    .line 57
    .line 58
    .line 59
    move-result-wide v20

    .line 60
    const/16 v36, 0x0

    .line 61
    .line 62
    const v37, 0xfffffe

    .line 63
    .line 64
    .line 65
    const-wide/16 v22, 0x0

    .line 66
    .line 67
    const/16 v24, 0x0

    .line 68
    .line 69
    const/16 v25, 0x0

    .line 70
    .line 71
    const/16 v26, 0x0

    .line 72
    .line 73
    const-wide/16 v27, 0x0

    .line 74
    .line 75
    const/16 v29, 0x0

    .line 76
    .line 77
    const/16 v30, 0x0

    .line 78
    .line 79
    const/16 v31, 0x0

    .line 80
    .line 81
    const/16 v32, 0x0

    .line 82
    .line 83
    const-wide/16 v33, 0x0

    .line 84
    .line 85
    const/16 v35, 0x0

    .line 86
    .line 87
    move-object/from16 v19, v5

    .line 88
    .line 89
    invoke-static/range {v19 .. v37}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    const v6, 0x7f0809df

    .line 97
    .line 98
    .line 99
    iput v6, v0, La/v2k0;->a:I

    .line 100
    .line 101
    iput-wide v1, v0, La/v2k0;->b:J

    .line 102
    .line 103
    iput-wide v3, v0, La/v2k0;->c:J

    .line 104
    .line 105
    iput-object v5, v0, La/v2k0;->d:La/y9q0;

    .line 106
    .line 107
    const v1, 0x7f1315e0

    .line 108
    .line 109
    .line 110
    iput v1, v0, La/v2k0;->e:I

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, La/v2k0;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final b()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/v2k0;->d:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/v2k0;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/v2k0;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()I
    .locals 0

    .line 1
    iget p0, p0, La/v2k0;->e:I

    .line 2
    .line 3
    return p0
.end method

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
    instance-of v1, p1, La/v2k0;

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
    check-cast p1, La/v2k0;

    .line 12
    .line 13
    iget v1, p0, La/v2k0;->a:I

    .line 14
    .line 15
    iget v3, p1, La/v2k0;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-wide v3, p1, La/v2k0;->b:J

    .line 21
    .line 22
    sget v1, La/y3d;->h:I

    .line 23
    .line 24
    iget-wide v5, p0, La/v2k0;->b:J

    .line 25
    .line 26
    invoke-static {v5, v6, v3, v4}, La/h2t0;->a(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-wide v3, p0, La/v2k0;->c:J

    .line 34
    .line 35
    iget-wide v5, p1, La/v2k0;->c:J

    .line 36
    .line 37
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, La/v2k0;->d:La/y9q0;

    .line 45
    .line 46
    iget-object v3, p1, La/v2k0;->d:La/y9q0;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    iget p0, p0, La/v2k0;->e:I

    .line 56
    .line 57
    iget p1, p1, La/v2k0;->e:I

    .line 58
    .line 59
    if-eq p0, p1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/v2k0;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    sget v2, La/y3d;->h:I

    .line 11
    .line 12
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 13
    .line 14
    iget-wide v2, p0, La/v2k0;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-wide v2, p0, La/v2k0;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, La/v2k0;->d:La/y9q0;

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget p0, p0, La/v2k0;->e:I

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    add-int/2addr p0, v0

    .line 39
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/v2k0;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/v2k0;->c:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", iconBackgroundColor="

    .line 14
    .line 15
    const-string v3, ", backgroundColor="

    .line 16
    .line 17
    iget v4, p0, La/v2k0;->a:I

    .line 18
    .line 19
    const-string v5, "TopUpTransactionButtonType(iconRes="

    .line 20
    .line 21
    invoke-static {v4, v5, v2, v0, v3}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", textStyle="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, La/v2k0;->d:La/y9q0;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ", transactionButtonTextRes="

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ")"

    .line 44
    .line 45
    iget p0, p0, La/v2k0;->e:I

    .line 46
    .line 47
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
