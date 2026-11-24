.class public final La/gil0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hil0;
.implements La/qil0;


# instance fields
.field public final a:I

.field public final b:La/y9q0;

.field public final c:La/y9q0;

.field public final d:La/ahl0;


# direct methods
.method public constructor <init>(ILa/y9q0;La/y9q0;La/ahl0;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput p1, p0, La/gil0;->a:I

    .line 80
    iput-object p2, p0, La/gil0;->b:La/y9q0;

    .line 81
    iput-object p3, p0, La/gil0;->c:La/y9q0;

    .line 82
    iput-object p4, p0, La/gil0;->d:La/ahl0;

    return-void
.end method

.method public constructor <init>(ILa/y9q0;La/y9q0;La/zgl0;I)V
    .locals 18

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move/from16 v0, p1

    .line 10
    .line 11
    :goto_0
    and-int/lit8 v1, p5, 0x2

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    sget-object v8, La/j1t0;->c:La/qrq;

    .line 16
    .line 17
    sget-wide v5, La/qmk;->q:J

    .line 18
    .line 19
    sget-wide v14, La/qmk;->D:J

    .line 20
    .line 21
    new-instance v2, La/y9q0;

    .line 22
    .line 23
    const/4 v13, 0x0

    .line 24
    const v16, 0xfdffdd

    .line 25
    .line 26
    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const-wide/16 v9, 0x0

    .line 31
    .line 32
    const/4 v11, 0x0

    .line 33
    const/4 v12, 0x0

    .line 34
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object/from16 v2, p2

    .line 39
    .line 40
    :goto_1
    and-int/lit8 v1, p5, 0x4

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    sget-object v9, La/j1t0;->a:La/qrq;

    .line 45
    .line 46
    sget-wide v6, La/qmk;->r:J

    .line 47
    .line 48
    sget-wide v15, La/qmk;->F:J

    .line 49
    .line 50
    new-instance v3, La/y9q0;

    .line 51
    .line 52
    const/4 v14, 0x0

    .line 53
    const v17, 0xfdffdd

    .line 54
    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const-wide/16 v10, 0x0

    .line 60
    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 64
    .line 65
    .line 66
    :goto_2
    move-object/from16 v1, p0

    .line 67
    .line 68
    move-object/from16 v4, p4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move-object/from16 v3, p3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :goto_3
    invoke-direct {v1, v0, v2, v3, v4}, La/gil0;-><init>(ILa/y9q0;La/y9q0;La/ahl0;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gil0;->c:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, La/gil0;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()La/ahl0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gil0;->d:La/ahl0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gil0;->b:La/y9q0;

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
    instance-of v1, p1, La/gil0;

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
    check-cast p1, La/gil0;

    .line 12
    .line 13
    iget v1, p0, La/gil0;->a:I

    .line 14
    .line 15
    iget v3, p1, La/gil0;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/gil0;->b:La/y9q0;

    .line 21
    .line 22
    iget-object v3, p1, La/gil0;->b:La/y9q0;

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
    iget-object v1, p0, La/gil0;->c:La/y9q0;

    .line 32
    .line 33
    iget-object v3, p1, La/gil0;->c:La/y9q0;

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
    iget-object p0, p0, La/gil0;->d:La/ahl0;

    .line 43
    .line 44
    iget-object p1, p1, La/gil0;->d:La/ahl0;

    .line 45
    .line 46
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/gil0;->a:I

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
    iget-object v2, p0, La/gil0;->b:La/y9q0;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/gil0;->c:La/y9q0;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object p0, p0, La/gil0;->d:La/ahl0;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
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
    iget v1, p0, La/gil0;->a:I

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
    iget-object v1, p0, La/gil0;->b:La/y9q0;

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
    iget-object v1, p0, La/gil0;->c:La/y9q0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", sportMarketColorScheme="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/gil0;->d:La/ahl0;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
