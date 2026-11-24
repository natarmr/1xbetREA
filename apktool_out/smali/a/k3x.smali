.class public final La/k3x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:La/k3x;


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Z

.field public final d:I

.field public final e:I

.field public final f:La/rs00;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/k3x;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    sget-object v6, La/rs00;->c:La/rs00;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct/range {v0 .. v6}, La/k3x;-><init>(ZIZIILa/rs00;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/k3x;->g:La/k3x;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(ZIZIILa/rs00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/k3x;->a:Z

    .line 5
    .line 6
    iput p2, p0, La/k3x;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, La/k3x;->c:Z

    .line 9
    .line 10
    iput p4, p0, La/k3x;->d:I

    .line 11
    .line 12
    iput p5, p0, La/k3x;->e:I

    .line 13
    .line 14
    iput-object p6, p0, La/k3x;->f:La/rs00;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/k3x;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/k3x;

    .line 10
    .line 11
    iget-boolean v0, p1, La/k3x;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p0, La/k3x;->a:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_2
    iget v0, p0, La/k3x;->b:I

    .line 19
    .line 20
    iget v1, p1, La/k3x;->b:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_5

    .line 23
    .line 24
    iget-boolean v0, p0, La/k3x;->c:Z

    .line 25
    .line 26
    iget-boolean v1, p1, La/k3x;->c:Z

    .line 27
    .line 28
    if-eq v0, v1, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    iget v0, p0, La/k3x;->d:I

    .line 32
    .line 33
    iget v1, p1, La/k3x;->d:I

    .line 34
    .line 35
    if-ne v0, v1, :cond_5

    .line 36
    .line 37
    iget v0, p0, La/k3x;->e:I

    .line 38
    .line 39
    iget v1, p1, La/k3x;->e:I

    .line 40
    .line 41
    if-ne v0, v1, :cond_5

    .line 42
    .line 43
    iget-object p0, p0, La/k3x;->f:La/rs00;

    .line 44
    .line 45
    iget-object p1, p1, La/k3x;->f:La/rs00;

    .line 46
    .line 47
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 57
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/k3x;->a:Z

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
    iget v2, p0, La/k3x;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/k3x;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/k3x;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v1, p0, La/k3x;->e:I

    .line 29
    .line 30
    const/16 v2, 0x3c1

    .line 31
    .line 32
    invoke-static {v1, v0, v2}, La/twn;->a(III)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, La/k3x;->f:La/rs00;

    .line 37
    .line 38
    iget-object p0, p0, La/rs00;->a:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr p0, v0

    .line 45
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, La/k3x;->b:I

    .line 2
    .line 3
    invoke-static {v0}, La/ply;->a(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/k3x;->d:I

    .line 8
    .line 9
    invoke-static {v1}, La/bmy;->a(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, La/k3x;->e:I

    .line 14
    .line 15
    invoke-static {v2}, La/j3x;->a(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, ", capitalization="

    .line 20
    .line 21
    const-string v4, ", autoCorrect="

    .line 22
    .line 23
    const-string v5, "ImeOptions(singleLine="

    .line 24
    .line 25
    iget-boolean v6, p0, La/k3x;->a:Z

    .line 26
    .line 27
    invoke-static {v5, v3, v0, v6, v4}, La/axq;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v3, ", keyboardType="

    .line 32
    .line 33
    const-string v4, ", imeAction="

    .line 34
    .line 35
    iget-boolean v5, p0, La/k3x;->c:Z

    .line 36
    .line 37
    invoke-static {v3, v1, v4, v0, v5}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", platformImeOptions=null, hintLocales="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/k3x;->f:La/rs00;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ")"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
