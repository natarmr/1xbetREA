.class public final La/lzj0;
.super La/kzj0;
.source "SourceFile"


# instance fields
.field public final b:La/iys0;

.field public final c:Ljava/util/List;

.field public final d:Z

.field public final e:La/cr30;

.field public final f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/iys0;Ljava/util/List;ZLa/cr30;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/lzj0;->b:La/iys0;

    .line 14
    .line 15
    iput-object p2, p0, La/lzj0;->c:Ljava/util/List;

    .line 16
    .line 17
    iput-boolean p3, p0, La/lzj0;->d:Z

    .line 18
    .line 19
    iput-object p4, p0, La/lzj0;->e:La/cr30;

    .line 20
    .line 21
    iput-object p5, p0, La/lzj0;->f:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    instance-of p0, p4, La/t1o;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    instance-of p0, p4, La/gdq0;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    new-instance p2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string p3, "SimpleTypeImpl should not be created for error type: "

    .line 37
    .line 38
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 p3, 0xa

    .line 45
    .line 46
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_1
    return-void
.end method


# virtual methods
.method public final J()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/lzj0;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final K()La/ays0;
    .locals 0

    .line 1
    sget-object p0, La/ays0;->b:La/fck0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/ays0;->c:La/ays0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final S()La/iys0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lzj0;->b:La/iys0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final U()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/lzj0;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final f0(La/cty;)La/wsy;
    .locals 1

    .line 1
    iget-object v0, p0, La/lzj0;->f:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, La/kzj0;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    return-object p1
.end method

.method public final bridge synthetic k0(Z)La/tft0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/lzj0;->n0(Z)La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final l0(La/cty;)La/tft0;
    .locals 1

    .line 1
    iget-object v0, p0, La/lzj0;->f:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, La/kzj0;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    return-object p1
.end method

.method public final bridge synthetic m0(La/ays0;)La/tft0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/lzj0;->o0(La/ays0;)La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final n0(Z)La/kzj0;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/lzj0;->d:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    new-instance p1, La/s660;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, v0}, La/s660;-><init>(La/kzj0;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    new-instance p1, La/s660;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, v0}, La/s660;-><init>(La/kzj0;B)V

    .line 19
    .line 20
    .line 21
    return-object p1
.end method

.method public final o0(La/ays0;)La/kzj0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, La/ays0;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, La/nzj0;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, La/nzj0;-><init>(La/kzj0;La/ays0;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final y()La/cr30;
    .locals 0

    .line 1
    iget-object p0, p0, La/lzj0;->e:La/cr30;

    .line 2
    .line 3
    return-object p0
.end method
