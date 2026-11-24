.class public final La/uls0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/l7m0;


# instance fields
.field public final a:La/cms0;

.field public b:Lkotlin/jvm/functions/Function1;

.field public c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/vls0;


# direct methods
.method public constructor <init>(La/vls0;La/cms0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uls0;->d:La/vls0;

    .line 5
    .line 6
    iput-object p2, p0, La/uls0;->a:La/cms0;

    .line 7
    .line 8
    iput-object p3, p0, La/uls0;->b:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iput-object p4, p0, La/uls0;->c:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(La/ams0;Ljava/lang/Object;La/t73;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/uls0;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-interface {p1}, La/ams0;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, La/uls0;->d:La/vls0;

    .line 12
    .line 13
    iget-object v1, v1, La/vls0;->c:La/oms0;

    .line 14
    .line 15
    invoke-virtual {v1}, La/oms0;->h()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, La/uls0;->a:La/cms0;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object p2, p0, La/uls0;->c:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    invoke-interface {p1}, La/ams0;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object p0, p0, La/uls0;->b:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/cfq;

    .line 40
    .line 41
    invoke-virtual {v2, p2, v0, p0}, La/cms0;->g(Ljava/lang/Object;Ljava/lang/Object;La/cfq;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object p0, p0, La/uls0;->b:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/cfq;

    .line 52
    .line 53
    invoke-virtual {v2, v0, p0, p2, p3}, La/cms0;->h(Ljava/lang/Object;La/cfq;Ljava/lang/Object;La/t73;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/uls0;->d:La/vls0;

    .line 2
    .line 3
    iget-object v0, v0, La/vls0;->c:La/oms0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/oms0;->f()La/ams0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v0, v1, v1}, La/uls0;->b(La/ams0;Ljava/lang/Object;La/t73;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/uls0;->a:La/cms0;

    .line 14
    .line 15
    iget-object p0, p0, La/cms0;->j:La/pz40;

    .line 16
    .line 17
    check-cast p0, La/hgk0;

    .line 18
    .line 19
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
