.class public final La/ok90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:B

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(IJLjava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-byte p1, p0, La/ok90;->a:B

    .line 8
    .line 9
    iput-object p4, p0, La/ok90;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, La/ok90;->c:J

    .line 12
    .line 13
    iput-boolean p5, p0, La/ok90;->d:Z

    .line 14
    .line 15
    iput-boolean p6, p0, La/ok90;->e:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/ok90;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ok90;

    .line 10
    .line 11
    iget-byte v0, p0, La/ok90;->a:B

    .line 12
    .line 13
    iget-byte v1, p1, La/ok90;->a:B

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/ok90;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, La/ok90;->b:Ljava/lang/String;

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
    iget-wide v0, p1, La/ok90;->c:J

    .line 30
    .line 31
    sget v2, La/y3d;->h:I

    .line 32
    .line 33
    iget-wide v2, p0, La/ok90;->c:J

    .line 34
    .line 35
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-boolean v0, p0, La/ok90;->d:Z

    .line 43
    .line 44
    iget-boolean v1, p1, La/ok90;->d:Z

    .line 45
    .line 46
    if-eq v0, v1, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-boolean p0, p0, La/ok90;->e:Z

    .line 50
    .line 51
    iget-boolean p1, p1, La/ok90;->e:Z

    .line 52
    .line 53
    if-eq p0, p1, :cond_6

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

.method public final hashCode()I
    .locals 4

    .line 1
    iget-byte v0, p0, La/ok90;->a:B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-object v2, p0, La/ok90;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v2, La/y3d;->h:I

    .line 17
    .line 18
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 19
    .line 20
    iget-wide v2, p0, La/ok90;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-boolean v2, p0, La/ok90;->d:Z

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-boolean p0, p0, La/ok90;->e:Z

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    add-int/2addr p0, v0

    .line 39
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/ok90;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", name="

    .line 8
    .line 9
    const-string v2, ", textColor="

    .line 10
    .line 11
    iget-byte v3, p0, La/ok90;->a:B

    .line 12
    .line 13
    const-string v4, "PersonalGenderUiModel(id="

    .line 14
    .line 15
    iget-object v5, p0, La/ok90;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3, v4, v1, v5, v2}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, ", selected="

    .line 22
    .line 23
    const-string v3, ", lastElement="

    .line 24
    .line 25
    iget-boolean v4, p0, La/ok90;->d:Z

    .line 26
    .line 27
    invoke-static {v0, v2, v3, v1, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 28
    .line 29
    .line 30
    const-string v0, ")"

    .line 31
    .line 32
    iget-boolean p0, p0, La/ok90;->e:Z

    .line 33
    .line 34
    invoke-static {v1, p0, v0}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
