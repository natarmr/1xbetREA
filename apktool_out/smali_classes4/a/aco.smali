.class public final synthetic La/aco;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/qdz;

.field public final synthetic d:La/pz40;

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLa/pz40;La/qdz;La/pz40;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/aco;->a:Z

    iput-object p2, p0, La/aco;->b:La/pz40;

    iput-object p3, p0, La/aco;->c:La/qdz;

    iput-object p4, p0, La/aco;->d:La/pz40;

    iput-boolean p5, p0, La/aco;->e:Z

    iput-object p6, p0, La/aco;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/aco;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/hcz;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, La/aco;->a:Z

    .line 7
    .line 8
    iget-object v1, p0, La/aco;->b:La/pz40;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    move v6, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    move v6, v0

    .line 29
    :goto_0
    new-instance v7, La/cml;

    .line 30
    .line 31
    const/16 v0, 0x1a

    .line 32
    .line 33
    invoke-direct {v7, v1, v0}, La/cml;-><init>(La/pz40;B)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, La/aco;->d:La/pz40;

    .line 37
    .line 38
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v4, v0

    .line 43
    check-cast v4, La/a4x;

    .line 44
    .line 45
    new-instance v0, La/x6o;

    .line 46
    .line 47
    const/4 v1, 0x7

    .line 48
    invoke-direct {v0, v1}, La/x6o;-><init>(B)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    new-instance v11, La/ctl;

    .line 56
    .line 57
    const/16 v3, 0x1b

    .line 58
    .line 59
    invoke-direct {v11, v0, v4, v3}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    new-instance v0, La/ubn;

    .line 63
    .line 64
    invoke-direct {v0, v4, v2}, La/ubn;-><init>(La/a4x;B)V

    .line 65
    .line 66
    .line 67
    new-instance v3, La/cco;

    .line 68
    .line 69
    iget-boolean v5, p0, La/aco;->e:Z

    .line 70
    .line 71
    iget-object v8, p0, La/aco;->f:Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    iget-object v9, p0, La/aco;->c:La/qdz;

    .line 74
    .line 75
    iget-object v10, p0, La/aco;->g:Lkotlin/jvm/functions/Function1;

    .line 76
    .line 77
    invoke-direct/range {v3 .. v10}, La/cco;-><init>(La/a4x;ZZLa/cml;Lkotlin/jvm/functions/Function1;La/qdz;Lkotlin/jvm/functions/Function1;)V

    .line 78
    .line 79
    .line 80
    new-instance p0, La/ugd;

    .line 81
    .line 82
    const v4, 0x799532c4

    .line 83
    .line 84
    .line 85
    invoke-direct {p0, v4, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v1, v11, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0
.end method
