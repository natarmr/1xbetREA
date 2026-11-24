.class public final La/caa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/baa;


# instance fields
.field public final a:La/pzs0;

.field public b:La/zl50;


# direct methods
.method public constructor <init>(La/pzs0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/caa;->a:La/pzs0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/pzs0;->a()La/t3u0;

    .line 10
    .line 11
    .line 12
    sget-object p0, La/t3u0;->c:La/t3u0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Collection;
    .locals 3

    .line 1
    iget-object v0, p0, La/caa;->a:La/pzs0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/pzs0;->a()La/t3u0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, La/t3u0;->e:La/t3u0;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, La/pzs0;->b()La/wsy;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, La/caa;->c()La/ary;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, La/ary;->p()La/kzj0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final c()La/ary;
    .locals 0

    .line 1
    iget-object p0, p0, La/caa;->a:La/pzs0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pzs0;->b()La/wsy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, La/wsy;->S()La/iys0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, La/iys0;->c()La/ary;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final f()La/pzs0;
    .locals 0

    .line 1
    iget-object p0, p0, La/caa;->a:La/pzs0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/foc;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CapturedTypeConstructor("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/caa;->a:La/pzs0;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
