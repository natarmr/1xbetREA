.class public final La/vx30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wx30;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:La/m0x;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;La/m0x;)V
    .locals 4

    .line 1
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 2
    .line 3
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 18
    .line 19
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/vx30;->a:Ljava/lang/String;

    .line 30
    .line 31
    iput-wide v0, p0, La/vx30;->b:J

    .line 32
    .line 33
    iput-object p2, p0, La/vx30;->c:Ljava/lang/String;

    .line 34
    .line 35
    iput-wide v2, p0, La/vx30;->d:J

    .line 36
    .line 37
    iput-object p3, p0, La/vx30;->e:La/m0x;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/vx30;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/vx30;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/vx30;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/vx30;

    .line 10
    .line 11
    iget-object v0, p0, La/vx30;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/vx30;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v0, p1, La/vx30;->b:J

    .line 23
    .line 24
    sget v2, La/y3d;->h:I

    .line 25
    .line 26
    iget-wide v2, p0, La/vx30;->b:J

    .line 27
    .line 28
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-object v0, p0, La/vx30;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p1, La/vx30;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-wide v0, p0, La/vx30;->d:J

    .line 47
    .line 48
    iget-wide v2, p1, La/vx30;->d:J

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-object p0, p0, La/vx30;->e:La/m0x;

    .line 58
    .line 59
    iget-object p1, p1, La/vx30;->e:La/m0x;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, La/m0x;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_6

    .line 66
    .line 67
    :goto_0
    const/4 p0, 0x0

    .line 68
    return p0

    .line 69
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 70
    return p0
.end method

.method public final getSubTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/vx30;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/vx30;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/vx30;->a:Ljava/lang/String;

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
    iget-wide v2, p0, La/vx30;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, La/vx30;->c:Ljava/lang/String;

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
    iget-wide v2, p0, La/vx30;->d:J

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object p0, p0, La/vx30;->e:La/m0x;

    .line 39
    .line 40
    invoke-static {p0, v0, v1}, La/cs0;->a(La/m0x;II)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    const v0, 0x7f080c46

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p0, v1}, La/twn;->a(III)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, p0

    .line 56
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/vx30;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/vx30;->d:J

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
    const-string v4, "TitleWithSubTitleIcon(title="

    .line 18
    .line 19
    iget-object v5, p0, La/vx30;->a:Ljava/lang/String;

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
    const-string v3, ", subtitleIcon="

    .line 28
    .line 29
    iget-object v4, p0, La/vx30;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v4, v2, v1, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/vx30;->e:La/m0x;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ", subtitleIconPlaceholder="

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const p0, 0x7f080c46

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", subtitleIconError="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ")"

    .line 56
    .line 57
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method
