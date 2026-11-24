.class public final La/nuv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ouv;


# instance fields
.field public final a:La/ytv;

.field public final b:La/a4x;

.field public final c:La/mdm;

.field public final d:Z

.field public final e:La/i4;


# direct methods
.method public constructor <init>(La/ytv;La/a4x;La/mdm;Z)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/nuv;->a:La/ytv;

    .line 8
    .line 9
    iput-object p2, p0, La/nuv;->b:La/a4x;

    .line 10
    .line 11
    iput-object p3, p0, La/nuv;->c:La/mdm;

    .line 12
    .line 13
    iput-boolean p4, p0, La/nuv;->d:Z

    .line 14
    .line 15
    iget-object p1, p1, La/ytv;->a:La/zdm0;

    .line 16
    .line 17
    instance-of p2, p1, La/ydm0;

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    check-cast p1, La/ydm0;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, p3

    .line 26
    :goto_0
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p3, p1, La/ydm0;->b:La/vdm0;

    .line 29
    .line 30
    :cond_1
    instance-of p1, p3, La/tdm0;

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    sget-object p1, La/lak0;->c:La/lak0;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    check-cast p3, La/tdm0;

    .line 38
    .line 39
    iget-object p1, p3, La/tdm0;->c:La/znp0;

    .line 40
    .line 41
    iget-object p1, p1, La/znp0;->b:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p2, p3, La/tdm0;->d:La/znp0;

    .line 44
    .line 45
    iget-object p2, p2, La/znp0;->b:Ljava/lang/String;

    .line 46
    .line 47
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_1
    iput-object p1, p0, La/nuv;->e:La/i4;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/nuv;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final b()La/ytv;
    .locals 0

    .line 1
    iget-object p0, p0, La/nuv;->a:La/ytv;

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
    instance-of v0, p1, La/nuv;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/nuv;

    .line 10
    .line 11
    iget-object v0, p0, La/nuv;->a:La/ytv;

    .line 12
    .line 13
    iget-object v1, p1, La/nuv;->a:La/ytv;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/ytv;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/nuv;->b:La/a4x;

    .line 23
    .line 24
    iget-object v1, p1, La/nuv;->b:La/a4x;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/nuv;->c:La/mdm;

    .line 34
    .line 35
    iget-object v1, p1, La/nuv;->c:La/mdm;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

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
    iget-boolean p0, p0, La/nuv;->d:Z

    .line 45
    .line 46
    iget-boolean p1, p1, La/nuv;->d:Z

    .line 47
    .line 48
    if-eq p0, p1, :cond_5

    .line 49
    .line 50
    :goto_0
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/nuv;->a:La/ytv;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ytv;->hashCode()I

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
    iget-object v2, p0, La/nuv;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/nuv;->c:La/mdm;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean p0, p0, La/nuv;->d:Z

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    const-string v1, "Success(headerUiState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/nuv;->a:La/ytv;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", items="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/nuv;->b:La/a4x;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", emptyConfig="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/nuv;->c:La/mdm;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", rtlSupport="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean p0, p0, La/nuv;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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
