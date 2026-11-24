.class public final La/i7l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/b2l0;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:La/y3d;

.field public final e:La/t1l0;

.field public final f:La/w2l0;


# direct methods
.method public constructor <init>(La/b2l0;ILjava/lang/String;La/y3d;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/i7l0;->a:La/b2l0;

    .line 5
    .line 6
    iput p2, p0, La/i7l0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La/i7l0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, La/i7l0;->d:La/y3d;

    .line 11
    .line 12
    new-instance v0, La/t1l0;

    .line 13
    .line 14
    sget-object v1, La/p1l0;->b:La/p1l0;

    .line 15
    .line 16
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 17
    .line 18
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 23
    .line 24
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    move-wide v3, v2

    .line 29
    new-instance v2, La/y3d;

    .line 30
    .line 31
    invoke-direct {v2, v3, v4}, La/y3d;-><init>(J)V

    .line 32
    .line 33
    .line 34
    const/16 v7, 0xc0

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    move-object v3, p3

    .line 39
    move-object v5, p4

    .line 40
    invoke-direct/range {v0 .. v7}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/i7l0;->e:La/t1l0;

    .line 44
    .line 45
    new-instance p1, La/w2l0;

    .line 46
    .line 47
    new-instance p3, La/kpe;

    .line 48
    .line 49
    invoke-direct {p3}, La/kpe;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p2, p3}, La/w2l0;-><init>(ILa/ope;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, La/i7l0;->f:La/w2l0;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i7l0;->e:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i7l0;->f:La/w2l0;

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
    instance-of v0, p1, La/i7l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/i7l0;

    .line 10
    .line 11
    iget-object v0, p0, La/i7l0;->a:La/b2l0;

    .line 12
    .line 13
    iget-object v1, p1, La/i7l0;->a:La/b2l0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/b2l0;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/i7l0;->b:I

    .line 23
    .line 24
    iget v1, p1, La/i7l0;->b:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/i7l0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/i7l0;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, La/i7l0;->d:La/y3d;

    .line 41
    .line 42
    iget-object p1, p1, La/i7l0;->d:La/y3d;

    .line 43
    .line 44
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

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

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i7l0;->a:La/b2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/i7l0;->a:La/b2l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/b2l0;->hashCode()I

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
    iget v2, p0, La/i7l0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/i7l0;->c:Ljava/lang/String;

    .line 17
    .line 18
    const/16 v3, 0x3c1

    .line 19
    .line 20
    invoke-static {v0, v3, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object p0, p0, La/i7l0;->d:La/y3d;

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-wide v2, p0, La/y3d;->a:J

    .line 31
    .line 32
    sget-object p0, La/h2t0;->b:La/g2t0;

    .line 33
    .line 34
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    :goto_0
    add-int/2addr v0, p0

    .line 39
    mul-int/2addr v0, v1

    .line 40
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SportCounter(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/i7l0;->a:La/b2l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", counterValue="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, La/i7l0;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", iconUrl="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/i7l0;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", iconResId=null, iconColor="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/i7l0;->d:La/y3d;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ", badgeStyle=null)"

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
