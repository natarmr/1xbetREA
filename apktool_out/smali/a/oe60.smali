.class final La/oe60;
.super La/um40;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/um40;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "La/oe60;",
        "La/um40;",
        "La/re60;",
        "foundation-layout"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:F

.field public final c:F

.field public final d:Z

.field public final e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(FFZLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/oe60;->b:F

    .line 5
    .line 6
    iput p2, p0, La/oe60;->c:F

    .line 7
    .line 8
    iput-boolean p3, p0, La/oe60;->d:Z

    .line 9
    .line 10
    iput-object p4, p0, La/oe60;->e:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
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
    instance-of v0, p1, La/oe60;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, La/oe60;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-nez p1, :cond_2

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_2
    iget v0, p0, La/oe60;->b:F

    .line 16
    .line 17
    iget v1, p1, La/oe60;->b:F

    .line 18
    .line 19
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iget v0, p0, La/oe60;->c:F

    .line 26
    .line 27
    iget v1, p1, La/oe60;->c:F

    .line 28
    .line 29
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-boolean p0, p0, La/oe60;->d:Z

    .line 36
    .line 37
    iget-boolean p1, p1, La/oe60;->d:Z

    .line 38
    .line 39
    if-ne p0, p1, :cond_3

    .line 40
    .line 41
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public final f()La/lm40;
    .locals 2

    .line 1
    new-instance v0, La/re60;

    .line 2
    .line 3
    invoke-direct {v0}, La/lm40;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, La/oe60;->b:F

    .line 7
    .line 8
    iput v1, v0, La/re60;->o:F

    .line 9
    .line 10
    iget v1, p0, La/oe60;->c:F

    .line 11
    .line 12
    iput v1, v0, La/re60;->p:F

    .line 13
    .line 14
    iget-boolean p0, p0, La/oe60;->d:Z

    .line 15
    .line 16
    iput-boolean p0, v0, La/re60;->q:Z

    .line 17
    .line 18
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 4

    .line 1
    check-cast p1, La/re60;

    .line 2
    .line 3
    iget v0, p1, La/re60;->o:F

    .line 4
    .line 5
    iget v1, p0, La/oe60;->b:F

    .line 6
    .line 7
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v2, p0, La/oe60;->c:F

    .line 12
    .line 13
    iget-boolean p0, p0, La/oe60;->d:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget v0, p1, La/re60;->p:F

    .line 18
    .line 19
    invoke-static {v0, v2}, La/ycl;->b(FF)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-boolean v0, p1, La/re60;->q:Z

    .line 26
    .line 27
    if-eq v0, p0, :cond_1

    .line 28
    .line 29
    :cond_0
    invoke-static {p1}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v0, v3}, La/e7z;->V(Z)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iput v1, p1, La/re60;->o:F

    .line 38
    .line 39
    iput v2, p1, La/re60;->p:F

    .line 40
    .line 41
    iput-boolean p0, p1, La/re60;->q:Z

    .line 42
    .line 43
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/oe60;->b:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget v2, p0, La/oe60;->c:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean p0, p0, La/oe60;->d:Z

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, La/oe60;->b:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/oe60;->c:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", y="

    .line 14
    .line 15
    const-string v3, ", rtlAware="

    .line 16
    .line 17
    const-string v4, "OffsetModifierElement(x="

    .line 18
    .line 19
    invoke-static {v4, v0, v2, v1, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, ")"

    .line 24
    .line 25
    iget-boolean p0, p0, La/oe60;->d:Z

    .line 26
    .line 27
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
