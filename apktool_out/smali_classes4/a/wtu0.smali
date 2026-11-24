.class public final La/wtu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

.field public final c:J

.field public final d:La/j0g0;


# direct methods
.method public constructor <init>(ZLorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;JLa/j0g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/wtu0;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, La/wtu0;->b:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 7
    .line 8
    iput-wide p3, p0, La/wtu0;->c:J

    .line 9
    .line 10
    iput-object p5, p0, La/wtu0;->d:La/j0g0;

    .line 11
    .line 12
    return-void
.end method

.method public static a(La/wtu0;ZJLa/j0g0;I)La/wtu0;
    .locals 6

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, La/wtu0;->a:Z

    .line 6
    .line 7
    :cond_0
    move v1, p1

    .line 8
    iget-object v2, p0, La/wtu0;->b:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 9
    .line 10
    and-int/lit8 p1, p5, 0x4

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-wide p2, p0, La/wtu0;->c:J

    .line 15
    .line 16
    :cond_1
    move-wide v3, p2

    .line 17
    and-int/lit8 p1, p5, 0x8

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p4, p0, La/wtu0;->d:La/j0g0;

    .line 22
    .line 23
    :cond_2
    move-object v5, p4

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, La/wtu0;

    .line 28
    .line 29
    invoke-direct/range {v0 .. v5}, La/wtu0;-><init>(ZLorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;JLa/j0g0;)V

    .line 30
    .line 31
    .line 32
    return-object v0
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
    instance-of v0, p1, La/wtu0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/wtu0;

    .line 10
    .line 11
    iget-boolean v0, p0, La/wtu0;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/wtu0;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/wtu0;->b:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 19
    .line 20
    iget-object v1, p1, La/wtu0;->b:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/wtu0;->c:J

    .line 30
    .line 31
    iget-wide v2, p1, La/wtu0;->c:J

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-object p0, p0, La/wtu0;->d:La/j0g0;

    .line 39
    .line 40
    iget-object p1, p1, La/wtu0;->d:La/j0g0;

    .line 41
    .line 42
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_5

    .line 47
    .line 48
    :goto_0
    const/4 p0, 0x0

    .line 49
    return p0

    .line 50
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 51
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-boolean v0, p0, La/wtu0;->a:Z

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
    iget-object v2, p0, La/wtu0;->b:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 11
    .line 12
    invoke-virtual {v2}, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-wide v3, p0, La/wtu0;->c:J

    .line 19
    .line 20
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object p0, p0, La/wtu0;->d:La/j0g0;

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
    iget-object p0, p0, La/j0g0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p0}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :goto_0
    add-int/2addr v0, p0

    .line 37
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "VirtualSportRulesStateModel(connected="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, La/wtu0;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", params="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/wtu0;->b:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", selectedTabId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, La/wtu0;->c:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", sections="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/wtu0;->d:La/j0g0;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
