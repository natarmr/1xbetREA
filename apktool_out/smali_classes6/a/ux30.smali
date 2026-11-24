.class public final La/ux30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wx30;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:J


# direct methods
.method public constructor <init>(IJLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    and-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, La/s6t0;->a:La/pz40;

    .line 6
    .line 7
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object p2, p2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 12
    .line 13
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    move-wide v1, p2

    .line 18
    and-int/lit8 p1, p1, 0x4

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const/4 p5, 0x0

    .line 23
    :cond_1
    move-object v6, p5

    .line 24
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 25
    .line 26
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 31
    .line 32
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    move-object v0, p0

    .line 37
    move-object v5, p4

    .line 38
    invoke-direct/range {v0 .. v6}, La/ux30;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p5, p0, La/ux30;->a:Ljava/lang/String;

    .line 44
    iput-wide p1, p0, La/ux30;->b:J

    .line 45
    iput-object p6, p0, La/ux30;->c:Ljava/lang/String;

    .line 46
    iput-wide p3, p0, La/ux30;->d:J

    return-void
.end method


# virtual methods
.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ux30;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ux30;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/ux30;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/ux30;

    .line 12
    .line 13
    iget-object v1, p0, La/ux30;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, La/ux30;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-wide v3, p1, La/ux30;->b:J

    .line 25
    .line 26
    sget v1, La/y3d;->h:I

    .line 27
    .line 28
    iget-wide v5, p0, La/ux30;->b:J

    .line 29
    .line 30
    invoke-static {v5, v6, v3, v4}, La/h2t0;->a(JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    iget-object v1, p0, La/ux30;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v3, p1, La/ux30;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    return v2

    .line 48
    :cond_4
    iget-wide v3, p0, La/ux30;->d:J

    .line 49
    .line 50
    iget-wide p0, p1, La/ux30;->d:J

    .line 51
    .line 52
    invoke-static {v3, v4, p0, p1}, La/h2t0;->a(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_5

    .line 57
    .line 58
    return v2

    .line 59
    :cond_5
    return v0
.end method

.method public final getSubTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ux30;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ux30;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/ux30;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    sget v2, La/y3d;->h:I

    .line 11
    .line 12
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 13
    .line 14
    iget-wide v2, p0, La/ux30;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, La/ux30;->c:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :goto_0
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget-wide v1, p0, La/ux30;->d:J

    .line 33
    .line 34
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

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
    iget-wide v0, p0, La/ux30;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/ux30;->d:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", titleColor="

    .line 14
    .line 15
    const-string v3, ", subTitle="

    .line 16
    .line 17
    const-string v4, "Title(title="

    .line 18
    .line 19
    iget-object v5, p0, La/ux30;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v4, v5, v2, v0, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, ", subTitleColor="

    .line 26
    .line 27
    const-string v3, ")"

    .line 28
    .line 29
    iget-object p0, p0, La/ux30;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, p0, v2, v1, v3}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
