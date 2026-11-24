.class public final La/ofm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sfm;


# instance fields
.field public final a:La/y9q0;

.field public final b:La/d4d;

.field public final c:La/y9q0;

.field public final d:La/d4d;


# direct methods
.method public constructor <init>()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v7, La/j1t0;->b:La/qrq;

    .line 4
    .line 5
    sget-wide v4, La/qmk;->r:J

    .line 6
    .line 7
    sget-wide v13, La/qmk;->F:J

    .line 8
    .line 9
    new-instance v1, La/y9q0;

    .line 10
    .line 11
    const/4 v12, 0x0

    .line 12
    const v15, 0xfdffdd

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const-wide/16 v8, 0x0

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/d4d;->y:La/d4d;

    .line 26
    .line 27
    move-object v3, v1

    .line 28
    new-instance v1, La/y9q0;

    .line 29
    .line 30
    move-object v8, v2

    .line 31
    move-object v6, v3

    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    move-object v9, v6

    .line 35
    const/4 v6, 0x0

    .line 36
    move-object v11, v8

    .line 37
    move-object v10, v9

    .line 38
    const-wide/16 v8, 0x0

    .line 39
    .line 40
    move-object/from16 v16, v10

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    move-object/from16 v17, v11

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    move-object/from16 v18, v16

    .line 47
    .line 48
    move-object/from16 v19, v17

    .line 49
    .line 50
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 51
    .line 52
    .line 53
    sget-object v2, La/d4d;->r:La/d4d;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    move-object/from16 v3, v18

    .line 59
    .line 60
    iput-object v3, v0, La/ofm;->a:La/y9q0;

    .line 61
    .line 62
    move-object/from16 v8, v19

    .line 63
    .line 64
    iput-object v8, v0, La/ofm;->b:La/d4d;

    .line 65
    .line 66
    iput-object v1, v0, La/ofm;->c:La/y9q0;

    .line 67
    .line 68
    iput-object v2, v0, La/ofm;->d:La/d4d;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ofm;->a:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/ofm;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ofm;

    .line 10
    .line 11
    iget-object v0, p0, La/ofm;->a:La/y9q0;

    .line 12
    .line 13
    iget-object v1, p1, La/ofm;->a:La/y9q0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/ofm;->b:La/d4d;

    .line 23
    .line 24
    iget-object v1, p1, La/ofm;->b:La/d4d;

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    const/high16 v0, 0x41800000    # 16.0f

    .line 30
    .line 31
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-object v0, p0, La/ofm;->c:La/y9q0;

    .line 39
    .line 40
    iget-object v1, p1, La/ofm;->c:La/y9q0;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-object p0, p0, La/ofm;->d:La/d4d;

    .line 50
    .line 51
    iget-object p1, p1, La/ofm;->d:La/d4d;

    .line 52
    .line 53
    if-eq p0, p1, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    const/4 p0, 0x0

    .line 57
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    const/high16 p0, 0x41900000    # 18.0f

    .line 65
    .line 66
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_8

    .line 71
    .line 72
    :goto_0
    const/4 p0, 0x0

    .line 73
    return p0

    .line 74
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 75
    return p0
.end method

.method public final f()La/d4d;
    .locals 0

    .line 1
    iget-object p0, p0, La/ofm;->b:La/d4d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()F
    .locals 0

    .line 1
    const/high16 p0, 0x41900000    # 18.0f

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ofm;->a:La/y9q0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/y9q0;->hashCode()I

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
    iget-object v2, p0, La/ofm;->b:La/d4d;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/dw9;->b(La/d4d;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v2, 0x41800000    # 16.0f

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/ofm;->c:La/y9q0;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, La/ofm;->d:La/d4d;

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, La/dw9;->b(La/d4d;II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {p0, v0, v1}, Lc;->a(IFI)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/high16 v0, 0x41900000    # 18.0f

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/2addr v0, p0

    .line 46
    return v0
.end method

.method public final i()F
    .locals 0

    .line 1
    const/high16 p0, 0x41800000    # 16.0f

    .line 2
    .line 3
    return p0
.end method

.method public final j()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ofm;->c:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()La/d4d;
    .locals 0

    .line 1
    iget-object p0, p0, La/ofm;->d:La/d4d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const/high16 v0, 0x41800000    # 16.0f

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/high16 v2, 0x41900000    # 18.0f

    .line 13
    .line 14
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v4, "MarketDefault(headerTextStyle="

    .line 21
    .line 22
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v4, p0, La/ofm;->a:La/y9q0;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v4, ", headerTextColorKey="

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v4, p0, La/ofm;->b:La/d4d;

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v4, ", popularIconSize="

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", additionalLabelTextStyle="

    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, La/ofm;->c:La/y9q0;

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, ", additionalLabelTextColorKey="

    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, La/ofm;->d:La/d4d;

    .line 64
    .line 65
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p0, ", headerBottomPadding="

    .line 69
    .line 70
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p0, ", headerHeight="

    .line 77
    .line 78
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p0, ")"

    .line 82
    .line 83
    invoke-static {v3, v2, p0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method
