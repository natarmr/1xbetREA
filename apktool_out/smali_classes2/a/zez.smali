.class public final La/zez;
.super La/wsy;
.source "SourceFile"


# instance fields
.field public final b:La/eu00;

.field public final c:Lkotlin/jvm/functions/Function0;

.field public final d:La/cu00;


# direct methods
.method public constructor <init>(La/eu00;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/zez;->b:La/eu00;

    .line 8
    .line 9
    iput-object p2, p0, La/zez;->c:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    new-instance v0, La/cu00;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/zez;->d:La/cu00;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final J()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/zez;->k0()La/wsy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->J()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final K()La/ays0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/zez;->k0()La/wsy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->K()La/ays0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final S()La/iys0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/zez;->k0()La/wsy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->S()La/iys0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final U()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/zez;->k0()La/wsy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->U()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final f0(La/cty;)La/wsy;
    .locals 3

    .line 1
    new-instance v0, La/zez;

    .line 2
    .line 3
    new-instance v1, La/aaw;

    .line 4
    .line 5
    const/16 v2, 0x1b

    .line 6
    .line 7
    invoke-direct {v1, p1, p0, v2}, La/aaw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/zez;->b:La/eu00;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/zez;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final j0()La/tft0;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/zez;->k0()La/wsy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    instance-of v0, p0, La/zez;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, La/zez;

    .line 10
    .line 11
    invoke-virtual {p0}, La/zez;->k0()La/wsy;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast p0, La/tft0;

    .line 20
    .line 21
    return-object p0
.end method

.method public final k0()La/wsy;
    .locals 0

    .line 1
    iget-object p0, p0, La/zez;->d:La/cu00;

    .line 2
    .line 3
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wsy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, La/zez;->d:La/cu00;

    .line 2
    .line 3
    iget-object v1, v0, La/bu00;->c:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v2, La/du00;->a:La/du00;

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, La/bu00;->c:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v1, La/du00;->b:La/du00;

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/zez;->k0()La/wsy;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string p0, "<Not computed yet>"

    .line 25
    .line 26
    return-object p0
.end method

.method public final y()La/cr30;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/zez;->k0()La/wsy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->y()La/cr30;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
