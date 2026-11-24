.class public final La/mnj;
.super La/upj;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(IIIZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p4, p0, La/mnj;->a:Z

    .line 5
    .line 6
    iput-boolean p5, p0, La/mnj;->b:Z

    .line 7
    .line 8
    iput p1, p0, La/mnj;->c:I

    .line 9
    .line 10
    iput p2, p0, La/mnj;->d:I

    .line 11
    .line 12
    iput p3, p0, La/mnj;->e:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/mnj;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/mnj;

    .line 11
    .line 12
    iget-boolean v1, p0, La/mnj;->a:Z

    .line 13
    .line 14
    iget-boolean v2, p1, La/mnj;->a:Z

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-boolean v1, p0, La/mnj;->b:Z

    .line 20
    .line 21
    iget-boolean v2, p1, La/mnj;->b:Z

    .line 22
    .line 23
    if-eq v1, v2, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget v1, p0, La/mnj;->c:I

    .line 27
    .line 28
    iget v2, p1, La/mnj;->c:I

    .line 29
    .line 30
    if-eq v1, v2, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget v1, p0, La/mnj;->d:I

    .line 34
    .line 35
    iget v2, p1, La/mnj;->d:I

    .line 36
    .line 37
    if-eq v1, v2, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget p0, p0, La/mnj;->e:I

    .line 41
    .line 42
    iget p1, p1, La/mnj;->e:I

    .line 43
    .line 44
    if-eq p0, p1, :cond_6

    .line 45
    .line 46
    :goto_0
    const/4 p0, 0x0

    .line 47
    return p0

    .line 48
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/mnj;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, La/mnj;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/mnj;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/mnj;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget p0, p0, La/mnj;->e:I

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/2addr v0, p0

    .line 40
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", showNavBar="

    .line 2
    .line 3
    const-string v1, ", position="

    .line 4
    .line 5
    const-string v2, "NewsMain(fromAggregator="

    .line 6
    .line 7
    iget-boolean v3, p0, La/mnj;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/mnj;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", bannerId="

    .line 16
    .line 17
    const-string v2, ", bannerType="

    .line 18
    .line 19
    iget v3, p0, La/mnj;->c:I

    .line 20
    .line 21
    iget v4, p0, La/mnj;->d:I

    .line 22
    .line 23
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", hasBackStack=false)"

    .line 27
    .line 28
    iget p0, p0, La/mnj;->e:I

    .line 29
    .line 30
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
