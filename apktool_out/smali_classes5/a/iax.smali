.class public final La/iax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jax;


# instance fields
.field public final a:La/m1v0;

.field public final b:Ljava/lang/String;

.field public final c:La/a4x;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:La/a4x;


# direct methods
.method public constructor <init>(La/m1v0;Ljava/lang/String;La/a4x;Ljava/lang/String;Ljava/lang/String;La/a4x;)V
    .locals 1

    .line 1
    sget-object v0, La/dja;->b:La/dja;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/iax;->a:La/m1v0;

    .line 13
    .line 14
    iput-object p2, p0, La/iax;->b:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p3, p0, La/iax;->c:La/a4x;

    .line 17
    .line 18
    iput-object p4, p0, La/iax;->d:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p5, p0, La/iax;->e:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p6, p0, La/iax;->f:La/a4x;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/iax;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/iax;

    .line 10
    .line 11
    sget-object v0, La/dja;->b:La/dja;

    .line 12
    .line 13
    iget-object v0, p0, La/iax;->a:La/m1v0;

    .line 14
    .line 15
    iget-object v1, p1, La/iax;->a:La/m1v0;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, La/iax;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p1, La/iax;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-object v0, p0, La/iax;->c:La/a4x;

    .line 36
    .line 37
    iget-object v1, p1, La/iax;->c:La/a4x;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-object v0, p0, La/iax;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, La/iax;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-object v0, p0, La/iax;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, La/iax;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    iget-object p0, p0, La/iax;->f:La/a4x;

    .line 69
    .line 70
    iget-object p1, p1, La/iax;->f:La/a4x;

    .line 71
    .line 72
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_7

    .line 77
    .line 78
    :goto_0
    const/4 p0, 0x0

    .line 79
    return p0

    .line 80
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 81
    return p0
.end method

.method public final getType()La/dja;
    .locals 0

    .line 1
    sget-object p0, La/dja;->o:La/dja;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget-object v0, La/dja;->o:La/dja;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, La/iax;->a:La/m1v0;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, La/m1v0;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-object v3, p0, La/iax;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, La/iax;->c:La/a4x;

    .line 30
    .line 31
    invoke-static {v3, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v3, p0, La/iax;->d:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :goto_1
    add-int/2addr v0, v3

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-object v3, p0, La/iax;->e:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :goto_2
    add-int/2addr v0, v2

    .line 57
    mul-int/2addr v0, v1

    .line 58
    iget-object p0, p0, La/iax;->f:La/a4x;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, La/dja;->o:La/dja;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Stadium(type="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v0, ", weatherInfo="

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/iax;->a:La/m1v0;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", name="

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, ", info="

    .line 29
    .line 30
    const-string v2, ", webSiteUrl="

    .line 31
    .line 32
    iget-object v3, p0, La/iax;->b:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, La/iax;->c:La/a4x;

    .line 35
    .line 36
    invoke-static {v1, v3, v0, v4, v2}, La/cs0;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;La/a4x;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v0, ", webSiteLabel="

    .line 40
    .line 41
    const-string v2, ", images="

    .line 42
    .line 43
    iget-object v3, p0, La/iax;->d:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, La/iax;->e:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v1, v3, v0, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v0, ")"

    .line 51
    .line 52
    iget-object p0, p0, La/iax;->f:La/a4x;

    .line 53
    .line 54
    invoke-static {v1, p0, v0}, La/cs0;->n(Ljava/lang/StringBuilder;La/a4x;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
