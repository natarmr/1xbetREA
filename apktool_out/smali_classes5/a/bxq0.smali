.class public final La/bxq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g050;

.field public final b:La/uz40;

.field public c:La/n5a;


# direct methods
.method public constructor <init>(La/g050;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bxq0;->a:La/g050;

    .line 5
    .line 6
    new-instance p1, La/uz40;

    .line 7
    .line 8
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-direct {p1, v0}, La/uz40;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/bxq0;->b:La/uz40;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object p0, p0, La/bxq0;->b:La/uz40;

    .line 2
    .line 3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, La/uz40;->o1(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/bxq0;->b:La/uz40;

    .line 2
    .line 3
    iget-object v0, p0, La/uz40;->c:La/pz40;

    .line 4
    .line 5
    check-cast v0, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, La/uz40;->d:La/pz40;

    .line 20
    .line 21
    check-cast p0, La/hgk0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0
.end method

.method public final c(La/c050;La/bnn0;)Ljava/lang/Object;
    .locals 9

    .line 1
    new-instance v2, La/hhb0;

    .line 2
    .line 3
    const/16 v0, 0x19

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    invoke-direct {v2, p0, v4, v0}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 7
    .line 8
    .line 9
    new-instance v0, La/em4;

    .line 10
    .line 11
    const/4 v5, 0x4

    .line 12
    move-object v1, p0

    .line 13
    move-object v3, p1

    .line 14
    invoke-direct/range {v0 .. v5}, La/em4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    iget-object v5, v1, La/bxq0;->a:La/g050;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-object v7, v4

    .line 23
    move-object v4, v3

    .line 24
    new-instance v3, La/lpp;

    .line 25
    .line 26
    const/4 v8, 0x4

    .line 27
    move-object v6, v0

    .line 28
    invoke-direct/range {v3 .. v8}, La/lpp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2, v3}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, La/wne;->a:La/wne;

    .line 36
    .line 37
    if-ne p0, p1, :cond_0

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
