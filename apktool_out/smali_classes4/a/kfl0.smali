.class public final La/kfl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pfl0;


# instance fields
.field public final a:La/j8l0;

.field public final b:La/a4x;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:F

.field public final f:Z


# direct methods
.method public constructor <init>(La/j8l0;La/a4x;Ljava/lang/String;ZFZ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/kfl0;->a:La/j8l0;

    .line 11
    .line 12
    iput-object p2, p0, La/kfl0;->b:La/a4x;

    .line 13
    .line 14
    iput-object p3, p0, La/kfl0;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p4, p0, La/kfl0;->d:Z

    .line 17
    .line 18
    iput p5, p0, La/kfl0;->e:F

    .line 19
    .line 20
    iput-boolean p6, p0, La/kfl0;->f:Z

    .line 21
    .line 22
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
    instance-of v0, p1, La/kfl0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/kfl0;

    .line 10
    .line 11
    iget-object v0, p0, La/kfl0;->a:La/j8l0;

    .line 12
    .line 13
    iget-object v1, p1, La/kfl0;->a:La/j8l0;

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/kfl0;->b:La/a4x;

    .line 19
    .line 20
    iget-object v1, p1, La/kfl0;->b:La/a4x;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/kfl0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/kfl0;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-boolean v0, p0, La/kfl0;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/kfl0;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget v0, p0, La/kfl0;->e:F

    .line 48
    .line 49
    iget v1, p1, La/kfl0;->e:F

    .line 50
    .line 51
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean p0, p0, La/kfl0;->f:Z

    .line 59
    .line 60
    iget-boolean p1, p1, La/kfl0;->f:Z

    .line 61
    .line 62
    if-eq p0, p1, :cond_7

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/kfl0;->a:La/j8l0;

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
    iget-object v2, p0, La/kfl0;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/kfl0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/kfl0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/kfl0;->e:F

    .line 29
    .line 30
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean p0, p0, La/kfl0;->f:Z

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, La/kfl0;->e:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Data(listStyle="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, La/kfl0;->a:La/j8l0;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ", items="

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, La/kfl0;->b:La/a4x;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, ", subtitleText="

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, ", refreshing="

    .line 35
    .line 36
    const-string v3, ", paddingTop="

    .line 37
    .line 38
    iget-object v4, p0, La/kfl0;->c:Ljava/lang/String;

    .line 39
    .line 40
    iget-boolean v5, p0, La/kfl0;->d:Z

    .line 41
    .line 42
    invoke-static {v4, v2, v3, v1, v5}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 43
    .line 44
    .line 45
    const-string v2, ", scrollToTop="

    .line 46
    .line 47
    const-string v3, ")"

    .line 48
    .line 49
    iget-boolean p0, p0, La/kfl0;->f:Z

    .line 50
    .line 51
    invoke-static {v0, v2, v3, v1, p0}, Lc;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method
