.class public final La/fjk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:La/pnh0;

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(IZZZ)V
    .locals 0

    .line 1
    sget-object p1, La/pnh0;->a:La/pnh0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, La/fjk;->a:Z

    .line 7
    .line 8
    iput-object p1, p0, La/fjk;->b:La/pnh0;

    .line 9
    .line 10
    iput-boolean p3, p0, La/fjk;->c:Z

    .line 11
    .line 12
    iput-boolean p4, p0, La/fjk;->d:Z

    .line 13
    .line 14
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
    instance-of v0, p1, La/fjk;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/fjk;

    .line 10
    .line 11
    iget-boolean v0, p0, La/fjk;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/fjk;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/fjk;->b:La/pnh0;

    .line 19
    .line 20
    iget-object v1, p1, La/fjk;->b:La/pnh0;

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, La/fjk;->c:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/fjk;->c:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-boolean p0, p0, La/fjk;->d:Z

    .line 33
    .line 34
    iget-boolean p1, p1, La/fjk;->d:Z

    .line 35
    .line 36
    if-eq p0, p1, :cond_5

    .line 37
    .line 38
    :goto_0
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    mul-int/2addr v0, v1

    .line 9
    iget-boolean v2, p0, La/fjk;->a:Z

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v2, p0, La/fjk;->b:La/pnh0;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/2addr v2, v0

    .line 22
    mul-int/2addr v2, v1

    .line 23
    iget-boolean v0, p0, La/fjk;->c:Z

    .line 24
    .line 25
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-boolean p0, p0, La/fjk;->d:Z

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/2addr p0, v0

    .line 36
    mul-int/2addr p0, v1

    .line 37
    add-int/lit8 p0, p0, 0x2

    .line 38
    .line 39
    mul-int/2addr p0, v1

    .line 40
    return p0
.end method
