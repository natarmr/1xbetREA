.class public final La/jil0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lil0;
.implements La/mil0;


# instance fields
.field public final a:La/y9q0;

.field public final b:La/y9q0;

.field public final c:La/iil0;

.field public final d:La/zgl0;


# direct methods
.method public constructor <init>(La/y9q0;La/y9q0;La/zgl0;)V
    .locals 1

    .line 1
    new-instance v0, La/iil0;

    .line 2
    .line 3
    invoke-direct {v0}, La/iil0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/jil0;->a:La/y9q0;

    .line 10
    .line 11
    iput-object p2, p0, La/jil0;->b:La/y9q0;

    .line 12
    .line 13
    iput-object v0, p0, La/jil0;->c:La/iil0;

    .line 14
    .line 15
    iput-object p3, p0, La/jil0;->d:La/zgl0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jil0;->b:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()I
    .locals 0

    .line 1
    const p0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final c()La/ahl0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jil0;->d:La/zgl0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()La/iil0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jil0;->c:La/iil0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jil0;->a:La/y9q0;

    .line 2
    .line 3
    return-object p0
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
    instance-of v0, p1, La/jil0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/jil0;

    .line 10
    .line 11
    iget-object v0, p0, La/jil0;->a:La/y9q0;

    .line 12
    .line 13
    iget-object v1, p1, La/jil0;->a:La/y9q0;

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
    iget-object v0, p0, La/jil0;->b:La/y9q0;

    .line 23
    .line 24
    iget-object v1, p1, La/jil0;->b:La/y9q0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/jil0;->c:La/iil0;

    .line 34
    .line 35
    iget-object v1, p1, La/jil0;->c:La/iil0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/iil0;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object p0, p0, La/jil0;->d:La/zgl0;

    .line 45
    .line 46
    iget-object p1, p1, La/jil0;->d:La/zgl0;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/zgl0;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    :goto_0
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 57
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    mul-int/2addr v0, v1

    .line 11
    iget-object v2, p0, La/jil0;->a:La/y9q0;

    .line 12
    .line 13
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v2, p0, La/jil0;->b:La/y9q0;

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v2, p0, La/jil0;->c:La/iil0;

    .line 24
    .line 25
    invoke-virtual {v2}, La/iil0;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, v0

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget-object p0, p0, La/jil0;->d:La/zgl0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/zgl0;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, v2

    .line 38
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "List(marketLabelMaxLines=2147483647, marketLabelFontStyle="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/jil0;->a:La/y9q0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", coefficientLabelFontStyle="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/jil0;->b:La/y9q0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", corners="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/jil0;->c:La/iil0;

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
    iget-object p0, p0, La/jil0;->d:La/zgl0;

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
