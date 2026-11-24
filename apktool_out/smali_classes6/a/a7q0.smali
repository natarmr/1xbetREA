.class public final La/a7q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:La/vne;

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/gy40;

.field public final synthetic d:La/pz40;


# direct methods
.method public constructor <init>(La/vne;La/pz40;La/gy40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a7q0;->a:La/vne;

    .line 5
    .line 6
    iput-object p2, p0, La/a7q0;->b:La/pz40;

    .line 7
    .line 8
    iput-object p3, p0, La/a7q0;->c:La/gy40;

    .line 9
    .line 10
    iput-object p4, p0, La/a7q0;->d:La/pz40;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v2, La/gxt;

    .line 2
    .line 3
    iget-object v0, p0, La/a7q0;->c:La/gy40;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v3, p0, La/a7q0;->a:La/vne;

    .line 7
    .line 8
    iget-object v4, p0, La/a7q0;->b:La/pz40;

    .line 9
    .line 10
    invoke-direct {v2, v3, v4, v0, v1}, La/gxt;-><init>(La/vne;La/pz40;La/gy40;La/yje;)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/dbo0;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    iget-object p0, p0, La/a7q0;->d:La/pz40;

    .line 17
    .line 18
    invoke-direct {v3, p0, v0}, La/dbo0;-><init>(La/pz40;B)V

    .line 19
    .line 20
    .line 21
    sget-object p0, La/tto0;->a:La/bk9;

    .line 22
    .line 23
    new-instance v4, La/hub0;

    .line 24
    .line 25
    invoke-direct {v4, p1}, La/hub0;-><init>(La/w6k;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, La/wn2;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/16 v6, 0x1d

    .line 32
    .line 33
    move-object v1, p1

    .line 34
    invoke-direct/range {v0 .. v6}, La/wn2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object p1, La/wne;->a:La/wne;

    .line 42
    .line 43
    if-ne p0, p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    :goto_0
    if-ne p0, p1, :cond_1

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0
.end method
