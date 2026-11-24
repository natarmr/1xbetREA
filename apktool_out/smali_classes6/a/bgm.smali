.class public final La/bgm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cgm;


# instance fields
.field public final a:La/y9q0;

.field public final b:La/d4d;


# direct methods
.method public constructor <init>()V
    .locals 15

    .line 1
    sget-object v6, La/j1t0;->b:La/qrq;

    .line 2
    .line 3
    sget-wide v3, La/qmk;->q:J

    .line 4
    .line 5
    sget-wide v12, La/qmk;->D:J

    .line 6
    .line 7
    new-instance v0, La/y9q0;

    .line 8
    .line 9
    const/4 v11, 0x0

    .line 10
    const v14, 0xfdff9d

    .line 11
    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const-wide/16 v7, 0x0

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    invoke-direct/range {v0 .. v14}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 21
    .line 22
    .line 23
    sget-object v1, La/d4d;->r:La/d4d;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/bgm;->a:La/y9q0;

    .line 29
    .line 30
    iput-object v1, p0, La/bgm;->b:La/d4d;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bgm;->a:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()F
    .locals 0

    .line 1
    const/high16 p0, 0x40000000    # 2.0f

    .line 2
    .line 3
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
    instance-of v0, p1, La/bgm;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/bgm;

    .line 10
    .line 11
    iget-object v0, p0, La/bgm;->a:La/y9q0;

    .line 12
    .line 13
    iget-object v1, p1, La/bgm;->a:La/y9q0;

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
    iget-object p0, p0, La/bgm;->b:La/d4d;

    .line 23
    .line 24
    iget-object p1, p1, La/bgm;->b:La/d4d;

    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    const/high16 p0, 0x41600000    # 14.0f

    .line 30
    .line 31
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    const/high16 p0, 0x40000000    # 2.0f

    .line 39
    .line 40
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    const/high16 p0, 0x41900000    # 18.0f

    .line 48
    .line 49
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_6

    .line 54
    .line 55
    :goto_0
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 58
    return p0
.end method

.method public final f()La/d4d;
    .locals 0

    .line 1
    iget-object p0, p0, La/bgm;->b:La/d4d;

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
    .locals 2

    .line 1
    iget-object v0, p0, La/bgm;->a:La/y9q0;

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
    iget-object p0, p0, La/bgm;->b:La/d4d;

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, La/dw9;->b(La/d4d;II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/high16 v0, 0x41600000    # 14.0f

    .line 17
    .line 18
    invoke-static {p0, v0, v1}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/high16 v0, 0x40000000    # 2.0f

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Lc;->a(IFI)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/high16 v0, 0x41900000    # 18.0f

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/2addr v0, p0

    .line 35
    return v0
.end method

.method public final i()F
    .locals 0

    .line 1
    const/high16 p0, 0x41600000    # 14.0f

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const/high16 v0, 0x41600000    # 14.0f

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/high16 v1, 0x40000000    # 2.0f

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/high16 v2, 0x41900000    # 18.0f

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v4, "MarketV3(headerTextStyle="

    .line 22
    .line 23
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, La/bgm;->a:La/y9q0;

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v4, ", headerTextColorKey="

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/bgm;->b:La/d4d;

    .line 37
    .line 38
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, ", popularIconSize="

    .line 42
    .line 43
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p0, ", headerBottomPadding="

    .line 47
    .line 48
    const-string v4, ", headerHeight="

    .line 49
    .line 50
    invoke-static {v3, v0, p0, v1, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string p0, ")"

    .line 54
    .line 55
    invoke-static {v3, v2, p0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method
