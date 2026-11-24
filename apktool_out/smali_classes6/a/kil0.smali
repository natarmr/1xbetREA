.class public final La/kil0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lil0;
.implements La/qil0;


# instance fields
.field public final a:I

.field public final b:La/y9q0;

.field public final c:La/y9q0;

.field public final d:La/iil0;

.field public final e:La/ahl0;


# direct methods
.method public constructor <init>(ILa/y9q0;La/y9q0;La/iil0;La/ahl0;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput p1, p0, La/kil0;->a:I

    .line 85
    iput-object p2, p0, La/kil0;->b:La/y9q0;

    .line 86
    iput-object p3, p0, La/kil0;->c:La/y9q0;

    .line 87
    iput-object p4, p0, La/kil0;->d:La/iil0;

    .line 88
    iput-object p5, p0, La/kil0;->e:La/ahl0;

    return-void
.end method

.method public constructor <init>(La/y9q0;La/y9q0;La/zgl0;I)V
    .locals 19

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    :goto_0
    move v2, v0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :goto_1
    and-int/lit8 v0, p4, 0x2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v9, La/j1t0;->c:La/qrq;

    .line 17
    .line 18
    sget-wide v6, La/qmk;->q:J

    .line 19
    .line 20
    sget-wide v15, La/qmk;->D:J

    .line 21
    .line 22
    new-instance v3, La/y9q0;

    .line 23
    .line 24
    const/4 v14, 0x0

    .line 25
    const v17, 0xfdffdd

    .line 26
    .line 27
    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    const-wide/16 v10, 0x0

    .line 32
    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v13, 0x0

    .line 35
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move-object/from16 v3, p1

    .line 40
    .line 41
    :goto_2
    and-int/lit8 v0, p4, 0x4

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    sget-object v10, La/j1t0;->a:La/qrq;

    .line 46
    .line 47
    sget-wide v7, La/qmk;->q:J

    .line 48
    .line 49
    sget-wide v16, La/qmk;->D:J

    .line 50
    .line 51
    new-instance v4, La/y9q0;

    .line 52
    .line 53
    const/4 v15, 0x0

    .line 54
    const v18, 0xfdffdd

    .line 55
    .line 56
    .line 57
    const-wide/16 v5, 0x0

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const-wide/16 v11, 0x0

    .line 61
    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    invoke-direct/range {v4 .. v18}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    move-object/from16 v4, p2

    .line 69
    .line 70
    :goto_3
    new-instance v5, La/iil0;

    .line 71
    .line 72
    invoke-direct {v5}, La/iil0;-><init>()V

    .line 73
    .line 74
    .line 75
    move-object/from16 v1, p0

    .line 76
    .line 77
    move-object/from16 v6, p3

    .line 78
    .line 79
    invoke-direct/range {v1 .. v6}, La/kil0;-><init>(ILa/y9q0;La/y9q0;La/iil0;La/ahl0;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final a()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kil0;->c:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, La/kil0;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()La/ahl0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kil0;->e:La/ahl0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()La/iil0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kil0;->d:La/iil0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kil0;->b:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/kil0;

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
    check-cast p1, La/kil0;

    .line 12
    .line 13
    iget v1, p0, La/kil0;->a:I

    .line 14
    .line 15
    iget v3, p1, La/kil0;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/kil0;->b:La/y9q0;

    .line 21
    .line 22
    iget-object v3, p1, La/kil0;->b:La/y9q0;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, La/kil0;->c:La/y9q0;

    .line 32
    .line 33
    iget-object v3, p1, La/kil0;->c:La/y9q0;

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
    iget-object v1, p0, La/kil0;->d:La/iil0;

    .line 43
    .line 44
    iget-object v3, p1, La/kil0;->d:La/iil0;

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
    iget-object p0, p0, La/kil0;->e:La/ahl0;

    .line 54
    .line 55
    iget-object p1, p1, La/kil0;->e:La/ahl0;

    .line 56
    .line 57
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/kil0;->a:I

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
    iget-object v2, p0, La/kil0;->b:La/y9q0;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/kil0;->c:La/y9q0;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/kil0;->d:La/iil0;

    .line 23
    .line 24
    invoke-virtual {v2}, La/iil0;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object p0, p0, La/kil0;->e:La/ahl0;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v2

    .line 37
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Row(marketLabelMaxLines="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, La/kil0;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", marketLabelFontStyle="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/kil0;->b:La/y9q0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", coefficientLabelFontStyle="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/kil0;->c:La/y9q0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", corners="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/kil0;->d:La/iil0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", sportMarketColorScheme="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/kil0;->e:La/ahl0;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ")"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
