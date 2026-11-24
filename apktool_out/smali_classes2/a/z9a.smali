.class public final La/z9a;
.super La/kzj0;
.source "SourceFile"

# interfaces
.implements La/faa;


# instance fields
.field public final b:La/pzs0;

.field public final c:La/caa;

.field public final d:Z

.field public final e:La/ays0;


# direct methods
.method public constructor <init>(La/pzs0;La/caa;ZLa/ays0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/z9a;->b:La/pzs0;

    .line 11
    .line 12
    iput-object p2, p0, La/z9a;->c:La/caa;

    .line 13
    .line 14
    iput-boolean p3, p0, La/z9a;->d:Z

    .line 15
    .line 16
    iput-object p4, p0, La/z9a;->e:La/ays0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K()La/ays0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z9a;->e:La/ays0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final S()La/iys0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z9a;->c:La/caa;

    .line 2
    .line 3
    return-object p0
.end method

.method public final U()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/z9a;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final f0(La/cty;)La/wsy;
    .locals 3

    .line 1
    new-instance v0, La/z9a;

    .line 2
    .line 3
    iget-object v1, p0, La/z9a;->b:La/pzs0;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, La/pzs0;->d(La/cty;)La/pzs0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-boolean v1, p0, La/z9a;->d:Z

    .line 10
    .line 11
    iget-object v2, p0, La/z9a;->e:La/ays0;

    .line 12
    .line 13
    iget-object p0, p0, La/z9a;->c:La/caa;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0, v1, v2}, La/z9a;-><init>(La/pzs0;La/caa;ZLa/ays0;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final k0(Z)La/tft0;
    .locals 3

    .line 1
    iget-boolean v0, p0, La/z9a;->d:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, La/z9a;

    .line 7
    .line 8
    iget-object v1, p0, La/z9a;->c:La/caa;

    .line 9
    .line 10
    iget-object v2, p0, La/z9a;->e:La/ays0;

    .line 11
    .line 12
    iget-object p0, p0, La/z9a;->b:La/pzs0;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1, p1, v2}, La/z9a;-><init>(La/pzs0;La/caa;ZLa/ays0;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final l0(La/cty;)La/tft0;
    .locals 3

    .line 1
    new-instance v0, La/z9a;

    .line 2
    .line 3
    iget-object v1, p0, La/z9a;->b:La/pzs0;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, La/pzs0;->d(La/cty;)La/pzs0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-boolean v1, p0, La/z9a;->d:Z

    .line 10
    .line 11
    iget-object v2, p0, La/z9a;->e:La/ays0;

    .line 12
    .line 13
    iget-object p0, p0, La/z9a;->c:La/caa;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0, v1, v2}, La/z9a;-><init>(La/pzs0;La/caa;ZLa/ays0;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final bridge synthetic m0(La/ays0;)La/tft0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/z9a;->o0(La/ays0;)La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final n0(Z)La/kzj0;
    .locals 3

    .line 1
    iget-boolean v0, p0, La/z9a;->d:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, La/z9a;

    .line 7
    .line 8
    iget-object v1, p0, La/z9a;->c:La/caa;

    .line 9
    .line 10
    iget-object v2, p0, La/z9a;->e:La/ays0;

    .line 11
    .line 12
    iget-object p0, p0, La/z9a;->b:La/pzs0;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1, p1, v2}, La/z9a;-><init>(La/pzs0;La/caa;ZLa/ays0;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final o0(La/ays0;)La/kzj0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/z9a;

    .line 5
    .line 6
    iget-object v1, p0, La/z9a;->c:La/caa;

    .line 7
    .line 8
    iget-boolean v2, p0, La/z9a;->d:Z

    .line 9
    .line 10
    iget-object p0, p0, La/z9a;->b:La/pzs0;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1, v2, p1}, La/z9a;-><init>(La/pzs0;La/caa;ZLa/ays0;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Captured("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/z9a;->b:La/pzs0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean p0, p0, La/z9a;->d:Z

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const-string p0, "?"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, ""

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
