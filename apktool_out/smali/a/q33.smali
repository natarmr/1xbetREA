.class public final La/q33;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vhv0;


# instance fields
.field public final a:S

.field public final b:Ljava/lang/String;

.field public final c:La/pz40;

.field public final d:La/pz40;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, La/q33;->a:S

    .line 5
    .line 6
    iput-object p2, p0, La/q33;->b:Ljava/lang/String;

    .line 7
    .line 8
    sget-object p1, La/pfx;->e:La/pfx;

    .line 9
    .line 10
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/q33;->c:La/pz40;

    .line 15
    .line 16
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/q33;->d:La/pz40;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(La/w6k;La/k6z;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/q33;->e()La/pfx;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, La/pfx;->a:I

    .line 6
    .line 7
    return p0
.end method

.method public final b(La/w6k;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/q33;->e()La/pfx;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, La/pfx;->d:I

    .line 6
    .line 7
    return p0
.end method

.method public final c(La/w6k;La/k6z;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/q33;->e()La/pfx;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, La/pfx;->c:I

    .line 6
    .line 7
    return p0
.end method

.method public final d(La/w6k;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/q33;->e()La/pfx;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, La/pfx;->b:I

    .line 6
    .line 7
    return p0
.end method

.method public final e()La/pfx;
    .locals 0

    .line 1
    iget-object p0, p0, La/q33;->c:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pfx;

    .line 10
    .line 11
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/q33;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/q33;

    .line 10
    .line 11
    iget-short p1, p1, La/q33;->a:S

    .line 12
    .line 13
    iget-short p0, p0, La/q33;->a:S

    .line 14
    .line 15
    if-ne p0, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final f(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/q33;->d:La/pz40;

    .line 6
    .line 7
    check-cast p0, La/hgk0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final g(La/xiv0;I)V
    .locals 2

    .line 1
    iget-short v0, p0, La/q33;->a:S

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    and-int/2addr p2, v0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return-void

    .line 10
    :cond_1
    :goto_0
    iget-object p2, p1, La/xiv0;->a:La/uiv0;

    .line 11
    .line 12
    invoke-virtual {p2, v0}, La/uiv0;->i(I)La/pfx;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iget-object v1, p0, La/q33;->c:La/pz40;

    .line 17
    .line 18
    check-cast v1, La/hgk0;

    .line 19
    .line 20
    invoke-virtual {v1, p2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, La/xiv0;->a:La/uiv0;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, La/uiv0;->u(I)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1}, La/q33;->f(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-short p0, p0, La/q33;->a:S

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, La/q33;->e()La/pfx;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, La/pfx;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, La/q33;->e()La/pfx;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v1, v1, La/pfx;->b:I

    .line 12
    .line 13
    invoke-virtual {p0}, La/q33;->e()La/pfx;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget v2, v2, La/pfx;->c:I

    .line 18
    .line 19
    invoke-virtual {p0}, La/q33;->e()La/pfx;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget v3, v3, La/pfx;->d:I

    .line 24
    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    iget-object p0, p0, La/q33;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v4, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string p0, "("

    .line 33
    .line 34
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, ", "

    .line 41
    .line 42
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {v2, v3, p0, p0, v4}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 49
    .line 50
    .line 51
    const-string p0, ")"

    .line 52
    .line 53
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
