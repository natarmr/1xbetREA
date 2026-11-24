.class public final La/w9a;
.super La/v2;
.source "SourceFile"

# interfaces
.implements La/faa;


# instance fields
.field public final b:La/kiy;

.field public final c:La/x9a;

.field public final d:Z

.field public final e:La/obx;


# direct methods
.method public constructor <init>(La/kiy;La/x9a;Z)V
    .locals 1

    .line 1
    sget-object v0, La/v9a;->a:La/v9a;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/v2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/w9a;->b:La/kiy;

    .line 7
    .line 8
    iput-object p2, p0, La/w9a;->c:La/x9a;

    .line 9
    .line 10
    iput-boolean p3, p0, La/w9a;->d:Z

    .line 11
    .line 12
    sget-object p1, La/iun;->a:La/iun;

    .line 13
    .line 14
    new-instance p2, La/obx;

    .line 15
    .line 16
    invoke-direct {p2, p1}, La/obx;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/w9a;->e:La/obx;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final B(Z)La/v2;
    .locals 2

    .line 1
    iget-boolean v0, p0, La/w9a;->d:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, La/w9a;

    .line 7
    .line 8
    iget-object v1, p0, La/w9a;->b:La/kiy;

    .line 9
    .line 10
    iget-object p0, p0, La/w9a;->c:La/x9a;

    .line 11
    .line 12
    invoke-direct {v0, v1, p0, p1}, La/w9a;-><init>(La/kiy;La/x9a;Z)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final M()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, La/w9a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, La/w9a;

    .line 6
    .line 7
    iget-object v0, p1, La/w9a;->b:La/kiy;

    .line 8
    .line 9
    iget-object v1, p0, La/w9a;->b:La/kiy;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, La/w9a;->c:La/x9a;

    .line 18
    .line 19
    iget-object v1, p1, La/w9a;->c:La/x9a;

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-boolean p0, p0, La/w9a;->d:Z

    .line 25
    .line 26
    iget-boolean p1, p1, La/w9a;->d:Z

    .line 27
    .line 28
    if-ne p0, p1, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final f()La/a8z;
    .locals 0

    .line 1
    iget-object p0, p0, La/w9a;->e:La/obx;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/w9a;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La/w9a;->b:La/kiy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-object v1, p0, La/w9a;->c:La/x9a;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x1f

    .line 21
    .line 22
    iget-boolean p0, p0, La/w9a;->d:Z

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v1

    .line 29
    return p0
.end method

.method public final o()La/fhy;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/w9a;->c:La/x9a;

    .line 2
    .line 3
    invoke-virtual {p0}, La/x9a;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
