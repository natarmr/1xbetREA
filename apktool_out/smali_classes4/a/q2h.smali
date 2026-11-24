.class public final La/q2h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public synthetic j:Ljava/util/List;

.field public synthetic k:La/wcb;

.field public synthetic l:Ljava/lang/String;

.field public synthetic m:Ljava/util/Map;


# direct methods
.method public constructor <init>(La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v1, p0, La/q2h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v2, p0, La/q2h;->j:Ljava/util/List;

    .line 4
    .line 5
    iget-object v3, p0, La/q2h;->k:La/wcb;

    .line 6
    .line 7
    iget-object v4, p0, La/q2h;->l:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, La/q2h;->m:Ljava/util/Map;

    .line 10
    .line 11
    move-object v5, p0

    .line 12
    check-cast v5, Ljava/util/Map;

    .line 13
    .line 14
    sget-object p0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, La/mig;

    .line 20
    .line 21
    invoke-direct/range {v0 .. v5}, La/mig;-><init>(Ljava/lang/Object;Ljava/util/List;La/wcb;Ljava/lang/String;Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/j0g0;

    .line 2
    .line 3
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Ljava/util/List;

    .line 6
    .line 7
    check-cast p3, La/wcb;

    .line 8
    .line 9
    check-cast p4, Ljava/lang/String;

    .line 10
    .line 11
    check-cast p5, Ljava/util/Map;

    .line 12
    .line 13
    check-cast p6, La/yje;

    .line 14
    .line 15
    new-instance p1, La/q2h;

    .line 16
    .line 17
    invoke-direct {p1, p6}, La/q2h;-><init>(La/yje;)V

    .line 18
    .line 19
    .line 20
    iput-object p0, p1, La/q2h;->i:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p2, p1, La/q2h;->j:Ljava/util/List;

    .line 23
    .line 24
    iput-object p3, p1, La/q2h;->k:La/wcb;

    .line 25
    .line 26
    iput-object p4, p1, La/q2h;->l:Ljava/lang/String;

    .line 27
    .line 28
    check-cast p5, Ljava/util/Map;

    .line 29
    .line 30
    iput-object p5, p1, La/q2h;->m:Ljava/util/Map;

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, La/q2h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
