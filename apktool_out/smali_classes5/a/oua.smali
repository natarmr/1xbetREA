.class public final synthetic La/oua;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/l7m0;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:Z

.field public final synthetic d:La/nek;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:La/xak;

.field public final synthetic g:Lkotlin/jvm/functions/Function2;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function2;ZLa/nek;Lkotlin/jvm/functions/Function1;La/xak;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/oua;->a:La/l7m0;

    iput-object p2, p0, La/oua;->b:Lkotlin/jvm/functions/Function2;

    iput-boolean p3, p0, La/oua;->c:Z

    iput-object p4, p0, La/oua;->d:La/nek;

    iput-object p5, p0, La/oua;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La/oua;->f:La/xak;

    iput-object p7, p0, La/oua;->g:Lkotlin/jvm/functions/Function2;

    iput-object p8, p0, La/oua;->h:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, La/oua;->i:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, La/oua;->j:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, La/hcz;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/oua;->a:La/l7m0;

    .line 7
    .line 8
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/unr;

    .line 13
    .line 14
    iget-object v2, v0, La/unr;->e:La/a4x;

    .line 15
    .line 16
    new-instance v0, La/pua;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1}, La/pua;-><init>(B)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v12

    .line 26
    new-instance v13, La/at7;

    .line 27
    .line 28
    const/16 v1, 0xd

    .line 29
    .line 30
    invoke-direct {v13, v0, v2, v1}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    new-instance v0, La/wl0;

    .line 34
    .line 35
    const/16 v1, 0xc

    .line 36
    .line 37
    invoke-direct {v0, v2, v1}, La/wl0;-><init>(La/a4x;B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/sua;

    .line 41
    .line 42
    iget-object v3, p0, La/oua;->b:Lkotlin/jvm/functions/Function2;

    .line 43
    .line 44
    iget-boolean v4, p0, La/oua;->c:Z

    .line 45
    .line 46
    iget-object v5, p0, La/oua;->d:La/nek;

    .line 47
    .line 48
    iget-object v6, p0, La/oua;->e:Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    iget-object v7, p0, La/oua;->f:La/xak;

    .line 51
    .line 52
    iget-object v8, p0, La/oua;->g:Lkotlin/jvm/functions/Function2;

    .line 53
    .line 54
    iget-object v9, p0, La/oua;->h:Lkotlin/jvm/functions/Function1;

    .line 55
    .line 56
    iget-object v10, p0, La/oua;->i:Lkotlin/jvm/functions/Function1;

    .line 57
    .line 58
    iget-object v11, p0, La/oua;->j:Lkotlin/jvm/functions/Function1;

    .line 59
    .line 60
    invoke-direct/range {v1 .. v11}, La/sua;-><init>(La/a4x;Lkotlin/jvm/functions/Function2;ZLa/nek;Lkotlin/jvm/functions/Function1;La/xak;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    new-instance p0, La/ugd;

    .line 64
    .line 65
    const v2, 0x799532c4

    .line 66
    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v12, v13, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0
.end method
