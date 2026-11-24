.class public final La/ywj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bch0;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:La/xwj;

.field public final c:La/g050;

.field public final d:La/pz40;

.field public final e:La/pz40;

.field public final f:La/pz40;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ywj;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    new-instance p1, La/xwj;

    .line 7
    .line 8
    invoke-direct {p1, p0}, La/xwj;-><init>(La/ywj;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/ywj;->b:La/xwj;

    .line 12
    .line 13
    new-instance p1, La/g050;

    .line 14
    .line 15
    invoke-direct {p1}, La/g050;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/ywj;->c:La/g050;

    .line 19
    .line 20
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/ywj;->d:La/pz40;

    .line 27
    .line 28
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, La/ywj;->e:La/pz40;

    .line 33
    .line 34
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/ywj;->f:La/pz40;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ywj;->d:La/pz40;

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
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, La/xsj;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x3

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, La/xsj;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/wdr;La/yje;B)V

    .line 9
    .line 10
    .line 11
    invoke-static {p3, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, La/wne;->a:La/wne;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, La/ywj;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method
