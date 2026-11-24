.class public final La/y7l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/d2l0;

.field public final b:Ljava/lang/String;

.field public final c:La/y3d;

.field public final d:La/t1l0;


# direct methods
.method public constructor <init>(La/d2l0;Ljava/lang/String;La/y3d;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y7l0;->a:La/d2l0;

    .line 5
    .line 6
    iput-object p2, p0, La/y7l0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, La/y7l0;->c:La/y3d;

    .line 9
    .line 10
    new-instance v0, La/t1l0;

    .line 11
    .line 12
    sget-object v1, La/p1l0;->b:La/p1l0;

    .line 13
    .line 14
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 15
    .line 16
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 21
    .line 22
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    move-wide v3, v2

    .line 27
    new-instance v2, La/y3d;

    .line 28
    .line 29
    invoke-direct {v2, v3, v4}, La/y3d;-><init>(J)V

    .line 30
    .line 31
    .line 32
    const/16 v7, 0xc0

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    move-object v3, p2

    .line 37
    move-object v5, p3

    .line 38
    invoke-direct/range {v0 .. v7}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/y7l0;->d:La/t1l0;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/y7l0;->d:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
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
    instance-of v0, p1, La/y7l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/y7l0;

    .line 10
    .line 11
    iget-object v0, p0, La/y7l0;->a:La/d2l0;

    .line 12
    .line 13
    iget-object v1, p1, La/y7l0;->a:La/d2l0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/d2l0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/y7l0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/y7l0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, La/y7l0;->c:La/y3d;

    .line 34
    .line 35
    iget-object p1, p1, La/y7l0;->c:La/y3d;

    .line 36
    .line 37
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/y7l0;->a:La/d2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/y7l0;->a:La/d2l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/d2l0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/y7l0;->b:Ljava/lang/String;

    .line 10
    .line 11
    const/16 v2, 0x3c1

    .line 12
    .line 13
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object p0, p0, La/y7l0;->c:La/y3d;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-wide v1, p0, La/y3d;->a:J

    .line 24
    .line 25
    sget-object p0, La/h2t0;->b:La/g2t0;

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    :goto_0
    add-int/2addr v0, p0

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ResultSport(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/y7l0;->a:La/d2l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", iconUrl="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/y7l0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", iconResId=null, iconColor="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", badgeStyle=null)"

    .line 29
    .line 30
    iget-object p0, p0, La/y7l0;->c:La/y3d;

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, La/hne;->p(Ljava/lang/StringBuilder;La/y3d;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
