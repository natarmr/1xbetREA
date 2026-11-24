.class public final La/y2l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/g3l0;


# instance fields
.field public final a:La/kpe;

.field public final b:La/spe;

.field public final c:La/zb;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(La/kpe;La/spe;La/zb;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y2l0;->a:La/kpe;

    .line 5
    .line 6
    iput-object p2, p0, La/y2l0;->b:La/spe;

    .line 7
    .line 8
    iput-object p3, p0, La/y2l0;->c:La/zb;

    .line 9
    .line 10
    iput-boolean p4, p0, La/y2l0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/y2l0;->e:Z

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
    instance-of v1, p1, La/y2l0;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/y2l0;

    .line 11
    .line 12
    iget-object v1, p0, La/y2l0;->a:La/kpe;

    .line 13
    .line 14
    iget-object v2, p1, La/y2l0;->a:La/kpe;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, La/kpe;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v1, p0, La/y2l0;->b:La/spe;

    .line 24
    .line 25
    iget-object v2, p1, La/y2l0;->b:La/spe;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, La/spe;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    sget-object v1, La/tc00;->a:La/tc00;

    .line 35
    .line 36
    invoke-virtual {v1, v1}, La/tc00;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-object v1, p0, La/y2l0;->c:La/zb;

    .line 44
    .line 45
    iget-object v2, p1, La/y2l0;->c:La/zb;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, La/zb;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-boolean v1, p0, La/y2l0;->d:Z

    .line 55
    .line 56
    iget-boolean v2, p1, La/y2l0;->d:Z

    .line 57
    .line 58
    if-eq v1, v2, :cond_6

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_6
    iget-boolean p0, p0, La/y2l0;->e:Z

    .line 62
    .line 63
    iget-boolean p1, p1, La/y2l0;->e:Z

    .line 64
    .line 65
    if-eq p0, p1, :cond_7

    .line 66
    .line 67
    :goto_0
    const/4 p0, 0x0

    .line 68
    return p0

    .line 69
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/y2l0;->a:La/kpe;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kpe;->hashCode()I

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
    iget-object v2, p0, La/y2l0;->b:La/spe;

    .line 11
    .line 12
    invoke-virtual {v2}, La/spe;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const v0, 0xc7798f7

    .line 19
    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    mul-int/2addr v2, v1

    .line 23
    iget-object v0, p0, La/y2l0;->c:La/zb;

    .line 24
    .line 25
    invoke-virtual {v0}, La/zb;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/2addr v0, v2

    .line 30
    mul-int/2addr v0, v1

    .line 31
    iget-boolean v2, p0, La/y2l0;->d:Z

    .line 32
    .line 33
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-boolean p0, p0, La/y2l0;->e:Z

    .line 38
    .line 39
    invoke-static {v0, v1, p0}, La/brm0;->e(IIZ)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, p0

    .line 49
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CounterWithAccordionWithListCheckbox(counterStyle="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/y2l0;->a:La/kpe;

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
    iget-object v1, p0, La/y2l0;->b:La/spe;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", listCheckboxStyle="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    sget-object v1, La/tc00;->a:La/tc00;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", accordionStyle="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/y2l0;->c:La/zb;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", expanded="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", active="

    .line 49
    .line 50
    const-string v2, ", enabled=true)"

    .line 51
    .line 52
    iget-boolean v3, p0, La/y2l0;->d:Z

    .line 53
    .line 54
    iget-boolean p0, p0, La/y2l0;->e:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
