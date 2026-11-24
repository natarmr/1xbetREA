.class public final La/m2k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p2k0;


# instance fields
.field public final a:La/a4x;

.field public final b:La/a4x;

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(La/a4x;La/a4x;ZZZ)V
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
    iput-object p1, p0, La/m2k0;->a:La/a4x;

    .line 8
    .line 9
    iput-object p2, p0, La/m2k0;->b:La/a4x;

    .line 10
    .line 11
    iput-boolean p3, p0, La/m2k0;->c:Z

    .line 12
    .line 13
    iput-boolean p4, p0, La/m2k0;->d:Z

    .line 14
    .line 15
    iput-boolean p5, p0, La/m2k0;->e:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/m2k0;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/m2k0;->e:Z

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
    instance-of v0, p1, La/m2k0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/m2k0;

    .line 10
    .line 11
    iget-object v0, p0, La/m2k0;->a:La/a4x;

    .line 12
    .line 13
    iget-object v1, p1, La/m2k0;->a:La/a4x;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/m2k0;->b:La/a4x;

    .line 23
    .line 24
    iget-object v1, p1, La/m2k0;->b:La/a4x;

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
    iget-boolean v0, p0, La/m2k0;->c:Z

    .line 34
    .line 35
    iget-boolean v1, p1, La/m2k0;->c:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-boolean v0, p0, La/m2k0;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/m2k0;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean p0, p0, La/m2k0;->e:Z

    .line 48
    .line 49
    iget-boolean p1, p1, La/m2k0;->e:Z

    .line 50
    .line 51
    if-eq p0, p1, :cond_6

    .line 52
    .line 53
    :goto_0
    const/4 p0, 0x0

    .line 54
    return p0

    .line 55
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 56
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/m2k0;->a:La/a4x;

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
    iget-object v2, p0, La/m2k0;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/m2k0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/m2k0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean p0, p0, La/m2k0;->e:Z

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", singlePageTransactionHistoryUiItemsList="

    .line 2
    .line 3
    const-string v1, ", canLoadNextPage="

    .line 4
    .line 5
    const-string v2, "Content(menuItemsUiModelsList="

    .line 6
    .line 7
    iget-object v3, p0, La/m2k0;->a:La/a4x;

    .line 8
    .line 9
    iget-object v4, p0, La/m2k0;->b:La/a4x;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/rw2;->q(Ljava/lang/String;La/a4x;Ljava/lang/String;La/a4x;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isRefreshing="

    .line 16
    .line 17
    const-string v2, ", refreshEnabled="

    .line 18
    .line 19
    iget-boolean v3, p0, La/m2k0;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/m2k0;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ")"

    .line 27
    .line 28
    iget-boolean p0, p0, La/m2k0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
